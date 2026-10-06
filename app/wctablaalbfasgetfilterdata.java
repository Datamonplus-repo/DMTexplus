package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wctablaalbfasgetfilterdata extends GXProcedure
{
   public wctablaalbfasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctablaalbfasgetfilterdata.class ), "" );
   }

   public wctablaalbfasgetfilterdata( int remoteHandle ,
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
      wctablaalbfasgetfilterdata.this.aP5 = new String[] {""};
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
      wctablaalbfasgetfilterdata.this.AV26DDOName = aP0;
      wctablaalbfasgetfilterdata.this.AV24SearchTxt = aP1;
      wctablaalbfasgetfilterdata.this.AV25SearchTxtTo = aP2;
      wctablaalbfasgetfilterdata.this.aP3 = aP3;
      wctablaalbfasgetfilterdata.this.aP4 = aP4;
      wctablaalbfasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WCTablaAlbfasGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCTablaAlbfasGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WCTablaAlbfasGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASMAXLIN") == 0 )
         {
            AV47TFGuiFasMaxLin = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFGuiFasMaxLin_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASLIN") == 0 )
         {
            AV10TFGuiFasLin = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFGuiFasLin_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV12TFFasCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV13TFFasCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV14TFFasDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV15TFFasDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASKGM") == 0 )
         {
            AV16TFFasKgm = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFFasKgm_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPKG") == 0 )
         {
            AV18TFGuiFasPKg = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFGuiFasPKg_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASMTR") == 0 )
         {
            AV20TFFasMtr = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFFasMtr_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASPMT") == 0 )
         {
            AV22TFGuiFasPMt = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFGuiFasPMt_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV42Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV43AlbProcod = GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV44Barcod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV45Barcodreo = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasCod = AV24SearchTxt ;
      AV13TFFasCod_Sel = "" ;
      AV74Wctablaalbfasds_1_emprcod = AV42Emprcod ;
      AV75Wctablaalbfasds_2_albprocod = AV43AlbProcod ;
      AV76Wctablaalbfasds_3_barcod = AV44Barcod ;
      AV77Wctablaalbfasds_4_barcodreo = AV45Barcodreo ;
      AV78Wctablaalbfasds_5_tfguifasmaxlin = AV47TFGuiFasMaxLin ;
      AV79Wctablaalbfasds_6_tfguifasmaxlin_to = AV48TFGuiFasMaxLin_To ;
      AV80Wctablaalbfasds_7_tfguifaslin = AV10TFGuiFasLin ;
      AV81Wctablaalbfasds_8_tfguifaslin_to = AV11TFGuiFasLin_To ;
      AV82Wctablaalbfasds_9_tffascod = AV12TFFasCod ;
      AV83Wctablaalbfasds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV84Wctablaalbfasds_11_tffasdsc = AV14TFFasDsc ;
      AV85Wctablaalbfasds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV86Wctablaalbfasds_13_tffaskgm = AV16TFFasKgm ;
      AV87Wctablaalbfasds_14_tffaskgm_to = AV17TFFasKgm_To ;
      AV88Wctablaalbfasds_15_tfguifaspkg = AV18TFGuiFasPKg ;
      AV89Wctablaalbfasds_16_tfguifaspkg_to = AV19TFGuiFasPKg_To ;
      AV90Wctablaalbfasds_17_tffasmtr = AV20TFFasMtr ;
      AV91Wctablaalbfasds_18_tffasmtr_to = AV21TFFasMtr_To ;
      AV92Wctablaalbfasds_19_tfguifaspmt = AV22TFGuiFasPMt ;
      AV93Wctablaalbfasds_20_tfguifaspmt_to = AV23TFGuiFasPMt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV80Wctablaalbfasds_7_tfguifaslin) ,
                                           Short.valueOf(AV81Wctablaalbfasds_8_tfguifaslin_to) ,
                                           AV83Wctablaalbfasds_10_tffascod_sel ,
                                           AV82Wctablaalbfasds_9_tffascod ,
                                           AV85Wctablaalbfasds_12_tffasdsc_sel ,
                                           AV84Wctablaalbfasds_11_tffasdsc ,
                                           AV86Wctablaalbfasds_13_tffaskgm ,
                                           AV87Wctablaalbfasds_14_tffaskgm_to ,
                                           AV88Wctablaalbfasds_15_tfguifaspkg ,
                                           AV89Wctablaalbfasds_16_tfguifaspkg_to ,
                                           AV90Wctablaalbfasds_17_tffasmtr ,
                                           AV91Wctablaalbfasds_18_tffasmtr_to ,
                                           AV92Wctablaalbfasds_19_tfguifaspmt ,
                                           AV93Wctablaalbfasds_20_tfguifaspmt_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1275FasKgm ,
                                           A1241GuiFasPKg ,
                                           A1276FasMtr ,
                                           A1242GuiFasPMt ,
                                           Short.valueOf(AV78Wctablaalbfasds_5_tfguifasmaxlin) ,
                                           Short.valueOf(A13786GuiFasMaxL) ,
                                           Short.valueOf(AV79Wctablaalbfasds_6_tfguifasmaxlin_to) ,
                                           AV74Wctablaalbfasds_1_emprcod ,
                                           Long.valueOf(AV75Wctablaalbfasds_2_albprocod) ,
                                           Integer.valueOf(AV76Wctablaalbfasds_3_barcod) ,
                                           Byte.valueOf(AV77Wctablaalbfasds_4_barcodreo) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV82Wctablaalbfasds_9_tffascod = GXutil.padr( GXutil.rtrim( AV82Wctablaalbfasds_9_tffascod), 8, "%") ;
      lV84Wctablaalbfasds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV84Wctablaalbfasds_11_tffasdsc), 28, "%") ;
      /* Using cursor P08FA3 */
      pr_default.execute(0, new Object[] {AV74Wctablaalbfasds_1_emprcod, Long.valueOf(AV75Wctablaalbfasds_2_albprocod), Integer.valueOf(AV76Wctablaalbfasds_3_barcod), Byte.valueOf(AV77Wctablaalbfasds_4_barcodreo), Short.valueOf(AV78Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV78Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV79Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV79Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV80Wctablaalbfasds_7_tfguifaslin), Short.valueOf(AV81Wctablaalbfasds_8_tfguifaslin_to), lV82Wctablaalbfasds_9_tffascod, AV83Wctablaalbfasds_10_tffascod_sel, lV84Wctablaalbfasds_11_tffasdsc, AV85Wctablaalbfasds_12_tffasdsc_sel, AV86Wctablaalbfasds_13_tffaskgm, AV87Wctablaalbfasds_14_tffaskgm_to, AV88Wctablaalbfasds_15_tfguifaspkg, AV89Wctablaalbfasds_16_tfguifaspkg_to, AV90Wctablaalbfasds_17_tffasmtr, AV91Wctablaalbfasds_18_tffasmtr_to, AV92Wctablaalbfasds_19_tfguifaspmt, AV93Wctablaalbfasds_20_tfguifaspmt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8FA2 = false ;
         A130BarCodPar = P08FA3_A130BarCodPar[0] ;
         A396EmprCod = P08FA3_A396EmprCod[0] ;
         A30AlbProCod = P08FA3_A30AlbProCod[0] ;
         A129BarCod = P08FA3_A129BarCod[0] ;
         A132BarCodReo = P08FA3_A132BarCodReo[0] ;
         A457FasCod = P08FA3_A457FasCod[0] ;
         A1242GuiFasPMt = P08FA3_A1242GuiFasPMt[0] ;
         A1276FasMtr = P08FA3_A1276FasMtr[0] ;
         A1241GuiFasPKg = P08FA3_A1241GuiFasPKg[0] ;
         A1275FasKgm = P08FA3_A1275FasKgm[0] ;
         A460FasDsc = P08FA3_A460FasDsc[0] ;
         A1240GuiFasLin = P08FA3_A1240GuiFasLin[0] ;
         A13786GuiFasMaxL = P08FA3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FA3_n13786GuiFasMaxL[0] ;
         A13786GuiFasMaxL = P08FA3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FA3_n13786GuiFasMaxL[0] ;
         A460FasDsc = P08FA3_A460FasDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08FA3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08FA3_A30AlbProCod[0] == A30AlbProCod ) && ( P08FA3_A129BarCod[0] == A129BarCod ) && ( P08FA3_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P08FA3_A457FasCod[0], A457FasCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk8FA2 = false ;
            A130BarCodPar = P08FA3_A130BarCodPar[0] ;
            A1240GuiFasLin = P08FA3_A1240GuiFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8FA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV28Option = A457FasCod ;
            AV31OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV29Options.add(AV28Option, 0);
            AV32OptionsDesc.add(AV31OptionDesc, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FA2 )
         {
            brk8FA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFFasDsc = AV24SearchTxt ;
      AV15TFFasDsc_Sel = "" ;
      AV74Wctablaalbfasds_1_emprcod = AV42Emprcod ;
      AV75Wctablaalbfasds_2_albprocod = AV43AlbProcod ;
      AV76Wctablaalbfasds_3_barcod = AV44Barcod ;
      AV77Wctablaalbfasds_4_barcodreo = AV45Barcodreo ;
      AV78Wctablaalbfasds_5_tfguifasmaxlin = AV47TFGuiFasMaxLin ;
      AV79Wctablaalbfasds_6_tfguifasmaxlin_to = AV48TFGuiFasMaxLin_To ;
      AV80Wctablaalbfasds_7_tfguifaslin = AV10TFGuiFasLin ;
      AV81Wctablaalbfasds_8_tfguifaslin_to = AV11TFGuiFasLin_To ;
      AV82Wctablaalbfasds_9_tffascod = AV12TFFasCod ;
      AV83Wctablaalbfasds_10_tffascod_sel = AV13TFFasCod_Sel ;
      AV84Wctablaalbfasds_11_tffasdsc = AV14TFFasDsc ;
      AV85Wctablaalbfasds_12_tffasdsc_sel = AV15TFFasDsc_Sel ;
      AV86Wctablaalbfasds_13_tffaskgm = AV16TFFasKgm ;
      AV87Wctablaalbfasds_14_tffaskgm_to = AV17TFFasKgm_To ;
      AV88Wctablaalbfasds_15_tfguifaspkg = AV18TFGuiFasPKg ;
      AV89Wctablaalbfasds_16_tfguifaspkg_to = AV19TFGuiFasPKg_To ;
      AV90Wctablaalbfasds_17_tffasmtr = AV20TFFasMtr ;
      AV91Wctablaalbfasds_18_tffasmtr_to = AV21TFFasMtr_To ;
      AV92Wctablaalbfasds_19_tfguifaspmt = AV22TFGuiFasPMt ;
      AV93Wctablaalbfasds_20_tfguifaspmt_to = AV23TFGuiFasPMt_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV80Wctablaalbfasds_7_tfguifaslin) ,
                                           Short.valueOf(AV81Wctablaalbfasds_8_tfguifaslin_to) ,
                                           AV83Wctablaalbfasds_10_tffascod_sel ,
                                           AV82Wctablaalbfasds_9_tffascod ,
                                           AV85Wctablaalbfasds_12_tffasdsc_sel ,
                                           AV84Wctablaalbfasds_11_tffasdsc ,
                                           AV86Wctablaalbfasds_13_tffaskgm ,
                                           AV87Wctablaalbfasds_14_tffaskgm_to ,
                                           AV88Wctablaalbfasds_15_tfguifaspkg ,
                                           AV89Wctablaalbfasds_16_tfguifaspkg_to ,
                                           AV90Wctablaalbfasds_17_tffasmtr ,
                                           AV91Wctablaalbfasds_18_tffasmtr_to ,
                                           AV92Wctablaalbfasds_19_tfguifaspmt ,
                                           AV93Wctablaalbfasds_20_tfguifaspmt_to ,
                                           Short.valueOf(A1240GuiFasLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A1275FasKgm ,
                                           A1241GuiFasPKg ,
                                           A1276FasMtr ,
                                           A1242GuiFasPMt ,
                                           Short.valueOf(AV78Wctablaalbfasds_5_tfguifasmaxlin) ,
                                           Short.valueOf(A13786GuiFasMaxL) ,
                                           Short.valueOf(AV79Wctablaalbfasds_6_tfguifasmaxlin_to) ,
                                           AV74Wctablaalbfasds_1_emprcod ,
                                           Long.valueOf(AV75Wctablaalbfasds_2_albprocod) ,
                                           Integer.valueOf(AV76Wctablaalbfasds_3_barcod) ,
                                           Byte.valueOf(AV77Wctablaalbfasds_4_barcodreo) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV82Wctablaalbfasds_9_tffascod = GXutil.padr( GXutil.rtrim( AV82Wctablaalbfasds_9_tffascod), 8, "%") ;
      lV84Wctablaalbfasds_11_tffasdsc = GXutil.padr( GXutil.rtrim( AV84Wctablaalbfasds_11_tffasdsc), 28, "%") ;
      /* Using cursor P08FA5 */
      pr_default.execute(1, new Object[] {AV74Wctablaalbfasds_1_emprcod, Long.valueOf(AV75Wctablaalbfasds_2_albprocod), Integer.valueOf(AV76Wctablaalbfasds_3_barcod), Byte.valueOf(AV77Wctablaalbfasds_4_barcodreo), Short.valueOf(AV78Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV78Wctablaalbfasds_5_tfguifasmaxlin), Short.valueOf(AV79Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV79Wctablaalbfasds_6_tfguifasmaxlin_to), Short.valueOf(AV80Wctablaalbfasds_7_tfguifaslin), Short.valueOf(AV81Wctablaalbfasds_8_tfguifaslin_to), lV82Wctablaalbfasds_9_tffascod, AV83Wctablaalbfasds_10_tffascod_sel, lV84Wctablaalbfasds_11_tffasdsc, AV85Wctablaalbfasds_12_tffasdsc_sel, AV86Wctablaalbfasds_13_tffaskgm, AV87Wctablaalbfasds_14_tffaskgm_to, AV88Wctablaalbfasds_15_tfguifaspkg, AV89Wctablaalbfasds_16_tfguifaspkg_to, AV90Wctablaalbfasds_17_tffasmtr, AV91Wctablaalbfasds_18_tffasmtr_to, AV92Wctablaalbfasds_19_tfguifaspmt, AV93Wctablaalbfasds_20_tfguifaspmt_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8FA4 = false ;
         A130BarCodPar = P08FA5_A130BarCodPar[0] ;
         A396EmprCod = P08FA5_A396EmprCod[0] ;
         A30AlbProCod = P08FA5_A30AlbProCod[0] ;
         A129BarCod = P08FA5_A129BarCod[0] ;
         A132BarCodReo = P08FA5_A132BarCodReo[0] ;
         A457FasCod = P08FA5_A457FasCod[0] ;
         A1242GuiFasPMt = P08FA5_A1242GuiFasPMt[0] ;
         A1276FasMtr = P08FA5_A1276FasMtr[0] ;
         A1241GuiFasPKg = P08FA5_A1241GuiFasPKg[0] ;
         A1275FasKgm = P08FA5_A1275FasKgm[0] ;
         A460FasDsc = P08FA5_A460FasDsc[0] ;
         A1240GuiFasLin = P08FA5_A1240GuiFasLin[0] ;
         A13786GuiFasMaxL = P08FA5_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FA5_n13786GuiFasMaxL[0] ;
         A13786GuiFasMaxL = P08FA5_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FA5_n13786GuiFasMaxL[0] ;
         A460FasDsc = P08FA5_A460FasDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08FA5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08FA5_A30AlbProCod[0] == A30AlbProCod ) && ( P08FA5_A129BarCod[0] == A129BarCod ) && ( P08FA5_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P08FA5_A457FasCod[0], A457FasCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk8FA4 = false ;
            A130BarCodPar = P08FA5_A130BarCodPar[0] ;
            A1240GuiFasLin = P08FA5_A1240GuiFasLin[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8FA4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV28Option = A460FasDsc ;
            AV27InsertIndex = 1 ;
            while ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) < 0 ) )
            {
               AV27InsertIndex = (int)(AV27InsertIndex+1) ;
            }
            AV29Options.add(AV28Option, AV27InsertIndex);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV27InsertIndex);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FA4 )
         {
            brk8FA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wctablaalbfasgetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = wctablaalbfasgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = wctablaalbfasgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFFasCod = "" ;
      AV13TFFasCod_Sel = "" ;
      AV14TFFasDsc = "" ;
      AV15TFFasDsc_Sel = "" ;
      AV16TFFasKgm = DecimalUtil.ZERO ;
      AV17TFFasKgm_To = DecimalUtil.ZERO ;
      AV18TFGuiFasPKg = DecimalUtil.ZERO ;
      AV19TFGuiFasPKg_To = DecimalUtil.ZERO ;
      AV20TFFasMtr = DecimalUtil.ZERO ;
      AV21TFFasMtr_To = DecimalUtil.ZERO ;
      AV22TFGuiFasPMt = DecimalUtil.ZERO ;
      AV23TFGuiFasPMt_To = DecimalUtil.ZERO ;
      AV42Emprcod = "" ;
      A457FasCod = "" ;
      AV74Wctablaalbfasds_1_emprcod = "" ;
      AV82Wctablaalbfasds_9_tffascod = "" ;
      AV83Wctablaalbfasds_10_tffascod_sel = "" ;
      AV84Wctablaalbfasds_11_tffasdsc = "" ;
      AV85Wctablaalbfasds_12_tffasdsc_sel = "" ;
      AV86Wctablaalbfasds_13_tffaskgm = DecimalUtil.ZERO ;
      AV87Wctablaalbfasds_14_tffaskgm_to = DecimalUtil.ZERO ;
      AV88Wctablaalbfasds_15_tfguifaspkg = DecimalUtil.ZERO ;
      AV89Wctablaalbfasds_16_tfguifaspkg_to = DecimalUtil.ZERO ;
      AV90Wctablaalbfasds_17_tffasmtr = DecimalUtil.ZERO ;
      AV91Wctablaalbfasds_18_tffasmtr_to = DecimalUtil.ZERO ;
      AV92Wctablaalbfasds_19_tfguifaspmt = DecimalUtil.ZERO ;
      AV93Wctablaalbfasds_20_tfguifaspmt_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV82Wctablaalbfasds_9_tffascod = "" ;
      lV84Wctablaalbfasds_11_tffasdsc = "" ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08FA3_A130BarCodPar = new String[] {""} ;
      P08FA3_A396EmprCod = new String[] {""} ;
      P08FA3_A30AlbProCod = new long[1] ;
      P08FA3_A129BarCod = new int[1] ;
      P08FA3_A132BarCodReo = new byte[1] ;
      P08FA3_A457FasCod = new String[] {""} ;
      P08FA3_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA3_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA3_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA3_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA3_A460FasDsc = new String[] {""} ;
      P08FA3_A1240GuiFasLin = new short[1] ;
      P08FA3_A13786GuiFasMaxL = new short[1] ;
      P08FA3_n13786GuiFasMaxL = new boolean[] {false} ;
      A130BarCodPar = "" ;
      AV28Option = "" ;
      AV31OptionDesc = "" ;
      P08FA5_A130BarCodPar = new String[] {""} ;
      P08FA5_A396EmprCod = new String[] {""} ;
      P08FA5_A30AlbProCod = new long[1] ;
      P08FA5_A129BarCod = new int[1] ;
      P08FA5_A132BarCodReo = new byte[1] ;
      P08FA5_A457FasCod = new String[] {""} ;
      P08FA5_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA5_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA5_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA5_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FA5_A460FasDsc = new String[] {""} ;
      P08FA5_A1240GuiFasLin = new short[1] ;
      P08FA5_A13786GuiFasMaxL = new short[1] ;
      P08FA5_n13786GuiFasMaxL = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctablaalbfasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08FA3_A130BarCodPar, P08FA3_A396EmprCod, P08FA3_A30AlbProCod, P08FA3_A129BarCod, P08FA3_A132BarCodReo, P08FA3_A457FasCod, P08FA3_A1242GuiFasPMt, P08FA3_A1276FasMtr, P08FA3_A1241GuiFasPKg, P08FA3_A1275FasKgm,
            P08FA3_A460FasDsc, P08FA3_A1240GuiFasLin, P08FA3_A13786GuiFasMaxL, P08FA3_n13786GuiFasMaxL
            }
            , new Object[] {
            P08FA5_A130BarCodPar, P08FA5_A396EmprCod, P08FA5_A30AlbProCod, P08FA5_A129BarCod, P08FA5_A132BarCodReo, P08FA5_A457FasCod, P08FA5_A1242GuiFasPMt, P08FA5_A1276FasMtr, P08FA5_A1241GuiFasPKg, P08FA5_A1275FasKgm,
            P08FA5_A460FasDsc, P08FA5_A1240GuiFasLin, P08FA5_A13786GuiFasMaxL, P08FA5_n13786GuiFasMaxL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV45Barcodreo ;
   private byte AV77Wctablaalbfasds_4_barcodreo ;
   private byte A132BarCodReo ;
   private short AV47TFGuiFasMaxLin ;
   private short AV48TFGuiFasMaxLin_To ;
   private short AV10TFGuiFasLin ;
   private short AV11TFGuiFasLin_To ;
   private short AV78Wctablaalbfasds_5_tfguifasmaxlin ;
   private short AV79Wctablaalbfasds_6_tfguifasmaxlin_to ;
   private short AV80Wctablaalbfasds_7_tfguifaslin ;
   private short AV81Wctablaalbfasds_8_tfguifaslin_to ;
   private short A1240GuiFasLin ;
   private short A13786GuiFasMaxL ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int AV44Barcod ;
   private int AV76Wctablaalbfasds_3_barcod ;
   private int A129BarCod ;
   private int AV27InsertIndex ;
   private long AV43AlbProcod ;
   private long AV75Wctablaalbfasds_2_albprocod ;
   private long A30AlbProCod ;
   private long AV36count ;
   private java.math.BigDecimal AV16TFFasKgm ;
   private java.math.BigDecimal AV17TFFasKgm_To ;
   private java.math.BigDecimal AV18TFGuiFasPKg ;
   private java.math.BigDecimal AV19TFGuiFasPKg_To ;
   private java.math.BigDecimal AV20TFFasMtr ;
   private java.math.BigDecimal AV21TFFasMtr_To ;
   private java.math.BigDecimal AV22TFGuiFasPMt ;
   private java.math.BigDecimal AV23TFGuiFasPMt_To ;
   private java.math.BigDecimal AV86Wctablaalbfasds_13_tffaskgm ;
   private java.math.BigDecimal AV87Wctablaalbfasds_14_tffaskgm_to ;
   private java.math.BigDecimal AV88Wctablaalbfasds_15_tfguifaspkg ;
   private java.math.BigDecimal AV89Wctablaalbfasds_16_tfguifaspkg_to ;
   private java.math.BigDecimal AV90Wctablaalbfasds_17_tffasmtr ;
   private java.math.BigDecimal AV91Wctablaalbfasds_18_tffasmtr_to ;
   private java.math.BigDecimal AV92Wctablaalbfasds_19_tfguifaspmt ;
   private java.math.BigDecimal AV93Wctablaalbfasds_20_tfguifaspmt_to ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private String AV12TFFasCod ;
   private String AV13TFFasCod_Sel ;
   private String AV14TFFasDsc ;
   private String AV15TFFasDsc_Sel ;
   private String AV42Emprcod ;
   private String A457FasCod ;
   private String AV74Wctablaalbfasds_1_emprcod ;
   private String AV82Wctablaalbfasds_9_tffascod ;
   private String AV83Wctablaalbfasds_10_tffascod_sel ;
   private String AV84Wctablaalbfasds_11_tffasdsc ;
   private String AV85Wctablaalbfasds_12_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV82Wctablaalbfasds_9_tffascod ;
   private String lV84Wctablaalbfasds_11_tffasdsc ;
   private String A460FasDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk8FA2 ;
   private boolean n13786GuiFasMaxL ;
   private boolean brk8FA4 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV28Option ;
   private String AV31OptionDesc ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08FA3_A130BarCodPar ;
   private String[] P08FA3_A396EmprCod ;
   private long[] P08FA3_A30AlbProCod ;
   private int[] P08FA3_A129BarCod ;
   private byte[] P08FA3_A132BarCodReo ;
   private String[] P08FA3_A457FasCod ;
   private java.math.BigDecimal[] P08FA3_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P08FA3_A1276FasMtr ;
   private java.math.BigDecimal[] P08FA3_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P08FA3_A1275FasKgm ;
   private String[] P08FA3_A460FasDsc ;
   private short[] P08FA3_A1240GuiFasLin ;
   private short[] P08FA3_A13786GuiFasMaxL ;
   private boolean[] P08FA3_n13786GuiFasMaxL ;
   private String[] P08FA5_A130BarCodPar ;
   private String[] P08FA5_A396EmprCod ;
   private long[] P08FA5_A30AlbProCod ;
   private int[] P08FA5_A129BarCod ;
   private byte[] P08FA5_A132BarCodReo ;
   private String[] P08FA5_A457FasCod ;
   private java.math.BigDecimal[] P08FA5_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P08FA5_A1276FasMtr ;
   private java.math.BigDecimal[] P08FA5_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P08FA5_A1275FasKgm ;
   private String[] P08FA5_A460FasDsc ;
   private short[] P08FA5_A1240GuiFasLin ;
   private short[] P08FA5_A13786GuiFasMaxL ;
   private boolean[] P08FA5_n13786GuiFasMaxL ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class wctablaalbfasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV80Wctablaalbfasds_7_tfguifaslin ,
                                          short AV81Wctablaalbfasds_8_tfguifaslin_to ,
                                          String AV83Wctablaalbfasds_10_tffascod_sel ,
                                          String AV82Wctablaalbfasds_9_tffascod ,
                                          String AV85Wctablaalbfasds_12_tffasdsc_sel ,
                                          String AV84Wctablaalbfasds_11_tffasdsc ,
                                          java.math.BigDecimal AV86Wctablaalbfasds_13_tffaskgm ,
                                          java.math.BigDecimal AV87Wctablaalbfasds_14_tffaskgm_to ,
                                          java.math.BigDecimal AV88Wctablaalbfasds_15_tfguifaspkg ,
                                          java.math.BigDecimal AV89Wctablaalbfasds_16_tfguifaspkg_to ,
                                          java.math.BigDecimal AV90Wctablaalbfasds_17_tffasmtr ,
                                          java.math.BigDecimal AV91Wctablaalbfasds_18_tffasmtr_to ,
                                          java.math.BigDecimal AV92Wctablaalbfasds_19_tfguifaspmt ,
                                          java.math.BigDecimal AV93Wctablaalbfasds_20_tfguifaspmt_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          short AV78Wctablaalbfasds_5_tfguifasmaxlin ,
                                          short A13786GuiFasMaxL ,
                                          short AV79Wctablaalbfasds_6_tfguifasmaxlin_to ,
                                          String AV74Wctablaalbfasds_1_emprcod ,
                                          long AV75Wctablaalbfasds_2_albprocod ,
                                          int AV76Wctablaalbfasds_3_barcod ,
                                          byte AV77Wctablaalbfasds_4_barcodreo ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasCod, T1.GuiFasPMt, T1.FasMtr, T1.GuiFasPKg, T1.FasKgm, T3.FasDsc, T1.GuiFasLin, COALESCE(" ;
      scmdbuf += " T2.GuiFasMaxL, 0) AS GuiFasMaxL FROM ((TXPALBFAS T1 LEFT JOIN (SELECT MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS" ;
      scmdbuf += " GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) <= ?))");
      if ( ! (0==AV80Wctablaalbfasds_7_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV81Wctablaalbfasds_8_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Wctablaalbfasds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV82Wctablaalbfasds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Wctablaalbfasds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wctablaalbfasds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbfasds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbfasds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Wctablaalbfasds_13_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Wctablaalbfasds_14_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wctablaalbfasds_15_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wctablaalbfasds_16_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wctablaalbfasds_17_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wctablaalbfasds_18_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wctablaalbfasds_19_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wctablaalbfasds_20_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08FA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV80Wctablaalbfasds_7_tfguifaslin ,
                                          short AV81Wctablaalbfasds_8_tfguifaslin_to ,
                                          String AV83Wctablaalbfasds_10_tffascod_sel ,
                                          String AV82Wctablaalbfasds_9_tffascod ,
                                          String AV85Wctablaalbfasds_12_tffasdsc_sel ,
                                          String AV84Wctablaalbfasds_11_tffasdsc ,
                                          java.math.BigDecimal AV86Wctablaalbfasds_13_tffaskgm ,
                                          java.math.BigDecimal AV87Wctablaalbfasds_14_tffaskgm_to ,
                                          java.math.BigDecimal AV88Wctablaalbfasds_15_tfguifaspkg ,
                                          java.math.BigDecimal AV89Wctablaalbfasds_16_tfguifaspkg_to ,
                                          java.math.BigDecimal AV90Wctablaalbfasds_17_tffasmtr ,
                                          java.math.BigDecimal AV91Wctablaalbfasds_18_tffasmtr_to ,
                                          java.math.BigDecimal AV92Wctablaalbfasds_19_tfguifaspmt ,
                                          java.math.BigDecimal AV93Wctablaalbfasds_20_tfguifaspmt_to ,
                                          short A1240GuiFasLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          java.math.BigDecimal A1275FasKgm ,
                                          java.math.BigDecimal A1241GuiFasPKg ,
                                          java.math.BigDecimal A1276FasMtr ,
                                          java.math.BigDecimal A1242GuiFasPMt ,
                                          short AV78Wctablaalbfasds_5_tfguifasmaxlin ,
                                          short A13786GuiFasMaxL ,
                                          short AV79Wctablaalbfasds_6_tfguifasmaxlin_to ,
                                          String AV74Wctablaalbfasds_1_emprcod ,
                                          long AV75Wctablaalbfasds_2_albprocod ,
                                          int AV76Wctablaalbfasds_3_barcod ,
                                          byte AV77Wctablaalbfasds_4_barcodreo ,
                                          String A396EmprCod ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasCod, T1.GuiFasPMt, T1.FasMtr, T1.GuiFasPKg, T1.FasKgm, T3.FasDsc, T1.GuiFasLin, COALESCE(" ;
      scmdbuf += " T2.GuiFasMaxL, 0) AS GuiFasMaxL FROM ((TXPALBFAS T1 LEFT JOIN (SELECT MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS" ;
      scmdbuf += " GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) <= ?))");
      if ( ! (0==AV80Wctablaalbfasds_7_tfguifaslin) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV81Wctablaalbfasds_8_tfguifaslin_to) )
      {
         addWhere(sWhereString, "(T1.GuiFasLin <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Wctablaalbfasds_10_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV82Wctablaalbfasds_9_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Wctablaalbfasds_10_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Wctablaalbfasds_12_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbfasds_11_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbfasds_12_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Wctablaalbfasds_13_tffaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Wctablaalbfasds_14_tffaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasKgm <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Wctablaalbfasds_15_tfguifaspkg)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Wctablaalbfasds_16_tfguifaspkg_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPKg <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Wctablaalbfasds_17_tffasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Wctablaalbfasds_18_tffasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.FasMtr <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Wctablaalbfasds_19_tfguifaspmt)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Wctablaalbfasds_20_tfguifaspmt_to)==0) )
      {
         addWhere(sWhereString, "(T1.GuiFasPMt <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.FasCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08FA3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() );
            case 1 :
                  return conditional_P08FA5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).longValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 28);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 28);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 5);
               }
               return;
      }
   }

}

