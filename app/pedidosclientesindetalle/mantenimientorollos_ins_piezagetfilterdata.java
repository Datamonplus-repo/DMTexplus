package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientorollos_ins_piezagetfilterdata extends GXProcedure
{
   public mantenimientorollos_ins_piezagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorollos_ins_piezagetfilterdata.class ), "" );
   }

   public mantenimientorollos_ins_piezagetfilterdata( int remoteHandle ,
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
      mantenimientorollos_ins_piezagetfilterdata.this.aP5 = new String[] {""};
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
      mantenimientorollos_ins_piezagetfilterdata.this.AV45DDOName = aP0;
      mantenimientorollos_ins_piezagetfilterdata.this.AV46SearchTxt = aP1;
      mantenimientorollos_ins_piezagetfilterdata.this.AV47SearchTxtTo = aP2;
      mantenimientorollos_ins_piezagetfilterdata.this.aP3 = aP3;
      mantenimientorollos_ins_piezagetfilterdata.this.aP4 = aP4;
      mantenimientorollos_ins_piezagetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV37OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_PROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_FASCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_FASDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV45DDOName), "DDO_MAQCODBIS") == 0 )
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
      AV48OptionsJson = AV35Options.toJSonString(false) ;
      AV49OptionsDescJson = AV37OptionsDesc.toJSonString(false) ;
      AV50OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV40Session.getValue("PedidosClienteSinDetalle.MantenimientoRollos_ins_PiezaGridState"), "") == 0 )
      {
         AV42GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.MantenimientoRollos_ins_PiezaGridState"), null, null);
      }
      else
      {
         AV42GridState.fromxml(AV40Session.getValue("PedidosClienteSinDetalle.MantenimientoRollos_ins_PiezaGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV42GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV43GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV42GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV51TFBarNHdr = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV52TFBarNHdr_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV16TFProCod = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV17TFProCod_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV18TFBarOrdLin = (short)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFBarOrdLin_To = (short)(GXutil.lval( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV20TFFasCod = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV21TFFasCod_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV22TFFasDsc = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV23TFFasDsc_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV24TFMaqCodBis = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV25TFMaqCodBis_Sel = AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV26TFBarFasKgm = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFBarFasKgm_To = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV28TFBarFasMtr = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarFasMtr_To = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV30TFBarTieRea = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFBarTieRea_To = CommonUtil.decimalVal( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECREA") == 0 )
         {
            AV32TFBarFecRea = localUtil.ctod( AV43GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV51TFBarNHdr = AV46SearchTxt ;
      AV52TFBarNHdr_Sel = "" ;
      AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV51TFBarNHdr ;
      AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV52TFBarNHdr_Sel ;
      AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV16TFProCod ;
      AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV17TFProCod_Sel ;
      AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV18TFBarOrdLin ;
      AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV19TFBarOrdLin_To ;
      AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV20TFFasCod ;
      AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV21TFFasCod_Sel ;
      AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV22TFFasDsc ;
      AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV23TFFasDsc_Sel ;
      AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV24TFMaqCodBis ;
      AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV25TFMaqCodBis_Sel ;
      AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV26TFBarFasKgm ;
      AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV28TFBarFasMtr ;
      AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV30TFBarTieRea ;
      AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV31TFBarTieRea_To ;
      AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV32TFBarFecRea ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                           AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                           AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                           AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                           Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) ,
                                           Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) ,
                                           AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                           AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                           AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                           AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                           AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                           AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                           AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                           AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                           AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                           AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                           AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                           AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           AV53emprcod ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           AV56BarCodPar ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr), 11, "%") ;
      lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = GXutil.padr( GXutil.rtrim( AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod), 8, "%") ;
      lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod), 8, "%") ;
      lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc), 28, "%") ;
      lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAA2 */
      pr_default.execute(0, new Object[] {AV53emprcod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr, AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel, lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod, AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel, Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin), Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to), lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod, AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel, lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc, AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel, lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis, AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to, AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AAA2_A396EmprCod[0] ;
         A160BarFecRea = P0AAA2_A160BarFecRea[0] ;
         A215BarTieRea = P0AAA2_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAA2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAA2_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAA2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAA2_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAA2_A603MaqCodBis[0] ;
         A460FasDsc = P0AAA2_A460FasDsc[0] ;
         A457FasCod = P0AAA2_A457FasCod[0] ;
         A194BarOrdLin = P0AAA2_A194BarOrdLin[0] ;
         A758ProCod = P0AAA2_A758ProCod[0] ;
         A130BarCodPar = P0AAA2_A130BarCodPar[0] ;
         A132BarCodReo = P0AAA2_A132BarCodReo[0] ;
         A129BarCod = P0AAA2_A129BarCod[0] ;
         A460FasDsc = P0AAA2_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV34Option = A13696BarNHdr ;
            AV33InsertIndex = 1 ;
            while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
            {
               AV33InsertIndex = (int)(AV33InsertIndex+1) ;
            }
            if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
            {
               AV39count = GXutil.lval( (String)AV38OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
               AV39count = (long)(AV39count+1) ;
               AV38OptionIndexes.removeItem(AV33InsertIndex);
               AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
            }
            else
            {
               AV35Options.add(AV34Option, AV33InsertIndex);
               AV38OptionIndexes.add("1", AV33InsertIndex);
            }
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV16TFProCod = AV46SearchTxt ;
      AV17TFProCod_Sel = "" ;
      AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV51TFBarNHdr ;
      AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV52TFBarNHdr_Sel ;
      AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV16TFProCod ;
      AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV17TFProCod_Sel ;
      AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV18TFBarOrdLin ;
      AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV19TFBarOrdLin_To ;
      AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV20TFFasCod ;
      AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV21TFFasCod_Sel ;
      AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV22TFFasDsc ;
      AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV23TFFasDsc_Sel ;
      AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV24TFMaqCodBis ;
      AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV25TFMaqCodBis_Sel ;
      AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV26TFBarFasKgm ;
      AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV28TFBarFasMtr ;
      AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV30TFBarTieRea ;
      AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV31TFBarTieRea_To ;
      AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV32TFBarFecRea ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                           AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                           AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                           AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                           Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) ,
                                           Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) ,
                                           AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                           AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                           AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                           AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                           AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                           AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                           AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                           AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                           AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                           AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                           AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                           AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           AV53emprcod ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           AV56BarCodPar ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr), 11, "%") ;
      lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = GXutil.padr( GXutil.rtrim( AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod), 8, "%") ;
      lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod), 8, "%") ;
      lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc), 28, "%") ;
      lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAA3 */
      pr_default.execute(1, new Object[] {AV53emprcod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr, AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel, lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod, AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel, Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin), Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to), lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod, AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel, lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc, AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel, lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis, AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to, AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAAA3 = false ;
         A396EmprCod = P0AAA3_A396EmprCod[0] ;
         A758ProCod = P0AAA3_A758ProCod[0] ;
         A160BarFecRea = P0AAA3_A160BarFecRea[0] ;
         A215BarTieRea = P0AAA3_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAA3_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAA3_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAA3_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAA3_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAA3_A603MaqCodBis[0] ;
         A460FasDsc = P0AAA3_A460FasDsc[0] ;
         A457FasCod = P0AAA3_A457FasCod[0] ;
         A194BarOrdLin = P0AAA3_A194BarOrdLin[0] ;
         A130BarCodPar = P0AAA3_A130BarCodPar[0] ;
         A132BarCodReo = P0AAA3_A132BarCodReo[0] ;
         A129BarCod = P0AAA3_A129BarCod[0] ;
         A460FasDsc = P0AAA3_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV39count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AAA3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AAA3_A129BarCod[0] == A129BarCod ) && ( P0AAA3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P0AAA3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(P0AAA3_A758ProCod[0], A758ProCod) == 0 ) ) )
            {
               if (true) break;
            }
            brkAAA3 = false ;
            A194BarOrdLin = P0AAA3_A194BarOrdLin[0] ;
            AV39count = (long)(AV39count+1) ;
            brkAAA3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A758ProCod)==0) )
         {
            AV34Option = A758ProCod ;
            AV35Options.add(AV34Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAA3 )
         {
            brkAAA3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFFasCod = AV46SearchTxt ;
      AV21TFFasCod_Sel = "" ;
      AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV51TFBarNHdr ;
      AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV52TFBarNHdr_Sel ;
      AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV16TFProCod ;
      AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV17TFProCod_Sel ;
      AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV18TFBarOrdLin ;
      AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV19TFBarOrdLin_To ;
      AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV20TFFasCod ;
      AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV21TFFasCod_Sel ;
      AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV22TFFasDsc ;
      AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV23TFFasDsc_Sel ;
      AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV24TFMaqCodBis ;
      AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV25TFMaqCodBis_Sel ;
      AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV26TFBarFasKgm ;
      AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV28TFBarFasMtr ;
      AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV30TFBarTieRea ;
      AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV31TFBarTieRea_To ;
      AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV32TFBarFecRea ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                           AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                           AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                           AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                           Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) ,
                                           Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) ,
                                           AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                           AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                           AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                           AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                           AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                           AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                           AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                           AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                           AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                           AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                           AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                           AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           AV56BarCodPar ,
                                           AV53emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr), 11, "%") ;
      lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = GXutil.padr( GXutil.rtrim( AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod), 8, "%") ;
      lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod), 8, "%") ;
      lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc), 28, "%") ;
      lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAA4 */
      pr_default.execute(2, new Object[] {AV53emprcod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr, AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel, lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod, AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel, Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin), Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to), lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod, AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel, lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc, AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel, lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis, AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to, AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAAA5 = false ;
         A396EmprCod = P0AAA4_A396EmprCod[0] ;
         A457FasCod = P0AAA4_A457FasCod[0] ;
         A160BarFecRea = P0AAA4_A160BarFecRea[0] ;
         A215BarTieRea = P0AAA4_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAA4_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAA4_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAA4_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAA4_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAA4_A603MaqCodBis[0] ;
         A460FasDsc = P0AAA4_A460FasDsc[0] ;
         A194BarOrdLin = P0AAA4_A194BarOrdLin[0] ;
         A758ProCod = P0AAA4_A758ProCod[0] ;
         A130BarCodPar = P0AAA4_A130BarCodPar[0] ;
         A132BarCodReo = P0AAA4_A132BarCodReo[0] ;
         A129BarCod = P0AAA4_A129BarCod[0] ;
         A460FasDsc = P0AAA4_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV39count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AAA4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAA4_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkAAA5 = false ;
            A194BarOrdLin = P0AAA4_A194BarOrdLin[0] ;
            A758ProCod = P0AAA4_A758ProCod[0] ;
            A130BarCodPar = P0AAA4_A130BarCodPar[0] ;
            A132BarCodReo = P0AAA4_A132BarCodReo[0] ;
            A129BarCod = P0AAA4_A129BarCod[0] ;
            AV39count = (long)(AV39count+1) ;
            brkAAA5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV34Option = A457FasCod ;
            AV36OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV37OptionsDesc.add(AV36OptionDesc, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAA5 )
         {
            brkAAA5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFFasDsc = AV46SearchTxt ;
      AV23TFFasDsc_Sel = "" ;
      AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV51TFBarNHdr ;
      AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV52TFBarNHdr_Sel ;
      AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV16TFProCod ;
      AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV17TFProCod_Sel ;
      AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV18TFBarOrdLin ;
      AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV19TFBarOrdLin_To ;
      AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV20TFFasCod ;
      AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV21TFFasCod_Sel ;
      AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV22TFFasDsc ;
      AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV23TFFasDsc_Sel ;
      AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV24TFMaqCodBis ;
      AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV25TFMaqCodBis_Sel ;
      AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV26TFBarFasKgm ;
      AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV28TFBarFasMtr ;
      AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV30TFBarTieRea ;
      AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV31TFBarTieRea_To ;
      AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV32TFBarFecRea ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                           AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                           AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                           AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                           Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) ,
                                           Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) ,
                                           AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                           AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                           AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                           AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                           AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                           AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                           AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                           AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                           AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                           AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                           AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                           AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           A396EmprCod ,
                                           AV53emprcod ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           AV56BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr), 11, "%") ;
      lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = GXutil.padr( GXutil.rtrim( AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod), 8, "%") ;
      lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod), 8, "%") ;
      lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc), 28, "%") ;
      lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAA5 */
      pr_default.execute(3, new Object[] {AV53emprcod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr, AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel, lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod, AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel, Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin), Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to), lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod, AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel, lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc, AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel, lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis, AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to, AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAAA7 = false ;
         A396EmprCod = P0AAA5_A396EmprCod[0] ;
         A460FasDsc = P0AAA5_A460FasDsc[0] ;
         A160BarFecRea = P0AAA5_A160BarFecRea[0] ;
         A215BarTieRea = P0AAA5_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAA5_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAA5_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAA5_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAA5_n3837BarFasKgm[0] ;
         A603MaqCodBis = P0AAA5_A603MaqCodBis[0] ;
         A457FasCod = P0AAA5_A457FasCod[0] ;
         A194BarOrdLin = P0AAA5_A194BarOrdLin[0] ;
         A758ProCod = P0AAA5_A758ProCod[0] ;
         A130BarCodPar = P0AAA5_A130BarCodPar[0] ;
         A132BarCodReo = P0AAA5_A132BarCodReo[0] ;
         A129BarCod = P0AAA5_A129BarCod[0] ;
         A460FasDsc = P0AAA5_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV39count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AAA5_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brkAAA7 = false ;
            A396EmprCod = P0AAA5_A396EmprCod[0] ;
            A457FasCod = P0AAA5_A457FasCod[0] ;
            A194BarOrdLin = P0AAA5_A194BarOrdLin[0] ;
            A758ProCod = P0AAA5_A758ProCod[0] ;
            A130BarCodPar = P0AAA5_A130BarCodPar[0] ;
            A132BarCodReo = P0AAA5_A132BarCodReo[0] ;
            A129BarCod = P0AAA5_A129BarCod[0] ;
            AV39count = (long)(AV39count+1) ;
            brkAAA7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV34Option = A460FasDsc ;
            AV35Options.add(AV34Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAA7 )
         {
            brkAAA7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADMAQCODBISOPTIONS' Routine */
      returnInSub = false ;
      AV24TFMaqCodBis = AV46SearchTxt ;
      AV25TFMaqCodBis_Sel = "" ;
      AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV51TFBarNHdr ;
      AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV52TFBarNHdr_Sel ;
      AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV16TFProCod ;
      AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV17TFProCod_Sel ;
      AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV18TFBarOrdLin ;
      AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV19TFBarOrdLin_To ;
      AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV20TFFasCod ;
      AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV21TFFasCod_Sel ;
      AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV22TFFasDsc ;
      AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV23TFFasDsc_Sel ;
      AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV24TFMaqCodBis ;
      AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV25TFMaqCodBis_Sel ;
      AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV26TFBarFasKgm ;
      AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV27TFBarFasKgm_To ;
      AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV28TFBarFasMtr ;
      AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV29TFBarFasMtr_To ;
      AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV30TFBarTieRea ;
      AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV31TFBarTieRea_To ;
      AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV32TFBarFecRea ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                           AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                           AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                           AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                           Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) ,
                                           Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) ,
                                           AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                           AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                           AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                           AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                           AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                           AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                           AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                           AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                           AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                           AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                           AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                           AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                           AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           AV56BarCodPar ,
                                           AV53emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr), 11, "%") ;
      lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = GXutil.padr( GXutil.rtrim( AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod), 8, "%") ;
      lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = GXutil.padr( GXutil.rtrim( AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod), 8, "%") ;
      lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc), 28, "%") ;
      lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor P0AAA6 */
      pr_default.execute(4, new Object[] {AV53emprcod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr, AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel, lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod, AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel, Short.valueOf(AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin), Short.valueOf(AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to), lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod, AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel, lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc, AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel, lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis, AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to, AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAAA9 = false ;
         A396EmprCod = P0AAA6_A396EmprCod[0] ;
         A603MaqCodBis = P0AAA6_A603MaqCodBis[0] ;
         A160BarFecRea = P0AAA6_A160BarFecRea[0] ;
         A215BarTieRea = P0AAA6_A215BarTieRea[0] ;
         A3838BarFasMtr = P0AAA6_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P0AAA6_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P0AAA6_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P0AAA6_n3837BarFasKgm[0] ;
         A460FasDsc = P0AAA6_A460FasDsc[0] ;
         A457FasCod = P0AAA6_A457FasCod[0] ;
         A194BarOrdLin = P0AAA6_A194BarOrdLin[0] ;
         A758ProCod = P0AAA6_A758ProCod[0] ;
         A130BarCodPar = P0AAA6_A130BarCodPar[0] ;
         A132BarCodReo = P0AAA6_A132BarCodReo[0] ;
         A129BarCod = P0AAA6_A129BarCod[0] ;
         A460FasDsc = P0AAA6_A460FasDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV39count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AAA6_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AAA6_A603MaqCodBis[0], A603MaqCodBis) == 0 ) )
         {
            brkAAA9 = false ;
            A194BarOrdLin = P0AAA6_A194BarOrdLin[0] ;
            A758ProCod = P0AAA6_A758ProCod[0] ;
            A130BarCodPar = P0AAA6_A130BarCodPar[0] ;
            A132BarCodReo = P0AAA6_A132BarCodReo[0] ;
            A129BarCod = P0AAA6_A129BarCod[0] ;
            AV39count = (long)(AV39count+1) ;
            brkAAA9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A603MaqCodBis)==0) )
         {
            AV34Option = A603MaqCodBis ;
            AV35Options.add(AV34Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV39count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAAA9 )
         {
            brkAAA9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantenimientorollos_ins_piezagetfilterdata.this.AV48OptionsJson;
      this.aP4[0] = mantenimientorollos_ins_piezagetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = mantenimientorollos_ins_piezagetfilterdata.this.AV50OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48OptionsJson = "" ;
      AV49OptionsDescJson = "" ;
      AV50OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV40Session = httpContext.getWebSession();
      AV42GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV43GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV51TFBarNHdr = "" ;
      AV52TFBarNHdr_Sel = "" ;
      AV16TFProCod = "" ;
      AV17TFProCod_Sel = "" ;
      AV20TFFasCod = "" ;
      AV21TFFasCod_Sel = "" ;
      AV22TFFasDsc = "" ;
      AV23TFFasDsc_Sel = "" ;
      AV24TFMaqCodBis = "" ;
      AV25TFMaqCodBis_Sel = "" ;
      AV26TFBarFasKgm = DecimalUtil.ZERO ;
      AV27TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV28TFBarFasMtr = DecimalUtil.ZERO ;
      AV29TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV30TFBarTieRea = DecimalUtil.ZERO ;
      AV31TFBarTieRea_To = DecimalUtil.ZERO ;
      AV32TFBarFecRea = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = "" ;
      AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = "" ;
      AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = "" ;
      AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = "" ;
      AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = "" ;
      AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = "" ;
      AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = "" ;
      AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = "" ;
      AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = "" ;
      AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = "" ;
      AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = DecimalUtil.ZERO ;
      AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = DecimalUtil.ZERO ;
      AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = DecimalUtil.ZERO ;
      AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = DecimalUtil.ZERO ;
      AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = DecimalUtil.ZERO ;
      AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = "" ;
      lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = "" ;
      lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = "" ;
      lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = "" ;
      lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      AV53emprcod = "" ;
      AV56BarCodPar = "" ;
      A396EmprCod = "" ;
      P0AAA2_A396EmprCod = new String[] {""} ;
      P0AAA2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAA2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA2_n3838BarFasMtr = new boolean[] {false} ;
      P0AAA2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA2_n3837BarFasKgm = new boolean[] {false} ;
      P0AAA2_A603MaqCodBis = new String[] {""} ;
      P0AAA2_A460FasDsc = new String[] {""} ;
      P0AAA2_A457FasCod = new String[] {""} ;
      P0AAA2_A194BarOrdLin = new short[1] ;
      P0AAA2_A758ProCod = new String[] {""} ;
      P0AAA2_A130BarCodPar = new String[] {""} ;
      P0AAA2_A132BarCodReo = new byte[1] ;
      P0AAA2_A129BarCod = new int[1] ;
      AV34Option = "" ;
      P0AAA3_A396EmprCod = new String[] {""} ;
      P0AAA3_A758ProCod = new String[] {""} ;
      P0AAA3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAA3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA3_n3838BarFasMtr = new boolean[] {false} ;
      P0AAA3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA3_n3837BarFasKgm = new boolean[] {false} ;
      P0AAA3_A603MaqCodBis = new String[] {""} ;
      P0AAA3_A460FasDsc = new String[] {""} ;
      P0AAA3_A457FasCod = new String[] {""} ;
      P0AAA3_A194BarOrdLin = new short[1] ;
      P0AAA3_A130BarCodPar = new String[] {""} ;
      P0AAA3_A132BarCodReo = new byte[1] ;
      P0AAA3_A129BarCod = new int[1] ;
      P0AAA4_A396EmprCod = new String[] {""} ;
      P0AAA4_A457FasCod = new String[] {""} ;
      P0AAA4_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAA4_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA4_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA4_n3838BarFasMtr = new boolean[] {false} ;
      P0AAA4_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA4_n3837BarFasKgm = new boolean[] {false} ;
      P0AAA4_A603MaqCodBis = new String[] {""} ;
      P0AAA4_A460FasDsc = new String[] {""} ;
      P0AAA4_A194BarOrdLin = new short[1] ;
      P0AAA4_A758ProCod = new String[] {""} ;
      P0AAA4_A130BarCodPar = new String[] {""} ;
      P0AAA4_A132BarCodReo = new byte[1] ;
      P0AAA4_A129BarCod = new int[1] ;
      AV36OptionDesc = "" ;
      P0AAA5_A396EmprCod = new String[] {""} ;
      P0AAA5_A460FasDsc = new String[] {""} ;
      P0AAA5_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAA5_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA5_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA5_n3838BarFasMtr = new boolean[] {false} ;
      P0AAA5_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA5_n3837BarFasKgm = new boolean[] {false} ;
      P0AAA5_A603MaqCodBis = new String[] {""} ;
      P0AAA5_A457FasCod = new String[] {""} ;
      P0AAA5_A194BarOrdLin = new short[1] ;
      P0AAA5_A758ProCod = new String[] {""} ;
      P0AAA5_A130BarCodPar = new String[] {""} ;
      P0AAA5_A132BarCodReo = new byte[1] ;
      P0AAA5_A129BarCod = new int[1] ;
      P0AAA6_A396EmprCod = new String[] {""} ;
      P0AAA6_A603MaqCodBis = new String[] {""} ;
      P0AAA6_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAA6_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA6_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA6_n3838BarFasMtr = new boolean[] {false} ;
      P0AAA6_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAA6_n3837BarFasKgm = new boolean[] {false} ;
      P0AAA6_A460FasDsc = new String[] {""} ;
      P0AAA6_A457FasCod = new String[] {""} ;
      P0AAA6_A194BarOrdLin = new short[1] ;
      P0AAA6_A758ProCod = new String[] {""} ;
      P0AAA6_A130BarCodPar = new String[] {""} ;
      P0AAA6_A132BarCodReo = new byte[1] ;
      P0AAA6_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.mantenimientorollos_ins_piezagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AAA2_A396EmprCod, P0AAA2_A160BarFecRea, P0AAA2_A215BarTieRea, P0AAA2_A3838BarFasMtr, P0AAA2_n3838BarFasMtr, P0AAA2_A3837BarFasKgm, P0AAA2_n3837BarFasKgm, P0AAA2_A603MaqCodBis, P0AAA2_A460FasDsc, P0AAA2_A457FasCod,
            P0AAA2_A194BarOrdLin, P0AAA2_A758ProCod, P0AAA2_A130BarCodPar, P0AAA2_A132BarCodReo, P0AAA2_A129BarCod
            }
            , new Object[] {
            P0AAA3_A396EmprCod, P0AAA3_A758ProCod, P0AAA3_A160BarFecRea, P0AAA3_A215BarTieRea, P0AAA3_A3838BarFasMtr, P0AAA3_n3838BarFasMtr, P0AAA3_A3837BarFasKgm, P0AAA3_n3837BarFasKgm, P0AAA3_A603MaqCodBis, P0AAA3_A460FasDsc,
            P0AAA3_A457FasCod, P0AAA3_A194BarOrdLin, P0AAA3_A130BarCodPar, P0AAA3_A132BarCodReo, P0AAA3_A129BarCod
            }
            , new Object[] {
            P0AAA4_A396EmprCod, P0AAA4_A457FasCod, P0AAA4_A160BarFecRea, P0AAA4_A215BarTieRea, P0AAA4_A3838BarFasMtr, P0AAA4_n3838BarFasMtr, P0AAA4_A3837BarFasKgm, P0AAA4_n3837BarFasKgm, P0AAA4_A603MaqCodBis, P0AAA4_A460FasDsc,
            P0AAA4_A194BarOrdLin, P0AAA4_A758ProCod, P0AAA4_A130BarCodPar, P0AAA4_A132BarCodReo, P0AAA4_A129BarCod
            }
            , new Object[] {
            P0AAA5_A396EmprCod, P0AAA5_A460FasDsc, P0AAA5_A160BarFecRea, P0AAA5_A215BarTieRea, P0AAA5_A3838BarFasMtr, P0AAA5_n3838BarFasMtr, P0AAA5_A3837BarFasKgm, P0AAA5_n3837BarFasKgm, P0AAA5_A603MaqCodBis, P0AAA5_A457FasCod,
            P0AAA5_A194BarOrdLin, P0AAA5_A758ProCod, P0AAA5_A130BarCodPar, P0AAA5_A132BarCodReo, P0AAA5_A129BarCod
            }
            , new Object[] {
            P0AAA6_A396EmprCod, P0AAA6_A603MaqCodBis, P0AAA6_A160BarFecRea, P0AAA6_A215BarTieRea, P0AAA6_A3838BarFasMtr, P0AAA6_n3838BarFasMtr, P0AAA6_A3837BarFasKgm, P0AAA6_n3837BarFasKgm, P0AAA6_A460FasDsc, P0AAA6_A457FasCod,
            P0AAA6_A194BarOrdLin, P0AAA6_A758ProCod, P0AAA6_A130BarCodPar, P0AAA6_A132BarCodReo, P0AAA6_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV55BarCodReo ;
   private short AV18TFBarOrdLin ;
   private short AV19TFBarOrdLin_To ;
   private short AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ;
   private short AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int A129BarCod ;
   private int AV54BarCod ;
   private int AV33InsertIndex ;
   private long AV39count ;
   private java.math.BigDecimal AV26TFBarFasKgm ;
   private java.math.BigDecimal AV27TFBarFasKgm_To ;
   private java.math.BigDecimal AV28TFBarFasMtr ;
   private java.math.BigDecimal AV29TFBarFasMtr_To ;
   private java.math.BigDecimal AV30TFBarTieRea ;
   private java.math.BigDecimal AV31TFBarTieRea_To ;
   private java.math.BigDecimal AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ;
   private java.math.BigDecimal AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ;
   private java.math.BigDecimal AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ;
   private java.math.BigDecimal AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ;
   private java.math.BigDecimal AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ;
   private java.math.BigDecimal AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A215BarTieRea ;
   private String AV51TFBarNHdr ;
   private String AV52TFBarNHdr_Sel ;
   private String AV16TFProCod ;
   private String AV17TFProCod_Sel ;
   private String AV20TFFasCod ;
   private String AV21TFFasCod_Sel ;
   private String AV22TFFasDsc ;
   private String AV23TFFasDsc_Sel ;
   private String AV24TFMaqCodBis ;
   private String AV25TFMaqCodBis_Sel ;
   private String A13696BarNHdr ;
   private String AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ;
   private String AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ;
   private String AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ;
   private String AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ;
   private String AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ;
   private String AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ;
   private String AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ;
   private String AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ;
   private String AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ;
   private String AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ;
   private String scmdbuf ;
   private String lV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ;
   private String lV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ;
   private String lV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ;
   private String lV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ;
   private String lV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String AV53emprcod ;
   private String AV56BarCodPar ;
   private String A396EmprCod ;
   private java.util.Date AV32TFBarFecRea ;
   private java.util.Date AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ;
   private java.util.Date A160BarFecRea ;
   private boolean returnInSub ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean brkAAA3 ;
   private boolean brkAAA5 ;
   private boolean brkAAA7 ;
   private boolean brkAAA9 ;
   private String AV48OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV50OptionIndexesJson ;
   private String AV45DDOName ;
   private String AV46SearchTxt ;
   private String AV47SearchTxtTo ;
   private String AV34Option ;
   private String AV36OptionDesc ;
   private com.genexus.webpanels.WebSession AV40Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AAA2_A396EmprCod ;
   private java.util.Date[] P0AAA2_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAA2_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAA2_A3838BarFasMtr ;
   private boolean[] P0AAA2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAA2_A3837BarFasKgm ;
   private boolean[] P0AAA2_n3837BarFasKgm ;
   private String[] P0AAA2_A603MaqCodBis ;
   private String[] P0AAA2_A460FasDsc ;
   private String[] P0AAA2_A457FasCod ;
   private short[] P0AAA2_A194BarOrdLin ;
   private String[] P0AAA2_A758ProCod ;
   private String[] P0AAA2_A130BarCodPar ;
   private byte[] P0AAA2_A132BarCodReo ;
   private int[] P0AAA2_A129BarCod ;
   private String[] P0AAA3_A396EmprCod ;
   private String[] P0AAA3_A758ProCod ;
   private java.util.Date[] P0AAA3_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAA3_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAA3_A3838BarFasMtr ;
   private boolean[] P0AAA3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAA3_A3837BarFasKgm ;
   private boolean[] P0AAA3_n3837BarFasKgm ;
   private String[] P0AAA3_A603MaqCodBis ;
   private String[] P0AAA3_A460FasDsc ;
   private String[] P0AAA3_A457FasCod ;
   private short[] P0AAA3_A194BarOrdLin ;
   private String[] P0AAA3_A130BarCodPar ;
   private byte[] P0AAA3_A132BarCodReo ;
   private int[] P0AAA3_A129BarCod ;
   private String[] P0AAA4_A396EmprCod ;
   private String[] P0AAA4_A457FasCod ;
   private java.util.Date[] P0AAA4_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAA4_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAA4_A3838BarFasMtr ;
   private boolean[] P0AAA4_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAA4_A3837BarFasKgm ;
   private boolean[] P0AAA4_n3837BarFasKgm ;
   private String[] P0AAA4_A603MaqCodBis ;
   private String[] P0AAA4_A460FasDsc ;
   private short[] P0AAA4_A194BarOrdLin ;
   private String[] P0AAA4_A758ProCod ;
   private String[] P0AAA4_A130BarCodPar ;
   private byte[] P0AAA4_A132BarCodReo ;
   private int[] P0AAA4_A129BarCod ;
   private String[] P0AAA5_A396EmprCod ;
   private String[] P0AAA5_A460FasDsc ;
   private java.util.Date[] P0AAA5_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAA5_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAA5_A3838BarFasMtr ;
   private boolean[] P0AAA5_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAA5_A3837BarFasKgm ;
   private boolean[] P0AAA5_n3837BarFasKgm ;
   private String[] P0AAA5_A603MaqCodBis ;
   private String[] P0AAA5_A457FasCod ;
   private short[] P0AAA5_A194BarOrdLin ;
   private String[] P0AAA5_A758ProCod ;
   private String[] P0AAA5_A130BarCodPar ;
   private byte[] P0AAA5_A132BarCodReo ;
   private int[] P0AAA5_A129BarCod ;
   private String[] P0AAA6_A396EmprCod ;
   private String[] P0AAA6_A603MaqCodBis ;
   private java.util.Date[] P0AAA6_A160BarFecRea ;
   private java.math.BigDecimal[] P0AAA6_A215BarTieRea ;
   private java.math.BigDecimal[] P0AAA6_A3838BarFasMtr ;
   private boolean[] P0AAA6_n3838BarFasMtr ;
   private java.math.BigDecimal[] P0AAA6_A3837BarFasKgm ;
   private boolean[] P0AAA6_n3837BarFasKgm ;
   private String[] P0AAA6_A460FasDsc ;
   private String[] P0AAA6_A457FasCod ;
   private short[] P0AAA6_A194BarOrdLin ;
   private String[] P0AAA6_A758ProCod ;
   private String[] P0AAA6_A130BarCodPar ;
   private byte[] P0AAA6_A132BarCodReo ;
   private int[] P0AAA6_A129BarCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV37OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV42GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV43GridStateFilterValue ;
}

final  class mantenimientorollos_ins_piezagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AAA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                          String AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                          String AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                          String AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                          short AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ,
                                          short AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ,
                                          String AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                          String AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                          String AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                          String AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                          String AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                          String AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                          java.math.BigDecimal AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                          java.util.Date AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          String AV53emprcod ,
                                          int AV54BarCod ,
                                          byte AV55BarCodReo ,
                                          String AV56BarCodPar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AAA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                          String AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                          String AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                          String AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                          short AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ,
                                          short AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ,
                                          String AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                          String AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                          String AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                          String AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                          String AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                          String AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                          java.math.BigDecimal AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                          java.util.Date AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          String AV53emprcod ,
                                          int AV54BarCod ,
                                          byte AV55BarCodReo ,
                                          String AV56BarCodPar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[23];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProCod, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AAA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                          String AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                          String AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                          String AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                          short AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ,
                                          short AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ,
                                          String AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                          String AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                          String AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                          String AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                          String AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                          String AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                          java.math.BigDecimal AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                          java.util.Date AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          int AV54BarCod ,
                                          byte AV55BarCodReo ,
                                          String AV56BarCodPar ,
                                          String AV53emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FasCod, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T2.FasDsc, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AAA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                          String AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                          String AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                          String AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                          short AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ,
                                          short AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ,
                                          String AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                          String AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                          String AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                          String AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                          String AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                          String AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                          java.math.BigDecimal AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                          java.util.Date AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          String A396EmprCod ,
                                          String AV53emprcod ,
                                          int AV54BarCod ,
                                          byte AV55BarCodReo ,
                                          String AV56BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[23];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.FasDsc, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T1.FasCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AAA6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                          String AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                          String AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                          String AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                          short AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ,
                                          short AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ,
                                          String AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                          String AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                          String AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                          String AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                          String AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                          String AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                          java.math.BigDecimal AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                          java.math.BigDecimal AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                          java.math.BigDecimal AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                          java.math.BigDecimal AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                          java.util.Date AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          int AV54BarCod ,
                                          byte AV55BarCodReo ,
                                          String AV56BarCodPar ,
                                          String AV53emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[23];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCodBis, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV65Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
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
                  return conditional_P0AAA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 1 :
                  return conditional_P0AAA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 2 :
                  return conditional_P0AAA4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 3 :
                  return conditional_P0AAA5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] );
            case 4 :
                  return conditional_P0AAA6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AAA6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((String[]) buf[8])[0] = rslt.getString(7, 28);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               return;
            case 1 :
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
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
      }
   }

}

