package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tuniestwwgetfilterdata extends GXProcedure
{
   public tuniestwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tuniestwwgetfilterdata.class ), "" );
   }

   public tuniestwwgetfilterdata( int remoteHandle ,
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
      tuniestwwgetfilterdata.this.aP5 = new String[] {""};
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
      tuniestwwgetfilterdata.this.AV16DDOName = aP0;
      tuniestwwgetfilterdata.this.AV14SearchTxt = aP1;
      tuniestwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tuniestwwgetfilterdata.this.aP3 = aP3;
      tuniestwwgetfilterdata.this.aP4 = aP4;
      tuniestwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_UNIESTDES") == 0 )
      {
         /* Execute user subroutine: 'LOADUNIESTDESOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_UNIESTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADUNIESTCODOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TUNIESTWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TUNIESTWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TUNIESTWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTDES") == 0 )
         {
            AV10TFUniEstDes = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTDES_SEL") == 0 )
         {
            AV11TFUniEstDes_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTCOD") == 0 )
         {
            AV12TFUniEstCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFUNIESTCOD_SEL") == 0 )
         {
            AV13TFUniEstCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADUNIESTDESOPTIONS' Routine */
      returnInSub = false ;
      AV10TFUniEstDes = AV14SearchTxt ;
      AV11TFUniEstDes_Sel = "" ;
      AV37Tuniestwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Tuniestwwds_2_tfuniestdes = AV10TFUniEstDes ;
      AV39Tuniestwwds_3_tfuniestdes_sel = AV11TFUniEstDes_Sel ;
      AV40Tuniestwwds_4_tfuniestcod = AV12TFUniEstCod ;
      AV41Tuniestwwds_5_tfuniestcod_sel = AV13TFUniEstCod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Tuniestwwds_1_filterfulltext ,
                                           AV39Tuniestwwds_3_tfuniestdes_sel ,
                                           AV38Tuniestwwds_2_tfuniestdes ,
                                           AV41Tuniestwwds_5_tfuniestcod_sel ,
                                           AV40Tuniestwwds_4_tfuniestcod ,
                                           A2145UniEstDes ,
                                           A2144UniEstCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV37Tuniestwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tuniestwwds_1_filterfulltext), "%", "") ;
      lV37Tuniestwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tuniestwwds_1_filterfulltext), "%", "") ;
      lV38Tuniestwwds_2_tfuniestdes = GXutil.padr( GXutil.rtrim( AV38Tuniestwwds_2_tfuniestdes), 25, "%") ;
      lV40Tuniestwwds_4_tfuniestcod = GXutil.padr( GXutil.rtrim( AV40Tuniestwwds_4_tfuniestcod), 3, "%") ;
      /* Using cursor P08WN2 */
      pr_default.execute(0, new Object[] {lV37Tuniestwwds_1_filterfulltext, lV37Tuniestwwds_1_filterfulltext, lV38Tuniestwwds_2_tfuniestdes, AV39Tuniestwwds_3_tfuniestdes_sel, lV40Tuniestwwds_4_tfuniestcod, AV41Tuniestwwds_5_tfuniestcod_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8WN2 = false ;
         A2145UniEstDes = P08WN2_A2145UniEstDes[0] ;
         n2145UniEstDes = P08WN2_n2145UniEstDes[0] ;
         A2144UniEstCod = P08WN2_A2144UniEstCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08WN2_A2145UniEstDes[0], A2145UniEstDes) == 0 ) )
         {
            brk8WN2 = false ;
            A2144UniEstCod = P08WN2_A2144UniEstCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8WN2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2145UniEstDes)==0) )
         {
            AV18Option = A2145UniEstDes ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8WN2 )
         {
            brk8WN2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADUNIESTCODOPTIONS' Routine */
      returnInSub = false ;
      AV12TFUniEstCod = AV14SearchTxt ;
      AV13TFUniEstCod_Sel = "" ;
      AV37Tuniestwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Tuniestwwds_2_tfuniestdes = AV10TFUniEstDes ;
      AV39Tuniestwwds_3_tfuniestdes_sel = AV11TFUniEstDes_Sel ;
      AV40Tuniestwwds_4_tfuniestcod = AV12TFUniEstCod ;
      AV41Tuniestwwds_5_tfuniestcod_sel = AV13TFUniEstCod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Tuniestwwds_1_filterfulltext ,
                                           AV39Tuniestwwds_3_tfuniestdes_sel ,
                                           AV38Tuniestwwds_2_tfuniestdes ,
                                           AV41Tuniestwwds_5_tfuniestcod_sel ,
                                           AV40Tuniestwwds_4_tfuniestcod ,
                                           A2145UniEstDes ,
                                           A2144UniEstCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV37Tuniestwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tuniestwwds_1_filterfulltext), "%", "") ;
      lV37Tuniestwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tuniestwwds_1_filterfulltext), "%", "") ;
      lV38Tuniestwwds_2_tfuniestdes = GXutil.padr( GXutil.rtrim( AV38Tuniestwwds_2_tfuniestdes), 25, "%") ;
      lV40Tuniestwwds_4_tfuniestcod = GXutil.padr( GXutil.rtrim( AV40Tuniestwwds_4_tfuniestcod), 3, "%") ;
      /* Using cursor P08WN3 */
      pr_default.execute(1, new Object[] {lV37Tuniestwwds_1_filterfulltext, lV37Tuniestwwds_1_filterfulltext, lV38Tuniestwwds_2_tfuniestdes, AV39Tuniestwwds_3_tfuniestdes_sel, lV40Tuniestwwds_4_tfuniestcod, AV41Tuniestwwds_5_tfuniestcod_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2144UniEstCod = P08WN3_A2144UniEstCod[0] ;
         A2145UniEstDes = P08WN3_A2145UniEstDes[0] ;
         n2145UniEstDes = P08WN3_n2145UniEstDes[0] ;
         if ( ! (GXutil.strcmp("", A2144UniEstCod)==0) )
         {
            AV18Option = A2144UniEstCod ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tuniestwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tuniestwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tuniestwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFUniEstDes = "" ;
      AV11TFUniEstDes_Sel = "" ;
      AV12TFUniEstCod = "" ;
      AV13TFUniEstCod_Sel = "" ;
      A2145UniEstDes = "" ;
      AV37Tuniestwwds_1_filterfulltext = "" ;
      AV38Tuniestwwds_2_tfuniestdes = "" ;
      AV39Tuniestwwds_3_tfuniestdes_sel = "" ;
      AV40Tuniestwwds_4_tfuniestcod = "" ;
      AV41Tuniestwwds_5_tfuniestcod_sel = "" ;
      scmdbuf = "" ;
      lV37Tuniestwwds_1_filterfulltext = "" ;
      lV38Tuniestwwds_2_tfuniestdes = "" ;
      lV40Tuniestwwds_4_tfuniestcod = "" ;
      A2144UniEstCod = "" ;
      P08WN2_A2145UniEstDes = new String[] {""} ;
      P08WN2_n2145UniEstDes = new boolean[] {false} ;
      P08WN2_A2144UniEstCod = new String[] {""} ;
      AV18Option = "" ;
      P08WN3_A2144UniEstCod = new String[] {""} ;
      P08WN3_A2145UniEstDes = new String[] {""} ;
      P08WN3_n2145UniEstDes = new boolean[] {false} ;
      AV21OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tuniestwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08WN2_A2145UniEstDes, P08WN2_n2145UniEstDes, P08WN2_A2144UniEstCod
            }
            , new Object[] {
            P08WN3_A2144UniEstCod, P08WN3_A2145UniEstDes, P08WN3_n2145UniEstDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV10TFUniEstDes ;
   private String AV11TFUniEstDes_Sel ;
   private String AV12TFUniEstCod ;
   private String AV13TFUniEstCod_Sel ;
   private String A2145UniEstDes ;
   private String AV38Tuniestwwds_2_tfuniestdes ;
   private String AV39Tuniestwwds_3_tfuniestdes_sel ;
   private String AV40Tuniestwwds_4_tfuniestcod ;
   private String AV41Tuniestwwds_5_tfuniestcod_sel ;
   private String scmdbuf ;
   private String lV38Tuniestwwds_2_tfuniestdes ;
   private String lV40Tuniestwwds_4_tfuniestcod ;
   private String A2144UniEstCod ;
   private boolean returnInSub ;
   private boolean brk8WN2 ;
   private boolean n2145UniEstDes ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Tuniestwwds_1_filterfulltext ;
   private String lV37Tuniestwwds_1_filterfulltext ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08WN2_A2145UniEstDes ;
   private boolean[] P08WN2_n2145UniEstDes ;
   private String[] P08WN2_A2144UniEstCod ;
   private String[] P08WN3_A2144UniEstCod ;
   private String[] P08WN3_A2145UniEstDes ;
   private boolean[] P08WN3_n2145UniEstDes ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tuniestwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Tuniestwwds_1_filterfulltext ,
                                          String AV39Tuniestwwds_3_tfuniestdes_sel ,
                                          String AV38Tuniestwwds_2_tfuniestdes ,
                                          String AV41Tuniestwwds_5_tfuniestcod_sel ,
                                          String AV40Tuniestwwds_4_tfuniestcod ,
                                          String A2145UniEstDes ,
                                          String A2144UniEstCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT UniEstDes, UniEstCod FROM TXPUNIEST" ;
      if ( ! (GXutil.strcmp("", AV37Tuniestwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UniEstDes) like '%' || UPPER(?)) or ( UPPER(UniEstCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Tuniestwwds_3_tfuniestdes_sel)==0) && ( ! (GXutil.strcmp("", AV38Tuniestwwds_2_tfuniestdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UniEstDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Tuniestwwds_3_tfuniestdes_sel)==0) )
      {
         addWhere(sWhereString, "(UniEstDes = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Tuniestwwds_5_tfuniestcod_sel)==0) && ( ! (GXutil.strcmp("", AV40Tuniestwwds_4_tfuniestcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UniEstCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Tuniestwwds_5_tfuniestcod_sel)==0) )
      {
         addWhere(sWhereString, "(UniEstCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY UniEstDes" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08WN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Tuniestwwds_1_filterfulltext ,
                                          String AV39Tuniestwwds_3_tfuniestdes_sel ,
                                          String AV38Tuniestwwds_2_tfuniestdes ,
                                          String AV41Tuniestwwds_5_tfuniestcod_sel ,
                                          String AV40Tuniestwwds_4_tfuniestcod ,
                                          String A2145UniEstDes ,
                                          String A2144UniEstCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT DISTINCT UniEstCod, NULL AS UniEstDes FROM ( SELECT UniEstCod, UniEstDes FROM TXPUNIEST" ;
      if ( ! (GXutil.strcmp("", AV37Tuniestwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(UniEstDes) like '%' || UPPER(?)) or ( UPPER(UniEstCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Tuniestwwds_3_tfuniestdes_sel)==0) && ( ! (GXutil.strcmp("", AV38Tuniestwwds_2_tfuniestdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UniEstDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Tuniestwwds_3_tfuniestdes_sel)==0) )
      {
         addWhere(sWhereString, "(UniEstDes = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Tuniestwwds_5_tfuniestcod_sel)==0) && ( ! (GXutil.strcmp("", AV40Tuniestwwds_4_tfuniestcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(UniEstCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Tuniestwwds_5_tfuniestcod_sel)==0) )
      {
         addWhere(sWhereString, "(UniEstCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY UniEstCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY UniEstCod" ;
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
                  return conditional_P08WN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08WN3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08WN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[8], 25);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 25);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
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
                  stmt.setString(sIdx, (String)parms[8], 25);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 25);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               return;
      }
   }

}

