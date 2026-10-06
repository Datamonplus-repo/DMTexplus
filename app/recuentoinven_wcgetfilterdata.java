package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuentoinven_wcgetfilterdata extends GXProcedure
{
   public recuentoinven_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuentoinven_wcgetfilterdata.class ), "" );
   }

   public recuentoinven_wcgetfilterdata( int remoteHandle ,
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
      recuentoinven_wcgetfilterdata.this.aP5 = new String[] {""};
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
      recuentoinven_wcgetfilterdata.this.AV24DDOName = aP0;
      recuentoinven_wcgetfilterdata.this.AV22SearchTxt = aP1;
      recuentoinven_wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      recuentoinven_wcgetfilterdata.this.aP3 = aP3;
      recuentoinven_wcgetfilterdata.this.aP4 = aP4;
      recuentoinven_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_METDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMETDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("RecuentoInven_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecuentoInven_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("RecuentoInven_WCGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV14TFPrvNum = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFPrvNum_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV16TFPrvNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV17TFPrvNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETCOD") == 0 )
         {
            AV18TFMetCod = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMetCod_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC") == 0 )
         {
            AV20TFMetDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC_SEL") == 0 )
         {
            AV21TFMetDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV22SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV50Recuentoinven_wcds_1_filterfulltext = AV40FilterFullText ;
      AV51Recuentoinven_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV52Recuentoinven_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Recuentoinven_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV54Recuentoinven_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Recuentoinven_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV56Recuentoinven_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV57Recuentoinven_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV58Recuentoinven_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV59Recuentoinven_wcds_10_tfmetcod = AV18TFMetCod ;
      AV60Recuentoinven_wcds_11_tfmetcod_to = AV19TFMetCod_To ;
      AV61Recuentoinven_wcds_12_tfmetdsc = AV20TFMetDsc ;
      AV62Recuentoinven_wcds_13_tfmetdsc_sel = AV21TFMetDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Recuentoinven_wcds_1_filterfulltext ,
                                           AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                           AV51Recuentoinven_wcds_2_tfprdnum ,
                                           AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                           AV53Recuentoinven_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to) ,
                                           AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                           AV57Recuentoinven_wcds_8_tfprvnom ,
                                           Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod) ,
                                           Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to) ,
                                           AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                           AV61Recuentoinven_wcds_12_tfmetdsc ,
                                           AV41EmprCod ,
                                           AV42PrdNumFrom ,
                                           AV43PrdNumTo ,
                                           Integer.valueOf(AV44PrvNumFrom) ,
                                           Integer.valueOf(AV45PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Byte.valueOf(A629MetCod) ,
                                           A630MetDsc ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV51Recuentoinven_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Recuentoinven_wcds_2_tfprdnum), 6, "%") ;
      lV53Recuentoinven_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Recuentoinven_wcds_4_tfprdnom), 26, "%") ;
      lV57Recuentoinven_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV57Recuentoinven_wcds_8_tfprvnom), 30, "%") ;
      lV61Recuentoinven_wcds_12_tfmetdsc = GXutil.padr( GXutil.rtrim( AV61Recuentoinven_wcds_12_tfmetdsc), 8, "%") ;
      /* Using cursor P09FG2 */
      pr_default.execute(0, new Object[] {lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV51Recuentoinven_wcds_2_tfprdnum, AV52Recuentoinven_wcds_3_tfprdnum_sel, lV53Recuentoinven_wcds_4_tfprdnom, AV54Recuentoinven_wcds_5_tfprdnom_sel, Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum), Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to), lV57Recuentoinven_wcds_8_tfprvnom, AV58Recuentoinven_wcds_9_tfprvnom_sel, Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod), Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to), lV61Recuentoinven_wcds_12_tfmetdsc, AV62Recuentoinven_wcds_13_tfmetdsc_sel, AV41EmprCod, AV42PrdNumFrom, AV43PrdNumTo, Integer.valueOf(AV44PrvNumFrom), Integer.valueOf(AV45PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9FG2 = false ;
         A719PrdNum = P09FG2_A719PrdNum[0] ;
         A396EmprCod = P09FG2_A396EmprCod[0] ;
         A630MetDsc = P09FG2_A630MetDsc[0] ;
         n630MetDsc = P09FG2_n630MetDsc[0] ;
         A629MetCod = P09FG2_A629MetCod[0] ;
         n629MetCod = P09FG2_n629MetCod[0] ;
         A794PrvNom = P09FG2_A794PrvNom[0] ;
         n794PrvNom = P09FG2_n794PrvNom[0] ;
         A795PrvNum = P09FG2_A795PrvNum[0] ;
         A718PrdNom = P09FG2_A718PrdNom[0] ;
         A630MetDsc = P09FG2_A630MetDsc[0] ;
         n630MetDsc = P09FG2_n630MetDsc[0] ;
         A794PrvNom = P09FG2_A794PrvNom[0] ;
         n794PrvNom = P09FG2_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09FG2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9FG2 = false ;
            A396EmprCod = P09FG2_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9FG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV26Option = A719PrdNum ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FG2 )
         {
            brk9FG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV22SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV50Recuentoinven_wcds_1_filterfulltext = AV40FilterFullText ;
      AV51Recuentoinven_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV52Recuentoinven_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Recuentoinven_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV54Recuentoinven_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Recuentoinven_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV56Recuentoinven_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV57Recuentoinven_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV58Recuentoinven_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV59Recuentoinven_wcds_10_tfmetcod = AV18TFMetCod ;
      AV60Recuentoinven_wcds_11_tfmetcod_to = AV19TFMetCod_To ;
      AV61Recuentoinven_wcds_12_tfmetdsc = AV20TFMetDsc ;
      AV62Recuentoinven_wcds_13_tfmetdsc_sel = AV21TFMetDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Recuentoinven_wcds_1_filterfulltext ,
                                           AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                           AV51Recuentoinven_wcds_2_tfprdnum ,
                                           AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                           AV53Recuentoinven_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to) ,
                                           AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                           AV57Recuentoinven_wcds_8_tfprvnom ,
                                           Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod) ,
                                           Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to) ,
                                           AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                           AV61Recuentoinven_wcds_12_tfmetdsc ,
                                           AV41EmprCod ,
                                           AV42PrdNumFrom ,
                                           AV43PrdNumTo ,
                                           Integer.valueOf(AV44PrvNumFrom) ,
                                           Integer.valueOf(AV45PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Byte.valueOf(A629MetCod) ,
                                           A630MetDsc ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV51Recuentoinven_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Recuentoinven_wcds_2_tfprdnum), 6, "%") ;
      lV53Recuentoinven_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Recuentoinven_wcds_4_tfprdnom), 26, "%") ;
      lV57Recuentoinven_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV57Recuentoinven_wcds_8_tfprvnom), 30, "%") ;
      lV61Recuentoinven_wcds_12_tfmetdsc = GXutil.padr( GXutil.rtrim( AV61Recuentoinven_wcds_12_tfmetdsc), 8, "%") ;
      /* Using cursor P09FG3 */
      pr_default.execute(1, new Object[] {lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV51Recuentoinven_wcds_2_tfprdnum, AV52Recuentoinven_wcds_3_tfprdnum_sel, lV53Recuentoinven_wcds_4_tfprdnom, AV54Recuentoinven_wcds_5_tfprdnom_sel, Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum), Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to), lV57Recuentoinven_wcds_8_tfprvnom, AV58Recuentoinven_wcds_9_tfprvnom_sel, Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod), Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to), lV61Recuentoinven_wcds_12_tfmetdsc, AV62Recuentoinven_wcds_13_tfmetdsc_sel, AV41EmprCod, AV42PrdNumFrom, AV43PrdNumTo, Integer.valueOf(AV44PrvNumFrom), Integer.valueOf(AV45PrvNumTo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9FG4 = false ;
         A718PrdNom = P09FG3_A718PrdNom[0] ;
         A396EmprCod = P09FG3_A396EmprCod[0] ;
         A630MetDsc = P09FG3_A630MetDsc[0] ;
         n630MetDsc = P09FG3_n630MetDsc[0] ;
         A629MetCod = P09FG3_A629MetCod[0] ;
         n629MetCod = P09FG3_n629MetCod[0] ;
         A794PrvNom = P09FG3_A794PrvNom[0] ;
         n794PrvNom = P09FG3_n794PrvNom[0] ;
         A795PrvNum = P09FG3_A795PrvNum[0] ;
         A719PrdNum = P09FG3_A719PrdNum[0] ;
         A630MetDsc = P09FG3_A630MetDsc[0] ;
         n630MetDsc = P09FG3_n630MetDsc[0] ;
         A794PrvNom = P09FG3_A794PrvNom[0] ;
         n794PrvNom = P09FG3_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09FG3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk9FG4 = false ;
            A396EmprCod = P09FG3_A396EmprCod[0] ;
            A719PrdNum = P09FG3_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9FG4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV26Option = A718PrdNom ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FG4 )
         {
            brk9FG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrvNom = AV22SearchTxt ;
      AV17TFPrvNom_Sel = "" ;
      AV50Recuentoinven_wcds_1_filterfulltext = AV40FilterFullText ;
      AV51Recuentoinven_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV52Recuentoinven_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Recuentoinven_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV54Recuentoinven_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Recuentoinven_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV56Recuentoinven_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV57Recuentoinven_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV58Recuentoinven_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV59Recuentoinven_wcds_10_tfmetcod = AV18TFMetCod ;
      AV60Recuentoinven_wcds_11_tfmetcod_to = AV19TFMetCod_To ;
      AV61Recuentoinven_wcds_12_tfmetdsc = AV20TFMetDsc ;
      AV62Recuentoinven_wcds_13_tfmetdsc_sel = AV21TFMetDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV50Recuentoinven_wcds_1_filterfulltext ,
                                           AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                           AV51Recuentoinven_wcds_2_tfprdnum ,
                                           AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                           AV53Recuentoinven_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to) ,
                                           AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                           AV57Recuentoinven_wcds_8_tfprvnom ,
                                           Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod) ,
                                           Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to) ,
                                           AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                           AV61Recuentoinven_wcds_12_tfmetdsc ,
                                           AV41EmprCod ,
                                           AV42PrdNumFrom ,
                                           AV43PrdNumTo ,
                                           Integer.valueOf(AV44PrvNumFrom) ,
                                           Integer.valueOf(AV45PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Byte.valueOf(A629MetCod) ,
                                           A630MetDsc ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV51Recuentoinven_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Recuentoinven_wcds_2_tfprdnum), 6, "%") ;
      lV53Recuentoinven_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Recuentoinven_wcds_4_tfprdnom), 26, "%") ;
      lV57Recuentoinven_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV57Recuentoinven_wcds_8_tfprvnom), 30, "%") ;
      lV61Recuentoinven_wcds_12_tfmetdsc = GXutil.padr( GXutil.rtrim( AV61Recuentoinven_wcds_12_tfmetdsc), 8, "%") ;
      /* Using cursor P09FG4 */
      pr_default.execute(2, new Object[] {lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV51Recuentoinven_wcds_2_tfprdnum, AV52Recuentoinven_wcds_3_tfprdnum_sel, lV53Recuentoinven_wcds_4_tfprdnom, AV54Recuentoinven_wcds_5_tfprdnom_sel, Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum), Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to), lV57Recuentoinven_wcds_8_tfprvnom, AV58Recuentoinven_wcds_9_tfprvnom_sel, Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod), Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to), lV61Recuentoinven_wcds_12_tfmetdsc, AV62Recuentoinven_wcds_13_tfmetdsc_sel, AV41EmprCod, AV42PrdNumFrom, AV43PrdNumTo, Integer.valueOf(AV44PrvNumFrom), Integer.valueOf(AV45PrvNumTo)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9FG6 = false ;
         A795PrvNum = P09FG4_A795PrvNum[0] ;
         A396EmprCod = P09FG4_A396EmprCod[0] ;
         A630MetDsc = P09FG4_A630MetDsc[0] ;
         n630MetDsc = P09FG4_n630MetDsc[0] ;
         A629MetCod = P09FG4_A629MetCod[0] ;
         n629MetCod = P09FG4_n629MetCod[0] ;
         A794PrvNom = P09FG4_A794PrvNom[0] ;
         n794PrvNom = P09FG4_n794PrvNom[0] ;
         A718PrdNom = P09FG4_A718PrdNom[0] ;
         A719PrdNum = P09FG4_A719PrdNum[0] ;
         A794PrvNom = P09FG4_A794PrvNom[0] ;
         n794PrvNom = P09FG4_n794PrvNom[0] ;
         A630MetDsc = P09FG4_A630MetDsc[0] ;
         n630MetDsc = P09FG4_n630MetDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09FG4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09FG4_A795PrvNum[0] == A795PrvNum ) )
         {
            brk9FG6 = false ;
            A719PrdNum = P09FG4_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9FG6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
         {
            AV26Option = A794PrvNom ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            AV27Options.add(AV26Option, AV25InsertIndex);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FG6 )
         {
            brk9FG6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMETDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMetDsc = AV22SearchTxt ;
      AV21TFMetDsc_Sel = "" ;
      AV50Recuentoinven_wcds_1_filterfulltext = AV40FilterFullText ;
      AV51Recuentoinven_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV52Recuentoinven_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV53Recuentoinven_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV54Recuentoinven_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV55Recuentoinven_wcds_6_tfprvnum = AV14TFPrvNum ;
      AV56Recuentoinven_wcds_7_tfprvnum_to = AV15TFPrvNum_To ;
      AV57Recuentoinven_wcds_8_tfprvnom = AV16TFPrvNom ;
      AV58Recuentoinven_wcds_9_tfprvnom_sel = AV17TFPrvNom_Sel ;
      AV59Recuentoinven_wcds_10_tfmetcod = AV18TFMetCod ;
      AV60Recuentoinven_wcds_11_tfmetcod_to = AV19TFMetCod_To ;
      AV61Recuentoinven_wcds_12_tfmetdsc = AV20TFMetDsc ;
      AV62Recuentoinven_wcds_13_tfmetdsc_sel = AV21TFMetDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV50Recuentoinven_wcds_1_filterfulltext ,
                                           AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                           AV51Recuentoinven_wcds_2_tfprdnum ,
                                           AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                           AV53Recuentoinven_wcds_4_tfprdnom ,
                                           Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum) ,
                                           Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to) ,
                                           AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                           AV57Recuentoinven_wcds_8_tfprvnom ,
                                           Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod) ,
                                           Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to) ,
                                           AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                           AV61Recuentoinven_wcds_12_tfmetdsc ,
                                           AV41EmprCod ,
                                           AV42PrdNumFrom ,
                                           AV43PrdNumTo ,
                                           Integer.valueOf(AV44PrvNumFrom) ,
                                           Integer.valueOf(AV45PrvNumTo) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Byte.valueOf(A629MetCod) ,
                                           A630MetDsc ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV50Recuentoinven_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Recuentoinven_wcds_1_filterfulltext), "%", "") ;
      lV51Recuentoinven_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV51Recuentoinven_wcds_2_tfprdnum), 6, "%") ;
      lV53Recuentoinven_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV53Recuentoinven_wcds_4_tfprdnom), 26, "%") ;
      lV57Recuentoinven_wcds_8_tfprvnom = GXutil.padr( GXutil.rtrim( AV57Recuentoinven_wcds_8_tfprvnom), 30, "%") ;
      lV61Recuentoinven_wcds_12_tfmetdsc = GXutil.padr( GXutil.rtrim( AV61Recuentoinven_wcds_12_tfmetdsc), 8, "%") ;
      /* Using cursor P09FG5 */
      pr_default.execute(3, new Object[] {lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV50Recuentoinven_wcds_1_filterfulltext, lV51Recuentoinven_wcds_2_tfprdnum, AV52Recuentoinven_wcds_3_tfprdnum_sel, lV53Recuentoinven_wcds_4_tfprdnom, AV54Recuentoinven_wcds_5_tfprdnom_sel, Integer.valueOf(AV55Recuentoinven_wcds_6_tfprvnum), Integer.valueOf(AV56Recuentoinven_wcds_7_tfprvnum_to), lV57Recuentoinven_wcds_8_tfprvnom, AV58Recuentoinven_wcds_9_tfprvnom_sel, Byte.valueOf(AV59Recuentoinven_wcds_10_tfmetcod), Byte.valueOf(AV60Recuentoinven_wcds_11_tfmetcod_to), lV61Recuentoinven_wcds_12_tfmetdsc, AV62Recuentoinven_wcds_13_tfmetdsc_sel, AV41EmprCod, AV42PrdNumFrom, AV43PrdNumTo, Integer.valueOf(AV44PrvNumFrom), Integer.valueOf(AV45PrvNumTo)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9FG8 = false ;
         A629MetCod = P09FG5_A629MetCod[0] ;
         n629MetCod = P09FG5_n629MetCod[0] ;
         A396EmprCod = P09FG5_A396EmprCod[0] ;
         A630MetDsc = P09FG5_A630MetDsc[0] ;
         n630MetDsc = P09FG5_n630MetDsc[0] ;
         A794PrvNom = P09FG5_A794PrvNom[0] ;
         n794PrvNom = P09FG5_n794PrvNom[0] ;
         A795PrvNum = P09FG5_A795PrvNum[0] ;
         A718PrdNom = P09FG5_A718PrdNom[0] ;
         A719PrdNum = P09FG5_A719PrdNum[0] ;
         A630MetDsc = P09FG5_A630MetDsc[0] ;
         n630MetDsc = P09FG5_n630MetDsc[0] ;
         A794PrvNom = P09FG5_A794PrvNom[0] ;
         n794PrvNom = P09FG5_n794PrvNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09FG5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09FG5_A629MetCod[0] == A629MetCod ) )
         {
            brk9FG8 = false ;
            A719PrdNum = P09FG5_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9FG8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A630MetDsc)==0) )
         {
            AV26Option = A630MetDsc ;
            AV25InsertIndex = 1 ;
            while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
            {
               AV25InsertIndex = (int)(AV25InsertIndex+1) ;
            }
            AV27Options.add(AV26Option, AV25InsertIndex);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FG8 )
         {
            brk9FG8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recuentoinven_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = recuentoinven_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = recuentoinven_wcgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV16TFPrvNom = "" ;
      AV17TFPrvNom_Sel = "" ;
      AV20TFMetDsc = "" ;
      AV21TFMetDsc_Sel = "" ;
      A719PrdNum = "" ;
      AV50Recuentoinven_wcds_1_filterfulltext = "" ;
      AV51Recuentoinven_wcds_2_tfprdnum = "" ;
      AV52Recuentoinven_wcds_3_tfprdnum_sel = "" ;
      AV53Recuentoinven_wcds_4_tfprdnom = "" ;
      AV54Recuentoinven_wcds_5_tfprdnom_sel = "" ;
      AV57Recuentoinven_wcds_8_tfprvnom = "" ;
      AV58Recuentoinven_wcds_9_tfprvnom_sel = "" ;
      AV61Recuentoinven_wcds_12_tfmetdsc = "" ;
      AV62Recuentoinven_wcds_13_tfmetdsc_sel = "" ;
      scmdbuf = "" ;
      lV50Recuentoinven_wcds_1_filterfulltext = "" ;
      lV51Recuentoinven_wcds_2_tfprdnum = "" ;
      lV53Recuentoinven_wcds_4_tfprdnom = "" ;
      lV57Recuentoinven_wcds_8_tfprvnom = "" ;
      lV61Recuentoinven_wcds_12_tfmetdsc = "" ;
      AV41EmprCod = "" ;
      AV42PrdNumFrom = "" ;
      AV43PrdNumTo = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A630MetDsc = "" ;
      A396EmprCod = "" ;
      P09FG2_A719PrdNum = new String[] {""} ;
      P09FG2_A396EmprCod = new String[] {""} ;
      P09FG2_A630MetDsc = new String[] {""} ;
      P09FG2_n630MetDsc = new boolean[] {false} ;
      P09FG2_A629MetCod = new byte[1] ;
      P09FG2_n629MetCod = new boolean[] {false} ;
      P09FG2_A794PrvNom = new String[] {""} ;
      P09FG2_n794PrvNom = new boolean[] {false} ;
      P09FG2_A795PrvNum = new int[1] ;
      P09FG2_A718PrdNom = new String[] {""} ;
      AV26Option = "" ;
      P09FG3_A718PrdNom = new String[] {""} ;
      P09FG3_A396EmprCod = new String[] {""} ;
      P09FG3_A630MetDsc = new String[] {""} ;
      P09FG3_n630MetDsc = new boolean[] {false} ;
      P09FG3_A629MetCod = new byte[1] ;
      P09FG3_n629MetCod = new boolean[] {false} ;
      P09FG3_A794PrvNom = new String[] {""} ;
      P09FG3_n794PrvNom = new boolean[] {false} ;
      P09FG3_A795PrvNum = new int[1] ;
      P09FG3_A719PrdNum = new String[] {""} ;
      P09FG4_A795PrvNum = new int[1] ;
      P09FG4_A396EmprCod = new String[] {""} ;
      P09FG4_A630MetDsc = new String[] {""} ;
      P09FG4_n630MetDsc = new boolean[] {false} ;
      P09FG4_A629MetCod = new byte[1] ;
      P09FG4_n629MetCod = new boolean[] {false} ;
      P09FG4_A794PrvNom = new String[] {""} ;
      P09FG4_n794PrvNom = new boolean[] {false} ;
      P09FG4_A718PrdNom = new String[] {""} ;
      P09FG4_A719PrdNum = new String[] {""} ;
      P09FG5_A629MetCod = new byte[1] ;
      P09FG5_n629MetCod = new boolean[] {false} ;
      P09FG5_A396EmprCod = new String[] {""} ;
      P09FG5_A630MetDsc = new String[] {""} ;
      P09FG5_n630MetDsc = new boolean[] {false} ;
      P09FG5_A794PrvNom = new String[] {""} ;
      P09FG5_n794PrvNom = new boolean[] {false} ;
      P09FG5_A795PrvNum = new int[1] ;
      P09FG5_A718PrdNom = new String[] {""} ;
      P09FG5_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuentoinven_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09FG2_A719PrdNum, P09FG2_A396EmprCod, P09FG2_A630MetDsc, P09FG2_n630MetDsc, P09FG2_A629MetCod, P09FG2_n629MetCod, P09FG2_A794PrvNom, P09FG2_n794PrvNom, P09FG2_A795PrvNum, P09FG2_A718PrdNom
            }
            , new Object[] {
            P09FG3_A718PrdNom, P09FG3_A396EmprCod, P09FG3_A630MetDsc, P09FG3_n630MetDsc, P09FG3_A629MetCod, P09FG3_n629MetCod, P09FG3_A794PrvNom, P09FG3_n794PrvNom, P09FG3_A795PrvNum, P09FG3_A719PrdNum
            }
            , new Object[] {
            P09FG4_A795PrvNum, P09FG4_A396EmprCod, P09FG4_A630MetDsc, P09FG4_n630MetDsc, P09FG4_A629MetCod, P09FG4_n629MetCod, P09FG4_A794PrvNom, P09FG4_n794PrvNom, P09FG4_A718PrdNom, P09FG4_A719PrdNum
            }
            , new Object[] {
            P09FG5_A629MetCod, P09FG5_n629MetCod, P09FG5_A396EmprCod, P09FG5_A630MetDsc, P09FG5_n630MetDsc, P09FG5_A794PrvNom, P09FG5_n794PrvNom, P09FG5_A795PrvNum, P09FG5_A718PrdNom, P09FG5_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFMetCod ;
   private byte AV19TFMetCod_To ;
   private byte AV59Recuentoinven_wcds_10_tfmetcod ;
   private byte AV60Recuentoinven_wcds_11_tfmetcod_to ;
   private byte A629MetCod ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private int AV14TFPrvNum ;
   private int AV15TFPrvNum_To ;
   private int AV55Recuentoinven_wcds_6_tfprvnum ;
   private int AV56Recuentoinven_wcds_7_tfprvnum_to ;
   private int AV44PrvNumFrom ;
   private int AV45PrvNumTo ;
   private int A795PrvNum ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV16TFPrvNom ;
   private String AV17TFPrvNom_Sel ;
   private String AV20TFMetDsc ;
   private String AV21TFMetDsc_Sel ;
   private String A719PrdNum ;
   private String AV51Recuentoinven_wcds_2_tfprdnum ;
   private String AV52Recuentoinven_wcds_3_tfprdnum_sel ;
   private String AV53Recuentoinven_wcds_4_tfprdnom ;
   private String AV54Recuentoinven_wcds_5_tfprdnom_sel ;
   private String AV57Recuentoinven_wcds_8_tfprvnom ;
   private String AV58Recuentoinven_wcds_9_tfprvnom_sel ;
   private String AV61Recuentoinven_wcds_12_tfmetdsc ;
   private String AV62Recuentoinven_wcds_13_tfmetdsc_sel ;
   private String scmdbuf ;
   private String lV51Recuentoinven_wcds_2_tfprdnum ;
   private String lV53Recuentoinven_wcds_4_tfprdnom ;
   private String lV57Recuentoinven_wcds_8_tfprvnom ;
   private String lV61Recuentoinven_wcds_12_tfmetdsc ;
   private String AV41EmprCod ;
   private String AV42PrdNumFrom ;
   private String AV43PrdNumTo ;
   private String A718PrdNom ;
   private String A794PrvNom ;
   private String A630MetDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9FG2 ;
   private boolean n630MetDsc ;
   private boolean n629MetCod ;
   private boolean n794PrvNom ;
   private boolean brk9FG4 ;
   private boolean brk9FG6 ;
   private boolean brk9FG8 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV50Recuentoinven_wcds_1_filterfulltext ;
   private String lV50Recuentoinven_wcds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09FG2_A719PrdNum ;
   private String[] P09FG2_A396EmprCod ;
   private String[] P09FG2_A630MetDsc ;
   private boolean[] P09FG2_n630MetDsc ;
   private byte[] P09FG2_A629MetCod ;
   private boolean[] P09FG2_n629MetCod ;
   private String[] P09FG2_A794PrvNom ;
   private boolean[] P09FG2_n794PrvNom ;
   private int[] P09FG2_A795PrvNum ;
   private String[] P09FG2_A718PrdNom ;
   private String[] P09FG3_A718PrdNom ;
   private String[] P09FG3_A396EmprCod ;
   private String[] P09FG3_A630MetDsc ;
   private boolean[] P09FG3_n630MetDsc ;
   private byte[] P09FG3_A629MetCod ;
   private boolean[] P09FG3_n629MetCod ;
   private String[] P09FG3_A794PrvNom ;
   private boolean[] P09FG3_n794PrvNom ;
   private int[] P09FG3_A795PrvNum ;
   private String[] P09FG3_A719PrdNum ;
   private int[] P09FG4_A795PrvNum ;
   private String[] P09FG4_A396EmprCod ;
   private String[] P09FG4_A630MetDsc ;
   private boolean[] P09FG4_n630MetDsc ;
   private byte[] P09FG4_A629MetCod ;
   private boolean[] P09FG4_n629MetCod ;
   private String[] P09FG4_A794PrvNom ;
   private boolean[] P09FG4_n794PrvNom ;
   private String[] P09FG4_A718PrdNom ;
   private String[] P09FG4_A719PrdNum ;
   private byte[] P09FG5_A629MetCod ;
   private boolean[] P09FG5_n629MetCod ;
   private String[] P09FG5_A396EmprCod ;
   private String[] P09FG5_A630MetDsc ;
   private boolean[] P09FG5_n630MetDsc ;
   private String[] P09FG5_A794PrvNom ;
   private boolean[] P09FG5_n794PrvNom ;
   private int[] P09FG5_A795PrvNum ;
   private String[] P09FG5_A718PrdNom ;
   private String[] P09FG5_A719PrdNum ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class recuentoinven_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Recuentoinven_wcds_1_filterfulltext ,
                                          String AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                          String AV51Recuentoinven_wcds_2_tfprdnum ,
                                          String AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                          String AV53Recuentoinven_wcds_4_tfprdnom ,
                                          int AV55Recuentoinven_wcds_6_tfprvnum ,
                                          int AV56Recuentoinven_wcds_7_tfprvnum_to ,
                                          String AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                          String AV57Recuentoinven_wcds_8_tfprvnom ,
                                          byte AV59Recuentoinven_wcds_10_tfmetcod ,
                                          byte AV60Recuentoinven_wcds_11_tfmetcod_to ,
                                          String AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                          String AV61Recuentoinven_wcds_12_tfmetdsc ,
                                          String AV41EmprCod ,
                                          String AV42PrdNumFrom ,
                                          String AV43PrdNumTo ,
                                          int AV44PrvNumFrom ,
                                          int AV45PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          byte A629MetCod ,
                                          String A630MetDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[23];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T2.MetDsc, T1.MetCod, T3.PrvNom, T1.PrvNum, T1.PrdNom FROM ((TXPPRODUC T1 LEFT JOIN TXPMETPED T2 ON T2.EmprCod = T1.EmprCod AND T2.MetCod" ;
      scmdbuf += " = T1.MetCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV50Recuentoinven_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetCod,'90'), 2) like '%' || ?) or ( UPPER(T2.MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Recuentoinven_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Recuentoinven_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Recuentoinven_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Recuentoinven_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Recuentoinven_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Recuentoinven_wcds_10_tfmetcod) )
      {
         addWhere(sWhereString, "(T1.MetCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Recuentoinven_wcds_11_tfmetcod_to) )
      {
         addWhere(sWhereString, "(T1.MetCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recuentoinven_wcds_12_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MetDsc = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV44PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV45PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09FG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Recuentoinven_wcds_1_filterfulltext ,
                                          String AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                          String AV51Recuentoinven_wcds_2_tfprdnum ,
                                          String AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                          String AV53Recuentoinven_wcds_4_tfprdnom ,
                                          int AV55Recuentoinven_wcds_6_tfprvnum ,
                                          int AV56Recuentoinven_wcds_7_tfprvnum_to ,
                                          String AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                          String AV57Recuentoinven_wcds_8_tfprvnom ,
                                          byte AV59Recuentoinven_wcds_10_tfmetcod ,
                                          byte AV60Recuentoinven_wcds_11_tfmetcod_to ,
                                          String AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                          String AV61Recuentoinven_wcds_12_tfmetdsc ,
                                          String AV41EmprCod ,
                                          String AV42PrdNumFrom ,
                                          String AV43PrdNumTo ,
                                          int AV44PrvNumFrom ,
                                          int AV45PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          byte A629MetCod ,
                                          String A630MetDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[23];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNom, T1.EmprCod, T2.MetDsc, T1.MetCod, T3.PrvNom, T1.PrvNum, T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPMETPED T2 ON T2.EmprCod = T1.EmprCod AND T2.MetCod" ;
      scmdbuf += " = T1.MetCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV50Recuentoinven_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetCod,'90'), 2) like '%' || ?) or ( UPPER(T2.MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Recuentoinven_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Recuentoinven_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Recuentoinven_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Recuentoinven_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Recuentoinven_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Recuentoinven_wcds_10_tfmetcod) )
      {
         addWhere(sWhereString, "(T1.MetCod >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Recuentoinven_wcds_11_tfmetcod_to) )
      {
         addWhere(sWhereString, "(T1.MetCod <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recuentoinven_wcds_12_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MetDsc = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV44PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV45PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09FG4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Recuentoinven_wcds_1_filterfulltext ,
                                          String AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                          String AV51Recuentoinven_wcds_2_tfprdnum ,
                                          String AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                          String AV53Recuentoinven_wcds_4_tfprdnom ,
                                          int AV55Recuentoinven_wcds_6_tfprvnum ,
                                          int AV56Recuentoinven_wcds_7_tfprvnum_to ,
                                          String AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                          String AV57Recuentoinven_wcds_8_tfprvnom ,
                                          byte AV59Recuentoinven_wcds_10_tfmetcod ,
                                          byte AV60Recuentoinven_wcds_11_tfmetcod_to ,
                                          String AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                          String AV61Recuentoinven_wcds_12_tfmetdsc ,
                                          String AV41EmprCod ,
                                          String AV42PrdNumFrom ,
                                          String AV43PrdNumTo ,
                                          int AV44PrvNumFrom ,
                                          int AV45PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          byte A629MetCod ,
                                          String A630MetDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrvNum, T1.EmprCod, T3.MetDsc, T1.MetCod, T2.PrvNom, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum" ;
      scmdbuf += " = T1.PrvNum) LEFT JOIN TXPMETPED T3 ON T3.EmprCod = T1.EmprCod AND T3.MetCod = T1.MetCod)" ;
      if ( ! (GXutil.strcmp("", AV50Recuentoinven_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetCod,'90'), 2) like '%' || ?) or ( UPPER(T3.MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Recuentoinven_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Recuentoinven_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Recuentoinven_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Recuentoinven_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Recuentoinven_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Recuentoinven_wcds_10_tfmetcod) )
      {
         addWhere(sWhereString, "(T1.MetCod >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Recuentoinven_wcds_11_tfmetcod_to) )
      {
         addWhere(sWhereString, "(T1.MetCod <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recuentoinven_wcds_12_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MetDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV44PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV45PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09FG5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Recuentoinven_wcds_1_filterfulltext ,
                                          String AV52Recuentoinven_wcds_3_tfprdnum_sel ,
                                          String AV51Recuentoinven_wcds_2_tfprdnum ,
                                          String AV54Recuentoinven_wcds_5_tfprdnom_sel ,
                                          String AV53Recuentoinven_wcds_4_tfprdnom ,
                                          int AV55Recuentoinven_wcds_6_tfprvnum ,
                                          int AV56Recuentoinven_wcds_7_tfprvnum_to ,
                                          String AV58Recuentoinven_wcds_9_tfprvnom_sel ,
                                          String AV57Recuentoinven_wcds_8_tfprvnom ,
                                          byte AV59Recuentoinven_wcds_10_tfmetcod ,
                                          byte AV60Recuentoinven_wcds_11_tfmetcod_to ,
                                          String AV62Recuentoinven_wcds_13_tfmetdsc_sel ,
                                          String AV61Recuentoinven_wcds_12_tfmetdsc ,
                                          String AV41EmprCod ,
                                          String AV42PrdNumFrom ,
                                          String AV43PrdNumTo ,
                                          int AV44PrvNumFrom ,
                                          int AV45PrvNumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          byte A629MetCod ,
                                          String A630MetDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[23];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.MetCod, T1.EmprCod, T2.MetDsc, T3.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum FROM ((TXPPRODUC T1 LEFT JOIN TXPMETPED T2 ON T2.EmprCod = T1.EmprCod AND T2.MetCod" ;
      scmdbuf += " = T1.MetCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum)" ;
      if ( ! (GXutil.strcmp("", AV50Recuentoinven_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.PrvNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetCod,'90'), 2) like '%' || ?) or ( UPPER(T2.MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV51Recuentoinven_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Recuentoinven_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Recuentoinven_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Recuentoinven_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Recuentoinven_wcds_6_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Recuentoinven_wcds_7_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Recuentoinven_wcds_8_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Recuentoinven_wcds_9_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Recuentoinven_wcds_10_tfmetcod) )
      {
         addWhere(sWhereString, "(T1.MetCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Recuentoinven_wcds_11_tfmetcod_to) )
      {
         addWhere(sWhereString, "(T1.MetCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV61Recuentoinven_wcds_12_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recuentoinven_wcds_13_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MetDsc = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42PrdNumFrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43PrdNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV44PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV45PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MetCod" ;
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
                  return conditional_P09FG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P09FG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P09FG4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 3 :
                  return conditional_P09FG5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FG4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FG5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 26);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 26);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
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
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
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
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
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
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
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
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
      }
   }

}

