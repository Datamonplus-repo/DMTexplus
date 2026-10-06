package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpwincrecgetfilterdata extends GXProcedure
{
   public wpwincrecgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpwincrecgetfilterdata.class ), "" );
   }

   public wpwincrecgetfilterdata( int remoteHandle ,
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
      wpwincrecgetfilterdata.this.aP5 = new String[] {""};
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
      wpwincrecgetfilterdata.this.AV34DDOName = aP0;
      wpwincrecgetfilterdata.this.AV32SearchTxt = aP1;
      wpwincrecgetfilterdata.this.AV33SearchTxtTo = aP2;
      wpwincrecgetfilterdata.this.aP3 = aP3;
      wpwincrecgetfilterdata.this.aP4 = aP4;
      wpwincrecgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_RECPRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_RECPRDDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_FORPRDDSC") == 0 )
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
      AV38OptionsJson = AV37Options.toJSonString(false) ;
      AV41OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV42OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue("WpWincrecGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WpWincrecGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV45Session.getValue("WpWincrecGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV10TFRecLinPro = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRecLinPro_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV12TFRecLin = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFRecLin_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV14TFRecPrdNum = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV15TFRecPrdNum_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV16TFRecPrdDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV17TFRecPrdDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV18TFForPrdDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV19TFForPrdDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV20TFFacCon = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFFacCon_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV22TFPrdExiAlm = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFPrdExiAlm_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV24TFPrdCanRes = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPrdCanRes_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV26TFPrdCanPen = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFPrdCanPen_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDSTKMINU") == 0 )
         {
            AV28TFPrdStkMinU = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFPrdStkMinU_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV30TFPrdFacCon = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFPrdFacCon_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRECPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFRecPrdNum = AV32SearchTxt ;
      AV15TFRecPrdNum_Sel = "" ;
      AV55Core_wpwincrecds_1_filterfulltext = AV50FilterFullText ;
      AV56Core_wpwincrecds_2_tfreclinpro = AV10TFRecLinPro ;
      AV57Core_wpwincrecds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV58Core_wpwincrecds_4_tfreclin = AV12TFRecLin ;
      AV59Core_wpwincrecds_5_tfreclin_to = AV13TFRecLin_To ;
      AV60Core_wpwincrecds_6_tfrecprdnum = AV14TFRecPrdNum ;
      AV61Core_wpwincrecds_7_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV62Core_wpwincrecds_8_tfrecprddsc = AV16TFRecPrdDsc ;
      AV63Core_wpwincrecds_9_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV64Core_wpwincrecds_10_tfforprddsc = AV18TFForPrdDsc ;
      AV65Core_wpwincrecds_11_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Core_wpwincrecds_12_tffaccon = AV20TFFacCon ;
      AV67Core_wpwincrecds_13_tffaccon_to = AV21TFFacCon_To ;
      AV68Core_wpwincrecds_14_tfprdexialm = AV22TFPrdExiAlm ;
      AV69Core_wpwincrecds_15_tfprdexialm_to = AV23TFPrdExiAlm_To ;
      AV70Core_wpwincrecds_16_tfprdcanres = AV24TFPrdCanRes ;
      AV71Core_wpwincrecds_17_tfprdcanres_to = AV25TFPrdCanRes_To ;
      AV72Core_wpwincrecds_18_tfprdcanpen = AV26TFPrdCanPen ;
      AV73Core_wpwincrecds_19_tfprdcanpen_to = AV27TFPrdCanPen_To ;
      AV74Core_wpwincrecds_20_tfprdstkminu = AV28TFPrdStkMinU ;
      AV75Core_wpwincrecds_21_tfprdstkminu_to = AV29TFPrdStkMinU_To ;
      AV76Core_wpwincrecds_22_tfprdfaccon = AV30TFPrdFacCon ;
      AV77Core_wpwincrecds_23_tfprdfaccon_to = AV31TFPrdFacCon_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Core_wpwincrecds_1_filterfulltext ,
                                           Byte.valueOf(AV56Core_wpwincrecds_2_tfreclinpro) ,
                                           Byte.valueOf(AV57Core_wpwincrecds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV58Core_wpwincrecds_4_tfreclin) ,
                                           Short.valueOf(AV59Core_wpwincrecds_5_tfreclin_to) ,
                                           AV61Core_wpwincrecds_7_tfrecprdnum_sel ,
                                           AV60Core_wpwincrecds_6_tfrecprdnum ,
                                           AV63Core_wpwincrecds_9_tfrecprddsc_sel ,
                                           AV62Core_wpwincrecds_8_tfrecprddsc ,
                                           AV65Core_wpwincrecds_11_tfforprddsc_sel ,
                                           AV64Core_wpwincrecds_10_tfforprddsc ,
                                           AV66Core_wpwincrecds_12_tffaccon ,
                                           AV67Core_wpwincrecds_13_tffaccon_to ,
                                           AV68Core_wpwincrecds_14_tfprdexialm ,
                                           AV69Core_wpwincrecds_15_tfprdexialm_to ,
                                           AV70Core_wpwincrecds_16_tfprdcanres ,
                                           AV71Core_wpwincrecds_17_tfprdcanres_to ,
                                           AV72Core_wpwincrecds_18_tfprdcanpen ,
                                           AV73Core_wpwincrecds_19_tfprdcanpen_to ,
                                           AV74Core_wpwincrecds_20_tfprdstkminu ,
                                           AV75Core_wpwincrecds_21_tfprdstkminu_to ,
                                           AV76Core_wpwincrecds_22_tfprdfaccon ,
                                           AV77Core_wpwincrecds_23_tfprdfaccon_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A732PrdStkMinU ,
                                           A707PrdFacCon } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      /* Using cursor P08SX2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV56Core_wpwincrecds_2_tfreclinpro), Byte.valueOf(AV57Core_wpwincrecds_3_tfreclinpro_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8SX2 = false ;
         A1273RecLinPro = P08SX2_A1273RecLinPro[0] ;
         A396EmprCod = P08SX2_A396EmprCod[0] ;
         A129BarCod = P08SX2_A129BarCod[0] ;
         A132BarCodReo = P08SX2_A132BarCodReo[0] ;
         A130BarCodPar = P08SX2_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SX2_A2804RecLinMaq[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk8SX2 = false ;
            A1273RecLinPro = P08SX2_A1273RecLinPro[0] ;
            A396EmprCod = P08SX2_A396EmprCod[0] ;
            A129BarCod = P08SX2_A129BarCod[0] ;
            A132BarCodReo = P08SX2_A132BarCodReo[0] ;
            A130BarCodPar = P08SX2_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SX2_A2804RecLinMaq[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8SX2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A872RecPrdNum)==0) )
         {
            AV36Option = A872RecPrdNum ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SX2 )
         {
            brk8SX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADRECPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFRecPrdDsc = AV32SearchTxt ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV55Core_wpwincrecds_1_filterfulltext = AV50FilterFullText ;
      AV56Core_wpwincrecds_2_tfreclinpro = AV10TFRecLinPro ;
      AV57Core_wpwincrecds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV58Core_wpwincrecds_4_tfreclin = AV12TFRecLin ;
      AV59Core_wpwincrecds_5_tfreclin_to = AV13TFRecLin_To ;
      AV60Core_wpwincrecds_6_tfrecprdnum = AV14TFRecPrdNum ;
      AV61Core_wpwincrecds_7_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV62Core_wpwincrecds_8_tfrecprddsc = AV16TFRecPrdDsc ;
      AV63Core_wpwincrecds_9_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV64Core_wpwincrecds_10_tfforprddsc = AV18TFForPrdDsc ;
      AV65Core_wpwincrecds_11_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Core_wpwincrecds_12_tffaccon = AV20TFFacCon ;
      AV67Core_wpwincrecds_13_tffaccon_to = AV21TFFacCon_To ;
      AV68Core_wpwincrecds_14_tfprdexialm = AV22TFPrdExiAlm ;
      AV69Core_wpwincrecds_15_tfprdexialm_to = AV23TFPrdExiAlm_To ;
      AV70Core_wpwincrecds_16_tfprdcanres = AV24TFPrdCanRes ;
      AV71Core_wpwincrecds_17_tfprdcanres_to = AV25TFPrdCanRes_To ;
      AV72Core_wpwincrecds_18_tfprdcanpen = AV26TFPrdCanPen ;
      AV73Core_wpwincrecds_19_tfprdcanpen_to = AV27TFPrdCanPen_To ;
      AV74Core_wpwincrecds_20_tfprdstkminu = AV28TFPrdStkMinU ;
      AV75Core_wpwincrecds_21_tfprdstkminu_to = AV29TFPrdStkMinU_To ;
      AV76Core_wpwincrecds_22_tfprdfaccon = AV30TFPrdFacCon ;
      AV77Core_wpwincrecds_23_tfprdfaccon_to = AV31TFPrdFacCon_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Core_wpwincrecds_1_filterfulltext ,
                                           Byte.valueOf(AV56Core_wpwincrecds_2_tfreclinpro) ,
                                           Byte.valueOf(AV57Core_wpwincrecds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV58Core_wpwincrecds_4_tfreclin) ,
                                           Short.valueOf(AV59Core_wpwincrecds_5_tfreclin_to) ,
                                           AV61Core_wpwincrecds_7_tfrecprdnum_sel ,
                                           AV60Core_wpwincrecds_6_tfrecprdnum ,
                                           AV63Core_wpwincrecds_9_tfrecprddsc_sel ,
                                           AV62Core_wpwincrecds_8_tfrecprddsc ,
                                           AV65Core_wpwincrecds_11_tfforprddsc_sel ,
                                           AV64Core_wpwincrecds_10_tfforprddsc ,
                                           AV66Core_wpwincrecds_12_tffaccon ,
                                           AV67Core_wpwincrecds_13_tffaccon_to ,
                                           AV68Core_wpwincrecds_14_tfprdexialm ,
                                           AV69Core_wpwincrecds_15_tfprdexialm_to ,
                                           AV70Core_wpwincrecds_16_tfprdcanres ,
                                           AV71Core_wpwincrecds_17_tfprdcanres_to ,
                                           AV72Core_wpwincrecds_18_tfprdcanpen ,
                                           AV73Core_wpwincrecds_19_tfprdcanpen_to ,
                                           AV74Core_wpwincrecds_20_tfprdstkminu ,
                                           AV75Core_wpwincrecds_21_tfprdstkminu_to ,
                                           AV76Core_wpwincrecds_22_tfprdfaccon ,
                                           AV77Core_wpwincrecds_23_tfprdfaccon_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A732PrdStkMinU ,
                                           A707PrdFacCon } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      /* Using cursor P08SX3 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV56Core_wpwincrecds_2_tfreclinpro), Byte.valueOf(AV57Core_wpwincrecds_3_tfreclinpro_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8SX4 = false ;
         A1273RecLinPro = P08SX3_A1273RecLinPro[0] ;
         A396EmprCod = P08SX3_A396EmprCod[0] ;
         A129BarCod = P08SX3_A129BarCod[0] ;
         A132BarCodReo = P08SX3_A132BarCodReo[0] ;
         A130BarCodPar = P08SX3_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SX3_A2804RecLinMaq[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk8SX4 = false ;
            A1273RecLinPro = P08SX3_A1273RecLinPro[0] ;
            A396EmprCod = P08SX3_A396EmprCod[0] ;
            A129BarCod = P08SX3_A129BarCod[0] ;
            A132BarCodReo = P08SX3_A132BarCodReo[0] ;
            A130BarCodPar = P08SX3_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SX3_A2804RecLinMaq[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8SX4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A875RecPrdDsc)==0) )
         {
            AV36Option = A875RecPrdDsc ;
            AV37Options.add(AV36Option, 0);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SX4 )
         {
            brk8SX4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForPrdDsc = AV32SearchTxt ;
      AV19TFForPrdDsc_Sel = "" ;
      AV55Core_wpwincrecds_1_filterfulltext = AV50FilterFullText ;
      AV56Core_wpwincrecds_2_tfreclinpro = AV10TFRecLinPro ;
      AV57Core_wpwincrecds_3_tfreclinpro_to = AV11TFRecLinPro_To ;
      AV58Core_wpwincrecds_4_tfreclin = AV12TFRecLin ;
      AV59Core_wpwincrecds_5_tfreclin_to = AV13TFRecLin_To ;
      AV60Core_wpwincrecds_6_tfrecprdnum = AV14TFRecPrdNum ;
      AV61Core_wpwincrecds_7_tfrecprdnum_sel = AV15TFRecPrdNum_Sel ;
      AV62Core_wpwincrecds_8_tfrecprddsc = AV16TFRecPrdDsc ;
      AV63Core_wpwincrecds_9_tfrecprddsc_sel = AV17TFRecPrdDsc_Sel ;
      AV64Core_wpwincrecds_10_tfforprddsc = AV18TFForPrdDsc ;
      AV65Core_wpwincrecds_11_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV66Core_wpwincrecds_12_tffaccon = AV20TFFacCon ;
      AV67Core_wpwincrecds_13_tffaccon_to = AV21TFFacCon_To ;
      AV68Core_wpwincrecds_14_tfprdexialm = AV22TFPrdExiAlm ;
      AV69Core_wpwincrecds_15_tfprdexialm_to = AV23TFPrdExiAlm_To ;
      AV70Core_wpwincrecds_16_tfprdcanres = AV24TFPrdCanRes ;
      AV71Core_wpwincrecds_17_tfprdcanres_to = AV25TFPrdCanRes_To ;
      AV72Core_wpwincrecds_18_tfprdcanpen = AV26TFPrdCanPen ;
      AV73Core_wpwincrecds_19_tfprdcanpen_to = AV27TFPrdCanPen_To ;
      AV74Core_wpwincrecds_20_tfprdstkminu = AV28TFPrdStkMinU ;
      AV75Core_wpwincrecds_21_tfprdstkminu_to = AV29TFPrdStkMinU_To ;
      AV76Core_wpwincrecds_22_tfprdfaccon = AV30TFPrdFacCon ;
      AV77Core_wpwincrecds_23_tfprdfaccon_to = AV31TFPrdFacCon_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV55Core_wpwincrecds_1_filterfulltext ,
                                           Byte.valueOf(AV56Core_wpwincrecds_2_tfreclinpro) ,
                                           Byte.valueOf(AV57Core_wpwincrecds_3_tfreclinpro_to) ,
                                           Short.valueOf(AV58Core_wpwincrecds_4_tfreclin) ,
                                           Short.valueOf(AV59Core_wpwincrecds_5_tfreclin_to) ,
                                           AV61Core_wpwincrecds_7_tfrecprdnum_sel ,
                                           AV60Core_wpwincrecds_6_tfrecprdnum ,
                                           AV63Core_wpwincrecds_9_tfrecprddsc_sel ,
                                           AV62Core_wpwincrecds_8_tfrecprddsc ,
                                           AV65Core_wpwincrecds_11_tfforprddsc_sel ,
                                           AV64Core_wpwincrecds_10_tfforprddsc ,
                                           AV66Core_wpwincrecds_12_tffaccon ,
                                           AV67Core_wpwincrecds_13_tffaccon_to ,
                                           AV68Core_wpwincrecds_14_tfprdexialm ,
                                           AV69Core_wpwincrecds_15_tfprdexialm_to ,
                                           AV70Core_wpwincrecds_16_tfprdcanres ,
                                           AV71Core_wpwincrecds_17_tfprdcanres_to ,
                                           AV72Core_wpwincrecds_18_tfprdcanpen ,
                                           AV73Core_wpwincrecds_19_tfprdcanpen_to ,
                                           AV74Core_wpwincrecds_20_tfprdstkminu ,
                                           AV75Core_wpwincrecds_21_tfprdstkminu_to ,
                                           AV76Core_wpwincrecds_22_tfprdfaccon ,
                                           AV77Core_wpwincrecds_23_tfprdfaccon_to ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A488ForPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A732PrdStkMinU ,
                                           A707PrdFacCon } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      /* Using cursor P08SX4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV56Core_wpwincrecds_2_tfreclinpro), Byte.valueOf(AV57Core_wpwincrecds_3_tfreclinpro_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8SX6 = false ;
         A396EmprCod = P08SX4_A396EmprCod[0] ;
         A1273RecLinPro = P08SX4_A1273RecLinPro[0] ;
         A129BarCod = P08SX4_A129BarCod[0] ;
         A132BarCodReo = P08SX4_A132BarCodReo[0] ;
         A130BarCodPar = P08SX4_A130BarCodPar[0] ;
         A2804RecLinMaq = P08SX4_A2804RecLinMaq[0] ;
         AV44count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08SX4_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            brk8SX6 = false ;
            A1273RecLinPro = P08SX4_A1273RecLinPro[0] ;
            A129BarCod = P08SX4_A129BarCod[0] ;
            A132BarCodReo = P08SX4_A132BarCodReo[0] ;
            A130BarCodPar = P08SX4_A130BarCodPar[0] ;
            A2804RecLinMaq = P08SX4_A2804RecLinMaq[0] ;
            AV44count = (long)(AV44count+1) ;
            brk8SX6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV36Option = A488ForPrdDsc ;
            AV35InsertIndex = 1 ;
            while ( ( AV35InsertIndex <= AV37Options.size() ) && ( GXutil.strcmp((String)AV37Options.elementAt(-1+AV35InsertIndex), AV36Option) < 0 ) )
            {
               AV35InsertIndex = (int)(AV35InsertIndex+1) ;
            }
            AV37Options.add(AV36Option, AV35InsertIndex);
            AV42OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV44count), "Z,ZZZ,ZZZ,ZZ9")), AV35InsertIndex);
         }
         if ( AV37Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SX6 )
         {
            brk8SX6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wpwincrecgetfilterdata.this.AV38OptionsJson;
      this.aP4[0] = wpwincrecgetfilterdata.this.AV41OptionsDescJson;
      this.aP5[0] = wpwincrecgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38OptionsJson = "" ;
      AV41OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV37Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV14TFRecPrdNum = "" ;
      AV15TFRecPrdNum_Sel = "" ;
      AV16TFRecPrdDsc = "" ;
      AV17TFRecPrdDsc_Sel = "" ;
      AV18TFForPrdDsc = "" ;
      AV19TFForPrdDsc_Sel = "" ;
      AV20TFFacCon = DecimalUtil.ZERO ;
      AV21TFFacCon_To = DecimalUtil.ZERO ;
      AV22TFPrdExiAlm = DecimalUtil.ZERO ;
      AV23TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV24TFPrdCanRes = DecimalUtil.ZERO ;
      AV25TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV26TFPrdCanPen = DecimalUtil.ZERO ;
      AV27TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV28TFPrdStkMinU = DecimalUtil.ZERO ;
      AV29TFPrdStkMinU_To = DecimalUtil.ZERO ;
      AV30TFPrdFacCon = DecimalUtil.ZERO ;
      AV31TFPrdFacCon_To = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      AV55Core_wpwincrecds_1_filterfulltext = "" ;
      AV60Core_wpwincrecds_6_tfrecprdnum = "" ;
      AV61Core_wpwincrecds_7_tfrecprdnum_sel = "" ;
      AV62Core_wpwincrecds_8_tfrecprddsc = "" ;
      AV63Core_wpwincrecds_9_tfrecprddsc_sel = "" ;
      AV64Core_wpwincrecds_10_tfforprddsc = "" ;
      AV65Core_wpwincrecds_11_tfforprddsc_sel = "" ;
      AV66Core_wpwincrecds_12_tffaccon = DecimalUtil.ZERO ;
      AV67Core_wpwincrecds_13_tffaccon_to = DecimalUtil.ZERO ;
      AV68Core_wpwincrecds_14_tfprdexialm = DecimalUtil.ZERO ;
      AV69Core_wpwincrecds_15_tfprdexialm_to = DecimalUtil.ZERO ;
      AV70Core_wpwincrecds_16_tfprdcanres = DecimalUtil.ZERO ;
      AV71Core_wpwincrecds_17_tfprdcanres_to = DecimalUtil.ZERO ;
      AV72Core_wpwincrecds_18_tfprdcanpen = DecimalUtil.ZERO ;
      AV73Core_wpwincrecds_19_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV74Core_wpwincrecds_20_tfprdstkminu = DecimalUtil.ZERO ;
      AV75Core_wpwincrecds_21_tfprdstkminu_to = DecimalUtil.ZERO ;
      AV76Core_wpwincrecds_22_tfprdfaccon = DecimalUtil.ZERO ;
      AV77Core_wpwincrecds_23_tfprdfaccon_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      P08SX2_A1273RecLinPro = new byte[1] ;
      P08SX2_A396EmprCod = new String[] {""} ;
      P08SX2_A129BarCod = new int[1] ;
      P08SX2_A132BarCodReo = new byte[1] ;
      P08SX2_A130BarCodPar = new String[] {""} ;
      P08SX2_A2804RecLinMaq = new short[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV36Option = "" ;
      P08SX3_A1273RecLinPro = new byte[1] ;
      P08SX3_A396EmprCod = new String[] {""} ;
      P08SX3_A129BarCod = new int[1] ;
      P08SX3_A132BarCodReo = new byte[1] ;
      P08SX3_A130BarCodPar = new String[] {""} ;
      P08SX3_A2804RecLinMaq = new short[1] ;
      P08SX4_A396EmprCod = new String[] {""} ;
      P08SX4_A1273RecLinPro = new byte[1] ;
      P08SX4_A129BarCod = new int[1] ;
      P08SX4_A132BarCodReo = new byte[1] ;
      P08SX4_A130BarCodPar = new String[] {""} ;
      P08SX4_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpwincrecgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08SX2_A1273RecLinPro, P08SX2_A396EmprCod, P08SX2_A129BarCod, P08SX2_A132BarCodReo, P08SX2_A130BarCodPar, P08SX2_A2804RecLinMaq
            }
            , new Object[] {
            P08SX3_A1273RecLinPro, P08SX3_A396EmprCod, P08SX3_A129BarCod, P08SX3_A132BarCodReo, P08SX3_A130BarCodPar, P08SX3_A2804RecLinMaq
            }
            , new Object[] {
            P08SX4_A396EmprCod, P08SX4_A1273RecLinPro, P08SX4_A129BarCod, P08SX4_A132BarCodReo, P08SX4_A130BarCodPar, P08SX4_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFRecLinPro ;
   private byte AV11TFRecLinPro_To ;
   private byte AV56Core_wpwincrecds_2_tfreclinpro ;
   private byte AV57Core_wpwincrecds_3_tfreclinpro_to ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private short AV12TFRecLin ;
   private short AV13TFRecLin_To ;
   private short AV58Core_wpwincrecds_4_tfreclin ;
   private short AV59Core_wpwincrecds_5_tfreclin_to ;
   private short A811RecLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int A129BarCod ;
   private int AV35InsertIndex ;
   private long AV44count ;
   private java.math.BigDecimal AV20TFFacCon ;
   private java.math.BigDecimal AV21TFFacCon_To ;
   private java.math.BigDecimal AV22TFPrdExiAlm ;
   private java.math.BigDecimal AV23TFPrdExiAlm_To ;
   private java.math.BigDecimal AV24TFPrdCanRes ;
   private java.math.BigDecimal AV25TFPrdCanRes_To ;
   private java.math.BigDecimal AV26TFPrdCanPen ;
   private java.math.BigDecimal AV27TFPrdCanPen_To ;
   private java.math.BigDecimal AV28TFPrdStkMinU ;
   private java.math.BigDecimal AV29TFPrdStkMinU_To ;
   private java.math.BigDecimal AV30TFPrdFacCon ;
   private java.math.BigDecimal AV31TFPrdFacCon_To ;
   private java.math.BigDecimal AV66Core_wpwincrecds_12_tffaccon ;
   private java.math.BigDecimal AV67Core_wpwincrecds_13_tffaccon_to ;
   private java.math.BigDecimal AV68Core_wpwincrecds_14_tfprdexialm ;
   private java.math.BigDecimal AV69Core_wpwincrecds_15_tfprdexialm_to ;
   private java.math.BigDecimal AV70Core_wpwincrecds_16_tfprdcanres ;
   private java.math.BigDecimal AV71Core_wpwincrecds_17_tfprdcanres_to ;
   private java.math.BigDecimal AV72Core_wpwincrecds_18_tfprdcanpen ;
   private java.math.BigDecimal AV73Core_wpwincrecds_19_tfprdcanpen_to ;
   private java.math.BigDecimal AV74Core_wpwincrecds_20_tfprdstkminu ;
   private java.math.BigDecimal AV75Core_wpwincrecds_21_tfprdstkminu_to ;
   private java.math.BigDecimal AV76Core_wpwincrecds_22_tfprdfaccon ;
   private java.math.BigDecimal AV77Core_wpwincrecds_23_tfprdfaccon_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A707PrdFacCon ;
   private String AV14TFRecPrdNum ;
   private String AV15TFRecPrdNum_Sel ;
   private String AV16TFRecPrdDsc ;
   private String AV17TFRecPrdDsc_Sel ;
   private String AV18TFForPrdDsc ;
   private String AV19TFForPrdDsc_Sel ;
   private String A872RecPrdNum ;
   private String AV60Core_wpwincrecds_6_tfrecprdnum ;
   private String AV61Core_wpwincrecds_7_tfrecprdnum_sel ;
   private String AV62Core_wpwincrecds_8_tfrecprddsc ;
   private String AV63Core_wpwincrecds_9_tfrecprddsc_sel ;
   private String AV64Core_wpwincrecds_10_tfforprddsc ;
   private String AV65Core_wpwincrecds_11_tfforprddsc_sel ;
   private String scmdbuf ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk8SX2 ;
   private boolean brk8SX4 ;
   private boolean brk8SX6 ;
   private String AV38OptionsJson ;
   private String AV41OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV32SearchTxt ;
   private String AV33SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV55Core_wpwincrecds_1_filterfulltext ;
   private String AV36Option ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P08SX2_A1273RecLinPro ;
   private String[] P08SX2_A396EmprCod ;
   private int[] P08SX2_A129BarCod ;
   private byte[] P08SX2_A132BarCodReo ;
   private String[] P08SX2_A130BarCodPar ;
   private short[] P08SX2_A2804RecLinMaq ;
   private byte[] P08SX3_A1273RecLinPro ;
   private String[] P08SX3_A396EmprCod ;
   private int[] P08SX3_A129BarCod ;
   private byte[] P08SX3_A132BarCodReo ;
   private String[] P08SX3_A130BarCodPar ;
   private short[] P08SX3_A2804RecLinMaq ;
   private String[] P08SX4_A396EmprCod ;
   private byte[] P08SX4_A1273RecLinPro ;
   private int[] P08SX4_A129BarCod ;
   private byte[] P08SX4_A132BarCodReo ;
   private String[] P08SX4_A130BarCodPar ;
   private short[] P08SX4_A2804RecLinMaq ;
   private GXSimpleCollection<String> AV37Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV42OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class wpwincrecgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08SX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Core_wpwincrecds_1_filterfulltext ,
                                          byte AV56Core_wpwincrecds_2_tfreclinpro ,
                                          byte AV57Core_wpwincrecds_3_tfreclinpro_to ,
                                          short AV58Core_wpwincrecds_4_tfreclin ,
                                          short AV59Core_wpwincrecds_5_tfreclin_to ,
                                          String AV61Core_wpwincrecds_7_tfrecprdnum_sel ,
                                          String AV60Core_wpwincrecds_6_tfrecprdnum ,
                                          String AV63Core_wpwincrecds_9_tfrecprddsc_sel ,
                                          String AV62Core_wpwincrecds_8_tfrecprddsc ,
                                          String AV65Core_wpwincrecds_11_tfforprddsc_sel ,
                                          String AV64Core_wpwincrecds_10_tfforprddsc ,
                                          java.math.BigDecimal AV66Core_wpwincrecds_12_tffaccon ,
                                          java.math.BigDecimal AV67Core_wpwincrecds_13_tffaccon_to ,
                                          java.math.BigDecimal AV68Core_wpwincrecds_14_tfprdexialm ,
                                          java.math.BigDecimal AV69Core_wpwincrecds_15_tfprdexialm_to ,
                                          java.math.BigDecimal AV70Core_wpwincrecds_16_tfprdcanres ,
                                          java.math.BigDecimal AV71Core_wpwincrecds_17_tfprdcanres_to ,
                                          java.math.BigDecimal AV72Core_wpwincrecds_18_tfprdcanpen ,
                                          java.math.BigDecimal AV73Core_wpwincrecds_19_tfprdcanpen_to ,
                                          java.math.BigDecimal AV74Core_wpwincrecds_20_tfprdstkminu ,
                                          java.math.BigDecimal AV75Core_wpwincrecds_21_tfprdstkminu_to ,
                                          java.math.BigDecimal AV76Core_wpwincrecds_22_tfprdfaccon ,
                                          java.math.BigDecimal AV77Core_wpwincrecds_23_tfprdfaccon_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A707PrdFacCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[2];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET" ;
      if ( ! (0==AV56Core_wpwincrecds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(RecLinPro >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV57Core_wpwincrecds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(RecLinPro <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08SX3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Core_wpwincrecds_1_filterfulltext ,
                                          byte AV56Core_wpwincrecds_2_tfreclinpro ,
                                          byte AV57Core_wpwincrecds_3_tfreclinpro_to ,
                                          short AV58Core_wpwincrecds_4_tfreclin ,
                                          short AV59Core_wpwincrecds_5_tfreclin_to ,
                                          String AV61Core_wpwincrecds_7_tfrecprdnum_sel ,
                                          String AV60Core_wpwincrecds_6_tfrecprdnum ,
                                          String AV63Core_wpwincrecds_9_tfrecprddsc_sel ,
                                          String AV62Core_wpwincrecds_8_tfrecprddsc ,
                                          String AV65Core_wpwincrecds_11_tfforprddsc_sel ,
                                          String AV64Core_wpwincrecds_10_tfforprddsc ,
                                          java.math.BigDecimal AV66Core_wpwincrecds_12_tffaccon ,
                                          java.math.BigDecimal AV67Core_wpwincrecds_13_tffaccon_to ,
                                          java.math.BigDecimal AV68Core_wpwincrecds_14_tfprdexialm ,
                                          java.math.BigDecimal AV69Core_wpwincrecds_15_tfprdexialm_to ,
                                          java.math.BigDecimal AV70Core_wpwincrecds_16_tfprdcanres ,
                                          java.math.BigDecimal AV71Core_wpwincrecds_17_tfprdcanres_to ,
                                          java.math.BigDecimal AV72Core_wpwincrecds_18_tfprdcanpen ,
                                          java.math.BigDecimal AV73Core_wpwincrecds_19_tfprdcanpen_to ,
                                          java.math.BigDecimal AV74Core_wpwincrecds_20_tfprdstkminu ,
                                          java.math.BigDecimal AV75Core_wpwincrecds_21_tfprdstkminu_to ,
                                          java.math.BigDecimal AV76Core_wpwincrecds_22_tfprdfaccon ,
                                          java.math.BigDecimal AV77Core_wpwincrecds_23_tfprdfaccon_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A707PrdFacCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[2];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT RecLinPro, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET" ;
      if ( ! (0==AV56Core_wpwincrecds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(RecLinPro >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (0==AV57Core_wpwincrecds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(RecLinPro <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08SX4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Core_wpwincrecds_1_filterfulltext ,
                                          byte AV56Core_wpwincrecds_2_tfreclinpro ,
                                          byte AV57Core_wpwincrecds_3_tfreclinpro_to ,
                                          short AV58Core_wpwincrecds_4_tfreclin ,
                                          short AV59Core_wpwincrecds_5_tfreclin_to ,
                                          String AV61Core_wpwincrecds_7_tfrecprdnum_sel ,
                                          String AV60Core_wpwincrecds_6_tfrecprdnum ,
                                          String AV63Core_wpwincrecds_9_tfrecprddsc_sel ,
                                          String AV62Core_wpwincrecds_8_tfrecprddsc ,
                                          String AV65Core_wpwincrecds_11_tfforprddsc_sel ,
                                          String AV64Core_wpwincrecds_10_tfforprddsc ,
                                          java.math.BigDecimal AV66Core_wpwincrecds_12_tffaccon ,
                                          java.math.BigDecimal AV67Core_wpwincrecds_13_tffaccon_to ,
                                          java.math.BigDecimal AV68Core_wpwincrecds_14_tfprdexialm ,
                                          java.math.BigDecimal AV69Core_wpwincrecds_15_tfprdexialm_to ,
                                          java.math.BigDecimal AV70Core_wpwincrecds_16_tfprdcanres ,
                                          java.math.BigDecimal AV71Core_wpwincrecds_17_tfprdcanres_to ,
                                          java.math.BigDecimal AV72Core_wpwincrecds_18_tfprdcanpen ,
                                          java.math.BigDecimal AV73Core_wpwincrecds_19_tfprdcanpen_to ,
                                          java.math.BigDecimal AV74Core_wpwincrecds_20_tfprdstkminu ,
                                          java.math.BigDecimal AV75Core_wpwincrecds_21_tfprdstkminu_to ,
                                          java.math.BigDecimal AV76Core_wpwincrecds_22_tfprdfaccon ,
                                          java.math.BigDecimal AV77Core_wpwincrecds_23_tfprdfaccon_to ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A732PrdStkMinU ,
                                          java.math.BigDecimal A707PrdFacCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[2];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, RecLinPro, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET" ;
      if ( ! (0==AV56Core_wpwincrecds_2_tfreclinpro) )
      {
         addWhere(sWhereString, "(RecLinPro >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV57Core_wpwincrecds_3_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(RecLinPro <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
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
                  return conditional_P08SX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] );
            case 1 :
                  return conditional_P08SX3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] );
            case 2 :
                  return conditional_P08SX4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08SX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SX3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08SX4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
                  stmt.setByte(sIdx, ((Number) parms[2]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[3]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[2]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[3]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[2]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[3]).byteValue());
               }
               return;
      }
   }

}

