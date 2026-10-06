package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hojaderuta__piezasgetfilterdata extends GXProcedure
{
   public hojaderuta__piezasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hojaderuta__piezasgetfilterdata.class ), "" );
   }

   public hojaderuta__piezasgetfilterdata( int remoteHandle ,
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
      hojaderuta__piezasgetfilterdata.this.aP5 = new String[] {""};
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
      hojaderuta__piezasgetfilterdata.this.AV32DDOName = aP0;
      hojaderuta__piezasgetfilterdata.this.AV33SearchTxt = aP1;
      hojaderuta__piezasgetfilterdata.this.AV34SearchTxtTo = aP2;
      hojaderuta__piezasgetfilterdata.this.aP3 = aP3;
      hojaderuta__piezasgetfilterdata.this.aP4 = aP4;
      hojaderuta__piezasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_ALBRENT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRENTOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("PedidosClienteSinDetalle.HojadeRuta__PiezasGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta__PiezasGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("PedidosClienteSinDetalle.HojadeRuta__PiezasGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV12TFAlbREnt = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV13TFAlbREnt_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV14TFBarPieKil = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFBarPieKil_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV16TFBarPieMet = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFBarPieMet_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEPIE") == 0 )
         {
            AV18TFBarPiePie = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFBarPiePie_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBRENTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbREnt = AV33SearchTxt ;
      AV13TFAlbREnt_Sel = "" ;
      AV48Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV49Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = AV12TFAlbREnt ;
      AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = AV13TFAlbREnt_Sel ;
      AV52Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = AV14TFBarPieKil ;
      AV53Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = AV15TFBarPieKil_To ;
      AV54Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = AV16TFBarPieMet ;
      AV55Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = AV17TFBarPieMet_To ;
      AV56Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie = AV18TFBarPiePie ;
      AV57Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to = AV19TFBarPiePie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV48Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) ,
                                           Integer.valueOf(AV49Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) ,
                                           AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                           AV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                           AV52Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                           AV53Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                           AV54Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                           AV55Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                           Integer.valueOf(AV56Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) ,
                                           Integer.valueOf(AV57Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A396EmprCod ,
                                           AV40EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV41BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV42BarCodReo) ,
                                           A130BarCodPar ,
                                           AV43BarCodPar } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = GXutil.padr( GXutil.rtrim( AV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent), 8, "%") ;
      /* Using cursor P0A5O2 */
      pr_default.execute(0, new Object[] {AV40EmprCod, Integer.valueOf(AV41BarCod), Byte.valueOf(AV42BarCodReo), AV43BarCodPar, Integer.valueOf(AV48Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod), Integer.valueOf(AV49Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to), lV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent, AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel, AV52Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil, AV53Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to, AV54Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet, AV55Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to, Integer.valueOf(AV56Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie), Integer.valueOf(AV57Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA5O2 = false ;
         A396EmprCod = P0A5O2_A396EmprCod[0] ;
         A129BarCod = P0A5O2_A129BarCod[0] ;
         A132BarCodReo = P0A5O2_A132BarCodReo[0] ;
         A130BarCodPar = P0A5O2_A130BarCodPar[0] ;
         A46AlbREnt = P0A5O2_A46AlbREnt[0] ;
         A1501BarPiePie = P0A5O2_A1501BarPiePie[0] ;
         A205BarPieMet = P0A5O2_A205BarPieMet[0] ;
         A203BarPieKil = P0A5O2_A203BarPieKil[0] ;
         A44AlbRecCod = P0A5O2_A44AlbRecCod[0] ;
         A200BarPieCod = P0A5O2_A200BarPieCod[0] ;
         A46AlbREnt = P0A5O2_A46AlbREnt[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A5O2_A46AlbREnt[0], A46AlbREnt) == 0 ) )
         {
            brkA5O2 = false ;
            A396EmprCod = P0A5O2_A396EmprCod[0] ;
            A129BarCod = P0A5O2_A129BarCod[0] ;
            A132BarCodReo = P0A5O2_A132BarCodReo[0] ;
            A130BarCodPar = P0A5O2_A130BarCodPar[0] ;
            A44AlbRecCod = P0A5O2_A44AlbRecCod[0] ;
            A200BarPieCod = P0A5O2_A200BarPieCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkA5O2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A46AlbREnt)==0) )
         {
            AV21Option = A46AlbREnt ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA5O2 )
         {
            brkA5O2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = hojaderuta__piezasgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = hojaderuta__piezasgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = hojaderuta__piezasgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV36OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFAlbREnt = "" ;
      AV13TFAlbREnt_Sel = "" ;
      AV14TFBarPieKil = DecimalUtil.ZERO ;
      AV15TFBarPieKil_To = DecimalUtil.ZERO ;
      AV16TFBarPieMet = DecimalUtil.ZERO ;
      AV17TFBarPieMet_To = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      AV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = "" ;
      AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel = "" ;
      AV52Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil = DecimalUtil.ZERO ;
      AV53Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV54Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet = DecimalUtil.ZERO ;
      AV55Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      AV40EmprCod = "" ;
      A130BarCodPar = "" ;
      AV43BarCodPar = "" ;
      P0A5O2_A396EmprCod = new String[] {""} ;
      P0A5O2_A129BarCod = new int[1] ;
      P0A5O2_A132BarCodReo = new byte[1] ;
      P0A5O2_A130BarCodPar = new String[] {""} ;
      P0A5O2_A46AlbREnt = new String[] {""} ;
      P0A5O2_A1501BarPiePie = new int[1] ;
      P0A5O2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5O2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5O2_A44AlbRecCod = new int[1] ;
      P0A5O2_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV21Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta__piezasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A5O2_A396EmprCod, P0A5O2_A129BarCod, P0A5O2_A132BarCodReo, P0A5O2_A130BarCodPar, P0A5O2_A46AlbREnt, P0A5O2_A1501BarPiePie, P0A5O2_A205BarPieMet, P0A5O2_A203BarPieKil, P0A5O2_A44AlbRecCod, P0A5O2_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV42BarCodReo ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV18TFBarPiePie ;
   private int AV19TFBarPiePie_To ;
   private int AV48Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod ;
   private int AV49Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to ;
   private int AV56Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie ;
   private int AV57Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int A129BarCod ;
   private int AV41BarCod ;
   private long AV26count ;
   private java.math.BigDecimal AV14TFBarPieKil ;
   private java.math.BigDecimal AV15TFBarPieKil_To ;
   private java.math.BigDecimal AV16TFBarPieMet ;
   private java.math.BigDecimal AV17TFBarPieMet_To ;
   private java.math.BigDecimal AV52Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ;
   private java.math.BigDecimal AV53Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ;
   private java.math.BigDecimal AV54Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ;
   private java.math.BigDecimal AV55Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String AV12TFAlbREnt ;
   private String AV13TFAlbREnt_Sel ;
   private String A46AlbREnt ;
   private String AV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ;
   private String AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ;
   private String scmdbuf ;
   private String lV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ;
   private String A396EmprCod ;
   private String AV40EmprCod ;
   private String A130BarCodPar ;
   private String AV43BarCodPar ;
   private String A200BarPieCod ;
   private boolean returnInSub ;
   private boolean brkA5O2 ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5O2_A396EmprCod ;
   private int[] P0A5O2_A129BarCod ;
   private byte[] P0A5O2_A132BarCodReo ;
   private String[] P0A5O2_A130BarCodPar ;
   private String[] P0A5O2_A46AlbREnt ;
   private int[] P0A5O2_A1501BarPiePie ;
   private java.math.BigDecimal[] P0A5O2_A205BarPieMet ;
   private java.math.BigDecimal[] P0A5O2_A203BarPieKil ;
   private int[] P0A5O2_A44AlbRecCod ;
   private String[] P0A5O2_A200BarPieCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class hojaderuta__piezasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A5O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV48Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod ,
                                          int AV49Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to ,
                                          String AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel ,
                                          String AV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent ,
                                          java.math.BigDecimal AV52Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil ,
                                          java.math.BigDecimal AV53Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV54Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet ,
                                          java.math.BigDecimal AV55Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to ,
                                          int AV56Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie ,
                                          int AV57Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          int A1501BarPiePie ,
                                          String A396EmprCod ,
                                          String AV40EmprCod ,
                                          int A129BarCod ,
                                          int AV41BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV42BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV43BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[14];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbREnt, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER" ;
      scmdbuf += " JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (0==AV48Pedidosclientesindetalle_hojaderuta__piezasds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV49Pedidosclientesindetalle_hojaderuta__piezasds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV50Pedidosclientesindetalle_hojaderuta__piezasds_3_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Pedidosclientesindetalle_hojaderuta__piezasds_4_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Pedidosclientesindetalle_hojaderuta__piezasds_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Pedidosclientesindetalle_hojaderuta__piezasds_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Pedidosclientesindetalle_hojaderuta__piezasds_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Pedidosclientesindetalle_hojaderuta__piezasds_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Pedidosclientesindetalle_hojaderuta__piezasds_9_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Pedidosclientesindetalle_hojaderuta__piezasds_10_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbREnt" ;
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
                  return conditional_P0A5O2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               return;
      }
   }

}

