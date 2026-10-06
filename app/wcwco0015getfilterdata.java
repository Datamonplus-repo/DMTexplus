package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwco0015getfilterdata extends GXProcedure
{
   public wcwco0015getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwco0015getfilterdata.class ), "" );
   }

   public wcwco0015getfilterdata( int remoteHandle ,
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
      wcwco0015getfilterdata.this.aP5 = new String[] {""};
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
      wcwco0015getfilterdata.this.AV18DDOName = aP0;
      wcwco0015getfilterdata.this.AV16SearchTxt = aP1;
      wcwco0015getfilterdata.this.AV17SearchTxtTo = aP2;
      wcwco0015getfilterdata.this.aP3 = aP3;
      wcwco0015getfilterdata.this.aP4 = aP4;
      wcwco0015getfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV29Session.getValue("WCwCO0015GridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCwCO0015GridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCwCO0015GridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
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
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV16SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV43Wcwco0015ds_1_tfprdnum = AV10TFPrdNum ;
      AV44Wcwco0015ds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV45Wcwco0015ds_3_tfprdnom = AV12TFPrdNom ;
      AV46Wcwco0015ds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV47Wcwco0015ds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV48Wcwco0015ds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Wcwco0015ds_2_tfprdnum_sel ,
                                           AV43Wcwco0015ds_1_tfprdnum ,
                                           AV46Wcwco0015ds_4_tfprdnom_sel ,
                                           AV45Wcwco0015ds_3_tfprdnom ,
                                           AV47Wcwco0015ds_5_tfprdexialm ,
                                           AV48Wcwco0015ds_6_tfprdexialm_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           Integer.valueOf(AV35PrvNum) ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           AV34Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV43Wcwco0015ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV43Wcwco0015ds_1_tfprdnum), 6, "%") ;
      lV45Wcwco0015ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV45Wcwco0015ds_3_tfprdnom), 26, "%") ;
      /* Using cursor P08NT2 */
      pr_default.execute(0, new Object[] {AV34Emprcod, Integer.valueOf(AV35PrvNum), Integer.valueOf(AV35PrvNum), lV43Wcwco0015ds_1_tfprdnum, AV44Wcwco0015ds_2_tfprdnum_sel, lV45Wcwco0015ds_3_tfprdnom, AV46Wcwco0015ds_4_tfprdnom_sel, AV47Wcwco0015ds_5_tfprdexialm, AV48Wcwco0015ds_6_tfprdexialm_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8NT2 = false ;
         A396EmprCod = P08NT2_A396EmprCod[0] ;
         A719PrdNum = P08NT2_A719PrdNum[0] ;
         A6158PrdPrv = P08NT2_A6158PrdPrv[0] ;
         A704PrdExiAlm = P08NT2_A704PrdExiAlm[0] ;
         A718PrdNom = P08NT2_A718PrdNom[0] ;
         A704PrdExiAlm = P08NT2_A704PrdExiAlm[0] ;
         A718PrdNom = P08NT2_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08NT2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08NT2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8NT2 = false ;
            A6158PrdPrv = P08NT2_A6158PrdPrv[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8NT2 = true ;
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
         if ( ! brk8NT2 )
         {
            brk8NT2 = true ;
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
      AV43Wcwco0015ds_1_tfprdnum = AV10TFPrdNum ;
      AV44Wcwco0015ds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV45Wcwco0015ds_3_tfprdnom = AV12TFPrdNom ;
      AV46Wcwco0015ds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV47Wcwco0015ds_5_tfprdexialm = AV14TFPrdExiAlm ;
      AV48Wcwco0015ds_6_tfprdexialm_to = AV15TFPrdExiAlm_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV44Wcwco0015ds_2_tfprdnum_sel ,
                                           AV43Wcwco0015ds_1_tfprdnum ,
                                           AV46Wcwco0015ds_4_tfprdnom_sel ,
                                           AV45Wcwco0015ds_3_tfprdnom ,
                                           AV47Wcwco0015ds_5_tfprdexialm ,
                                           AV48Wcwco0015ds_6_tfprdexialm_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           Integer.valueOf(AV35PrvNum) ,
                                           A396EmprCod ,
                                           AV34Emprcod ,
                                           Integer.valueOf(A6158PrdPrv) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV43Wcwco0015ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV43Wcwco0015ds_1_tfprdnum), 6, "%") ;
      lV45Wcwco0015ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV45Wcwco0015ds_3_tfprdnom), 26, "%") ;
      /* Using cursor P08NT3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV35PrvNum), AV34Emprcod, Integer.valueOf(AV35PrvNum), lV43Wcwco0015ds_1_tfprdnum, AV44Wcwco0015ds_2_tfprdnum_sel, lV45Wcwco0015ds_3_tfprdnom, AV46Wcwco0015ds_4_tfprdnom_sel, AV47Wcwco0015ds_5_tfprdexialm, AV48Wcwco0015ds_6_tfprdexialm_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8NT4 = false ;
         A396EmprCod = P08NT3_A396EmprCod[0] ;
         A6158PrdPrv = P08NT3_A6158PrdPrv[0] ;
         A718PrdNom = P08NT3_A718PrdNom[0] ;
         A704PrdExiAlm = P08NT3_A704PrdExiAlm[0] ;
         A719PrdNum = P08NT3_A719PrdNum[0] ;
         A718PrdNom = P08NT3_A718PrdNom[0] ;
         A704PrdExiAlm = P08NT3_A704PrdExiAlm[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08NT3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8NT4 = false ;
            A396EmprCod = P08NT3_A396EmprCod[0] ;
            A6158PrdPrv = P08NT3_A6158PrdPrv[0] ;
            A719PrdNum = P08NT3_A719PrdNum[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8NT4 = true ;
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
         if ( ! brk8NT4 )
         {
            brk8NT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwco0015getfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcwco0015getfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcwco0015getfilterdata.this.AV27OptionIndexesJson;
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
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdExiAlm = DecimalUtil.ZERO ;
      AV15TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV34Emprcod = "" ;
      A719PrdNum = "" ;
      AV43Wcwco0015ds_1_tfprdnum = "" ;
      AV44Wcwco0015ds_2_tfprdnum_sel = "" ;
      AV45Wcwco0015ds_3_tfprdnom = "" ;
      AV46Wcwco0015ds_4_tfprdnom_sel = "" ;
      AV47Wcwco0015ds_5_tfprdexialm = DecimalUtil.ZERO ;
      AV48Wcwco0015ds_6_tfprdexialm_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV43Wcwco0015ds_1_tfprdnum = "" ;
      lV45Wcwco0015ds_3_tfprdnom = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08NT2_A396EmprCod = new String[] {""} ;
      P08NT2_A719PrdNum = new String[] {""} ;
      P08NT2_A6158PrdPrv = new int[1] ;
      P08NT2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NT2_A718PrdNom = new String[] {""} ;
      AV20Option = "" ;
      P08NT3_A396EmprCod = new String[] {""} ;
      P08NT3_A6158PrdPrv = new int[1] ;
      P08NT3_A718PrdNom = new String[] {""} ;
      P08NT3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08NT3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwco0015getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08NT2_A396EmprCod, P08NT2_A719PrdNum, P08NT2_A6158PrdPrv, P08NT2_A704PrdExiAlm, P08NT2_A718PrdNom
            }
            , new Object[] {
            P08NT3_A396EmprCod, P08NT3_A6158PrdPrv, P08NT3_A718PrdNom, P08NT3_A704PrdExiAlm, P08NT3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV41GXV1 ;
   private int AV35PrvNum ;
   private int A6158PrdPrv ;
   private long AV28count ;
   private java.math.BigDecimal AV14TFPrdExiAlm ;
   private java.math.BigDecimal AV15TFPrdExiAlm_To ;
   private java.math.BigDecimal AV47Wcwco0015ds_5_tfprdexialm ;
   private java.math.BigDecimal AV48Wcwco0015ds_6_tfprdexialm_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV34Emprcod ;
   private String A719PrdNum ;
   private String AV43Wcwco0015ds_1_tfprdnum ;
   private String AV44Wcwco0015ds_2_tfprdnum_sel ;
   private String AV45Wcwco0015ds_3_tfprdnom ;
   private String AV46Wcwco0015ds_4_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV43Wcwco0015ds_1_tfprdnum ;
   private String lV45Wcwco0015ds_3_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8NT2 ;
   private boolean brk8NT4 ;
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
   private String[] P08NT2_A396EmprCod ;
   private String[] P08NT2_A719PrdNum ;
   private int[] P08NT2_A6158PrdPrv ;
   private java.math.BigDecimal[] P08NT2_A704PrdExiAlm ;
   private String[] P08NT2_A718PrdNom ;
   private String[] P08NT3_A396EmprCod ;
   private int[] P08NT3_A6158PrdPrv ;
   private String[] P08NT3_A718PrdNom ;
   private java.math.BigDecimal[] P08NT3_A704PrdExiAlm ;
   private String[] P08NT3_A719PrdNum ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcwco0015getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08NT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Wcwco0015ds_2_tfprdnum_sel ,
                                          String AV43Wcwco0015ds_1_tfprdnum ,
                                          String AV46Wcwco0015ds_4_tfprdnom_sel ,
                                          String AV45Wcwco0015ds_3_tfprdnom ,
                                          java.math.BigDecimal AV47Wcwco0015ds_5_tfprdexialm ,
                                          java.math.BigDecimal AV48Wcwco0015ds_6_tfprdexialm_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          int AV35PrvNum ,
                                          int A6158PrdPrv ,
                                          String AV34Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.PrdPrv, T2.PrdExiAlm, T2.PrdNom FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T2.PrdExiAlm > 0)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      if ( (GXutil.strcmp("", AV44Wcwco0015ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV43Wcwco0015ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Wcwco0015ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Wcwco0015ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV45Wcwco0015ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Wcwco0015ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47Wcwco0015ds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Wcwco0015ds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdPrv" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08NT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Wcwco0015ds_2_tfprdnum_sel ,
                                          String AV43Wcwco0015ds_1_tfprdnum ,
                                          String AV46Wcwco0015ds_4_tfprdnom_sel ,
                                          String AV45Wcwco0015ds_3_tfprdnom ,
                                          java.math.BigDecimal AV47Wcwco0015ds_5_tfprdexialm ,
                                          java.math.BigDecimal AV48Wcwco0015ds_6_tfprdexialm_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          int AV35PrvNum ,
                                          String A396EmprCod ,
                                          String AV34Emprcod ,
                                          int A6158PrdPrv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdPrv, T2.PrdNom, T2.PrdExiAlm, T1.PrdNum FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(Not (? = 0))");
      addWhere(sWhereString, "(T2.PrdExiAlm > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      if ( (GXutil.strcmp("", AV44Wcwco0015ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV43Wcwco0015ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Wcwco0015ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Wcwco0015ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV45Wcwco0015ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Wcwco0015ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47Wcwco0015ds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48Wcwco0015ds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
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
                  return conditional_P08NT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P08NT3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08NT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08NT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               return;
      }
   }

}

