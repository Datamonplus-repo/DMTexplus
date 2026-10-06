package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tfrasrwwgetfilterdata extends GXProcedure
{
   public tfrasrwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfrasrwwgetfilterdata.class ), "" );
   }

   public tfrasrwwgetfilterdata( int remoteHandle ,
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
      tfrasrwwgetfilterdata.this.aP5 = new String[] {""};
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
      tfrasrwwgetfilterdata.this.AV20DDOName = aP0;
      tfrasrwwgetfilterdata.this.AV18SearchTxt = aP1;
      tfrasrwwgetfilterdata.this.AV19SearchTxtTo = aP2;
      tfrasrwwgetfilterdata.this.aP3 = aP3;
      tfrasrwwgetfilterdata.this.aP4 = aP4;
      tfrasrwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_CFRASER") == 0 )
      {
         /* Execute user subroutine: 'LOADCFRASEROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_DFRASER") == 0 )
      {
         /* Execute user subroutine: 'LOADDFRASEROPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("StocksQuimicos.TFRASRWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TFRASRWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("StocksQuimicos.TFRASRWWGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCFRASER") == 0 )
         {
            AV14TFCFraseR = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCFRASER_SEL") == 0 )
         {
            AV15TFCFraseR_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDFRASER") == 0 )
         {
            AV16TFDFraseR = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDFRASER_SEL") == 0 )
         {
            AV17TFDFraseR_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCFRASEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFCFraseR = AV18SearchTxt ;
      AV15TFCFraseR_Sel = "" ;
      AV41Stocksquimicos_tfrasrwwds_1_filterfulltext = AV36FilterFullText ;
      AV42Stocksquimicos_tfrasrwwds_2_tfcfraser = AV14TFCFraseR ;
      AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel = AV15TFCFraseR_Sel ;
      AV44Stocksquimicos_tfrasrwwds_4_tfdfraser = AV16TFDFraseR ;
      AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel = AV17TFDFraseR_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Stocksquimicos_tfrasrwwds_1_filterfulltext ,
                                           AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel ,
                                           AV42Stocksquimicos_tfrasrwwds_2_tfcfraser ,
                                           AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel ,
                                           AV44Stocksquimicos_tfrasrwwds_4_tfdfraser ,
                                           A11197CFraseR ,
                                           A11198DFraseR } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV41Stocksquimicos_tfrasrwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Stocksquimicos_tfrasrwwds_1_filterfulltext), "%", "") ;
      lV41Stocksquimicos_tfrasrwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Stocksquimicos_tfrasrwwds_1_filterfulltext), "%", "") ;
      lV42Stocksquimicos_tfrasrwwds_2_tfcfraser = GXutil.padr( GXutil.rtrim( AV42Stocksquimicos_tfrasrwwds_2_tfcfraser), 20, "%") ;
      lV44Stocksquimicos_tfrasrwwds_4_tfdfraser = GXutil.concat( GXutil.rtrim( AV44Stocksquimicos_tfrasrwwds_4_tfdfraser), "%", "") ;
      /* Using cursor P096N2 */
      pr_default.execute(0, new Object[] {lV41Stocksquimicos_tfrasrwwds_1_filterfulltext, lV41Stocksquimicos_tfrasrwwds_1_filterfulltext, lV42Stocksquimicos_tfrasrwwds_2_tfcfraser, AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel, lV44Stocksquimicos_tfrasrwwds_4_tfdfraser, AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk96N2 = false ;
         A11197CFraseR = P096N2_A11197CFraseR[0] ;
         A11198DFraseR = P096N2_A11198DFraseR[0] ;
         n11198DFraseR = P096N2_n11198DFraseR[0] ;
         A396EmprCod = P096N2_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P096N2_A11197CFraseR[0], A11197CFraseR) == 0 ) )
         {
            brk96N2 = false ;
            A396EmprCod = P096N2_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk96N2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11197CFraseR)==0) )
         {
            AV22Option = A11197CFraseR ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk96N2 )
         {
            brk96N2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADDFRASEROPTIONS' Routine */
      returnInSub = false ;
      AV16TFDFraseR = AV18SearchTxt ;
      AV17TFDFraseR_Sel = "" ;
      AV41Stocksquimicos_tfrasrwwds_1_filterfulltext = AV36FilterFullText ;
      AV42Stocksquimicos_tfrasrwwds_2_tfcfraser = AV14TFCFraseR ;
      AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel = AV15TFCFraseR_Sel ;
      AV44Stocksquimicos_tfrasrwwds_4_tfdfraser = AV16TFDFraseR ;
      AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel = AV17TFDFraseR_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV41Stocksquimicos_tfrasrwwds_1_filterfulltext ,
                                           AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel ,
                                           AV42Stocksquimicos_tfrasrwwds_2_tfcfraser ,
                                           AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel ,
                                           AV44Stocksquimicos_tfrasrwwds_4_tfdfraser ,
                                           A11197CFraseR ,
                                           A11198DFraseR } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV41Stocksquimicos_tfrasrwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Stocksquimicos_tfrasrwwds_1_filterfulltext), "%", "") ;
      lV41Stocksquimicos_tfrasrwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Stocksquimicos_tfrasrwwds_1_filterfulltext), "%", "") ;
      lV42Stocksquimicos_tfrasrwwds_2_tfcfraser = GXutil.padr( GXutil.rtrim( AV42Stocksquimicos_tfrasrwwds_2_tfcfraser), 20, "%") ;
      lV44Stocksquimicos_tfrasrwwds_4_tfdfraser = GXutil.concat( GXutil.rtrim( AV44Stocksquimicos_tfrasrwwds_4_tfdfraser), "%", "") ;
      /* Using cursor P096N3 */
      pr_default.execute(1, new Object[] {lV41Stocksquimicos_tfrasrwwds_1_filterfulltext, lV41Stocksquimicos_tfrasrwwds_1_filterfulltext, lV42Stocksquimicos_tfrasrwwds_2_tfcfraser, AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel, lV44Stocksquimicos_tfrasrwwds_4_tfdfraser, AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk96N4 = false ;
         A11198DFraseR = P096N3_A11198DFraseR[0] ;
         n11198DFraseR = P096N3_n11198DFraseR[0] ;
         A11197CFraseR = P096N3_A11197CFraseR[0] ;
         A396EmprCod = P096N3_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P096N3_A11198DFraseR[0], A11198DFraseR) == 0 ) )
         {
            brk96N4 = false ;
            A11197CFraseR = P096N3_A11197CFraseR[0] ;
            A396EmprCod = P096N3_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk96N4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A11198DFraseR)==0) )
         {
            AV22Option = A11198DFraseR ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk96N4 )
         {
            brk96N4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tfrasrwwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = tfrasrwwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = tfrasrwwgetfilterdata.this.AV29OptionIndexesJson;
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
      AV36FilterFullText = "" ;
      AV14TFCFraseR = "" ;
      AV15TFCFraseR_Sel = "" ;
      AV16TFDFraseR = "" ;
      AV17TFDFraseR_Sel = "" ;
      A11197CFraseR = "" ;
      AV41Stocksquimicos_tfrasrwwds_1_filterfulltext = "" ;
      AV42Stocksquimicos_tfrasrwwds_2_tfcfraser = "" ;
      AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel = "" ;
      AV44Stocksquimicos_tfrasrwwds_4_tfdfraser = "" ;
      AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel = "" ;
      scmdbuf = "" ;
      lV41Stocksquimicos_tfrasrwwds_1_filterfulltext = "" ;
      lV42Stocksquimicos_tfrasrwwds_2_tfcfraser = "" ;
      lV44Stocksquimicos_tfrasrwwds_4_tfdfraser = "" ;
      A11198DFraseR = "" ;
      P096N2_A11197CFraseR = new String[] {""} ;
      P096N2_A11198DFraseR = new String[] {""} ;
      P096N2_n11198DFraseR = new boolean[] {false} ;
      P096N2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P096N3_A11198DFraseR = new String[] {""} ;
      P096N3_n11198DFraseR = new boolean[] {false} ;
      P096N3_A11197CFraseR = new String[] {""} ;
      P096N3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tfrasrwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P096N2_A11197CFraseR, P096N2_A11198DFraseR, P096N2_n11198DFraseR, P096N2_A396EmprCod
            }
            , new Object[] {
            P096N3_A11198DFraseR, P096N3_n11198DFraseR, P096N3_A11197CFraseR, P096N3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private long AV30count ;
   private String AV14TFCFraseR ;
   private String AV15TFCFraseR_Sel ;
   private String A11197CFraseR ;
   private String AV42Stocksquimicos_tfrasrwwds_2_tfcfraser ;
   private String AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel ;
   private String scmdbuf ;
   private String lV42Stocksquimicos_tfrasrwwds_2_tfcfraser ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk96N2 ;
   private boolean n11198DFraseR ;
   private boolean brk96N4 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV16TFDFraseR ;
   private String AV17TFDFraseR_Sel ;
   private String AV41Stocksquimicos_tfrasrwwds_1_filterfulltext ;
   private String AV44Stocksquimicos_tfrasrwwds_4_tfdfraser ;
   private String AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel ;
   private String lV41Stocksquimicos_tfrasrwwds_1_filterfulltext ;
   private String lV44Stocksquimicos_tfrasrwwds_4_tfdfraser ;
   private String A11198DFraseR ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P096N2_A11197CFraseR ;
   private String[] P096N2_A11198DFraseR ;
   private boolean[] P096N2_n11198DFraseR ;
   private String[] P096N2_A396EmprCod ;
   private String[] P096N3_A11198DFraseR ;
   private boolean[] P096N3_n11198DFraseR ;
   private String[] P096N3_A11197CFraseR ;
   private String[] P096N3_A396EmprCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tfrasrwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P096N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Stocksquimicos_tfrasrwwds_1_filterfulltext ,
                                          String AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel ,
                                          String AV42Stocksquimicos_tfrasrwwds_2_tfcfraser ,
                                          String AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel ,
                                          String AV44Stocksquimicos_tfrasrwwds_4_tfdfraser ,
                                          String A11197CFraseR ,
                                          String A11198DFraseR )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CFraseR, DFraseR, EmprCod FROM TXPFRASR" ;
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_tfrasrwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CFraseR) like '%' || UPPER(?)) or ( UPPER(DFraseR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel)==0) && ( ! (GXutil.strcmp("", AV42Stocksquimicos_tfrasrwwds_2_tfcfraser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CFraseR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel)==0) )
      {
         addWhere(sWhereString, "(CFraseR = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel)==0) && ( ! (GXutil.strcmp("", AV44Stocksquimicos_tfrasrwwds_4_tfdfraser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DFraseR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel)==0) )
      {
         addWhere(sWhereString, "(DFraseR = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CFraseR" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P096N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Stocksquimicos_tfrasrwwds_1_filterfulltext ,
                                          String AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel ,
                                          String AV42Stocksquimicos_tfrasrwwds_2_tfcfraser ,
                                          String AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel ,
                                          String AV44Stocksquimicos_tfrasrwwds_4_tfdfraser ,
                                          String A11197CFraseR ,
                                          String A11198DFraseR )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT DFraseR, CFraseR, EmprCod FROM TXPFRASR" ;
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_tfrasrwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CFraseR) like '%' || UPPER(?)) or ( UPPER(DFraseR) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel)==0) && ( ! (GXutil.strcmp("", AV42Stocksquimicos_tfrasrwwds_2_tfcfraser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CFraseR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Stocksquimicos_tfrasrwwds_3_tfcfraser_sel)==0) )
      {
         addWhere(sWhereString, "(CFraseR = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel)==0) && ( ! (GXutil.strcmp("", AV44Stocksquimicos_tfrasrwwds_4_tfdfraser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DFraseR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Stocksquimicos_tfrasrwwds_5_tfdfraser_sel)==0) )
      {
         addWhere(sWhereString, "(DFraseR = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DFraseR" ;
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
                  return conditional_P096N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P096N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P096N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P096N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
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
                  stmt.setVarchar(sIdx, (String)parms[10], 300);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 300);
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
                  stmt.setVarchar(sIdx, (String)parms[10], 300);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 300);
               }
               return;
      }
   }

}

