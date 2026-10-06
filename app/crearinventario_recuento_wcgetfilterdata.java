package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class crearinventario_recuento_wcgetfilterdata extends GXProcedure
{
   public crearinventario_recuento_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crearinventario_recuento_wcgetfilterdata.class ), "" );
   }

   public crearinventario_recuento_wcgetfilterdata( int remoteHandle ,
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
      crearinventario_recuento_wcgetfilterdata.this.aP5 = new String[] {""};
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
      crearinventario_recuento_wcgetfilterdata.this.AV18DDOName = aP0;
      crearinventario_recuento_wcgetfilterdata.this.AV16SearchTxt = aP1;
      crearinventario_recuento_wcgetfilterdata.this.AV17SearchTxtTo = aP2;
      crearinventario_recuento_wcgetfilterdata.this.aP3 = aP3;
      crearinventario_recuento_wcgetfilterdata.this.aP4 = aP4;
      crearinventario_recuento_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_RECUBIC") == 0 )
      {
         /* Execute user subroutine: 'LOADRECUBICOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_RECLOT") == 0 )
      {
         /* Execute user subroutine: 'LOADRECLOTOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("CrearInventario_recuento_WCGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CrearInventario_recuento_WCGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("CrearInventario_recuento_WCGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV35TFRecExiTeo = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFRecExiTeo_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV37TFRecExiRea = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFRecExiRea_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV39TFRecPreRec = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFRecPreRec_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC") == 0 )
         {
            AV41TFRecUbic = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC_SEL") == 0 )
         {
            AV42TFRecUbic_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT") == 0 )
         {
            AV43TFRecLot = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT_SEL") == 0 )
         {
            AV44TFRecLot_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV46RecFec = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECHORA") == 0 )
         {
            AV47RecHora = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV16SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV52Crearinventario_recuento_wcds_1_filterfulltext = AV34FilterFullText ;
      AV53Crearinventario_recuento_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV54Crearinventario_recuento_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Crearinventario_recuento_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV56Crearinventario_recuento_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Crearinventario_recuento_wcds_6_tfrecexiteo = AV35TFRecExiTeo ;
      AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to = AV36TFRecExiTeo_To ;
      AV59Crearinventario_recuento_wcds_8_tfrecexirea = AV37TFRecExiRea ;
      AV60Crearinventario_recuento_wcds_9_tfrecexirea_to = AV38TFRecExiRea_To ;
      AV61Crearinventario_recuento_wcds_10_tfrecprerec = AV39TFRecPreRec ;
      AV62Crearinventario_recuento_wcds_11_tfrecprerec_to = AV40TFRecPreRec_To ;
      AV63Crearinventario_recuento_wcds_12_tfrecubic = AV41TFRecUbic ;
      AV64Crearinventario_recuento_wcds_13_tfrecubic_sel = AV42TFRecUbic_Sel ;
      AV65Crearinventario_recuento_wcds_14_tfreclot = AV43TFRecLot ;
      AV66Crearinventario_recuento_wcds_15_tfreclot_sel = AV44TFRecLot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                           AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                           AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                           AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                           AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                           AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                           AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                           AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                           AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                           AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                           AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                           AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                           AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                           AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                           AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           A11195RecUbic ,
                                           A12285RecLot ,
                                           A810RecFec ,
                                           AV46RecFec ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV53Crearinventario_recuento_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Crearinventario_recuento_wcds_2_tfprdnum), 6, "%") ;
      lV55Crearinventario_recuento_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Crearinventario_recuento_wcds_4_tfprdnom), 26, "%") ;
      lV63Crearinventario_recuento_wcds_12_tfrecubic = GXutil.padr( GXutil.rtrim( AV63Crearinventario_recuento_wcds_12_tfrecubic), 20, "%") ;
      lV65Crearinventario_recuento_wcds_14_tfreclot = GXutil.padr( GXutil.rtrim( AV65Crearinventario_recuento_wcds_14_tfreclot), 26, "%") ;
      /* Using cursor P093T2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, AV46RecFec, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV53Crearinventario_recuento_wcds_2_tfprdnum, AV54Crearinventario_recuento_wcds_3_tfprdnum_sel, lV55Crearinventario_recuento_wcds_4_tfprdnom, AV56Crearinventario_recuento_wcds_5_tfprdnom_sel, AV57Crearinventario_recuento_wcds_6_tfrecexiteo, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to, AV59Crearinventario_recuento_wcds_8_tfrecexirea, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to, AV61Crearinventario_recuento_wcds_10_tfrecprerec, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to, lV63Crearinventario_recuento_wcds_12_tfrecubic, AV64Crearinventario_recuento_wcds_13_tfrecubic_sel, lV65Crearinventario_recuento_wcds_14_tfreclot, AV66Crearinventario_recuento_wcds_15_tfreclot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk93T2 = false ;
         A396EmprCod = P093T2_A396EmprCod[0] ;
         A719PrdNum = P093T2_A719PrdNum[0] ;
         A810RecFec = P093T2_A810RecFec[0] ;
         A12285RecLot = P093T2_A12285RecLot[0] ;
         A11195RecUbic = P093T2_A11195RecUbic[0] ;
         A6573RecPreRec = P093T2_A6573RecPreRec[0] ;
         A807RecExiRea = P093T2_A807RecExiRea[0] ;
         A809RecExiTeo = P093T2_A809RecExiTeo[0] ;
         A718PrdNom = P093T2_A718PrdNom[0] ;
         A718PrdNom = P093T2_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P093T2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P093T2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk93T2 = false ;
            A810RecFec = P093T2_A810RecFec[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93T2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV20Option = A719PrdNum ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93T2 )
         {
            brk93T2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV16SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV52Crearinventario_recuento_wcds_1_filterfulltext = AV34FilterFullText ;
      AV53Crearinventario_recuento_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV54Crearinventario_recuento_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Crearinventario_recuento_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV56Crearinventario_recuento_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Crearinventario_recuento_wcds_6_tfrecexiteo = AV35TFRecExiTeo ;
      AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to = AV36TFRecExiTeo_To ;
      AV59Crearinventario_recuento_wcds_8_tfrecexirea = AV37TFRecExiRea ;
      AV60Crearinventario_recuento_wcds_9_tfrecexirea_to = AV38TFRecExiRea_To ;
      AV61Crearinventario_recuento_wcds_10_tfrecprerec = AV39TFRecPreRec ;
      AV62Crearinventario_recuento_wcds_11_tfrecprerec_to = AV40TFRecPreRec_To ;
      AV63Crearinventario_recuento_wcds_12_tfrecubic = AV41TFRecUbic ;
      AV64Crearinventario_recuento_wcds_13_tfrecubic_sel = AV42TFRecUbic_Sel ;
      AV65Crearinventario_recuento_wcds_14_tfreclot = AV43TFRecLot ;
      AV66Crearinventario_recuento_wcds_15_tfreclot_sel = AV44TFRecLot_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                           AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                           AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                           AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                           AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                           AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                           AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                           AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                           AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                           AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                           AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                           AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                           AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                           AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                           AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           A11195RecUbic ,
                                           A12285RecLot ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           A810RecFec ,
                                           AV46RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV53Crearinventario_recuento_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Crearinventario_recuento_wcds_2_tfprdnum), 6, "%") ;
      lV55Crearinventario_recuento_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Crearinventario_recuento_wcds_4_tfprdnom), 26, "%") ;
      lV63Crearinventario_recuento_wcds_12_tfrecubic = GXutil.padr( GXutil.rtrim( AV63Crearinventario_recuento_wcds_12_tfrecubic), 20, "%") ;
      lV65Crearinventario_recuento_wcds_14_tfreclot = GXutil.padr( GXutil.rtrim( AV65Crearinventario_recuento_wcds_14_tfreclot), 26, "%") ;
      /* Using cursor P093T3 */
      pr_default.execute(1, new Object[] {AV45Emprcod, AV46RecFec, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV53Crearinventario_recuento_wcds_2_tfprdnum, AV54Crearinventario_recuento_wcds_3_tfprdnum_sel, lV55Crearinventario_recuento_wcds_4_tfprdnom, AV56Crearinventario_recuento_wcds_5_tfprdnom_sel, AV57Crearinventario_recuento_wcds_6_tfrecexiteo, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to, AV59Crearinventario_recuento_wcds_8_tfrecexirea, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to, AV61Crearinventario_recuento_wcds_10_tfrecprerec, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to, lV63Crearinventario_recuento_wcds_12_tfrecubic, AV64Crearinventario_recuento_wcds_13_tfrecubic_sel, lV65Crearinventario_recuento_wcds_14_tfreclot, AV66Crearinventario_recuento_wcds_15_tfreclot_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk93T4 = false ;
         A396EmprCod = P093T3_A396EmprCod[0] ;
         A810RecFec = P093T3_A810RecFec[0] ;
         A718PrdNom = P093T3_A718PrdNom[0] ;
         A12285RecLot = P093T3_A12285RecLot[0] ;
         A11195RecUbic = P093T3_A11195RecUbic[0] ;
         A6573RecPreRec = P093T3_A6573RecPreRec[0] ;
         A807RecExiRea = P093T3_A807RecExiRea[0] ;
         A809RecExiTeo = P093T3_A809RecExiTeo[0] ;
         A719PrdNum = P093T3_A719PrdNum[0] ;
         A718PrdNom = P093T3_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P093T3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk93T4 = false ;
            A396EmprCod = P093T3_A396EmprCod[0] ;
            A810RecFec = P093T3_A810RecFec[0] ;
            A719PrdNum = P093T3_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93T4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV20Option = A718PrdNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93T4 )
         {
            brk93T4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADRECUBICOPTIONS' Routine */
      returnInSub = false ;
      AV41TFRecUbic = AV16SearchTxt ;
      AV42TFRecUbic_Sel = "" ;
      AV52Crearinventario_recuento_wcds_1_filterfulltext = AV34FilterFullText ;
      AV53Crearinventario_recuento_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV54Crearinventario_recuento_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Crearinventario_recuento_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV56Crearinventario_recuento_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Crearinventario_recuento_wcds_6_tfrecexiteo = AV35TFRecExiTeo ;
      AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to = AV36TFRecExiTeo_To ;
      AV59Crearinventario_recuento_wcds_8_tfrecexirea = AV37TFRecExiRea ;
      AV60Crearinventario_recuento_wcds_9_tfrecexirea_to = AV38TFRecExiRea_To ;
      AV61Crearinventario_recuento_wcds_10_tfrecprerec = AV39TFRecPreRec ;
      AV62Crearinventario_recuento_wcds_11_tfrecprerec_to = AV40TFRecPreRec_To ;
      AV63Crearinventario_recuento_wcds_12_tfrecubic = AV41TFRecUbic ;
      AV64Crearinventario_recuento_wcds_13_tfrecubic_sel = AV42TFRecUbic_Sel ;
      AV65Crearinventario_recuento_wcds_14_tfreclot = AV43TFRecLot ;
      AV66Crearinventario_recuento_wcds_15_tfreclot_sel = AV44TFRecLot_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                           AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                           AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                           AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                           AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                           AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                           AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                           AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                           AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                           AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                           AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                           AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                           AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                           AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                           AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           A11195RecUbic ,
                                           A12285RecLot ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           A810RecFec ,
                                           AV46RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV53Crearinventario_recuento_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Crearinventario_recuento_wcds_2_tfprdnum), 6, "%") ;
      lV55Crearinventario_recuento_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Crearinventario_recuento_wcds_4_tfprdnom), 26, "%") ;
      lV63Crearinventario_recuento_wcds_12_tfrecubic = GXutil.padr( GXutil.rtrim( AV63Crearinventario_recuento_wcds_12_tfrecubic), 20, "%") ;
      lV65Crearinventario_recuento_wcds_14_tfreclot = GXutil.padr( GXutil.rtrim( AV65Crearinventario_recuento_wcds_14_tfreclot), 26, "%") ;
      /* Using cursor P093T4 */
      pr_default.execute(2, new Object[] {AV45Emprcod, AV46RecFec, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV53Crearinventario_recuento_wcds_2_tfprdnum, AV54Crearinventario_recuento_wcds_3_tfprdnum_sel, lV55Crearinventario_recuento_wcds_4_tfprdnom, AV56Crearinventario_recuento_wcds_5_tfprdnom_sel, AV57Crearinventario_recuento_wcds_6_tfrecexiteo, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to, AV59Crearinventario_recuento_wcds_8_tfrecexirea, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to, AV61Crearinventario_recuento_wcds_10_tfrecprerec, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to, lV63Crearinventario_recuento_wcds_12_tfrecubic, AV64Crearinventario_recuento_wcds_13_tfrecubic_sel, lV65Crearinventario_recuento_wcds_14_tfreclot, AV66Crearinventario_recuento_wcds_15_tfreclot_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk93T6 = false ;
         A396EmprCod = P093T4_A396EmprCod[0] ;
         A810RecFec = P093T4_A810RecFec[0] ;
         A11195RecUbic = P093T4_A11195RecUbic[0] ;
         A12285RecLot = P093T4_A12285RecLot[0] ;
         A6573RecPreRec = P093T4_A6573RecPreRec[0] ;
         A807RecExiRea = P093T4_A807RecExiRea[0] ;
         A809RecExiTeo = P093T4_A809RecExiTeo[0] ;
         A718PrdNom = P093T4_A718PrdNom[0] ;
         A719PrdNum = P093T4_A719PrdNum[0] ;
         A718PrdNom = P093T4_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P093T4_A11195RecUbic[0], A11195RecUbic) == 0 ) )
         {
            brk93T6 = false ;
            A396EmprCod = P093T4_A396EmprCod[0] ;
            A810RecFec = P093T4_A810RecFec[0] ;
            A719PrdNum = P093T4_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93T6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A11195RecUbic)==0) )
         {
            AV20Option = A11195RecUbic ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93T6 )
         {
            brk93T6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADRECLOTOPTIONS' Routine */
      returnInSub = false ;
      AV43TFRecLot = AV16SearchTxt ;
      AV44TFRecLot_Sel = "" ;
      AV52Crearinventario_recuento_wcds_1_filterfulltext = AV34FilterFullText ;
      AV53Crearinventario_recuento_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV54Crearinventario_recuento_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV55Crearinventario_recuento_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV56Crearinventario_recuento_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV57Crearinventario_recuento_wcds_6_tfrecexiteo = AV35TFRecExiTeo ;
      AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to = AV36TFRecExiTeo_To ;
      AV59Crearinventario_recuento_wcds_8_tfrecexirea = AV37TFRecExiRea ;
      AV60Crearinventario_recuento_wcds_9_tfrecexirea_to = AV38TFRecExiRea_To ;
      AV61Crearinventario_recuento_wcds_10_tfrecprerec = AV39TFRecPreRec ;
      AV62Crearinventario_recuento_wcds_11_tfrecprerec_to = AV40TFRecPreRec_To ;
      AV63Crearinventario_recuento_wcds_12_tfrecubic = AV41TFRecUbic ;
      AV64Crearinventario_recuento_wcds_13_tfrecubic_sel = AV42TFRecUbic_Sel ;
      AV65Crearinventario_recuento_wcds_14_tfreclot = AV43TFRecLot ;
      AV66Crearinventario_recuento_wcds_15_tfreclot_sel = AV44TFRecLot_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                           AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                           AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                           AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                           AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                           AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                           AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                           AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                           AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                           AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                           AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                           AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                           AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                           AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                           AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           A11195RecUbic ,
                                           A12285RecLot ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           A810RecFec ,
                                           AV46RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV53Crearinventario_recuento_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Crearinventario_recuento_wcds_2_tfprdnum), 6, "%") ;
      lV55Crearinventario_recuento_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Crearinventario_recuento_wcds_4_tfprdnom), 26, "%") ;
      lV63Crearinventario_recuento_wcds_12_tfrecubic = GXutil.padr( GXutil.rtrim( AV63Crearinventario_recuento_wcds_12_tfrecubic), 20, "%") ;
      lV65Crearinventario_recuento_wcds_14_tfreclot = GXutil.padr( GXutil.rtrim( AV65Crearinventario_recuento_wcds_14_tfreclot), 26, "%") ;
      /* Using cursor P093T5 */
      pr_default.execute(3, new Object[] {AV45Emprcod, AV46RecFec, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV52Crearinventario_recuento_wcds_1_filterfulltext, lV53Crearinventario_recuento_wcds_2_tfprdnum, AV54Crearinventario_recuento_wcds_3_tfprdnum_sel, lV55Crearinventario_recuento_wcds_4_tfprdnom, AV56Crearinventario_recuento_wcds_5_tfprdnom_sel, AV57Crearinventario_recuento_wcds_6_tfrecexiteo, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to, AV59Crearinventario_recuento_wcds_8_tfrecexirea, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to, AV61Crearinventario_recuento_wcds_10_tfrecprerec, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to, lV63Crearinventario_recuento_wcds_12_tfrecubic, AV64Crearinventario_recuento_wcds_13_tfrecubic_sel, lV65Crearinventario_recuento_wcds_14_tfreclot, AV66Crearinventario_recuento_wcds_15_tfreclot_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk93T8 = false ;
         A396EmprCod = P093T5_A396EmprCod[0] ;
         A810RecFec = P093T5_A810RecFec[0] ;
         A12285RecLot = P093T5_A12285RecLot[0] ;
         A11195RecUbic = P093T5_A11195RecUbic[0] ;
         A6573RecPreRec = P093T5_A6573RecPreRec[0] ;
         A807RecExiRea = P093T5_A807RecExiRea[0] ;
         A809RecExiTeo = P093T5_A809RecExiTeo[0] ;
         A718PrdNom = P093T5_A718PrdNom[0] ;
         A719PrdNum = P093T5_A719PrdNum[0] ;
         A718PrdNom = P093T5_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P093T5_A12285RecLot[0], A12285RecLot) == 0 ) )
         {
            brk93T8 = false ;
            A396EmprCod = P093T5_A396EmprCod[0] ;
            A810RecFec = P093T5_A810RecFec[0] ;
            A719PrdNum = P093T5_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93T8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A12285RecLot)==0) )
         {
            AV20Option = A12285RecLot ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93T8 )
         {
            brk93T8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = crearinventario_recuento_wcgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = crearinventario_recuento_wcgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = crearinventario_recuento_wcgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV35TFRecExiTeo = DecimalUtil.ZERO ;
      AV36TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV37TFRecExiRea = DecimalUtil.ZERO ;
      AV38TFRecExiRea_To = DecimalUtil.ZERO ;
      AV39TFRecPreRec = DecimalUtil.ZERO ;
      AV40TFRecPreRec_To = DecimalUtil.ZERO ;
      AV41TFRecUbic = "" ;
      AV42TFRecUbic_Sel = "" ;
      AV43TFRecLot = "" ;
      AV44TFRecLot_Sel = "" ;
      AV45Emprcod = "" ;
      AV46RecFec = GXutil.nullDate() ;
      AV47RecHora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      AV52Crearinventario_recuento_wcds_1_filterfulltext = "" ;
      AV53Crearinventario_recuento_wcds_2_tfprdnum = "" ;
      AV54Crearinventario_recuento_wcds_3_tfprdnum_sel = "" ;
      AV55Crearinventario_recuento_wcds_4_tfprdnom = "" ;
      AV56Crearinventario_recuento_wcds_5_tfprdnom_sel = "" ;
      AV57Crearinventario_recuento_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV59Crearinventario_recuento_wcds_8_tfrecexirea = DecimalUtil.ZERO ;
      AV60Crearinventario_recuento_wcds_9_tfrecexirea_to = DecimalUtil.ZERO ;
      AV61Crearinventario_recuento_wcds_10_tfrecprerec = DecimalUtil.ZERO ;
      AV62Crearinventario_recuento_wcds_11_tfrecprerec_to = DecimalUtil.ZERO ;
      AV63Crearinventario_recuento_wcds_12_tfrecubic = "" ;
      AV64Crearinventario_recuento_wcds_13_tfrecubic_sel = "" ;
      AV65Crearinventario_recuento_wcds_14_tfreclot = "" ;
      AV66Crearinventario_recuento_wcds_15_tfreclot_sel = "" ;
      scmdbuf = "" ;
      lV52Crearinventario_recuento_wcds_1_filterfulltext = "" ;
      lV53Crearinventario_recuento_wcds_2_tfprdnum = "" ;
      lV55Crearinventario_recuento_wcds_4_tfprdnom = "" ;
      lV63Crearinventario_recuento_wcds_12_tfrecubic = "" ;
      lV65Crearinventario_recuento_wcds_14_tfreclot = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A12285RecLot = "" ;
      A810RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P093T2_A396EmprCod = new String[] {""} ;
      P093T2_A719PrdNum = new String[] {""} ;
      P093T2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093T2_A12285RecLot = new String[] {""} ;
      P093T2_A11195RecUbic = new String[] {""} ;
      P093T2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T2_A718PrdNom = new String[] {""} ;
      AV20Option = "" ;
      P093T3_A396EmprCod = new String[] {""} ;
      P093T3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093T3_A718PrdNom = new String[] {""} ;
      P093T3_A12285RecLot = new String[] {""} ;
      P093T3_A11195RecUbic = new String[] {""} ;
      P093T3_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T3_A719PrdNum = new String[] {""} ;
      P093T4_A396EmprCod = new String[] {""} ;
      P093T4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093T4_A11195RecUbic = new String[] {""} ;
      P093T4_A12285RecLot = new String[] {""} ;
      P093T4_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T4_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T4_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T4_A718PrdNom = new String[] {""} ;
      P093T4_A719PrdNum = new String[] {""} ;
      P093T5_A396EmprCod = new String[] {""} ;
      P093T5_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093T5_A12285RecLot = new String[] {""} ;
      P093T5_A11195RecUbic = new String[] {""} ;
      P093T5_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T5_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T5_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093T5_A718PrdNom = new String[] {""} ;
      P093T5_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.crearinventario_recuento_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P093T2_A396EmprCod, P093T2_A719PrdNum, P093T2_A810RecFec, P093T2_A12285RecLot, P093T2_A11195RecUbic, P093T2_A6573RecPreRec, P093T2_A807RecExiRea, P093T2_A809RecExiTeo, P093T2_A718PrdNom
            }
            , new Object[] {
            P093T3_A396EmprCod, P093T3_A810RecFec, P093T3_A718PrdNom, P093T3_A12285RecLot, P093T3_A11195RecUbic, P093T3_A6573RecPreRec, P093T3_A807RecExiRea, P093T3_A809RecExiTeo, P093T3_A719PrdNum
            }
            , new Object[] {
            P093T4_A396EmprCod, P093T4_A810RecFec, P093T4_A11195RecUbic, P093T4_A12285RecLot, P093T4_A6573RecPreRec, P093T4_A807RecExiRea, P093T4_A809RecExiTeo, P093T4_A718PrdNom, P093T4_A719PrdNum
            }
            , new Object[] {
            P093T5_A396EmprCod, P093T5_A810RecFec, P093T5_A12285RecLot, P093T5_A11195RecUbic, P093T5_A6573RecPreRec, P093T5_A807RecExiRea, P093T5_A809RecExiTeo, P093T5_A718PrdNom, P093T5_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV50GXV1 ;
   private long AV28count ;
   private java.math.BigDecimal AV35TFRecExiTeo ;
   private java.math.BigDecimal AV36TFRecExiTeo_To ;
   private java.math.BigDecimal AV37TFRecExiRea ;
   private java.math.BigDecimal AV38TFRecExiRea_To ;
   private java.math.BigDecimal AV39TFRecPreRec ;
   private java.math.BigDecimal AV40TFRecPreRec_To ;
   private java.math.BigDecimal AV57Crearinventario_recuento_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV59Crearinventario_recuento_wcds_8_tfrecexirea ;
   private java.math.BigDecimal AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ;
   private java.math.BigDecimal AV61Crearinventario_recuento_wcds_10_tfrecprerec ;
   private java.math.BigDecimal AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV41TFRecUbic ;
   private String AV42TFRecUbic_Sel ;
   private String AV43TFRecLot ;
   private String AV44TFRecLot_Sel ;
   private String AV45Emprcod ;
   private String A719PrdNum ;
   private String AV53Crearinventario_recuento_wcds_2_tfprdnum ;
   private String AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ;
   private String AV55Crearinventario_recuento_wcds_4_tfprdnom ;
   private String AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ;
   private String AV63Crearinventario_recuento_wcds_12_tfrecubic ;
   private String AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ;
   private String AV65Crearinventario_recuento_wcds_14_tfreclot ;
   private String AV66Crearinventario_recuento_wcds_15_tfreclot_sel ;
   private String scmdbuf ;
   private String lV53Crearinventario_recuento_wcds_2_tfprdnum ;
   private String lV55Crearinventario_recuento_wcds_4_tfprdnom ;
   private String lV63Crearinventario_recuento_wcds_12_tfrecubic ;
   private String lV65Crearinventario_recuento_wcds_14_tfreclot ;
   private String A718PrdNom ;
   private String A11195RecUbic ;
   private String A12285RecLot ;
   private String A396EmprCod ;
   private java.util.Date AV47RecHora ;
   private java.util.Date AV46RecFec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean brk93T2 ;
   private boolean brk93T4 ;
   private boolean brk93T6 ;
   private boolean brk93T8 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV52Crearinventario_recuento_wcds_1_filterfulltext ;
   private String lV52Crearinventario_recuento_wcds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P093T2_A396EmprCod ;
   private String[] P093T2_A719PrdNum ;
   private java.util.Date[] P093T2_A810RecFec ;
   private String[] P093T2_A12285RecLot ;
   private String[] P093T2_A11195RecUbic ;
   private java.math.BigDecimal[] P093T2_A6573RecPreRec ;
   private java.math.BigDecimal[] P093T2_A807RecExiRea ;
   private java.math.BigDecimal[] P093T2_A809RecExiTeo ;
   private String[] P093T2_A718PrdNom ;
   private String[] P093T3_A396EmprCod ;
   private java.util.Date[] P093T3_A810RecFec ;
   private String[] P093T3_A718PrdNom ;
   private String[] P093T3_A12285RecLot ;
   private String[] P093T3_A11195RecUbic ;
   private java.math.BigDecimal[] P093T3_A6573RecPreRec ;
   private java.math.BigDecimal[] P093T3_A807RecExiRea ;
   private java.math.BigDecimal[] P093T3_A809RecExiTeo ;
   private String[] P093T3_A719PrdNum ;
   private String[] P093T4_A396EmprCod ;
   private java.util.Date[] P093T4_A810RecFec ;
   private String[] P093T4_A11195RecUbic ;
   private String[] P093T4_A12285RecLot ;
   private java.math.BigDecimal[] P093T4_A6573RecPreRec ;
   private java.math.BigDecimal[] P093T4_A807RecExiRea ;
   private java.math.BigDecimal[] P093T4_A809RecExiTeo ;
   private String[] P093T4_A718PrdNom ;
   private String[] P093T4_A719PrdNum ;
   private String[] P093T5_A396EmprCod ;
   private java.util.Date[] P093T5_A810RecFec ;
   private String[] P093T5_A12285RecLot ;
   private String[] P093T5_A11195RecUbic ;
   private java.math.BigDecimal[] P093T5_A6573RecPreRec ;
   private java.math.BigDecimal[] P093T5_A807RecExiRea ;
   private java.math.BigDecimal[] P093T5_A809RecExiTeo ;
   private String[] P093T5_A718PrdNom ;
   private String[] P093T5_A719PrdNum ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class crearinventario_recuento_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                          String AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                          String AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                          String AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                          String AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                          java.math.BigDecimal AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                          java.math.BigDecimal AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                          java.math.BigDecimal AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                          String AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                          String AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                          String AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                          String AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String A11195RecUbic ,
                                          String A12285RecLot ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV46RecFec ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T1.RecLot, T1.RecUbic, T1.RecPreRec, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV52Crearinventario_recuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T1.RecUbic) like '%' || UPPER(?)) or ( UPPER(T1.RecLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Crearinventario_recuento_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Crearinventario_recuento_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Crearinventario_recuento_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Crearinventario_recuento_wcds_8_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Crearinventario_recuento_wcds_10_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV63Crearinventario_recuento_wcds_12_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUbic = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV65Crearinventario_recuento_wcds_14_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLot = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P093T3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                          String AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                          String AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                          String AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                          String AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                          java.math.BigDecimal AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                          java.math.BigDecimal AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                          java.math.BigDecimal AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                          String AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                          String AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                          String AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                          String AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String A11195RecUbic ,
                                          String A12285RecLot ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV46RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[23];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T2.PrdNom, T1.RecLot, T1.RecUbic, T1.RecPreRec, T1.RecExiRea, T1.RecExiTeo, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV52Crearinventario_recuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T1.RecUbic) like '%' || UPPER(?)) or ( UPPER(T1.RecLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Crearinventario_recuento_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Crearinventario_recuento_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Crearinventario_recuento_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Crearinventario_recuento_wcds_8_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Crearinventario_recuento_wcds_10_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV63Crearinventario_recuento_wcds_12_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUbic = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV65Crearinventario_recuento_wcds_14_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLot = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P093T4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                          String AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                          String AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                          String AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                          String AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                          java.math.BigDecimal AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                          java.math.BigDecimal AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                          java.math.BigDecimal AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                          String AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                          String AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                          String AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                          String AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String A11195RecUbic ,
                                          String A12285RecLot ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV46RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T1.RecUbic, T1.RecLot, T1.RecPreRec, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV52Crearinventario_recuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T1.RecUbic) like '%' || UPPER(?)) or ( UPPER(T1.RecLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Crearinventario_recuento_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Crearinventario_recuento_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Crearinventario_recuento_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Crearinventario_recuento_wcds_8_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Crearinventario_recuento_wcds_10_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV63Crearinventario_recuento_wcds_12_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUbic = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV65Crearinventario_recuento_wcds_14_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLot = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecUbic" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P093T5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Crearinventario_recuento_wcds_1_filterfulltext ,
                                          String AV54Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                          String AV53Crearinventario_recuento_wcds_2_tfprdnum ,
                                          String AV56Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                          String AV55Crearinventario_recuento_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV57Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV59Crearinventario_recuento_wcds_8_tfrecexirea ,
                                          java.math.BigDecimal AV60Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                          java.math.BigDecimal AV61Crearinventario_recuento_wcds_10_tfrecprerec ,
                                          java.math.BigDecimal AV62Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                          String AV64Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                          String AV63Crearinventario_recuento_wcds_12_tfrecubic ,
                                          String AV66Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                          String AV65Crearinventario_recuento_wcds_14_tfreclot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String A11195RecUbic ,
                                          String A12285RecLot ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV46RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[23];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T1.RecLot, T1.RecUbic, T1.RecPreRec, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV52Crearinventario_recuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T1.RecUbic) like '%' || UPPER(?)) or ( UPPER(T1.RecLot) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Crearinventario_recuento_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Crearinventario_recuento_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Crearinventario_recuento_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Crearinventario_recuento_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Crearinventario_recuento_wcds_8_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Crearinventario_recuento_wcds_9_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Crearinventario_recuento_wcds_10_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Crearinventario_recuento_wcds_11_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV63Crearinventario_recuento_wcds_12_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUbic = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV65Crearinventario_recuento_wcds_14_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Crearinventario_recuento_wcds_15_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLot = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecLot" ;
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
                  return conditional_P093T2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
            case 1 :
                  return conditional_P093T3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
            case 2 :
                  return conditional_P093T4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
            case 3 :
                  return conditional_P093T5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093T3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093T4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093T5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               return;
      }
   }

}

