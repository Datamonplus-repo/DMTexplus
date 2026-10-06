package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipprdwwgetfilterdata extends GXProcedure
{
   public ttipprdwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipprdwwgetfilterdata.class ), "" );
   }

   public ttipprdwwgetfilterdata( int remoteHandle ,
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
      ttipprdwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipprdwwgetfilterdata.this.AV16DDOName = aP0;
      ttipprdwwgetfilterdata.this.AV14SearchTxt = aP1;
      ttipprdwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttipprdwwgetfilterdata.this.aP3 = aP3;
      ttipprdwwgetfilterdata.this.aP4 = aP4;
      ttipprdwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TIPPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPPRDDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.TTIPPRDWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TTIPPRDWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.TTIPPRDWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV12TFTipPrdDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV13TFTipPrdDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDCOD") == 0 )
         {
            AV10TFTipPrdCod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipPrdCod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipPrdDsc = AV14SearchTxt ;
      AV13TFTipPrdDsc_Sel = "" ;
      AV37Stocksquimicos_ttipprdwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_ttipprdwwds_2_tftipprddsc = AV12TFTipPrdDsc ;
      AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel = AV13TFTipPrdDsc_Sel ;
      AV40Stocksquimicos_ttipprdwwds_4_tftipprdcod = AV10TFTipPrdCod ;
      AV41Stocksquimicos_ttipprdwwds_5_tftipprdcod_to = AV11TFTipPrdCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_ttipprdwwds_1_filterfulltext ,
                                           AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel ,
                                           AV38Stocksquimicos_ttipprdwwds_2_tftipprddsc ,
                                           Short.valueOf(AV40Stocksquimicos_ttipprdwwds_4_tftipprdcod) ,
                                           Short.valueOf(AV41Stocksquimicos_ttipprdwwds_5_tftipprdcod_to) ,
                                           A6302TipPrdDsc ,
                                           Short.valueOf(A6301TipPrdCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                           }
      });
      lV37Stocksquimicos_ttipprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipprdwwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_ttipprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipprdwwds_1_filterfulltext), "%", "") ;
      lV38Stocksquimicos_ttipprdwwds_2_tftipprddsc = GXutil.padr( GXutil.rtrim( AV38Stocksquimicos_ttipprdwwds_2_tftipprddsc), 40, "%") ;
      /* Using cursor P08MS2 */
      pr_default.execute(0, new Object[] {lV37Stocksquimicos_ttipprdwwds_1_filterfulltext, lV37Stocksquimicos_ttipprdwwds_1_filterfulltext, lV38Stocksquimicos_ttipprdwwds_2_tftipprddsc, AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel, Short.valueOf(AV40Stocksquimicos_ttipprdwwds_4_tftipprdcod), Short.valueOf(AV41Stocksquimicos_ttipprdwwds_5_tftipprdcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8MS2 = false ;
         A6302TipPrdDsc = P08MS2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P08MS2_n6302TipPrdDsc[0] ;
         A6301TipPrdCod = P08MS2_A6301TipPrdCod[0] ;
         A396EmprCod = P08MS2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08MS2_A6302TipPrdDsc[0], A6302TipPrdDsc) == 0 ) )
         {
            brk8MS2 = false ;
            A6301TipPrdCod = P08MS2_A6301TipPrdCod[0] ;
            A396EmprCod = P08MS2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8MS2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A6302TipPrdDsc)==0) )
         {
            AV18Option = A6302TipPrdDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8MS2 )
         {
            brk8MS2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipprdwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttipprdwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttipprdwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFTipPrdDsc = "" ;
      AV13TFTipPrdDsc_Sel = "" ;
      A6302TipPrdDsc = "" ;
      AV37Stocksquimicos_ttipprdwwds_1_filterfulltext = "" ;
      AV38Stocksquimicos_ttipprdwwds_2_tftipprddsc = "" ;
      AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel = "" ;
      scmdbuf = "" ;
      lV37Stocksquimicos_ttipprdwwds_1_filterfulltext = "" ;
      lV38Stocksquimicos_ttipprdwwds_2_tftipprddsc = "" ;
      P08MS2_A6302TipPrdDsc = new String[] {""} ;
      P08MS2_n6302TipPrdDsc = new boolean[] {false} ;
      P08MS2_A6301TipPrdCod = new short[1] ;
      P08MS2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipprdwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08MS2_A6302TipPrdDsc, P08MS2_n6302TipPrdDsc, P08MS2_A6301TipPrdCod, P08MS2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTipPrdCod ;
   private short AV11TFTipPrdCod_To ;
   private short AV40Stocksquimicos_ttipprdwwds_4_tftipprdcod ;
   private short AV41Stocksquimicos_ttipprdwwds_5_tftipprdcod_to ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFTipPrdDsc ;
   private String AV13TFTipPrdDsc_Sel ;
   private String A6302TipPrdDsc ;
   private String AV38Stocksquimicos_ttipprdwwds_2_tftipprddsc ;
   private String AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel ;
   private String scmdbuf ;
   private String lV38Stocksquimicos_ttipprdwwds_2_tftipprddsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8MS2 ;
   private boolean n6302TipPrdDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Stocksquimicos_ttipprdwwds_1_filterfulltext ;
   private String lV37Stocksquimicos_ttipprdwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08MS2_A6302TipPrdDsc ;
   private boolean[] P08MS2_n6302TipPrdDsc ;
   private short[] P08MS2_A6301TipPrdCod ;
   private String[] P08MS2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttipprdwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08MS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_ttipprdwwds_1_filterfulltext ,
                                          String AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel ,
                                          String AV38Stocksquimicos_ttipprdwwds_2_tftipprddsc ,
                                          short AV40Stocksquimicos_ttipprdwwds_4_tftipprdcod ,
                                          short AV41Stocksquimicos_ttipprdwwds_5_tftipprdcod_to ,
                                          String A6302TipPrdDsc ,
                                          short A6301TipPrdCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipPrdDsc, TipPrdCod, EmprCod FROM TXPTIPPRD" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_ttipprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TipPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TipPrdCod,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV38Stocksquimicos_ttipprdwwds_2_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_ttipprdwwds_3_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipPrdDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV40Stocksquimicos_ttipprdwwds_4_tftipprdcod) )
      {
         addWhere(sWhereString, "(TipPrdCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV41Stocksquimicos_ttipprdwwds_5_tftipprdcod_to) )
      {
         addWhere(sWhereString, "(TipPrdCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipPrdDsc" ;
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
                  return conditional_P08MS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08MS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 40);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 40);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               return;
      }
   }

}

