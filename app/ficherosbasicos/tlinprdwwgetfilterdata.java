package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tlinprdwwgetfilterdata extends GXProcedure
{
   public tlinprdwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlinprdwwgetfilterdata.class ), "" );
   }

   public tlinprdwwgetfilterdata( int remoteHandle ,
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
      tlinprdwwgetfilterdata.this.aP5 = new String[] {""};
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
      tlinprdwwgetfilterdata.this.AV16DDOName = aP0;
      tlinprdwwgetfilterdata.this.AV14SearchTxt = aP1;
      tlinprdwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tlinprdwwgetfilterdata.this.aP3 = aP3;
      tlinprdwwgetfilterdata.this.aP4 = aP4;
      tlinprdwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_LINPRDDC") == 0 )
      {
         /* Execute user subroutine: 'LOADLINPRDDCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_LINPRDID") == 0 )
      {
         /* Execute user subroutine: 'LOADLINPRDIDOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TLINPRDWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TLINPRDWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TLINPRDWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLINPRDDC") == 0 )
         {
            AV12TFLinPrdDc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLINPRDDC_SEL") == 0 )
         {
            AV13TFLinPrdDc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLINPRDID") == 0 )
         {
            AV10TFLinPrdID = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLINPRDID_SEL") == 0 )
         {
            AV11TFLinPrdID_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLINPRDDCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFLinPrdDc = AV14SearchTxt ;
      AV13TFLinPrdDc_Sel = "" ;
      AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = AV46FilterFullText ;
      AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc = AV12TFLinPrdDc ;
      AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel = AV13TFLinPrdDc_Sel ;
      AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid = AV10TFLinPrdID ;
      AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel = AV11TFLinPrdID_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext ,
                                           AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel ,
                                           AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc ,
                                           AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel ,
                                           AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid ,
                                           A13079LinPrdDc ,
                                           A13078LinPrdID } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext), "%", "") ;
      lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext), "%", "") ;
      lV52Ficherosbasicos_tlinprdwwds_2_tflinprddc = GXutil.padr( GXutil.rtrim( AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc), 30, "%") ;
      lV54Ficherosbasicos_tlinprdwwds_4_tflinprdid = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid), 4, "%") ;
      /* Using cursor P08172 */
      pr_default.execute(0, new Object[] {lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext, lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext, lV52Ficherosbasicos_tlinprdwwds_2_tflinprddc, AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel, lV54Ficherosbasicos_tlinprdwwds_4_tflinprdid, AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8172 = false ;
         A13079LinPrdDc = P08172_A13079LinPrdDc[0] ;
         n13079LinPrdDc = P08172_n13079LinPrdDc[0] ;
         A13078LinPrdID = P08172_A13078LinPrdID[0] ;
         A396EmprCod = P08172_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08172_A13079LinPrdDc[0], A13079LinPrdDc) == 0 ) )
         {
            brk8172 = false ;
            A13078LinPrdID = P08172_A13078LinPrdID[0] ;
            A396EmprCod = P08172_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8172 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13079LinPrdDc)==0) )
         {
            AV18Option = A13079LinPrdDc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8172 )
         {
            brk8172 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLINPRDIDOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLinPrdID = AV14SearchTxt ;
      AV11TFLinPrdID_Sel = "" ;
      AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = AV46FilterFullText ;
      AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc = AV12TFLinPrdDc ;
      AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel = AV13TFLinPrdDc_Sel ;
      AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid = AV10TFLinPrdID ;
      AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel = AV11TFLinPrdID_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext ,
                                           AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel ,
                                           AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc ,
                                           AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel ,
                                           AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid ,
                                           A13079LinPrdDc ,
                                           A13078LinPrdID } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext), "%", "") ;
      lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext), "%", "") ;
      lV52Ficherosbasicos_tlinprdwwds_2_tflinprddc = GXutil.padr( GXutil.rtrim( AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc), 30, "%") ;
      lV54Ficherosbasicos_tlinprdwwds_4_tflinprdid = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid), 4, "%") ;
      /* Using cursor P08173 */
      pr_default.execute(1, new Object[] {lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext, lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext, lV52Ficherosbasicos_tlinprdwwds_2_tflinprddc, AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel, lV54Ficherosbasicos_tlinprdwwds_4_tflinprdid, AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8174 = false ;
         A13078LinPrdID = P08173_A13078LinPrdID[0] ;
         A13079LinPrdDc = P08173_A13079LinPrdDc[0] ;
         n13079LinPrdDc = P08173_n13079LinPrdDc[0] ;
         A396EmprCod = P08173_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08173_A13078LinPrdID[0], A13078LinPrdID) == 0 ) )
         {
            brk8174 = false ;
            A396EmprCod = P08173_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8174 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A13078LinPrdID)==0) )
         {
            AV18Option = A13078LinPrdID ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8174 )
         {
            brk8174 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tlinprdwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tlinprdwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tlinprdwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFLinPrdDc = "" ;
      AV13TFLinPrdDc_Sel = "" ;
      AV10TFLinPrdID = "" ;
      AV11TFLinPrdID_Sel = "" ;
      A13079LinPrdDc = "" ;
      AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = "" ;
      AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc = "" ;
      AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel = "" ;
      AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid = "" ;
      AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel = "" ;
      scmdbuf = "" ;
      lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext = "" ;
      lV52Ficherosbasicos_tlinprdwwds_2_tflinprddc = "" ;
      lV54Ficherosbasicos_tlinprdwwds_4_tflinprdid = "" ;
      A13078LinPrdID = "" ;
      P08172_A13079LinPrdDc = new String[] {""} ;
      P08172_n13079LinPrdDc = new boolean[] {false} ;
      P08172_A13078LinPrdID = new String[] {""} ;
      P08172_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P08173_A13078LinPrdID = new String[] {""} ;
      P08173_A13079LinPrdDc = new String[] {""} ;
      P08173_n13079LinPrdDc = new boolean[] {false} ;
      P08173_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tlinprdwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08172_A13079LinPrdDc, P08172_n13079LinPrdDc, P08172_A13078LinPrdID, P08172_A396EmprCod
            }
            , new Object[] {
            P08173_A13078LinPrdID, P08173_A13079LinPrdDc, P08173_n13079LinPrdDc, P08173_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV49GXV1 ;
   private long AV26count ;
   private String AV12TFLinPrdDc ;
   private String AV13TFLinPrdDc_Sel ;
   private String AV10TFLinPrdID ;
   private String AV11TFLinPrdID_Sel ;
   private String A13079LinPrdDc ;
   private String AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc ;
   private String AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel ;
   private String AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid ;
   private String AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel ;
   private String scmdbuf ;
   private String lV52Ficherosbasicos_tlinprdwwds_2_tflinprddc ;
   private String lV54Ficherosbasicos_tlinprdwwds_4_tflinprdid ;
   private String A13078LinPrdID ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8172 ;
   private boolean n13079LinPrdDc ;
   private boolean brk8174 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext ;
   private String lV51Ficherosbasicos_tlinprdwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08172_A13079LinPrdDc ;
   private boolean[] P08172_n13079LinPrdDc ;
   private String[] P08172_A13078LinPrdID ;
   private String[] P08172_A396EmprCod ;
   private String[] P08173_A13078LinPrdID ;
   private String[] P08173_A13079LinPrdDc ;
   private boolean[] P08173_n13079LinPrdDc ;
   private String[] P08173_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tlinprdwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08172( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext ,
                                          String AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel ,
                                          String AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc ,
                                          String AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel ,
                                          String AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid ,
                                          String A13079LinPrdDc ,
                                          String A13078LinPrdID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT LinPrdDc, LinPrdID, EmprCod FROM TXPLINPRD" ;
      if ( ! (GXutil.strcmp("", AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LinPrdDc) like '%' || UPPER(?)) or ( UPPER(LinPrdID) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel)==0) && ( ! (GXutil.strcmp("", AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LinPrdDc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel)==0) )
      {
         addWhere(sWhereString, "(LinPrdDc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LinPrdID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel)==0) )
      {
         addWhere(sWhereString, "(LinPrdID = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LinPrdDc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08173( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext ,
                                          String AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel ,
                                          String AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc ,
                                          String AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel ,
                                          String AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid ,
                                          String A13079LinPrdDc ,
                                          String A13078LinPrdID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT LinPrdID, LinPrdDc, EmprCod FROM TXPLINPRD" ;
      if ( ! (GXutil.strcmp("", AV51Ficherosbasicos_tlinprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LinPrdDc) like '%' || UPPER(?)) or ( UPPER(LinPrdID) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel)==0) && ( ! (GXutil.strcmp("", AV52Ficherosbasicos_tlinprdwwds_2_tflinprddc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LinPrdDc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_tlinprdwwds_3_tflinprddc_sel)==0) )
      {
         addWhere(sWhereString, "(LinPrdDc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_tlinprdwwds_4_tflinprdid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LinPrdID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tlinprdwwds_5_tflinprdid_sel)==0) )
      {
         addWhere(sWhereString, "(LinPrdID = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LinPrdID" ;
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
                  return conditional_P08172(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
            case 1 :
                  return conditional_P08173(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08172", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08173", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 4);
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
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 4);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 4);
               }
               return;
      }
   }

}

