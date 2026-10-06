package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcop001getfilterdata extends GXProcedure
{
   public wcwcop001getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcop001getfilterdata.class ), "" );
   }

   public wcwcop001getfilterdata( int remoteHandle ,
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
      wcwcop001getfilterdata.this.aP5 = new String[] {""};
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
      wcwcop001getfilterdata.this.AV18DDOName = aP0;
      wcwcop001getfilterdata.this.AV16SearchTxt = aP1;
      wcwcop001getfilterdata.this.AV17SearchTxtTo = aP2;
      wcwcop001getfilterdata.this.aP3 = aP3;
      wcwcop001getfilterdata.this.aP4 = aP4;
      wcwcop001getfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_VALDSC") == 0 )
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
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("WCWcop001GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWcop001GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCWcop001GridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
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
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV36TFPrdExiAlm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFPrdExiAlm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV38TFPrdCanRes = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFPrdCanRes_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV40TFPrdCanPen = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFPrdCanPen_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV42TFValDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV43TFValDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV35PrvNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV16SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV49Wcwcop001ds_1_tfprdnum = AV12TFPrdNum ;
      AV50Wcwcop001ds_2_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV51Wcwcop001ds_3_tfprdnom = AV14TFPrdNom ;
      AV52Wcwcop001ds_4_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV53Wcwcop001ds_5_tfprdexialm = AV36TFPrdExiAlm ;
      AV54Wcwcop001ds_6_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV55Wcwcop001ds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV56Wcwcop001ds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV57Wcwcop001ds_9_tfprdcanpen = AV40TFPrdCanPen ;
      AV58Wcwcop001ds_10_tfprdcanpen_to = AV41TFPrdCanPen_To ;
      AV59Wcwcop001ds_11_tfvaldsc = AV42TFValDsc ;
      AV60Wcwcop001ds_12_tfvaldsc_sel = AV43TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Wcwcop001ds_2_tfprdnum_sel ,
                                           AV49Wcwcop001ds_1_tfprdnum ,
                                           AV52Wcwcop001ds_4_tfprdnom_sel ,
                                           AV51Wcwcop001ds_3_tfprdnom ,
                                           AV53Wcwcop001ds_5_tfprdexialm ,
                                           AV54Wcwcop001ds_6_tfprdexialm_to ,
                                           AV55Wcwcop001ds_7_tfprdcanres ,
                                           AV56Wcwcop001ds_8_tfprdcanres_to ,
                                           AV57Wcwcop001ds_9_tfprdcanpen ,
                                           AV58Wcwcop001ds_10_tfprdcanpen_to ,
                                           AV60Wcwcop001ds_12_tfvaldsc_sel ,
                                           AV59Wcwcop001ds_11_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(AV35PrvNum) ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Wcwcop001ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV49Wcwcop001ds_1_tfprdnum), 6, "%") ;
      lV51Wcwcop001ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV51Wcwcop001ds_3_tfprdnom), 26, "%") ;
      lV59Wcwcop001ds_11_tfvaldsc = GXutil.padr( GXutil.rtrim( AV59Wcwcop001ds_11_tfvaldsc), 16, "%") ;
      /* Using cursor P08OK2 */
      pr_default.execute(0, new Object[] {AV34Emprcod, Integer.valueOf(A6158PrdPrv), Integer.valueOf(A6158PrdPrv), Integer.valueOf(AV35PrvNum), lV49Wcwcop001ds_1_tfprdnum, AV50Wcwcop001ds_2_tfprdnum_sel, lV51Wcwcop001ds_3_tfprdnom, AV52Wcwcop001ds_4_tfprdnom_sel, AV53Wcwcop001ds_5_tfprdexialm, AV54Wcwcop001ds_6_tfprdexialm_to, AV55Wcwcop001ds_7_tfprdcanres, AV56Wcwcop001ds_8_tfprdcanres_to, AV57Wcwcop001ds_9_tfprdcanpen, AV58Wcwcop001ds_10_tfprdcanpen_to, lV59Wcwcop001ds_11_tfvaldsc, AV60Wcwcop001ds_12_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8OK2 = false ;
         A396EmprCod = P08OK2_A396EmprCod[0] ;
         A719PrdNum = P08OK2_A719PrdNum[0] ;
         A856ValCod = P08OK2_A856ValCod[0] ;
         A857ValDsc = P08OK2_A857ValDsc[0] ;
         n857ValDsc = P08OK2_n857ValDsc[0] ;
         A684PrdCanPen = P08OK2_A684PrdCanPen[0] ;
         A685PrdCanRes = P08OK2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08OK2_A704PrdExiAlm[0] ;
         A718PrdNom = P08OK2_A718PrdNom[0] ;
         A857ValDsc = P08OK2_A857ValDsc[0] ;
         n857ValDsc = P08OK2_n857ValDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08OK2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08OK2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8OK2 = false ;
            AV28count = (long)(AV28count+1) ;
            brk8OK2 = true ;
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
         if ( ! brk8OK2 )
         {
            brk8OK2 = true ;
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
      AV49Wcwcop001ds_1_tfprdnum = AV12TFPrdNum ;
      AV50Wcwcop001ds_2_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV51Wcwcop001ds_3_tfprdnom = AV14TFPrdNom ;
      AV52Wcwcop001ds_4_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV53Wcwcop001ds_5_tfprdexialm = AV36TFPrdExiAlm ;
      AV54Wcwcop001ds_6_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV55Wcwcop001ds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV56Wcwcop001ds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV57Wcwcop001ds_9_tfprdcanpen = AV40TFPrdCanPen ;
      AV58Wcwcop001ds_10_tfprdcanpen_to = AV41TFPrdCanPen_To ;
      AV59Wcwcop001ds_11_tfvaldsc = AV42TFValDsc ;
      AV60Wcwcop001ds_12_tfvaldsc_sel = AV43TFValDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Wcwcop001ds_2_tfprdnum_sel ,
                                           AV49Wcwcop001ds_1_tfprdnum ,
                                           AV52Wcwcop001ds_4_tfprdnom_sel ,
                                           AV51Wcwcop001ds_3_tfprdnom ,
                                           AV53Wcwcop001ds_5_tfprdexialm ,
                                           AV54Wcwcop001ds_6_tfprdexialm_to ,
                                           AV55Wcwcop001ds_7_tfprdcanres ,
                                           AV56Wcwcop001ds_8_tfprdcanres_to ,
                                           AV57Wcwcop001ds_9_tfprdcanpen ,
                                           AV58Wcwcop001ds_10_tfprdcanpen_to ,
                                           AV60Wcwcop001ds_12_tfvaldsc_sel ,
                                           AV59Wcwcop001ds_11_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(AV35PrvNum) ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV49Wcwcop001ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV49Wcwcop001ds_1_tfprdnum), 6, "%") ;
      lV51Wcwcop001ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV51Wcwcop001ds_3_tfprdnom), 26, "%") ;
      lV59Wcwcop001ds_11_tfvaldsc = GXutil.padr( GXutil.rtrim( AV59Wcwcop001ds_11_tfvaldsc), 16, "%") ;
      /* Using cursor P08OK3 */
      pr_default.execute(1, new Object[] {AV34Emprcod, Integer.valueOf(A6158PrdPrv), Integer.valueOf(A6158PrdPrv), Integer.valueOf(AV35PrvNum), lV49Wcwcop001ds_1_tfprdnum, AV50Wcwcop001ds_2_tfprdnum_sel, lV51Wcwcop001ds_3_tfprdnom, AV52Wcwcop001ds_4_tfprdnom_sel, AV53Wcwcop001ds_5_tfprdexialm, AV54Wcwcop001ds_6_tfprdexialm_to, AV55Wcwcop001ds_7_tfprdcanres, AV56Wcwcop001ds_8_tfprdcanres_to, AV57Wcwcop001ds_9_tfprdcanpen, AV58Wcwcop001ds_10_tfprdcanpen_to, lV59Wcwcop001ds_11_tfvaldsc, AV60Wcwcop001ds_12_tfvaldsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8OK4 = false ;
         A396EmprCod = P08OK3_A396EmprCod[0] ;
         A718PrdNom = P08OK3_A718PrdNom[0] ;
         A856ValCod = P08OK3_A856ValCod[0] ;
         A857ValDsc = P08OK3_A857ValDsc[0] ;
         n857ValDsc = P08OK3_n857ValDsc[0] ;
         A684PrdCanPen = P08OK3_A684PrdCanPen[0] ;
         A685PrdCanRes = P08OK3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08OK3_A704PrdExiAlm[0] ;
         A719PrdNum = P08OK3_A719PrdNum[0] ;
         A857ValDsc = P08OK3_A857ValDsc[0] ;
         n857ValDsc = P08OK3_n857ValDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08OK3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08OK3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8OK4 = false ;
            A719PrdNum = P08OK3_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8OK4 = true ;
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
         if ( ! brk8OK4 )
         {
            brk8OK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV42TFValDsc = AV16SearchTxt ;
      AV43TFValDsc_Sel = "" ;
      AV49Wcwcop001ds_1_tfprdnum = AV12TFPrdNum ;
      AV50Wcwcop001ds_2_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV51Wcwcop001ds_3_tfprdnom = AV14TFPrdNom ;
      AV52Wcwcop001ds_4_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV53Wcwcop001ds_5_tfprdexialm = AV36TFPrdExiAlm ;
      AV54Wcwcop001ds_6_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV55Wcwcop001ds_7_tfprdcanres = AV38TFPrdCanRes ;
      AV56Wcwcop001ds_8_tfprdcanres_to = AV39TFPrdCanRes_To ;
      AV57Wcwcop001ds_9_tfprdcanpen = AV40TFPrdCanPen ;
      AV58Wcwcop001ds_10_tfprdcanpen_to = AV41TFPrdCanPen_To ;
      AV59Wcwcop001ds_11_tfvaldsc = AV42TFValDsc ;
      AV60Wcwcop001ds_12_tfvaldsc_sel = AV43TFValDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV50Wcwcop001ds_2_tfprdnum_sel ,
                                           AV49Wcwcop001ds_1_tfprdnum ,
                                           AV52Wcwcop001ds_4_tfprdnom_sel ,
                                           AV51Wcwcop001ds_3_tfprdnom ,
                                           AV53Wcwcop001ds_5_tfprdexialm ,
                                           AV54Wcwcop001ds_6_tfprdexialm_to ,
                                           AV55Wcwcop001ds_7_tfprdcanres ,
                                           AV56Wcwcop001ds_8_tfprdcanres_to ,
                                           AV57Wcwcop001ds_9_tfprdcanpen ,
                                           AV58Wcwcop001ds_10_tfprdcanpen_to ,
                                           AV60Wcwcop001ds_12_tfvaldsc_sel ,
                                           AV59Wcwcop001ds_11_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           Byte.valueOf(A856ValCod) ,
                                           A396EmprCod ,
                                           AV34Emprcod ,
                                           Integer.valueOf(AV35PrvNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV49Wcwcop001ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV49Wcwcop001ds_1_tfprdnum), 6, "%") ;
      lV51Wcwcop001ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV51Wcwcop001ds_3_tfprdnom), 26, "%") ;
      lV59Wcwcop001ds_11_tfvaldsc = GXutil.padr( GXutil.rtrim( AV59Wcwcop001ds_11_tfvaldsc), 16, "%") ;
      /* Using cursor P08OK4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(A6158PrdPrv), AV34Emprcod, Integer.valueOf(A6158PrdPrv), Integer.valueOf(AV35PrvNum), lV49Wcwcop001ds_1_tfprdnum, AV50Wcwcop001ds_2_tfprdnum_sel, lV51Wcwcop001ds_3_tfprdnom, AV52Wcwcop001ds_4_tfprdnom_sel, AV53Wcwcop001ds_5_tfprdexialm, AV54Wcwcop001ds_6_tfprdexialm_to, AV55Wcwcop001ds_7_tfprdcanres, AV56Wcwcop001ds_8_tfprdcanres_to, AV57Wcwcop001ds_9_tfprdcanpen, AV58Wcwcop001ds_10_tfprdcanpen_to, lV59Wcwcop001ds_11_tfvaldsc, AV60Wcwcop001ds_12_tfvaldsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8OK6 = false ;
         A396EmprCod = P08OK4_A396EmprCod[0] ;
         A857ValDsc = P08OK4_A857ValDsc[0] ;
         n857ValDsc = P08OK4_n857ValDsc[0] ;
         A856ValCod = P08OK4_A856ValCod[0] ;
         A684PrdCanPen = P08OK4_A684PrdCanPen[0] ;
         A685PrdCanRes = P08OK4_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08OK4_A704PrdExiAlm[0] ;
         A718PrdNom = P08OK4_A718PrdNom[0] ;
         A719PrdNum = P08OK4_A719PrdNum[0] ;
         A857ValDsc = P08OK4_A857ValDsc[0] ;
         n857ValDsc = P08OK4_n857ValDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08OK4_A857ValDsc[0], A857ValDsc) == 0 ) )
         {
            brk8OK6 = false ;
            A396EmprCod = P08OK4_A396EmprCod[0] ;
            A856ValCod = P08OK4_A856ValCod[0] ;
            A719PrdNum = P08OK4_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8OK6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV20Option = A857ValDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8OK6 )
         {
            brk8OK6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcop001getfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcwcop001getfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcwcop001getfilterdata.this.AV27OptionIndexesJson;
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
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV36TFPrdExiAlm = DecimalUtil.ZERO ;
      AV37TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV38TFPrdCanRes = DecimalUtil.ZERO ;
      AV39TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV40TFPrdCanPen = DecimalUtil.ZERO ;
      AV41TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV42TFValDsc = "" ;
      AV43TFValDsc_Sel = "" ;
      AV34Emprcod = "" ;
      A719PrdNum = "" ;
      AV49Wcwcop001ds_1_tfprdnum = "" ;
      AV50Wcwcop001ds_2_tfprdnum_sel = "" ;
      AV51Wcwcop001ds_3_tfprdnom = "" ;
      AV52Wcwcop001ds_4_tfprdnom_sel = "" ;
      AV53Wcwcop001ds_5_tfprdexialm = DecimalUtil.ZERO ;
      AV54Wcwcop001ds_6_tfprdexialm_to = DecimalUtil.ZERO ;
      AV55Wcwcop001ds_7_tfprdcanres = DecimalUtil.ZERO ;
      AV56Wcwcop001ds_8_tfprdcanres_to = DecimalUtil.ZERO ;
      AV57Wcwcop001ds_9_tfprdcanpen = DecimalUtil.ZERO ;
      AV58Wcwcop001ds_10_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV59Wcwcop001ds_11_tfvaldsc = "" ;
      AV60Wcwcop001ds_12_tfvaldsc_sel = "" ;
      scmdbuf = "" ;
      lV49Wcwcop001ds_1_tfprdnum = "" ;
      lV51Wcwcop001ds_3_tfprdnom = "" ;
      lV59Wcwcop001ds_11_tfvaldsc = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A396EmprCod = "" ;
      P08OK2_A396EmprCod = new String[] {""} ;
      P08OK2_A719PrdNum = new String[] {""} ;
      P08OK2_A856ValCod = new byte[1] ;
      P08OK2_A857ValDsc = new String[] {""} ;
      P08OK2_n857ValDsc = new boolean[] {false} ;
      P08OK2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK2_A718PrdNom = new String[] {""} ;
      AV20Option = "" ;
      P08OK3_A396EmprCod = new String[] {""} ;
      P08OK3_A718PrdNom = new String[] {""} ;
      P08OK3_A856ValCod = new byte[1] ;
      P08OK3_A857ValDsc = new String[] {""} ;
      P08OK3_n857ValDsc = new boolean[] {false} ;
      P08OK3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK3_A719PrdNum = new String[] {""} ;
      P08OK4_A396EmprCod = new String[] {""} ;
      P08OK4_A857ValDsc = new String[] {""} ;
      P08OK4_n857ValDsc = new boolean[] {false} ;
      P08OK4_A856ValCod = new byte[1] ;
      P08OK4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08OK4_A718PrdNom = new String[] {""} ;
      P08OK4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcop001getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08OK2_A396EmprCod, P08OK2_A719PrdNum, P08OK2_A856ValCod, P08OK2_A857ValDsc, P08OK2_n857ValDsc, P08OK2_A684PrdCanPen, P08OK2_A685PrdCanRes, P08OK2_A704PrdExiAlm, P08OK2_A718PrdNom
            }
            , new Object[] {
            P08OK3_A396EmprCod, P08OK3_A718PrdNom, P08OK3_A856ValCod, P08OK3_A857ValDsc, P08OK3_n857ValDsc, P08OK3_A684PrdCanPen, P08OK3_A685PrdCanRes, P08OK3_A704PrdExiAlm, P08OK3_A719PrdNum
            }
            , new Object[] {
            P08OK4_A396EmprCod, P08OK4_A857ValDsc, P08OK4_n857ValDsc, P08OK4_A856ValCod, P08OK4_A684PrdCanPen, P08OK4_A685PrdCanRes, P08OK4_A704PrdExiAlm, P08OK4_A718PrdNom, P08OK4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV35PrvNum ;
   private int A6158PrdPrv ;
   private long AV28count ;
   private java.math.BigDecimal AV36TFPrdExiAlm ;
   private java.math.BigDecimal AV37TFPrdExiAlm_To ;
   private java.math.BigDecimal AV38TFPrdCanRes ;
   private java.math.BigDecimal AV39TFPrdCanRes_To ;
   private java.math.BigDecimal AV40TFPrdCanPen ;
   private java.math.BigDecimal AV41TFPrdCanPen_To ;
   private java.math.BigDecimal AV53Wcwcop001ds_5_tfprdexialm ;
   private java.math.BigDecimal AV54Wcwcop001ds_6_tfprdexialm_to ;
   private java.math.BigDecimal AV55Wcwcop001ds_7_tfprdcanres ;
   private java.math.BigDecimal AV56Wcwcop001ds_8_tfprdcanres_to ;
   private java.math.BigDecimal AV57Wcwcop001ds_9_tfprdcanpen ;
   private java.math.BigDecimal AV58Wcwcop001ds_10_tfprdcanpen_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV42TFValDsc ;
   private String AV43TFValDsc_Sel ;
   private String AV34Emprcod ;
   private String A719PrdNum ;
   private String AV49Wcwcop001ds_1_tfprdnum ;
   private String AV50Wcwcop001ds_2_tfprdnum_sel ;
   private String AV51Wcwcop001ds_3_tfprdnom ;
   private String AV52Wcwcop001ds_4_tfprdnom_sel ;
   private String AV59Wcwcop001ds_11_tfvaldsc ;
   private String AV60Wcwcop001ds_12_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV49Wcwcop001ds_1_tfprdnum ;
   private String lV51Wcwcop001ds_3_tfprdnom ;
   private String lV59Wcwcop001ds_11_tfvaldsc ;
   private String A718PrdNom ;
   private String A857ValDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8OK2 ;
   private boolean n857ValDsc ;
   private boolean brk8OK4 ;
   private boolean brk8OK6 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08OK2_A396EmprCod ;
   private String[] P08OK2_A719PrdNum ;
   private byte[] P08OK2_A856ValCod ;
   private String[] P08OK2_A857ValDsc ;
   private boolean[] P08OK2_n857ValDsc ;
   private java.math.BigDecimal[] P08OK2_A684PrdCanPen ;
   private java.math.BigDecimal[] P08OK2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08OK2_A704PrdExiAlm ;
   private String[] P08OK2_A718PrdNom ;
   private String[] P08OK3_A396EmprCod ;
   private String[] P08OK3_A718PrdNom ;
   private byte[] P08OK3_A856ValCod ;
   private String[] P08OK3_A857ValDsc ;
   private boolean[] P08OK3_n857ValDsc ;
   private java.math.BigDecimal[] P08OK3_A684PrdCanPen ;
   private java.math.BigDecimal[] P08OK3_A685PrdCanRes ;
   private java.math.BigDecimal[] P08OK3_A704PrdExiAlm ;
   private String[] P08OK3_A719PrdNum ;
   private String[] P08OK4_A396EmprCod ;
   private String[] P08OK4_A857ValDsc ;
   private boolean[] P08OK4_n857ValDsc ;
   private byte[] P08OK4_A856ValCod ;
   private java.math.BigDecimal[] P08OK4_A684PrdCanPen ;
   private java.math.BigDecimal[] P08OK4_A685PrdCanRes ;
   private java.math.BigDecimal[] P08OK4_A704PrdExiAlm ;
   private String[] P08OK4_A718PrdNom ;
   private String[] P08OK4_A719PrdNum ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcwcop001getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08OK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Wcwcop001ds_2_tfprdnum_sel ,
                                          String AV49Wcwcop001ds_1_tfprdnum ,
                                          String AV52Wcwcop001ds_4_tfprdnom_sel ,
                                          String AV51Wcwcop001ds_3_tfprdnom ,
                                          java.math.BigDecimal AV53Wcwcop001ds_5_tfprdexialm ,
                                          java.math.BigDecimal AV54Wcwcop001ds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV55Wcwcop001ds_7_tfprdcanres ,
                                          java.math.BigDecimal AV56Wcwcop001ds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV57Wcwcop001ds_9_tfprdcanpen ,
                                          java.math.BigDecimal AV58Wcwcop001ds_10_tfprdcanpen_to ,
                                          String AV60Wcwcop001ds_12_tfvaldsc_sel ,
                                          String AV59Wcwcop001ds_11_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          int A6158PrdPrv ,
                                          byte A856ValCod ,
                                          int AV35PrvNum ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.ValCod, T2.ValDsc, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdNom FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> '#')");
      addWhere(sWhereString, "(Not (rtrim(SUBSTR(T1.PrdNum, 2, 1)) IS NULL AND NOT(SUBSTR(T1.PrdNum, 2, 1) IS NULL)))");
      addWhere(sWhereString, "(T1.ValCod >= 1)");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( (GXutil.strcmp("", AV50Wcwcop001ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV49Wcwcop001ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Wcwcop001ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Wcwcop001ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcwcop001ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcwcop001ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcwcop001ds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcwcop001ds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwcop001ds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwcop001ds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwcop001ds_9_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwcop001ds_10_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwcop001ds_12_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwcop001ds_11_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwcop001ds_12_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08OK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Wcwcop001ds_2_tfprdnum_sel ,
                                          String AV49Wcwcop001ds_1_tfprdnum ,
                                          String AV52Wcwcop001ds_4_tfprdnom_sel ,
                                          String AV51Wcwcop001ds_3_tfprdnom ,
                                          java.math.BigDecimal AV53Wcwcop001ds_5_tfprdexialm ,
                                          java.math.BigDecimal AV54Wcwcop001ds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV55Wcwcop001ds_7_tfprdcanres ,
                                          java.math.BigDecimal AV56Wcwcop001ds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV57Wcwcop001ds_9_tfprdcanpen ,
                                          java.math.BigDecimal AV58Wcwcop001ds_10_tfprdcanpen_to ,
                                          String AV60Wcwcop001ds_12_tfvaldsc_sel ,
                                          String AV59Wcwcop001ds_11_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          int A6158PrdPrv ,
                                          byte A856ValCod ,
                                          int AV35PrvNum ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[16];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNom, T1.ValCod, T2.ValDsc, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> '#')");
      addWhere(sWhereString, "(Not (rtrim(SUBSTR(T1.PrdNum, 2, 1)) IS NULL AND NOT(SUBSTR(T1.PrdNum, 2, 1) IS NULL)))");
      addWhere(sWhereString, "(T1.ValCod >= 1)");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV50Wcwcop001ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV49Wcwcop001ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Wcwcop001ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Wcwcop001ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcwcop001ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcwcop001ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcwcop001ds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcwcop001ds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwcop001ds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwcop001ds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwcop001ds_9_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwcop001ds_10_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwcop001ds_12_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwcop001ds_11_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwcop001ds_12_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08OK4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Wcwcop001ds_2_tfprdnum_sel ,
                                          String AV49Wcwcop001ds_1_tfprdnum ,
                                          String AV52Wcwcop001ds_4_tfprdnom_sel ,
                                          String AV51Wcwcop001ds_3_tfprdnom ,
                                          java.math.BigDecimal AV53Wcwcop001ds_5_tfprdexialm ,
                                          java.math.BigDecimal AV54Wcwcop001ds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV55Wcwcop001ds_7_tfprdcanres ,
                                          java.math.BigDecimal AV56Wcwcop001ds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV57Wcwcop001ds_9_tfprdcanpen ,
                                          java.math.BigDecimal AV58Wcwcop001ds_10_tfprdcanpen_to ,
                                          String AV60Wcwcop001ds_12_tfvaldsc_sel ,
                                          String AV59Wcwcop001ds_11_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          int A6158PrdPrv ,
                                          byte A856ValCod ,
                                          String A396EmprCod ,
                                          String AV34Emprcod ,
                                          int AV35PrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.ValDsc, T1.ValCod, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdNom, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(SUBSTR(T1.PrdNum, 1, 1) <> '#')");
      addWhere(sWhereString, "(Not (rtrim(SUBSTR(T1.PrdNum, 2, 1)) IS NULL AND NOT(SUBSTR(T1.PrdNum, 2, 1) IS NULL)))");
      addWhere(sWhereString, "(T1.ValCod >= 1)");
      addWhere(sWhereString, "(T1.ValCod <= 2)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV50Wcwcop001ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV49Wcwcop001ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Wcwcop001ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Wcwcop001ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Wcwcop001ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Wcwcop001ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Wcwcop001ds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Wcwcop001ds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwcop001ds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwcop001ds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcwcop001ds_9_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwcop001ds_10_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwcop001ds_12_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwcop001ds_11_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwcop001ds_12_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.ValDsc" ;
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
                  return conditional_P08OK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 1 :
                  return conditional_P08OK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
            case 2 :
                  return conditional_P08OK4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08OK4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
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
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
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
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
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
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               return;
      }
   }

}

