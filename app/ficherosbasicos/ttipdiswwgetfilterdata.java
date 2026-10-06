package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipdiswwgetfilterdata extends GXProcedure
{
   public ttipdiswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipdiswwgetfilterdata.class ), "" );
   }

   public ttipdiswwgetfilterdata( int remoteHandle ,
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
      ttipdiswwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipdiswwgetfilterdata.this.AV16DDOName = aP0;
      ttipdiswwgetfilterdata.this.AV14SearchTxt = aP1;
      ttipdiswwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttipdiswwgetfilterdata.this.aP3 = aP3;
      ttipdiswwgetfilterdata.this.aP4 = aP4;
      ttipdiswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TIPDISCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPDISCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TIPDISDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPDISDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TTIPDISWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTIPDISWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TTIPDISWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDISCOD") == 0 )
         {
            AV10TFTipDisCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDISCOD_SEL") == 0 )
         {
            AV11TFTipDisCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDISDSC") == 0 )
         {
            AV12TFTipDisDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDISDSC_SEL") == 0 )
         {
            AV13TFTipDisDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPDISCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFTipDisCod = AV14SearchTxt ;
      AV11TFTipDisCod_Sel = "" ;
      AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = AV46FilterFullText ;
      AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod = AV10TFTipDisCod ;
      AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel = AV11TFTipDisCod_Sel ;
      AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc = AV12TFTipDisDsc ;
      AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel = AV13TFTipDisDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext ,
                                           AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel ,
                                           AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod ,
                                           AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel ,
                                           AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc ,
                                           A5098TipDisCod ,
                                           A5097TipDisDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext), "%", "") ;
      lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext), "%", "") ;
      lV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod = GXutil.padr( GXutil.rtrim( AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod), 1, "%") ;
      lV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc), 30, "%") ;
      /* Using cursor P08132 */
      pr_default.execute(0, new Object[] {lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext, lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext, lV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod, AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel, lV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc, AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8132 = false ;
         A5098TipDisCod = P08132_A5098TipDisCod[0] ;
         A5097TipDisDsc = P08132_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P08132_n5097TipDisDsc[0] ;
         A396EmprCod = P08132_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08132_A5098TipDisCod[0], A5098TipDisCod) == 0 ) )
         {
            brk8132 = false ;
            A396EmprCod = P08132_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8132 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5098TipDisCod)==0) )
         {
            AV18Option = A5098TipDisCod ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8132 )
         {
            brk8132 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTIPDISDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipDisDsc = AV14SearchTxt ;
      AV13TFTipDisDsc_Sel = "" ;
      AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = AV46FilterFullText ;
      AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod = AV10TFTipDisCod ;
      AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel = AV11TFTipDisCod_Sel ;
      AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc = AV12TFTipDisDsc ;
      AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel = AV13TFTipDisDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext ,
                                           AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel ,
                                           AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod ,
                                           AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel ,
                                           AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc ,
                                           A5098TipDisCod ,
                                           A5097TipDisDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext), "%", "") ;
      lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext), "%", "") ;
      lV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod = GXutil.padr( GXutil.rtrim( AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod), 1, "%") ;
      lV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc), 30, "%") ;
      /* Using cursor P08133 */
      pr_default.execute(1, new Object[] {lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext, lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext, lV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod, AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel, lV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc, AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8134 = false ;
         A5097TipDisDsc = P08133_A5097TipDisDsc[0] ;
         n5097TipDisDsc = P08133_n5097TipDisDsc[0] ;
         A5098TipDisCod = P08133_A5098TipDisCod[0] ;
         A396EmprCod = P08133_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08133_A5097TipDisDsc[0], A5097TipDisDsc) == 0 ) )
         {
            brk8134 = false ;
            A5098TipDisCod = P08133_A5098TipDisCod[0] ;
            A396EmprCod = P08133_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8134 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5097TipDisDsc)==0) )
         {
            AV18Option = A5097TipDisDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8134 )
         {
            brk8134 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipdiswwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttipdiswwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttipdiswwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV10TFTipDisCod = "" ;
      AV11TFTipDisCod_Sel = "" ;
      AV12TFTipDisDsc = "" ;
      AV13TFTipDisDsc_Sel = "" ;
      A5098TipDisCod = "" ;
      AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = "" ;
      AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod = "" ;
      AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel = "" ;
      AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc = "" ;
      AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel = "" ;
      scmdbuf = "" ;
      lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext = "" ;
      lV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod = "" ;
      lV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc = "" ;
      A5097TipDisDsc = "" ;
      P08132_A5098TipDisCod = new String[] {""} ;
      P08132_A5097TipDisDsc = new String[] {""} ;
      P08132_n5097TipDisDsc = new boolean[] {false} ;
      P08132_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P08133_A5097TipDisDsc = new String[] {""} ;
      P08133_n5097TipDisDsc = new boolean[] {false} ;
      P08133_A5098TipDisCod = new String[] {""} ;
      P08133_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipdiswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08132_A5098TipDisCod, P08132_A5097TipDisDsc, P08132_n5097TipDisDsc, P08132_A396EmprCod
            }
            , new Object[] {
            P08133_A5097TipDisDsc, P08133_n5097TipDisDsc, P08133_A5098TipDisCod, P08133_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV49GXV1 ;
   private long AV26count ;
   private String AV10TFTipDisCod ;
   private String AV11TFTipDisCod_Sel ;
   private String AV12TFTipDisDsc ;
   private String AV13TFTipDisDsc_Sel ;
   private String A5098TipDisCod ;
   private String AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod ;
   private String AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel ;
   private String AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc ;
   private String AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel ;
   private String scmdbuf ;
   private String lV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod ;
   private String lV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc ;
   private String A5097TipDisDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8132 ;
   private boolean n5097TipDisDsc ;
   private boolean brk8134 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext ;
   private String lV51Ficherosbasicos_ttipdiswwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08132_A5098TipDisCod ;
   private String[] P08132_A5097TipDisDsc ;
   private boolean[] P08132_n5097TipDisDsc ;
   private String[] P08132_A396EmprCod ;
   private String[] P08133_A5097TipDisDsc ;
   private boolean[] P08133_n5097TipDisDsc ;
   private String[] P08133_A5098TipDisCod ;
   private String[] P08133_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttipdiswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08132( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext ,
                                          String AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel ,
                                          String AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod ,
                                          String AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel ,
                                          String AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc ,
                                          String A5098TipDisCod ,
                                          String A5097TipDisDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipDisCod, TipDisDsc, EmprCod FROM TXPTIPDIS" ;
      if ( ! (GXutil.strcmp("", AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipDisCod) like '%' || UPPER(?)) or ( UPPER(TipDisDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel)==0) && ( ! (GXutil.strcmp("", AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDisCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel)==0) )
      {
         addWhere(sWhereString, "(TipDisCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDisDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipDisDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipDisCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08133( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext ,
                                          String AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel ,
                                          String AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod ,
                                          String AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel ,
                                          String AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc ,
                                          String A5098TipDisCod ,
                                          String A5097TipDisDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT TipDisDsc, TipDisCod, EmprCod FROM TXPTIPDIS" ;
      if ( ! (GXutil.strcmp("", AV51Ficherosbasicos_ttipdiswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipDisCod) like '%' || UPPER(?)) or ( UPPER(TipDisDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel)==0) && ( ! (GXutil.strcmp("", AV52Ficherosbasicos_ttipdiswwds_2_tftipdiscod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDisCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_ttipdiswwds_3_tftipdiscod_sel)==0) )
      {
         addWhere(sWhereString, "(TipDisCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_ttipdiswwds_4_tftipdisdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDisDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_ttipdiswwds_5_tftipdisdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipDisDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipDisDsc" ;
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
                  return conditional_P08132(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08133(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08132", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08133", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
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
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
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
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               return;
      }
   }

}

