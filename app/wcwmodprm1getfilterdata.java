package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwmodprm1getfilterdata extends GXProcedure
{
   public wcwmodprm1getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwmodprm1getfilterdata.class ), "" );
   }

   public wcwmodprm1getfilterdata( int remoteHandle ,
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
      wcwmodprm1getfilterdata.this.aP5 = new String[] {""};
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
      wcwmodprm1getfilterdata.this.AV20DDOName = aP0;
      wcwmodprm1getfilterdata.this.AV18SearchTxt = aP1;
      wcwmodprm1getfilterdata.this.AV19SearchTxtTo = aP2;
      wcwmodprm1getfilterdata.this.aP3 = aP3;
      wcwmodprm1getfilterdata.this.aP4 = aP4;
      wcwmodprm1getfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV31Session.getValue("WCWmodprm1GridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWmodprm1GridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WCWmodprm1GridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPRV") == 0 )
         {
            AV45TFPrdPrv = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFPrdPrv_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV36Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUM") == 0 )
         {
            AV37PrvNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV18SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV51Wcwmodprm1ds_1_filterfulltext = AV38FilterFullText ;
      AV52Wcwmodprm1ds_2_tfprdprv = AV45TFPrdPrv ;
      AV53Wcwmodprm1ds_3_tfprdprv_to = AV46TFPrdPrv_To ;
      AV54Wcwmodprm1ds_4_tfprdnum = AV10TFPrdNum ;
      AV55Wcwmodprm1ds_5_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV56Wcwmodprm1ds_6_tfprdnom = AV12TFPrdNom ;
      AV57Wcwmodprm1ds_7_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Wcwmodprm1ds_1_filterfulltext ,
                                           Integer.valueOf(AV52Wcwmodprm1ds_2_tfprdprv) ,
                                           Integer.valueOf(AV53Wcwmodprm1ds_3_tfprdprv_to) ,
                                           AV55Wcwmodprm1ds_5_tfprdnum_sel ,
                                           AV54Wcwmodprm1ds_4_tfprdnum ,
                                           AV57Wcwmodprm1ds_7_tfprdnom_sel ,
                                           AV56Wcwmodprm1ds_6_tfprdnom ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(AV37PrvNum) ,
                                           AV36Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51Wcwmodprm1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwmodprm1ds_1_filterfulltext), "%", "") ;
      lV51Wcwmodprm1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwmodprm1ds_1_filterfulltext), "%", "") ;
      lV51Wcwmodprm1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwmodprm1ds_1_filterfulltext), "%", "") ;
      lV54Wcwmodprm1ds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Wcwmodprm1ds_4_tfprdnum), 6, "%") ;
      lV56Wcwmodprm1ds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Wcwmodprm1ds_6_tfprdnom), 26, "%") ;
      /* Using cursor P09RV2 */
      pr_default.execute(0, new Object[] {AV36Emprcod, Integer.valueOf(AV37PrvNum), lV51Wcwmodprm1ds_1_filterfulltext, lV51Wcwmodprm1ds_1_filterfulltext, lV51Wcwmodprm1ds_1_filterfulltext, Integer.valueOf(AV52Wcwmodprm1ds_2_tfprdprv), Integer.valueOf(AV53Wcwmodprm1ds_3_tfprdprv_to), lV54Wcwmodprm1ds_4_tfprdnum, AV55Wcwmodprm1ds_5_tfprdnum_sel, lV56Wcwmodprm1ds_6_tfprdnom, AV57Wcwmodprm1ds_7_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9RV2 = false ;
         A396EmprCod = P09RV2_A396EmprCod[0] ;
         A719PrdNum = P09RV2_A719PrdNum[0] ;
         A718PrdNom = P09RV2_A718PrdNom[0] ;
         A6158PrdPrv = P09RV2_A6158PrdPrv[0] ;
         A718PrdNom = P09RV2_A718PrdNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09RV2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09RV2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9RV2 = false ;
            A6158PrdPrv = P09RV2_A6158PrdPrv[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9RV2 = true ;
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
         if ( ! brk9RV2 )
         {
            brk9RV2 = true ;
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
      AV51Wcwmodprm1ds_1_filterfulltext = AV38FilterFullText ;
      AV52Wcwmodprm1ds_2_tfprdprv = AV45TFPrdPrv ;
      AV53Wcwmodprm1ds_3_tfprdprv_to = AV46TFPrdPrv_To ;
      AV54Wcwmodprm1ds_4_tfprdnum = AV10TFPrdNum ;
      AV55Wcwmodprm1ds_5_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV56Wcwmodprm1ds_6_tfprdnom = AV12TFPrdNom ;
      AV57Wcwmodprm1ds_7_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Wcwmodprm1ds_1_filterfulltext ,
                                           Integer.valueOf(AV52Wcwmodprm1ds_2_tfprdprv) ,
                                           Integer.valueOf(AV53Wcwmodprm1ds_3_tfprdprv_to) ,
                                           AV55Wcwmodprm1ds_5_tfprdnum_sel ,
                                           AV54Wcwmodprm1ds_4_tfprdnum ,
                                           AV57Wcwmodprm1ds_7_tfprdnom_sel ,
                                           AV56Wcwmodprm1ds_6_tfprdnom ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A396EmprCod ,
                                           AV36Emprcod ,
                                           Integer.valueOf(AV37PrvNum) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV51Wcwmodprm1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwmodprm1ds_1_filterfulltext), "%", "") ;
      lV51Wcwmodprm1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwmodprm1ds_1_filterfulltext), "%", "") ;
      lV51Wcwmodprm1ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Wcwmodprm1ds_1_filterfulltext), "%", "") ;
      lV54Wcwmodprm1ds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV54Wcwmodprm1ds_4_tfprdnum), 6, "%") ;
      lV56Wcwmodprm1ds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV56Wcwmodprm1ds_6_tfprdnom), 26, "%") ;
      /* Using cursor P09RV3 */
      pr_default.execute(1, new Object[] {AV36Emprcod, Integer.valueOf(AV37PrvNum), lV51Wcwmodprm1ds_1_filterfulltext, lV51Wcwmodprm1ds_1_filterfulltext, lV51Wcwmodprm1ds_1_filterfulltext, Integer.valueOf(AV52Wcwmodprm1ds_2_tfprdprv), Integer.valueOf(AV53Wcwmodprm1ds_3_tfprdprv_to), lV54Wcwmodprm1ds_4_tfprdnum, AV55Wcwmodprm1ds_5_tfprdnum_sel, lV56Wcwmodprm1ds_6_tfprdnom, AV57Wcwmodprm1ds_7_tfprdnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9RV4 = false ;
         A396EmprCod = P09RV3_A396EmprCod[0] ;
         A6158PrdPrv = P09RV3_A6158PrdPrv[0] ;
         A718PrdNom = P09RV3_A718PrdNom[0] ;
         A719PrdNum = P09RV3_A719PrdNum[0] ;
         A718PrdNom = P09RV3_A718PrdNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09RV3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk9RV4 = false ;
            A396EmprCod = P09RV3_A396EmprCod[0] ;
            A6158PrdPrv = P09RV3_A6158PrdPrv[0] ;
            A719PrdNum = P09RV3_A719PrdNum[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9RV4 = true ;
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
         if ( ! brk9RV4 )
         {
            brk9RV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwmodprm1getfilterdata.this.AV24OptionsJson;
      this.aP4[0] = wcwmodprm1getfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = wcwmodprm1getfilterdata.this.AV29OptionIndexesJson;
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
      AV36Emprcod = "" ;
      A719PrdNum = "" ;
      AV51Wcwmodprm1ds_1_filterfulltext = "" ;
      AV54Wcwmodprm1ds_4_tfprdnum = "" ;
      AV55Wcwmodprm1ds_5_tfprdnum_sel = "" ;
      AV56Wcwmodprm1ds_6_tfprdnom = "" ;
      AV57Wcwmodprm1ds_7_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV51Wcwmodprm1ds_1_filterfulltext = "" ;
      lV54Wcwmodprm1ds_4_tfprdnum = "" ;
      lV56Wcwmodprm1ds_6_tfprdnom = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      P09RV2_A396EmprCod = new String[] {""} ;
      P09RV2_A719PrdNum = new String[] {""} ;
      P09RV2_A718PrdNom = new String[] {""} ;
      P09RV2_A6158PrdPrv = new int[1] ;
      AV22Option = "" ;
      P09RV3_A396EmprCod = new String[] {""} ;
      P09RV3_A6158PrdPrv = new int[1] ;
      P09RV3_A718PrdNom = new String[] {""} ;
      P09RV3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwmodprm1getfilterdata__default(),
         new Object[] {
             new Object[] {
            P09RV2_A396EmprCod, P09RV2_A719PrdNum, P09RV2_A718PrdNom, P09RV2_A6158PrdPrv
            }
            , new Object[] {
            P09RV3_A396EmprCod, P09RV3_A6158PrdPrv, P09RV3_A718PrdNom, P09RV3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV45TFPrdPrv ;
   private int AV46TFPrdPrv_To ;
   private int AV37PrvNum ;
   private int AV52Wcwmodprm1ds_2_tfprdprv ;
   private int AV53Wcwmodprm1ds_3_tfprdprv_to ;
   private int A6158PrdPrv ;
   private long AV30count ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV36Emprcod ;
   private String A719PrdNum ;
   private String AV54Wcwmodprm1ds_4_tfprdnum ;
   private String AV55Wcwmodprm1ds_5_tfprdnum_sel ;
   private String AV56Wcwmodprm1ds_6_tfprdnom ;
   private String AV57Wcwmodprm1ds_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV54Wcwmodprm1ds_4_tfprdnum ;
   private String lV56Wcwmodprm1ds_6_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9RV2 ;
   private boolean brk9RV4 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV51Wcwmodprm1ds_1_filterfulltext ;
   private String lV51Wcwmodprm1ds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09RV2_A396EmprCod ;
   private String[] P09RV2_A719PrdNum ;
   private String[] P09RV2_A718PrdNom ;
   private int[] P09RV2_A6158PrdPrv ;
   private String[] P09RV3_A396EmprCod ;
   private int[] P09RV3_A6158PrdPrv ;
   private String[] P09RV3_A718PrdNom ;
   private String[] P09RV3_A719PrdNum ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcwmodprm1getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09RV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcwmodprm1ds_1_filterfulltext ,
                                          int AV52Wcwmodprm1ds_2_tfprdprv ,
                                          int AV53Wcwmodprm1ds_3_tfprdprv_to ,
                                          String AV55Wcwmodprm1ds_5_tfprdnum_sel ,
                                          String AV54Wcwmodprm1ds_4_tfprdnum ,
                                          String AV57Wcwmodprm1ds_7_tfprdnom_sel ,
                                          String AV56Wcwmodprm1ds_6_tfprdnom ,
                                          int A6158PrdPrv ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int AV37PrvNum ,
                                          String AV36Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T2.PrdNom, T1.PrdPrv FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      if ( ! (GXutil.strcmp("", AV51Wcwmodprm1ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PrdPrv,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV52Wcwmodprm1ds_2_tfprdprv) )
      {
         addWhere(sWhereString, "(T1.PrdPrv >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcwmodprm1ds_3_tfprdprv_to) )
      {
         addWhere(sWhereString, "(T1.PrdPrv <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcwmodprm1ds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcwmodprm1ds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcwmodprm1ds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcwmodprm1ds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcwmodprm1ds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcwmodprm1ds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdPrv" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09RV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Wcwmodprm1ds_1_filterfulltext ,
                                          int AV52Wcwmodprm1ds_2_tfprdprv ,
                                          int AV53Wcwmodprm1ds_3_tfprdprv_to ,
                                          String AV55Wcwmodprm1ds_5_tfprdnum_sel ,
                                          String AV54Wcwmodprm1ds_4_tfprdnum ,
                                          String AV57Wcwmodprm1ds_7_tfprdnom_sel ,
                                          String AV56Wcwmodprm1ds_6_tfprdnom ,
                                          int A6158PrdPrv ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A396EmprCod ,
                                          String AV36Emprcod ,
                                          int AV37PrvNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdPrv, T2.PrdNom, T1.PrdNum FROM (TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      if ( ! (GXutil.strcmp("", AV51Wcwmodprm1ds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.PrdPrv,'999990'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV52Wcwmodprm1ds_2_tfprdprv) )
      {
         addWhere(sWhereString, "(T1.PrdPrv >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV53Wcwmodprm1ds_3_tfprdprv_to) )
      {
         addWhere(sWhereString, "(T1.PrdPrv <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Wcwmodprm1ds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV54Wcwmodprm1ds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Wcwmodprm1ds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcwmodprm1ds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcwmodprm1ds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcwmodprm1ds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
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
                  return conditional_P09RV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P09RV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09RV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09RV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               return;
      }
   }

}

