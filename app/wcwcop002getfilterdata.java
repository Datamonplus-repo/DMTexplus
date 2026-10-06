package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcop002getfilterdata extends GXProcedure
{
   public wcwcop002getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcop002getfilterdata.class ), "" );
   }

   public wcwcop002getfilterdata( int remoteHandle ,
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
      wcwcop002getfilterdata.this.aP5 = new String[] {""};
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
      wcwcop002getfilterdata.this.AV24DDOName = aP0;
      wcwcop002getfilterdata.this.AV22SearchTxt = aP1;
      wcwcop002getfilterdata.this.AV23SearchTxtTo = aP2;
      wcwcop002getfilterdata.this.aP3 = aP3;
      wcwcop002getfilterdata.this.aP4 = aP4;
      wcwcop002getfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV35Session.getValue("WCWcop002GridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcop002GridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("WCWcop002GridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV14TFPrdExiAlm = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdExiAlm_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV16TFPrdCanRes = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdCanRes_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV18TFPrdCanPen = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrdCanPen_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV20TFValDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV21TFValDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV40Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV41PrvNum = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV22SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV47Wcwcop002ds_1_filterfulltext = AV42FilterFullText ;
      AV48Wcwcop002ds_2_tfprdnum = AV10TFPrdNum ;
      AV49Wcwcop002ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV50Wcwcop002ds_4_tfprdnom = AV12TFPrdNom ;
      AV51Wcwcop002ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV52Wcwcop002ds_6_tfprdexialm = AV14TFPrdExiAlm ;
      AV53Wcwcop002ds_7_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV54Wcwcop002ds_8_tfprdcanres = AV16TFPrdCanRes ;
      AV55Wcwcop002ds_9_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV56Wcwcop002ds_10_tfprdcanpen = AV18TFPrdCanPen ;
      AV57Wcwcop002ds_11_tfprdcanpen_to = AV19TFPrdCanPen_To ;
      AV58Wcwcop002ds_12_tfvaldsc = AV20TFValDsc ;
      AV59Wcwcop002ds_13_tfvaldsc_sel = AV21TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Wcwcop002ds_1_filterfulltext ,
                                           AV49Wcwcop002ds_3_tfprdnum_sel ,
                                           AV48Wcwcop002ds_2_tfprdnum ,
                                           AV51Wcwcop002ds_5_tfprdnom_sel ,
                                           AV50Wcwcop002ds_4_tfprdnom ,
                                           AV52Wcwcop002ds_6_tfprdexialm ,
                                           AV53Wcwcop002ds_7_tfprdexialm_to ,
                                           AV54Wcwcop002ds_8_tfprdcanres ,
                                           AV55Wcwcop002ds_9_tfprdcanres_to ,
                                           AV56Wcwcop002ds_10_tfprdcanpen ,
                                           AV57Wcwcop002ds_11_tfprdcanpen_to ,
                                           AV59Wcwcop002ds_13_tfvaldsc_sel ,
                                           AV58Wcwcop002ds_12_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(AV41PrvNum) ,
                                           AV40Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV48Wcwcop002ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcwcop002ds_2_tfprdnum), 6, "%") ;
      lV50Wcwcop002ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV50Wcwcop002ds_4_tfprdnom), 26, "%") ;
      lV58Wcwcop002ds_12_tfvaldsc = GXutil.padr( GXutil.rtrim( AV58Wcwcop002ds_12_tfvaldsc), 16, "%") ;
      /* Using cursor P08RA2 */
      pr_default.execute(0, new Object[] {AV40Emprcod, Integer.valueOf(AV41PrvNum), lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV48Wcwcop002ds_2_tfprdnum, AV49Wcwcop002ds_3_tfprdnum_sel, lV50Wcwcop002ds_4_tfprdnom, AV51Wcwcop002ds_5_tfprdnom_sel, AV52Wcwcop002ds_6_tfprdexialm, AV53Wcwcop002ds_7_tfprdexialm_to, AV54Wcwcop002ds_8_tfprdcanres, AV55Wcwcop002ds_9_tfprdcanres_to, AV56Wcwcop002ds_10_tfprdcanpen, AV57Wcwcop002ds_11_tfprdcanpen_to, lV58Wcwcop002ds_12_tfvaldsc, AV59Wcwcop002ds_13_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8RA2 = false ;
         A396EmprCod = P08RA2_A396EmprCod[0] ;
         A719PrdNum = P08RA2_A719PrdNum[0] ;
         A856ValCod = P08RA2_A856ValCod[0] ;
         A795PrvNum = P08RA2_A795PrvNum[0] ;
         A857ValDsc = P08RA2_A857ValDsc[0] ;
         n857ValDsc = P08RA2_n857ValDsc[0] ;
         A684PrdCanPen = P08RA2_A684PrdCanPen[0] ;
         A685PrdCanRes = P08RA2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08RA2_A704PrdExiAlm[0] ;
         A718PrdNom = P08RA2_A718PrdNom[0] ;
         A857ValDsc = P08RA2_A857ValDsc[0] ;
         n857ValDsc = P08RA2_n857ValDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08RA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08RA2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8RA2 = false ;
            AV34count = (long)(AV34count+1) ;
            brk8RA2 = true ;
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
         if ( ! brk8RA2 )
         {
            brk8RA2 = true ;
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
      AV47Wcwcop002ds_1_filterfulltext = AV42FilterFullText ;
      AV48Wcwcop002ds_2_tfprdnum = AV10TFPrdNum ;
      AV49Wcwcop002ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV50Wcwcop002ds_4_tfprdnom = AV12TFPrdNom ;
      AV51Wcwcop002ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV52Wcwcop002ds_6_tfprdexialm = AV14TFPrdExiAlm ;
      AV53Wcwcop002ds_7_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV54Wcwcop002ds_8_tfprdcanres = AV16TFPrdCanRes ;
      AV55Wcwcop002ds_9_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV56Wcwcop002ds_10_tfprdcanpen = AV18TFPrdCanPen ;
      AV57Wcwcop002ds_11_tfprdcanpen_to = AV19TFPrdCanPen_To ;
      AV58Wcwcop002ds_12_tfvaldsc = AV20TFValDsc ;
      AV59Wcwcop002ds_13_tfvaldsc_sel = AV21TFValDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV47Wcwcop002ds_1_filterfulltext ,
                                           AV49Wcwcop002ds_3_tfprdnum_sel ,
                                           AV48Wcwcop002ds_2_tfprdnum ,
                                           AV51Wcwcop002ds_5_tfprdnom_sel ,
                                           AV50Wcwcop002ds_4_tfprdnom ,
                                           AV52Wcwcop002ds_6_tfprdexialm ,
                                           AV53Wcwcop002ds_7_tfprdexialm_to ,
                                           AV54Wcwcop002ds_8_tfprdcanres ,
                                           AV55Wcwcop002ds_9_tfprdcanres_to ,
                                           AV56Wcwcop002ds_10_tfprdcanpen ,
                                           AV57Wcwcop002ds_11_tfprdcanpen_to ,
                                           AV59Wcwcop002ds_13_tfvaldsc_sel ,
                                           AV58Wcwcop002ds_12_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(AV41PrvNum) ,
                                           AV40Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV48Wcwcop002ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcwcop002ds_2_tfprdnum), 6, "%") ;
      lV50Wcwcop002ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV50Wcwcop002ds_4_tfprdnom), 26, "%") ;
      lV58Wcwcop002ds_12_tfvaldsc = GXutil.padr( GXutil.rtrim( AV58Wcwcop002ds_12_tfvaldsc), 16, "%") ;
      /* Using cursor P08RA3 */
      pr_default.execute(1, new Object[] {AV40Emprcod, Integer.valueOf(AV41PrvNum), lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV48Wcwcop002ds_2_tfprdnum, AV49Wcwcop002ds_3_tfprdnum_sel, lV50Wcwcop002ds_4_tfprdnom, AV51Wcwcop002ds_5_tfprdnom_sel, AV52Wcwcop002ds_6_tfprdexialm, AV53Wcwcop002ds_7_tfprdexialm_to, AV54Wcwcop002ds_8_tfprdcanres, AV55Wcwcop002ds_9_tfprdcanres_to, AV56Wcwcop002ds_10_tfprdcanpen, AV57Wcwcop002ds_11_tfprdcanpen_to, lV58Wcwcop002ds_12_tfvaldsc, AV59Wcwcop002ds_13_tfvaldsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8RA4 = false ;
         A396EmprCod = P08RA3_A396EmprCod[0] ;
         A718PrdNom = P08RA3_A718PrdNom[0] ;
         A856ValCod = P08RA3_A856ValCod[0] ;
         A795PrvNum = P08RA3_A795PrvNum[0] ;
         A857ValDsc = P08RA3_A857ValDsc[0] ;
         n857ValDsc = P08RA3_n857ValDsc[0] ;
         A684PrdCanPen = P08RA3_A684PrdCanPen[0] ;
         A685PrdCanRes = P08RA3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08RA3_A704PrdExiAlm[0] ;
         A719PrdNum = P08RA3_A719PrdNum[0] ;
         A857ValDsc = P08RA3_A857ValDsc[0] ;
         n857ValDsc = P08RA3_n857ValDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08RA3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08RA3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8RA4 = false ;
            A719PrdNum = P08RA3_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8RA4 = true ;
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
         if ( ! brk8RA4 )
         {
            brk8RA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFValDsc = AV22SearchTxt ;
      AV21TFValDsc_Sel = "" ;
      AV47Wcwcop002ds_1_filterfulltext = AV42FilterFullText ;
      AV48Wcwcop002ds_2_tfprdnum = AV10TFPrdNum ;
      AV49Wcwcop002ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV50Wcwcop002ds_4_tfprdnom = AV12TFPrdNom ;
      AV51Wcwcop002ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV52Wcwcop002ds_6_tfprdexialm = AV14TFPrdExiAlm ;
      AV53Wcwcop002ds_7_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      AV54Wcwcop002ds_8_tfprdcanres = AV16TFPrdCanRes ;
      AV55Wcwcop002ds_9_tfprdcanres_to = AV17TFPrdCanRes_To ;
      AV56Wcwcop002ds_10_tfprdcanpen = AV18TFPrdCanPen ;
      AV57Wcwcop002ds_11_tfprdcanpen_to = AV19TFPrdCanPen_To ;
      AV58Wcwcop002ds_12_tfvaldsc = AV20TFValDsc ;
      AV59Wcwcop002ds_13_tfvaldsc_sel = AV21TFValDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV47Wcwcop002ds_1_filterfulltext ,
                                           AV49Wcwcop002ds_3_tfprdnum_sel ,
                                           AV48Wcwcop002ds_2_tfprdnum ,
                                           AV51Wcwcop002ds_5_tfprdnom_sel ,
                                           AV50Wcwcop002ds_4_tfprdnom ,
                                           AV52Wcwcop002ds_6_tfprdexialm ,
                                           AV53Wcwcop002ds_7_tfprdexialm_to ,
                                           AV54Wcwcop002ds_8_tfprdcanres ,
                                           AV55Wcwcop002ds_9_tfprdcanres_to ,
                                           AV56Wcwcop002ds_10_tfprdcanpen ,
                                           AV57Wcwcop002ds_11_tfprdcanpen_to ,
                                           AV59Wcwcop002ds_13_tfvaldsc_sel ,
                                           AV58Wcwcop002ds_12_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV41PrvNum) ,
                                           AV40Emprcod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV47Wcwcop002ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Wcwcop002ds_1_filterfulltext), "%", "") ;
      lV48Wcwcop002ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Wcwcop002ds_2_tfprdnum), 6, "%") ;
      lV50Wcwcop002ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV50Wcwcop002ds_4_tfprdnom), 26, "%") ;
      lV58Wcwcop002ds_12_tfvaldsc = GXutil.padr( GXutil.rtrim( AV58Wcwcop002ds_12_tfvaldsc), 16, "%") ;
      /* Using cursor P08RA4 */
      pr_default.execute(2, new Object[] {AV40Emprcod, Integer.valueOf(AV41PrvNum), lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV47Wcwcop002ds_1_filterfulltext, lV48Wcwcop002ds_2_tfprdnum, AV49Wcwcop002ds_3_tfprdnum_sel, lV50Wcwcop002ds_4_tfprdnom, AV51Wcwcop002ds_5_tfprdnom_sel, AV52Wcwcop002ds_6_tfprdexialm, AV53Wcwcop002ds_7_tfprdexialm_to, AV54Wcwcop002ds_8_tfprdcanres, AV55Wcwcop002ds_9_tfprdcanres_to, AV56Wcwcop002ds_10_tfprdcanpen, AV57Wcwcop002ds_11_tfprdcanpen_to, lV58Wcwcop002ds_12_tfvaldsc, AV59Wcwcop002ds_13_tfvaldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8RA6 = false ;
         A856ValCod = P08RA4_A856ValCod[0] ;
         A396EmprCod = P08RA4_A396EmprCod[0] ;
         A795PrvNum = P08RA4_A795PrvNum[0] ;
         A857ValDsc = P08RA4_A857ValDsc[0] ;
         n857ValDsc = P08RA4_n857ValDsc[0] ;
         A684PrdCanPen = P08RA4_A684PrdCanPen[0] ;
         A685PrdCanRes = P08RA4_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08RA4_A704PrdExiAlm[0] ;
         A718PrdNom = P08RA4_A718PrdNom[0] ;
         A719PrdNum = P08RA4_A719PrdNum[0] ;
         A857ValDsc = P08RA4_A857ValDsc[0] ;
         n857ValDsc = P08RA4_n857ValDsc[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08RA4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08RA4_A856ValCod[0] == A856ValCod ) )
         {
            brk8RA6 = false ;
            A719PrdNum = P08RA4_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8RA6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV26Option = A857ValDsc ;
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
         if ( ! brk8RA6 )
         {
            brk8RA6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcop002getfilterdata.this.AV28OptionsJson;
      this.aP4[0] = wcwcop002getfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = wcwcop002getfilterdata.this.AV33OptionIndexesJson;
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
      AV42FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdExiAlm = DecimalUtil.ZERO ;
      AV15TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV16TFPrdCanRes = DecimalUtil.ZERO ;
      AV17TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV18TFPrdCanPen = DecimalUtil.ZERO ;
      AV19TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV20TFValDsc = "" ;
      AV21TFValDsc_Sel = "" ;
      AV40Emprcod = "" ;
      A719PrdNum = "" ;
      AV47Wcwcop002ds_1_filterfulltext = "" ;
      AV48Wcwcop002ds_2_tfprdnum = "" ;
      AV49Wcwcop002ds_3_tfprdnum_sel = "" ;
      AV50Wcwcop002ds_4_tfprdnom = "" ;
      AV51Wcwcop002ds_5_tfprdnom_sel = "" ;
      AV52Wcwcop002ds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV53Wcwcop002ds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      AV54Wcwcop002ds_8_tfprdcanres = DecimalUtil.ZERO ;
      AV55Wcwcop002ds_9_tfprdcanres_to = DecimalUtil.ZERO ;
      AV56Wcwcop002ds_10_tfprdcanpen = DecimalUtil.ZERO ;
      AV57Wcwcop002ds_11_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV58Wcwcop002ds_12_tfvaldsc = "" ;
      AV59Wcwcop002ds_13_tfvaldsc_sel = "" ;
      scmdbuf = "" ;
      lV47Wcwcop002ds_1_filterfulltext = "" ;
      lV48Wcwcop002ds_2_tfprdnum = "" ;
      lV50Wcwcop002ds_4_tfprdnom = "" ;
      lV58Wcwcop002ds_12_tfvaldsc = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A396EmprCod = "" ;
      P08RA2_A396EmprCod = new String[] {""} ;
      P08RA2_A719PrdNum = new String[] {""} ;
      P08RA2_A856ValCod = new byte[1] ;
      P08RA2_A795PrvNum = new int[1] ;
      P08RA2_A857ValDsc = new String[] {""} ;
      P08RA2_n857ValDsc = new boolean[] {false} ;
      P08RA2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA2_A718PrdNom = new String[] {""} ;
      AV26Option = "" ;
      P08RA3_A396EmprCod = new String[] {""} ;
      P08RA3_A718PrdNom = new String[] {""} ;
      P08RA3_A856ValCod = new byte[1] ;
      P08RA3_A795PrvNum = new int[1] ;
      P08RA3_A857ValDsc = new String[] {""} ;
      P08RA3_n857ValDsc = new boolean[] {false} ;
      P08RA3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA3_A719PrdNum = new String[] {""} ;
      P08RA4_A856ValCod = new byte[1] ;
      P08RA4_A396EmprCod = new String[] {""} ;
      P08RA4_A795PrvNum = new int[1] ;
      P08RA4_A857ValDsc = new String[] {""} ;
      P08RA4_n857ValDsc = new boolean[] {false} ;
      P08RA4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RA4_A718PrdNom = new String[] {""} ;
      P08RA4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcop002getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08RA2_A396EmprCod, P08RA2_A719PrdNum, P08RA2_A856ValCod, P08RA2_A795PrvNum, P08RA2_A857ValDsc, P08RA2_n857ValDsc, P08RA2_A684PrdCanPen, P08RA2_A685PrdCanRes, P08RA2_A704PrdExiAlm, P08RA2_A718PrdNom
            }
            , new Object[] {
            P08RA3_A396EmprCod, P08RA3_A718PrdNom, P08RA3_A856ValCod, P08RA3_A795PrvNum, P08RA3_A857ValDsc, P08RA3_n857ValDsc, P08RA3_A684PrdCanPen, P08RA3_A685PrdCanRes, P08RA3_A704PrdExiAlm, P08RA3_A719PrdNum
            }
            , new Object[] {
            P08RA4_A856ValCod, P08RA4_A396EmprCod, P08RA4_A795PrvNum, P08RA4_A857ValDsc, P08RA4_n857ValDsc, P08RA4_A684PrdCanPen, P08RA4_A685PrdCanRes, P08RA4_A704PrdExiAlm, P08RA4_A718PrdNom, P08RA4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV41PrvNum ;
   private int A795PrvNum ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV14TFPrdExiAlm ;
   private java.math.BigDecimal AV15TFPrdExiAlm_To ;
   private java.math.BigDecimal AV16TFPrdCanRes ;
   private java.math.BigDecimal AV17TFPrdCanRes_To ;
   private java.math.BigDecimal AV18TFPrdCanPen ;
   private java.math.BigDecimal AV19TFPrdCanPen_To ;
   private java.math.BigDecimal AV52Wcwcop002ds_6_tfprdexialm ;
   private java.math.BigDecimal AV53Wcwcop002ds_7_tfprdexialm_to ;
   private java.math.BigDecimal AV54Wcwcop002ds_8_tfprdcanres ;
   private java.math.BigDecimal AV55Wcwcop002ds_9_tfprdcanres_to ;
   private java.math.BigDecimal AV56Wcwcop002ds_10_tfprdcanpen ;
   private java.math.BigDecimal AV57Wcwcop002ds_11_tfprdcanpen_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV20TFValDsc ;
   private String AV21TFValDsc_Sel ;
   private String AV40Emprcod ;
   private String A719PrdNum ;
   private String AV48Wcwcop002ds_2_tfprdnum ;
   private String AV49Wcwcop002ds_3_tfprdnum_sel ;
   private String AV50Wcwcop002ds_4_tfprdnom ;
   private String AV51Wcwcop002ds_5_tfprdnom_sel ;
   private String AV58Wcwcop002ds_12_tfvaldsc ;
   private String AV59Wcwcop002ds_13_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV48Wcwcop002ds_2_tfprdnum ;
   private String lV50Wcwcop002ds_4_tfprdnom ;
   private String lV58Wcwcop002ds_12_tfvaldsc ;
   private String A718PrdNom ;
   private String A857ValDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8RA2 ;
   private boolean n857ValDsc ;
   private boolean brk8RA4 ;
   private boolean brk8RA6 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV47Wcwcop002ds_1_filterfulltext ;
   private String lV47Wcwcop002ds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08RA2_A396EmprCod ;
   private String[] P08RA2_A719PrdNum ;
   private byte[] P08RA2_A856ValCod ;
   private int[] P08RA2_A795PrvNum ;
   private String[] P08RA2_A857ValDsc ;
   private boolean[] P08RA2_n857ValDsc ;
   private java.math.BigDecimal[] P08RA2_A684PrdCanPen ;
   private java.math.BigDecimal[] P08RA2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08RA2_A704PrdExiAlm ;
   private String[] P08RA2_A718PrdNom ;
   private String[] P08RA3_A396EmprCod ;
   private String[] P08RA3_A718PrdNom ;
   private byte[] P08RA3_A856ValCod ;
   private int[] P08RA3_A795PrvNum ;
   private String[] P08RA3_A857ValDsc ;
   private boolean[] P08RA3_n857ValDsc ;
   private java.math.BigDecimal[] P08RA3_A684PrdCanPen ;
   private java.math.BigDecimal[] P08RA3_A685PrdCanRes ;
   private java.math.BigDecimal[] P08RA3_A704PrdExiAlm ;
   private String[] P08RA3_A719PrdNum ;
   private byte[] P08RA4_A856ValCod ;
   private String[] P08RA4_A396EmprCod ;
   private int[] P08RA4_A795PrvNum ;
   private String[] P08RA4_A857ValDsc ;
   private boolean[] P08RA4_n857ValDsc ;
   private java.math.BigDecimal[] P08RA4_A684PrdCanPen ;
   private java.math.BigDecimal[] P08RA4_A685PrdCanRes ;
   private java.math.BigDecimal[] P08RA4_A704PrdExiAlm ;
   private String[] P08RA4_A718PrdNom ;
   private String[] P08RA4_A719PrdNum ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class wcwcop002getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08RA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Wcwcop002ds_1_filterfulltext ,
                                          String AV49Wcwcop002ds_3_tfprdnum_sel ,
                                          String AV48Wcwcop002ds_2_tfprdnum ,
                                          String AV51Wcwcop002ds_5_tfprdnom_sel ,
                                          String AV50Wcwcop002ds_4_tfprdnom ,
                                          java.math.BigDecimal AV52Wcwcop002ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV53Wcwcop002ds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV54Wcwcop002ds_8_tfprdcanres ,
                                          java.math.BigDecimal AV55Wcwcop002ds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV56Wcwcop002ds_10_tfprdcanpen ,
                                          java.math.BigDecimal AV57Wcwcop002ds_11_tfprdcanpen_to ,
                                          String AV59Wcwcop002ds_13_tfvaldsc_sel ,
                                          String AV58Wcwcop002ds_12_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          int A795PrvNum ,
                                          byte A856ValCod ,
                                          int AV41PrvNum ,
                                          String AV40Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.ValCod, T1.PrvNum, T2.ValDsc, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdNom FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (T1.PrvNum = 0))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> '#')");
      addWhere(sWhereString, "(Not (rtrim(SUBSTR(T1.PrdNum, 2, 1)) IS NULL AND NOT(SUBSTR(T1.PrdNum, 2, 1) IS NULL)))");
      addWhere(sWhereString, "(T1.ValCod >= 1)");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      addWhere(sWhereString, "(T1.PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV47Wcwcop002ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanPen,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwcop002ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwcop002ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwcop002ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcwcop002ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcwcop002ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcwcop002ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Wcwcop002ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcwcop002ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcwcop002ds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwcop002ds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwcop002ds_10_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwcop002ds_11_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcwcop002ds_13_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcwcop002ds_12_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcwcop002ds_13_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08RA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Wcwcop002ds_1_filterfulltext ,
                                          String AV49Wcwcop002ds_3_tfprdnum_sel ,
                                          String AV48Wcwcop002ds_2_tfprdnum ,
                                          String AV51Wcwcop002ds_5_tfprdnom_sel ,
                                          String AV50Wcwcop002ds_4_tfprdnom ,
                                          java.math.BigDecimal AV52Wcwcop002ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV53Wcwcop002ds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV54Wcwcop002ds_8_tfprdcanres ,
                                          java.math.BigDecimal AV55Wcwcop002ds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV56Wcwcop002ds_10_tfprdcanpen ,
                                          java.math.BigDecimal AV57Wcwcop002ds_11_tfprdcanpen_to ,
                                          String AV59Wcwcop002ds_13_tfvaldsc_sel ,
                                          String AV58Wcwcop002ds_12_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          int A795PrvNum ,
                                          byte A856ValCod ,
                                          int AV41PrvNum ,
                                          String AV40Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[20];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNom, T1.ValCod, T1.PrvNum, T2.ValDsc, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (T1.PrvNum = 0))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> '#')");
      addWhere(sWhereString, "(Not (rtrim(SUBSTR(T1.PrdNum, 2, 1)) IS NULL AND NOT(SUBSTR(T1.PrdNum, 2, 1) IS NULL)))");
      addWhere(sWhereString, "(T1.ValCod >= 1)");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      addWhere(sWhereString, "(T1.PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV47Wcwcop002ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanPen,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwcop002ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwcop002ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwcop002ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcwcop002ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcwcop002ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcwcop002ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Wcwcop002ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcwcop002ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcwcop002ds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwcop002ds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwcop002ds_10_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwcop002ds_11_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcwcop002ds_13_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcwcop002ds_12_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcwcop002ds_13_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08RA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Wcwcop002ds_1_filterfulltext ,
                                          String AV49Wcwcop002ds_3_tfprdnum_sel ,
                                          String AV48Wcwcop002ds_2_tfprdnum ,
                                          String AV51Wcwcop002ds_5_tfprdnom_sel ,
                                          String AV50Wcwcop002ds_4_tfprdnom ,
                                          java.math.BigDecimal AV52Wcwcop002ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV53Wcwcop002ds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV54Wcwcop002ds_8_tfprdcanres ,
                                          java.math.BigDecimal AV55Wcwcop002ds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV56Wcwcop002ds_10_tfprdcanpen ,
                                          java.math.BigDecimal AV57Wcwcop002ds_11_tfprdcanpen_to ,
                                          String AV59Wcwcop002ds_13_tfvaldsc_sel ,
                                          String AV58Wcwcop002ds_12_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          int A795PrvNum ,
                                          int AV41PrvNum ,
                                          String AV40Emprcod ,
                                          String A396EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[20];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T1.PrvNum, T2.ValDsc, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdNom, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ValCod >= 1)");
      addWhere(sWhereString, "(Not (T1.PrvNum = 0))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> '#')");
      addWhere(sWhereString, "(Not (rtrim(SUBSTR(T1.PrdNum, 2, 1)) IS NULL AND NOT(SUBSTR(T1.PrdNum, 2, 1) IS NULL)))");
      addWhere(sWhereString, "(T1.PrvNum = ?)");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      if ( ! (GXutil.strcmp("", AV47Wcwcop002ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanPen,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwcop002ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwcop002ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwcop002ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Wcwcop002ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Wcwcop002ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Wcwcop002ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Wcwcop002ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcwcop002ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcwcop002ds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwcop002ds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwcop002ds_10_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwcop002ds_11_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Wcwcop002ds_13_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Wcwcop002ds_12_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Wcwcop002ds_13_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ValCod" ;
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
                  return conditional_P08RA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 1 :
                  return conditional_P08RA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 2 :
                  return conditional_P08RA4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               return;
      }
   }

}

