package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwstm009getfilterdata extends GXProcedure
{
   public webwstm009getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwstm009getfilterdata.class ), "" );
   }

   public webwstm009getfilterdata( int remoteHandle ,
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
      webwstm009getfilterdata.this.aP5 = new String[] {""};
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
      webwstm009getfilterdata.this.AV18DDOName = aP0;
      webwstm009getfilterdata.this.AV16SearchTxt = aP1;
      webwstm009getfilterdata.this.AV17SearchTxtTo = aP2;
      webwstm009getfilterdata.this.aP3 = aP3;
      webwstm009getfilterdata.this.aP4 = aP4;
      webwstm009getfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_CCSTKALB") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKALBOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PRDNOM") == 0 )
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
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("WebWSTM009GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWSTM009GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WebWSTM009GridState"), null, null);
      }
      AV107GXV1 = 1 ;
      while ( AV107GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV37TFCCStkLin = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV38TFCCStkLin_To = GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV39TFCCStkFec = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB") == 0 )
         {
            AV41TFCCStkAlb = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB_SEL") == 0 )
         {
            AV42TFCCStkAlb_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV73TFPrdExiAlm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFPrdExiAlm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV103Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKPRV") == 0 )
         {
            AV104CcStkPrv = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFEC") == 0 )
         {
            AV35CCStkFec = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CCSTKFEC_TO") == 0 )
         {
            AV36CCStkFec_to = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV107GXV1 = (int)(AV107GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCSTKALBOPTIONS' Routine */
      returnInSub = false ;
      AV41TFCCStkAlb = AV16SearchTxt ;
      AV42TFCCStkAlb_Sel = "" ;
      AV109Webwstm009ds_1_tfccstklin = AV37TFCCStkLin ;
      AV110Webwstm009ds_2_tfccstklin_to = AV38TFCCStkLin_To ;
      AV111Webwstm009ds_3_tfccstkfec = AV39TFCCStkFec ;
      AV112Webwstm009ds_4_tfccstkalb = AV41TFCCStkAlb ;
      AV113Webwstm009ds_5_tfccstkalb_sel = AV42TFCCStkAlb_Sel ;
      AV114Webwstm009ds_6_tfprdnum = AV12TFPrdNum ;
      AV115Webwstm009ds_7_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV116Webwstm009ds_8_tfprdnom = AV14TFPrdNom ;
      AV117Webwstm009ds_9_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV118Webwstm009ds_10_tfprdexialm = AV73TFPrdExiAlm ;
      AV119Webwstm009ds_11_tfprdexialm_to = AV74TFPrdExiAlm_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV109Webwstm009ds_1_tfccstklin) ,
                                           Long.valueOf(AV110Webwstm009ds_2_tfccstklin_to) ,
                                           AV111Webwstm009ds_3_tfccstkfec ,
                                           AV113Webwstm009ds_5_tfccstkalb_sel ,
                                           AV112Webwstm009ds_4_tfccstkalb ,
                                           AV115Webwstm009ds_7_tfprdnum_sel ,
                                           AV114Webwstm009ds_6_tfprdnum ,
                                           AV117Webwstm009ds_9_tfprdnom_sel ,
                                           AV116Webwstm009ds_8_tfprdnom ,
                                           AV118Webwstm009ds_10_tfprdexialm ,
                                           AV119Webwstm009ds_11_tfprdexialm_to ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3348CCStkFec ,
                                           A3354CCStkAlb ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           Integer.valueOf(A6157CcStkPrv) ,
                                           Integer.valueOf(AV104CcStkPrv) ,
                                           AV35CCStkFec ,
                                           AV36CCStkFec_to ,
                                           A396EmprCod ,
                                           AV103Emprcod ,
                                           A3345TipMovCc } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Webwstm009ds_4_tfccstkalb = GXutil.padr( GXutil.rtrim( AV112Webwstm009ds_4_tfccstkalb), 10, "%") ;
      lV114Webwstm009ds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV114Webwstm009ds_6_tfprdnum), 6, "%") ;
      lV116Webwstm009ds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV116Webwstm009ds_8_tfprdnom), 26, "%") ;
      /* Using cursor P08NP2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV104CcStkPrv), Integer.valueOf(AV104CcStkPrv), AV35CCStkFec, AV36CCStkFec_to, AV103Emprcod, Long.valueOf(AV109Webwstm009ds_1_tfccstklin), Long.valueOf(AV110Webwstm009ds_2_tfccstklin_to), AV111Webwstm009ds_3_tfccstkfec, lV112Webwstm009ds_4_tfccstkalb, AV113Webwstm009ds_5_tfccstkalb_sel, lV114Webwstm009ds_6_tfprdnum, AV115Webwstm009ds_7_tfprdnum_sel, lV116Webwstm009ds_8_tfprdnom, AV117Webwstm009ds_9_tfprdnom_sel, AV118Webwstm009ds_10_tfprdexialm, AV119Webwstm009ds_11_tfprdexialm_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8NP2 = false ;
         A396EmprCod = P08NP2_A396EmprCod[0] ;
         A3345TipMovCc = P08NP2_A3345TipMovCc[0] ;
         A3354CCStkAlb = P08NP2_A3354CCStkAlb[0] ;
         A6157CcStkPrv = P08NP2_A6157CcStkPrv[0] ;
         A704PrdExiAlm = P08NP2_A704PrdExiAlm[0] ;
         A718PrdNom = P08NP2_A718PrdNom[0] ;
         A719PrdNum = P08NP2_A719PrdNum[0] ;
         A3348CCStkFec = P08NP2_A3348CCStkFec[0] ;
         A3342CCStkLin = P08NP2_A3342CCStkLin[0] ;
         A704PrdExiAlm = P08NP2_A704PrdExiAlm[0] ;
         A718PrdNom = P08NP2_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08NP2_A3354CCStkAlb[0], A3354CCStkAlb) == 0 ) )
         {
            brk8NP2 = false ;
            A396EmprCod = P08NP2_A396EmprCod[0] ;
            A719PrdNum = P08NP2_A719PrdNum[0] ;
            A3342CCStkLin = P08NP2_A3342CCStkLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8NP2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3354CCStkAlb)==0) )
         {
            AV20Option = A3354CCStkAlb ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8NP2 )
         {
            brk8NP2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV16SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV109Webwstm009ds_1_tfccstklin = AV37TFCCStkLin ;
      AV110Webwstm009ds_2_tfccstklin_to = AV38TFCCStkLin_To ;
      AV111Webwstm009ds_3_tfccstkfec = AV39TFCCStkFec ;
      AV112Webwstm009ds_4_tfccstkalb = AV41TFCCStkAlb ;
      AV113Webwstm009ds_5_tfccstkalb_sel = AV42TFCCStkAlb_Sel ;
      AV114Webwstm009ds_6_tfprdnum = AV12TFPrdNum ;
      AV115Webwstm009ds_7_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV116Webwstm009ds_8_tfprdnom = AV14TFPrdNom ;
      AV117Webwstm009ds_9_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV118Webwstm009ds_10_tfprdexialm = AV73TFPrdExiAlm ;
      AV119Webwstm009ds_11_tfprdexialm_to = AV74TFPrdExiAlm_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Long.valueOf(AV109Webwstm009ds_1_tfccstklin) ,
                                           Long.valueOf(AV110Webwstm009ds_2_tfccstklin_to) ,
                                           AV111Webwstm009ds_3_tfccstkfec ,
                                           AV113Webwstm009ds_5_tfccstkalb_sel ,
                                           AV112Webwstm009ds_4_tfccstkalb ,
                                           AV115Webwstm009ds_7_tfprdnum_sel ,
                                           AV114Webwstm009ds_6_tfprdnum ,
                                           AV117Webwstm009ds_9_tfprdnom_sel ,
                                           AV116Webwstm009ds_8_tfprdnom ,
                                           AV118Webwstm009ds_10_tfprdexialm ,
                                           AV119Webwstm009ds_11_tfprdexialm_to ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3348CCStkFec ,
                                           A3354CCStkAlb ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           Integer.valueOf(A6157CcStkPrv) ,
                                           Integer.valueOf(AV104CcStkPrv) ,
                                           AV35CCStkFec ,
                                           AV36CCStkFec_to ,
                                           A3345TipMovCc ,
                                           AV103Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Webwstm009ds_4_tfccstkalb = GXutil.padr( GXutil.rtrim( AV112Webwstm009ds_4_tfccstkalb), 10, "%") ;
      lV114Webwstm009ds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV114Webwstm009ds_6_tfprdnum), 6, "%") ;
      lV116Webwstm009ds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV116Webwstm009ds_8_tfprdnom), 26, "%") ;
      /* Using cursor P08NP3 */
      pr_default.execute(1, new Object[] {AV103Emprcod, Integer.valueOf(AV104CcStkPrv), Integer.valueOf(AV104CcStkPrv), AV35CCStkFec, AV36CCStkFec_to, Long.valueOf(AV109Webwstm009ds_1_tfccstklin), Long.valueOf(AV110Webwstm009ds_2_tfccstklin_to), AV111Webwstm009ds_3_tfccstkfec, lV112Webwstm009ds_4_tfccstkalb, AV113Webwstm009ds_5_tfccstkalb_sel, lV114Webwstm009ds_6_tfprdnum, AV115Webwstm009ds_7_tfprdnum_sel, lV116Webwstm009ds_8_tfprdnom, AV117Webwstm009ds_9_tfprdnom_sel, AV118Webwstm009ds_10_tfprdexialm, AV119Webwstm009ds_11_tfprdexialm_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8NP4 = false ;
         A396EmprCod = P08NP3_A396EmprCod[0] ;
         A719PrdNum = P08NP3_A719PrdNum[0] ;
         A3345TipMovCc = P08NP3_A3345TipMovCc[0] ;
         A6157CcStkPrv = P08NP3_A6157CcStkPrv[0] ;
         A704PrdExiAlm = P08NP3_A704PrdExiAlm[0] ;
         A718PrdNom = P08NP3_A718PrdNom[0] ;
         A3354CCStkAlb = P08NP3_A3354CCStkAlb[0] ;
         A3348CCStkFec = P08NP3_A3348CCStkFec[0] ;
         A3342CCStkLin = P08NP3_A3342CCStkLin[0] ;
         A704PrdExiAlm = P08NP3_A704PrdExiAlm[0] ;
         A718PrdNom = P08NP3_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08NP3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08NP3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8NP4 = false ;
            A3342CCStkLin = P08NP3_A3342CCStkLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8NP4 = true ;
            pr_default.readNext(1);
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
         if ( ! brk8NP4 )
         {
            brk8NP4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV16SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV109Webwstm009ds_1_tfccstklin = AV37TFCCStkLin ;
      AV110Webwstm009ds_2_tfccstklin_to = AV38TFCCStkLin_To ;
      AV111Webwstm009ds_3_tfccstkfec = AV39TFCCStkFec ;
      AV112Webwstm009ds_4_tfccstkalb = AV41TFCCStkAlb ;
      AV113Webwstm009ds_5_tfccstkalb_sel = AV42TFCCStkAlb_Sel ;
      AV114Webwstm009ds_6_tfprdnum = AV12TFPrdNum ;
      AV115Webwstm009ds_7_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV116Webwstm009ds_8_tfprdnom = AV14TFPrdNom ;
      AV117Webwstm009ds_9_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV118Webwstm009ds_10_tfprdexialm = AV73TFPrdExiAlm ;
      AV119Webwstm009ds_11_tfprdexialm_to = AV74TFPrdExiAlm_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Long.valueOf(AV109Webwstm009ds_1_tfccstklin) ,
                                           Long.valueOf(AV110Webwstm009ds_2_tfccstklin_to) ,
                                           AV111Webwstm009ds_3_tfccstkfec ,
                                           AV113Webwstm009ds_5_tfccstkalb_sel ,
                                           AV112Webwstm009ds_4_tfccstkalb ,
                                           AV115Webwstm009ds_7_tfprdnum_sel ,
                                           AV114Webwstm009ds_6_tfprdnum ,
                                           AV117Webwstm009ds_9_tfprdnom_sel ,
                                           AV116Webwstm009ds_8_tfprdnom ,
                                           AV118Webwstm009ds_10_tfprdexialm ,
                                           AV119Webwstm009ds_11_tfprdexialm_to ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3348CCStkFec ,
                                           A3354CCStkAlb ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           Integer.valueOf(A6157CcStkPrv) ,
                                           Integer.valueOf(AV104CcStkPrv) ,
                                           AV35CCStkFec ,
                                           AV36CCStkFec_to ,
                                           A396EmprCod ,
                                           AV103Emprcod ,
                                           A3345TipMovCc } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV112Webwstm009ds_4_tfccstkalb = GXutil.padr( GXutil.rtrim( AV112Webwstm009ds_4_tfccstkalb), 10, "%") ;
      lV114Webwstm009ds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV114Webwstm009ds_6_tfprdnum), 6, "%") ;
      lV116Webwstm009ds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV116Webwstm009ds_8_tfprdnom), 26, "%") ;
      /* Using cursor P08NP4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV104CcStkPrv), Integer.valueOf(AV104CcStkPrv), AV35CCStkFec, AV36CCStkFec_to, AV103Emprcod, Long.valueOf(AV109Webwstm009ds_1_tfccstklin), Long.valueOf(AV110Webwstm009ds_2_tfccstklin_to), AV111Webwstm009ds_3_tfccstkfec, lV112Webwstm009ds_4_tfccstkalb, AV113Webwstm009ds_5_tfccstkalb_sel, lV114Webwstm009ds_6_tfprdnum, AV115Webwstm009ds_7_tfprdnum_sel, lV116Webwstm009ds_8_tfprdnom, AV117Webwstm009ds_9_tfprdnom_sel, AV118Webwstm009ds_10_tfprdexialm, AV119Webwstm009ds_11_tfprdexialm_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8NP6 = false ;
         A396EmprCod = P08NP4_A396EmprCod[0] ;
         A3345TipMovCc = P08NP4_A3345TipMovCc[0] ;
         A718PrdNom = P08NP4_A718PrdNom[0] ;
         A6157CcStkPrv = P08NP4_A6157CcStkPrv[0] ;
         A704PrdExiAlm = P08NP4_A704PrdExiAlm[0] ;
         A719PrdNum = P08NP4_A719PrdNum[0] ;
         A3354CCStkAlb = P08NP4_A3354CCStkAlb[0] ;
         A3348CCStkFec = P08NP4_A3348CCStkFec[0] ;
         A3342CCStkLin = P08NP4_A3342CCStkLin[0] ;
         A718PrdNom = P08NP4_A718PrdNom[0] ;
         A704PrdExiAlm = P08NP4_A704PrdExiAlm[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08NP4_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8NP6 = false ;
            A396EmprCod = P08NP4_A396EmprCod[0] ;
            A719PrdNum = P08NP4_A719PrdNum[0] ;
            A3342CCStkLin = P08NP4_A3342CCStkLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8NP6 = true ;
            pr_default.readNext(2);
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
         if ( ! brk8NP6 )
         {
            brk8NP6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwstm009getfilterdata.this.AV22OptionsJson;
      this.aP4[0] = webwstm009getfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = webwstm009getfilterdata.this.AV27OptionIndexesJson;
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
      AV39TFCCStkFec = GXutil.nullDate() ;
      AV41TFCCStkAlb = "" ;
      AV42TFCCStkAlb_Sel = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV73TFPrdExiAlm = DecimalUtil.ZERO ;
      AV74TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV103Emprcod = "" ;
      AV35CCStkFec = GXutil.nullDate() ;
      AV36CCStkFec_to = GXutil.nullDate() ;
      A3354CCStkAlb = "" ;
      AV111Webwstm009ds_3_tfccstkfec = GXutil.nullDate() ;
      AV112Webwstm009ds_4_tfccstkalb = "" ;
      AV113Webwstm009ds_5_tfccstkalb_sel = "" ;
      AV114Webwstm009ds_6_tfprdnum = "" ;
      AV115Webwstm009ds_7_tfprdnum_sel = "" ;
      AV116Webwstm009ds_8_tfprdnom = "" ;
      AV117Webwstm009ds_9_tfprdnom_sel = "" ;
      AV118Webwstm009ds_10_tfprdexialm = DecimalUtil.ZERO ;
      AV119Webwstm009ds_11_tfprdexialm_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV112Webwstm009ds_4_tfccstkalb = "" ;
      lV114Webwstm009ds_6_tfprdnum = "" ;
      lV116Webwstm009ds_8_tfprdnom = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A3345TipMovCc = "" ;
      P08NP2_A396EmprCod = new String[] {""} ;
      P08NP2_A3345TipMovCc = new String[] {""} ;
      P08NP2_A3354CCStkAlb = new String[] {""} ;
      P08NP2_A6157CcStkPrv = new int[1] ;
      P08NP2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NP2_A718PrdNom = new String[] {""} ;
      P08NP2_A719PrdNum = new String[] {""} ;
      P08NP2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08NP2_A3342CCStkLin = new long[1] ;
      AV20Option = "" ;
      P08NP3_A396EmprCod = new String[] {""} ;
      P08NP3_A719PrdNum = new String[] {""} ;
      P08NP3_A3345TipMovCc = new String[] {""} ;
      P08NP3_A6157CcStkPrv = new int[1] ;
      P08NP3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NP3_A718PrdNom = new String[] {""} ;
      P08NP3_A3354CCStkAlb = new String[] {""} ;
      P08NP3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08NP3_A3342CCStkLin = new long[1] ;
      P08NP4_A396EmprCod = new String[] {""} ;
      P08NP4_A3345TipMovCc = new String[] {""} ;
      P08NP4_A718PrdNom = new String[] {""} ;
      P08NP4_A6157CcStkPrv = new int[1] ;
      P08NP4_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NP4_A719PrdNum = new String[] {""} ;
      P08NP4_A3354CCStkAlb = new String[] {""} ;
      P08NP4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08NP4_A3342CCStkLin = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwstm009getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08NP2_A396EmprCod, P08NP2_A3345TipMovCc, P08NP2_A3354CCStkAlb, P08NP2_A6157CcStkPrv, P08NP2_A704PrdExiAlm, P08NP2_A718PrdNom, P08NP2_A719PrdNum, P08NP2_A3348CCStkFec, P08NP2_A3342CCStkLin
            }
            , new Object[] {
            P08NP3_A396EmprCod, P08NP3_A719PrdNum, P08NP3_A3345TipMovCc, P08NP3_A6157CcStkPrv, P08NP3_A704PrdExiAlm, P08NP3_A718PrdNom, P08NP3_A3354CCStkAlb, P08NP3_A3348CCStkFec, P08NP3_A3342CCStkLin
            }
            , new Object[] {
            P08NP4_A396EmprCod, P08NP4_A3345TipMovCc, P08NP4_A718PrdNom, P08NP4_A6157CcStkPrv, P08NP4_A704PrdExiAlm, P08NP4_A719PrdNum, P08NP4_A3354CCStkAlb, P08NP4_A3348CCStkFec, P08NP4_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV107GXV1 ;
   private int AV104CcStkPrv ;
   private int A6157CcStkPrv ;
   private long AV37TFCCStkLin ;
   private long AV38TFCCStkLin_To ;
   private long AV109Webwstm009ds_1_tfccstklin ;
   private long AV110Webwstm009ds_2_tfccstklin_to ;
   private long A3342CCStkLin ;
   private long AV28count ;
   private java.math.BigDecimal AV73TFPrdExiAlm ;
   private java.math.BigDecimal AV74TFPrdExiAlm_To ;
   private java.math.BigDecimal AV118Webwstm009ds_10_tfprdexialm ;
   private java.math.BigDecimal AV119Webwstm009ds_11_tfprdexialm_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private String AV41TFCCStkAlb ;
   private String AV42TFCCStkAlb_Sel ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV103Emprcod ;
   private String A3354CCStkAlb ;
   private String AV112Webwstm009ds_4_tfccstkalb ;
   private String AV113Webwstm009ds_5_tfccstkalb_sel ;
   private String AV114Webwstm009ds_6_tfprdnum ;
   private String AV115Webwstm009ds_7_tfprdnum_sel ;
   private String AV116Webwstm009ds_8_tfprdnom ;
   private String AV117Webwstm009ds_9_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV112Webwstm009ds_4_tfccstkalb ;
   private String lV114Webwstm009ds_6_tfprdnum ;
   private String lV116Webwstm009ds_8_tfprdnom ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private String A3345TipMovCc ;
   private java.util.Date AV39TFCCStkFec ;
   private java.util.Date AV35CCStkFec ;
   private java.util.Date AV36CCStkFec_to ;
   private java.util.Date AV111Webwstm009ds_3_tfccstkfec ;
   private java.util.Date A3348CCStkFec ;
   private boolean returnInSub ;
   private boolean brk8NP2 ;
   private boolean brk8NP4 ;
   private boolean brk8NP6 ;
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
   private String[] P08NP2_A396EmprCod ;
   private String[] P08NP2_A3345TipMovCc ;
   private String[] P08NP2_A3354CCStkAlb ;
   private int[] P08NP2_A6157CcStkPrv ;
   private java.math.BigDecimal[] P08NP2_A704PrdExiAlm ;
   private String[] P08NP2_A718PrdNom ;
   private String[] P08NP2_A719PrdNum ;
   private java.util.Date[] P08NP2_A3348CCStkFec ;
   private long[] P08NP2_A3342CCStkLin ;
   private String[] P08NP3_A396EmprCod ;
   private String[] P08NP3_A719PrdNum ;
   private String[] P08NP3_A3345TipMovCc ;
   private int[] P08NP3_A6157CcStkPrv ;
   private java.math.BigDecimal[] P08NP3_A704PrdExiAlm ;
   private String[] P08NP3_A718PrdNom ;
   private String[] P08NP3_A3354CCStkAlb ;
   private java.util.Date[] P08NP3_A3348CCStkFec ;
   private long[] P08NP3_A3342CCStkLin ;
   private String[] P08NP4_A396EmprCod ;
   private String[] P08NP4_A3345TipMovCc ;
   private String[] P08NP4_A718PrdNom ;
   private int[] P08NP4_A6157CcStkPrv ;
   private java.math.BigDecimal[] P08NP4_A704PrdExiAlm ;
   private String[] P08NP4_A719PrdNum ;
   private String[] P08NP4_A3354CCStkAlb ;
   private java.util.Date[] P08NP4_A3348CCStkFec ;
   private long[] P08NP4_A3342CCStkLin ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class webwstm009getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV109Webwstm009ds_1_tfccstklin ,
                                          long AV110Webwstm009ds_2_tfccstklin_to ,
                                          java.util.Date AV111Webwstm009ds_3_tfccstkfec ,
                                          String AV113Webwstm009ds_5_tfccstkalb_sel ,
                                          String AV112Webwstm009ds_4_tfccstkalb ,
                                          String AV115Webwstm009ds_7_tfprdnum_sel ,
                                          String AV114Webwstm009ds_6_tfprdnum ,
                                          String AV117Webwstm009ds_9_tfprdnom_sel ,
                                          String AV116Webwstm009ds_8_tfprdnom ,
                                          java.math.BigDecimal AV118Webwstm009ds_10_tfprdexialm ,
                                          java.math.BigDecimal AV119Webwstm009ds_11_tfprdexialm_to ,
                                          long A3342CCStkLin ,
                                          java.util.Date A3348CCStkFec ,
                                          String A3354CCStkAlb ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          int A6157CcStkPrv ,
                                          int AV104CcStkPrv ,
                                          java.util.Date AV35CCStkFec ,
                                          java.util.Date AV36CCStkFec_to ,
                                          String A396EmprCod ,
                                          String AV103Emprcod ,
                                          String A3345TipMovCc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.TipMovCc, T1.CCStkAlb, T1.CcStkPrv, T2.PrdExiAlm, T2.PrdNom, T1.PrdNum, T1.CCStkFec, T1.CCStkLin FROM (TXPCCSTKS T1 INNER JOIN TXPPRODUC T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.CcStkPrv = ? or (? = 0))");
      addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      addWhere(sWhereString, "(T1.CCStkFec <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipMovCc = 'SD')");
      if ( ! (0==AV109Webwstm009ds_1_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV110Webwstm009ds_2_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Webwstm009ds_3_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Webwstm009ds_5_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV112Webwstm009ds_4_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Webwstm009ds_5_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webwstm009ds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV114Webwstm009ds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webwstm009ds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Webwstm009ds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV116Webwstm009ds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Webwstm009ds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Webwstm009ds_10_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Webwstm009ds_11_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.CCStkAlb" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08NP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV109Webwstm009ds_1_tfccstklin ,
                                          long AV110Webwstm009ds_2_tfccstklin_to ,
                                          java.util.Date AV111Webwstm009ds_3_tfccstkfec ,
                                          String AV113Webwstm009ds_5_tfccstkalb_sel ,
                                          String AV112Webwstm009ds_4_tfccstkalb ,
                                          String AV115Webwstm009ds_7_tfprdnum_sel ,
                                          String AV114Webwstm009ds_6_tfprdnum ,
                                          String AV117Webwstm009ds_9_tfprdnom_sel ,
                                          String AV116Webwstm009ds_8_tfprdnom ,
                                          java.math.BigDecimal AV118Webwstm009ds_10_tfprdexialm ,
                                          java.math.BigDecimal AV119Webwstm009ds_11_tfprdexialm_to ,
                                          long A3342CCStkLin ,
                                          java.util.Date A3348CCStkFec ,
                                          String A3354CCStkAlb ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          int A6157CcStkPrv ,
                                          int AV104CcStkPrv ,
                                          java.util.Date AV35CCStkFec ,
                                          java.util.Date AV36CCStkFec_to ,
                                          String A3345TipMovCc ,
                                          String AV103Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[16];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.TipMovCc, T1.CcStkPrv, T2.PrdExiAlm, T2.PrdNom, T1.CCStkAlb, T1.CCStkFec, T1.CCStkLin FROM (TXPCCSTKS T1 INNER JOIN TXPPRODUC T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CcStkPrv = ? or (? = 0))");
      addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      addWhere(sWhereString, "(T1.CCStkFec <= ?)");
      addWhere(sWhereString, "(T1.TipMovCc = 'SD')");
      if ( ! (0==AV109Webwstm009ds_1_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV110Webwstm009ds_2_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Webwstm009ds_3_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Webwstm009ds_5_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV112Webwstm009ds_4_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Webwstm009ds_5_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webwstm009ds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV114Webwstm009ds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webwstm009ds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Webwstm009ds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV116Webwstm009ds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Webwstm009ds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Webwstm009ds_10_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Webwstm009ds_11_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08NP4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV109Webwstm009ds_1_tfccstklin ,
                                          long AV110Webwstm009ds_2_tfccstklin_to ,
                                          java.util.Date AV111Webwstm009ds_3_tfccstkfec ,
                                          String AV113Webwstm009ds_5_tfccstkalb_sel ,
                                          String AV112Webwstm009ds_4_tfccstkalb ,
                                          String AV115Webwstm009ds_7_tfprdnum_sel ,
                                          String AV114Webwstm009ds_6_tfprdnum ,
                                          String AV117Webwstm009ds_9_tfprdnom_sel ,
                                          String AV116Webwstm009ds_8_tfprdnom ,
                                          java.math.BigDecimal AV118Webwstm009ds_10_tfprdexialm ,
                                          java.math.BigDecimal AV119Webwstm009ds_11_tfprdexialm_to ,
                                          long A3342CCStkLin ,
                                          java.util.Date A3348CCStkFec ,
                                          String A3354CCStkAlb ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          int A6157CcStkPrv ,
                                          int AV104CcStkPrv ,
                                          java.util.Date AV35CCStkFec ,
                                          java.util.Date AV36CCStkFec_to ,
                                          String A396EmprCod ,
                                          String AV103Emprcod ,
                                          String A3345TipMovCc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.TipMovCc, T2.PrdNom, T1.CcStkPrv, T2.PrdExiAlm, T1.PrdNum, T1.CCStkAlb, T1.CCStkFec, T1.CCStkLin FROM (TXPCCSTKS T1 INNER JOIN TXPPRODUC T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.CcStkPrv = ? or (? = 0))");
      addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      addWhere(sWhereString, "(T1.CCStkFec <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.TipMovCc = 'SD')");
      if ( ! (0==AV109Webwstm009ds_1_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV110Webwstm009ds_2_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Webwstm009ds_3_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Webwstm009ds_5_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV112Webwstm009ds_4_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Webwstm009ds_5_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webwstm009ds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV114Webwstm009ds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webwstm009ds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Webwstm009ds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV116Webwstm009ds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Webwstm009ds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Webwstm009ds_10_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Webwstm009ds_11_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
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
                  return conditional_P08NP2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 1 :
                  return conditional_P08NP3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
            case 2 :
                  return conditional_P08NP4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).longValue() , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NP4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
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
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 10);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 10);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 10);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               return;
      }
   }

}

