package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwcwuti118_lavadosmaquinagetfilterdata extends GXProcedure
{
   public wcwcwuti118_lavadosmaquinagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwcwuti118_lavadosmaquinagetfilterdata.class ), "" );
   }

   public wcwcwuti118_lavadosmaquinagetfilterdata( int remoteHandle ,
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
      wcwcwuti118_lavadosmaquinagetfilterdata.this.aP5 = new String[] {""};
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
      wcwcwuti118_lavadosmaquinagetfilterdata.this.AV16DDOName = aP0;
      wcwcwuti118_lavadosmaquinagetfilterdata.this.AV14SearchTxt = aP1;
      wcwcwuti118_lavadosmaquinagetfilterdata.this.AV15SearchTxtTo = aP2;
      wcwcwuti118_lavadosmaquinagetfilterdata.this.aP3 = aP3;
      wcwcwuti118_lavadosmaquinagetfilterdata.this.aP4 = aP4;
      wcwcwuti118_lavadosmaquinagetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_CCSTKDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCSTKDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("WCWCWUti118_LavadosMaquinaGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWCWUti118_LavadosMaquinaGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WCWCWUti118_LavadosMaquinaGridState"), null, null);
      }
      AV40GXV1 = 1 ;
      while ( AV40GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV40GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANS") == 0 )
         {
            AV10TFCCStkCanS = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV11TFCCStkCanS_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV12TFCCStkDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV13TFCCStkDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV40GXV1 = (int)(AV40GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCSTKDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCStkDsc = AV14SearchTxt ;
      AV13TFCCStkDsc_Sel = "" ;
      AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext = AV32FilterFullText ;
      AV43Wcwcwuti118_lavadosmaquinads_2_tfccstkcans = AV10TFCCStkCanS ;
      AV44Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to = AV11TFCCStkCanS_To ;
      AV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = AV12TFCCStkDsc ;
      AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel = AV13TFCCStkDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext ,
                                           AV43Wcwcwuti118_lavadosmaquinads_2_tfccstkcans ,
                                           AV44Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to ,
                                           AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel ,
                                           AV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ,
                                           A3344CCStkCanS ,
                                           A3357CCStkDsc ,
                                           A3348CCStkFec ,
                                           AV36Fec1 ,
                                           AV37Fec2 ,
                                           A396EmprCod ,
                                           AV33EmprCod ,
                                           A719PrdNum ,
                                           AV34Prdnum ,
                                           A5722CCStkLot ,
                                           AV35HreLote ,
                                           A3345TipMovCc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext), "%", "") ;
      lV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext), "%", "") ;
      lV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc), 30, "%") ;
      /* Using cursor P08XD2 */
      pr_default.execute(0, new Object[] {AV36Fec1, AV37Fec2, AV33EmprCod, AV34Prdnum, AV35HreLote, lV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext, lV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext, AV43Wcwcwuti118_lavadosmaquinads_2_tfccstkcans, AV44Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to, lV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc, AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8XD2 = false ;
         A396EmprCod = P08XD2_A396EmprCod[0] ;
         A719PrdNum = P08XD2_A719PrdNum[0] ;
         A5722CCStkLot = P08XD2_A5722CCStkLot[0] ;
         A3345TipMovCc = P08XD2_A3345TipMovCc[0] ;
         A3357CCStkDsc = P08XD2_A3357CCStkDsc[0] ;
         A3348CCStkFec = P08XD2_A3348CCStkFec[0] ;
         A3344CCStkCanS = P08XD2_A3344CCStkCanS[0] ;
         A3342CCStkLin = P08XD2_A3342CCStkLin[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08XD2_A3357CCStkDsc[0], A3357CCStkDsc) == 0 ) )
         {
            brk8XD2 = false ;
            A396EmprCod = P08XD2_A396EmprCod[0] ;
            A719PrdNum = P08XD2_A719PrdNum[0] ;
            A3342CCStkLin = P08XD2_A3342CCStkLin[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8XD2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3357CCStkDsc)==0) )
         {
            AV18Option = A3357CCStkDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8XD2 )
         {
            brk8XD2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwcwuti118_lavadosmaquinagetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = wcwcwuti118_lavadosmaquinagetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = wcwcwuti118_lavadosmaquinagetfilterdata.this.AV25OptionIndexesJson;
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
      AV32FilterFullText = "" ;
      AV10TFCCStkCanS = DecimalUtil.ZERO ;
      AV11TFCCStkCanS_To = DecimalUtil.ZERO ;
      AV12TFCCStkDsc = "" ;
      AV13TFCCStkDsc_Sel = "" ;
      A3357CCStkDsc = "" ;
      AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext = "" ;
      AV43Wcwcwuti118_lavadosmaquinads_2_tfccstkcans = DecimalUtil.ZERO ;
      AV44Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to = DecimalUtil.ZERO ;
      AV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = "" ;
      AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel = "" ;
      scmdbuf = "" ;
      lV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext = "" ;
      lV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3348CCStkFec = GXutil.nullDate() ;
      AV36Fec1 = GXutil.nullDate() ;
      AV37Fec2 = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV33EmprCod = "" ;
      A719PrdNum = "" ;
      AV34Prdnum = "" ;
      A5722CCStkLot = "" ;
      AV35HreLote = "" ;
      A3345TipMovCc = "" ;
      P08XD2_A396EmprCod = new String[] {""} ;
      P08XD2_A719PrdNum = new String[] {""} ;
      P08XD2_A5722CCStkLot = new String[] {""} ;
      P08XD2_A3345TipMovCc = new String[] {""} ;
      P08XD2_A3357CCStkDsc = new String[] {""} ;
      P08XD2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XD2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XD2_A3342CCStkLin = new long[1] ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcwuti118_lavadosmaquinagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08XD2_A396EmprCod, P08XD2_A719PrdNum, P08XD2_A5722CCStkLot, P08XD2_A3345TipMovCc, P08XD2_A3357CCStkDsc, P08XD2_A3348CCStkFec, P08XD2_A3344CCStkCanS, P08XD2_A3342CCStkLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV40GXV1 ;
   private long A3342CCStkLin ;
   private long AV26count ;
   private java.math.BigDecimal AV10TFCCStkCanS ;
   private java.math.BigDecimal AV11TFCCStkCanS_To ;
   private java.math.BigDecimal AV43Wcwcwuti118_lavadosmaquinads_2_tfccstkcans ;
   private java.math.BigDecimal AV44Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String AV12TFCCStkDsc ;
   private String AV13TFCCStkDsc_Sel ;
   private String A3357CCStkDsc ;
   private String AV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ;
   private String AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel ;
   private String scmdbuf ;
   private String lV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ;
   private String A396EmprCod ;
   private String AV33EmprCod ;
   private String A719PrdNum ;
   private String AV34Prdnum ;
   private String A5722CCStkLot ;
   private String AV35HreLote ;
   private String A3345TipMovCc ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV36Fec1 ;
   private java.util.Date AV37Fec2 ;
   private boolean returnInSub ;
   private boolean brk8XD2 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext ;
   private String lV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08XD2_A396EmprCod ;
   private String[] P08XD2_A719PrdNum ;
   private String[] P08XD2_A5722CCStkLot ;
   private String[] P08XD2_A3345TipMovCc ;
   private String[] P08XD2_A3357CCStkDsc ;
   private java.util.Date[] P08XD2_A3348CCStkFec ;
   private java.math.BigDecimal[] P08XD2_A3344CCStkCanS ;
   private long[] P08XD2_A3342CCStkLin ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class wcwcwuti118_lavadosmaquinagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08XD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext ,
                                          java.math.BigDecimal AV43Wcwcwuti118_lavadosmaquinads_2_tfccstkcans ,
                                          java.math.BigDecimal AV44Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to ,
                                          String AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel ,
                                          String AV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3357CCStkDsc ,
                                          java.util.Date A3348CCStkFec ,
                                          java.util.Date AV36Fec1 ,
                                          java.util.Date AV37Fec2 ,
                                          String A396EmprCod ,
                                          String AV33EmprCod ,
                                          String A719PrdNum ,
                                          String AV34Prdnum ,
                                          String A5722CCStkLot ,
                                          String AV35HreLote ,
                                          String A3345TipMovCc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, CCStkLot, TipMovCc, CCStkDsc, CCStkFec, CCStkCanS, CCStkLin FROM TXPCCSTKS" ;
      addWhere(sWhereString, "(CCStkFec >= ?)");
      addWhere(sWhereString, "(CCStkFec <= ?)");
      addWhere(sWhereString, "(CCStkDsc like '%Lavado en Maquina%')");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(CCStkLot = ?)");
      addWhere(sWhereString, "(TipMovCc = 'SM')");
      if ( ! (GXutil.strcmp("", AV42Wcwcwuti118_lavadosmaquinads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(CCStkDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43Wcwcwuti118_lavadosmaquinads_2_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(CCStkCanS >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44Wcwcwuti118_lavadosmaquinads_3_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(CCStkCanS <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV45Wcwcwuti118_lavadosmaquinads_4_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Wcwcwuti118_lavadosmaquinads_5_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCStkDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCStkDsc" ;
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
                  return conditional_P08XD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (String)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((long[]) buf[7])[0] = rslt.getLong(8);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               return;
      }
   }

}

