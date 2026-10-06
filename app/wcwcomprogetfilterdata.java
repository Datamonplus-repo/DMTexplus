package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcomprogetfilterdata extends GXProcedure
{
   public wcwcomprogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcomprogetfilterdata.class ), "" );
   }

   public wcwcomprogetfilterdata( int remoteHandle ,
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
      wcwcomprogetfilterdata.this.aP5 = new String[] {""};
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
      wcwcomprogetfilterdata.this.AV32DDOName = aP0;
      wcwcomprogetfilterdata.this.AV30SearchTxt = aP1;
      wcwcomprogetfilterdata.this.AV31SearchTxtTo = aP2;
      wcwcomprogetfilterdata.this.aP3 = aP3;
      wcwcomprogetfilterdata.this.aP4 = aP4;
      wcwcomprogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ENTLOTN") == 0 )
      {
         /* Execute user subroutine: 'LOADENTLOTNOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ENTREMNRO") == 0 )
      {
         /* Execute user subroutine: 'LOADENTREMNROOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("WCWcomproGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcomproGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("WCWcomproGridState"), null, null);
      }
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV10TFEntPrvNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFEntPrvNum_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV12TFEntFecEnt = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV16TFPrdNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV17TFPrdNom_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV18TFPedCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPedCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV20TFEntUniEnt = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFEntUniEnt_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV22TFEntPre = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFEntPre_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDVALFORMULA") == 0 )
         {
            AV24TFPedValFormula = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFPedValFormula_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV26TFEntLotN = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV27TFEntLotN_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO") == 0 )
         {
            AV28TFEntRemNro = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTREMNRO_SEL") == 0 )
         {
            AV29TFEntRemNro_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTFECENT") == 0 )
         {
            AV49EntFecEnt = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ENTFECENT_TO") == 0 )
         {
            AV50EntFecEnt_to = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV51PrvNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM_TO") == 0 )
         {
            AV52PrvNum_to = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV53Prdnum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM_TO") == 0 )
         {
            AV54Prdnum_to = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV30SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV98Wcwcomprods_1_filterfulltext = AV55FilterFullText ;
      AV99Wcwcomprods_2_tfentprvnum = AV10TFEntPrvNum ;
      AV100Wcwcomprods_3_tfentprvnum_to = AV11TFEntPrvNum_To ;
      AV101Wcwcomprods_4_tfentfecent = AV12TFEntFecEnt ;
      AV102Wcwcomprods_5_tfprdnum = AV14TFPrdNum ;
      AV103Wcwcomprods_6_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV104Wcwcomprods_7_tfprdnom = AV16TFPrdNom ;
      AV105Wcwcomprods_8_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV106Wcwcomprods_9_tfpedcod = AV18TFPedCod ;
      AV107Wcwcomprods_10_tfpedcod_to = AV19TFPedCod_To ;
      AV108Wcwcomprods_11_tfentunient = AV20TFEntUniEnt ;
      AV109Wcwcomprods_12_tfentunient_to = AV21TFEntUniEnt_To ;
      AV110Wcwcomprods_13_tfentpre = AV22TFEntPre ;
      AV111Wcwcomprods_14_tfentpre_to = AV23TFEntPre_To ;
      AV112Wcwcomprods_15_tfpedvalformula = AV24TFPedValFormula ;
      AV113Wcwcomprods_16_tfpedvalformula_to = AV25TFPedValFormula_To ;
      AV114Wcwcomprods_17_tfentlotn = AV26TFEntLotN ;
      AV115Wcwcomprods_18_tfentlotn_sel = AV27TFEntLotN_Sel ;
      AV116Wcwcomprods_19_tfentremnro = AV28TFEntRemNro ;
      AV117Wcwcomprods_20_tfentremnro_sel = AV29TFEntRemNro_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV98Wcwcomprods_1_filterfulltext ,
                                           Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum) ,
                                           Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to) ,
                                           AV101Wcwcomprods_4_tfentfecent ,
                                           AV103Wcwcomprods_6_tfprdnum_sel ,
                                           AV102Wcwcomprods_5_tfprdnum ,
                                           AV105Wcwcomprods_8_tfprdnom_sel ,
                                           AV104Wcwcomprods_7_tfprdnom ,
                                           Integer.valueOf(AV106Wcwcomprods_9_tfpedcod) ,
                                           Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to) ,
                                           AV108Wcwcomprods_11_tfentunient ,
                                           AV109Wcwcomprods_12_tfentunient_to ,
                                           AV110Wcwcomprods_13_tfentpre ,
                                           AV111Wcwcomprods_14_tfentpre_to ,
                                           AV112Wcwcomprods_15_tfpedvalformula ,
                                           AV113Wcwcomprods_16_tfpedvalformula_to ,
                                           AV115Wcwcomprods_18_tfentlotn_sel ,
                                           AV114Wcwcomprods_17_tfentlotn ,
                                           AV117Wcwcomprods_20_tfentremnro_sel ,
                                           AV116Wcwcomprods_19_tfentremnro ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A669PedUni ,
                                           A665PedPre ,
                                           A660PedDto ,
                                           A5686EntLotN ,
                                           A10187EntRemNro ,
                                           A415EntFecEnt ,
                                           AV49EntFecEnt ,
                                           AV50EntFecEnt_to ,
                                           Integer.valueOf(AV51PrvNum) ,
                                           Integer.valueOf(AV52PrvNum_to) ,
                                           A11Albaran ,
                                           AV48Emprcod ,
                                           AV53Prdnum ,
                                           A396EmprCod ,
                                           AV54Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV102Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV102Wcwcomprods_5_tfprdnum), 6, "%") ;
      lV104Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV104Wcwcomprods_7_tfprdnom), 26, "%") ;
      lV114Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV114Wcwcomprods_17_tfentlotn), 26, "%") ;
      lV116Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV116Wcwcomprods_19_tfentremnro), 12, "%") ;
      /* Using cursor P08PJ2 */
      pr_default.execute(0, new Object[] {AV48Emprcod, AV53Prdnum, AV49EntFecEnt, AV50EntFecEnt_to, Integer.valueOf(AV51PrvNum), Integer.valueOf(AV52PrvNum_to), AV54Prdnum_to, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to), AV101Wcwcomprods_4_tfentfecent, lV102Wcwcomprods_5_tfprdnum, AV103Wcwcomprods_6_tfprdnum_sel, lV104Wcwcomprods_7_tfprdnom, AV105Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV106Wcwcomprods_9_tfpedcod), Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to), AV108Wcwcomprods_11_tfentunient, AV109Wcwcomprods_12_tfentunient_to, AV110Wcwcomprods_13_tfentpre, AV111Wcwcomprods_14_tfentpre_to, AV112Wcwcomprods_15_tfpedvalformula, AV113Wcwcomprods_16_tfpedvalformula_to, lV114Wcwcomprods_17_tfentlotn, AV115Wcwcomprods_18_tfentlotn_sel, lV116Wcwcomprods_19_tfentremnro, AV117Wcwcomprods_20_tfentremnro_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PJ2 = false ;
         A396EmprCod = P08PJ2_A396EmprCod[0] ;
         A719PrdNum = P08PJ2_A719PrdNum[0] ;
         A11Albaran = P08PJ2_A11Albaran[0] ;
         A10187EntRemNro = P08PJ2_A10187EntRemNro[0] ;
         A5686EntLotN = P08PJ2_A5686EntLotN[0] ;
         A417EntPre = P08PJ2_A417EntPre[0] ;
         A418EntUniEnt = P08PJ2_A418EntUniEnt[0] ;
         A658PedCod = P08PJ2_A658PedCod[0] ;
         n658PedCod = P08PJ2_n658PedCod[0] ;
         A718PrdNom = P08PJ2_A718PrdNom[0] ;
         A415EntFecEnt = P08PJ2_A415EntFecEnt[0] ;
         A6156EntPrvNum = P08PJ2_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PJ2_n6156EntPrvNum[0] ;
         A660PedDto = P08PJ2_A660PedDto[0] ;
         A665PedPre = P08PJ2_A665PedPre[0] ;
         A669PedUni = P08PJ2_A669PedUni[0] ;
         A597LinEnt = P08PJ2_A597LinEnt[0] ;
         A718PrdNom = P08PJ2_A718PrdNom[0] ;
         A660PedDto = P08PJ2_A660PedDto[0] ;
         A665PedPre = P08PJ2_A665PedPre[0] ;
         A669PedUni = P08PJ2_A669PedUni[0] ;
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PJ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08PJ2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8PJ2 = false ;
            A597LinEnt = P08PJ2_A597LinEnt[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8PJ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV34Option = A719PrdNum ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PJ2 )
         {
            brk8PJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNom = AV30SearchTxt ;
      AV17TFPrdNom_Sel = "" ;
      AV98Wcwcomprods_1_filterfulltext = AV55FilterFullText ;
      AV99Wcwcomprods_2_tfentprvnum = AV10TFEntPrvNum ;
      AV100Wcwcomprods_3_tfentprvnum_to = AV11TFEntPrvNum_To ;
      AV101Wcwcomprods_4_tfentfecent = AV12TFEntFecEnt ;
      AV102Wcwcomprods_5_tfprdnum = AV14TFPrdNum ;
      AV103Wcwcomprods_6_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV104Wcwcomprods_7_tfprdnom = AV16TFPrdNom ;
      AV105Wcwcomprods_8_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV106Wcwcomprods_9_tfpedcod = AV18TFPedCod ;
      AV107Wcwcomprods_10_tfpedcod_to = AV19TFPedCod_To ;
      AV108Wcwcomprods_11_tfentunient = AV20TFEntUniEnt ;
      AV109Wcwcomprods_12_tfentunient_to = AV21TFEntUniEnt_To ;
      AV110Wcwcomprods_13_tfentpre = AV22TFEntPre ;
      AV111Wcwcomprods_14_tfentpre_to = AV23TFEntPre_To ;
      AV112Wcwcomprods_15_tfpedvalformula = AV24TFPedValFormula ;
      AV113Wcwcomprods_16_tfpedvalformula_to = AV25TFPedValFormula_To ;
      AV114Wcwcomprods_17_tfentlotn = AV26TFEntLotN ;
      AV115Wcwcomprods_18_tfentlotn_sel = AV27TFEntLotN_Sel ;
      AV116Wcwcomprods_19_tfentremnro = AV28TFEntRemNro ;
      AV117Wcwcomprods_20_tfentremnro_sel = AV29TFEntRemNro_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV98Wcwcomprods_1_filterfulltext ,
                                           Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum) ,
                                           Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to) ,
                                           AV101Wcwcomprods_4_tfentfecent ,
                                           AV103Wcwcomprods_6_tfprdnum_sel ,
                                           AV102Wcwcomprods_5_tfprdnum ,
                                           AV105Wcwcomprods_8_tfprdnom_sel ,
                                           AV104Wcwcomprods_7_tfprdnom ,
                                           Integer.valueOf(AV106Wcwcomprods_9_tfpedcod) ,
                                           Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to) ,
                                           AV108Wcwcomprods_11_tfentunient ,
                                           AV109Wcwcomprods_12_tfentunient_to ,
                                           AV110Wcwcomprods_13_tfentpre ,
                                           AV111Wcwcomprods_14_tfentpre_to ,
                                           AV112Wcwcomprods_15_tfpedvalformula ,
                                           AV113Wcwcomprods_16_tfpedvalformula_to ,
                                           AV115Wcwcomprods_18_tfentlotn_sel ,
                                           AV114Wcwcomprods_17_tfentlotn ,
                                           AV117Wcwcomprods_20_tfentremnro_sel ,
                                           AV116Wcwcomprods_19_tfentremnro ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A669PedUni ,
                                           A665PedPre ,
                                           A660PedDto ,
                                           A5686EntLotN ,
                                           A10187EntRemNro ,
                                           A415EntFecEnt ,
                                           AV49EntFecEnt ,
                                           AV50EntFecEnt_to ,
                                           Integer.valueOf(AV51PrvNum) ,
                                           Integer.valueOf(AV52PrvNum_to) ,
                                           AV53Prdnum ,
                                           AV54Prdnum_to ,
                                           A11Albaran ,
                                           A396EmprCod ,
                                           AV48Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV102Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV102Wcwcomprods_5_tfprdnum), 6, "%") ;
      lV104Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV104Wcwcomprods_7_tfprdnom), 26, "%") ;
      lV114Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV114Wcwcomprods_17_tfentlotn), 26, "%") ;
      lV116Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV116Wcwcomprods_19_tfentremnro), 12, "%") ;
      /* Using cursor P08PJ3 */
      pr_default.execute(1, new Object[] {AV49EntFecEnt, AV50EntFecEnt_to, Integer.valueOf(AV51PrvNum), Integer.valueOf(AV52PrvNum_to), AV53Prdnum, AV54Prdnum_to, AV48Emprcod, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to), AV101Wcwcomprods_4_tfentfecent, lV102Wcwcomprods_5_tfprdnum, AV103Wcwcomprods_6_tfprdnum_sel, lV104Wcwcomprods_7_tfprdnom, AV105Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV106Wcwcomprods_9_tfpedcod), Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to), AV108Wcwcomprods_11_tfentunient, AV109Wcwcomprods_12_tfentunient_to, AV110Wcwcomprods_13_tfentpre, AV111Wcwcomprods_14_tfentpre_to, AV112Wcwcomprods_15_tfpedvalformula, AV113Wcwcomprods_16_tfpedvalformula_to, lV114Wcwcomprods_17_tfentlotn, AV115Wcwcomprods_18_tfentlotn_sel, lV116Wcwcomprods_19_tfentremnro, AV117Wcwcomprods_20_tfentremnro_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PJ4 = false ;
         A396EmprCod = P08PJ3_A396EmprCod[0] ;
         A718PrdNom = P08PJ3_A718PrdNom[0] ;
         A11Albaran = P08PJ3_A11Albaran[0] ;
         A10187EntRemNro = P08PJ3_A10187EntRemNro[0] ;
         A5686EntLotN = P08PJ3_A5686EntLotN[0] ;
         A417EntPre = P08PJ3_A417EntPre[0] ;
         A418EntUniEnt = P08PJ3_A418EntUniEnt[0] ;
         A658PedCod = P08PJ3_A658PedCod[0] ;
         n658PedCod = P08PJ3_n658PedCod[0] ;
         A719PrdNum = P08PJ3_A719PrdNum[0] ;
         A415EntFecEnt = P08PJ3_A415EntFecEnt[0] ;
         A6156EntPrvNum = P08PJ3_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PJ3_n6156EntPrvNum[0] ;
         A660PedDto = P08PJ3_A660PedDto[0] ;
         A665PedPre = P08PJ3_A665PedPre[0] ;
         A669PedUni = P08PJ3_A669PedUni[0] ;
         A597LinEnt = P08PJ3_A597LinEnt[0] ;
         A718PrdNom = P08PJ3_A718PrdNom[0] ;
         A660PedDto = P08PJ3_A660PedDto[0] ;
         A665PedPre = P08PJ3_A665PedPre[0] ;
         A669PedUni = P08PJ3_A669PedUni[0] ;
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PJ3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8PJ4 = false ;
            A396EmprCod = P08PJ3_A396EmprCod[0] ;
            A719PrdNum = P08PJ3_A719PrdNum[0] ;
            A597LinEnt = P08PJ3_A597LinEnt[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8PJ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV34Option = A718PrdNom ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PJ4 )
         {
            brk8PJ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADENTLOTNOPTIONS' Routine */
      returnInSub = false ;
      AV26TFEntLotN = AV30SearchTxt ;
      AV27TFEntLotN_Sel = "" ;
      AV98Wcwcomprods_1_filterfulltext = AV55FilterFullText ;
      AV99Wcwcomprods_2_tfentprvnum = AV10TFEntPrvNum ;
      AV100Wcwcomprods_3_tfentprvnum_to = AV11TFEntPrvNum_To ;
      AV101Wcwcomprods_4_tfentfecent = AV12TFEntFecEnt ;
      AV102Wcwcomprods_5_tfprdnum = AV14TFPrdNum ;
      AV103Wcwcomprods_6_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV104Wcwcomprods_7_tfprdnom = AV16TFPrdNom ;
      AV105Wcwcomprods_8_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV106Wcwcomprods_9_tfpedcod = AV18TFPedCod ;
      AV107Wcwcomprods_10_tfpedcod_to = AV19TFPedCod_To ;
      AV108Wcwcomprods_11_tfentunient = AV20TFEntUniEnt ;
      AV109Wcwcomprods_12_tfentunient_to = AV21TFEntUniEnt_To ;
      AV110Wcwcomprods_13_tfentpre = AV22TFEntPre ;
      AV111Wcwcomprods_14_tfentpre_to = AV23TFEntPre_To ;
      AV112Wcwcomprods_15_tfpedvalformula = AV24TFPedValFormula ;
      AV113Wcwcomprods_16_tfpedvalformula_to = AV25TFPedValFormula_To ;
      AV114Wcwcomprods_17_tfentlotn = AV26TFEntLotN ;
      AV115Wcwcomprods_18_tfentlotn_sel = AV27TFEntLotN_Sel ;
      AV116Wcwcomprods_19_tfentremnro = AV28TFEntRemNro ;
      AV117Wcwcomprods_20_tfentremnro_sel = AV29TFEntRemNro_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV98Wcwcomprods_1_filterfulltext ,
                                           Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum) ,
                                           Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to) ,
                                           AV101Wcwcomprods_4_tfentfecent ,
                                           AV103Wcwcomprods_6_tfprdnum_sel ,
                                           AV102Wcwcomprods_5_tfprdnum ,
                                           AV105Wcwcomprods_8_tfprdnom_sel ,
                                           AV104Wcwcomprods_7_tfprdnom ,
                                           Integer.valueOf(AV106Wcwcomprods_9_tfpedcod) ,
                                           Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to) ,
                                           AV108Wcwcomprods_11_tfentunient ,
                                           AV109Wcwcomprods_12_tfentunient_to ,
                                           AV110Wcwcomprods_13_tfentpre ,
                                           AV111Wcwcomprods_14_tfentpre_to ,
                                           AV112Wcwcomprods_15_tfpedvalformula ,
                                           AV113Wcwcomprods_16_tfpedvalformula_to ,
                                           AV115Wcwcomprods_18_tfentlotn_sel ,
                                           AV114Wcwcomprods_17_tfentlotn ,
                                           AV117Wcwcomprods_20_tfentremnro_sel ,
                                           AV116Wcwcomprods_19_tfentremnro ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A669PedUni ,
                                           A665PedPre ,
                                           A660PedDto ,
                                           A5686EntLotN ,
                                           A10187EntRemNro ,
                                           A415EntFecEnt ,
                                           AV49EntFecEnt ,
                                           AV50EntFecEnt_to ,
                                           Integer.valueOf(AV51PrvNum) ,
                                           Integer.valueOf(AV52PrvNum_to) ,
                                           AV53Prdnum ,
                                           AV54Prdnum_to ,
                                           A11Albaran ,
                                           A396EmprCod ,
                                           AV48Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV102Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV102Wcwcomprods_5_tfprdnum), 6, "%") ;
      lV104Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV104Wcwcomprods_7_tfprdnom), 26, "%") ;
      lV114Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV114Wcwcomprods_17_tfentlotn), 26, "%") ;
      lV116Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV116Wcwcomprods_19_tfentremnro), 12, "%") ;
      /* Using cursor P08PJ4 */
      pr_default.execute(2, new Object[] {AV49EntFecEnt, AV50EntFecEnt_to, Integer.valueOf(AV51PrvNum), Integer.valueOf(AV52PrvNum_to), AV53Prdnum, AV54Prdnum_to, AV48Emprcod, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to), AV101Wcwcomprods_4_tfentfecent, lV102Wcwcomprods_5_tfprdnum, AV103Wcwcomprods_6_tfprdnum_sel, lV104Wcwcomprods_7_tfprdnom, AV105Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV106Wcwcomprods_9_tfpedcod), Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to), AV108Wcwcomprods_11_tfentunient, AV109Wcwcomprods_12_tfentunient_to, AV110Wcwcomprods_13_tfentpre, AV111Wcwcomprods_14_tfentpre_to, AV112Wcwcomprods_15_tfpedvalformula, AV113Wcwcomprods_16_tfpedvalformula_to, lV114Wcwcomprods_17_tfentlotn, AV115Wcwcomprods_18_tfentlotn_sel, lV116Wcwcomprods_19_tfentremnro, AV117Wcwcomprods_20_tfentremnro_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8PJ6 = false ;
         A396EmprCod = P08PJ4_A396EmprCod[0] ;
         A5686EntLotN = P08PJ4_A5686EntLotN[0] ;
         A11Albaran = P08PJ4_A11Albaran[0] ;
         A10187EntRemNro = P08PJ4_A10187EntRemNro[0] ;
         A417EntPre = P08PJ4_A417EntPre[0] ;
         A418EntUniEnt = P08PJ4_A418EntUniEnt[0] ;
         A658PedCod = P08PJ4_A658PedCod[0] ;
         n658PedCod = P08PJ4_n658PedCod[0] ;
         A718PrdNom = P08PJ4_A718PrdNom[0] ;
         A719PrdNum = P08PJ4_A719PrdNum[0] ;
         A415EntFecEnt = P08PJ4_A415EntFecEnt[0] ;
         A6156EntPrvNum = P08PJ4_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PJ4_n6156EntPrvNum[0] ;
         A660PedDto = P08PJ4_A660PedDto[0] ;
         A665PedPre = P08PJ4_A665PedPre[0] ;
         A669PedUni = P08PJ4_A669PedUni[0] ;
         A597LinEnt = P08PJ4_A597LinEnt[0] ;
         A718PrdNom = P08PJ4_A718PrdNom[0] ;
         A660PedDto = P08PJ4_A660PedDto[0] ;
         A665PedPre = P08PJ4_A665PedPre[0] ;
         A669PedUni = P08PJ4_A669PedUni[0] ;
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08PJ4_A5686EntLotN[0], A5686EntLotN) == 0 ) )
         {
            brk8PJ6 = false ;
            A396EmprCod = P08PJ4_A396EmprCod[0] ;
            A719PrdNum = P08PJ4_A719PrdNum[0] ;
            A597LinEnt = P08PJ4_A597LinEnt[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8PJ6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5686EntLotN)==0) )
         {
            AV34Option = A5686EntLotN ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PJ6 )
         {
            brk8PJ6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADENTREMNROOPTIONS' Routine */
      returnInSub = false ;
      AV28TFEntRemNro = AV30SearchTxt ;
      AV29TFEntRemNro_Sel = "" ;
      AV98Wcwcomprods_1_filterfulltext = AV55FilterFullText ;
      AV99Wcwcomprods_2_tfentprvnum = AV10TFEntPrvNum ;
      AV100Wcwcomprods_3_tfentprvnum_to = AV11TFEntPrvNum_To ;
      AV101Wcwcomprods_4_tfentfecent = AV12TFEntFecEnt ;
      AV102Wcwcomprods_5_tfprdnum = AV14TFPrdNum ;
      AV103Wcwcomprods_6_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV104Wcwcomprods_7_tfprdnom = AV16TFPrdNom ;
      AV105Wcwcomprods_8_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV106Wcwcomprods_9_tfpedcod = AV18TFPedCod ;
      AV107Wcwcomprods_10_tfpedcod_to = AV19TFPedCod_To ;
      AV108Wcwcomprods_11_tfentunient = AV20TFEntUniEnt ;
      AV109Wcwcomprods_12_tfentunient_to = AV21TFEntUniEnt_To ;
      AV110Wcwcomprods_13_tfentpre = AV22TFEntPre ;
      AV111Wcwcomprods_14_tfentpre_to = AV23TFEntPre_To ;
      AV112Wcwcomprods_15_tfpedvalformula = AV24TFPedValFormula ;
      AV113Wcwcomprods_16_tfpedvalformula_to = AV25TFPedValFormula_To ;
      AV114Wcwcomprods_17_tfentlotn = AV26TFEntLotN ;
      AV115Wcwcomprods_18_tfentlotn_sel = AV27TFEntLotN_Sel ;
      AV116Wcwcomprods_19_tfentremnro = AV28TFEntRemNro ;
      AV117Wcwcomprods_20_tfentremnro_sel = AV29TFEntRemNro_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV98Wcwcomprods_1_filterfulltext ,
                                           Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum) ,
                                           Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to) ,
                                           AV101Wcwcomprods_4_tfentfecent ,
                                           AV103Wcwcomprods_6_tfprdnum_sel ,
                                           AV102Wcwcomprods_5_tfprdnum ,
                                           AV105Wcwcomprods_8_tfprdnom_sel ,
                                           AV104Wcwcomprods_7_tfprdnom ,
                                           Integer.valueOf(AV106Wcwcomprods_9_tfpedcod) ,
                                           Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to) ,
                                           AV108Wcwcomprods_11_tfentunient ,
                                           AV109Wcwcomprods_12_tfentunient_to ,
                                           AV110Wcwcomprods_13_tfentpre ,
                                           AV111Wcwcomprods_14_tfentpre_to ,
                                           AV112Wcwcomprods_15_tfpedvalformula ,
                                           AV113Wcwcomprods_16_tfpedvalformula_to ,
                                           AV115Wcwcomprods_18_tfentlotn_sel ,
                                           AV114Wcwcomprods_17_tfentlotn ,
                                           AV117Wcwcomprods_20_tfentremnro_sel ,
                                           AV116Wcwcomprods_19_tfentremnro ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A669PedUni ,
                                           A665PedPre ,
                                           A660PedDto ,
                                           A5686EntLotN ,
                                           A10187EntRemNro ,
                                           A415EntFecEnt ,
                                           AV49EntFecEnt ,
                                           AV50EntFecEnt_to ,
                                           Integer.valueOf(AV51PrvNum) ,
                                           Integer.valueOf(AV52PrvNum_to) ,
                                           AV53Prdnum ,
                                           AV54Prdnum_to ,
                                           A11Albaran ,
                                           A396EmprCod ,
                                           AV48Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV98Wcwcomprods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV98Wcwcomprods_1_filterfulltext), "%", "") ;
      lV102Wcwcomprods_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV102Wcwcomprods_5_tfprdnum), 6, "%") ;
      lV104Wcwcomprods_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV104Wcwcomprods_7_tfprdnom), 26, "%") ;
      lV114Wcwcomprods_17_tfentlotn = GXutil.padr( GXutil.rtrim( AV114Wcwcomprods_17_tfentlotn), 26, "%") ;
      lV116Wcwcomprods_19_tfentremnro = GXutil.padr( GXutil.rtrim( AV116Wcwcomprods_19_tfentremnro), 12, "%") ;
      /* Using cursor P08PJ5 */
      pr_default.execute(3, new Object[] {AV49EntFecEnt, AV50EntFecEnt_to, Integer.valueOf(AV51PrvNum), Integer.valueOf(AV52PrvNum_to), AV53Prdnum, AV54Prdnum_to, AV48Emprcod, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, lV98Wcwcomprods_1_filterfulltext, Integer.valueOf(AV99Wcwcomprods_2_tfentprvnum), Integer.valueOf(AV100Wcwcomprods_3_tfentprvnum_to), AV101Wcwcomprods_4_tfentfecent, lV102Wcwcomprods_5_tfprdnum, AV103Wcwcomprods_6_tfprdnum_sel, lV104Wcwcomprods_7_tfprdnom, AV105Wcwcomprods_8_tfprdnom_sel, Integer.valueOf(AV106Wcwcomprods_9_tfpedcod), Integer.valueOf(AV107Wcwcomprods_10_tfpedcod_to), AV108Wcwcomprods_11_tfentunient, AV109Wcwcomprods_12_tfentunient_to, AV110Wcwcomprods_13_tfentpre, AV111Wcwcomprods_14_tfentpre_to, AV112Wcwcomprods_15_tfpedvalformula, AV113Wcwcomprods_16_tfpedvalformula_to, lV114Wcwcomprods_17_tfentlotn, AV115Wcwcomprods_18_tfentlotn_sel, lV116Wcwcomprods_19_tfentremnro, AV117Wcwcomprods_20_tfentremnro_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8PJ8 = false ;
         A396EmprCod = P08PJ5_A396EmprCod[0] ;
         A10187EntRemNro = P08PJ5_A10187EntRemNro[0] ;
         A11Albaran = P08PJ5_A11Albaran[0] ;
         A5686EntLotN = P08PJ5_A5686EntLotN[0] ;
         A417EntPre = P08PJ5_A417EntPre[0] ;
         A418EntUniEnt = P08PJ5_A418EntUniEnt[0] ;
         A658PedCod = P08PJ5_A658PedCod[0] ;
         n658PedCod = P08PJ5_n658PedCod[0] ;
         A718PrdNom = P08PJ5_A718PrdNom[0] ;
         A719PrdNum = P08PJ5_A719PrdNum[0] ;
         A415EntFecEnt = P08PJ5_A415EntFecEnt[0] ;
         A6156EntPrvNum = P08PJ5_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P08PJ5_n6156EntPrvNum[0] ;
         A660PedDto = P08PJ5_A660PedDto[0] ;
         A665PedPre = P08PJ5_A665PedPre[0] ;
         A669PedUni = P08PJ5_A669PedUni[0] ;
         A597LinEnt = P08PJ5_A597LinEnt[0] ;
         A718PrdNom = P08PJ5_A718PrdNom[0] ;
         A660PedDto = P08PJ5_A660PedDto[0] ;
         A665PedPre = P08PJ5_A665PedPre[0] ;
         A669PedUni = P08PJ5_A669PedUni[0] ;
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08PJ5_A10187EntRemNro[0], A10187EntRemNro) == 0 ) )
         {
            brk8PJ8 = false ;
            A396EmprCod = P08PJ5_A396EmprCod[0] ;
            A719PrdNum = P08PJ5_A719PrdNum[0] ;
            A597LinEnt = P08PJ5_A597LinEnt[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8PJ8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A10187EntRemNro)==0) )
         {
            AV34Option = A10187EntRemNro ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PJ8 )
         {
            brk8PJ8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcomprogetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = wcwcomprogetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = wcwcomprogetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55FilterFullText = "" ;
      AV12TFEntFecEnt = GXutil.nullDate() ;
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV16TFPrdNom = "" ;
      AV17TFPrdNom_Sel = "" ;
      AV20TFEntUniEnt = DecimalUtil.ZERO ;
      AV21TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV22TFEntPre = DecimalUtil.ZERO ;
      AV23TFEntPre_To = DecimalUtil.ZERO ;
      AV24TFPedValFormula = DecimalUtil.ZERO ;
      AV25TFPedValFormula_To = DecimalUtil.ZERO ;
      AV26TFEntLotN = "" ;
      AV27TFEntLotN_Sel = "" ;
      AV28TFEntRemNro = "" ;
      AV29TFEntRemNro_Sel = "" ;
      AV48Emprcod = "" ;
      AV49EntFecEnt = GXutil.nullDate() ;
      AV50EntFecEnt_to = GXutil.nullDate() ;
      AV53Prdnum = "" ;
      AV54Prdnum_to = "" ;
      A719PrdNum = "" ;
      AV98Wcwcomprods_1_filterfulltext = "" ;
      AV101Wcwcomprods_4_tfentfecent = GXutil.nullDate() ;
      AV102Wcwcomprods_5_tfprdnum = "" ;
      AV103Wcwcomprods_6_tfprdnum_sel = "" ;
      AV104Wcwcomprods_7_tfprdnom = "" ;
      AV105Wcwcomprods_8_tfprdnom_sel = "" ;
      AV108Wcwcomprods_11_tfentunient = DecimalUtil.ZERO ;
      AV109Wcwcomprods_12_tfentunient_to = DecimalUtil.ZERO ;
      AV110Wcwcomprods_13_tfentpre = DecimalUtil.ZERO ;
      AV111Wcwcomprods_14_tfentpre_to = DecimalUtil.ZERO ;
      AV112Wcwcomprods_15_tfpedvalformula = DecimalUtil.ZERO ;
      AV113Wcwcomprods_16_tfpedvalformula_to = DecimalUtil.ZERO ;
      AV114Wcwcomprods_17_tfentlotn = "" ;
      AV115Wcwcomprods_18_tfentlotn_sel = "" ;
      AV116Wcwcomprods_19_tfentremnro = "" ;
      AV117Wcwcomprods_20_tfentremnro_sel = "" ;
      scmdbuf = "" ;
      lV98Wcwcomprods_1_filterfulltext = "" ;
      lV102Wcwcomprods_5_tfprdnum = "" ;
      lV104Wcwcomprods_7_tfprdnom = "" ;
      lV114Wcwcomprods_17_tfentlotn = "" ;
      lV116Wcwcomprods_19_tfentremnro = "" ;
      A718PrdNom = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A10187EntRemNro = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A11Albaran = "" ;
      A396EmprCod = "" ;
      P08PJ2_A396EmprCod = new String[] {""} ;
      P08PJ2_A719PrdNum = new String[] {""} ;
      P08PJ2_A11Albaran = new String[] {""} ;
      P08PJ2_A10187EntRemNro = new String[] {""} ;
      P08PJ2_A5686EntLotN = new String[] {""} ;
      P08PJ2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ2_A658PedCod = new int[1] ;
      P08PJ2_n658PedCod = new boolean[] {false} ;
      P08PJ2_A718PrdNom = new String[] {""} ;
      P08PJ2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PJ2_A6156EntPrvNum = new int[1] ;
      P08PJ2_n6156EntPrvNum = new boolean[] {false} ;
      P08PJ2_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ2_A597LinEnt = new short[1] ;
      A13787PedValForm = DecimalUtil.ZERO ;
      AV34Option = "" ;
      P08PJ3_A396EmprCod = new String[] {""} ;
      P08PJ3_A718PrdNom = new String[] {""} ;
      P08PJ3_A11Albaran = new String[] {""} ;
      P08PJ3_A10187EntRemNro = new String[] {""} ;
      P08PJ3_A5686EntLotN = new String[] {""} ;
      P08PJ3_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ3_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ3_A658PedCod = new int[1] ;
      P08PJ3_n658PedCod = new boolean[] {false} ;
      P08PJ3_A719PrdNum = new String[] {""} ;
      P08PJ3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PJ3_A6156EntPrvNum = new int[1] ;
      P08PJ3_n6156EntPrvNum = new boolean[] {false} ;
      P08PJ3_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ3_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ3_A597LinEnt = new short[1] ;
      P08PJ4_A396EmprCod = new String[] {""} ;
      P08PJ4_A5686EntLotN = new String[] {""} ;
      P08PJ4_A11Albaran = new String[] {""} ;
      P08PJ4_A10187EntRemNro = new String[] {""} ;
      P08PJ4_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ4_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ4_A658PedCod = new int[1] ;
      P08PJ4_n658PedCod = new boolean[] {false} ;
      P08PJ4_A718PrdNom = new String[] {""} ;
      P08PJ4_A719PrdNum = new String[] {""} ;
      P08PJ4_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PJ4_A6156EntPrvNum = new int[1] ;
      P08PJ4_n6156EntPrvNum = new boolean[] {false} ;
      P08PJ4_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ4_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ4_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ4_A597LinEnt = new short[1] ;
      P08PJ5_A396EmprCod = new String[] {""} ;
      P08PJ5_A10187EntRemNro = new String[] {""} ;
      P08PJ5_A11Albaran = new String[] {""} ;
      P08PJ5_A5686EntLotN = new String[] {""} ;
      P08PJ5_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ5_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ5_A658PedCod = new int[1] ;
      P08PJ5_n658PedCod = new boolean[] {false} ;
      P08PJ5_A718PrdNom = new String[] {""} ;
      P08PJ5_A719PrdNum = new String[] {""} ;
      P08PJ5_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08PJ5_A6156EntPrvNum = new int[1] ;
      P08PJ5_n6156EntPrvNum = new boolean[] {false} ;
      P08PJ5_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ5_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ5_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PJ5_A597LinEnt = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcomprogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PJ2_A396EmprCod, P08PJ2_A719PrdNum, P08PJ2_A11Albaran, P08PJ2_A10187EntRemNro, P08PJ2_A5686EntLotN, P08PJ2_A417EntPre, P08PJ2_A418EntUniEnt, P08PJ2_A658PedCod, P08PJ2_n658PedCod, P08PJ2_A718PrdNom,
            P08PJ2_A415EntFecEnt, P08PJ2_A6156EntPrvNum, P08PJ2_n6156EntPrvNum, P08PJ2_A660PedDto, P08PJ2_A665PedPre, P08PJ2_A669PedUni, P08PJ2_A597LinEnt
            }
            , new Object[] {
            P08PJ3_A396EmprCod, P08PJ3_A718PrdNom, P08PJ3_A11Albaran, P08PJ3_A10187EntRemNro, P08PJ3_A5686EntLotN, P08PJ3_A417EntPre, P08PJ3_A418EntUniEnt, P08PJ3_A658PedCod, P08PJ3_n658PedCod, P08PJ3_A719PrdNum,
            P08PJ3_A415EntFecEnt, P08PJ3_A6156EntPrvNum, P08PJ3_n6156EntPrvNum, P08PJ3_A660PedDto, P08PJ3_A665PedPre, P08PJ3_A669PedUni, P08PJ3_A597LinEnt
            }
            , new Object[] {
            P08PJ4_A396EmprCod, P08PJ4_A5686EntLotN, P08PJ4_A11Albaran, P08PJ4_A10187EntRemNro, P08PJ4_A417EntPre, P08PJ4_A418EntUniEnt, P08PJ4_A658PedCod, P08PJ4_n658PedCod, P08PJ4_A718PrdNom, P08PJ4_A719PrdNum,
            P08PJ4_A415EntFecEnt, P08PJ4_A6156EntPrvNum, P08PJ4_n6156EntPrvNum, P08PJ4_A660PedDto, P08PJ4_A665PedPre, P08PJ4_A669PedUni, P08PJ4_A597LinEnt
            }
            , new Object[] {
            P08PJ5_A396EmprCod, P08PJ5_A10187EntRemNro, P08PJ5_A11Albaran, P08PJ5_A5686EntLotN, P08PJ5_A417EntPre, P08PJ5_A418EntUniEnt, P08PJ5_A658PedCod, P08PJ5_n658PedCod, P08PJ5_A718PrdNom, P08PJ5_A719PrdNum,
            P08PJ5_A415EntFecEnt, P08PJ5_A6156EntPrvNum, P08PJ5_n6156EntPrvNum, P08PJ5_A660PedDto, P08PJ5_A665PedPre, P08PJ5_A669PedUni, P08PJ5_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A597LinEnt ;
   private short Gx_err ;
   private int AV96GXV1 ;
   private int AV10TFEntPrvNum ;
   private int AV11TFEntPrvNum_To ;
   private int AV18TFPedCod ;
   private int AV19TFPedCod_To ;
   private int AV51PrvNum ;
   private int AV52PrvNum_to ;
   private int AV99Wcwcomprods_2_tfentprvnum ;
   private int AV100Wcwcomprods_3_tfentprvnum_to ;
   private int AV106Wcwcomprods_9_tfpedcod ;
   private int AV107Wcwcomprods_10_tfpedcod_to ;
   private int A6156EntPrvNum ;
   private int A658PedCod ;
   private long AV42count ;
   private java.math.BigDecimal AV20TFEntUniEnt ;
   private java.math.BigDecimal AV21TFEntUniEnt_To ;
   private java.math.BigDecimal AV22TFEntPre ;
   private java.math.BigDecimal AV23TFEntPre_To ;
   private java.math.BigDecimal AV24TFPedValFormula ;
   private java.math.BigDecimal AV25TFPedValFormula_To ;
   private java.math.BigDecimal AV108Wcwcomprods_11_tfentunient ;
   private java.math.BigDecimal AV109Wcwcomprods_12_tfentunient_to ;
   private java.math.BigDecimal AV110Wcwcomprods_13_tfentpre ;
   private java.math.BigDecimal AV111Wcwcomprods_14_tfentpre_to ;
   private java.math.BigDecimal AV112Wcwcomprods_15_tfpedvalformula ;
   private java.math.BigDecimal AV113Wcwcomprods_16_tfpedvalformula_to ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A13787PedValForm ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV16TFPrdNom ;
   private String AV17TFPrdNom_Sel ;
   private String AV26TFEntLotN ;
   private String AV27TFEntLotN_Sel ;
   private String AV28TFEntRemNro ;
   private String AV29TFEntRemNro_Sel ;
   private String AV48Emprcod ;
   private String AV53Prdnum ;
   private String AV54Prdnum_to ;
   private String A719PrdNum ;
   private String AV102Wcwcomprods_5_tfprdnum ;
   private String AV103Wcwcomprods_6_tfprdnum_sel ;
   private String AV104Wcwcomprods_7_tfprdnom ;
   private String AV105Wcwcomprods_8_tfprdnom_sel ;
   private String AV114Wcwcomprods_17_tfentlotn ;
   private String AV115Wcwcomprods_18_tfentlotn_sel ;
   private String AV116Wcwcomprods_19_tfentremnro ;
   private String AV117Wcwcomprods_20_tfentremnro_sel ;
   private String scmdbuf ;
   private String lV102Wcwcomprods_5_tfprdnum ;
   private String lV104Wcwcomprods_7_tfprdnom ;
   private String lV114Wcwcomprods_17_tfentlotn ;
   private String lV116Wcwcomprods_19_tfentremnro ;
   private String A718PrdNom ;
   private String A5686EntLotN ;
   private String A10187EntRemNro ;
   private String A11Albaran ;
   private String A396EmprCod ;
   private java.util.Date AV12TFEntFecEnt ;
   private java.util.Date AV49EntFecEnt ;
   private java.util.Date AV50EntFecEnt_to ;
   private java.util.Date AV101Wcwcomprods_4_tfentfecent ;
   private java.util.Date A415EntFecEnt ;
   private boolean returnInSub ;
   private boolean brk8PJ2 ;
   private boolean n658PedCod ;
   private boolean n6156EntPrvNum ;
   private boolean brk8PJ4 ;
   private boolean brk8PJ6 ;
   private boolean brk8PJ8 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV55FilterFullText ;
   private String AV98Wcwcomprods_1_filterfulltext ;
   private String lV98Wcwcomprods_1_filterfulltext ;
   private String AV34Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08PJ2_A396EmprCod ;
   private String[] P08PJ2_A719PrdNum ;
   private String[] P08PJ2_A11Albaran ;
   private String[] P08PJ2_A10187EntRemNro ;
   private String[] P08PJ2_A5686EntLotN ;
   private java.math.BigDecimal[] P08PJ2_A417EntPre ;
   private java.math.BigDecimal[] P08PJ2_A418EntUniEnt ;
   private int[] P08PJ2_A658PedCod ;
   private boolean[] P08PJ2_n658PedCod ;
   private String[] P08PJ2_A718PrdNom ;
   private java.util.Date[] P08PJ2_A415EntFecEnt ;
   private int[] P08PJ2_A6156EntPrvNum ;
   private boolean[] P08PJ2_n6156EntPrvNum ;
   private java.math.BigDecimal[] P08PJ2_A660PedDto ;
   private java.math.BigDecimal[] P08PJ2_A665PedPre ;
   private java.math.BigDecimal[] P08PJ2_A669PedUni ;
   private short[] P08PJ2_A597LinEnt ;
   private String[] P08PJ3_A396EmprCod ;
   private String[] P08PJ3_A718PrdNom ;
   private String[] P08PJ3_A11Albaran ;
   private String[] P08PJ3_A10187EntRemNro ;
   private String[] P08PJ3_A5686EntLotN ;
   private java.math.BigDecimal[] P08PJ3_A417EntPre ;
   private java.math.BigDecimal[] P08PJ3_A418EntUniEnt ;
   private int[] P08PJ3_A658PedCod ;
   private boolean[] P08PJ3_n658PedCod ;
   private String[] P08PJ3_A719PrdNum ;
   private java.util.Date[] P08PJ3_A415EntFecEnt ;
   private int[] P08PJ3_A6156EntPrvNum ;
   private boolean[] P08PJ3_n6156EntPrvNum ;
   private java.math.BigDecimal[] P08PJ3_A660PedDto ;
   private java.math.BigDecimal[] P08PJ3_A665PedPre ;
   private java.math.BigDecimal[] P08PJ3_A669PedUni ;
   private short[] P08PJ3_A597LinEnt ;
   private String[] P08PJ4_A396EmprCod ;
   private String[] P08PJ4_A5686EntLotN ;
   private String[] P08PJ4_A11Albaran ;
   private String[] P08PJ4_A10187EntRemNro ;
   private java.math.BigDecimal[] P08PJ4_A417EntPre ;
   private java.math.BigDecimal[] P08PJ4_A418EntUniEnt ;
   private int[] P08PJ4_A658PedCod ;
   private boolean[] P08PJ4_n658PedCod ;
   private String[] P08PJ4_A718PrdNom ;
   private String[] P08PJ4_A719PrdNum ;
   private java.util.Date[] P08PJ4_A415EntFecEnt ;
   private int[] P08PJ4_A6156EntPrvNum ;
   private boolean[] P08PJ4_n6156EntPrvNum ;
   private java.math.BigDecimal[] P08PJ4_A660PedDto ;
   private java.math.BigDecimal[] P08PJ4_A665PedPre ;
   private java.math.BigDecimal[] P08PJ4_A669PedUni ;
   private short[] P08PJ4_A597LinEnt ;
   private String[] P08PJ5_A396EmprCod ;
   private String[] P08PJ5_A10187EntRemNro ;
   private String[] P08PJ5_A11Albaran ;
   private String[] P08PJ5_A5686EntLotN ;
   private java.math.BigDecimal[] P08PJ5_A417EntPre ;
   private java.math.BigDecimal[] P08PJ5_A418EntUniEnt ;
   private int[] P08PJ5_A658PedCod ;
   private boolean[] P08PJ5_n658PedCod ;
   private String[] P08PJ5_A718PrdNom ;
   private String[] P08PJ5_A719PrdNum ;
   private java.util.Date[] P08PJ5_A415EntFecEnt ;
   private int[] P08PJ5_A6156EntPrvNum ;
   private boolean[] P08PJ5_n6156EntPrvNum ;
   private java.math.BigDecimal[] P08PJ5_A660PedDto ;
   private java.math.BigDecimal[] P08PJ5_A665PedPre ;
   private java.math.BigDecimal[] P08PJ5_A669PedUni ;
   private short[] P08PJ5_A597LinEnt ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class wcwcomprogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV98Wcwcomprods_1_filterfulltext ,
                                          int AV99Wcwcomprods_2_tfentprvnum ,
                                          int AV100Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV101Wcwcomprods_4_tfentfecent ,
                                          String AV103Wcwcomprods_6_tfprdnum_sel ,
                                          String AV102Wcwcomprods_5_tfprdnum ,
                                          String AV105Wcwcomprods_8_tfprdnom_sel ,
                                          String AV104Wcwcomprods_7_tfprdnom ,
                                          int AV106Wcwcomprods_9_tfpedcod ,
                                          int AV107Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV108Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV109Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV110Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV111Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV112Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV113Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV115Wcwcomprods_18_tfentlotn_sel ,
                                          String AV114Wcwcomprods_17_tfentlotn ,
                                          String AV117Wcwcomprods_20_tfentremnro_sel ,
                                          String AV116Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          java.util.Date AV49EntFecEnt ,
                                          java.util.Date AV50EntFecEnt_to ,
                                          int AV51PrvNum ,
                                          int AV52PrvNum_to ,
                                          String A11Albaran ,
                                          String AV48Emprcod ,
                                          String AV53Prdnum ,
                                          String A396EmprCod ,
                                          String AV54Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[35];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.Albaran, T1.EntRemNro, T1.EntLotN, T1.EntPre, T1.EntUniEnt, T1.PedCod, T2.PrdNom, T1.EntFecEnt, T1.EntPrvNum, T3.PedDto, T3.PedPre," ;
      scmdbuf += " T3.PedUni, T1.LinEnt FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( ! (GXutil.strcmp("", AV98Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV102Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV98Wcwcomprods_1_filterfulltext ,
                                          int AV99Wcwcomprods_2_tfentprvnum ,
                                          int AV100Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV101Wcwcomprods_4_tfentfecent ,
                                          String AV103Wcwcomprods_6_tfprdnum_sel ,
                                          String AV102Wcwcomprods_5_tfprdnum ,
                                          String AV105Wcwcomprods_8_tfprdnom_sel ,
                                          String AV104Wcwcomprods_7_tfprdnom ,
                                          int AV106Wcwcomprods_9_tfpedcod ,
                                          int AV107Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV108Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV109Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV110Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV111Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV112Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV113Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV115Wcwcomprods_18_tfentlotn_sel ,
                                          String AV114Wcwcomprods_17_tfentlotn ,
                                          String AV117Wcwcomprods_20_tfentremnro_sel ,
                                          String AV116Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          java.util.Date AV49EntFecEnt ,
                                          java.util.Date AV50EntFecEnt_to ,
                                          int AV51PrvNum ,
                                          int AV52PrvNum_to ,
                                          String AV53Prdnum ,
                                          String AV54Prdnum_to ,
                                          String A11Albaran ,
                                          String A396EmprCod ,
                                          String AV48Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[35];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.PrdNom, T1.Albaran, T1.EntRemNro, T1.EntLotN, T1.EntPre, T1.EntUniEnt, T1.PedCod, T1.PrdNum, T1.EntFecEnt, T1.EntPrvNum, T3.PedDto, T3.PedPre," ;
      scmdbuf += " T3.PedUni, T1.LinEnt FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV98Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV102Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08PJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV98Wcwcomprods_1_filterfulltext ,
                                          int AV99Wcwcomprods_2_tfentprvnum ,
                                          int AV100Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV101Wcwcomprods_4_tfentfecent ,
                                          String AV103Wcwcomprods_6_tfprdnum_sel ,
                                          String AV102Wcwcomprods_5_tfprdnum ,
                                          String AV105Wcwcomprods_8_tfprdnom_sel ,
                                          String AV104Wcwcomprods_7_tfprdnom ,
                                          int AV106Wcwcomprods_9_tfpedcod ,
                                          int AV107Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV108Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV109Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV110Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV111Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV112Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV113Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV115Wcwcomprods_18_tfentlotn_sel ,
                                          String AV114Wcwcomprods_17_tfentlotn ,
                                          String AV117Wcwcomprods_20_tfentremnro_sel ,
                                          String AV116Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          java.util.Date AV49EntFecEnt ,
                                          java.util.Date AV50EntFecEnt_to ,
                                          int AV51PrvNum ,
                                          int AV52PrvNum_to ,
                                          String AV53Prdnum ,
                                          String AV54Prdnum_to ,
                                          String A11Albaran ,
                                          String A396EmprCod ,
                                          String AV48Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[35];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EntLotN, T1.Albaran, T1.EntRemNro, T1.EntPre, T1.EntUniEnt, T1.PedCod, T2.PrdNom, T1.PrdNum, T1.EntFecEnt, T1.EntPrvNum, T3.PedDto, T3.PedPre," ;
      scmdbuf += " T3.PedUni, T1.LinEnt FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV98Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV102Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EntLotN" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08PJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV98Wcwcomprods_1_filterfulltext ,
                                          int AV99Wcwcomprods_2_tfentprvnum ,
                                          int AV100Wcwcomprods_3_tfentprvnum_to ,
                                          java.util.Date AV101Wcwcomprods_4_tfentfecent ,
                                          String AV103Wcwcomprods_6_tfprdnum_sel ,
                                          String AV102Wcwcomprods_5_tfprdnum ,
                                          String AV105Wcwcomprods_8_tfprdnom_sel ,
                                          String AV104Wcwcomprods_7_tfprdnom ,
                                          int AV106Wcwcomprods_9_tfpedcod ,
                                          int AV107Wcwcomprods_10_tfpedcod_to ,
                                          java.math.BigDecimal AV108Wcwcomprods_11_tfentunient ,
                                          java.math.BigDecimal AV109Wcwcomprods_12_tfentunient_to ,
                                          java.math.BigDecimal AV110Wcwcomprods_13_tfentpre ,
                                          java.math.BigDecimal AV111Wcwcomprods_14_tfentpre_to ,
                                          java.math.BigDecimal AV112Wcwcomprods_15_tfpedvalformula ,
                                          java.math.BigDecimal AV113Wcwcomprods_16_tfpedvalformula_to ,
                                          String AV115Wcwcomprods_18_tfentlotn_sel ,
                                          String AV114Wcwcomprods_17_tfentlotn ,
                                          String AV117Wcwcomprods_20_tfentremnro_sel ,
                                          String AV116Wcwcomprods_19_tfentremnro ,
                                          int A6156EntPrvNum ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A665PedPre ,
                                          java.math.BigDecimal A660PedDto ,
                                          String A5686EntLotN ,
                                          String A10187EntRemNro ,
                                          java.util.Date A415EntFecEnt ,
                                          java.util.Date AV49EntFecEnt ,
                                          java.util.Date AV50EntFecEnt_to ,
                                          int AV51PrvNum ,
                                          int AV52PrvNum_to ,
                                          String AV53Prdnum ,
                                          String AV54Prdnum_to ,
                                          String A11Albaran ,
                                          String A396EmprCod ,
                                          String AV48Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[35];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EntRemNro, T1.Albaran, T1.EntLotN, T1.EntPre, T1.EntUniEnt, T1.PedCod, T2.PrdNom, T1.PrdNum, T1.EntFecEnt, T1.EntPrvNum, T3.PedDto, T3.PedPre," ;
      scmdbuf += " T3.PedUni, T1.LinEnt FROM ((TXPENTALM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPLPEDID T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PedCod = T1.PedCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      addWhere(sWhereString, "(T1.EntFecEnt <= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'INV')");
      addWhere(sWhereString, "(SUBSTR(T1.Albaran, 1, 3) <> 'REC')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV98Wcwcomprods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EntPrvNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntUniEnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.EntPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2),'999999990.99'), 2) like '%' || ?) or ( UPPER(T1.EntLotN) like '%' || UPPER(?)) or ( UPPER(T1.EntRemNro) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV99Wcwcomprods_2_tfentprvnum) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV100Wcwcomprods_3_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(T1.EntPrvNum <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Wcwcomprods_4_tfentfecent)) )
      {
         addWhere(sWhereString, "(T1.EntFecEnt >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV102Wcwcomprods_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Wcwcomprods_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Wcwcomprods_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Wcwcomprods_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV106Wcwcomprods_9_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV107Wcwcomprods_10_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Wcwcomprods_11_tfentunient)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Wcwcomprods_12_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntUniEnt <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Wcwcomprods_13_tfentpre)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Wcwcomprods_14_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.EntPre <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Wcwcomprods_15_tfpedvalformula)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Wcwcomprods_16_tfpedvalformula_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(( T3.PedUni * CAST(T3.PedPre AS NUMERIC(24,10))) * CAST(( 1 - ( CAST(T3.PedDto / 100 AS NUMERIC(15,10)))) AS NUMERIC(28,10)), 2) <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcwcomprods_17_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcwcomprods_18_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntLotN = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcwcomprods_19_tfentremnro)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EntRemNro) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcwcomprods_20_tfentremnro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EntRemNro = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EntRemNro" ;
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
                  return conditional_P08PJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] );
            case 1 :
                  return conditional_P08PJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] );
            case 2 :
                  return conditional_P08PJ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] );
            case 3 :
                  return conditional_P08PJ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[16])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 12);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 12);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 12);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[35]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[53]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 12);
               }
               return;
      }
   }

}

