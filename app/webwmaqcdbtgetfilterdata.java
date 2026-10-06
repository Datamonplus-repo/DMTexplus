package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwmaqcdbtgetfilterdata extends GXProcedure
{
   public webwmaqcdbtgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwmaqcdbtgetfilterdata.class ), "" );
   }

   public webwmaqcdbtgetfilterdata( int remoteHandle ,
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
      webwmaqcdbtgetfilterdata.this.aP5 = new String[] {""};
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
      webwmaqcdbtgetfilterdata.this.AV16DDOName = aP0;
      webwmaqcdbtgetfilterdata.this.AV14SearchTxt = aP1;
      webwmaqcdbtgetfilterdata.this.AV15SearchTxtTo = aP2;
      webwmaqcdbtgetfilterdata.this.aP3 = aP3;
      webwmaqcdbtgetfilterdata.this.aP4 = aP4;
      webwmaqcdbtgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_MAQDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("WebWMaqCdbtGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWMaqCdbtGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WebWMaqCdbtGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV10TFMaqCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV11TFMaqCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV12TFMaqDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV13TFMaqDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMaqCod = AV14SearchTxt ;
      AV11TFMaqCod_Sel = "" ;
      AV53Webwmaqcdbtds_1_filterfulltext = AV48FilterFullText ;
      AV54Webwmaqcdbtds_2_tfmaqcod = AV10TFMaqCod ;
      AV55Webwmaqcdbtds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Webwmaqcdbtds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV57Webwmaqcdbtds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Webwmaqcdbtds_1_filterfulltext ,
                                           AV55Webwmaqcdbtds_3_tfmaqcod_sel ,
                                           AV54Webwmaqcdbtds_2_tfmaqcod ,
                                           AV57Webwmaqcdbtds_5_tfmaqdsc_sel ,
                                           AV56Webwmaqcdbtds_4_tfmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV53Webwmaqcdbtds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Webwmaqcdbtds_1_filterfulltext), "%", "") ;
      lV53Webwmaqcdbtds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Webwmaqcdbtds_1_filterfulltext), "%", "") ;
      lV54Webwmaqcdbtds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Webwmaqcdbtds_2_tfmaqcod), 6, "%") ;
      lV56Webwmaqcdbtds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV56Webwmaqcdbtds_4_tfmaqdsc), 16, "%") ;
      /* Using cursor P08CH2 */
      pr_default.execute(0, new Object[] {lV53Webwmaqcdbtds_1_filterfulltext, lV53Webwmaqcdbtds_1_filterfulltext, lV54Webwmaqcdbtds_2_tfmaqcod, AV55Webwmaqcdbtds_3_tfmaqcod_sel, lV56Webwmaqcdbtds_4_tfmaqdsc, AV57Webwmaqcdbtds_5_tfmaqdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8CH2 = false ;
         A602MaqCod = P08CH2_A602MaqCod[0] ;
         A606MaqDsc = P08CH2_A606MaqDsc[0] ;
         n606MaqDsc = P08CH2_n606MaqDsc[0] ;
         A396EmprCod = P08CH2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08CH2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8CH2 = false ;
            A396EmprCod = P08CH2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8CH2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV18Option = A602MaqCod ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CH2 )
         {
            brk8CH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMAQDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMaqDsc = AV14SearchTxt ;
      AV13TFMaqDsc_Sel = "" ;
      AV53Webwmaqcdbtds_1_filterfulltext = AV48FilterFullText ;
      AV54Webwmaqcdbtds_2_tfmaqcod = AV10TFMaqCod ;
      AV55Webwmaqcdbtds_3_tfmaqcod_sel = AV11TFMaqCod_Sel ;
      AV56Webwmaqcdbtds_4_tfmaqdsc = AV12TFMaqDsc ;
      AV57Webwmaqcdbtds_5_tfmaqdsc_sel = AV13TFMaqDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Webwmaqcdbtds_1_filterfulltext ,
                                           AV55Webwmaqcdbtds_3_tfmaqcod_sel ,
                                           AV54Webwmaqcdbtds_2_tfmaqcod ,
                                           AV57Webwmaqcdbtds_5_tfmaqdsc_sel ,
                                           AV56Webwmaqcdbtds_4_tfmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV53Webwmaqcdbtds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Webwmaqcdbtds_1_filterfulltext), "%", "") ;
      lV53Webwmaqcdbtds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Webwmaqcdbtds_1_filterfulltext), "%", "") ;
      lV54Webwmaqcdbtds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV54Webwmaqcdbtds_2_tfmaqcod), 6, "%") ;
      lV56Webwmaqcdbtds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV56Webwmaqcdbtds_4_tfmaqdsc), 16, "%") ;
      /* Using cursor P08CH3 */
      pr_default.execute(1, new Object[] {lV53Webwmaqcdbtds_1_filterfulltext, lV53Webwmaqcdbtds_1_filterfulltext, lV54Webwmaqcdbtds_2_tfmaqcod, AV55Webwmaqcdbtds_3_tfmaqcod_sel, lV56Webwmaqcdbtds_4_tfmaqdsc, AV57Webwmaqcdbtds_5_tfmaqdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8CH4 = false ;
         A606MaqDsc = P08CH3_A606MaqDsc[0] ;
         n606MaqDsc = P08CH3_n606MaqDsc[0] ;
         A602MaqCod = P08CH3_A602MaqCod[0] ;
         A396EmprCod = P08CH3_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08CH3_A606MaqDsc[0], A606MaqDsc) == 0 ) )
         {
            brk8CH4 = false ;
            A602MaqCod = P08CH3_A602MaqCod[0] ;
            A396EmprCod = P08CH3_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8CH4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A606MaqDsc)==0) )
         {
            AV18Option = A606MaqDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CH4 )
         {
            brk8CH4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwmaqcdbtgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = webwmaqcdbtgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = webwmaqcdbtgetfilterdata.this.AV25OptionIndexesJson;
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
      AV48FilterFullText = "" ;
      AV10TFMaqCod = "" ;
      AV11TFMaqCod_Sel = "" ;
      AV12TFMaqDsc = "" ;
      AV13TFMaqDsc_Sel = "" ;
      A602MaqCod = "" ;
      AV53Webwmaqcdbtds_1_filterfulltext = "" ;
      AV54Webwmaqcdbtds_2_tfmaqcod = "" ;
      AV55Webwmaqcdbtds_3_tfmaqcod_sel = "" ;
      AV56Webwmaqcdbtds_4_tfmaqdsc = "" ;
      AV57Webwmaqcdbtds_5_tfmaqdsc_sel = "" ;
      scmdbuf = "" ;
      lV53Webwmaqcdbtds_1_filterfulltext = "" ;
      lV54Webwmaqcdbtds_2_tfmaqcod = "" ;
      lV56Webwmaqcdbtds_4_tfmaqdsc = "" ;
      A606MaqDsc = "" ;
      P08CH2_A602MaqCod = new String[] {""} ;
      P08CH2_A606MaqDsc = new String[] {""} ;
      P08CH2_n606MaqDsc = new boolean[] {false} ;
      P08CH2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P08CH3_A606MaqDsc = new String[] {""} ;
      P08CH3_n606MaqDsc = new boolean[] {false} ;
      P08CH3_A602MaqCod = new String[] {""} ;
      P08CH3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwmaqcdbtgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08CH2_A602MaqCod, P08CH2_A606MaqDsc, P08CH2_n606MaqDsc, P08CH2_A396EmprCod
            }
            , new Object[] {
            P08CH3_A606MaqDsc, P08CH3_n606MaqDsc, P08CH3_A602MaqCod, P08CH3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV51GXV1 ;
   private long AV26count ;
   private String AV10TFMaqCod ;
   private String AV11TFMaqCod_Sel ;
   private String AV12TFMaqDsc ;
   private String AV13TFMaqDsc_Sel ;
   private String A602MaqCod ;
   private String AV54Webwmaqcdbtds_2_tfmaqcod ;
   private String AV55Webwmaqcdbtds_3_tfmaqcod_sel ;
   private String AV56Webwmaqcdbtds_4_tfmaqdsc ;
   private String AV57Webwmaqcdbtds_5_tfmaqdsc_sel ;
   private String scmdbuf ;
   private String lV54Webwmaqcdbtds_2_tfmaqcod ;
   private String lV56Webwmaqcdbtds_4_tfmaqdsc ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8CH2 ;
   private boolean n606MaqDsc ;
   private boolean brk8CH4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Webwmaqcdbtds_1_filterfulltext ;
   private String lV53Webwmaqcdbtds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08CH2_A602MaqCod ;
   private String[] P08CH2_A606MaqDsc ;
   private boolean[] P08CH2_n606MaqDsc ;
   private String[] P08CH2_A396EmprCod ;
   private String[] P08CH3_A606MaqDsc ;
   private boolean[] P08CH3_n606MaqDsc ;
   private String[] P08CH3_A602MaqCod ;
   private String[] P08CH3_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwmaqcdbtgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Webwmaqcdbtds_1_filterfulltext ,
                                          String AV55Webwmaqcdbtds_3_tfmaqcod_sel ,
                                          String AV54Webwmaqcdbtds_2_tfmaqcod ,
                                          String AV57Webwmaqcdbtds_5_tfmaqdsc_sel ,
                                          String AV56Webwmaqcdbtds_4_tfmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MaqCod, MaqDsc, EmprCod FROM TXPMAQUIN" ;
      if ( ! (GXutil.strcmp("", AV53Webwmaqcdbtds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqCod) like '%' || UPPER(?)) or ( UPPER(MaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Webwmaqcdbtds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Webwmaqcdbtds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Webwmaqcdbtds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Webwmaqcdbtds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Webwmaqcdbtds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Webwmaqcdbtds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08CH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Webwmaqcdbtds_1_filterfulltext ,
                                          String AV55Webwmaqcdbtds_3_tfmaqcod_sel ,
                                          String AV54Webwmaqcdbtds_2_tfmaqcod ,
                                          String AV57Webwmaqcdbtds_5_tfmaqdsc_sel ,
                                          String AV56Webwmaqcdbtds_4_tfmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MaqDsc, MaqCod, EmprCod FROM TXPMAQUIN" ;
      if ( ! (GXutil.strcmp("", AV53Webwmaqcdbtds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqCod) like '%' || UPPER(?)) or ( UPPER(MaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Webwmaqcdbtds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Webwmaqcdbtds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Webwmaqcdbtds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Webwmaqcdbtds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Webwmaqcdbtds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Webwmaqcdbtds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MaqDsc = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqDsc" ;
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
                  return conditional_P08CH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08CH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 16);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 16);
               }
               return;
      }
   }

}

