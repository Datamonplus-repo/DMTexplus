package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantwwgetfilterdata extends GXProcedure
{
   public mantwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantwwgetfilterdata.class ), "" );
   }

   public mantwwgetfilterdata( int remoteHandle ,
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
      mantwwgetfilterdata.this.aP5 = new String[] {""};
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
      mantwwgetfilterdata.this.AV54DDOName = aP0;
      mantwwgetfilterdata.this.AV55SearchTxt = aP1;
      mantwwgetfilterdata.this.AV56SearchTxtTo = aP2;
      mantwwgetfilterdata.this.aP3 = aP3;
      mantwwgetfilterdata.this.aP4 = aP4;
      mantwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV44Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV47OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTEMPRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTEMPRCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTCLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTCLINOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTARTCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTARTDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTMAQCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTMAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTMAQDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTTIPMCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTTIPMCODOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV54DDOName), "DDO_MANTTIPMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMANTTIPMDSCOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV57OptionsJson = AV44Options.toJSonString(false) ;
      AV58OptionsDescJson = AV46OptionsDesc.toJSonString(false) ;
      AV59OptionIndexesJson = AV47OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("AnticipacionErrores.MAntWWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnticipacionErrores.MAntWWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("AnticipacionErrores.MAntWWGridState"), null, null);
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTID") == 0 )
         {
            AV10TFMAntId = GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFMAntId_To = GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD") == 0 )
         {
            AV12TFMAntEmprCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTEMPRCOD_SEL") == 0 )
         {
            AV13TFMAntEmprCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLICOD") == 0 )
         {
            AV14TFMAntCliCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMAntCliCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM") == 0 )
         {
            AV16TFMAntCliNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCLINOM_SEL") == 0 )
         {
            AV17TFMAntCliNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD") == 0 )
         {
            AV18TFMAntArtCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTCOD_SEL") == 0 )
         {
            AV19TFMAntArtCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC") == 0 )
         {
            AV20TFMAntArtDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTARTDSC_SEL") == 0 )
         {
            AV21TFMAntArtDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM") == 0 )
         {
            AV22TFMAntColNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNOM_SEL") == 0 )
         {
            AV23TFMAntColNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLNUM") == 0 )
         {
            AV24TFMAntColNum = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFMAntColNum_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTCOLCOD") == 0 )
         {
            AV26TFMAntColCod = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFMAntColCod_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD") == 0 )
         {
            AV28TFMAntMaqCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQCOD_SEL") == 0 )
         {
            AV29TFMAntMaqCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC") == 0 )
         {
            AV30TFMAntMaqDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTMAQDSC_SEL") == 0 )
         {
            AV31TFMAntMaqDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD") == 0 )
         {
            AV32TFMAntTipMCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMCOD_SEL") == 0 )
         {
            AV33TFMAntTipMCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC") == 0 )
         {
            AV34TFMAntTipMDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTTIPMDSC_SEL") == 0 )
         {
            AV35TFMAntTipMDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILPROD") == 0 )
         {
            AV36TFMAntKilProd = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFMAntKilProd_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTKILREO") == 0 )
         {
            AV38TFMAntKilReo = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFMAntKilReo_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANTPORC") == 0 )
         {
            AV40TFMAntPorc = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFMAntPorc_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMANTEMPRCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMAntEmprCod = AV55SearchTxt ;
      AV13TFMAntEmprCod_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD2 */
      pr_default.execute(0, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAUD2 = false ;
         A14566MAntEmprCo = P0AUD2_A14566MAntEmprCo[0] ;
         A14643MAntKilPro = P0AUD2_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD2_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUD2_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUD2_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUD2_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD2_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD2_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD2_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUD2_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUD2_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUD2_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD2_A14565MAntCliCod[0] ;
         A14562MAntId = P0AUD2_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD2_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD2_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AUD2_A14566MAntEmprCo[0], A14566MAntEmprCo) == 0 ) )
         {
            brkAUD2 = false ;
            A14562MAntId = P0AUD2_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14566MAntEmprCo)==0) )
         {
            AV43Option = A14566MAntEmprCo ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD2 )
         {
            brkAUD2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMANTCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMAntCliNom = AV55SearchTxt ;
      AV17TFMAntCliNom_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD3 */
      pr_default.execute(1, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAUD4 = false ;
         A14611MAntCliNom = P0AUD3_A14611MAntCliNom[0] ;
         A14643MAntKilPro = P0AUD3_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD3_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUD3_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUD3_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUD3_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD3_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD3_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD3_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUD3_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUD3_A14567MAntArtCod[0] ;
         A14565MAntCliCod = P0AUD3_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD3_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD3_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD3_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD3_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AUD3_A14611MAntCliNom[0], A14611MAntCliNom) == 0 ) )
         {
            brkAUD4 = false ;
            A14562MAntId = P0AUD3_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A14611MAntCliNom)==0) )
         {
            AV43Option = A14611MAntCliNom ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD4 )
         {
            brkAUD4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMANTARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV18TFMAntArtCod = AV55SearchTxt ;
      AV19TFMAntArtCod_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD4 */
      pr_default.execute(2, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAUD6 = false ;
         A14567MAntArtCod = P0AUD4_A14567MAntArtCod[0] ;
         A14643MAntKilPro = P0AUD4_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD4_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUD4_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUD4_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUD4_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD4_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD4_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD4_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUD4_A14613MAntArtDsc[0] ;
         A14611MAntCliNom = P0AUD4_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD4_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD4_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD4_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD4_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD4_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AUD4_A14567MAntArtCod[0], A14567MAntArtCod) == 0 ) )
         {
            brkAUD6 = false ;
            A14562MAntId = P0AUD4_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A14567MAntArtCod)==0) )
         {
            AV43Option = A14567MAntArtCod ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD6 )
         {
            brkAUD6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMANTARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMAntArtDsc = AV55SearchTxt ;
      AV21TFMAntArtDsc_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD5 */
      pr_default.execute(3, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAUD8 = false ;
         A14613MAntArtDsc = P0AUD5_A14613MAntArtDsc[0] ;
         A14643MAntKilPro = P0AUD5_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD5_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUD5_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUD5_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUD5_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD5_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD5_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD5_A14623MAntColNom[0] ;
         A14567MAntArtCod = P0AUD5_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUD5_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD5_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD5_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD5_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD5_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD5_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AUD5_A14613MAntArtDsc[0], A14613MAntArtDsc) == 0 ) )
         {
            brkAUD8 = false ;
            A14562MAntId = P0AUD5_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14613MAntArtDsc)==0) )
         {
            AV43Option = A14613MAntArtDsc ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD8 )
         {
            brkAUD8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMANTCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFMAntColNom = AV55SearchTxt ;
      AV23TFMAntColNom_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD6 */
      pr_default.execute(4, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAUD10 = false ;
         A14623MAntColNom = P0AUD6_A14623MAntColNom[0] ;
         A14643MAntKilPro = P0AUD6_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD6_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUD6_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUD6_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUD6_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD6_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD6_A14568MAntColNum[0] ;
         A14613MAntArtDsc = P0AUD6_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUD6_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUD6_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD6_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD6_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD6_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD6_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD6_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AUD6_A14623MAntColNom[0], A14623MAntColNom) == 0 ) )
         {
            brkAUD10 = false ;
            A14562MAntId = P0AUD6_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A14623MAntColNom)==0) )
         {
            AV43Option = A14623MAntColNom ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD10 )
         {
            brkAUD10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMANTMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV28TFMAntMaqCod = AV55SearchTxt ;
      AV29TFMAntMaqCod_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD7 */
      pr_default.execute(5, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAUD12 = false ;
         A14570MAntMaqCod = P0AUD7_A14570MAntMaqCod[0] ;
         A14643MAntKilPro = P0AUD7_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD7_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUD7_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUD7_A14610MAntMaqDsc[0] ;
         A14642MAntColCod = P0AUD7_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD7_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD7_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUD7_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUD7_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUD7_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD7_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD7_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD7_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD7_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD7_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AUD7_A14570MAntMaqCod[0], A14570MAntMaqCod) == 0 ) )
         {
            brkAUD12 = false ;
            A14562MAntId = P0AUD7_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A14570MAntMaqCod)==0) )
         {
            AV43Option = A14570MAntMaqCod ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD12 )
         {
            brkAUD12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADMANTMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV30TFMAntMaqDsc = AV55SearchTxt ;
      AV31TFMAntMaqDsc_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD8 */
      pr_default.execute(6, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkAUD14 = false ;
         A14610MAntMaqDsc = P0AUD8_A14610MAntMaqDsc[0] ;
         A14643MAntKilPro = P0AUD8_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD8_A14612MAntTipMDs[0] ;
         A14569MAntTipMCo = P0AUD8_A14569MAntTipMCo[0] ;
         A14570MAntMaqCod = P0AUD8_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD8_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD8_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD8_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUD8_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUD8_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUD8_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD8_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD8_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD8_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD8_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD8_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0AUD8_A14610MAntMaqDsc[0], A14610MAntMaqDsc) == 0 ) )
         {
            brkAUD14 = false ;
            A14562MAntId = P0AUD8_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A14610MAntMaqDsc)==0) )
         {
            AV43Option = A14610MAntMaqDsc ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD14 )
         {
            brkAUD14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADMANTTIPMCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFMAntTipMCod = AV55SearchTxt ;
      AV33TFMAntTipMCod_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD9 */
      pr_default.execute(7, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brkAUD16 = false ;
         A14569MAntTipMCo = P0AUD9_A14569MAntTipMCo[0] ;
         A14643MAntKilPro = P0AUD9_A14643MAntKilPro[0] ;
         A14612MAntTipMDs = P0AUD9_A14612MAntTipMDs[0] ;
         A14610MAntMaqDsc = P0AUD9_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUD9_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD9_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD9_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD9_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUD9_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUD9_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUD9_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD9_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD9_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD9_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD9_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD9_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P0AUD9_A14569MAntTipMCo[0], A14569MAntTipMCo) == 0 ) )
         {
            brkAUD16 = false ;
            A14562MAntId = P0AUD9_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A14569MAntTipMCo)==0) )
         {
            AV43Option = A14569MAntTipMCo ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD16 )
         {
            brkAUD16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADMANTTIPMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFMAntTipMDsc = AV55SearchTxt ;
      AV35TFMAntTipMDsc_Sel = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = AV60FilterFullText ;
      AV66Anticipacionerrores_mantwwds_2_tfmantid = AV10TFMAntId ;
      AV67Anticipacionerrores_mantwwds_3_tfmantid_to = AV11TFMAntId_To ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = AV12TFMAntEmprCod ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = AV13TFMAntEmprCod_Sel ;
      AV70Anticipacionerrores_mantwwds_6_tfmantclicod = AV14TFMAntCliCod ;
      AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to = AV15TFMAntCliCod_To ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = AV16TFMAntCliNom ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = AV17TFMAntCliNom_Sel ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = AV18TFMAntArtCod ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = AV19TFMAntArtCod_Sel ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = AV20TFMAntArtDsc ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = AV21TFMAntArtDsc_Sel ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = AV22TFMAntColNom ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = AV23TFMAntColNom_Sel ;
      AV80Anticipacionerrores_mantwwds_16_tfmantcolnum = AV24TFMAntColNum ;
      AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to = AV25TFMAntColNum_To ;
      AV82Anticipacionerrores_mantwwds_18_tfmantcolcod = AV26TFMAntColCod ;
      AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to = AV27TFMAntColCod_To ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = AV28TFMAntMaqCod ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = AV29TFMAntMaqCod_Sel ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = AV30TFMAntMaqDsc ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = AV31TFMAntMaqDsc_Sel ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = AV32TFMAntTipMCod ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = AV33TFMAntTipMCod_Sel ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = AV34TFMAntTipMDsc ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = AV35TFMAntTipMDsc_Sel ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = AV36TFMAntKilProd ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = AV37TFMAntKilProd_To ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = AV38TFMAntKilReo ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = AV39TFMAntKilReo_To ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = AV40TFMAntPorc ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = AV41TFMAntPorc_To ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid) ,
                                           Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to) ,
                                           AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod) ,
                                           Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) ,
                                           AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) ,
                                           Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) ,
                                           Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) ,
                                           Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) ,
                                           AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           Long.valueOf(A14562MAntId) ,
                                           A14566MAntEmprCo ,
                                           Integer.valueOf(A14565MAntCliCod) ,
                                           A14611MAntCliNom ,
                                           A14567MAntArtCod ,
                                           A14613MAntArtDsc ,
                                           A14623MAntColNom ,
                                           Integer.valueOf(A14568MAntColNum) ,
                                           Byte.valueOf(A14642MAntColCod) ,
                                           A14570MAntMaqCod ,
                                           A14610MAntMaqDsc ,
                                           A14569MAntTipMCo ,
                                           A14612MAntTipMDs ,
                                           A14643MAntKilPro ,
                                           A14644MAntKilReo ,
                                           A14646MAntKilTot } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Anticipacionerrores_mantwwds_1_filterfulltext), "%", "") ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = GXutil.padr( GXutil.rtrim( AV68Anticipacionerrores_mantwwds_4_tfmantemprcod), 3, "%") ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = GXutil.concat( GXutil.rtrim( AV72Anticipacionerrores_mantwwds_8_tfmantclinom), "%", "") ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = GXutil.padr( GXutil.rtrim( AV74Anticipacionerrores_mantwwds_10_tfmantartcod), 16, "%") ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = GXutil.concat( GXutil.rtrim( AV76Anticipacionerrores_mantwwds_12_tfmantartdsc), "%", "") ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = GXutil.padr( GXutil.rtrim( AV78Anticipacionerrores_mantwwds_14_tfmantcolnom), 13, "%") ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = GXutil.padr( GXutil.rtrim( AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod), 6, "%") ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = GXutil.concat( GXutil.rtrim( AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc), "%", "") ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = GXutil.padr( GXutil.rtrim( AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod), 4, "%") ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = GXutil.concat( GXutil.rtrim( AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc), "%", "") ;
      /* Using cursor P0AUD10 */
      pr_default.execute(8, new Object[] {lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, lV65Anticipacionerrores_mantwwds_1_filterfulltext, Long.valueOf(AV66Anticipacionerrores_mantwwds_2_tfmantid), Long.valueOf(AV67Anticipacionerrores_mantwwds_3_tfmantid_to), lV68Anticipacionerrores_mantwwds_4_tfmantemprcod, AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel, Integer.valueOf(AV70Anticipacionerrores_mantwwds_6_tfmantclicod), Integer.valueOf(AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to), lV72Anticipacionerrores_mantwwds_8_tfmantclinom, AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel, lV74Anticipacionerrores_mantwwds_10_tfmantartcod, AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel, lV76Anticipacionerrores_mantwwds_12_tfmantartdsc, AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel, lV78Anticipacionerrores_mantwwds_14_tfmantcolnom, AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel, Integer.valueOf(AV80Anticipacionerrores_mantwwds_16_tfmantcolnum), Integer.valueOf(AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to), Byte.valueOf(AV82Anticipacionerrores_mantwwds_18_tfmantcolcod), Byte.valueOf(AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to), lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod, AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel, lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc, AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel, lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod, AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel, lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc, AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to, AV96Anticipacionerrores_mantwwds_32_tfmantporc, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brkAUD18 = false ;
         A14612MAntTipMDs = P0AUD10_A14612MAntTipMDs[0] ;
         A14643MAntKilPro = P0AUD10_A14643MAntKilPro[0] ;
         A14569MAntTipMCo = P0AUD10_A14569MAntTipMCo[0] ;
         A14610MAntMaqDsc = P0AUD10_A14610MAntMaqDsc[0] ;
         A14570MAntMaqCod = P0AUD10_A14570MAntMaqCod[0] ;
         A14642MAntColCod = P0AUD10_A14642MAntColCod[0] ;
         A14568MAntColNum = P0AUD10_A14568MAntColNum[0] ;
         A14623MAntColNom = P0AUD10_A14623MAntColNom[0] ;
         A14613MAntArtDsc = P0AUD10_A14613MAntArtDsc[0] ;
         A14567MAntArtCod = P0AUD10_A14567MAntArtCod[0] ;
         A14611MAntCliNom = P0AUD10_A14611MAntCliNom[0] ;
         A14565MAntCliCod = P0AUD10_A14565MAntCliCod[0] ;
         A14566MAntEmprCo = P0AUD10_A14566MAntEmprCo[0] ;
         A14562MAntId = P0AUD10_A14562MAntId[0] ;
         A14644MAntKilReo = P0AUD10_A14644MAntKilReo[0] ;
         A14646MAntKilTot = P0AUD10_A14646MAntKilTot[0] ;
         A14645MAntPorc = ((A14646MAntKilTot.doubleValue()>0) ? (A14644MAntKilReo.divide(A14646MAntKilTot, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P0AUD10_A14612MAntTipMDs[0], A14612MAntTipMDs) == 0 ) )
         {
            brkAUD18 = false ;
            A14562MAntId = P0AUD10_A14562MAntId[0] ;
            AV48count = (long)(AV48count+1) ;
            brkAUD18 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A14612MAntTipMDs)==0) )
         {
            AV43Option = A14612MAntTipMDs ;
            AV44Options.add(AV43Option, 0);
            AV47OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV44Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAUD18 )
         {
            brkAUD18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantwwgetfilterdata.this.AV57OptionsJson;
      this.aP4[0] = mantwwgetfilterdata.this.AV58OptionsDescJson;
      this.aP5[0] = mantwwgetfilterdata.this.AV59OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV57OptionsJson = "" ;
      AV58OptionsDescJson = "" ;
      AV59OptionIndexesJson = "" ;
      AV44Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV47OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV60FilterFullText = "" ;
      AV12TFMAntEmprCod = "" ;
      AV13TFMAntEmprCod_Sel = "" ;
      AV16TFMAntCliNom = "" ;
      AV17TFMAntCliNom_Sel = "" ;
      AV18TFMAntArtCod = "" ;
      AV19TFMAntArtCod_Sel = "" ;
      AV20TFMAntArtDsc = "" ;
      AV21TFMAntArtDsc_Sel = "" ;
      AV22TFMAntColNom = "" ;
      AV23TFMAntColNom_Sel = "" ;
      AV28TFMAntMaqCod = "" ;
      AV29TFMAntMaqCod_Sel = "" ;
      AV30TFMAntMaqDsc = "" ;
      AV31TFMAntMaqDsc_Sel = "" ;
      AV32TFMAntTipMCod = "" ;
      AV33TFMAntTipMCod_Sel = "" ;
      AV34TFMAntTipMDsc = "" ;
      AV35TFMAntTipMDsc_Sel = "" ;
      AV36TFMAntKilProd = DecimalUtil.ZERO ;
      AV37TFMAntKilProd_To = DecimalUtil.ZERO ;
      AV38TFMAntKilReo = DecimalUtil.ZERO ;
      AV39TFMAntKilReo_To = DecimalUtil.ZERO ;
      AV40TFMAntPorc = DecimalUtil.ZERO ;
      AV41TFMAntPorc_To = DecimalUtil.ZERO ;
      A14566MAntEmprCo = "" ;
      AV65Anticipacionerrores_mantwwds_1_filterfulltext = "" ;
      AV68Anticipacionerrores_mantwwds_4_tfmantemprcod = "" ;
      AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel = "" ;
      AV72Anticipacionerrores_mantwwds_8_tfmantclinom = "" ;
      AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel = "" ;
      AV74Anticipacionerrores_mantwwds_10_tfmantartcod = "" ;
      AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel = "" ;
      AV76Anticipacionerrores_mantwwds_12_tfmantartdsc = "" ;
      AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel = "" ;
      AV78Anticipacionerrores_mantwwds_14_tfmantcolnom = "" ;
      AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel = "" ;
      AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = "" ;
      AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel = "" ;
      AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = "" ;
      AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel = "" ;
      AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = "" ;
      AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel = "" ;
      AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = "" ;
      AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel = "" ;
      AV92Anticipacionerrores_mantwwds_28_tfmantkilprod = DecimalUtil.ZERO ;
      AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to = DecimalUtil.ZERO ;
      AV94Anticipacionerrores_mantwwds_30_tfmantkilreo = DecimalUtil.ZERO ;
      AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to = DecimalUtil.ZERO ;
      AV96Anticipacionerrores_mantwwds_32_tfmantporc = DecimalUtil.ZERO ;
      AV97Anticipacionerrores_mantwwds_33_tfmantporc_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV65Anticipacionerrores_mantwwds_1_filterfulltext = "" ;
      lV68Anticipacionerrores_mantwwds_4_tfmantemprcod = "" ;
      lV72Anticipacionerrores_mantwwds_8_tfmantclinom = "" ;
      lV74Anticipacionerrores_mantwwds_10_tfmantartcod = "" ;
      lV76Anticipacionerrores_mantwwds_12_tfmantartdsc = "" ;
      lV78Anticipacionerrores_mantwwds_14_tfmantcolnom = "" ;
      lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod = "" ;
      lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc = "" ;
      lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod = "" ;
      lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc = "" ;
      A14611MAntCliNom = "" ;
      A14567MAntArtCod = "" ;
      A14613MAntArtDsc = "" ;
      A14623MAntColNom = "" ;
      A14570MAntMaqCod = "" ;
      A14610MAntMaqDsc = "" ;
      A14569MAntTipMCo = "" ;
      A14612MAntTipMDs = "" ;
      A14643MAntKilPro = DecimalUtil.ZERO ;
      A14644MAntKilReo = DecimalUtil.ZERO ;
      A14646MAntKilTot = DecimalUtil.ZERO ;
      P0AUD2_A14566MAntEmprCo = new String[] {""} ;
      P0AUD2_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD2_A14612MAntTipMDs = new String[] {""} ;
      P0AUD2_A14569MAntTipMCo = new String[] {""} ;
      P0AUD2_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD2_A14570MAntMaqCod = new String[] {""} ;
      P0AUD2_A14642MAntColCod = new byte[1] ;
      P0AUD2_A14568MAntColNum = new int[1] ;
      P0AUD2_A14623MAntColNom = new String[] {""} ;
      P0AUD2_A14613MAntArtDsc = new String[] {""} ;
      P0AUD2_A14567MAntArtCod = new String[] {""} ;
      P0AUD2_A14611MAntCliNom = new String[] {""} ;
      P0AUD2_A14565MAntCliCod = new int[1] ;
      P0AUD2_A14562MAntId = new long[1] ;
      P0AUD2_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD2_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A14645MAntPorc = DecimalUtil.ZERO ;
      AV43Option = "" ;
      P0AUD3_A14611MAntCliNom = new String[] {""} ;
      P0AUD3_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD3_A14612MAntTipMDs = new String[] {""} ;
      P0AUD3_A14569MAntTipMCo = new String[] {""} ;
      P0AUD3_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD3_A14570MAntMaqCod = new String[] {""} ;
      P0AUD3_A14642MAntColCod = new byte[1] ;
      P0AUD3_A14568MAntColNum = new int[1] ;
      P0AUD3_A14623MAntColNom = new String[] {""} ;
      P0AUD3_A14613MAntArtDsc = new String[] {""} ;
      P0AUD3_A14567MAntArtCod = new String[] {""} ;
      P0AUD3_A14565MAntCliCod = new int[1] ;
      P0AUD3_A14566MAntEmprCo = new String[] {""} ;
      P0AUD3_A14562MAntId = new long[1] ;
      P0AUD3_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD3_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD4_A14567MAntArtCod = new String[] {""} ;
      P0AUD4_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD4_A14612MAntTipMDs = new String[] {""} ;
      P0AUD4_A14569MAntTipMCo = new String[] {""} ;
      P0AUD4_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD4_A14570MAntMaqCod = new String[] {""} ;
      P0AUD4_A14642MAntColCod = new byte[1] ;
      P0AUD4_A14568MAntColNum = new int[1] ;
      P0AUD4_A14623MAntColNom = new String[] {""} ;
      P0AUD4_A14613MAntArtDsc = new String[] {""} ;
      P0AUD4_A14611MAntCliNom = new String[] {""} ;
      P0AUD4_A14565MAntCliCod = new int[1] ;
      P0AUD4_A14566MAntEmprCo = new String[] {""} ;
      P0AUD4_A14562MAntId = new long[1] ;
      P0AUD4_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD4_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD5_A14613MAntArtDsc = new String[] {""} ;
      P0AUD5_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD5_A14612MAntTipMDs = new String[] {""} ;
      P0AUD5_A14569MAntTipMCo = new String[] {""} ;
      P0AUD5_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD5_A14570MAntMaqCod = new String[] {""} ;
      P0AUD5_A14642MAntColCod = new byte[1] ;
      P0AUD5_A14568MAntColNum = new int[1] ;
      P0AUD5_A14623MAntColNom = new String[] {""} ;
      P0AUD5_A14567MAntArtCod = new String[] {""} ;
      P0AUD5_A14611MAntCliNom = new String[] {""} ;
      P0AUD5_A14565MAntCliCod = new int[1] ;
      P0AUD5_A14566MAntEmprCo = new String[] {""} ;
      P0AUD5_A14562MAntId = new long[1] ;
      P0AUD5_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD5_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD6_A14623MAntColNom = new String[] {""} ;
      P0AUD6_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD6_A14612MAntTipMDs = new String[] {""} ;
      P0AUD6_A14569MAntTipMCo = new String[] {""} ;
      P0AUD6_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD6_A14570MAntMaqCod = new String[] {""} ;
      P0AUD6_A14642MAntColCod = new byte[1] ;
      P0AUD6_A14568MAntColNum = new int[1] ;
      P0AUD6_A14613MAntArtDsc = new String[] {""} ;
      P0AUD6_A14567MAntArtCod = new String[] {""} ;
      P0AUD6_A14611MAntCliNom = new String[] {""} ;
      P0AUD6_A14565MAntCliCod = new int[1] ;
      P0AUD6_A14566MAntEmprCo = new String[] {""} ;
      P0AUD6_A14562MAntId = new long[1] ;
      P0AUD6_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD6_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD7_A14570MAntMaqCod = new String[] {""} ;
      P0AUD7_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD7_A14612MAntTipMDs = new String[] {""} ;
      P0AUD7_A14569MAntTipMCo = new String[] {""} ;
      P0AUD7_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD7_A14642MAntColCod = new byte[1] ;
      P0AUD7_A14568MAntColNum = new int[1] ;
      P0AUD7_A14623MAntColNom = new String[] {""} ;
      P0AUD7_A14613MAntArtDsc = new String[] {""} ;
      P0AUD7_A14567MAntArtCod = new String[] {""} ;
      P0AUD7_A14611MAntCliNom = new String[] {""} ;
      P0AUD7_A14565MAntCliCod = new int[1] ;
      P0AUD7_A14566MAntEmprCo = new String[] {""} ;
      P0AUD7_A14562MAntId = new long[1] ;
      P0AUD7_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD7_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD8_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD8_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD8_A14612MAntTipMDs = new String[] {""} ;
      P0AUD8_A14569MAntTipMCo = new String[] {""} ;
      P0AUD8_A14570MAntMaqCod = new String[] {""} ;
      P0AUD8_A14642MAntColCod = new byte[1] ;
      P0AUD8_A14568MAntColNum = new int[1] ;
      P0AUD8_A14623MAntColNom = new String[] {""} ;
      P0AUD8_A14613MAntArtDsc = new String[] {""} ;
      P0AUD8_A14567MAntArtCod = new String[] {""} ;
      P0AUD8_A14611MAntCliNom = new String[] {""} ;
      P0AUD8_A14565MAntCliCod = new int[1] ;
      P0AUD8_A14566MAntEmprCo = new String[] {""} ;
      P0AUD8_A14562MAntId = new long[1] ;
      P0AUD8_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD8_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD9_A14569MAntTipMCo = new String[] {""} ;
      P0AUD9_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD9_A14612MAntTipMDs = new String[] {""} ;
      P0AUD9_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD9_A14570MAntMaqCod = new String[] {""} ;
      P0AUD9_A14642MAntColCod = new byte[1] ;
      P0AUD9_A14568MAntColNum = new int[1] ;
      P0AUD9_A14623MAntColNom = new String[] {""} ;
      P0AUD9_A14613MAntArtDsc = new String[] {""} ;
      P0AUD9_A14567MAntArtCod = new String[] {""} ;
      P0AUD9_A14611MAntCliNom = new String[] {""} ;
      P0AUD9_A14565MAntCliCod = new int[1] ;
      P0AUD9_A14566MAntEmprCo = new String[] {""} ;
      P0AUD9_A14562MAntId = new long[1] ;
      P0AUD9_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD9_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD10_A14612MAntTipMDs = new String[] {""} ;
      P0AUD10_A14643MAntKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD10_A14569MAntTipMCo = new String[] {""} ;
      P0AUD10_A14610MAntMaqDsc = new String[] {""} ;
      P0AUD10_A14570MAntMaqCod = new String[] {""} ;
      P0AUD10_A14642MAntColCod = new byte[1] ;
      P0AUD10_A14568MAntColNum = new int[1] ;
      P0AUD10_A14623MAntColNom = new String[] {""} ;
      P0AUD10_A14613MAntArtDsc = new String[] {""} ;
      P0AUD10_A14567MAntArtCod = new String[] {""} ;
      P0AUD10_A14611MAntCliNom = new String[] {""} ;
      P0AUD10_A14565MAntCliCod = new int[1] ;
      P0AUD10_A14566MAntEmprCo = new String[] {""} ;
      P0AUD10_A14562MAntId = new long[1] ;
      P0AUD10_A14644MAntKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AUD10_A14646MAntKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mantwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AUD2_A14566MAntEmprCo, P0AUD2_A14643MAntKilPro, P0AUD2_A14612MAntTipMDs, P0AUD2_A14569MAntTipMCo, P0AUD2_A14610MAntMaqDsc, P0AUD2_A14570MAntMaqCod, P0AUD2_A14642MAntColCod, P0AUD2_A14568MAntColNum, P0AUD2_A14623MAntColNom, P0AUD2_A14613MAntArtDsc,
            P0AUD2_A14567MAntArtCod, P0AUD2_A14611MAntCliNom, P0AUD2_A14565MAntCliCod, P0AUD2_A14562MAntId, P0AUD2_A14644MAntKilReo, P0AUD2_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD3_A14611MAntCliNom, P0AUD3_A14643MAntKilPro, P0AUD3_A14612MAntTipMDs, P0AUD3_A14569MAntTipMCo, P0AUD3_A14610MAntMaqDsc, P0AUD3_A14570MAntMaqCod, P0AUD3_A14642MAntColCod, P0AUD3_A14568MAntColNum, P0AUD3_A14623MAntColNom, P0AUD3_A14613MAntArtDsc,
            P0AUD3_A14567MAntArtCod, P0AUD3_A14565MAntCliCod, P0AUD3_A14566MAntEmprCo, P0AUD3_A14562MAntId, P0AUD3_A14644MAntKilReo, P0AUD3_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD4_A14567MAntArtCod, P0AUD4_A14643MAntKilPro, P0AUD4_A14612MAntTipMDs, P0AUD4_A14569MAntTipMCo, P0AUD4_A14610MAntMaqDsc, P0AUD4_A14570MAntMaqCod, P0AUD4_A14642MAntColCod, P0AUD4_A14568MAntColNum, P0AUD4_A14623MAntColNom, P0AUD4_A14613MAntArtDsc,
            P0AUD4_A14611MAntCliNom, P0AUD4_A14565MAntCliCod, P0AUD4_A14566MAntEmprCo, P0AUD4_A14562MAntId, P0AUD4_A14644MAntKilReo, P0AUD4_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD5_A14613MAntArtDsc, P0AUD5_A14643MAntKilPro, P0AUD5_A14612MAntTipMDs, P0AUD5_A14569MAntTipMCo, P0AUD5_A14610MAntMaqDsc, P0AUD5_A14570MAntMaqCod, P0AUD5_A14642MAntColCod, P0AUD5_A14568MAntColNum, P0AUD5_A14623MAntColNom, P0AUD5_A14567MAntArtCod,
            P0AUD5_A14611MAntCliNom, P0AUD5_A14565MAntCliCod, P0AUD5_A14566MAntEmprCo, P0AUD5_A14562MAntId, P0AUD5_A14644MAntKilReo, P0AUD5_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD6_A14623MAntColNom, P0AUD6_A14643MAntKilPro, P0AUD6_A14612MAntTipMDs, P0AUD6_A14569MAntTipMCo, P0AUD6_A14610MAntMaqDsc, P0AUD6_A14570MAntMaqCod, P0AUD6_A14642MAntColCod, P0AUD6_A14568MAntColNum, P0AUD6_A14613MAntArtDsc, P0AUD6_A14567MAntArtCod,
            P0AUD6_A14611MAntCliNom, P0AUD6_A14565MAntCliCod, P0AUD6_A14566MAntEmprCo, P0AUD6_A14562MAntId, P0AUD6_A14644MAntKilReo, P0AUD6_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD7_A14570MAntMaqCod, P0AUD7_A14643MAntKilPro, P0AUD7_A14612MAntTipMDs, P0AUD7_A14569MAntTipMCo, P0AUD7_A14610MAntMaqDsc, P0AUD7_A14642MAntColCod, P0AUD7_A14568MAntColNum, P0AUD7_A14623MAntColNom, P0AUD7_A14613MAntArtDsc, P0AUD7_A14567MAntArtCod,
            P0AUD7_A14611MAntCliNom, P0AUD7_A14565MAntCliCod, P0AUD7_A14566MAntEmprCo, P0AUD7_A14562MAntId, P0AUD7_A14644MAntKilReo, P0AUD7_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD8_A14610MAntMaqDsc, P0AUD8_A14643MAntKilPro, P0AUD8_A14612MAntTipMDs, P0AUD8_A14569MAntTipMCo, P0AUD8_A14570MAntMaqCod, P0AUD8_A14642MAntColCod, P0AUD8_A14568MAntColNum, P0AUD8_A14623MAntColNom, P0AUD8_A14613MAntArtDsc, P0AUD8_A14567MAntArtCod,
            P0AUD8_A14611MAntCliNom, P0AUD8_A14565MAntCliCod, P0AUD8_A14566MAntEmprCo, P0AUD8_A14562MAntId, P0AUD8_A14644MAntKilReo, P0AUD8_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD9_A14569MAntTipMCo, P0AUD9_A14643MAntKilPro, P0AUD9_A14612MAntTipMDs, P0AUD9_A14610MAntMaqDsc, P0AUD9_A14570MAntMaqCod, P0AUD9_A14642MAntColCod, P0AUD9_A14568MAntColNum, P0AUD9_A14623MAntColNom, P0AUD9_A14613MAntArtDsc, P0AUD9_A14567MAntArtCod,
            P0AUD9_A14611MAntCliNom, P0AUD9_A14565MAntCliCod, P0AUD9_A14566MAntEmprCo, P0AUD9_A14562MAntId, P0AUD9_A14644MAntKilReo, P0AUD9_A14646MAntKilTot
            }
            , new Object[] {
            P0AUD10_A14612MAntTipMDs, P0AUD10_A14643MAntKilPro, P0AUD10_A14569MAntTipMCo, P0AUD10_A14610MAntMaqDsc, P0AUD10_A14570MAntMaqCod, P0AUD10_A14642MAntColCod, P0AUD10_A14568MAntColNum, P0AUD10_A14623MAntColNom, P0AUD10_A14613MAntArtDsc, P0AUD10_A14567MAntArtCod,
            P0AUD10_A14611MAntCliNom, P0AUD10_A14565MAntCliCod, P0AUD10_A14566MAntEmprCo, P0AUD10_A14562MAntId, P0AUD10_A14644MAntKilReo, P0AUD10_A14646MAntKilTot
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26TFMAntColCod ;
   private byte AV27TFMAntColCod_To ;
   private byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ;
   private byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ;
   private byte A14642MAntColCod ;
   private short Gx_err ;
   private int AV63GXV1 ;
   private int AV14TFMAntCliCod ;
   private int AV15TFMAntCliCod_To ;
   private int AV24TFMAntColNum ;
   private int AV25TFMAntColNum_To ;
   private int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ;
   private int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ;
   private int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ;
   private int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ;
   private int A14565MAntCliCod ;
   private int A14568MAntColNum ;
   private long AV10TFMAntId ;
   private long AV11TFMAntId_To ;
   private long AV66Anticipacionerrores_mantwwds_2_tfmantid ;
   private long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ;
   private long A14562MAntId ;
   private long AV48count ;
   private java.math.BigDecimal AV36TFMAntKilProd ;
   private java.math.BigDecimal AV37TFMAntKilProd_To ;
   private java.math.BigDecimal AV38TFMAntKilReo ;
   private java.math.BigDecimal AV39TFMAntKilReo_To ;
   private java.math.BigDecimal AV40TFMAntPorc ;
   private java.math.BigDecimal AV41TFMAntPorc_To ;
   private java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ;
   private java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ;
   private java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ;
   private java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ;
   private java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ;
   private java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ;
   private java.math.BigDecimal A14643MAntKilPro ;
   private java.math.BigDecimal A14644MAntKilReo ;
   private java.math.BigDecimal A14646MAntKilTot ;
   private java.math.BigDecimal A14645MAntPorc ;
   private String AV12TFMAntEmprCod ;
   private String AV13TFMAntEmprCod_Sel ;
   private String AV18TFMAntArtCod ;
   private String AV19TFMAntArtCod_Sel ;
   private String AV22TFMAntColNom ;
   private String AV23TFMAntColNom_Sel ;
   private String AV28TFMAntMaqCod ;
   private String AV29TFMAntMaqCod_Sel ;
   private String AV32TFMAntTipMCod ;
   private String AV33TFMAntTipMCod_Sel ;
   private String A14566MAntEmprCo ;
   private String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ;
   private String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ;
   private String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ;
   private String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ;
   private String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ;
   private String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ;
   private String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ;
   private String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ;
   private String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ;
   private String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ;
   private String scmdbuf ;
   private String lV68Anticipacionerrores_mantwwds_4_tfmantemprcod ;
   private String lV74Anticipacionerrores_mantwwds_10_tfmantartcod ;
   private String lV78Anticipacionerrores_mantwwds_14_tfmantcolnom ;
   private String lV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ;
   private String lV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ;
   private String A14567MAntArtCod ;
   private String A14623MAntColNom ;
   private String A14570MAntMaqCod ;
   private String A14569MAntTipMCo ;
   private boolean returnInSub ;
   private boolean brkAUD2 ;
   private boolean brkAUD4 ;
   private boolean brkAUD6 ;
   private boolean brkAUD8 ;
   private boolean brkAUD10 ;
   private boolean brkAUD12 ;
   private boolean brkAUD14 ;
   private boolean brkAUD16 ;
   private boolean brkAUD18 ;
   private String AV57OptionsJson ;
   private String AV58OptionsDescJson ;
   private String AV59OptionIndexesJson ;
   private String AV54DDOName ;
   private String AV55SearchTxt ;
   private String AV56SearchTxtTo ;
   private String AV60FilterFullText ;
   private String AV16TFMAntCliNom ;
   private String AV17TFMAntCliNom_Sel ;
   private String AV20TFMAntArtDsc ;
   private String AV21TFMAntArtDsc_Sel ;
   private String AV30TFMAntMaqDsc ;
   private String AV31TFMAntMaqDsc_Sel ;
   private String AV34TFMAntTipMDsc ;
   private String AV35TFMAntTipMDsc_Sel ;
   private String AV65Anticipacionerrores_mantwwds_1_filterfulltext ;
   private String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ;
   private String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ;
   private String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ;
   private String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ;
   private String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ;
   private String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ;
   private String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ;
   private String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ;
   private String lV65Anticipacionerrores_mantwwds_1_filterfulltext ;
   private String lV72Anticipacionerrores_mantwwds_8_tfmantclinom ;
   private String lV76Anticipacionerrores_mantwwds_12_tfmantartdsc ;
   private String lV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ;
   private String lV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ;
   private String A14611MAntCliNom ;
   private String A14613MAntArtDsc ;
   private String A14610MAntMaqDsc ;
   private String A14612MAntTipMDs ;
   private String AV43Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AUD2_A14566MAntEmprCo ;
   private java.math.BigDecimal[] P0AUD2_A14643MAntKilPro ;
   private String[] P0AUD2_A14612MAntTipMDs ;
   private String[] P0AUD2_A14569MAntTipMCo ;
   private String[] P0AUD2_A14610MAntMaqDsc ;
   private String[] P0AUD2_A14570MAntMaqCod ;
   private byte[] P0AUD2_A14642MAntColCod ;
   private int[] P0AUD2_A14568MAntColNum ;
   private String[] P0AUD2_A14623MAntColNom ;
   private String[] P0AUD2_A14613MAntArtDsc ;
   private String[] P0AUD2_A14567MAntArtCod ;
   private String[] P0AUD2_A14611MAntCliNom ;
   private int[] P0AUD2_A14565MAntCliCod ;
   private long[] P0AUD2_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD2_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD2_A14646MAntKilTot ;
   private String[] P0AUD3_A14611MAntCliNom ;
   private java.math.BigDecimal[] P0AUD3_A14643MAntKilPro ;
   private String[] P0AUD3_A14612MAntTipMDs ;
   private String[] P0AUD3_A14569MAntTipMCo ;
   private String[] P0AUD3_A14610MAntMaqDsc ;
   private String[] P0AUD3_A14570MAntMaqCod ;
   private byte[] P0AUD3_A14642MAntColCod ;
   private int[] P0AUD3_A14568MAntColNum ;
   private String[] P0AUD3_A14623MAntColNom ;
   private String[] P0AUD3_A14613MAntArtDsc ;
   private String[] P0AUD3_A14567MAntArtCod ;
   private int[] P0AUD3_A14565MAntCliCod ;
   private String[] P0AUD3_A14566MAntEmprCo ;
   private long[] P0AUD3_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD3_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD3_A14646MAntKilTot ;
   private String[] P0AUD4_A14567MAntArtCod ;
   private java.math.BigDecimal[] P0AUD4_A14643MAntKilPro ;
   private String[] P0AUD4_A14612MAntTipMDs ;
   private String[] P0AUD4_A14569MAntTipMCo ;
   private String[] P0AUD4_A14610MAntMaqDsc ;
   private String[] P0AUD4_A14570MAntMaqCod ;
   private byte[] P0AUD4_A14642MAntColCod ;
   private int[] P0AUD4_A14568MAntColNum ;
   private String[] P0AUD4_A14623MAntColNom ;
   private String[] P0AUD4_A14613MAntArtDsc ;
   private String[] P0AUD4_A14611MAntCliNom ;
   private int[] P0AUD4_A14565MAntCliCod ;
   private String[] P0AUD4_A14566MAntEmprCo ;
   private long[] P0AUD4_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD4_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD4_A14646MAntKilTot ;
   private String[] P0AUD5_A14613MAntArtDsc ;
   private java.math.BigDecimal[] P0AUD5_A14643MAntKilPro ;
   private String[] P0AUD5_A14612MAntTipMDs ;
   private String[] P0AUD5_A14569MAntTipMCo ;
   private String[] P0AUD5_A14610MAntMaqDsc ;
   private String[] P0AUD5_A14570MAntMaqCod ;
   private byte[] P0AUD5_A14642MAntColCod ;
   private int[] P0AUD5_A14568MAntColNum ;
   private String[] P0AUD5_A14623MAntColNom ;
   private String[] P0AUD5_A14567MAntArtCod ;
   private String[] P0AUD5_A14611MAntCliNom ;
   private int[] P0AUD5_A14565MAntCliCod ;
   private String[] P0AUD5_A14566MAntEmprCo ;
   private long[] P0AUD5_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD5_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD5_A14646MAntKilTot ;
   private String[] P0AUD6_A14623MAntColNom ;
   private java.math.BigDecimal[] P0AUD6_A14643MAntKilPro ;
   private String[] P0AUD6_A14612MAntTipMDs ;
   private String[] P0AUD6_A14569MAntTipMCo ;
   private String[] P0AUD6_A14610MAntMaqDsc ;
   private String[] P0AUD6_A14570MAntMaqCod ;
   private byte[] P0AUD6_A14642MAntColCod ;
   private int[] P0AUD6_A14568MAntColNum ;
   private String[] P0AUD6_A14613MAntArtDsc ;
   private String[] P0AUD6_A14567MAntArtCod ;
   private String[] P0AUD6_A14611MAntCliNom ;
   private int[] P0AUD6_A14565MAntCliCod ;
   private String[] P0AUD6_A14566MAntEmprCo ;
   private long[] P0AUD6_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD6_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD6_A14646MAntKilTot ;
   private String[] P0AUD7_A14570MAntMaqCod ;
   private java.math.BigDecimal[] P0AUD7_A14643MAntKilPro ;
   private String[] P0AUD7_A14612MAntTipMDs ;
   private String[] P0AUD7_A14569MAntTipMCo ;
   private String[] P0AUD7_A14610MAntMaqDsc ;
   private byte[] P0AUD7_A14642MAntColCod ;
   private int[] P0AUD7_A14568MAntColNum ;
   private String[] P0AUD7_A14623MAntColNom ;
   private String[] P0AUD7_A14613MAntArtDsc ;
   private String[] P0AUD7_A14567MAntArtCod ;
   private String[] P0AUD7_A14611MAntCliNom ;
   private int[] P0AUD7_A14565MAntCliCod ;
   private String[] P0AUD7_A14566MAntEmprCo ;
   private long[] P0AUD7_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD7_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD7_A14646MAntKilTot ;
   private String[] P0AUD8_A14610MAntMaqDsc ;
   private java.math.BigDecimal[] P0AUD8_A14643MAntKilPro ;
   private String[] P0AUD8_A14612MAntTipMDs ;
   private String[] P0AUD8_A14569MAntTipMCo ;
   private String[] P0AUD8_A14570MAntMaqCod ;
   private byte[] P0AUD8_A14642MAntColCod ;
   private int[] P0AUD8_A14568MAntColNum ;
   private String[] P0AUD8_A14623MAntColNom ;
   private String[] P0AUD8_A14613MAntArtDsc ;
   private String[] P0AUD8_A14567MAntArtCod ;
   private String[] P0AUD8_A14611MAntCliNom ;
   private int[] P0AUD8_A14565MAntCliCod ;
   private String[] P0AUD8_A14566MAntEmprCo ;
   private long[] P0AUD8_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD8_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD8_A14646MAntKilTot ;
   private String[] P0AUD9_A14569MAntTipMCo ;
   private java.math.BigDecimal[] P0AUD9_A14643MAntKilPro ;
   private String[] P0AUD9_A14612MAntTipMDs ;
   private String[] P0AUD9_A14610MAntMaqDsc ;
   private String[] P0AUD9_A14570MAntMaqCod ;
   private byte[] P0AUD9_A14642MAntColCod ;
   private int[] P0AUD9_A14568MAntColNum ;
   private String[] P0AUD9_A14623MAntColNom ;
   private String[] P0AUD9_A14613MAntArtDsc ;
   private String[] P0AUD9_A14567MAntArtCod ;
   private String[] P0AUD9_A14611MAntCliNom ;
   private int[] P0AUD9_A14565MAntCliCod ;
   private String[] P0AUD9_A14566MAntEmprCo ;
   private long[] P0AUD9_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD9_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD9_A14646MAntKilTot ;
   private String[] P0AUD10_A14612MAntTipMDs ;
   private java.math.BigDecimal[] P0AUD10_A14643MAntKilPro ;
   private String[] P0AUD10_A14569MAntTipMCo ;
   private String[] P0AUD10_A14610MAntMaqDsc ;
   private String[] P0AUD10_A14570MAntMaqCod ;
   private byte[] P0AUD10_A14642MAntColCod ;
   private int[] P0AUD10_A14568MAntColNum ;
   private String[] P0AUD10_A14623MAntColNom ;
   private String[] P0AUD10_A14613MAntArtDsc ;
   private String[] P0AUD10_A14567MAntArtCod ;
   private String[] P0AUD10_A14611MAntCliNom ;
   private int[] P0AUD10_A14565MAntCliCod ;
   private String[] P0AUD10_A14566MAntEmprCo ;
   private long[] P0AUD10_A14562MAntId ;
   private java.math.BigDecimal[] P0AUD10_A14644MAntKilReo ;
   private java.math.BigDecimal[] P0AUD10_A14646MAntKilTot ;
   private GXSimpleCollection<String> AV44Options ;
   private GXSimpleCollection<String> AV46OptionsDesc ;
   private GXSimpleCollection<String> AV47OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class mantwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AUD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[48];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MAntEmprCo, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntEmprCo" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AUD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[48];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MAntCliNom, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntCliNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AUD4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[48];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MAntArtCod, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntArtCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AUD5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[48];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT MAntArtDsc, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntArtDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AUD6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[48];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT MAntColNom, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int10[13] = (byte)(1) ;
         GXv_int10[14] = (byte)(1) ;
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AUD7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[48];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT MAntMaqCod, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqDsc, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
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
         GXv_int12[13] = (byte)(1) ;
         GXv_int12[14] = (byte)(1) ;
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntMaqCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0AUD8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[48];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT MAntMaqDsc, MAntKilPro, MAntTipMDs, MAntTipMCo, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
         GXv_int14[1] = (byte)(1) ;
         GXv_int14[2] = (byte)(1) ;
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
         GXv_int14[14] = (byte)(1) ;
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntMaqDsc" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0AUD9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                          long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                          long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                          String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                          String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                          int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                          int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                          String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                          String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                          String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                          String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                          String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                          String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                          String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                          String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                          int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                          int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                          byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                          byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                          String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                          String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                          String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                          String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                          String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                          String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                          String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                          String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                          java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                          java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                          java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                          java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                          java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                          java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                          long A14562MAntId ,
                                          String A14566MAntEmprCo ,
                                          int A14565MAntCliCod ,
                                          String A14611MAntCliNom ,
                                          String A14567MAntArtCod ,
                                          String A14613MAntArtDsc ,
                                          String A14623MAntColNom ,
                                          int A14568MAntColNum ,
                                          byte A14642MAntColCod ,
                                          String A14570MAntMaqCod ,
                                          String A14610MAntMaqDsc ,
                                          String A14569MAntTipMCo ,
                                          String A14612MAntTipMDs ,
                                          java.math.BigDecimal A14643MAntKilPro ,
                                          java.math.BigDecimal A14644MAntKilReo ,
                                          java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[48];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT MAntTipMCo, MAntKilPro, MAntTipMDs, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
         GXv_int16[1] = (byte)(1) ;
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
         GXv_int16[14] = (byte)(1) ;
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int16[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int16[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int16[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntTipMCo" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P0AUD10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV65Anticipacionerrores_mantwwds_1_filterfulltext ,
                                           long AV66Anticipacionerrores_mantwwds_2_tfmantid ,
                                           long AV67Anticipacionerrores_mantwwds_3_tfmantid_to ,
                                           String AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel ,
                                           String AV68Anticipacionerrores_mantwwds_4_tfmantemprcod ,
                                           int AV70Anticipacionerrores_mantwwds_6_tfmantclicod ,
                                           int AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to ,
                                           String AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel ,
                                           String AV72Anticipacionerrores_mantwwds_8_tfmantclinom ,
                                           String AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel ,
                                           String AV74Anticipacionerrores_mantwwds_10_tfmantartcod ,
                                           String AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel ,
                                           String AV76Anticipacionerrores_mantwwds_12_tfmantartdsc ,
                                           String AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel ,
                                           String AV78Anticipacionerrores_mantwwds_14_tfmantcolnom ,
                                           int AV80Anticipacionerrores_mantwwds_16_tfmantcolnum ,
                                           int AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to ,
                                           byte AV82Anticipacionerrores_mantwwds_18_tfmantcolcod ,
                                           byte AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to ,
                                           String AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel ,
                                           String AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod ,
                                           String AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel ,
                                           String AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc ,
                                           String AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel ,
                                           String AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod ,
                                           String AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel ,
                                           String AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc ,
                                           java.math.BigDecimal AV92Anticipacionerrores_mantwwds_28_tfmantkilprod ,
                                           java.math.BigDecimal AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to ,
                                           java.math.BigDecimal AV94Anticipacionerrores_mantwwds_30_tfmantkilreo ,
                                           java.math.BigDecimal AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to ,
                                           java.math.BigDecimal AV96Anticipacionerrores_mantwwds_32_tfmantporc ,
                                           java.math.BigDecimal AV97Anticipacionerrores_mantwwds_33_tfmantporc_to ,
                                           long A14562MAntId ,
                                           String A14566MAntEmprCo ,
                                           int A14565MAntCliCod ,
                                           String A14611MAntCliNom ,
                                           String A14567MAntArtCod ,
                                           String A14613MAntArtDsc ,
                                           String A14623MAntColNom ,
                                           int A14568MAntColNum ,
                                           byte A14642MAntColCod ,
                                           String A14570MAntMaqCod ,
                                           String A14610MAntMaqDsc ,
                                           String A14569MAntTipMCo ,
                                           String A14612MAntTipMDs ,
                                           java.math.BigDecimal A14643MAntKilPro ,
                                           java.math.BigDecimal A14644MAntKilReo ,
                                           java.math.BigDecimal A14646MAntKilTot )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[48];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT MAntTipMDs, MAntKilPro, MAntTipMCo, MAntMaqDsc, MAntMaqCod, MAntColCod, MAntColNum, MAntColNom, MAntArtDsc, MAntArtCod, MAntCliNom, MAntCliCod, MAntEmprCo," ;
      scmdbuf += " MAntId, MAntKilReo, MAntKilTot FROM MAnt" ;
      if ( ! (GXutil.strcmp("", AV65Anticipacionerrores_mantwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MAntId,'9999999990'), 2) like '%' || ?) or ( UPPER(MAntEmprCo) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntCliCod,'999990'), 2) like '%' || ?) or ( UPPER(MAntCliNom) like '%' || UPPER(?)) or ( UPPER(MAntArtCod) like '%' || UPPER(?)) or ( UPPER(MAntArtDsc) like '%' || UPPER(?)) or ( UPPER(MAntColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntColCod,'90'), 2) like '%' || ?) or ( UPPER(MAntMaqCod) like '%' || UPPER(?)) or ( UPPER(MAntMaqDsc) like '%' || UPPER(?)) or ( UPPER(MAntTipMCo) like '%' || UPPER(?)) or ( UPPER(MAntTipMDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MAntKilPro,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MAntKilReo,'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
         GXv_int18[1] = (byte)(1) ;
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
         GXv_int18[5] = (byte)(1) ;
         GXv_int18[6] = (byte)(1) ;
         GXv_int18[7] = (byte)(1) ;
         GXv_int18[8] = (byte)(1) ;
         GXv_int18[9] = (byte)(1) ;
         GXv_int18[10] = (byte)(1) ;
         GXv_int18[11] = (byte)(1) ;
         GXv_int18[12] = (byte)(1) ;
         GXv_int18[13] = (byte)(1) ;
         GXv_int18[14] = (byte)(1) ;
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Anticipacionerrores_mantwwds_2_tfmantid) )
      {
         addWhere(sWhereString, "(MAntId >= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Anticipacionerrores_mantwwds_3_tfmantid_to) )
      {
         addWhere(sWhereString, "(MAntId <= ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV68Anticipacionerrores_mantwwds_4_tfmantemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntEmprCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Anticipacionerrores_mantwwds_5_tfmantemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntEmprCo = ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (0==AV70Anticipacionerrores_mantwwds_6_tfmantclicod) )
      {
         addWhere(sWhereString, "(MAntCliCod >= ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Anticipacionerrores_mantwwds_7_tfmantclicod_to) )
      {
         addWhere(sWhereString, "(MAntCliCod <= ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) && ( ! (GXutil.strcmp("", AV72Anticipacionerrores_mantwwds_8_tfmantclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntCliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Anticipacionerrores_mantwwds_9_tfmantclinom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntCliNom = ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) && ( ! (GXutil.strcmp("", AV74Anticipacionerrores_mantwwds_10_tfmantartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Anticipacionerrores_mantwwds_11_tfmantartcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtCod = ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Anticipacionerrores_mantwwds_12_tfmantartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Anticipacionerrores_mantwwds_13_tfmantartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntArtDsc = ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Anticipacionerrores_mantwwds_14_tfmantcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Anticipacionerrores_mantwwds_15_tfmantcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(MAntColNom = ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (0==AV80Anticipacionerrores_mantwwds_16_tfmantcolnum) )
      {
         addWhere(sWhereString, "(MAntColNum >= ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (0==AV81Anticipacionerrores_mantwwds_17_tfmantcolnum_to) )
      {
         addWhere(sWhereString, "(MAntColNum <= ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (0==AV82Anticipacionerrores_mantwwds_18_tfmantcolcod) )
      {
         addWhere(sWhereString, "(MAntColCod >= ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (0==AV83Anticipacionerrores_mantwwds_19_tfmantcolcod_to) )
      {
         addWhere(sWhereString, "(MAntColCod <= ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV84Anticipacionerrores_mantwwds_20_tfmantmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Anticipacionerrores_mantwwds_21_tfmantmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqCod = ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Anticipacionerrores_mantwwds_22_tfmantmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Anticipacionerrores_mantwwds_23_tfmantmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntMaqDsc = ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Anticipacionerrores_mantwwds_24_tfmanttipmcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Anticipacionerrores_mantwwds_25_tfmanttipmcod_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMCo = ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Anticipacionerrores_mantwwds_26_tfmanttipmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MAntTipMDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Anticipacionerrores_mantwwds_27_tfmanttipmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MAntTipMDs = ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Anticipacionerrores_mantwwds_28_tfmantkilprod)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro >= ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Anticipacionerrores_mantwwds_29_tfmantkilprod_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilPro <= ?)");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Anticipacionerrores_mantwwds_30_tfmantkilreo)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo >= ?)");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Anticipacionerrores_mantwwds_31_tfmantkilreo_to)==0) )
      {
         addWhere(sWhereString, "(MAntKilReo <= ?)");
      }
      else
      {
         GXv_int18[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Anticipacionerrores_mantwwds_32_tfmantporc)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END >= ?)");
      }
      else
      {
         GXv_int18[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Anticipacionerrores_mantwwds_33_tfmantporc_to)==0) )
      {
         addWhere(sWhereString, "(CASE  WHEN MAntKilTot > 0 THEN ( CAST(MAntKilReo / MAntKilTot AS NUMERIC(22,10))) * CAST(100 AS NUMERIC(22,10)) ELSE 0 END <= ?)");
      }
      else
      {
         GXv_int18[47] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAntTipMDs" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_P0AUD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 1 :
                  return conditional_P0AUD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 2 :
                  return conditional_P0AUD4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 3 :
                  return conditional_P0AUD5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 4 :
                  return conditional_P0AUD6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 5 :
                  return conditional_P0AUD7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 6 :
                  return conditional_P0AUD8(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 7 :
                  return conditional_P0AUD9(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
            case 8 :
                  return conditional_P0AUD10(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AUD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AUD10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
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
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[64]).longValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[65]).longValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 255);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 255);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 255);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 255);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[81]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 255);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 255);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 4);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 255);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 255);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               return;
      }
   }

}

