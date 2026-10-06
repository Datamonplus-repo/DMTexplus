package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trevendwwgetfilterdata extends GXProcedure
{
   public trevendwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trevendwwgetfilterdata.class ), "" );
   }

   public trevendwwgetfilterdata( int remoteHandle ,
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
      trevendwwgetfilterdata.this.aP5 = new String[] {""};
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
      trevendwwgetfilterdata.this.AV26DDOName = aP0;
      trevendwwgetfilterdata.this.AV27SearchTxt = aP1;
      trevendwwgetfilterdata.this.AV28SearchTxtTo = aP2;
      trevendwwgetfilterdata.this.aP3 = aP3;
      trevendwwgetfilterdata.this.aP4 = aP4;
      trevendwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_REVENID") == 0 )
      {
         /* Execute user subroutine: 'LOADREVENIDOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_REVENNM") == 0 )
      {
         /* Execute user subroutine: 'LOADREVENNMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("FicherosBasicos.TREVENDWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TREVENDWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FicherosBasicos.TREVENDWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENID") == 0 )
         {
            AV10TFRevenID = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENID_SEL") == 0 )
         {
            AV11TFRevenID_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENNM") == 0 )
         {
            AV12TFRevenNm = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFREVENNM_SEL") == 0 )
         {
            AV13TFRevenNm_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADREVENIDOPTIONS' Routine */
      returnInSub = false ;
      AV10TFRevenID = AV27SearchTxt ;
      AV11TFRevenID_Sel = "" ;
      AV37Ficherosbasicos_trevendwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Ficherosbasicos_trevendwwds_2_tfrevenid = AV10TFRevenID ;
      AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel = AV11TFRevenID_Sel ;
      AV40Ficherosbasicos_trevendwwds_4_tfrevennm = AV12TFRevenNm ;
      AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel = AV13TFRevenNm_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Ficherosbasicos_trevendwwds_1_filterfulltext ,
                                           AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel ,
                                           AV38Ficherosbasicos_trevendwwds_2_tfrevenid ,
                                           AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel ,
                                           AV40Ficherosbasicos_trevendwwds_4_tfrevennm ,
                                           A12328RevenID ,
                                           A12327RevenNm } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Ficherosbasicos_trevendwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ficherosbasicos_trevendwwds_1_filterfulltext), "%", "") ;
      lV37Ficherosbasicos_trevendwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ficherosbasicos_trevendwwds_1_filterfulltext), "%", "") ;
      lV38Ficherosbasicos_trevendwwds_2_tfrevenid = GXutil.padr( GXutil.rtrim( AV38Ficherosbasicos_trevendwwds_2_tfrevenid), 10, "%") ;
      lV40Ficherosbasicos_trevendwwds_4_tfrevennm = GXutil.padr( GXutil.rtrim( AV40Ficherosbasicos_trevendwwds_4_tfrevennm), 40, "%") ;
      /* Using cursor P0A1D2 */
      pr_default.execute(0, new Object[] {lV37Ficherosbasicos_trevendwwds_1_filterfulltext, lV37Ficherosbasicos_trevendwwds_1_filterfulltext, lV38Ficherosbasicos_trevendwwds_2_tfrevenid, AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel, lV40Ficherosbasicos_trevendwwds_4_tfrevennm, AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA1D2 = false ;
         A12328RevenID = P0A1D2_A12328RevenID[0] ;
         A12327RevenNm = P0A1D2_A12327RevenNm[0] ;
         n12327RevenNm = P0A1D2_n12327RevenNm[0] ;
         A396EmprCod = P0A1D2_A396EmprCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A1D2_A12328RevenID[0], A12328RevenID) == 0 ) )
         {
            brkA1D2 = false ;
            A396EmprCod = P0A1D2_A396EmprCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA1D2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A12328RevenID)==0) )
         {
            AV15Option = A12328RevenID ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA1D2 )
         {
            brkA1D2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADREVENNMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFRevenNm = AV27SearchTxt ;
      AV13TFRevenNm_Sel = "" ;
      AV37Ficherosbasicos_trevendwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Ficherosbasicos_trevendwwds_2_tfrevenid = AV10TFRevenID ;
      AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel = AV11TFRevenID_Sel ;
      AV40Ficherosbasicos_trevendwwds_4_tfrevennm = AV12TFRevenNm ;
      AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel = AV13TFRevenNm_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Ficherosbasicos_trevendwwds_1_filterfulltext ,
                                           AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel ,
                                           AV38Ficherosbasicos_trevendwwds_2_tfrevenid ,
                                           AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel ,
                                           AV40Ficherosbasicos_trevendwwds_4_tfrevennm ,
                                           A12328RevenID ,
                                           A12327RevenNm } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Ficherosbasicos_trevendwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ficherosbasicos_trevendwwds_1_filterfulltext), "%", "") ;
      lV37Ficherosbasicos_trevendwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ficherosbasicos_trevendwwds_1_filterfulltext), "%", "") ;
      lV38Ficherosbasicos_trevendwwds_2_tfrevenid = GXutil.padr( GXutil.rtrim( AV38Ficherosbasicos_trevendwwds_2_tfrevenid), 10, "%") ;
      lV40Ficherosbasicos_trevendwwds_4_tfrevennm = GXutil.padr( GXutil.rtrim( AV40Ficherosbasicos_trevendwwds_4_tfrevennm), 40, "%") ;
      /* Using cursor P0A1D3 */
      pr_default.execute(1, new Object[] {lV37Ficherosbasicos_trevendwwds_1_filterfulltext, lV37Ficherosbasicos_trevendwwds_1_filterfulltext, lV38Ficherosbasicos_trevendwwds_2_tfrevenid, AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel, lV40Ficherosbasicos_trevendwwds_4_tfrevennm, AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA1D4 = false ;
         A12327RevenNm = P0A1D3_A12327RevenNm[0] ;
         n12327RevenNm = P0A1D3_n12327RevenNm[0] ;
         A12328RevenID = P0A1D3_A12328RevenID[0] ;
         A396EmprCod = P0A1D3_A396EmprCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A1D3_A12327RevenNm[0], A12327RevenNm) == 0 ) )
         {
            brkA1D4 = false ;
            A12328RevenID = P0A1D3_A12328RevenID[0] ;
            A396EmprCod = P0A1D3_A396EmprCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA1D4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A12327RevenNm)==0) )
         {
            AV15Option = A12327RevenNm ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA1D4 )
         {
            brkA1D4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = trevendwwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = trevendwwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = trevendwwgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFRevenID = "" ;
      AV11TFRevenID_Sel = "" ;
      AV12TFRevenNm = "" ;
      AV13TFRevenNm_Sel = "" ;
      A12328RevenID = "" ;
      AV37Ficherosbasicos_trevendwwds_1_filterfulltext = "" ;
      AV38Ficherosbasicos_trevendwwds_2_tfrevenid = "" ;
      AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel = "" ;
      AV40Ficherosbasicos_trevendwwds_4_tfrevennm = "" ;
      AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel = "" ;
      scmdbuf = "" ;
      lV37Ficherosbasicos_trevendwwds_1_filterfulltext = "" ;
      lV38Ficherosbasicos_trevendwwds_2_tfrevenid = "" ;
      lV40Ficherosbasicos_trevendwwds_4_tfrevennm = "" ;
      A12327RevenNm = "" ;
      P0A1D2_A12328RevenID = new String[] {""} ;
      P0A1D2_A12327RevenNm = new String[] {""} ;
      P0A1D2_n12327RevenNm = new boolean[] {false} ;
      P0A1D2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      P0A1D3_A12327RevenNm = new String[] {""} ;
      P0A1D3_n12327RevenNm = new boolean[] {false} ;
      P0A1D3_A12328RevenID = new String[] {""} ;
      P0A1D3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.trevendwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A1D2_A12328RevenID, P0A1D2_A12327RevenNm, P0A1D2_n12327RevenNm, P0A1D2_A396EmprCod
            }
            , new Object[] {
            P0A1D3_A12327RevenNm, P0A1D3_n12327RevenNm, P0A1D3_A12328RevenID, P0A1D3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV20count ;
   private String AV10TFRevenID ;
   private String AV11TFRevenID_Sel ;
   private String AV12TFRevenNm ;
   private String AV13TFRevenNm_Sel ;
   private String A12328RevenID ;
   private String AV38Ficherosbasicos_trevendwwds_2_tfrevenid ;
   private String AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel ;
   private String AV40Ficherosbasicos_trevendwwds_4_tfrevennm ;
   private String AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel ;
   private String scmdbuf ;
   private String lV38Ficherosbasicos_trevendwwds_2_tfrevenid ;
   private String lV40Ficherosbasicos_trevendwwds_4_tfrevennm ;
   private String A12327RevenNm ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA1D2 ;
   private boolean n12327RevenNm ;
   private boolean brkA1D4 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Ficherosbasicos_trevendwwds_1_filterfulltext ;
   private String lV37Ficherosbasicos_trevendwwds_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1D2_A12328RevenID ;
   private String[] P0A1D2_A12327RevenNm ;
   private boolean[] P0A1D2_n12327RevenNm ;
   private String[] P0A1D2_A396EmprCod ;
   private String[] P0A1D3_A12327RevenNm ;
   private boolean[] P0A1D3_n12327RevenNm ;
   private String[] P0A1D3_A12328RevenID ;
   private String[] P0A1D3_A396EmprCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class trevendwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A1D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Ficherosbasicos_trevendwwds_1_filterfulltext ,
                                          String AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel ,
                                          String AV38Ficherosbasicos_trevendwwds_2_tfrevenid ,
                                          String AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel ,
                                          String AV40Ficherosbasicos_trevendwwds_4_tfrevennm ,
                                          String A12328RevenID ,
                                          String A12327RevenNm )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT RevenID, RevenNm, EmprCod FROM TXPREVEND" ;
      if ( ! (GXutil.strcmp("", AV37Ficherosbasicos_trevendwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RevenID) like '%' || UPPER(?)) or ( UPPER(RevenNm) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV38Ficherosbasicos_trevendwwds_2_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(RevenID = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel)==0) && ( ! (GXutil.strcmp("", AV40Ficherosbasicos_trevendwwds_4_tfrevennm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RevenNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel)==0) )
      {
         addWhere(sWhereString, "(RevenNm = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY RevenID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A1D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Ficherosbasicos_trevendwwds_1_filterfulltext ,
                                          String AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel ,
                                          String AV38Ficherosbasicos_trevendwwds_2_tfrevenid ,
                                          String AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel ,
                                          String AV40Ficherosbasicos_trevendwwds_4_tfrevennm ,
                                          String A12328RevenID ,
                                          String A12327RevenNm )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT RevenNm, RevenID, EmprCod FROM TXPREVEND" ;
      if ( ! (GXutil.strcmp("", AV37Ficherosbasicos_trevendwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RevenID) like '%' || UPPER(?)) or ( UPPER(RevenNm) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel)==0) && ( ! (GXutil.strcmp("", AV38Ficherosbasicos_trevendwwds_2_tfrevenid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RevenID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Ficherosbasicos_trevendwwds_3_tfrevenid_sel)==0) )
      {
         addWhere(sWhereString, "(RevenID = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel)==0) && ( ! (GXutil.strcmp("", AV40Ficherosbasicos_trevendwwds_4_tfrevennm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RevenNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Ficherosbasicos_trevendwwds_5_tfrevennm_sel)==0) )
      {
         addWhere(sWhereString, "(RevenNm = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY RevenNm" ;
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
                  return conditional_P0A1D2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P0A1D3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A1D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
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
                  stmt.setString(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
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
                  stmt.setString(sIdx, (String)parms[8], 10);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 10);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

