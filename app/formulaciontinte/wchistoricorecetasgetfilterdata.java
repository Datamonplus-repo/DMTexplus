package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wchistoricorecetasgetfilterdata extends GXProcedure
{
   public wchistoricorecetasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wchistoricorecetasgetfilterdata.class ), "" );
   }

   public wchistoricorecetasgetfilterdata( int remoteHandle ,
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
      wchistoricorecetasgetfilterdata.this.aP5 = new String[] {""};
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
      wchistoricorecetasgetfilterdata.this.AV18DDOName = aP0;
      wchistoricorecetasgetfilterdata.this.AV16SearchTxt = aP1;
      wchistoricorecetasgetfilterdata.this.AV17SearchTxtTo = aP2;
      wchistoricorecetasgetfilterdata.this.aP3 = aP3;
      wchistoricorecetasgetfilterdata.this.aP4 = aP4;
      wchistoricorecetasgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_HREMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADHREMAQCODOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV29Session.getValue("FormulacionTinte.WCHistoricoRecetasGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCHistoricoRecetasGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FormulacionTinte.WCHistoricoRecetasGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV10TFHreMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV11TFHreMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV41TFHreVolPrd = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFHreVolPrd_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRENUMCIE") == 0 )
         {
            AV12TFHreNumCie = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFHreNumCie_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINMAQ") == 0 )
         {
            AV14TFHreLinMaq = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFHreLinMaq_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV34EmprCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV35HreBarCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV36HreBarReo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV37HreBarPar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREMAQCOD") == 0 )
         {
            AV38Hremaqcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFHreMaqCod = AV16SearchTxt ;
      AV11TFHreMaqCod_Sel = "" ;
      AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext = AV40FilterFullText ;
      AV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = AV10TFHreMaqCod ;
      AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = AV11TFHreMaqCod_Sel ;
      AV50Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd = AV41TFHreVolPrd ;
      AV51Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to = AV42TFHreVolPrd_To ;
      AV52Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie = AV12TFHreNumCie ;
      AV53Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to = AV13TFHreNumCie_To ;
      AV54Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq = AV14TFHreLinMaq ;
      AV55Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to = AV15TFHreLinMaq_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext ,
                                           AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ,
                                           AV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ,
                                           Integer.valueOf(AV50Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd) ,
                                           Integer.valueOf(AV51Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to) ,
                                           Byte.valueOf(AV52Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie) ,
                                           Byte.valueOf(AV53Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to) ,
                                           Short.valueOf(AV54Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq) ,
                                           Short.valueOf(AV55Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to) ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           A396EmprCod ,
                                           AV34EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV35HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV36HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV37HreBarPar ,
                                           AV38Hremaqcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod), 6, "%") ;
      /* Using cursor P08LI2 */
      pr_default.execute(0, new Object[] {AV38Hremaqcod, AV34EmprCod, Integer.valueOf(AV35HreBarCod), Byte.valueOf(AV36HreBarReo), AV37HreBarPar, lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext, lV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod, AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel, Integer.valueOf(AV50Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd), Integer.valueOf(AV51Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to), Byte.valueOf(AV52Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie), Byte.valueOf(AV53Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to), Short.valueOf(AV54Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq), Short.valueOf(AV55Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8LI2 = false ;
         A396EmprCod = P08LI2_A396EmprCod[0] ;
         A4492HreBarCod = P08LI2_A4492HreBarCod[0] ;
         A4493HreBarReo = P08LI2_A4493HreBarReo[0] ;
         A4494HreBarPar = P08LI2_A4494HreBarPar[0] ;
         A4546HreMaqCod = P08LI2_A4546HreMaqCod[0] ;
         n4546HreMaqCod = P08LI2_n4546HreMaqCod[0] ;
         A4545HreLinMaq = P08LI2_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08LI2_A4495HreNumCie[0] ;
         A4547HreVolPrd = P08LI2_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P08LI2_n4547HreVolPrd[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08LI2_A4546HreMaqCod[0], A4546HreMaqCod) == 0 ) )
         {
            brk8LI2 = false ;
            A396EmprCod = P08LI2_A396EmprCod[0] ;
            A4492HreBarCod = P08LI2_A4492HreBarCod[0] ;
            A4493HreBarReo = P08LI2_A4493HreBarReo[0] ;
            A4494HreBarPar = P08LI2_A4494HreBarPar[0] ;
            A4545HreLinMaq = P08LI2_A4545HreLinMaq[0] ;
            A4495HreNumCie = P08LI2_A4495HreNumCie[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8LI2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4546HreMaqCod)==0) )
         {
            AV20Option = A4546HreMaqCod ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8LI2 )
         {
            brk8LI2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wchistoricorecetasgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wchistoricorecetasgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wchistoricorecetasgetfilterdata.this.AV27OptionIndexesJson;
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
      AV40FilterFullText = "" ;
      AV10TFHreMaqCod = "" ;
      AV11TFHreMaqCod_Sel = "" ;
      AV34EmprCod = "" ;
      AV37HreBarPar = "" ;
      AV38Hremaqcod = "" ;
      A4546HreMaqCod = "" ;
      AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext = "" ;
      AV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = "" ;
      AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel = "" ;
      scmdbuf = "" ;
      lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext = "" ;
      lV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P08LI2_A396EmprCod = new String[] {""} ;
      P08LI2_A4492HreBarCod = new int[1] ;
      P08LI2_A4493HreBarReo = new byte[1] ;
      P08LI2_A4494HreBarPar = new String[] {""} ;
      P08LI2_A4546HreMaqCod = new String[] {""} ;
      P08LI2_n4546HreMaqCod = new boolean[] {false} ;
      P08LI2_A4545HreLinMaq = new short[1] ;
      P08LI2_A4495HreNumCie = new byte[1] ;
      P08LI2_A4547HreVolPrd = new int[1] ;
      P08LI2_n4547HreVolPrd = new boolean[] {false} ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wchistoricorecetasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08LI2_A396EmprCod, P08LI2_A4492HreBarCod, P08LI2_A4493HreBarReo, P08LI2_A4494HreBarPar, P08LI2_A4546HreMaqCod, P08LI2_n4546HreMaqCod, P08LI2_A4545HreLinMaq, P08LI2_A4495HreNumCie, P08LI2_A4547HreVolPrd, P08LI2_n4547HreVolPrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFHreNumCie ;
   private byte AV13TFHreNumCie_To ;
   private byte AV36HreBarReo ;
   private byte AV52Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie ;
   private byte AV53Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private short AV14TFHreLinMaq ;
   private short AV15TFHreLinMaq_To ;
   private short AV54Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq ;
   private short AV55Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV41TFHreVolPrd ;
   private int AV42TFHreVolPrd_To ;
   private int AV35HreBarCod ;
   private int AV50Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd ;
   private int AV51Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to ;
   private int A4547HreVolPrd ;
   private int A4492HreBarCod ;
   private long AV28count ;
   private String AV10TFHreMaqCod ;
   private String AV11TFHreMaqCod_Sel ;
   private String AV34EmprCod ;
   private String AV37HreBarPar ;
   private String AV38Hremaqcod ;
   private String A4546HreMaqCod ;
   private String AV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ;
   private String AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ;
   private String scmdbuf ;
   private String lV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private boolean returnInSub ;
   private boolean brk8LI2 ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext ;
   private String lV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08LI2_A396EmprCod ;
   private int[] P08LI2_A4492HreBarCod ;
   private byte[] P08LI2_A4493HreBarReo ;
   private String[] P08LI2_A4494HreBarPar ;
   private String[] P08LI2_A4546HreMaqCod ;
   private boolean[] P08LI2_n4546HreMaqCod ;
   private short[] P08LI2_A4545HreLinMaq ;
   private byte[] P08LI2_A4495HreNumCie ;
   private int[] P08LI2_A4547HreVolPrd ;
   private boolean[] P08LI2_n4547HreVolPrd ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wchistoricorecetasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08LI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext ,
                                          String AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel ,
                                          String AV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod ,
                                          int AV50Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd ,
                                          int AV51Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to ,
                                          byte AV52Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie ,
                                          byte AV53Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to ,
                                          short AV54Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq ,
                                          short AV55Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          String A396EmprCod ,
                                          String AV34EmprCod ,
                                          int A4492HreBarCod ,
                                          int AV35HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV36HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV37HreBarPar ,
                                          String AV38Hremaqcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreMaqCod, HreLinMaq, HreNumCie, HreVolPrd FROM TXPHISREM" ;
      addWhere(sWhereString, "(HreMaqCod = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_wchistoricorecetasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_wchistoricorecetasds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_wchistoricorecetasds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_wchistoricorecetasds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_wchistoricorecetasds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_wchistoricorecetasds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_wchistoricorecetasds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_wchistoricorecetasds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_wchistoricorecetasds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HreMaqCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08LI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               return;
      }
   }

}

