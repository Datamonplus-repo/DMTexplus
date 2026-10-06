package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttrn09wwgetfilterdata extends GXProcedure
{
   public ttrn09wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn09wwgetfilterdata.class ), "" );
   }

   public ttrn09wwgetfilterdata( int remoteHandle ,
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
      ttrn09wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttrn09wwgetfilterdata.this.AV20DDOName = aP0;
      ttrn09wwgetfilterdata.this.AV18SearchTxt = aP1;
      ttrn09wwgetfilterdata.this.AV19SearchTxtTo = aP2;
      ttrn09wwgetfilterdata.this.aP3 = aP3;
      ttrn09wwgetfilterdata.this.aP4 = aP4;
      ttrn09wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("TTrn09WWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn09WWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TTrn09WWGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV49FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV10TFAlbProCod = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV11TFAlbProCod_To = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV12TFBarCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV14TFBarCodReo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFBarCodReo_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV16TFBarCodPar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV17TFBarCodPar_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIFASMAXLIN") == 0 )
         {
            AV47TFGuiFasMaxLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFGuiFasMaxLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarCodPar = AV18SearchTxt ;
      AV17TFBarCodPar_Sel = "" ;
      AV54Ttrn09wwds_1_filterfulltext = AV49FilterFullText ;
      AV55Ttrn09wwds_2_tfalbprocod = AV10TFAlbProCod ;
      AV56Ttrn09wwds_3_tfalbprocod_to = AV11TFAlbProCod_To ;
      AV57Ttrn09wwds_4_tfbarcod = AV12TFBarCod ;
      AV58Ttrn09wwds_5_tfbarcod_to = AV13TFBarCod_To ;
      AV59Ttrn09wwds_6_tfbarcodreo = AV14TFBarCodReo ;
      AV60Ttrn09wwds_7_tfbarcodreo_to = AV15TFBarCodReo_To ;
      AV61Ttrn09wwds_8_tfbarcodpar = AV16TFBarCodPar ;
      AV62Ttrn09wwds_9_tfbarcodpar_sel = AV17TFBarCodPar_Sel ;
      AV63Ttrn09wwds_10_tfguifasmaxlin = AV47TFGuiFasMaxLin ;
      AV64Ttrn09wwds_11_tfguifasmaxlin_to = AV48TFGuiFasMaxLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Long.valueOf(AV55Ttrn09wwds_2_tfalbprocod) ,
                                           Long.valueOf(AV56Ttrn09wwds_3_tfalbprocod_to) ,
                                           Integer.valueOf(AV57Ttrn09wwds_4_tfbarcod) ,
                                           Integer.valueOf(AV58Ttrn09wwds_5_tfbarcod_to) ,
                                           Byte.valueOf(AV59Ttrn09wwds_6_tfbarcodreo) ,
                                           Byte.valueOf(AV60Ttrn09wwds_7_tfbarcodreo_to) ,
                                           AV62Ttrn09wwds_9_tfbarcodpar_sel ,
                                           AV61Ttrn09wwds_8_tfbarcodpar ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV54Ttrn09wwds_1_filterfulltext ,
                                           Short.valueOf(A13786GuiFasMaxL) ,
                                           Short.valueOf(AV63Ttrn09wwds_10_tfguifasmaxlin) ,
                                           Short.valueOf(AV64Ttrn09wwds_11_tfguifasmaxlin_to) } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV54Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV54Ttrn09wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Ttrn09wwds_1_filterfulltext), "%", "") ;
      lV61Ttrn09wwds_8_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV61Ttrn09wwds_8_tfbarcodpar), 1, "%") ;
      /* Using cursor P08FB3 */
      pr_default.execute(0, new Object[] {AV54Ttrn09wwds_1_filterfulltext, lV54Ttrn09wwds_1_filterfulltext, lV54Ttrn09wwds_1_filterfulltext, lV54Ttrn09wwds_1_filterfulltext, lV54Ttrn09wwds_1_filterfulltext, lV54Ttrn09wwds_1_filterfulltext, Short.valueOf(AV63Ttrn09wwds_10_tfguifasmaxlin), Short.valueOf(AV63Ttrn09wwds_10_tfguifasmaxlin), Short.valueOf(AV64Ttrn09wwds_11_tfguifasmaxlin_to), Short.valueOf(AV64Ttrn09wwds_11_tfguifasmaxlin_to), Long.valueOf(AV55Ttrn09wwds_2_tfalbprocod), Long.valueOf(AV56Ttrn09wwds_3_tfalbprocod_to), Integer.valueOf(AV57Ttrn09wwds_4_tfbarcod), Integer.valueOf(AV58Ttrn09wwds_5_tfbarcod_to), Byte.valueOf(AV59Ttrn09wwds_6_tfbarcodreo), Byte.valueOf(AV60Ttrn09wwds_7_tfbarcodreo_to), lV61Ttrn09wwds_8_tfbarcodpar, AV62Ttrn09wwds_9_tfbarcodpar_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8FB2 = false ;
         A396EmprCod = P08FB3_A396EmprCod[0] ;
         A130BarCodPar = P08FB3_A130BarCodPar[0] ;
         A132BarCodReo = P08FB3_A132BarCodReo[0] ;
         A129BarCod = P08FB3_A129BarCod[0] ;
         A30AlbProCod = P08FB3_A30AlbProCod[0] ;
         A13786GuiFasMaxL = P08FB3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FB3_n13786GuiFasMaxL[0] ;
         A13786GuiFasMaxL = P08FB3_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = P08FB3_n13786GuiFasMaxL[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08FB3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brk8FB2 = false ;
            A396EmprCod = P08FB3_A396EmprCod[0] ;
            A132BarCodReo = P08FB3_A132BarCodReo[0] ;
            A129BarCod = P08FB3_A129BarCod[0] ;
            A30AlbProCod = P08FB3_A30AlbProCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8FB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
         {
            AV22Option = A130BarCodPar ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FB2 )
         {
            brk8FB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttrn09wwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = ttrn09wwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = ttrn09wwgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV49FilterFullText = "" ;
      AV16TFBarCodPar = "" ;
      AV17TFBarCodPar_Sel = "" ;
      A130BarCodPar = "" ;
      AV54Ttrn09wwds_1_filterfulltext = "" ;
      AV61Ttrn09wwds_8_tfbarcodpar = "" ;
      AV62Ttrn09wwds_9_tfbarcodpar_sel = "" ;
      lV54Ttrn09wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV61Ttrn09wwds_8_tfbarcodpar = "" ;
      P08FB3_A396EmprCod = new String[] {""} ;
      P08FB3_A130BarCodPar = new String[] {""} ;
      P08FB3_A132BarCodReo = new byte[1] ;
      P08FB3_A129BarCod = new int[1] ;
      P08FB3_A30AlbProCod = new long[1] ;
      P08FB3_A13786GuiFasMaxL = new short[1] ;
      P08FB3_n13786GuiFasMaxL = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn09wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08FB3_A396EmprCod, P08FB3_A130BarCodPar, P08FB3_A132BarCodReo, P08FB3_A129BarCod, P08FB3_A30AlbProCod, P08FB3_A13786GuiFasMaxL, P08FB3_n13786GuiFasMaxL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFBarCodReo ;
   private byte AV15TFBarCodReo_To ;
   private byte AV59Ttrn09wwds_6_tfbarcodreo ;
   private byte AV60Ttrn09wwds_7_tfbarcodreo_to ;
   private byte A132BarCodReo ;
   private short AV47TFGuiFasMaxLin ;
   private short AV48TFGuiFasMaxLin_To ;
   private short AV63Ttrn09wwds_10_tfguifasmaxlin ;
   private short AV64Ttrn09wwds_11_tfguifasmaxlin_to ;
   private short A13786GuiFasMaxL ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV12TFBarCod ;
   private int AV13TFBarCod_To ;
   private int AV57Ttrn09wwds_4_tfbarcod ;
   private int AV58Ttrn09wwds_5_tfbarcod_to ;
   private int A129BarCod ;
   private long AV10TFAlbProCod ;
   private long AV11TFAlbProCod_To ;
   private long AV55Ttrn09wwds_2_tfalbprocod ;
   private long AV56Ttrn09wwds_3_tfalbprocod_to ;
   private long A30AlbProCod ;
   private long AV30count ;
   private String AV16TFBarCodPar ;
   private String AV17TFBarCodPar_Sel ;
   private String A130BarCodPar ;
   private String AV61Ttrn09wwds_8_tfbarcodpar ;
   private String AV62Ttrn09wwds_9_tfbarcodpar_sel ;
   private String scmdbuf ;
   private String lV61Ttrn09wwds_8_tfbarcodpar ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8FB2 ;
   private boolean n13786GuiFasMaxL ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV49FilterFullText ;
   private String AV54Ttrn09wwds_1_filterfulltext ;
   private String lV54Ttrn09wwds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08FB3_A396EmprCod ;
   private String[] P08FB3_A130BarCodPar ;
   private byte[] P08FB3_A132BarCodReo ;
   private int[] P08FB3_A129BarCod ;
   private long[] P08FB3_A30AlbProCod ;
   private short[] P08FB3_A13786GuiFasMaxL ;
   private boolean[] P08FB3_n13786GuiFasMaxL ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class ttrn09wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV55Ttrn09wwds_2_tfalbprocod ,
                                          long AV56Ttrn09wwds_3_tfalbprocod_to ,
                                          int AV57Ttrn09wwds_4_tfbarcod ,
                                          int AV58Ttrn09wwds_5_tfbarcod_to ,
                                          byte AV59Ttrn09wwds_6_tfbarcodreo ,
                                          byte AV60Ttrn09wwds_7_tfbarcodreo_to ,
                                          String AV62Ttrn09wwds_9_tfbarcodpar_sel ,
                                          String AV61Ttrn09wwds_8_tfbarcodpar ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV54Ttrn09wwds_1_filterfulltext ,
                                          short A13786GuiFasMaxL ,
                                          short AV63Ttrn09wwds_10_tfguifasmaxlin ,
                                          short AV64Ttrn09wwds_11_tfguifasmaxlin_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[18];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, COALESCE( T2.GuiFasMaxL, 0) AS GuiFasMaxL FROM (TXPALBBAR T1 LEFT JOIN (SELECT MAX(GuiFasLin)" ;
      scmdbuf += " AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.AlbProCod,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.GuiFasMaxL, 0),'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.GuiFasMaxL, 0) <= ?))");
      if ( ! (0==AV55Ttrn09wwds_2_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV56Ttrn09wwds_3_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV57Ttrn09wwds_4_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV58Ttrn09wwds_5_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV59Ttrn09wwds_6_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Ttrn09wwds_7_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Ttrn09wwds_9_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV61Ttrn09wwds_8_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Ttrn09wwds_9_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCodPar" ;
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
                  return conditional_P08FB3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).longValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

