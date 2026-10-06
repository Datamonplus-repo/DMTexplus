package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tminvstwwgetfilterdata extends GXProcedure
{
   public tminvstwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tminvstwwgetfilterdata.class ), "" );
   }

   public tminvstwwgetfilterdata( int remoteHandle ,
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
      tminvstwwgetfilterdata.this.aP5 = new String[] {""};
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
      tminvstwwgetfilterdata.this.AV28DDOName = aP0;
      tminvstwwgetfilterdata.this.AV26SearchTxt = aP1;
      tminvstwwgetfilterdata.this.AV27SearchTxtTo = aP2;
      tminvstwwgetfilterdata.this.aP3 = aP3;
      tminvstwwgetfilterdata.this.aP4 = aP4;
      tminvstwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_MISUSUCRE") == 0 )
      {
         /* Execute user subroutine: 'LOADMISUSUCREOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("TMInvStWWGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMInvStWWGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("TMInvStWWGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISCOD") == 0 )
         {
            AV14TFMISCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMISCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCH") == 0 )
         {
            AV16TFMISFch = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCHAPL") == 0 )
         {
            AV24TFMISFchApl = localUtil.ctod( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISEST_SEL") == 0 )
         {
            AV22TFMISEst_SelsJson = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV23TFMISEst_Sels.fromJSonString(AV22TFMISEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISUSUCRE") == 0 )
         {
            AV18TFMISUsuCre = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISUSUCRE_SEL") == 0 )
         {
            AV19TFMISUsuCre_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCHCRE") == 0 )
         {
            AV20TFMISFchCre = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMISUSUCREOPTIONS' Routine */
      returnInSub = false ;
      AV18TFMISUsuCre = AV26SearchTxt ;
      AV19TFMISUsuCre_Sel = "" ;
      AV49Tminvstwwds_1_filterfulltext = AV44FilterFullText ;
      AV50Tminvstwwds_2_tfmiscod = AV14TFMISCod ;
      AV51Tminvstwwds_3_tfmiscod_to = AV15TFMISCod_To ;
      AV52Tminvstwwds_4_tfmisfch = AV16TFMISFch ;
      AV53Tminvstwwds_5_tfmisfchapl = AV24TFMISFchApl ;
      AV54Tminvstwwds_6_tfmisest_sels = AV23TFMISEst_Sels ;
      AV55Tminvstwwds_7_tfmisusucre = AV18TFMISUsuCre ;
      AV56Tminvstwwds_8_tfmisusucre_sel = AV19TFMISUsuCre_Sel ;
      AV57Tminvstwwds_9_tfmisfchcre = AV20TFMISFchCre ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9402MISEst ,
                                           AV54Tminvstwwds_6_tfmisest_sels ,
                                           Integer.valueOf(AV50Tminvstwwds_2_tfmiscod) ,
                                           Integer.valueOf(AV51Tminvstwwds_3_tfmiscod_to) ,
                                           AV52Tminvstwwds_4_tfmisfch ,
                                           AV53Tminvstwwds_5_tfmisfchapl ,
                                           Integer.valueOf(AV54Tminvstwwds_6_tfmisest_sels.size()) ,
                                           AV56Tminvstwwds_8_tfmisusucre_sel ,
                                           AV55Tminvstwwds_7_tfmisusucre ,
                                           AV57Tminvstwwds_9_tfmisfchcre ,
                                           Integer.valueOf(A9398MISCod) ,
                                           A9399MISFch ,
                                           A11303MISFchApl ,
                                           A9400MISUsuCre ,
                                           A9401MISFchCre ,
                                           AV49Tminvstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV55Tminvstwwds_7_tfmisusucre = GXutil.padr( GXutil.rtrim( AV55Tminvstwwds_7_tfmisusucre), 10, "%") ;
      /* Using cursor P08EE2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV50Tminvstwwds_2_tfmiscod), Integer.valueOf(AV51Tminvstwwds_3_tfmiscod_to), AV52Tminvstwwds_4_tfmisfch, AV53Tminvstwwds_5_tfmisfchapl, lV55Tminvstwwds_7_tfmisusucre, AV56Tminvstwwds_8_tfmisusucre_sel, AV57Tminvstwwds_9_tfmisfchcre});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8EE2 = false ;
         A9400MISUsuCre = P08EE2_A9400MISUsuCre[0] ;
         n9400MISUsuCre = P08EE2_n9400MISUsuCre[0] ;
         A9401MISFchCre = P08EE2_A9401MISFchCre[0] ;
         n9401MISFchCre = P08EE2_n9401MISFchCre[0] ;
         A11303MISFchApl = P08EE2_A11303MISFchApl[0] ;
         n11303MISFchApl = P08EE2_n11303MISFchApl[0] ;
         A9399MISFch = P08EE2_A9399MISFch[0] ;
         n9399MISFch = P08EE2_n9399MISFch[0] ;
         A9398MISCod = P08EE2_A9398MISCod[0] ;
         A9402MISEst = P08EE2_A9402MISEst[0] ;
         n9402MISEst = P08EE2_n9402MISEst[0] ;
         A396EmprCod = P08EE2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV49Tminvstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9398MISCod, 8, 0) , GXutil.padr( "%" + AV49Tminvstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV49Tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9400MISUsuCre) , GXutil.padr( "%" + GXutil.upper( AV49Tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV38count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08EE2_A9400MISUsuCre[0], A9400MISUsuCre) == 0 ) )
            {
               brk8EE2 = false ;
               A9398MISCod = P08EE2_A9398MISCod[0] ;
               A396EmprCod = P08EE2_A396EmprCod[0] ;
               AV38count = (long)(AV38count+1) ;
               brk8EE2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A9400MISUsuCre)==0) )
            {
               AV30Option = A9400MISUsuCre ;
               AV31Options.add(AV30Option, 0);
               AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV31Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8EE2 )
         {
            brk8EE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tminvstwwgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = tminvstwwgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = tminvstwwgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV16TFMISFch = GXutil.nullDate() ;
      AV24TFMISFchApl = GXutil.nullDate() ;
      AV22TFMISEst_SelsJson = "" ;
      AV23TFMISEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18TFMISUsuCre = "" ;
      AV19TFMISUsuCre_Sel = "" ;
      AV20TFMISFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9400MISUsuCre = "" ;
      AV49Tminvstwwds_1_filterfulltext = "" ;
      AV52Tminvstwwds_4_tfmisfch = GXutil.nullDate() ;
      AV53Tminvstwwds_5_tfmisfchapl = GXutil.nullDate() ;
      AV54Tminvstwwds_6_tfmisest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV55Tminvstwwds_7_tfmisusucre = "" ;
      AV56Tminvstwwds_8_tfmisusucre_sel = "" ;
      AV57Tminvstwwds_9_tfmisfchcre = GXutil.resetTime( GXutil.nullDate() );
      lV49Tminvstwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV55Tminvstwwds_7_tfmisusucre = "" ;
      A9402MISEst = "" ;
      A9399MISFch = GXutil.nullDate() ;
      A11303MISFchApl = GXutil.nullDate() ;
      A9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      P08EE2_A9400MISUsuCre = new String[] {""} ;
      P08EE2_n9400MISUsuCre = new boolean[] {false} ;
      P08EE2_A9401MISFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EE2_n9401MISFchCre = new boolean[] {false} ;
      P08EE2_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08EE2_n11303MISFchApl = new boolean[] {false} ;
      P08EE2_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08EE2_n9399MISFch = new boolean[] {false} ;
      P08EE2_A9398MISCod = new int[1] ;
      P08EE2_A9402MISEst = new String[] {""} ;
      P08EE2_n9402MISEst = new boolean[] {false} ;
      P08EE2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tminvstwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08EE2_A9400MISUsuCre, P08EE2_n9400MISUsuCre, P08EE2_A9401MISFchCre, P08EE2_n9401MISFchCre, P08EE2_A11303MISFchApl, P08EE2_n11303MISFchApl, P08EE2_A9399MISFch, P08EE2_n9399MISFch, P08EE2_A9398MISCod, P08EE2_A9402MISEst,
            P08EE2_n9402MISEst, P08EE2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV47GXV1 ;
   private int AV14TFMISCod ;
   private int AV15TFMISCod_To ;
   private int AV50Tminvstwwds_2_tfmiscod ;
   private int AV51Tminvstwwds_3_tfmiscod_to ;
   private int AV54Tminvstwwds_6_tfmisest_sels_size ;
   private int A9398MISCod ;
   private long AV38count ;
   private String AV18TFMISUsuCre ;
   private String AV19TFMISUsuCre_Sel ;
   private String A9400MISUsuCre ;
   private String AV55Tminvstwwds_7_tfmisusucre ;
   private String AV56Tminvstwwds_8_tfmisusucre_sel ;
   private String scmdbuf ;
   private String lV55Tminvstwwds_7_tfmisusucre ;
   private String A9402MISEst ;
   private String A396EmprCod ;
   private java.util.Date AV20TFMISFchCre ;
   private java.util.Date AV57Tminvstwwds_9_tfmisfchcre ;
   private java.util.Date A9401MISFchCre ;
   private java.util.Date AV16TFMISFch ;
   private java.util.Date AV24TFMISFchApl ;
   private java.util.Date AV52Tminvstwwds_4_tfmisfch ;
   private java.util.Date AV53Tminvstwwds_5_tfmisfchapl ;
   private java.util.Date A9399MISFch ;
   private java.util.Date A11303MISFchApl ;
   private boolean returnInSub ;
   private boolean brk8EE2 ;
   private boolean n9400MISUsuCre ;
   private boolean n9401MISFchCre ;
   private boolean n11303MISFchApl ;
   private boolean n9399MISFch ;
   private boolean n9402MISEst ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV22TFMISEst_SelsJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV49Tminvstwwds_1_filterfulltext ;
   private String lV49Tminvstwwds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08EE2_A9400MISUsuCre ;
   private boolean[] P08EE2_n9400MISUsuCre ;
   private java.util.Date[] P08EE2_A9401MISFchCre ;
   private boolean[] P08EE2_n9401MISFchCre ;
   private java.util.Date[] P08EE2_A11303MISFchApl ;
   private boolean[] P08EE2_n11303MISFchApl ;
   private java.util.Date[] P08EE2_A9399MISFch ;
   private boolean[] P08EE2_n9399MISFch ;
   private int[] P08EE2_A9398MISCod ;
   private String[] P08EE2_A9402MISEst ;
   private boolean[] P08EE2_n9402MISEst ;
   private String[] P08EE2_A396EmprCod ;
   private GXSimpleCollection<String> AV23TFMISEst_Sels ;
   private GXSimpleCollection<String> AV54Tminvstwwds_6_tfmisest_sels ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class tminvstwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9402MISEst ,
                                          GXSimpleCollection<String> AV54Tminvstwwds_6_tfmisest_sels ,
                                          int AV50Tminvstwwds_2_tfmiscod ,
                                          int AV51Tminvstwwds_3_tfmiscod_to ,
                                          java.util.Date AV52Tminvstwwds_4_tfmisfch ,
                                          java.util.Date AV53Tminvstwwds_5_tfmisfchapl ,
                                          int AV54Tminvstwwds_6_tfmisest_sels_size ,
                                          String AV56Tminvstwwds_8_tfmisusucre_sel ,
                                          String AV55Tminvstwwds_7_tfmisusucre ,
                                          java.util.Date AV57Tminvstwwds_9_tfmisfchcre ,
                                          int A9398MISCod ,
                                          java.util.Date A9399MISFch ,
                                          java.util.Date A11303MISFchApl ,
                                          String A9400MISUsuCre ,
                                          java.util.Date A9401MISFchCre ,
                                          String AV49Tminvstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MISUsuCre, MISFchCre, MISFchApl, MISFch, MISCod, MISEst, EmprCod FROM TXPMINVST" ;
      if ( ! (0==AV50Tminvstwwds_2_tfmiscod) )
      {
         addWhere(sWhereString, "(MISCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV51Tminvstwwds_3_tfmiscod_to) )
      {
         addWhere(sWhereString, "(MISCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52Tminvstwwds_4_tfmisfch)) )
      {
         addWhere(sWhereString, "(MISFch >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53Tminvstwwds_5_tfmisfchapl)) )
      {
         addWhere(sWhereString, "(MISFchApl >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV54Tminvstwwds_6_tfmisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV54Tminvstwwds_6_tfmisest_sels, "MISEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV56Tminvstwwds_8_tfmisusucre_sel)==0) && ( ! (GXutil.strcmp("", AV55Tminvstwwds_7_tfmisusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MISUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Tminvstwwds_8_tfmisusucre_sel)==0) )
      {
         addWhere(sWhereString, "(MISUsuCre = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV57Tminvstwwds_9_tfmisfchcre) )
      {
         addWhere(sWhereString, "(MISFchCre >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MISUsuCre" ;
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
                  return conditional_P08EE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

