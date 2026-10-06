package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcopiaserieclientegetfilterdata extends GXProcedure
{
   public wcopiaserieclientegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcopiaserieclientegetfilterdata.class ), "" );
   }

   public wcopiaserieclientegetfilterdata( int remoteHandle ,
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
      wcopiaserieclientegetfilterdata.this.aP5 = new String[] {""};
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
      wcopiaserieclientegetfilterdata.this.AV34DDOName = aP0;
      wcopiaserieclientegetfilterdata.this.AV35SearchTxt = aP1;
      wcopiaserieclientegetfilterdata.this.AV36SearchTxtTo = aP2;
      wcopiaserieclientegetfilterdata.this.aP3 = aP3;
      wcopiaserieclientegetfilterdata.this.aP4 = aP4;
      wcopiaserieclientegetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADARTCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_ARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADARTDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("FicherosBasicos.wCopiaSerieClienteGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.wCopiaSerieClienteGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FicherosBasicos.wCopiaSerieClienteGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV10TFArtCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV11TFArtCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV12TFArtDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV13TFArtDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFArtCod = AV35SearchTxt ;
      AV11TFArtCod_Sel = "" ;
      AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV10TFArtCod ;
      AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV11TFArtCod_Sel ;
      AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV12TFArtDsc ;
      AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV13TFArtDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                           AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                           AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                           AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                           Integer.valueOf(AV42CliCod_org) ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV43EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod), 16, "%") ;
      lV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc), 26, "%") ;
      /* Using cursor P0A0R2 */
      pr_default.execute(0, new Object[] {AV43EmprCod, lV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod, AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel, lV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc, AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel, Integer.valueOf(AV42CliCod_org)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA0R2 = false ;
         A396EmprCod = P0A0R2_A396EmprCod[0] ;
         A65ArtCod = P0A0R2_A65ArtCod[0] ;
         A252CliCod = P0A0R2_A252CliCod[0] ;
         A69ArtDsc = P0A0R2_A69ArtDsc[0] ;
         n69ArtDsc = P0A0R2_n69ArtDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A0R2_A65ArtCod[0], A65ArtCod) == 0 ) )
         {
            brkA0R2 = false ;
            A396EmprCod = P0A0R2_A396EmprCod[0] ;
            A252CliCod = P0A0R2_A252CliCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkA0R2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A65ArtCod)==0) )
         {
            AV23Option = A65ArtCod ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA0R2 )
         {
            brkA0R2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFArtDsc = AV35SearchTxt ;
      AV13TFArtDsc_Sel = "" ;
      AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = AV10TFArtCod ;
      AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = AV11TFArtCod_Sel ;
      AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = AV12TFArtDsc ;
      AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = AV13TFArtDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                           AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                           AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                           AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                           Integer.valueOf(AV42CliCod_org) ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           AV43EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = GXutil.padr( GXutil.rtrim( AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod), 16, "%") ;
      lV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = GXutil.padr( GXutil.rtrim( AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc), 26, "%") ;
      /* Using cursor P0A0R3 */
      pr_default.execute(1, new Object[] {AV43EmprCod, lV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod, AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel, lV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc, AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel, Integer.valueOf(AV42CliCod_org)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA0R4 = false ;
         A396EmprCod = P0A0R3_A396EmprCod[0] ;
         A69ArtDsc = P0A0R3_A69ArtDsc[0] ;
         n69ArtDsc = P0A0R3_n69ArtDsc[0] ;
         A252CliCod = P0A0R3_A252CliCod[0] ;
         A65ArtCod = P0A0R3_A65ArtCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A0R3_A69ArtDsc[0], A69ArtDsc) == 0 ) )
         {
            brkA0R4 = false ;
            A396EmprCod = P0A0R3_A396EmprCod[0] ;
            A252CliCod = P0A0R3_A252CliCod[0] ;
            A65ArtCod = P0A0R3_A65ArtCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brkA0R4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A69ArtDsc)==0) )
         {
            AV23Option = A69ArtDsc ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA0R4 )
         {
            brkA0R4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcopiaserieclientegetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = wcopiaserieclientegetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = wcopiaserieclientegetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFArtCod = "" ;
      AV11TFArtCod_Sel = "" ;
      AV12TFArtDsc = "" ;
      AV13TFArtDsc_Sel = "" ;
      A65ArtCod = "" ;
      AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = "" ;
      AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel = "" ;
      AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = "" ;
      AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel = "" ;
      scmdbuf = "" ;
      lV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod = "" ;
      lV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc = "" ;
      A69ArtDsc = "" ;
      A396EmprCod = "" ;
      AV43EmprCod = "" ;
      P0A0R2_A396EmprCod = new String[] {""} ;
      P0A0R2_A65ArtCod = new String[] {""} ;
      P0A0R2_A252CliCod = new int[1] ;
      P0A0R2_A69ArtDsc = new String[] {""} ;
      P0A0R2_n69ArtDsc = new boolean[] {false} ;
      AV23Option = "" ;
      P0A0R3_A396EmprCod = new String[] {""} ;
      P0A0R3_A69ArtDsc = new String[] {""} ;
      P0A0R3_n69ArtDsc = new boolean[] {false} ;
      P0A0R3_A252CliCod = new int[1] ;
      P0A0R3_A65ArtCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.wcopiaserieclientegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A0R2_A396EmprCod, P0A0R2_A65ArtCod, P0A0R2_A252CliCod, P0A0R2_A69ArtDsc, P0A0R2_n69ArtDsc
            }
            , new Object[] {
            P0A0R3_A396EmprCod, P0A0R3_A69ArtDsc, P0A0R3_n69ArtDsc, P0A0R3_A252CliCod, P0A0R3_A65ArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV42CliCod_org ;
   private int A252CliCod ;
   private long AV28count ;
   private String AV10TFArtCod ;
   private String AV11TFArtCod_Sel ;
   private String AV12TFArtDsc ;
   private String AV13TFArtDsc_Sel ;
   private String A65ArtCod ;
   private String AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ;
   private String AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ;
   private String AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ;
   private String AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ;
   private String scmdbuf ;
   private String lV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ;
   private String lV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ;
   private String A69ArtDsc ;
   private String A396EmprCod ;
   private String AV43EmprCod ;
   private boolean returnInSub ;
   private boolean brkA0R2 ;
   private boolean n69ArtDsc ;
   private boolean brkA0R4 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A0R2_A396EmprCod ;
   private String[] P0A0R2_A65ArtCod ;
   private int[] P0A0R2_A252CliCod ;
   private String[] P0A0R2_A69ArtDsc ;
   private boolean[] P0A0R2_n69ArtDsc ;
   private String[] P0A0R3_A396EmprCod ;
   private String[] P0A0R3_A69ArtDsc ;
   private boolean[] P0A0R3_n69ArtDsc ;
   private int[] P0A0R3_A252CliCod ;
   private String[] P0A0R3_A65ArtCod ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcopiaserieclientegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A0R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                          String AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                          String AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                          String AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                          int AV42CliCod_org ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV43EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, ArtCod, CliCod, ArtDsc FROM TXPARTICU" ;
      addWhere(sWhereString, "(ArtCod <> '')");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(ArtCod = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(ArtDsc = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV42CliCod_org) )
      {
         addWhere(sWhereString, "(CliCod = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ArtCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A0R3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel ,
                                          String AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod ,
                                          String AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel ,
                                          String AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc ,
                                          int AV42CliCod_org ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String AV43EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[6];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, ArtDsc, CliCod, ArtCod FROM TXPARTICU" ;
      addWhere(sWhereString, "(ArtCod <> '')");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( (GXutil.strcmp("", AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Ficherosbasicos_wcopiaserieclienteds_1_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Ficherosbasicos_wcopiaserieclienteds_2_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(ArtCod = ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Ficherosbasicos_wcopiaserieclienteds_3_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Ficherosbasicos_wcopiaserieclienteds_4_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(ArtDsc = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV42CliCod_org) )
      {
         addWhere(sWhereString, "(CliCod = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ArtDsc" ;
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
                  return conditional_P0A0R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P0A0R3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A0R3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

