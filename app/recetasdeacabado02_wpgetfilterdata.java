package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetasdeacabado02_wpgetfilterdata extends GXProcedure
{
   public recetasdeacabado02_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado02_wpgetfilterdata.class ), "" );
   }

   public recetasdeacabado02_wpgetfilterdata( int remoteHandle ,
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
      recetasdeacabado02_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetasdeacabado02_wpgetfilterdata.this.AV38DDOName = aP0;
      recetasdeacabado02_wpgetfilterdata.this.AV36SearchTxt = aP1;
      recetasdeacabado02_wpgetfilterdata.this.AV37SearchTxtTo = aP2;
      recetasdeacabado02_wpgetfilterdata.this.aP3 = aP3;
      recetasdeacabado02_wpgetfilterdata.this.aP4 = aP4;
      recetasdeacabado02_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROFORCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_RECPRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADRECPRDNUMOPTIONS' */
         S141 ();
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
         S151 ();
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
         S161 ();
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
         S171 ();
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
      if ( GXutil.strcmp(AV49Session.getValue("RecetasdeAcabado02_WPGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeAcabado02_WPGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("RecetasdeAcabado02_WPGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV12TFProForCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV13TFProForCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV14TFProForDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV15TFProForDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV16TFRecLin = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFRecLin_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV18TFRecPrdNum = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV19TFRecPrdNum_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV20TFRecPrdDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV21TFRecPrdDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV22TFFacCon = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFFacCon_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV24TFPrdCant = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdCant_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV26TFForPrdDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV27TFForPrdDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV28TFRecForNro = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFRecForNro_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV30TFRecPrdTnq = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFRecPrdTnq_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV32TFRecLote = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV33TFRecLote_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForCod = AV36SearchTxt ;
      AV13TFProForCod_Sel = "" ;
      AV63Recetasdeacabado02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Recetasdeacabado02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Recetasdeacabado02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Recetasdeacabado02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Recetasdeacabado02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Recetasdeacabado02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Recetasdeacabado02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Recetasdeacabado02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Recetasdeacabado02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Recetasdeacabado02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Recetasdeacabado02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Recetasdeacabado02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Recetasdeacabado02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Recetasdeacabado02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Recetasdeacabado02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Recetasdeacabado02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Recetasdeacabado02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Recetasdeacabado02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Recetasdeacabado02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                           AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                           AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                           AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                           AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                           AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                           AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                           AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                           AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                           AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                           AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                           AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                           AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                           AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                           AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                           AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV54Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV55Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV56Barcodreo) ,
                                           A130BarCodPar ,
                                           AV57Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV58RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
      lV67Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09BI2 */
      pr_default.execute(0, new Object[] {AV54Emprcod, Integer.valueOf(AV55Barcod), Byte.valueOf(AV56Barcodreo), AV57Barcodpar, Short.valueOf(AV58RecLinMaq), Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to), lV65Recetasdeacabado02_wpds_3_tfproforcod, AV66Recetasdeacabado02_wpds_4_tfproforcod_sel, lV67Recetasdeacabado02_wpds_5_tfprofordsc, AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to), lV71Recetasdeacabado02_wpds_9_tfrecprdnum, AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV73Recetasdeacabado02_wpds_11_tfrecprddsc, AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV75Recetasdeacabado02_wpds_13_tffaccon, AV76Recetasdeacabado02_wpds_14_tffaccon_to, AV77Recetasdeacabado02_wpds_15_tfprdcant, AV78Recetasdeacabado02_wpds_16_tfprdcant_to, lV79Recetasdeacabado02_wpds_17_tfforprddsc, AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV85Recetasdeacabado02_wpds_23_tfreclote, AV86Recetasdeacabado02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9BI2 = false ;
         A490ForPrdUMe = P09BI2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BI2_n490ForPrdUMe[0] ;
         A396EmprCod = P09BI2_A396EmprCod[0] ;
         A129BarCod = P09BI2_A129BarCod[0] ;
         A132BarCodReo = P09BI2_A132BarCodReo[0] ;
         A130BarCodPar = P09BI2_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BI2_A2804RecLinMaq[0] ;
         A764ProForCod = P09BI2_A764ProForCod[0] ;
         A5725RecLote = P09BI2_A5725RecLote[0] ;
         A3274RecPrdTnq = P09BI2_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BI2_A2394RecForNro[0] ;
         A488ForPrdDsc = P09BI2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI2_n488ForPrdDsc[0] ;
         A686PrdCant = P09BI2_A686PrdCant[0] ;
         A431FacCon = P09BI2_A431FacCon[0] ;
         A875RecPrdDsc = P09BI2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09BI2_A872RecPrdNum[0] ;
         A811RecLin = P09BI2_A811RecLin[0] ;
         A766ProForDsc = P09BI2_A766ProForDsc[0] ;
         A1273RecLinPro = P09BI2_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09BI2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI2_n488ForPrdDsc[0] ;
         A764ProForCod = P09BI2_A764ProForCod[0] ;
         A766ProForDsc = P09BI2_A766ProForDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09BI2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk9BI2 = false ;
            A396EmprCod = P09BI2_A396EmprCod[0] ;
            A129BarCod = P09BI2_A129BarCod[0] ;
            A132BarCodReo = P09BI2_A132BarCodReo[0] ;
            A130BarCodPar = P09BI2_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BI2_A2804RecLinMaq[0] ;
            A811RecLin = P09BI2_A811RecLin[0] ;
            A1273RecLinPro = P09BI2_A1273RecLinPro[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BI2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV40Option = A764ProForCod ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BI2 )
         {
            brk9BI2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc = AV36SearchTxt ;
      AV15TFProForDsc_Sel = "" ;
      AV63Recetasdeacabado02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Recetasdeacabado02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Recetasdeacabado02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Recetasdeacabado02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Recetasdeacabado02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Recetasdeacabado02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Recetasdeacabado02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Recetasdeacabado02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Recetasdeacabado02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Recetasdeacabado02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Recetasdeacabado02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Recetasdeacabado02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Recetasdeacabado02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Recetasdeacabado02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Recetasdeacabado02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Recetasdeacabado02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Recetasdeacabado02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Recetasdeacabado02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Recetasdeacabado02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                           AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                           AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                           AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                           AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                           AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                           AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                           AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                           AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                           AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                           AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                           AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                           AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                           AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                           AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                           AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV54Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV55Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV56Barcodreo) ,
                                           A130BarCodPar ,
                                           AV57Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV58RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
      lV67Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09BI3 */
      pr_default.execute(1, new Object[] {AV54Emprcod, Integer.valueOf(AV55Barcod), Byte.valueOf(AV56Barcodreo), AV57Barcodpar, Short.valueOf(AV58RecLinMaq), Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to), lV65Recetasdeacabado02_wpds_3_tfproforcod, AV66Recetasdeacabado02_wpds_4_tfproforcod_sel, lV67Recetasdeacabado02_wpds_5_tfprofordsc, AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to), lV71Recetasdeacabado02_wpds_9_tfrecprdnum, AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV73Recetasdeacabado02_wpds_11_tfrecprddsc, AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV75Recetasdeacabado02_wpds_13_tffaccon, AV76Recetasdeacabado02_wpds_14_tffaccon_to, AV77Recetasdeacabado02_wpds_15_tfprdcant, AV78Recetasdeacabado02_wpds_16_tfprdcant_to, lV79Recetasdeacabado02_wpds_17_tfforprddsc, AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV85Recetasdeacabado02_wpds_23_tfreclote, AV86Recetasdeacabado02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9BI4 = false ;
         A490ForPrdUMe = P09BI3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BI3_n490ForPrdUMe[0] ;
         A396EmprCod = P09BI3_A396EmprCod[0] ;
         A129BarCod = P09BI3_A129BarCod[0] ;
         A132BarCodReo = P09BI3_A132BarCodReo[0] ;
         A130BarCodPar = P09BI3_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BI3_A2804RecLinMaq[0] ;
         A766ProForDsc = P09BI3_A766ProForDsc[0] ;
         A5725RecLote = P09BI3_A5725RecLote[0] ;
         A3274RecPrdTnq = P09BI3_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BI3_A2394RecForNro[0] ;
         A488ForPrdDsc = P09BI3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI3_n488ForPrdDsc[0] ;
         A686PrdCant = P09BI3_A686PrdCant[0] ;
         A431FacCon = P09BI3_A431FacCon[0] ;
         A875RecPrdDsc = P09BI3_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09BI3_A872RecPrdNum[0] ;
         A811RecLin = P09BI3_A811RecLin[0] ;
         A764ProForCod = P09BI3_A764ProForCod[0] ;
         A1273RecLinPro = P09BI3_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09BI3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI3_n488ForPrdDsc[0] ;
         A764ProForCod = P09BI3_A764ProForCod[0] ;
         A766ProForDsc = P09BI3_A766ProForDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09BI3_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brk9BI4 = false ;
            A396EmprCod = P09BI3_A396EmprCod[0] ;
            A129BarCod = P09BI3_A129BarCod[0] ;
            A132BarCodReo = P09BI3_A132BarCodReo[0] ;
            A130BarCodPar = P09BI3_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BI3_A2804RecLinMaq[0] ;
            A811RecLin = P09BI3_A811RecLin[0] ;
            A764ProForCod = P09BI3_A764ProForCod[0] ;
            A1273RecLinPro = P09BI3_A1273RecLinPro[0] ;
            A764ProForCod = P09BI3_A764ProForCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BI4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV40Option = A766ProForDsc ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BI4 )
         {
            brk9BI4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFRecPrdNum = AV36SearchTxt ;
      AV19TFRecPrdNum_Sel = "" ;
      AV63Recetasdeacabado02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Recetasdeacabado02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Recetasdeacabado02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Recetasdeacabado02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Recetasdeacabado02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Recetasdeacabado02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Recetasdeacabado02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Recetasdeacabado02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Recetasdeacabado02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Recetasdeacabado02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Recetasdeacabado02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Recetasdeacabado02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Recetasdeacabado02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Recetasdeacabado02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Recetasdeacabado02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Recetasdeacabado02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Recetasdeacabado02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Recetasdeacabado02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Recetasdeacabado02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                           AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                           AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                           AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                           AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                           AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                           AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                           AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                           AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                           AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                           AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                           AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                           AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                           AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                           AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                           AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV54Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV55Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV56Barcodreo) ,
                                           A130BarCodPar ,
                                           AV57Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV58RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
      lV67Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09BI4 */
      pr_default.execute(2, new Object[] {AV54Emprcod, Integer.valueOf(AV55Barcod), Byte.valueOf(AV56Barcodreo), AV57Barcodpar, Short.valueOf(AV58RecLinMaq), Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to), lV65Recetasdeacabado02_wpds_3_tfproforcod, AV66Recetasdeacabado02_wpds_4_tfproforcod_sel, lV67Recetasdeacabado02_wpds_5_tfprofordsc, AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to), lV71Recetasdeacabado02_wpds_9_tfrecprdnum, AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV73Recetasdeacabado02_wpds_11_tfrecprddsc, AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV75Recetasdeacabado02_wpds_13_tffaccon, AV76Recetasdeacabado02_wpds_14_tffaccon_to, AV77Recetasdeacabado02_wpds_15_tfprdcant, AV78Recetasdeacabado02_wpds_16_tfprdcant_to, lV79Recetasdeacabado02_wpds_17_tfforprddsc, AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV85Recetasdeacabado02_wpds_23_tfreclote, AV86Recetasdeacabado02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9BI6 = false ;
         A490ForPrdUMe = P09BI4_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BI4_n490ForPrdUMe[0] ;
         A396EmprCod = P09BI4_A396EmprCod[0] ;
         A129BarCod = P09BI4_A129BarCod[0] ;
         A132BarCodReo = P09BI4_A132BarCodReo[0] ;
         A130BarCodPar = P09BI4_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BI4_A2804RecLinMaq[0] ;
         A872RecPrdNum = P09BI4_A872RecPrdNum[0] ;
         A5725RecLote = P09BI4_A5725RecLote[0] ;
         A3274RecPrdTnq = P09BI4_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BI4_A2394RecForNro[0] ;
         A488ForPrdDsc = P09BI4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI4_n488ForPrdDsc[0] ;
         A686PrdCant = P09BI4_A686PrdCant[0] ;
         A431FacCon = P09BI4_A431FacCon[0] ;
         A875RecPrdDsc = P09BI4_A875RecPrdDsc[0] ;
         A811RecLin = P09BI4_A811RecLin[0] ;
         A766ProForDsc = P09BI4_A766ProForDsc[0] ;
         A764ProForCod = P09BI4_A764ProForCod[0] ;
         A1273RecLinPro = P09BI4_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09BI4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI4_n488ForPrdDsc[0] ;
         A764ProForCod = P09BI4_A764ProForCod[0] ;
         A766ProForDsc = P09BI4_A766ProForDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09BI4_A872RecPrdNum[0], A872RecPrdNum) == 0 ) )
         {
            brk9BI6 = false ;
            A396EmprCod = P09BI4_A396EmprCod[0] ;
            A129BarCod = P09BI4_A129BarCod[0] ;
            A132BarCodReo = P09BI4_A132BarCodReo[0] ;
            A130BarCodPar = P09BI4_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BI4_A2804RecLinMaq[0] ;
            A811RecLin = P09BI4_A811RecLin[0] ;
            A1273RecLinPro = P09BI4_A1273RecLinPro[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BI6 = true ;
            pr_default.readNext(2);
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
         if ( ! brk9BI6 )
         {
            brk9BI6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFRecPrdDsc = AV36SearchTxt ;
      AV21TFRecPrdDsc_Sel = "" ;
      AV63Recetasdeacabado02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Recetasdeacabado02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Recetasdeacabado02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Recetasdeacabado02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Recetasdeacabado02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Recetasdeacabado02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Recetasdeacabado02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Recetasdeacabado02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Recetasdeacabado02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Recetasdeacabado02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Recetasdeacabado02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Recetasdeacabado02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Recetasdeacabado02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Recetasdeacabado02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Recetasdeacabado02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Recetasdeacabado02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Recetasdeacabado02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Recetasdeacabado02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Recetasdeacabado02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                           AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                           AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                           AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                           AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                           AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                           AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                           AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                           AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                           AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                           AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                           AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                           AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                           AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                           AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                           AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV54Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV55Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV56Barcodreo) ,
                                           A130BarCodPar ,
                                           AV57Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV58RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
      lV67Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09BI5 */
      pr_default.execute(3, new Object[] {AV54Emprcod, Integer.valueOf(AV55Barcod), Byte.valueOf(AV56Barcodreo), AV57Barcodpar, Short.valueOf(AV58RecLinMaq), Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to), lV65Recetasdeacabado02_wpds_3_tfproforcod, AV66Recetasdeacabado02_wpds_4_tfproforcod_sel, lV67Recetasdeacabado02_wpds_5_tfprofordsc, AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to), lV71Recetasdeacabado02_wpds_9_tfrecprdnum, AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV73Recetasdeacabado02_wpds_11_tfrecprddsc, AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV75Recetasdeacabado02_wpds_13_tffaccon, AV76Recetasdeacabado02_wpds_14_tffaccon_to, AV77Recetasdeacabado02_wpds_15_tfprdcant, AV78Recetasdeacabado02_wpds_16_tfprdcant_to, lV79Recetasdeacabado02_wpds_17_tfforprddsc, AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV85Recetasdeacabado02_wpds_23_tfreclote, AV86Recetasdeacabado02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9BI8 = false ;
         A490ForPrdUMe = P09BI5_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BI5_n490ForPrdUMe[0] ;
         A396EmprCod = P09BI5_A396EmprCod[0] ;
         A129BarCod = P09BI5_A129BarCod[0] ;
         A132BarCodReo = P09BI5_A132BarCodReo[0] ;
         A130BarCodPar = P09BI5_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BI5_A2804RecLinMaq[0] ;
         A875RecPrdDsc = P09BI5_A875RecPrdDsc[0] ;
         A5725RecLote = P09BI5_A5725RecLote[0] ;
         A3274RecPrdTnq = P09BI5_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BI5_A2394RecForNro[0] ;
         A488ForPrdDsc = P09BI5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI5_n488ForPrdDsc[0] ;
         A686PrdCant = P09BI5_A686PrdCant[0] ;
         A431FacCon = P09BI5_A431FacCon[0] ;
         A872RecPrdNum = P09BI5_A872RecPrdNum[0] ;
         A811RecLin = P09BI5_A811RecLin[0] ;
         A766ProForDsc = P09BI5_A766ProForDsc[0] ;
         A764ProForCod = P09BI5_A764ProForCod[0] ;
         A1273RecLinPro = P09BI5_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09BI5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI5_n488ForPrdDsc[0] ;
         A764ProForCod = P09BI5_A764ProForCod[0] ;
         A766ProForDsc = P09BI5_A766ProForDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09BI5_A875RecPrdDsc[0], A875RecPrdDsc) == 0 ) )
         {
            brk9BI8 = false ;
            A396EmprCod = P09BI5_A396EmprCod[0] ;
            A129BarCod = P09BI5_A129BarCod[0] ;
            A132BarCodReo = P09BI5_A132BarCodReo[0] ;
            A130BarCodPar = P09BI5_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BI5_A2804RecLinMaq[0] ;
            A811RecLin = P09BI5_A811RecLin[0] ;
            A1273RecLinPro = P09BI5_A1273RecLinPro[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BI8 = true ;
            pr_default.readNext(3);
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
         if ( ! brk9BI8 )
         {
            brk9BI8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV26TFForPrdDsc = AV36SearchTxt ;
      AV27TFForPrdDsc_Sel = "" ;
      AV63Recetasdeacabado02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Recetasdeacabado02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Recetasdeacabado02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Recetasdeacabado02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Recetasdeacabado02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Recetasdeacabado02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Recetasdeacabado02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Recetasdeacabado02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Recetasdeacabado02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Recetasdeacabado02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Recetasdeacabado02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Recetasdeacabado02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Recetasdeacabado02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Recetasdeacabado02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Recetasdeacabado02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Recetasdeacabado02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Recetasdeacabado02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Recetasdeacabado02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Recetasdeacabado02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                           AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                           AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                           AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                           AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                           AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                           AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                           AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                           AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                           AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                           AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                           AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                           AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                           AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                           AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                           AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV55Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV56Barcodreo) ,
                                           A130BarCodPar ,
                                           AV57Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV58RecLinMaq) ,
                                           AV54Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
      lV67Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09BI6 */
      pr_default.execute(4, new Object[] {AV54Emprcod, Integer.valueOf(AV55Barcod), Byte.valueOf(AV56Barcodreo), AV57Barcodpar, Short.valueOf(AV58RecLinMaq), Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to), lV65Recetasdeacabado02_wpds_3_tfproforcod, AV66Recetasdeacabado02_wpds_4_tfproforcod_sel, lV67Recetasdeacabado02_wpds_5_tfprofordsc, AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to), lV71Recetasdeacabado02_wpds_9_tfrecprdnum, AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV73Recetasdeacabado02_wpds_11_tfrecprddsc, AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV75Recetasdeacabado02_wpds_13_tffaccon, AV76Recetasdeacabado02_wpds_14_tffaccon_to, AV77Recetasdeacabado02_wpds_15_tfprdcant, AV78Recetasdeacabado02_wpds_16_tfprdcant_to, lV79Recetasdeacabado02_wpds_17_tfforprddsc, AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV85Recetasdeacabado02_wpds_23_tfreclote, AV86Recetasdeacabado02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9BI10 = false ;
         A490ForPrdUMe = P09BI6_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BI6_n490ForPrdUMe[0] ;
         A396EmprCod = P09BI6_A396EmprCod[0] ;
         A2804RecLinMaq = P09BI6_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BI6_A130BarCodPar[0] ;
         A132BarCodReo = P09BI6_A132BarCodReo[0] ;
         A129BarCod = P09BI6_A129BarCod[0] ;
         A5725RecLote = P09BI6_A5725RecLote[0] ;
         A3274RecPrdTnq = P09BI6_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BI6_A2394RecForNro[0] ;
         A488ForPrdDsc = P09BI6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI6_n488ForPrdDsc[0] ;
         A686PrdCant = P09BI6_A686PrdCant[0] ;
         A431FacCon = P09BI6_A431FacCon[0] ;
         A875RecPrdDsc = P09BI6_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09BI6_A872RecPrdNum[0] ;
         A811RecLin = P09BI6_A811RecLin[0] ;
         A766ProForDsc = P09BI6_A766ProForDsc[0] ;
         A764ProForCod = P09BI6_A764ProForCod[0] ;
         A1273RecLinPro = P09BI6_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09BI6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI6_n488ForPrdDsc[0] ;
         A764ProForCod = P09BI6_A764ProForCod[0] ;
         A766ProForDsc = P09BI6_A766ProForDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09BI6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09BI6_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brk9BI10 = false ;
            A2804RecLinMaq = P09BI6_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BI6_A130BarCodPar[0] ;
            A132BarCodReo = P09BI6_A132BarCodReo[0] ;
            A129BarCod = P09BI6_A129BarCod[0] ;
            A811RecLin = P09BI6_A811RecLin[0] ;
            A1273RecLinPro = P09BI6_A1273RecLinPro[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BI10 = true ;
            pr_default.readNext(4);
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
         if ( ! brk9BI10 )
         {
            brk9BI10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADRECLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV32TFRecLote = AV36SearchTxt ;
      AV33TFRecLote_Sel = "" ;
      AV63Recetasdeacabado02_wpds_1_tfreclinpro = AV10TFRecLinPro ;
      AV64Recetasdeacabado02_wpds_2_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV65Recetasdeacabado02_wpds_3_tfproforcod = AV12TFProForCod ;
      AV66Recetasdeacabado02_wpds_4_tfproforcod_sel = AV13TFProForCod_Sel ;
      AV67Recetasdeacabado02_wpds_5_tfprofordsc = AV14TFProForDsc ;
      AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel = AV15TFProForDsc_Sel ;
      AV69Recetasdeacabado02_wpds_7_tfreclin = AV16TFRecLin ;
      AV70Recetasdeacabado02_wpds_8_tfreclin_to = AV17TFRecLin_To ;
      AV71Recetasdeacabado02_wpds_9_tfrecprdnum = AV18TFRecPrdNum ;
      AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel = AV19TFRecPrdNum_Sel ;
      AV73Recetasdeacabado02_wpds_11_tfrecprddsc = AV20TFRecPrdDsc ;
      AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel = AV21TFRecPrdDsc_Sel ;
      AV75Recetasdeacabado02_wpds_13_tffaccon = AV22TFFacCon ;
      AV76Recetasdeacabado02_wpds_14_tffaccon_to = AV23TFFacCon_To ;
      AV77Recetasdeacabado02_wpds_15_tfprdcant = AV24TFPrdCant ;
      AV78Recetasdeacabado02_wpds_16_tfprdcant_to = AV25TFPrdCant_To ;
      AV79Recetasdeacabado02_wpds_17_tfforprddsc = AV26TFForPrdDsc ;
      AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel = AV27TFForPrdDsc_Sel ;
      AV81Recetasdeacabado02_wpds_19_tfrecfornro = AV28TFRecForNro ;
      AV82Recetasdeacabado02_wpds_20_tfrecfornro_to = AV29TFRecForNro_To ;
      AV83Recetasdeacabado02_wpds_21_tfrecprdtnq = AV30TFRecPrdTnq ;
      AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to = AV31TFRecPrdTnq_To ;
      AV85Recetasdeacabado02_wpds_23_tfreclote = AV32TFRecLote ;
      AV86Recetasdeacabado02_wpds_24_tfreclote_sel = AV33TFRecLote_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) ,
                                           AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                           AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                           AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                           AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to) ,
                                           AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                           AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                           AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                           AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                           AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                           AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                           AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                           AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                           AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                           AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) ,
                                           AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                           AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A396EmprCod ,
                                           AV54Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV55Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV56Barcodreo) ,
                                           A130BarCodPar ,
                                           AV57Barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV58RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV65Recetasdeacabado02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado02_wpds_3_tfproforcod), 6, "%") ;
      lV67Recetasdeacabado02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV67Recetasdeacabado02_wpds_5_tfprofordsc), 30, "%") ;
      lV71Recetasdeacabado02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV71Recetasdeacabado02_wpds_9_tfrecprdnum), 6, "%") ;
      lV73Recetasdeacabado02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV73Recetasdeacabado02_wpds_11_tfrecprddsc), 26, "%") ;
      lV79Recetasdeacabado02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV79Recetasdeacabado02_wpds_17_tfforprddsc), 5, "%") ;
      lV85Recetasdeacabado02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor P09BI7 */
      pr_default.execute(5, new Object[] {AV54Emprcod, Integer.valueOf(AV55Barcod), Byte.valueOf(AV56Barcodreo), AV57Barcodpar, Short.valueOf(AV58RecLinMaq), Byte.valueOf(AV63Recetasdeacabado02_wpds_1_tfreclinpro), Byte.valueOf(AV64Recetasdeacabado02_wpds_2_tfreclinpro_to), lV65Recetasdeacabado02_wpds_3_tfproforcod, AV66Recetasdeacabado02_wpds_4_tfproforcod_sel, lV67Recetasdeacabado02_wpds_5_tfprofordsc, AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel, Short.valueOf(AV69Recetasdeacabado02_wpds_7_tfreclin), Short.valueOf(AV70Recetasdeacabado02_wpds_8_tfreclin_to), lV71Recetasdeacabado02_wpds_9_tfrecprdnum, AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel, lV73Recetasdeacabado02_wpds_11_tfrecprddsc, AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel, AV75Recetasdeacabado02_wpds_13_tffaccon, AV76Recetasdeacabado02_wpds_14_tffaccon_to, AV77Recetasdeacabado02_wpds_15_tfprdcant, AV78Recetasdeacabado02_wpds_16_tfprdcant_to, lV79Recetasdeacabado02_wpds_17_tfforprddsc, AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV81Recetasdeacabado02_wpds_19_tfrecfornro), Byte.valueOf(AV82Recetasdeacabado02_wpds_20_tfrecfornro_to), Byte.valueOf(AV83Recetasdeacabado02_wpds_21_tfrecprdtnq), Byte.valueOf(AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to), lV85Recetasdeacabado02_wpds_23_tfreclote, AV86Recetasdeacabado02_wpds_24_tfreclote_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9BI12 = false ;
         A490ForPrdUMe = P09BI7_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09BI7_n490ForPrdUMe[0] ;
         A396EmprCod = P09BI7_A396EmprCod[0] ;
         A129BarCod = P09BI7_A129BarCod[0] ;
         A132BarCodReo = P09BI7_A132BarCodReo[0] ;
         A130BarCodPar = P09BI7_A130BarCodPar[0] ;
         A2804RecLinMaq = P09BI7_A2804RecLinMaq[0] ;
         A5725RecLote = P09BI7_A5725RecLote[0] ;
         A3274RecPrdTnq = P09BI7_A3274RecPrdTnq[0] ;
         A2394RecForNro = P09BI7_A2394RecForNro[0] ;
         A488ForPrdDsc = P09BI7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI7_n488ForPrdDsc[0] ;
         A686PrdCant = P09BI7_A686PrdCant[0] ;
         A431FacCon = P09BI7_A431FacCon[0] ;
         A875RecPrdDsc = P09BI7_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09BI7_A872RecPrdNum[0] ;
         A811RecLin = P09BI7_A811RecLin[0] ;
         A766ProForDsc = P09BI7_A766ProForDsc[0] ;
         A764ProForCod = P09BI7_A764ProForCod[0] ;
         A1273RecLinPro = P09BI7_A1273RecLinPro[0] ;
         A488ForPrdDsc = P09BI7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09BI7_n488ForPrdDsc[0] ;
         A764ProForCod = P09BI7_A764ProForCod[0] ;
         A766ProForDsc = P09BI7_A766ProForDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09BI7_A5725RecLote[0], A5725RecLote) == 0 ) )
         {
            brk9BI12 = false ;
            A396EmprCod = P09BI7_A396EmprCod[0] ;
            A129BarCod = P09BI7_A129BarCod[0] ;
            A132BarCodReo = P09BI7_A132BarCodReo[0] ;
            A130BarCodPar = P09BI7_A130BarCodPar[0] ;
            A2804RecLinMaq = P09BI7_A2804RecLinMaq[0] ;
            A811RecLin = P09BI7_A811RecLin[0] ;
            A1273RecLinPro = P09BI7_A1273RecLinPro[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9BI12 = true ;
            pr_default.readNext(5);
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
         if ( ! brk9BI12 )
         {
            brk9BI12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetasdeacabado02_wpgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = recetasdeacabado02_wpgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = recetasdeacabado02_wpgetfilterdata.this.AV47OptionIndexesJson;
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
      AV12TFProForCod = "" ;
      AV13TFProForCod_Sel = "" ;
      AV14TFProForDsc = "" ;
      AV15TFProForDsc_Sel = "" ;
      AV18TFRecPrdNum = "" ;
      AV19TFRecPrdNum_Sel = "" ;
      AV20TFRecPrdDsc = "" ;
      AV21TFRecPrdDsc_Sel = "" ;
      AV22TFFacCon = DecimalUtil.ZERO ;
      AV23TFFacCon_To = DecimalUtil.ZERO ;
      AV24TFPrdCant = DecimalUtil.ZERO ;
      AV25TFPrdCant_To = DecimalUtil.ZERO ;
      AV26TFForPrdDsc = "" ;
      AV27TFForPrdDsc_Sel = "" ;
      AV32TFRecLote = "" ;
      AV33TFRecLote_Sel = "" ;
      A764ProForCod = "" ;
      AV65Recetasdeacabado02_wpds_3_tfproforcod = "" ;
      AV66Recetasdeacabado02_wpds_4_tfproforcod_sel = "" ;
      AV67Recetasdeacabado02_wpds_5_tfprofordsc = "" ;
      AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel = "" ;
      AV71Recetasdeacabado02_wpds_9_tfrecprdnum = "" ;
      AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel = "" ;
      AV73Recetasdeacabado02_wpds_11_tfrecprddsc = "" ;
      AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel = "" ;
      AV75Recetasdeacabado02_wpds_13_tffaccon = DecimalUtil.ZERO ;
      AV76Recetasdeacabado02_wpds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV77Recetasdeacabado02_wpds_15_tfprdcant = DecimalUtil.ZERO ;
      AV78Recetasdeacabado02_wpds_16_tfprdcant_to = DecimalUtil.ZERO ;
      AV79Recetasdeacabado02_wpds_17_tfforprddsc = "" ;
      AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel = "" ;
      AV85Recetasdeacabado02_wpds_23_tfreclote = "" ;
      AV86Recetasdeacabado02_wpds_24_tfreclote_sel = "" ;
      scmdbuf = "" ;
      lV65Recetasdeacabado02_wpds_3_tfproforcod = "" ;
      lV67Recetasdeacabado02_wpds_5_tfprofordsc = "" ;
      lV71Recetasdeacabado02_wpds_9_tfrecprdnum = "" ;
      lV73Recetasdeacabado02_wpds_11_tfrecprddsc = "" ;
      lV79Recetasdeacabado02_wpds_17_tfforprddsc = "" ;
      lV85Recetasdeacabado02_wpds_23_tfreclote = "" ;
      A766ProForDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A396EmprCod = "" ;
      AV54Emprcod = "" ;
      A130BarCodPar = "" ;
      AV57Barcodpar = "" ;
      P09BI2_A490ForPrdUMe = new byte[1] ;
      P09BI2_n490ForPrdUMe = new boolean[] {false} ;
      P09BI2_A396EmprCod = new String[] {""} ;
      P09BI2_A129BarCod = new int[1] ;
      P09BI2_A132BarCodReo = new byte[1] ;
      P09BI2_A130BarCodPar = new String[] {""} ;
      P09BI2_A2804RecLinMaq = new short[1] ;
      P09BI2_A764ProForCod = new String[] {""} ;
      P09BI2_A5725RecLote = new String[] {""} ;
      P09BI2_A3274RecPrdTnq = new byte[1] ;
      P09BI2_A2394RecForNro = new byte[1] ;
      P09BI2_A488ForPrdDsc = new String[] {""} ;
      P09BI2_n488ForPrdDsc = new boolean[] {false} ;
      P09BI2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI2_A875RecPrdDsc = new String[] {""} ;
      P09BI2_A872RecPrdNum = new String[] {""} ;
      P09BI2_A811RecLin = new short[1] ;
      P09BI2_A766ProForDsc = new String[] {""} ;
      P09BI2_A1273RecLinPro = new byte[1] ;
      AV40Option = "" ;
      P09BI3_A490ForPrdUMe = new byte[1] ;
      P09BI3_n490ForPrdUMe = new boolean[] {false} ;
      P09BI3_A396EmprCod = new String[] {""} ;
      P09BI3_A129BarCod = new int[1] ;
      P09BI3_A132BarCodReo = new byte[1] ;
      P09BI3_A130BarCodPar = new String[] {""} ;
      P09BI3_A2804RecLinMaq = new short[1] ;
      P09BI3_A766ProForDsc = new String[] {""} ;
      P09BI3_A5725RecLote = new String[] {""} ;
      P09BI3_A3274RecPrdTnq = new byte[1] ;
      P09BI3_A2394RecForNro = new byte[1] ;
      P09BI3_A488ForPrdDsc = new String[] {""} ;
      P09BI3_n488ForPrdDsc = new boolean[] {false} ;
      P09BI3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI3_A875RecPrdDsc = new String[] {""} ;
      P09BI3_A872RecPrdNum = new String[] {""} ;
      P09BI3_A811RecLin = new short[1] ;
      P09BI3_A764ProForCod = new String[] {""} ;
      P09BI3_A1273RecLinPro = new byte[1] ;
      P09BI4_A490ForPrdUMe = new byte[1] ;
      P09BI4_n490ForPrdUMe = new boolean[] {false} ;
      P09BI4_A396EmprCod = new String[] {""} ;
      P09BI4_A129BarCod = new int[1] ;
      P09BI4_A132BarCodReo = new byte[1] ;
      P09BI4_A130BarCodPar = new String[] {""} ;
      P09BI4_A2804RecLinMaq = new short[1] ;
      P09BI4_A872RecPrdNum = new String[] {""} ;
      P09BI4_A5725RecLote = new String[] {""} ;
      P09BI4_A3274RecPrdTnq = new byte[1] ;
      P09BI4_A2394RecForNro = new byte[1] ;
      P09BI4_A488ForPrdDsc = new String[] {""} ;
      P09BI4_n488ForPrdDsc = new boolean[] {false} ;
      P09BI4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI4_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI4_A875RecPrdDsc = new String[] {""} ;
      P09BI4_A811RecLin = new short[1] ;
      P09BI4_A766ProForDsc = new String[] {""} ;
      P09BI4_A764ProForCod = new String[] {""} ;
      P09BI4_A1273RecLinPro = new byte[1] ;
      P09BI5_A490ForPrdUMe = new byte[1] ;
      P09BI5_n490ForPrdUMe = new boolean[] {false} ;
      P09BI5_A396EmprCod = new String[] {""} ;
      P09BI5_A129BarCod = new int[1] ;
      P09BI5_A132BarCodReo = new byte[1] ;
      P09BI5_A130BarCodPar = new String[] {""} ;
      P09BI5_A2804RecLinMaq = new short[1] ;
      P09BI5_A875RecPrdDsc = new String[] {""} ;
      P09BI5_A5725RecLote = new String[] {""} ;
      P09BI5_A3274RecPrdTnq = new byte[1] ;
      P09BI5_A2394RecForNro = new byte[1] ;
      P09BI5_A488ForPrdDsc = new String[] {""} ;
      P09BI5_n488ForPrdDsc = new boolean[] {false} ;
      P09BI5_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI5_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI5_A872RecPrdNum = new String[] {""} ;
      P09BI5_A811RecLin = new short[1] ;
      P09BI5_A766ProForDsc = new String[] {""} ;
      P09BI5_A764ProForCod = new String[] {""} ;
      P09BI5_A1273RecLinPro = new byte[1] ;
      P09BI6_A490ForPrdUMe = new byte[1] ;
      P09BI6_n490ForPrdUMe = new boolean[] {false} ;
      P09BI6_A396EmprCod = new String[] {""} ;
      P09BI6_A2804RecLinMaq = new short[1] ;
      P09BI6_A130BarCodPar = new String[] {""} ;
      P09BI6_A132BarCodReo = new byte[1] ;
      P09BI6_A129BarCod = new int[1] ;
      P09BI6_A5725RecLote = new String[] {""} ;
      P09BI6_A3274RecPrdTnq = new byte[1] ;
      P09BI6_A2394RecForNro = new byte[1] ;
      P09BI6_A488ForPrdDsc = new String[] {""} ;
      P09BI6_n488ForPrdDsc = new boolean[] {false} ;
      P09BI6_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI6_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI6_A875RecPrdDsc = new String[] {""} ;
      P09BI6_A872RecPrdNum = new String[] {""} ;
      P09BI6_A811RecLin = new short[1] ;
      P09BI6_A766ProForDsc = new String[] {""} ;
      P09BI6_A764ProForCod = new String[] {""} ;
      P09BI6_A1273RecLinPro = new byte[1] ;
      P09BI7_A490ForPrdUMe = new byte[1] ;
      P09BI7_n490ForPrdUMe = new boolean[] {false} ;
      P09BI7_A396EmprCod = new String[] {""} ;
      P09BI7_A129BarCod = new int[1] ;
      P09BI7_A132BarCodReo = new byte[1] ;
      P09BI7_A130BarCodPar = new String[] {""} ;
      P09BI7_A2804RecLinMaq = new short[1] ;
      P09BI7_A5725RecLote = new String[] {""} ;
      P09BI7_A3274RecPrdTnq = new byte[1] ;
      P09BI7_A2394RecForNro = new byte[1] ;
      P09BI7_A488ForPrdDsc = new String[] {""} ;
      P09BI7_n488ForPrdDsc = new boolean[] {false} ;
      P09BI7_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI7_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BI7_A875RecPrdDsc = new String[] {""} ;
      P09BI7_A872RecPrdNum = new String[] {""} ;
      P09BI7_A811RecLin = new short[1] ;
      P09BI7_A766ProForDsc = new String[] {""} ;
      P09BI7_A764ProForCod = new String[] {""} ;
      P09BI7_A1273RecLinPro = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado02_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09BI2_A490ForPrdUMe, P09BI2_n490ForPrdUMe, P09BI2_A396EmprCod, P09BI2_A129BarCod, P09BI2_A132BarCodReo, P09BI2_A130BarCodPar, P09BI2_A2804RecLinMaq, P09BI2_A764ProForCod, P09BI2_A5725RecLote, P09BI2_A3274RecPrdTnq,
            P09BI2_A2394RecForNro, P09BI2_A488ForPrdDsc, P09BI2_n488ForPrdDsc, P09BI2_A686PrdCant, P09BI2_A431FacCon, P09BI2_A875RecPrdDsc, P09BI2_A872RecPrdNum, P09BI2_A811RecLin, P09BI2_A766ProForDsc, P09BI2_A1273RecLinPro
            }
            , new Object[] {
            P09BI3_A490ForPrdUMe, P09BI3_n490ForPrdUMe, P09BI3_A396EmprCod, P09BI3_A129BarCod, P09BI3_A132BarCodReo, P09BI3_A130BarCodPar, P09BI3_A2804RecLinMaq, P09BI3_A766ProForDsc, P09BI3_A5725RecLote, P09BI3_A3274RecPrdTnq,
            P09BI3_A2394RecForNro, P09BI3_A488ForPrdDsc, P09BI3_n488ForPrdDsc, P09BI3_A686PrdCant, P09BI3_A431FacCon, P09BI3_A875RecPrdDsc, P09BI3_A872RecPrdNum, P09BI3_A811RecLin, P09BI3_A764ProForCod, P09BI3_A1273RecLinPro
            }
            , new Object[] {
            P09BI4_A490ForPrdUMe, P09BI4_n490ForPrdUMe, P09BI4_A396EmprCod, P09BI4_A129BarCod, P09BI4_A132BarCodReo, P09BI4_A130BarCodPar, P09BI4_A2804RecLinMaq, P09BI4_A872RecPrdNum, P09BI4_A5725RecLote, P09BI4_A3274RecPrdTnq,
            P09BI4_A2394RecForNro, P09BI4_A488ForPrdDsc, P09BI4_n488ForPrdDsc, P09BI4_A686PrdCant, P09BI4_A431FacCon, P09BI4_A875RecPrdDsc, P09BI4_A811RecLin, P09BI4_A766ProForDsc, P09BI4_A764ProForCod, P09BI4_A1273RecLinPro
            }
            , new Object[] {
            P09BI5_A490ForPrdUMe, P09BI5_n490ForPrdUMe, P09BI5_A396EmprCod, P09BI5_A129BarCod, P09BI5_A132BarCodReo, P09BI5_A130BarCodPar, P09BI5_A2804RecLinMaq, P09BI5_A875RecPrdDsc, P09BI5_A5725RecLote, P09BI5_A3274RecPrdTnq,
            P09BI5_A2394RecForNro, P09BI5_A488ForPrdDsc, P09BI5_n488ForPrdDsc, P09BI5_A686PrdCant, P09BI5_A431FacCon, P09BI5_A872RecPrdNum, P09BI5_A811RecLin, P09BI5_A766ProForDsc, P09BI5_A764ProForCod, P09BI5_A1273RecLinPro
            }
            , new Object[] {
            P09BI6_A490ForPrdUMe, P09BI6_n490ForPrdUMe, P09BI6_A396EmprCod, P09BI6_A2804RecLinMaq, P09BI6_A130BarCodPar, P09BI6_A132BarCodReo, P09BI6_A129BarCod, P09BI6_A5725RecLote, P09BI6_A3274RecPrdTnq, P09BI6_A2394RecForNro,
            P09BI6_A488ForPrdDsc, P09BI6_n488ForPrdDsc, P09BI6_A686PrdCant, P09BI6_A431FacCon, P09BI6_A875RecPrdDsc, P09BI6_A872RecPrdNum, P09BI6_A811RecLin, P09BI6_A766ProForDsc, P09BI6_A764ProForCod, P09BI6_A1273RecLinPro
            }
            , new Object[] {
            P09BI7_A490ForPrdUMe, P09BI7_n490ForPrdUMe, P09BI7_A396EmprCod, P09BI7_A129BarCod, P09BI7_A132BarCodReo, P09BI7_A130BarCodPar, P09BI7_A2804RecLinMaq, P09BI7_A5725RecLote, P09BI7_A3274RecPrdTnq, P09BI7_A2394RecForNro,
            P09BI7_A488ForPrdDsc, P09BI7_n488ForPrdDsc, P09BI7_A686PrdCant, P09BI7_A431FacCon, P09BI7_A875RecPrdDsc, P09BI7_A872RecPrdNum, P09BI7_A811RecLin, P09BI7_A766ProForDsc, P09BI7_A764ProForCod, P09BI7_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV28TFRecForNro ;
   private byte AV29TFRecForNro_To ;
   private byte AV30TFRecPrdTnq ;
   private byte AV31TFRecPrdTnq_To ;
   private byte AV63Recetasdeacabado02_wpds_1_tfreclinpro ;
   private byte AV64Recetasdeacabado02_wpds_2_tfreclinpro_to ;
   private byte AV81Recetasdeacabado02_wpds_19_tfrecfornro ;
   private byte AV82Recetasdeacabado02_wpds_20_tfrecfornro_to ;
   private byte AV83Recetasdeacabado02_wpds_21_tfrecprdtnq ;
   private byte AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A132BarCodReo ;
   private byte AV56Barcodreo ;
   private byte A490ForPrdUMe ;
   private short AV16TFRecLin ;
   private short AV17TFRecLin_To ;
   private short AV69Recetasdeacabado02_wpds_7_tfreclin ;
   private short AV70Recetasdeacabado02_wpds_8_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short AV58RecLinMaq ;
   private short Gx_err ;
   private int AV61GXV1 ;
   private int A129BarCod ;
   private int AV55Barcod ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private java.math.BigDecimal AV22TFFacCon ;
   private java.math.BigDecimal AV23TFFacCon_To ;
   private java.math.BigDecimal AV24TFPrdCant ;
   private java.math.BigDecimal AV25TFPrdCant_To ;
   private java.math.BigDecimal AV75Recetasdeacabado02_wpds_13_tffaccon ;
   private java.math.BigDecimal AV76Recetasdeacabado02_wpds_14_tffaccon_to ;
   private java.math.BigDecimal AV77Recetasdeacabado02_wpds_15_tfprdcant ;
   private java.math.BigDecimal AV78Recetasdeacabado02_wpds_16_tfprdcant_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV12TFProForCod ;
   private String AV13TFProForCod_Sel ;
   private String AV14TFProForDsc ;
   private String AV15TFProForDsc_Sel ;
   private String AV18TFRecPrdNum ;
   private String AV19TFRecPrdNum_Sel ;
   private String AV20TFRecPrdDsc ;
   private String AV21TFRecPrdDsc_Sel ;
   private String AV26TFForPrdDsc ;
   private String AV27TFForPrdDsc_Sel ;
   private String AV32TFRecLote ;
   private String AV33TFRecLote_Sel ;
   private String A764ProForCod ;
   private String AV65Recetasdeacabado02_wpds_3_tfproforcod ;
   private String AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ;
   private String AV67Recetasdeacabado02_wpds_5_tfprofordsc ;
   private String AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ;
   private String AV71Recetasdeacabado02_wpds_9_tfrecprdnum ;
   private String AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ;
   private String AV73Recetasdeacabado02_wpds_11_tfrecprddsc ;
   private String AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ;
   private String AV79Recetasdeacabado02_wpds_17_tfforprddsc ;
   private String AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ;
   private String AV85Recetasdeacabado02_wpds_23_tfreclote ;
   private String AV86Recetasdeacabado02_wpds_24_tfreclote_sel ;
   private String scmdbuf ;
   private String lV65Recetasdeacabado02_wpds_3_tfproforcod ;
   private String lV67Recetasdeacabado02_wpds_5_tfprofordsc ;
   private String lV71Recetasdeacabado02_wpds_9_tfrecprdnum ;
   private String lV73Recetasdeacabado02_wpds_11_tfrecprddsc ;
   private String lV79Recetasdeacabado02_wpds_17_tfforprddsc ;
   private String lV85Recetasdeacabado02_wpds_23_tfreclote ;
   private String A766ProForDsc ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A396EmprCod ;
   private String AV54Emprcod ;
   private String A130BarCodPar ;
   private String AV57Barcodpar ;
   private boolean returnInSub ;
   private boolean brk9BI2 ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean brk9BI4 ;
   private boolean brk9BI6 ;
   private boolean brk9BI8 ;
   private boolean brk9BI10 ;
   private boolean brk9BI12 ;
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
   private byte[] P09BI2_A490ForPrdUMe ;
   private boolean[] P09BI2_n490ForPrdUMe ;
   private String[] P09BI2_A396EmprCod ;
   private int[] P09BI2_A129BarCod ;
   private byte[] P09BI2_A132BarCodReo ;
   private String[] P09BI2_A130BarCodPar ;
   private short[] P09BI2_A2804RecLinMaq ;
   private String[] P09BI2_A764ProForCod ;
   private String[] P09BI2_A5725RecLote ;
   private byte[] P09BI2_A3274RecPrdTnq ;
   private byte[] P09BI2_A2394RecForNro ;
   private String[] P09BI2_A488ForPrdDsc ;
   private boolean[] P09BI2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09BI2_A686PrdCant ;
   private java.math.BigDecimal[] P09BI2_A431FacCon ;
   private String[] P09BI2_A875RecPrdDsc ;
   private String[] P09BI2_A872RecPrdNum ;
   private short[] P09BI2_A811RecLin ;
   private String[] P09BI2_A766ProForDsc ;
   private byte[] P09BI2_A1273RecLinPro ;
   private byte[] P09BI3_A490ForPrdUMe ;
   private boolean[] P09BI3_n490ForPrdUMe ;
   private String[] P09BI3_A396EmprCod ;
   private int[] P09BI3_A129BarCod ;
   private byte[] P09BI3_A132BarCodReo ;
   private String[] P09BI3_A130BarCodPar ;
   private short[] P09BI3_A2804RecLinMaq ;
   private String[] P09BI3_A766ProForDsc ;
   private String[] P09BI3_A5725RecLote ;
   private byte[] P09BI3_A3274RecPrdTnq ;
   private byte[] P09BI3_A2394RecForNro ;
   private String[] P09BI3_A488ForPrdDsc ;
   private boolean[] P09BI3_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09BI3_A686PrdCant ;
   private java.math.BigDecimal[] P09BI3_A431FacCon ;
   private String[] P09BI3_A875RecPrdDsc ;
   private String[] P09BI3_A872RecPrdNum ;
   private short[] P09BI3_A811RecLin ;
   private String[] P09BI3_A764ProForCod ;
   private byte[] P09BI3_A1273RecLinPro ;
   private byte[] P09BI4_A490ForPrdUMe ;
   private boolean[] P09BI4_n490ForPrdUMe ;
   private String[] P09BI4_A396EmprCod ;
   private int[] P09BI4_A129BarCod ;
   private byte[] P09BI4_A132BarCodReo ;
   private String[] P09BI4_A130BarCodPar ;
   private short[] P09BI4_A2804RecLinMaq ;
   private String[] P09BI4_A872RecPrdNum ;
   private String[] P09BI4_A5725RecLote ;
   private byte[] P09BI4_A3274RecPrdTnq ;
   private byte[] P09BI4_A2394RecForNro ;
   private String[] P09BI4_A488ForPrdDsc ;
   private boolean[] P09BI4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09BI4_A686PrdCant ;
   private java.math.BigDecimal[] P09BI4_A431FacCon ;
   private String[] P09BI4_A875RecPrdDsc ;
   private short[] P09BI4_A811RecLin ;
   private String[] P09BI4_A766ProForDsc ;
   private String[] P09BI4_A764ProForCod ;
   private byte[] P09BI4_A1273RecLinPro ;
   private byte[] P09BI5_A490ForPrdUMe ;
   private boolean[] P09BI5_n490ForPrdUMe ;
   private String[] P09BI5_A396EmprCod ;
   private int[] P09BI5_A129BarCod ;
   private byte[] P09BI5_A132BarCodReo ;
   private String[] P09BI5_A130BarCodPar ;
   private short[] P09BI5_A2804RecLinMaq ;
   private String[] P09BI5_A875RecPrdDsc ;
   private String[] P09BI5_A5725RecLote ;
   private byte[] P09BI5_A3274RecPrdTnq ;
   private byte[] P09BI5_A2394RecForNro ;
   private String[] P09BI5_A488ForPrdDsc ;
   private boolean[] P09BI5_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09BI5_A686PrdCant ;
   private java.math.BigDecimal[] P09BI5_A431FacCon ;
   private String[] P09BI5_A872RecPrdNum ;
   private short[] P09BI5_A811RecLin ;
   private String[] P09BI5_A766ProForDsc ;
   private String[] P09BI5_A764ProForCod ;
   private byte[] P09BI5_A1273RecLinPro ;
   private byte[] P09BI6_A490ForPrdUMe ;
   private boolean[] P09BI6_n490ForPrdUMe ;
   private String[] P09BI6_A396EmprCod ;
   private short[] P09BI6_A2804RecLinMaq ;
   private String[] P09BI6_A130BarCodPar ;
   private byte[] P09BI6_A132BarCodReo ;
   private int[] P09BI6_A129BarCod ;
   private String[] P09BI6_A5725RecLote ;
   private byte[] P09BI6_A3274RecPrdTnq ;
   private byte[] P09BI6_A2394RecForNro ;
   private String[] P09BI6_A488ForPrdDsc ;
   private boolean[] P09BI6_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09BI6_A686PrdCant ;
   private java.math.BigDecimal[] P09BI6_A431FacCon ;
   private String[] P09BI6_A875RecPrdDsc ;
   private String[] P09BI6_A872RecPrdNum ;
   private short[] P09BI6_A811RecLin ;
   private String[] P09BI6_A766ProForDsc ;
   private String[] P09BI6_A764ProForCod ;
   private byte[] P09BI6_A1273RecLinPro ;
   private byte[] P09BI7_A490ForPrdUMe ;
   private boolean[] P09BI7_n490ForPrdUMe ;
   private String[] P09BI7_A396EmprCod ;
   private int[] P09BI7_A129BarCod ;
   private byte[] P09BI7_A132BarCodReo ;
   private String[] P09BI7_A130BarCodPar ;
   private short[] P09BI7_A2804RecLinMaq ;
   private String[] P09BI7_A5725RecLote ;
   private byte[] P09BI7_A3274RecPrdTnq ;
   private byte[] P09BI7_A2394RecForNro ;
   private String[] P09BI7_A488ForPrdDsc ;
   private boolean[] P09BI7_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09BI7_A686PrdCant ;
   private java.math.BigDecimal[] P09BI7_A431FacCon ;
   private String[] P09BI7_A875RecPrdDsc ;
   private String[] P09BI7_A872RecPrdNum ;
   private short[] P09BI7_A811RecLin ;
   private String[] P09BI7_A766ProForDsc ;
   private String[] P09BI7_A764ProForCod ;
   private byte[] P09BI7_A1273RecLinPro ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class recetasdeacabado02_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV64Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV69Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV70Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV81Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV82Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV83Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV54Emprcod ,
                                          int A129BarCod ,
                                          int AV55Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV56Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV57Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV58RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T3.ProForCod, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09BI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV64Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV69Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV70Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV81Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV82Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV83Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV54Emprcod ,
                                          int A129BarCod ,
                                          int AV55Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV56Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV57Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV58RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T4.ProForDsc, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T4.ProForDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09BI4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV64Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV69Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV70Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV81Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV82Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV83Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV54Emprcod ,
                                          int A129BarCod ,
                                          int AV55Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV56Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV57Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV58RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdDsc, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09BI5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV64Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV69Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV70Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV81Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV82Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV83Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV54Emprcod ,
                                          int A129BarCod ,
                                          int AV55Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV56Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV57Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV58RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant," ;
      scmdbuf += " T1.FacCon, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecPrdDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09BI6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV64Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV69Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV70Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV81Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV82Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV83Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          int A129BarCod ,
                                          int AV55Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV56Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV57Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV58RecLinMaq ,
                                          String AV54Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[29];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant, T1.FacCon," ;
      scmdbuf += " T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09BI7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV63Recetasdeacabado02_wpds_1_tfreclinpro ,
                                          byte AV64Recetasdeacabado02_wpds_2_tfreclinpro_to ,
                                          String AV66Recetasdeacabado02_wpds_4_tfproforcod_sel ,
                                          String AV65Recetasdeacabado02_wpds_3_tfproforcod ,
                                          String AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel ,
                                          String AV67Recetasdeacabado02_wpds_5_tfprofordsc ,
                                          short AV69Recetasdeacabado02_wpds_7_tfreclin ,
                                          short AV70Recetasdeacabado02_wpds_8_tfreclin_to ,
                                          String AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel ,
                                          String AV71Recetasdeacabado02_wpds_9_tfrecprdnum ,
                                          String AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel ,
                                          String AV73Recetasdeacabado02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV75Recetasdeacabado02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV76Recetasdeacabado02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV77Recetasdeacabado02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV78Recetasdeacabado02_wpds_16_tfprdcant_to ,
                                          String AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel ,
                                          String AV79Recetasdeacabado02_wpds_17_tfforprddsc ,
                                          byte AV81Recetasdeacabado02_wpds_19_tfrecfornro ,
                                          byte AV82Recetasdeacabado02_wpds_20_tfrecfornro_to ,
                                          byte AV83Recetasdeacabado02_wpds_21_tfrecprdtnq ,
                                          byte AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to ,
                                          String AV86Recetasdeacabado02_wpds_24_tfreclote_sel ,
                                          String AV85Recetasdeacabado02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          String A396EmprCod ,
                                          String AV54Emprcod ,
                                          int A129BarCod ,
                                          int AV55Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV56Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV57Barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV58RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[29];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T2.ForPrdDsc, T1.PrdCant, T1.FacCon," ;
      scmdbuf += " T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T4.ProForDsc, T3.ProForCod, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND" ;
      scmdbuf += " T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV63Recetasdeacabado02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV64Recetasdeacabado02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProForCod = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Recetasdeacabado02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Recetasdeacabado02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV69Recetasdeacabado02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV70Recetasdeacabado02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Recetasdeacabado02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Recetasdeacabado02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Recetasdeacabado02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Recetasdeacabado02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Recetasdeacabado02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Recetasdeacabado02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Recetasdeacabado02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Recetasdeacabado02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Recetasdeacabado02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV81Recetasdeacabado02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV84Recetasdeacabado02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecLote" ;
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
                  return conditional_P09BI2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 1 :
                  return conditional_P09BI3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 2 :
                  return conditional_P09BI4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 3 :
                  return conditional_P09BI5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
            case 4 :
                  return conditional_P09BI6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] );
            case 5 :
                  return conditional_P09BI7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BI4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BI5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BI6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BI7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
            case 3 :
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
            case 4 :
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
            case 5 :
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
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
      }
   }

}

