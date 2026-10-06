package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_adicionesmanualgetfilterdata extends GXProcedure
{
   public cierrerecetastinte_adicionesmanualgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_adicionesmanualgetfilterdata.class ), "" );
   }

   public cierrerecetastinte_adicionesmanualgetfilterdata( int remoteHandle ,
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
      cierrerecetastinte_adicionesmanualgetfilterdata.this.aP5 = new String[] {""};
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
      cierrerecetastinte_adicionesmanualgetfilterdata.this.AV46DDOName = aP0;
      cierrerecetastinte_adicionesmanualgetfilterdata.this.AV44SearchTxt = aP1;
      cierrerecetastinte_adicionesmanualgetfilterdata.this.AV45SearchTxtTo = aP2;
      cierrerecetastinte_adicionesmanualgetfilterdata.this.aP3 = aP3;
      cierrerecetastinte_adicionesmanualgetfilterdata.this.aP4 = aP4;
      cierrerecetastinte_adicionesmanualgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_LANYUSR") == 0 )
      {
         /* Execute user subroutine: 'LOADLANYUSROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV46DDOName), "DDO_LANYLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADLANYLOTEOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV50OptionsJson = AV49Options.toJSonString(false) ;
      AV53OptionsDescJson = AV52OptionsDesc.toJSonString(false) ;
      AV55OptionIndexesJson = AV54OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV57Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), "") == 0 )
      {
         AV59GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      else
      {
         AV59GridState.fromxml(AV57Session.getValue("CierreRecetasTinte_AdicionesManualGridState"), null, null);
      }
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV60GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV62FilterFullText = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAL") == 0 )
         {
            AV18TFRecLinMAL = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFRecLinMAL_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMANY") == 0 )
         {
            AV20TFRecNumAny = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFRecNumAny_To = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV22TFPrdNum = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV23TFPrdNum_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV63TFPrdNom = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV64TFPrdNom_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCFIN") == 0 )
         {
            AV24TFPrdCFin = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdCFin_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR") == 0 )
         {
            AV34TFLanyUsr = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR_SEL") == 0 )
         {
            AV35TFLanyUsr_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYFEC") == 0 )
         {
            AV36TFLanyFec = localUtil.ctot( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE") == 0 )
         {
            AV38TFLanyLote = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE_SEL") == 0 )
         {
            AV39TFLanyLote_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrdNum = AV44SearchTxt ;
      AV23TFPrdNum_Sel = "" ;
      AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV62FilterFullText ;
      AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV18TFRecLinMAL ;
      AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV19TFRecLinMAL_To ;
      AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV20TFRecNumAny ;
      AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV21TFRecNumAny_To ;
      AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV22TFPrdNum ;
      AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV63TFPrdNom ;
      AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV64TFPrdNom_Sel ;
      AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV24TFPrdCFin ;
      AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV25TFPrdCFin_To ;
      AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV34TFLanyUsr ;
      AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV35TFLanyUsr_Sel ;
      AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV36TFLanyFec ;
      AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV38TFLanyLote ;
      AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV39TFLanyLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV66Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV67Barcodreo) ,
                                           A130BarCodPar ,
                                           AV68Barcodpar ,
                                           Short.valueOf(AV69RecLinMAL) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor P094S2 */
      pr_default.execute(0, new Object[] {AV65Emprcod, Integer.valueOf(AV66Barcod), Byte.valueOf(AV67Barcodreo), AV68Barcodpar, Short.valueOf(AV69RecLinMAL), lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk94S2 = false ;
         A396EmprCod = P094S2_A396EmprCod[0] ;
         A719PrdNum = P094S2_A719PrdNum[0] ;
         A130BarCodPar = P094S2_A130BarCodPar[0] ;
         A132BarCodReo = P094S2_A132BarCodReo[0] ;
         A129BarCod = P094S2_A129BarCod[0] ;
         A5807LanyLote = P094S2_A5807LanyLote[0] ;
         n5807LanyLote = P094S2_n5807LanyLote[0] ;
         A4579LanyFec = P094S2_A4579LanyFec[0] ;
         n4579LanyFec = P094S2_n4579LanyFec[0] ;
         A4578LanyUsr = P094S2_A4578LanyUsr[0] ;
         n4578LanyUsr = P094S2_n4578LanyUsr[0] ;
         A1378PrdCFin = P094S2_A1378PrdCFin[0] ;
         n1378PrdCFin = P094S2_n1378PrdCFin[0] ;
         A718PrdNom = P094S2_A718PrdNom[0] ;
         A1377RecNumAny = P094S2_A1377RecNumAny[0] ;
         A2808RecLinMAL = P094S2_A2808RecLinMAL[0] ;
         A718PrdNom = P094S2_A718PrdNom[0] ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P094S2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P094S2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk94S2 = false ;
            A130BarCodPar = P094S2_A130BarCodPar[0] ;
            A132BarCodReo = P094S2_A132BarCodReo[0] ;
            A129BarCod = P094S2_A129BarCod[0] ;
            A1377RecNumAny = P094S2_A1377RecNumAny[0] ;
            A2808RecLinMAL = P094S2_A2808RecLinMAL[0] ;
            AV56count = (long)(AV56count+1) ;
            brk94S2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV48Option = A719PrdNum ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94S2 )
         {
            brk94S2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV63TFPrdNom = AV44SearchTxt ;
      AV64TFPrdNom_Sel = "" ;
      AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV62FilterFullText ;
      AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV18TFRecLinMAL ;
      AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV19TFRecLinMAL_To ;
      AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV20TFRecNumAny ;
      AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV21TFRecNumAny_To ;
      AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV22TFPrdNum ;
      AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV63TFPrdNom ;
      AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV64TFPrdNom_Sel ;
      AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV24TFPrdCFin ;
      AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV25TFPrdCFin_To ;
      AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV34TFLanyUsr ;
      AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV35TFLanyUsr_Sel ;
      AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV36TFLanyFec ;
      AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV38TFLanyLote ;
      AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV39TFLanyLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV66Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV67Barcodreo) ,
                                           A130BarCodPar ,
                                           AV68Barcodpar ,
                                           Short.valueOf(AV69RecLinMAL) ,
                                           AV65Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor P094S3 */
      pr_default.execute(1, new Object[] {AV65Emprcod, Integer.valueOf(AV66Barcod), Byte.valueOf(AV67Barcodreo), AV68Barcodpar, Short.valueOf(AV69RecLinMAL), lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk94S4 = false ;
         A719PrdNum = P094S3_A719PrdNum[0] ;
         A396EmprCod = P094S3_A396EmprCod[0] ;
         A130BarCodPar = P094S3_A130BarCodPar[0] ;
         A132BarCodReo = P094S3_A132BarCodReo[0] ;
         A129BarCod = P094S3_A129BarCod[0] ;
         A5807LanyLote = P094S3_A5807LanyLote[0] ;
         n5807LanyLote = P094S3_n5807LanyLote[0] ;
         A4579LanyFec = P094S3_A4579LanyFec[0] ;
         n4579LanyFec = P094S3_n4579LanyFec[0] ;
         A4578LanyUsr = P094S3_A4578LanyUsr[0] ;
         n4578LanyUsr = P094S3_n4578LanyUsr[0] ;
         A1378PrdCFin = P094S3_A1378PrdCFin[0] ;
         n1378PrdCFin = P094S3_n1378PrdCFin[0] ;
         A718PrdNom = P094S3_A718PrdNom[0] ;
         A1377RecNumAny = P094S3_A1377RecNumAny[0] ;
         A2808RecLinMAL = P094S3_A2808RecLinMAL[0] ;
         A718PrdNom = P094S3_A718PrdNom[0] ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P094S3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P094S3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk94S4 = false ;
            A130BarCodPar = P094S3_A130BarCodPar[0] ;
            A132BarCodReo = P094S3_A132BarCodReo[0] ;
            A129BarCod = P094S3_A129BarCod[0] ;
            A1377RecNumAny = P094S3_A1377RecNumAny[0] ;
            A2808RecLinMAL = P094S3_A2808RecLinMAL[0] ;
            AV56count = (long)(AV56count+1) ;
            brk94S4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV48Option = A718PrdNom ;
            AV47InsertIndex = 1 ;
            while ( ( AV47InsertIndex <= AV49Options.size() ) && ( GXutil.strcmp((String)AV49Options.elementAt(-1+AV47InsertIndex), AV48Option) < 0 ) )
            {
               AV47InsertIndex = (int)(AV47InsertIndex+1) ;
            }
            AV49Options.add(AV48Option, AV47InsertIndex);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), AV47InsertIndex);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94S4 )
         {
            brk94S4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLANYUSROPTIONS' Routine */
      returnInSub = false ;
      AV34TFLanyUsr = AV44SearchTxt ;
      AV35TFLanyUsr_Sel = "" ;
      AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV62FilterFullText ;
      AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV18TFRecLinMAL ;
      AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV19TFRecLinMAL_To ;
      AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV20TFRecNumAny ;
      AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV21TFRecNumAny_To ;
      AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV22TFPrdNum ;
      AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV63TFPrdNom ;
      AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV64TFPrdNom_Sel ;
      AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV24TFPrdCFin ;
      AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV25TFPrdCFin_To ;
      AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV34TFLanyUsr ;
      AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV35TFLanyUsr_Sel ;
      AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV36TFLanyFec ;
      AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV38TFLanyLote ;
      AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV39TFLanyLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           A396EmprCod ,
                                           AV65Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV66Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV67Barcodreo) ,
                                           A130BarCodPar ,
                                           AV68Barcodpar ,
                                           Short.valueOf(AV69RecLinMAL) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor P094S4 */
      pr_default.execute(2, new Object[] {AV65Emprcod, Integer.valueOf(AV66Barcod), Byte.valueOf(AV67Barcodreo), AV68Barcodpar, Short.valueOf(AV69RecLinMAL), lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk94S6 = false ;
         A396EmprCod = P094S4_A396EmprCod[0] ;
         A129BarCod = P094S4_A129BarCod[0] ;
         A132BarCodReo = P094S4_A132BarCodReo[0] ;
         A130BarCodPar = P094S4_A130BarCodPar[0] ;
         A2808RecLinMAL = P094S4_A2808RecLinMAL[0] ;
         A4578LanyUsr = P094S4_A4578LanyUsr[0] ;
         n4578LanyUsr = P094S4_n4578LanyUsr[0] ;
         A5807LanyLote = P094S4_A5807LanyLote[0] ;
         n5807LanyLote = P094S4_n5807LanyLote[0] ;
         A4579LanyFec = P094S4_A4579LanyFec[0] ;
         n4579LanyFec = P094S4_n4579LanyFec[0] ;
         A1378PrdCFin = P094S4_A1378PrdCFin[0] ;
         n1378PrdCFin = P094S4_n1378PrdCFin[0] ;
         A718PrdNom = P094S4_A718PrdNom[0] ;
         A719PrdNum = P094S4_A719PrdNum[0] ;
         A1377RecNumAny = P094S4_A1377RecNumAny[0] ;
         A718PrdNom = P094S4_A718PrdNom[0] ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P094S4_A4578LanyUsr[0], A4578LanyUsr) == 0 ) )
         {
            brk94S6 = false ;
            A396EmprCod = P094S4_A396EmprCod[0] ;
            A129BarCod = P094S4_A129BarCod[0] ;
            A132BarCodReo = P094S4_A132BarCodReo[0] ;
            A130BarCodPar = P094S4_A130BarCodPar[0] ;
            A2808RecLinMAL = P094S4_A2808RecLinMAL[0] ;
            A719PrdNum = P094S4_A719PrdNum[0] ;
            A1377RecNumAny = P094S4_A1377RecNumAny[0] ;
            AV56count = (long)(AV56count+1) ;
            brk94S6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4578LanyUsr)==0) )
         {
            AV48Option = A4578LanyUsr ;
            AV51OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4578LanyUsr, "@!"))) ;
            AV49Options.add(AV48Option, 0);
            AV52OptionsDesc.add(AV51OptionDesc, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94S6 )
         {
            brk94S6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLANYLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV38TFLanyLote = AV44SearchTxt ;
      AV39TFLanyLote_Sel = "" ;
      AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV62FilterFullText ;
      AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV18TFRecLinMAL ;
      AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV19TFRecLinMAL_To ;
      AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV20TFRecNumAny ;
      AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV21TFRecNumAny_To ;
      AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV22TFPrdNum ;
      AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV23TFPrdNum_Sel ;
      AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV63TFPrdNom ;
      AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV64TFPrdNom_Sel ;
      AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV24TFPrdCFin ;
      AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV25TFPrdCFin_To ;
      AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV34TFLanyUsr ;
      AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV35TFLanyUsr_Sel ;
      AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV36TFLanyFec ;
      AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV38TFLanyLote ;
      AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV39TFLanyLote_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           A396EmprCod ,
                                           AV65Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV66Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV67Barcodreo) ,
                                           A130BarCodPar ,
                                           AV68Barcodpar ,
                                           Short.valueOf(AV69RecLinMAL) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor P094S5 */
      pr_default.execute(3, new Object[] {AV65Emprcod, Integer.valueOf(AV66Barcod), Byte.valueOf(AV67Barcodreo), AV68Barcodpar, Short.valueOf(AV69RecLinMAL), lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk94S8 = false ;
         A396EmprCod = P094S5_A396EmprCod[0] ;
         A129BarCod = P094S5_A129BarCod[0] ;
         A132BarCodReo = P094S5_A132BarCodReo[0] ;
         A130BarCodPar = P094S5_A130BarCodPar[0] ;
         A2808RecLinMAL = P094S5_A2808RecLinMAL[0] ;
         A5807LanyLote = P094S5_A5807LanyLote[0] ;
         n5807LanyLote = P094S5_n5807LanyLote[0] ;
         A4579LanyFec = P094S5_A4579LanyFec[0] ;
         n4579LanyFec = P094S5_n4579LanyFec[0] ;
         A4578LanyUsr = P094S5_A4578LanyUsr[0] ;
         n4578LanyUsr = P094S5_n4578LanyUsr[0] ;
         A1378PrdCFin = P094S5_A1378PrdCFin[0] ;
         n1378PrdCFin = P094S5_n1378PrdCFin[0] ;
         A718PrdNom = P094S5_A718PrdNom[0] ;
         A719PrdNum = P094S5_A719PrdNum[0] ;
         A1377RecNumAny = P094S5_A1377RecNumAny[0] ;
         A718PrdNom = P094S5_A718PrdNom[0] ;
         AV56count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P094S5_A5807LanyLote[0], A5807LanyLote) == 0 ) )
         {
            brk94S8 = false ;
            A396EmprCod = P094S5_A396EmprCod[0] ;
            A129BarCod = P094S5_A129BarCod[0] ;
            A132BarCodReo = P094S5_A132BarCodReo[0] ;
            A130BarCodPar = P094S5_A130BarCodPar[0] ;
            A2808RecLinMAL = P094S5_A2808RecLinMAL[0] ;
            A719PrdNum = P094S5_A719PrdNum[0] ;
            A1377RecNumAny = P094S5_A1377RecNumAny[0] ;
            AV56count = (long)(AV56count+1) ;
            brk94S8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5807LanyLote)==0) )
         {
            AV48Option = A5807LanyLote ;
            AV49Options.add(AV48Option, 0);
            AV54OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV56count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV49Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk94S8 )
         {
            brk94S8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cierrerecetastinte_adicionesmanualgetfilterdata.this.AV50OptionsJson;
      this.aP4[0] = cierrerecetastinte_adicionesmanualgetfilterdata.this.AV53OptionsDescJson;
      this.aP5[0] = cierrerecetastinte_adicionesmanualgetfilterdata.this.AV55OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV50OptionsJson = "" ;
      AV53OptionsDescJson = "" ;
      AV55OptionIndexesJson = "" ;
      AV49Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57Session = httpContext.getWebSession();
      AV59GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV60GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV62FilterFullText = "" ;
      AV22TFPrdNum = "" ;
      AV23TFPrdNum_Sel = "" ;
      AV63TFPrdNom = "" ;
      AV64TFPrdNom_Sel = "" ;
      AV24TFPrdCFin = DecimalUtil.ZERO ;
      AV25TFPrdCFin_To = DecimalUtil.ZERO ;
      AV34TFLanyUsr = "" ;
      AV35TFLanyUsr_Sel = "" ;
      AV36TFLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV38TFLanyLote = "" ;
      AV39TFLanyLote_Sel = "" ;
      A719PrdNum = "" ;
      AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = "" ;
      AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = "" ;
      AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = DecimalUtil.ZERO ;
      AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = DecimalUtil.ZERO ;
      AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = "" ;
      AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec = GXutil.resetTime( GXutil.nullDate() );
      AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = "" ;
      scmdbuf = "" ;
      lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A5807LanyLote = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      AV68Barcodpar = "" ;
      AV65Emprcod = "" ;
      A396EmprCod = "" ;
      P094S2_A396EmprCod = new String[] {""} ;
      P094S2_A719PrdNum = new String[] {""} ;
      P094S2_A130BarCodPar = new String[] {""} ;
      P094S2_A132BarCodReo = new byte[1] ;
      P094S2_A129BarCod = new int[1] ;
      P094S2_A5807LanyLote = new String[] {""} ;
      P094S2_n5807LanyLote = new boolean[] {false} ;
      P094S2_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094S2_n4579LanyFec = new boolean[] {false} ;
      P094S2_A4578LanyUsr = new String[] {""} ;
      P094S2_n4578LanyUsr = new boolean[] {false} ;
      P094S2_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094S2_n1378PrdCFin = new boolean[] {false} ;
      P094S2_A718PrdNom = new String[] {""} ;
      P094S2_A1377RecNumAny = new byte[1] ;
      P094S2_A2808RecLinMAL = new short[1] ;
      AV48Option = "" ;
      P094S3_A719PrdNum = new String[] {""} ;
      P094S3_A396EmprCod = new String[] {""} ;
      P094S3_A130BarCodPar = new String[] {""} ;
      P094S3_A132BarCodReo = new byte[1] ;
      P094S3_A129BarCod = new int[1] ;
      P094S3_A5807LanyLote = new String[] {""} ;
      P094S3_n5807LanyLote = new boolean[] {false} ;
      P094S3_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094S3_n4579LanyFec = new boolean[] {false} ;
      P094S3_A4578LanyUsr = new String[] {""} ;
      P094S3_n4578LanyUsr = new boolean[] {false} ;
      P094S3_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094S3_n1378PrdCFin = new boolean[] {false} ;
      P094S3_A718PrdNom = new String[] {""} ;
      P094S3_A1377RecNumAny = new byte[1] ;
      P094S3_A2808RecLinMAL = new short[1] ;
      P094S4_A396EmprCod = new String[] {""} ;
      P094S4_A129BarCod = new int[1] ;
      P094S4_A132BarCodReo = new byte[1] ;
      P094S4_A130BarCodPar = new String[] {""} ;
      P094S4_A2808RecLinMAL = new short[1] ;
      P094S4_A4578LanyUsr = new String[] {""} ;
      P094S4_n4578LanyUsr = new boolean[] {false} ;
      P094S4_A5807LanyLote = new String[] {""} ;
      P094S4_n5807LanyLote = new boolean[] {false} ;
      P094S4_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094S4_n4579LanyFec = new boolean[] {false} ;
      P094S4_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094S4_n1378PrdCFin = new boolean[] {false} ;
      P094S4_A718PrdNom = new String[] {""} ;
      P094S4_A719PrdNum = new String[] {""} ;
      P094S4_A1377RecNumAny = new byte[1] ;
      AV51OptionDesc = "" ;
      P094S5_A396EmprCod = new String[] {""} ;
      P094S5_A129BarCod = new int[1] ;
      P094S5_A132BarCodReo = new byte[1] ;
      P094S5_A130BarCodPar = new String[] {""} ;
      P094S5_A2808RecLinMAL = new short[1] ;
      P094S5_A5807LanyLote = new String[] {""} ;
      P094S5_n5807LanyLote = new boolean[] {false} ;
      P094S5_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P094S5_n4579LanyFec = new boolean[] {false} ;
      P094S5_A4578LanyUsr = new String[] {""} ;
      P094S5_n4578LanyUsr = new boolean[] {false} ;
      P094S5_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P094S5_n1378PrdCFin = new boolean[] {false} ;
      P094S5_A718PrdNom = new String[] {""} ;
      P094S5_A719PrdNum = new String[] {""} ;
      P094S5_A1377RecNumAny = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_adicionesmanualgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P094S2_A396EmprCod, P094S2_A719PrdNum, P094S2_A130BarCodPar, P094S2_A132BarCodReo, P094S2_A129BarCod, P094S2_A5807LanyLote, P094S2_n5807LanyLote, P094S2_A4579LanyFec, P094S2_n4579LanyFec, P094S2_A4578LanyUsr,
            P094S2_n4578LanyUsr, P094S2_A1378PrdCFin, P094S2_n1378PrdCFin, P094S2_A718PrdNom, P094S2_A1377RecNumAny, P094S2_A2808RecLinMAL
            }
            , new Object[] {
            P094S3_A719PrdNum, P094S3_A396EmprCod, P094S3_A130BarCodPar, P094S3_A132BarCodReo, P094S3_A129BarCod, P094S3_A5807LanyLote, P094S3_n5807LanyLote, P094S3_A4579LanyFec, P094S3_n4579LanyFec, P094S3_A4578LanyUsr,
            P094S3_n4578LanyUsr, P094S3_A1378PrdCFin, P094S3_n1378PrdCFin, P094S3_A718PrdNom, P094S3_A1377RecNumAny, P094S3_A2808RecLinMAL
            }
            , new Object[] {
            P094S4_A396EmprCod, P094S4_A129BarCod, P094S4_A132BarCodReo, P094S4_A130BarCodPar, P094S4_A2808RecLinMAL, P094S4_A4578LanyUsr, P094S4_n4578LanyUsr, P094S4_A5807LanyLote, P094S4_n5807LanyLote, P094S4_A4579LanyFec,
            P094S4_n4579LanyFec, P094S4_A1378PrdCFin, P094S4_n1378PrdCFin, P094S4_A718PrdNom, P094S4_A719PrdNum, P094S4_A1377RecNumAny
            }
            , new Object[] {
            P094S5_A396EmprCod, P094S5_A129BarCod, P094S5_A132BarCodReo, P094S5_A130BarCodPar, P094S5_A2808RecLinMAL, P094S5_A5807LanyLote, P094S5_n5807LanyLote, P094S5_A4579LanyFec, P094S5_n4579LanyFec, P094S5_A4578LanyUsr,
            P094S5_n4578LanyUsr, P094S5_A1378PrdCFin, P094S5_n1378PrdCFin, P094S5_A718PrdNom, P094S5_A719PrdNum, P094S5_A1377RecNumAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFRecNumAny ;
   private byte AV21TFRecNumAny_To ;
   private byte AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ;
   private byte AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ;
   private byte A1377RecNumAny ;
   private byte A132BarCodReo ;
   private byte AV67Barcodreo ;
   private short AV18TFRecLinMAL ;
   private short AV19TFRecLinMAL_To ;
   private short AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ;
   private short AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ;
   private short A2808RecLinMAL ;
   private short AV69RecLinMAL ;
   private short Gx_err ;
   private int AV72GXV1 ;
   private int A129BarCod ;
   private int AV66Barcod ;
   private int AV47InsertIndex ;
   private long AV56count ;
   private java.math.BigDecimal AV24TFPrdCFin ;
   private java.math.BigDecimal AV25TFPrdCFin_To ;
   private java.math.BigDecimal AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ;
   private java.math.BigDecimal AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ;
   private java.math.BigDecimal A1378PrdCFin ;
   private String AV22TFPrdNum ;
   private String AV23TFPrdNum_Sel ;
   private String AV63TFPrdNom ;
   private String AV64TFPrdNom_Sel ;
   private String AV34TFLanyUsr ;
   private String AV35TFLanyUsr_Sel ;
   private String AV38TFLanyLote ;
   private String AV39TFLanyLote_Sel ;
   private String A719PrdNum ;
   private String AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ;
   private String AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ;
   private String AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ;
   private String AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ;
   private String scmdbuf ;
   private String lV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String lV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String lV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String lV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String A718PrdNom ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String A130BarCodPar ;
   private String AV68Barcodpar ;
   private String AV65Emprcod ;
   private String A396EmprCod ;
   private java.util.Date AV36TFLanyFec ;
   private java.util.Date AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ;
   private java.util.Date A4579LanyFec ;
   private boolean returnInSub ;
   private boolean brk94S2 ;
   private boolean n5807LanyLote ;
   private boolean n4579LanyFec ;
   private boolean n4578LanyUsr ;
   private boolean n1378PrdCFin ;
   private boolean brk94S4 ;
   private boolean brk94S6 ;
   private boolean brk94S8 ;
   private String AV50OptionsJson ;
   private String AV53OptionsDescJson ;
   private String AV55OptionIndexesJson ;
   private String AV46DDOName ;
   private String AV44SearchTxt ;
   private String AV45SearchTxtTo ;
   private String AV62FilterFullText ;
   private String AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String lV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String AV48Option ;
   private String AV51OptionDesc ;
   private com.genexus.webpanels.WebSession AV57Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P094S2_A396EmprCod ;
   private String[] P094S2_A719PrdNum ;
   private String[] P094S2_A130BarCodPar ;
   private byte[] P094S2_A132BarCodReo ;
   private int[] P094S2_A129BarCod ;
   private String[] P094S2_A5807LanyLote ;
   private boolean[] P094S2_n5807LanyLote ;
   private java.util.Date[] P094S2_A4579LanyFec ;
   private boolean[] P094S2_n4579LanyFec ;
   private String[] P094S2_A4578LanyUsr ;
   private boolean[] P094S2_n4578LanyUsr ;
   private java.math.BigDecimal[] P094S2_A1378PrdCFin ;
   private boolean[] P094S2_n1378PrdCFin ;
   private String[] P094S2_A718PrdNom ;
   private byte[] P094S2_A1377RecNumAny ;
   private short[] P094S2_A2808RecLinMAL ;
   private String[] P094S3_A719PrdNum ;
   private String[] P094S3_A396EmprCod ;
   private String[] P094S3_A130BarCodPar ;
   private byte[] P094S3_A132BarCodReo ;
   private int[] P094S3_A129BarCod ;
   private String[] P094S3_A5807LanyLote ;
   private boolean[] P094S3_n5807LanyLote ;
   private java.util.Date[] P094S3_A4579LanyFec ;
   private boolean[] P094S3_n4579LanyFec ;
   private String[] P094S3_A4578LanyUsr ;
   private boolean[] P094S3_n4578LanyUsr ;
   private java.math.BigDecimal[] P094S3_A1378PrdCFin ;
   private boolean[] P094S3_n1378PrdCFin ;
   private String[] P094S3_A718PrdNom ;
   private byte[] P094S3_A1377RecNumAny ;
   private short[] P094S3_A2808RecLinMAL ;
   private String[] P094S4_A396EmprCod ;
   private int[] P094S4_A129BarCod ;
   private byte[] P094S4_A132BarCodReo ;
   private String[] P094S4_A130BarCodPar ;
   private short[] P094S4_A2808RecLinMAL ;
   private String[] P094S4_A4578LanyUsr ;
   private boolean[] P094S4_n4578LanyUsr ;
   private String[] P094S4_A5807LanyLote ;
   private boolean[] P094S4_n5807LanyLote ;
   private java.util.Date[] P094S4_A4579LanyFec ;
   private boolean[] P094S4_n4579LanyFec ;
   private java.math.BigDecimal[] P094S4_A1378PrdCFin ;
   private boolean[] P094S4_n1378PrdCFin ;
   private String[] P094S4_A718PrdNom ;
   private String[] P094S4_A719PrdNum ;
   private byte[] P094S4_A1377RecNumAny ;
   private String[] P094S5_A396EmprCod ;
   private int[] P094S5_A129BarCod ;
   private byte[] P094S5_A132BarCodReo ;
   private String[] P094S5_A130BarCodPar ;
   private short[] P094S5_A2808RecLinMAL ;
   private String[] P094S5_A5807LanyLote ;
   private boolean[] P094S5_n5807LanyLote ;
   private java.util.Date[] P094S5_A4579LanyFec ;
   private boolean[] P094S5_n4579LanyFec ;
   private String[] P094S5_A4578LanyUsr ;
   private boolean[] P094S5_n4578LanyUsr ;
   private java.math.BigDecimal[] P094S5_A1378PrdCFin ;
   private boolean[] P094S5_n1378PrdCFin ;
   private String[] P094S5_A718PrdNom ;
   private String[] P094S5_A719PrdNum ;
   private byte[] P094S5_A1377RecNumAny ;
   private GXSimpleCollection<String> AV49Options ;
   private GXSimpleCollection<String> AV52OptionsDesc ;
   private GXSimpleCollection<String> AV54OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV59GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV60GridStateFilterValue ;
}

