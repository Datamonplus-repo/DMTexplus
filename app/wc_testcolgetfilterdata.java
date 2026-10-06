package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wc_testcolgetfilterdata extends GXProcedure
{
   public wc_testcolgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wc_testcolgetfilterdata.class ), "" );
   }

   public wc_testcolgetfilterdata( int remoteHandle ,
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
      wc_testcolgetfilterdata.this.aP5 = new String[] {""};
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
      wc_testcolgetfilterdata.this.AV30DDOName = aP0;
      wc_testcolgetfilterdata.this.AV28SearchTxt = aP1;
      wc_testcolgetfilterdata.this.AV29SearchTxtTo = aP2;
      wc_testcolgetfilterdata.this.aP3 = aP3;
      wc_testcolgetfilterdata.this.aP4 = aP4;
      wc_testcolgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_ESTCOL") == 0 )
      {
         /* Execute user subroutine: 'LOADESTCOLOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_UNIESTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADUNIESTCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_UNIESTDES") == 0 )
      {
         /* Execute user subroutine: 'LOADUNIESTDESOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("WC_TEstColGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WC_TEstColGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("WC_TEstColGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL") == 0 )
         {
            AV18TFEstCol = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL_SEL") == 0 )
         {
            AV19TFEstCol_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLLIN") == 0 )
         {
            AV47TFEstColLin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFEstColLin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV49TFPrdNum = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV50TFPrdNum_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV51TFPrdNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV52TFPrdNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLCNT") == 0 )
         {
            AV53TFEstColCnt = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFEstColCnt_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTCOD") == 0 )
         {
            AV55TFUniEstCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTCOD_SEL") == 0 )
         {
            AV56TFUniEstCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTDES") == 0 )
         {
            AV57TFUniEstDes = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTDES_SEL") == 0 )
         {
            AV58TFUniEstDes_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV59TFValCod = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFValCod_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV61TFValDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV62TFValDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63EmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV64CliCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ESTCOL") == 0 )
         {
            AV65EstCol = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADESTCOLOPTIONS' Routine */
      returnInSub = false ;
      AV18TFEstCol = AV28SearchTxt ;
      AV19TFEstCol_Sel = "" ;
      AV70Wc_testcolds_1_emprcod = AV63EmprCod ;
      AV71Wc_testcolds_2_clicod = AV64CliCod ;
      AV72Wc_testcolds_3_estcol = AV65EstCol ;
      AV73Wc_testcolds_4_filterfulltext = AV46FilterFullText ;
      AV74Wc_testcolds_5_tfclicod = AV14TFCliCod ;
      AV75Wc_testcolds_6_tfclicod_to = AV15TFCliCod_To ;
      AV76Wc_testcolds_7_tfestcol = AV18TFEstCol ;
      AV77Wc_testcolds_8_tfestcol_sel = AV19TFEstCol_Sel ;
      AV78Wc_testcolds_9_tfestcollin = AV47TFEstColLin ;
      AV79Wc_testcolds_10_tfestcollin_to = AV48TFEstColLin_To ;
      AV80Wc_testcolds_11_tfprdnum = AV49TFPrdNum ;
      AV81Wc_testcolds_12_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV82Wc_testcolds_13_tfprdnom = AV51TFPrdNom ;
      AV83Wc_testcolds_14_tfprdnom_sel = AV52TFPrdNom_Sel ;
      AV84Wc_testcolds_15_tfestcolcnt = AV53TFEstColCnt ;
      AV85Wc_testcolds_16_tfestcolcnt_to = AV54TFEstColCnt_To ;
      AV86Wc_testcolds_17_tfuniestcod = AV55TFUniEstCod ;
      AV87Wc_testcolds_18_tfuniestcod_sel = AV56TFUniEstCod_Sel ;
      AV88Wc_testcolds_19_tfuniestdes = AV57TFUniEstDes ;
      AV89Wc_testcolds_20_tfuniestdes_sel = AV58TFUniEstDes_Sel ;
      AV90Wc_testcolds_21_tfvalcod = AV59TFValCod ;
      AV91Wc_testcolds_22_tfvalcod_to = AV60TFValCod_To ;
      AV92Wc_testcolds_23_tfvaldsc = AV61TFValDsc ;
      AV93Wc_testcolds_24_tfvaldsc_sel = AV62TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV73Wc_testcolds_4_filterfulltext ,
                                           Integer.valueOf(AV74Wc_testcolds_5_tfclicod) ,
                                           Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to) ,
                                           AV77Wc_testcolds_8_tfestcol_sel ,
                                           AV76Wc_testcolds_7_tfestcol ,
                                           Short.valueOf(AV78Wc_testcolds_9_tfestcollin) ,
                                           Short.valueOf(AV79Wc_testcolds_10_tfestcollin_to) ,
                                           AV81Wc_testcolds_12_tfprdnum_sel ,
                                           AV80Wc_testcolds_11_tfprdnum ,
                                           AV83Wc_testcolds_14_tfprdnom_sel ,
                                           AV82Wc_testcolds_13_tfprdnom ,
                                           AV84Wc_testcolds_15_tfestcolcnt ,
                                           AV85Wc_testcolds_16_tfestcolcnt_to ,
                                           AV87Wc_testcolds_18_tfuniestcod_sel ,
                                           AV86Wc_testcolds_17_tfuniestcod ,
                                           AV89Wc_testcolds_20_tfuniestdes_sel ,
                                           AV88Wc_testcolds_19_tfuniestdes ,
                                           Byte.valueOf(AV90Wc_testcolds_21_tfvalcod) ,
                                           Byte.valueOf(AV91Wc_testcolds_22_tfvalcod_to) ,
                                           AV93Wc_testcolds_24_tfvaldsc_sel ,
                                           AV92Wc_testcolds_23_tfvaldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4415EstCol ,
                                           Short.valueOf(A4416EstColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4417EstColCnt ,
                                           A2144UniEstCod ,
                                           A2145UniEstDes ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6849EstColULin) ,
                                           AV70Wc_testcolds_1_emprcod ,
                                           Integer.valueOf(AV71Wc_testcolds_2_clicod) ,
                                           AV72Wc_testcolds_3_estcol ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Wc_testcolds_7_tfestcol = GXutil.padr( GXutil.rtrim( AV76Wc_testcolds_7_tfestcol), 20, "%") ;
      /* Using cursor P08WZ2 */
      pr_default.execute(0, new Object[] {AV70Wc_testcolds_1_emprcod, Integer.valueOf(AV71Wc_testcolds_2_clicod), AV72Wc_testcolds_3_estcol, Integer.valueOf(AV74Wc_testcolds_5_tfclicod), Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to), lV76Wc_testcolds_7_tfestcol, AV77Wc_testcolds_8_tfestcol_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6849EstColULin = P08WZ2_A6849EstColULin[0] ;
         n6849EstColULin = P08WZ2_n6849EstColULin[0] ;
         A4415EstCol = P08WZ2_A4415EstCol[0] ;
         A252CliCod = P08WZ2_A252CliCod[0] ;
         A396EmprCod = P08WZ2_A396EmprCod[0] ;
         if ( ! (GXutil.strcmp("", A4415EstCol)==0) )
         {
            AV32Option = A4415EstCol ;
            AV33Options.add(AV32Option, 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV49TFPrdNum = AV28SearchTxt ;
      AV50TFPrdNum_Sel = "" ;
      AV70Wc_testcolds_1_emprcod = AV63EmprCod ;
      AV71Wc_testcolds_2_clicod = AV64CliCod ;
      AV72Wc_testcolds_3_estcol = AV65EstCol ;
      AV73Wc_testcolds_4_filterfulltext = AV46FilterFullText ;
      AV74Wc_testcolds_5_tfclicod = AV14TFCliCod ;
      AV75Wc_testcolds_6_tfclicod_to = AV15TFCliCod_To ;
      AV76Wc_testcolds_7_tfestcol = AV18TFEstCol ;
      AV77Wc_testcolds_8_tfestcol_sel = AV19TFEstCol_Sel ;
      AV78Wc_testcolds_9_tfestcollin = AV47TFEstColLin ;
      AV79Wc_testcolds_10_tfestcollin_to = AV48TFEstColLin_To ;
      AV80Wc_testcolds_11_tfprdnum = AV49TFPrdNum ;
      AV81Wc_testcolds_12_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV82Wc_testcolds_13_tfprdnom = AV51TFPrdNom ;
      AV83Wc_testcolds_14_tfprdnom_sel = AV52TFPrdNom_Sel ;
      AV84Wc_testcolds_15_tfestcolcnt = AV53TFEstColCnt ;
      AV85Wc_testcolds_16_tfestcolcnt_to = AV54TFEstColCnt_To ;
      AV86Wc_testcolds_17_tfuniestcod = AV55TFUniEstCod ;
      AV87Wc_testcolds_18_tfuniestcod_sel = AV56TFUniEstCod_Sel ;
      AV88Wc_testcolds_19_tfuniestdes = AV57TFUniEstDes ;
      AV89Wc_testcolds_20_tfuniestdes_sel = AV58TFUniEstDes_Sel ;
      AV90Wc_testcolds_21_tfvalcod = AV59TFValCod ;
      AV91Wc_testcolds_22_tfvalcod_to = AV60TFValCod_To ;
      AV92Wc_testcolds_23_tfvaldsc = AV61TFValDsc ;
      AV93Wc_testcolds_24_tfvaldsc_sel = AV62TFValDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV73Wc_testcolds_4_filterfulltext ,
                                           Integer.valueOf(AV74Wc_testcolds_5_tfclicod) ,
                                           Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to) ,
                                           AV77Wc_testcolds_8_tfestcol_sel ,
                                           AV76Wc_testcolds_7_tfestcol ,
                                           Short.valueOf(AV78Wc_testcolds_9_tfestcollin) ,
                                           Short.valueOf(AV79Wc_testcolds_10_tfestcollin_to) ,
                                           AV81Wc_testcolds_12_tfprdnum_sel ,
                                           AV80Wc_testcolds_11_tfprdnum ,
                                           AV83Wc_testcolds_14_tfprdnom_sel ,
                                           AV82Wc_testcolds_13_tfprdnom ,
                                           AV84Wc_testcolds_15_tfestcolcnt ,
                                           AV85Wc_testcolds_16_tfestcolcnt_to ,
                                           AV87Wc_testcolds_18_tfuniestcod_sel ,
                                           AV86Wc_testcolds_17_tfuniestcod ,
                                           AV89Wc_testcolds_20_tfuniestdes_sel ,
                                           AV88Wc_testcolds_19_tfuniestdes ,
                                           Byte.valueOf(AV90Wc_testcolds_21_tfvalcod) ,
                                           Byte.valueOf(AV91Wc_testcolds_22_tfvalcod_to) ,
                                           AV93Wc_testcolds_24_tfvaldsc_sel ,
                                           AV92Wc_testcolds_23_tfvaldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4415EstCol ,
                                           Short.valueOf(A4416EstColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4417EstColCnt ,
                                           A2144UniEstCod ,
                                           A2145UniEstDes ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6849EstColULin) ,
                                           AV70Wc_testcolds_1_emprcod ,
                                           Integer.valueOf(AV71Wc_testcolds_2_clicod) ,
                                           AV72Wc_testcolds_3_estcol ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Wc_testcolds_7_tfestcol = GXutil.padr( GXutil.rtrim( AV76Wc_testcolds_7_tfestcol), 20, "%") ;
      /* Using cursor P08WZ3 */
      pr_default.execute(1, new Object[] {AV70Wc_testcolds_1_emprcod, Integer.valueOf(AV71Wc_testcolds_2_clicod), AV72Wc_testcolds_3_estcol, Integer.valueOf(AV74Wc_testcolds_5_tfclicod), Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to), lV76Wc_testcolds_7_tfestcol, AV77Wc_testcolds_8_tfestcol_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8WZ3 = false ;
         A396EmprCod = P08WZ3_A396EmprCod[0] ;
         A252CliCod = P08WZ3_A252CliCod[0] ;
         A4415EstCol = P08WZ3_A4415EstCol[0] ;
         A6849EstColULin = P08WZ3_A6849EstColULin[0] ;
         n6849EstColULin = P08WZ3_n6849EstColULin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08WZ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WZ3_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P08WZ3_A4415EstCol[0], A4415EstCol) == 0 ) )
         {
            brk8WZ3 = false ;
            AV40count = (long)(AV40count+1) ;
            brk8WZ3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV32Option = A719PrdNum ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WZ3 )
         {
            brk8WZ3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV51TFPrdNom = AV28SearchTxt ;
      AV52TFPrdNom_Sel = "" ;
      AV70Wc_testcolds_1_emprcod = AV63EmprCod ;
      AV71Wc_testcolds_2_clicod = AV64CliCod ;
      AV72Wc_testcolds_3_estcol = AV65EstCol ;
      AV73Wc_testcolds_4_filterfulltext = AV46FilterFullText ;
      AV74Wc_testcolds_5_tfclicod = AV14TFCliCod ;
      AV75Wc_testcolds_6_tfclicod_to = AV15TFCliCod_To ;
      AV76Wc_testcolds_7_tfestcol = AV18TFEstCol ;
      AV77Wc_testcolds_8_tfestcol_sel = AV19TFEstCol_Sel ;
      AV78Wc_testcolds_9_tfestcollin = AV47TFEstColLin ;
      AV79Wc_testcolds_10_tfestcollin_to = AV48TFEstColLin_To ;
      AV80Wc_testcolds_11_tfprdnum = AV49TFPrdNum ;
      AV81Wc_testcolds_12_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV82Wc_testcolds_13_tfprdnom = AV51TFPrdNom ;
      AV83Wc_testcolds_14_tfprdnom_sel = AV52TFPrdNom_Sel ;
      AV84Wc_testcolds_15_tfestcolcnt = AV53TFEstColCnt ;
      AV85Wc_testcolds_16_tfestcolcnt_to = AV54TFEstColCnt_To ;
      AV86Wc_testcolds_17_tfuniestcod = AV55TFUniEstCod ;
      AV87Wc_testcolds_18_tfuniestcod_sel = AV56TFUniEstCod_Sel ;
      AV88Wc_testcolds_19_tfuniestdes = AV57TFUniEstDes ;
      AV89Wc_testcolds_20_tfuniestdes_sel = AV58TFUniEstDes_Sel ;
      AV90Wc_testcolds_21_tfvalcod = AV59TFValCod ;
      AV91Wc_testcolds_22_tfvalcod_to = AV60TFValCod_To ;
      AV92Wc_testcolds_23_tfvaldsc = AV61TFValDsc ;
      AV93Wc_testcolds_24_tfvaldsc_sel = AV62TFValDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV73Wc_testcolds_4_filterfulltext ,
                                           Integer.valueOf(AV74Wc_testcolds_5_tfclicod) ,
                                           Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to) ,
                                           AV77Wc_testcolds_8_tfestcol_sel ,
                                           AV76Wc_testcolds_7_tfestcol ,
                                           Short.valueOf(AV78Wc_testcolds_9_tfestcollin) ,
                                           Short.valueOf(AV79Wc_testcolds_10_tfestcollin_to) ,
                                           AV81Wc_testcolds_12_tfprdnum_sel ,
                                           AV80Wc_testcolds_11_tfprdnum ,
                                           AV83Wc_testcolds_14_tfprdnom_sel ,
                                           AV82Wc_testcolds_13_tfprdnom ,
                                           AV84Wc_testcolds_15_tfestcolcnt ,
                                           AV85Wc_testcolds_16_tfestcolcnt_to ,
                                           AV87Wc_testcolds_18_tfuniestcod_sel ,
                                           AV86Wc_testcolds_17_tfuniestcod ,
                                           AV89Wc_testcolds_20_tfuniestdes_sel ,
                                           AV88Wc_testcolds_19_tfuniestdes ,
                                           Byte.valueOf(AV90Wc_testcolds_21_tfvalcod) ,
                                           Byte.valueOf(AV91Wc_testcolds_22_tfvalcod_to) ,
                                           AV93Wc_testcolds_24_tfvaldsc_sel ,
                                           AV92Wc_testcolds_23_tfvaldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4415EstCol ,
                                           Short.valueOf(A4416EstColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4417EstColCnt ,
                                           A2144UniEstCod ,
                                           A2145UniEstDes ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6849EstColULin) ,
                                           AV70Wc_testcolds_1_emprcod ,
                                           Integer.valueOf(AV71Wc_testcolds_2_clicod) ,
                                           AV72Wc_testcolds_3_estcol ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Wc_testcolds_7_tfestcol = GXutil.padr( GXutil.rtrim( AV76Wc_testcolds_7_tfestcol), 20, "%") ;
      /* Using cursor P08WZ4 */
      pr_default.execute(2, new Object[] {AV70Wc_testcolds_1_emprcod, Integer.valueOf(AV71Wc_testcolds_2_clicod), AV72Wc_testcolds_3_estcol, Integer.valueOf(AV74Wc_testcolds_5_tfclicod), Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to), lV76Wc_testcolds_7_tfestcol, AV77Wc_testcolds_8_tfestcol_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8WZ5 = false ;
         A396EmprCod = P08WZ4_A396EmprCod[0] ;
         A252CliCod = P08WZ4_A252CliCod[0] ;
         A4415EstCol = P08WZ4_A4415EstCol[0] ;
         A6849EstColULin = P08WZ4_A6849EstColULin[0] ;
         n6849EstColULin = P08WZ4_n6849EstColULin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08WZ4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WZ4_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P08WZ4_A4415EstCol[0], A4415EstCol) == 0 ) )
         {
            brk8WZ5 = false ;
            AV40count = (long)(AV40count+1) ;
            brk8WZ5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV32Option = A718PrdNom ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            AV33Options.add(AV32Option, AV31InsertIndex);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WZ5 )
         {
            brk8WZ5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADUNIESTCODOPTIONS' Routine */
      returnInSub = false ;
      AV55TFUniEstCod = AV28SearchTxt ;
      AV56TFUniEstCod_Sel = "" ;
      AV70Wc_testcolds_1_emprcod = AV63EmprCod ;
      AV71Wc_testcolds_2_clicod = AV64CliCod ;
      AV72Wc_testcolds_3_estcol = AV65EstCol ;
      AV73Wc_testcolds_4_filterfulltext = AV46FilterFullText ;
      AV74Wc_testcolds_5_tfclicod = AV14TFCliCod ;
      AV75Wc_testcolds_6_tfclicod_to = AV15TFCliCod_To ;
      AV76Wc_testcolds_7_tfestcol = AV18TFEstCol ;
      AV77Wc_testcolds_8_tfestcol_sel = AV19TFEstCol_Sel ;
      AV78Wc_testcolds_9_tfestcollin = AV47TFEstColLin ;
      AV79Wc_testcolds_10_tfestcollin_to = AV48TFEstColLin_To ;
      AV80Wc_testcolds_11_tfprdnum = AV49TFPrdNum ;
      AV81Wc_testcolds_12_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV82Wc_testcolds_13_tfprdnom = AV51TFPrdNom ;
      AV83Wc_testcolds_14_tfprdnom_sel = AV52TFPrdNom_Sel ;
      AV84Wc_testcolds_15_tfestcolcnt = AV53TFEstColCnt ;
      AV85Wc_testcolds_16_tfestcolcnt_to = AV54TFEstColCnt_To ;
      AV86Wc_testcolds_17_tfuniestcod = AV55TFUniEstCod ;
      AV87Wc_testcolds_18_tfuniestcod_sel = AV56TFUniEstCod_Sel ;
      AV88Wc_testcolds_19_tfuniestdes = AV57TFUniEstDes ;
      AV89Wc_testcolds_20_tfuniestdes_sel = AV58TFUniEstDes_Sel ;
      AV90Wc_testcolds_21_tfvalcod = AV59TFValCod ;
      AV91Wc_testcolds_22_tfvalcod_to = AV60TFValCod_To ;
      AV92Wc_testcolds_23_tfvaldsc = AV61TFValDsc ;
      AV93Wc_testcolds_24_tfvaldsc_sel = AV62TFValDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV73Wc_testcolds_4_filterfulltext ,
                                           Integer.valueOf(AV74Wc_testcolds_5_tfclicod) ,
                                           Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to) ,
                                           AV77Wc_testcolds_8_tfestcol_sel ,
                                           AV76Wc_testcolds_7_tfestcol ,
                                           Short.valueOf(AV78Wc_testcolds_9_tfestcollin) ,
                                           Short.valueOf(AV79Wc_testcolds_10_tfestcollin_to) ,
                                           AV81Wc_testcolds_12_tfprdnum_sel ,
                                           AV80Wc_testcolds_11_tfprdnum ,
                                           AV83Wc_testcolds_14_tfprdnom_sel ,
                                           AV82Wc_testcolds_13_tfprdnom ,
                                           AV84Wc_testcolds_15_tfestcolcnt ,
                                           AV85Wc_testcolds_16_tfestcolcnt_to ,
                                           AV87Wc_testcolds_18_tfuniestcod_sel ,
                                           AV86Wc_testcolds_17_tfuniestcod ,
                                           AV89Wc_testcolds_20_tfuniestdes_sel ,
                                           AV88Wc_testcolds_19_tfuniestdes ,
                                           Byte.valueOf(AV90Wc_testcolds_21_tfvalcod) ,
                                           Byte.valueOf(AV91Wc_testcolds_22_tfvalcod_to) ,
                                           AV93Wc_testcolds_24_tfvaldsc_sel ,
                                           AV92Wc_testcolds_23_tfvaldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4415EstCol ,
                                           Short.valueOf(A4416EstColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4417EstColCnt ,
                                           A2144UniEstCod ,
                                           A2145UniEstDes ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6849EstColULin) ,
                                           AV70Wc_testcolds_1_emprcod ,
                                           Integer.valueOf(AV71Wc_testcolds_2_clicod) ,
                                           AV72Wc_testcolds_3_estcol ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Wc_testcolds_7_tfestcol = GXutil.padr( GXutil.rtrim( AV76Wc_testcolds_7_tfestcol), 20, "%") ;
      /* Using cursor P08WZ5 */
      pr_default.execute(3, new Object[] {AV70Wc_testcolds_1_emprcod, Integer.valueOf(AV71Wc_testcolds_2_clicod), AV72Wc_testcolds_3_estcol, Integer.valueOf(AV74Wc_testcolds_5_tfclicod), Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to), lV76Wc_testcolds_7_tfestcol, AV77Wc_testcolds_8_tfestcol_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8WZ7 = false ;
         A396EmprCod = P08WZ5_A396EmprCod[0] ;
         A252CliCod = P08WZ5_A252CliCod[0] ;
         A4415EstCol = P08WZ5_A4415EstCol[0] ;
         A6849EstColULin = P08WZ5_A6849EstColULin[0] ;
         n6849EstColULin = P08WZ5_n6849EstColULin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08WZ5_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WZ5_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P08WZ5_A4415EstCol[0], A4415EstCol) == 0 ) )
         {
            brk8WZ7 = false ;
            AV40count = (long)(AV40count+1) ;
            brk8WZ7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A2144UniEstCod)==0) )
         {
            AV32Option = A2144UniEstCod ;
            AV35OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!"))) ;
            AV33Options.add(AV32Option, 0);
            AV36OptionsDesc.add(AV35OptionDesc, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WZ7 )
         {
            brk8WZ7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADUNIESTDESOPTIONS' Routine */
      returnInSub = false ;
      AV57TFUniEstDes = AV28SearchTxt ;
      AV58TFUniEstDes_Sel = "" ;
      AV70Wc_testcolds_1_emprcod = AV63EmprCod ;
      AV71Wc_testcolds_2_clicod = AV64CliCod ;
      AV72Wc_testcolds_3_estcol = AV65EstCol ;
      AV73Wc_testcolds_4_filterfulltext = AV46FilterFullText ;
      AV74Wc_testcolds_5_tfclicod = AV14TFCliCod ;
      AV75Wc_testcolds_6_tfclicod_to = AV15TFCliCod_To ;
      AV76Wc_testcolds_7_tfestcol = AV18TFEstCol ;
      AV77Wc_testcolds_8_tfestcol_sel = AV19TFEstCol_Sel ;
      AV78Wc_testcolds_9_tfestcollin = AV47TFEstColLin ;
      AV79Wc_testcolds_10_tfestcollin_to = AV48TFEstColLin_To ;
      AV80Wc_testcolds_11_tfprdnum = AV49TFPrdNum ;
      AV81Wc_testcolds_12_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV82Wc_testcolds_13_tfprdnom = AV51TFPrdNom ;
      AV83Wc_testcolds_14_tfprdnom_sel = AV52TFPrdNom_Sel ;
      AV84Wc_testcolds_15_tfestcolcnt = AV53TFEstColCnt ;
      AV85Wc_testcolds_16_tfestcolcnt_to = AV54TFEstColCnt_To ;
      AV86Wc_testcolds_17_tfuniestcod = AV55TFUniEstCod ;
      AV87Wc_testcolds_18_tfuniestcod_sel = AV56TFUniEstCod_Sel ;
      AV88Wc_testcolds_19_tfuniestdes = AV57TFUniEstDes ;
      AV89Wc_testcolds_20_tfuniestdes_sel = AV58TFUniEstDes_Sel ;
      AV90Wc_testcolds_21_tfvalcod = AV59TFValCod ;
      AV91Wc_testcolds_22_tfvalcod_to = AV60TFValCod_To ;
      AV92Wc_testcolds_23_tfvaldsc = AV61TFValDsc ;
      AV93Wc_testcolds_24_tfvaldsc_sel = AV62TFValDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV73Wc_testcolds_4_filterfulltext ,
                                           Integer.valueOf(AV74Wc_testcolds_5_tfclicod) ,
                                           Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to) ,
                                           AV77Wc_testcolds_8_tfestcol_sel ,
                                           AV76Wc_testcolds_7_tfestcol ,
                                           Short.valueOf(AV78Wc_testcolds_9_tfestcollin) ,
                                           Short.valueOf(AV79Wc_testcolds_10_tfestcollin_to) ,
                                           AV81Wc_testcolds_12_tfprdnum_sel ,
                                           AV80Wc_testcolds_11_tfprdnum ,
                                           AV83Wc_testcolds_14_tfprdnom_sel ,
                                           AV82Wc_testcolds_13_tfprdnom ,
                                           AV84Wc_testcolds_15_tfestcolcnt ,
                                           AV85Wc_testcolds_16_tfestcolcnt_to ,
                                           AV87Wc_testcolds_18_tfuniestcod_sel ,
                                           AV86Wc_testcolds_17_tfuniestcod ,
                                           AV89Wc_testcolds_20_tfuniestdes_sel ,
                                           AV88Wc_testcolds_19_tfuniestdes ,
                                           Byte.valueOf(AV90Wc_testcolds_21_tfvalcod) ,
                                           Byte.valueOf(AV91Wc_testcolds_22_tfvalcod_to) ,
                                           AV93Wc_testcolds_24_tfvaldsc_sel ,
                                           AV92Wc_testcolds_23_tfvaldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4415EstCol ,
                                           Short.valueOf(A4416EstColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4417EstColCnt ,
                                           A2144UniEstCod ,
                                           A2145UniEstDes ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6849EstColULin) ,
                                           AV70Wc_testcolds_1_emprcod ,
                                           Integer.valueOf(AV71Wc_testcolds_2_clicod) ,
                                           AV72Wc_testcolds_3_estcol ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Wc_testcolds_7_tfestcol = GXutil.padr( GXutil.rtrim( AV76Wc_testcolds_7_tfestcol), 20, "%") ;
      /* Using cursor P08WZ6 */
      pr_default.execute(4, new Object[] {AV70Wc_testcolds_1_emprcod, Integer.valueOf(AV71Wc_testcolds_2_clicod), AV72Wc_testcolds_3_estcol, Integer.valueOf(AV74Wc_testcolds_5_tfclicod), Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to), lV76Wc_testcolds_7_tfestcol, AV77Wc_testcolds_8_tfestcol_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8WZ9 = false ;
         A396EmprCod = P08WZ6_A396EmprCod[0] ;
         A252CliCod = P08WZ6_A252CliCod[0] ;
         A4415EstCol = P08WZ6_A4415EstCol[0] ;
         A6849EstColULin = P08WZ6_A6849EstColULin[0] ;
         n6849EstColULin = P08WZ6_n6849EstColULin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08WZ6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WZ6_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P08WZ6_A4415EstCol[0], A4415EstCol) == 0 ) )
         {
            brk8WZ9 = false ;
            AV40count = (long)(AV40count+1) ;
            brk8WZ9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A2145UniEstDes)==0) )
         {
            AV32Option = A2145UniEstDes ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            AV33Options.add(AV32Option, AV31InsertIndex);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WZ9 )
         {
            brk8WZ9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV61TFValDsc = AV28SearchTxt ;
      AV62TFValDsc_Sel = "" ;
      AV70Wc_testcolds_1_emprcod = AV63EmprCod ;
      AV71Wc_testcolds_2_clicod = AV64CliCod ;
      AV72Wc_testcolds_3_estcol = AV65EstCol ;
      AV73Wc_testcolds_4_filterfulltext = AV46FilterFullText ;
      AV74Wc_testcolds_5_tfclicod = AV14TFCliCod ;
      AV75Wc_testcolds_6_tfclicod_to = AV15TFCliCod_To ;
      AV76Wc_testcolds_7_tfestcol = AV18TFEstCol ;
      AV77Wc_testcolds_8_tfestcol_sel = AV19TFEstCol_Sel ;
      AV78Wc_testcolds_9_tfestcollin = AV47TFEstColLin ;
      AV79Wc_testcolds_10_tfestcollin_to = AV48TFEstColLin_To ;
      AV80Wc_testcolds_11_tfprdnum = AV49TFPrdNum ;
      AV81Wc_testcolds_12_tfprdnum_sel = AV50TFPrdNum_Sel ;
      AV82Wc_testcolds_13_tfprdnom = AV51TFPrdNom ;
      AV83Wc_testcolds_14_tfprdnom_sel = AV52TFPrdNom_Sel ;
      AV84Wc_testcolds_15_tfestcolcnt = AV53TFEstColCnt ;
      AV85Wc_testcolds_16_tfestcolcnt_to = AV54TFEstColCnt_To ;
      AV86Wc_testcolds_17_tfuniestcod = AV55TFUniEstCod ;
      AV87Wc_testcolds_18_tfuniestcod_sel = AV56TFUniEstCod_Sel ;
      AV88Wc_testcolds_19_tfuniestdes = AV57TFUniEstDes ;
      AV89Wc_testcolds_20_tfuniestdes_sel = AV58TFUniEstDes_Sel ;
      AV90Wc_testcolds_21_tfvalcod = AV59TFValCod ;
      AV91Wc_testcolds_22_tfvalcod_to = AV60TFValCod_To ;
      AV92Wc_testcolds_23_tfvaldsc = AV61TFValDsc ;
      AV93Wc_testcolds_24_tfvaldsc_sel = AV62TFValDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV73Wc_testcolds_4_filterfulltext ,
                                           Integer.valueOf(AV74Wc_testcolds_5_tfclicod) ,
                                           Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to) ,
                                           AV77Wc_testcolds_8_tfestcol_sel ,
                                           AV76Wc_testcolds_7_tfestcol ,
                                           Short.valueOf(AV78Wc_testcolds_9_tfestcollin) ,
                                           Short.valueOf(AV79Wc_testcolds_10_tfestcollin_to) ,
                                           AV81Wc_testcolds_12_tfprdnum_sel ,
                                           AV80Wc_testcolds_11_tfprdnum ,
                                           AV83Wc_testcolds_14_tfprdnom_sel ,
                                           AV82Wc_testcolds_13_tfprdnom ,
                                           AV84Wc_testcolds_15_tfestcolcnt ,
                                           AV85Wc_testcolds_16_tfestcolcnt_to ,
                                           AV87Wc_testcolds_18_tfuniestcod_sel ,
                                           AV86Wc_testcolds_17_tfuniestcod ,
                                           AV89Wc_testcolds_20_tfuniestdes_sel ,
                                           AV88Wc_testcolds_19_tfuniestdes ,
                                           Byte.valueOf(AV90Wc_testcolds_21_tfvalcod) ,
                                           Byte.valueOf(AV91Wc_testcolds_22_tfvalcod_to) ,
                                           AV93Wc_testcolds_24_tfvaldsc_sel ,
                                           AV92Wc_testcolds_23_tfvaldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4415EstCol ,
                                           Short.valueOf(A4416EstColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A4417EstColCnt ,
                                           A2144UniEstCod ,
                                           A2145UniEstDes ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6849EstColULin) ,
                                           AV70Wc_testcolds_1_emprcod ,
                                           Integer.valueOf(AV71Wc_testcolds_2_clicod) ,
                                           AV72Wc_testcolds_3_estcol ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV76Wc_testcolds_7_tfestcol = GXutil.padr( GXutil.rtrim( AV76Wc_testcolds_7_tfestcol), 20, "%") ;
      /* Using cursor P08WZ7 */
      pr_default.execute(5, new Object[] {AV70Wc_testcolds_1_emprcod, Integer.valueOf(AV71Wc_testcolds_2_clicod), AV72Wc_testcolds_3_estcol, Integer.valueOf(AV74Wc_testcolds_5_tfclicod), Integer.valueOf(AV75Wc_testcolds_6_tfclicod_to), lV76Wc_testcolds_7_tfestcol, AV77Wc_testcolds_8_tfestcol_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8WZ11 = false ;
         A396EmprCod = P08WZ7_A396EmprCod[0] ;
         A252CliCod = P08WZ7_A252CliCod[0] ;
         A4415EstCol = P08WZ7_A4415EstCol[0] ;
         A6849EstColULin = P08WZ7_A6849EstColULin[0] ;
         n6849EstColULin = P08WZ7_n6849EstColULin[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08WZ7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08WZ7_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P08WZ7_A4415EstCol[0], A4415EstCol) == 0 ) )
         {
            brk8WZ11 = false ;
            AV40count = (long)(AV40count+1) ;
            brk8WZ11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV32Option = A857ValDsc ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WZ11 )
         {
            brk8WZ11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wc_testcolgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = wc_testcolgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = wc_testcolgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV18TFEstCol = "" ;
      AV19TFEstCol_Sel = "" ;
      AV49TFPrdNum = "" ;
      AV50TFPrdNum_Sel = "" ;
      AV51TFPrdNom = "" ;
      AV52TFPrdNom_Sel = "" ;
      AV53TFEstColCnt = DecimalUtil.ZERO ;
      AV54TFEstColCnt_To = DecimalUtil.ZERO ;
      AV55TFUniEstCod = "" ;
      AV56TFUniEstCod_Sel = "" ;
      AV57TFUniEstDes = "" ;
      AV58TFUniEstDes_Sel = "" ;
      AV61TFValDsc = "" ;
      AV62TFValDsc_Sel = "" ;
      AV63EmprCod = "" ;
      AV65EstCol = "" ;
      A4415EstCol = "" ;
      AV70Wc_testcolds_1_emprcod = "" ;
      AV72Wc_testcolds_3_estcol = "" ;
      AV73Wc_testcolds_4_filterfulltext = "" ;
      AV76Wc_testcolds_7_tfestcol = "" ;
      AV77Wc_testcolds_8_tfestcol_sel = "" ;
      AV80Wc_testcolds_11_tfprdnum = "" ;
      AV81Wc_testcolds_12_tfprdnum_sel = "" ;
      AV82Wc_testcolds_13_tfprdnom = "" ;
      AV83Wc_testcolds_14_tfprdnom_sel = "" ;
      AV84Wc_testcolds_15_tfestcolcnt = DecimalUtil.ZERO ;
      AV85Wc_testcolds_16_tfestcolcnt_to = DecimalUtil.ZERO ;
      AV86Wc_testcolds_17_tfuniestcod = "" ;
      AV87Wc_testcolds_18_tfuniestcod_sel = "" ;
      AV88Wc_testcolds_19_tfuniestdes = "" ;
      AV89Wc_testcolds_20_tfuniestdes_sel = "" ;
      AV92Wc_testcolds_23_tfvaldsc = "" ;
      AV93Wc_testcolds_24_tfvaldsc_sel = "" ;
      scmdbuf = "" ;
      lV73Wc_testcolds_4_filterfulltext = "" ;
      lV76Wc_testcolds_7_tfestcol = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A4417EstColCnt = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A2145UniEstDes = "" ;
      A857ValDsc = "" ;
      A396EmprCod = "" ;
      P08WZ2_A6849EstColULin = new int[1] ;
      P08WZ2_n6849EstColULin = new boolean[] {false} ;
      P08WZ2_A4415EstCol = new String[] {""} ;
      P08WZ2_A252CliCod = new int[1] ;
      P08WZ2_A396EmprCod = new String[] {""} ;
      AV32Option = "" ;
      P08WZ3_A396EmprCod = new String[] {""} ;
      P08WZ3_A252CliCod = new int[1] ;
      P08WZ3_A4415EstCol = new String[] {""} ;
      P08WZ3_A6849EstColULin = new int[1] ;
      P08WZ3_n6849EstColULin = new boolean[] {false} ;
      P08WZ4_A396EmprCod = new String[] {""} ;
      P08WZ4_A252CliCod = new int[1] ;
      P08WZ4_A4415EstCol = new String[] {""} ;
      P08WZ4_A6849EstColULin = new int[1] ;
      P08WZ4_n6849EstColULin = new boolean[] {false} ;
      P08WZ5_A396EmprCod = new String[] {""} ;
      P08WZ5_A252CliCod = new int[1] ;
      P08WZ5_A4415EstCol = new String[] {""} ;
      P08WZ5_A6849EstColULin = new int[1] ;
      P08WZ5_n6849EstColULin = new boolean[] {false} ;
      AV35OptionDesc = "" ;
      P08WZ6_A396EmprCod = new String[] {""} ;
      P08WZ6_A252CliCod = new int[1] ;
      P08WZ6_A4415EstCol = new String[] {""} ;
      P08WZ6_A6849EstColULin = new int[1] ;
      P08WZ6_n6849EstColULin = new boolean[] {false} ;
      P08WZ7_A396EmprCod = new String[] {""} ;
      P08WZ7_A252CliCod = new int[1] ;
      P08WZ7_A4415EstCol = new String[] {""} ;
      P08WZ7_A6849EstColULin = new int[1] ;
      P08WZ7_n6849EstColULin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wc_testcolgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08WZ2_A6849EstColULin, P08WZ2_n6849EstColULin, P08WZ2_A4415EstCol, P08WZ2_A252CliCod, P08WZ2_A396EmprCod
            }
            , new Object[] {
            P08WZ3_A396EmprCod, P08WZ3_A252CliCod, P08WZ3_A4415EstCol, P08WZ3_A6849EstColULin, P08WZ3_n6849EstColULin
            }
            , new Object[] {
            P08WZ4_A396EmprCod, P08WZ4_A252CliCod, P08WZ4_A4415EstCol, P08WZ4_A6849EstColULin, P08WZ4_n6849EstColULin
            }
            , new Object[] {
            P08WZ5_A396EmprCod, P08WZ5_A252CliCod, P08WZ5_A4415EstCol, P08WZ5_A6849EstColULin, P08WZ5_n6849EstColULin
            }
            , new Object[] {
            P08WZ6_A396EmprCod, P08WZ6_A252CliCod, P08WZ6_A4415EstCol, P08WZ6_A6849EstColULin, P08WZ6_n6849EstColULin
            }
            , new Object[] {
            P08WZ7_A396EmprCod, P08WZ7_A252CliCod, P08WZ7_A4415EstCol, P08WZ7_A6849EstColULin, P08WZ7_n6849EstColULin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV59TFValCod ;
   private byte AV60TFValCod_To ;
   private byte AV90Wc_testcolds_21_tfvalcod ;
   private byte AV91Wc_testcolds_22_tfvalcod_to ;
   private byte A856ValCod ;
   private short AV47TFEstColLin ;
   private short AV48TFEstColLin_To ;
   private short AV78Wc_testcolds_9_tfestcollin ;
   private short AV79Wc_testcolds_10_tfestcollin_to ;
   private short A4416EstColLin ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV64CliCod ;
   private int AV71Wc_testcolds_2_clicod ;
   private int AV74Wc_testcolds_5_tfclicod ;
   private int AV75Wc_testcolds_6_tfclicod_to ;
   private int A252CliCod ;
   private int A6849EstColULin ;
   private int AV31InsertIndex ;
   private long AV40count ;
   private java.math.BigDecimal AV53TFEstColCnt ;
   private java.math.BigDecimal AV54TFEstColCnt_To ;
   private java.math.BigDecimal AV84Wc_testcolds_15_tfestcolcnt ;
   private java.math.BigDecimal AV85Wc_testcolds_16_tfestcolcnt_to ;
   private java.math.BigDecimal A4417EstColCnt ;
   private String AV18TFEstCol ;
   private String AV19TFEstCol_Sel ;
   private String AV49TFPrdNum ;
   private String AV50TFPrdNum_Sel ;
   private String AV51TFPrdNom ;
   private String AV52TFPrdNom_Sel ;
   private String AV55TFUniEstCod ;
   private String AV56TFUniEstCod_Sel ;
   private String AV57TFUniEstDes ;
   private String AV58TFUniEstDes_Sel ;
   private String AV61TFValDsc ;
   private String AV62TFValDsc_Sel ;
   private String AV63EmprCod ;
   private String AV65EstCol ;
   private String A4415EstCol ;
   private String AV70Wc_testcolds_1_emprcod ;
   private String AV72Wc_testcolds_3_estcol ;
   private String AV76Wc_testcolds_7_tfestcol ;
   private String AV77Wc_testcolds_8_tfestcol_sel ;
   private String AV80Wc_testcolds_11_tfprdnum ;
   private String AV81Wc_testcolds_12_tfprdnum_sel ;
   private String AV82Wc_testcolds_13_tfprdnom ;
   private String AV83Wc_testcolds_14_tfprdnom_sel ;
   private String AV86Wc_testcolds_17_tfuniestcod ;
   private String AV87Wc_testcolds_18_tfuniestcod_sel ;
   private String AV88Wc_testcolds_19_tfuniestdes ;
   private String AV89Wc_testcolds_20_tfuniestdes_sel ;
   private String AV92Wc_testcolds_23_tfvaldsc ;
   private String AV93Wc_testcolds_24_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV76Wc_testcolds_7_tfestcol ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A2144UniEstCod ;
   private String A2145UniEstDes ;
   private String A857ValDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n6849EstColULin ;
   private boolean brk8WZ3 ;
   private boolean brk8WZ5 ;
   private boolean brk8WZ7 ;
   private boolean brk8WZ9 ;
   private boolean brk8WZ11 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV73Wc_testcolds_4_filterfulltext ;
   private String lV73Wc_testcolds_4_filterfulltext ;
   private String AV32Option ;
   private String AV35OptionDesc ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08WZ2_A6849EstColULin ;
   private boolean[] P08WZ2_n6849EstColULin ;
   private String[] P08WZ2_A4415EstCol ;
   private int[] P08WZ2_A252CliCod ;
   private String[] P08WZ2_A396EmprCod ;
   private String[] P08WZ3_A396EmprCod ;
   private int[] P08WZ3_A252CliCod ;
   private String[] P08WZ3_A4415EstCol ;
   private int[] P08WZ3_A6849EstColULin ;
   private boolean[] P08WZ3_n6849EstColULin ;
   private String[] P08WZ4_A396EmprCod ;
   private int[] P08WZ4_A252CliCod ;
   private String[] P08WZ4_A4415EstCol ;
   private int[] P08WZ4_A6849EstColULin ;
   private boolean[] P08WZ4_n6849EstColULin ;
   private String[] P08WZ5_A396EmprCod ;
   private int[] P08WZ5_A252CliCod ;
   private String[] P08WZ5_A4415EstCol ;
   private int[] P08WZ5_A6849EstColULin ;
   private boolean[] P08WZ5_n6849EstColULin ;
   private String[] P08WZ6_A396EmprCod ;
   private int[] P08WZ6_A252CliCod ;
   private String[] P08WZ6_A4415EstCol ;
   private int[] P08WZ6_A6849EstColULin ;
   private boolean[] P08WZ6_n6849EstColULin ;
   private String[] P08WZ7_A396EmprCod ;
   private int[] P08WZ7_A252CliCod ;
   private String[] P08WZ7_A4415EstCol ;
   private int[] P08WZ7_A6849EstColULin ;
   private boolean[] P08WZ7_n6849EstColULin ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class wc_testcolgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wc_testcolds_4_filterfulltext ,
                                          int AV74Wc_testcolds_5_tfclicod ,
                                          int AV75Wc_testcolds_6_tfclicod_to ,
                                          String AV77Wc_testcolds_8_tfestcol_sel ,
                                          String AV76Wc_testcolds_7_tfestcol ,
                                          short AV78Wc_testcolds_9_tfestcollin ,
                                          short AV79Wc_testcolds_10_tfestcollin_to ,
                                          String AV81Wc_testcolds_12_tfprdnum_sel ,
                                          String AV80Wc_testcolds_11_tfprdnum ,
                                          String AV83Wc_testcolds_14_tfprdnom_sel ,
                                          String AV82Wc_testcolds_13_tfprdnom ,
                                          java.math.BigDecimal AV84Wc_testcolds_15_tfestcolcnt ,
                                          java.math.BigDecimal AV85Wc_testcolds_16_tfestcolcnt_to ,
                                          String AV87Wc_testcolds_18_tfuniestcod_sel ,
                                          String AV86Wc_testcolds_17_tfuniestcod ,
                                          String AV89Wc_testcolds_20_tfuniestdes_sel ,
                                          String AV88Wc_testcolds_19_tfuniestdes ,
                                          byte AV90Wc_testcolds_21_tfvalcod ,
                                          byte AV91Wc_testcolds_22_tfvalcod_to ,
                                          String AV93Wc_testcolds_24_tfvaldsc_sel ,
                                          String AV92Wc_testcolds_23_tfvaldsc ,
                                          int A252CliCod ,
                                          String A4415EstCol ,
                                          short A4416EstColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4417EstColCnt ,
                                          String A2144UniEstCod ,
                                          String A2145UniEstDes ,
                                          byte A856ValCod ,
                                          String A857ValDsc ,
                                          int A6849EstColULin ,
                                          String AV70Wc_testcolds_1_emprcod ,
                                          int AV71Wc_testcolds_2_clicod ,
                                          String AV72Wc_testcolds_3_estcol ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS EstColULin, EstCol, NULL AS CliCod, NULL AS EmprCod FROM ( SELECT EstColULin, EstCol, CliCod, EmprCod FROM TXPCEstCo" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and EstCol = ?)");
      if ( ! (0==AV74Wc_testcolds_5_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Wc_testcolds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV76Wc_testcolds_7_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(EstCol = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, EstCol" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY EstCol" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08WZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wc_testcolds_4_filterfulltext ,
                                          int AV74Wc_testcolds_5_tfclicod ,
                                          int AV75Wc_testcolds_6_tfclicod_to ,
                                          String AV77Wc_testcolds_8_tfestcol_sel ,
                                          String AV76Wc_testcolds_7_tfestcol ,
                                          short AV78Wc_testcolds_9_tfestcollin ,
                                          short AV79Wc_testcolds_10_tfestcollin_to ,
                                          String AV81Wc_testcolds_12_tfprdnum_sel ,
                                          String AV80Wc_testcolds_11_tfprdnum ,
                                          String AV83Wc_testcolds_14_tfprdnom_sel ,
                                          String AV82Wc_testcolds_13_tfprdnom ,
                                          java.math.BigDecimal AV84Wc_testcolds_15_tfestcolcnt ,
                                          java.math.BigDecimal AV85Wc_testcolds_16_tfestcolcnt_to ,
                                          String AV87Wc_testcolds_18_tfuniestcod_sel ,
                                          String AV86Wc_testcolds_17_tfuniestcod ,
                                          String AV89Wc_testcolds_20_tfuniestdes_sel ,
                                          String AV88Wc_testcolds_19_tfuniestdes ,
                                          byte AV90Wc_testcolds_21_tfvalcod ,
                                          byte AV91Wc_testcolds_22_tfvalcod_to ,
                                          String AV93Wc_testcolds_24_tfvaldsc_sel ,
                                          String AV92Wc_testcolds_23_tfvaldsc ,
                                          int A252CliCod ,
                                          String A4415EstCol ,
                                          short A4416EstColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4417EstColCnt ,
                                          String A2144UniEstCod ,
                                          String A2145UniEstDes ,
                                          byte A856ValCod ,
                                          String A857ValDsc ,
                                          int A6849EstColULin ,
                                          String AV70Wc_testcolds_1_emprcod ,
                                          int AV71Wc_testcolds_2_clicod ,
                                          String AV72Wc_testcolds_3_estcol ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[7];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, EstCol, EstColULin FROM TXPCEstCo" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and EstCol = ?)");
      if ( ! (0==AV74Wc_testcolds_5_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Wc_testcolds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV76Wc_testcolds_7_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(EstCol = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, EstCol" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08WZ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wc_testcolds_4_filterfulltext ,
                                          int AV74Wc_testcolds_5_tfclicod ,
                                          int AV75Wc_testcolds_6_tfclicod_to ,
                                          String AV77Wc_testcolds_8_tfestcol_sel ,
                                          String AV76Wc_testcolds_7_tfestcol ,
                                          short AV78Wc_testcolds_9_tfestcollin ,
                                          short AV79Wc_testcolds_10_tfestcollin_to ,
                                          String AV81Wc_testcolds_12_tfprdnum_sel ,
                                          String AV80Wc_testcolds_11_tfprdnum ,
                                          String AV83Wc_testcolds_14_tfprdnom_sel ,
                                          String AV82Wc_testcolds_13_tfprdnom ,
                                          java.math.BigDecimal AV84Wc_testcolds_15_tfestcolcnt ,
                                          java.math.BigDecimal AV85Wc_testcolds_16_tfestcolcnt_to ,
                                          String AV87Wc_testcolds_18_tfuniestcod_sel ,
                                          String AV86Wc_testcolds_17_tfuniestcod ,
                                          String AV89Wc_testcolds_20_tfuniestdes_sel ,
                                          String AV88Wc_testcolds_19_tfuniestdes ,
                                          byte AV90Wc_testcolds_21_tfvalcod ,
                                          byte AV91Wc_testcolds_22_tfvalcod_to ,
                                          String AV93Wc_testcolds_24_tfvaldsc_sel ,
                                          String AV92Wc_testcolds_23_tfvaldsc ,
                                          int A252CliCod ,
                                          String A4415EstCol ,
                                          short A4416EstColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4417EstColCnt ,
                                          String A2144UniEstCod ,
                                          String A2145UniEstDes ,
                                          byte A856ValCod ,
                                          String A857ValDsc ,
                                          int A6849EstColULin ,
                                          String AV70Wc_testcolds_1_emprcod ,
                                          int AV71Wc_testcolds_2_clicod ,
                                          String AV72Wc_testcolds_3_estcol ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[7];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, EstCol, EstColULin FROM TXPCEstCo" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and EstCol = ?)");
      if ( ! (0==AV74Wc_testcolds_5_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Wc_testcolds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV76Wc_testcolds_7_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(EstCol = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, EstCol" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08WZ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wc_testcolds_4_filterfulltext ,
                                          int AV74Wc_testcolds_5_tfclicod ,
                                          int AV75Wc_testcolds_6_tfclicod_to ,
                                          String AV77Wc_testcolds_8_tfestcol_sel ,
                                          String AV76Wc_testcolds_7_tfestcol ,
                                          short AV78Wc_testcolds_9_tfestcollin ,
                                          short AV79Wc_testcolds_10_tfestcollin_to ,
                                          String AV81Wc_testcolds_12_tfprdnum_sel ,
                                          String AV80Wc_testcolds_11_tfprdnum ,
                                          String AV83Wc_testcolds_14_tfprdnom_sel ,
                                          String AV82Wc_testcolds_13_tfprdnom ,
                                          java.math.BigDecimal AV84Wc_testcolds_15_tfestcolcnt ,
                                          java.math.BigDecimal AV85Wc_testcolds_16_tfestcolcnt_to ,
                                          String AV87Wc_testcolds_18_tfuniestcod_sel ,
                                          String AV86Wc_testcolds_17_tfuniestcod ,
                                          String AV89Wc_testcolds_20_tfuniestdes_sel ,
                                          String AV88Wc_testcolds_19_tfuniestdes ,
                                          byte AV90Wc_testcolds_21_tfvalcod ,
                                          byte AV91Wc_testcolds_22_tfvalcod_to ,
                                          String AV93Wc_testcolds_24_tfvaldsc_sel ,
                                          String AV92Wc_testcolds_23_tfvaldsc ,
                                          int A252CliCod ,
                                          String A4415EstCol ,
                                          short A4416EstColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4417EstColCnt ,
                                          String A2144UniEstCod ,
                                          String A2145UniEstDes ,
                                          byte A856ValCod ,
                                          String A857ValDsc ,
                                          int A6849EstColULin ,
                                          String AV70Wc_testcolds_1_emprcod ,
                                          int AV71Wc_testcolds_2_clicod ,
                                          String AV72Wc_testcolds_3_estcol ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[7];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, EstCol, EstColULin FROM TXPCEstCo" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and EstCol = ?)");
      if ( ! (0==AV74Wc_testcolds_5_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Wc_testcolds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV76Wc_testcolds_7_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(EstCol = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, EstCol" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08WZ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wc_testcolds_4_filterfulltext ,
                                          int AV74Wc_testcolds_5_tfclicod ,
                                          int AV75Wc_testcolds_6_tfclicod_to ,
                                          String AV77Wc_testcolds_8_tfestcol_sel ,
                                          String AV76Wc_testcolds_7_tfestcol ,
                                          short AV78Wc_testcolds_9_tfestcollin ,
                                          short AV79Wc_testcolds_10_tfestcollin_to ,
                                          String AV81Wc_testcolds_12_tfprdnum_sel ,
                                          String AV80Wc_testcolds_11_tfprdnum ,
                                          String AV83Wc_testcolds_14_tfprdnom_sel ,
                                          String AV82Wc_testcolds_13_tfprdnom ,
                                          java.math.BigDecimal AV84Wc_testcolds_15_tfestcolcnt ,
                                          java.math.BigDecimal AV85Wc_testcolds_16_tfestcolcnt_to ,
                                          String AV87Wc_testcolds_18_tfuniestcod_sel ,
                                          String AV86Wc_testcolds_17_tfuniestcod ,
                                          String AV89Wc_testcolds_20_tfuniestdes_sel ,
                                          String AV88Wc_testcolds_19_tfuniestdes ,
                                          byte AV90Wc_testcolds_21_tfvalcod ,
                                          byte AV91Wc_testcolds_22_tfvalcod_to ,
                                          String AV93Wc_testcolds_24_tfvaldsc_sel ,
                                          String AV92Wc_testcolds_23_tfvaldsc ,
                                          int A252CliCod ,
                                          String A4415EstCol ,
                                          short A4416EstColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4417EstColCnt ,
                                          String A2144UniEstCod ,
                                          String A2145UniEstDes ,
                                          byte A856ValCod ,
                                          String A857ValDsc ,
                                          int A6849EstColULin ,
                                          String AV70Wc_testcolds_1_emprcod ,
                                          int AV71Wc_testcolds_2_clicod ,
                                          String AV72Wc_testcolds_3_estcol ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[7];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, EstCol, EstColULin FROM TXPCEstCo" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and EstCol = ?)");
      if ( ! (0==AV74Wc_testcolds_5_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Wc_testcolds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV76Wc_testcolds_7_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(EstCol = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, EstCol" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08WZ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wc_testcolds_4_filterfulltext ,
                                          int AV74Wc_testcolds_5_tfclicod ,
                                          int AV75Wc_testcolds_6_tfclicod_to ,
                                          String AV77Wc_testcolds_8_tfestcol_sel ,
                                          String AV76Wc_testcolds_7_tfestcol ,
                                          short AV78Wc_testcolds_9_tfestcollin ,
                                          short AV79Wc_testcolds_10_tfestcollin_to ,
                                          String AV81Wc_testcolds_12_tfprdnum_sel ,
                                          String AV80Wc_testcolds_11_tfprdnum ,
                                          String AV83Wc_testcolds_14_tfprdnom_sel ,
                                          String AV82Wc_testcolds_13_tfprdnom ,
                                          java.math.BigDecimal AV84Wc_testcolds_15_tfestcolcnt ,
                                          java.math.BigDecimal AV85Wc_testcolds_16_tfestcolcnt_to ,
                                          String AV87Wc_testcolds_18_tfuniestcod_sel ,
                                          String AV86Wc_testcolds_17_tfuniestcod ,
                                          String AV89Wc_testcolds_20_tfuniestdes_sel ,
                                          String AV88Wc_testcolds_19_tfuniestdes ,
                                          byte AV90Wc_testcolds_21_tfvalcod ,
                                          byte AV91Wc_testcolds_22_tfvalcod_to ,
                                          String AV93Wc_testcolds_24_tfvaldsc_sel ,
                                          String AV92Wc_testcolds_23_tfvaldsc ,
                                          int A252CliCod ,
                                          String A4415EstCol ,
                                          short A4416EstColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A4417EstColCnt ,
                                          String A2144UniEstCod ,
                                          String A2145UniEstDes ,
                                          byte A856ValCod ,
                                          String A857ValDsc ,
                                          int A6849EstColULin ,
                                          String AV70Wc_testcolds_1_emprcod ,
                                          int AV71Wc_testcolds_2_clicod ,
                                          String AV72Wc_testcolds_3_estcol ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[7];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, EstCol, EstColULin FROM TXPCEstCo" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and EstCol = ?)");
      if ( ! (0==AV74Wc_testcolds_5_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV75Wc_testcolds_6_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV76Wc_testcolds_7_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wc_testcolds_8_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(EstCol = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, EstCol" ;
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
                  return conditional_P08WZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 1 :
                  return conditional_P08WZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 2 :
                  return conditional_P08WZ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 3 :
                  return conditional_P08WZ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 4 :
                  return conditional_P08WZ6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 5 :
                  return conditional_P08WZ7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08WZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WZ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WZ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WZ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WZ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               return;
      }
   }

}

