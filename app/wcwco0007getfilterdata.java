package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwco0007getfilterdata extends GXProcedure
{
   public wcwco0007getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwco0007getfilterdata.class ), "" );
   }

   public wcwco0007getfilterdata( int remoteHandle ,
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
      wcwco0007getfilterdata.this.aP5 = new String[] {""};
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
      wcwco0007getfilterdata.this.AV18DDOName = aP0;
      wcwco0007getfilterdata.this.AV16SearchTxt = aP1;
      wcwco0007getfilterdata.this.AV17SearchTxtTo = aP2;
      wcwco0007getfilterdata.this.aP3 = aP3;
      wcwco0007getfilterdata.this.aP4 = aP4;
      wcwco0007getfilterdata.this.aP5 = aP5;
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
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("WCWCO0007GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWCO0007GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCWCO0007GridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV14TFPrdExiAlm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdExiAlm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV35PrvNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV16SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV41Wcwco0007ds_1_filterfulltext = AV36FilterFullText ;
      AV42Wcwco0007ds_2_tfprdnum = AV10TFPrdNum ;
      AV43Wcwco0007ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV44Wcwco0007ds_4_tfprdnom = AV12TFPrdNom ;
      AV45Wcwco0007ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV46Wcwco0007ds_6_tfprdexialm = AV14TFPrdExiAlm ;
      AV47Wcwco0007ds_7_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Wcwco0007ds_1_filterfulltext ,
                                           AV43Wcwco0007ds_3_tfprdnum_sel ,
                                           AV42Wcwco0007ds_2_tfprdnum ,
                                           AV45Wcwco0007ds_5_tfprdnom_sel ,
                                           AV44Wcwco0007ds_4_tfprdnom ,
                                           AV46Wcwco0007ds_6_tfprdexialm ,
                                           AV47Wcwco0007ds_7_tfprdexialm_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           Integer.valueOf(AV35PrvNum) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Wcwco0007ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Wcwco0007ds_1_filterfulltext), "%", "") ;
      lV41Wcwco0007ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Wcwco0007ds_1_filterfulltext), "%", "") ;
      lV41Wcwco0007ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Wcwco0007ds_1_filterfulltext), "%", "") ;
      lV42Wcwco0007ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV42Wcwco0007ds_2_tfprdnum), 6, "%") ;
      lV44Wcwco0007ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV44Wcwco0007ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08NM2 */
      pr_default.execute(0, new Object[] {AV34Emprcod, Integer.valueOf(AV35PrvNum), Integer.valueOf(AV35PrvNum), lV41Wcwco0007ds_1_filterfulltext, lV41Wcwco0007ds_1_filterfulltext, lV41Wcwco0007ds_1_filterfulltext, lV42Wcwco0007ds_2_tfprdnum, AV43Wcwco0007ds_3_tfprdnum_sel, lV44Wcwco0007ds_4_tfprdnom, AV45Wcwco0007ds_5_tfprdnom_sel, AV46Wcwco0007ds_6_tfprdexialm, AV47Wcwco0007ds_7_tfprdexialm_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8NM2 = false ;
         A396EmprCod = P08NM2_A396EmprCod[0] ;
         A719PrdNum = P08NM2_A719PrdNum[0] ;
         A795PrvNum = P08NM2_A795PrvNum[0] ;
         A704PrdExiAlm = P08NM2_A704PrdExiAlm[0] ;
         A718PrdNom = P08NM2_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08NM2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08NM2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8NM2 = false ;
            AV28count = (long)(AV28count+1) ;
            brk8NM2 = true ;
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
         if ( ! brk8NM2 )
         {
            brk8NM2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV16SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV41Wcwco0007ds_1_filterfulltext = AV36FilterFullText ;
      AV42Wcwco0007ds_2_tfprdnum = AV10TFPrdNum ;
      AV43Wcwco0007ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV44Wcwco0007ds_4_tfprdnom = AV12TFPrdNom ;
      AV45Wcwco0007ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV46Wcwco0007ds_6_tfprdexialm = AV14TFPrdExiAlm ;
      AV47Wcwco0007ds_7_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV41Wcwco0007ds_1_filterfulltext ,
                                           AV43Wcwco0007ds_3_tfprdnum_sel ,
                                           AV42Wcwco0007ds_2_tfprdnum ,
                                           AV45Wcwco0007ds_5_tfprdnom_sel ,
                                           AV44Wcwco0007ds_4_tfprdnom ,
                                           AV46Wcwco0007ds_6_tfprdexialm ,
                                           AV47Wcwco0007ds_7_tfprdexialm_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           Integer.valueOf(AV35PrvNum) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Wcwco0007ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Wcwco0007ds_1_filterfulltext), "%", "") ;
      lV41Wcwco0007ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Wcwco0007ds_1_filterfulltext), "%", "") ;
      lV41Wcwco0007ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Wcwco0007ds_1_filterfulltext), "%", "") ;
      lV42Wcwco0007ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV42Wcwco0007ds_2_tfprdnum), 6, "%") ;
      lV44Wcwco0007ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV44Wcwco0007ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08NM3 */
      pr_default.execute(1, new Object[] {AV34Emprcod, Integer.valueOf(AV35PrvNum), Integer.valueOf(AV35PrvNum), lV41Wcwco0007ds_1_filterfulltext, lV41Wcwco0007ds_1_filterfulltext, lV41Wcwco0007ds_1_filterfulltext, lV42Wcwco0007ds_2_tfprdnum, AV43Wcwco0007ds_3_tfprdnum_sel, lV44Wcwco0007ds_4_tfprdnom, AV45Wcwco0007ds_5_tfprdnom_sel, AV46Wcwco0007ds_6_tfprdexialm, AV47Wcwco0007ds_7_tfprdexialm_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8NM4 = false ;
         A396EmprCod = P08NM3_A396EmprCod[0] ;
         A718PrdNom = P08NM3_A718PrdNom[0] ;
         A795PrvNum = P08NM3_A795PrvNum[0] ;
         A704PrdExiAlm = P08NM3_A704PrdExiAlm[0] ;
         A719PrdNum = P08NM3_A719PrdNum[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08NM3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08NM3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8NM4 = false ;
            A719PrdNum = P08NM3_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8NM4 = true ;
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
         if ( ! brk8NM4 )
         {
            brk8NM4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwco0007getfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcwco0007getfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcwco0007getfilterdata.this.AV27OptionIndexesJson;
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
      AV36FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdExiAlm = DecimalUtil.ZERO ;
      AV15TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV34Emprcod = "" ;
      A719PrdNum = "" ;
      AV41Wcwco0007ds_1_filterfulltext = "" ;
      AV42Wcwco0007ds_2_tfprdnum = "" ;
      AV43Wcwco0007ds_3_tfprdnum_sel = "" ;
      AV44Wcwco0007ds_4_tfprdnom = "" ;
      AV45Wcwco0007ds_5_tfprdnom_sel = "" ;
      AV46Wcwco0007ds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV47Wcwco0007ds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV41Wcwco0007ds_1_filterfulltext = "" ;
      lV42Wcwco0007ds_2_tfprdnum = "" ;
      lV44Wcwco0007ds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08NM2_A396EmprCod = new String[] {""} ;
      P08NM2_A719PrdNum = new String[] {""} ;
      P08NM2_A795PrvNum = new int[1] ;
      P08NM2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NM2_A718PrdNom = new String[] {""} ;
      AV20Option = "" ;
      P08NM3_A396EmprCod = new String[] {""} ;
      P08NM3_A718PrdNom = new String[] {""} ;
      P08NM3_A795PrvNum = new int[1] ;
      P08NM3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NM3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwco0007getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08NM2_A396EmprCod, P08NM2_A719PrdNum, P08NM2_A795PrvNum, P08NM2_A704PrdExiAlm, P08NM2_A718PrdNom
            }
            , new Object[] {
            P08NM3_A396EmprCod, P08NM3_A718PrdNom, P08NM3_A795PrvNum, P08NM3_A704PrdExiAlm, P08NM3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV35PrvNum ;
   private int A795PrvNum ;
   private long AV28count ;
   private java.math.BigDecimal AV14TFPrdExiAlm ;
   private java.math.BigDecimal AV15TFPrdExiAlm_To ;
   private java.math.BigDecimal AV46Wcwco0007ds_6_tfprdexialm ;
   private java.math.BigDecimal AV47Wcwco0007ds_7_tfprdexialm_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV34Emprcod ;
   private String A719PrdNum ;
   private String AV42Wcwco0007ds_2_tfprdnum ;
   private String AV43Wcwco0007ds_3_tfprdnum_sel ;
   private String AV44Wcwco0007ds_4_tfprdnom ;
   private String AV45Wcwco0007ds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV42Wcwco0007ds_2_tfprdnum ;
   private String lV44Wcwco0007ds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8NM2 ;
   private boolean brk8NM4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV41Wcwco0007ds_1_filterfulltext ;
   private String lV41Wcwco0007ds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08NM2_A396EmprCod ;
   private String[] P08NM2_A719PrdNum ;
   private int[] P08NM2_A795PrvNum ;
   private java.math.BigDecimal[] P08NM2_A704PrdExiAlm ;
   private String[] P08NM2_A718PrdNom ;
   private String[] P08NM3_A396EmprCod ;
   private String[] P08NM3_A718PrdNom ;
   private int[] P08NM3_A795PrvNum ;
   private java.math.BigDecimal[] P08NM3_A704PrdExiAlm ;
   private String[] P08NM3_A719PrdNum ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcwco0007getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Wcwco0007ds_1_filterfulltext ,
                                          String AV43Wcwco0007ds_3_tfprdnum_sel ,
                                          String AV42Wcwco0007ds_2_tfprdnum ,
                                          String AV45Wcwco0007ds_5_tfprdnom_sel ,
                                          String AV44Wcwco0007ds_4_tfprdnom ,
                                          java.math.BigDecimal AV46Wcwco0007ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV47Wcwco0007ds_7_tfprdexialm_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          int AV35PrvNum ,
                                          int A795PrvNum ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, PrvNum, PrdExiAlm, PrdNom FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(PrdExiAlm > 0)");
      addWhere(sWhereString, "(PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV41Wcwco0007ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(PrdExiAlm,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Wcwco0007ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV42Wcwco0007ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Wcwco0007ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Wcwco0007ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Wcwco0007ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Wcwco0007ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Wcwco0007ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47Wcwco0007ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08NM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Wcwco0007ds_1_filterfulltext ,
                                          String AV43Wcwco0007ds_3_tfprdnum_sel ,
                                          String AV42Wcwco0007ds_2_tfprdnum ,
                                          String AV45Wcwco0007ds_5_tfprdnom_sel ,
                                          String AV44Wcwco0007ds_4_tfprdnom ,
                                          java.math.BigDecimal AV46Wcwco0007ds_6_tfprdexialm ,
                                          java.math.BigDecimal AV47Wcwco0007ds_7_tfprdexialm_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          int AV35PrvNum ,
                                          int A795PrvNum ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNom, PrvNum, PrdExiAlm, PrdNum FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(PrdExiAlm > 0)");
      addWhere(sWhereString, "(PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV41Wcwco0007ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(PrdExiAlm,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Wcwco0007ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV42Wcwco0007ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Wcwco0007ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Wcwco0007ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Wcwco0007ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Wcwco0007ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Wcwco0007ds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47Wcwco0007ds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, PrdNom" ;
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
                  return conditional_P08NM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] );
            case 1 :
                  return conditional_P08NM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               return;
      }
   }

}

