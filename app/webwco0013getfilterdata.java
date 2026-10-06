package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwco0013getfilterdata extends GXProcedure
{
   public webwco0013getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwco0013getfilterdata.class ), "" );
   }

   public webwco0013getfilterdata( int remoteHandle ,
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
      webwco0013getfilterdata.this.aP5 = new String[] {""};
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
      webwco0013getfilterdata.this.AV16DDOName = aP0;
      webwco0013getfilterdata.this.AV14SearchTxt = aP1;
      webwco0013getfilterdata.this.AV15SearchTxtTo = aP2;
      webwco0013getfilterdata.this.aP3 = aP3;
      webwco0013getfilterdata.this.aP4 = aP4;
      webwco0013getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNOM") == 0 )
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
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("WebWco0013GridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWco0013GridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WebWco0013GridState"), null, null);
      }
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV44GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV32Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PREPRVNUM") == 0 )
         {
            AV33PrePrvNum = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNOM") == 0 )
         {
            AV34PrvNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV14SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV46Webwco0013ds_1_tfprdnum = AV10TFPrdNum ;
      AV47Webwco0013ds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV48Webwco0013ds_3_tfprdnom = AV12TFPrdNom ;
      AV49Webwco0013ds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Webwco0013ds_2_tfprdnum_sel ,
                                           AV46Webwco0013ds_1_tfprdnum ,
                                           AV49Webwco0013ds_4_tfprdnom_sel ,
                                           AV48Webwco0013ds_3_tfprdnom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           AV32Emprcod ,
                                           Integer.valueOf(AV33PrePrvNum) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV46Webwco0013ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Webwco0013ds_1_tfprdnum), 6, "%") ;
      lV48Webwco0013ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Webwco0013ds_3_tfprdnom), 26, "%") ;
      /* Using cursor P08RG2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, Integer.valueOf(AV33PrePrvNum), lV46Webwco0013ds_1_tfprdnum, AV47Webwco0013ds_2_tfprdnum_sel, lV48Webwco0013ds_3_tfprdnom, AV49Webwco0013ds_4_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8RG2 = false ;
         A756PrePrvNum = P08RG2_A756PrePrvNum[0] ;
         A396EmprCod = P08RG2_A396EmprCod[0] ;
         A719PrdNum = P08RG2_A719PrdNum[0] ;
         A658PedCod = P08RG2_A658PedCod[0] ;
         n658PedCod = P08RG2_n658PedCod[0] ;
         A718PrdNom = P08RG2_A718PrdNom[0] ;
         A718PrdNom = P08RG2_A718PrdNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08RG2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08RG2_A756PrePrvNum[0] == A756PrePrvNum ) && ( GXutil.strcmp(P08RG2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8RG2 = false ;
            AV26count = (long)(AV26count+1) ;
            brk8RG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV18Option = A719PrdNum ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RG2 )
         {
            brk8RG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV14SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV46Webwco0013ds_1_tfprdnum = AV10TFPrdNum ;
      AV47Webwco0013ds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV48Webwco0013ds_3_tfprdnom = AV12TFPrdNom ;
      AV49Webwco0013ds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV47Webwco0013ds_2_tfprdnum_sel ,
                                           AV46Webwco0013ds_1_tfprdnum ,
                                           AV49Webwco0013ds_4_tfprdnom_sel ,
                                           AV48Webwco0013ds_3_tfprdnom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A658PedCod) ,
                                           A396EmprCod ,
                                           AV32Emprcod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           Integer.valueOf(AV33PrePrvNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV46Webwco0013ds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Webwco0013ds_1_tfprdnum), 6, "%") ;
      lV48Webwco0013ds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Webwco0013ds_3_tfprdnom), 26, "%") ;
      /* Using cursor P08RG3 */
      pr_default.execute(1, new Object[] {AV32Emprcod, Integer.valueOf(AV33PrePrvNum), lV46Webwco0013ds_1_tfprdnum, AV47Webwco0013ds_2_tfprdnum_sel, lV48Webwco0013ds_3_tfprdnom, AV49Webwco0013ds_4_tfprdnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8RG4 = false ;
         A396EmprCod = P08RG3_A396EmprCod[0] ;
         A756PrePrvNum = P08RG3_A756PrePrvNum[0] ;
         A718PrdNom = P08RG3_A718PrdNom[0] ;
         A658PedCod = P08RG3_A658PedCod[0] ;
         n658PedCod = P08RG3_n658PedCod[0] ;
         A719PrdNum = P08RG3_A719PrdNum[0] ;
         A718PrdNom = P08RG3_A718PrdNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08RG3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8RG4 = false ;
            A396EmprCod = P08RG3_A396EmprCod[0] ;
            A756PrePrvNum = P08RG3_A756PrePrvNum[0] ;
            A719PrdNum = P08RG3_A719PrdNum[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RG4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV18Option = A718PrdNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RG4 )
         {
            brk8RG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwco0013getfilterdata.this.AV20OptionsJson;
      this.aP4[0] = webwco0013getfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = webwco0013getfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV32Emprcod = "" ;
      AV34PrvNom = "" ;
      A719PrdNum = "" ;
      AV46Webwco0013ds_1_tfprdnum = "" ;
      AV47Webwco0013ds_2_tfprdnum_sel = "" ;
      AV48Webwco0013ds_3_tfprdnom = "" ;
      AV49Webwco0013ds_4_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV46Webwco0013ds_1_tfprdnum = "" ;
      lV48Webwco0013ds_3_tfprdnom = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      P08RG2_A756PrePrvNum = new int[1] ;
      P08RG2_A396EmprCod = new String[] {""} ;
      P08RG2_A719PrdNum = new String[] {""} ;
      P08RG2_A658PedCod = new int[1] ;
      P08RG2_n658PedCod = new boolean[] {false} ;
      P08RG2_A718PrdNom = new String[] {""} ;
      AV18Option = "" ;
      P08RG3_A396EmprCod = new String[] {""} ;
      P08RG3_A756PrePrvNum = new int[1] ;
      P08RG3_A718PrdNom = new String[] {""} ;
      P08RG3_A658PedCod = new int[1] ;
      P08RG3_n658PedCod = new boolean[] {false} ;
      P08RG3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwco0013getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08RG2_A756PrePrvNum, P08RG2_A396EmprCod, P08RG2_A719PrdNum, P08RG2_A658PedCod, P08RG2_n658PedCod, P08RG2_A718PrdNom
            }
            , new Object[] {
            P08RG3_A396EmprCod, P08RG3_A756PrePrvNum, P08RG3_A718PrdNom, P08RG3_A658PedCod, P08RG3_n658PedCod, P08RG3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV33PrePrvNum ;
   private int A658PedCod ;
   private int A756PrePrvNum ;
   private long AV26count ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV32Emprcod ;
   private String AV34PrvNom ;
   private String A719PrdNum ;
   private String AV46Webwco0013ds_1_tfprdnum ;
   private String AV47Webwco0013ds_2_tfprdnum_sel ;
   private String AV48Webwco0013ds_3_tfprdnom ;
   private String AV49Webwco0013ds_4_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV46Webwco0013ds_1_tfprdnum ;
   private String lV48Webwco0013ds_3_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8RG2 ;
   private boolean n658PedCod ;
   private boolean brk8RG4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08RG2_A756PrePrvNum ;
   private String[] P08RG2_A396EmprCod ;
   private String[] P08RG2_A719PrdNum ;
   private int[] P08RG2_A658PedCod ;
   private boolean[] P08RG2_n658PedCod ;
   private String[] P08RG2_A718PrdNom ;
   private String[] P08RG3_A396EmprCod ;
   private int[] P08RG3_A756PrePrvNum ;
   private String[] P08RG3_A718PrdNom ;
   private int[] P08RG3_A658PedCod ;
   private boolean[] P08RG3_n658PedCod ;
   private String[] P08RG3_A719PrdNum ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwco0013getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08RG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Webwco0013ds_2_tfprdnum_sel ,
                                          String AV46Webwco0013ds_1_tfprdnum ,
                                          String AV49Webwco0013ds_4_tfprdnom_sel ,
                                          String AV48Webwco0013ds_3_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          String AV32Emprcod ,
                                          int AV33PrePrvNum ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.PrePrvNum, T1.EmprCod, T1.PrdNum, T1.PedCod, T2.PrdNom FROM (TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrePrvNum = ?)");
      addWhere(sWhereString, "((T1.PedCod = 0))");
      if ( (GXutil.strcmp("", AV47Webwco0013ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Webwco0013ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Webwco0013ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Webwco0013ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Webwco0013ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Webwco0013ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrePrvNum, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08RG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Webwco0013ds_2_tfprdnum_sel ,
                                          String AV46Webwco0013ds_1_tfprdnum ,
                                          String AV49Webwco0013ds_4_tfprdnom_sel ,
                                          String AV48Webwco0013ds_3_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A658PedCod ,
                                          String A396EmprCod ,
                                          String AV32Emprcod ,
                                          int A756PrePrvNum ,
                                          int AV33PrePrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrePrvNum, T2.PrdNom, T1.PedCod, T1.PrdNum FROM (TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "((T1.PedCod = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrePrvNum = ?)");
      if ( (GXutil.strcmp("", AV47Webwco0013ds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Webwco0013ds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Webwco0013ds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Webwco0013ds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Webwco0013ds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Webwco0013ds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
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
                  return conditional_P08RG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() );
            case 1 :
                  return conditional_P08RG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 26);
               }
               return;
      }
   }

}

