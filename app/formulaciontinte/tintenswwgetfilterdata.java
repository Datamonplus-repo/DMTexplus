package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tintenswwgetfilterdata extends GXProcedure
{
   public tintenswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tintenswwgetfilterdata.class ), "" );
   }

   public tintenswwgetfilterdata( int remoteHandle ,
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
      tintenswwgetfilterdata.this.aP5 = new String[] {""};
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
      tintenswwgetfilterdata.this.AV16DDOName = aP0;
      tintenswwgetfilterdata.this.AV14SearchTxt = aP1;
      tintenswwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tintenswwgetfilterdata.this.aP3 = aP3;
      tintenswwgetfilterdata.this.aP4 = aP4;
      tintenswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_INTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADINTDSCOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("FormulacionTinte.TINTENSWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      AV42GXV1 = 1 ;
      while ( AV42GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV42GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV10TFIntCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFIntCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV12TFIntDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV13TFIntDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTACT_SEL") == 0 )
         {
            AV39TFIntAct_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTORDER") == 0 )
         {
            AV35TFIntOrder = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFIntOrder_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTLAVA") == 0 )
         {
            AV37TFIntLava = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFIntLava_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV42GXV1 = (int)(AV42GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADINTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFIntDsc = AV14SearchTxt ;
      AV13TFIntDsc_Sel = "" ;
      AV44Formulaciontinte_tintenswwds_1_filterfulltext = AV34FilterFullText ;
      AV45Formulaciontinte_tintenswwds_2_tfintcod = AV10TFIntCod ;
      AV46Formulaciontinte_tintenswwds_3_tfintcod_to = AV11TFIntCod_To ;
      AV47Formulaciontinte_tintenswwds_4_tfintdsc = AV12TFIntDsc ;
      AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel = AV13TFIntDsc_Sel ;
      AV49Formulaciontinte_tintenswwds_6_tfintact_sel = AV39TFIntAct_Sel ;
      AV50Formulaciontinte_tintenswwds_7_tfintorder = AV35TFIntOrder ;
      AV51Formulaciontinte_tintenswwds_8_tfintorder_to = AV36TFIntOrder_To ;
      AV52Formulaciontinte_tintenswwds_9_tfintlava = AV37TFIntLava ;
      AV53Formulaciontinte_tintenswwds_10_tfintlava_to = AV38TFIntLava_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV44Formulaciontinte_tintenswwds_1_filterfulltext ,
                                           Byte.valueOf(AV45Formulaciontinte_tintenswwds_2_tfintcod) ,
                                           Byte.valueOf(AV46Formulaciontinte_tintenswwds_3_tfintcod_to) ,
                                           AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                           AV47Formulaciontinte_tintenswwds_4_tfintdsc ,
                                           AV49Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                           Short.valueOf(AV50Formulaciontinte_tintenswwds_7_tfintorder) ,
                                           Short.valueOf(AV51Formulaciontinte_tintenswwds_8_tfintorder_to) ,
                                           AV52Formulaciontinte_tintenswwds_9_tfintlava ,
                                           AV53Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Short.valueOf(A13296IntOrder) ,
                                           A5991IntLava ,
                                           A14255IntAct } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV44Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV44Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV47Formulaciontinte_tintenswwds_4_tfintdsc = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_tintenswwds_4_tfintdsc), 30, "%") ;
      /* Using cursor P08H12 */
      pr_default.execute(0, new Object[] {lV44Formulaciontinte_tintenswwds_1_filterfulltext, lV44Formulaciontinte_tintenswwds_1_filterfulltext, lV44Formulaciontinte_tintenswwds_1_filterfulltext, lV44Formulaciontinte_tintenswwds_1_filterfulltext, Byte.valueOf(AV45Formulaciontinte_tintenswwds_2_tfintcod), Byte.valueOf(AV46Formulaciontinte_tintenswwds_3_tfintcod_to), lV47Formulaciontinte_tintenswwds_4_tfintdsc, AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel, AV49Formulaciontinte_tintenswwds_6_tfintact_sel, Short.valueOf(AV50Formulaciontinte_tintenswwds_7_tfintorder), Short.valueOf(AV51Formulaciontinte_tintenswwds_8_tfintorder_to), AV52Formulaciontinte_tintenswwds_9_tfintlava, AV53Formulaciontinte_tintenswwds_10_tfintlava_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8H12 = false ;
         A584IntDsc = P08H12_A584IntDsc[0] ;
         n584IntDsc = P08H12_n584IntDsc[0] ;
         A5991IntLava = P08H12_A5991IntLava[0] ;
         n5991IntLava = P08H12_n5991IntLava[0] ;
         A13296IntOrder = P08H12_A13296IntOrder[0] ;
         n13296IntOrder = P08H12_n13296IntOrder[0] ;
         A14255IntAct = P08H12_A14255IntAct[0] ;
         A583IntCod = P08H12_A583IntCod[0] ;
         A396EmprCod = P08H12_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08H12_A584IntDsc[0], A584IntDsc) == 0 ) )
         {
            brk8H12 = false ;
            A583IntCod = P08H12_A583IntCod[0] ;
            A396EmprCod = P08H12_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8H12 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A584IntDsc)==0) )
         {
            AV18Option = A584IntDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8H12 )
         {
            brk8H12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tintenswwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tintenswwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tintenswwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV12TFIntDsc = "" ;
      AV13TFIntDsc_Sel = "" ;
      AV39TFIntAct_Sel = "" ;
      AV37TFIntLava = DecimalUtil.ZERO ;
      AV38TFIntLava_To = DecimalUtil.ZERO ;
      A584IntDsc = "" ;
      AV44Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      AV47Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel = "" ;
      AV49Formulaciontinte_tintenswwds_6_tfintact_sel = "" ;
      AV52Formulaciontinte_tintenswwds_9_tfintlava = DecimalUtil.ZERO ;
      AV53Formulaciontinte_tintenswwds_10_tfintlava_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV44Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      lV47Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      A5991IntLava = DecimalUtil.ZERO ;
      A14255IntAct = "" ;
      P08H12_A584IntDsc = new String[] {""} ;
      P08H12_n584IntDsc = new boolean[] {false} ;
      P08H12_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08H12_n5991IntLava = new boolean[] {false} ;
      P08H12_A13296IntOrder = new short[1] ;
      P08H12_n13296IntOrder = new boolean[] {false} ;
      P08H12_A14255IntAct = new String[] {""} ;
      P08H12_A583IntCod = new byte[1] ;
      P08H12_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintenswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08H12_A584IntDsc, P08H12_n584IntDsc, P08H12_A5991IntLava, P08H12_n5991IntLava, P08H12_A13296IntOrder, P08H12_n13296IntOrder, P08H12_A14255IntAct, P08H12_A583IntCod, P08H12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFIntCod ;
   private byte AV11TFIntCod_To ;
   private byte AV45Formulaciontinte_tintenswwds_2_tfintcod ;
   private byte AV46Formulaciontinte_tintenswwds_3_tfintcod_to ;
   private byte A583IntCod ;
   private short AV35TFIntOrder ;
   private short AV36TFIntOrder_To ;
   private short AV50Formulaciontinte_tintenswwds_7_tfintorder ;
   private short AV51Formulaciontinte_tintenswwds_8_tfintorder_to ;
   private short A13296IntOrder ;
   private short Gx_err ;
   private int AV42GXV1 ;
   private long AV26count ;
   private java.math.BigDecimal AV37TFIntLava ;
   private java.math.BigDecimal AV38TFIntLava_To ;
   private java.math.BigDecimal AV52Formulaciontinte_tintenswwds_9_tfintlava ;
   private java.math.BigDecimal AV53Formulaciontinte_tintenswwds_10_tfintlava_to ;
   private java.math.BigDecimal A5991IntLava ;
   private String AV12TFIntDsc ;
   private String AV13TFIntDsc_Sel ;
   private String AV39TFIntAct_Sel ;
   private String A584IntDsc ;
   private String AV47Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel ;
   private String AV49Formulaciontinte_tintenswwds_6_tfintact_sel ;
   private String scmdbuf ;
   private String lV47Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String A14255IntAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8H12 ;
   private boolean n584IntDsc ;
   private boolean n5991IntLava ;
   private boolean n13296IntOrder ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV44Formulaciontinte_tintenswwds_1_filterfulltext ;
   private String lV44Formulaciontinte_tintenswwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08H12_A584IntDsc ;
   private boolean[] P08H12_n584IntDsc ;
   private java.math.BigDecimal[] P08H12_A5991IntLava ;
   private boolean[] P08H12_n5991IntLava ;
   private short[] P08H12_A13296IntOrder ;
   private boolean[] P08H12_n13296IntOrder ;
   private String[] P08H12_A14255IntAct ;
   private byte[] P08H12_A583IntCod ;
   private String[] P08H12_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tintenswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08H12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV44Formulaciontinte_tintenswwds_1_filterfulltext ,
                                          byte AV45Formulaciontinte_tintenswwds_2_tfintcod ,
                                          byte AV46Formulaciontinte_tintenswwds_3_tfintcod_to ,
                                          String AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                          String AV47Formulaciontinte_tintenswwds_4_tfintdsc ,
                                          String AV49Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                          short AV50Formulaciontinte_tintenswwds_7_tfintorder ,
                                          short AV51Formulaciontinte_tintenswwds_8_tfintorder_to ,
                                          java.math.BigDecimal AV52Formulaciontinte_tintenswwds_9_tfintlava ,
                                          java.math.BigDecimal AV53Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          short A13296IntOrder ,
                                          java.math.BigDecimal A5991IntLava ,
                                          String A14255IntAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT IntDsc, IntLava, IntOrder, IntAct, IntCod, EmprCod FROM TXPINTENS" ;
      if ( ! (GXutil.strcmp("", AV44Formulaciontinte_tintenswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(IntCod,'90'), 2) like '%' || ?) or ( UPPER(IntDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(IntOrder,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(IntLava,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_tintenswwds_2_tfintcod) )
      {
         addWhere(sWhereString, "(IntCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV46Formulaciontinte_tintenswwds_3_tfintcod_to) )
      {
         addWhere(sWhereString, "(IntCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_tintenswwds_4_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(IntDsc = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_tintenswwds_6_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(IntAct = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_tintenswwds_7_tfintorder) )
      {
         addWhere(sWhereString, "(IntOrder >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_tintenswwds_8_tfintorder_to) )
      {
         addWhere(sWhereString, "(IntOrder <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Formulaciontinte_tintenswwds_9_tfintlava)==0) )
      {
         addWhere(sWhereString, "(IntLava >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Formulaciontinte_tintenswwds_10_tfintlava_to)==0) )
      {
         addWhere(sWhereString, "(IntLava <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY IntDsc" ;
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
                  return conditional_P08H12(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08H12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               return;
      }
   }

}

