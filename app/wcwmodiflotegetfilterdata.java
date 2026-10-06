package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwmodiflotegetfilterdata extends GXProcedure
{
   public wcwmodiflotegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwmodiflotegetfilterdata.class ), "" );
   }

   public wcwmodiflotegetfilterdata( int remoteHandle ,
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
      wcwmodiflotegetfilterdata.this.aP5 = new String[] {""};
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
      wcwmodiflotegetfilterdata.this.AV26DDOName = aP0;
      wcwmodiflotegetfilterdata.this.AV24SearchTxt = aP1;
      wcwmodiflotegetfilterdata.this.AV25SearchTxtTo = aP2;
      wcwmodiflotegetfilterdata.this.aP3 = aP3;
      wcwmodiflotegetfilterdata.this.aP4 = aP4;
      wcwmodiflotegetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PRDNOM") == 0 )
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
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WCwModifLoteGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCwModifLoteGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WCwModifLoteGridState"), null, null);
      }
      AV90GXV1 = 1 ;
      while ( AV90GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV90GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV51FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV49TFEntFecEnt = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV14TFEntPrvNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFEntPrvNum_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV16TFEntUniEnt = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFEntUniEnt_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIREM") == 0 )
         {
            AV18TFEntUniRem = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFEntUniRem_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV20TFEntPre = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFEntPre_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV22TFPedCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFPedCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV42Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV43Fec1 = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV44Fec2 = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM1") == 0 )
         {
            AV45PrdNum1 = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM2") == 0 )
         {
            AV46PrdNum2 = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV47PrvNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTCON") == 0 )
         {
            AV48EntCon = (byte)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV90GXV1 = (int)(AV90GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV24SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV92Wcwmodifloteds_1_filterfulltext = AV51FilterFullText ;
      AV93Wcwmodifloteds_2_tfentfecent = AV49TFEntFecEnt ;
      AV94Wcwmodifloteds_3_tfprdnum = AV10TFPrdNum ;
      AV95Wcwmodifloteds_4_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV96Wcwmodifloteds_5_tfprdnom = AV12TFPrdNom ;
      AV97Wcwmodifloteds_6_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV98Wcwmodifloteds_7_tfentprvnum = AV14TFEntPrvNum ;
      AV99Wcwmodifloteds_8_tfentprvnum_to = AV15TFEntPrvNum_To ;
      AV100Wcwmodifloteds_9_tfentunient = AV16TFEntUniEnt ;
      AV101Wcwmodifloteds_10_tfentunient_to = AV17TFEntUniEnt_To ;
      AV102Wcwmodifloteds_11_tfentunirem = AV18TFEntUniRem ;
      AV103Wcwmodifloteds_12_tfentunirem_to = AV19TFEntUniRem_To ;
      AV104Wcwmodifloteds_13_tfentpre = AV20TFEntPre ;
      AV105Wcwmodifloteds_14_tfentpre_to = AV21TFEntPre_To ;
      AV106Wcwmodifloteds_15_tfpedcod = AV22TFPedCod ;
      AV107Wcwmodifloteds_16_tfpedcod_to = AV23TFPedCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV92Wcwmodifloteds_1_filterfulltext ,
                                           AV93Wcwmodifloteds_2_tfentfecent ,
                                           AV95Wcwmodifloteds_4_tfprdnum_sel ,
                                           AV94Wcwmodifloteds_3_tfprdnum ,
                                           AV97Wcwmodifloteds_6_tfprdnom_sel ,
                                           AV96Wcwmodifloteds_5_tfprdnom ,
                                           Integer.valueOf(AV98Wcwmodifloteds_7_tfentprvnum) ,
                                           Integer.valueOf(AV99Wcwmodifloteds_8_tfentprvnum_to) ,
                                           AV100Wcwmodifloteds_9_tfentunient ,
                                           AV101Wcwmodifloteds_10_tfentunient_to ,
                                           AV102Wcwmodifloteds_11_tfentunirem ,
                                           AV103Wcwmodifloteds_12_tfentunirem_to ,
                                           AV104Wcwmodifloteds_13_tfentpre ,
                                           AV105Wcwmodifloteds_14_tfentpre_to ,
                                           Integer.valueOf(AV106Wcwmodifloteds_15_tfpedcod) ,
                                           Integer.valueOf(AV107Wcwmodifloteds_16_tfpedcod_to) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A419EntUniRem ,
                                           A417EntPre ,
                                           Integer.valueOf(A658PedCod) ,
                                           A415EntFecEnt ,
                                           AV43Fec1 ,
                                           AV44Fec2 ,
                                           AV45PrdNum1 ,
                                           AV46PrdNum2 ,
                                           Integer.valueOf(AV47PrvNum) ,
                                           Byte.valueOf(A411EntCon) ,
                                           Byte.valueOf(AV48EntCon) ,
                                           AV42Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV94Wcwmodifloteds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV94Wcwmodifloteds_3_tfprdnum), 6, "%") ;
      lV96Wcwmodifloteds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV96Wcwmodifloteds_5_tfprdnom), 26, "%") ;
      /* Using cursor P08PB2 */
      pr_default.execute(0, new Object[] {AV42Emprcod, AV43Fec1, AV44Fec2, AV45PrdNum1, AV45PrdNum1, AV46PrdNum2, AV46PrdNum2, Integer.valueOf(AV47PrvNum), Integer.valueOf(AV47PrvNum), Byte.valueOf(AV48EntCon), Byte.valueOf(AV48EntCon), lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, AV93Wcwmodifloteds_2_tfentfecent, lV94Wcwmodifloteds_3_tfprdnum, AV95Wcwmodifloteds_4_tfprdnum_sel, lV96Wcwmodifloteds_5_tfprdnom, AV97Wcwmodifloteds_6_tfprdnom_sel, Integer.valueOf(AV98Wcwmodifloteds_7_tfentprvnum), Integer.valueOf(AV99Wcwmodifloteds_8_tfentprvnum_to), AV100Wcwmodifloteds_9_tfentunient, AV101Wcwmodifloteds_10_tfentunient_to, AV102Wcwmodifloteds_11_tfentunirem, AV103Wcwmodifloteds_12_tfentunirem_to, AV104Wcwmodifloteds_13_tfentpre, AV105Wcwmodifloteds_14_tfentpre_to, Integer.valueOf(AV106Wcwmodifloteds_15_tfpedcod), Integer.valueOf(AV107Wcwmodifloteds_16_tfpedcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PB2 = false ;
         A396EmprCod = P08PB2_A396EmprCod[0] ;
         A719PrdNum = P08PB2_A719PrdNum[0] ;
         A411EntCon = P08PB2_A411EntCon[0] ;
         A658PedCod = P08PB2_A658PedCod[0] ;
         n658PedCod = P08PB2_n658PedCod[0] ;
         A417EntPre = P08PB2_A417EntPre[0] ;
         A419EntUniRem = P08PB2_A419EntUniRem[0] ;
         A418EntUniEnt = P08PB2_A418EntUniEnt[0] ;
         A6156EntPrvNum = P08PB2_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PB2_n6156EntPrvNum[0] ;
         A718PrdNom = P08PB2_A718PrdNom[0] ;
         A415EntFecEnt = P08PB2_A415EntFecEnt[0] ;
         A597LinEnt = P08PB2_A597LinEnt[0] ;
         A718PrdNom = P08PB2_A718PrdNom[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PB2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08PB2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8PB2 = false ;
            A597LinEnt = P08PB2_A597LinEnt[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8PB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV28Option = A719PrdNum ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PB2 )
         {
            brk8PB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV24SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV92Wcwmodifloteds_1_filterfulltext = AV51FilterFullText ;
      AV93Wcwmodifloteds_2_tfentfecent = AV49TFEntFecEnt ;
      AV94Wcwmodifloteds_3_tfprdnum = AV10TFPrdNum ;
      AV95Wcwmodifloteds_4_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV96Wcwmodifloteds_5_tfprdnom = AV12TFPrdNom ;
      AV97Wcwmodifloteds_6_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV98Wcwmodifloteds_7_tfentprvnum = AV14TFEntPrvNum ;
      AV99Wcwmodifloteds_8_tfentprvnum_to = AV15TFEntPrvNum_To ;
      AV100Wcwmodifloteds_9_tfentunient = AV16TFEntUniEnt ;
      AV101Wcwmodifloteds_10_tfentunient_to = AV17TFEntUniEnt_To ;
      AV102Wcwmodifloteds_11_tfentunirem = AV18TFEntUniRem ;
      AV103Wcwmodifloteds_12_tfentunirem_to = AV19TFEntUniRem_To ;
      AV104Wcwmodifloteds_13_tfentpre = AV20TFEntPre ;
      AV105Wcwmodifloteds_14_tfentpre_to = AV21TFEntPre_To ;
      AV106Wcwmodifloteds_15_tfpedcod = AV22TFPedCod ;
      AV107Wcwmodifloteds_16_tfpedcod_to = AV23TFPedCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV92Wcwmodifloteds_1_filterfulltext ,
                                           AV93Wcwmodifloteds_2_tfentfecent ,
                                           AV95Wcwmodifloteds_4_tfprdnum_sel ,
                                           AV94Wcwmodifloteds_3_tfprdnum ,
                                           AV97Wcwmodifloteds_6_tfprdnom_sel ,
                                           AV96Wcwmodifloteds_5_tfprdnom ,
                                           Integer.valueOf(AV98Wcwmodifloteds_7_tfentprvnum) ,
                                           Integer.valueOf(AV99Wcwmodifloteds_8_tfentprvnum_to) ,
                                           AV100Wcwmodifloteds_9_tfentunient ,
                                           AV101Wcwmodifloteds_10_tfentunient_to ,
                                           AV102Wcwmodifloteds_11_tfentunirem ,
                                           AV103Wcwmodifloteds_12_tfentunirem_to ,
                                           AV104Wcwmodifloteds_13_tfentpre ,
                                           AV105Wcwmodifloteds_14_tfentpre_to ,
                                           Integer.valueOf(AV106Wcwmodifloteds_15_tfpedcod) ,
                                           Integer.valueOf(AV107Wcwmodifloteds_16_tfpedcod_to) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A419EntUniRem ,
                                           A417EntPre ,
                                           Integer.valueOf(A658PedCod) ,
                                           A415EntFecEnt ,
                                           AV43Fec1 ,
                                           AV44Fec2 ,
                                           AV45PrdNum1 ,
                                           AV46PrdNum2 ,
                                           Integer.valueOf(AV47PrvNum) ,
                                           Byte.valueOf(A411EntCon) ,
                                           Byte.valueOf(AV48EntCon) ,
                                           A396EmprCod ,
                                           AV42Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV92Wcwmodifloteds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV92Wcwmodifloteds_1_filterfulltext), "%", "") ;
      lV94Wcwmodifloteds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV94Wcwmodifloteds_3_tfprdnum), 6, "%") ;
      lV96Wcwmodifloteds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV96Wcwmodifloteds_5_tfprdnom), 26, "%") ;
      /* Using cursor P08PB3 */
      pr_default.execute(1, new Object[] {AV43Fec1, AV44Fec2, AV45PrdNum1, AV45PrdNum1, AV46PrdNum2, AV46PrdNum2, Integer.valueOf(AV47PrvNum), Integer.valueOf(AV47PrvNum), Byte.valueOf(AV48EntCon), Byte.valueOf(AV48EntCon), AV42Emprcod, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, lV92Wcwmodifloteds_1_filterfulltext, AV93Wcwmodifloteds_2_tfentfecent, lV94Wcwmodifloteds_3_tfprdnum, AV95Wcwmodifloteds_4_tfprdnum_sel, lV96Wcwmodifloteds_5_tfprdnom, AV97Wcwmodifloteds_6_tfprdnom_sel, Integer.valueOf(AV98Wcwmodifloteds_7_tfentprvnum), Integer.valueOf(AV99Wcwmodifloteds_8_tfentprvnum_to), AV100Wcwmodifloteds_9_tfentunient, AV101Wcwmodifloteds_10_tfentunient_to, AV102Wcwmodifloteds_11_tfentunirem, AV103Wcwmodifloteds_12_tfentunirem_to, AV104Wcwmodifloteds_13_tfentpre, AV105Wcwmodifloteds_14_tfentpre_to, Integer.valueOf(AV106Wcwmodifloteds_15_tfpedcod), Integer.valueOf(AV107Wcwmodifloteds_16_tfpedcod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PB4 = false ;
         A396EmprCod = P08PB3_A396EmprCod[0] ;
         A718PrdNom = P08PB3_A718PrdNom[0] ;
         A411EntCon = P08PB3_A411EntCon[0] ;
         A658PedCod = P08PB3_A658PedCod[0] ;
         n658PedCod = P08PB3_n658PedCod[0] ;
         A417EntPre = P08PB3_A417EntPre[0] ;
         A419EntUniRem = P08PB3_A419EntUniRem[0] ;
         A418EntUniEnt = P08PB3_A418EntUniEnt[0] ;
         A6156EntPrvNum = P08PB3_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PB3_n6156EntPrvNum[0] ;
         A719PrdNum = P08PB3_A719PrdNum[0] ;
         A415EntFecEnt = P08PB3_A415EntFecEnt[0] ;
         A597LinEnt = P08PB3_A597LinEnt[0] ;
         A718PrdNom = P08PB3_A718PrdNom[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PB3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8PB4 = false ;
            A396EmprCod = P08PB3_A396EmprCod[0] ;
            A719PrdNum = P08PB3_A719PrdNum[0] ;
            A597LinEnt = P08PB3_A597LinEnt[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8PB4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV28Option = A718PrdNom ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PB4 )
         {
            brk8PB4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwmodiflotegetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = wcwmodiflotegetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = wcwmodiflotegetfilterdata.this.AV35OptionIndexesJson;
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
      AV51FilterFullText = "" ;
      AV49TFEntFecEnt = GXutil.nullDate() ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV16TFEntUniEnt = DecimalUtil.ZERO ;
      AV17TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV18TFEntUniRem = DecimalUtil.ZERO ;
      AV19TFEntUniRem_To = DecimalUtil.ZERO ;
      AV20TFEntPre = DecimalUtil.ZERO ;
      AV21TFEntPre_To = DecimalUtil.ZERO ;
      AV42Emprcod = "" ;
      AV43Fec1 = GXutil.nullDate() ;
      AV44Fec2 = GXutil.nullDate() ;
      AV45PrdNum1 = "" ;
      AV46PrdNum2 = "" ;
      A719PrdNum = "" ;
      AV92Wcwmodifloteds_1_filterfulltext = "" ;
      AV93Wcwmodifloteds_2_tfentfecent = GXutil.nullDate() ;
      AV94Wcwmodifloteds_3_tfprdnum = "" ;
      AV95Wcwmodifloteds_4_tfprdnum_sel = "" ;
      AV96Wcwmodifloteds_5_tfprdnom = "" ;
      AV97Wcwmodifloteds_6_tfprdnom_sel = "" ;
      AV100Wcwmodifloteds_9_tfentunient = DecimalUtil.ZERO ;
      AV101Wcwmodifloteds_10_tfentunient_to = DecimalUtil.ZERO ;
      AV102Wcwmodifloteds_11_tfentunirem = DecimalUtil.ZERO ;
      AV103Wcwmodifloteds_12_tfentunirem_to = DecimalUtil.ZERO ;
      AV104Wcwmodifloteds_13_tfentpre = DecimalUtil.ZERO ;
      AV105Wcwmodifloteds_14_tfentpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV92Wcwmodifloteds_1_filterfulltext = "" ;
      lV94Wcwmodifloteds_3_tfprdnum = "" ;
      lV96Wcwmodifloteds_5_tfprdnom = "" ;
      A718PrdNom = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08PB2_A396EmprCod = new String[] {""} ;
      P08PB2_A719PrdNum = new String[] {""} ;
      P08PB2_A411EntCon = new byte[1] ;
      P08PB2_A658PedCod = new int[1] ;
      P08PB2_n658PedCod = new boolean[] {false} ;
      P08PB2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PB2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PB2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PB2_A6156EntPrvNum = new int[1] ;
      P08PB2_n6156EntPrvNum = new boolean[] {false} ;
      P08PB2_A718PrdNom = new String[] {""} ;
      P08PB2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PB2_A597LinEnt = new short[1] ;
      AV28Option = "" ;
      P08PB3_A396EmprCod = new String[] {""} ;
      P08PB3_A718PrdNom = new String[] {""} ;
      P08PB3_A411EntCon = new byte[1] ;
      P08PB3_A658PedCod = new int[1] ;
      P08PB3_n658PedCod = new boolean[] {false} ;
      P08PB3_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PB3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PB3_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PB3_A6156EntPrvNum = new int[1] ;
      P08PB3_n6156EntPrvNum = new boolean[] {false} ;
      P08PB3_A719PrdNum = new String[] {""} ;
      P08PB3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PB3_A597LinEnt = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwmodiflotegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PB2_A396EmprCod, P08PB2_A719PrdNum, P08PB2_A411EntCon, P08PB2_A658PedCod, P08PB2_n658PedCod, P08PB2_A417EntPre, P08PB2_A419EntUniRem, P08PB2_A418EntUniEnt, P08PB2_A6156EntPrvNum, P08PB2_n6156EntPrvNum,
            P08PB2_A718PrdNom, P08PB2_A415EntFecEnt, P08PB2_A597LinEnt
            }
            , new Object[] {
            P08PB3_A396EmprCod, P08PB3_A718PrdNom, P08PB3_A411EntCon, P08PB3_A658PedCod, P08PB3_n658PedCod, P08PB3_A417EntPre, P08PB3_A419EntUniRem, P08PB3_A418EntUniEnt, P08PB3_A6156EntPrvNum, P08PB3_n6156EntPrvNum,
            P08PB3_A719PrdNum, P08PB3_A415EntFecEnt, P08PB3_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV48EntCon ;
   private byte A411EntCon ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV90GXV1 ;
   private int AV14TFEntPrvNum ;
   private int AV15TFEntPrvNum_To ;
   private int AV22TFPedCod ;
   private int AV23TFPedCod_To ;
   private int AV47PrvNum ;
   private int AV98Wcwmodifloteds_7_tfentprvnum ;
   private int AV99Wcwmodifloteds_8_tfentprvnum_to ;
   private int AV106Wcwmodifloteds_15_tfpedcod ;
   private int AV107Wcwmodifloteds_16_tfpedcod_to ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private long AV36count ;
   private java.math.BigDecimal AV16TFEntUniEnt ;
   private java.math.BigDecimal AV17TFEntUniEnt_To ;
   private java.math.BigDecimal AV18TFEntUniRem ;
   private java.math.BigDecimal AV19TFEntUniRem_To ;
   private java.math.BigDecimal AV20TFEntPre ;
   private java.math.BigDecimal AV21TFEntPre_To ;
   private java.math.BigDecimal AV100Wcwmodifloteds_9_tfentunient ;
   private java.math.BigDecimal AV101Wcwmodifloteds_10_tfentunient_to ;
   private java.math.BigDecimal AV102Wcwmodifloteds_11_tfentunirem ;
   private java.math.BigDecimal AV103Wcwmodifloteds_12_tfentunirem_to ;
   private java.math.BigDecimal AV104Wcwmodifloteds_13_tfentpre ;
   private java.math.BigDecimal AV105Wcwmodifloteds_14_tfentpre_to ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal A417EntPre ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV42Emprcod ;
   private String AV45PrdNum1 ;
   private String AV46PrdNum2 ;
   private String A719PrdNum ;
   private String AV94Wcwmodifloteds_3_tfprdnum ;
   private String AV95Wcwmodifloteds_4_tfprdnum_sel ;
   private String AV96Wcwmodifloteds_5_tfprdnom ;
   private String AV97Wcwmodifloteds_6_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV94Wcwmodifloteds_3_tfprdnum ;
   private String lV96Wcwmodifloteds_5_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private java.util.Date AV49TFEntFecEnt ;
   private java.util.Date AV43Fec1 ;
   private java.util.Date AV44Fec2 ;
   private java.util.Date AV93Wcwmodifloteds_2_tfentfecent ;
   private java.util.Date A415EntFecEnt ;
   private boolean returnInSub ;
   private boolean brk8PB2 ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private boolean brk8PB4 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV51FilterFullText ;
   private String AV92Wcwmodifloteds_1_filterfulltext ;
   private String lV92Wcwmodifloteds_1_filterfulltext ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08PB2_A396EmprCod ;
   private String[] P08PB2_A719PrdNum ;
   private byte[] P08PB2_A411EntCon ;
   private int[] P08PB2_A658PedCod ;
   private boolean[] P08PB2_n658PedCod ;
   private java.math.BigDecimal[] P08PB2_A417EntPre ;
   private java.math.BigDecimal[] P08PB2_A419EntUniRem ;
   private java.math.BigDecimal[] P08PB2_A418EntUniEnt ;
   private int[] P08PB2_A6156EntPrvNum ;
   private boolean[] P08PB2_n6156EntPrvNum ;
   private String[] P08PB2_A718PrdNom ;
   private java.util.Date[] P08PB2_A415EntFecEnt ;
   private short[] P08PB2_A597LinEnt ;
   private String[] P08PB3_A396EmprCod ;
   private String[] P08PB3_A718PrdNom ;
   private byte[] P08PB3_A411EntCon ;
   private int[] P08PB3_A658PedCod ;
   private boolean[] P08PB3_n658PedCod ;
   private java.math.BigDecimal[] P08PB3_A417EntPre ;
   private java.math.BigDecimal[] P08PB3_A419EntUniRem ;
   private java.math.BigDecimal[] P08PB3_A418EntUniEnt ;
   private int[] P08PB3_A6156EntPrvNum ;
   private boolean[] P08PB3_n6156EntPrvNum ;
   private String[] P08PB3_A719PrdNum ;
   private java.util.Date[] P08PB3_A415EntFecEnt ;
   private short[] P08PB3_A597LinEnt ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class wcwmodiflotegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Wcwmodifloteds_1_filterfulltext ,
                                          java.util.Date AV93Wcwmodifloteds_2_tfentfecent ,
                                          String AV95Wcwmodifloteds_4_tfprdnum_sel ,
                                          String AV94Wcwmodifloteds_3_tfprdnum ,
                                          String AV97Wcwmodifloteds_6_tfprdnom_sel ,
                                          String AV96Wcwmodifloteds_5_tfprdnom ,
                                          int AV98Wcwmodifloteds_7_tfentprvnum ,
                                          int AV99Wcwmodifloteds_8_tfentprvnum_to ,
                                          java.math.BigDecimal AV100Wcwmodifloteds_9_tfentunient ,
                                          java.math.BigDecimal AV101Wcwmodifloteds_10_tfentunient_to ,
                                          java.math.BigDecimal AV102Wcwmodifloteds_11_tfentunirem ,
                                          java.math.BigDecimal AV103Wcwmodifloteds_12_tfentunirem_to ,
                                          java.math.BigDecimal AV104Wcwmodifloteds_13_tfentpre ,
                                          java.math.BigDecimal AV105Wcwmodifloteds_14_tfentpre_to ,
                                          int AV106Wcwmodifloteds_15_tfpedcod ,
                                          int AV107Wcwmodifloteds_16_tfpedcod_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          java.math.BigDecimal A417EntPre ,
                                          int A658PedCod ,
                                          java.util.Date A415EntFecEnt ,
                                          java.util.Date AV43Fec1 ,
                                          java.util.Date AV44Fec2 ,
                                          String AV45PrdNum1 ,
                                          String AV46PrdNum2 ,
                                          int AV47PrvNum ,
                                          byte A411EntCon ,
                                          byte AV48EntCon ,
                                          String AV42Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.EntCon, T1.PedCod, T1.EntPre, T1.EntUniRem, T1.EntUniEnt, T1.EntPrvNum, T2.PrdNom, T1.EntFecEnt, T1.LinEnt FROM (TXPENTALM T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.PrdNum <= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EntPrvNum = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EntCon = ? or ? = 9)");
      if ( ! (GXutil.strcmp("", AV92Wcwmodifloteds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniRem,'999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
         GXv_int2[16] = (byte)(1) ;
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Wcwmodifloteds_2_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcwmodifloteds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcwmodifloteds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcwmodifloteds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wcwmodifloteds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Wcwmodifloteds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wcwmodifloteds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwmodifloteds_7_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcwmodifloteds_8_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Wcwmodifloteds_9_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Wcwmodifloteds_10_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Wcwmodifloteds_11_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Wcwmodifloteds_12_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Wcwmodifloteds_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcwmodifloteds_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcwmodifloteds_15_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwmodifloteds_16_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Wcwmodifloteds_1_filterfulltext ,
                                          java.util.Date AV93Wcwmodifloteds_2_tfentfecent ,
                                          String AV95Wcwmodifloteds_4_tfprdnum_sel ,
                                          String AV94Wcwmodifloteds_3_tfprdnum ,
                                          String AV97Wcwmodifloteds_6_tfprdnom_sel ,
                                          String AV96Wcwmodifloteds_5_tfprdnom ,
                                          int AV98Wcwmodifloteds_7_tfentprvnum ,
                                          int AV99Wcwmodifloteds_8_tfentprvnum_to ,
                                          java.math.BigDecimal AV100Wcwmodifloteds_9_tfentunient ,
                                          java.math.BigDecimal AV101Wcwmodifloteds_10_tfentunient_to ,
                                          java.math.BigDecimal AV102Wcwmodifloteds_11_tfentunirem ,
                                          java.math.BigDecimal AV103Wcwmodifloteds_12_tfentunirem_to ,
                                          java.math.BigDecimal AV104Wcwmodifloteds_13_tfentpre ,
                                          java.math.BigDecimal AV105Wcwmodifloteds_14_tfentpre_to ,
                                          int AV106Wcwmodifloteds_15_tfpedcod ,
                                          int AV107Wcwmodifloteds_16_tfpedcod_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          java.math.BigDecimal A417EntPre ,
                                          int A658PedCod ,
                                          java.util.Date A415EntFecEnt ,
                                          java.util.Date AV43Fec1 ,
                                          java.util.Date AV44Fec2 ,
                                          String AV45PrdNum1 ,
                                          String AV46PrdNum2 ,
                                          int AV47PrvNum ,
                                          byte A411EntCon ,
                                          byte AV48EntCon ,
                                          String A396EmprCod ,
                                          String AV42Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[33];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.PrdNom, T1.EntCon, T1.PedCod, T1.EntPre, T1.EntUniRem, T1.EntUniEnt, T1.EntPrvNum, T1.PrdNum, T1.EntFecEnt, T1.LinEnt FROM (TXPENTALM T1 INNER" ;
      scmdbuf += " JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.PrdNum <= ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EntPrvNum = ? or (? = 0))");
      addWhere(sWhereString, "(T1.EntCon = ? or ? = 9)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV92Wcwmodifloteds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniRem,'999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
         GXv_int4[16] = (byte)(1) ;
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Wcwmodifloteds_2_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Wcwmodifloteds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV94Wcwmodifloteds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Wcwmodifloteds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Wcwmodifloteds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV96Wcwmodifloteds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Wcwmodifloteds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV98Wcwmodifloteds_7_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcwmodifloteds_8_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Wcwmodifloteds_9_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Wcwmodifloteds_10_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Wcwmodifloteds_11_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Wcwmodifloteds_12_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniRem <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Wcwmodifloteds_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcwmodifloteds_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcwmodifloteds_15_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwmodifloteds_16_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
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
                  return conditional_P08PB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P08PB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
      }
   }

}

