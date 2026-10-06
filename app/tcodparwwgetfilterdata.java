package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcodparwwgetfilterdata extends GXProcedure
{
   public tcodparwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcodparwwgetfilterdata.class ), "" );
   }

   public tcodparwwgetfilterdata( int remoteHandle ,
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
      tcodparwwgetfilterdata.this.aP5 = new String[] {""};
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
      tcodparwwgetfilterdata.this.AV18DDOName = aP0;
      tcodparwwgetfilterdata.this.AV16SearchTxt = aP1;
      tcodparwwgetfilterdata.this.AV17SearchTxtTo = aP2;
      tcodparwwgetfilterdata.this.aP3 = aP3;
      tcodparwwgetfilterdata.this.aP4 = aP4;
      tcodparwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_PARCODEST") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODESTOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("TCODPARWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCODPARWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("TCODPARWWGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV45FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV10TFParCod = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFParCod_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV12TFParCodNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV13TFParCodNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODEST") == 0 )
         {
            AV14TFParCodEst = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODEST_SEL") == 0 )
         {
            AV15TFParCodEst_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFParCodNom = AV16SearchTxt ;
      AV13TFParCodNom_Sel = "" ;
      AV50Tcodparwwds_1_filterfulltext = AV45FilterFullText ;
      AV51Tcodparwwds_2_tfparcod = AV10TFParCod ;
      AV52Tcodparwwds_3_tfparcod_to = AV11TFParCod_To ;
      AV53Tcodparwwds_4_tfparcodnom = AV12TFParCodNom ;
      AV54Tcodparwwds_5_tfparcodnom_sel = AV13TFParCodNom_Sel ;
      AV55Tcodparwwds_6_tfparcodest = AV14TFParCodEst ;
      AV56Tcodparwwds_7_tfparcodest_sel = AV15TFParCodEst_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Tcodparwwds_1_filterfulltext ,
                                           Short.valueOf(AV51Tcodparwwds_2_tfparcod) ,
                                           Short.valueOf(AV52Tcodparwwds_3_tfparcod_to) ,
                                           AV54Tcodparwwds_5_tfparcodnom_sel ,
                                           AV53Tcodparwwds_4_tfparcodnom ,
                                           AV56Tcodparwwds_7_tfparcodest_sel ,
                                           AV55Tcodparwwds_6_tfparcodest ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           A8481ParCodEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV50Tcodparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Tcodparwwds_1_filterfulltext), "%", "") ;
      lV50Tcodparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Tcodparwwds_1_filterfulltext), "%", "") ;
      lV50Tcodparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Tcodparwwds_1_filterfulltext), "%", "") ;
      lV53Tcodparwwds_4_tfparcodnom = GXutil.padr( GXutil.rtrim( AV53Tcodparwwds_4_tfparcodnom), 30, "%") ;
      lV55Tcodparwwds_6_tfparcodest = GXutil.padr( GXutil.rtrim( AV55Tcodparwwds_6_tfparcodest), 1, "%") ;
      /* Using cursor P08AR2 */
      pr_default.execute(0, new Object[] {lV50Tcodparwwds_1_filterfulltext, lV50Tcodparwwds_1_filterfulltext, lV50Tcodparwwds_1_filterfulltext, Short.valueOf(AV51Tcodparwwds_2_tfparcod), Short.valueOf(AV52Tcodparwwds_3_tfparcod_to), lV53Tcodparwwds_4_tfparcodnom, AV54Tcodparwwds_5_tfparcodnom_sel, lV55Tcodparwwds_6_tfparcodest, AV56Tcodparwwds_7_tfparcodest_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8AR2 = false ;
         A867ParCodNom = P08AR2_A867ParCodNom[0] ;
         n867ParCodNom = P08AR2_n867ParCodNom[0] ;
         A8481ParCodEst = P08AR2_A8481ParCodEst[0] ;
         n8481ParCodEst = P08AR2_n8481ParCodEst[0] ;
         A656ParCod = P08AR2_A656ParCod[0] ;
         A396EmprCod = P08AR2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08AR2_A867ParCodNom[0], A867ParCodNom) == 0 ) )
         {
            brk8AR2 = false ;
            A656ParCod = P08AR2_A656ParCod[0] ;
            A396EmprCod = P08AR2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8AR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
         {
            AV20Option = A867ParCodNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AR2 )
         {
            brk8AR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPARCODESTOPTIONS' Routine */
      returnInSub = false ;
      AV14TFParCodEst = AV16SearchTxt ;
      AV15TFParCodEst_Sel = "" ;
      AV50Tcodparwwds_1_filterfulltext = AV45FilterFullText ;
      AV51Tcodparwwds_2_tfparcod = AV10TFParCod ;
      AV52Tcodparwwds_3_tfparcod_to = AV11TFParCod_To ;
      AV53Tcodparwwds_4_tfparcodnom = AV12TFParCodNom ;
      AV54Tcodparwwds_5_tfparcodnom_sel = AV13TFParCodNom_Sel ;
      AV55Tcodparwwds_6_tfparcodest = AV14TFParCodEst ;
      AV56Tcodparwwds_7_tfparcodest_sel = AV15TFParCodEst_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Tcodparwwds_1_filterfulltext ,
                                           Short.valueOf(AV51Tcodparwwds_2_tfparcod) ,
                                           Short.valueOf(AV52Tcodparwwds_3_tfparcod_to) ,
                                           AV54Tcodparwwds_5_tfparcodnom_sel ,
                                           AV53Tcodparwwds_4_tfparcodnom ,
                                           AV56Tcodparwwds_7_tfparcodest_sel ,
                                           AV55Tcodparwwds_6_tfparcodest ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           A8481ParCodEst } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV50Tcodparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Tcodparwwds_1_filterfulltext), "%", "") ;
      lV50Tcodparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Tcodparwwds_1_filterfulltext), "%", "") ;
      lV50Tcodparwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Tcodparwwds_1_filterfulltext), "%", "") ;
      lV53Tcodparwwds_4_tfparcodnom = GXutil.padr( GXutil.rtrim( AV53Tcodparwwds_4_tfparcodnom), 30, "%") ;
      lV55Tcodparwwds_6_tfparcodest = GXutil.padr( GXutil.rtrim( AV55Tcodparwwds_6_tfparcodest), 1, "%") ;
      /* Using cursor P08AR3 */
      pr_default.execute(1, new Object[] {lV50Tcodparwwds_1_filterfulltext, lV50Tcodparwwds_1_filterfulltext, lV50Tcodparwwds_1_filterfulltext, Short.valueOf(AV51Tcodparwwds_2_tfparcod), Short.valueOf(AV52Tcodparwwds_3_tfparcod_to), lV53Tcodparwwds_4_tfparcodnom, AV54Tcodparwwds_5_tfparcodnom_sel, lV55Tcodparwwds_6_tfparcodest, AV56Tcodparwwds_7_tfparcodest_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8AR4 = false ;
         A8481ParCodEst = P08AR3_A8481ParCodEst[0] ;
         n8481ParCodEst = P08AR3_n8481ParCodEst[0] ;
         A867ParCodNom = P08AR3_A867ParCodNom[0] ;
         n867ParCodNom = P08AR3_n867ParCodNom[0] ;
         A656ParCod = P08AR3_A656ParCod[0] ;
         A396EmprCod = P08AR3_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08AR3_A8481ParCodEst[0], A8481ParCodEst) == 0 ) )
         {
            brk8AR4 = false ;
            A656ParCod = P08AR3_A656ParCod[0] ;
            A396EmprCod = P08AR3_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8AR4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A8481ParCodEst)==0) )
         {
            AV20Option = A8481ParCodEst ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A8481ParCodEst, "@!"))) ;
            AV21Options.add(AV20Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AR4 )
         {
            brk8AR4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tcodparwwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = tcodparwwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = tcodparwwgetfilterdata.this.AV27OptionIndexesJson;
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
      AV45FilterFullText = "" ;
      AV12TFParCodNom = "" ;
      AV13TFParCodNom_Sel = "" ;
      AV14TFParCodEst = "" ;
      AV15TFParCodEst_Sel = "" ;
      A867ParCodNom = "" ;
      AV50Tcodparwwds_1_filterfulltext = "" ;
      AV53Tcodparwwds_4_tfparcodnom = "" ;
      AV54Tcodparwwds_5_tfparcodnom_sel = "" ;
      AV55Tcodparwwds_6_tfparcodest = "" ;
      AV56Tcodparwwds_7_tfparcodest_sel = "" ;
      scmdbuf = "" ;
      lV50Tcodparwwds_1_filterfulltext = "" ;
      lV53Tcodparwwds_4_tfparcodnom = "" ;
      lV55Tcodparwwds_6_tfparcodest = "" ;
      A8481ParCodEst = "" ;
      P08AR2_A867ParCodNom = new String[] {""} ;
      P08AR2_n867ParCodNom = new boolean[] {false} ;
      P08AR2_A8481ParCodEst = new String[] {""} ;
      P08AR2_n8481ParCodEst = new boolean[] {false} ;
      P08AR2_A656ParCod = new short[1] ;
      P08AR2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      P08AR3_A8481ParCodEst = new String[] {""} ;
      P08AR3_n8481ParCodEst = new boolean[] {false} ;
      P08AR3_A867ParCodNom = new String[] {""} ;
      P08AR3_n867ParCodNom = new boolean[] {false} ;
      P08AR3_A656ParCod = new short[1] ;
      P08AR3_A396EmprCod = new String[] {""} ;
      AV23OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcodparwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08AR2_A867ParCodNom, P08AR2_n867ParCodNom, P08AR2_A8481ParCodEst, P08AR2_n8481ParCodEst, P08AR2_A656ParCod, P08AR2_A396EmprCod
            }
            , new Object[] {
            P08AR3_A8481ParCodEst, P08AR3_n8481ParCodEst, P08AR3_A867ParCodNom, P08AR3_n867ParCodNom, P08AR3_A656ParCod, P08AR3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFParCod ;
   private short AV11TFParCod_To ;
   private short AV51Tcodparwwds_2_tfparcod ;
   private short AV52Tcodparwwds_3_tfparcod_to ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private long AV28count ;
   private String AV12TFParCodNom ;
   private String AV13TFParCodNom_Sel ;
   private String AV14TFParCodEst ;
   private String AV15TFParCodEst_Sel ;
   private String A867ParCodNom ;
   private String AV53Tcodparwwds_4_tfparcodnom ;
   private String AV54Tcodparwwds_5_tfparcodnom_sel ;
   private String AV55Tcodparwwds_6_tfparcodest ;
   private String AV56Tcodparwwds_7_tfparcodest_sel ;
   private String scmdbuf ;
   private String lV53Tcodparwwds_4_tfparcodnom ;
   private String lV55Tcodparwwds_6_tfparcodest ;
   private String A8481ParCodEst ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8AR2 ;
   private boolean n867ParCodNom ;
   private boolean n8481ParCodEst ;
   private boolean brk8AR4 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV45FilterFullText ;
   private String AV50Tcodparwwds_1_filterfulltext ;
   private String lV50Tcodparwwds_1_filterfulltext ;
   private String AV20Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08AR2_A867ParCodNom ;
   private boolean[] P08AR2_n867ParCodNom ;
   private String[] P08AR2_A8481ParCodEst ;
   private boolean[] P08AR2_n8481ParCodEst ;
   private short[] P08AR2_A656ParCod ;
   private String[] P08AR2_A396EmprCod ;
   private String[] P08AR3_A8481ParCodEst ;
   private boolean[] P08AR3_n8481ParCodEst ;
   private String[] P08AR3_A867ParCodNom ;
   private boolean[] P08AR3_n867ParCodNom ;
   private short[] P08AR3_A656ParCod ;
   private String[] P08AR3_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tcodparwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Tcodparwwds_1_filterfulltext ,
                                          short AV51Tcodparwwds_2_tfparcod ,
                                          short AV52Tcodparwwds_3_tfparcod_to ,
                                          String AV54Tcodparwwds_5_tfparcodnom_sel ,
                                          String AV53Tcodparwwds_4_tfparcodnom ,
                                          String AV56Tcodparwwds_7_tfparcodest_sel ,
                                          String AV55Tcodparwwds_6_tfparcodest ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String A8481ParCodEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ParCodNom, ParCodEst, ParCod, EmprCod FROM TXPCODPAR" ;
      if ( ! (GXutil.strcmp("", AV50Tcodparwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ParCod,'9990'), 2) like '%' || ?) or ( UPPER(ParCodNom) like '%' || UPPER(?)) or ( UPPER(ParCodEst) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Tcodparwwds_2_tfparcod) )
      {
         addWhere(sWhereString, "(ParCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Tcodparwwds_3_tfparcod_to) )
      {
         addWhere(sWhereString, "(ParCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Tcodparwwds_5_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Tcodparwwds_4_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tcodparwwds_5_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(ParCodNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Tcodparwwds_7_tfparcodest_sel)==0) && ( ! (GXutil.strcmp("", AV55Tcodparwwds_6_tfparcodest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ParCodEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Tcodparwwds_7_tfparcodest_sel)==0) )
      {
         addWhere(sWhereString, "(ParCodEst = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ParCodNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08AR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Tcodparwwds_1_filterfulltext ,
                                          short AV51Tcodparwwds_2_tfparcod ,
                                          short AV52Tcodparwwds_3_tfparcod_to ,
                                          String AV54Tcodparwwds_5_tfparcodnom_sel ,
                                          String AV53Tcodparwwds_4_tfparcodnom ,
                                          String AV56Tcodparwwds_7_tfparcodest_sel ,
                                          String AV55Tcodparwwds_6_tfparcodest ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          String A8481ParCodEst )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ParCodEst, ParCodNom, ParCod, EmprCod FROM TXPCODPAR" ;
      if ( ! (GXutil.strcmp("", AV50Tcodparwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ParCod,'9990'), 2) like '%' || ?) or ( UPPER(ParCodNom) like '%' || UPPER(?)) or ( UPPER(ParCodEst) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV51Tcodparwwds_2_tfparcod) )
      {
         addWhere(sWhereString, "(ParCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Tcodparwwds_3_tfparcod_to) )
      {
         addWhere(sWhereString, "(ParCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Tcodparwwds_5_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV53Tcodparwwds_4_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Tcodparwwds_5_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(ParCodNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Tcodparwwds_7_tfparcodest_sel)==0) && ( ! (GXutil.strcmp("", AV55Tcodparwwds_6_tfparcodest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ParCodEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Tcodparwwds_7_tfparcodest_sel)==0) )
      {
         addWhere(sWhereString, "(ParCodEst = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ParCodEst" ;
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
                  return conditional_P08AR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P08AR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08AR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               return;
      }
   }

}

