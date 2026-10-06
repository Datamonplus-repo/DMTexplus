package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipmovwwgetfilterdata extends GXProcedure
{
   public ttipmovwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipmovwwgetfilterdata.class ), "" );
   }

   public ttipmovwwgetfilterdata( int remoteHandle ,
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
      ttipmovwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipmovwwgetfilterdata.this.AV16DDOName = aP0;
      ttipmovwwgetfilterdata.this.AV14SearchTxt = aP1;
      ttipmovwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttipmovwwgetfilterdata.this.aP3 = aP3;
      ttipmovwwgetfilterdata.this.aP4 = aP4;
      ttipmovwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TIPMOVCN") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMOVCNOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TIPMOVCC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPMOVCCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.TTIPMOVWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TTIPMOVWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.TTIPMOVWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN") == 0 )
         {
            AV12TFTipMovCn = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN_SEL") == 0 )
         {
            AV13TFTipMovCn_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV10TFTipMovCc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV11TFTipMovCc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPMOVCNOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipMovCn = AV14SearchTxt ;
      AV13TFTipMovCn_Sel = "" ;
      AV37Stocksquimicos_ttipmovwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn = AV12TFTipMovCn ;
      AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel = AV13TFTipMovCn_Sel ;
      AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc = AV10TFTipMovCc ;
      AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel = AV11TFTipMovCc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_ttipmovwwds_1_filterfulltext ,
                                           AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel ,
                                           AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn ,
                                           AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel ,
                                           AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc ,
                                           A3346TipMovCn ,
                                           A3345TipMovCc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV37Stocksquimicos_ttipmovwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipmovwwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_ttipmovwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipmovwwds_1_filterfulltext), "%", "") ;
      lV38Stocksquimicos_ttipmovwwds_2_tftipmovcn = GXutil.padr( GXutil.rtrim( AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn), 30, "%") ;
      lV40Stocksquimicos_ttipmovwwds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc), 2, "%") ;
      /* Using cursor P08PK2 */
      pr_default.execute(0, new Object[] {lV37Stocksquimicos_ttipmovwwds_1_filterfulltext, lV37Stocksquimicos_ttipmovwwds_1_filterfulltext, lV38Stocksquimicos_ttipmovwwds_2_tftipmovcn, AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel, lV40Stocksquimicos_ttipmovwwds_4_tftipmovcc, AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PK2 = false ;
         A3346TipMovCn = P08PK2_A3346TipMovCn[0] ;
         n3346TipMovCn = P08PK2_n3346TipMovCn[0] ;
         A3345TipMovCc = P08PK2_A3345TipMovCc[0] ;
         A396EmprCod = P08PK2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PK2_A3346TipMovCn[0], A3346TipMovCn) == 0 ) )
         {
            brk8PK2 = false ;
            A3345TipMovCc = P08PK2_A3345TipMovCc[0] ;
            A396EmprCod = P08PK2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8PK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3346TipMovCn)==0) )
         {
            AV18Option = A3346TipMovCn ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PK2 )
         {
            brk8PK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTIPMOVCCOPTIONS' Routine */
      returnInSub = false ;
      AV10TFTipMovCc = AV14SearchTxt ;
      AV11TFTipMovCc_Sel = "" ;
      AV37Stocksquimicos_ttipmovwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn = AV12TFTipMovCn ;
      AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel = AV13TFTipMovCn_Sel ;
      AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc = AV10TFTipMovCc ;
      AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel = AV11TFTipMovCc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_ttipmovwwds_1_filterfulltext ,
                                           AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel ,
                                           AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn ,
                                           AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel ,
                                           AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc ,
                                           A3346TipMovCn ,
                                           A3345TipMovCc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV37Stocksquimicos_ttipmovwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipmovwwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_ttipmovwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipmovwwds_1_filterfulltext), "%", "") ;
      lV38Stocksquimicos_ttipmovwwds_2_tftipmovcn = GXutil.padr( GXutil.rtrim( AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn), 30, "%") ;
      lV40Stocksquimicos_ttipmovwwds_4_tftipmovcc = GXutil.padr( GXutil.rtrim( AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc), 2, "%") ;
      /* Using cursor P08PK3 */
      pr_default.execute(1, new Object[] {lV37Stocksquimicos_ttipmovwwds_1_filterfulltext, lV37Stocksquimicos_ttipmovwwds_1_filterfulltext, lV38Stocksquimicos_ttipmovwwds_2_tftipmovcn, AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel, lV40Stocksquimicos_ttipmovwwds_4_tftipmovcc, AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PK4 = false ;
         A3345TipMovCc = P08PK3_A3345TipMovCc[0] ;
         A3346TipMovCn = P08PK3_A3346TipMovCn[0] ;
         n3346TipMovCn = P08PK3_n3346TipMovCn[0] ;
         A396EmprCod = P08PK3_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PK3_A3345TipMovCc[0], A3345TipMovCc) == 0 ) )
         {
            brk8PK4 = false ;
            A396EmprCod = P08PK3_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8PK4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A3345TipMovCc)==0) )
         {
            AV18Option = A3345TipMovCc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8PK4 )
         {
            brk8PK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipmovwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttipmovwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttipmovwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV32FilterFullText = "" ;
      AV12TFTipMovCn = "" ;
      AV13TFTipMovCn_Sel = "" ;
      AV10TFTipMovCc = "" ;
      AV11TFTipMovCc_Sel = "" ;
      A3346TipMovCn = "" ;
      AV37Stocksquimicos_ttipmovwwds_1_filterfulltext = "" ;
      AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn = "" ;
      AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel = "" ;
      AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc = "" ;
      AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel = "" ;
      scmdbuf = "" ;
      lV37Stocksquimicos_ttipmovwwds_1_filterfulltext = "" ;
      lV38Stocksquimicos_ttipmovwwds_2_tftipmovcn = "" ;
      lV40Stocksquimicos_ttipmovwwds_4_tftipmovcc = "" ;
      A3345TipMovCc = "" ;
      P08PK2_A3346TipMovCn = new String[] {""} ;
      P08PK2_n3346TipMovCn = new boolean[] {false} ;
      P08PK2_A3345TipMovCc = new String[] {""} ;
      P08PK2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P08PK3_A3345TipMovCc = new String[] {""} ;
      P08PK3_A3346TipMovCn = new String[] {""} ;
      P08PK3_n3346TipMovCn = new boolean[] {false} ;
      P08PK3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipmovwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PK2_A3346TipMovCn, P08PK2_n3346TipMovCn, P08PK2_A3345TipMovCc, P08PK2_A396EmprCod
            }
            , new Object[] {
            P08PK3_A3345TipMovCc, P08PK3_A3346TipMovCn, P08PK3_n3346TipMovCn, P08PK3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFTipMovCn ;
   private String AV13TFTipMovCn_Sel ;
   private String AV10TFTipMovCc ;
   private String AV11TFTipMovCc_Sel ;
   private String A3346TipMovCn ;
   private String AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn ;
   private String AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel ;
   private String AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc ;
   private String AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel ;
   private String scmdbuf ;
   private String lV38Stocksquimicos_ttipmovwwds_2_tftipmovcn ;
   private String lV40Stocksquimicos_ttipmovwwds_4_tftipmovcc ;
   private String A3345TipMovCc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8PK2 ;
   private boolean n3346TipMovCn ;
   private boolean brk8PK4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Stocksquimicos_ttipmovwwds_1_filterfulltext ;
   private String lV37Stocksquimicos_ttipmovwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08PK2_A3346TipMovCn ;
   private boolean[] P08PK2_n3346TipMovCn ;
   private String[] P08PK2_A3345TipMovCc ;
   private String[] P08PK2_A396EmprCod ;
   private String[] P08PK3_A3345TipMovCc ;
   private String[] P08PK3_A3346TipMovCn ;
   private boolean[] P08PK3_n3346TipMovCn ;
   private String[] P08PK3_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttipmovwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_ttipmovwwds_1_filterfulltext ,
                                          String AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel ,
                                          String AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn ,
                                          String AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel ,
                                          String AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc ,
                                          String A3346TipMovCn ,
                                          String A3345TipMovCc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipMovCn, TipMovCc, EmprCod FROM TXPTIPMOV" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_ttipmovwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipMovCn) like '%' || UPPER(?)) or ( UPPER(TipMovCc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCn = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipMovCn" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_ttipmovwwds_1_filterfulltext ,
                                          String AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel ,
                                          String AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn ,
                                          String AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel ,
                                          String AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc ,
                                          String A3346TipMovCn ,
                                          String A3345TipMovCc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT TipMovCc, TipMovCn, EmprCod FROM TXPTIPMOV" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_ttipmovwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipMovCn) like '%' || UPPER(?)) or ( UPPER(TipMovCc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV38Stocksquimicos_ttipmovwwds_2_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_ttipmovwwds_3_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCn = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV40Stocksquimicos_ttipmovwwds_4_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_ttipmovwwds_5_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(TipMovCc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipMovCc" ;
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
                  return conditional_P08PK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08PK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 2);
               }
               return;
      }
   }

}

