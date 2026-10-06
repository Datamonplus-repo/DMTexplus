package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class salidaproductomanual_wpgetfilterdata extends GXProcedure
{
   public salidaproductomanual_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidaproductomanual_wpgetfilterdata.class ), "" );
   }

   public salidaproductomanual_wpgetfilterdata( int remoteHandle ,
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
      salidaproductomanual_wpgetfilterdata.this.aP5 = new String[] {""};
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
      salidaproductomanual_wpgetfilterdata.this.AV38DDOName = aP0;
      salidaproductomanual_wpgetfilterdata.this.AV39SearchTxt = aP1;
      salidaproductomanual_wpgetfilterdata.this.AV40SearchTxtTo = aP2;
      salidaproductomanual_wpgetfilterdata.this.aP3 = aP3;
      salidaproductomanual_wpgetfilterdata.this.aP4 = aP4;
      salidaproductomanual_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_CUMCONLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADCUMCONLOTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV41OptionsJson = AV28Options.toJSonString(false) ;
      AV42OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV43OptionIndexesJson = AV31OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("SalidaProductoManual_WPGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "SalidaProductoManual_WPGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("SalidaProductoManual_WPGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV14TFPrdFacCon = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdFacCon_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV16TFPrdExiAlm = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdExiAlm_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV18TFPrdCanRes = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrdCanRes_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCUMCONCANT") == 0 )
         {
            AV20TFCumConCant = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFCumConCant_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCUMUNIDAD_SEL") == 0 )
         {
            AV47TFCumUnidad_SelsJson = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV48TFCumUnidad_Sels.fromJSonString(AV47TFCumUnidad_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCUMCONLOT") == 0 )
         {
            AV24TFCumConLot = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCUMCONLOT_SEL") == 0 )
         {
            AV25TFCumConLot_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CUMCODCONT") == 0 )
         {
            AV46CumCodCont = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV39SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV53Salidaproductomanual_wpds_1_tfprdnum = AV10TFPrdNum ;
      AV54Salidaproductomanual_wpds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV55Salidaproductomanual_wpds_3_tfprdnom = AV12TFPrdNom ;
      AV56Salidaproductomanual_wpds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV57Salidaproductomanual_wpds_5_tfprdfaccon = AV14TFPrdFacCon ;
      AV58Salidaproductomanual_wpds_6_tfprdfaccon_to = AV15TFPrdFacCon_To ;
      AV59Salidaproductomanual_wpds_7_tfprdexialm = AV16TFPrdExiAlm ;
      AV60Salidaproductomanual_wpds_8_tfprdexialm_to = AV17TFPrdExiAlm_To ;
      AV61Salidaproductomanual_wpds_9_tfprdcanres = AV18TFPrdCanRes ;
      AV62Salidaproductomanual_wpds_10_tfprdcanres_to = AV19TFPrdCanRes_To ;
      AV63Salidaproductomanual_wpds_11_tfcumconcant = AV20TFCumConCant ;
      AV64Salidaproductomanual_wpds_12_tfcumconcant_to = AV21TFCumConCant_To ;
      AV65Salidaproductomanual_wpds_13_tfcumunidad_sels = AV48TFCumUnidad_Sels ;
      AV66Salidaproductomanual_wpds_14_tfcumconlot = AV24TFCumConLot ;
      AV67Salidaproductomanual_wpds_15_tfcumconlot_sel = AV25TFCumConLot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A8639CumUnidad) ,
                                           AV65Salidaproductomanual_wpds_13_tfcumunidad_sels ,
                                           AV54Salidaproductomanual_wpds_2_tfprdnum_sel ,
                                           AV53Salidaproductomanual_wpds_1_tfprdnum ,
                                           AV56Salidaproductomanual_wpds_4_tfprdnom_sel ,
                                           AV55Salidaproductomanual_wpds_3_tfprdnom ,
                                           AV57Salidaproductomanual_wpds_5_tfprdfaccon ,
                                           AV58Salidaproductomanual_wpds_6_tfprdfaccon_to ,
                                           AV59Salidaproductomanual_wpds_7_tfprdexialm ,
                                           AV60Salidaproductomanual_wpds_8_tfprdexialm_to ,
                                           AV61Salidaproductomanual_wpds_9_tfprdcanres ,
                                           AV62Salidaproductomanual_wpds_10_tfprdcanres_to ,
                                           AV63Salidaproductomanual_wpds_11_tfcumconcant ,
                                           AV64Salidaproductomanual_wpds_12_tfcumconcant_to ,
                                           Integer.valueOf(AV65Salidaproductomanual_wpds_13_tfcumunidad_sels.size()) ,
                                           AV67Salidaproductomanual_wpds_15_tfcumconlot_sel ,
                                           AV66Salidaproductomanual_wpds_14_tfcumconlot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A707PrdFacCon ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A860CumConCant ,
                                           A5862CumConLot ,
                                           AV45Emprcod ,
                                           Integer.valueOf(AV46CumCodCont) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A859CumCodCont) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV53Salidaproductomanual_wpds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Salidaproductomanual_wpds_1_tfprdnum), 6, "%") ;
      lV55Salidaproductomanual_wpds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Salidaproductomanual_wpds_3_tfprdnom), 26, "%") ;
      lV66Salidaproductomanual_wpds_14_tfcumconlot = GXutil.padr( GXutil.rtrim( AV66Salidaproductomanual_wpds_14_tfcumconlot), 26, "%") ;
      /* Using cursor P09RC2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, Integer.valueOf(AV46CumCodCont), lV53Salidaproductomanual_wpds_1_tfprdnum, AV54Salidaproductomanual_wpds_2_tfprdnum_sel, lV55Salidaproductomanual_wpds_3_tfprdnom, AV56Salidaproductomanual_wpds_4_tfprdnom_sel, AV57Salidaproductomanual_wpds_5_tfprdfaccon, AV58Salidaproductomanual_wpds_6_tfprdfaccon_to, AV59Salidaproductomanual_wpds_7_tfprdexialm, AV60Salidaproductomanual_wpds_8_tfprdexialm_to, AV61Salidaproductomanual_wpds_9_tfprdcanres, AV62Salidaproductomanual_wpds_10_tfprdcanres_to, AV63Salidaproductomanual_wpds_11_tfcumconcant, AV64Salidaproductomanual_wpds_12_tfcumconcant_to, lV66Salidaproductomanual_wpds_14_tfcumconlot, AV67Salidaproductomanual_wpds_15_tfcumconlot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9RC2 = false ;
         A859CumCodCont = P09RC2_A859CumCodCont[0] ;
         A396EmprCod = P09RC2_A396EmprCod[0] ;
         A719PrdNum = P09RC2_A719PrdNum[0] ;
         A5862CumConLot = P09RC2_A5862CumConLot[0] ;
         A8639CumUnidad = P09RC2_A8639CumUnidad[0] ;
         A860CumConCant = P09RC2_A860CumConCant[0] ;
         A685PrdCanRes = P09RC2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P09RC2_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09RC2_A707PrdFacCon[0] ;
         A718PrdNom = P09RC2_A718PrdNom[0] ;
         A685PrdCanRes = P09RC2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P09RC2_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09RC2_A707PrdFacCon[0] ;
         A718PrdNom = P09RC2_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09RC2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09RC2_A859CumCodCont[0] == A859CumCodCont ) && ( GXutil.strcmp(P09RC2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9RC2 = false ;
            AV32count = (long)(AV32count+1) ;
            brk9RC2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV27Option = A719PrdNum ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RC2 )
         {
            brk9RC2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV39SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV53Salidaproductomanual_wpds_1_tfprdnum = AV10TFPrdNum ;
      AV54Salidaproductomanual_wpds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV55Salidaproductomanual_wpds_3_tfprdnom = AV12TFPrdNom ;
      AV56Salidaproductomanual_wpds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV57Salidaproductomanual_wpds_5_tfprdfaccon = AV14TFPrdFacCon ;
      AV58Salidaproductomanual_wpds_6_tfprdfaccon_to = AV15TFPrdFacCon_To ;
      AV59Salidaproductomanual_wpds_7_tfprdexialm = AV16TFPrdExiAlm ;
      AV60Salidaproductomanual_wpds_8_tfprdexialm_to = AV17TFPrdExiAlm_To ;
      AV61Salidaproductomanual_wpds_9_tfprdcanres = AV18TFPrdCanRes ;
      AV62Salidaproductomanual_wpds_10_tfprdcanres_to = AV19TFPrdCanRes_To ;
      AV63Salidaproductomanual_wpds_11_tfcumconcant = AV20TFCumConCant ;
      AV64Salidaproductomanual_wpds_12_tfcumconcant_to = AV21TFCumConCant_To ;
      AV65Salidaproductomanual_wpds_13_tfcumunidad_sels = AV48TFCumUnidad_Sels ;
      AV66Salidaproductomanual_wpds_14_tfcumconlot = AV24TFCumConLot ;
      AV67Salidaproductomanual_wpds_15_tfcumconlot_sel = AV25TFCumConLot_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A8639CumUnidad) ,
                                           AV65Salidaproductomanual_wpds_13_tfcumunidad_sels ,
                                           AV54Salidaproductomanual_wpds_2_tfprdnum_sel ,
                                           AV53Salidaproductomanual_wpds_1_tfprdnum ,
                                           AV56Salidaproductomanual_wpds_4_tfprdnom_sel ,
                                           AV55Salidaproductomanual_wpds_3_tfprdnom ,
                                           AV57Salidaproductomanual_wpds_5_tfprdfaccon ,
                                           AV58Salidaproductomanual_wpds_6_tfprdfaccon_to ,
                                           AV59Salidaproductomanual_wpds_7_tfprdexialm ,
                                           AV60Salidaproductomanual_wpds_8_tfprdexialm_to ,
                                           AV61Salidaproductomanual_wpds_9_tfprdcanres ,
                                           AV62Salidaproductomanual_wpds_10_tfprdcanres_to ,
                                           AV63Salidaproductomanual_wpds_11_tfcumconcant ,
                                           AV64Salidaproductomanual_wpds_12_tfcumconcant_to ,
                                           Integer.valueOf(AV65Salidaproductomanual_wpds_13_tfcumunidad_sels.size()) ,
                                           AV67Salidaproductomanual_wpds_15_tfcumconlot_sel ,
                                           AV66Salidaproductomanual_wpds_14_tfcumconlot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A707PrdFacCon ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A860CumConCant ,
                                           A5862CumConLot ,
                                           Integer.valueOf(A859CumCodCont) ,
                                           Integer.valueOf(AV46CumCodCont) ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Salidaproductomanual_wpds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Salidaproductomanual_wpds_1_tfprdnum), 6, "%") ;
      lV55Salidaproductomanual_wpds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Salidaproductomanual_wpds_3_tfprdnom), 26, "%") ;
      lV66Salidaproductomanual_wpds_14_tfcumconlot = GXutil.padr( GXutil.rtrim( AV66Salidaproductomanual_wpds_14_tfcumconlot), 26, "%") ;
      /* Using cursor P09RC3 */
      pr_default.execute(1, new Object[] {AV45Emprcod, Integer.valueOf(AV46CumCodCont), lV53Salidaproductomanual_wpds_1_tfprdnum, AV54Salidaproductomanual_wpds_2_tfprdnum_sel, lV55Salidaproductomanual_wpds_3_tfprdnom, AV56Salidaproductomanual_wpds_4_tfprdnom_sel, AV57Salidaproductomanual_wpds_5_tfprdfaccon, AV58Salidaproductomanual_wpds_6_tfprdfaccon_to, AV59Salidaproductomanual_wpds_7_tfprdexialm, AV60Salidaproductomanual_wpds_8_tfprdexialm_to, AV61Salidaproductomanual_wpds_9_tfprdcanres, AV62Salidaproductomanual_wpds_10_tfprdcanres_to, AV63Salidaproductomanual_wpds_11_tfcumconcant, AV64Salidaproductomanual_wpds_12_tfcumconcant_to, lV66Salidaproductomanual_wpds_14_tfcumconlot, AV67Salidaproductomanual_wpds_15_tfcumconlot_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9RC4 = false ;
         A719PrdNum = P09RC3_A719PrdNum[0] ;
         A396EmprCod = P09RC3_A396EmprCod[0] ;
         A859CumCodCont = P09RC3_A859CumCodCont[0] ;
         A5862CumConLot = P09RC3_A5862CumConLot[0] ;
         A8639CumUnidad = P09RC3_A8639CumUnidad[0] ;
         A860CumConCant = P09RC3_A860CumConCant[0] ;
         A685PrdCanRes = P09RC3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P09RC3_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09RC3_A707PrdFacCon[0] ;
         A718PrdNom = P09RC3_A718PrdNom[0] ;
         A685PrdCanRes = P09RC3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P09RC3_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09RC3_A707PrdFacCon[0] ;
         A718PrdNom = P09RC3_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09RC3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09RC3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9RC4 = false ;
            A859CumCodCont = P09RC3_A859CumCodCont[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9RC4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV27Option = A718PrdNom ;
            AV26InsertIndex = 1 ;
            while ( ( AV26InsertIndex <= AV28Options.size() ) && ( GXutil.strcmp((String)AV28Options.elementAt(-1+AV26InsertIndex), AV27Option) < 0 ) )
            {
               AV26InsertIndex = (int)(AV26InsertIndex+1) ;
            }
            AV28Options.add(AV27Option, AV26InsertIndex);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), AV26InsertIndex);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RC4 )
         {
            brk9RC4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCUMCONLOTOPTIONS' Routine */
      returnInSub = false ;
      AV24TFCumConLot = AV39SearchTxt ;
      AV25TFCumConLot_Sel = "" ;
      AV53Salidaproductomanual_wpds_1_tfprdnum = AV10TFPrdNum ;
      AV54Salidaproductomanual_wpds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV55Salidaproductomanual_wpds_3_tfprdnom = AV12TFPrdNom ;
      AV56Salidaproductomanual_wpds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV57Salidaproductomanual_wpds_5_tfprdfaccon = AV14TFPrdFacCon ;
      AV58Salidaproductomanual_wpds_6_tfprdfaccon_to = AV15TFPrdFacCon_To ;
      AV59Salidaproductomanual_wpds_7_tfprdexialm = AV16TFPrdExiAlm ;
      AV60Salidaproductomanual_wpds_8_tfprdexialm_to = AV17TFPrdExiAlm_To ;
      AV61Salidaproductomanual_wpds_9_tfprdcanres = AV18TFPrdCanRes ;
      AV62Salidaproductomanual_wpds_10_tfprdcanres_to = AV19TFPrdCanRes_To ;
      AV63Salidaproductomanual_wpds_11_tfcumconcant = AV20TFCumConCant ;
      AV64Salidaproductomanual_wpds_12_tfcumconcant_to = AV21TFCumConCant_To ;
      AV65Salidaproductomanual_wpds_13_tfcumunidad_sels = AV48TFCumUnidad_Sels ;
      AV66Salidaproductomanual_wpds_14_tfcumconlot = AV24TFCumConLot ;
      AV67Salidaproductomanual_wpds_15_tfcumconlot_sel = AV25TFCumConLot_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A8639CumUnidad) ,
                                           AV65Salidaproductomanual_wpds_13_tfcumunidad_sels ,
                                           AV54Salidaproductomanual_wpds_2_tfprdnum_sel ,
                                           AV53Salidaproductomanual_wpds_1_tfprdnum ,
                                           AV56Salidaproductomanual_wpds_4_tfprdnom_sel ,
                                           AV55Salidaproductomanual_wpds_3_tfprdnom ,
                                           AV57Salidaproductomanual_wpds_5_tfprdfaccon ,
                                           AV58Salidaproductomanual_wpds_6_tfprdfaccon_to ,
                                           AV59Salidaproductomanual_wpds_7_tfprdexialm ,
                                           AV60Salidaproductomanual_wpds_8_tfprdexialm_to ,
                                           AV61Salidaproductomanual_wpds_9_tfprdcanres ,
                                           AV62Salidaproductomanual_wpds_10_tfprdcanres_to ,
                                           AV63Salidaproductomanual_wpds_11_tfcumconcant ,
                                           AV64Salidaproductomanual_wpds_12_tfcumconcant_to ,
                                           Integer.valueOf(AV65Salidaproductomanual_wpds_13_tfcumunidad_sels.size()) ,
                                           AV67Salidaproductomanual_wpds_15_tfcumconlot_sel ,
                                           AV66Salidaproductomanual_wpds_14_tfcumconlot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A707PrdFacCon ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A860CumConCant ,
                                           A5862CumConLot ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           Integer.valueOf(A859CumCodCont) ,
                                           Integer.valueOf(AV46CumCodCont) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV53Salidaproductomanual_wpds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Salidaproductomanual_wpds_1_tfprdnum), 6, "%") ;
      lV55Salidaproductomanual_wpds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Salidaproductomanual_wpds_3_tfprdnom), 26, "%") ;
      lV66Salidaproductomanual_wpds_14_tfcumconlot = GXutil.padr( GXutil.rtrim( AV66Salidaproductomanual_wpds_14_tfcumconlot), 26, "%") ;
      /* Using cursor P09RC4 */
      pr_default.execute(2, new Object[] {AV45Emprcod, Integer.valueOf(AV46CumCodCont), lV53Salidaproductomanual_wpds_1_tfprdnum, AV54Salidaproductomanual_wpds_2_tfprdnum_sel, lV55Salidaproductomanual_wpds_3_tfprdnom, AV56Salidaproductomanual_wpds_4_tfprdnom_sel, AV57Salidaproductomanual_wpds_5_tfprdfaccon, AV58Salidaproductomanual_wpds_6_tfprdfaccon_to, AV59Salidaproductomanual_wpds_7_tfprdexialm, AV60Salidaproductomanual_wpds_8_tfprdexialm_to, AV61Salidaproductomanual_wpds_9_tfprdcanres, AV62Salidaproductomanual_wpds_10_tfprdcanres_to, AV63Salidaproductomanual_wpds_11_tfcumconcant, AV64Salidaproductomanual_wpds_12_tfcumconcant_to, lV66Salidaproductomanual_wpds_14_tfcumconlot, AV67Salidaproductomanual_wpds_15_tfcumconlot_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9RC6 = false ;
         A396EmprCod = P09RC4_A396EmprCod[0] ;
         A859CumCodCont = P09RC4_A859CumCodCont[0] ;
         A5862CumConLot = P09RC4_A5862CumConLot[0] ;
         A8639CumUnidad = P09RC4_A8639CumUnidad[0] ;
         A860CumConCant = P09RC4_A860CumConCant[0] ;
         A685PrdCanRes = P09RC4_A685PrdCanRes[0] ;
         A704PrdExiAlm = P09RC4_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09RC4_A707PrdFacCon[0] ;
         A718PrdNom = P09RC4_A718PrdNom[0] ;
         A719PrdNum = P09RC4_A719PrdNum[0] ;
         A685PrdCanRes = P09RC4_A685PrdCanRes[0] ;
         A704PrdExiAlm = P09RC4_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09RC4_A707PrdFacCon[0] ;
         A718PrdNom = P09RC4_A718PrdNom[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09RC4_A5862CumConLot[0], A5862CumConLot) == 0 ) )
         {
            brk9RC6 = false ;
            A396EmprCod = P09RC4_A396EmprCod[0] ;
            A859CumCodCont = P09RC4_A859CumCodCont[0] ;
            A719PrdNum = P09RC4_A719PrdNum[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9RC6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5862CumConLot)==0) )
         {
            AV27Option = A5862CumConLot ;
            AV28Options.add(AV27Option, 0);
            AV31OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV28Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9RC6 )
         {
            brk9RC6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = salidaproductomanual_wpgetfilterdata.this.AV41OptionsJson;
      this.aP4[0] = salidaproductomanual_wpgetfilterdata.this.AV42OptionsDescJson;
      this.aP5[0] = salidaproductomanual_wpgetfilterdata.this.AV43OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV41OptionsJson = "" ;
      AV42OptionsDescJson = "" ;
      AV43OptionIndexesJson = "" ;
      AV28Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdFacCon = DecimalUtil.ZERO ;
      AV15TFPrdFacCon_To = DecimalUtil.ZERO ;
      AV16TFPrdExiAlm = DecimalUtil.ZERO ;
      AV17TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV18TFPrdCanRes = DecimalUtil.ZERO ;
      AV19TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV20TFCumConCant = DecimalUtil.ZERO ;
      AV21TFCumConCant_To = DecimalUtil.ZERO ;
      AV47TFCumUnidad_SelsJson = "" ;
      AV48TFCumUnidad_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV24TFCumConLot = "" ;
      AV25TFCumConLot_Sel = "" ;
      AV45Emprcod = "" ;
      A719PrdNum = "" ;
      AV53Salidaproductomanual_wpds_1_tfprdnum = "" ;
      AV54Salidaproductomanual_wpds_2_tfprdnum_sel = "" ;
      AV55Salidaproductomanual_wpds_3_tfprdnom = "" ;
      AV56Salidaproductomanual_wpds_4_tfprdnom_sel = "" ;
      AV57Salidaproductomanual_wpds_5_tfprdfaccon = DecimalUtil.ZERO ;
      AV58Salidaproductomanual_wpds_6_tfprdfaccon_to = DecimalUtil.ZERO ;
      AV59Salidaproductomanual_wpds_7_tfprdexialm = DecimalUtil.ZERO ;
      AV60Salidaproductomanual_wpds_8_tfprdexialm_to = DecimalUtil.ZERO ;
      AV61Salidaproductomanual_wpds_9_tfprdcanres = DecimalUtil.ZERO ;
      AV62Salidaproductomanual_wpds_10_tfprdcanres_to = DecimalUtil.ZERO ;
      AV63Salidaproductomanual_wpds_11_tfcumconcant = DecimalUtil.ZERO ;
      AV64Salidaproductomanual_wpds_12_tfcumconcant_to = DecimalUtil.ZERO ;
      AV65Salidaproductomanual_wpds_13_tfcumunidad_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV66Salidaproductomanual_wpds_14_tfcumconlot = "" ;
      AV67Salidaproductomanual_wpds_15_tfcumconlot_sel = "" ;
      scmdbuf = "" ;
      lV53Salidaproductomanual_wpds_1_tfprdnum = "" ;
      lV55Salidaproductomanual_wpds_3_tfprdnom = "" ;
      lV66Salidaproductomanual_wpds_14_tfcumconlot = "" ;
      A718PrdNom = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A860CumConCant = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      A396EmprCod = "" ;
      P09RC2_A859CumCodCont = new int[1] ;
      P09RC2_A396EmprCod = new String[] {""} ;
      P09RC2_A719PrdNum = new String[] {""} ;
      P09RC2_A5862CumConLot = new String[] {""} ;
      P09RC2_A8639CumUnidad = new byte[1] ;
      P09RC2_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC2_A718PrdNom = new String[] {""} ;
      AV27Option = "" ;
      P09RC3_A719PrdNum = new String[] {""} ;
      P09RC3_A396EmprCod = new String[] {""} ;
      P09RC3_A859CumCodCont = new int[1] ;
      P09RC3_A5862CumConLot = new String[] {""} ;
      P09RC3_A8639CumUnidad = new byte[1] ;
      P09RC3_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC3_A718PrdNom = new String[] {""} ;
      P09RC4_A396EmprCod = new String[] {""} ;
      P09RC4_A859CumCodCont = new int[1] ;
      P09RC4_A5862CumConLot = new String[] {""} ;
      P09RC4_A8639CumUnidad = new byte[1] ;
      P09RC4_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09RC4_A718PrdNom = new String[] {""} ;
      P09RC4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.salidaproductomanual_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09RC2_A859CumCodCont, P09RC2_A396EmprCod, P09RC2_A719PrdNum, P09RC2_A5862CumConLot, P09RC2_A8639CumUnidad, P09RC2_A860CumConCant, P09RC2_A685PrdCanRes, P09RC2_A704PrdExiAlm, P09RC2_A707PrdFacCon, P09RC2_A718PrdNom
            }
            , new Object[] {
            P09RC3_A719PrdNum, P09RC3_A396EmprCod, P09RC3_A859CumCodCont, P09RC3_A5862CumConLot, P09RC3_A8639CumUnidad, P09RC3_A860CumConCant, P09RC3_A685PrdCanRes, P09RC3_A704PrdExiAlm, P09RC3_A707PrdFacCon, P09RC3_A718PrdNom
            }
            , new Object[] {
            P09RC4_A396EmprCod, P09RC4_A859CumCodCont, P09RC4_A5862CumConLot, P09RC4_A8639CumUnidad, P09RC4_A860CumConCant, P09RC4_A685PrdCanRes, P09RC4_A704PrdExiAlm, P09RC4_A707PrdFacCon, P09RC4_A718PrdNom, P09RC4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8639CumUnidad ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV46CumCodCont ;
   private int AV65Salidaproductomanual_wpds_13_tfcumunidad_sels_size ;
   private int A859CumCodCont ;
   private int AV26InsertIndex ;
   private long AV32count ;
   private java.math.BigDecimal AV14TFPrdFacCon ;
   private java.math.BigDecimal AV15TFPrdFacCon_To ;
   private java.math.BigDecimal AV16TFPrdExiAlm ;
   private java.math.BigDecimal AV17TFPrdExiAlm_To ;
   private java.math.BigDecimal AV18TFPrdCanRes ;
   private java.math.BigDecimal AV19TFPrdCanRes_To ;
   private java.math.BigDecimal AV20TFCumConCant ;
   private java.math.BigDecimal AV21TFCumConCant_To ;
   private java.math.BigDecimal AV57Salidaproductomanual_wpds_5_tfprdfaccon ;
   private java.math.BigDecimal AV58Salidaproductomanual_wpds_6_tfprdfaccon_to ;
   private java.math.BigDecimal AV59Salidaproductomanual_wpds_7_tfprdexialm ;
   private java.math.BigDecimal AV60Salidaproductomanual_wpds_8_tfprdexialm_to ;
   private java.math.BigDecimal AV61Salidaproductomanual_wpds_9_tfprdcanres ;
   private java.math.BigDecimal AV62Salidaproductomanual_wpds_10_tfprdcanres_to ;
   private java.math.BigDecimal AV63Salidaproductomanual_wpds_11_tfcumconcant ;
   private java.math.BigDecimal AV64Salidaproductomanual_wpds_12_tfcumconcant_to ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A860CumConCant ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV24TFCumConLot ;
   private String AV25TFCumConLot_Sel ;
   private String AV45Emprcod ;
   private String A719PrdNum ;
   private String AV53Salidaproductomanual_wpds_1_tfprdnum ;
   private String AV54Salidaproductomanual_wpds_2_tfprdnum_sel ;
   private String AV55Salidaproductomanual_wpds_3_tfprdnom ;
   private String AV56Salidaproductomanual_wpds_4_tfprdnom_sel ;
   private String AV66Salidaproductomanual_wpds_14_tfcumconlot ;
   private String AV67Salidaproductomanual_wpds_15_tfcumconlot_sel ;
   private String scmdbuf ;
   private String lV53Salidaproductomanual_wpds_1_tfprdnum ;
   private String lV55Salidaproductomanual_wpds_3_tfprdnom ;
   private String lV66Salidaproductomanual_wpds_14_tfcumconlot ;
   private String A718PrdNom ;
   private String A5862CumConLot ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9RC2 ;
   private boolean brk9RC4 ;
   private boolean brk9RC6 ;
   private String AV41OptionsJson ;
   private String AV42OptionsDescJson ;
   private String AV43OptionIndexesJson ;
   private String AV47TFCumUnidad_SelsJson ;
   private String AV38DDOName ;
   private String AV39SearchTxt ;
   private String AV40SearchTxtTo ;
   private String AV27Option ;
   private GXSimpleCollection<Byte> AV48TFCumUnidad_Sels ;
   private GXSimpleCollection<Byte> AV65Salidaproductomanual_wpds_13_tfcumunidad_sels ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09RC2_A859CumCodCont ;
   private String[] P09RC2_A396EmprCod ;
   private String[] P09RC2_A719PrdNum ;
   private String[] P09RC2_A5862CumConLot ;
   private byte[] P09RC2_A8639CumUnidad ;
   private java.math.BigDecimal[] P09RC2_A860CumConCant ;
   private java.math.BigDecimal[] P09RC2_A685PrdCanRes ;
   private java.math.BigDecimal[] P09RC2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09RC2_A707PrdFacCon ;
   private String[] P09RC2_A718PrdNom ;
   private String[] P09RC3_A719PrdNum ;
   private String[] P09RC3_A396EmprCod ;
   private int[] P09RC3_A859CumCodCont ;
   private String[] P09RC3_A5862CumConLot ;
   private byte[] P09RC3_A8639CumUnidad ;
   private java.math.BigDecimal[] P09RC3_A860CumConCant ;
   private java.math.BigDecimal[] P09RC3_A685PrdCanRes ;
   private java.math.BigDecimal[] P09RC3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09RC3_A707PrdFacCon ;
   private String[] P09RC3_A718PrdNom ;
   private String[] P09RC4_A396EmprCod ;
   private int[] P09RC4_A859CumCodCont ;
   private String[] P09RC4_A5862CumConLot ;
   private byte[] P09RC4_A8639CumUnidad ;
   private java.math.BigDecimal[] P09RC4_A860CumConCant ;
   private java.math.BigDecimal[] P09RC4_A685PrdCanRes ;
   private java.math.BigDecimal[] P09RC4_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09RC4_A707PrdFacCon ;
   private String[] P09RC4_A718PrdNom ;
   private String[] P09RC4_A719PrdNum ;
   private GXSimpleCollection<String> AV28Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV31OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class salidaproductomanual_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A8639CumUnidad ,
                                          GXSimpleCollection<Byte> AV65Salidaproductomanual_wpds_13_tfcumunidad_sels ,
                                          String AV54Salidaproductomanual_wpds_2_tfprdnum_sel ,
                                          String AV53Salidaproductomanual_wpds_1_tfprdnum ,
                                          String AV56Salidaproductomanual_wpds_4_tfprdnom_sel ,
                                          String AV55Salidaproductomanual_wpds_3_tfprdnom ,
                                          java.math.BigDecimal AV57Salidaproductomanual_wpds_5_tfprdfaccon ,
                                          java.math.BigDecimal AV58Salidaproductomanual_wpds_6_tfprdfaccon_to ,
                                          java.math.BigDecimal AV59Salidaproductomanual_wpds_7_tfprdexialm ,
                                          java.math.BigDecimal AV60Salidaproductomanual_wpds_8_tfprdexialm_to ,
                                          java.math.BigDecimal AV61Salidaproductomanual_wpds_9_tfprdcanres ,
                                          java.math.BigDecimal AV62Salidaproductomanual_wpds_10_tfprdcanres_to ,
                                          java.math.BigDecimal AV63Salidaproductomanual_wpds_11_tfcumconcant ,
                                          java.math.BigDecimal AV64Salidaproductomanual_wpds_12_tfcumconcant_to ,
                                          int AV65Salidaproductomanual_wpds_13_tfcumunidad_sels_size ,
                                          String AV67Salidaproductomanual_wpds_15_tfcumconlot_sel ,
                                          String AV66Salidaproductomanual_wpds_14_tfcumconlot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A860CumConCant ,
                                          String A5862CumConLot ,
                                          String AV45Emprcod ,
                                          int AV46CumCodCont ,
                                          String A396EmprCod ,
                                          int A859CumCodCont )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CumCodCont, T1.EmprCod, T1.PrdNum, T1.CumConLot, T1.CumUnidad, T1.CumConCant, T2.PrdCanRes, T2.PrdExiAlm, T2.PrdFacCon, T2.PrdNom FROM (TXPLCUMCO T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CumCodCont = ?)");
      if ( (GXutil.strcmp("", AV54Salidaproductomanual_wpds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Salidaproductomanual_wpds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Salidaproductomanual_wpds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Salidaproductomanual_wpds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Salidaproductomanual_wpds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Salidaproductomanual_wpds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Salidaproductomanual_wpds_5_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Salidaproductomanual_wpds_6_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Salidaproductomanual_wpds_7_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Salidaproductomanual_wpds_8_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Salidaproductomanual_wpds_9_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Salidaproductomanual_wpds_10_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Salidaproductomanual_wpds_11_tfcumconcant)==0) )
      {
         addWhere(sWhereString, "(T1.CumConCant >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Salidaproductomanual_wpds_12_tfcumconcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.CumConCant <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV65Salidaproductomanual_wpds_13_tfcumunidad_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV65Salidaproductomanual_wpds_13_tfcumunidad_sels, "T1.CumUnidad IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV67Salidaproductomanual_wpds_15_tfcumconlot_sel)==0) && ( ! (GXutil.strcmp("", AV66Salidaproductomanual_wpds_14_tfcumconlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CumConLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Salidaproductomanual_wpds_15_tfcumconlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CumConLot = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CumCodCont, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09RC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A8639CumUnidad ,
                                          GXSimpleCollection<Byte> AV65Salidaproductomanual_wpds_13_tfcumunidad_sels ,
                                          String AV54Salidaproductomanual_wpds_2_tfprdnum_sel ,
                                          String AV53Salidaproductomanual_wpds_1_tfprdnum ,
                                          String AV56Salidaproductomanual_wpds_4_tfprdnom_sel ,
                                          String AV55Salidaproductomanual_wpds_3_tfprdnom ,
                                          java.math.BigDecimal AV57Salidaproductomanual_wpds_5_tfprdfaccon ,
                                          java.math.BigDecimal AV58Salidaproductomanual_wpds_6_tfprdfaccon_to ,
                                          java.math.BigDecimal AV59Salidaproductomanual_wpds_7_tfprdexialm ,
                                          java.math.BigDecimal AV60Salidaproductomanual_wpds_8_tfprdexialm_to ,
                                          java.math.BigDecimal AV61Salidaproductomanual_wpds_9_tfprdcanres ,
                                          java.math.BigDecimal AV62Salidaproductomanual_wpds_10_tfprdcanres_to ,
                                          java.math.BigDecimal AV63Salidaproductomanual_wpds_11_tfcumconcant ,
                                          java.math.BigDecimal AV64Salidaproductomanual_wpds_12_tfcumconcant_to ,
                                          int AV65Salidaproductomanual_wpds_13_tfcumunidad_sels_size ,
                                          String AV67Salidaproductomanual_wpds_15_tfcumconlot_sel ,
                                          String AV66Salidaproductomanual_wpds_14_tfcumconlot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A860CumConCant ,
                                          String A5862CumConLot ,
                                          int A859CumCodCont ,
                                          int AV46CumCodCont ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[16];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.CumCodCont, T1.CumConLot, T1.CumUnidad, T1.CumConCant, T2.PrdCanRes, T2.PrdExiAlm, T2.PrdFacCon, T2.PrdNom FROM (TXPLCUMCO T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CumCodCont = ?)");
      if ( (GXutil.strcmp("", AV54Salidaproductomanual_wpds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Salidaproductomanual_wpds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Salidaproductomanual_wpds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Salidaproductomanual_wpds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Salidaproductomanual_wpds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Salidaproductomanual_wpds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Salidaproductomanual_wpds_5_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Salidaproductomanual_wpds_6_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Salidaproductomanual_wpds_7_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Salidaproductomanual_wpds_8_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Salidaproductomanual_wpds_9_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Salidaproductomanual_wpds_10_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Salidaproductomanual_wpds_11_tfcumconcant)==0) )
      {
         addWhere(sWhereString, "(T1.CumConCant >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Salidaproductomanual_wpds_12_tfcumconcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.CumConCant <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( AV65Salidaproductomanual_wpds_13_tfcumunidad_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV65Salidaproductomanual_wpds_13_tfcumunidad_sels, "T1.CumUnidad IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV67Salidaproductomanual_wpds_15_tfcumconlot_sel)==0) && ( ! (GXutil.strcmp("", AV66Salidaproductomanual_wpds_14_tfcumconlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CumConLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Salidaproductomanual_wpds_15_tfcumconlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CumConLot = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09RC4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A8639CumUnidad ,
                                          GXSimpleCollection<Byte> AV65Salidaproductomanual_wpds_13_tfcumunidad_sels ,
                                          String AV54Salidaproductomanual_wpds_2_tfprdnum_sel ,
                                          String AV53Salidaproductomanual_wpds_1_tfprdnum ,
                                          String AV56Salidaproductomanual_wpds_4_tfprdnom_sel ,
                                          String AV55Salidaproductomanual_wpds_3_tfprdnom ,
                                          java.math.BigDecimal AV57Salidaproductomanual_wpds_5_tfprdfaccon ,
                                          java.math.BigDecimal AV58Salidaproductomanual_wpds_6_tfprdfaccon_to ,
                                          java.math.BigDecimal AV59Salidaproductomanual_wpds_7_tfprdexialm ,
                                          java.math.BigDecimal AV60Salidaproductomanual_wpds_8_tfprdexialm_to ,
                                          java.math.BigDecimal AV61Salidaproductomanual_wpds_9_tfprdcanres ,
                                          java.math.BigDecimal AV62Salidaproductomanual_wpds_10_tfprdcanres_to ,
                                          java.math.BigDecimal AV63Salidaproductomanual_wpds_11_tfcumconcant ,
                                          java.math.BigDecimal AV64Salidaproductomanual_wpds_12_tfcumconcant_to ,
                                          int AV65Salidaproductomanual_wpds_13_tfcumunidad_sels_size ,
                                          String AV67Salidaproductomanual_wpds_15_tfcumconlot_sel ,
                                          String AV66Salidaproductomanual_wpds_14_tfcumconlot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A860CumConCant ,
                                          String A5862CumConLot ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          int A859CumCodCont ,
                                          int AV46CumCodCont )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[16];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CumCodCont, T1.CumConLot, T1.CumUnidad, T1.CumConCant, T2.PrdCanRes, T2.PrdExiAlm, T2.PrdFacCon, T2.PrdNom, T1.PrdNum FROM (TXPLCUMCO T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CumCodCont = ?)");
      if ( (GXutil.strcmp("", AV54Salidaproductomanual_wpds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Salidaproductomanual_wpds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Salidaproductomanual_wpds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Salidaproductomanual_wpds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Salidaproductomanual_wpds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Salidaproductomanual_wpds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Salidaproductomanual_wpds_5_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Salidaproductomanual_wpds_6_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Salidaproductomanual_wpds_7_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Salidaproductomanual_wpds_8_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Salidaproductomanual_wpds_9_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Salidaproductomanual_wpds_10_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Salidaproductomanual_wpds_11_tfcumconcant)==0) )
      {
         addWhere(sWhereString, "(T1.CumConCant >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Salidaproductomanual_wpds_12_tfcumconcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.CumConCant <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( AV65Salidaproductomanual_wpds_13_tfcumunidad_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV65Salidaproductomanual_wpds_13_tfcumunidad_sels, "T1.CumUnidad IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV67Salidaproductomanual_wpds_15_tfcumconlot_sel)==0) && ( ! (GXutil.strcmp("", AV66Salidaproductomanual_wpds_14_tfcumconlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CumConLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Salidaproductomanual_wpds_15_tfcumconlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CumConLot = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CumConLot" ;
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
                  return conditional_P09RC2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() );
            case 1 :
                  return conditional_P09RC3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 2 :
                  return conditional_P09RC4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RC4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               return;
      }
   }

}

