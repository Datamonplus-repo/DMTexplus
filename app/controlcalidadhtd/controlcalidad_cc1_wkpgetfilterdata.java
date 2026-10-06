package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc1_wkpgetfilterdata extends GXProcedure
{
   public controlcalidad_cc1_wkpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc1_wkpgetfilterdata.class ), "" );
   }

   public controlcalidad_cc1_wkpgetfilterdata( int remoteHandle ,
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
      controlcalidad_cc1_wkpgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidad_cc1_wkpgetfilterdata.this.AV36DDOName = aP0;
      controlcalidad_cc1_wkpgetfilterdata.this.AV37SearchTxt = aP1;
      controlcalidad_cc1_wkpgetfilterdata.this.AV38SearchTxtTo = aP2;
      controlcalidad_cc1_wkpgetfilterdata.this.aP3 = aP3;
      controlcalidad_cc1_wkpgetfilterdata.this.aP4 = aP4;
      controlcalidad_cc1_wkpgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCMETODO") == 0 )
      {
         /* Execute user subroutine: 'LOADCCMETODOOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCESPECIF") == 0 )
      {
         /* Execute user subroutine: 'LOADCCESPECIFOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CCVAL") == 0 )
      {
         /* Execute user subroutine: 'LOADCCVALOPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("ControlCalidadHTD.ControlCalidad_CC1_WKPGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CC1_WKPGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("ControlCalidadHTD.ControlCalidad_CC1_WKPGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTLIN") == 0 )
         {
            AV10TFCCTLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCMETODO") == 0 )
         {
            AV16TFCCMetodo = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCMETODO_SEL") == 0 )
         {
            AV17TFCCMetodo_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCESPECIF") == 0 )
         {
            AV18TFCCEspecif = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCESPECIF_SEL") == 0 )
         {
            AV19TFCCEspecif_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL") == 0 )
         {
            AV20TFCCVal = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCVAL_SEL") == 0 )
         {
            AV21TFCCVal_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTLINDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTLinDsc = AV37SearchTxt ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV10TFCCTLin ;
      AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV16TFCCMetodo ;
      AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV17TFCCMetodo_Sel ;
      AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV18TFCCEspecif ;
      AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV19TFCCEspecif_Sel ;
      AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV20TFCCVal ;
      AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV21TFCCVal_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) ,
                                           Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) ,
                                           AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                           AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                           AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13251CCMetodo ,
                                           A13252CCEspecif ,
                                           A4035CCVal ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           A758ProCod ,
                                           AV46Procod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Short.valueOf(AV47Barordlin) ,
                                           AV42EmprCod ,
                                           Integer.valueOf(AV48CCtcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4031CCTCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval), 40, "%") ;
      /* Using cursor P0AQ02 */
      pr_default.execute(0, new Object[] {AV42EmprCod, Integer.valueOf(AV48CCtcod), Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45BarCodPar, AV46Procod, Short.valueOf(AV47Barordlin), Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin), Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo, AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel, lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif, AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel, lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval, AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAQ02 = false ;
         A4034CCTLin = P0AQ02_A4034CCTLin[0] ;
         A4031CCTCod = P0AQ02_A4031CCTCod[0] ;
         A396EmprCod = P0AQ02_A396EmprCod[0] ;
         A194BarOrdLin = P0AQ02_A194BarOrdLin[0] ;
         A758ProCod = P0AQ02_A758ProCod[0] ;
         A130BarCodPar = P0AQ02_A130BarCodPar[0] ;
         A132BarCodReo = P0AQ02_A132BarCodReo[0] ;
         A129BarCod = P0AQ02_A129BarCod[0] ;
         A4035CCVal = P0AQ02_A4035CCVal[0] ;
         A13252CCEspecif = P0AQ02_A13252CCEspecif[0] ;
         A13251CCMetodo = P0AQ02_A13251CCMetodo[0] ;
         A14344CCTLinDc2 = P0AQ02_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ02_A4043CCTLinDsc[0] ;
         A14344CCTLinDc2 = P0AQ02_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ02_A4043CCTLinDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AQ02_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AQ02_A4031CCTCod[0] == A4031CCTCod ) && ( P0AQ02_A4034CCTLin[0] == A4034CCTLin ) )
         {
            brkAQ02 = false ;
            A194BarOrdLin = P0AQ02_A194BarOrdLin[0] ;
            A758ProCod = P0AQ02_A758ProCod[0] ;
            A130BarCodPar = P0AQ02_A130BarCodPar[0] ;
            A132BarCodReo = P0AQ02_A132BarCodReo[0] ;
            A129BarCod = P0AQ02_A129BarCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAQ02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4043CCTLinDsc)==0) )
         {
            AV25Option = A4043CCTLinDsc ;
            AV24InsertIndex = 1 ;
            while ( ( AV24InsertIndex <= AV26Options.size() ) && ( GXutil.strcmp((String)AV26Options.elementAt(-1+AV24InsertIndex), AV25Option) < 0 ) )
            {
               AV24InsertIndex = (int)(AV24InsertIndex+1) ;
            }
            AV26Options.add(AV25Option, AV24InsertIndex);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV24InsertIndex);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQ02 )
         {
            brkAQ02 = true ;
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
      AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV10TFCCTLin ;
      AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV16TFCCMetodo ;
      AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV17TFCCMetodo_Sel ;
      AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV18TFCCEspecif ;
      AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV19TFCCEspecif_Sel ;
      AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV20TFCCVal ;
      AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV21TFCCVal_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) ,
                                           Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) ,
                                           AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                           AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                           AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13251CCMetodo ,
                                           A13252CCEspecif ,
                                           A4035CCVal ,
                                           A396EmprCod ,
                                           AV42EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           A758ProCod ,
                                           AV46Procod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Short.valueOf(AV47Barordlin) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV48CCtcod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval), 40, "%") ;
      /* Using cursor P0AQ03 */
      pr_default.execute(1, new Object[] {AV42EmprCod, Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45BarCodPar, AV46Procod, Short.valueOf(AV47Barordlin), Integer.valueOf(AV48CCtcod), Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin), Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo, AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel, lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif, AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel, lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval, AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAQ04 = false ;
         A396EmprCod = P0AQ03_A396EmprCod[0] ;
         A129BarCod = P0AQ03_A129BarCod[0] ;
         A132BarCodReo = P0AQ03_A132BarCodReo[0] ;
         A130BarCodPar = P0AQ03_A130BarCodPar[0] ;
         A758ProCod = P0AQ03_A758ProCod[0] ;
         A194BarOrdLin = P0AQ03_A194BarOrdLin[0] ;
         A4031CCTCod = P0AQ03_A4031CCTCod[0] ;
         A14344CCTLinDc2 = P0AQ03_A14344CCTLinDc2[0] ;
         A4035CCVal = P0AQ03_A4035CCVal[0] ;
         A13252CCEspecif = P0AQ03_A13252CCEspecif[0] ;
         A13251CCMetodo = P0AQ03_A13251CCMetodo[0] ;
         A4043CCTLinDsc = P0AQ03_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AQ03_A4034CCTLin[0] ;
         A14344CCTLinDc2 = P0AQ03_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ03_A4043CCTLinDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AQ03_A14344CCTLinDc2[0], A14344CCTLinDc2) == 0 ) )
         {
            brkAQ04 = false ;
            A396EmprCod = P0AQ03_A396EmprCod[0] ;
            A129BarCod = P0AQ03_A129BarCod[0] ;
            A132BarCodReo = P0AQ03_A132BarCodReo[0] ;
            A130BarCodPar = P0AQ03_A130BarCodPar[0] ;
            A758ProCod = P0AQ03_A758ProCod[0] ;
            A194BarOrdLin = P0AQ03_A194BarOrdLin[0] ;
            A4031CCTCod = P0AQ03_A4031CCTCod[0] ;
            A4034CCTLin = P0AQ03_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAQ04 = true ;
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
         if ( ! brkAQ04 )
         {
            brkAQ04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCCMETODOOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCCMetodo = AV37SearchTxt ;
      AV17TFCCMetodo_Sel = "" ;
      AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV10TFCCTLin ;
      AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV16TFCCMetodo ;
      AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV17TFCCMetodo_Sel ;
      AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV18TFCCEspecif ;
      AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV19TFCCEspecif_Sel ;
      AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV20TFCCVal ;
      AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV21TFCCVal_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) ,
                                           Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) ,
                                           AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                           AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                           AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13251CCMetodo ,
                                           A13252CCEspecif ,
                                           A4035CCVal ,
                                           A396EmprCod ,
                                           AV42EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           A758ProCod ,
                                           AV46Procod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Short.valueOf(AV47Barordlin) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV48CCtcod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval), 40, "%") ;
      /* Using cursor P0AQ04 */
      pr_default.execute(2, new Object[] {AV42EmprCod, Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45BarCodPar, AV46Procod, Short.valueOf(AV47Barordlin), Integer.valueOf(AV48CCtcod), Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin), Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo, AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel, lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif, AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel, lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval, AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAQ06 = false ;
         A396EmprCod = P0AQ04_A396EmprCod[0] ;
         A129BarCod = P0AQ04_A129BarCod[0] ;
         A132BarCodReo = P0AQ04_A132BarCodReo[0] ;
         A130BarCodPar = P0AQ04_A130BarCodPar[0] ;
         A758ProCod = P0AQ04_A758ProCod[0] ;
         A194BarOrdLin = P0AQ04_A194BarOrdLin[0] ;
         A4031CCTCod = P0AQ04_A4031CCTCod[0] ;
         A13251CCMetodo = P0AQ04_A13251CCMetodo[0] ;
         A4035CCVal = P0AQ04_A4035CCVal[0] ;
         A13252CCEspecif = P0AQ04_A13252CCEspecif[0] ;
         A14344CCTLinDc2 = P0AQ04_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ04_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AQ04_A4034CCTLin[0] ;
         A14344CCTLinDc2 = P0AQ04_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ04_A4043CCTLinDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AQ04_A13251CCMetodo[0], A13251CCMetodo) == 0 ) )
         {
            brkAQ06 = false ;
            A396EmprCod = P0AQ04_A396EmprCod[0] ;
            A129BarCod = P0AQ04_A129BarCod[0] ;
            A132BarCodReo = P0AQ04_A132BarCodReo[0] ;
            A130BarCodPar = P0AQ04_A130BarCodPar[0] ;
            A758ProCod = P0AQ04_A758ProCod[0] ;
            A194BarOrdLin = P0AQ04_A194BarOrdLin[0] ;
            A4031CCTCod = P0AQ04_A4031CCTCod[0] ;
            A4034CCTLin = P0AQ04_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAQ06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A13251CCMetodo)==0) )
         {
            AV25Option = A13251CCMetodo ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQ06 )
         {
            brkAQ06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADCCESPECIFOPTIONS' Routine */
      returnInSub = false ;
      AV18TFCCEspecif = AV37SearchTxt ;
      AV19TFCCEspecif_Sel = "" ;
      AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV10TFCCTLin ;
      AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV16TFCCMetodo ;
      AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV17TFCCMetodo_Sel ;
      AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV18TFCCEspecif ;
      AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV19TFCCEspecif_Sel ;
      AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV20TFCCVal ;
      AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV21TFCCVal_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) ,
                                           Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) ,
                                           AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                           AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                           AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13251CCMetodo ,
                                           A13252CCEspecif ,
                                           A4035CCVal ,
                                           A396EmprCod ,
                                           AV42EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           A758ProCod ,
                                           AV46Procod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Short.valueOf(AV47Barordlin) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV48CCtcod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval), 40, "%") ;
      /* Using cursor P0AQ05 */
      pr_default.execute(3, new Object[] {AV42EmprCod, Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45BarCodPar, AV46Procod, Short.valueOf(AV47Barordlin), Integer.valueOf(AV48CCtcod), Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin), Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo, AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel, lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif, AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel, lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval, AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAQ08 = false ;
         A396EmprCod = P0AQ05_A396EmprCod[0] ;
         A129BarCod = P0AQ05_A129BarCod[0] ;
         A132BarCodReo = P0AQ05_A132BarCodReo[0] ;
         A130BarCodPar = P0AQ05_A130BarCodPar[0] ;
         A758ProCod = P0AQ05_A758ProCod[0] ;
         A194BarOrdLin = P0AQ05_A194BarOrdLin[0] ;
         A4031CCTCod = P0AQ05_A4031CCTCod[0] ;
         A13252CCEspecif = P0AQ05_A13252CCEspecif[0] ;
         A4035CCVal = P0AQ05_A4035CCVal[0] ;
         A13251CCMetodo = P0AQ05_A13251CCMetodo[0] ;
         A14344CCTLinDc2 = P0AQ05_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ05_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AQ05_A4034CCTLin[0] ;
         A14344CCTLinDc2 = P0AQ05_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ05_A4043CCTLinDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AQ05_A13252CCEspecif[0], A13252CCEspecif) == 0 ) )
         {
            brkAQ08 = false ;
            A396EmprCod = P0AQ05_A396EmprCod[0] ;
            A129BarCod = P0AQ05_A129BarCod[0] ;
            A132BarCodReo = P0AQ05_A132BarCodReo[0] ;
            A130BarCodPar = P0AQ05_A130BarCodPar[0] ;
            A758ProCod = P0AQ05_A758ProCod[0] ;
            A194BarOrdLin = P0AQ05_A194BarOrdLin[0] ;
            A4031CCTCod = P0AQ05_A4031CCTCod[0] ;
            A4034CCTLin = P0AQ05_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAQ08 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A13252CCEspecif)==0) )
         {
            AV25Option = A13252CCEspecif ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQ08 )
         {
            brkAQ08 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCCVALOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCCVal = AV37SearchTxt ;
      AV21TFCCVal_Sel = "" ;
      AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin = AV10TFCCTLin ;
      AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to = AV11TFCCTLin_To ;
      AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = AV12TFCCTLinDsc ;
      AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = AV13TFCCTLinDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = AV14TFCCTLinDc2 ;
      AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = AV15TFCCTLinDc2_Sel ;
      AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = AV16TFCCMetodo ;
      AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = AV17TFCCMetodo_Sel ;
      AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = AV18TFCCEspecif ;
      AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = AV19TFCCEspecif_Sel ;
      AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = AV20TFCCVal ;
      AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = AV21TFCCVal_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) ,
                                           Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) ,
                                           AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                           AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                           AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                           AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                           AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                           AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                           AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                           AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                           Short.valueOf(A4034CCTLin) ,
                                           A4043CCTLinDsc ,
                                           A14344CCTLinDc2 ,
                                           A13251CCMetodo ,
                                           A13252CCEspecif ,
                                           A4035CCVal ,
                                           A396EmprCod ,
                                           AV42EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV43Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV44Barcodreo) ,
                                           A130BarCodPar ,
                                           AV45BarCodPar ,
                                           A758ProCod ,
                                           AV46Procod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           Short.valueOf(AV47Barordlin) ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           Integer.valueOf(AV48CCtcod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc), 30, "%") ;
      lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2), 60, "%") ;
      lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = GXutil.padr( GXutil.rtrim( AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo), 30, "%") ;
      lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = GXutil.padr( GXutil.rtrim( AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif), 30, "%") ;
      lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = GXutil.padr( GXutil.rtrim( AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval), 40, "%") ;
      /* Using cursor P0AQ06 */
      pr_default.execute(4, new Object[] {AV42EmprCod, Integer.valueOf(AV43Barcod), Byte.valueOf(AV44Barcodreo), AV45BarCodPar, AV46Procod, Short.valueOf(AV47Barordlin), Integer.valueOf(AV48CCtcod), Short.valueOf(AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin), Short.valueOf(AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to), lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc, AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel, lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2, AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel, lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo, AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel, lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif, AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel, lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval, AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAQ010 = false ;
         A396EmprCod = P0AQ06_A396EmprCod[0] ;
         A129BarCod = P0AQ06_A129BarCod[0] ;
         A132BarCodReo = P0AQ06_A132BarCodReo[0] ;
         A130BarCodPar = P0AQ06_A130BarCodPar[0] ;
         A758ProCod = P0AQ06_A758ProCod[0] ;
         A194BarOrdLin = P0AQ06_A194BarOrdLin[0] ;
         A4031CCTCod = P0AQ06_A4031CCTCod[0] ;
         A4035CCVal = P0AQ06_A4035CCVal[0] ;
         A13252CCEspecif = P0AQ06_A13252CCEspecif[0] ;
         A13251CCMetodo = P0AQ06_A13251CCMetodo[0] ;
         A14344CCTLinDc2 = P0AQ06_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ06_A4043CCTLinDsc[0] ;
         A4034CCTLin = P0AQ06_A4034CCTLin[0] ;
         A14344CCTLinDc2 = P0AQ06_A14344CCTLinDc2[0] ;
         A4043CCTLinDsc = P0AQ06_A4043CCTLinDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AQ06_A4035CCVal[0], A4035CCVal) == 0 ) )
         {
            brkAQ010 = false ;
            A396EmprCod = P0AQ06_A396EmprCod[0] ;
            A129BarCod = P0AQ06_A129BarCod[0] ;
            A132BarCodReo = P0AQ06_A132BarCodReo[0] ;
            A130BarCodPar = P0AQ06_A130BarCodPar[0] ;
            A758ProCod = P0AQ06_A758ProCod[0] ;
            A194BarOrdLin = P0AQ06_A194BarOrdLin[0] ;
            A4031CCTCod = P0AQ06_A4031CCTCod[0] ;
            A4034CCTLin = P0AQ06_A4034CCTLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAQ010 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A4035CCVal)==0) )
         {
            AV25Option = A4035CCVal ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAQ010 )
         {
            brkAQ010 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_cc1_wkpgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = controlcalidad_cc1_wkpgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = controlcalidad_cc1_wkpgetfilterdata.this.AV41OptionIndexesJson;
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
      AV12TFCCTLinDsc = "" ;
      AV13TFCCTLinDsc_Sel = "" ;
      AV14TFCCTLinDc2 = "" ;
      AV15TFCCTLinDc2_Sel = "" ;
      AV16TFCCMetodo = "" ;
      AV17TFCCMetodo_Sel = "" ;
      AV18TFCCEspecif = "" ;
      AV19TFCCEspecif_Sel = "" ;
      AV20TFCCVal = "" ;
      AV21TFCCVal_Sel = "" ;
      A4043CCTLinDsc = "" ;
      AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = "" ;
      AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel = "" ;
      AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = "" ;
      AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel = "" ;
      AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = "" ;
      AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel = "" ;
      AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = "" ;
      AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel = "" ;
      AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = "" ;
      AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel = "" ;
      scmdbuf = "" ;
      lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc = "" ;
      lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 = "" ;
      lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo = "" ;
      lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif = "" ;
      lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval = "" ;
      A14344CCTLinDc2 = "" ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      A4035CCVal = "" ;
      A130BarCodPar = "" ;
      AV45BarCodPar = "" ;
      A758ProCod = "" ;
      AV46Procod = "" ;
      AV42EmprCod = "" ;
      A396EmprCod = "" ;
      P0AQ02_A4034CCTLin = new short[1] ;
      P0AQ02_A4031CCTCod = new int[1] ;
      P0AQ02_A396EmprCod = new String[] {""} ;
      P0AQ02_A194BarOrdLin = new short[1] ;
      P0AQ02_A758ProCod = new String[] {""} ;
      P0AQ02_A130BarCodPar = new String[] {""} ;
      P0AQ02_A132BarCodReo = new byte[1] ;
      P0AQ02_A129BarCod = new int[1] ;
      P0AQ02_A4035CCVal = new String[] {""} ;
      P0AQ02_A13252CCEspecif = new String[] {""} ;
      P0AQ02_A13251CCMetodo = new String[] {""} ;
      P0AQ02_A14344CCTLinDc2 = new String[] {""} ;
      P0AQ02_A4043CCTLinDsc = new String[] {""} ;
      AV25Option = "" ;
      P0AQ03_A396EmprCod = new String[] {""} ;
      P0AQ03_A129BarCod = new int[1] ;
      P0AQ03_A132BarCodReo = new byte[1] ;
      P0AQ03_A130BarCodPar = new String[] {""} ;
      P0AQ03_A758ProCod = new String[] {""} ;
      P0AQ03_A194BarOrdLin = new short[1] ;
      P0AQ03_A4031CCTCod = new int[1] ;
      P0AQ03_A14344CCTLinDc2 = new String[] {""} ;
      P0AQ03_A4035CCVal = new String[] {""} ;
      P0AQ03_A13252CCEspecif = new String[] {""} ;
      P0AQ03_A13251CCMetodo = new String[] {""} ;
      P0AQ03_A4043CCTLinDsc = new String[] {""} ;
      P0AQ03_A4034CCTLin = new short[1] ;
      P0AQ04_A396EmprCod = new String[] {""} ;
      P0AQ04_A129BarCod = new int[1] ;
      P0AQ04_A132BarCodReo = new byte[1] ;
      P0AQ04_A130BarCodPar = new String[] {""} ;
      P0AQ04_A758ProCod = new String[] {""} ;
      P0AQ04_A194BarOrdLin = new short[1] ;
      P0AQ04_A4031CCTCod = new int[1] ;
      P0AQ04_A13251CCMetodo = new String[] {""} ;
      P0AQ04_A4035CCVal = new String[] {""} ;
      P0AQ04_A13252CCEspecif = new String[] {""} ;
      P0AQ04_A14344CCTLinDc2 = new String[] {""} ;
      P0AQ04_A4043CCTLinDsc = new String[] {""} ;
      P0AQ04_A4034CCTLin = new short[1] ;
      P0AQ05_A396EmprCod = new String[] {""} ;
      P0AQ05_A129BarCod = new int[1] ;
      P0AQ05_A132BarCodReo = new byte[1] ;
      P0AQ05_A130BarCodPar = new String[] {""} ;
      P0AQ05_A758ProCod = new String[] {""} ;
      P0AQ05_A194BarOrdLin = new short[1] ;
      P0AQ05_A4031CCTCod = new int[1] ;
      P0AQ05_A13252CCEspecif = new String[] {""} ;
      P0AQ05_A4035CCVal = new String[] {""} ;
      P0AQ05_A13251CCMetodo = new String[] {""} ;
      P0AQ05_A14344CCTLinDc2 = new String[] {""} ;
      P0AQ05_A4043CCTLinDsc = new String[] {""} ;
      P0AQ05_A4034CCTLin = new short[1] ;
      P0AQ06_A396EmprCod = new String[] {""} ;
      P0AQ06_A129BarCod = new int[1] ;
      P0AQ06_A132BarCodReo = new byte[1] ;
      P0AQ06_A130BarCodPar = new String[] {""} ;
      P0AQ06_A758ProCod = new String[] {""} ;
      P0AQ06_A194BarOrdLin = new short[1] ;
      P0AQ06_A4031CCTCod = new int[1] ;
      P0AQ06_A4035CCVal = new String[] {""} ;
      P0AQ06_A13252CCEspecif = new String[] {""} ;
      P0AQ06_A13251CCMetodo = new String[] {""} ;
      P0AQ06_A14344CCTLinDc2 = new String[] {""} ;
      P0AQ06_A4043CCTLinDsc = new String[] {""} ;
      P0AQ06_A4034CCTLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc1_wkpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AQ02_A4034CCTLin, P0AQ02_A4031CCTCod, P0AQ02_A396EmprCod, P0AQ02_A194BarOrdLin, P0AQ02_A758ProCod, P0AQ02_A130BarCodPar, P0AQ02_A132BarCodReo, P0AQ02_A129BarCod, P0AQ02_A4035CCVal, P0AQ02_A13252CCEspecif,
            P0AQ02_A13251CCMetodo, P0AQ02_A14344CCTLinDc2, P0AQ02_A4043CCTLinDsc
            }
            , new Object[] {
            P0AQ03_A396EmprCod, P0AQ03_A129BarCod, P0AQ03_A132BarCodReo, P0AQ03_A130BarCodPar, P0AQ03_A758ProCod, P0AQ03_A194BarOrdLin, P0AQ03_A4031CCTCod, P0AQ03_A14344CCTLinDc2, P0AQ03_A4035CCVal, P0AQ03_A13252CCEspecif,
            P0AQ03_A13251CCMetodo, P0AQ03_A4043CCTLinDsc, P0AQ03_A4034CCTLin
            }
            , new Object[] {
            P0AQ04_A396EmprCod, P0AQ04_A129BarCod, P0AQ04_A132BarCodReo, P0AQ04_A130BarCodPar, P0AQ04_A758ProCod, P0AQ04_A194BarOrdLin, P0AQ04_A4031CCTCod, P0AQ04_A13251CCMetodo, P0AQ04_A4035CCVal, P0AQ04_A13252CCEspecif,
            P0AQ04_A14344CCTLinDc2, P0AQ04_A4043CCTLinDsc, P0AQ04_A4034CCTLin
            }
            , new Object[] {
            P0AQ05_A396EmprCod, P0AQ05_A129BarCod, P0AQ05_A132BarCodReo, P0AQ05_A130BarCodPar, P0AQ05_A758ProCod, P0AQ05_A194BarOrdLin, P0AQ05_A4031CCTCod, P0AQ05_A13252CCEspecif, P0AQ05_A4035CCVal, P0AQ05_A13251CCMetodo,
            P0AQ05_A14344CCTLinDc2, P0AQ05_A4043CCTLinDsc, P0AQ05_A4034CCTLin
            }
            , new Object[] {
            P0AQ06_A396EmprCod, P0AQ06_A129BarCod, P0AQ06_A132BarCodReo, P0AQ06_A130BarCodPar, P0AQ06_A758ProCod, P0AQ06_A194BarOrdLin, P0AQ06_A4031CCTCod, P0AQ06_A4035CCVal, P0AQ06_A13252CCEspecif, P0AQ06_A13251CCMetodo,
            P0AQ06_A14344CCTLinDc2, P0AQ06_A4043CCTLinDsc, P0AQ06_A4034CCTLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV44Barcodreo ;
   private short AV10TFCCTLin ;
   private short AV11TFCCTLin_To ;
   private short AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ;
   private short AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ;
   private short A4034CCTLin ;
   private short A194BarOrdLin ;
   private short AV47Barordlin ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int A129BarCod ;
   private int AV43Barcod ;
   private int AV48CCtcod ;
   private int A4031CCTCod ;
   private int AV24InsertIndex ;
   private long AV30count ;
   private String AV12TFCCTLinDsc ;
   private String AV13TFCCTLinDsc_Sel ;
   private String AV14TFCCTLinDc2 ;
   private String AV15TFCCTLinDc2_Sel ;
   private String AV16TFCCMetodo ;
   private String AV17TFCCMetodo_Sel ;
   private String AV18TFCCEspecif ;
   private String AV19TFCCEspecif_Sel ;
   private String AV20TFCCVal ;
   private String AV21TFCCVal_Sel ;
   private String A4043CCTLinDsc ;
   private String AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ;
   private String AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ;
   private String AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ;
   private String AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ;
   private String AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ;
   private String AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ;
   private String AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ;
   private String AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ;
   private String AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ;
   private String AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ;
   private String scmdbuf ;
   private String lV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ;
   private String lV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ;
   private String lV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ;
   private String lV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ;
   private String lV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ;
   private String A14344CCTLinDc2 ;
   private String A13251CCMetodo ;
   private String A13252CCEspecif ;
   private String A4035CCVal ;
   private String A130BarCodPar ;
   private String AV45BarCodPar ;
   private String A758ProCod ;
   private String AV46Procod ;
   private String AV42EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAQ02 ;
   private boolean brkAQ04 ;
   private boolean brkAQ06 ;
   private boolean brkAQ08 ;
   private boolean brkAQ010 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV25Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AQ02_A4034CCTLin ;
   private int[] P0AQ02_A4031CCTCod ;
   private String[] P0AQ02_A396EmprCod ;
   private short[] P0AQ02_A194BarOrdLin ;
   private String[] P0AQ02_A758ProCod ;
   private String[] P0AQ02_A130BarCodPar ;
   private byte[] P0AQ02_A132BarCodReo ;
   private int[] P0AQ02_A129BarCod ;
   private String[] P0AQ02_A4035CCVal ;
   private String[] P0AQ02_A13252CCEspecif ;
   private String[] P0AQ02_A13251CCMetodo ;
   private String[] P0AQ02_A14344CCTLinDc2 ;
   private String[] P0AQ02_A4043CCTLinDsc ;
   private String[] P0AQ03_A396EmprCod ;
   private int[] P0AQ03_A129BarCod ;
   private byte[] P0AQ03_A132BarCodReo ;
   private String[] P0AQ03_A130BarCodPar ;
   private String[] P0AQ03_A758ProCod ;
   private short[] P0AQ03_A194BarOrdLin ;
   private int[] P0AQ03_A4031CCTCod ;
   private String[] P0AQ03_A14344CCTLinDc2 ;
   private String[] P0AQ03_A4035CCVal ;
   private String[] P0AQ03_A13252CCEspecif ;
   private String[] P0AQ03_A13251CCMetodo ;
   private String[] P0AQ03_A4043CCTLinDsc ;
   private short[] P0AQ03_A4034CCTLin ;
   private String[] P0AQ04_A396EmprCod ;
   private int[] P0AQ04_A129BarCod ;
   private byte[] P0AQ04_A132BarCodReo ;
   private String[] P0AQ04_A130BarCodPar ;
   private String[] P0AQ04_A758ProCod ;
   private short[] P0AQ04_A194BarOrdLin ;
   private int[] P0AQ04_A4031CCTCod ;
   private String[] P0AQ04_A13251CCMetodo ;
   private String[] P0AQ04_A4035CCVal ;
   private String[] P0AQ04_A13252CCEspecif ;
   private String[] P0AQ04_A14344CCTLinDc2 ;
   private String[] P0AQ04_A4043CCTLinDsc ;
   private short[] P0AQ04_A4034CCTLin ;
   private String[] P0AQ05_A396EmprCod ;
   private int[] P0AQ05_A129BarCod ;
   private byte[] P0AQ05_A132BarCodReo ;
   private String[] P0AQ05_A130BarCodPar ;
   private String[] P0AQ05_A758ProCod ;
   private short[] P0AQ05_A194BarOrdLin ;
   private int[] P0AQ05_A4031CCTCod ;
   private String[] P0AQ05_A13252CCEspecif ;
   private String[] P0AQ05_A4035CCVal ;
   private String[] P0AQ05_A13251CCMetodo ;
   private String[] P0AQ05_A14344CCTLinDc2 ;
   private String[] P0AQ05_A4043CCTLinDsc ;
   private short[] P0AQ05_A4034CCTLin ;
   private String[] P0AQ06_A396EmprCod ;
   private int[] P0AQ06_A129BarCod ;
   private byte[] P0AQ06_A132BarCodReo ;
   private String[] P0AQ06_A130BarCodPar ;
   private String[] P0AQ06_A758ProCod ;
   private short[] P0AQ06_A194BarOrdLin ;
   private int[] P0AQ06_A4031CCTCod ;
   private String[] P0AQ06_A4035CCVal ;
   private String[] P0AQ06_A13252CCEspecif ;
   private String[] P0AQ06_A13251CCMetodo ;
   private String[] P0AQ06_A14344CCTLinDc2 ;
   private String[] P0AQ06_A4043CCTLinDsc ;
   private short[] P0AQ06_A4034CCTLin ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class controlcalidad_cc1_wkpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AQ02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ,
                                          short AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ,
                                          String AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                          String AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                          String AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13251CCMetodo ,
                                          String A13252CCEspecif ,
                                          String A4035CCVal ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          String A758ProCod ,
                                          String AV46Procod ,
                                          short A194BarOrdLin ,
                                          short AV47Barordlin ,
                                          String AV42EmprCod ,
                                          int AV48CCtcod ,
                                          String A396EmprCod ,
                                          int A4031CCTCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[19];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CCTLin, T1.CCTCod, T1.EmprCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CCVal, T1.CCEspecif, T1.CCMetodo, T2.CCTLinDc2, T2.CCTLinDsc" ;
      scmdbuf += " FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CCTCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      if ( ! (0==AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCMetodo = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCEspecif = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AQ03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ,
                                          short AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ,
                                          String AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                          String AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                          String AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13251CCMetodo ,
                                          String A13252CCEspecif ,
                                          String A4035CCVal ,
                                          String A396EmprCod ,
                                          String AV42EmprCod ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          String A758ProCod ,
                                          String AV46Procod ,
                                          short A194BarOrdLin ,
                                          short AV47Barordlin ,
                                          int A4031CCTCod ,
                                          int AV48CCtcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[19];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T2.CCTLinDc2, T1.CCVal, T1.CCEspecif, T1.CCMetodo, T2.CCTLinDsc, T1.CCTLin" ;
      scmdbuf += " FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCMetodo = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCEspecif = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CCTLinDc2" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AQ04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ,
                                          short AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ,
                                          String AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                          String AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                          String AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13251CCMetodo ,
                                          String A13252CCEspecif ,
                                          String A4035CCVal ,
                                          String A396EmprCod ,
                                          String AV42EmprCod ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          String A758ProCod ,
                                          String AV46Procod ,
                                          short A194BarOrdLin ,
                                          short AV47Barordlin ,
                                          int A4031CCTCod ,
                                          int AV48CCtcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[19];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCMetodo, T1.CCVal, T1.CCEspecif, T2.CCTLinDc2, T2.CCTLinDsc, T1.CCTLin" ;
      scmdbuf += " FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCMetodo = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCEspecif = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCMetodo" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AQ05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ,
                                          short AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ,
                                          String AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                          String AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                          String AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13251CCMetodo ,
                                          String A13252CCEspecif ,
                                          String A4035CCVal ,
                                          String A396EmprCod ,
                                          String AV42EmprCod ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          String A758ProCod ,
                                          String AV46Procod ,
                                          short A194BarOrdLin ,
                                          short AV47Barordlin ,
                                          int A4031CCTCod ,
                                          int AV48CCtcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[19];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCEspecif, T1.CCVal, T1.CCMetodo, T2.CCTLinDc2, T2.CCTLinDsc, T1.CCTLin" ;
      scmdbuf += " FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCMetodo = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCEspecif = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCEspecif" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AQ06( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin ,
                                          short AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to ,
                                          String AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2 ,
                                          String AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel ,
                                          String AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo ,
                                          String AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel ,
                                          String AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif ,
                                          String AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel ,
                                          String AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval ,
                                          short A4034CCTLin ,
                                          String A4043CCTLinDsc ,
                                          String A14344CCTLinDc2 ,
                                          String A13251CCMetodo ,
                                          String A13252CCEspecif ,
                                          String A4035CCVal ,
                                          String A396EmprCod ,
                                          String AV42EmprCod ,
                                          int A129BarCod ,
                                          int AV43Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV44Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV45BarCodPar ,
                                          String A758ProCod ,
                                          String AV46Procod ,
                                          short A194BarOrdLin ,
                                          short AV47Barordlin ,
                                          int A4031CCTCod ,
                                          int AV48CCtcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[19];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCVal, T1.CCEspecif, T1.CCMetodo, T2.CCTLinDc2, T2.CCTLinDsc, T1.CCTLin" ;
      scmdbuf += " FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.ProCod = ?)");
      addWhere(sWhereString, "(T1.BarOrdLin = ?)");
      addWhere(sWhereString, "(T1.CCTCod = ?)");
      if ( ! (0==AV54Controlcalidadhtd_controlcalidad_cc1_wkpds_1_tfcctlin) )
      {
         addWhere(sWhereString, "(T1.CCTLin >= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV55Controlcalidadhtd_controlcalidad_cc1_wkpds_2_tfcctlin_to) )
      {
         addWhere(sWhereString, "(T1.CCTLin <= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_cc1_wkpds_3_tfcctlindsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_cc1_wkpds_4_tfcctlindsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDsc = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_cc1_wkpds_5_tfcctlindc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTLinDc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_cc1_wkpds_6_tfcctlindc2_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTLinDc2 = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) && ( ! (GXutil.strcmp("", AV60Controlcalidadhtd_controlcalidad_cc1_wkpds_7_tfccmetodo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCMetodo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Controlcalidadhtd_controlcalidad_cc1_wkpds_8_tfccmetodo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCMetodo = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) && ( ! (GXutil.strcmp("", AV62Controlcalidadhtd_controlcalidad_cc1_wkpds_9_tfccespecif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCEspecif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Controlcalidadhtd_controlcalidad_cc1_wkpds_10_tfccespecif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCEspecif = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) && ( ! (GXutil.strcmp("", AV64Controlcalidadhtd_controlcalidad_cc1_wkpds_11_tfccval)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCVal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Controlcalidadhtd_controlcalidad_cc1_wkpds_12_tfccval_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCVal = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCVal" ;
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
                  return conditional_P0AQ02(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() );
            case 1 :
                  return conditional_P0AQ03(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() );
            case 2 :
                  return conditional_P0AQ04(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() );
            case 3 :
                  return conditional_P0AQ05(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() );
            case 4 :
                  return conditional_P0AQ06(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQ02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ06", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 60);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 60);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 60);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 60);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 60);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((short[]) buf[12])[0] = rslt.getShort(13);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 60);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 60);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 40);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 40);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 60);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 60);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 40);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 60);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 60);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 40);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 40);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 60);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 60);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 40);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 40);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 60);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 60);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 40);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 40);
               }
               return;
      }
   }

}

