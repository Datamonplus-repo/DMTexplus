package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tnormaswwgetfilterdata extends GXProcedure
{
   public tnormaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnormaswwgetfilterdata.class ), "" );
   }

   public tnormaswwgetfilterdata( int remoteHandle ,
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
      tnormaswwgetfilterdata.this.aP5 = new String[] {""};
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
      tnormaswwgetfilterdata.this.AV16DDOName = aP0;
      tnormaswwgetfilterdata.this.AV14SearchTxt = aP1;
      tnormaswwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tnormaswwgetfilterdata.this.aP3 = aP3;
      tnormaswwgetfilterdata.this.aP4 = aP4;
      tnormaswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_NORMAID") == 0 )
      {
         /* Execute user subroutine: 'LOADNORMAIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_NORMADSC") == 0 )
      {
         /* Execute user subroutine: 'LOADNORMADSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TNORMASWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TNORMASWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TNORMASWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNORMAID") == 0 )
         {
            AV10TFNormaID = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNORMAID_SEL") == 0 )
         {
            AV11TFNormaID_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNORMADSC") == 0 )
         {
            AV12TFNormaDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNORMADSC_SEL") == 0 )
         {
            AV13TFNormaDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADNORMAIDOPTIONS' Routine */
      returnInSub = false ;
      AV10TFNormaID = AV14SearchTxt ;
      AV11TFNormaID_Sel = "" ;
      AV51Tnormaswwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tnormaswwds_2_tfnormaid = AV10TFNormaID ;
      AV53Tnormaswwds_3_tfnormaid_sel = AV11TFNormaID_Sel ;
      AV54Tnormaswwds_4_tfnormadsc = AV12TFNormaDsc ;
      AV55Tnormaswwds_5_tfnormadsc_sel = AV13TFNormaDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Tnormaswwds_1_filterfulltext ,
                                           AV53Tnormaswwds_3_tfnormaid_sel ,
                                           AV52Tnormaswwds_2_tfnormaid ,
                                           AV55Tnormaswwds_5_tfnormadsc_sel ,
                                           AV54Tnormaswwds_4_tfnormadsc ,
                                           A13217NormaID ,
                                           A13218NormaDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV51Tnormaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tnormaswwds_1_filterfulltext), "%", "") ;
      lV51Tnormaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tnormaswwds_1_filterfulltext), "%", "") ;
      lV52Tnormaswwds_2_tfnormaid = GXutil.padr( GXutil.rtrim( AV52Tnormaswwds_2_tfnormaid), 4, "%") ;
      lV54Tnormaswwds_4_tfnormadsc = GXutil.padr( GXutil.rtrim( AV54Tnormaswwds_4_tfnormadsc), 60, "%") ;
      /* Using cursor P07YV2 */
      pr_default.execute(0, new Object[] {lV51Tnormaswwds_1_filterfulltext, lV51Tnormaswwds_1_filterfulltext, lV52Tnormaswwds_2_tfnormaid, AV53Tnormaswwds_3_tfnormaid_sel, lV54Tnormaswwds_4_tfnormadsc, AV55Tnormaswwds_5_tfnormadsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7YV2 = false ;
         A13217NormaID = P07YV2_A13217NormaID[0] ;
         A13218NormaDsc = P07YV2_A13218NormaDsc[0] ;
         n13218NormaDsc = P07YV2_n13218NormaDsc[0] ;
         A396EmprCod = P07YV2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07YV2_A13217NormaID[0], A13217NormaID) == 0 ) )
         {
            brk7YV2 = false ;
            A396EmprCod = P07YV2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk7YV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13217NormaID)==0) )
         {
            AV18Option = A13217NormaID ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7YV2 )
         {
            brk7YV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADNORMADSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFNormaDsc = AV14SearchTxt ;
      AV13TFNormaDsc_Sel = "" ;
      AV51Tnormaswwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tnormaswwds_2_tfnormaid = AV10TFNormaID ;
      AV53Tnormaswwds_3_tfnormaid_sel = AV11TFNormaID_Sel ;
      AV54Tnormaswwds_4_tfnormadsc = AV12TFNormaDsc ;
      AV55Tnormaswwds_5_tfnormadsc_sel = AV13TFNormaDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Tnormaswwds_1_filterfulltext ,
                                           AV53Tnormaswwds_3_tfnormaid_sel ,
                                           AV52Tnormaswwds_2_tfnormaid ,
                                           AV55Tnormaswwds_5_tfnormadsc_sel ,
                                           AV54Tnormaswwds_4_tfnormadsc ,
                                           A13217NormaID ,
                                           A13218NormaDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV51Tnormaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tnormaswwds_1_filterfulltext), "%", "") ;
      lV51Tnormaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tnormaswwds_1_filterfulltext), "%", "") ;
      lV52Tnormaswwds_2_tfnormaid = GXutil.padr( GXutil.rtrim( AV52Tnormaswwds_2_tfnormaid), 4, "%") ;
      lV54Tnormaswwds_4_tfnormadsc = GXutil.padr( GXutil.rtrim( AV54Tnormaswwds_4_tfnormadsc), 60, "%") ;
      /* Using cursor P07YV3 */
      pr_default.execute(1, new Object[] {lV51Tnormaswwds_1_filterfulltext, lV51Tnormaswwds_1_filterfulltext, lV52Tnormaswwds_2_tfnormaid, AV53Tnormaswwds_3_tfnormaid_sel, lV54Tnormaswwds_4_tfnormadsc, AV55Tnormaswwds_5_tfnormadsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk7YV4 = false ;
         A13218NormaDsc = P07YV3_A13218NormaDsc[0] ;
         n13218NormaDsc = P07YV3_n13218NormaDsc[0] ;
         A13217NormaID = P07YV3_A13217NormaID[0] ;
         A396EmprCod = P07YV3_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P07YV3_A13218NormaDsc[0], A13218NormaDsc) == 0 ) )
         {
            brk7YV4 = false ;
            A13217NormaID = P07YV3_A13217NormaID[0] ;
            A396EmprCod = P07YV3_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk7YV4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13218NormaDsc)==0) )
         {
            AV18Option = A13218NormaDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7YV4 )
         {
            brk7YV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tnormaswwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tnormaswwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tnormaswwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFNormaID = "" ;
      AV11TFNormaID_Sel = "" ;
      AV12TFNormaDsc = "" ;
      AV13TFNormaDsc_Sel = "" ;
      A13217NormaID = "" ;
      AV51Tnormaswwds_1_filterfulltext = "" ;
      AV52Tnormaswwds_2_tfnormaid = "" ;
      AV53Tnormaswwds_3_tfnormaid_sel = "" ;
      AV54Tnormaswwds_4_tfnormadsc = "" ;
      AV55Tnormaswwds_5_tfnormadsc_sel = "" ;
      scmdbuf = "" ;
      lV51Tnormaswwds_1_filterfulltext = "" ;
      lV52Tnormaswwds_2_tfnormaid = "" ;
      lV54Tnormaswwds_4_tfnormadsc = "" ;
      A13218NormaDsc = "" ;
      P07YV2_A13217NormaID = new String[] {""} ;
      P07YV2_A13218NormaDsc = new String[] {""} ;
      P07YV2_n13218NormaDsc = new boolean[] {false} ;
      P07YV2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P07YV3_A13218NormaDsc = new String[] {""} ;
      P07YV3_n13218NormaDsc = new boolean[] {false} ;
      P07YV3_A13217NormaID = new String[] {""} ;
      P07YV3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnormaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07YV2_A13217NormaID, P07YV2_A13218NormaDsc, P07YV2_n13218NormaDsc, P07YV2_A396EmprCod
            }
            , new Object[] {
            P07YV3_A13218NormaDsc, P07YV3_n13218NormaDsc, P07YV3_A13217NormaID, P07YV3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV49GXV1 ;
   private long AV26count ;
   private String AV10TFNormaID ;
   private String AV11TFNormaID_Sel ;
   private String AV12TFNormaDsc ;
   private String AV13TFNormaDsc_Sel ;
   private String A13217NormaID ;
   private String AV52Tnormaswwds_2_tfnormaid ;
   private String AV53Tnormaswwds_3_tfnormaid_sel ;
   private String AV54Tnormaswwds_4_tfnormadsc ;
   private String AV55Tnormaswwds_5_tfnormadsc_sel ;
   private String scmdbuf ;
   private String lV52Tnormaswwds_2_tfnormaid ;
   private String lV54Tnormaswwds_4_tfnormadsc ;
   private String A13218NormaDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk7YV2 ;
   private boolean n13218NormaDsc ;
   private boolean brk7YV4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Tnormaswwds_1_filterfulltext ;
   private String lV51Tnormaswwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07YV2_A13217NormaID ;
   private String[] P07YV2_A13218NormaDsc ;
   private boolean[] P07YV2_n13218NormaDsc ;
   private String[] P07YV2_A396EmprCod ;
   private String[] P07YV3_A13218NormaDsc ;
   private boolean[] P07YV3_n13218NormaDsc ;
   private String[] P07YV3_A13217NormaID ;
   private String[] P07YV3_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tnormaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07YV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tnormaswwds_1_filterfulltext ,
                                          String AV53Tnormaswwds_3_tfnormaid_sel ,
                                          String AV52Tnormaswwds_2_tfnormaid ,
                                          String AV55Tnormaswwds_5_tfnormadsc_sel ,
                                          String AV54Tnormaswwds_4_tfnormadsc ,
                                          String A13217NormaID ,
                                          String A13218NormaDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT NormaID, NormaDsc, EmprCod FROM TXPNORMAS" ;
      if ( ! (GXutil.strcmp("", AV51Tnormaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(NormaID) like '%' || UPPER(?)) or ( UPPER(NormaDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tnormaswwds_3_tfnormaid_sel)==0) && ( ! (GXutil.strcmp("", AV52Tnormaswwds_2_tfnormaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(NormaID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tnormaswwds_3_tfnormaid_sel)==0) )
      {
         addWhere(sWhereString, "(NormaID = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tnormaswwds_5_tfnormadsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Tnormaswwds_4_tfnormadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(NormaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tnormaswwds_5_tfnormadsc_sel)==0) )
      {
         addWhere(sWhereString, "(NormaDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY NormaID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P07YV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tnormaswwds_1_filterfulltext ,
                                          String AV53Tnormaswwds_3_tfnormaid_sel ,
                                          String AV52Tnormaswwds_2_tfnormaid ,
                                          String AV55Tnormaswwds_5_tfnormadsc_sel ,
                                          String AV54Tnormaswwds_4_tfnormadsc ,
                                          String A13217NormaID ,
                                          String A13218NormaDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT NormaDsc, NormaID, EmprCod FROM TXPNORMAS" ;
      if ( ! (GXutil.strcmp("", AV51Tnormaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(NormaID) like '%' || UPPER(?)) or ( UPPER(NormaDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tnormaswwds_3_tfnormaid_sel)==0) && ( ! (GXutil.strcmp("", AV52Tnormaswwds_2_tfnormaid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(NormaID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tnormaswwds_3_tfnormaid_sel)==0) )
      {
         addWhere(sWhereString, "(NormaID = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Tnormaswwds_5_tfnormadsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Tnormaswwds_4_tfnormadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(NormaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Tnormaswwds_5_tfnormadsc_sel)==0) )
      {
         addWhere(sWhereString, "(NormaDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY NormaDsc" ;
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
                  return conditional_P07YV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P07YV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07YV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07YV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
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
                  stmt.setString(sIdx, (String)parms[8], 4);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 60);
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
                  stmt.setString(sIdx, (String)parms[8], 4);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 4);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 60);
               }
               return;
      }
   }

}

