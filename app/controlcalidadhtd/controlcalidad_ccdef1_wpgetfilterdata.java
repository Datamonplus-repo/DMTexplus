package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_wpgetfilterdata extends GXProcedure
{
   public controlcalidad_ccdef1_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_wpgetfilterdata.class ), "" );
   }

   public controlcalidad_ccdef1_wpgetfilterdata( int remoteHandle ,
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
      controlcalidad_ccdef1_wpgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidad_ccdef1_wpgetfilterdata.this.AV36DDOName = aP0;
      controlcalidad_ccdef1_wpgetfilterdata.this.AV37SearchTxt = aP1;
      controlcalidad_ccdef1_wpgetfilterdata.this.AV38SearchTxtTo = aP2;
      controlcalidad_ccdef1_wpgetfilterdata.this.aP3 = aP3;
      controlcalidad_ccdef1_wpgetfilterdata.this.aP4 = aP4;
      controlcalidad_ccdef1_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCTLINDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTLINDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCTLINDC2") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTLINDC2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCVNORMA") == 0 )
      {
         /* Execute user subroutine: 'LOADCCVNORMAOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCVESPE2") == 0 )
      {
         /* Execute user subroutine: 'LOADCCVESPE2OPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCTLINPICT") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTLINPICTOPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("ControlCalidadHTD.ControlCalidad_CCDEF1_WPGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CCDEF1_WPGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("ControlCalidadHTD.ControlCalidad_CCDEF1_WPGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV10TFCCTLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINTPOING_SEL") == 0 )
         {
            AV44TFCCTLinTpoIng_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFCCTLinTpoIng_Sels.fromJSonString(AV44TFCCTLinTpoIng_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINTPODAT_SEL") == 0 )
         {
            AV46TFCCTLinTpoDat_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV47TFCCTLinTpoDat_Sels.fromJSonString(AV46TFCCTLinTpoDat_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC") == 0 )
         {
            AV12TFCCTLinDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDSC_SEL") == 0 )
         {
            AV13TFCCTLinDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDC2") == 0 )
         {
            AV14TFCCTLinDc2 = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINDC2_SEL") == 0 )
         {
            AV15TFCCTLinDc2_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVNORMA") == 0 )
         {
            AV16TFCCVNorma = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVNORMA_SEL") == 0 )
         {
            AV17TFCCVNorma_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVESPE2") == 0 )
         {
            AV18TFCCVEspe2 = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVESPE2_SEL") == 0 )
         {
            AV19TFCCVEspe2_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINLGODAT") == 0 )
         {
            AV20TFCCTLinLgoDat = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFCCTLinLgoDat_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINPICT") == 0 )
         {
            AV22TFCCTLinPict = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLINPICT_SEL") == 0 )
         {
            AV23TFCCTLinPict_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTLINDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTLinDsc = AV37SearchTxt ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV45TFCCTLinTpoIng_Sels ;
      AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV47TFCCTLinTpoDat_Sels ;
      AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV16TFCCVNorma ;
      AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV17TFCCVNorma_Sel ;
      AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV18TFCCVEspe2 ;
      AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV19TFCCVEspe2_Sel ;
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV20TFCCTLinLgoDat ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV21TFCCTLinLgoDat_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV22TFCCTLinPict ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV23TFCCTLinPict_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A4048CCTLinTpoI ,
                                           AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                           A4044CCTLinTpoD ,
                                           AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                           Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels.size()) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels.size()) ,
                                           AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                           AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) ,
                                           Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) ,
                                           AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13249CCVNorma ,
                                           A14345CCVEspe2 ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           A396EmprCod ,
                                           AV42emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV43CCTCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = GXutil.concat( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2), "%", "") ;
      lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict), 40, "%") ;
      /* Using cursor P0AP02 */
      pr_default.execute(0, new Object[] {AV42emprcod, Integer.valueOf(AV43CCTCod), Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin), Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma, AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel, lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2, AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel, Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat), Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to), lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict, AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAP02 = false ;
         A396EmprCod = P0AP02_A396EmprCod[0] ;
         A4031CCTCod = P0AP02_A4031CCTCod[0] ;
         A4043CCTLinDsc = P0AP02_A4043CCTLinDsc[0] ;
         A4046CCTLinPict = P0AP02_A4046CCTLinPict[0] ;
         A4045CCTLinLgoD = P0AP02_A4045CCTLinLgoD[0] ;
         A14345CCVEspe2 = P0AP02_A14345CCVEspe2[0] ;
         A13249CCVNorma = P0AP02_A13249CCVNorma[0] ;
         A14344CCTLinDc2 = P0AP02_A14344CCTLinDc2[0] ;
         A4044CCTLinTpoD = P0AP02_A4044CCTLinTpoD[0] ;
         A4048CCTLinTpoI = P0AP02_A4048CCTLinTpoI[0] ;
         A4034CCTLin = P0AP02_A4034CCTLin[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AP02_A4043CCTLinDsc[0], A4043CCTLinDsc) == 0 ) )
         {
            brkAP02 = false ;
            A396EmprCod = P0AP02_A396EmprCod[0] ;
            A4031CCTCod = P0AP02_A4031CCTCod[0] ;
            A4034CCTLin = P0AP02_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAP02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4043CCTLinDsc)==0) )
         {
            AV25Option = A4043CCTLinDsc ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAP02 )
         {
            brkAP02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADCCTLINDC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFCCTLinDc2 = AV37SearchTxt ;
      AV15TFCCTLinDc2_Sel = "" ;
      AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV45TFCCTLinTpoIng_Sels ;
      AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV47TFCCTLinTpoDat_Sels ;
      AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV16TFCCVNorma ;
      AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV17TFCCVNorma_Sel ;
      AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV18TFCCVEspe2 ;
      AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV19TFCCVEspe2_Sel ;
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV20TFCCTLinLgoDat ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV21TFCCTLinLgoDat_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV22TFCCTLinPict ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV23TFCCTLinPict_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A4048CCTLinTpoI ,
                                           AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                           A4044CCTLinTpoD ,
                                           AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                           Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels.size()) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels.size()) ,
                                           AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                           AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) ,
                                           Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) ,
                                           AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13249CCVNorma ,
                                           A14345CCVEspe2 ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           A396EmprCod ,
                                           AV42emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV43CCTCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = GXutil.concat( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2), "%", "") ;
      lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict), 40, "%") ;
      /* Using cursor P0AP03 */
      pr_default.execute(1, new Object[] {AV42emprcod, Integer.valueOf(AV43CCTCod), Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin), Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma, AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel, lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2, AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel, Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat), Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to), lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict, AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAP04 = false ;
         A396EmprCod = P0AP03_A396EmprCod[0] ;
         A4031CCTCod = P0AP03_A4031CCTCod[0] ;
         A14344CCTLinDc2 = P0AP03_A14344CCTLinDc2[0] ;
         A4046CCTLinPict = P0AP03_A4046CCTLinPict[0] ;
         A4045CCTLinLgoD = P0AP03_A4045CCTLinLgoD[0] ;
         A14345CCVEspe2 = P0AP03_A14345CCVEspe2[0] ;
         A13249CCVNorma = P0AP03_A13249CCVNorma[0] ;
         A4043CCTLinDsc = P0AP03_A4043CCTLinDsc[0] ;
         A4044CCTLinTpoD = P0AP03_A4044CCTLinTpoD[0] ;
         A4048CCTLinTpoI = P0AP03_A4048CCTLinTpoI[0] ;
         A4034CCTLin = P0AP03_A4034CCTLin[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AP03_A14344CCTLinDc2[0], A14344CCTLinDc2) == 0 ) )
         {
            brkAP04 = false ;
            A396EmprCod = P0AP03_A396EmprCod[0] ;
            A4031CCTCod = P0AP03_A4031CCTCod[0] ;
            A4034CCTLin = P0AP03_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAP04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A14344CCTLinDc2)==0) )
         {
            AV25Option = A14344CCTLinDc2 ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAP04 )
         {
            brkAP04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCVNORMAOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCCVNorma = AV37SearchTxt ;
      AV17TFCCVNorma_Sel = "" ;
      AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV45TFCCTLinTpoIng_Sels ;
      AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV47TFCCTLinTpoDat_Sels ;
      AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV16TFCCVNorma ;
      AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV17TFCCVNorma_Sel ;
      AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV18TFCCVEspe2 ;
      AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV19TFCCVEspe2_Sel ;
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV20TFCCTLinLgoDat ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV21TFCCTLinLgoDat_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV22TFCCTLinPict ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV23TFCCTLinPict_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A4048CCTLinTpoI ,
                                           AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                           A4044CCTLinTpoD ,
                                           AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                           Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels.size()) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels.size()) ,
                                           AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                           AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) ,
                                           Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) ,
                                           AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13249CCVNorma ,
                                           A14345CCVEspe2 ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           A396EmprCod ,
                                           AV42emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV43CCTCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = GXutil.concat( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2), "%", "") ;
      lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict), 40, "%") ;
      /* Using cursor P0AP04 */
      pr_default.execute(2, new Object[] {AV42emprcod, Integer.valueOf(AV43CCTCod), Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin), Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma, AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel, lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2, AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel, Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat), Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to), lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict, AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAP06 = false ;
         A396EmprCod = P0AP04_A396EmprCod[0] ;
         A4031CCTCod = P0AP04_A4031CCTCod[0] ;
         A13249CCVNorma = P0AP04_A13249CCVNorma[0] ;
         A4046CCTLinPict = P0AP04_A4046CCTLinPict[0] ;
         A4045CCTLinLgoD = P0AP04_A4045CCTLinLgoD[0] ;
         A14345CCVEspe2 = P0AP04_A14345CCVEspe2[0] ;
         A14344CCTLinDc2 = P0AP04_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AP04_A4043CCTLinDsc[0] ;
         A4044CCTLinTpoD = P0AP04_A4044CCTLinTpoD[0] ;
         A4048CCTLinTpoI = P0AP04_A4048CCTLinTpoI[0] ;
         A4034CCTLin = P0AP04_A4034CCTLin[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AP04_A13249CCVNorma[0], A13249CCVNorma) == 0 ) )
         {
            brkAP06 = false ;
            A396EmprCod = P0AP04_A396EmprCod[0] ;
            A4031CCTCod = P0AP04_A4031CCTCod[0] ;
            A4034CCTLin = P0AP04_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAP06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A13249CCVNorma)==0) )
         {
            AV25Option = A13249CCVNorma ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAP06 )
         {
            brkAP06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCCVESPE2OPTIONS' Routine */
      returnInSub = false ;
      AV18TFCCVEspe2 = AV37SearchTxt ;
      AV19TFCCVEspe2_Sel = "" ;
      AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV45TFCCTLinTpoIng_Sels ;
      AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV47TFCCTLinTpoDat_Sels ;
      AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV16TFCCVNorma ;
      AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV17TFCCVNorma_Sel ;
      AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV18TFCCVEspe2 ;
      AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV19TFCCVEspe2_Sel ;
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV20TFCCTLinLgoDat ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV21TFCCTLinLgoDat_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV22TFCCTLinPict ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV23TFCCTLinPict_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A4048CCTLinTpoI ,
                                           AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                           A4044CCTLinTpoD ,
                                           AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                           Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels.size()) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels.size()) ,
                                           AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                           AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) ,
                                           Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) ,
                                           AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13249CCVNorma ,
                                           A14345CCVEspe2 ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           A396EmprCod ,
                                           AV42emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV43CCTCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = GXutil.concat( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2), "%", "") ;
      lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict), 40, "%") ;
      /* Using cursor P0AP05 */
      pr_default.execute(3, new Object[] {AV42emprcod, Integer.valueOf(AV43CCTCod), Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin), Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma, AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel, lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2, AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel, Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat), Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to), lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict, AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAP08 = false ;
         A396EmprCod = P0AP05_A396EmprCod[0] ;
         A4031CCTCod = P0AP05_A4031CCTCod[0] ;
         A14345CCVEspe2 = P0AP05_A14345CCVEspe2[0] ;
         A4046CCTLinPict = P0AP05_A4046CCTLinPict[0] ;
         A4045CCTLinLgoD = P0AP05_A4045CCTLinLgoD[0] ;
         A13249CCVNorma = P0AP05_A13249CCVNorma[0] ;
         A14344CCTLinDc2 = P0AP05_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AP05_A4043CCTLinDsc[0] ;
         A4044CCTLinTpoD = P0AP05_A4044CCTLinTpoD[0] ;
         A4048CCTLinTpoI = P0AP05_A4048CCTLinTpoI[0] ;
         A4034CCTLin = P0AP05_A4034CCTLin[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AP05_A14345CCVEspe2[0], A14345CCVEspe2) == 0 ) )
         {
            brkAP08 = false ;
            A396EmprCod = P0AP05_A396EmprCod[0] ;
            A4031CCTCod = P0AP05_A4031CCTCod[0] ;
            A4034CCTLin = P0AP05_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAP08 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A14345CCVEspe2)==0) )
         {
            AV25Option = A14345CCVEspe2 ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAP08 )
         {
            brkAP08 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCCTLINPICTOPTIONS' Routine */
      returnInSub = false ;
      AV22TFCCTLinPict = AV37SearchTxt ;
      AV23TFCCTLinPict_Sel = "" ;
      AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin = AV10TFCCTLin ;
      AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = AV45TFCCTLinTpoIng_Sels ;
      AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = AV47TFCCTLinTpoDat_Sels ;
      AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = AV16TFCCVNorma ;
      AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = AV17TFCCVNorma_Sel ;
      AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = AV18TFCCVEspe2 ;
      AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = AV19TFCCVEspe2_Sel ;
      AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat = AV20TFCCTLinLgoDat ;
      AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to = AV21TFCCTLinLgoDat_To ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = AV22TFCCTLinPict ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = AV23TFCCTLinPict_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A4048CCTLinTpoI ,
                                           AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                           A4044CCTLinTpoD ,
                                           AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                           Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) ,
                                           Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels.size()) ,
                                           Integer.valueOf(AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels.size()) ,
                                           AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                           AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                           Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) ,
                                           Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) ,
                                           AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                           AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13249CCVNorma ,
                                           A14345CCVEspe2 ,
                                           Short.valueOf(A4045CCTLinLgoD) ,
                                           A4046CCTLinPict ,
                                           A396EmprCod ,
                                           AV42emprcod ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV43CCTCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = GXutil.concat( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2), "%", "") ;
      lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = GXutil.padr( GXutil.rtrim( AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict), 40, "%") ;
      /* Using cursor P0AP06 */
      pr_default.execute(4, new Object[] {AV42emprcod, Integer.valueOf(AV43CCTCod), Short.valueOf(AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin), Short.valueOf(AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma, AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel, lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2, AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel, Short.valueOf(AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat), Short.valueOf(AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to), lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict, AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAP010 = false ;
         A396EmprCod = P0AP06_A396EmprCod[0] ;
         A4031CCTCod = P0AP06_A4031CCTCod[0] ;
         A4046CCTLinPict = P0AP06_A4046CCTLinPict[0] ;
         A4045CCTLinLgoD = P0AP06_A4045CCTLinLgoD[0] ;
         A14345CCVEspe2 = P0AP06_A14345CCVEspe2[0] ;
         A13249CCVNorma = P0AP06_A13249CCVNorma[0] ;
         A14344CCTLinDc2 = P0AP06_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AP06_A4043CCTLinDsc[0] ;
         A4044CCTLinTpoD = P0AP06_A4044CCTLinTpoD[0] ;
         A4048CCTLinTpoI = P0AP06_A4048CCTLinTpoI[0] ;
         A4034CCTLin = P0AP06_A4034CCTLin[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AP06_A4046CCTLinPict[0], A4046CCTLinPict) == 0 ) )
         {
            brkAP010 = false ;
            A396EmprCod = P0AP06_A396EmprCod[0] ;
            A4031CCTCod = P0AP06_A4031CCTCod[0] ;
            A4034CCTLin = P0AP06_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAP010 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A4046CCTLinPict)==0) )
         {
            AV25Option = A4046CCTLinPict ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAP010 )
         {
            brkAP010 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccdef1_wpgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = controlcalidad_ccdef1_wpgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = controlcalidad_ccdef1_wpgetfilterdata.this.AV41OptionIndexesJson;
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
      AV44TFCCTLinTpoIng_SelsJson = "" ;
      AV45TFCCTLinTpoIng_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46TFCCTLinTpoDat_SelsJson = "" ;
      AV47TFCCTLinTpoDat_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12TFCCTLinDsc = "" ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV14TFCCTLinDc2 = "" ;
      AV15TFCCTLinDc2_Sel = "" ;
      AV16TFCCVNorma = "" ;
      AV17TFCCVNorma_Sel = "" ;
      AV18TFCCVEspe2 = "" ;
      AV19TFCCVEspe2_Sel = "" ;
      AV22TFCCTLinPict = "" ;
      AV23TFCCTLinPict_Sel = "" ;
      A4043CCTLinDsc = "" ;
      AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = "" ;
      AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel = "" ;
      AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = "" ;
      AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel = "" ;
      AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = "" ;
      AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = "" ;
      AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel = "" ;
      AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = "" ;
      AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel = "" ;
      scmdbuf = "" ;
      lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc = "" ;
      lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 = "" ;
      lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma = "" ;
      lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 = "" ;
      lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict = "" ;
      A4048CCTLinTpoI = "" ;
      A4044CCTLinTpoD = "" ;
      A14344CCTLinDc2 = "" ;
      A13249CCVNorma = "" ;
      A14345CCVEspe2 = "" ;
      A4046CCTLinPict = "" ;
      A396EmprCod = "" ;
      AV42emprcod = "" ;
      P0AP02_A396EmprCod = new String[] {""} ;
      P0AP02_A4031CCTCod = new int[1] ;
      P0AP02_A4043CCTLinDsc = new String[] {""} ;
      P0AP02_A4046CCTLinPict = new String[] {""} ;
      P0AP02_A4045CCTLinLgoD = new short[1] ;
      P0AP02_A14345CCVEspe2 = new String[] {""} ;
      P0AP02_A13249CCVNorma = new String[] {""} ;
      P0AP02_A14344CCTLinDc2 = new String[] {""} ;
      P0AP02_A4044CCTLinTpoD = new String[] {""} ;
      P0AP02_A4048CCTLinTpoI = new String[] {""} ;
      P0AP02_A4034CCTLin = new short[1] ;
      AV25Option = "" ;
      P0AP03_A396EmprCod = new String[] {""} ;
      P0AP03_A4031CCTCod = new int[1] ;
      P0AP03_A14344CCTLinDc2 = new String[] {""} ;
      P0AP03_A4046CCTLinPict = new String[] {""} ;
      P0AP03_A4045CCTLinLgoD = new short[1] ;
      P0AP03_A14345CCVEspe2 = new String[] {""} ;
      P0AP03_A13249CCVNorma = new String[] {""} ;
      P0AP03_A4043CCTLinDsc = new String[] {""} ;
      P0AP03_A4044CCTLinTpoD = new String[] {""} ;
      P0AP03_A4048CCTLinTpoI = new String[] {""} ;
      P0AP03_A4034CCTLin = new short[1] ;
      P0AP04_A396EmprCod = new String[] {""} ;
      P0AP04_A4031CCTCod = new int[1] ;
      P0AP04_A13249CCVNorma = new String[] {""} ;
      P0AP04_A4046CCTLinPict = new String[] {""} ;
      P0AP04_A4045CCTLinLgoD = new short[1] ;
      P0AP04_A14345CCVEspe2 = new String[] {""} ;
      P0AP04_A14344CCTLinDc2 = new String[] {""} ;
      P0AP04_A4043CCTLinDsc = new String[] {""} ;
      P0AP04_A4044CCTLinTpoD = new String[] {""} ;
      P0AP04_A4048CCTLinTpoI = new String[] {""} ;
      P0AP04_A4034CCTLin = new short[1] ;
      P0AP05_A396EmprCod = new String[] {""} ;
      P0AP05_A4031CCTCod = new int[1] ;
      P0AP05_A14345CCVEspe2 = new String[] {""} ;
      P0AP05_A4046CCTLinPict = new String[] {""} ;
      P0AP05_A4045CCTLinLgoD = new short[1] ;
      P0AP05_A13249CCVNorma = new String[] {""} ;
      P0AP05_A14344CCTLinDc2 = new String[] {""} ;
      P0AP05_A4043CCTLinDsc = new String[] {""} ;
      P0AP05_A4044CCTLinTpoD = new String[] {""} ;
      P0AP05_A4048CCTLinTpoI = new String[] {""} ;
      P0AP05_A4034CCTLin = new short[1] ;
      P0AP06_A396EmprCod = new String[] {""} ;
      P0AP06_A4031CCTCod = new int[1] ;
      P0AP06_A4046CCTLinPict = new String[] {""} ;
      P0AP06_A4045CCTLinLgoD = new short[1] ;
      P0AP06_A14345CCVEspe2 = new String[] {""} ;
      P0AP06_A13249CCVNorma = new String[] {""} ;
      P0AP06_A14344CCTLinDc2 = new String[] {""} ;
      P0AP06_A4043CCTLinDsc = new String[] {""} ;
      P0AP06_A4044CCTLinTpoD = new String[] {""} ;
      P0AP06_A4048CCTLinTpoI = new String[] {""} ;
      P0AP06_A4034CCTLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AP02_A396EmprCod, P0AP02_A4031CCTCod, P0AP02_A4043CCTLinDsc, P0AP02_A4046CCTLinPict, P0AP02_A4045CCTLinLgoD, P0AP02_A14345CCVEspe2, P0AP02_A13249CCVNorma, P0AP02_A14344CCTLinDc2, P0AP02_A4044CCTLinTpoD, P0AP02_A4048CCTLinTpoI,
            P0AP02_A4034CCTLin
            }
            , new Object[] {
            P0AP03_A396EmprCod, P0AP03_A4031CCTCod, P0AP03_A14344CCTLinDc2, P0AP03_A4046CCTLinPict, P0AP03_A4045CCTLinLgoD, P0AP03_A14345CCVEspe2, P0AP03_A13249CCVNorma, P0AP03_A4043CCTLinDsc, P0AP03_A4044CCTLinTpoD, P0AP03_A4048CCTLinTpoI,
            P0AP03_A4034CCTLin
            }
            , new Object[] {
            P0AP04_A396EmprCod, P0AP04_A4031CCTCod, P0AP04_A13249CCVNorma, P0AP04_A4046CCTLinPict, P0AP04_A4045CCTLinLgoD, P0AP04_A14345CCVEspe2, P0AP04_A14344CCTLinDc2, P0AP04_A4043CCTLinDsc, P0AP04_A4044CCTLinTpoD, P0AP04_A4048CCTLinTpoI,
            P0AP04_A4034CCTLin
            }
            , new Object[] {
            P0AP05_A396EmprCod, P0AP05_A4031CCTCod, P0AP05_A14345CCVEspe2, P0AP05_A4046CCTLinPict, P0AP05_A4045CCTLinLgoD, P0AP05_A13249CCVNorma, P0AP05_A14344CCTLinDc2, P0AP05_A4043CCTLinDsc, P0AP05_A4044CCTLinTpoD, P0AP05_A4048CCTLinTpoI,
            P0AP05_A4034CCTLin
            }
            , new Object[] {
            P0AP06_A396EmprCod, P0AP06_A4031CCTCod, P0AP06_A4046CCTLinPict, P0AP06_A4045CCTLinLgoD, P0AP06_A14345CCVEspe2, P0AP06_A13249CCVNorma, P0AP06_A14344CCTLinDc2, P0AP06_A4043CCTLinDsc, P0AP06_A4044CCTLinTpoD, P0AP06_A4048CCTLinTpoI,
            P0AP06_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFCCTLin ;
   private short AV11TFCCTLin_To ;
   private short AV20TFCCTLinLgoDat ;
   private short AV21TFCCTLinLgoDat_To ;
   private short AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ;
   private short AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ;
   private short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ;
   private short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short Gx_err ;
   private int AV50GXV1 ;
   private int AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ;
   private int AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ;
   private int A4031CCTCod ;
   private int AV43CCTCod ;
   private long AV30count ;
   private String AV12TFCCTLinDsc ;
   private String AV13TFCCTLinDsc_Sel ;
   private String AV14TFCCTLinDc2 ;
   private String AV15TFCCTLinDc2_Sel ;
   private String AV16TFCCVNorma ;
   private String AV17TFCCVNorma_Sel ;
   private String AV22TFCCTLinPict ;
   private String AV23TFCCTLinPict_Sel ;
   private String A4043CCTLinDsc ;
   private String AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ;
   private String AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ;
   private String AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ;
   private String AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ;
   private String AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ;
   private String AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ;
   private String AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ;
   private String AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ;
   private String scmdbuf ;
   private String lV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ;
   private String lV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ;
   private String lV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ;
   private String lV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ;
   private String A4048CCTLinTpoI ;
   private String A4044CCTLinTpoD ;
   private String A14344CCTLinDc2 ;
   private String A13249CCVNorma ;
   private String A4046CCTLinPict ;
   private String A396EmprCod ;
   private String AV42emprcod ;
   private boolean returnInSub ;
   private boolean brkAP02 ;
   private boolean brkAP04 ;
   private boolean brkAP06 ;
   private boolean brkAP08 ;
   private boolean brkAP010 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV44TFCCTLinTpoIng_SelsJson ;
   private String AV46TFCCTLinTpoDat_SelsJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV18TFCCVEspe2 ;
   private String AV19TFCCVEspe2_Sel ;
   private String AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ;
   private String AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ;
   private String lV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ;
   private String A14345CCVEspe2 ;
   private String AV25Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AP02_A396EmprCod ;
   private int[] P0AP02_A4031CCTCod ;
   private String[] P0AP02_A4043CCTLinDsc ;
   private String[] P0AP02_A4046CCTLinPict ;
   private short[] P0AP02_A4045CCTLinLgoD ;
   private String[] P0AP02_A14345CCVEspe2 ;
   private String[] P0AP02_A13249CCVNorma ;
   private String[] P0AP02_A14344CCTLinDc2 ;
   private String[] P0AP02_A4044CCTLinTpoD ;
   private String[] P0AP02_A4048CCTLinTpoI ;
   private short[] P0AP02_A4034CCTLin ;
   private String[] P0AP03_A396EmprCod ;
   private int[] P0AP03_A4031CCTCod ;
   private String[] P0AP03_A14344CCTLinDc2 ;
   private String[] P0AP03_A4046CCTLinPict ;
   private short[] P0AP03_A4045CCTLinLgoD ;
   private String[] P0AP03_A14345CCVEspe2 ;
   private String[] P0AP03_A13249CCVNorma ;
   private String[] P0AP03_A4043CCTLinDsc ;
   private String[] P0AP03_A4044CCTLinTpoD ;
   private String[] P0AP03_A4048CCTLinTpoI ;
   private short[] P0AP03_A4034CCTLin ;
   private String[] P0AP04_A396EmprCod ;
   private int[] P0AP04_A4031CCTCod ;
   private String[] P0AP04_A13249CCVNorma ;
   private String[] P0AP04_A4046CCTLinPict ;
   private short[] P0AP04_A4045CCTLinLgoD ;
   private String[] P0AP04_A14345CCVEspe2 ;
   private String[] P0AP04_A14344CCTLinDc2 ;
   private String[] P0AP04_A4043CCTLinDsc ;
   private String[] P0AP04_A4044CCTLinTpoD ;
   private String[] P0AP04_A4048CCTLinTpoI ;
   private short[] P0AP04_A4034CCTLin ;
   private String[] P0AP05_A396EmprCod ;
   private int[] P0AP05_A4031CCTCod ;
   private String[] P0AP05_A14345CCVEspe2 ;
   private String[] P0AP05_A4046CCTLinPict ;
   private short[] P0AP05_A4045CCTLinLgoD ;
   private String[] P0AP05_A13249CCVNorma ;
   private String[] P0AP05_A14344CCTLinDc2 ;
   private String[] P0AP05_A4043CCTLinDsc ;
   private String[] P0AP05_A4044CCTLinTpoD ;
   private String[] P0AP05_A4048CCTLinTpoI ;
   private short[] P0AP05_A4034CCTLin ;
   private String[] P0AP06_A396EmprCod ;
   private int[] P0AP06_A4031CCTCod ;
   private String[] P0AP06_A4046CCTLinPict ;
   private short[] P0AP06_A4045CCTLinLgoD ;
   private String[] P0AP06_A14345CCVEspe2 ;
   private String[] P0AP06_A13249CCVNorma ;
   private String[] P0AP06_A14344CCTLinDc2 ;
   private String[] P0AP06_A4043CCTLinDsc ;
   private String[] P0AP06_A4044CCTLinTpoD ;
   private String[] P0AP06_A4048CCTLinTpoI ;
   private short[] P0AP06_A4034CCTLin ;
   private GXSimpleCollection<String> AV45TFCCTLinTpoIng_Sels ;
   private GXSimpleCollection<String> AV47TFCCTLinTpoDat_Sels ;
   private GXSimpleCollection<String> AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ;
   private GXSimpleCollection<String> AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class controlcalidad_ccdef1_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AP02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4048CCTLinTpoI ,
                                          GXSimpleCollection<String> AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                          short AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ,
                                          short AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ,
                                          int AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ,
                                          int AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ,
                                          String AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                          String AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                          short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ,
                                          short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13249CCVNorma ,
                                          String A14345CCVEspe2 ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          String A396EmprCod ,
                                          String AV42emprcod ,
                                          int A4031CCTCod ,
                                          int AV43CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCTLinDsc, CCTLinPict, CCTLinLgoD, CCVEspe2, CCVNorma, CCTLinDc2, CCTLinTpoD, CCTLinTpoI, CCTLin FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (0==AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels, "CCTLinTpoI IN (", ")")+")");
      }
      if ( AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) )
      {
         addWhere(sWhereString, "(CCVNorma = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVEspe2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) )
      {
         addWhere(sWhereString, "(CCVEspe2 = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTLinDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AP03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4048CCTLinTpoI ,
                                          GXSimpleCollection<String> AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                          short AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ,
                                          short AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ,
                                          int AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ,
                                          int AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ,
                                          String AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                          String AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                          short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ,
                                          short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13249CCVNorma ,
                                          String A14345CCVEspe2 ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          String A396EmprCod ,
                                          String AV42emprcod ,
                                          int A4031CCTCod ,
                                          int AV43CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[16];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCTLinDc2, CCTLinPict, CCTLinLgoD, CCVEspe2, CCVNorma, CCTLinDsc, CCTLinTpoD, CCTLinTpoI, CCTLin FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (0==AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels, "CCTLinTpoI IN (", ")")+")");
      }
      if ( AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) )
      {
         addWhere(sWhereString, "(CCVNorma = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVEspe2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) )
      {
         addWhere(sWhereString, "(CCVEspe2 = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTLinDc2" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0AP04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4048CCTLinTpoI ,
                                          GXSimpleCollection<String> AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                          short AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ,
                                          short AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ,
                                          int AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ,
                                          int AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ,
                                          String AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                          String AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                          short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ,
                                          short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13249CCVNorma ,
                                          String A14345CCVEspe2 ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          String A396EmprCod ,
                                          String AV42emprcod ,
                                          int A4031CCTCod ,
                                          int AV43CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[16];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCVNorma, CCTLinPict, CCTLinLgoD, CCVEspe2, CCTLinDc2, CCTLinDsc, CCTLinTpoD, CCTLinTpoI, CCTLin FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (0==AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels, "CCTLinTpoI IN (", ")")+")");
      }
      if ( AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) )
      {
         addWhere(sWhereString, "(CCVNorma = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVEspe2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) )
      {
         addWhere(sWhereString, "(CCVEspe2 = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCVNorma" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AP05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4048CCTLinTpoI ,
                                          GXSimpleCollection<String> AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                          short AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ,
                                          short AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ,
                                          int AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ,
                                          int AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ,
                                          String AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                          String AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                          short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ,
                                          short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13249CCVNorma ,
                                          String A14345CCVEspe2 ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          String A396EmprCod ,
                                          String AV42emprcod ,
                                          int A4031CCTCod ,
                                          int AV43CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[16];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCVEspe2, CCTLinPict, CCTLinLgoD, CCVNorma, CCTLinDc2, CCTLinDsc, CCTLinTpoD, CCTLinTpoI, CCTLin FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (0==AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels, "CCTLinTpoI IN (", ")")+")");
      }
      if ( AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) )
      {
         addWhere(sWhereString, "(CCVNorma = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVEspe2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) )
      {
         addWhere(sWhereString, "(CCVEspe2 = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCVEspe2" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0AP06( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A4048CCTLinTpoI ,
                                          GXSimpleCollection<String> AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels ,
                                          String A4044CCTLinTpoD ,
                                          GXSimpleCollection<String> AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels ,
                                          short AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin ,
                                          short AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to ,
                                          int AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size ,
                                          int AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size ,
                                          String AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma ,
                                          String AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2 ,
                                          short AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat ,
                                          short AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to ,
                                          String AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel ,
                                          String AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13249CCVNorma ,
                                          String A14345CCVEspe2 ,
                                          short A4045CCTLinLgoD ,
                                          String A4046CCTLinPict ,
                                          String A396EmprCod ,
                                          String AV42emprcod ,
                                          int A4031CCTCod ,
                                          int AV43CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[16];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTCod, CCTLinPict, CCTLinLgoD, CCVEspe2, CCVNorma, CCTLinDc2, CCTLinDsc, CCTLinTpoD, CCTLinTpoI, CCTLin FROM TXPCCDef1" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CCTCod = ?)");
      if ( ! (0==AV52Controlcalidadhtd_controlcalidad_ccdef1_wpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(CCTLin >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidad_ccdef1_wpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(CCTLin <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Controlcalidadhtd_controlcalidad_ccdef1_wpds_3_tfcctlintpoing_sels, "CCTLinTpoI IN (", ")")+")");
      }
      if ( AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV55Controlcalidadhtd_controlcalidad_ccdef1_wpds_4_tfcctlintpodat_sels, "CCTLinTpoD IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_ccdef1_wpds_5_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccdef1_wpds_6_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDsc = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_ccdef1_wpds_7_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccdef1_wpds_8_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_ccdef1_wpds_9_tfccvnorma)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVNorma) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_ccdef1_wpds_10_tfccvnorma_sel)==0) )
      {
         addWhere(sWhereString, "(CCVNorma = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_ccdef1_wpds_11_tfccvespe2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCVEspe2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_ccdef1_wpds_12_tfccvespe2_sel)==0) )
      {
         addWhere(sWhereString, "(CCVEspe2 = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV64Controlcalidadhtd_controlcalidad_ccdef1_wpds_13_tfcctlinlgodat) )
      {
         addWhere(sWhereString, "(CCTLinLgoD >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV65Controlcalidadhtd_controlcalidad_ccdef1_wpds_14_tfcctlinlgodat_to) )
      {
         addWhere(sWhereString, "(CCTLinLgoD <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) && ( ! (GXutil.strcmp("", AV66Controlcalidadhtd_controlcalidad_ccdef1_wpds_15_tfcctlinpict)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTLinPict) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Controlcalidadhtd_controlcalidad_ccdef1_wpds_16_tfcctlinpict_sel)==0) )
      {
         addWhere(sWhereString, "(CCTLinPict = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTLinPict" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P0AP02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() );
            case 1 :
                  return conditional_P0AP03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() );
            case 2 :
                  return conditional_P0AP04(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() );
            case 3 :
                  return conditional_P0AP05(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() );
            case 4 :
                  return conditional_P0AP06(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AP02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AP03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AP04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AP05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AP06", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 60);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 300);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 300);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 300);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 300);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 300);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 300);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 40);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 300);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 300);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 40);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 300);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 300);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 40);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 40);
               }
               return;
      }
   }

}

