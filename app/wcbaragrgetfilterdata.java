package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcbaragrgetfilterdata extends GXProcedure
{
   public wcbaragrgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcbaragrgetfilterdata.class ), "" );
   }

   public wcbaragrgetfilterdata( int remoteHandle ,
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
      wcbaragrgetfilterdata.this.aP5 = new String[] {""};
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
      wcbaragrgetfilterdata.this.AV18DDOName = aP0;
      wcbaragrgetfilterdata.this.AV16SearchTxt = aP1;
      wcbaragrgetfilterdata.this.AV17SearchTxtTo = aP2;
      wcbaragrgetfilterdata.this.aP3 = aP3;
      wcbaragrgetfilterdata.this.aP4 = aP4;
      wcbaragrgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARAGRHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRHDROPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("WCBarAgrGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCBarAgrGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("WCBarAgrGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRHDR") == 0 )
         {
            AV39TFBarAGrHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRHDR_SEL") == 0 )
         {
            AV40TFBarAGrHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV41TFKgmAgr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFKgmAgr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV45TFPieAgr = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFPieAgr_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV43TFMtrAgr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFMtrAgr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35EmprCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV36BarCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV37BarCodReo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV38BarCodPar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARAGRHDROPTIONS' Routine */
      returnInSub = false ;
      AV39TFBarAGrHdr = AV16SearchTxt ;
      AV40TFBarAGrHdr_Sel = "" ;
      AV51Wcbaragrds_1_emprcod = AV35EmprCod ;
      AV52Wcbaragrds_2_barcod = AV36BarCod ;
      AV53Wcbaragrds_3_barcodreo = AV37BarCodReo ;
      AV54Wcbaragrds_4_barcodpar = AV38BarCodPar ;
      AV55Wcbaragrds_5_tfbaragrhdr = AV39TFBarAGrHdr ;
      AV56Wcbaragrds_6_tfbaragrhdr_sel = AV40TFBarAGrHdr_Sel ;
      AV57Wcbaragrds_7_tfkgmagr = AV41TFKgmAgr ;
      AV58Wcbaragrds_8_tfkgmagr_to = AV42TFKgmAgr_To ;
      AV59Wcbaragrds_9_tfpieagr = AV45TFPieAgr ;
      AV60Wcbaragrds_10_tfpieagr_to = AV46TFPieAgr_To ;
      AV61Wcbaragrds_11_tfmtragr = AV43TFMtrAgr ;
      AV62Wcbaragrds_12_tfmtragr_to = AV44TFMtrAgr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Wcbaragrds_6_tfbaragrhdr_sel ,
                                           AV55Wcbaragrds_5_tfbaragrhdr ,
                                           AV57Wcbaragrds_7_tfkgmagr ,
                                           AV58Wcbaragrds_8_tfkgmagr_to ,
                                           Short.valueOf(AV59Wcbaragrds_9_tfpieagr) ,
                                           Short.valueOf(AV60Wcbaragrds_10_tfpieagr_to) ,
                                           AV61Wcbaragrds_11_tfmtragr ,
                                           AV62Wcbaragrds_12_tfmtragr_to ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A869MtrAgr ,
                                           AV51Wcbaragrds_1_emprcod ,
                                           Integer.valueOf(AV52Wcbaragrds_2_barcod) ,
                                           Byte.valueOf(AV53Wcbaragrds_3_barcodreo) ,
                                           AV54Wcbaragrds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV55Wcbaragrds_5_tfbaragrhdr = GXutil.padr( GXutil.rtrim( AV55Wcbaragrds_5_tfbaragrhdr), 10, "%") ;
      /* Using cursor P08ZP2 */
      pr_default.execute(0, new Object[] {AV51Wcbaragrds_1_emprcod, Integer.valueOf(AV52Wcbaragrds_2_barcod), Byte.valueOf(AV53Wcbaragrds_3_barcodreo), AV54Wcbaragrds_4_barcodpar, lV55Wcbaragrds_5_tfbaragrhdr, AV56Wcbaragrds_6_tfbaragrhdr_sel, AV57Wcbaragrds_7_tfkgmagr, AV58Wcbaragrds_8_tfkgmagr_to, Short.valueOf(AV59Wcbaragrds_9_tfpieagr), Short.valueOf(AV60Wcbaragrds_10_tfpieagr_to), AV61Wcbaragrds_11_tfmtragr, AV62Wcbaragrds_12_tfmtragr_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A869MtrAgr = P08ZP2_A869MtrAgr[0] ;
         A671PieAgr = P08ZP2_A671PieAgr[0] ;
         A590KgmAgr = P08ZP2_A590KgmAgr[0] ;
         A130BarCodPar = P08ZP2_A130BarCodPar[0] ;
         A132BarCodReo = P08ZP2_A132BarCodReo[0] ;
         A129BarCod = P08ZP2_A129BarCod[0] ;
         A396EmprCod = P08ZP2_A396EmprCod[0] ;
         A122BarAgrPar = P08ZP2_A122BarAgrPar[0] ;
         A124BarAgrReo = P08ZP2_A124BarAgrReo[0] ;
         A119BarAgrCod = P08ZP2_A119BarAgrCod[0] ;
         A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
         if ( ! (GXutil.strcmp("", A13695BarAGrHdr)==0) )
         {
            AV20Option = A13695BarAGrHdr ;
            AV19InsertIndex = 1 ;
            while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
            {
               AV19InsertIndex = (int)(AV19InsertIndex+1) ;
            }
            if ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) == 0 ) )
            {
               AV28count = GXutil.lval( (String)AV26OptionIndexes.elementAt(-1+AV19InsertIndex)) ;
               AV28count = (long)(AV28count+1) ;
               AV26OptionIndexes.removeItem(AV19InsertIndex);
               AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
            }
            else
            {
               AV21Options.add(AV20Option, AV19InsertIndex);
               AV26OptionIndexes.add("1", AV19InsertIndex);
            }
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcbaragrgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = wcbaragrgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = wcbaragrgetfilterdata.this.AV27OptionIndexesJson;
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
      AV39TFBarAGrHdr = "" ;
      AV40TFBarAGrHdr_Sel = "" ;
      AV41TFKgmAgr = DecimalUtil.ZERO ;
      AV42TFKgmAgr_To = DecimalUtil.ZERO ;
      AV43TFMtrAgr = DecimalUtil.ZERO ;
      AV44TFMtrAgr_To = DecimalUtil.ZERO ;
      AV35EmprCod = "" ;
      AV38BarCodPar = "" ;
      A13695BarAGrHdr = "" ;
      AV51Wcbaragrds_1_emprcod = "" ;
      AV54Wcbaragrds_4_barcodpar = "" ;
      AV55Wcbaragrds_5_tfbaragrhdr = "" ;
      AV56Wcbaragrds_6_tfbaragrhdr_sel = "" ;
      AV57Wcbaragrds_7_tfkgmagr = DecimalUtil.ZERO ;
      AV58Wcbaragrds_8_tfkgmagr_to = DecimalUtil.ZERO ;
      AV61Wcbaragrds_11_tfmtragr = DecimalUtil.ZERO ;
      AV62Wcbaragrds_12_tfmtragr_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV55Wcbaragrds_5_tfbaragrhdr = "" ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P08ZP2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZP2_A671PieAgr = new short[1] ;
      P08ZP2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZP2_A130BarCodPar = new String[] {""} ;
      P08ZP2_A132BarCodReo = new byte[1] ;
      P08ZP2_A129BarCod = new int[1] ;
      P08ZP2_A396EmprCod = new String[] {""} ;
      P08ZP2_A122BarAgrPar = new String[] {""} ;
      P08ZP2_A124BarAgrReo = new byte[1] ;
      P08ZP2_A119BarAgrCod = new int[1] ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcbaragrgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08ZP2_A869MtrAgr, P08ZP2_A671PieAgr, P08ZP2_A590KgmAgr, P08ZP2_A130BarCodPar, P08ZP2_A132BarCodReo, P08ZP2_A129BarCod, P08ZP2_A396EmprCod, P08ZP2_A122BarAgrPar, P08ZP2_A124BarAgrReo, P08ZP2_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37BarCodReo ;
   private byte AV53Wcbaragrds_3_barcodreo ;
   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private short AV45TFPieAgr ;
   private short AV46TFPieAgr_To ;
   private short AV59Wcbaragrds_9_tfpieagr ;
   private short AV60Wcbaragrds_10_tfpieagr_to ;
   private short A671PieAgr ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private int AV36BarCod ;
   private int AV52Wcbaragrds_2_barcod ;
   private int A119BarAgrCod ;
   private int A129BarCod ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV41TFKgmAgr ;
   private java.math.BigDecimal AV42TFKgmAgr_To ;
   private java.math.BigDecimal AV43TFMtrAgr ;
   private java.math.BigDecimal AV44TFMtrAgr_To ;
   private java.math.BigDecimal AV57Wcbaragrds_7_tfkgmagr ;
   private java.math.BigDecimal AV58Wcbaragrds_8_tfkgmagr_to ;
   private java.math.BigDecimal AV61Wcbaragrds_11_tfmtragr ;
   private java.math.BigDecimal AV62Wcbaragrds_12_tfmtragr_to ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private String AV39TFBarAGrHdr ;
   private String AV40TFBarAGrHdr_Sel ;
   private String AV35EmprCod ;
   private String AV38BarCodPar ;
   private String A13695BarAGrHdr ;
   private String AV51Wcbaragrds_1_emprcod ;
   private String AV54Wcbaragrds_4_barcodpar ;
   private String AV55Wcbaragrds_5_tfbaragrhdr ;
   private String AV56Wcbaragrds_6_tfbaragrhdr_sel ;
   private String scmdbuf ;
   private String lV55Wcbaragrds_5_tfbaragrhdr ;
   private String A122BarAgrPar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08ZP2_A869MtrAgr ;
   private short[] P08ZP2_A671PieAgr ;
   private java.math.BigDecimal[] P08ZP2_A590KgmAgr ;
   private String[] P08ZP2_A130BarCodPar ;
   private byte[] P08ZP2_A132BarCodReo ;
   private int[] P08ZP2_A129BarCod ;
   private String[] P08ZP2_A396EmprCod ;
   private String[] P08ZP2_A122BarAgrPar ;
   private byte[] P08ZP2_A124BarAgrReo ;
   private int[] P08ZP2_A119BarAgrCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcbaragrgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Wcbaragrds_6_tfbaragrhdr_sel ,
                                          String AV55Wcbaragrds_5_tfbaragrhdr ,
                                          java.math.BigDecimal AV57Wcbaragrds_7_tfkgmagr ,
                                          java.math.BigDecimal AV58Wcbaragrds_8_tfkgmagr_to ,
                                          short AV59Wcbaragrds_9_tfpieagr ,
                                          short AV60Wcbaragrds_10_tfpieagr_to ,
                                          java.math.BigDecimal AV61Wcbaragrds_11_tfmtragr ,
                                          java.math.BigDecimal AV62Wcbaragrds_12_tfmtragr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          short A671PieAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          String AV51Wcbaragrds_1_emprcod ,
                                          int AV52Wcbaragrds_2_barcod ,
                                          byte AV53Wcbaragrds_3_barcodreo ,
                                          String AV54Wcbaragrds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MtrAgr, PieAgr, KgmAgr, BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV56Wcbaragrds_6_tfbaragrhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Wcbaragrds_5_tfbaragrhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrReo,'90'), 2))) || LPAD(RTRIM(BarAgrPar),1,' ')) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Wcbaragrds_6_tfbaragrhdr_sel)==0) )
      {
         addWhere(sWhereString, "(LPAD(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2))),8,'0') || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarAgrReo,'90'), 2))) || LPAD(RTRIM(BarAgrPar),1,' ') = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Wcbaragrds_7_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Wcbaragrds_8_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcbaragrds_9_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV60Wcbaragrds_10_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcbaragrds_11_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcbaragrds_12_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
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
                  return conditional_P08ZP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               return;
      }
   }

}

