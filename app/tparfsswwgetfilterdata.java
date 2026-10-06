package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tparfsswwgetfilterdata extends GXProcedure
{
   public tparfsswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparfsswwgetfilterdata.class ), "" );
   }

   public tparfsswwgetfilterdata( int remoteHandle ,
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
      tparfsswwgetfilterdata.this.aP5 = new String[] {""};
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
      tparfsswwgetfilterdata.this.AV16DDOName = aP0;
      tparfsswwgetfilterdata.this.AV14SearchTxt = aP1;
      tparfsswwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tparfsswwgetfilterdata.this.aP3 = aP3;
      tparfsswwgetfilterdata.this.aP4 = aP4;
      tparfsswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TPARFSSWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPARFSSWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TPARFSSWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV10TFFasCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV11TFFasCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV12TFFasDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV13TFFasDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFFasCod = AV14SearchTxt ;
      AV11TFFasCod_Sel = "" ;
      AV37Tparfsswwds_1_filterfulltext = AV32FilterFullText ;
      AV38Tparfsswwds_2_tffascod = AV10TFFasCod ;
      AV39Tparfsswwds_3_tffascod_sel = AV11TFFasCod_Sel ;
      AV40Tparfsswwds_4_tffasdsc = AV12TFFasDsc ;
      AV41Tparfsswwds_5_tffasdsc_sel = AV13TFFasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Tparfsswwds_1_filterfulltext ,
                                           AV39Tparfsswwds_3_tffascod_sel ,
                                           AV38Tparfsswwds_2_tffascod ,
                                           AV41Tparfsswwds_5_tffasdsc_sel ,
                                           AV40Tparfsswwds_4_tffasdsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV37Tparfsswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tparfsswwds_1_filterfulltext), "%", "") ;
      lV37Tparfsswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tparfsswwds_1_filterfulltext), "%", "") ;
      lV38Tparfsswwds_2_tffascod = GXutil.padr( GXutil.rtrim( AV38Tparfsswwds_2_tffascod), 8, "%") ;
      lV40Tparfsswwds_4_tffasdsc = GXutil.padr( GXutil.rtrim( AV40Tparfsswwds_4_tffasdsc), 28, "%") ;
      /* Using cursor P08UQ2 */
      pr_default.execute(0, new Object[] {lV37Tparfsswwds_1_filterfulltext, lV37Tparfsswwds_1_filterfulltext, lV38Tparfsswwds_2_tffascod, AV39Tparfsswwds_3_tffascod_sel, lV40Tparfsswwds_4_tffasdsc, AV41Tparfsswwds_5_tffasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8UQ2 = false ;
         A457FasCod = P08UQ2_A457FasCod[0] ;
         A460FasDsc = P08UQ2_A460FasDsc[0] ;
         A396EmprCod = P08UQ2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08UQ2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brk8UQ2 = false ;
            A396EmprCod = P08UQ2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8UQ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV18Option = A457FasCod ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8UQ2 )
         {
            brk8UQ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFasDsc = AV14SearchTxt ;
      AV13TFFasDsc_Sel = "" ;
      AV37Tparfsswwds_1_filterfulltext = AV32FilterFullText ;
      AV38Tparfsswwds_2_tffascod = AV10TFFasCod ;
      AV39Tparfsswwds_3_tffascod_sel = AV11TFFasCod_Sel ;
      AV40Tparfsswwds_4_tffasdsc = AV12TFFasDsc ;
      AV41Tparfsswwds_5_tffasdsc_sel = AV13TFFasDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Tparfsswwds_1_filterfulltext ,
                                           AV39Tparfsswwds_3_tffascod_sel ,
                                           AV38Tparfsswwds_2_tffascod ,
                                           AV41Tparfsswwds_5_tffasdsc_sel ,
                                           AV40Tparfsswwds_4_tffasdsc ,
                                           A457FasCod ,
                                           A460FasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV37Tparfsswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tparfsswwds_1_filterfulltext), "%", "") ;
      lV37Tparfsswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tparfsswwds_1_filterfulltext), "%", "") ;
      lV38Tparfsswwds_2_tffascod = GXutil.padr( GXutil.rtrim( AV38Tparfsswwds_2_tffascod), 8, "%") ;
      lV40Tparfsswwds_4_tffasdsc = GXutil.padr( GXutil.rtrim( AV40Tparfsswwds_4_tffasdsc), 28, "%") ;
      /* Using cursor P08UQ3 */
      pr_default.execute(1, new Object[] {lV37Tparfsswwds_1_filterfulltext, lV37Tparfsswwds_1_filterfulltext, lV38Tparfsswwds_2_tffascod, AV39Tparfsswwds_3_tffascod_sel, lV40Tparfsswwds_4_tffasdsc, AV41Tparfsswwds_5_tffasdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8UQ4 = false ;
         A460FasDsc = P08UQ3_A460FasDsc[0] ;
         A457FasCod = P08UQ3_A457FasCod[0] ;
         A396EmprCod = P08UQ3_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08UQ3_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brk8UQ4 = false ;
            A457FasCod = P08UQ3_A457FasCod[0] ;
            A396EmprCod = P08UQ3_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8UQ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV18Option = A460FasDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8UQ4 )
         {
            brk8UQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tparfsswwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tparfsswwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tparfsswwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFFasCod = "" ;
      AV11TFFasCod_Sel = "" ;
      AV12TFFasDsc = "" ;
      AV13TFFasDsc_Sel = "" ;
      A457FasCod = "" ;
      AV37Tparfsswwds_1_filterfulltext = "" ;
      AV38Tparfsswwds_2_tffascod = "" ;
      AV39Tparfsswwds_3_tffascod_sel = "" ;
      AV40Tparfsswwds_4_tffasdsc = "" ;
      AV41Tparfsswwds_5_tffasdsc_sel = "" ;
      scmdbuf = "" ;
      lV37Tparfsswwds_1_filterfulltext = "" ;
      lV38Tparfsswwds_2_tffascod = "" ;
      lV40Tparfsswwds_4_tffasdsc = "" ;
      A460FasDsc = "" ;
      P08UQ2_A457FasCod = new String[] {""} ;
      P08UQ2_A460FasDsc = new String[] {""} ;
      P08UQ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      AV21OptionDesc = "" ;
      P08UQ3_A460FasDsc = new String[] {""} ;
      P08UQ3_A457FasCod = new String[] {""} ;
      P08UQ3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tparfsswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08UQ2_A457FasCod, P08UQ2_A460FasDsc, P08UQ2_A396EmprCod
            }
            , new Object[] {
            P08UQ3_A460FasDsc, P08UQ3_A457FasCod, P08UQ3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV10TFFasCod ;
   private String AV11TFFasCod_Sel ;
   private String AV12TFFasDsc ;
   private String AV13TFFasDsc_Sel ;
   private String A457FasCod ;
   private String AV38Tparfsswwds_2_tffascod ;
   private String AV39Tparfsswwds_3_tffascod_sel ;
   private String AV40Tparfsswwds_4_tffasdsc ;
   private String AV41Tparfsswwds_5_tffasdsc_sel ;
   private String scmdbuf ;
   private String lV38Tparfsswwds_2_tffascod ;
   private String lV40Tparfsswwds_4_tffasdsc ;
   private String A460FasDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8UQ2 ;
   private boolean brk8UQ4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Tparfsswwds_1_filterfulltext ;
   private String lV37Tparfsswwds_1_filterfulltext ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08UQ2_A457FasCod ;
   private String[] P08UQ2_A460FasDsc ;
   private String[] P08UQ2_A396EmprCod ;
   private String[] P08UQ3_A460FasDsc ;
   private String[] P08UQ3_A457FasCod ;
   private String[] P08UQ3_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tparfsswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08UQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Tparfsswwds_1_filterfulltext ,
                                          String AV39Tparfsswwds_3_tffascod_sel ,
                                          String AV38Tparfsswwds_2_tffascod ,
                                          String AV41Tparfsswwds_5_tffasdsc_sel ,
                                          String AV40Tparfsswwds_4_tffasdsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT FasCod, FasDsc, EmprCod FROM TXPFASPRO" ;
      if ( ! (GXutil.strcmp("", AV37Tparfsswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(FasCod) like '%' || UPPER(?)) or ( UPPER(FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Tparfsswwds_3_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV38Tparfsswwds_2_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Tparfsswwds_3_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(FasCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Tparfsswwds_5_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Tparfsswwds_4_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Tparfsswwds_5_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FasDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08UQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Tparfsswwds_1_filterfulltext ,
                                          String AV39Tparfsswwds_3_tffascod_sel ,
                                          String AV38Tparfsswwds_2_tffascod ,
                                          String AV41Tparfsswwds_5_tffasdsc_sel ,
                                          String AV40Tparfsswwds_4_tffasdsc ,
                                          String A457FasCod ,
                                          String A460FasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT FasDsc, FasCod, EmprCod FROM TXPFASPRO" ;
      if ( ! (GXutil.strcmp("", AV37Tparfsswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(FasCod) like '%' || UPPER(?)) or ( UPPER(FasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Tparfsswwds_3_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV38Tparfsswwds_2_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Tparfsswwds_3_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(FasCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Tparfsswwds_5_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Tparfsswwds_4_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Tparfsswwds_5_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FasDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FasDsc" ;
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
                  return conditional_P08UQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08UQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08UQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08UQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 28);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 28);
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
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 28);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 28);
               }
               return;
      }
   }

}

