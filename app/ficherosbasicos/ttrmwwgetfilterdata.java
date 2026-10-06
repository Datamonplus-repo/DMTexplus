package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrmwwgetfilterdata extends GXProcedure
{
   public ttrmwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrmwwgetfilterdata.class ), "" );
   }

   public ttrmwwgetfilterdata( int remoteHandle ,
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
      ttrmwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttrmwwgetfilterdata.this.AV34DDOName = aP0;
      ttrmwwgetfilterdata.this.AV35SearchTxt = aP1;
      ttrmwwgetfilterdata.this.AV36SearchTxtTo = aP2;
      ttrmwwgetfilterdata.this.aP3 = aP3;
      ttrmwwgetfilterdata.this.aP4 = aP4;
      ttrmwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_TRMDIVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRMDIVNOMOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV29Session.getValue("FicherosBasicos.TTRMWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTRMWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FicherosBasicos.TTRMWWGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVID") == 0 )
         {
            AV10TFTRMDivID = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTRMDivID_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM") == 0 )
         {
            AV12TFTRMDivNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMDIVNOM_SEL") == 0 )
         {
            AV13TFTRMDivNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMFECHA") == 0 )
         {
            AV14TFTRMFecha = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMCOMPRA") == 0 )
         {
            AV16TFTRMCompra = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFTRMCompra_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMVENTA") == 0 )
         {
            AV18TFTRMVenta = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFTRMVenta_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRMAUTMAN_SEL") == 0 )
         {
            AV20TFTRMAutMan_SelsJson = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV21TFTRMAutMan_Sels.fromJSonString(AV20TFTRMAutMan_SelsJson, null);
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTRMDIVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTRMDivNom = AV35SearchTxt ;
      AV13TFTRMDivNom_Sel = "" ;
      AV45Ficherosbasicos_ttrmwwds_1_filterfulltext = AV40FilterFullText ;
      AV46Ficherosbasicos_ttrmwwds_2_tftrmdivid = AV10TFTRMDivID ;
      AV47Ficherosbasicos_ttrmwwds_3_tftrmdivid_to = AV11TFTRMDivID_To ;
      AV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom = AV12TFTRMDivNom ;
      AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = AV13TFTRMDivNom_Sel ;
      AV50Ficherosbasicos_ttrmwwds_6_tftrmfecha = AV14TFTRMFecha ;
      AV51Ficherosbasicos_ttrmwwds_7_tftrmcompra = AV16TFTRMCompra ;
      AV52Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = AV17TFTRMCompra_To ;
      AV53Ficherosbasicos_ttrmwwds_9_tftrmventa = AV18TFTRMVenta ;
      AV54Ficherosbasicos_ttrmwwds_10_tftrmventa_to = AV19TFTRMVenta_To ;
      AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = AV21TFTRMAutMan_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14110TRMAutMan ,
                                           AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                           Byte.valueOf(AV46Ficherosbasicos_ttrmwwds_2_tftrmdivid) ,
                                           Byte.valueOf(AV47Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) ,
                                           AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                           AV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                           AV50Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                           AV51Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                           AV52Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                           AV53Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                           AV54Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                           Integer.valueOf(AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels.size()) ,
                                           Byte.valueOf(A14105TRMDivID) ,
                                           A14107TRMDivNom ,
                                           A14106TRMFecha ,
                                           A14108TRMCompra ,
                                           A14109TRMVenta ,
                                           AV45Ficherosbasicos_ttrmwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom = GXutil.padr( GXutil.rtrim( AV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom), 30, "%") ;
      /* Using cursor P09QH2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV46Ficherosbasicos_ttrmwwds_2_tftrmdivid), Byte.valueOf(AV47Ficherosbasicos_ttrmwwds_3_tftrmdivid_to), lV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom, AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel, AV50Ficherosbasicos_ttrmwwds_6_tftrmfecha, AV51Ficherosbasicos_ttrmwwds_7_tftrmcompra, AV52Ficherosbasicos_ttrmwwds_8_tftrmcompra_to, AV53Ficherosbasicos_ttrmwwds_9_tftrmventa, AV54Ficherosbasicos_ttrmwwds_10_tftrmventa_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9QH2 = false ;
         A14105TRMDivID = P09QH2_A14105TRMDivID[0] ;
         A14109TRMVenta = P09QH2_A14109TRMVenta[0] ;
         A14108TRMCompra = P09QH2_A14108TRMCompra[0] ;
         A14106TRMFecha = P09QH2_A14106TRMFecha[0] ;
         A14107TRMDivNom = P09QH2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QH2_n14107TRMDivNom[0] ;
         A14110TRMAutMan = P09QH2_A14110TRMAutMan[0] ;
         A396EmprCod = P09QH2_A396EmprCod[0] ;
         A14107TRMDivNom = P09QH2_A14107TRMDivNom[0] ;
         n14107TRMDivNom = P09QH2_n14107TRMDivNom[0] ;
         if ( (GXutil.strcmp("", AV45Ficherosbasicos_ttrmwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A14105TRMDivID, 2, 0) , GXutil.padr( "%" + AV45Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14107TRMDivNom) , GXutil.padr( "%" + GXutil.upper( AV45Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14108TRMCompra, 11, 2) , GXutil.padr( "%" + AV45Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14109TRMVenta, 11, 2) , GXutil.padr( "%" + AV45Ficherosbasicos_ttrmwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automática", ""), "") , GXutil.padr( "%" + GXutil.lower( AV45Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV45Ficherosbasicos_ttrmwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A14110TRMAutMan, httpContext.getMessage( "M", "")) == 0 ) ) ) )
         {
            AV28count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( P09QH2_A14105TRMDivID[0] == A14105TRMDivID ) )
            {
               brk9QH2 = false ;
               A14106TRMFecha = P09QH2_A14106TRMFecha[0] ;
               A396EmprCod = P09QH2_A396EmprCod[0] ;
               AV28count = (long)(AV28count+1) ;
               brk9QH2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A14107TRMDivNom)==0) )
            {
               AV23Option = A14107TRMDivNom ;
               AV22InsertIndex = 1 ;
               while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
               {
                  AV22InsertIndex = (int)(AV22InsertIndex+1) ;
               }
               AV24Options.add(AV23Option, AV22InsertIndex);
               AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
            }
            if ( AV24Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9QH2 )
         {
            brk9QH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrmwwgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = ttrmwwgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = ttrmwwgetfilterdata.this.AV39OptionIndexesJson;
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
      AV40FilterFullText = "" ;
      AV12TFTRMDivNom = "" ;
      AV13TFTRMDivNom_Sel = "" ;
      AV14TFTRMFecha = GXutil.resetTime( GXutil.nullDate() );
      AV16TFTRMCompra = DecimalUtil.ZERO ;
      AV17TFTRMCompra_To = DecimalUtil.ZERO ;
      AV18TFTRMVenta = DecimalUtil.ZERO ;
      AV19TFTRMVenta_To = DecimalUtil.ZERO ;
      AV20TFTRMAutMan_SelsJson = "" ;
      AV21TFTRMAutMan_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A14107TRMDivNom = "" ;
      AV45Ficherosbasicos_ttrmwwds_1_filterfulltext = "" ;
      AV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel = "" ;
      AV50Ficherosbasicos_ttrmwwds_6_tftrmfecha = GXutil.resetTime( GXutil.nullDate() );
      AV51Ficherosbasicos_ttrmwwds_7_tftrmcompra = DecimalUtil.ZERO ;
      AV52Ficherosbasicos_ttrmwwds_8_tftrmcompra_to = DecimalUtil.ZERO ;
      AV53Ficherosbasicos_ttrmwwds_9_tftrmventa = DecimalUtil.ZERO ;
      AV54Ficherosbasicos_ttrmwwds_10_tftrmventa_to = DecimalUtil.ZERO ;
      AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom = "" ;
      A14110TRMAutMan = "" ;
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14108TRMCompra = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      P09QH2_A14105TRMDivID = new byte[1] ;
      P09QH2_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QH2_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QH2_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      P09QH2_A14107TRMDivNom = new String[] {""} ;
      P09QH2_n14107TRMDivNom = new boolean[] {false} ;
      P09QH2_A14110TRMAutMan = new String[] {""} ;
      P09QH2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV23Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrmwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09QH2_A14105TRMDivID, P09QH2_A14109TRMVenta, P09QH2_A14108TRMCompra, P09QH2_A14106TRMFecha, P09QH2_A14107TRMDivNom, P09QH2_n14107TRMDivNom, P09QH2_A14110TRMAutMan, P09QH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFTRMDivID ;
   private byte AV11TFTRMDivID_To ;
   private byte AV46Ficherosbasicos_ttrmwwds_2_tftrmdivid ;
   private byte AV47Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ;
   private byte A14105TRMDivID ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ;
   private int AV22InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV16TFTRMCompra ;
   private java.math.BigDecimal AV17TFTRMCompra_To ;
   private java.math.BigDecimal AV18TFTRMVenta ;
   private java.math.BigDecimal AV19TFTRMVenta_To ;
   private java.math.BigDecimal AV51Ficherosbasicos_ttrmwwds_7_tftrmcompra ;
   private java.math.BigDecimal AV52Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ;
   private java.math.BigDecimal AV53Ficherosbasicos_ttrmwwds_9_tftrmventa ;
   private java.math.BigDecimal AV54Ficherosbasicos_ttrmwwds_10_tftrmventa_to ;
   private java.math.BigDecimal A14108TRMCompra ;
   private java.math.BigDecimal A14109TRMVenta ;
   private String AV12TFTRMDivNom ;
   private String AV13TFTRMDivNom_Sel ;
   private String A14107TRMDivNom ;
   private String AV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ;
   private String scmdbuf ;
   private String lV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom ;
   private String A14110TRMAutMan ;
   private String A396EmprCod ;
   private java.util.Date AV14TFTRMFecha ;
   private java.util.Date AV50Ficherosbasicos_ttrmwwds_6_tftrmfecha ;
   private java.util.Date A14106TRMFecha ;
   private boolean returnInSub ;
   private boolean brk9QH2 ;
   private boolean n14107TRMDivNom ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV20TFTRMAutMan_SelsJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV45Ficherosbasicos_ttrmwwds_1_filterfulltext ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09QH2_A14105TRMDivID ;
   private java.math.BigDecimal[] P09QH2_A14109TRMVenta ;
   private java.math.BigDecimal[] P09QH2_A14108TRMCompra ;
   private java.util.Date[] P09QH2_A14106TRMFecha ;
   private String[] P09QH2_A14107TRMDivNom ;
   private boolean[] P09QH2_n14107TRMDivNom ;
   private String[] P09QH2_A14110TRMAutMan ;
   private String[] P09QH2_A396EmprCod ;
   private GXSimpleCollection<String> AV21TFTRMAutMan_Sels ;
   private GXSimpleCollection<String> AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class ttrmwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09QH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14110TRMAutMan ,
                                          GXSimpleCollection<String> AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels ,
                                          byte AV46Ficherosbasicos_ttrmwwds_2_tftrmdivid ,
                                          byte AV47Ficherosbasicos_ttrmwwds_3_tftrmdivid_to ,
                                          String AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel ,
                                          String AV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom ,
                                          java.util.Date AV50Ficherosbasicos_ttrmwwds_6_tftrmfecha ,
                                          java.math.BigDecimal AV51Ficherosbasicos_ttrmwwds_7_tftrmcompra ,
                                          java.math.BigDecimal AV52Ficherosbasicos_ttrmwwds_8_tftrmcompra_to ,
                                          java.math.BigDecimal AV53Ficherosbasicos_ttrmwwds_9_tftrmventa ,
                                          java.math.BigDecimal AV54Ficherosbasicos_ttrmwwds_10_tftrmventa_to ,
                                          int AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size ,
                                          byte A14105TRMDivID ,
                                          String A14107TRMDivNom ,
                                          java.util.Date A14106TRMFecha ,
                                          java.math.BigDecimal A14108TRMCompra ,
                                          java.math.BigDecimal A14109TRMVenta ,
                                          String AV45Ficherosbasicos_ttrmwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.TRMDivID AS TRMDivID, T1.TRMVenta, T1.TRMCompra, T1.TRMFecha, T2.DivNom AS TRMDivNom, T1.TRMAutMan, T1.EmprCod FROM (TXPTRM T1 INNER JOIN TXPDIVISA T2" ;
      scmdbuf += " ON T2.DivCod = T1.TRMDivID)" ;
      if ( ! (0==AV46Ficherosbasicos_ttrmwwds_2_tftrmdivid) )
      {
         addWhere(sWhereString, "(T1.TRMDivID >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV47Ficherosbasicos_ttrmwwds_3_tftrmdivid_to) )
      {
         addWhere(sWhereString, "(T1.TRMDivID <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Ficherosbasicos_ttrmwwds_4_tftrmdivnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DivNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Ficherosbasicos_ttrmwwds_5_tftrmdivnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.DivNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV50Ficherosbasicos_ttrmwwds_6_tftrmfecha) )
      {
         addWhere(sWhereString, "(T1.TRMFecha >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51Ficherosbasicos_ttrmwwds_7_tftrmcompra)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Ficherosbasicos_ttrmwwds_8_tftrmcompra_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMCompra <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Ficherosbasicos_ttrmwwds_9_tftrmventa)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Ficherosbasicos_ttrmwwds_10_tftrmventa_to)==0) )
      {
         addWhere(sWhereString, "(T1.TRMVenta <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV55Ficherosbasicos_ttrmwwds_11_tftrmautman_sels, "T1.TRMAutMan IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.TRMDivID" ;
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
                  return conditional_P09QH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               return;
      }
   }

}

