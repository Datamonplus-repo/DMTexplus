package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wprct002getfilterdata extends GXProcedure
{
   public wprct002getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wprct002getfilterdata.class ), "" );
   }

   public wprct002getfilterdata( int remoteHandle ,
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
      wprct002getfilterdata.this.aP5 = new String[] {""};
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
      wprct002getfilterdata.this.AV44DDOName = aP0;
      wprct002getfilterdata.this.AV42SearchTxt = aP1;
      wprct002getfilterdata.this.AV43SearchTxtTo = aP2;
      wprct002getfilterdata.this.aP3 = aP3;
      wprct002getfilterdata.this.aP4 = aP4;
      wprct002getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_RECPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDNUMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_RECPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_RECLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLOTEOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_RECLINUSR") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLINUSROPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV48OptionsJson = AV47Options.toJSonString(false) ;
      AV51OptionsDescJson = AV50OptionsDesc.toJSonString(false) ;
      AV53OptionIndexesJson = AV52OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV55Session.getValue("WpRcT002GridState"), "") == 0 )
      {
         AV57GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WpRcT002GridState"), null, null);
      }
      else
      {
         AV57GridState.fromxml(AV55Session.getValue("WpRcT002GridState"), null, null);
      }
      AV64GXV1 = 1 ;
      while ( AV64GXV1 <= AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV58GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV64GXV1));
         if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV61FilterFullText = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV12TFProForDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV13TFProForDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV14TFRecLin = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFRecLin_To = (short)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRF") == 0 )
         {
            AV16TFRecVolPrf = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFRecVolPrf_To = (int)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV18TFRecPrdNum = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV19TFRecPrdNum_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV20TFRecPrdDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV21TFRecPrdDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV22TFForPrdUMe = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFForPrdUMe_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV24TFForPrdDsc = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV25TFForPrdDsc_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV26TFFacCon = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFFacCon_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV28TFPrdCant = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFPrdCant_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV30TFRecForNro = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFRecForNro_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV32TFRecPrdTnq = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFRecPrdTnq_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV34TFRecLote = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV35TFRecLote_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPES") == 0 )
         {
            AV36TFRecPes = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFRecPes_To = (byte)(GXutil.lval( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR") == 0 )
         {
            AV38TFRecLinUsr = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINUSR_SEL") == 0 )
         {
            AV39TFRecLinUsr_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPESFEC") == 0 )
         {
            AV40TFRecPesFec = localUtil.ctot( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV41TFRecPesFec_To = localUtil.ctot( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV64GXV1 = (int)(AV64GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForDsc = AV42SearchTxt ;
      AV13TFProForDsc_Sel = "" ;
      AV66Core_wprct002ds_1_filterfulltext = AV61FilterFullText ;
      AV67Core_wprct002ds_2_tfreclinpro = AV10TFRecLinPro ;
      AV68Core_wprct002ds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV69Core_wprct002ds_4_tfprofordsc = AV12TFProForDsc ;
      AV70Core_wprct002ds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV71Core_wprct002ds_6_tfreclin = AV14TFRecLin ;
      AV72Core_wprct002ds_7_tfreclin_to = AV15TFRecLin_To ;
      AV73Core_wprct002ds_8_tfrecvolprf = AV16TFRecVolPrf ;
      AV74Core_wprct002ds_9_tfrecvolprf_to = AV17TFRecVolPrf_To ;
      AV75Core_wprct002ds_10_tfrecprdnum = AV18TFRecPrdNum ;
      AV76Core_wprct002ds_11_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV77Core_wprct002ds_12_tfrecprddsc = AV20TFRecPrdDsc ;
      AV78Core_wprct002ds_13_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV79Core_wprct002ds_14_tfforprdume = AV22TFForPrdUMe ;
      AV80Core_wprct002ds_15_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV81Core_wprct002ds_16_tfforprddsc = AV24TFForPrdDsc ;
      AV82Core_wprct002ds_17_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV83Core_wprct002ds_18_tffaccon = AV26TFFacCon ;
      AV84Core_wprct002ds_19_tffaccon_to = AV27TFFacCon_To ;
      AV85Core_wprct002ds_20_tfprdcant = AV28TFPrdCant ;
      AV86Core_wprct002ds_21_tfprdcant_to = AV29TFPrdCant_To ;
      AV87Core_wprct002ds_22_tfrecfornro = AV30TFRecForNro ;
      AV88Core_wprct002ds_23_tfrecfornro_to = AV31TFRecForNro_To ;
      AV89Core_wprct002ds_24_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV90Core_wprct002ds_25_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      AV91Core_wprct002ds_26_tfreclote = AV34TFRecLote ;
      AV92Core_wprct002ds_27_tfreclote_sel = AV35TFRecLote_Sel ;
      AV93Core_wprct002ds_28_tfrecpes = AV36TFRecPes ;
      AV94Core_wprct002ds_29_tfrecpes_to = AV37TFRecPes_To ;
      AV95Core_wprct002ds_30_tfreclinusr = AV38TFRecLinUsr ;
      AV96Core_wprct002ds_31_tfreclinusr_sel = AV39TFRecLinUsr_Sel ;
      AV97Core_wprct002ds_32_tfrecpesfec = AV40TFRecPesFec ;
      AV98Core_wprct002ds_33_tfrecpesfec_to = AV41TFRecPesFec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Core_wprct002ds_1_filterfulltext ,
                                           Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to) ,
                                           AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                           AV69Core_wprct002ds_4_tfprofordsc ,
                                           Short.valueOf(AV71Core_wprct002ds_6_tfreclin) ,
                                           Short.valueOf(AV72Core_wprct002ds_7_tfreclin_to) ,
                                           Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf) ,
                                           Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to) ,
                                           AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                           AV75Core_wprct002ds_10_tfrecprdnum ,
                                           AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                           AV77Core_wprct002ds_12_tfrecprddsc ,
                                           Byte.valueOf(AV79Core_wprct002ds_14_tfforprdume) ,
                                           Byte.valueOf(AV80Core_wprct002ds_15_tfforprdume_to) ,
                                           AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                           AV81Core_wprct002ds_16_tfforprddsc ,
                                           AV83Core_wprct002ds_18_tffaccon ,
                                           AV84Core_wprct002ds_19_tffaccon_to ,
                                           AV85Core_wprct002ds_20_tfprdcant ,
                                           AV86Core_wprct002ds_21_tfprdcant_to ,
                                           Byte.valueOf(AV87Core_wprct002ds_22_tfrecfornro) ,
                                           Byte.valueOf(AV88Core_wprct002ds_23_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Core_wprct002ds_24_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Core_wprct002ds_25_tfrecprdtnq_to) ,
                                           AV92Core_wprct002ds_27_tfreclote_sel ,
                                           AV91Core_wprct002ds_26_tfreclote ,
                                           Byte.valueOf(AV93Core_wprct002ds_28_tfrecpes) ,
                                           Byte.valueOf(AV94Core_wprct002ds_29_tfrecpes_to) ,
                                           AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                           AV95Core_wprct002ds_30_tfreclinusr ,
                                           AV97Core_wprct002ds_32_tfrecpesfec ,
                                           AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           Integer.valueOf(A4695RecVolPrf) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Byte.valueOf(A8934RecPes) ,
                                           A4576RecLinUsr ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Core_wprct002ds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV69Core_wprct002ds_4_tfprofordsc), 30, "%") ;
      /* Using cursor P08SW2 */
      pr_default.execute(0, new Object[] {AV60EmprCod, Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro), Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to), lV69Core_wprct002ds_4_tfprofordsc, AV70Core_wprct002ds_5_tfprofordsc_sel, Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf), Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8SW2 = false ;
         A764ProForCod = P08SW2_A764ProForCod[0] ;
         A396EmprCod = P08SW2_A396EmprCod[0] ;
         A766ProForDsc = P08SW2_A766ProForDsc[0] ;
         A4695RecVolPrf = P08SW2_A4695RecVolPrf[0] ;
         A1273RecLinPro = P08SW2_A1273RecLinPro[0] ;
         A129BarCod = P08SW2_A129BarCod[0] ;
         A132BarCodReo = P08SW2_A132BarCodReo[0] ;
         A130BarCodPar = P08SW2_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SW2_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SW2_A766ProForDsc[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08SW2_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brk8SW2 = false ;
            A764ProForCod = P08SW2_A764ProForCod[0] ;
            A396EmprCod = P08SW2_A396EmprCod[0] ;
            A1273RecLinPro = P08SW2_A1273RecLinPro[0] ;
            A129BarCod = P08SW2_A129BarCod[0] ;
            A132BarCodReo = P08SW2_A132BarCodReo[0] ;
            A130BarCodPar = P08SW2_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SW2_A2804RecLinMaq[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8SW2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV46Option = A766ProForDsc ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SW2 )
         {
            brk8SW2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFRecPrdNum = AV42SearchTxt ;
      AV19TFRecPrdNum_Sel = "" ;
      AV66Core_wprct002ds_1_filterfulltext = AV61FilterFullText ;
      AV67Core_wprct002ds_2_tfreclinpro = AV10TFRecLinPro ;
      AV68Core_wprct002ds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV69Core_wprct002ds_4_tfprofordsc = AV12TFProForDsc ;
      AV70Core_wprct002ds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV71Core_wprct002ds_6_tfreclin = AV14TFRecLin ;
      AV72Core_wprct002ds_7_tfreclin_to = AV15TFRecLin_To ;
      AV73Core_wprct002ds_8_tfrecvolprf = AV16TFRecVolPrf ;
      AV74Core_wprct002ds_9_tfrecvolprf_to = AV17TFRecVolPrf_To ;
      AV75Core_wprct002ds_10_tfrecprdnum = AV18TFRecPrdNum ;
      AV76Core_wprct002ds_11_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV77Core_wprct002ds_12_tfrecprddsc = AV20TFRecPrdDsc ;
      AV78Core_wprct002ds_13_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV79Core_wprct002ds_14_tfforprdume = AV22TFForPrdUMe ;
      AV80Core_wprct002ds_15_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV81Core_wprct002ds_16_tfforprddsc = AV24TFForPrdDsc ;
      AV82Core_wprct002ds_17_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV83Core_wprct002ds_18_tffaccon = AV26TFFacCon ;
      AV84Core_wprct002ds_19_tffaccon_to = AV27TFFacCon_To ;
      AV85Core_wprct002ds_20_tfprdcant = AV28TFPrdCant ;
      AV86Core_wprct002ds_21_tfprdcant_to = AV29TFPrdCant_To ;
      AV87Core_wprct002ds_22_tfrecfornro = AV30TFRecForNro ;
      AV88Core_wprct002ds_23_tfrecfornro_to = AV31TFRecForNro_To ;
      AV89Core_wprct002ds_24_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV90Core_wprct002ds_25_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      AV91Core_wprct002ds_26_tfreclote = AV34TFRecLote ;
      AV92Core_wprct002ds_27_tfreclote_sel = AV35TFRecLote_Sel ;
      AV93Core_wprct002ds_28_tfrecpes = AV36TFRecPes ;
      AV94Core_wprct002ds_29_tfrecpes_to = AV37TFRecPes_To ;
      AV95Core_wprct002ds_30_tfreclinusr = AV38TFRecLinUsr ;
      AV96Core_wprct002ds_31_tfreclinusr_sel = AV39TFRecLinUsr_Sel ;
      AV97Core_wprct002ds_32_tfrecpesfec = AV40TFRecPesFec ;
      AV98Core_wprct002ds_33_tfrecpesfec_to = AV41TFRecPesFec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV66Core_wprct002ds_1_filterfulltext ,
                                           Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to) ,
                                           AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                           AV69Core_wprct002ds_4_tfprofordsc ,
                                           Short.valueOf(AV71Core_wprct002ds_6_tfreclin) ,
                                           Short.valueOf(AV72Core_wprct002ds_7_tfreclin_to) ,
                                           Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf) ,
                                           Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to) ,
                                           AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                           AV75Core_wprct002ds_10_tfrecprdnum ,
                                           AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                           AV77Core_wprct002ds_12_tfrecprddsc ,
                                           Byte.valueOf(AV79Core_wprct002ds_14_tfforprdume) ,
                                           Byte.valueOf(AV80Core_wprct002ds_15_tfforprdume_to) ,
                                           AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                           AV81Core_wprct002ds_16_tfforprddsc ,
                                           AV83Core_wprct002ds_18_tffaccon ,
                                           AV84Core_wprct002ds_19_tffaccon_to ,
                                           AV85Core_wprct002ds_20_tfprdcant ,
                                           AV86Core_wprct002ds_21_tfprdcant_to ,
                                           Byte.valueOf(AV87Core_wprct002ds_22_tfrecfornro) ,
                                           Byte.valueOf(AV88Core_wprct002ds_23_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Core_wprct002ds_24_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Core_wprct002ds_25_tfrecprdtnq_to) ,
                                           AV92Core_wprct002ds_27_tfreclote_sel ,
                                           AV91Core_wprct002ds_26_tfreclote ,
                                           Byte.valueOf(AV93Core_wprct002ds_28_tfrecpes) ,
                                           Byte.valueOf(AV94Core_wprct002ds_29_tfrecpes_to) ,
                                           AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                           AV95Core_wprct002ds_30_tfreclinusr ,
                                           AV97Core_wprct002ds_32_tfrecpesfec ,
                                           AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           Integer.valueOf(A4695RecVolPrf) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Byte.valueOf(A8934RecPes) ,
                                           A4576RecLinUsr ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Core_wprct002ds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV69Core_wprct002ds_4_tfprofordsc), 30, "%") ;
      /* Using cursor P08SW3 */
      pr_default.execute(1, new Object[] {AV60EmprCod, Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro), Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to), lV69Core_wprct002ds_4_tfprofordsc, AV70Core_wprct002ds_5_tfprofordsc_sel, Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf), Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8SW4 = false ;
         A764ProForCod = P08SW3_A764ProForCod[0] ;
         A396EmprCod = P08SW3_A396EmprCod[0] ;
         A4695RecVolPrf = P08SW3_A4695RecVolPrf[0] ;
         A766ProForDsc = P08SW3_A766ProForDsc[0] ;
         A1273RecLinPro = P08SW3_A1273RecLinPro[0] ;
         A129BarCod = P08SW3_A129BarCod[0] ;
         A132BarCodReo = P08SW3_A132BarCodReo[0] ;
         A130BarCodPar = P08SW3_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SW3_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SW3_A766ProForDsc[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk8SW4 = false ;
            A396EmprCod = P08SW3_A396EmprCod[0] ;
            A1273RecLinPro = P08SW3_A1273RecLinPro[0] ;
            A129BarCod = P08SW3_A129BarCod[0] ;
            A132BarCodReo = P08SW3_A132BarCodReo[0] ;
            A130BarCodPar = P08SW3_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SW3_A2804RecLinMaq[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8SW4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV46Option = A872RecPrdNum ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SW4 )
         {
            brk8SW4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFRecPrdDsc = AV42SearchTxt ;
      AV21TFRecPrdDsc_Sel = "" ;
      AV66Core_wprct002ds_1_filterfulltext = AV61FilterFullText ;
      AV67Core_wprct002ds_2_tfreclinpro = AV10TFRecLinPro ;
      AV68Core_wprct002ds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV69Core_wprct002ds_4_tfprofordsc = AV12TFProForDsc ;
      AV70Core_wprct002ds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV71Core_wprct002ds_6_tfreclin = AV14TFRecLin ;
      AV72Core_wprct002ds_7_tfreclin_to = AV15TFRecLin_To ;
      AV73Core_wprct002ds_8_tfrecvolprf = AV16TFRecVolPrf ;
      AV74Core_wprct002ds_9_tfrecvolprf_to = AV17TFRecVolPrf_To ;
      AV75Core_wprct002ds_10_tfrecprdnum = AV18TFRecPrdNum ;
      AV76Core_wprct002ds_11_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV77Core_wprct002ds_12_tfrecprddsc = AV20TFRecPrdDsc ;
      AV78Core_wprct002ds_13_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV79Core_wprct002ds_14_tfforprdume = AV22TFForPrdUMe ;
      AV80Core_wprct002ds_15_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV81Core_wprct002ds_16_tfforprddsc = AV24TFForPrdDsc ;
      AV82Core_wprct002ds_17_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV83Core_wprct002ds_18_tffaccon = AV26TFFacCon ;
      AV84Core_wprct002ds_19_tffaccon_to = AV27TFFacCon_To ;
      AV85Core_wprct002ds_20_tfprdcant = AV28TFPrdCant ;
      AV86Core_wprct002ds_21_tfprdcant_to = AV29TFPrdCant_To ;
      AV87Core_wprct002ds_22_tfrecfornro = AV30TFRecForNro ;
      AV88Core_wprct002ds_23_tfrecfornro_to = AV31TFRecForNro_To ;
      AV89Core_wprct002ds_24_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV90Core_wprct002ds_25_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      AV91Core_wprct002ds_26_tfreclote = AV34TFRecLote ;
      AV92Core_wprct002ds_27_tfreclote_sel = AV35TFRecLote_Sel ;
      AV93Core_wprct002ds_28_tfrecpes = AV36TFRecPes ;
      AV94Core_wprct002ds_29_tfrecpes_to = AV37TFRecPes_To ;
      AV95Core_wprct002ds_30_tfreclinusr = AV38TFRecLinUsr ;
      AV96Core_wprct002ds_31_tfreclinusr_sel = AV39TFRecLinUsr_Sel ;
      AV97Core_wprct002ds_32_tfrecpesfec = AV40TFRecPesFec ;
      AV98Core_wprct002ds_33_tfrecpesfec_to = AV41TFRecPesFec_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV66Core_wprct002ds_1_filterfulltext ,
                                           Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to) ,
                                           AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                           AV69Core_wprct002ds_4_tfprofordsc ,
                                           Short.valueOf(AV71Core_wprct002ds_6_tfreclin) ,
                                           Short.valueOf(AV72Core_wprct002ds_7_tfreclin_to) ,
                                           Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf) ,
                                           Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to) ,
                                           AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                           AV75Core_wprct002ds_10_tfrecprdnum ,
                                           AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                           AV77Core_wprct002ds_12_tfrecprddsc ,
                                           Byte.valueOf(AV79Core_wprct002ds_14_tfforprdume) ,
                                           Byte.valueOf(AV80Core_wprct002ds_15_tfforprdume_to) ,
                                           AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                           AV81Core_wprct002ds_16_tfforprddsc ,
                                           AV83Core_wprct002ds_18_tffaccon ,
                                           AV84Core_wprct002ds_19_tffaccon_to ,
                                           AV85Core_wprct002ds_20_tfprdcant ,
                                           AV86Core_wprct002ds_21_tfprdcant_to ,
                                           Byte.valueOf(AV87Core_wprct002ds_22_tfrecfornro) ,
                                           Byte.valueOf(AV88Core_wprct002ds_23_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Core_wprct002ds_24_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Core_wprct002ds_25_tfrecprdtnq_to) ,
                                           AV92Core_wprct002ds_27_tfreclote_sel ,
                                           AV91Core_wprct002ds_26_tfreclote ,
                                           Byte.valueOf(AV93Core_wprct002ds_28_tfrecpes) ,
                                           Byte.valueOf(AV94Core_wprct002ds_29_tfrecpes_to) ,
                                           AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                           AV95Core_wprct002ds_30_tfreclinusr ,
                                           AV97Core_wprct002ds_32_tfrecpesfec ,
                                           AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           Integer.valueOf(A4695RecVolPrf) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Byte.valueOf(A8934RecPes) ,
                                           A4576RecLinUsr ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Core_wprct002ds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV69Core_wprct002ds_4_tfprofordsc), 30, "%") ;
      /* Using cursor P08SW4 */
      pr_default.execute(2, new Object[] {AV60EmprCod, Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro), Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to), lV69Core_wprct002ds_4_tfprofordsc, AV70Core_wprct002ds_5_tfprofordsc_sel, Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf), Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8SW6 = false ;
         A764ProForCod = P08SW4_A764ProForCod[0] ;
         A396EmprCod = P08SW4_A396EmprCod[0] ;
         A4695RecVolPrf = P08SW4_A4695RecVolPrf[0] ;
         A766ProForDsc = P08SW4_A766ProForDsc[0] ;
         A1273RecLinPro = P08SW4_A1273RecLinPro[0] ;
         A129BarCod = P08SW4_A129BarCod[0] ;
         A132BarCodReo = P08SW4_A132BarCodReo[0] ;
         A130BarCodPar = P08SW4_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SW4_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SW4_A766ProForDsc[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk8SW6 = false ;
            A396EmprCod = P08SW4_A396EmprCod[0] ;
            A1273RecLinPro = P08SW4_A1273RecLinPro[0] ;
            A129BarCod = P08SW4_A129BarCod[0] ;
            A132BarCodReo = P08SW4_A132BarCodReo[0] ;
            A130BarCodPar = P08SW4_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SW4_A2804RecLinMaq[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8SW6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV46Option = A875RecPrdDsc ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SW6 )
         {
            brk8SW6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFForPrdDsc = AV42SearchTxt ;
      AV25TFForPrdDsc_Sel = "" ;
      AV66Core_wprct002ds_1_filterfulltext = AV61FilterFullText ;
      AV67Core_wprct002ds_2_tfreclinpro = AV10TFRecLinPro ;
      AV68Core_wprct002ds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV69Core_wprct002ds_4_tfprofordsc = AV12TFProForDsc ;
      AV70Core_wprct002ds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV71Core_wprct002ds_6_tfreclin = AV14TFRecLin ;
      AV72Core_wprct002ds_7_tfreclin_to = AV15TFRecLin_To ;
      AV73Core_wprct002ds_8_tfrecvolprf = AV16TFRecVolPrf ;
      AV74Core_wprct002ds_9_tfrecvolprf_to = AV17TFRecVolPrf_To ;
      AV75Core_wprct002ds_10_tfrecprdnum = AV18TFRecPrdNum ;
      AV76Core_wprct002ds_11_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV77Core_wprct002ds_12_tfrecprddsc = AV20TFRecPrdDsc ;
      AV78Core_wprct002ds_13_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV79Core_wprct002ds_14_tfforprdume = AV22TFForPrdUMe ;
      AV80Core_wprct002ds_15_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV81Core_wprct002ds_16_tfforprddsc = AV24TFForPrdDsc ;
      AV82Core_wprct002ds_17_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV83Core_wprct002ds_18_tffaccon = AV26TFFacCon ;
      AV84Core_wprct002ds_19_tffaccon_to = AV27TFFacCon_To ;
      AV85Core_wprct002ds_20_tfprdcant = AV28TFPrdCant ;
      AV86Core_wprct002ds_21_tfprdcant_to = AV29TFPrdCant_To ;
      AV87Core_wprct002ds_22_tfrecfornro = AV30TFRecForNro ;
      AV88Core_wprct002ds_23_tfrecfornro_to = AV31TFRecForNro_To ;
      AV89Core_wprct002ds_24_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV90Core_wprct002ds_25_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      AV91Core_wprct002ds_26_tfreclote = AV34TFRecLote ;
      AV92Core_wprct002ds_27_tfreclote_sel = AV35TFRecLote_Sel ;
      AV93Core_wprct002ds_28_tfrecpes = AV36TFRecPes ;
      AV94Core_wprct002ds_29_tfrecpes_to = AV37TFRecPes_To ;
      AV95Core_wprct002ds_30_tfreclinusr = AV38TFRecLinUsr ;
      AV96Core_wprct002ds_31_tfreclinusr_sel = AV39TFRecLinUsr_Sel ;
      AV97Core_wprct002ds_32_tfrecpesfec = AV40TFRecPesFec ;
      AV98Core_wprct002ds_33_tfrecpesfec_to = AV41TFRecPesFec_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV66Core_wprct002ds_1_filterfulltext ,
                                           Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to) ,
                                           AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                           AV69Core_wprct002ds_4_tfprofordsc ,
                                           Short.valueOf(AV71Core_wprct002ds_6_tfreclin) ,
                                           Short.valueOf(AV72Core_wprct002ds_7_tfreclin_to) ,
                                           Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf) ,
                                           Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to) ,
                                           AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                           AV75Core_wprct002ds_10_tfrecprdnum ,
                                           AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                           AV77Core_wprct002ds_12_tfrecprddsc ,
                                           Byte.valueOf(AV79Core_wprct002ds_14_tfforprdume) ,
                                           Byte.valueOf(AV80Core_wprct002ds_15_tfforprdume_to) ,
                                           AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                           AV81Core_wprct002ds_16_tfforprddsc ,
                                           AV83Core_wprct002ds_18_tffaccon ,
                                           AV84Core_wprct002ds_19_tffaccon_to ,
                                           AV85Core_wprct002ds_20_tfprdcant ,
                                           AV86Core_wprct002ds_21_tfprdcant_to ,
                                           Byte.valueOf(AV87Core_wprct002ds_22_tfrecfornro) ,
                                           Byte.valueOf(AV88Core_wprct002ds_23_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Core_wprct002ds_24_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Core_wprct002ds_25_tfrecprdtnq_to) ,
                                           AV92Core_wprct002ds_27_tfreclote_sel ,
                                           AV91Core_wprct002ds_26_tfreclote ,
                                           Byte.valueOf(AV93Core_wprct002ds_28_tfrecpes) ,
                                           Byte.valueOf(AV94Core_wprct002ds_29_tfrecpes_to) ,
                                           AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                           AV95Core_wprct002ds_30_tfreclinusr ,
                                           AV97Core_wprct002ds_32_tfrecpesfec ,
                                           AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           Integer.valueOf(A4695RecVolPrf) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Byte.valueOf(A8934RecPes) ,
                                           A4576RecLinUsr ,
                                           AV60EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Core_wprct002ds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV69Core_wprct002ds_4_tfprofordsc), 30, "%") ;
      /* Using cursor P08SW5 */
      pr_default.execute(3, new Object[] {AV60EmprCod, Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro), Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to), lV69Core_wprct002ds_4_tfprofordsc, AV70Core_wprct002ds_5_tfprofordsc_sel, Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf), Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8SW8 = false ;
         A764ProForCod = P08SW5_A764ProForCod[0] ;
         A396EmprCod = P08SW5_A396EmprCod[0] ;
         A4695RecVolPrf = P08SW5_A4695RecVolPrf[0] ;
         A766ProForDsc = P08SW5_A766ProForDsc[0] ;
         A1273RecLinPro = P08SW5_A1273RecLinPro[0] ;
         A129BarCod = P08SW5_A129BarCod[0] ;
         A132BarCodReo = P08SW5_A132BarCodReo[0] ;
         A130BarCodPar = P08SW5_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SW5_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SW5_A766ProForDsc[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08SW5_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8SW8 = false ;
            A1273RecLinPro = P08SW5_A1273RecLinPro[0] ;
            A129BarCod = P08SW5_A129BarCod[0] ;
            A132BarCodReo = P08SW5_A132BarCodReo[0] ;
            A130BarCodPar = P08SW5_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SW5_A2804RecLinMaq[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8SW8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV46Option = A488ForPrdDsc ;
            AV45InsertIndex = 1 ;
            while ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) < 0 ) )
            {
               AV45InsertIndex = (int)(AV45InsertIndex+1) ;
            }
            AV47Options.add(AV46Option, AV45InsertIndex);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), AV45InsertIndex);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SW8 )
         {
            brk8SW8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV34TFRecLote = AV42SearchTxt ;
      AV35TFRecLote_Sel = "" ;
      AV66Core_wprct002ds_1_filterfulltext = AV61FilterFullText ;
      AV67Core_wprct002ds_2_tfreclinpro = AV10TFRecLinPro ;
      AV68Core_wprct002ds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV69Core_wprct002ds_4_tfprofordsc = AV12TFProForDsc ;
      AV70Core_wprct002ds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV71Core_wprct002ds_6_tfreclin = AV14TFRecLin ;
      AV72Core_wprct002ds_7_tfreclin_to = AV15TFRecLin_To ;
      AV73Core_wprct002ds_8_tfrecvolprf = AV16TFRecVolPrf ;
      AV74Core_wprct002ds_9_tfrecvolprf_to = AV17TFRecVolPrf_To ;
      AV75Core_wprct002ds_10_tfrecprdnum = AV18TFRecPrdNum ;
      AV76Core_wprct002ds_11_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV77Core_wprct002ds_12_tfrecprddsc = AV20TFRecPrdDsc ;
      AV78Core_wprct002ds_13_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV79Core_wprct002ds_14_tfforprdume = AV22TFForPrdUMe ;
      AV80Core_wprct002ds_15_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV81Core_wprct002ds_16_tfforprddsc = AV24TFForPrdDsc ;
      AV82Core_wprct002ds_17_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV83Core_wprct002ds_18_tffaccon = AV26TFFacCon ;
      AV84Core_wprct002ds_19_tffaccon_to = AV27TFFacCon_To ;
      AV85Core_wprct002ds_20_tfprdcant = AV28TFPrdCant ;
      AV86Core_wprct002ds_21_tfprdcant_to = AV29TFPrdCant_To ;
      AV87Core_wprct002ds_22_tfrecfornro = AV30TFRecForNro ;
      AV88Core_wprct002ds_23_tfrecfornro_to = AV31TFRecForNro_To ;
      AV89Core_wprct002ds_24_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV90Core_wprct002ds_25_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      AV91Core_wprct002ds_26_tfreclote = AV34TFRecLote ;
      AV92Core_wprct002ds_27_tfreclote_sel = AV35TFRecLote_Sel ;
      AV93Core_wprct002ds_28_tfrecpes = AV36TFRecPes ;
      AV94Core_wprct002ds_29_tfrecpes_to = AV37TFRecPes_To ;
      AV95Core_wprct002ds_30_tfreclinusr = AV38TFRecLinUsr ;
      AV96Core_wprct002ds_31_tfreclinusr_sel = AV39TFRecLinUsr_Sel ;
      AV97Core_wprct002ds_32_tfrecpesfec = AV40TFRecPesFec ;
      AV98Core_wprct002ds_33_tfrecpesfec_to = AV41TFRecPesFec_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV66Core_wprct002ds_1_filterfulltext ,
                                           Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to) ,
                                           AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                           AV69Core_wprct002ds_4_tfprofordsc ,
                                           Short.valueOf(AV71Core_wprct002ds_6_tfreclin) ,
                                           Short.valueOf(AV72Core_wprct002ds_7_tfreclin_to) ,
                                           Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf) ,
                                           Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to) ,
                                           AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                           AV75Core_wprct002ds_10_tfrecprdnum ,
                                           AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                           AV77Core_wprct002ds_12_tfrecprddsc ,
                                           Byte.valueOf(AV79Core_wprct002ds_14_tfforprdume) ,
                                           Byte.valueOf(AV80Core_wprct002ds_15_tfforprdume_to) ,
                                           AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                           AV81Core_wprct002ds_16_tfforprddsc ,
                                           AV83Core_wprct002ds_18_tffaccon ,
                                           AV84Core_wprct002ds_19_tffaccon_to ,
                                           AV85Core_wprct002ds_20_tfprdcant ,
                                           AV86Core_wprct002ds_21_tfprdcant_to ,
                                           Byte.valueOf(AV87Core_wprct002ds_22_tfrecfornro) ,
                                           Byte.valueOf(AV88Core_wprct002ds_23_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Core_wprct002ds_24_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Core_wprct002ds_25_tfrecprdtnq_to) ,
                                           AV92Core_wprct002ds_27_tfreclote_sel ,
                                           AV91Core_wprct002ds_26_tfreclote ,
                                           Byte.valueOf(AV93Core_wprct002ds_28_tfrecpes) ,
                                           Byte.valueOf(AV94Core_wprct002ds_29_tfrecpes_to) ,
                                           AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                           AV95Core_wprct002ds_30_tfreclinusr ,
                                           AV97Core_wprct002ds_32_tfrecpesfec ,
                                           AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           Integer.valueOf(A4695RecVolPrf) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Byte.valueOf(A8934RecPes) ,
                                           A4576RecLinUsr ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Core_wprct002ds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV69Core_wprct002ds_4_tfprofordsc), 30, "%") ;
      /* Using cursor P08SW6 */
      pr_default.execute(4, new Object[] {AV60EmprCod, Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro), Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to), lV69Core_wprct002ds_4_tfprofordsc, AV70Core_wprct002ds_5_tfprofordsc_sel, Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf), Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8SW10 = false ;
         A764ProForCod = P08SW6_A764ProForCod[0] ;
         A396EmprCod = P08SW6_A396EmprCod[0] ;
         A4695RecVolPrf = P08SW6_A4695RecVolPrf[0] ;
         A766ProForDsc = P08SW6_A766ProForDsc[0] ;
         A1273RecLinPro = P08SW6_A1273RecLinPro[0] ;
         A129BarCod = P08SW6_A129BarCod[0] ;
         A132BarCodReo = P08SW6_A132BarCodReo[0] ;
         A130BarCodPar = P08SW6_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SW6_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SW6_A766ProForDsc[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            brk8SW10 = false ;
            A396EmprCod = P08SW6_A396EmprCod[0] ;
            A1273RecLinPro = P08SW6_A1273RecLinPro[0] ;
            A129BarCod = P08SW6_A129BarCod[0] ;
            A132BarCodReo = P08SW6_A132BarCodReo[0] ;
            A130BarCodPar = P08SW6_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SW6_A2804RecLinMaq[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8SW10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A5725RecLote)==0) )
         {
            AV46Option = A5725RecLote ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SW10 )
         {
            brk8SW10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADRECLINUSROPTIONS' Routine */
      returnInSub = false ;
      AV38TFRecLinUsr = AV42SearchTxt ;
      AV39TFRecLinUsr_Sel = "" ;
      AV66Core_wprct002ds_1_filterfulltext = AV61FilterFullText ;
      AV67Core_wprct002ds_2_tfreclinpro = AV10TFRecLinPro ;
      AV68Core_wprct002ds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV69Core_wprct002ds_4_tfprofordsc = AV12TFProForDsc ;
      AV70Core_wprct002ds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV71Core_wprct002ds_6_tfreclin = AV14TFRecLin ;
      AV72Core_wprct002ds_7_tfreclin_to = AV15TFRecLin_To ;
      AV73Core_wprct002ds_8_tfrecvolprf = AV16TFRecVolPrf ;
      AV74Core_wprct002ds_9_tfrecvolprf_to = AV17TFRecVolPrf_To ;
      AV75Core_wprct002ds_10_tfrecprdnum = AV18TFRecPrdNum ;
      AV76Core_wprct002ds_11_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV77Core_wprct002ds_12_tfrecprddsc = AV20TFRecPrdDsc ;
      AV78Core_wprct002ds_13_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV79Core_wprct002ds_14_tfforprdume = AV22TFForPrdUMe ;
      AV80Core_wprct002ds_15_tfforprdume_to = AV23TFForPrdUMe_To ;
      AV81Core_wprct002ds_16_tfforprddsc = AV24TFForPrdDsc ;
      AV82Core_wprct002ds_17_tfforprddsc_sel = AV25TFForPrdDsc_Sel ;
      AV83Core_wprct002ds_18_tffaccon = AV26TFFacCon ;
      AV84Core_wprct002ds_19_tffaccon_to = AV27TFFacCon_To ;
      AV85Core_wprct002ds_20_tfprdcant = AV28TFPrdCant ;
      AV86Core_wprct002ds_21_tfprdcant_to = AV29TFPrdCant_To ;
      AV87Core_wprct002ds_22_tfrecfornro = AV30TFRecForNro ;
      AV88Core_wprct002ds_23_tfrecfornro_to = AV31TFRecForNro_To ;
      AV89Core_wprct002ds_24_tfrecprdtnq = AV32TFRecPrdTnq ;
      AV90Core_wprct002ds_25_tfrecprdtnq_to = AV33TFRecPrdTnq_To ;
      AV91Core_wprct002ds_26_tfreclote = AV34TFRecLote ;
      AV92Core_wprct002ds_27_tfreclote_sel = AV35TFRecLote_Sel ;
      AV93Core_wprct002ds_28_tfrecpes = AV36TFRecPes ;
      AV94Core_wprct002ds_29_tfrecpes_to = AV37TFRecPes_To ;
      AV95Core_wprct002ds_30_tfreclinusr = AV38TFRecLinUsr ;
      AV96Core_wprct002ds_31_tfreclinusr_sel = AV39TFRecLinUsr_Sel ;
      AV97Core_wprct002ds_32_tfrecpesfec = AV40TFRecPesFec ;
      AV98Core_wprct002ds_33_tfrecpesfec_to = AV41TFRecPesFec_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV66Core_wprct002ds_1_filterfulltext ,
                                           Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro) ,
                                           Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to) ,
                                           AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                           AV69Core_wprct002ds_4_tfprofordsc ,
                                           Short.valueOf(AV71Core_wprct002ds_6_tfreclin) ,
                                           Short.valueOf(AV72Core_wprct002ds_7_tfreclin_to) ,
                                           Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf) ,
                                           Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to) ,
                                           AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                           AV75Core_wprct002ds_10_tfrecprdnum ,
                                           AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                           AV77Core_wprct002ds_12_tfrecprddsc ,
                                           Byte.valueOf(AV79Core_wprct002ds_14_tfforprdume) ,
                                           Byte.valueOf(AV80Core_wprct002ds_15_tfforprdume_to) ,
                                           AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                           AV81Core_wprct002ds_16_tfforprddsc ,
                                           AV83Core_wprct002ds_18_tffaccon ,
                                           AV84Core_wprct002ds_19_tffaccon_to ,
                                           AV85Core_wprct002ds_20_tfprdcant ,
                                           AV86Core_wprct002ds_21_tfprdcant_to ,
                                           Byte.valueOf(AV87Core_wprct002ds_22_tfrecfornro) ,
                                           Byte.valueOf(AV88Core_wprct002ds_23_tfrecfornro_to) ,
                                           Byte.valueOf(AV89Core_wprct002ds_24_tfrecprdtnq) ,
                                           Byte.valueOf(AV90Core_wprct002ds_25_tfrecprdtnq_to) ,
                                           AV92Core_wprct002ds_27_tfreclote_sel ,
                                           AV91Core_wprct002ds_26_tfreclote ,
                                           Byte.valueOf(AV93Core_wprct002ds_28_tfrecpes) ,
                                           Byte.valueOf(AV94Core_wprct002ds_29_tfrecpes_to) ,
                                           AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                           AV95Core_wprct002ds_30_tfreclinusr ,
                                           AV97Core_wprct002ds_32_tfrecpesfec ,
                                           AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           Integer.valueOf(A4695RecVolPrf) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Byte.valueOf(A8934RecPes) ,
                                           A4576RecLinUsr ,
                                           A396EmprCod ,
                                           AV60EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Core_wprct002ds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV69Core_wprct002ds_4_tfprofordsc), 30, "%") ;
      /* Using cursor P08SW7 */
      pr_default.execute(5, new Object[] {AV60EmprCod, Byte.valueOf(AV67Core_wprct002ds_2_tfreclinpro), Byte.valueOf(AV68Core_wprct002ds_3_tfreclinpro_to), lV69Core_wprct002ds_4_tfprofordsc, AV70Core_wprct002ds_5_tfprofordsc_sel, Integer.valueOf(AV73Core_wprct002ds_8_tfrecvolprf), Integer.valueOf(AV74Core_wprct002ds_9_tfrecvolprf_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8SW12 = false ;
         A764ProForCod = P08SW7_A764ProForCod[0] ;
         A396EmprCod = P08SW7_A396EmprCod[0] ;
         A4695RecVolPrf = P08SW7_A4695RecVolPrf[0] ;
         A766ProForDsc = P08SW7_A766ProForDsc[0] ;
         A1273RecLinPro = P08SW7_A1273RecLinPro[0] ;
         A129BarCod = P08SW7_A129BarCod[0] ;
         A132BarCodReo = P08SW7_A132BarCodReo[0] ;
         A130BarCodPar = P08SW7_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SW7_A2804RecLinMaq[0] ;
         A766ProForDsc = P08SW7_A766ProForDsc[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(5) != 101) )
         {
            brk8SW12 = false ;
            A396EmprCod = P08SW7_A396EmprCod[0] ;
            A1273RecLinPro = P08SW7_A1273RecLinPro[0] ;
            A129BarCod = P08SW7_A129BarCod[0] ;
            A132BarCodReo = P08SW7_A132BarCodReo[0] ;
            A130BarCodPar = P08SW7_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SW7_A2804RecLinMaq[0] ;
            AV54count = (long)(AV54count+1) ;
            brk8SW12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A4576RecLinUsr)==0) )
         {
            AV46Option = A4576RecLinUsr ;
            AV49OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!"))) ;
            AV47Options.add(AV46Option, 0);
            AV50OptionsDesc.add(AV49OptionDesc, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SW12 )
         {
            brk8SW12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wprct002getfilterdata.this.AV48OptionsJson;
      this.aP4[0] = wprct002getfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = wprct002getfilterdata.this.AV53OptionIndexesJson;
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
      AV51OptionsDescJson = "" ;
      AV53OptionIndexesJson = "" ;
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV55Session = httpContext.getWebSession();
      AV57GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV58GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61FilterFullText = "" ;
      AV12TFProForDsc = "" ;
      AV13TFProForDsc_Sel = "" ;
      AV18TFRecPrdNum = "" ;
      AV19TFRecPrdNum_Sel = "" ;
      AV20TFRecPrdDsc = "" ;
      AV21TFRecPrdDsc_Sel = "" ;
      AV24TFForPrdDsc = "" ;
      AV25TFForPrdDsc_Sel = "" ;
      AV26TFFacCon = DecimalUtil.ZERO ;
      AV27TFFacCon_To = DecimalUtil.ZERO ;
      AV28TFPrdCant = DecimalUtil.ZERO ;
      AV29TFPrdCant_To = DecimalUtil.ZERO ;
      AV34TFRecLote = "" ;
      AV35TFRecLote_Sel = "" ;
      AV38TFRecLinUsr = "" ;
      AV39TFRecLinUsr_Sel = "" ;
      AV40TFRecPesFec = GXutil.resetTime( GXutil.nullDate() );
      AV41TFRecPesFec_To = GXutil.resetTime( GXutil.nullDate() );
      A766ProForDsc = "" ;
      AV66Core_wprct002ds_1_filterfulltext = "" ;
      AV69Core_wprct002ds_4_tfprofordsc = "" ;
      AV70Core_wprct002ds_5_tfprofordsc_sel = "" ;
      AV75Core_wprct002ds_10_tfrecprdnum = "" ;
      AV76Core_wprct002ds_11_tfrecprdnum_sel = "" ;
      AV77Core_wprct002ds_12_tfrecprddsc = "" ;
      AV78Core_wprct002ds_13_tfrecprddsc_sel = "" ;
      AV81Core_wprct002ds_16_tfforprddsc = "" ;
      AV82Core_wprct002ds_17_tfforprddsc_sel = "" ;
      AV83Core_wprct002ds_18_tffaccon = DecimalUtil.ZERO ;
      AV84Core_wprct002ds_19_tffaccon_to = DecimalUtil.ZERO ;
      AV85Core_wprct002ds_20_tfprdcant = DecimalUtil.ZERO ;
      AV86Core_wprct002ds_21_tfprdcant_to = DecimalUtil.ZERO ;
      AV91Core_wprct002ds_26_tfreclote = "" ;
      AV92Core_wprct002ds_27_tfreclote_sel = "" ;
      AV95Core_wprct002ds_30_tfreclinusr = "" ;
      AV96Core_wprct002ds_31_tfreclinusr_sel = "" ;
      AV97Core_wprct002ds_32_tfrecpesfec = GXutil.resetTime( GXutil.nullDate() );
      AV98Core_wprct002ds_33_tfrecpesfec_to = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV69Core_wprct002ds_4_tfprofordsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A4576RecLinUsr = "" ;
      A396EmprCod = "" ;
      AV60EmprCod = "" ;
      P08SW2_A764ProForCod = new String[] {""} ;
      P08SW2_A396EmprCod = new String[] {""} ;
      P08SW2_A766ProForDsc = new String[] {""} ;
      P08SW2_A4695RecVolPrf = new int[1] ;
      P08SW2_A1273RecLinPro = new byte[1] ;
      P08SW2_A129BarCod = new int[1] ;
      P08SW2_A132BarCodReo = new byte[1] ;
      P08SW2_A130BarCodPar = new String[] {""} ;
      P08SW2_A2804RecLinMaq = new short[1] ;
      A764ProForCod = "" ;
      A130BarCodPar = "" ;
      AV46Option = "" ;
      P08SW3_A764ProForCod = new String[] {""} ;
      P08SW3_A396EmprCod = new String[] {""} ;
      P08SW3_A4695RecVolPrf = new int[1] ;
      P08SW3_A766ProForDsc = new String[] {""} ;
      P08SW3_A1273RecLinPro = new byte[1] ;
      P08SW3_A129BarCod = new int[1] ;
      P08SW3_A132BarCodReo = new byte[1] ;
      P08SW3_A130BarCodPar = new String[] {""} ;
      P08SW3_A2804RecLinMaq = new short[1] ;
      P08SW4_A764ProForCod = new String[] {""} ;
      P08SW4_A396EmprCod = new String[] {""} ;
      P08SW4_A4695RecVolPrf = new int[1] ;
      P08SW4_A766ProForDsc = new String[] {""} ;
      P08SW4_A1273RecLinPro = new byte[1] ;
      P08SW4_A129BarCod = new int[1] ;
      P08SW4_A132BarCodReo = new byte[1] ;
      P08SW4_A130BarCodPar = new String[] {""} ;
      P08SW4_A2804RecLinMaq = new short[1] ;
      P08SW5_A764ProForCod = new String[] {""} ;
      P08SW5_A396EmprCod = new String[] {""} ;
      P08SW5_A4695RecVolPrf = new int[1] ;
      P08SW5_A766ProForDsc = new String[] {""} ;
      P08SW5_A1273RecLinPro = new byte[1] ;
      P08SW5_A129BarCod = new int[1] ;
      P08SW5_A132BarCodReo = new byte[1] ;
      P08SW5_A130BarCodPar = new String[] {""} ;
      P08SW5_A2804RecLinMaq = new short[1] ;
      P08SW6_A764ProForCod = new String[] {""} ;
      P08SW6_A396EmprCod = new String[] {""} ;
      P08SW6_A4695RecVolPrf = new int[1] ;
      P08SW6_A766ProForDsc = new String[] {""} ;
      P08SW6_A1273RecLinPro = new byte[1] ;
      P08SW6_A129BarCod = new int[1] ;
      P08SW6_A132BarCodReo = new byte[1] ;
      P08SW6_A130BarCodPar = new String[] {""} ;
      P08SW6_A2804RecLinMaq = new short[1] ;
      P08SW7_A764ProForCod = new String[] {""} ;
      P08SW7_A396EmprCod = new String[] {""} ;
      P08SW7_A4695RecVolPrf = new int[1] ;
      P08SW7_A766ProForDsc = new String[] {""} ;
      P08SW7_A1273RecLinPro = new byte[1] ;
      P08SW7_A129BarCod = new int[1] ;
      P08SW7_A132BarCodReo = new byte[1] ;
      P08SW7_A130BarCodPar = new String[] {""} ;
      P08SW7_A2804RecLinMaq = new short[1] ;
      AV49OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wprct002getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08SW2_A764ProForCod, P08SW2_A396EmprCod, P08SW2_A766ProForDsc, P08SW2_A4695RecVolPrf, P08SW2_A1273RecLinPro, P08SW2_A129BarCod, P08SW2_A132BarCodReo, P08SW2_A130BarCodPar, P08SW2_A2804RecLinMaq
            }
            , new Object[] {
            P08SW3_A764ProForCod, P08SW3_A396EmprCod, P08SW3_A4695RecVolPrf, P08SW3_A766ProForDsc, P08SW3_A1273RecLinPro, P08SW3_A129BarCod, P08SW3_A132BarCodReo, P08SW3_A130BarCodPar, P08SW3_A2804RecLinMaq
            }
            , new Object[] {
            P08SW4_A764ProForCod, P08SW4_A396EmprCod, P08SW4_A4695RecVolPrf, P08SW4_A766ProForDsc, P08SW4_A1273RecLinPro, P08SW4_A129BarCod, P08SW4_A132BarCodReo, P08SW4_A130BarCodPar, P08SW4_A2804RecLinMaq
            }
            , new Object[] {
            P08SW5_A764ProForCod, P08SW5_A396EmprCod, P08SW5_A4695RecVolPrf, P08SW5_A766ProForDsc, P08SW5_A1273RecLinPro, P08SW5_A129BarCod, P08SW5_A132BarCodReo, P08SW5_A130BarCodPar, P08SW5_A2804RecLinMaq
            }
            , new Object[] {
            P08SW6_A764ProForCod, P08SW6_A396EmprCod, P08SW6_A4695RecVolPrf, P08SW6_A766ProForDsc, P08SW6_A1273RecLinPro, P08SW6_A129BarCod, P08SW6_A132BarCodReo, P08SW6_A130BarCodPar, P08SW6_A2804RecLinMaq
            }
            , new Object[] {
            P08SW7_A764ProForCod, P08SW7_A396EmprCod, P08SW7_A4695RecVolPrf, P08SW7_A766ProForDsc, P08SW7_A1273RecLinPro, P08SW7_A129BarCod, P08SW7_A132BarCodReo, P08SW7_A130BarCodPar, P08SW7_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV22TFForPrdUMe ;
   private byte AV23TFForPrdUMe_To ;
   private byte AV30TFRecForNro ;
   private byte AV31TFRecForNro_To ;
   private byte AV32TFRecPrdTnq ;
   private byte AV33TFRecPrdTnq_To ;
   private byte AV36TFRecPes ;
   private byte AV37TFRecPes_To ;
   private byte AV67Core_wprct002ds_2_tfreclinpro ;
   private byte AV68Core_wprct002ds_3_tfreclinpro_to ;
   private byte AV79Core_wprct002ds_14_tfforprdume ;
   private byte AV80Core_wprct002ds_15_tfforprdume_to ;
   private byte AV87Core_wprct002ds_22_tfrecfornro ;
   private byte AV88Core_wprct002ds_23_tfrecfornro_to ;
   private byte AV89Core_wprct002ds_24_tfrecprdtnq ;
   private byte AV90Core_wprct002ds_25_tfrecprdtnq_to ;
   private byte AV93Core_wprct002ds_28_tfrecpes ;
   private byte AV94Core_wprct002ds_29_tfrecpes_to ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A8934RecPes ;
   private byte A132BarCodReo ;
   private short AV14TFRecLin ;
   private short AV15TFRecLin_To ;
   private short AV71Core_wprct002ds_6_tfreclin ;
   private short AV72Core_wprct002ds_7_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV64GXV1 ;
   private int AV16TFRecVolPrf ;
   private int AV17TFRecVolPrf_To ;
   private int AV73Core_wprct002ds_8_tfrecvolprf ;
   private int AV74Core_wprct002ds_9_tfrecvolprf_to ;
   private int A4695RecVolPrf ;
   private int A129BarCod ;
   private int AV45InsertIndex ;
   private long AV54count ;
   private java.math.BigDecimal AV26TFFacCon ;
   private java.math.BigDecimal AV27TFFacCon_To ;
   private java.math.BigDecimal AV28TFPrdCant ;
   private java.math.BigDecimal AV29TFPrdCant_To ;
   private java.math.BigDecimal AV83Core_wprct002ds_18_tffaccon ;
   private java.math.BigDecimal AV84Core_wprct002ds_19_tffaccon_to ;
   private java.math.BigDecimal AV85Core_wprct002ds_20_tfprdcant ;
   private java.math.BigDecimal AV86Core_wprct002ds_21_tfprdcant_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV12TFProForDsc ;
   private String AV13TFProForDsc_Sel ;
   private String AV18TFRecPrdNum ;
   private String AV19TFRecPrdNum_Sel ;
   private String AV20TFRecPrdDsc ;
   private String AV21TFRecPrdDsc_Sel ;
   private String AV24TFForPrdDsc ;
   private String AV25TFForPrdDsc_Sel ;
   private String AV34TFRecLote ;
   private String AV35TFRecLote_Sel ;
   private String AV38TFRecLinUsr ;
   private String AV39TFRecLinUsr_Sel ;
   private String A766ProForDsc ;
   private String AV69Core_wprct002ds_4_tfprofordsc ;
   private String AV70Core_wprct002ds_5_tfprofordsc_sel ;
   private String AV75Core_wprct002ds_10_tfrecprdnum ;
   private String AV76Core_wprct002ds_11_tfrecprdnum_sel ;
   private String AV77Core_wprct002ds_12_tfrecprddsc ;
   private String AV78Core_wprct002ds_13_tfrecprddsc_sel ;
   private String AV81Core_wprct002ds_16_tfforprddsc ;
   private String AV82Core_wprct002ds_17_tfforprddsc_sel ;
   private String AV91Core_wprct002ds_26_tfreclote ;
   private String AV92Core_wprct002ds_27_tfreclote_sel ;
   private String AV95Core_wprct002ds_30_tfreclinusr ;
   private String AV96Core_wprct002ds_31_tfreclinusr_sel ;
   private String scmdbuf ;
   private String lV69Core_wprct002ds_4_tfprofordsc ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A4576RecLinUsr ;
   private String A396EmprCod ;
   private String AV60EmprCod ;
   private String A764ProForCod ;
   private String A130BarCodPar ;
   private java.util.Date AV40TFRecPesFec ;
   private java.util.Date AV41TFRecPesFec_To ;
   private java.util.Date AV97Core_wprct002ds_32_tfrecpesfec ;
   private java.util.Date AV98Core_wprct002ds_33_tfrecpesfec_to ;
   private boolean returnInSub ;
   private boolean brk8SW2 ;
   private boolean brk8SW4 ;
   private boolean brk8SW6 ;
   private boolean brk8SW8 ;
   private boolean brk8SW10 ;
   private boolean brk8SW12 ;
   private String AV48OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV61FilterFullText ;
   private String AV66Core_wprct002ds_1_filterfulltext ;
   private String AV46Option ;
   private String AV49OptionDesc ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08SW2_A764ProForCod ;
   private String[] P08SW2_A396EmprCod ;
   private String[] P08SW2_A766ProForDsc ;
   private int[] P08SW2_A4695RecVolPrf ;
   private byte[] P08SW2_A1273RecLinPro ;
   private int[] P08SW2_A129BarCod ;
   private byte[] P08SW2_A132BarCodReo ;
   private String[] P08SW2_A130BarCodPar ;
   private short[] P08SW2_A2804RecLinMaq ;
   private String[] P08SW3_A764ProForCod ;
   private String[] P08SW3_A396EmprCod ;
   private int[] P08SW3_A4695RecVolPrf ;
   private String[] P08SW3_A766ProForDsc ;
   private byte[] P08SW3_A1273RecLinPro ;
   private int[] P08SW3_A129BarCod ;
   private byte[] P08SW3_A132BarCodReo ;
   private String[] P08SW3_A130BarCodPar ;
   private short[] P08SW3_A2804RecLinMaq ;
   private String[] P08SW4_A764ProForCod ;
   private String[] P08SW4_A396EmprCod ;
   private int[] P08SW4_A4695RecVolPrf ;
   private String[] P08SW4_A766ProForDsc ;
   private byte[] P08SW4_A1273RecLinPro ;
   private int[] P08SW4_A129BarCod ;
   private byte[] P08SW4_A132BarCodReo ;
   private String[] P08SW4_A130BarCodPar ;
   private short[] P08SW4_A2804RecLinMaq ;
   private String[] P08SW5_A764ProForCod ;
   private String[] P08SW5_A396EmprCod ;
   private int[] P08SW5_A4695RecVolPrf ;
   private String[] P08SW5_A766ProForDsc ;
   private byte[] P08SW5_A1273RecLinPro ;
   private int[] P08SW5_A129BarCod ;
   private byte[] P08SW5_A132BarCodReo ;
   private String[] P08SW5_A130BarCodPar ;
   private short[] P08SW5_A2804RecLinMaq ;
   private String[] P08SW6_A764ProForCod ;
   private String[] P08SW6_A396EmprCod ;
   private int[] P08SW6_A4695RecVolPrf ;
   private String[] P08SW6_A766ProForDsc ;
   private byte[] P08SW6_A1273RecLinPro ;
   private int[] P08SW6_A129BarCod ;
   private byte[] P08SW6_A132BarCodReo ;
   private String[] P08SW6_A130BarCodPar ;
   private short[] P08SW6_A2804RecLinMaq ;
   private String[] P08SW7_A764ProForCod ;
   private String[] P08SW7_A396EmprCod ;
   private int[] P08SW7_A4695RecVolPrf ;
   private String[] P08SW7_A766ProForDsc ;
   private byte[] P08SW7_A1273RecLinPro ;
   private int[] P08SW7_A129BarCod ;
   private byte[] P08SW7_A132BarCodReo ;
   private String[] P08SW7_A130BarCodPar ;
   private short[] P08SW7_A2804RecLinMaq ;
   private GXSimpleCollection<String> AV47Options ;
   private GXSimpleCollection<String> AV50OptionsDesc ;
   private GXSimpleCollection<String> AV52OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV57GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV58GridStateFilterValue ;
}

final  class wprct002getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08SW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Core_wprct002ds_1_filterfulltext ,
                                          byte AV67Core_wprct002ds_2_tfreclinpro ,
                                          byte AV68Core_wprct002ds_3_tfreclinpro_to ,
                                          String AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                          String AV69Core_wprct002ds_4_tfprofordsc ,
                                          short AV71Core_wprct002ds_6_tfreclin ,
                                          short AV72Core_wprct002ds_7_tfreclin_to ,
                                          int AV73Core_wprct002ds_8_tfrecvolprf ,
                                          int AV74Core_wprct002ds_9_tfrecvolprf_to ,
                                          String AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                          String AV75Core_wprct002ds_10_tfrecprdnum ,
                                          String AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                          String AV77Core_wprct002ds_12_tfrecprddsc ,
                                          byte AV79Core_wprct002ds_14_tfforprdume ,
                                          byte AV80Core_wprct002ds_15_tfforprdume_to ,
                                          String AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                          String AV81Core_wprct002ds_16_tfforprddsc ,
                                          java.math.BigDecimal AV83Core_wprct002ds_18_tffaccon ,
                                          java.math.BigDecimal AV84Core_wprct002ds_19_tffaccon_to ,
                                          java.math.BigDecimal AV85Core_wprct002ds_20_tfprdcant ,
                                          java.math.BigDecimal AV86Core_wprct002ds_21_tfprdcant_to ,
                                          byte AV87Core_wprct002ds_22_tfrecfornro ,
                                          byte AV88Core_wprct002ds_23_tfrecfornro_to ,
                                          byte AV89Core_wprct002ds_24_tfrecprdtnq ,
                                          byte AV90Core_wprct002ds_25_tfrecprdtnq_to ,
                                          String AV92Core_wprct002ds_27_tfreclote_sel ,
                                          String AV91Core_wprct002ds_26_tfreclote ,
                                          byte AV93Core_wprct002ds_28_tfrecpes ,
                                          byte AV94Core_wprct002ds_29_tfrecpes_to ,
                                          String AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                          String AV95Core_wprct002ds_30_tfreclinusr ,
                                          java.util.Date AV97Core_wprct002ds_32_tfrecpesfec ,
                                          java.util.Date AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                          byte A1273RecLinPro ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          int A4695RecVolPrf ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          byte A8934RecPes ,
                                          String A4576RecLinUsr ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T2.ProForDsc, T1.RecVolPrf, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV67Core_wprct002ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV68Core_wprct002ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_wprct002ds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Core_wprct002ds_8_tfrecvolprf) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Core_wprct002ds_9_tfrecvolprf_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.ProForDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08SW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Core_wprct002ds_1_filterfulltext ,
                                          byte AV67Core_wprct002ds_2_tfreclinpro ,
                                          byte AV68Core_wprct002ds_3_tfreclinpro_to ,
                                          String AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                          String AV69Core_wprct002ds_4_tfprofordsc ,
                                          short AV71Core_wprct002ds_6_tfreclin ,
                                          short AV72Core_wprct002ds_7_tfreclin_to ,
                                          int AV73Core_wprct002ds_8_tfrecvolprf ,
                                          int AV74Core_wprct002ds_9_tfrecvolprf_to ,
                                          String AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                          String AV75Core_wprct002ds_10_tfrecprdnum ,
                                          String AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                          String AV77Core_wprct002ds_12_tfrecprddsc ,
                                          byte AV79Core_wprct002ds_14_tfforprdume ,
                                          byte AV80Core_wprct002ds_15_tfforprdume_to ,
                                          String AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                          String AV81Core_wprct002ds_16_tfforprddsc ,
                                          java.math.BigDecimal AV83Core_wprct002ds_18_tffaccon ,
                                          java.math.BigDecimal AV84Core_wprct002ds_19_tffaccon_to ,
                                          java.math.BigDecimal AV85Core_wprct002ds_20_tfprdcant ,
                                          java.math.BigDecimal AV86Core_wprct002ds_21_tfprdcant_to ,
                                          byte AV87Core_wprct002ds_22_tfrecfornro ,
                                          byte AV88Core_wprct002ds_23_tfrecfornro_to ,
                                          byte AV89Core_wprct002ds_24_tfrecprdtnq ,
                                          byte AV90Core_wprct002ds_25_tfrecprdtnq_to ,
                                          String AV92Core_wprct002ds_27_tfreclote_sel ,
                                          String AV91Core_wprct002ds_26_tfreclote ,
                                          byte AV93Core_wprct002ds_28_tfrecpes ,
                                          byte AV94Core_wprct002ds_29_tfrecpes_to ,
                                          String AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                          String AV95Core_wprct002ds_30_tfreclinusr ,
                                          java.util.Date AV97Core_wprct002ds_32_tfrecpesfec ,
                                          java.util.Date AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                          byte A1273RecLinPro ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          int A4695RecVolPrf ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          byte A8934RecPes ,
                                          String A4576RecLinUsr ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[7];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.RecVolPrf, T2.ProForDsc, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV67Core_wprct002ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV68Core_wprct002ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_wprct002ds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Core_wprct002ds_8_tfrecvolprf) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Core_wprct002ds_9_tfrecvolprf_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08SW4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Core_wprct002ds_1_filterfulltext ,
                                          byte AV67Core_wprct002ds_2_tfreclinpro ,
                                          byte AV68Core_wprct002ds_3_tfreclinpro_to ,
                                          String AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                          String AV69Core_wprct002ds_4_tfprofordsc ,
                                          short AV71Core_wprct002ds_6_tfreclin ,
                                          short AV72Core_wprct002ds_7_tfreclin_to ,
                                          int AV73Core_wprct002ds_8_tfrecvolprf ,
                                          int AV74Core_wprct002ds_9_tfrecvolprf_to ,
                                          String AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                          String AV75Core_wprct002ds_10_tfrecprdnum ,
                                          String AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                          String AV77Core_wprct002ds_12_tfrecprddsc ,
                                          byte AV79Core_wprct002ds_14_tfforprdume ,
                                          byte AV80Core_wprct002ds_15_tfforprdume_to ,
                                          String AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                          String AV81Core_wprct002ds_16_tfforprddsc ,
                                          java.math.BigDecimal AV83Core_wprct002ds_18_tffaccon ,
                                          java.math.BigDecimal AV84Core_wprct002ds_19_tffaccon_to ,
                                          java.math.BigDecimal AV85Core_wprct002ds_20_tfprdcant ,
                                          java.math.BigDecimal AV86Core_wprct002ds_21_tfprdcant_to ,
                                          byte AV87Core_wprct002ds_22_tfrecfornro ,
                                          byte AV88Core_wprct002ds_23_tfrecfornro_to ,
                                          byte AV89Core_wprct002ds_24_tfrecprdtnq ,
                                          byte AV90Core_wprct002ds_25_tfrecprdtnq_to ,
                                          String AV92Core_wprct002ds_27_tfreclote_sel ,
                                          String AV91Core_wprct002ds_26_tfreclote ,
                                          byte AV93Core_wprct002ds_28_tfrecpes ,
                                          byte AV94Core_wprct002ds_29_tfrecpes_to ,
                                          String AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                          String AV95Core_wprct002ds_30_tfreclinusr ,
                                          java.util.Date AV97Core_wprct002ds_32_tfrecpesfec ,
                                          java.util.Date AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                          byte A1273RecLinPro ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          int A4695RecVolPrf ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          byte A8934RecPes ,
                                          String A4576RecLinUsr ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[7];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.RecVolPrf, T2.ProForDsc, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV67Core_wprct002ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV68Core_wprct002ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_wprct002ds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Core_wprct002ds_8_tfrecvolprf) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Core_wprct002ds_9_tfrecvolprf_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08SW5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Core_wprct002ds_1_filterfulltext ,
                                          byte AV67Core_wprct002ds_2_tfreclinpro ,
                                          byte AV68Core_wprct002ds_3_tfreclinpro_to ,
                                          String AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                          String AV69Core_wprct002ds_4_tfprofordsc ,
                                          short AV71Core_wprct002ds_6_tfreclin ,
                                          short AV72Core_wprct002ds_7_tfreclin_to ,
                                          int AV73Core_wprct002ds_8_tfrecvolprf ,
                                          int AV74Core_wprct002ds_9_tfrecvolprf_to ,
                                          String AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                          String AV75Core_wprct002ds_10_tfrecprdnum ,
                                          String AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                          String AV77Core_wprct002ds_12_tfrecprddsc ,
                                          byte AV79Core_wprct002ds_14_tfforprdume ,
                                          byte AV80Core_wprct002ds_15_tfforprdume_to ,
                                          String AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                          String AV81Core_wprct002ds_16_tfforprddsc ,
                                          java.math.BigDecimal AV83Core_wprct002ds_18_tffaccon ,
                                          java.math.BigDecimal AV84Core_wprct002ds_19_tffaccon_to ,
                                          java.math.BigDecimal AV85Core_wprct002ds_20_tfprdcant ,
                                          java.math.BigDecimal AV86Core_wprct002ds_21_tfprdcant_to ,
                                          byte AV87Core_wprct002ds_22_tfrecfornro ,
                                          byte AV88Core_wprct002ds_23_tfrecfornro_to ,
                                          byte AV89Core_wprct002ds_24_tfrecprdtnq ,
                                          byte AV90Core_wprct002ds_25_tfrecprdtnq_to ,
                                          String AV92Core_wprct002ds_27_tfreclote_sel ,
                                          String AV91Core_wprct002ds_26_tfreclote ,
                                          byte AV93Core_wprct002ds_28_tfrecpes ,
                                          byte AV94Core_wprct002ds_29_tfrecpes_to ,
                                          String AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                          String AV95Core_wprct002ds_30_tfreclinusr ,
                                          java.util.Date AV97Core_wprct002ds_32_tfrecpesfec ,
                                          java.util.Date AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                          byte A1273RecLinPro ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          int A4695RecVolPrf ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          byte A8934RecPes ,
                                          String A4576RecLinUsr ,
                                          String AV60EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[7];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.RecVolPrf, T2.ProForDsc, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV67Core_wprct002ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV68Core_wprct002ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_wprct002ds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Core_wprct002ds_8_tfrecvolprf) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Core_wprct002ds_9_tfrecvolprf_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08SW6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Core_wprct002ds_1_filterfulltext ,
                                          byte AV67Core_wprct002ds_2_tfreclinpro ,
                                          byte AV68Core_wprct002ds_3_tfreclinpro_to ,
                                          String AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                          String AV69Core_wprct002ds_4_tfprofordsc ,
                                          short AV71Core_wprct002ds_6_tfreclin ,
                                          short AV72Core_wprct002ds_7_tfreclin_to ,
                                          int AV73Core_wprct002ds_8_tfrecvolprf ,
                                          int AV74Core_wprct002ds_9_tfrecvolprf_to ,
                                          String AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                          String AV75Core_wprct002ds_10_tfrecprdnum ,
                                          String AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                          String AV77Core_wprct002ds_12_tfrecprddsc ,
                                          byte AV79Core_wprct002ds_14_tfforprdume ,
                                          byte AV80Core_wprct002ds_15_tfforprdume_to ,
                                          String AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                          String AV81Core_wprct002ds_16_tfforprddsc ,
                                          java.math.BigDecimal AV83Core_wprct002ds_18_tffaccon ,
                                          java.math.BigDecimal AV84Core_wprct002ds_19_tffaccon_to ,
                                          java.math.BigDecimal AV85Core_wprct002ds_20_tfprdcant ,
                                          java.math.BigDecimal AV86Core_wprct002ds_21_tfprdcant_to ,
                                          byte AV87Core_wprct002ds_22_tfrecfornro ,
                                          byte AV88Core_wprct002ds_23_tfrecfornro_to ,
                                          byte AV89Core_wprct002ds_24_tfrecprdtnq ,
                                          byte AV90Core_wprct002ds_25_tfrecprdtnq_to ,
                                          String AV92Core_wprct002ds_27_tfreclote_sel ,
                                          String AV91Core_wprct002ds_26_tfreclote ,
                                          byte AV93Core_wprct002ds_28_tfrecpes ,
                                          byte AV94Core_wprct002ds_29_tfrecpes_to ,
                                          String AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                          String AV95Core_wprct002ds_30_tfreclinusr ,
                                          java.util.Date AV97Core_wprct002ds_32_tfrecpesfec ,
                                          java.util.Date AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                          byte A1273RecLinPro ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          int A4695RecVolPrf ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          byte A8934RecPes ,
                                          String A4576RecLinUsr ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[7];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.RecVolPrf, T2.ProForDsc, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV67Core_wprct002ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (0==AV68Core_wprct002ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_wprct002ds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Core_wprct002ds_8_tfrecvolprf) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf >= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Core_wprct002ds_9_tfrecvolprf_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf <= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08SW7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Core_wprct002ds_1_filterfulltext ,
                                          byte AV67Core_wprct002ds_2_tfreclinpro ,
                                          byte AV68Core_wprct002ds_3_tfreclinpro_to ,
                                          String AV70Core_wprct002ds_5_tfprofordsc_sel ,
                                          String AV69Core_wprct002ds_4_tfprofordsc ,
                                          short AV71Core_wprct002ds_6_tfreclin ,
                                          short AV72Core_wprct002ds_7_tfreclin_to ,
                                          int AV73Core_wprct002ds_8_tfrecvolprf ,
                                          int AV74Core_wprct002ds_9_tfrecvolprf_to ,
                                          String AV76Core_wprct002ds_11_tfrecprdnum_sel ,
                                          String AV75Core_wprct002ds_10_tfrecprdnum ,
                                          String AV78Core_wprct002ds_13_tfrecprddsc_sel ,
                                          String AV77Core_wprct002ds_12_tfrecprddsc ,
                                          byte AV79Core_wprct002ds_14_tfforprdume ,
                                          byte AV80Core_wprct002ds_15_tfforprdume_to ,
                                          String AV82Core_wprct002ds_17_tfforprddsc_sel ,
                                          String AV81Core_wprct002ds_16_tfforprddsc ,
                                          java.math.BigDecimal AV83Core_wprct002ds_18_tffaccon ,
                                          java.math.BigDecimal AV84Core_wprct002ds_19_tffaccon_to ,
                                          java.math.BigDecimal AV85Core_wprct002ds_20_tfprdcant ,
                                          java.math.BigDecimal AV86Core_wprct002ds_21_tfprdcant_to ,
                                          byte AV87Core_wprct002ds_22_tfrecfornro ,
                                          byte AV88Core_wprct002ds_23_tfrecfornro_to ,
                                          byte AV89Core_wprct002ds_24_tfrecprdtnq ,
                                          byte AV90Core_wprct002ds_25_tfrecprdtnq_to ,
                                          String AV92Core_wprct002ds_27_tfreclote_sel ,
                                          String AV91Core_wprct002ds_26_tfreclote ,
                                          byte AV93Core_wprct002ds_28_tfrecpes ,
                                          byte AV94Core_wprct002ds_29_tfrecpes_to ,
                                          String AV96Core_wprct002ds_31_tfreclinusr_sel ,
                                          String AV95Core_wprct002ds_30_tfreclinusr ,
                                          java.util.Date AV97Core_wprct002ds_32_tfrecpesfec ,
                                          java.util.Date AV98Core_wprct002ds_33_tfrecpesfec_to ,
                                          byte A1273RecLinPro ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          int A4695RecVolPrf ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          byte A8934RecPes ,
                                          String A4576RecLinUsr ,
                                          String A396EmprCod ,
                                          String AV60EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[7];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T1.RecVolPrf, T2.ProForDsc, T1.RecLinPro, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPCPROFO" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV67Core_wprct002ds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (0==AV68Core_wprct002ds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV69Core_wprct002ds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Core_wprct002ds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Core_wprct002ds_8_tfrecvolprf) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Core_wprct002ds_9_tfrecvolprf_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrf <= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P08SW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 1 :
                  return conditional_P08SW3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 2 :
                  return conditional_P08SW4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 3 :
                  return conditional_P08SW5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 4 :
                  return conditional_P08SW6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[49] , (String)dynConstraints[50] );
            case 5 :
                  return conditional_P08SW7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08SW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SW4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SW5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SW6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SW7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

