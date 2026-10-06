package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprocedwwgetfilterdata extends GXProcedure
{
   public tprocedwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprocedwwgetfilterdata.class ), "" );
   }

   public tprocedwwgetfilterdata( int remoteHandle ,
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
      tprocedwwgetfilterdata.this.aP5 = new String[] {""};
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
      tprocedwwgetfilterdata.this.AV38DDOName = aP0;
      tprocedwwgetfilterdata.this.AV36SearchTxt = aP1;
      tprocedwwgetfilterdata.this.AV37SearchTxtTo = aP2;
      tprocedwwgetfilterdata.this.aP3 = aP3;
      tprocedwwgetfilterdata.this.aP4 = aP4;
      tprocedwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCENOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCEDOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCEDOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCEPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCEPOBOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRVDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_POCECP") == 0 )
      {
         /* Execute user subroutine: 'LOADPOCECPOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCETEL1") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCETEL1OPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCETEL2") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCETEL2OPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCETELEX") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCETELEXOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROPERS") == 0 )
      {
         /* Execute user subroutine: 'LOADPROPERSOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROEMAIL") == 0 )
      {
         /* Execute user subroutine: 'LOADPROEMAILOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCENIF") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCENIFOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_POCECP2") == 0 )
      {
         /* Execute user subroutine: 'LOADPOCECP2OPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("TPROCEDWWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPROCEDWWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("TPROCEDWWGridState"), null, null);
      }
      AV78GXV1 = 1 ;
      while ( AV78GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV73FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV68TFProceNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV69TFProceNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV12TFProceCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFProceCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV16TFProceDom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV17TFProceDom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV18TFProcePob = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV19TFProcePob_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV20TFPrvCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFPrvCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV22TFPrvDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV23TFPrvDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV24TFPoceCp = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV25TFPoceCp_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV26TFProceTel1 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV27TFProceTel1_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV28TFProceTel2 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV29TFProceTel2_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV30TFProceTelex = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV31TFProceTelex_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV32TFProPers = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV33TFProPers_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV34TFProEmail = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV35TFProEmail_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV14TFProceNif = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV15TFProceNif_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV74TFPoceCp2 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV75TFPoceCp2_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV78GXV1 = (int)(AV78GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCENOMOPTIONS' Routine */
      returnInSub = false ;
      AV68TFProceNom = AV36SearchTxt ;
      AV69TFProceNom_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G2 */
      pr_default.execute(0, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk84G2 = false ;
         A971ProceNom = P084G2_A971ProceNom[0] ;
         n971ProceNom = P084G2_n971ProceNom[0] ;
         A14029PoceCp2 = P084G2_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G2_n14029PoceCp2[0] ;
         A993ProceNif = P084G2_A993ProceNif[0] ;
         n993ProceNif = P084G2_n993ProceNif[0] ;
         A10391ProEmail = P084G2_A10391ProEmail[0] ;
         n10391ProEmail = P084G2_n10391ProEmail[0] ;
         A10390ProPers = P084G2_A10390ProPers[0] ;
         n10390ProPers = P084G2_n10390ProPers[0] ;
         A992ProceTelex = P084G2_A992ProceTelex[0] ;
         n992ProceTelex = P084G2_n992ProceTelex[0] ;
         A991ProceTel2 = P084G2_A991ProceTel2[0] ;
         n991ProceTel2 = P084G2_n991ProceTel2[0] ;
         A990ProceTel1 = P084G2_A990ProceTel1[0] ;
         n990ProceTel1 = P084G2_n990ProceTel1[0] ;
         A989PoceCp = P084G2_A989PoceCp[0] ;
         n989PoceCp = P084G2_n989PoceCp[0] ;
         A787PrvDsc = P084G2_A787PrvDsc[0] ;
         n787PrvDsc = P084G2_n787PrvDsc[0] ;
         A781PrvCod = P084G2_A781PrvCod[0] ;
         n781PrvCod = P084G2_n781PrvCod[0] ;
         A988ProcePob = P084G2_A988ProcePob[0] ;
         n988ProcePob = P084G2_n988ProcePob[0] ;
         A994ProceDom = P084G2_A994ProceDom[0] ;
         n994ProceDom = P084G2_n994ProceDom[0] ;
         A970ProceCod = P084G2_A970ProceCod[0] ;
         A396EmprCod = P084G2_A396EmprCod[0] ;
         A787PrvDsc = P084G2_A787PrvDsc[0] ;
         n787PrvDsc = P084G2_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P084G2_A971ProceNom[0], A971ProceNom) == 0 ) )
         {
            brk84G2 = false ;
            A970ProceCod = P084G2_A970ProceCod[0] ;
            A396EmprCod = P084G2_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A971ProceNom)==0) )
         {
            AV40Option = A971ProceNom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G2 )
         {
            brk84G2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROCEDOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFProceDom = AV36SearchTxt ;
      AV17TFProceDom_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G3 */
      pr_default.execute(1, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk84G4 = false ;
         A994ProceDom = P084G3_A994ProceDom[0] ;
         n994ProceDom = P084G3_n994ProceDom[0] ;
         A14029PoceCp2 = P084G3_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G3_n14029PoceCp2[0] ;
         A993ProceNif = P084G3_A993ProceNif[0] ;
         n993ProceNif = P084G3_n993ProceNif[0] ;
         A10391ProEmail = P084G3_A10391ProEmail[0] ;
         n10391ProEmail = P084G3_n10391ProEmail[0] ;
         A10390ProPers = P084G3_A10390ProPers[0] ;
         n10390ProPers = P084G3_n10390ProPers[0] ;
         A992ProceTelex = P084G3_A992ProceTelex[0] ;
         n992ProceTelex = P084G3_n992ProceTelex[0] ;
         A991ProceTel2 = P084G3_A991ProceTel2[0] ;
         n991ProceTel2 = P084G3_n991ProceTel2[0] ;
         A990ProceTel1 = P084G3_A990ProceTel1[0] ;
         n990ProceTel1 = P084G3_n990ProceTel1[0] ;
         A989PoceCp = P084G3_A989PoceCp[0] ;
         n989PoceCp = P084G3_n989PoceCp[0] ;
         A787PrvDsc = P084G3_A787PrvDsc[0] ;
         n787PrvDsc = P084G3_n787PrvDsc[0] ;
         A781PrvCod = P084G3_A781PrvCod[0] ;
         n781PrvCod = P084G3_n781PrvCod[0] ;
         A988ProcePob = P084G3_A988ProcePob[0] ;
         n988ProcePob = P084G3_n988ProcePob[0] ;
         A970ProceCod = P084G3_A970ProceCod[0] ;
         A971ProceNom = P084G3_A971ProceNom[0] ;
         n971ProceNom = P084G3_n971ProceNom[0] ;
         A396EmprCod = P084G3_A396EmprCod[0] ;
         A787PrvDsc = P084G3_A787PrvDsc[0] ;
         n787PrvDsc = P084G3_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P084G3_A994ProceDom[0], A994ProceDom) == 0 ) )
         {
            brk84G4 = false ;
            A970ProceCod = P084G3_A970ProceCod[0] ;
            A396EmprCod = P084G3_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A994ProceDom)==0) )
         {
            AV40Option = A994ProceDom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G4 )
         {
            brk84G4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROCEPOBOPTIONS' Routine */
      returnInSub = false ;
      AV18TFProcePob = AV36SearchTxt ;
      AV19TFProcePob_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G4 */
      pr_default.execute(2, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk84G6 = false ;
         A988ProcePob = P084G4_A988ProcePob[0] ;
         n988ProcePob = P084G4_n988ProcePob[0] ;
         A14029PoceCp2 = P084G4_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G4_n14029PoceCp2[0] ;
         A993ProceNif = P084G4_A993ProceNif[0] ;
         n993ProceNif = P084G4_n993ProceNif[0] ;
         A10391ProEmail = P084G4_A10391ProEmail[0] ;
         n10391ProEmail = P084G4_n10391ProEmail[0] ;
         A10390ProPers = P084G4_A10390ProPers[0] ;
         n10390ProPers = P084G4_n10390ProPers[0] ;
         A992ProceTelex = P084G4_A992ProceTelex[0] ;
         n992ProceTelex = P084G4_n992ProceTelex[0] ;
         A991ProceTel2 = P084G4_A991ProceTel2[0] ;
         n991ProceTel2 = P084G4_n991ProceTel2[0] ;
         A990ProceTel1 = P084G4_A990ProceTel1[0] ;
         n990ProceTel1 = P084G4_n990ProceTel1[0] ;
         A989PoceCp = P084G4_A989PoceCp[0] ;
         n989PoceCp = P084G4_n989PoceCp[0] ;
         A787PrvDsc = P084G4_A787PrvDsc[0] ;
         n787PrvDsc = P084G4_n787PrvDsc[0] ;
         A781PrvCod = P084G4_A781PrvCod[0] ;
         n781PrvCod = P084G4_n781PrvCod[0] ;
         A994ProceDom = P084G4_A994ProceDom[0] ;
         n994ProceDom = P084G4_n994ProceDom[0] ;
         A970ProceCod = P084G4_A970ProceCod[0] ;
         A971ProceNom = P084G4_A971ProceNom[0] ;
         n971ProceNom = P084G4_n971ProceNom[0] ;
         A396EmprCod = P084G4_A396EmprCod[0] ;
         A787PrvDsc = P084G4_A787PrvDsc[0] ;
         n787PrvDsc = P084G4_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P084G4_A988ProcePob[0], A988ProcePob) == 0 ) )
         {
            brk84G6 = false ;
            A970ProceCod = P084G4_A970ProceCod[0] ;
            A396EmprCod = P084G4_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A988ProcePob)==0) )
         {
            AV40Option = A988ProcePob ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G6 )
         {
            brk84G6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRVDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrvDsc = AV36SearchTxt ;
      AV23TFPrvDsc_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G5 */
      pr_default.execute(3, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk84G8 = false ;
         A781PrvCod = P084G5_A781PrvCod[0] ;
         n781PrvCod = P084G5_n781PrvCod[0] ;
         A14029PoceCp2 = P084G5_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G5_n14029PoceCp2[0] ;
         A993ProceNif = P084G5_A993ProceNif[0] ;
         n993ProceNif = P084G5_n993ProceNif[0] ;
         A10391ProEmail = P084G5_A10391ProEmail[0] ;
         n10391ProEmail = P084G5_n10391ProEmail[0] ;
         A10390ProPers = P084G5_A10390ProPers[0] ;
         n10390ProPers = P084G5_n10390ProPers[0] ;
         A992ProceTelex = P084G5_A992ProceTelex[0] ;
         n992ProceTelex = P084G5_n992ProceTelex[0] ;
         A991ProceTel2 = P084G5_A991ProceTel2[0] ;
         n991ProceTel2 = P084G5_n991ProceTel2[0] ;
         A990ProceTel1 = P084G5_A990ProceTel1[0] ;
         n990ProceTel1 = P084G5_n990ProceTel1[0] ;
         A989PoceCp = P084G5_A989PoceCp[0] ;
         n989PoceCp = P084G5_n989PoceCp[0] ;
         A787PrvDsc = P084G5_A787PrvDsc[0] ;
         n787PrvDsc = P084G5_n787PrvDsc[0] ;
         A988ProcePob = P084G5_A988ProcePob[0] ;
         n988ProcePob = P084G5_n988ProcePob[0] ;
         A994ProceDom = P084G5_A994ProceDom[0] ;
         n994ProceDom = P084G5_n994ProceDom[0] ;
         A970ProceCod = P084G5_A970ProceCod[0] ;
         A971ProceNom = P084G5_A971ProceNom[0] ;
         n971ProceNom = P084G5_n971ProceNom[0] ;
         A396EmprCod = P084G5_A396EmprCod[0] ;
         A787PrvDsc = P084G5_A787PrvDsc[0] ;
         n787PrvDsc = P084G5_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( P084G5_A781PrvCod[0] == A781PrvCod ) )
         {
            brk84G8 = false ;
            A970ProceCod = P084G5_A970ProceCod[0] ;
            A396EmprCod = P084G5_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A787PrvDsc)==0) )
         {
            AV40Option = A787PrvDsc ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A787PrvDsc, "@!"))) ;
            AV39InsertIndex = 1 ;
            while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV44OptionsDesc.elementAt(-1+AV39InsertIndex), AV43OptionDesc) < 0 ) )
            {
               AV39InsertIndex = (int)(AV39InsertIndex+1) ;
            }
            AV41Options.add(AV40Option, AV39InsertIndex);
            AV44OptionsDesc.add(AV43OptionDesc, AV39InsertIndex);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G8 )
         {
            brk84G8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPOCECPOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPoceCp = AV36SearchTxt ;
      AV25TFPoceCp_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G6 */
      pr_default.execute(4, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk84G10 = false ;
         A989PoceCp = P084G6_A989PoceCp[0] ;
         n989PoceCp = P084G6_n989PoceCp[0] ;
         A14029PoceCp2 = P084G6_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G6_n14029PoceCp2[0] ;
         A993ProceNif = P084G6_A993ProceNif[0] ;
         n993ProceNif = P084G6_n993ProceNif[0] ;
         A10391ProEmail = P084G6_A10391ProEmail[0] ;
         n10391ProEmail = P084G6_n10391ProEmail[0] ;
         A10390ProPers = P084G6_A10390ProPers[0] ;
         n10390ProPers = P084G6_n10390ProPers[0] ;
         A992ProceTelex = P084G6_A992ProceTelex[0] ;
         n992ProceTelex = P084G6_n992ProceTelex[0] ;
         A991ProceTel2 = P084G6_A991ProceTel2[0] ;
         n991ProceTel2 = P084G6_n991ProceTel2[0] ;
         A990ProceTel1 = P084G6_A990ProceTel1[0] ;
         n990ProceTel1 = P084G6_n990ProceTel1[0] ;
         A787PrvDsc = P084G6_A787PrvDsc[0] ;
         n787PrvDsc = P084G6_n787PrvDsc[0] ;
         A781PrvCod = P084G6_A781PrvCod[0] ;
         n781PrvCod = P084G6_n781PrvCod[0] ;
         A988ProcePob = P084G6_A988ProcePob[0] ;
         n988ProcePob = P084G6_n988ProcePob[0] ;
         A994ProceDom = P084G6_A994ProceDom[0] ;
         n994ProceDom = P084G6_n994ProceDom[0] ;
         A970ProceCod = P084G6_A970ProceCod[0] ;
         A971ProceNom = P084G6_A971ProceNom[0] ;
         n971ProceNom = P084G6_n971ProceNom[0] ;
         A396EmprCod = P084G6_A396EmprCod[0] ;
         A787PrvDsc = P084G6_A787PrvDsc[0] ;
         n787PrvDsc = P084G6_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P084G6_A989PoceCp[0], A989PoceCp) == 0 ) )
         {
            brk84G10 = false ;
            A970ProceCod = P084G6_A970ProceCod[0] ;
            A396EmprCod = P084G6_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A989PoceCp)==0) )
         {
            AV40Option = A989PoceCp ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G10 )
         {
            brk84G10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPROCETEL1OPTIONS' Routine */
      returnInSub = false ;
      AV26TFProceTel1 = AV36SearchTxt ;
      AV27TFProceTel1_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G7 */
      pr_default.execute(5, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk84G12 = false ;
         A990ProceTel1 = P084G7_A990ProceTel1[0] ;
         n990ProceTel1 = P084G7_n990ProceTel1[0] ;
         A14029PoceCp2 = P084G7_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G7_n14029PoceCp2[0] ;
         A993ProceNif = P084G7_A993ProceNif[0] ;
         n993ProceNif = P084G7_n993ProceNif[0] ;
         A10391ProEmail = P084G7_A10391ProEmail[0] ;
         n10391ProEmail = P084G7_n10391ProEmail[0] ;
         A10390ProPers = P084G7_A10390ProPers[0] ;
         n10390ProPers = P084G7_n10390ProPers[0] ;
         A992ProceTelex = P084G7_A992ProceTelex[0] ;
         n992ProceTelex = P084G7_n992ProceTelex[0] ;
         A991ProceTel2 = P084G7_A991ProceTel2[0] ;
         n991ProceTel2 = P084G7_n991ProceTel2[0] ;
         A989PoceCp = P084G7_A989PoceCp[0] ;
         n989PoceCp = P084G7_n989PoceCp[0] ;
         A787PrvDsc = P084G7_A787PrvDsc[0] ;
         n787PrvDsc = P084G7_n787PrvDsc[0] ;
         A781PrvCod = P084G7_A781PrvCod[0] ;
         n781PrvCod = P084G7_n781PrvCod[0] ;
         A988ProcePob = P084G7_A988ProcePob[0] ;
         n988ProcePob = P084G7_n988ProcePob[0] ;
         A994ProceDom = P084G7_A994ProceDom[0] ;
         n994ProceDom = P084G7_n994ProceDom[0] ;
         A970ProceCod = P084G7_A970ProceCod[0] ;
         A971ProceNom = P084G7_A971ProceNom[0] ;
         n971ProceNom = P084G7_n971ProceNom[0] ;
         A396EmprCod = P084G7_A396EmprCod[0] ;
         A787PrvDsc = P084G7_A787PrvDsc[0] ;
         n787PrvDsc = P084G7_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P084G7_A990ProceTel1[0], A990ProceTel1) == 0 ) )
         {
            brk84G12 = false ;
            A970ProceCod = P084G7_A970ProceCod[0] ;
            A396EmprCod = P084G7_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A990ProceTel1)==0) )
         {
            AV40Option = A990ProceTel1 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G12 )
         {
            brk84G12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPROCETEL2OPTIONS' Routine */
      returnInSub = false ;
      AV28TFProceTel2 = AV36SearchTxt ;
      AV29TFProceTel2_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G8 */
      pr_default.execute(6, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk84G14 = false ;
         A991ProceTel2 = P084G8_A991ProceTel2[0] ;
         n991ProceTel2 = P084G8_n991ProceTel2[0] ;
         A14029PoceCp2 = P084G8_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G8_n14029PoceCp2[0] ;
         A993ProceNif = P084G8_A993ProceNif[0] ;
         n993ProceNif = P084G8_n993ProceNif[0] ;
         A10391ProEmail = P084G8_A10391ProEmail[0] ;
         n10391ProEmail = P084G8_n10391ProEmail[0] ;
         A10390ProPers = P084G8_A10390ProPers[0] ;
         n10390ProPers = P084G8_n10390ProPers[0] ;
         A992ProceTelex = P084G8_A992ProceTelex[0] ;
         n992ProceTelex = P084G8_n992ProceTelex[0] ;
         A990ProceTel1 = P084G8_A990ProceTel1[0] ;
         n990ProceTel1 = P084G8_n990ProceTel1[0] ;
         A989PoceCp = P084G8_A989PoceCp[0] ;
         n989PoceCp = P084G8_n989PoceCp[0] ;
         A787PrvDsc = P084G8_A787PrvDsc[0] ;
         n787PrvDsc = P084G8_n787PrvDsc[0] ;
         A781PrvCod = P084G8_A781PrvCod[0] ;
         n781PrvCod = P084G8_n781PrvCod[0] ;
         A988ProcePob = P084G8_A988ProcePob[0] ;
         n988ProcePob = P084G8_n988ProcePob[0] ;
         A994ProceDom = P084G8_A994ProceDom[0] ;
         n994ProceDom = P084G8_n994ProceDom[0] ;
         A970ProceCod = P084G8_A970ProceCod[0] ;
         A971ProceNom = P084G8_A971ProceNom[0] ;
         n971ProceNom = P084G8_n971ProceNom[0] ;
         A396EmprCod = P084G8_A396EmprCod[0] ;
         A787PrvDsc = P084G8_A787PrvDsc[0] ;
         n787PrvDsc = P084G8_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P084G8_A991ProceTel2[0], A991ProceTel2) == 0 ) )
         {
            brk84G14 = false ;
            A970ProceCod = P084G8_A970ProceCod[0] ;
            A396EmprCod = P084G8_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A991ProceTel2)==0) )
         {
            AV40Option = A991ProceTel2 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G14 )
         {
            brk84G14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADPROCETELEXOPTIONS' Routine */
      returnInSub = false ;
      AV30TFProceTelex = AV36SearchTxt ;
      AV31TFProceTelex_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G9 */
      pr_default.execute(7, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk84G16 = false ;
         A992ProceTelex = P084G9_A992ProceTelex[0] ;
         n992ProceTelex = P084G9_n992ProceTelex[0] ;
         A14029PoceCp2 = P084G9_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G9_n14029PoceCp2[0] ;
         A993ProceNif = P084G9_A993ProceNif[0] ;
         n993ProceNif = P084G9_n993ProceNif[0] ;
         A10391ProEmail = P084G9_A10391ProEmail[0] ;
         n10391ProEmail = P084G9_n10391ProEmail[0] ;
         A10390ProPers = P084G9_A10390ProPers[0] ;
         n10390ProPers = P084G9_n10390ProPers[0] ;
         A991ProceTel2 = P084G9_A991ProceTel2[0] ;
         n991ProceTel2 = P084G9_n991ProceTel2[0] ;
         A990ProceTel1 = P084G9_A990ProceTel1[0] ;
         n990ProceTel1 = P084G9_n990ProceTel1[0] ;
         A989PoceCp = P084G9_A989PoceCp[0] ;
         n989PoceCp = P084G9_n989PoceCp[0] ;
         A787PrvDsc = P084G9_A787PrvDsc[0] ;
         n787PrvDsc = P084G9_n787PrvDsc[0] ;
         A781PrvCod = P084G9_A781PrvCod[0] ;
         n781PrvCod = P084G9_n781PrvCod[0] ;
         A988ProcePob = P084G9_A988ProcePob[0] ;
         n988ProcePob = P084G9_n988ProcePob[0] ;
         A994ProceDom = P084G9_A994ProceDom[0] ;
         n994ProceDom = P084G9_n994ProceDom[0] ;
         A970ProceCod = P084G9_A970ProceCod[0] ;
         A971ProceNom = P084G9_A971ProceNom[0] ;
         n971ProceNom = P084G9_n971ProceNom[0] ;
         A396EmprCod = P084G9_A396EmprCod[0] ;
         A787PrvDsc = P084G9_A787PrvDsc[0] ;
         n787PrvDsc = P084G9_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P084G9_A992ProceTelex[0], A992ProceTelex) == 0 ) )
         {
            brk84G16 = false ;
            A970ProceCod = P084G9_A970ProceCod[0] ;
            A396EmprCod = P084G9_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A992ProceTelex)==0) )
         {
            AV40Option = A992ProceTelex ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G16 )
         {
            brk84G16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADPROPERSOPTIONS' Routine */
      returnInSub = false ;
      AV32TFProPers = AV36SearchTxt ;
      AV33TFProPers_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G10 */
      pr_default.execute(8, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk84G18 = false ;
         A10390ProPers = P084G10_A10390ProPers[0] ;
         n10390ProPers = P084G10_n10390ProPers[0] ;
         A14029PoceCp2 = P084G10_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G10_n14029PoceCp2[0] ;
         A993ProceNif = P084G10_A993ProceNif[0] ;
         n993ProceNif = P084G10_n993ProceNif[0] ;
         A10391ProEmail = P084G10_A10391ProEmail[0] ;
         n10391ProEmail = P084G10_n10391ProEmail[0] ;
         A992ProceTelex = P084G10_A992ProceTelex[0] ;
         n992ProceTelex = P084G10_n992ProceTelex[0] ;
         A991ProceTel2 = P084G10_A991ProceTel2[0] ;
         n991ProceTel2 = P084G10_n991ProceTel2[0] ;
         A990ProceTel1 = P084G10_A990ProceTel1[0] ;
         n990ProceTel1 = P084G10_n990ProceTel1[0] ;
         A989PoceCp = P084G10_A989PoceCp[0] ;
         n989PoceCp = P084G10_n989PoceCp[0] ;
         A787PrvDsc = P084G10_A787PrvDsc[0] ;
         n787PrvDsc = P084G10_n787PrvDsc[0] ;
         A781PrvCod = P084G10_A781PrvCod[0] ;
         n781PrvCod = P084G10_n781PrvCod[0] ;
         A988ProcePob = P084G10_A988ProcePob[0] ;
         n988ProcePob = P084G10_n988ProcePob[0] ;
         A994ProceDom = P084G10_A994ProceDom[0] ;
         n994ProceDom = P084G10_n994ProceDom[0] ;
         A970ProceCod = P084G10_A970ProceCod[0] ;
         A971ProceNom = P084G10_A971ProceNom[0] ;
         n971ProceNom = P084G10_n971ProceNom[0] ;
         A396EmprCod = P084G10_A396EmprCod[0] ;
         A787PrvDsc = P084G10_A787PrvDsc[0] ;
         n787PrvDsc = P084G10_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P084G10_A10390ProPers[0], A10390ProPers) == 0 ) )
         {
            brk84G18 = false ;
            A970ProceCod = P084G10_A970ProceCod[0] ;
            A396EmprCod = P084G10_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G18 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A10390ProPers)==0) )
         {
            AV40Option = A10390ProPers ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G18 )
         {
            brk84G18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADPROEMAILOPTIONS' Routine */
      returnInSub = false ;
      AV34TFProEmail = AV36SearchTxt ;
      AV35TFProEmail_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G11 */
      pr_default.execute(9, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk84G20 = false ;
         A10391ProEmail = P084G11_A10391ProEmail[0] ;
         n10391ProEmail = P084G11_n10391ProEmail[0] ;
         A14029PoceCp2 = P084G11_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G11_n14029PoceCp2[0] ;
         A993ProceNif = P084G11_A993ProceNif[0] ;
         n993ProceNif = P084G11_n993ProceNif[0] ;
         A10390ProPers = P084G11_A10390ProPers[0] ;
         n10390ProPers = P084G11_n10390ProPers[0] ;
         A992ProceTelex = P084G11_A992ProceTelex[0] ;
         n992ProceTelex = P084G11_n992ProceTelex[0] ;
         A991ProceTel2 = P084G11_A991ProceTel2[0] ;
         n991ProceTel2 = P084G11_n991ProceTel2[0] ;
         A990ProceTel1 = P084G11_A990ProceTel1[0] ;
         n990ProceTel1 = P084G11_n990ProceTel1[0] ;
         A989PoceCp = P084G11_A989PoceCp[0] ;
         n989PoceCp = P084G11_n989PoceCp[0] ;
         A787PrvDsc = P084G11_A787PrvDsc[0] ;
         n787PrvDsc = P084G11_n787PrvDsc[0] ;
         A781PrvCod = P084G11_A781PrvCod[0] ;
         n781PrvCod = P084G11_n781PrvCod[0] ;
         A988ProcePob = P084G11_A988ProcePob[0] ;
         n988ProcePob = P084G11_n988ProcePob[0] ;
         A994ProceDom = P084G11_A994ProceDom[0] ;
         n994ProceDom = P084G11_n994ProceDom[0] ;
         A970ProceCod = P084G11_A970ProceCod[0] ;
         A971ProceNom = P084G11_A971ProceNom[0] ;
         n971ProceNom = P084G11_n971ProceNom[0] ;
         A396EmprCod = P084G11_A396EmprCod[0] ;
         A787PrvDsc = P084G11_A787PrvDsc[0] ;
         n787PrvDsc = P084G11_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P084G11_A10391ProEmail[0], A10391ProEmail) == 0 ) )
         {
            brk84G20 = false ;
            A970ProceCod = P084G11_A970ProceCod[0] ;
            A396EmprCod = P084G11_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G20 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A10391ProEmail)==0) )
         {
            AV40Option = A10391ProEmail ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G20 )
         {
            brk84G20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADPROCENIFOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProceNif = AV36SearchTxt ;
      AV15TFProceNif_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G12 */
      pr_default.execute(10, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(10) != 101) )
      {
         brk84G22 = false ;
         A993ProceNif = P084G12_A993ProceNif[0] ;
         n993ProceNif = P084G12_n993ProceNif[0] ;
         A14029PoceCp2 = P084G12_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G12_n14029PoceCp2[0] ;
         A10391ProEmail = P084G12_A10391ProEmail[0] ;
         n10391ProEmail = P084G12_n10391ProEmail[0] ;
         A10390ProPers = P084G12_A10390ProPers[0] ;
         n10390ProPers = P084G12_n10390ProPers[0] ;
         A992ProceTelex = P084G12_A992ProceTelex[0] ;
         n992ProceTelex = P084G12_n992ProceTelex[0] ;
         A991ProceTel2 = P084G12_A991ProceTel2[0] ;
         n991ProceTel2 = P084G12_n991ProceTel2[0] ;
         A990ProceTel1 = P084G12_A990ProceTel1[0] ;
         n990ProceTel1 = P084G12_n990ProceTel1[0] ;
         A989PoceCp = P084G12_A989PoceCp[0] ;
         n989PoceCp = P084G12_n989PoceCp[0] ;
         A787PrvDsc = P084G12_A787PrvDsc[0] ;
         n787PrvDsc = P084G12_n787PrvDsc[0] ;
         A781PrvCod = P084G12_A781PrvCod[0] ;
         n781PrvCod = P084G12_n781PrvCod[0] ;
         A988ProcePob = P084G12_A988ProcePob[0] ;
         n988ProcePob = P084G12_n988ProcePob[0] ;
         A994ProceDom = P084G12_A994ProceDom[0] ;
         n994ProceDom = P084G12_n994ProceDom[0] ;
         A970ProceCod = P084G12_A970ProceCod[0] ;
         A971ProceNom = P084G12_A971ProceNom[0] ;
         n971ProceNom = P084G12_n971ProceNom[0] ;
         A396EmprCod = P084G12_A396EmprCod[0] ;
         A787PrvDsc = P084G12_A787PrvDsc[0] ;
         n787PrvDsc = P084G12_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P084G12_A993ProceNif[0], A993ProceNif) == 0 ) )
         {
            brk84G22 = false ;
            A970ProceCod = P084G12_A970ProceCod[0] ;
            A396EmprCod = P084G12_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G22 = true ;
            pr_default.readNext(10);
         }
         if ( ! (GXutil.strcmp("", A993ProceNif)==0) )
         {
            AV40Option = A993ProceNif ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G22 )
         {
            brk84G22 = true ;
            pr_default.readNext(10);
         }
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADPOCECP2OPTIONS' Routine */
      returnInSub = false ;
      AV74TFPoceCp2 = AV36SearchTxt ;
      AV75TFPoceCp2_Sel = "" ;
      AV80Tprocedwwds_1_filterfulltext = AV73FilterFullText ;
      AV81Tprocedwwds_2_tfprocenom = AV68TFProceNom ;
      AV82Tprocedwwds_3_tfprocenom_sel = AV69TFProceNom_Sel ;
      AV83Tprocedwwds_4_tfprocecod = AV12TFProceCod ;
      AV84Tprocedwwds_5_tfprocecod_to = AV13TFProceCod_To ;
      AV85Tprocedwwds_6_tfprocedom = AV16TFProceDom ;
      AV86Tprocedwwds_7_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV87Tprocedwwds_8_tfprocepob = AV18TFProcePob ;
      AV88Tprocedwwds_9_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV89Tprocedwwds_10_tfprvcod = AV20TFPrvCod ;
      AV90Tprocedwwds_11_tfprvcod_to = AV21TFPrvCod_To ;
      AV91Tprocedwwds_12_tfprvdsc = AV22TFPrvDsc ;
      AV92Tprocedwwds_13_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV93Tprocedwwds_14_tfpocecp = AV24TFPoceCp ;
      AV94Tprocedwwds_15_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV95Tprocedwwds_16_tfprocetel1 = AV26TFProceTel1 ;
      AV96Tprocedwwds_17_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV97Tprocedwwds_18_tfprocetel2 = AV28TFProceTel2 ;
      AV98Tprocedwwds_19_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV99Tprocedwwds_20_tfprocetelex = AV30TFProceTelex ;
      AV100Tprocedwwds_21_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV101Tprocedwwds_22_tfpropers = AV32TFProPers ;
      AV102Tprocedwwds_23_tfpropers_sel = AV33TFProPers_Sel ;
      AV103Tprocedwwds_24_tfproemail = AV34TFProEmail ;
      AV104Tprocedwwds_25_tfproemail_sel = AV35TFProEmail_Sel ;
      AV105Tprocedwwds_26_tfprocenif = AV14TFProceNif ;
      AV106Tprocedwwds_27_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV107Tprocedwwds_28_tfpocecp2 = AV74TFPoceCp2 ;
      AV108Tprocedwwds_29_tfpocecp2_sel = AV75TFPoceCp2_Sel ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           AV80Tprocedwwds_1_filterfulltext ,
                                           AV82Tprocedwwds_3_tfprocenom_sel ,
                                           AV81Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV83Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to) ,
                                           AV86Tprocedwwds_7_tfprocedom_sel ,
                                           AV85Tprocedwwds_6_tfprocedom ,
                                           AV88Tprocedwwds_9_tfprocepob_sel ,
                                           AV87Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV89Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to) ,
                                           AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           AV91Tprocedwwds_12_tfprvdsc ,
                                           AV94Tprocedwwds_15_tfpocecp_sel ,
                                           AV93Tprocedwwds_14_tfpocecp ,
                                           AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           AV95Tprocedwwds_16_tfprocetel1 ,
                                           AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           AV97Tprocedwwds_18_tfprocetel2 ,
                                           AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           AV99Tprocedwwds_20_tfprocetelex ,
                                           AV102Tprocedwwds_23_tfpropers_sel ,
                                           AV101Tprocedwwds_22_tfpropers ,
                                           AV104Tprocedwwds_25_tfproemail_sel ,
                                           AV103Tprocedwwds_24_tfproemail ,
                                           AV106Tprocedwwds_27_tfprocenif_sel ,
                                           AV105Tprocedwwds_26_tfprocenif ,
                                           AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           AV107Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV80Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Tprocedwwds_1_filterfulltext), "%", "") ;
      lV81Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV81Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV85Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV85Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV87Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV87Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV91Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV91Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV93Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV93Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV95Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV95Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV97Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV97Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV99Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV99Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV101Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV101Tprocedwwds_22_tfpropers), 40, "%") ;
      lV103Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV103Tprocedwwds_24_tfproemail), 40, "%") ;
      lV105Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV105Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV107Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV107Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor P084G13 */
      pr_default.execute(11, new Object[] {lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV80Tprocedwwds_1_filterfulltext, lV81Tprocedwwds_2_tfprocenom, AV82Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV83Tprocedwwds_4_tfprocecod), Short.valueOf(AV84Tprocedwwds_5_tfprocecod_to), lV85Tprocedwwds_6_tfprocedom, AV86Tprocedwwds_7_tfprocedom_sel, lV87Tprocedwwds_8_tfprocepob, AV88Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV89Tprocedwwds_10_tfprvcod), Short.valueOf(AV90Tprocedwwds_11_tfprvcod_to), lV91Tprocedwwds_12_tfprvdsc, AV92Tprocedwwds_13_tfprvdsc_sel, lV93Tprocedwwds_14_tfpocecp, AV94Tprocedwwds_15_tfpocecp_sel, lV95Tprocedwwds_16_tfprocetel1, AV96Tprocedwwds_17_tfprocetel1_sel, lV97Tprocedwwds_18_tfprocetel2, AV98Tprocedwwds_19_tfprocetel2_sel, lV99Tprocedwwds_20_tfprocetelex, AV100Tprocedwwds_21_tfprocetelex_sel, lV101Tprocedwwds_22_tfpropers, AV102Tprocedwwds_23_tfpropers_sel, lV103Tprocedwwds_24_tfproemail, AV104Tprocedwwds_25_tfproemail_sel, lV105Tprocedwwds_26_tfprocenif, AV106Tprocedwwds_27_tfprocenif_sel, lV107Tprocedwwds_28_tfpocecp2, AV108Tprocedwwds_29_tfpocecp2_sel});
      while ( (pr_default.getStatus(11) != 101) )
      {
         brk84G24 = false ;
         A14029PoceCp2 = P084G13_A14029PoceCp2[0] ;
         n14029PoceCp2 = P084G13_n14029PoceCp2[0] ;
         A993ProceNif = P084G13_A993ProceNif[0] ;
         n993ProceNif = P084G13_n993ProceNif[0] ;
         A10391ProEmail = P084G13_A10391ProEmail[0] ;
         n10391ProEmail = P084G13_n10391ProEmail[0] ;
         A10390ProPers = P084G13_A10390ProPers[0] ;
         n10390ProPers = P084G13_n10390ProPers[0] ;
         A992ProceTelex = P084G13_A992ProceTelex[0] ;
         n992ProceTelex = P084G13_n992ProceTelex[0] ;
         A991ProceTel2 = P084G13_A991ProceTel2[0] ;
         n991ProceTel2 = P084G13_n991ProceTel2[0] ;
         A990ProceTel1 = P084G13_A990ProceTel1[0] ;
         n990ProceTel1 = P084G13_n990ProceTel1[0] ;
         A989PoceCp = P084G13_A989PoceCp[0] ;
         n989PoceCp = P084G13_n989PoceCp[0] ;
         A787PrvDsc = P084G13_A787PrvDsc[0] ;
         n787PrvDsc = P084G13_n787PrvDsc[0] ;
         A781PrvCod = P084G13_A781PrvCod[0] ;
         n781PrvCod = P084G13_n781PrvCod[0] ;
         A988ProcePob = P084G13_A988ProcePob[0] ;
         n988ProcePob = P084G13_n988ProcePob[0] ;
         A994ProceDom = P084G13_A994ProceDom[0] ;
         n994ProceDom = P084G13_n994ProceDom[0] ;
         A970ProceCod = P084G13_A970ProceCod[0] ;
         A971ProceNom = P084G13_A971ProceNom[0] ;
         n971ProceNom = P084G13_n971ProceNom[0] ;
         A396EmprCod = P084G13_A396EmprCod[0] ;
         A787PrvDsc = P084G13_A787PrvDsc[0] ;
         n787PrvDsc = P084G13_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(P084G13_A14029PoceCp2[0], A14029PoceCp2) == 0 ) )
         {
            brk84G24 = false ;
            A970ProceCod = P084G13_A970ProceCod[0] ;
            A396EmprCod = P084G13_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk84G24 = true ;
            pr_default.readNext(11);
         }
         if ( ! (GXutil.strcmp("", A14029PoceCp2)==0) )
         {
            AV40Option = A14029PoceCp2 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk84G24 )
         {
            brk84G24 = true ;
            pr_default.readNext(11);
         }
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprocedwwgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = tprocedwwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = tprocedwwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV73FilterFullText = "" ;
      AV68TFProceNom = "" ;
      AV69TFProceNom_Sel = "" ;
      AV16TFProceDom = "" ;
      AV17TFProceDom_Sel = "" ;
      AV18TFProcePob = "" ;
      AV19TFProcePob_Sel = "" ;
      AV22TFPrvDsc = "" ;
      AV23TFPrvDsc_Sel = "" ;
      AV24TFPoceCp = "" ;
      AV25TFPoceCp_Sel = "" ;
      AV26TFProceTel1 = "" ;
      AV27TFProceTel1_Sel = "" ;
      AV28TFProceTel2 = "" ;
      AV29TFProceTel2_Sel = "" ;
      AV30TFProceTelex = "" ;
      AV31TFProceTelex_Sel = "" ;
      AV32TFProPers = "" ;
      AV33TFProPers_Sel = "" ;
      AV34TFProEmail = "" ;
      AV35TFProEmail_Sel = "" ;
      AV14TFProceNif = "" ;
      AV15TFProceNif_Sel = "" ;
      AV74TFPoceCp2 = "" ;
      AV75TFPoceCp2_Sel = "" ;
      A971ProceNom = "" ;
      AV80Tprocedwwds_1_filterfulltext = "" ;
      AV81Tprocedwwds_2_tfprocenom = "" ;
      AV82Tprocedwwds_3_tfprocenom_sel = "" ;
      AV85Tprocedwwds_6_tfprocedom = "" ;
      AV86Tprocedwwds_7_tfprocedom_sel = "" ;
      AV87Tprocedwwds_8_tfprocepob = "" ;
      AV88Tprocedwwds_9_tfprocepob_sel = "" ;
      AV91Tprocedwwds_12_tfprvdsc = "" ;
      AV92Tprocedwwds_13_tfprvdsc_sel = "" ;
      AV93Tprocedwwds_14_tfpocecp = "" ;
      AV94Tprocedwwds_15_tfpocecp_sel = "" ;
      AV95Tprocedwwds_16_tfprocetel1 = "" ;
      AV96Tprocedwwds_17_tfprocetel1_sel = "" ;
      AV97Tprocedwwds_18_tfprocetel2 = "" ;
      AV98Tprocedwwds_19_tfprocetel2_sel = "" ;
      AV99Tprocedwwds_20_tfprocetelex = "" ;
      AV100Tprocedwwds_21_tfprocetelex_sel = "" ;
      AV101Tprocedwwds_22_tfpropers = "" ;
      AV102Tprocedwwds_23_tfpropers_sel = "" ;
      AV103Tprocedwwds_24_tfproemail = "" ;
      AV104Tprocedwwds_25_tfproemail_sel = "" ;
      AV105Tprocedwwds_26_tfprocenif = "" ;
      AV106Tprocedwwds_27_tfprocenif_sel = "" ;
      AV107Tprocedwwds_28_tfpocecp2 = "" ;
      AV108Tprocedwwds_29_tfpocecp2_sel = "" ;
      scmdbuf = "" ;
      lV80Tprocedwwds_1_filterfulltext = "" ;
      lV81Tprocedwwds_2_tfprocenom = "" ;
      lV85Tprocedwwds_6_tfprocedom = "" ;
      lV87Tprocedwwds_8_tfprocepob = "" ;
      lV91Tprocedwwds_12_tfprvdsc = "" ;
      lV93Tprocedwwds_14_tfpocecp = "" ;
      lV95Tprocedwwds_16_tfprocetel1 = "" ;
      lV97Tprocedwwds_18_tfprocetel2 = "" ;
      lV99Tprocedwwds_20_tfprocetelex = "" ;
      lV101Tprocedwwds_22_tfpropers = "" ;
      lV103Tprocedwwds_24_tfproemail = "" ;
      lV105Tprocedwwds_26_tfprocenif = "" ;
      lV107Tprocedwwds_28_tfpocecp2 = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      A993ProceNif = "" ;
      A14029PoceCp2 = "" ;
      P084G2_A971ProceNom = new String[] {""} ;
      P084G2_n971ProceNom = new boolean[] {false} ;
      P084G2_A14029PoceCp2 = new String[] {""} ;
      P084G2_n14029PoceCp2 = new boolean[] {false} ;
      P084G2_A993ProceNif = new String[] {""} ;
      P084G2_n993ProceNif = new boolean[] {false} ;
      P084G2_A10391ProEmail = new String[] {""} ;
      P084G2_n10391ProEmail = new boolean[] {false} ;
      P084G2_A10390ProPers = new String[] {""} ;
      P084G2_n10390ProPers = new boolean[] {false} ;
      P084G2_A992ProceTelex = new String[] {""} ;
      P084G2_n992ProceTelex = new boolean[] {false} ;
      P084G2_A991ProceTel2 = new String[] {""} ;
      P084G2_n991ProceTel2 = new boolean[] {false} ;
      P084G2_A990ProceTel1 = new String[] {""} ;
      P084G2_n990ProceTel1 = new boolean[] {false} ;
      P084G2_A989PoceCp = new String[] {""} ;
      P084G2_n989PoceCp = new boolean[] {false} ;
      P084G2_A787PrvDsc = new String[] {""} ;
      P084G2_n787PrvDsc = new boolean[] {false} ;
      P084G2_A781PrvCod = new short[1] ;
      P084G2_n781PrvCod = new boolean[] {false} ;
      P084G2_A988ProcePob = new String[] {""} ;
      P084G2_n988ProcePob = new boolean[] {false} ;
      P084G2_A994ProceDom = new String[] {""} ;
      P084G2_n994ProceDom = new boolean[] {false} ;
      P084G2_A970ProceCod = new short[1] ;
      P084G2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV40Option = "" ;
      P084G3_A994ProceDom = new String[] {""} ;
      P084G3_n994ProceDom = new boolean[] {false} ;
      P084G3_A14029PoceCp2 = new String[] {""} ;
      P084G3_n14029PoceCp2 = new boolean[] {false} ;
      P084G3_A993ProceNif = new String[] {""} ;
      P084G3_n993ProceNif = new boolean[] {false} ;
      P084G3_A10391ProEmail = new String[] {""} ;
      P084G3_n10391ProEmail = new boolean[] {false} ;
      P084G3_A10390ProPers = new String[] {""} ;
      P084G3_n10390ProPers = new boolean[] {false} ;
      P084G3_A992ProceTelex = new String[] {""} ;
      P084G3_n992ProceTelex = new boolean[] {false} ;
      P084G3_A991ProceTel2 = new String[] {""} ;
      P084G3_n991ProceTel2 = new boolean[] {false} ;
      P084G3_A990ProceTel1 = new String[] {""} ;
      P084G3_n990ProceTel1 = new boolean[] {false} ;
      P084G3_A989PoceCp = new String[] {""} ;
      P084G3_n989PoceCp = new boolean[] {false} ;
      P084G3_A787PrvDsc = new String[] {""} ;
      P084G3_n787PrvDsc = new boolean[] {false} ;
      P084G3_A781PrvCod = new short[1] ;
      P084G3_n781PrvCod = new boolean[] {false} ;
      P084G3_A988ProcePob = new String[] {""} ;
      P084G3_n988ProcePob = new boolean[] {false} ;
      P084G3_A970ProceCod = new short[1] ;
      P084G3_A971ProceNom = new String[] {""} ;
      P084G3_n971ProceNom = new boolean[] {false} ;
      P084G3_A396EmprCod = new String[] {""} ;
      P084G4_A988ProcePob = new String[] {""} ;
      P084G4_n988ProcePob = new boolean[] {false} ;
      P084G4_A14029PoceCp2 = new String[] {""} ;
      P084G4_n14029PoceCp2 = new boolean[] {false} ;
      P084G4_A993ProceNif = new String[] {""} ;
      P084G4_n993ProceNif = new boolean[] {false} ;
      P084G4_A10391ProEmail = new String[] {""} ;
      P084G4_n10391ProEmail = new boolean[] {false} ;
      P084G4_A10390ProPers = new String[] {""} ;
      P084G4_n10390ProPers = new boolean[] {false} ;
      P084G4_A992ProceTelex = new String[] {""} ;
      P084G4_n992ProceTelex = new boolean[] {false} ;
      P084G4_A991ProceTel2 = new String[] {""} ;
      P084G4_n991ProceTel2 = new boolean[] {false} ;
      P084G4_A990ProceTel1 = new String[] {""} ;
      P084G4_n990ProceTel1 = new boolean[] {false} ;
      P084G4_A989PoceCp = new String[] {""} ;
      P084G4_n989PoceCp = new boolean[] {false} ;
      P084G4_A787PrvDsc = new String[] {""} ;
      P084G4_n787PrvDsc = new boolean[] {false} ;
      P084G4_A781PrvCod = new short[1] ;
      P084G4_n781PrvCod = new boolean[] {false} ;
      P084G4_A994ProceDom = new String[] {""} ;
      P084G4_n994ProceDom = new boolean[] {false} ;
      P084G4_A970ProceCod = new short[1] ;
      P084G4_A971ProceNom = new String[] {""} ;
      P084G4_n971ProceNom = new boolean[] {false} ;
      P084G4_A396EmprCod = new String[] {""} ;
      P084G5_A781PrvCod = new short[1] ;
      P084G5_n781PrvCod = new boolean[] {false} ;
      P084G5_A14029PoceCp2 = new String[] {""} ;
      P084G5_n14029PoceCp2 = new boolean[] {false} ;
      P084G5_A993ProceNif = new String[] {""} ;
      P084G5_n993ProceNif = new boolean[] {false} ;
      P084G5_A10391ProEmail = new String[] {""} ;
      P084G5_n10391ProEmail = new boolean[] {false} ;
      P084G5_A10390ProPers = new String[] {""} ;
      P084G5_n10390ProPers = new boolean[] {false} ;
      P084G5_A992ProceTelex = new String[] {""} ;
      P084G5_n992ProceTelex = new boolean[] {false} ;
      P084G5_A991ProceTel2 = new String[] {""} ;
      P084G5_n991ProceTel2 = new boolean[] {false} ;
      P084G5_A990ProceTel1 = new String[] {""} ;
      P084G5_n990ProceTel1 = new boolean[] {false} ;
      P084G5_A989PoceCp = new String[] {""} ;
      P084G5_n989PoceCp = new boolean[] {false} ;
      P084G5_A787PrvDsc = new String[] {""} ;
      P084G5_n787PrvDsc = new boolean[] {false} ;
      P084G5_A988ProcePob = new String[] {""} ;
      P084G5_n988ProcePob = new boolean[] {false} ;
      P084G5_A994ProceDom = new String[] {""} ;
      P084G5_n994ProceDom = new boolean[] {false} ;
      P084G5_A970ProceCod = new short[1] ;
      P084G5_A971ProceNom = new String[] {""} ;
      P084G5_n971ProceNom = new boolean[] {false} ;
      P084G5_A396EmprCod = new String[] {""} ;
      AV43OptionDesc = "" ;
      P084G6_A989PoceCp = new String[] {""} ;
      P084G6_n989PoceCp = new boolean[] {false} ;
      P084G6_A14029PoceCp2 = new String[] {""} ;
      P084G6_n14029PoceCp2 = new boolean[] {false} ;
      P084G6_A993ProceNif = new String[] {""} ;
      P084G6_n993ProceNif = new boolean[] {false} ;
      P084G6_A10391ProEmail = new String[] {""} ;
      P084G6_n10391ProEmail = new boolean[] {false} ;
      P084G6_A10390ProPers = new String[] {""} ;
      P084G6_n10390ProPers = new boolean[] {false} ;
      P084G6_A992ProceTelex = new String[] {""} ;
      P084G6_n992ProceTelex = new boolean[] {false} ;
      P084G6_A991ProceTel2 = new String[] {""} ;
      P084G6_n991ProceTel2 = new boolean[] {false} ;
      P084G6_A990ProceTel1 = new String[] {""} ;
      P084G6_n990ProceTel1 = new boolean[] {false} ;
      P084G6_A787PrvDsc = new String[] {""} ;
      P084G6_n787PrvDsc = new boolean[] {false} ;
      P084G6_A781PrvCod = new short[1] ;
      P084G6_n781PrvCod = new boolean[] {false} ;
      P084G6_A988ProcePob = new String[] {""} ;
      P084G6_n988ProcePob = new boolean[] {false} ;
      P084G6_A994ProceDom = new String[] {""} ;
      P084G6_n994ProceDom = new boolean[] {false} ;
      P084G6_A970ProceCod = new short[1] ;
      P084G6_A971ProceNom = new String[] {""} ;
      P084G6_n971ProceNom = new boolean[] {false} ;
      P084G6_A396EmprCod = new String[] {""} ;
      P084G7_A990ProceTel1 = new String[] {""} ;
      P084G7_n990ProceTel1 = new boolean[] {false} ;
      P084G7_A14029PoceCp2 = new String[] {""} ;
      P084G7_n14029PoceCp2 = new boolean[] {false} ;
      P084G7_A993ProceNif = new String[] {""} ;
      P084G7_n993ProceNif = new boolean[] {false} ;
      P084G7_A10391ProEmail = new String[] {""} ;
      P084G7_n10391ProEmail = new boolean[] {false} ;
      P084G7_A10390ProPers = new String[] {""} ;
      P084G7_n10390ProPers = new boolean[] {false} ;
      P084G7_A992ProceTelex = new String[] {""} ;
      P084G7_n992ProceTelex = new boolean[] {false} ;
      P084G7_A991ProceTel2 = new String[] {""} ;
      P084G7_n991ProceTel2 = new boolean[] {false} ;
      P084G7_A989PoceCp = new String[] {""} ;
      P084G7_n989PoceCp = new boolean[] {false} ;
      P084G7_A787PrvDsc = new String[] {""} ;
      P084G7_n787PrvDsc = new boolean[] {false} ;
      P084G7_A781PrvCod = new short[1] ;
      P084G7_n781PrvCod = new boolean[] {false} ;
      P084G7_A988ProcePob = new String[] {""} ;
      P084G7_n988ProcePob = new boolean[] {false} ;
      P084G7_A994ProceDom = new String[] {""} ;
      P084G7_n994ProceDom = new boolean[] {false} ;
      P084G7_A970ProceCod = new short[1] ;
      P084G7_A971ProceNom = new String[] {""} ;
      P084G7_n971ProceNom = new boolean[] {false} ;
      P084G7_A396EmprCod = new String[] {""} ;
      P084G8_A991ProceTel2 = new String[] {""} ;
      P084G8_n991ProceTel2 = new boolean[] {false} ;
      P084G8_A14029PoceCp2 = new String[] {""} ;
      P084G8_n14029PoceCp2 = new boolean[] {false} ;
      P084G8_A993ProceNif = new String[] {""} ;
      P084G8_n993ProceNif = new boolean[] {false} ;
      P084G8_A10391ProEmail = new String[] {""} ;
      P084G8_n10391ProEmail = new boolean[] {false} ;
      P084G8_A10390ProPers = new String[] {""} ;
      P084G8_n10390ProPers = new boolean[] {false} ;
      P084G8_A992ProceTelex = new String[] {""} ;
      P084G8_n992ProceTelex = new boolean[] {false} ;
      P084G8_A990ProceTel1 = new String[] {""} ;
      P084G8_n990ProceTel1 = new boolean[] {false} ;
      P084G8_A989PoceCp = new String[] {""} ;
      P084G8_n989PoceCp = new boolean[] {false} ;
      P084G8_A787PrvDsc = new String[] {""} ;
      P084G8_n787PrvDsc = new boolean[] {false} ;
      P084G8_A781PrvCod = new short[1] ;
      P084G8_n781PrvCod = new boolean[] {false} ;
      P084G8_A988ProcePob = new String[] {""} ;
      P084G8_n988ProcePob = new boolean[] {false} ;
      P084G8_A994ProceDom = new String[] {""} ;
      P084G8_n994ProceDom = new boolean[] {false} ;
      P084G8_A970ProceCod = new short[1] ;
      P084G8_A971ProceNom = new String[] {""} ;
      P084G8_n971ProceNom = new boolean[] {false} ;
      P084G8_A396EmprCod = new String[] {""} ;
      P084G9_A992ProceTelex = new String[] {""} ;
      P084G9_n992ProceTelex = new boolean[] {false} ;
      P084G9_A14029PoceCp2 = new String[] {""} ;
      P084G9_n14029PoceCp2 = new boolean[] {false} ;
      P084G9_A993ProceNif = new String[] {""} ;
      P084G9_n993ProceNif = new boolean[] {false} ;
      P084G9_A10391ProEmail = new String[] {""} ;
      P084G9_n10391ProEmail = new boolean[] {false} ;
      P084G9_A10390ProPers = new String[] {""} ;
      P084G9_n10390ProPers = new boolean[] {false} ;
      P084G9_A991ProceTel2 = new String[] {""} ;
      P084G9_n991ProceTel2 = new boolean[] {false} ;
      P084G9_A990ProceTel1 = new String[] {""} ;
      P084G9_n990ProceTel1 = new boolean[] {false} ;
      P084G9_A989PoceCp = new String[] {""} ;
      P084G9_n989PoceCp = new boolean[] {false} ;
      P084G9_A787PrvDsc = new String[] {""} ;
      P084G9_n787PrvDsc = new boolean[] {false} ;
      P084G9_A781PrvCod = new short[1] ;
      P084G9_n781PrvCod = new boolean[] {false} ;
      P084G9_A988ProcePob = new String[] {""} ;
      P084G9_n988ProcePob = new boolean[] {false} ;
      P084G9_A994ProceDom = new String[] {""} ;
      P084G9_n994ProceDom = new boolean[] {false} ;
      P084G9_A970ProceCod = new short[1] ;
      P084G9_A971ProceNom = new String[] {""} ;
      P084G9_n971ProceNom = new boolean[] {false} ;
      P084G9_A396EmprCod = new String[] {""} ;
      P084G10_A10390ProPers = new String[] {""} ;
      P084G10_n10390ProPers = new boolean[] {false} ;
      P084G10_A14029PoceCp2 = new String[] {""} ;
      P084G10_n14029PoceCp2 = new boolean[] {false} ;
      P084G10_A993ProceNif = new String[] {""} ;
      P084G10_n993ProceNif = new boolean[] {false} ;
      P084G10_A10391ProEmail = new String[] {""} ;
      P084G10_n10391ProEmail = new boolean[] {false} ;
      P084G10_A992ProceTelex = new String[] {""} ;
      P084G10_n992ProceTelex = new boolean[] {false} ;
      P084G10_A991ProceTel2 = new String[] {""} ;
      P084G10_n991ProceTel2 = new boolean[] {false} ;
      P084G10_A990ProceTel1 = new String[] {""} ;
      P084G10_n990ProceTel1 = new boolean[] {false} ;
      P084G10_A989PoceCp = new String[] {""} ;
      P084G10_n989PoceCp = new boolean[] {false} ;
      P084G10_A787PrvDsc = new String[] {""} ;
      P084G10_n787PrvDsc = new boolean[] {false} ;
      P084G10_A781PrvCod = new short[1] ;
      P084G10_n781PrvCod = new boolean[] {false} ;
      P084G10_A988ProcePob = new String[] {""} ;
      P084G10_n988ProcePob = new boolean[] {false} ;
      P084G10_A994ProceDom = new String[] {""} ;
      P084G10_n994ProceDom = new boolean[] {false} ;
      P084G10_A970ProceCod = new short[1] ;
      P084G10_A971ProceNom = new String[] {""} ;
      P084G10_n971ProceNom = new boolean[] {false} ;
      P084G10_A396EmprCod = new String[] {""} ;
      P084G11_A10391ProEmail = new String[] {""} ;
      P084G11_n10391ProEmail = new boolean[] {false} ;
      P084G11_A14029PoceCp2 = new String[] {""} ;
      P084G11_n14029PoceCp2 = new boolean[] {false} ;
      P084G11_A993ProceNif = new String[] {""} ;
      P084G11_n993ProceNif = new boolean[] {false} ;
      P084G11_A10390ProPers = new String[] {""} ;
      P084G11_n10390ProPers = new boolean[] {false} ;
      P084G11_A992ProceTelex = new String[] {""} ;
      P084G11_n992ProceTelex = new boolean[] {false} ;
      P084G11_A991ProceTel2 = new String[] {""} ;
      P084G11_n991ProceTel2 = new boolean[] {false} ;
      P084G11_A990ProceTel1 = new String[] {""} ;
      P084G11_n990ProceTel1 = new boolean[] {false} ;
      P084G11_A989PoceCp = new String[] {""} ;
      P084G11_n989PoceCp = new boolean[] {false} ;
      P084G11_A787PrvDsc = new String[] {""} ;
      P084G11_n787PrvDsc = new boolean[] {false} ;
      P084G11_A781PrvCod = new short[1] ;
      P084G11_n781PrvCod = new boolean[] {false} ;
      P084G11_A988ProcePob = new String[] {""} ;
      P084G11_n988ProcePob = new boolean[] {false} ;
      P084G11_A994ProceDom = new String[] {""} ;
      P084G11_n994ProceDom = new boolean[] {false} ;
      P084G11_A970ProceCod = new short[1] ;
      P084G11_A971ProceNom = new String[] {""} ;
      P084G11_n971ProceNom = new boolean[] {false} ;
      P084G11_A396EmprCod = new String[] {""} ;
      P084G12_A993ProceNif = new String[] {""} ;
      P084G12_n993ProceNif = new boolean[] {false} ;
      P084G12_A14029PoceCp2 = new String[] {""} ;
      P084G12_n14029PoceCp2 = new boolean[] {false} ;
      P084G12_A10391ProEmail = new String[] {""} ;
      P084G12_n10391ProEmail = new boolean[] {false} ;
      P084G12_A10390ProPers = new String[] {""} ;
      P084G12_n10390ProPers = new boolean[] {false} ;
      P084G12_A992ProceTelex = new String[] {""} ;
      P084G12_n992ProceTelex = new boolean[] {false} ;
      P084G12_A991ProceTel2 = new String[] {""} ;
      P084G12_n991ProceTel2 = new boolean[] {false} ;
      P084G12_A990ProceTel1 = new String[] {""} ;
      P084G12_n990ProceTel1 = new boolean[] {false} ;
      P084G12_A989PoceCp = new String[] {""} ;
      P084G12_n989PoceCp = new boolean[] {false} ;
      P084G12_A787PrvDsc = new String[] {""} ;
      P084G12_n787PrvDsc = new boolean[] {false} ;
      P084G12_A781PrvCod = new short[1] ;
      P084G12_n781PrvCod = new boolean[] {false} ;
      P084G12_A988ProcePob = new String[] {""} ;
      P084G12_n988ProcePob = new boolean[] {false} ;
      P084G12_A994ProceDom = new String[] {""} ;
      P084G12_n994ProceDom = new boolean[] {false} ;
      P084G12_A970ProceCod = new short[1] ;
      P084G12_A971ProceNom = new String[] {""} ;
      P084G12_n971ProceNom = new boolean[] {false} ;
      P084G12_A396EmprCod = new String[] {""} ;
      P084G13_A14029PoceCp2 = new String[] {""} ;
      P084G13_n14029PoceCp2 = new boolean[] {false} ;
      P084G13_A993ProceNif = new String[] {""} ;
      P084G13_n993ProceNif = new boolean[] {false} ;
      P084G13_A10391ProEmail = new String[] {""} ;
      P084G13_n10391ProEmail = new boolean[] {false} ;
      P084G13_A10390ProPers = new String[] {""} ;
      P084G13_n10390ProPers = new boolean[] {false} ;
      P084G13_A992ProceTelex = new String[] {""} ;
      P084G13_n992ProceTelex = new boolean[] {false} ;
      P084G13_A991ProceTel2 = new String[] {""} ;
      P084G13_n991ProceTel2 = new boolean[] {false} ;
      P084G13_A990ProceTel1 = new String[] {""} ;
      P084G13_n990ProceTel1 = new boolean[] {false} ;
      P084G13_A989PoceCp = new String[] {""} ;
      P084G13_n989PoceCp = new boolean[] {false} ;
      P084G13_A787PrvDsc = new String[] {""} ;
      P084G13_n787PrvDsc = new boolean[] {false} ;
      P084G13_A781PrvCod = new short[1] ;
      P084G13_n781PrvCod = new boolean[] {false} ;
      P084G13_A988ProcePob = new String[] {""} ;
      P084G13_n988ProcePob = new boolean[] {false} ;
      P084G13_A994ProceDom = new String[] {""} ;
      P084G13_n994ProceDom = new boolean[] {false} ;
      P084G13_A970ProceCod = new short[1] ;
      P084G13_A971ProceNom = new String[] {""} ;
      P084G13_n971ProceNom = new boolean[] {false} ;
      P084G13_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprocedwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P084G2_A971ProceNom, P084G2_n971ProceNom, P084G2_A14029PoceCp2, P084G2_n14029PoceCp2, P084G2_A993ProceNif, P084G2_n993ProceNif, P084G2_A10391ProEmail, P084G2_n10391ProEmail, P084G2_A10390ProPers, P084G2_n10390ProPers,
            P084G2_A992ProceTelex, P084G2_n992ProceTelex, P084G2_A991ProceTel2, P084G2_n991ProceTel2, P084G2_A990ProceTel1, P084G2_n990ProceTel1, P084G2_A989PoceCp, P084G2_n989PoceCp, P084G2_A787PrvDsc, P084G2_n787PrvDsc,
            P084G2_A781PrvCod, P084G2_n781PrvCod, P084G2_A988ProcePob, P084G2_n988ProcePob, P084G2_A994ProceDom, P084G2_n994ProceDom, P084G2_A970ProceCod, P084G2_A396EmprCod
            }
            , new Object[] {
            P084G3_A994ProceDom, P084G3_n994ProceDom, P084G3_A14029PoceCp2, P084G3_n14029PoceCp2, P084G3_A993ProceNif, P084G3_n993ProceNif, P084G3_A10391ProEmail, P084G3_n10391ProEmail, P084G3_A10390ProPers, P084G3_n10390ProPers,
            P084G3_A992ProceTelex, P084G3_n992ProceTelex, P084G3_A991ProceTel2, P084G3_n991ProceTel2, P084G3_A990ProceTel1, P084G3_n990ProceTel1, P084G3_A989PoceCp, P084G3_n989PoceCp, P084G3_A787PrvDsc, P084G3_n787PrvDsc,
            P084G3_A781PrvCod, P084G3_n781PrvCod, P084G3_A988ProcePob, P084G3_n988ProcePob, P084G3_A970ProceCod, P084G3_A971ProceNom, P084G3_n971ProceNom, P084G3_A396EmprCod
            }
            , new Object[] {
            P084G4_A988ProcePob, P084G4_n988ProcePob, P084G4_A14029PoceCp2, P084G4_n14029PoceCp2, P084G4_A993ProceNif, P084G4_n993ProceNif, P084G4_A10391ProEmail, P084G4_n10391ProEmail, P084G4_A10390ProPers, P084G4_n10390ProPers,
            P084G4_A992ProceTelex, P084G4_n992ProceTelex, P084G4_A991ProceTel2, P084G4_n991ProceTel2, P084G4_A990ProceTel1, P084G4_n990ProceTel1, P084G4_A989PoceCp, P084G4_n989PoceCp, P084G4_A787PrvDsc, P084G4_n787PrvDsc,
            P084G4_A781PrvCod, P084G4_n781PrvCod, P084G4_A994ProceDom, P084G4_n994ProceDom, P084G4_A970ProceCod, P084G4_A971ProceNom, P084G4_n971ProceNom, P084G4_A396EmprCod
            }
            , new Object[] {
            P084G5_A781PrvCod, P084G5_n781PrvCod, P084G5_A14029PoceCp2, P084G5_n14029PoceCp2, P084G5_A993ProceNif, P084G5_n993ProceNif, P084G5_A10391ProEmail, P084G5_n10391ProEmail, P084G5_A10390ProPers, P084G5_n10390ProPers,
            P084G5_A992ProceTelex, P084G5_n992ProceTelex, P084G5_A991ProceTel2, P084G5_n991ProceTel2, P084G5_A990ProceTel1, P084G5_n990ProceTel1, P084G5_A989PoceCp, P084G5_n989PoceCp, P084G5_A787PrvDsc, P084G5_n787PrvDsc,
            P084G5_A988ProcePob, P084G5_n988ProcePob, P084G5_A994ProceDom, P084G5_n994ProceDom, P084G5_A970ProceCod, P084G5_A971ProceNom, P084G5_n971ProceNom, P084G5_A396EmprCod
            }
            , new Object[] {
            P084G6_A989PoceCp, P084G6_n989PoceCp, P084G6_A14029PoceCp2, P084G6_n14029PoceCp2, P084G6_A993ProceNif, P084G6_n993ProceNif, P084G6_A10391ProEmail, P084G6_n10391ProEmail, P084G6_A10390ProPers, P084G6_n10390ProPers,
            P084G6_A992ProceTelex, P084G6_n992ProceTelex, P084G6_A991ProceTel2, P084G6_n991ProceTel2, P084G6_A990ProceTel1, P084G6_n990ProceTel1, P084G6_A787PrvDsc, P084G6_n787PrvDsc, P084G6_A781PrvCod, P084G6_n781PrvCod,
            P084G6_A988ProcePob, P084G6_n988ProcePob, P084G6_A994ProceDom, P084G6_n994ProceDom, P084G6_A970ProceCod, P084G6_A971ProceNom, P084G6_n971ProceNom, P084G6_A396EmprCod
            }
            , new Object[] {
            P084G7_A990ProceTel1, P084G7_n990ProceTel1, P084G7_A14029PoceCp2, P084G7_n14029PoceCp2, P084G7_A993ProceNif, P084G7_n993ProceNif, P084G7_A10391ProEmail, P084G7_n10391ProEmail, P084G7_A10390ProPers, P084G7_n10390ProPers,
            P084G7_A992ProceTelex, P084G7_n992ProceTelex, P084G7_A991ProceTel2, P084G7_n991ProceTel2, P084G7_A989PoceCp, P084G7_n989PoceCp, P084G7_A787PrvDsc, P084G7_n787PrvDsc, P084G7_A781PrvCod, P084G7_n781PrvCod,
            P084G7_A988ProcePob, P084G7_n988ProcePob, P084G7_A994ProceDom, P084G7_n994ProceDom, P084G7_A970ProceCod, P084G7_A971ProceNom, P084G7_n971ProceNom, P084G7_A396EmprCod
            }
            , new Object[] {
            P084G8_A991ProceTel2, P084G8_n991ProceTel2, P084G8_A14029PoceCp2, P084G8_n14029PoceCp2, P084G8_A993ProceNif, P084G8_n993ProceNif, P084G8_A10391ProEmail, P084G8_n10391ProEmail, P084G8_A10390ProPers, P084G8_n10390ProPers,
            P084G8_A992ProceTelex, P084G8_n992ProceTelex, P084G8_A990ProceTel1, P084G8_n990ProceTel1, P084G8_A989PoceCp, P084G8_n989PoceCp, P084G8_A787PrvDsc, P084G8_n787PrvDsc, P084G8_A781PrvCod, P084G8_n781PrvCod,
            P084G8_A988ProcePob, P084G8_n988ProcePob, P084G8_A994ProceDom, P084G8_n994ProceDom, P084G8_A970ProceCod, P084G8_A971ProceNom, P084G8_n971ProceNom, P084G8_A396EmprCod
            }
            , new Object[] {
            P084G9_A992ProceTelex, P084G9_n992ProceTelex, P084G9_A14029PoceCp2, P084G9_n14029PoceCp2, P084G9_A993ProceNif, P084G9_n993ProceNif, P084G9_A10391ProEmail, P084G9_n10391ProEmail, P084G9_A10390ProPers, P084G9_n10390ProPers,
            P084G9_A991ProceTel2, P084G9_n991ProceTel2, P084G9_A990ProceTel1, P084G9_n990ProceTel1, P084G9_A989PoceCp, P084G9_n989PoceCp, P084G9_A787PrvDsc, P084G9_n787PrvDsc, P084G9_A781PrvCod, P084G9_n781PrvCod,
            P084G9_A988ProcePob, P084G9_n988ProcePob, P084G9_A994ProceDom, P084G9_n994ProceDom, P084G9_A970ProceCod, P084G9_A971ProceNom, P084G9_n971ProceNom, P084G9_A396EmprCod
            }
            , new Object[] {
            P084G10_A10390ProPers, P084G10_n10390ProPers, P084G10_A14029PoceCp2, P084G10_n14029PoceCp2, P084G10_A993ProceNif, P084G10_n993ProceNif, P084G10_A10391ProEmail, P084G10_n10391ProEmail, P084G10_A992ProceTelex, P084G10_n992ProceTelex,
            P084G10_A991ProceTel2, P084G10_n991ProceTel2, P084G10_A990ProceTel1, P084G10_n990ProceTel1, P084G10_A989PoceCp, P084G10_n989PoceCp, P084G10_A787PrvDsc, P084G10_n787PrvDsc, P084G10_A781PrvCod, P084G10_n781PrvCod,
            P084G10_A988ProcePob, P084G10_n988ProcePob, P084G10_A994ProceDom, P084G10_n994ProceDom, P084G10_A970ProceCod, P084G10_A971ProceNom, P084G10_n971ProceNom, P084G10_A396EmprCod
            }
            , new Object[] {
            P084G11_A10391ProEmail, P084G11_n10391ProEmail, P084G11_A14029PoceCp2, P084G11_n14029PoceCp2, P084G11_A993ProceNif, P084G11_n993ProceNif, P084G11_A10390ProPers, P084G11_n10390ProPers, P084G11_A992ProceTelex, P084G11_n992ProceTelex,
            P084G11_A991ProceTel2, P084G11_n991ProceTel2, P084G11_A990ProceTel1, P084G11_n990ProceTel1, P084G11_A989PoceCp, P084G11_n989PoceCp, P084G11_A787PrvDsc, P084G11_n787PrvDsc, P084G11_A781PrvCod, P084G11_n781PrvCod,
            P084G11_A988ProcePob, P084G11_n988ProcePob, P084G11_A994ProceDom, P084G11_n994ProceDom, P084G11_A970ProceCod, P084G11_A971ProceNom, P084G11_n971ProceNom, P084G11_A396EmprCod
            }
            , new Object[] {
            P084G12_A993ProceNif, P084G12_n993ProceNif, P084G12_A14029PoceCp2, P084G12_n14029PoceCp2, P084G12_A10391ProEmail, P084G12_n10391ProEmail, P084G12_A10390ProPers, P084G12_n10390ProPers, P084G12_A992ProceTelex, P084G12_n992ProceTelex,
            P084G12_A991ProceTel2, P084G12_n991ProceTel2, P084G12_A990ProceTel1, P084G12_n990ProceTel1, P084G12_A989PoceCp, P084G12_n989PoceCp, P084G12_A787PrvDsc, P084G12_n787PrvDsc, P084G12_A781PrvCod, P084G12_n781PrvCod,
            P084G12_A988ProcePob, P084G12_n988ProcePob, P084G12_A994ProceDom, P084G12_n994ProceDom, P084G12_A970ProceCod, P084G12_A971ProceNom, P084G12_n971ProceNom, P084G12_A396EmprCod
            }
            , new Object[] {
            P084G13_A14029PoceCp2, P084G13_n14029PoceCp2, P084G13_A993ProceNif, P084G13_n993ProceNif, P084G13_A10391ProEmail, P084G13_n10391ProEmail, P084G13_A10390ProPers, P084G13_n10390ProPers, P084G13_A992ProceTelex, P084G13_n992ProceTelex,
            P084G13_A991ProceTel2, P084G13_n991ProceTel2, P084G13_A990ProceTel1, P084G13_n990ProceTel1, P084G13_A989PoceCp, P084G13_n989PoceCp, P084G13_A787PrvDsc, P084G13_n787PrvDsc, P084G13_A781PrvCod, P084G13_n781PrvCod,
            P084G13_A988ProcePob, P084G13_n988ProcePob, P084G13_A994ProceDom, P084G13_n994ProceDom, P084G13_A970ProceCod, P084G13_A971ProceNom, P084G13_n971ProceNom, P084G13_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12TFProceCod ;
   private short AV13TFProceCod_To ;
   private short AV20TFPrvCod ;
   private short AV21TFPrvCod_To ;
   private short AV83Tprocedwwds_4_tfprocecod ;
   private short AV84Tprocedwwds_5_tfprocecod_to ;
   private short AV89Tprocedwwds_10_tfprvcod ;
   private short AV90Tprocedwwds_11_tfprvcod_to ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV78GXV1 ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private String AV68TFProceNom ;
   private String AV69TFProceNom_Sel ;
   private String AV16TFProceDom ;
   private String AV17TFProceDom_Sel ;
   private String AV18TFProcePob ;
   private String AV19TFProcePob_Sel ;
   private String AV22TFPrvDsc ;
   private String AV23TFPrvDsc_Sel ;
   private String AV24TFPoceCp ;
   private String AV25TFPoceCp_Sel ;
   private String AV26TFProceTel1 ;
   private String AV27TFProceTel1_Sel ;
   private String AV28TFProceTel2 ;
   private String AV29TFProceTel2_Sel ;
   private String AV30TFProceTelex ;
   private String AV31TFProceTelex_Sel ;
   private String AV32TFProPers ;
   private String AV33TFProPers_Sel ;
   private String AV34TFProEmail ;
   private String AV35TFProEmail_Sel ;
   private String AV14TFProceNif ;
   private String AV15TFProceNif_Sel ;
   private String AV74TFPoceCp2 ;
   private String AV75TFPoceCp2_Sel ;
   private String A971ProceNom ;
   private String AV81Tprocedwwds_2_tfprocenom ;
   private String AV82Tprocedwwds_3_tfprocenom_sel ;
   private String AV85Tprocedwwds_6_tfprocedom ;
   private String AV86Tprocedwwds_7_tfprocedom_sel ;
   private String AV87Tprocedwwds_8_tfprocepob ;
   private String AV88Tprocedwwds_9_tfprocepob_sel ;
   private String AV91Tprocedwwds_12_tfprvdsc ;
   private String AV92Tprocedwwds_13_tfprvdsc_sel ;
   private String AV93Tprocedwwds_14_tfpocecp ;
   private String AV94Tprocedwwds_15_tfpocecp_sel ;
   private String AV95Tprocedwwds_16_tfprocetel1 ;
   private String AV96Tprocedwwds_17_tfprocetel1_sel ;
   private String AV97Tprocedwwds_18_tfprocetel2 ;
   private String AV98Tprocedwwds_19_tfprocetel2_sel ;
   private String AV99Tprocedwwds_20_tfprocetelex ;
   private String AV100Tprocedwwds_21_tfprocetelex_sel ;
   private String AV101Tprocedwwds_22_tfpropers ;
   private String AV102Tprocedwwds_23_tfpropers_sel ;
   private String AV103Tprocedwwds_24_tfproemail ;
   private String AV104Tprocedwwds_25_tfproemail_sel ;
   private String AV105Tprocedwwds_26_tfprocenif ;
   private String AV106Tprocedwwds_27_tfprocenif_sel ;
   private String AV107Tprocedwwds_28_tfpocecp2 ;
   private String AV108Tprocedwwds_29_tfpocecp2_sel ;
   private String scmdbuf ;
   private String lV81Tprocedwwds_2_tfprocenom ;
   private String lV85Tprocedwwds_6_tfprocedom ;
   private String lV87Tprocedwwds_8_tfprocepob ;
   private String lV91Tprocedwwds_12_tfprvdsc ;
   private String lV93Tprocedwwds_14_tfpocecp ;
   private String lV95Tprocedwwds_16_tfprocetel1 ;
   private String lV97Tprocedwwds_18_tfprocetel2 ;
   private String lV99Tprocedwwds_20_tfprocetelex ;
   private String lV101Tprocedwwds_22_tfpropers ;
   private String lV103Tprocedwwds_24_tfproemail ;
   private String lV105Tprocedwwds_26_tfprocenif ;
   private String lV107Tprocedwwds_28_tfpocecp2 ;
   private String A994ProceDom ;
   private String A988ProcePob ;
   private String A787PrvDsc ;
   private String A989PoceCp ;
   private String A990ProceTel1 ;
   private String A991ProceTel2 ;
   private String A992ProceTelex ;
   private String A10390ProPers ;
   private String A10391ProEmail ;
   private String A993ProceNif ;
   private String A14029PoceCp2 ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk84G2 ;
   private boolean n971ProceNom ;
   private boolean n14029PoceCp2 ;
   private boolean n993ProceNif ;
   private boolean n10391ProEmail ;
   private boolean n10390ProPers ;
   private boolean n992ProceTelex ;
   private boolean n991ProceTel2 ;
   private boolean n990ProceTel1 ;
   private boolean n989PoceCp ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n988ProcePob ;
   private boolean n994ProceDom ;
   private boolean brk84G4 ;
   private boolean brk84G6 ;
   private boolean brk84G8 ;
   private boolean brk84G10 ;
   private boolean brk84G12 ;
   private boolean brk84G14 ;
   private boolean brk84G16 ;
   private boolean brk84G18 ;
   private boolean brk84G20 ;
   private boolean brk84G22 ;
   private boolean brk84G24 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV73FilterFullText ;
   private String AV80Tprocedwwds_1_filterfulltext ;
   private String lV80Tprocedwwds_1_filterfulltext ;
   private String AV40Option ;
   private String AV43OptionDesc ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P084G2_A971ProceNom ;
   private boolean[] P084G2_n971ProceNom ;
   private String[] P084G2_A14029PoceCp2 ;
   private boolean[] P084G2_n14029PoceCp2 ;
   private String[] P084G2_A993ProceNif ;
   private boolean[] P084G2_n993ProceNif ;
   private String[] P084G2_A10391ProEmail ;
   private boolean[] P084G2_n10391ProEmail ;
   private String[] P084G2_A10390ProPers ;
   private boolean[] P084G2_n10390ProPers ;
   private String[] P084G2_A992ProceTelex ;
   private boolean[] P084G2_n992ProceTelex ;
   private String[] P084G2_A991ProceTel2 ;
   private boolean[] P084G2_n991ProceTel2 ;
   private String[] P084G2_A990ProceTel1 ;
   private boolean[] P084G2_n990ProceTel1 ;
   private String[] P084G2_A989PoceCp ;
   private boolean[] P084G2_n989PoceCp ;
   private String[] P084G2_A787PrvDsc ;
   private boolean[] P084G2_n787PrvDsc ;
   private short[] P084G2_A781PrvCod ;
   private boolean[] P084G2_n781PrvCod ;
   private String[] P084G2_A988ProcePob ;
   private boolean[] P084G2_n988ProcePob ;
   private String[] P084G2_A994ProceDom ;
   private boolean[] P084G2_n994ProceDom ;
   private short[] P084G2_A970ProceCod ;
   private String[] P084G2_A396EmprCod ;
   private String[] P084G3_A994ProceDom ;
   private boolean[] P084G3_n994ProceDom ;
   private String[] P084G3_A14029PoceCp2 ;
   private boolean[] P084G3_n14029PoceCp2 ;
   private String[] P084G3_A993ProceNif ;
   private boolean[] P084G3_n993ProceNif ;
   private String[] P084G3_A10391ProEmail ;
   private boolean[] P084G3_n10391ProEmail ;
   private String[] P084G3_A10390ProPers ;
   private boolean[] P084G3_n10390ProPers ;
   private String[] P084G3_A992ProceTelex ;
   private boolean[] P084G3_n992ProceTelex ;
   private String[] P084G3_A991ProceTel2 ;
   private boolean[] P084G3_n991ProceTel2 ;
   private String[] P084G3_A990ProceTel1 ;
   private boolean[] P084G3_n990ProceTel1 ;
   private String[] P084G3_A989PoceCp ;
   private boolean[] P084G3_n989PoceCp ;
   private String[] P084G3_A787PrvDsc ;
   private boolean[] P084G3_n787PrvDsc ;
   private short[] P084G3_A781PrvCod ;
   private boolean[] P084G3_n781PrvCod ;
   private String[] P084G3_A988ProcePob ;
   private boolean[] P084G3_n988ProcePob ;
   private short[] P084G3_A970ProceCod ;
   private String[] P084G3_A971ProceNom ;
   private boolean[] P084G3_n971ProceNom ;
   private String[] P084G3_A396EmprCod ;
   private String[] P084G4_A988ProcePob ;
   private boolean[] P084G4_n988ProcePob ;
   private String[] P084G4_A14029PoceCp2 ;
   private boolean[] P084G4_n14029PoceCp2 ;
   private String[] P084G4_A993ProceNif ;
   private boolean[] P084G4_n993ProceNif ;
   private String[] P084G4_A10391ProEmail ;
   private boolean[] P084G4_n10391ProEmail ;
   private String[] P084G4_A10390ProPers ;
   private boolean[] P084G4_n10390ProPers ;
   private String[] P084G4_A992ProceTelex ;
   private boolean[] P084G4_n992ProceTelex ;
   private String[] P084G4_A991ProceTel2 ;
   private boolean[] P084G4_n991ProceTel2 ;
   private String[] P084G4_A990ProceTel1 ;
   private boolean[] P084G4_n990ProceTel1 ;
   private String[] P084G4_A989PoceCp ;
   private boolean[] P084G4_n989PoceCp ;
   private String[] P084G4_A787PrvDsc ;
   private boolean[] P084G4_n787PrvDsc ;
   private short[] P084G4_A781PrvCod ;
   private boolean[] P084G4_n781PrvCod ;
   private String[] P084G4_A994ProceDom ;
   private boolean[] P084G4_n994ProceDom ;
   private short[] P084G4_A970ProceCod ;
   private String[] P084G4_A971ProceNom ;
   private boolean[] P084G4_n971ProceNom ;
   private String[] P084G4_A396EmprCod ;
   private short[] P084G5_A781PrvCod ;
   private boolean[] P084G5_n781PrvCod ;
   private String[] P084G5_A14029PoceCp2 ;
   private boolean[] P084G5_n14029PoceCp2 ;
   private String[] P084G5_A993ProceNif ;
   private boolean[] P084G5_n993ProceNif ;
   private String[] P084G5_A10391ProEmail ;
   private boolean[] P084G5_n10391ProEmail ;
   private String[] P084G5_A10390ProPers ;
   private boolean[] P084G5_n10390ProPers ;
   private String[] P084G5_A992ProceTelex ;
   private boolean[] P084G5_n992ProceTelex ;
   private String[] P084G5_A991ProceTel2 ;
   private boolean[] P084G5_n991ProceTel2 ;
   private String[] P084G5_A990ProceTel1 ;
   private boolean[] P084G5_n990ProceTel1 ;
   private String[] P084G5_A989PoceCp ;
   private boolean[] P084G5_n989PoceCp ;
   private String[] P084G5_A787PrvDsc ;
   private boolean[] P084G5_n787PrvDsc ;
   private String[] P084G5_A988ProcePob ;
   private boolean[] P084G5_n988ProcePob ;
   private String[] P084G5_A994ProceDom ;
   private boolean[] P084G5_n994ProceDom ;
   private short[] P084G5_A970ProceCod ;
   private String[] P084G5_A971ProceNom ;
   private boolean[] P084G5_n971ProceNom ;
   private String[] P084G5_A396EmprCod ;
   private String[] P084G6_A989PoceCp ;
   private boolean[] P084G6_n989PoceCp ;
   private String[] P084G6_A14029PoceCp2 ;
   private boolean[] P084G6_n14029PoceCp2 ;
   private String[] P084G6_A993ProceNif ;
   private boolean[] P084G6_n993ProceNif ;
   private String[] P084G6_A10391ProEmail ;
   private boolean[] P084G6_n10391ProEmail ;
   private String[] P084G6_A10390ProPers ;
   private boolean[] P084G6_n10390ProPers ;
   private String[] P084G6_A992ProceTelex ;
   private boolean[] P084G6_n992ProceTelex ;
   private String[] P084G6_A991ProceTel2 ;
   private boolean[] P084G6_n991ProceTel2 ;
   private String[] P084G6_A990ProceTel1 ;
   private boolean[] P084G6_n990ProceTel1 ;
   private String[] P084G6_A787PrvDsc ;
   private boolean[] P084G6_n787PrvDsc ;
   private short[] P084G6_A781PrvCod ;
   private boolean[] P084G6_n781PrvCod ;
   private String[] P084G6_A988ProcePob ;
   private boolean[] P084G6_n988ProcePob ;
   private String[] P084G6_A994ProceDom ;
   private boolean[] P084G6_n994ProceDom ;
   private short[] P084G6_A970ProceCod ;
   private String[] P084G6_A971ProceNom ;
   private boolean[] P084G6_n971ProceNom ;
   private String[] P084G6_A396EmprCod ;
   private String[] P084G7_A990ProceTel1 ;
   private boolean[] P084G7_n990ProceTel1 ;
   private String[] P084G7_A14029PoceCp2 ;
   private boolean[] P084G7_n14029PoceCp2 ;
   private String[] P084G7_A993ProceNif ;
   private boolean[] P084G7_n993ProceNif ;
   private String[] P084G7_A10391ProEmail ;
   private boolean[] P084G7_n10391ProEmail ;
   private String[] P084G7_A10390ProPers ;
   private boolean[] P084G7_n10390ProPers ;
   private String[] P084G7_A992ProceTelex ;
   private boolean[] P084G7_n992ProceTelex ;
   private String[] P084G7_A991ProceTel2 ;
   private boolean[] P084G7_n991ProceTel2 ;
   private String[] P084G7_A989PoceCp ;
   private boolean[] P084G7_n989PoceCp ;
   private String[] P084G7_A787PrvDsc ;
   private boolean[] P084G7_n787PrvDsc ;
   private short[] P084G7_A781PrvCod ;
   private boolean[] P084G7_n781PrvCod ;
   private String[] P084G7_A988ProcePob ;
   private boolean[] P084G7_n988ProcePob ;
   private String[] P084G7_A994ProceDom ;
   private boolean[] P084G7_n994ProceDom ;
   private short[] P084G7_A970ProceCod ;
   private String[] P084G7_A971ProceNom ;
   private boolean[] P084G7_n971ProceNom ;
   private String[] P084G7_A396EmprCod ;
   private String[] P084G8_A991ProceTel2 ;
   private boolean[] P084G8_n991ProceTel2 ;
   private String[] P084G8_A14029PoceCp2 ;
   private boolean[] P084G8_n14029PoceCp2 ;
   private String[] P084G8_A993ProceNif ;
   private boolean[] P084G8_n993ProceNif ;
   private String[] P084G8_A10391ProEmail ;
   private boolean[] P084G8_n10391ProEmail ;
   private String[] P084G8_A10390ProPers ;
   private boolean[] P084G8_n10390ProPers ;
   private String[] P084G8_A992ProceTelex ;
   private boolean[] P084G8_n992ProceTelex ;
   private String[] P084G8_A990ProceTel1 ;
   private boolean[] P084G8_n990ProceTel1 ;
   private String[] P084G8_A989PoceCp ;
   private boolean[] P084G8_n989PoceCp ;
   private String[] P084G8_A787PrvDsc ;
   private boolean[] P084G8_n787PrvDsc ;
   private short[] P084G8_A781PrvCod ;
   private boolean[] P084G8_n781PrvCod ;
   private String[] P084G8_A988ProcePob ;
   private boolean[] P084G8_n988ProcePob ;
   private String[] P084G8_A994ProceDom ;
   private boolean[] P084G8_n994ProceDom ;
   private short[] P084G8_A970ProceCod ;
   private String[] P084G8_A971ProceNom ;
   private boolean[] P084G8_n971ProceNom ;
   private String[] P084G8_A396EmprCod ;
   private String[] P084G9_A992ProceTelex ;
   private boolean[] P084G9_n992ProceTelex ;
   private String[] P084G9_A14029PoceCp2 ;
   private boolean[] P084G9_n14029PoceCp2 ;
   private String[] P084G9_A993ProceNif ;
   private boolean[] P084G9_n993ProceNif ;
   private String[] P084G9_A10391ProEmail ;
   private boolean[] P084G9_n10391ProEmail ;
   private String[] P084G9_A10390ProPers ;
   private boolean[] P084G9_n10390ProPers ;
   private String[] P084G9_A991ProceTel2 ;
   private boolean[] P084G9_n991ProceTel2 ;
   private String[] P084G9_A990ProceTel1 ;
   private boolean[] P084G9_n990ProceTel1 ;
   private String[] P084G9_A989PoceCp ;
   private boolean[] P084G9_n989PoceCp ;
   private String[] P084G9_A787PrvDsc ;
   private boolean[] P084G9_n787PrvDsc ;
   private short[] P084G9_A781PrvCod ;
   private boolean[] P084G9_n781PrvCod ;
   private String[] P084G9_A988ProcePob ;
   private boolean[] P084G9_n988ProcePob ;
   private String[] P084G9_A994ProceDom ;
   private boolean[] P084G9_n994ProceDom ;
   private short[] P084G9_A970ProceCod ;
   private String[] P084G9_A971ProceNom ;
   private boolean[] P084G9_n971ProceNom ;
   private String[] P084G9_A396EmprCod ;
   private String[] P084G10_A10390ProPers ;
   private boolean[] P084G10_n10390ProPers ;
   private String[] P084G10_A14029PoceCp2 ;
   private boolean[] P084G10_n14029PoceCp2 ;
   private String[] P084G10_A993ProceNif ;
   private boolean[] P084G10_n993ProceNif ;
   private String[] P084G10_A10391ProEmail ;
   private boolean[] P084G10_n10391ProEmail ;
   private String[] P084G10_A992ProceTelex ;
   private boolean[] P084G10_n992ProceTelex ;
   private String[] P084G10_A991ProceTel2 ;
   private boolean[] P084G10_n991ProceTel2 ;
   private String[] P084G10_A990ProceTel1 ;
   private boolean[] P084G10_n990ProceTel1 ;
   private String[] P084G10_A989PoceCp ;
   private boolean[] P084G10_n989PoceCp ;
   private String[] P084G10_A787PrvDsc ;
   private boolean[] P084G10_n787PrvDsc ;
   private short[] P084G10_A781PrvCod ;
   private boolean[] P084G10_n781PrvCod ;
   private String[] P084G10_A988ProcePob ;
   private boolean[] P084G10_n988ProcePob ;
   private String[] P084G10_A994ProceDom ;
   private boolean[] P084G10_n994ProceDom ;
   private short[] P084G10_A970ProceCod ;
   private String[] P084G10_A971ProceNom ;
   private boolean[] P084G10_n971ProceNom ;
   private String[] P084G10_A396EmprCod ;
   private String[] P084G11_A10391ProEmail ;
   private boolean[] P084G11_n10391ProEmail ;
   private String[] P084G11_A14029PoceCp2 ;
   private boolean[] P084G11_n14029PoceCp2 ;
   private String[] P084G11_A993ProceNif ;
   private boolean[] P084G11_n993ProceNif ;
   private String[] P084G11_A10390ProPers ;
   private boolean[] P084G11_n10390ProPers ;
   private String[] P084G11_A992ProceTelex ;
   private boolean[] P084G11_n992ProceTelex ;
   private String[] P084G11_A991ProceTel2 ;
   private boolean[] P084G11_n991ProceTel2 ;
   private String[] P084G11_A990ProceTel1 ;
   private boolean[] P084G11_n990ProceTel1 ;
   private String[] P084G11_A989PoceCp ;
   private boolean[] P084G11_n989PoceCp ;
   private String[] P084G11_A787PrvDsc ;
   private boolean[] P084G11_n787PrvDsc ;
   private short[] P084G11_A781PrvCod ;
   private boolean[] P084G11_n781PrvCod ;
   private String[] P084G11_A988ProcePob ;
   private boolean[] P084G11_n988ProcePob ;
   private String[] P084G11_A994ProceDom ;
   private boolean[] P084G11_n994ProceDom ;
   private short[] P084G11_A970ProceCod ;
   private String[] P084G11_A971ProceNom ;
   private boolean[] P084G11_n971ProceNom ;
   private String[] P084G11_A396EmprCod ;
   private String[] P084G12_A993ProceNif ;
   private boolean[] P084G12_n993ProceNif ;
   private String[] P084G12_A14029PoceCp2 ;
   private boolean[] P084G12_n14029PoceCp2 ;
   private String[] P084G12_A10391ProEmail ;
   private boolean[] P084G12_n10391ProEmail ;
   private String[] P084G12_A10390ProPers ;
   private boolean[] P084G12_n10390ProPers ;
   private String[] P084G12_A992ProceTelex ;
   private boolean[] P084G12_n992ProceTelex ;
   private String[] P084G12_A991ProceTel2 ;
   private boolean[] P084G12_n991ProceTel2 ;
   private String[] P084G12_A990ProceTel1 ;
   private boolean[] P084G12_n990ProceTel1 ;
   private String[] P084G12_A989PoceCp ;
   private boolean[] P084G12_n989PoceCp ;
   private String[] P084G12_A787PrvDsc ;
   private boolean[] P084G12_n787PrvDsc ;
   private short[] P084G12_A781PrvCod ;
   private boolean[] P084G12_n781PrvCod ;
   private String[] P084G12_A988ProcePob ;
   private boolean[] P084G12_n988ProcePob ;
   private String[] P084G12_A994ProceDom ;
   private boolean[] P084G12_n994ProceDom ;
   private short[] P084G12_A970ProceCod ;
   private String[] P084G12_A971ProceNom ;
   private boolean[] P084G12_n971ProceNom ;
   private String[] P084G12_A396EmprCod ;
   private String[] P084G13_A14029PoceCp2 ;
   private boolean[] P084G13_n14029PoceCp2 ;
   private String[] P084G13_A993ProceNif ;
   private boolean[] P084G13_n993ProceNif ;
   private String[] P084G13_A10391ProEmail ;
   private boolean[] P084G13_n10391ProEmail ;
   private String[] P084G13_A10390ProPers ;
   private boolean[] P084G13_n10390ProPers ;
   private String[] P084G13_A992ProceTelex ;
   private boolean[] P084G13_n992ProceTelex ;
   private String[] P084G13_A991ProceTel2 ;
   private boolean[] P084G13_n991ProceTel2 ;
   private String[] P084G13_A990ProceTel1 ;
   private boolean[] P084G13_n990ProceTel1 ;
   private String[] P084G13_A989PoceCp ;
   private boolean[] P084G13_n989PoceCp ;
   private String[] P084G13_A787PrvDsc ;
   private boolean[] P084G13_n787PrvDsc ;
   private short[] P084G13_A781PrvCod ;
   private boolean[] P084G13_n781PrvCod ;
   private String[] P084G13_A988ProcePob ;
   private boolean[] P084G13_n988ProcePob ;
   private String[] P084G13_A994ProceDom ;
   private boolean[] P084G13_n994ProceDom ;
   private short[] P084G13_A970ProceCod ;
   private String[] P084G13_A971ProceNom ;
   private boolean[] P084G13_n971ProceNom ;
   private String[] P084G13_A396EmprCod ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class tprocedwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[42];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ProceNom, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom," ;
      scmdbuf += " T1.ProceCod, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProceNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P084G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[42];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProceDom, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProceDom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P084G4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[42];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ProcePob, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProcePob" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P084G5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[42];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.PrvCod, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P084G6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[42];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.PoceCp, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PoceCp" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P084G7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[42];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ProceTel1, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProceTel1" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P084G8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[42];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.ProceTel2, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProceTel2" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P084G9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Tprocedwwds_1_filterfulltext ,
                                          String AV82Tprocedwwds_3_tfprocenom_sel ,
                                          String AV81Tprocedwwds_2_tfprocenom ,
                                          short AV83Tprocedwwds_4_tfprocecod ,
                                          short AV84Tprocedwwds_5_tfprocecod_to ,
                                          String AV86Tprocedwwds_7_tfprocedom_sel ,
                                          String AV85Tprocedwwds_6_tfprocedom ,
                                          String AV88Tprocedwwds_9_tfprocepob_sel ,
                                          String AV87Tprocedwwds_8_tfprocepob ,
                                          short AV89Tprocedwwds_10_tfprvcod ,
                                          short AV90Tprocedwwds_11_tfprvcod_to ,
                                          String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV91Tprocedwwds_12_tfprvdsc ,
                                          String AV94Tprocedwwds_15_tfpocecp_sel ,
                                          String AV93Tprocedwwds_14_tfpocecp ,
                                          String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV95Tprocedwwds_16_tfprocetel1 ,
                                          String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV97Tprocedwwds_18_tfprocetel2 ,
                                          String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV99Tprocedwwds_20_tfprocetelex ,
                                          String AV102Tprocedwwds_23_tfpropers_sel ,
                                          String AV101Tprocedwwds_22_tfpropers ,
                                          String AV104Tprocedwwds_25_tfproemail_sel ,
                                          String AV103Tprocedwwds_24_tfproemail ,
                                          String AV106Tprocedwwds_27_tfprocenif_sel ,
                                          String AV105Tprocedwwds_26_tfprocenif ,
                                          String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV107Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[42];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.ProceTelex, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProceTelex" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P084G10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV80Tprocedwwds_1_filterfulltext ,
                                           String AV82Tprocedwwds_3_tfprocenom_sel ,
                                           String AV81Tprocedwwds_2_tfprocenom ,
                                           short AV83Tprocedwwds_4_tfprocecod ,
                                           short AV84Tprocedwwds_5_tfprocecod_to ,
                                           String AV86Tprocedwwds_7_tfprocedom_sel ,
                                           String AV85Tprocedwwds_6_tfprocedom ,
                                           String AV88Tprocedwwds_9_tfprocepob_sel ,
                                           String AV87Tprocedwwds_8_tfprocepob ,
                                           short AV89Tprocedwwds_10_tfprvcod ,
                                           short AV90Tprocedwwds_11_tfprvcod_to ,
                                           String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           String AV91Tprocedwwds_12_tfprvdsc ,
                                           String AV94Tprocedwwds_15_tfpocecp_sel ,
                                           String AV93Tprocedwwds_14_tfpocecp ,
                                           String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           String AV95Tprocedwwds_16_tfprocetel1 ,
                                           String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           String AV97Tprocedwwds_18_tfprocetel2 ,
                                           String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           String AV99Tprocedwwds_20_tfprocetelex ,
                                           String AV102Tprocedwwds_23_tfpropers_sel ,
                                           String AV101Tprocedwwds_22_tfpropers ,
                                           String AV104Tprocedwwds_25_tfproemail_sel ,
                                           String AV103Tprocedwwds_24_tfproemail ,
                                           String AV106Tprocedwwds_27_tfprocenif_sel ,
                                           String AV105Tprocedwwds_26_tfprocenif ,
                                           String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           String AV107Tprocedwwds_28_tfpocecp2 ,
                                           String A971ProceNom ,
                                           short A970ProceCod ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String A993ProceNif ,
                                           String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[42];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.ProPers, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProPers" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P084G11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV80Tprocedwwds_1_filterfulltext ,
                                           String AV82Tprocedwwds_3_tfprocenom_sel ,
                                           String AV81Tprocedwwds_2_tfprocenom ,
                                           short AV83Tprocedwwds_4_tfprocecod ,
                                           short AV84Tprocedwwds_5_tfprocecod_to ,
                                           String AV86Tprocedwwds_7_tfprocedom_sel ,
                                           String AV85Tprocedwwds_6_tfprocedom ,
                                           String AV88Tprocedwwds_9_tfprocepob_sel ,
                                           String AV87Tprocedwwds_8_tfprocepob ,
                                           short AV89Tprocedwwds_10_tfprvcod ,
                                           short AV90Tprocedwwds_11_tfprvcod_to ,
                                           String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           String AV91Tprocedwwds_12_tfprvdsc ,
                                           String AV94Tprocedwwds_15_tfpocecp_sel ,
                                           String AV93Tprocedwwds_14_tfpocecp ,
                                           String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           String AV95Tprocedwwds_16_tfprocetel1 ,
                                           String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           String AV97Tprocedwwds_18_tfprocetel2 ,
                                           String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           String AV99Tprocedwwds_20_tfprocetelex ,
                                           String AV102Tprocedwwds_23_tfpropers_sel ,
                                           String AV101Tprocedwwds_22_tfpropers ,
                                           String AV104Tprocedwwds_25_tfproemail_sel ,
                                           String AV103Tprocedwwds_24_tfproemail ,
                                           String AV106Tprocedwwds_27_tfprocenif_sel ,
                                           String AV105Tprocedwwds_26_tfprocenif ,
                                           String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           String AV107Tprocedwwds_28_tfpocecp2 ,
                                           String A971ProceNom ,
                                           short A970ProceCod ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String A993ProceNif ,
                                           String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[42];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.ProEmail, T1.PoceCp2, T1.ProceNif, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
         GXv_int20[1] = (byte)(1) ;
         GXv_int20[2] = (byte)(1) ;
         GXv_int20[3] = (byte)(1) ;
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
         GXv_int20[6] = (byte)(1) ;
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
         GXv_int20[9] = (byte)(1) ;
         GXv_int20[10] = (byte)(1) ;
         GXv_int20[11] = (byte)(1) ;
         GXv_int20[12] = (byte)(1) ;
         GXv_int20[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProEmail" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P084G12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV80Tprocedwwds_1_filterfulltext ,
                                           String AV82Tprocedwwds_3_tfprocenom_sel ,
                                           String AV81Tprocedwwds_2_tfprocenom ,
                                           short AV83Tprocedwwds_4_tfprocecod ,
                                           short AV84Tprocedwwds_5_tfprocecod_to ,
                                           String AV86Tprocedwwds_7_tfprocedom_sel ,
                                           String AV85Tprocedwwds_6_tfprocedom ,
                                           String AV88Tprocedwwds_9_tfprocepob_sel ,
                                           String AV87Tprocedwwds_8_tfprocepob ,
                                           short AV89Tprocedwwds_10_tfprvcod ,
                                           short AV90Tprocedwwds_11_tfprvcod_to ,
                                           String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           String AV91Tprocedwwds_12_tfprvdsc ,
                                           String AV94Tprocedwwds_15_tfpocecp_sel ,
                                           String AV93Tprocedwwds_14_tfpocecp ,
                                           String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           String AV95Tprocedwwds_16_tfprocetel1 ,
                                           String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           String AV97Tprocedwwds_18_tfprocetel2 ,
                                           String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           String AV99Tprocedwwds_20_tfprocetelex ,
                                           String AV102Tprocedwwds_23_tfpropers_sel ,
                                           String AV101Tprocedwwds_22_tfpropers ,
                                           String AV104Tprocedwwds_25_tfproemail_sel ,
                                           String AV103Tprocedwwds_24_tfproemail ,
                                           String AV106Tprocedwwds_27_tfprocenif_sel ,
                                           String AV105Tprocedwwds_26_tfprocenif ,
                                           String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           String AV107Tprocedwwds_28_tfpocecp2 ,
                                           String A971ProceNom ,
                                           short A970ProceCod ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String A993ProceNif ,
                                           String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[42];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.ProceNif, T1.PoceCp2, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[0] = (byte)(1) ;
         GXv_int22[1] = (byte)(1) ;
         GXv_int22[2] = (byte)(1) ;
         GXv_int22[3] = (byte)(1) ;
         GXv_int22[4] = (byte)(1) ;
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
         GXv_int22[9] = (byte)(1) ;
         GXv_int22[10] = (byte)(1) ;
         GXv_int22[11] = (byte)(1) ;
         GXv_int22[12] = (byte)(1) ;
         GXv_int22[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int22[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProceNif" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P084G13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV80Tprocedwwds_1_filterfulltext ,
                                           String AV82Tprocedwwds_3_tfprocenom_sel ,
                                           String AV81Tprocedwwds_2_tfprocenom ,
                                           short AV83Tprocedwwds_4_tfprocecod ,
                                           short AV84Tprocedwwds_5_tfprocecod_to ,
                                           String AV86Tprocedwwds_7_tfprocedom_sel ,
                                           String AV85Tprocedwwds_6_tfprocedom ,
                                           String AV88Tprocedwwds_9_tfprocepob_sel ,
                                           String AV87Tprocedwwds_8_tfprocepob ,
                                           short AV89Tprocedwwds_10_tfprvcod ,
                                           short AV90Tprocedwwds_11_tfprvcod_to ,
                                           String AV92Tprocedwwds_13_tfprvdsc_sel ,
                                           String AV91Tprocedwwds_12_tfprvdsc ,
                                           String AV94Tprocedwwds_15_tfpocecp_sel ,
                                           String AV93Tprocedwwds_14_tfpocecp ,
                                           String AV96Tprocedwwds_17_tfprocetel1_sel ,
                                           String AV95Tprocedwwds_16_tfprocetel1 ,
                                           String AV98Tprocedwwds_19_tfprocetel2_sel ,
                                           String AV97Tprocedwwds_18_tfprocetel2 ,
                                           String AV100Tprocedwwds_21_tfprocetelex_sel ,
                                           String AV99Tprocedwwds_20_tfprocetelex ,
                                           String AV102Tprocedwwds_23_tfpropers_sel ,
                                           String AV101Tprocedwwds_22_tfpropers ,
                                           String AV104Tprocedwwds_25_tfproemail_sel ,
                                           String AV103Tprocedwwds_24_tfproemail ,
                                           String AV106Tprocedwwds_27_tfprocenif_sel ,
                                           String AV105Tprocedwwds_26_tfprocenif ,
                                           String AV108Tprocedwwds_29_tfpocecp2_sel ,
                                           String AV107Tprocedwwds_28_tfpocecp2 ,
                                           String A971ProceNom ,
                                           short A970ProceCod ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String A993ProceNif ,
                                           String A14029PoceCp2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[42];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceCod," ;
      scmdbuf += " T1.ProceNom, T1.EmprCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV80Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int24[0] = (byte)(1) ;
         GXv_int24[1] = (byte)(1) ;
         GXv_int24[2] = (byte)(1) ;
         GXv_int24[3] = (byte)(1) ;
         GXv_int24[4] = (byte)(1) ;
         GXv_int24[5] = (byte)(1) ;
         GXv_int24[6] = (byte)(1) ;
         GXv_int24[7] = (byte)(1) ;
         GXv_int24[8] = (byte)(1) ;
         GXv_int24[9] = (byte)(1) ;
         GXv_int24[10] = (byte)(1) ;
         GXv_int24[11] = (byte)(1) ;
         GXv_int24[12] = (byte)(1) ;
         GXv_int24[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV81Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (0==AV83Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (0==AV84Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV85Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV87Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV93Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV95Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV97Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV99Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV101Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV103Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV105Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV107Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int24[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PoceCp2" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_P084G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 1 :
                  return conditional_P084G3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 2 :
                  return conditional_P084G4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 3 :
                  return conditional_P084G5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 4 :
                  return conditional_P084G6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 5 :
                  return conditional_P084G7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 6 :
                  return conditional_P084G8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 7 :
                  return conditional_P084G9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 8 :
                  return conditional_P084G10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 9 :
                  return conditional_P084G11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 10 :
                  return conditional_P084G12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
            case 11 :
                  return conditional_P084G13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084G13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(13, 34);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(14);
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 14);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(13);
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
            case 6 :
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
            case 7 :
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
            case 8 :
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
            case 9 :
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
            case 10 :
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
            case 11 :
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
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
      }
   }

}

