package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tforpagwwgetfilterdata extends GXProcedure
{
   public tforpagwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforpagwwgetfilterdata.class ), "" );
   }

   public tforpagwwgetfilterdata( int remoteHandle ,
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
      tforpagwwgetfilterdata.this.aP5 = new String[] {""};
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
      tforpagwwgetfilterdata.this.AV18DDOName = aP0;
      tforpagwwgetfilterdata.this.AV16SearchTxt = aP1;
      tforpagwwgetfilterdata.this.AV17SearchTxtTo = aP2;
      tforpagwwgetfilterdata.this.aP3 = aP3;
      tforpagwwgetfilterdata.this.aP4 = aP4;
      tforpagwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_FPGCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFPGCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_FPGDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFPGDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("FicherosBasicos.TFORPAGWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TFORPAGWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FicherosBasicos.TFORPAGWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV10TFFpgCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV11TFFpgCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC") == 0 )
         {
            AV12TFFpgDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC_SEL") == 0 )
         {
            AV13TFFpgDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFPGCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFFpgCod = AV16SearchTxt ;
      AV11TFFpgCod_Sel = "" ;
      AV53Ficherosbasicos_tforpagwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Ficherosbasicos_tforpagwwds_2_tffpgcod = AV10TFFpgCod ;
      AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel = AV11TFFpgCod_Sel ;
      AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc = AV12TFFpgDsc ;
      AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel = AV13TFFpgDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Ficherosbasicos_tforpagwwds_1_filterfulltext ,
                                           AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel ,
                                           AV54Ficherosbasicos_tforpagwwds_2_tffpgcod ,
                                           AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel ,
                                           AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc ,
                                           A497FpgCod ,
                                           A498FpgDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV53Ficherosbasicos_tforpagwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_tforpagwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_tforpagwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_tforpagwwds_1_filterfulltext), "%", "") ;
      lV54Ficherosbasicos_tforpagwwds_2_tffpgcod = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_tforpagwwds_2_tffpgcod), 2, "%") ;
      lV56Ficherosbasicos_tforpagwwds_4_tffpgdsc = GXutil.padr( GXutil.rtrim( AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc), 30, "%") ;
      /* Using cursor P08072 */
      pr_default.execute(0, new Object[] {lV53Ficherosbasicos_tforpagwwds_1_filterfulltext, lV53Ficherosbasicos_tforpagwwds_1_filterfulltext, lV54Ficherosbasicos_tforpagwwds_2_tffpgcod, AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel, lV56Ficherosbasicos_tforpagwwds_4_tffpgdsc, AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8072 = false ;
         A497FpgCod = P08072_A497FpgCod[0] ;
         A498FpgDsc = P08072_A498FpgDsc[0] ;
         n498FpgDsc = P08072_n498FpgDsc[0] ;
         A396EmprCod = P08072_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08072_A497FpgCod[0], A497FpgCod) == 0 ) )
         {
            brk8072 = false ;
            A396EmprCod = P08072_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8072 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A497FpgCod)==0) )
         {
            AV20Option = A497FpgCod ;
            AV23OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A497FpgCod, "@!"))) ;
            AV21Options.add(AV20Option, 0);
            AV24OptionsDesc.add(AV23OptionDesc, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8072 )
         {
            brk8072 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFPGDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFFpgDsc = AV16SearchTxt ;
      AV13TFFpgDsc_Sel = "" ;
      AV53Ficherosbasicos_tforpagwwds_1_filterfulltext = AV48FilterFullText ;
      AV54Ficherosbasicos_tforpagwwds_2_tffpgcod = AV10TFFpgCod ;
      AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel = AV11TFFpgCod_Sel ;
      AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc = AV12TFFpgDsc ;
      AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel = AV13TFFpgDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Ficherosbasicos_tforpagwwds_1_filterfulltext ,
                                           AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel ,
                                           AV54Ficherosbasicos_tforpagwwds_2_tffpgcod ,
                                           AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel ,
                                           AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc ,
                                           A497FpgCod ,
                                           A498FpgDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV53Ficherosbasicos_tforpagwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_tforpagwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_tforpagwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_tforpagwwds_1_filterfulltext), "%", "") ;
      lV54Ficherosbasicos_tforpagwwds_2_tffpgcod = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_tforpagwwds_2_tffpgcod), 2, "%") ;
      lV56Ficherosbasicos_tforpagwwds_4_tffpgdsc = GXutil.padr( GXutil.rtrim( AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc), 30, "%") ;
      /* Using cursor P08073 */
      pr_default.execute(1, new Object[] {lV53Ficherosbasicos_tforpagwwds_1_filterfulltext, lV53Ficherosbasicos_tforpagwwds_1_filterfulltext, lV54Ficherosbasicos_tforpagwwds_2_tffpgcod, AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel, lV56Ficherosbasicos_tforpagwwds_4_tffpgdsc, AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8074 = false ;
         A498FpgDsc = P08073_A498FpgDsc[0] ;
         n498FpgDsc = P08073_n498FpgDsc[0] ;
         A497FpgCod = P08073_A497FpgCod[0] ;
         A396EmprCod = P08073_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08073_A498FpgDsc[0], A498FpgDsc) == 0 ) )
         {
            brk8074 = false ;
            A497FpgCod = P08073_A497FpgCod[0] ;
            A396EmprCod = P08073_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8074 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A498FpgDsc)==0) )
         {
            AV20Option = A498FpgDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8074 )
         {
            brk8074 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tforpagwwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = tforpagwwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = tforpagwwgetfilterdata.this.AV27OptionIndexesJson;
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
      AV48FilterFullText = "" ;
      AV10TFFpgCod = "" ;
      AV11TFFpgCod_Sel = "" ;
      AV12TFFpgDsc = "" ;
      AV13TFFpgDsc_Sel = "" ;
      A497FpgCod = "" ;
      AV53Ficherosbasicos_tforpagwwds_1_filterfulltext = "" ;
      AV54Ficherosbasicos_tforpagwwds_2_tffpgcod = "" ;
      AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel = "" ;
      AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc = "" ;
      AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel = "" ;
      scmdbuf = "" ;
      lV53Ficherosbasicos_tforpagwwds_1_filterfulltext = "" ;
      lV54Ficherosbasicos_tforpagwwds_2_tffpgcod = "" ;
      lV56Ficherosbasicos_tforpagwwds_4_tffpgdsc = "" ;
      A498FpgDsc = "" ;
      P08072_A497FpgCod = new String[] {""} ;
      P08072_A498FpgDsc = new String[] {""} ;
      P08072_n498FpgDsc = new boolean[] {false} ;
      P08072_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      AV23OptionDesc = "" ;
      P08073_A498FpgDsc = new String[] {""} ;
      P08073_n498FpgDsc = new boolean[] {false} ;
      P08073_A497FpgCod = new String[] {""} ;
      P08073_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tforpagwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08072_A497FpgCod, P08072_A498FpgDsc, P08072_n498FpgDsc, P08072_A396EmprCod
            }
            , new Object[] {
            P08073_A498FpgDsc, P08073_n498FpgDsc, P08073_A497FpgCod, P08073_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV51GXV1 ;
   private long AV28count ;
   private String AV10TFFpgCod ;
   private String AV11TFFpgCod_Sel ;
   private String AV12TFFpgDsc ;
   private String AV13TFFpgDsc_Sel ;
   private String A497FpgCod ;
   private String AV54Ficherosbasicos_tforpagwwds_2_tffpgcod ;
   private String AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel ;
   private String AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc ;
   private String AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel ;
   private String scmdbuf ;
   private String lV54Ficherosbasicos_tforpagwwds_2_tffpgcod ;
   private String lV56Ficherosbasicos_tforpagwwds_4_tffpgdsc ;
   private String A498FpgDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8072 ;
   private boolean n498FpgDsc ;
   private boolean brk8074 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Ficherosbasicos_tforpagwwds_1_filterfulltext ;
   private String lV53Ficherosbasicos_tforpagwwds_1_filterfulltext ;
   private String AV20Option ;
   private String AV23OptionDesc ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08072_A497FpgCod ;
   private String[] P08072_A498FpgDsc ;
   private boolean[] P08072_n498FpgDsc ;
   private String[] P08072_A396EmprCod ;
   private String[] P08073_A498FpgDsc ;
   private boolean[] P08073_n498FpgDsc ;
   private String[] P08073_A497FpgCod ;
   private String[] P08073_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tforpagwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08072( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Ficherosbasicos_tforpagwwds_1_filterfulltext ,
                                          String AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel ,
                                          String AV54Ficherosbasicos_tforpagwwds_2_tffpgcod ,
                                          String AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel ,
                                          String AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc ,
                                          String A497FpgCod ,
                                          String A498FpgDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT FpgCod, FpgDsc, EmprCod FROM TXPFORPAG" ;
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_tforpagwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(FpgCod) like '%' || UPPER(?)) or ( UPPER(FpgDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_tforpagwwds_2_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FpgDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FpgCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08073( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Ficherosbasicos_tforpagwwds_1_filterfulltext ,
                                          String AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel ,
                                          String AV54Ficherosbasicos_tforpagwwds_2_tffpgcod ,
                                          String AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel ,
                                          String AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc ,
                                          String A497FpgCod ,
                                          String A498FpgDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT FpgDsc, FpgCod, EmprCod FROM TXPFORPAG" ;
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_tforpagwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(FpgCod) like '%' || UPPER(?)) or ( UPPER(FpgDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_tforpagwwds_2_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tforpagwwds_3_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Ficherosbasicos_tforpagwwds_4_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ficherosbasicos_tforpagwwds_5_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(FpgDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY FpgDsc" ;
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
                  return conditional_P08072(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08073(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08072", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08073", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 2);
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
                  stmt.setString(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
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
                  stmt.setString(sIdx, (String)parms[8], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 2);
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

