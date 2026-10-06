package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwmodprmgetfilterdata extends GXProcedure
{
   public wcwmodprmgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwmodprmgetfilterdata.class ), "" );
   }

   public wcwmodprmgetfilterdata( int remoteHandle ,
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
      wcwmodprmgetfilterdata.this.aP5 = new String[] {""};
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
      wcwmodprmgetfilterdata.this.AV20DDOName = aP0;
      wcwmodprmgetfilterdata.this.AV18SearchTxt = aP1;
      wcwmodprmgetfilterdata.this.AV19SearchTxtTo = aP2;
      wcwmodprmgetfilterdata.this.aP3 = aP3;
      wcwmodprmgetfilterdata.this.aP4 = aP4;
      wcwmodprmgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNOM") == 0 )
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
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WCWmodprmGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWmodprmGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WCWmodprmGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREANT") == 0 )
         {
            AV14TFPrdPreAnt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFPrdPreAnt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFECPRE") == 0 )
         {
            AV16TFPrdFecPre = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV36Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV37PrvNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV18SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV45Wcwmodprmds_1_filterfulltext = AV38FilterFullText ;
      AV46Wcwmodprmds_2_tfprdnum = AV10TFPrdNum ;
      AV47Wcwmodprmds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV48Wcwmodprmds_4_tfprdnom = AV12TFPrdNom ;
      AV49Wcwmodprmds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV50Wcwmodprmds_6_tfprdpreant = AV14TFPrdPreAnt ;
      AV51Wcwmodprmds_7_tfprdpreant_to = AV15TFPrdPreAnt_To ;
      AV52Wcwmodprmds_8_tfprdfecpre = AV16TFPrdFecPre ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV45Wcwmodprmds_1_filterfulltext ,
                                           AV47Wcwmodprmds_3_tfprdnum_sel ,
                                           AV46Wcwmodprmds_2_tfprdnum ,
                                           AV49Wcwmodprmds_5_tfprdnom_sel ,
                                           AV48Wcwmodprmds_4_tfprdnom ,
                                           AV50Wcwmodprmds_6_tfprdpreant ,
                                           AV51Wcwmodprmds_7_tfprdpreant_to ,
                                           AV52Wcwmodprmds_8_tfprdfecpre ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A725PrdPreAnt ,
                                           A709PrdFecPre ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV37PrvNum) ,
                                           AV36Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV45Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV45Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV45Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV46Wcwmodprmds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Wcwmodprmds_2_tfprdnum), 6, "%") ;
      lV48Wcwmodprmds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Wcwmodprmds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08QC2 */
      pr_default.execute(0, new Object[] {AV36Emprcod, Integer.valueOf(AV37PrvNum), lV45Wcwmodprmds_1_filterfulltext, lV45Wcwmodprmds_1_filterfulltext, lV45Wcwmodprmds_1_filterfulltext, lV46Wcwmodprmds_2_tfprdnum, AV47Wcwmodprmds_3_tfprdnum_sel, lV48Wcwmodprmds_4_tfprdnom, AV49Wcwmodprmds_5_tfprdnom_sel, AV50Wcwmodprmds_6_tfprdpreant, AV51Wcwmodprmds_7_tfprdpreant_to, AV52Wcwmodprmds_8_tfprdfecpre});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8QC2 = false ;
         A396EmprCod = P08QC2_A396EmprCod[0] ;
         A719PrdNum = P08QC2_A719PrdNum[0] ;
         A795PrvNum = P08QC2_A795PrvNum[0] ;
         A709PrdFecPre = P08QC2_A709PrdFecPre[0] ;
         A725PrdPreAnt = P08QC2_A725PrdPreAnt[0] ;
         A718PrdNom = P08QC2_A718PrdNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08QC2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08QC2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8QC2 = false ;
            AV30count = (long)(AV30count+1) ;
            brk8QC2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV22Option = A719PrdNum ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8QC2 )
         {
            brk8QC2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV18SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV45Wcwmodprmds_1_filterfulltext = AV38FilterFullText ;
      AV46Wcwmodprmds_2_tfprdnum = AV10TFPrdNum ;
      AV47Wcwmodprmds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV48Wcwmodprmds_4_tfprdnom = AV12TFPrdNom ;
      AV49Wcwmodprmds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV50Wcwmodprmds_6_tfprdpreant = AV14TFPrdPreAnt ;
      AV51Wcwmodprmds_7_tfprdpreant_to = AV15TFPrdPreAnt_To ;
      AV52Wcwmodprmds_8_tfprdfecpre = AV16TFPrdFecPre ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV45Wcwmodprmds_1_filterfulltext ,
                                           AV47Wcwmodprmds_3_tfprdnum_sel ,
                                           AV46Wcwmodprmds_2_tfprdnum ,
                                           AV49Wcwmodprmds_5_tfprdnom_sel ,
                                           AV48Wcwmodprmds_4_tfprdnom ,
                                           AV50Wcwmodprmds_6_tfprdpreant ,
                                           AV51Wcwmodprmds_7_tfprdpreant_to ,
                                           AV52Wcwmodprmds_8_tfprdfecpre ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A725PrdPreAnt ,
                                           A709PrdFecPre ,
                                           Integer.valueOf(A795PrvNum) ,
                                           Integer.valueOf(AV37PrvNum) ,
                                           AV36Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV45Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV45Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV45Wcwmodprmds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV45Wcwmodprmds_1_filterfulltext), "%", "") ;
      lV46Wcwmodprmds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Wcwmodprmds_2_tfprdnum), 6, "%") ;
      lV48Wcwmodprmds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Wcwmodprmds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08QC3 */
      pr_default.execute(1, new Object[] {AV36Emprcod, Integer.valueOf(AV37PrvNum), lV45Wcwmodprmds_1_filterfulltext, lV45Wcwmodprmds_1_filterfulltext, lV45Wcwmodprmds_1_filterfulltext, lV46Wcwmodprmds_2_tfprdnum, AV47Wcwmodprmds_3_tfprdnum_sel, lV48Wcwmodprmds_4_tfprdnom, AV49Wcwmodprmds_5_tfprdnom_sel, AV50Wcwmodprmds_6_tfprdpreant, AV51Wcwmodprmds_7_tfprdpreant_to, AV52Wcwmodprmds_8_tfprdfecpre});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8QC4 = false ;
         A396EmprCod = P08QC3_A396EmprCod[0] ;
         A718PrdNom = P08QC3_A718PrdNom[0] ;
         A795PrvNum = P08QC3_A795PrvNum[0] ;
         A709PrdFecPre = P08QC3_A709PrdFecPre[0] ;
         A725PrdPreAnt = P08QC3_A725PrdPreAnt[0] ;
         A719PrdNum = P08QC3_A719PrdNum[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08QC3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08QC3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8QC4 = false ;
            A719PrdNum = P08QC3_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8QC4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV22Option = A718PrdNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8QC4 )
         {
            brk8QC4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwmodprmgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wcwmodprmgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wcwmodprmgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFPrdPreAnt = DecimalUtil.ZERO ;
      AV15TFPrdPreAnt_To = DecimalUtil.ZERO ;
      AV16TFPrdFecPre = GXutil.nullDate() ;
      AV36Emprcod = "" ;
      A719PrdNum = "" ;
      AV45Wcwmodprmds_1_filterfulltext = "" ;
      AV46Wcwmodprmds_2_tfprdnum = "" ;
      AV47Wcwmodprmds_3_tfprdnum_sel = "" ;
      AV48Wcwmodprmds_4_tfprdnom = "" ;
      AV49Wcwmodprmds_5_tfprdnom_sel = "" ;
      AV50Wcwmodprmds_6_tfprdpreant = DecimalUtil.ZERO ;
      AV51Wcwmodprmds_7_tfprdpreant_to = DecimalUtil.ZERO ;
      AV52Wcwmodprmds_8_tfprdfecpre = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV45Wcwmodprmds_1_filterfulltext = "" ;
      lV46Wcwmodprmds_2_tfprdnum = "" ;
      lV48Wcwmodprmds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P08QC2_A396EmprCod = new String[] {""} ;
      P08QC2_A719PrdNum = new String[] {""} ;
      P08QC2_A795PrvNum = new int[1] ;
      P08QC2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08QC2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QC2_A718PrdNom = new String[] {""} ;
      AV22Option = "" ;
      P08QC3_A396EmprCod = new String[] {""} ;
      P08QC3_A718PrdNom = new String[] {""} ;
      P08QC3_A795PrvNum = new int[1] ;
      P08QC3_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08QC3_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08QC3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwmodprmgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08QC2_A396EmprCod, P08QC2_A719PrdNum, P08QC2_A795PrvNum, P08QC2_A709PrdFecPre, P08QC2_A725PrdPreAnt, P08QC2_A718PrdNom
            }
            , new Object[] {
            P08QC3_A396EmprCod, P08QC3_A718PrdNom, P08QC3_A795PrvNum, P08QC3_A709PrdFecPre, P08QC3_A725PrdPreAnt, P08QC3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV37PrvNum ;
   private int A795PrvNum ;
   private long AV30count ;
   private java.math.BigDecimal AV14TFPrdPreAnt ;
   private java.math.BigDecimal AV15TFPrdPreAnt_To ;
   private java.math.BigDecimal AV50Wcwmodprmds_6_tfprdpreant ;
   private java.math.BigDecimal AV51Wcwmodprmds_7_tfprdpreant_to ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV36Emprcod ;
   private String A719PrdNum ;
   private String AV46Wcwmodprmds_2_tfprdnum ;
   private String AV47Wcwmodprmds_3_tfprdnum_sel ;
   private String AV48Wcwmodprmds_4_tfprdnom ;
   private String AV49Wcwmodprmds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV46Wcwmodprmds_2_tfprdnum ;
   private String lV48Wcwmodprmds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private java.util.Date AV16TFPrdFecPre ;
   private java.util.Date AV52Wcwmodprmds_8_tfprdfecpre ;
   private java.util.Date A709PrdFecPre ;
   private boolean returnInSub ;
   private boolean brk8QC2 ;
   private boolean brk8QC4 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV45Wcwmodprmds_1_filterfulltext ;
   private String lV45Wcwmodprmds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08QC2_A396EmprCod ;
   private String[] P08QC2_A719PrdNum ;
   private int[] P08QC2_A795PrvNum ;
   private java.util.Date[] P08QC2_A709PrdFecPre ;
   private java.math.BigDecimal[] P08QC2_A725PrdPreAnt ;
   private String[] P08QC2_A718PrdNom ;
   private String[] P08QC3_A396EmprCod ;
   private String[] P08QC3_A718PrdNom ;
   private int[] P08QC3_A795PrvNum ;
   private java.util.Date[] P08QC3_A709PrdFecPre ;
   private java.math.BigDecimal[] P08QC3_A725PrdPreAnt ;
   private String[] P08QC3_A719PrdNum ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcwmodprmgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08QC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Wcwmodprmds_1_filterfulltext ,
                                          String AV47Wcwmodprmds_3_tfprdnum_sel ,
                                          String AV46Wcwmodprmds_2_tfprdnum ,
                                          String AV49Wcwmodprmds_5_tfprdnom_sel ,
                                          String AV48Wcwmodprmds_4_tfprdnom ,
                                          java.math.BigDecimal AV50Wcwmodprmds_6_tfprdpreant ,
                                          java.math.BigDecimal AV51Wcwmodprmds_7_tfprdpreant_to ,
                                          java.util.Date AV52Wcwmodprmds_8_tfprdfecpre ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A725PrdPreAnt ,
                                          java.util.Date A709PrdFecPre ,
                                          int A795PrvNum ,
                                          int AV37PrvNum ,
                                          String AV36Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, PrvNum, PrdFecPre, PrdPreAnt, PrdNom FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV45Wcwmodprmds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(PrdPreAnt,'99999990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Wcwmodprmds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Wcwmodprmds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Wcwmodprmds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwmodprmds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwmodprmds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwmodprmds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Wcwmodprmds_6_tfprdpreant)==0) )
      {
         addWhere(sWhereString, "(PrdPreAnt >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Wcwmodprmds_7_tfprdpreant_to)==0) )
      {
         addWhere(sWhereString, "(PrdPreAnt <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52Wcwmodprmds_8_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(PrdFecPre >= ?)");
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

   protected Object[] conditional_P08QC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV45Wcwmodprmds_1_filterfulltext ,
                                          String AV47Wcwmodprmds_3_tfprdnum_sel ,
                                          String AV46Wcwmodprmds_2_tfprdnum ,
                                          String AV49Wcwmodprmds_5_tfprdnom_sel ,
                                          String AV48Wcwmodprmds_4_tfprdnom ,
                                          java.math.BigDecimal AV50Wcwmodprmds_6_tfprdpreant ,
                                          java.math.BigDecimal AV51Wcwmodprmds_7_tfprdpreant_to ,
                                          java.util.Date AV52Wcwmodprmds_8_tfprdfecpre ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A725PrdPreAnt ,
                                          java.util.Date A709PrdFecPre ,
                                          int A795PrvNum ,
                                          int AV37PrvNum ,
                                          String AV36Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNom, PrvNum, PrdFecPre, PrdPreAnt, PrdNum FROM TXPPRODUC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrvNum = ?)");
      if ( ! (GXutil.strcmp("", AV45Wcwmodprmds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNum) like '%' || UPPER(?)) or ( UPPER(PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(PrdPreAnt,'99999990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Wcwmodprmds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Wcwmodprmds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Wcwmodprmds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Wcwmodprmds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Wcwmodprmds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Wcwmodprmds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50Wcwmodprmds_6_tfprdpreant)==0) )
      {
         addWhere(sWhereString, "(PrdPreAnt >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Wcwmodprmds_7_tfprdpreant_to)==0) )
      {
         addWhere(sWhereString, "(PrdPreAnt <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52Wcwmodprmds_8_tfprdfecpre)) )
      {
         addWhere(sWhereString, "(PrdFecPre >= ?)");
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
                  return conditional_P08QC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P08QC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08QC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08QC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
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
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               return;
      }
   }

}

