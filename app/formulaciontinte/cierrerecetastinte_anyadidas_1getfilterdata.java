package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_anyadidas_1getfilterdata extends GXProcedure
{
   public cierrerecetastinte_anyadidas_1getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_anyadidas_1getfilterdata.class ), "" );
   }

   public cierrerecetastinte_anyadidas_1getfilterdata( int remoteHandle ,
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
      cierrerecetastinte_anyadidas_1getfilterdata.this.aP5 = new String[] {""};
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
      cierrerecetastinte_anyadidas_1getfilterdata.this.AV22DDOName = aP0;
      cierrerecetastinte_anyadidas_1getfilterdata.this.AV20SearchTxt = aP1;
      cierrerecetastinte_anyadidas_1getfilterdata.this.AV21SearchTxtTo = aP2;
      cierrerecetastinte_anyadidas_1getfilterdata.this.aP3 = aP3;
      cierrerecetastinte_anyadidas_1getfilterdata.this.aP4 = aP4;
      cierrerecetastinte_anyadidas_1getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_RECPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_RECPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("FormulacionTinte.CierreRecetasTinte_Anyadidas_1GridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_Anyadidas_1GridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("FormulacionTinte.CierreRecetasTinte_Anyadidas_1GridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV18TFRecLinPro = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFRecLinPro_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV39TFRecLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFRecLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV41TFRecPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV42TFRecPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV43TFRecPrdDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV44TFRecPrdDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV45TFForPrdUMe = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFForPrdUMe_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV47TFForPrdDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV48TFForPrdDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV49TFPrdCant = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV50TFPrdCant_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV51TFPrdCanFin = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV52TFPrdCanFin_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV41TFRecPrdNum = AV20SearchTxt ;
      AV42TFRecPrdNum_Sel = "" ;
      AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV38FilterFullText ;
      AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV18TFRecLinPro ;
      AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV19TFRecLinPro_To ;
      AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV39TFRecLin ;
      AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV40TFRecLin_To ;
      AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV41TFRecPrdNum ;
      AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV42TFRecPrdNum_Sel ;
      AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV43TFRecPrdDsc ;
      AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV44TFRecPrdDsc_Sel ;
      AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV45TFForPrdUMe ;
      AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV46TFForPrdUMe_To ;
      AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV47TFForPrdDsc ;
      AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV48TFForPrdDsc_Sel ;
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV49TFPrdCant ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV50TFPrdCant_To ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV51TFPrdCanFin ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV52TFPrdCanFin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                           Byte.valueOf(AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) ,
                                           Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) ,
                                           AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                           AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                           AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                           AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                           Byte.valueOf(AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) ,
                                           Byte.valueOf(AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) ,
                                           AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                           AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                           AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                           AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                           AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                           AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           A130BarCodPar ,
                                           AV56BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum), 6, "%") ;
      lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc), 26, "%") ;
      lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc), 5, "%") ;
      /* Using cursor P09EM2 */
      pr_default.execute(0, new Object[] {AV53EmprCod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, Short.valueOf(AV57RecLinMaq), lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, Byte.valueOf(AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to), Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin), Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to), lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum, AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel, lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc, AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel, Byte.valueOf(AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume), Byte.valueOf(AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to), lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc, AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel, AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant, AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to, AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin, AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9EM2 = false ;
         A396EmprCod = P09EM2_A396EmprCod[0] ;
         A129BarCod = P09EM2_A129BarCod[0] ;
         A132BarCodReo = P09EM2_A132BarCodReo[0] ;
         A130BarCodPar = P09EM2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EM2_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09EM2_A872RecPrdNum[0] ;
         A683PrdCanFin = P09EM2_A683PrdCanFin[0] ;
         A686PrdCant = P09EM2_A686PrdCant[0] ;
         A488ForPrdDsc = P09EM2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EM2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P09EM2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09EM2_n490ForPrdUMe[0] ;
         A875RecPrdDsc = P09EM2_A875RecPrdDsc[0] ;
         A811RecLin = P09EM2_A811RecLin[0] ;
         A1273RecLinPro = P09EM2_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09EM2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EM2_n488ForPrdDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09EM2_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brk9EM2 = false ;
            A396EmprCod = P09EM2_A396EmprCod[0] ;
            A129BarCod = P09EM2_A129BarCod[0] ;
            A132BarCodReo = P09EM2_A132BarCodReo[0] ;
            A130BarCodPar = P09EM2_A130BarCodPar[0] ;
            A2804RecLinMaq = P09EM2_A2804RecLinMaq[0] ;
            A811RecLin = P09EM2_A811RecLin[0] ;
            A1273RecLinPro = P09EM2_A1273RecLinPro[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9EM2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV24Option = A872RecPrdNum ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EM2 )
         {
            brk9EM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV43TFRecPrdDsc = AV20SearchTxt ;
      AV44TFRecPrdDsc_Sel = "" ;
      AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV38FilterFullText ;
      AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV18TFRecLinPro ;
      AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV19TFRecLinPro_To ;
      AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV39TFRecLin ;
      AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV40TFRecLin_To ;
      AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV41TFRecPrdNum ;
      AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV42TFRecPrdNum_Sel ;
      AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV43TFRecPrdDsc ;
      AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV44TFRecPrdDsc_Sel ;
      AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV45TFForPrdUMe ;
      AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV46TFForPrdUMe_To ;
      AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV47TFForPrdDsc ;
      AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV48TFForPrdDsc_Sel ;
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV49TFPrdCant ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV50TFPrdCant_To ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV51TFPrdCanFin ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV52TFPrdCanFin_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                           Byte.valueOf(AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) ,
                                           Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) ,
                                           AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                           AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                           AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                           AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                           Byte.valueOf(AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) ,
                                           Byte.valueOf(AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) ,
                                           AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                           AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                           AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                           AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                           AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                           AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           A130BarCodPar ,
                                           AV56BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum), 6, "%") ;
      lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc), 26, "%") ;
      lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc), 5, "%") ;
      /* Using cursor P09EM3 */
      pr_default.execute(1, new Object[] {AV53EmprCod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, Short.valueOf(AV57RecLinMaq), lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, Byte.valueOf(AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to), Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin), Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to), lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum, AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel, lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc, AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel, Byte.valueOf(AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume), Byte.valueOf(AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to), lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc, AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel, AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant, AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to, AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin, AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9EM4 = false ;
         A396EmprCod = P09EM3_A396EmprCod[0] ;
         A129BarCod = P09EM3_A129BarCod[0] ;
         A132BarCodReo = P09EM3_A132BarCodReo[0] ;
         A130BarCodPar = P09EM3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09EM3_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09EM3_A875RecPrdDsc[0] ;
         A683PrdCanFin = P09EM3_A683PrdCanFin[0] ;
         A686PrdCant = P09EM3_A686PrdCant[0] ;
         A488ForPrdDsc = P09EM3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EM3_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P09EM3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09EM3_n490ForPrdUMe[0] ;
         A872RecPrdNum = P09EM3_A872RecPrdNum[0] ;
         A811RecLin = P09EM3_A811RecLin[0] ;
         A1273RecLinPro = P09EM3_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09EM3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EM3_n488ForPrdDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09EM3_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brk9EM4 = false ;
            A396EmprCod = P09EM3_A396EmprCod[0] ;
            A129BarCod = P09EM3_A129BarCod[0] ;
            A132BarCodReo = P09EM3_A132BarCodReo[0] ;
            A130BarCodPar = P09EM3_A130BarCodPar[0] ;
            A2804RecLinMaq = P09EM3_A2804RecLinMaq[0] ;
            A811RecLin = P09EM3_A811RecLin[0] ;
            A1273RecLinPro = P09EM3_A1273RecLinPro[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9EM4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV24Option = A875RecPrdDsc ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EM4 )
         {
            brk9EM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV47TFForPrdDsc = AV20SearchTxt ;
      AV48TFForPrdDsc_Sel = "" ;
      AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = AV38FilterFullText ;
      AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro = AV18TFRecLinPro ;
      AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to = AV19TFRecLinPro_To ;
      AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin = AV39TFRecLin ;
      AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to = AV40TFRecLin_To ;
      AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = AV41TFRecPrdNum ;
      AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = AV42TFRecPrdNum_Sel ;
      AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = AV43TFRecPrdDsc ;
      AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = AV44TFRecPrdDsc_Sel ;
      AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume = AV45TFForPrdUMe ;
      AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to = AV46TFForPrdUMe_To ;
      AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = AV47TFForPrdDsc ;
      AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = AV48TFForPrdDsc_Sel ;
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = AV49TFPrdCant ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = AV50TFPrdCant_To ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = AV51TFPrdCanFin ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = AV52TFPrdCanFin_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                           Byte.valueOf(AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) ,
                                           Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) ,
                                           AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                           AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                           AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                           AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                           Byte.valueOf(AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) ,
                                           Byte.valueOf(AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) ,
                                           AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                           AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                           AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                           AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                           AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                           AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV54BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV55BarCodReo) ,
                                           A130BarCodPar ,
                                           AV56BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV57RecLinMaq) ,
                                           AV53EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext), "%", "") ;
      lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum), 6, "%") ;
      lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc), 26, "%") ;
      lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc), 5, "%") ;
      /* Using cursor P09EM4 */
      pr_default.execute(2, new Object[] {AV53EmprCod, Integer.valueOf(AV54BarCod), Byte.valueOf(AV55BarCodReo), AV56BarCodPar, Short.valueOf(AV57RecLinMaq), lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext, Byte.valueOf(AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro), Byte.valueOf(AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to), Short.valueOf(AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin), Short.valueOf(AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to), lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum, AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel, lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc, AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel, Byte.valueOf(AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume), Byte.valueOf(AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to), lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc, AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel, AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant, AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to, AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin, AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9EM6 = false ;
         A490ForPrdUMe = P09EM4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09EM4_n490ForPrdUMe[0] ;
         A396EmprCod = P09EM4_A396EmprCod[0] ;
         A2804RecLinMaq = P09EM4_A2804RecLinMaq[0] ;
         A130BarCodPar = P09EM4_A130BarCodPar[0] ;
         A132BarCodReo = P09EM4_A132BarCodReo[0] ;
         A129BarCod = P09EM4_A129BarCod[0] ;
         A683PrdCanFin = P09EM4_A683PrdCanFin[0] ;
         A686PrdCant = P09EM4_A686PrdCant[0] ;
         A488ForPrdDsc = P09EM4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EM4_n488ForPrdDsc[0] ;
         A875RecPrdDsc = P09EM4_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09EM4_A872RecPrdNum[0] ;
         A811RecLin = P09EM4_A811RecLin[0] ;
         A1273RecLinPro = P09EM4_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09EM4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EM4_n488ForPrdDsc[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09EM4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09EM4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk9EM6 = false ;
            A2804RecLinMaq = P09EM4_A2804RecLinMaq[0] ;
            A130BarCodPar = P09EM4_A130BarCodPar[0] ;
            A132BarCodReo = P09EM4_A132BarCodReo[0] ;
            A129BarCod = P09EM4_A129BarCod[0] ;
            A811RecLin = P09EM4_A811RecLin[0] ;
            A1273RecLinPro = P09EM4_A1273RecLinPro[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9EM6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV24Option = A488ForPrdDsc ;
            AV23InsertIndex = 1 ;
            while ( ( AV23InsertIndex <= AV25Options.size() ) && ( GXutil.strcmp((String)AV25Options.elementAt(-1+AV23InsertIndex), AV24Option) < 0 ) )
            {
               AV23InsertIndex = (int)(AV23InsertIndex+1) ;
            }
            AV25Options.add(AV24Option, AV23InsertIndex);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV23InsertIndex);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9EM6 )
         {
            brk9EM6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = cierrerecetastinte_anyadidas_1getfilterdata.this.AV26OptionsJson;
      this.aP4[0] = cierrerecetastinte_anyadidas_1getfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = cierrerecetastinte_anyadidas_1getfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38FilterFullText = "" ;
      AV41TFRecPrdNum = "" ;
      AV42TFRecPrdNum_Sel = "" ;
      AV43TFRecPrdDsc = "" ;
      AV44TFRecPrdDsc_Sel = "" ;
      AV47TFForPrdDsc = "" ;
      AV48TFForPrdDsc_Sel = "" ;
      AV49TFPrdCant = DecimalUtil.ZERO ;
      AV50TFPrdCant_To = DecimalUtil.ZERO ;
      AV51TFPrdCanFin = DecimalUtil.ZERO ;
      AV52TFPrdCanFin_To = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = "" ;
      AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = "" ;
      AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel = "" ;
      AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = "" ;
      AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel = "" ;
      AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = "" ;
      AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel = "" ;
      AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant = DecimalUtil.ZERO ;
      AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin = DecimalUtil.ZERO ;
      AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext = "" ;
      lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum = "" ;
      lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc = "" ;
      lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV53EmprCod = "" ;
      A130BarCodPar = "" ;
      AV56BarCodPar = "" ;
      P09EM2_A396EmprCod = new String[] {""} ;
      P09EM2_A129BarCod = new int[1] ;
      P09EM2_A132BarCodReo = new byte[1] ;
      P09EM2_A130BarCodPar = new String[] {""} ;
      P09EM2_A2804RecLinMaq = new short[1] ;
      P09EM2_A872RecPrdNum = new String[] {""} ;
      P09EM2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EM2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EM2_A488ForPrdDsc = new String[] {""} ;
      P09EM2_n488ForPrdDsc = new boolean[] {false} ;
      P09EM2_A490ForPrdUMe = new byte[1] ;
      P09EM2_n490ForPrdUMe = new boolean[] {false} ;
      P09EM2_A875RecPrdDsc = new String[] {""} ;
      P09EM2_A811RecLin = new short[1] ;
      P09EM2_A1273RecLinPro = new byte[1] ;
      AV24Option = "" ;
      P09EM3_A396EmprCod = new String[] {""} ;
      P09EM3_A129BarCod = new int[1] ;
      P09EM3_A132BarCodReo = new byte[1] ;
      P09EM3_A130BarCodPar = new String[] {""} ;
      P09EM3_A2804RecLinMaq = new short[1] ;
      P09EM3_A875RecPrdDsc = new String[] {""} ;
      P09EM3_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EM3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EM3_A488ForPrdDsc = new String[] {""} ;
      P09EM3_n488ForPrdDsc = new boolean[] {false} ;
      P09EM3_A490ForPrdUMe = new byte[1] ;
      P09EM3_n490ForPrdUMe = new boolean[] {false} ;
      P09EM3_A872RecPrdNum = new String[] {""} ;
      P09EM3_A811RecLin = new short[1] ;
      P09EM3_A1273RecLinPro = new byte[1] ;
      P09EM4_A490ForPrdUMe = new byte[1] ;
      P09EM4_n490ForPrdUMe = new boolean[] {false} ;
      P09EM4_A396EmprCod = new String[] {""} ;
      P09EM4_A2804RecLinMaq = new short[1] ;
      P09EM4_A130BarCodPar = new String[] {""} ;
      P09EM4_A132BarCodReo = new byte[1] ;
      P09EM4_A129BarCod = new int[1] ;
      P09EM4_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EM4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EM4_A488ForPrdDsc = new String[] {""} ;
      P09EM4_n488ForPrdDsc = new boolean[] {false} ;
      P09EM4_A875RecPrdDsc = new String[] {""} ;
      P09EM4_A872RecPrdNum = new String[] {""} ;
      P09EM4_A811RecLin = new short[1] ;
      P09EM4_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_anyadidas_1getfilterdata__default(),
         new Object[] {
             new Object[] {
            P09EM2_A396EmprCod, P09EM2_A129BarCod, P09EM2_A132BarCodReo, P09EM2_A130BarCodPar, P09EM2_A2804RecLinMaq, P09EM2_A872RecPrdNum, P09EM2_A683PrdCanFin, P09EM2_A686PrdCant, P09EM2_A488ForPrdDsc, P09EM2_n488ForPrdDsc,
            P09EM2_A490ForPrdUMe, P09EM2_n490ForPrdUMe, P09EM2_A875RecPrdDsc, P09EM2_A811RecLin, P09EM2_A1273RecLinPro
            }
            , new Object[] {
            P09EM3_A396EmprCod, P09EM3_A129BarCod, P09EM3_A132BarCodReo, P09EM3_A130BarCodPar, P09EM3_A2804RecLinMaq, P09EM3_A875RecPrdDsc, P09EM3_A683PrdCanFin, P09EM3_A686PrdCant, P09EM3_A488ForPrdDsc, P09EM3_n488ForPrdDsc,
            P09EM3_A490ForPrdUMe, P09EM3_n490ForPrdUMe, P09EM3_A872RecPrdNum, P09EM3_A811RecLin, P09EM3_A1273RecLinPro
            }
            , new Object[] {
            P09EM4_A490ForPrdUMe, P09EM4_n490ForPrdUMe, P09EM4_A396EmprCod, P09EM4_A2804RecLinMaq, P09EM4_A130BarCodPar, P09EM4_A132BarCodReo, P09EM4_A129BarCod, P09EM4_A683PrdCanFin, P09EM4_A686PrdCant, P09EM4_A488ForPrdDsc,
            P09EM4_n488ForPrdDsc, P09EM4_A875RecPrdDsc, P09EM4_A872RecPrdNum, P09EM4_A811RecLin, P09EM4_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFRecLinPro ;
   private byte AV19TFRecLinPro_To ;
   private byte AV45TFForPrdUMe ;
   private byte AV46TFForPrdUMe_To ;
   private byte AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro ;
   private byte AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to ;
   private byte AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume ;
   private byte AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte AV55BarCodReo ;
   private short AV39TFRecLin ;
   private short AV40TFRecLin_To ;
   private short AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin ;
   private short AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short AV57RecLinMaq ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int A129BarCod ;
   private int AV54BarCod ;
   private int AV23InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV49TFPrdCant ;
   private java.math.BigDecimal AV50TFPrdCant_To ;
   private java.math.BigDecimal AV51TFPrdCanFin ;
   private java.math.BigDecimal AV52TFPrdCanFin_To ;
   private java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ;
   private java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ;
   private java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ;
   private java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private String AV41TFRecPrdNum ;
   private String AV42TFRecPrdNum_Sel ;
   private String AV43TFRecPrdDsc ;
   private String AV44TFRecPrdDsc_Sel ;
   private String AV47TFForPrdDsc ;
   private String AV48TFForPrdDsc_Sel ;
   private String A872RecPrdNum ;
   private String AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ;
   private String AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ;
   private String AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ;
   private String AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ;
   private String AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ;
   private String AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ;
   private String lV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ;
   private String lV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A396EmprCod ;
   private String AV53EmprCod ;
   private String A130BarCodPar ;
   private String AV56BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9EM2 ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private boolean brk9EM4 ;
   private boolean brk9EM6 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ;
   private String lV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09EM2_A396EmprCod ;
   private int[] P09EM2_A129BarCod ;
   private byte[] P09EM2_A132BarCodReo ;
   private String[] P09EM2_A130BarCodPar ;
   private short[] P09EM2_A2804RecLinMaq ;
   private String[] P09EM2_A872RecPrdNum ;
   private java.math.BigDecimal[] P09EM2_A683PrdCanFin ;
   private java.math.BigDecimal[] P09EM2_A686PrdCant ;
   private String[] P09EM2_A488ForPrdDsc ;
   private boolean[] P09EM2_n488ForPrdDsc ;
   private byte[] P09EM2_A490ForPrdUMe ;
   private boolean[] P09EM2_n490ForPrdUMe ;
   private String[] P09EM2_A875RecPrdDsc ;
   private short[] P09EM2_A811RecLin ;
   private byte[] P09EM2_A1273RecLinPro ;
   private String[] P09EM3_A396EmprCod ;
   private int[] P09EM3_A129BarCod ;
   private byte[] P09EM3_A132BarCodReo ;
   private String[] P09EM3_A130BarCodPar ;
   private short[] P09EM3_A2804RecLinMaq ;
   private String[] P09EM3_A875RecPrdDsc ;
   private java.math.BigDecimal[] P09EM3_A683PrdCanFin ;
   private java.math.BigDecimal[] P09EM3_A686PrdCant ;
   private String[] P09EM3_A488ForPrdDsc ;
   private boolean[] P09EM3_n488ForPrdDsc ;
   private byte[] P09EM3_A490ForPrdUMe ;
   private boolean[] P09EM3_n490ForPrdUMe ;
   private String[] P09EM3_A872RecPrdNum ;
   private short[] P09EM3_A811RecLin ;
   private byte[] P09EM3_A1273RecLinPro ;
   private byte[] P09EM4_A490ForPrdUMe ;
   private boolean[] P09EM4_n490ForPrdUMe ;
   private String[] P09EM4_A396EmprCod ;
   private short[] P09EM4_A2804RecLinMaq ;
   private String[] P09EM4_A130BarCodPar ;
   private byte[] P09EM4_A132BarCodReo ;
   private int[] P09EM4_A129BarCod ;
   private java.math.BigDecimal[] P09EM4_A683PrdCanFin ;
   private java.math.BigDecimal[] P09EM4_A686PrdCant ;
   private String[] P09EM4_A488ForPrdDsc ;
   private boolean[] P09EM4_n488ForPrdDsc ;
   private String[] P09EM4_A875RecPrdDsc ;
   private String[] P09EM4_A872RecPrdNum ;
   private short[] P09EM4_A811RecLin ;
   private byte[] P09EM4_A1273RecLinPro ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class cierrerecetastinte_anyadidas_1getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                          byte AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro ,
                                          byte AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to ,
                                          short AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin ,
                                          short AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to ,
                                          String AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                          String AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                          String AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                          String AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                          byte AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume ,
                                          byte AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to ,
                                          String AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                          String AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A129BarCod ,
                                          int AV54BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV55BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV56BarCodPar ,
                                          short A2804RecLinMaq ,
                                          short AV57RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdDsc, T1.RecLin," ;
      scmdbuf += " T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?))");
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
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09EM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                          byte AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro ,
                                          byte AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to ,
                                          short AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin ,
                                          short AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to ,
                                          String AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                          String AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                          String AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                          String AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                          byte AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume ,
                                          byte AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to ,
                                          String AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                          String AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A129BarCod ,
                                          int AV54BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV55BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV56BarCodPar ,
                                          short A2804RecLinMaq ,
                                          short AV57RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe, T1.RecPrdNum, T1.RecLin," ;
      scmdbuf += " T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?))");
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
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09EM4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext ,
                                          byte AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro ,
                                          byte AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to ,
                                          short AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin ,
                                          short AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to ,
                                          String AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel ,
                                          String AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum ,
                                          String AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel ,
                                          String AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc ,
                                          byte AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume ,
                                          byte AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to ,
                                          String AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel ,
                                          String AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc ,
                                          java.math.BigDecimal AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant ,
                                          java.math.BigDecimal AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to ,
                                          java.math.BigDecimal AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin ,
                                          java.math.BigDecimal AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          int A129BarCod ,
                                          int AV54BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV55BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV56BarCodPar ,
                                          short A2804RecLinMaq ,
                                          short AV57RecLinMaq ,
                                          String AV53EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.PrdCanFin, T1.PrdCant, T2.ForPrdDsc, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin," ;
      scmdbuf += " T1.RecLinPro FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_cierrerecetastinte_anyadidas_1ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForPrdUMe,'90'), 2) like '%' || ?) or ( UPPER(T2.ForPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCant,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanFin,'9999990.999'), 2) like '%' || ?))");
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
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_cierrerecetastinte_anyadidas_1ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_cierrerecetastinte_anyadidas_1ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_cierrerecetastinte_anyadidas_1ds_4_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_cierrerecetastinte_anyadidas_1ds_5_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_cierrerecetastinte_anyadidas_1ds_6_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_cierrerecetastinte_anyadidas_1ds_7_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Formulaciontinte_cierrerecetastinte_anyadidas_1ds_8_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Formulaciontinte_cierrerecetastinte_anyadidas_1ds_9_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_cierrerecetastinte_anyadidas_1ds_10_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_cierrerecetastinte_anyadidas_1ds_11_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_cierrerecetastinte_anyadidas_1ds_12_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_cierrerecetastinte_anyadidas_1ds_13_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_cierrerecetastinte_anyadidas_1ds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Formulaciontinte_cierrerecetastinte_anyadidas_1ds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Formulaciontinte_cierrerecetastinte_anyadidas_1ds_16_tfprdcanfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Formulaciontinte_cierrerecetastinte_anyadidas_1ds_17_tfprdcanfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09EM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() );
            case 1 :
                  return conditional_P09EM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() );
            case 2 :
                  return conditional_P09EM4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09EM4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 26);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[9])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 3);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 3);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 3);
               }
               return;
      }
   }

}

