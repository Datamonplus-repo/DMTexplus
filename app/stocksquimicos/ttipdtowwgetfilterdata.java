package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipdtowwgetfilterdata extends GXProcedure
{
   public ttipdtowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipdtowwgetfilterdata.class ), "" );
   }

   public ttipdtowwgetfilterdata( int remoteHandle ,
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
      ttipdtowwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipdtowwgetfilterdata.this.AV18DDOName = aP0;
      ttipdtowwgetfilterdata.this.AV16SearchTxt = aP1;
      ttipdtowwgetfilterdata.this.AV17SearchTxtTo = aP2;
      ttipdtowwgetfilterdata.this.aP3 = aP3;
      ttipdtowwgetfilterdata.this.aP4 = aP4;
      ttipdtowwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_TIPDTODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPDTODSCOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("StocksQuimicos.TTIPDTOWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TTIPDTOWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("StocksQuimicos.TTIPDTOWWGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTOCOD") == 0 )
         {
            AV10TFTipDtoCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipDtoCod_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODSC") == 0 )
         {
            AV12TFTipDtoDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODSC_SEL") == 0 )
         {
            AV13TFTipDtoDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODTO") == 0 )
         {
            AV14TFTipDtoDto = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFTipDtoDto_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPDTODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipDtoDsc = AV16SearchTxt ;
      AV13TFTipDtoDsc_Sel = "" ;
      AV39Stocksquimicos_ttipdtowwds_1_filterfulltext = AV34FilterFullText ;
      AV40Stocksquimicos_ttipdtowwds_2_tftipdtocod = AV10TFTipDtoCod ;
      AV41Stocksquimicos_ttipdtowwds_3_tftipdtocod_to = AV11TFTipDtoCod_To ;
      AV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc = AV12TFTipDtoDsc ;
      AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel = AV13TFTipDtoDsc_Sel ;
      AV44Stocksquimicos_ttipdtowwds_6_tftipdtodto = AV14TFTipDtoDto ;
      AV45Stocksquimicos_ttipdtowwds_7_tftipdtodto_to = AV15TFTipDtoDto_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Stocksquimicos_ttipdtowwds_1_filterfulltext ,
                                           Byte.valueOf(AV40Stocksquimicos_ttipdtowwds_2_tftipdtocod) ,
                                           Byte.valueOf(AV41Stocksquimicos_ttipdtowwds_3_tftipdtocod_to) ,
                                           AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel ,
                                           AV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc ,
                                           AV44Stocksquimicos_ttipdtowwds_6_tftipdtodto ,
                                           AV45Stocksquimicos_ttipdtowwds_7_tftipdtodto_to ,
                                           Byte.valueOf(A835TipDtoCod) ,
                                           A836TipDtoDsc ,
                                           A837TipDtoDto } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV39Stocksquimicos_ttipdtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Stocksquimicos_ttipdtowwds_1_filterfulltext), "%", "") ;
      lV39Stocksquimicos_ttipdtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Stocksquimicos_ttipdtowwds_1_filterfulltext), "%", "") ;
      lV39Stocksquimicos_ttipdtowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Stocksquimicos_ttipdtowwds_1_filterfulltext), "%", "") ;
      lV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc = GXutil.padr( GXutil.rtrim( AV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc), 30, "%") ;
      /* Using cursor P08MG2 */
      pr_default.execute(0, new Object[] {lV39Stocksquimicos_ttipdtowwds_1_filterfulltext, lV39Stocksquimicos_ttipdtowwds_1_filterfulltext, lV39Stocksquimicos_ttipdtowwds_1_filterfulltext, Byte.valueOf(AV40Stocksquimicos_ttipdtowwds_2_tftipdtocod), Byte.valueOf(AV41Stocksquimicos_ttipdtowwds_3_tftipdtocod_to), lV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc, AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel, AV44Stocksquimicos_ttipdtowwds_6_tftipdtodto, AV45Stocksquimicos_ttipdtowwds_7_tftipdtodto_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8MG2 = false ;
         A836TipDtoDsc = P08MG2_A836TipDtoDsc[0] ;
         n836TipDtoDsc = P08MG2_n836TipDtoDsc[0] ;
         A837TipDtoDto = P08MG2_A837TipDtoDto[0] ;
         n837TipDtoDto = P08MG2_n837TipDtoDto[0] ;
         A835TipDtoCod = P08MG2_A835TipDtoCod[0] ;
         A396EmprCod = P08MG2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08MG2_A836TipDtoDsc[0], A836TipDtoDsc) == 0 ) )
         {
            brk8MG2 = false ;
            A835TipDtoCod = P08MG2_A835TipDtoCod[0] ;
            A396EmprCod = P08MG2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8MG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A836TipDtoDsc)==0) )
         {
            AV20Option = A836TipDtoDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8MG2 )
         {
            brk8MG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipdtowwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = ttipdtowwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = ttipdtowwgetfilterdata.this.AV27OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV12TFTipDtoDsc = "" ;
      AV13TFTipDtoDsc_Sel = "" ;
      AV14TFTipDtoDto = DecimalUtil.ZERO ;
      AV15TFTipDtoDto_To = DecimalUtil.ZERO ;
      A836TipDtoDsc = "" ;
      AV39Stocksquimicos_ttipdtowwds_1_filterfulltext = "" ;
      AV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc = "" ;
      AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel = "" ;
      AV44Stocksquimicos_ttipdtowwds_6_tftipdtodto = DecimalUtil.ZERO ;
      AV45Stocksquimicos_ttipdtowwds_7_tftipdtodto_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV39Stocksquimicos_ttipdtowwds_1_filterfulltext = "" ;
      lV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc = "" ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      P08MG2_A836TipDtoDsc = new String[] {""} ;
      P08MG2_n836TipDtoDsc = new boolean[] {false} ;
      P08MG2_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08MG2_n837TipDtoDto = new boolean[] {false} ;
      P08MG2_A835TipDtoCod = new byte[1] ;
      P08MG2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipdtowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08MG2_A836TipDtoDsc, P08MG2_n836TipDtoDsc, P08MG2_A837TipDtoDto, P08MG2_n837TipDtoDto, P08MG2_A835TipDtoCod, P08MG2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFTipDtoCod ;
   private byte AV11TFTipDtoCod_To ;
   private byte AV40Stocksquimicos_ttipdtowwds_2_tftipdtocod ;
   private byte AV41Stocksquimicos_ttipdtowwds_3_tftipdtocod_to ;
   private byte A835TipDtoCod ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV28count ;
   private java.math.BigDecimal AV14TFTipDtoDto ;
   private java.math.BigDecimal AV15TFTipDtoDto_To ;
   private java.math.BigDecimal AV44Stocksquimicos_ttipdtowwds_6_tftipdtodto ;
   private java.math.BigDecimal AV45Stocksquimicos_ttipdtowwds_7_tftipdtodto_to ;
   private java.math.BigDecimal A837TipDtoDto ;
   private String AV12TFTipDtoDsc ;
   private String AV13TFTipDtoDsc_Sel ;
   private String A836TipDtoDsc ;
   private String AV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc ;
   private String AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel ;
   private String scmdbuf ;
   private String lV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8MG2 ;
   private boolean n836TipDtoDsc ;
   private boolean n837TipDtoDto ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Stocksquimicos_ttipdtowwds_1_filterfulltext ;
   private String lV39Stocksquimicos_ttipdtowwds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08MG2_A836TipDtoDsc ;
   private boolean[] P08MG2_n836TipDtoDsc ;
   private java.math.BigDecimal[] P08MG2_A837TipDtoDto ;
   private boolean[] P08MG2_n837TipDtoDto ;
   private byte[] P08MG2_A835TipDtoCod ;
   private String[] P08MG2_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class ttipdtowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08MG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Stocksquimicos_ttipdtowwds_1_filterfulltext ,
                                          byte AV40Stocksquimicos_ttipdtowwds_2_tftipdtocod ,
                                          byte AV41Stocksquimicos_ttipdtowwds_3_tftipdtocod_to ,
                                          String AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel ,
                                          String AV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc ,
                                          java.math.BigDecimal AV44Stocksquimicos_ttipdtowwds_6_tftipdtodto ,
                                          java.math.BigDecimal AV45Stocksquimicos_ttipdtowwds_7_tftipdtodto_to ,
                                          byte A835TipDtoCod ,
                                          String A836TipDtoDsc ,
                                          java.math.BigDecimal A837TipDtoDto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipDtoDsc, TipDtoDto, TipDtoCod, EmprCod FROM TXPTIPDTO" ;
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_ttipdtowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipDtoCod,'90'), 2) like '%' || ?) or ( UPPER(TipDtoDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipDtoDto,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV40Stocksquimicos_ttipdtowwds_2_tftipdtocod) )
      {
         addWhere(sWhereString, "(TipDtoCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV41Stocksquimicos_ttipdtowwds_3_tftipdtocod_to) )
      {
         addWhere(sWhereString, "(TipDtoCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Stocksquimicos_ttipdtowwds_4_tftipdtodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipDtoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Stocksquimicos_ttipdtowwds_5_tftipdtodsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipDtoDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44Stocksquimicos_ttipdtowwds_6_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(TipDtoDto >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Stocksquimicos_ttipdtowwds_7_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(TipDtoDto <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipDtoDsc" ;
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
                  return conditional_P08MG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08MG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(3);
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
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
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

