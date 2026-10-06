package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwwkp64getfilterdata extends GXProcedure
{
   public wcwwkp64getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwwkp64getfilterdata.class ), "" );
   }

   public wcwwkp64getfilterdata( int remoteHandle ,
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
      wcwwkp64getfilterdata.this.aP5 = new String[] {""};
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
      wcwwkp64getfilterdata.this.AV26DDOName = aP0;
      wcwwkp64getfilterdata.this.AV24SearchTxt = aP1;
      wcwwkp64getfilterdata.this.AV25SearchTxtTo = aP2;
      wcwwkp64getfilterdata.this.aP3 = aP3;
      wcwwkp64getfilterdata.this.aP4 = aP4;
      wcwwkp64getfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_VALDSC") == 0 )
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
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("WCwwkp64GridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCwwkp64GridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("WCwwkp64GridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV14TFValDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV15TFValDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV16TFPrdExiAlm = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFPrdExiAlm_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV18TFPrdCanRes = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFPrdCanRes_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV20TFPrdCanPen = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFPrdCanPen_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV22TFPrvNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFPrvNum_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV42Emprcod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV43Prdnum = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV44PrvNum = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TB1_CODINOUT") == 0 )
         {
            AV45Tb1_codinout = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV24SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV51Wcwwkp64ds_1_filterfulltext = AV46FilterFullText ;
      AV52Wcwwkp64ds_2_tfprdnum = AV10TFPrdNum ;
      AV53Wcwwkp64ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV54Wcwwkp64ds_4_tfprdnom = AV12TFPrdNom ;
      AV55Wcwwkp64ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV56Wcwwkp64ds_6_tfvaldsc = AV14TFValDsc ;
      AV57Wcwwkp64ds_7_tfvaldsc_sel = AV15TFValDsc_Sel ;
      AV58Wcwwkp64ds_8_tfprdexialm = AV16TFPrdExiAlm ;
      AV59Wcwwkp64ds_9_tfprdexialm_to = AV17TFPrdExiAlm_To ;
      AV60Wcwwkp64ds_10_tfprdcanres = AV18TFPrdCanRes ;
      AV61Wcwwkp64ds_11_tfprdcanres_to = AV19TFPrdCanRes_To ;
      AV62Wcwwkp64ds_12_tfprdcanpen = AV20TFPrdCanPen ;
      AV63Wcwwkp64ds_13_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV64Wcwwkp64ds_14_tfprvnum = AV22TFPrvNum ;
      AV65Wcwwkp64ds_15_tfprvnum_to = AV23TFPrvNum_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Wcwwkp64ds_1_filterfulltext ,
                                           AV53Wcwwkp64ds_3_tfprdnum_sel ,
                                           AV52Wcwwkp64ds_2_tfprdnum ,
                                           AV55Wcwwkp64ds_5_tfprdnom_sel ,
                                           AV54Wcwwkp64ds_4_tfprdnom ,
                                           AV57Wcwwkp64ds_7_tfvaldsc_sel ,
                                           AV56Wcwwkp64ds_6_tfvaldsc ,
                                           AV58Wcwwkp64ds_8_tfprdexialm ,
                                           AV59Wcwwkp64ds_9_tfprdexialm_to ,
                                           AV60Wcwwkp64ds_10_tfprdcanres ,
                                           AV61Wcwwkp64ds_11_tfprdcanres_to ,
                                           AV62Wcwwkp64ds_12_tfprdcanpen ,
                                           AV63Wcwwkp64ds_13_tfprdcanpen_to ,
                                           Integer.valueOf(AV64Wcwwkp64ds_14_tfprvnum) ,
                                           Integer.valueOf(AV65Wcwwkp64ds_15_tfprvnum_to) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A857ValDsc ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV52Wcwwkp64ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV52Wcwwkp64ds_2_tfprdnum), 6, "%") ;
      lV54Wcwwkp64ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV54Wcwwkp64ds_4_tfprdnom), 26, "%") ;
      lV56Wcwwkp64ds_6_tfvaldsc = GXutil.padr( GXutil.rtrim( AV56Wcwwkp64ds_6_tfvaldsc), 16, "%") ;
      /* Using cursor P08QU2 */
      pr_default.execute(0, new Object[] {AV42Emprcod, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV52Wcwwkp64ds_2_tfprdnum, AV53Wcwwkp64ds_3_tfprdnum_sel, lV54Wcwwkp64ds_4_tfprdnom, AV55Wcwwkp64ds_5_tfprdnom_sel, lV56Wcwwkp64ds_6_tfvaldsc, AV57Wcwwkp64ds_7_tfvaldsc_sel, AV58Wcwwkp64ds_8_tfprdexialm, AV59Wcwwkp64ds_9_tfprdexialm_to, AV60Wcwwkp64ds_10_tfprdcanres, AV61Wcwwkp64ds_11_tfprdcanres_to, AV62Wcwwkp64ds_12_tfprdcanpen, AV63Wcwwkp64ds_13_tfprdcanpen_to, Integer.valueOf(AV64Wcwwkp64ds_14_tfprvnum), Integer.valueOf(AV65Wcwwkp64ds_15_tfprvnum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8QU2 = false ;
         A396EmprCod = P08QU2_A396EmprCod[0] ;
         A719PrdNum = P08QU2_A719PrdNum[0] ;
         A856ValCod = P08QU2_A856ValCod[0] ;
         A795PrvNum = P08QU2_A795PrvNum[0] ;
         A684PrdCanPen = P08QU2_A684PrdCanPen[0] ;
         A685PrdCanRes = P08QU2_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08QU2_A704PrdExiAlm[0] ;
         A857ValDsc = P08QU2_A857ValDsc[0] ;
         n857ValDsc = P08QU2_n857ValDsc[0] ;
         A718PrdNom = P08QU2_A718PrdNom[0] ;
         A857ValDsc = P08QU2_A857ValDsc[0] ;
         n857ValDsc = P08QU2_n857ValDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08QU2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08QU2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8QU2 = false ;
            AV36count = (long)(AV36count+1) ;
            brk8QU2 = true ;
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
         if ( ! brk8QU2 )
         {
            brk8QU2 = true ;
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
      AV51Wcwwkp64ds_1_filterfulltext = AV46FilterFullText ;
      AV52Wcwwkp64ds_2_tfprdnum = AV10TFPrdNum ;
      AV53Wcwwkp64ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV54Wcwwkp64ds_4_tfprdnom = AV12TFPrdNom ;
      AV55Wcwwkp64ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV56Wcwwkp64ds_6_tfvaldsc = AV14TFValDsc ;
      AV57Wcwwkp64ds_7_tfvaldsc_sel = AV15TFValDsc_Sel ;
      AV58Wcwwkp64ds_8_tfprdexialm = AV16TFPrdExiAlm ;
      AV59Wcwwkp64ds_9_tfprdexialm_to = AV17TFPrdExiAlm_To ;
      AV60Wcwwkp64ds_10_tfprdcanres = AV18TFPrdCanRes ;
      AV61Wcwwkp64ds_11_tfprdcanres_to = AV19TFPrdCanRes_To ;
      AV62Wcwwkp64ds_12_tfprdcanpen = AV20TFPrdCanPen ;
      AV63Wcwwkp64ds_13_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV64Wcwwkp64ds_14_tfprvnum = AV22TFPrvNum ;
      AV65Wcwwkp64ds_15_tfprvnum_to = AV23TFPrvNum_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Wcwwkp64ds_1_filterfulltext ,
                                           AV53Wcwwkp64ds_3_tfprdnum_sel ,
                                           AV52Wcwwkp64ds_2_tfprdnum ,
                                           AV55Wcwwkp64ds_5_tfprdnom_sel ,
                                           AV54Wcwwkp64ds_4_tfprdnom ,
                                           AV57Wcwwkp64ds_7_tfvaldsc_sel ,
                                           AV56Wcwwkp64ds_6_tfvaldsc ,
                                           AV58Wcwwkp64ds_8_tfprdexialm ,
                                           AV59Wcwwkp64ds_9_tfprdexialm_to ,
                                           AV60Wcwwkp64ds_10_tfprdcanres ,
                                           AV61Wcwwkp64ds_11_tfprdcanres_to ,
                                           AV62Wcwwkp64ds_12_tfprdcanpen ,
                                           AV63Wcwwkp64ds_13_tfprdcanpen_to ,
                                           Integer.valueOf(AV64Wcwwkp64ds_14_tfprvnum) ,
                                           Integer.valueOf(AV65Wcwwkp64ds_15_tfprvnum_to) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A857ValDsc ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV42Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV52Wcwwkp64ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV52Wcwwkp64ds_2_tfprdnum), 6, "%") ;
      lV54Wcwwkp64ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV54Wcwwkp64ds_4_tfprdnom), 26, "%") ;
      lV56Wcwwkp64ds_6_tfvaldsc = GXutil.padr( GXutil.rtrim( AV56Wcwwkp64ds_6_tfvaldsc), 16, "%") ;
      /* Using cursor P08QU3 */
      pr_default.execute(1, new Object[] {AV42Emprcod, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV52Wcwwkp64ds_2_tfprdnum, AV53Wcwwkp64ds_3_tfprdnum_sel, lV54Wcwwkp64ds_4_tfprdnom, AV55Wcwwkp64ds_5_tfprdnom_sel, lV56Wcwwkp64ds_6_tfvaldsc, AV57Wcwwkp64ds_7_tfvaldsc_sel, AV58Wcwwkp64ds_8_tfprdexialm, AV59Wcwwkp64ds_9_tfprdexialm_to, AV60Wcwwkp64ds_10_tfprdcanres, AV61Wcwwkp64ds_11_tfprdcanres_to, AV62Wcwwkp64ds_12_tfprdcanpen, AV63Wcwwkp64ds_13_tfprdcanpen_to, Integer.valueOf(AV64Wcwwkp64ds_14_tfprvnum), Integer.valueOf(AV65Wcwwkp64ds_15_tfprvnum_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8QU4 = false ;
         A396EmprCod = P08QU3_A396EmprCod[0] ;
         A718PrdNom = P08QU3_A718PrdNom[0] ;
         A856ValCod = P08QU3_A856ValCod[0] ;
         A795PrvNum = P08QU3_A795PrvNum[0] ;
         A684PrdCanPen = P08QU3_A684PrdCanPen[0] ;
         A685PrdCanRes = P08QU3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08QU3_A704PrdExiAlm[0] ;
         A857ValDsc = P08QU3_A857ValDsc[0] ;
         n857ValDsc = P08QU3_n857ValDsc[0] ;
         A719PrdNum = P08QU3_A719PrdNum[0] ;
         A857ValDsc = P08QU3_A857ValDsc[0] ;
         n857ValDsc = P08QU3_n857ValDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08QU3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08QU3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8QU4 = false ;
            A719PrdNum = P08QU3_A719PrdNum[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8QU4 = true ;
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
         if ( ! brk8QU4 )
         {
            brk8QU4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFValDsc = AV24SearchTxt ;
      AV15TFValDsc_Sel = "" ;
      AV51Wcwwkp64ds_1_filterfulltext = AV46FilterFullText ;
      AV52Wcwwkp64ds_2_tfprdnum = AV10TFPrdNum ;
      AV53Wcwwkp64ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV54Wcwwkp64ds_4_tfprdnom = AV12TFPrdNom ;
      AV55Wcwwkp64ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV56Wcwwkp64ds_6_tfvaldsc = AV14TFValDsc ;
      AV57Wcwwkp64ds_7_tfvaldsc_sel = AV15TFValDsc_Sel ;
      AV58Wcwwkp64ds_8_tfprdexialm = AV16TFPrdExiAlm ;
      AV59Wcwwkp64ds_9_tfprdexialm_to = AV17TFPrdExiAlm_To ;
      AV60Wcwwkp64ds_10_tfprdcanres = AV18TFPrdCanRes ;
      AV61Wcwwkp64ds_11_tfprdcanres_to = AV19TFPrdCanRes_To ;
      AV62Wcwwkp64ds_12_tfprdcanpen = AV20TFPrdCanPen ;
      AV63Wcwwkp64ds_13_tfprdcanpen_to = AV21TFPrdCanPen_To ;
      AV64Wcwwkp64ds_14_tfprvnum = AV22TFPrvNum ;
      AV65Wcwwkp64ds_15_tfprvnum_to = AV23TFPrvNum_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV51Wcwwkp64ds_1_filterfulltext ,
                                           AV53Wcwwkp64ds_3_tfprdnum_sel ,
                                           AV52Wcwwkp64ds_2_tfprdnum ,
                                           AV55Wcwwkp64ds_5_tfprdnom_sel ,
                                           AV54Wcwwkp64ds_4_tfprdnom ,
                                           AV57Wcwwkp64ds_7_tfvaldsc_sel ,
                                           AV56Wcwwkp64ds_6_tfvaldsc ,
                                           AV58Wcwwkp64ds_8_tfprdexialm ,
                                           AV59Wcwwkp64ds_9_tfprdexialm_to ,
                                           AV60Wcwwkp64ds_10_tfprdcanres ,
                                           AV61Wcwwkp64ds_11_tfprdcanres_to ,
                                           AV62Wcwwkp64ds_12_tfprdcanpen ,
                                           AV63Wcwwkp64ds_13_tfprdcanpen_to ,
                                           Integer.valueOf(AV64Wcwwkp64ds_14_tfprvnum) ,
                                           Integer.valueOf(AV65Wcwwkp64ds_15_tfprvnum_to) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A857ValDsc ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           Integer.valueOf(A795PrvNum) ,
                                           AV42Emprcod ,
                                           A396EmprCod ,
                                           Byte.valueOf(A856ValCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV51Wcwwkp64ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwwkp64ds_1_filterfulltext), "%", "") ;
      lV52Wcwwkp64ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV52Wcwwkp64ds_2_tfprdnum), 6, "%") ;
      lV54Wcwwkp64ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV54Wcwwkp64ds_4_tfprdnom), 26, "%") ;
      lV56Wcwwkp64ds_6_tfvaldsc = GXutil.padr( GXutil.rtrim( AV56Wcwwkp64ds_6_tfvaldsc), 16, "%") ;
      /* Using cursor P08QU4 */
      pr_default.execute(2, new Object[] {AV42Emprcod, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV51Wcwwkp64ds_1_filterfulltext, lV52Wcwwkp64ds_2_tfprdnum, AV53Wcwwkp64ds_3_tfprdnum_sel, lV54Wcwwkp64ds_4_tfprdnom, AV55Wcwwkp64ds_5_tfprdnom_sel, lV56Wcwwkp64ds_6_tfvaldsc, AV57Wcwwkp64ds_7_tfvaldsc_sel, AV58Wcwwkp64ds_8_tfprdexialm, AV59Wcwwkp64ds_9_tfprdexialm_to, AV60Wcwwkp64ds_10_tfprdcanres, AV61Wcwwkp64ds_11_tfprdcanres_to, AV62Wcwwkp64ds_12_tfprdcanpen, AV63Wcwwkp64ds_13_tfprdcanpen_to, Integer.valueOf(AV64Wcwwkp64ds_14_tfprvnum), Integer.valueOf(AV65Wcwwkp64ds_15_tfprvnum_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8QU6 = false ;
         A856ValCod = P08QU4_A856ValCod[0] ;
         A396EmprCod = P08QU4_A396EmprCod[0] ;
         A795PrvNum = P08QU4_A795PrvNum[0] ;
         A684PrdCanPen = P08QU4_A684PrdCanPen[0] ;
         A685PrdCanRes = P08QU4_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08QU4_A704PrdExiAlm[0] ;
         A857ValDsc = P08QU4_A857ValDsc[0] ;
         n857ValDsc = P08QU4_n857ValDsc[0] ;
         A718PrdNom = P08QU4_A718PrdNom[0] ;
         A719PrdNum = P08QU4_A719PrdNum[0] ;
         A857ValDsc = P08QU4_A857ValDsc[0] ;
         n857ValDsc = P08QU4_n857ValDsc[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08QU4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08QU4_A856ValCod[0] == A856ValCod ) )
         {
            brk8QU6 = false ;
            A719PrdNum = P08QU4_A719PrdNum[0] ;
            AV36count = (long)(AV36count+1) ;
            brk8QU6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV28Option = A857ValDsc ;
            AV27InsertIndex = 1 ;
            while ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) < 0 ) )
            {
               AV27InsertIndex = (int)(AV27InsertIndex+1) ;
            }
            AV29Options.add(AV28Option, AV27InsertIndex);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV27InsertIndex);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8QU6 )
         {
            brk8QU6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwwkp64getfilterdata.this.AV30OptionsJson;
      this.aP4[0] = wcwwkp64getfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = wcwwkp64getfilterdata.this.AV35OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFValDsc = "" ;
      AV15TFValDsc_Sel = "" ;
      AV16TFPrdExiAlm = DecimalUtil.ZERO ;
      AV17TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV18TFPrdCanRes = DecimalUtil.ZERO ;
      AV19TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV20TFPrdCanPen = DecimalUtil.ZERO ;
      AV21TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV42Emprcod = "" ;
      AV43Prdnum = "" ;
      A719PrdNum = "" ;
      AV51Wcwwkp64ds_1_filterfulltext = "" ;
      AV52Wcwwkp64ds_2_tfprdnum = "" ;
      AV53Wcwwkp64ds_3_tfprdnum_sel = "" ;
      AV54Wcwwkp64ds_4_tfprdnom = "" ;
      AV55Wcwwkp64ds_5_tfprdnom_sel = "" ;
      AV56Wcwwkp64ds_6_tfvaldsc = "" ;
      AV57Wcwwkp64ds_7_tfvaldsc_sel = "" ;
      AV58Wcwwkp64ds_8_tfprdexialm = DecimalUtil.ZERO ;
      AV59Wcwwkp64ds_9_tfprdexialm_to = DecimalUtil.ZERO ;
      AV60Wcwwkp64ds_10_tfprdcanres = DecimalUtil.ZERO ;
      AV61Wcwwkp64ds_11_tfprdcanres_to = DecimalUtil.ZERO ;
      AV62Wcwwkp64ds_12_tfprdcanpen = DecimalUtil.ZERO ;
      AV63Wcwwkp64ds_13_tfprdcanpen_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV51Wcwwkp64ds_1_filterfulltext = "" ;
      lV52Wcwwkp64ds_2_tfprdnum = "" ;
      lV54Wcwwkp64ds_4_tfprdnom = "" ;
      lV56Wcwwkp64ds_6_tfvaldsc = "" ;
      A718PrdNom = "" ;
      A857ValDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08QU2_A396EmprCod = new String[] {""} ;
      P08QU2_A719PrdNum = new String[] {""} ;
      P08QU2_A856ValCod = new byte[1] ;
      P08QU2_A795PrvNum = new int[1] ;
      P08QU2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU2_A857ValDsc = new String[] {""} ;
      P08QU2_n857ValDsc = new boolean[] {false} ;
      P08QU2_A718PrdNom = new String[] {""} ;
      AV28Option = "" ;
      P08QU3_A396EmprCod = new String[] {""} ;
      P08QU3_A718PrdNom = new String[] {""} ;
      P08QU3_A856ValCod = new byte[1] ;
      P08QU3_A795PrvNum = new int[1] ;
      P08QU3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU3_A857ValDsc = new String[] {""} ;
      P08QU3_n857ValDsc = new boolean[] {false} ;
      P08QU3_A719PrdNum = new String[] {""} ;
      P08QU4_A856ValCod = new byte[1] ;
      P08QU4_A396EmprCod = new String[] {""} ;
      P08QU4_A795PrvNum = new int[1] ;
      P08QU4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU4_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QU4_A857ValDsc = new String[] {""} ;
      P08QU4_n857ValDsc = new boolean[] {false} ;
      P08QU4_A718PrdNom = new String[] {""} ;
      P08QU4_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwwkp64getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08QU2_A396EmprCod, P08QU2_A719PrdNum, P08QU2_A856ValCod, P08QU2_A795PrvNum, P08QU2_A684PrdCanPen, P08QU2_A685PrdCanRes, P08QU2_A704PrdExiAlm, P08QU2_A857ValDsc, P08QU2_n857ValDsc, P08QU2_A718PrdNom
            }
            , new Object[] {
            P08QU3_A396EmprCod, P08QU3_A718PrdNom, P08QU3_A856ValCod, P08QU3_A795PrvNum, P08QU3_A684PrdCanPen, P08QU3_A685PrdCanRes, P08QU3_A704PrdExiAlm, P08QU3_A857ValDsc, P08QU3_n857ValDsc, P08QU3_A719PrdNum
            }
            , new Object[] {
            P08QU4_A856ValCod, P08QU4_A396EmprCod, P08QU4_A795PrvNum, P08QU4_A684PrdCanPen, P08QU4_A685PrdCanRes, P08QU4_A704PrdExiAlm, P08QU4_A857ValDsc, P08QU4_n857ValDsc, P08QU4_A718PrdNom, P08QU4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short AV45Tb1_codinout ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV22TFPrvNum ;
   private int AV23TFPrvNum_To ;
   private int AV44PrvNum ;
   private int AV64Wcwwkp64ds_14_tfprvnum ;
   private int AV65Wcwwkp64ds_15_tfprvnum_to ;
   private int A795PrvNum ;
   private int AV27InsertIndex ;
   private long AV36count ;
   private java.math.BigDecimal AV16TFPrdExiAlm ;
   private java.math.BigDecimal AV17TFPrdExiAlm_To ;
   private java.math.BigDecimal AV18TFPrdCanRes ;
   private java.math.BigDecimal AV19TFPrdCanRes_To ;
   private java.math.BigDecimal AV20TFPrdCanPen ;
   private java.math.BigDecimal AV21TFPrdCanPen_To ;
   private java.math.BigDecimal AV58Wcwwkp64ds_8_tfprdexialm ;
   private java.math.BigDecimal AV59Wcwwkp64ds_9_tfprdexialm_to ;
   private java.math.BigDecimal AV60Wcwwkp64ds_10_tfprdcanres ;
   private java.math.BigDecimal AV61Wcwwkp64ds_11_tfprdcanres_to ;
   private java.math.BigDecimal AV62Wcwwkp64ds_12_tfprdcanpen ;
   private java.math.BigDecimal AV63Wcwwkp64ds_13_tfprdcanpen_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV14TFValDsc ;
   private String AV15TFValDsc_Sel ;
   private String AV42Emprcod ;
   private String AV43Prdnum ;
   private String A719PrdNum ;
   private String AV52Wcwwkp64ds_2_tfprdnum ;
   private String AV53Wcwwkp64ds_3_tfprdnum_sel ;
   private String AV54Wcwwkp64ds_4_tfprdnom ;
   private String AV55Wcwwkp64ds_5_tfprdnom_sel ;
   private String AV56Wcwwkp64ds_6_tfvaldsc ;
   private String AV57Wcwwkp64ds_7_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV52Wcwwkp64ds_2_tfprdnum ;
   private String lV54Wcwwkp64ds_4_tfprdnom ;
   private String lV56Wcwwkp64ds_6_tfvaldsc ;
   private String A718PrdNom ;
   private String A857ValDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8QU2 ;
   private boolean n857ValDsc ;
   private boolean brk8QU4 ;
   private boolean brk8QU6 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Wcwwkp64ds_1_filterfulltext ;
   private String lV51Wcwwkp64ds_1_filterfulltext ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08QU2_A396EmprCod ;
   private String[] P08QU2_A719PrdNum ;
   private byte[] P08QU2_A856ValCod ;
   private int[] P08QU2_A795PrvNum ;
   private java.math.BigDecimal[] P08QU2_A684PrdCanPen ;
   private java.math.BigDecimal[] P08QU2_A685PrdCanRes ;
   private java.math.BigDecimal[] P08QU2_A704PrdExiAlm ;
   private String[] P08QU2_A857ValDsc ;
   private boolean[] P08QU2_n857ValDsc ;
   private String[] P08QU2_A718PrdNom ;
   private String[] P08QU3_A396EmprCod ;
   private String[] P08QU3_A718PrdNom ;
   private byte[] P08QU3_A856ValCod ;
   private int[] P08QU3_A795PrvNum ;
   private java.math.BigDecimal[] P08QU3_A684PrdCanPen ;
   private java.math.BigDecimal[] P08QU3_A685PrdCanRes ;
   private java.math.BigDecimal[] P08QU3_A704PrdExiAlm ;
   private String[] P08QU3_A857ValDsc ;
   private boolean[] P08QU3_n857ValDsc ;
   private String[] P08QU3_A719PrdNum ;
   private byte[] P08QU4_A856ValCod ;
   private String[] P08QU4_A396EmprCod ;
   private int[] P08QU4_A795PrvNum ;
   private java.math.BigDecimal[] P08QU4_A684PrdCanPen ;
   private java.math.BigDecimal[] P08QU4_A685PrdCanRes ;
   private java.math.BigDecimal[] P08QU4_A704PrdExiAlm ;
   private String[] P08QU4_A857ValDsc ;
   private boolean[] P08QU4_n857ValDsc ;
   private String[] P08QU4_A718PrdNom ;
   private String[] P08QU4_A719PrdNum ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class wcwwkp64getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08QU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcwwkp64ds_1_filterfulltext ,
                                          String AV53Wcwwkp64ds_3_tfprdnum_sel ,
                                          String AV52Wcwwkp64ds_2_tfprdnum ,
                                          String AV55Wcwwkp64ds_5_tfprdnom_sel ,
                                          String AV54Wcwwkp64ds_4_tfprdnom ,
                                          String AV57Wcwwkp64ds_7_tfvaldsc_sel ,
                                          String AV56Wcwwkp64ds_6_tfvaldsc ,
                                          java.math.BigDecimal AV58Wcwwkp64ds_8_tfprdexialm ,
                                          java.math.BigDecimal AV59Wcwwkp64ds_9_tfprdexialm_to ,
                                          java.math.BigDecimal AV60Wcwwkp64ds_10_tfprdcanres ,
                                          java.math.BigDecimal AV61Wcwwkp64ds_11_tfprdcanres_to ,
                                          java.math.BigDecimal AV62Wcwwkp64ds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV63Wcwwkp64ds_13_tfprdcanpen_to ,
                                          int AV64Wcwwkp64ds_14_tfprvnum ,
                                          int AV65Wcwwkp64ds_15_tfprvnum_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A857ValDsc ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          int A795PrvNum ,
                                          byte A856ValCod ,
                                          String AV42Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.ValCod, T1.PrvNum, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T2.ValDsc, T1.PrdNom FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.ValCod < 3)");
      if ( ! (GXutil.strcmp("", AV51Wcwwkp64ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanPen,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Wcwwkp64ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Wcwwkp64ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Wcwwkp64ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcwwkp64ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcwwkp64ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcwwkp64ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcwwkp64ds_7_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcwwkp64ds_6_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcwwkp64ds_7_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwwkp64ds_8_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wcwwkp64ds_9_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcwwkp64ds_10_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcwwkp64ds_11_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcwwkp64ds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcwwkp64ds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcwwkp64ds_14_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcwwkp64ds_15_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08QU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcwwkp64ds_1_filterfulltext ,
                                          String AV53Wcwwkp64ds_3_tfprdnum_sel ,
                                          String AV52Wcwwkp64ds_2_tfprdnum ,
                                          String AV55Wcwwkp64ds_5_tfprdnom_sel ,
                                          String AV54Wcwwkp64ds_4_tfprdnom ,
                                          String AV57Wcwwkp64ds_7_tfvaldsc_sel ,
                                          String AV56Wcwwkp64ds_6_tfvaldsc ,
                                          java.math.BigDecimal AV58Wcwwkp64ds_8_tfprdexialm ,
                                          java.math.BigDecimal AV59Wcwwkp64ds_9_tfprdexialm_to ,
                                          java.math.BigDecimal AV60Wcwwkp64ds_10_tfprdcanres ,
                                          java.math.BigDecimal AV61Wcwwkp64ds_11_tfprdcanres_to ,
                                          java.math.BigDecimal AV62Wcwwkp64ds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV63Wcwwkp64ds_13_tfprdcanpen_to ,
                                          int AV64Wcwwkp64ds_14_tfprvnum ,
                                          int AV65Wcwwkp64ds_15_tfprvnum_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A857ValDsc ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          int A795PrvNum ,
                                          byte A856ValCod ,
                                          String AV42Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNom, T1.ValCod, T1.PrvNum, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T2.ValDsc, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.ValCod < 3)");
      if ( ! (GXutil.strcmp("", AV51Wcwwkp64ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanPen,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Wcwwkp64ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Wcwwkp64ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Wcwwkp64ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcwwkp64ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcwwkp64ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcwwkp64ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcwwkp64ds_7_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcwwkp64ds_6_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcwwkp64ds_7_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwwkp64ds_8_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wcwwkp64ds_9_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcwwkp64ds_10_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcwwkp64ds_11_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcwwkp64ds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcwwkp64ds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcwwkp64ds_14_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcwwkp64ds_15_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNom" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08QU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcwwkp64ds_1_filterfulltext ,
                                          String AV53Wcwwkp64ds_3_tfprdnum_sel ,
                                          String AV52Wcwwkp64ds_2_tfprdnum ,
                                          String AV55Wcwwkp64ds_5_tfprdnom_sel ,
                                          String AV54Wcwwkp64ds_4_tfprdnom ,
                                          String AV57Wcwwkp64ds_7_tfvaldsc_sel ,
                                          String AV56Wcwwkp64ds_6_tfvaldsc ,
                                          java.math.BigDecimal AV58Wcwwkp64ds_8_tfprdexialm ,
                                          java.math.BigDecimal AV59Wcwwkp64ds_9_tfprdexialm_to ,
                                          java.math.BigDecimal AV60Wcwwkp64ds_10_tfprdcanres ,
                                          java.math.BigDecimal AV61Wcwwkp64ds_11_tfprdcanres_to ,
                                          java.math.BigDecimal AV62Wcwwkp64ds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV63Wcwwkp64ds_13_tfprdcanpen_to ,
                                          int AV64Wcwwkp64ds_14_tfprvnum ,
                                          int AV65Wcwwkp64ds_15_tfprvnum_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A857ValDsc ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          int A795PrvNum ,
                                          String AV42Emprcod ,
                                          String A396EmprCod ,
                                          byte A856ValCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T1.PrvNum, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T2.ValDsc, T1.PrdNom, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T1.ValCod < 3)");
      if ( ! (GXutil.strcmp("", AV51Wcwwkp64ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrdCanPen,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrvNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Wcwwkp64ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV52Wcwwkp64ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Wcwwkp64ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcwwkp64ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcwwkp64ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcwwkp64ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcwwkp64ds_7_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcwwkp64ds_6_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcwwkp64ds_7_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcwwkp64ds_8_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Wcwwkp64ds_9_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcwwkp64ds_10_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcwwkp64ds_11_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcwwkp64ds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcwwkp64ds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Wcwwkp64ds_14_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Wcwwkp64ds_15_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
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
                  return conditional_P08QU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P08QU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P08QU4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08QU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08QU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08QU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
      }
   }

}

