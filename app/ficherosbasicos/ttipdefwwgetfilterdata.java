package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipdefwwgetfilterdata extends GXProcedure
{
   public ttipdefwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipdefwwgetfilterdata.class ), "" );
   }

   public ttipdefwwgetfilterdata( int remoteHandle ,
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
      ttipdefwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipdefwwgetfilterdata.this.AV36DDOName = aP0;
      ttipdefwwgetfilterdata.this.AV34SearchTxt = aP1;
      ttipdefwwgetfilterdata.this.AV35SearchTxtTo = aP2;
      ttipdefwwgetfilterdata.this.aP3 = aP3;
      ttipdefwwgetfilterdata.this.aP4 = aP4;
      ttipdefwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_TIPDEFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPDEFDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_TIPDEFDS2") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPDEFDS2OPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV39Options.toJSonString(false) ;
      AV43OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV44OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("FicherosBasicos.TTIPDEFWWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTIPDEFWWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("FicherosBasicos.TTIPDEFWWGridState"), null, null);
      }
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV66FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFCOD") == 0 )
         {
            AV10TFTipDefCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipDefCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC") == 0 )
         {
            AV12TFTipDefDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC_SEL") == 0 )
         {
            AV13TFTipDefDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDS2") == 0 )
         {
            AV14TFTipDefDs2 = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDS2_SEL") == 0 )
         {
            AV15TFTipDefDs2_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPDEFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipDefDsc = AV34SearchTxt ;
      AV13TFTipDefDsc_Sel = "" ;
      AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = AV66FilterFullText ;
      AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod = AV10TFTipDefCod ;
      AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to = AV11TFTipDefCod_To ;
      AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc = AV12TFTipDefDsc ;
      AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel = AV13TFTipDefDsc_Sel ;
      AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 = AV14TFTipDefDs2 ;
      AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel = AV15TFTipDefDs2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext ,
                                           Short.valueOf(AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod) ,
                                           Short.valueOf(AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to) ,
                                           AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel ,
                                           AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc ,
                                           AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel ,
                                           AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 ,
                                           Short.valueOf(A833TipDefCod) ,
                                           A834TipDefDsc ,
                                           A6870TipDefDs2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext), "%", "") ;
      lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext), "%", "") ;
      lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext), "%", "") ;
      lV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc), 30, "%") ;
      lV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 = GXutil.padr( GXutil.rtrim( AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2), 30, "%") ;
      /* Using cursor P081N2 */
      pr_default.execute(0, new Object[] {lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext, lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext, lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext, Short.valueOf(AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod), Short.valueOf(AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to), lV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc, AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel, lV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2, AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk81N2 = false ;
         A834TipDefDsc = P081N2_A834TipDefDsc[0] ;
         n834TipDefDsc = P081N2_n834TipDefDsc[0] ;
         A6870TipDefDs2 = P081N2_A6870TipDefDs2[0] ;
         n6870TipDefDs2 = P081N2_n6870TipDefDs2[0] ;
         A833TipDefCod = P081N2_A833TipDefCod[0] ;
         A396EmprCod = P081N2_A396EmprCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P081N2_A834TipDefDsc[0], A834TipDefDsc) == 0 ) )
         {
            brk81N2 = false ;
            A833TipDefCod = P081N2_A833TipDefCod[0] ;
            A396EmprCod = P081N2_A396EmprCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk81N2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A834TipDefDsc)==0) )
         {
            AV38Option = A834TipDefDsc ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81N2 )
         {
            brk81N2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADTIPDEFDS2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFTipDefDs2 = AV34SearchTxt ;
      AV15TFTipDefDs2_Sel = "" ;
      AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = AV66FilterFullText ;
      AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod = AV10TFTipDefCod ;
      AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to = AV11TFTipDefCod_To ;
      AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc = AV12TFTipDefDsc ;
      AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel = AV13TFTipDefDsc_Sel ;
      AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 = AV14TFTipDefDs2 ;
      AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel = AV15TFTipDefDs2_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext ,
                                           Short.valueOf(AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod) ,
                                           Short.valueOf(AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to) ,
                                           AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel ,
                                           AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc ,
                                           AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel ,
                                           AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 ,
                                           Short.valueOf(A833TipDefCod) ,
                                           A834TipDefDsc ,
                                           A6870TipDefDs2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext), "%", "") ;
      lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext), "%", "") ;
      lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext), "%", "") ;
      lV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc), 30, "%") ;
      lV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 = GXutil.padr( GXutil.rtrim( AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2), 30, "%") ;
      /* Using cursor P081N3 */
      pr_default.execute(1, new Object[] {lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext, lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext, lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext, Short.valueOf(AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod), Short.valueOf(AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to), lV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc, AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel, lV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2, AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk81N4 = false ;
         A6870TipDefDs2 = P081N3_A6870TipDefDs2[0] ;
         n6870TipDefDs2 = P081N3_n6870TipDefDs2[0] ;
         A834TipDefDsc = P081N3_A834TipDefDsc[0] ;
         n834TipDefDsc = P081N3_n834TipDefDsc[0] ;
         A833TipDefCod = P081N3_A833TipDefCod[0] ;
         A396EmprCod = P081N3_A396EmprCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P081N3_A6870TipDefDs2[0], A6870TipDefDs2) == 0 ) )
         {
            brk81N4 = false ;
            A833TipDefCod = P081N3_A833TipDefCod[0] ;
            A396EmprCod = P081N3_A396EmprCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk81N4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6870TipDefDs2)==0) )
         {
            AV38Option = A6870TipDefDs2 ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81N4 )
         {
            brk81N4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipdefwwgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = ttipdefwwgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = ttipdefwwgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40OptionsJson = "" ;
      AV43OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV66FilterFullText = "" ;
      AV12TFTipDefDsc = "" ;
      AV13TFTipDefDsc_Sel = "" ;
      AV14TFTipDefDs2 = "" ;
      AV15TFTipDefDs2_Sel = "" ;
      A834TipDefDsc = "" ;
      AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = "" ;
      AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc = "" ;
      AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel = "" ;
      AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 = "" ;
      AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel = "" ;
      scmdbuf = "" ;
      lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext = "" ;
      lV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc = "" ;
      lV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 = "" ;
      A6870TipDefDs2 = "" ;
      P081N2_A834TipDefDsc = new String[] {""} ;
      P081N2_n834TipDefDsc = new boolean[] {false} ;
      P081N2_A6870TipDefDs2 = new String[] {""} ;
      P081N2_n6870TipDefDs2 = new boolean[] {false} ;
      P081N2_A833TipDefCod = new short[1] ;
      P081N2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV38Option = "" ;
      P081N3_A6870TipDefDs2 = new String[] {""} ;
      P081N3_n6870TipDefDs2 = new boolean[] {false} ;
      P081N3_A834TipDefDsc = new String[] {""} ;
      P081N3_n834TipDefDsc = new boolean[] {false} ;
      P081N3_A833TipDefCod = new short[1] ;
      P081N3_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipdefwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P081N2_A834TipDefDsc, P081N2_n834TipDefDsc, P081N2_A6870TipDefDs2, P081N2_n6870TipDefDs2, P081N2_A833TipDefCod, P081N2_A396EmprCod
            }
            , new Object[] {
            P081N3_A6870TipDefDs2, P081N3_n6870TipDefDs2, P081N3_A834TipDefDsc, P081N3_n834TipDefDsc, P081N3_A833TipDefCod, P081N3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTipDefCod ;
   private short AV11TFTipDefCod_To ;
   private short AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod ;
   private short AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV69GXV1 ;
   private long AV46count ;
   private String AV12TFTipDefDsc ;
   private String AV13TFTipDefDsc_Sel ;
   private String AV14TFTipDefDs2 ;
   private String AV15TFTipDefDs2_Sel ;
   private String A834TipDefDsc ;
   private String AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc ;
   private String AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel ;
   private String AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 ;
   private String AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel ;
   private String scmdbuf ;
   private String lV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc ;
   private String lV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 ;
   private String A6870TipDefDs2 ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk81N2 ;
   private boolean n834TipDefDsc ;
   private boolean n6870TipDefDs2 ;
   private boolean brk81N4 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV66FilterFullText ;
   private String AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext ;
   private String lV71Ficherosbasicos_ttipdefwwds_1_filterfulltext ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P081N2_A834TipDefDsc ;
   private boolean[] P081N2_n834TipDefDsc ;
   private String[] P081N2_A6870TipDefDs2 ;
   private boolean[] P081N2_n6870TipDefDs2 ;
   private short[] P081N2_A833TipDefCod ;
   private String[] P081N2_A396EmprCod ;
   private String[] P081N3_A6870TipDefDs2 ;
   private boolean[] P081N3_n6870TipDefDs2 ;
   private String[] P081N3_A834TipDefDsc ;
   private boolean[] P081N3_n834TipDefDsc ;
   private short[] P081N3_A833TipDefCod ;
   private String[] P081N3_A396EmprCod ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class ttipdefwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081N2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext ,
                                          short AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod ,
                                          short AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to ,
                                          String AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel ,
                                          String AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc ,
                                          String AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel ,
                                          String AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 ,
                                          short A833TipDefCod ,
                                          String A834TipDefDsc ,
                                          String A6870TipDefDs2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipDefDsc, TipDefDs2, TipDefCod, EmprCod FROM TXPTIPDEF" ;
      if ( ! (GXutil.strcmp("", AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipDefCod,'9990'), 2) like '%' || ?) or ( UPPER(TipDefDsc) like '%' || UPPER(?)) or ( UPPER(TipDefDs2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod) )
      {
         addWhere(sWhereString, "(TipDefCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to) )
      {
         addWhere(sWhereString, "(TipDefCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipDefDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel)==0) && ( ! (GXutil.strcmp("", AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDefDs2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel)==0) )
      {
         addWhere(sWhereString, "(TipDefDs2 = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipDefDsc" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P081N3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext ,
                                          short AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod ,
                                          short AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to ,
                                          String AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel ,
                                          String AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc ,
                                          String AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel ,
                                          String AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2 ,
                                          short A833TipDefCod ,
                                          String A834TipDefDsc ,
                                          String A6870TipDefDs2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT TipDefDs2, TipDefDsc, TipDefCod, EmprCod FROM TXPTIPDEF" ;
      if ( ! (GXutil.strcmp("", AV71Ficherosbasicos_ttipdefwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipDefCod,'9990'), 2) like '%' || ?) or ( UPPER(TipDefDsc) like '%' || UPPER(?)) or ( UPPER(TipDefDs2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV72Ficherosbasicos_ttipdefwwds_2_tftipdefcod) )
      {
         addWhere(sWhereString, "(TipDefCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV73Ficherosbasicos_ttipdefwwds_3_tftipdefcod_to) )
      {
         addWhere(sWhereString, "(TipDefCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV74Ficherosbasicos_ttipdefwwds_4_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Ficherosbasicos_ttipdefwwds_5_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipDefDsc = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel)==0) && ( ! (GXutil.strcmp("", AV76Ficherosbasicos_ttipdefwwds_6_tftipdefds2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDefDs2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Ficherosbasicos_ttipdefwwds_7_tftipdefds2_sel)==0) )
      {
         addWhere(sWhereString, "(TipDefDs2 = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipDefDs2" ;
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
                  return conditional_P081N2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 1 :
                  return conditional_P081N3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081N2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P081N3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
      }
   }

}

