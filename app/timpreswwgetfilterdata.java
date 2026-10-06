package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class timpreswwgetfilterdata extends GXProcedure
{
   public timpreswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( timpreswwgetfilterdata.class ), "" );
   }

   public timpreswwgetfilterdata( int remoteHandle ,
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
      timpreswwgetfilterdata.this.aP5 = new String[] {""};
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
      timpreswwgetfilterdata.this.AV26DDOName = aP0;
      timpreswwgetfilterdata.this.AV27SearchTxt = aP1;
      timpreswwgetfilterdata.this.AV28SearchTxtTo = aP2;
      timpreswwgetfilterdata.this.aP3 = aP3;
      timpreswwgetfilterdata.this.aP4 = aP4;
      timpreswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_IMPCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADIMPCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_IMPDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADIMPDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("TIMPRESWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TIMPRESWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("TIMPRESWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMPCOD") == 0 )
         {
            AV10TFImpCod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMPCOD_SEL") == 0 )
         {
            AV11TFImpCod_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMPDSC") == 0 )
         {
            AV12TFImpDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMPDSC_SEL") == 0 )
         {
            AV13TFImpDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADIMPCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFImpCod = AV27SearchTxt ;
      AV11TFImpCod_Sel = "" ;
      AV37Timpreswwds_1_filterfulltext = AV32FilterFullText ;
      AV38Timpreswwds_2_tfimpcod = AV10TFImpCod ;
      AV39Timpreswwds_3_tfimpcod_sel = AV11TFImpCod_Sel ;
      AV40Timpreswwds_4_tfimpdsc = AV12TFImpDsc ;
      AV41Timpreswwds_5_tfimpdsc_sel = AV13TFImpDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Timpreswwds_1_filterfulltext ,
                                           AV39Timpreswwds_3_tfimpcod_sel ,
                                           AV38Timpreswwds_2_tfimpcod ,
                                           AV41Timpreswwds_5_tfimpdsc_sel ,
                                           AV40Timpreswwds_4_tfimpdsc ,
                                           A574ImpCod ,
                                           A576ImpDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Timpreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Timpreswwds_1_filterfulltext), "%", "") ;
      lV37Timpreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Timpreswwds_1_filterfulltext), "%", "") ;
      lV38Timpreswwds_2_tfimpcod = GXutil.padr( GXutil.rtrim( AV38Timpreswwds_2_tfimpcod), 10, "%") ;
      lV40Timpreswwds_4_tfimpdsc = GXutil.padr( GXutil.rtrim( AV40Timpreswwds_4_tfimpdsc), 20, "%") ;
      /* Using cursor P097G2 */
      pr_default.execute(0, new Object[] {lV37Timpreswwds_1_filterfulltext, lV37Timpreswwds_1_filterfulltext, lV38Timpreswwds_2_tfimpcod, AV39Timpreswwds_3_tfimpcod_sel, lV40Timpreswwds_4_tfimpdsc, AV41Timpreswwds_5_tfimpdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A576ImpDsc = P097G2_A576ImpDsc[0] ;
         n576ImpDsc = P097G2_n576ImpDsc[0] ;
         A574ImpCod = P097G2_A574ImpCod[0] ;
         if ( ! (GXutil.strcmp("", A574ImpCod)==0) )
         {
            AV15Option = A574ImpCod ;
            AV16Options.add(AV15Option, 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADIMPDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFImpDsc = AV27SearchTxt ;
      AV13TFImpDsc_Sel = "" ;
      AV37Timpreswwds_1_filterfulltext = AV32FilterFullText ;
      AV38Timpreswwds_2_tfimpcod = AV10TFImpCod ;
      AV39Timpreswwds_3_tfimpcod_sel = AV11TFImpCod_Sel ;
      AV40Timpreswwds_4_tfimpdsc = AV12TFImpDsc ;
      AV41Timpreswwds_5_tfimpdsc_sel = AV13TFImpDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV37Timpreswwds_1_filterfulltext ,
                                           AV39Timpreswwds_3_tfimpcod_sel ,
                                           AV38Timpreswwds_2_tfimpcod ,
                                           AV41Timpreswwds_5_tfimpdsc_sel ,
                                           AV40Timpreswwds_4_tfimpdsc ,
                                           A574ImpCod ,
                                           A576ImpDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Timpreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Timpreswwds_1_filterfulltext), "%", "") ;
      lV37Timpreswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Timpreswwds_1_filterfulltext), "%", "") ;
      lV38Timpreswwds_2_tfimpcod = GXutil.padr( GXutil.rtrim( AV38Timpreswwds_2_tfimpcod), 10, "%") ;
      lV40Timpreswwds_4_tfimpdsc = GXutil.padr( GXutil.rtrim( AV40Timpreswwds_4_tfimpdsc), 20, "%") ;
      /* Using cursor P097G3 */
      pr_default.execute(1, new Object[] {lV37Timpreswwds_1_filterfulltext, lV37Timpreswwds_1_filterfulltext, lV38Timpreswwds_2_tfimpcod, AV39Timpreswwds_3_tfimpcod_sel, lV40Timpreswwds_4_tfimpdsc, AV41Timpreswwds_5_tfimpdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk97G3 = false ;
         A576ImpDsc = P097G3_A576ImpDsc[0] ;
         n576ImpDsc = P097G3_n576ImpDsc[0] ;
         A574ImpCod = P097G3_A574ImpCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P097G3_A576ImpDsc[0], A576ImpDsc) == 0 ) )
         {
            brk97G3 = false ;
            A574ImpCod = P097G3_A574ImpCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brk97G3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A576ImpDsc)==0) )
         {
            AV15Option = A576ImpDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97G3 )
         {
            brk97G3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = timpreswwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = timpreswwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = timpreswwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV10TFImpCod = "" ;
      AV11TFImpCod_Sel = "" ;
      AV12TFImpDsc = "" ;
      AV13TFImpDsc_Sel = "" ;
      A574ImpCod = "" ;
      AV37Timpreswwds_1_filterfulltext = "" ;
      AV38Timpreswwds_2_tfimpcod = "" ;
      AV39Timpreswwds_3_tfimpcod_sel = "" ;
      AV40Timpreswwds_4_tfimpdsc = "" ;
      AV41Timpreswwds_5_tfimpdsc_sel = "" ;
      scmdbuf = "" ;
      lV37Timpreswwds_1_filterfulltext = "" ;
      lV38Timpreswwds_2_tfimpcod = "" ;
      lV40Timpreswwds_4_tfimpdsc = "" ;
      A576ImpDsc = "" ;
      P097G2_A576ImpDsc = new String[] {""} ;
      P097G2_n576ImpDsc = new boolean[] {false} ;
      P097G2_A574ImpCod = new String[] {""} ;
      AV15Option = "" ;
      P097G3_A576ImpDsc = new String[] {""} ;
      P097G3_n576ImpDsc = new boolean[] {false} ;
      P097G3_A574ImpCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.timpreswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P097G2_A576ImpDsc, P097G2_n576ImpDsc, P097G2_A574ImpCod
            }
            , new Object[] {
            P097G3_A576ImpDsc, P097G3_n576ImpDsc, P097G3_A574ImpCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV20count ;
   private String AV10TFImpCod ;
   private String AV11TFImpCod_Sel ;
   private String AV12TFImpDsc ;
   private String AV13TFImpDsc_Sel ;
   private String A574ImpCod ;
   private String AV38Timpreswwds_2_tfimpcod ;
   private String AV39Timpreswwds_3_tfimpcod_sel ;
   private String AV40Timpreswwds_4_tfimpdsc ;
   private String AV41Timpreswwds_5_tfimpdsc_sel ;
   private String scmdbuf ;
   private String lV38Timpreswwds_2_tfimpcod ;
   private String lV40Timpreswwds_4_tfimpdsc ;
   private String A576ImpDsc ;
   private boolean returnInSub ;
   private boolean n576ImpDsc ;
   private boolean brk97G3 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Timpreswwds_1_filterfulltext ;
   private String lV37Timpreswwds_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P097G2_A576ImpDsc ;
   private boolean[] P097G2_n576ImpDsc ;
   private String[] P097G2_A574ImpCod ;
   private String[] P097G3_A576ImpDsc ;
   private boolean[] P097G3_n576ImpDsc ;
   private String[] P097G3_A574ImpCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class timpreswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Timpreswwds_1_filterfulltext ,
                                          String AV39Timpreswwds_3_tfimpcod_sel ,
                                          String AV38Timpreswwds_2_tfimpcod ,
                                          String AV41Timpreswwds_5_tfimpdsc_sel ,
                                          String AV40Timpreswwds_4_tfimpdsc ,
                                          String A574ImpCod ,
                                          String A576ImpDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DISTINCT NULL AS ImpDsc, ImpCod FROM ( SELECT ImpDsc, ImpCod FROM TXPIMPRES" ;
      if ( ! (GXutil.strcmp("", AV37Timpreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ImpCod) like '%' || UPPER(?)) or ( UPPER(ImpDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Timpreswwds_3_tfimpcod_sel)==0) && ( ! (GXutil.strcmp("", AV38Timpreswwds_2_tfimpcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Timpreswwds_3_tfimpcod_sel)==0) )
      {
         addWhere(sWhereString, "(ImpCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Timpreswwds_5_tfimpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Timpreswwds_4_tfimpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Timpreswwds_5_tfimpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(ImpDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ImpCod" ;
      scmdbuf += ") DistinctT" ;
      scmdbuf += " ORDER BY ImpCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P097G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Timpreswwds_1_filterfulltext ,
                                          String AV39Timpreswwds_3_tfimpcod_sel ,
                                          String AV38Timpreswwds_2_tfimpcod ,
                                          String AV41Timpreswwds_5_tfimpdsc_sel ,
                                          String AV40Timpreswwds_4_tfimpdsc ,
                                          String A574ImpCod ,
                                          String A576ImpDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ImpDsc, ImpCod FROM TXPIMPRES" ;
      if ( ! (GXutil.strcmp("", AV37Timpreswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ImpCod) like '%' || UPPER(?)) or ( UPPER(ImpDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Timpreswwds_3_tfimpcod_sel)==0) && ( ! (GXutil.strcmp("", AV38Timpreswwds_2_tfimpcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Timpreswwds_3_tfimpcod_sel)==0) )
      {
         addWhere(sWhereString, "(ImpCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Timpreswwds_5_tfimpdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Timpreswwds_4_tfimpdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ImpDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Timpreswwds_5_tfimpdsc_sel)==0) )
      {
         addWhere(sWhereString, "(ImpDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ImpDsc" ;
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
                  return conditional_P097G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P097G3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
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
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
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
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               return;
      }
   }

}