final  class cierrerecetastinte_adicionesmanualgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P094S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          int A129BarCod ,
                                          int AV66Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV67Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV68Barcodpar ,
                                          short AV69RecLinMAL ,
                                          String AV65Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.LanyLote, T1.LanyFec, T1.LanyUsr, T1.PrdCFin, T2.PrdNom, T1.RecNumAny, T1.RecLinMAL FROM" ;
      scmdbuf += " (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P094S3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          int A129BarCod ,
                                          int AV66Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV67Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV68Barcodpar ,
                                          short AV69RecLinMAL ,
                                          String AV65Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[27];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.LanyLote, T1.LanyFec, T1.LanyUsr, T1.PrdCFin, T2.PrdNom, T1.RecNumAny, T1.RecLinMAL FROM" ;
      scmdbuf += " (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P094S4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          String A396EmprCod ,
                                          String AV65Emprcod ,
                                          int A129BarCod ,
                                          int AV66Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV67Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV68Barcodpar ,
                                          short AV69RecLinMAL )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.LanyUsr, T1.LanyLote, T1.LanyFec, T1.PrdCFin, T2.PrdNom, T1.PrdNum, T1.RecNumAny FROM" ;
      scmdbuf += " (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.LanyUsr" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P094S5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          String A396EmprCod ,
                                          String AV65Emprcod ,
                                          int A129BarCod ,
                                          int AV66Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV67Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV68Barcodpar ,
                                          short AV69RecLinMAL )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[27];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.LanyLote, T1.LanyFec, T1.LanyUsr, T1.PrdCFin, T2.PrdNom, T1.PrdNum, T1.RecNumAny FROM" ;
      scmdbuf += " (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV74Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV75Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV76Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV77Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV78Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV79Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV85Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV88Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.LanyLote" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P094S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P094S3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_P094S4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() );
            case 3 :
                  return conditional_P094S5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P094S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094S3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094S4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P094S5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((byte[]) buf[15])[0] = rslt.getByte(12);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
      }
   }

}

