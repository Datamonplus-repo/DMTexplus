package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprdcom_wcgetfilterdata extends GXProcedure
{
   public tprdcom_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdcom_wcgetfilterdata.class ), "" );
   }

   public tprdcom_wcgetfilterdata( int remoteHandle ,
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
      tprdcom_wcgetfilterdata.this.aP5 = new String[] {""};
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
      tprdcom_wcgetfilterdata.this.AV21DDOName = aP0;
      tprdcom_wcgetfilterdata.this.AV19SearchTxt = aP1;
      tprdcom_wcgetfilterdata.this.AV20SearchTxtTo = aP2;
      tprdcom_wcgetfilterdata.this.aP3 = aP3;
      tprdcom_wcgetfilterdata.this.aP4 = aP4;
      tprdcom_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV21DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV25OptionsJson = AV24Options.toJSonString(false) ;
      AV28OptionsDescJson = AV27OptionsDesc.toJSonString(false) ;
      AV30OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV32Session.getValue("TPRDCOM_WCGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPRDCOM_WCGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV32Session.getValue("TPRDCOM_WCGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV50TFPrdNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV51TFPrdNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREC") == 0 )
         {
            AV42TFPrdPrec = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFPrdPrec_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCOMFN") == 0 )
         {
            AV38TFPrdComFN = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFPrdComFN_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCOMVAL") == 0 )
         {
            AV40TFPrdComVal = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFPrdComVal_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45EmprCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDCOMCOD") == 0 )
         {
            AV49PrdComCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV50TFPrdNom = AV19SearchTxt ;
      AV51TFPrdNom_Sel = "" ;
      AV56Tprdcom_wcds_1_emprcod = AV45EmprCod ;
      AV57Tprdcom_wcds_2_prdcomcod = AV49PrdComCod ;
      AV58Tprdcom_wcds_3_tfprdnom = AV50TFPrdNom ;
      AV59Tprdcom_wcds_4_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV60Tprdcom_wcds_5_tfprdprec = AV42TFPrdPrec ;
      AV61Tprdcom_wcds_6_tfprdprec_to = AV43TFPrdPrec_To ;
      AV62Tprdcom_wcds_7_tfprdcomfn = AV38TFPrdComFN ;
      AV63Tprdcom_wcds_8_tfprdcomfn_to = AV39TFPrdComFN_To ;
      AV64Tprdcom_wcds_9_tfprdcomval = AV40TFPrdComVal ;
      AV65Tprdcom_wcds_10_tfprdcomval_to = AV41TFPrdComVal_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV59Tprdcom_wcds_4_tfprdnom_sel ,
                                           AV58Tprdcom_wcds_3_tfprdnom ,
                                           AV60Tprdcom_wcds_5_tfprdprec ,
                                           AV61Tprdcom_wcds_6_tfprdprec_to ,
                                           AV62Tprdcom_wcds_7_tfprdcomfn ,
                                           AV63Tprdcom_wcds_8_tfprdcomfn_to ,
                                           AV64Tprdcom_wcds_9_tfprdcomval ,
                                           AV65Tprdcom_wcds_10_tfprdcomval_to ,
                                           A718PrdNom ,
                                           A1186PrdPrec ,
                                           A690PrdComFN ,
                                           A692PrdComVal ,
                                           AV56Tprdcom_wcds_1_emprcod ,
                                           AV57Tprdcom_wcds_2_prdcomcod ,
                                           A396EmprCod ,
                                           A688PrdComCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Tprdcom_wcds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV58Tprdcom_wcds_3_tfprdnom), 26, "%") ;
      /* Using cursor P098D2 */
      pr_default.execute(0, new Object[] {AV56Tprdcom_wcds_1_emprcod, AV57Tprdcom_wcds_2_prdcomcod, lV58Tprdcom_wcds_3_tfprdnom, AV59Tprdcom_wcds_4_tfprdnom_sel, AV60Tprdcom_wcds_5_tfprdprec, AV61Tprdcom_wcds_6_tfprdprec_to, AV62Tprdcom_wcds_7_tfprdcomfn, AV63Tprdcom_wcds_8_tfprdcomfn_to, AV64Tprdcom_wcds_9_tfprdcomval, AV65Tprdcom_wcds_10_tfprdcomval_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk98D2 = false ;
         A396EmprCod = P098D2_A396EmprCod[0] ;
         A688PrdComCod = P098D2_A688PrdComCod[0] ;
         A719PrdNum = P098D2_A719PrdNum[0] ;
         A692PrdComVal = P098D2_A692PrdComVal[0] ;
         A690PrdComFN = P098D2_A690PrdComFN[0] ;
         A1186PrdPrec = P098D2_A1186PrdPrec[0] ;
         A718PrdNom = P098D2_A718PrdNom[0] ;
         A718PrdNom = P098D2_A718PrdNom[0] ;
         AV31count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P098D2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P098D2_A688PrdComCod[0], A688PrdComCod) == 0 ) && ( GXutil.strcmp(P098D2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk98D2 = false ;
            AV31count = (long)(AV31count+1) ;
            brk98D2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV23Option = A718PrdNom ;
            AV22InsertIndex = 1 ;
            while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
            {
               AV22InsertIndex = (int)(AV22InsertIndex+1) ;
            }
            AV24Options.add(AV23Option, AV22InsertIndex);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV31count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk98D2 )
         {
            brk98D2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprdcom_wcgetfilterdata.this.AV25OptionsJson;
      this.aP4[0] = tprdcom_wcgetfilterdata.this.AV28OptionsDescJson;
      this.aP5[0] = tprdcom_wcgetfilterdata.this.AV30OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25OptionsJson = "" ;
      AV28OptionsDescJson = "" ;
      AV30OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32Session = httpContext.getWebSession();
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50TFPrdNom = "" ;
      AV51TFPrdNom_Sel = "" ;
      AV42TFPrdPrec = DecimalUtil.ZERO ;
      AV43TFPrdPrec_To = DecimalUtil.ZERO ;
      AV38TFPrdComFN = DecimalUtil.ZERO ;
      AV39TFPrdComFN_To = DecimalUtil.ZERO ;
      AV40TFPrdComVal = DecimalUtil.ZERO ;
      AV41TFPrdComVal_To = DecimalUtil.ZERO ;
      AV45EmprCod = "" ;
      AV49PrdComCod = "" ;
      A718PrdNom = "" ;
      AV56Tprdcom_wcds_1_emprcod = "" ;
      AV57Tprdcom_wcds_2_prdcomcod = "" ;
      AV58Tprdcom_wcds_3_tfprdnom = "" ;
      AV59Tprdcom_wcds_4_tfprdnom_sel = "" ;
      AV60Tprdcom_wcds_5_tfprdprec = DecimalUtil.ZERO ;
      AV61Tprdcom_wcds_6_tfprdprec_to = DecimalUtil.ZERO ;
      AV62Tprdcom_wcds_7_tfprdcomfn = DecimalUtil.ZERO ;
      AV63Tprdcom_wcds_8_tfprdcomfn_to = DecimalUtil.ZERO ;
      AV64Tprdcom_wcds_9_tfprdcomval = DecimalUtil.ZERO ;
      AV65Tprdcom_wcds_10_tfprdcomval_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV58Tprdcom_wcds_3_tfprdnom = "" ;
      A1186PrdPrec = DecimalUtil.ZERO ;
      A690PrdComFN = DecimalUtil.ZERO ;
      A692PrdComVal = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A688PrdComCod = "" ;
      P098D2_A396EmprCod = new String[] {""} ;
      P098D2_A688PrdComCod = new String[] {""} ;
      P098D2_A719PrdNum = new String[] {""} ;
      P098D2_A692PrdComVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098D2_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098D2_A1186PrdPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098D2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      AV23Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprdcom_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P098D2_A396EmprCod, P098D2_A688PrdComCod, P098D2_A719PrdNum, P098D2_A692PrdComVal, P098D2_A690PrdComFN, P098D2_A1186PrdPrec, P098D2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV22InsertIndex ;
   private long AV31count ;
   private java.math.BigDecimal AV42TFPrdPrec ;
   private java.math.BigDecimal AV43TFPrdPrec_To ;
   private java.math.BigDecimal AV38TFPrdComFN ;
   private java.math.BigDecimal AV39TFPrdComFN_To ;
   private java.math.BigDecimal AV40TFPrdComVal ;
   private java.math.BigDecimal AV41TFPrdComVal_To ;
   private java.math.BigDecimal AV60Tprdcom_wcds_5_tfprdprec ;
   private java.math.BigDecimal AV61Tprdcom_wcds_6_tfprdprec_to ;
   private java.math.BigDecimal AV62Tprdcom_wcds_7_tfprdcomfn ;
   private java.math.BigDecimal AV63Tprdcom_wcds_8_tfprdcomfn_to ;
   private java.math.BigDecimal AV64Tprdcom_wcds_9_tfprdcomval ;
   private java.math.BigDecimal AV65Tprdcom_wcds_10_tfprdcomval_to ;
   private java.math.BigDecimal A1186PrdPrec ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal A692PrdComVal ;
   private String AV50TFPrdNom ;
   private String AV51TFPrdNom_Sel ;
   private String AV45EmprCod ;
   private String AV49PrdComCod ;
   private String A718PrdNom ;
   private String AV56Tprdcom_wcds_1_emprcod ;
   private String AV57Tprdcom_wcds_2_prdcomcod ;
   private String AV58Tprdcom_wcds_3_tfprdnom ;
   private String AV59Tprdcom_wcds_4_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV58Tprdcom_wcds_3_tfprdnom ;
   private String A396EmprCod ;
   private String A688PrdComCod ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private boolean brk98D2 ;
   private String AV25OptionsJson ;
   private String AV28OptionsDescJson ;
   private String AV30OptionIndexesJson ;
   private String AV21DDOName ;
   private String AV19SearchTxt ;
   private String AV20SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P098D2_A396EmprCod ;
   private String[] P098D2_A688PrdComCod ;
   private String[] P098D2_A719PrdNum ;
   private java.math.BigDecimal[] P098D2_A692PrdComVal ;
   private java.math.BigDecimal[] P098D2_A690PrdComFN ;
   private java.math.BigDecimal[] P098D2_A1186PrdPrec ;
   private String[] P098D2_A718PrdNom ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV27OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class tprdcom_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P098D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV59Tprdcom_wcds_4_tfprdnom_sel ,
                                          String AV58Tprdcom_wcds_3_tfprdnom ,
                                          java.math.BigDecimal AV60Tprdcom_wcds_5_tfprdprec ,
                                          java.math.BigDecimal AV61Tprdcom_wcds_6_tfprdprec_to ,
                                          java.math.BigDecimal AV62Tprdcom_wcds_7_tfprdcomfn ,
                                          java.math.BigDecimal AV63Tprdcom_wcds_8_tfprdcomfn_to ,
                                          java.math.BigDecimal AV64Tprdcom_wcds_9_tfprdcomval ,
                                          java.math.BigDecimal AV65Tprdcom_wcds_10_tfprdcomval_to ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1186PrdPrec ,
                                          java.math.BigDecimal A690PrdComFN ,
                                          java.math.BigDecimal A692PrdComVal ,
                                          String AV56Tprdcom_wcds_1_emprcod ,
                                          String AV57Tprdcom_wcds_2_prdcomcod ,
                                          String A396EmprCod ,
                                          String A688PrdComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdComCod, T1.PrdNum, T1.PrdComVal, T1.PrdComFN, T1.PrdPrec, T2.PrdNom FROM (TXPLPRDCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdComCod = ?)");
      if ( (GXutil.strcmp("", AV59Tprdcom_wcds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Tprdcom_wcds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Tprdcom_wcds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Tprdcom_wcds_5_tfprdprec)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPrec >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Tprdcom_wcds_6_tfprdprec_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPrec <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Tprdcom_wcds_7_tfprdcomfn)==0) )
      {
         addWhere(sWhereString, "(T1.PrdComFN >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Tprdcom_wcds_8_tfprdcomfn_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdComFN <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Tprdcom_wcds_9_tfprdcomval)==0) )
      {
         addWhere(sWhereString, "(T1.PrdComVal >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Tprdcom_wcds_10_tfprdcomval_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdComVal <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdComCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P098D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 5);
               }
               return;
      }
   }

}

