package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientorollospiezagetfilterdata extends GXProcedure
{
   public mantenimientorollospiezagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorollospiezagetfilterdata.class ), "" );
   }

   public mantenimientorollospiezagetfilterdata( int remoteHandle ,
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
      mantenimientorollospiezagetfilterdata.this.aP5 = new String[] {""};
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
      mantenimientorollospiezagetfilterdata.this.AV41DDOName = aP0;
      mantenimientorollospiezagetfilterdata.this.AV42SearchTxt = aP1;
      mantenimientorollospiezagetfilterdata.this.AV43SearchTxtTo = aP2;
      mantenimientorollospiezagetfilterdata.this.aP3 = aP3;
      mantenimientorollospiezagetfilterdata.this.aP4 = aP4;
      mantenimientorollospiezagetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_MAQCODBIS") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODBISOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV44OptionsJson = AV31Options.toJSonString(false) ;
      AV45OptionsDescJson = AV33OptionsDesc.toJSonString(false) ;
      AV46OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("MantenimientoRollosPiezaGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoRollosPiezaGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("MantenimientoRollosPiezaGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV12TFProCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV13TFProCod_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV16TFFasCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV17TFFasCod_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV18TFFasDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV19TFFasDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV20TFMaqCodBis = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV21TFMaqCodBis_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV22TFBarFasKgm = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFBarFasKgm_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV24TFBarFasMtr = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFBarFasMtr_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV26TFBarTieRea = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFBarTieRea_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECREA") == 0 )
         {
            AV28TFBarFecRea = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProCod = AV42SearchTxt ;
      AV13TFProCod_Sel = "" ;
      AV63Mantenimientorollospiezads_1_tfprocod = AV12TFProCod ;
      AV64Mantenimientorollospiezads_2_tfprocod_sel = AV13TFProCod_Sel ;
      AV65Mantenimientorollospiezads_3_tfbarnhdr = AV10TFBarNHdr ;
      AV66Mantenimientorollospiezads_4_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV67Mantenimientorollospiezads_5_tffascod = AV16TFFasCod ;
      AV68Mantenimientorollospiezads_6_tffascod_sel = AV17TFFasCod_Sel ;
      AV69Mantenimientorollospiezads_7_tffasdsc = AV18TFFasDsc ;
      AV70Mantenimientorollospiezads_8_tffasdsc_sel = AV19TFFasDsc_Sel ;
      AV71Mantenimientorollospiezads_9_tfmaqcodbis = AV20TFMaqCodBis ;
      AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel = AV21TFMaqCodBis_Sel ;
      AV73Mantenimientorollospiezads_11_tfbarfaskgm = AV22TFBarFasKgm ;
      AV74Mantenimientorollospiezads_12_tfbarfaskgm_to = AV23TFBarFasKgm_To ;
      AV75Mantenimientorollospiezads_13_tfbarfasmtr = AV24TFBarFasMtr ;
      AV76Mantenimientorollospiezads_14_tfbarfasmtr_to = AV25TFBarFasMtr_To ;
      AV77Mantenimientorollospiezads_15_tfbartierea = AV26TFBarTieRea ;
      AV78Mantenimientorollospiezads_16_tfbartierea_to = AV27TFBarTieRea_To ;
      AV79Mantenimientorollospiezads_17_tfbarfecrea = AV28TFBarFecRea ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                           AV63Mantenimientorollospiezads_1_tfprocod ,
                                           AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                           AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                           AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                           AV67Mantenimientorollospiezads_5_tffascod ,
                                           AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                           AV69Mantenimientorollospiezads_7_tffasdsc ,
                                           AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                           AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                           AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                           AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                           AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                           AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                           AV77Mantenimientorollospiezads_15_tfbartierea ,
                                           AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                           AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                           A758ProCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           AV47emprcod ,
                                           Integer.valueOf(AV48BarCod) ,
                                           Byte.valueOf(AV49BarCodReo) ,
                                           AV50BarCodPar ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Mantenimientorollospiezads_1_tfprocod = GXutil.padr( GXutil.rtrim( AV63Mantenimientorollospiezads_1_tfprocod), 8, "%") ;
      lV65Mantenimientorollospiezads_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV65Mantenimientorollospiezads_3_tfbarnhdr), 11, "%") ;
      lV67Mantenimientorollospiezads_5_tffascod = GXutil.padr( GXutil.rtrim( AV67Mantenimientorollospiezads_5_tffascod), 8, "%") ;
      lV69Mantenimientorollospiezads_7_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientorollospiezads_7_tffasdsc), 28, "%") ;
      lV71Mantenimientorollospiezads_9_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Mantenimientorollospiezads_9_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAV2 */
      pr_default.execute(0, new Object[] {AV47emprcod, Integer.valueOf(AV48BarCod), Byte.valueOf(AV49BarCodReo), AV50BarCodPar, lV63Mantenimientorollospiezads_1_tfprocod, AV64Mantenimientorollospiezads_2_tfprocod_sel, lV65Mantenimientorollospiezads_3_tfbarnhdr, AV66Mantenimientorollospiezads_4_tfbarnhdr_sel, lV67Mantenimientorollospiezads_5_tffascod, AV68Mantenimientorollospiezads_6_tffascod_sel, lV69Mantenimientorollospiezads_7_tffasdsc, AV70Mantenimientorollospiezads_8_tffasdsc_sel, lV71Mantenimientorollospiezads_9_tfmaqcodbis, AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel, AV73Mantenimientorollospiezads_11_tfbarfaskgm, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to, AV75Mantenimientorollospiezads_13_tfbarfasmtr, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to, AV77Mantenimientorollospiezads_15_tfbartierea, AV78Mantenimientorollospiezads_16_tfbartierea_to, AV79Mantenimientorollospiezads_17_tfbarfecrea});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAAV2 = false ;
         A396EmprCod = P0AAV2_A396EmprCod[0] ;
         A758ProCod = P0AAV2_A758ProCod[0] ;
         A160BarFecRea = P0AAV2_A160BarFecRea[0] ;
         A215BarTieRea = P0AAV2_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAV2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAV2_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAV2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAV2_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAV2_A603MaqCodBis[0] ;
         A460FasDsc = P0AAV2_A460FasDsc[0] ;
         A457FasCod = P0AAV2_A457FasCod[0] ;
         A130BarCodPar = P0AAV2_A130BarCodPar[0] ;
         A132BarCodReo = P0AAV2_A132BarCodReo[0] ;
         A129BarCod = P0AAV2_A129BarCod[0] ;
         A194BarOrdLin = P0AAV2_A194BarOrdLin[0] ;
         A460FasDsc = P0AAV2_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AAV2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AAV2_A129BarCod[0] == A129BarCod ) && ( P0AAV2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AAV2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AAV2_A758ProCod[0], A758ProCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkAAV2 = false ;
            A194BarOrdLin = P0AAV2_A194BarOrdLin[0] ;
            AV35count = (long)(AV35count+1) ;
            brkAAV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV30Option = A758ProCod ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAV2 )
         {
            brkAAV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV42SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV63Mantenimientorollospiezads_1_tfprocod = AV12TFProCod ;
      AV64Mantenimientorollospiezads_2_tfprocod_sel = AV13TFProCod_Sel ;
      AV65Mantenimientorollospiezads_3_tfbarnhdr = AV10TFBarNHdr ;
      AV66Mantenimientorollospiezads_4_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV67Mantenimientorollospiezads_5_tffascod = AV16TFFasCod ;
      AV68Mantenimientorollospiezads_6_tffascod_sel = AV17TFFasCod_Sel ;
      AV69Mantenimientorollospiezads_7_tffasdsc = AV18TFFasDsc ;
      AV70Mantenimientorollospiezads_8_tffasdsc_sel = AV19TFFasDsc_Sel ;
      AV71Mantenimientorollospiezads_9_tfmaqcodbis = AV20TFMaqCodBis ;
      AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel = AV21TFMaqCodBis_Sel ;
      AV73Mantenimientorollospiezads_11_tfbarfaskgm = AV22TFBarFasKgm ;
      AV74Mantenimientorollospiezads_12_tfbarfaskgm_to = AV23TFBarFasKgm_To ;
      AV75Mantenimientorollospiezads_13_tfbarfasmtr = AV24TFBarFasMtr ;
      AV76Mantenimientorollospiezads_14_tfbarfasmtr_to = AV25TFBarFasMtr_To ;
      AV77Mantenimientorollospiezads_15_tfbartierea = AV26TFBarTieRea ;
      AV78Mantenimientorollospiezads_16_tfbartierea_to = AV27TFBarTieRea_To ;
      AV79Mantenimientorollospiezads_17_tfbarfecrea = AV28TFBarFecRea ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                           AV63Mantenimientorollospiezads_1_tfprocod ,
                                           AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                           AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                           AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                           AV67Mantenimientorollospiezads_5_tffascod ,
                                           AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                           AV69Mantenimientorollospiezads_7_tffasdsc ,
                                           AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                           AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                           AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                           AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                           AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                           AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                           AV77Mantenimientorollospiezads_15_tfbartierea ,
                                           AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                           AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                           A758ProCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           AV47emprcod ,
                                           Integer.valueOf(AV48BarCod) ,
                                           Byte.valueOf(AV49BarCodReo) ,
                                           AV50BarCodPar ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Mantenimientorollospiezads_1_tfprocod = GXutil.padr( GXutil.rtrim( AV63Mantenimientorollospiezads_1_tfprocod), 8, "%") ;
      lV65Mantenimientorollospiezads_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV65Mantenimientorollospiezads_3_tfbarnhdr), 11, "%") ;
      lV67Mantenimientorollospiezads_5_tffascod = GXutil.padr( GXutil.rtrim( AV67Mantenimientorollospiezads_5_tffascod), 8, "%") ;
      lV69Mantenimientorollospiezads_7_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientorollospiezads_7_tffasdsc), 28, "%") ;
      lV71Mantenimientorollospiezads_9_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Mantenimientorollospiezads_9_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAV3 */
      pr_default.execute(1, new Object[] {AV47emprcod, Integer.valueOf(AV48BarCod), Byte.valueOf(AV49BarCodReo), AV50BarCodPar, lV63Mantenimientorollospiezads_1_tfprocod, AV64Mantenimientorollospiezads_2_tfprocod_sel, lV65Mantenimientorollospiezads_3_tfbarnhdr, AV66Mantenimientorollospiezads_4_tfbarnhdr_sel, lV67Mantenimientorollospiezads_5_tffascod, AV68Mantenimientorollospiezads_6_tffascod_sel, lV69Mantenimientorollospiezads_7_tffasdsc, AV70Mantenimientorollospiezads_8_tffasdsc_sel, lV71Mantenimientorollospiezads_9_tfmaqcodbis, AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel, AV73Mantenimientorollospiezads_11_tfbarfaskgm, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to, AV75Mantenimientorollospiezads_13_tfbarfasmtr, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to, AV77Mantenimientorollospiezads_15_tfbartierea, AV78Mantenimientorollospiezads_16_tfbartierea_to, AV79Mantenimientorollospiezads_17_tfbarfecrea});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P0AAV3_A396EmprCod[0] ;
         A160BarFecRea = P0AAV3_A160BarFecRea[0] ;
         A215BarTieRea = P0AAV3_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAV3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAV3_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAV3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAV3_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAV3_A603MaqCodBis[0] ;
         A460FasDsc = P0AAV3_A460FasDsc[0] ;
         A457FasCod = P0AAV3_A457FasCod[0] ;
         A758ProCod = P0AAV3_A758ProCod[0] ;
         A130BarCodPar = P0AAV3_A130BarCodPar[0] ;
         A132BarCodReo = P0AAV3_A132BarCodReo[0] ;
         A129BarCod = P0AAV3_A129BarCod[0] ;
         A194BarOrdLin = P0AAV3_A194BarOrdLin[0] ;
         A460FasDsc = P0AAV3_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV30Option = A13696BarNHdr ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            if ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) == 0 ) )
            {
               AV35count = GXutil.lval( (String)AV34OptionIndexes.elementAt(-1+AV29InsertIndex)) ;
               AV35count = (long)(AV35count+1) ;
               AV34OptionIndexes.removeItem(AV29InsertIndex);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
            }
            else
            {
               AV31Options.add(AV30Option, AV29InsertIndex);
               AV34OptionIndexes.add("1", AV29InsertIndex);
            }
         }
         if ( AV31Options.size() == 50 )
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
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFFasCod = AV42SearchTxt ;
      AV17TFFasCod_Sel = "" ;
      AV63Mantenimientorollospiezads_1_tfprocod = AV12TFProCod ;
      AV64Mantenimientorollospiezads_2_tfprocod_sel = AV13TFProCod_Sel ;
      AV65Mantenimientorollospiezads_3_tfbarnhdr = AV10TFBarNHdr ;
      AV66Mantenimientorollospiezads_4_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV67Mantenimientorollospiezads_5_tffascod = AV16TFFasCod ;
      AV68Mantenimientorollospiezads_6_tffascod_sel = AV17TFFasCod_Sel ;
      AV69Mantenimientorollospiezads_7_tffasdsc = AV18TFFasDsc ;
      AV70Mantenimientorollospiezads_8_tffasdsc_sel = AV19TFFasDsc_Sel ;
      AV71Mantenimientorollospiezads_9_tfmaqcodbis = AV20TFMaqCodBis ;
      AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel = AV21TFMaqCodBis_Sel ;
      AV73Mantenimientorollospiezads_11_tfbarfaskgm = AV22TFBarFasKgm ;
      AV74Mantenimientorollospiezads_12_tfbarfaskgm_to = AV23TFBarFasKgm_To ;
      AV75Mantenimientorollospiezads_13_tfbarfasmtr = AV24TFBarFasMtr ;
      AV76Mantenimientorollospiezads_14_tfbarfasmtr_to = AV25TFBarFasMtr_To ;
      AV77Mantenimientorollospiezads_15_tfbartierea = AV26TFBarTieRea ;
      AV78Mantenimientorollospiezads_16_tfbartierea_to = AV27TFBarTieRea_To ;
      AV79Mantenimientorollospiezads_17_tfbarfecrea = AV28TFBarFecRea ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                           AV63Mantenimientorollospiezads_1_tfprocod ,
                                           AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                           AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                           AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                           AV67Mantenimientorollospiezads_5_tffascod ,
                                           AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                           AV69Mantenimientorollospiezads_7_tffasdsc ,
                                           AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                           AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                           AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                           AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                           AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                           AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                           AV77Mantenimientorollospiezads_15_tfbartierea ,
                                           AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                           AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                           A758ProCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           Integer.valueOf(AV48BarCod) ,
                                           Byte.valueOf(AV49BarCodReo) ,
                                           AV50BarCodPar ,
                                           AV47emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Mantenimientorollospiezads_1_tfprocod = GXutil.padr( GXutil.rtrim( AV63Mantenimientorollospiezads_1_tfprocod), 8, "%") ;
      lV65Mantenimientorollospiezads_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV65Mantenimientorollospiezads_3_tfbarnhdr), 11, "%") ;
      lV67Mantenimientorollospiezads_5_tffascod = GXutil.padr( GXutil.rtrim( AV67Mantenimientorollospiezads_5_tffascod), 8, "%") ;
      lV69Mantenimientorollospiezads_7_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientorollospiezads_7_tffasdsc), 28, "%") ;
      lV71Mantenimientorollospiezads_9_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Mantenimientorollospiezads_9_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAV4 */
      pr_default.execute(2, new Object[] {AV47emprcod, Integer.valueOf(AV48BarCod), Byte.valueOf(AV49BarCodReo), AV50BarCodPar, lV63Mantenimientorollospiezads_1_tfprocod, AV64Mantenimientorollospiezads_2_tfprocod_sel, lV65Mantenimientorollospiezads_3_tfbarnhdr, AV66Mantenimientorollospiezads_4_tfbarnhdr_sel, lV67Mantenimientorollospiezads_5_tffascod, AV68Mantenimientorollospiezads_6_tffascod_sel, lV69Mantenimientorollospiezads_7_tffasdsc, AV70Mantenimientorollospiezads_8_tffasdsc_sel, lV71Mantenimientorollospiezads_9_tfmaqcodbis, AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel, AV73Mantenimientorollospiezads_11_tfbarfaskgm, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to, AV75Mantenimientorollospiezads_13_tfbarfasmtr, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to, AV77Mantenimientorollospiezads_15_tfbartierea, AV78Mantenimientorollospiezads_16_tfbartierea_to, AV79Mantenimientorollospiezads_17_tfbarfecrea});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAAV5 = false ;
         A396EmprCod = P0AAV4_A396EmprCod[0] ;
         A457FasCod = P0AAV4_A457FasCod[0] ;
         A160BarFecRea = P0AAV4_A160BarFecRea[0] ;
         A215BarTieRea = P0AAV4_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAV4_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAV4_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAV4_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAV4_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAV4_A603MaqCodBis[0] ;
         A460FasDsc = P0AAV4_A460FasDsc[0] ;
         A758ProCod = P0AAV4_A758ProCod[0] ;
         A130BarCodPar = P0AAV4_A130BarCodPar[0] ;
         A132BarCodReo = P0AAV4_A132BarCodReo[0] ;
         A129BarCod = P0AAV4_A129BarCod[0] ;
         A194BarOrdLin = P0AAV4_A194BarOrdLin[0] ;
         A460FasDsc = P0AAV4_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AAV4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAV4_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkAAV5 = false ;
            A758ProCod = P0AAV4_A758ProCod[0] ;
            A130BarCodPar = P0AAV4_A130BarCodPar[0] ;
            A132BarCodReo = P0AAV4_A132BarCodReo[0] ;
            A129BarCod = P0AAV4_A129BarCod[0] ;
            A194BarOrdLin = P0AAV4_A194BarOrdLin[0] ;
            AV35count = (long)(AV35count+1) ;
            brkAAV5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV30Option = A457FasCod ;
            AV32OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV31Options.add(AV30Option, 0);
            AV33OptionsDesc.add(AV32OptionDesc, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAV5 )
         {
            brkAAV5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFFasDsc = AV42SearchTxt ;
      AV19TFFasDsc_Sel = "" ;
      AV63Mantenimientorollospiezads_1_tfprocod = AV12TFProCod ;
      AV64Mantenimientorollospiezads_2_tfprocod_sel = AV13TFProCod_Sel ;
      AV65Mantenimientorollospiezads_3_tfbarnhdr = AV10TFBarNHdr ;
      AV66Mantenimientorollospiezads_4_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV67Mantenimientorollospiezads_5_tffascod = AV16TFFasCod ;
      AV68Mantenimientorollospiezads_6_tffascod_sel = AV17TFFasCod_Sel ;
      AV69Mantenimientorollospiezads_7_tffasdsc = AV18TFFasDsc ;
      AV70Mantenimientorollospiezads_8_tffasdsc_sel = AV19TFFasDsc_Sel ;
      AV71Mantenimientorollospiezads_9_tfmaqcodbis = AV20TFMaqCodBis ;
      AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel = AV21TFMaqCodBis_Sel ;
      AV73Mantenimientorollospiezads_11_tfbarfaskgm = AV22TFBarFasKgm ;
      AV74Mantenimientorollospiezads_12_tfbarfaskgm_to = AV23TFBarFasKgm_To ;
      AV75Mantenimientorollospiezads_13_tfbarfasmtr = AV24TFBarFasMtr ;
      AV76Mantenimientorollospiezads_14_tfbarfasmtr_to = AV25TFBarFasMtr_To ;
      AV77Mantenimientorollospiezads_15_tfbartierea = AV26TFBarTieRea ;
      AV78Mantenimientorollospiezads_16_tfbartierea_to = AV27TFBarTieRea_To ;
      AV79Mantenimientorollospiezads_17_tfbarfecrea = AV28TFBarFecRea ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                           AV63Mantenimientorollospiezads_1_tfprocod ,
                                           AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                           AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                           AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                           AV67Mantenimientorollospiezads_5_tffascod ,
                                           AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                           AV69Mantenimientorollospiezads_7_tffasdsc ,
                                           AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                           AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                           AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                           AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                           AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                           AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                           AV77Mantenimientorollospiezads_15_tfbartierea ,
                                           AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                           AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                           A758ProCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           A396EmprCod ,
                                           AV47emprcod ,
                                           Integer.valueOf(AV48BarCod) ,
                                           Byte.valueOf(AV49BarCodReo) ,
                                           AV50BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV63Mantenimientorollospiezads_1_tfprocod = GXutil.padr( GXutil.rtrim( AV63Mantenimientorollospiezads_1_tfprocod), 8, "%") ;
      lV65Mantenimientorollospiezads_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV65Mantenimientorollospiezads_3_tfbarnhdr), 11, "%") ;
      lV67Mantenimientorollospiezads_5_tffascod = GXutil.padr( GXutil.rtrim( AV67Mantenimientorollospiezads_5_tffascod), 8, "%") ;
      lV69Mantenimientorollospiezads_7_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientorollospiezads_7_tffasdsc), 28, "%") ;
      lV71Mantenimientorollospiezads_9_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Mantenimientorollospiezads_9_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAV5 */
      pr_default.execute(3, new Object[] {AV47emprcod, Integer.valueOf(AV48BarCod), Byte.valueOf(AV49BarCodReo), AV50BarCodPar, lV63Mantenimientorollospiezads_1_tfprocod, AV64Mantenimientorollospiezads_2_tfprocod_sel, lV65Mantenimientorollospiezads_3_tfbarnhdr, AV66Mantenimientorollospiezads_4_tfbarnhdr_sel, lV67Mantenimientorollospiezads_5_tffascod, AV68Mantenimientorollospiezads_6_tffascod_sel, lV69Mantenimientorollospiezads_7_tffasdsc, AV70Mantenimientorollospiezads_8_tffasdsc_sel, lV71Mantenimientorollospiezads_9_tfmaqcodbis, AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel, AV73Mantenimientorollospiezads_11_tfbarfaskgm, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to, AV75Mantenimientorollospiezads_13_tfbarfasmtr, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to, AV77Mantenimientorollospiezads_15_tfbartierea, AV78Mantenimientorollospiezads_16_tfbartierea_to, AV79Mantenimientorollospiezads_17_tfbarfecrea});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAAV7 = false ;
         A396EmprCod = P0AAV5_A396EmprCod[0] ;
         A460FasDsc = P0AAV5_A460FasDsc[0] ;
         A160BarFecRea = P0AAV5_A160BarFecRea[0] ;
         A215BarTieRea = P0AAV5_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAV5_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAV5_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAV5_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAV5_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAV5_A603MaqCodBis[0] ;
         A457FasCod = P0AAV5_A457FasCod[0] ;
         A758ProCod = P0AAV5_A758ProCod[0] ;
         A130BarCodPar = P0AAV5_A130BarCodPar[0] ;
         A132BarCodReo = P0AAV5_A132BarCodReo[0] ;
         A129BarCod = P0AAV5_A129BarCod[0] ;
         A194BarOrdLin = P0AAV5_A194BarOrdLin[0] ;
         A460FasDsc = P0AAV5_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AAV5_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brkAAV7 = false ;
            A396EmprCod = P0AAV5_A396EmprCod[0] ;
            A457FasCod = P0AAV5_A457FasCod[0] ;
            A758ProCod = P0AAV5_A758ProCod[0] ;
            A130BarCodPar = P0AAV5_A130BarCodPar[0] ;
            A132BarCodReo = P0AAV5_A132BarCodReo[0] ;
            A129BarCod = P0AAV5_A129BarCod[0] ;
            A194BarOrdLin = P0AAV5_A194BarOrdLin[0] ;
            AV35count = (long)(AV35count+1) ;
            brkAAV7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV30Option = A460FasDsc ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAV7 )
         {
            brkAAV7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMaqCodBis = AV42SearchTxt ;
      AV21TFMaqCodBis_Sel = "" ;
      AV63Mantenimientorollospiezads_1_tfprocod = AV12TFProCod ;
      AV64Mantenimientorollospiezads_2_tfprocod_sel = AV13TFProCod_Sel ;
      AV65Mantenimientorollospiezads_3_tfbarnhdr = AV10TFBarNHdr ;
      AV66Mantenimientorollospiezads_4_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV67Mantenimientorollospiezads_5_tffascod = AV16TFFasCod ;
      AV68Mantenimientorollospiezads_6_tffascod_sel = AV17TFFasCod_Sel ;
      AV69Mantenimientorollospiezads_7_tffasdsc = AV18TFFasDsc ;
      AV70Mantenimientorollospiezads_8_tffasdsc_sel = AV19TFFasDsc_Sel ;
      AV71Mantenimientorollospiezads_9_tfmaqcodbis = AV20TFMaqCodBis ;
      AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel = AV21TFMaqCodBis_Sel ;
      AV73Mantenimientorollospiezads_11_tfbarfaskgm = AV22TFBarFasKgm ;
      AV74Mantenimientorollospiezads_12_tfbarfaskgm_to = AV23TFBarFasKgm_To ;
      AV75Mantenimientorollospiezads_13_tfbarfasmtr = AV24TFBarFasMtr ;
      AV76Mantenimientorollospiezads_14_tfbarfasmtr_to = AV25TFBarFasMtr_To ;
      AV77Mantenimientorollospiezads_15_tfbartierea = AV26TFBarTieRea ;
      AV78Mantenimientorollospiezads_16_tfbartierea_to = AV27TFBarTieRea_To ;
      AV79Mantenimientorollospiezads_17_tfbarfecrea = AV28TFBarFecRea ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                           AV63Mantenimientorollospiezads_1_tfprocod ,
                                           AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                           AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                           AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                           AV67Mantenimientorollospiezads_5_tffascod ,
                                           AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                           AV69Mantenimientorollospiezads_7_tffasdsc ,
                                           AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                           AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                           AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                           AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                           AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                           AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                           AV77Mantenimientorollospiezads_15_tfbartierea ,
                                           AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                           AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                           A758ProCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           Integer.valueOf(AV48BarCod) ,
                                           Byte.valueOf(AV49BarCodReo) ,
                                           AV50BarCodPar ,
                                           AV47emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63Mantenimientorollospiezads_1_tfprocod = GXutil.padr( GXutil.rtrim( AV63Mantenimientorollospiezads_1_tfprocod), 8, "%") ;
      lV65Mantenimientorollospiezads_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV65Mantenimientorollospiezads_3_tfbarnhdr), 11, "%") ;
      lV67Mantenimientorollospiezads_5_tffascod = GXutil.padr( GXutil.rtrim( AV67Mantenimientorollospiezads_5_tffascod), 8, "%") ;
      lV69Mantenimientorollospiezads_7_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientorollospiezads_7_tffasdsc), 28, "%") ;
      lV71Mantenimientorollospiezads_9_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Mantenimientorollospiezads_9_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAV6 */
      pr_default.execute(4, new Object[] {AV47emprcod, Integer.valueOf(AV48BarCod), Byte.valueOf(AV49BarCodReo), AV50BarCodPar, lV63Mantenimientorollospiezads_1_tfprocod, AV64Mantenimientorollospiezads_2_tfprocod_sel, lV65Mantenimientorollospiezads_3_tfbarnhdr, AV66Mantenimientorollospiezads_4_tfbarnhdr_sel, lV67Mantenimientorollospiezads_5_tffascod, AV68Mantenimientorollospiezads_6_tffascod_sel, lV69Mantenimientorollospiezads_7_tffasdsc, AV70Mantenimientorollospiezads_8_tffasdsc_sel, lV71Mantenimientorollospiezads_9_tfmaqcodbis, AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel, AV73Mantenimientorollospiezads_11_tfbarfaskgm, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to, AV75Mantenimientorollospiezads_13_tfbarfasmtr, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to, AV77Mantenimientorollospiezads_15_tfbartierea, AV78Mantenimientorollospiezads_16_tfbartierea_to, AV79Mantenimientorollospiezads_17_tfbarfecrea});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAAV9 = false ;
         A396EmprCod = P0AAV6_A396EmprCod[0] ;
         A603MaqCodBis = P0AAV6_A603MaqCodBis[0] ;
         A160BarFecRea = P0AAV6_A160BarFecRea[0] ;
         A215BarTieRea = P0AAV6_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAV6_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAV6_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAV6_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAV6_n3837BarFasKgm[0] ;
         A460FasDsc = P0AAV6_A460FasDsc[0] ;
         A457FasCod = P0AAV6_A457FasCod[0] ;
         A758ProCod = P0AAV6_A758ProCod[0] ;
         A130BarCodPar = P0AAV6_A130BarCodPar[0] ;
         A132BarCodReo = P0AAV6_A132BarCodReo[0] ;
         A129BarCod = P0AAV6_A129BarCod[0] ;
         A194BarOrdLin = P0AAV6_A194BarOrdLin[0] ;
         A460FasDsc = P0AAV6_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AAV6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAV6_A603MaqCodBis[0], A603MaqCodBis) == 0 ) )
         {
            brkAAV9 = false ;
            A758ProCod = P0AAV6_A758ProCod[0] ;
            A130BarCodPar = P0AAV6_A130BarCodPar[0] ;
            A132BarCodReo = P0AAV6_A132BarCodReo[0] ;
            A129BarCod = P0AAV6_A129BarCod[0] ;
            A194BarOrdLin = P0AAV6_A194BarOrdLin[0] ;
            AV35count = (long)(AV35count+1) ;
            brkAAV9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV30Option = A603MaqCodBis ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAV9 )
         {
            brkAAV9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantenimientorollospiezagetfilterdata.this.AV44OptionsJson;
      this.aP4[0] = mantenimientorollospiezagetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = mantenimientorollospiezagetfilterdata.this.AV46OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV46OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFProCod = "" ;
      AV13TFProCod_Sel = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV16TFFasCod = "" ;
      AV17TFFasCod_Sel = "" ;
      AV18TFFasDsc = "" ;
      AV19TFFasDsc_Sel = "" ;
      AV20TFMaqCodBis = "" ;
      AV21TFMaqCodBis_Sel = "" ;
      AV22TFBarFasKgm = DecimalUtil.ZERO ;
      AV23TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV24TFBarFasMtr = DecimalUtil.ZERO ;
      AV25TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV26TFBarTieRea = DecimalUtil.ZERO ;
      AV27TFBarTieRea_To = DecimalUtil.ZERO ;
      AV28TFBarFecRea = GXutil.nullDate() ;
      A758ProCod = "" ;
      AV63Mantenimientorollospiezads_1_tfprocod = "" ;
      AV64Mantenimientorollospiezads_2_tfprocod_sel = "" ;
      AV65Mantenimientorollospiezads_3_tfbarnhdr = "" ;
      AV66Mantenimientorollospiezads_4_tfbarnhdr_sel = "" ;
      AV67Mantenimientorollospiezads_5_tffascod = "" ;
      AV68Mantenimientorollospiezads_6_tffascod_sel = "" ;
      AV69Mantenimientorollospiezads_7_tffasdsc = "" ;
      AV70Mantenimientorollospiezads_8_tffasdsc_sel = "" ;
      AV71Mantenimientorollospiezads_9_tfmaqcodbis = "" ;
      AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel = "" ;
      AV73Mantenimientorollospiezads_11_tfbarfaskgm = DecimalUtil.ZERO ;
      AV74Mantenimientorollospiezads_12_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV75Mantenimientorollospiezads_13_tfbarfasmtr = DecimalUtil.ZERO ;
      AV76Mantenimientorollospiezads_14_tfbarfasmtr_to = DecimalUtil.ZERO ;
      AV77Mantenimientorollospiezads_15_tfbartierea = DecimalUtil.ZERO ;
      AV78Mantenimientorollospiezads_16_tfbartierea_to = DecimalUtil.ZERO ;
      AV79Mantenimientorollospiezads_17_tfbarfecrea = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV63Mantenimientorollospiezads_1_tfprocod = "" ;
      lV65Mantenimientorollospiezads_3_tfbarnhdr = "" ;
      lV67Mantenimientorollospiezads_5_tffascod = "" ;
      lV69Mantenimientorollospiezads_7_tffasdsc = "" ;
      lV71Mantenimientorollospiezads_9_tfmaqcodbis = "" ;
      A130BarCodPar = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      AV47emprcod = "" ;
      AV50BarCodPar = "" ;
      A396EmprCod = "" ;
      P0AAV2_A396EmprCod = new String[] {""} ;
      P0AAV2_A758ProCod = new String[] {""} ;
      P0AAV2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAV2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV2_n3838BarFasMtr = new boolean[] {false} ;
      P0AAV2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV2_n3837BarFasKgm = new boolean[] {false} ;
      P0AAV2_A603MaqCodBis = new String[] {""} ;
      P0AAV2_A460FasDsc = new String[] {""} ;
      P0AAV2_A457FasCod = new String[] {""} ;
      P0AAV2_A130BarCodPar = new String[] {""} ;
      P0AAV2_A132BarCodReo = new byte[1] ;
      P0AAV2_A129BarCod = new int[1] ;
      P0AAV2_A194BarOrdLin = new short[1] ;
      A13696BarNHdr = "" ;
      AV30Option = "" ;
      P0AAV3_A396EmprCod = new String[] {""} ;
      P0AAV3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAV3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV3_n3838BarFasMtr = new boolean[] {false} ;
      P0AAV3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV3_n3837BarFasKgm = new boolean[] {false} ;
      P0AAV3_A603MaqCodBis = new String[] {""} ;
      P0AAV3_A460FasDsc = new String[] {""} ;
      P0AAV3_A457FasCod = new String[] {""} ;
      P0AAV3_A758ProCod = new String[] {""} ;
      P0AAV3_A130BarCodPar = new String[] {""} ;
      P0AAV3_A132BarCodReo = new byte[1] ;
      P0AAV3_A129BarCod = new int[1] ;
      P0AAV3_A194BarOrdLin = new short[1] ;
      P0AAV4_A396EmprCod = new String[] {""} ;
      P0AAV4_A457FasCod = new String[] {""} ;
      P0AAV4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAV4_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV4_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV4_n3838BarFasMtr = new boolean[] {false} ;
      P0AAV4_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV4_n3837BarFasKgm = new boolean[] {false} ;
      P0AAV4_A603MaqCodBis = new String[] {""} ;
      P0AAV4_A460FasDsc = new String[] {""} ;
      P0AAV4_A758ProCod = new String[] {""} ;
      P0AAV4_A130BarCodPar = new String[] {""} ;
      P0AAV4_A132BarCodReo = new byte[1] ;
      P0AAV4_A129BarCod = new int[1] ;
      P0AAV4_A194BarOrdLin = new short[1] ;
      AV32OptionDesc = "" ;
      P0AAV5_A396EmprCod = new String[] {""} ;
      P0AAV5_A460FasDsc = new String[] {""} ;
      P0AAV5_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAV5_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV5_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV5_n3838BarFasMtr = new boolean[] {false} ;
      P0AAV5_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV5_n3837BarFasKgm = new boolean[] {false} ;
      P0AAV5_A603MaqCodBis = new String[] {""} ;
      P0AAV5_A457FasCod = new String[] {""} ;
      P0AAV5_A758ProCod = new String[] {""} ;
      P0AAV5_A130BarCodPar = new String[] {""} ;
      P0AAV5_A132BarCodReo = new byte[1] ;
      P0AAV5_A129BarCod = new int[1] ;
      P0AAV5_A194BarOrdLin = new short[1] ;
      P0AAV6_A396EmprCod = new String[] {""} ;
      P0AAV6_A603MaqCodBis = new String[] {""} ;
      P0AAV6_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAV6_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV6_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV6_n3838BarFasMtr = new boolean[] {false} ;
      P0AAV6_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAV6_n3837BarFasKgm = new boolean[] {false} ;
      P0AAV6_A460FasDsc = new String[] {""} ;
      P0AAV6_A457FasCod = new String[] {""} ;
      P0AAV6_A758ProCod = new String[] {""} ;
      P0AAV6_A130BarCodPar = new String[] {""} ;
      P0AAV6_A132BarCodReo = new byte[1] ;
      P0AAV6_A129BarCod = new int[1] ;
      P0AAV6_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientorollospiezagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AAV2_A396EmprCod, P0AAV2_A758ProCod, P0AAV2_A160BarFecRea, P0AAV2_A215BarTieRea, P0AAV2_A3838BarFasMtr, P0AAV2_n3838BarFasMtr, P0AAV2_A3837BarFasKgm, P0AAV2_n3837BarFasKgm, P0AAV2_A603MaqCodBis, P0AAV2_A460FasDsc,
            P0AAV2_A457FasCod, P0AAV2_A130BarCodPar, P0AAV2_A132BarCodReo, P0AAV2_A129BarCod, P0AAV2_A194BarOrdLin
            }
            , new Object[] {
            P0AAV3_A396EmprCod, P0AAV3_A160BarFecRea, P0AAV3_A215BarTieRea, P0AAV3_A3838BarFasMtr, P0AAV3_n3838BarFasMtr, P0AAV3_A3837BarFasKgm, P0AAV3_n3837BarFasKgm, P0AAV3_A603MaqCodBis, P0AAV3_A460FasDsc, P0AAV3_A457FasCod,
            P0AAV3_A758ProCod, P0AAV3_A130BarCodPar, P0AAV3_A132BarCodReo, P0AAV3_A129BarCod, P0AAV3_A194BarOrdLin
            }
            , new Object[] {
            P0AAV4_A396EmprCod, P0AAV4_A457FasCod, P0AAV4_A160BarFecRea, P0AAV4_A215BarTieRea, P0AAV4_A3838BarFasMtr, P0AAV4_n3838BarFasMtr, P0AAV4_A3837BarFasKgm, P0AAV4_n3837BarFasKgm, P0AAV4_A603MaqCodBis, P0AAV4_A460FasDsc,
            P0AAV4_A758ProCod, P0AAV4_A130BarCodPar, P0AAV4_A132BarCodReo, P0AAV4_A129BarCod, P0AAV4_A194BarOrdLin
            }
            , new Object[] {
            P0AAV5_A396EmprCod, P0AAV5_A460FasDsc, P0AAV5_A160BarFecRea, P0AAV5_A215BarTieRea, P0AAV5_A3838BarFasMtr, P0AAV5_n3838BarFasMtr, P0AAV5_A3837BarFasKgm, P0AAV5_n3837BarFasKgm, P0AAV5_A603MaqCodBis, P0AAV5_A457FasCod,
            P0AAV5_A758ProCod, P0AAV5_A130BarCodPar, P0AAV5_A132BarCodReo, P0AAV5_A129BarCod, P0AAV5_A194BarOrdLin
            }
            , new Object[] {
            P0AAV6_A396EmprCod, P0AAV6_A603MaqCodBis, P0AAV6_A160BarFecRea, P0AAV6_A215BarTieRea, P0AAV6_A3838BarFasMtr, P0AAV6_n3838BarFasMtr, P0AAV6_A3837BarFasKgm, P0AAV6_n3837BarFasKgm, P0AAV6_A460FasDsc, P0AAV6_A457FasCod,
            P0AAV6_A758ProCod, P0AAV6_A130BarCodPar, P0AAV6_A132BarCodReo, P0AAV6_A129BarCod, P0AAV6_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV49BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int A129BarCod ;
   private int AV48BarCod ;
   private int AV29InsertIndex ;
   private long AV35count ;
   private java.math.BigDecimal AV22TFBarFasKgm ;
   private java.math.BigDecimal AV23TFBarFasKgm_To ;
   private java.math.BigDecimal AV24TFBarFasMtr ;
   private java.math.BigDecimal AV25TFBarFasMtr_To ;
   private java.math.BigDecimal AV26TFBarTieRea ;
   private java.math.BigDecimal AV27TFBarTieRea_To ;
   private java.math.BigDecimal AV73Mantenimientorollospiezads_11_tfbarfaskgm ;
   private java.math.BigDecimal AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ;
   private java.math.BigDecimal AV75Mantenimientorollospiezads_13_tfbarfasmtr ;
   private java.math.BigDecimal AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ;
   private java.math.BigDecimal AV77Mantenimientorollospiezads_15_tfbartierea ;
   private java.math.BigDecimal AV78Mantenimientorollospiezads_16_tfbartierea_to ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A215BarTieRea ;
   private String AV12TFProCod ;
   private String AV13TFProCod_Sel ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV16TFFasCod ;
   private String AV17TFFasCod_Sel ;
   private String AV18TFFasDsc ;
   private String AV19TFFasDsc_Sel ;
   private String AV20TFMaqCodBis ;
   private String AV21TFMaqCodBis_Sel ;
   private String A758ProCod ;
   private String AV63Mantenimientorollospiezads_1_tfprocod ;
   private String AV64Mantenimientorollospiezads_2_tfprocod_sel ;
   private String AV65Mantenimientorollospiezads_3_tfbarnhdr ;
   private String AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ;
   private String AV67Mantenimientorollospiezads_5_tffascod ;
   private String AV68Mantenimientorollospiezads_6_tffascod_sel ;
   private String AV69Mantenimientorollospiezads_7_tffasdsc ;
   private String AV70Mantenimientorollospiezads_8_tffasdsc_sel ;
   private String AV71Mantenimientorollospiezads_9_tfmaqcodbis ;
   private String AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ;
   private String scmdbuf ;
   private String lV63Mantenimientorollospiezads_1_tfprocod ;
   private String lV65Mantenimientorollospiezads_3_tfbarnhdr ;
   private String lV67Mantenimientorollospiezads_5_tffascod ;
   private String lV69Mantenimientorollospiezads_7_tffasdsc ;
   private String lV71Mantenimientorollospiezads_9_tfmaqcodbis ;
   private String A130BarCodPar ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String AV47emprcod ;
   private String AV50BarCodPar ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private java.util.Date AV28TFBarFecRea ;
   private java.util.Date AV79Mantenimientorollospiezads_17_tfbarfecrea ;
   private java.util.Date A160BarFecRea ;
   private boolean returnInSub ;
   private boolean brkAAV2 ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean brkAAV5 ;
   private boolean brkAAV7 ;
   private boolean brkAAV9 ;
   private String AV44OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV46OptionIndexesJson ;
   private String AV41DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV30Option ;
   private String AV32OptionDesc ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAV2_A396EmprCod ;
   private String[] P0AAV2_A758ProCod ;
   private java.util.Date[] P0AAV2_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAV2_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAV2_A3838BarFasMtr ;
   private boolean[] P0AAV2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAV2_A3837BarFasKgm ;
   private boolean[] P0AAV2_n3837BarFasKgm ;
   private String[] P0AAV2_A603MaqCodBis ;
   private String[] P0AAV2_A460FasDsc ;
   private String[] P0AAV2_A457FasCod ;
   private String[] P0AAV2_A130BarCodPar ;
   private byte[] P0AAV2_A132BarCodReo ;
   private int[] P0AAV2_A129BarCod ;
   private short[] P0AAV2_A194BarOrdLin ;
   private String[] P0AAV3_A396EmprCod ;
   private java.util.Date[] P0AAV3_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAV3_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAV3_A3838BarFasMtr ;
   private boolean[] P0AAV3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAV3_A3837BarFasKgm ;
   private boolean[] P0AAV3_n3837BarFasKgm ;
   private String[] P0AAV3_A603MaqCodBis ;
   private String[] P0AAV3_A460FasDsc ;
   private String[] P0AAV3_A457FasCod ;
   private String[] P0AAV3_A758ProCod ;
   private String[] P0AAV3_A130BarCodPar ;
   private byte[] P0AAV3_A132BarCodReo ;
   private int[] P0AAV3_A129BarCod ;
   private short[] P0AAV3_A194BarOrdLin ;
   private String[] P0AAV4_A396EmprCod ;
   private String[] P0AAV4_A457FasCod ;
   private java.util.Date[] P0AAV4_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAV4_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAV4_A3838BarFasMtr ;
   private boolean[] P0AAV4_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAV4_A3837BarFasKgm ;
   private boolean[] P0AAV4_n3837BarFasKgm ;
   private String[] P0AAV4_A603MaqCodBis ;
   private String[] P0AAV4_A460FasDsc ;
   private String[] P0AAV4_A758ProCod ;
   private String[] P0AAV4_A130BarCodPar ;
   private byte[] P0AAV4_A132BarCodReo ;
   private int[] P0AAV4_A129BarCod ;
   private short[] P0AAV4_A194BarOrdLin ;
   private String[] P0AAV5_A396EmprCod ;
   private String[] P0AAV5_A460FasDsc ;
   private java.util.Date[] P0AAV5_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAV5_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAV5_A3838BarFasMtr ;
   private boolean[] P0AAV5_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAV5_A3837BarFasKgm ;
   private boolean[] P0AAV5_n3837BarFasKgm ;
   private String[] P0AAV5_A603MaqCodBis ;
   private String[] P0AAV5_A457FasCod ;
   private String[] P0AAV5_A758ProCod ;
   private String[] P0AAV5_A130BarCodPar ;
   private byte[] P0AAV5_A132BarCodReo ;
   private int[] P0AAV5_A129BarCod ;
   private short[] P0AAV5_A194BarOrdLin ;
   private String[] P0AAV6_A396EmprCod ;
   private String[] P0AAV6_A603MaqCodBis ;
   private java.util.Date[] P0AAV6_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAV6_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAV6_A3838BarFasMtr ;
   private boolean[] P0AAV6_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAV6_A3837BarFasKgm ;
   private boolean[] P0AAV6_n3837BarFasKgm ;
   private String[] P0AAV6_A460FasDsc ;
   private String[] P0AAV6_A457FasCod ;
   private String[] P0AAV6_A758ProCod ;
   private String[] P0AAV6_A130BarCodPar ;
   private byte[] P0AAV6_A132BarCodReo ;
   private int[] P0AAV6_A129BarCod ;
   private short[] P0AAV6_A194BarOrdLin ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV33OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class mantenimientorollospiezagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AAV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                          String AV63Mantenimientorollospiezads_1_tfprocod ,
                                          String AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                          String AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                          String AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                          String AV67Mantenimientorollospiezads_5_tffascod ,
                                          String AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                          String AV69Mantenimientorollospiezads_7_tffasdsc ,
                                          String AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                          String AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Mantenimientorollospiezads_15_tfbartierea ,
                                          java.math.BigDecimal AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                          java.util.Date AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                          String A758ProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          String AV47emprcod ,
                                          int AV48BarCod ,
                                          byte AV49BarCodReo ,
                                          String AV50BarCodPar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientorollospiezads_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Mantenimientorollospiezads_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientorollospiezads_5_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientorollospiezads_7_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Mantenimientorollospiezads_9_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Mantenimientorollospiezads_11_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Mantenimientorollospiezads_13_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientorollospiezads_15_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientorollospiezads_16_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Mantenimientorollospiezads_17_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AAV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                          String AV63Mantenimientorollospiezads_1_tfprocod ,
                                          String AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                          String AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                          String AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                          String AV67Mantenimientorollospiezads_5_tffascod ,
                                          String AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                          String AV69Mantenimientorollospiezads_7_tffasdsc ,
                                          String AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                          String AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Mantenimientorollospiezads_15_tfbartierea ,
                                          java.math.BigDecimal AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                          java.util.Date AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                          String A758ProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          String AV47emprcod ,
                                          int AV48BarCod ,
                                          byte AV49BarCodReo ,
                                          String AV50BarCodPar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[21];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientorollospiezads_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Mantenimientorollospiezads_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientorollospiezads_5_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientorollospiezads_7_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Mantenimientorollospiezads_9_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Mantenimientorollospiezads_11_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Mantenimientorollospiezads_13_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientorollospiezads_15_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientorollospiezads_16_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Mantenimientorollospiezads_17_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AAV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                          String AV63Mantenimientorollospiezads_1_tfprocod ,
                                          String AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                          String AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                          String AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                          String AV67Mantenimientorollospiezads_5_tffascod ,
                                          String AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                          String AV69Mantenimientorollospiezads_7_tffasdsc ,
                                          String AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                          String AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Mantenimientorollospiezads_15_tfbartierea ,
                                          java.math.BigDecimal AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                          java.util.Date AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                          String A758ProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          int AV48BarCod ,
                                          byte AV49BarCodReo ,
                                          String AV50BarCodPar ,
                                          String AV47emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T2.FasDsc, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientorollospiezads_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Mantenimientorollospiezads_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientorollospiezads_5_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientorollospiezads_7_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Mantenimientorollospiezads_9_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Mantenimientorollospiezads_11_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Mantenimientorollospiezads_13_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientorollospiezads_15_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientorollospiezads_16_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Mantenimientorollospiezads_17_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AAV5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                          String AV63Mantenimientorollospiezads_1_tfprocod ,
                                          String AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                          String AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                          String AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                          String AV67Mantenimientorollospiezads_5_tffascod ,
                                          String AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                          String AV69Mantenimientorollospiezads_7_tffasdsc ,
                                          String AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                          String AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Mantenimientorollospiezads_15_tfbartierea ,
                                          java.math.BigDecimal AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                          java.util.Date AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                          String A758ProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          String A396EmprCod ,
                                          String AV47emprcod ,
                                          int AV48BarCod ,
                                          byte AV49BarCodReo ,
                                          String AV50BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[21];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FasDsc, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T1.FasCod, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientorollospiezads_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Mantenimientorollospiezads_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientorollospiezads_5_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientorollospiezads_7_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Mantenimientorollospiezads_9_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Mantenimientorollospiezads_11_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Mantenimientorollospiezads_13_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientorollospiezads_15_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientorollospiezads_16_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Mantenimientorollospiezads_17_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AAV6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Mantenimientorollospiezads_2_tfprocod_sel ,
                                          String AV63Mantenimientorollospiezads_1_tfprocod ,
                                          String AV66Mantenimientorollospiezads_4_tfbarnhdr_sel ,
                                          String AV65Mantenimientorollospiezads_3_tfbarnhdr ,
                                          String AV68Mantenimientorollospiezads_6_tffascod_sel ,
                                          String AV67Mantenimientorollospiezads_5_tffascod ,
                                          String AV70Mantenimientorollospiezads_8_tffasdsc_sel ,
                                          String AV69Mantenimientorollospiezads_7_tffasdsc ,
                                          String AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel ,
                                          String AV71Mantenimientorollospiezads_9_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Mantenimientorollospiezads_11_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Mantenimientorollospiezads_12_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Mantenimientorollospiezads_13_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Mantenimientorollospiezads_14_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Mantenimientorollospiezads_15_tfbartierea ,
                                          java.math.BigDecimal AV78Mantenimientorollospiezads_16_tfbartierea_to ,
                                          java.util.Date AV79Mantenimientorollospiezads_17_tfbarfecrea ,
                                          String A758ProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          int AV48BarCod ,
                                          byte AV49BarCodReo ,
                                          String AV50BarCodPar ,
                                          String AV47emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[21];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodBis, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T2.FasDsc, T1.FasCod, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientorollospiezads_1_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientorollospiezads_2_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV65Mantenimientorollospiezads_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Mantenimientorollospiezads_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientorollospiezads_5_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientorollospiezads_6_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientorollospiezads_7_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientorollospiezads_8_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Mantenimientorollospiezads_9_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Mantenimientorollospiezads_10_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Mantenimientorollospiezads_11_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Mantenimientorollospiezads_12_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Mantenimientorollospiezads_13_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Mantenimientorollospiezads_14_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientorollospiezads_15_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientorollospiezads_16_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Mantenimientorollospiezads_17_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCodBis" ;
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
                  return conditional_P0AAV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P0AAV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_P0AAV4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 3 :
                  return conditional_P0AAV5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] );
            case 4 :
                  return conditional_P0AAV6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAV5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAV6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((String[]) buf[9])[0] = rslt.getString(8, 28);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((String[]) buf[8])[0] = rslt.getString(7, 28);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((String[]) buf[9])[0] = rslt.getString(8, 28);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 28);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 28);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 28);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               return;
      }
   }

}

