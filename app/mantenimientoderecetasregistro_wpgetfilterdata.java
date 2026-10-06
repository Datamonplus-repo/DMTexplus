package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientoderecetasregistro_wpgetfilterdata extends GXProcedure
{
   public mantenimientoderecetasregistro_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientoderecetasregistro_wpgetfilterdata.class ), "" );
   }

   public mantenimientoderecetasregistro_wpgetfilterdata( int remoteHandle ,
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
      mantenimientoderecetasregistro_wpgetfilterdata.this.aP5 = new String[] {""};
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
      mantenimientoderecetasregistro_wpgetfilterdata.this.AV38DDOName = aP0;
      mantenimientoderecetasregistro_wpgetfilterdata.this.AV36SearchTxt = aP1;
      mantenimientoderecetasregistro_wpgetfilterdata.this.AV37SearchTxtTo = aP2;
      mantenimientoderecetasregistro_wpgetfilterdata.this.aP3 = aP3;
      mantenimientoderecetasregistro_wpgetfilterdata.this.aP4 = aP4;
      mantenimientoderecetasregistro_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_RECPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_RECPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_FORPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_RECLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLOTEOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV49Session.getValue("MantenimientodeRecetasRegistro_WPGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientodeRecetasRegistro_WPGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("MantenimientodeRecetasRegistro_WPGridState"), null, null);
      }
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV63GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV10TFRecLin = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLin_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV12TFRecPrdNum = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV13TFRecPrdNum_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV16TFRecPrdDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV17TFRecPrdDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV20TFFacCon = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFFacCon_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV22TFForPrdUMe = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFForPrdUMe_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV24TFForPrdDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV25TFForPrdDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV26TFPrdCant = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFPrdCant_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV28TFRecLote = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV29TFRecLote_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV30TFRecForNro = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFRecForNro_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV32TFRecPrdTnq = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFRecPrdTnq_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFRecPrdNum = AV36SearchTxt ;
      AV13TFRecPrdNum_Sel = "" ;
      AV65Mantenimientoderecetasregistro_wpds_1_tfreclin = AV10TFRecLin ;
      AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to = AV11TFRecLin_To ;
      AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = AV12TFRecPrdNum ;
      AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel = AV13TFRecPrdNum_Sel ;
      AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = AV16TFRecPrdDsc ;
      AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV71Mantenimientoderecetasregistro_wpds_7_tffaccon = AV20TFFacCon ;
      AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to = AV21TFFacCon_To ;
      AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume = AV22TFForPrdUMe ;
      AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = AV24TFForPrdDsc ;
      AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant = AV26TFPrdCant ;
      AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to = AV27TFPrdCant_To ;
      AV79Mantenimientoderecetasregistro_wpds_15_tfreclote = AV28TFRecLote ;
      AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel = AV29TFRecLote_Sel ;
      AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro = AV30TFRecForNro ;
      AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to = AV31TFRecForNro_To ;
      AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) ,
                                           Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) ,
                                           AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                           AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                           AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                           AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                           AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                           AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                           Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) ,
                                           AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                           AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                           AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                           AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                           AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                           AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                           Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) ,
                                           Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A5725RecLote ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57Barcodreo) ,
                                           A130BarCodPar ,
                                           AV58Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV59RecLinMaq) ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Byte.valueOf(AV60RecLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum), 6, "%") ;
      lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc), 26, "%") ;
      lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc), 5, "%") ;
      lV79Mantenimientoderecetasregistro_wpds_15_tfreclote = GXutil.padr( GXutil.rtrim( AV79Mantenimientoderecetasregistro_wpds_15_tfreclote), 26, "%") ;
      /* Using cursor P09BT2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV56Barcod), Byte.valueOf(AV57Barcodreo), AV58Barcodpar, Short.valueOf(AV59RecLinMaq), Byte.valueOf(AV60RecLinPro), Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin), Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to), lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum, AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel, lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc, AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to, Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume), Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to), lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc, AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to, lV79Mantenimientoderecetasregistro_wpds_15_tfreclote, AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel, Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro), Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to), Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq), Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9BT2 = false ;
         A396EmprCod = P09BT2_A396EmprCod[0] ;
         A129BarCod = P09BT2_A129BarCod[0] ;
         A132BarCodReo = P09BT2_A132BarCodReo[0] ;
         A130BarCodPar = P09BT2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BT2_A2804RecLinMaq[0] ;
         A1273RecLinPro = P09BT2_A1273RecLinPro[0] ;
         A872RecPrdNum = P09BT2_A872RecPrdNum[0] ;
         A3274RecPrdTnq = P09BT2_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BT2_A2394RecForNro[0] ;
         A5725RecLote = P09BT2_A5725RecLote[0] ;
         A686PrdCant = P09BT2_A686PrdCant[0] ;
         A488ForPrdDsc = P09BT2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P09BT2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BT2_n490ForPrdUMe[0] ;
         A431FacCon = P09BT2_A431FacCon[0] ;
         A875RecPrdDsc = P09BT2_A875RecPrdDsc[0] ;
         A811RecLin = P09BT2_A811RecLin[0] ;
         A488ForPrdDsc = P09BT2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT2_n488ForPrdDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09BT2_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brk9BT2 = false ;
            A396EmprCod = P09BT2_A396EmprCod[0] ;
            A129BarCod = P09BT2_A129BarCod[0] ;
            A132BarCodReo = P09BT2_A132BarCodReo[0] ;
            A130BarCodPar = P09BT2_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BT2_A2804RecLinMaq[0] ;
            A1273RecLinPro = P09BT2_A1273RecLinPro[0] ;
            A811RecLin = P09BT2_A811RecLin[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BT2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV40Option = A872RecPrdNum ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BT2 )
         {
            brk9BT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFRecPrdDsc = AV36SearchTxt ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV65Mantenimientoderecetasregistro_wpds_1_tfreclin = AV10TFRecLin ;
      AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to = AV11TFRecLin_To ;
      AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = AV12TFRecPrdNum ;
      AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel = AV13TFRecPrdNum_Sel ;
      AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = AV16TFRecPrdDsc ;
      AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV71Mantenimientoderecetasregistro_wpds_7_tffaccon = AV20TFFacCon ;
      AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to = AV21TFFacCon_To ;
      AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume = AV22TFForPrdUMe ;
      AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = AV24TFForPrdDsc ;
      AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant = AV26TFPrdCant ;
      AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to = AV27TFPrdCant_To ;
      AV79Mantenimientoderecetasregistro_wpds_15_tfreclote = AV28TFRecLote ;
      AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel = AV29TFRecLote_Sel ;
      AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro = AV30TFRecForNro ;
      AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to = AV31TFRecForNro_To ;
      AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) ,
                                           Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) ,
                                           AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                           AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                           AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                           AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                           AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                           AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                           Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) ,
                                           AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                           AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                           AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                           AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                           AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                           AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                           Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) ,
                                           Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A5725RecLote ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57Barcodreo) ,
                                           A130BarCodPar ,
                                           AV58Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV59RecLinMaq) ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Byte.valueOf(AV60RecLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum), 6, "%") ;
      lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc), 26, "%") ;
      lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc), 5, "%") ;
      lV79Mantenimientoderecetasregistro_wpds_15_tfreclote = GXutil.padr( GXutil.rtrim( AV79Mantenimientoderecetasregistro_wpds_15_tfreclote), 26, "%") ;
      /* Using cursor P09BT3 */
      pr_default.execute(1, new Object[] {AV55Emprcod, Integer.valueOf(AV56Barcod), Byte.valueOf(AV57Barcodreo), AV58Barcodpar, Short.valueOf(AV59RecLinMaq), Byte.valueOf(AV60RecLinPro), Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin), Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to), lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum, AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel, lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc, AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to, Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume), Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to), lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc, AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to, lV79Mantenimientoderecetasregistro_wpds_15_tfreclote, AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel, Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro), Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to), Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq), Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9BT4 = false ;
         A396EmprCod = P09BT3_A396EmprCod[0] ;
         A129BarCod = P09BT3_A129BarCod[0] ;
         A132BarCodReo = P09BT3_A132BarCodReo[0] ;
         A130BarCodPar = P09BT3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BT3_A2804RecLinMaq[0] ;
         A1273RecLinPro = P09BT3_A1273RecLinPro[0] ;
         A875RecPrdDsc = P09BT3_A875RecPrdDsc[0] ;
         A3274RecPrdTnq = P09BT3_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BT3_A2394RecForNro[0] ;
         A5725RecLote = P09BT3_A5725RecLote[0] ;
         A686PrdCant = P09BT3_A686PrdCant[0] ;
         A488ForPrdDsc = P09BT3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT3_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P09BT3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BT3_n490ForPrdUMe[0] ;
         A431FacCon = P09BT3_A431FacCon[0] ;
         A872RecPrdNum = P09BT3_A872RecPrdNum[0] ;
         A811RecLin = P09BT3_A811RecLin[0] ;
         A488ForPrdDsc = P09BT3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT3_n488ForPrdDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09BT3_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brk9BT4 = false ;
            A396EmprCod = P09BT3_A396EmprCod[0] ;
            A129BarCod = P09BT3_A129BarCod[0] ;
            A132BarCodReo = P09BT3_A132BarCodReo[0] ;
            A130BarCodPar = P09BT3_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BT3_A2804RecLinMaq[0] ;
            A1273RecLinPro = P09BT3_A1273RecLinPro[0] ;
            A811RecLin = P09BT3_A811RecLin[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BT4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV40Option = A875RecPrdDsc ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BT4 )
         {
            brk9BT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFForPrdDsc = AV36SearchTxt ;
      AV25TFForPrdDsc_Sel = "" ;
      AV65Mantenimientoderecetasregistro_wpds_1_tfreclin = AV10TFRecLin ;
      AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to = AV11TFRecLin_To ;
      AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = AV12TFRecPrdNum ;
      AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel = AV13TFRecPrdNum_Sel ;
      AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = AV16TFRecPrdDsc ;
      AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV71Mantenimientoderecetasregistro_wpds_7_tffaccon = AV20TFFacCon ;
      AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to = AV21TFFacCon_To ;
      AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume = AV22TFForPrdUMe ;
      AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = AV24TFForPrdDsc ;
      AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant = AV26TFPrdCant ;
      AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to = AV27TFPrdCant_To ;
      AV79Mantenimientoderecetasregistro_wpds_15_tfreclote = AV28TFRecLote ;
      AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel = AV29TFRecLote_Sel ;
      AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro = AV30TFRecForNro ;
      AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to = AV31TFRecForNro_To ;
      AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) ,
                                           Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) ,
                                           AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                           AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                           AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                           AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                           AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                           AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                           Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) ,
                                           AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                           AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                           AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                           AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                           AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                           AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                           Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) ,
                                           Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A5725RecLote ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57Barcodreo) ,
                                           A130BarCodPar ,
                                           AV58Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV59RecLinMaq) ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Byte.valueOf(AV60RecLinPro) ,
                                           AV55Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum), 6, "%") ;
      lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc), 26, "%") ;
      lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc), 5, "%") ;
      lV79Mantenimientoderecetasregistro_wpds_15_tfreclote = GXutil.padr( GXutil.rtrim( AV79Mantenimientoderecetasregistro_wpds_15_tfreclote), 26, "%") ;
      /* Using cursor P09BT4 */
      pr_default.execute(2, new Object[] {AV55Emprcod, Integer.valueOf(AV56Barcod), Byte.valueOf(AV57Barcodreo), AV58Barcodpar, Short.valueOf(AV59RecLinMaq), Byte.valueOf(AV60RecLinPro), Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin), Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to), lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum, AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel, lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc, AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to, Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume), Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to), lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc, AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to, lV79Mantenimientoderecetasregistro_wpds_15_tfreclote, AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel, Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro), Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to), Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq), Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9BT6 = false ;
         A490ForPrdUMe = P09BT4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BT4_n490ForPrdUMe[0] ;
         A396EmprCod = P09BT4_A396EmprCod[0] ;
         A1273RecLinPro = P09BT4_A1273RecLinPro[0] ;
         A2804RecLinMaq = P09BT4_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BT4_A130BarCodPar[0] ;
         A132BarCodReo = P09BT4_A132BarCodReo[0] ;
         A129BarCod = P09BT4_A129BarCod[0] ;
         A3274RecPrdTnq = P09BT4_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BT4_A2394RecForNro[0] ;
         A5725RecLote = P09BT4_A5725RecLote[0] ;
         A686PrdCant = P09BT4_A686PrdCant[0] ;
         A488ForPrdDsc = P09BT4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT4_n488ForPrdDsc[0] ;
         A431FacCon = P09BT4_A431FacCon[0] ;
         A875RecPrdDsc = P09BT4_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09BT4_A872RecPrdNum[0] ;
         A811RecLin = P09BT4_A811RecLin[0] ;
         A488ForPrdDsc = P09BT4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT4_n488ForPrdDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09BT4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09BT4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk9BT6 = false ;
            A1273RecLinPro = P09BT4_A1273RecLinPro[0] ;
            A2804RecLinMaq = P09BT4_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BT4_A130BarCodPar[0] ;
            A132BarCodReo = P09BT4_A132BarCodReo[0] ;
            A129BarCod = P09BT4_A129BarCod[0] ;
            A811RecLin = P09BT4_A811RecLin[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BT6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV40Option = A488ForPrdDsc ;
            AV39InsertIndex = 1 ;
            while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV41Options.elementAt(-1+AV39InsertIndex), AV40Option) < 0 ) )
            {
               AV39InsertIndex = (int)(AV39InsertIndex+1) ;
            }
            AV41Options.add(AV40Option, AV39InsertIndex);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BT6 )
         {
            brk9BT6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV28TFRecLote = AV36SearchTxt ;
      AV29TFRecLote_Sel = "" ;
      AV65Mantenimientoderecetasregistro_wpds_1_tfreclin = AV10TFRecLin ;
      AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to = AV11TFRecLin_To ;
      AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = AV12TFRecPrdNum ;
      AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel = AV13TFRecPrdNum_Sel ;
      AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = AV16TFRecPrdDsc ;
      AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV71Mantenimientoderecetasregistro_wpds_7_tffaccon = AV20TFFacCon ;
      AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to = AV21TFFacCon_To ;
      AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume = AV22TFForPrdUMe ;
      AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = AV24TFForPrdDsc ;
      AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant = AV26TFPrdCant ;
      AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to = AV27TFPrdCant_To ;
      AV79Mantenimientoderecetasregistro_wpds_15_tfreclote = AV28TFRecLote ;
      AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel = AV29TFRecLote_Sel ;
      AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro = AV30TFRecForNro ;
      AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to = AV31TFRecForNro_To ;
      AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) ,
                                           Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) ,
                                           AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                           AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                           AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                           AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                           AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                           AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                           Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) ,
                                           AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                           AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                           AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                           AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                           AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                           AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                           Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) ,
                                           Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A5725RecLote ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57Barcodreo) ,
                                           A130BarCodPar ,
                                           AV58Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV59RecLinMaq) ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Byte.valueOf(AV60RecLinPro) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum), 6, "%") ;
      lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc), 26, "%") ;
      lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc), 5, "%") ;
      lV79Mantenimientoderecetasregistro_wpds_15_tfreclote = GXutil.padr( GXutil.rtrim( AV79Mantenimientoderecetasregistro_wpds_15_tfreclote), 26, "%") ;
      /* Using cursor P09BT5 */
      pr_default.execute(3, new Object[] {AV55Emprcod, Integer.valueOf(AV56Barcod), Byte.valueOf(AV57Barcodreo), AV58Barcodpar, Short.valueOf(AV59RecLinMaq), Byte.valueOf(AV60RecLinPro), Short.valueOf(AV65Mantenimientoderecetasregistro_wpds_1_tfreclin), Short.valueOf(AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to), lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum, AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel, lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc, AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to, Byte.valueOf(AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume), Byte.valueOf(AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to), lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc, AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to, lV79Mantenimientoderecetasregistro_wpds_15_tfreclote, AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel, Byte.valueOf(AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro), Byte.valueOf(AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to), Byte.valueOf(AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq), Byte.valueOf(AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9BT8 = false ;
         A396EmprCod = P09BT5_A396EmprCod[0] ;
         A129BarCod = P09BT5_A129BarCod[0] ;
         A132BarCodReo = P09BT5_A132BarCodReo[0] ;
         A130BarCodPar = P09BT5_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BT5_A2804RecLinMaq[0] ;
         A1273RecLinPro = P09BT5_A1273RecLinPro[0] ;
         A5725RecLote = P09BT5_A5725RecLote[0] ;
         A3274RecPrdTnq = P09BT5_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BT5_A2394RecForNro[0] ;
         A686PrdCant = P09BT5_A686PrdCant[0] ;
         A488ForPrdDsc = P09BT5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT5_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P09BT5_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BT5_n490ForPrdUMe[0] ;
         A431FacCon = P09BT5_A431FacCon[0] ;
         A875RecPrdDsc = P09BT5_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09BT5_A872RecPrdNum[0] ;
         A811RecLin = P09BT5_A811RecLin[0] ;
         A488ForPrdDsc = P09BT5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BT5_n488ForPrdDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09BT5_A5725RecLote[0], A5725RecLote) == 0 ) )
         {
            brk9BT8 = false ;
            A396EmprCod = P09BT5_A396EmprCod[0] ;
            A129BarCod = P09BT5_A129BarCod[0] ;
            A132BarCodReo = P09BT5_A132BarCodReo[0] ;
            A130BarCodPar = P09BT5_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BT5_A2804RecLinMaq[0] ;
            A1273RecLinPro = P09BT5_A1273RecLinPro[0] ;
            A811RecLin = P09BT5_A811RecLin[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BT8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5725RecLote)==0) )
         {
            AV40Option = A5725RecLote ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BT8 )
         {
            brk9BT8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantenimientoderecetasregistro_wpgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = mantenimientoderecetasregistro_wpgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = mantenimientoderecetasregistro_wpgetfilterdata.this.AV47OptionIndexesJson;
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
      AV12TFRecPrdNum = "" ;
      AV13TFRecPrdNum_Sel = "" ;
      AV16TFRecPrdDsc = "" ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV20TFFacCon = DecimalUtil.ZERO ;
      AV21TFFacCon_To = DecimalUtil.ZERO ;
      AV24TFForPrdDsc = "" ;
      AV25TFForPrdDsc_Sel = "" ;
      AV26TFPrdCant = DecimalUtil.ZERO ;
      AV27TFPrdCant_To = DecimalUtil.ZERO ;
      AV28TFRecLote = "" ;
      AV29TFRecLote_Sel = "" ;
      A872RecPrdNum = "" ;
      AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = "" ;
      AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel = "" ;
      AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = "" ;
      AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel = "" ;
      AV71Mantenimientoderecetasregistro_wpds_7_tffaccon = DecimalUtil.ZERO ;
      AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to = DecimalUtil.ZERO ;
      AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = "" ;
      AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel = "" ;
      AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant = DecimalUtil.ZERO ;
      AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to = DecimalUtil.ZERO ;
      AV79Mantenimientoderecetasregistro_wpds_15_tfreclote = "" ;
      AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum = "" ;
      lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc = "" ;
      lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc = "" ;
      lV79Mantenimientoderecetasregistro_wpds_15_tfreclote = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A396EmprCod = "" ;
      AV55Emprcod = "" ;
      A130BarCodPar = "" ;
      AV58Barcodpar = "" ;
      P09BT2_A396EmprCod = new String[] {""} ;
      P09BT2_A129BarCod = new int[1] ;
      P09BT2_A132BarCodReo = new byte[1] ;
      P09BT2_A130BarCodPar = new String[] {""} ;
      P09BT2_A2804RecLinMaq = new short[1] ;
      P09BT2_A1273RecLinPro = new byte[1] ;
      P09BT2_A872RecPrdNum = new String[] {""} ;
      P09BT2_A3274RecPrdTnq = new byte[1] ;
      P09BT2_A2394RecForNro = new byte[1] ;
      P09BT2_A5725RecLote = new String[] {""} ;
      P09BT2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT2_A488ForPrdDsc = new String[] {""} ;
      P09BT2_n488ForPrdDsc = new boolean[] {false} ;
      P09BT2_A490ForPrdUMe = new byte[1] ;
      P09BT2_n490ForPrdUMe = new boolean[] {false} ;
      P09BT2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT2_A875RecPrdDsc = new String[] {""} ;
      P09BT2_A811RecLin = new short[1] ;
      AV40Option = "" ;
      P09BT3_A396EmprCod = new String[] {""} ;
      P09BT3_A129BarCod = new int[1] ;
      P09BT3_A132BarCodReo = new byte[1] ;
      P09BT3_A130BarCodPar = new String[] {""} ;
      P09BT3_A2804RecLinMaq = new short[1] ;
      P09BT3_A1273RecLinPro = new byte[1] ;
      P09BT3_A875RecPrdDsc = new String[] {""} ;
      P09BT3_A3274RecPrdTnq = new byte[1] ;
      P09BT3_A2394RecForNro = new byte[1] ;
      P09BT3_A5725RecLote = new String[] {""} ;
      P09BT3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT3_A488ForPrdDsc = new String[] {""} ;
      P09BT3_n488ForPrdDsc = new boolean[] {false} ;
      P09BT3_A490ForPrdUMe = new byte[1] ;
      P09BT3_n490ForPrdUMe = new boolean[] {false} ;
      P09BT3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT3_A872RecPrdNum = new String[] {""} ;
      P09BT3_A811RecLin = new short[1] ;
      P09BT4_A490ForPrdUMe = new byte[1] ;
      P09BT4_n490ForPrdUMe = new boolean[] {false} ;
      P09BT4_A396EmprCod = new String[] {""} ;
      P09BT4_A1273RecLinPro = new byte[1] ;
      P09BT4_A2804RecLinMaq = new short[1] ;
      P09BT4_A130BarCodPar = new String[] {""} ;
      P09BT4_A132BarCodReo = new byte[1] ;
      P09BT4_A129BarCod = new int[1] ;
      P09BT4_A3274RecPrdTnq = new byte[1] ;
      P09BT4_A2394RecForNro = new byte[1] ;
      P09BT4_A5725RecLote = new String[] {""} ;
      P09BT4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT4_A488ForPrdDsc = new String[] {""} ;
      P09BT4_n488ForPrdDsc = new boolean[] {false} ;
      P09BT4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT4_A875RecPrdDsc = new String[] {""} ;
      P09BT4_A872RecPrdNum = new String[] {""} ;
      P09BT4_A811RecLin = new short[1] ;
      P09BT5_A396EmprCod = new String[] {""} ;
      P09BT5_A129BarCod = new int[1] ;
      P09BT5_A132BarCodReo = new byte[1] ;
      P09BT5_A130BarCodPar = new String[] {""} ;
      P09BT5_A2804RecLinMaq = new short[1] ;
      P09BT5_A1273RecLinPro = new byte[1] ;
      P09BT5_A5725RecLote = new String[] {""} ;
      P09BT5_A3274RecPrdTnq = new byte[1] ;
      P09BT5_A2394RecForNro = new byte[1] ;
      P09BT5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT5_A488ForPrdDsc = new String[] {""} ;
      P09BT5_n488ForPrdDsc = new boolean[] {false} ;
      P09BT5_A490ForPrdUMe = new byte[1] ;
      P09BT5_n490ForPrdUMe = new boolean[] {false} ;
      P09BT5_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BT5_A875RecPrdDsc = new String[] {""} ;
      P09BT5_A872RecPrdNum = new String[] {""} ;
      P09BT5_A811RecLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientoderecetasregistro_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09BT2_A396EmprCod, P09BT2_A129BarCod, P09BT2_A132BarCodReo, P09BT2_A130BarCodPar, P09BT2_A2804RecLinMaq, P09BT2_A1273RecLinPro, P09BT2_A872RecPrdNum, P09BT2_A3274RecPrdTnq, P09BT2_A2394RecForNro, P09BT2_A5725RecLote,
            P09BT2_A686PrdCant, P09BT2_A488ForPrdDsc, P09BT2_n488ForPrdDsc, P09BT2_A490ForPrdUMe, P09BT2_n490ForPrdUMe, P09BT2_A431FacCon, P09BT2_A875RecPrdDsc, P09BT2_A811RecLin
            }
            , new Object[] {
            P09BT3_A396EmprCod, P09BT3_A129BarCod, P09BT3_A132BarCodReo, P09BT3_A130BarCodPar, P09BT3_A2804RecLinMaq, P09BT3_A1273RecLinPro, P09BT3_A875RecPrdDsc, P09BT3_A3274RecPrdTnq, P09BT3_A2394RecForNro, P09BT3_A5725RecLote,
            P09BT3_A686PrdCant, P09BT3_A488ForPrdDsc, P09BT3_n488ForPrdDsc, P09BT3_A490ForPrdUMe, P09BT3_n490ForPrdUMe, P09BT3_A431FacCon, P09BT3_A872RecPrdNum, P09BT3_A811RecLin
            }
            , new Object[] {
            P09BT4_A490ForPrdUMe, P09BT4_n490ForPrdUMe, P09BT4_A396EmprCod, P09BT4_A1273RecLinPro, P09BT4_A2804RecLinMaq, P09BT4_A130BarCodPar, P09BT4_A132BarCodReo, P09BT4_A129BarCod, P09BT4_A3274RecPrdTnq, P09BT4_A2394RecForNro,
            P09BT4_A5725RecLote, P09BT4_A686PrdCant, P09BT4_A488ForPrdDsc, P09BT4_n488ForPrdDsc, P09BT4_A431FacCon, P09BT4_A875RecPrdDsc, P09BT4_A872RecPrdNum, P09BT4_A811RecLin
            }
            , new Object[] {
            P09BT5_A396EmprCod, P09BT5_A129BarCod, P09BT5_A132BarCodReo, P09BT5_A130BarCodPar, P09BT5_A2804RecLinMaq, P09BT5_A1273RecLinPro, P09BT5_A5725RecLote, P09BT5_A3274RecPrdTnq, P09BT5_A2394RecForNro, P09BT5_A686PrdCant,
            P09BT5_A488ForPrdDsc, P09BT5_n488ForPrdDsc, P09BT5_A490ForPrdUMe, P09BT5_n490ForPrdUMe, P09BT5_A431FacCon, P09BT5_A875RecPrdDsc, P09BT5_A872RecPrdNum, P09BT5_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFForPrdUMe ;
   private byte AV23TFForPrdUMe_To ;
   private byte AV30TFRecForNro ;
   private byte AV31TFRecForNro_To ;
   private byte AV32TFRecPrdTnq ;
   private byte AV33TFRecPrdTnq_To ;
   private byte AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume ;
   private byte AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to ;
   private byte AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro ;
   private byte AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to ;
   private byte AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq ;
   private byte AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A132BarCodReo ;
   private byte AV57Barcodreo ;
   private byte A1273RecLinPro ;
   private byte AV60RecLinPro ;
   private short AV10TFRecLin ;
   private short AV11TFRecLin_To ;
   private short AV65Mantenimientoderecetasregistro_wpds_1_tfreclin ;
   private short AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short AV59RecLinMaq ;
   private short Gx_err ;
   private int AV63GXV1 ;
   private int A129BarCod ;
   private int AV56Barcod ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private java.math.BigDecimal AV20TFFacCon ;
   private java.math.BigDecimal AV21TFFacCon_To ;
   private java.math.BigDecimal AV26TFPrdCant ;
   private java.math.BigDecimal AV27TFPrdCant_To ;
   private java.math.BigDecimal AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ;
   private java.math.BigDecimal AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ;
   private java.math.BigDecimal AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ;
   private java.math.BigDecimal AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV12TFRecPrdNum ;
   private String AV13TFRecPrdNum_Sel ;
   private String AV16TFRecPrdDsc ;
   private String AV17TFRecPrdDsc_Sel ;
   private String AV24TFForPrdDsc ;
   private String AV25TFForPrdDsc_Sel ;
   private String AV28TFRecLote ;
   private String AV29TFRecLote_Sel ;
   private String A872RecPrdNum ;
   private String AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ;
   private String AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ;
   private String AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ;
   private String AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ;
   private String AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ;
   private String AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ;
   private String AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ;
   private String AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ;
   private String scmdbuf ;
   private String lV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ;
   private String lV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ;
   private String lV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ;
   private String lV79Mantenimientoderecetasregistro_wpds_15_tfreclote ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A396EmprCod ;
   private String AV55Emprcod ;
   private String A130BarCodPar ;
   private String AV58Barcodpar ;
   private boolean returnInSub ;
   private boolean brk9BT2 ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private boolean brk9BT4 ;
   private boolean brk9BT6 ;
   private boolean brk9BT8 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV40Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BT2_A396EmprCod ;
   private int[] P09BT2_A129BarCod ;
   private byte[] P09BT2_A132BarCodReo ;
   private String[] P09BT2_A130BarCodPar ;
   private short[] P09BT2_A2804RecLinMaq ;
   private byte[] P09BT2_A1273RecLinPro ;
   private String[] P09BT2_A872RecPrdNum ;
   private byte[] P09BT2_A3274RecPrdTnq ;
   private byte[] P09BT2_A2394RecForNro ;
   private String[] P09BT2_A5725RecLote ;
   private java.math.BigDecimal[] P09BT2_A686PrdCant ;
   private String[] P09BT2_A488ForPrdDsc ;
   private boolean[] P09BT2_n488ForPrdDsc ;
   private byte[] P09BT2_A490ForPrdUMe ;
   private boolean[] P09BT2_n490ForPrdUMe ;
   private java.math.BigDecimal[] P09BT2_A431FacCon ;
   private String[] P09BT2_A875RecPrdDsc ;
   private short[] P09BT2_A811RecLin ;
   private String[] P09BT3_A396EmprCod ;
   private int[] P09BT3_A129BarCod ;
   private byte[] P09BT3_A132BarCodReo ;
   private String[] P09BT3_A130BarCodPar ;
   private short[] P09BT3_A2804RecLinMaq ;
   private byte[] P09BT3_A1273RecLinPro ;
   private String[] P09BT3_A875RecPrdDsc ;
   private byte[] P09BT3_A3274RecPrdTnq ;
   private byte[] P09BT3_A2394RecForNro ;
   private String[] P09BT3_A5725RecLote ;
   private java.math.BigDecimal[] P09BT3_A686PrdCant ;
   private String[] P09BT3_A488ForPrdDsc ;
   private boolean[] P09BT3_n488ForPrdDsc ;
   private byte[] P09BT3_A490ForPrdUMe ;
   private boolean[] P09BT3_n490ForPrdUMe ;
   private java.math.BigDecimal[] P09BT3_A431FacCon ;
   private String[] P09BT3_A872RecPrdNum ;
   private short[] P09BT3_A811RecLin ;
   private byte[] P09BT4_A490ForPrdUMe ;
   private boolean[] P09BT4_n490ForPrdUMe ;
   private String[] P09BT4_A396EmprCod ;
   private byte[] P09BT4_A1273RecLinPro ;
   private short[] P09BT4_A2804RecLinMaq ;
   private String[] P09BT4_A130BarCodPar ;
   private byte[] P09BT4_A132BarCodReo ;
   private int[] P09BT4_A129BarCod ;
   private byte[] P09BT4_A3274RecPrdTnq ;
   private byte[] P09BT4_A2394RecForNro ;
   private String[] P09BT4_A5725RecLote ;
   private java.math.BigDecimal[] P09BT4_A686PrdCant ;
   private String[] P09BT4_A488ForPrdDsc ;
   private boolean[] P09BT4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09BT4_A431FacCon ;
   private String[] P09BT4_A875RecPrdDsc ;
   private String[] P09BT4_A872RecPrdNum ;
   private short[] P09BT4_A811RecLin ;
   private String[] P09BT5_A396EmprCod ;
   private int[] P09BT5_A129BarCod ;
   private byte[] P09BT5_A132BarCodReo ;
   private String[] P09BT5_A130BarCodPar ;
   private short[] P09BT5_A2804RecLinMaq ;
   private byte[] P09BT5_A1273RecLinPro ;
   private String[] P09BT5_A5725RecLote ;
   private byte[] P09BT5_A3274RecPrdTnq ;
   private byte[] P09BT5_A2394RecForNro ;
   private java.math.BigDecimal[] P09BT5_A686PrdCant ;
   private String[] P09BT5_A488ForPrdDsc ;
   private boolean[] P09BT5_n488ForPrdDsc ;
   private byte[] P09BT5_A490ForPrdUMe ;
   private boolean[] P09BT5_n490ForPrdUMe ;
   private java.math.BigDecimal[] P09BT5_A431FacCon ;
   private String[] P09BT5_A875RecPrdDsc ;
   private String[] P09BT5_A872RecPrdNum ;
   private short[] P09BT5_A811RecLin ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class mantenimientoderecetasregistro_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV65Mantenimientoderecetasregistro_wpds_1_tfreclin ,
                                          short AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to ,
                                          String AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                          String AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                          String AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                          String AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                          java.math.BigDecimal AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                          java.math.BigDecimal AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                          byte AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume ,
                                          byte AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to ,
                                          String AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                          String AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                          java.math.BigDecimal AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                          java.math.BigDecimal AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                          String AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                          String AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                          byte AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro ,
                                          byte AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to ,
                                          byte AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq ,
                                          byte AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A5725RecLote ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int A129BarCod ,
                                          int AV56Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV57Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV58Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV59RecLinMaq ,
                                          byte A1273RecLinPro ,
                                          byte AV60RecLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[26];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdNum, T1.RecPrdTnq, T1.RecForNro, T1.RecLote, T1.PrdCant, T2.ForPrdDsc," ;
      scmdbuf += " T1.ForPrdUMe, T1.FacCon, T1.RecPrdDsc, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientoderecetasregistro_wpds_15_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09BT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV65Mantenimientoderecetasregistro_wpds_1_tfreclin ,
                                          short AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to ,
                                          String AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                          String AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                          String AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                          String AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                          java.math.BigDecimal AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                          java.math.BigDecimal AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                          byte AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume ,
                                          byte AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to ,
                                          String AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                          String AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                          java.math.BigDecimal AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                          java.math.BigDecimal AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                          String AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                          String AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                          byte AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro ,
                                          byte AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to ,
                                          byte AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq ,
                                          byte AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A5725RecLote ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int A129BarCod ,
                                          int AV56Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV57Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV58Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV59RecLinMaq ,
                                          byte A1273RecLinPro ,
                                          byte AV60RecLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[26];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdDsc, T1.RecPrdTnq, T1.RecForNro, T1.RecLote, T1.PrdCant, T2.ForPrdDsc," ;
      scmdbuf += " T1.ForPrdUMe, T1.FacCon, T1.RecPrdNum, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientoderecetasregistro_wpds_15_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09BT4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV65Mantenimientoderecetasregistro_wpds_1_tfreclin ,
                                          short AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to ,
                                          String AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                          String AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                          String AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                          String AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                          java.math.BigDecimal AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                          java.math.BigDecimal AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                          byte AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume ,
                                          byte AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to ,
                                          String AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                          String AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                          java.math.BigDecimal AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                          java.math.BigDecimal AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                          String AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                          String AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                          byte AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro ,
                                          byte AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to ,
                                          byte AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq ,
                                          byte AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A5725RecLote ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          int A129BarCod ,
                                          int AV56Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV57Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV58Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV59RecLinMaq ,
                                          byte A1273RecLinPro ,
                                          byte AV60RecLinPro ,
                                          String AV55Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecPrdTnq, T1.RecForNro, T1.RecLote, T1.PrdCant, T2.ForPrdDsc," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientoderecetasregistro_wpds_15_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09BT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV65Mantenimientoderecetasregistro_wpds_1_tfreclin ,
                                          short AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to ,
                                          String AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel ,
                                          String AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum ,
                                          String AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel ,
                                          String AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc ,
                                          java.math.BigDecimal AV71Mantenimientoderecetasregistro_wpds_7_tffaccon ,
                                          java.math.BigDecimal AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to ,
                                          byte AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume ,
                                          byte AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to ,
                                          String AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel ,
                                          String AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc ,
                                          java.math.BigDecimal AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant ,
                                          java.math.BigDecimal AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to ,
                                          String AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel ,
                                          String AV79Mantenimientoderecetasregistro_wpds_15_tfreclote ,
                                          byte AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro ,
                                          byte AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to ,
                                          byte AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq ,
                                          byte AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A5725RecLote ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int A129BarCod ,
                                          int AV56Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV57Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV58Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV59RecLinMaq ,
                                          byte A1273RecLinPro ,
                                          byte AV60RecLinPro )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[26];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T1.PrdCant, T2.ForPrdDsc, T1.ForPrdUMe," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.RecLinPro = ?)");
      if ( ! (0==AV65Mantenimientoderecetasregistro_wpds_1_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV66Mantenimientoderecetasregistro_wpds_2_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientoderecetasregistro_wpds_3_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientoderecetasregistro_wpds_4_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Mantenimientoderecetasregistro_wpds_5_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Mantenimientoderecetasregistro_wpds_6_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Mantenimientoderecetasregistro_wpds_7_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Mantenimientoderecetasregistro_wpds_8_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientoderecetasregistro_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV74Mantenimientoderecetasregistro_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Mantenimientoderecetasregistro_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Mantenimientoderecetasregistro_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Mantenimientoderecetasregistro_wpds_13_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientoderecetasregistro_wpds_14_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV79Mantenimientoderecetasregistro_wpds_15_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Mantenimientoderecetasregistro_wpds_16_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV81Mantenimientoderecetasregistro_wpds_17_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV82Mantenimientoderecetasregistro_wpds_18_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientoderecetasregistro_wpds_19_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV84Mantenimientoderecetasregistro_wpds_20_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecLote" ;
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
                  return conditional_P09BT2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() );
            case 1 :
                  return conditional_P09BT3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() );
            case 2 :
                  return conditional_P09BT4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
            case 3 :
                  return conditional_P09BT5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BT4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,3);
               ((String[]) buf[11])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[16])[0] = rslt.getString(15, 26);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,3);
               ((String[]) buf[11])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,5);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,3);
               ((String[]) buf[12])[0] = rslt.getString(12, 5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((String[]) buf[10])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               return;
      }
   }

}

