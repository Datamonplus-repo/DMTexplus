package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class numerocaswwgetfilterdata extends GXProcedure
{
   public numerocaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( numerocaswwgetfilterdata.class ), "" );
   }

   public numerocaswwgetfilterdata( int remoteHandle ,
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
      numerocaswwgetfilterdata.this.aP5 = new String[] {""};
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
      numerocaswwgetfilterdata.this.AV16DDOName = aP0;
      numerocaswwgetfilterdata.this.AV14SearchTxt = aP1;
      numerocaswwgetfilterdata.this.AV15SearchTxtTo = aP2;
      numerocaswwgetfilterdata.this.aP3 = aP3;
      numerocaswwgetfilterdata.this.aP4 = aP4;
      numerocaswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNCASC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNCASCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNCASD") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNCASDOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.NumeroCasWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.NumeroCasWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.NumeroCasWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCASC") == 0 )
         {
            AV10TFPrdNcasC = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCASC_SEL") == 0 )
         {
            AV11TFPrdNcasC_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCASD") == 0 )
         {
            AV12TFPrdNcasD = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCASD_SEL") == 0 )
         {
            AV13TFPrdNcasD_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNCASCOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNcasC = AV14SearchTxt ;
      AV11TFPrdNcasC_Sel = "" ;
      AV37Stocksquimicos_numerocaswwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_numerocaswwds_2_tfprdncasc = AV10TFPrdNcasC ;
      AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel = AV11TFPrdNcasC_Sel ;
      AV40Stocksquimicos_numerocaswwds_4_tfprdncasd = AV12TFPrdNcasD ;
      AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel = AV13TFPrdNcasD_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_numerocaswwds_1_filterfulltext ,
                                           AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel ,
                                           AV38Stocksquimicos_numerocaswwds_2_tfprdncasc ,
                                           AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel ,
                                           AV40Stocksquimicos_numerocaswwds_4_tfprdncasd ,
                                           A11199PrdNcasC ,
                                           A11200PrdNcasD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV37Stocksquimicos_numerocaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_numerocaswwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_numerocaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_numerocaswwds_1_filterfulltext), "%", "") ;
      lV38Stocksquimicos_numerocaswwds_2_tfprdncasc = GXutil.padr( GXutil.rtrim( AV38Stocksquimicos_numerocaswwds_2_tfprdncasc), 20, "%") ;
      lV40Stocksquimicos_numerocaswwds_4_tfprdncasd = GXutil.concat( GXutil.rtrim( AV40Stocksquimicos_numerocaswwds_4_tfprdncasd), "%", "") ;
      /* Using cursor P09L42 */
      pr_default.execute(0, new Object[] {lV37Stocksquimicos_numerocaswwds_1_filterfulltext, lV37Stocksquimicos_numerocaswwds_1_filterfulltext, lV38Stocksquimicos_numerocaswwds_2_tfprdncasc, AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel, lV40Stocksquimicos_numerocaswwds_4_tfprdncasd, AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9L42 = false ;
         A11199PrdNcasC = P09L42_A11199PrdNcasC[0] ;
         A11200PrdNcasD = P09L42_A11200PrdNcasD[0] ;
         A396EmprCod = P09L42_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09L42_A11199PrdNcasC[0], A11199PrdNcasC) == 0 ) )
         {
            brk9L42 = false ;
            A396EmprCod = P09L42_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9L42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11199PrdNcasC)==0) )
         {
            AV18Option = A11199PrdNcasC ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9L42 )
         {
            brk9L42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNCASDOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNcasD = AV14SearchTxt ;
      AV13TFPrdNcasD_Sel = "" ;
      AV37Stocksquimicos_numerocaswwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_numerocaswwds_2_tfprdncasc = AV10TFPrdNcasC ;
      AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel = AV11TFPrdNcasC_Sel ;
      AV40Stocksquimicos_numerocaswwds_4_tfprdncasd = AV12TFPrdNcasD ;
      AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel = AV13TFPrdNcasD_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_numerocaswwds_1_filterfulltext ,
                                           AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel ,
                                           AV38Stocksquimicos_numerocaswwds_2_tfprdncasc ,
                                           AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel ,
                                           AV40Stocksquimicos_numerocaswwds_4_tfprdncasd ,
                                           A11199PrdNcasC ,
                                           A11200PrdNcasD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV37Stocksquimicos_numerocaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_numerocaswwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_numerocaswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_numerocaswwds_1_filterfulltext), "%", "") ;
      lV38Stocksquimicos_numerocaswwds_2_tfprdncasc = GXutil.padr( GXutil.rtrim( AV38Stocksquimicos_numerocaswwds_2_tfprdncasc), 20, "%") ;
      lV40Stocksquimicos_numerocaswwds_4_tfprdncasd = GXutil.concat( GXutil.rtrim( AV40Stocksquimicos_numerocaswwds_4_tfprdncasd), "%", "") ;
      /* Using cursor P09L43 */
      pr_default.execute(1, new Object[] {lV37Stocksquimicos_numerocaswwds_1_filterfulltext, lV37Stocksquimicos_numerocaswwds_1_filterfulltext, lV38Stocksquimicos_numerocaswwds_2_tfprdncasc, AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel, lV40Stocksquimicos_numerocaswwds_4_tfprdncasd, AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9L44 = false ;
         A11200PrdNcasD = P09L43_A11200PrdNcasD[0] ;
         A11199PrdNcasC = P09L43_A11199PrdNcasC[0] ;
         A396EmprCod = P09L43_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09L43_A11200PrdNcasD[0], A11200PrdNcasD) == 0 ) )
         {
            brk9L44 = false ;
            A11199PrdNcasC = P09L43_A11199PrdNcasC[0] ;
            A396EmprCod = P09L43_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9L44 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11200PrdNcasD)==0) )
         {
            AV18Option = A11200PrdNcasD ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9L44 )
         {
            brk9L44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = numerocaswwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = numerocaswwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = numerocaswwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFPrdNcasC = "" ;
      AV11TFPrdNcasC_Sel = "" ;
      AV12TFPrdNcasD = "" ;
      AV13TFPrdNcasD_Sel = "" ;
      A11199PrdNcasC = "" ;
      AV37Stocksquimicos_numerocaswwds_1_filterfulltext = "" ;
      AV38Stocksquimicos_numerocaswwds_2_tfprdncasc = "" ;
      AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel = "" ;
      AV40Stocksquimicos_numerocaswwds_4_tfprdncasd = "" ;
      AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel = "" ;
      scmdbuf = "" ;
      lV37Stocksquimicos_numerocaswwds_1_filterfulltext = "" ;
      lV38Stocksquimicos_numerocaswwds_2_tfprdncasc = "" ;
      lV40Stocksquimicos_numerocaswwds_4_tfprdncasd = "" ;
      A11200PrdNcasD = "" ;
      P09L42_A11199PrdNcasC = new String[] {""} ;
      P09L42_A11200PrdNcasD = new String[] {""} ;
      P09L42_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P09L43_A11200PrdNcasD = new String[] {""} ;
      P09L43_A11199PrdNcasC = new String[] {""} ;
      P09L43_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.numerocaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09L42_A11199PrdNcasC, P09L42_A11200PrdNcasD, P09L42_A396EmprCod
            }
            , new Object[] {
            P09L43_A11200PrdNcasD, P09L43_A11199PrdNcasC, P09L43_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV10TFPrdNcasC ;
   private String AV11TFPrdNcasC_Sel ;
   private String A11199PrdNcasC ;
   private String AV38Stocksquimicos_numerocaswwds_2_tfprdncasc ;
   private String AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel ;
   private String scmdbuf ;
   private String lV38Stocksquimicos_numerocaswwds_2_tfprdncasc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9L42 ;
   private boolean brk9L44 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV12TFPrdNcasD ;
   private String AV13TFPrdNcasD_Sel ;
   private String AV37Stocksquimicos_numerocaswwds_1_filterfulltext ;
   private String AV40Stocksquimicos_numerocaswwds_4_tfprdncasd ;
   private String AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel ;
   private String lV37Stocksquimicos_numerocaswwds_1_filterfulltext ;
   private String lV40Stocksquimicos_numerocaswwds_4_tfprdncasd ;
   private String A11200PrdNcasD ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09L42_A11199PrdNcasC ;
   private String[] P09L42_A11200PrdNcasD ;
   private String[] P09L42_A396EmprCod ;
   private String[] P09L43_A11200PrdNcasD ;
   private String[] P09L43_A11199PrdNcasC ;
   private String[] P09L43_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class numerocaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09L42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_numerocaswwds_1_filterfulltext ,
                                          String AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel ,
                                          String AV38Stocksquimicos_numerocaswwds_2_tfprdncasc ,
                                          String AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel ,
                                          String AV40Stocksquimicos_numerocaswwds_4_tfprdncasd ,
                                          String A11199PrdNcasC ,
                                          String A11200PrdNcasD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNcasC, PrdNcasD, EmprCod FROM TXPNRCAS" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_numerocaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNcasC) like '%' || UPPER(?)) or ( UPPER(PrdNcasD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel)==0) && ( ! (GXutil.strcmp("", AV38Stocksquimicos_numerocaswwds_2_tfprdncasc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNcasC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNcasC = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel)==0) && ( ! (GXutil.strcmp("", AV40Stocksquimicos_numerocaswwds_4_tfprdncasd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNcasD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNcasD = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNcasC" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09L43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_numerocaswwds_1_filterfulltext ,
                                          String AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel ,
                                          String AV38Stocksquimicos_numerocaswwds_2_tfprdncasc ,
                                          String AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel ,
                                          String AV40Stocksquimicos_numerocaswwds_4_tfprdncasd ,
                                          String A11199PrdNcasC ,
                                          String A11200PrdNcasD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT PrdNcasD, PrdNcasC, EmprCod FROM TXPNRCAS" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_numerocaswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdNcasC) like '%' || UPPER(?)) or ( UPPER(PrdNcasD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel)==0) && ( ! (GXutil.strcmp("", AV38Stocksquimicos_numerocaswwds_2_tfprdncasc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNcasC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_numerocaswwds_3_tfprdncasc_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNcasC = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel)==0) && ( ! (GXutil.strcmp("", AV40Stocksquimicos_numerocaswwds_4_tfprdncasd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNcasD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_numerocaswwds_5_tfprdncasd_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNcasD = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNcasD" ;
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
                  return conditional_P09L42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P09L43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09L42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09L43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
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
                  stmt.setString(sIdx, (String)parms[8], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 500);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 500);
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
                  stmt.setString(sIdx, (String)parms[8], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 500);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 500);
               }
               return;
      }
   }

}

