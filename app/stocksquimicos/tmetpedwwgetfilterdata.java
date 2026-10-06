package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmetpedwwgetfilterdata extends GXProcedure
{
   public tmetpedwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmetpedwwgetfilterdata.class ), "" );
   }

   public tmetpedwwgetfilterdata( int remoteHandle ,
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
      tmetpedwwgetfilterdata.this.aP5 = new String[] {""};
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
      tmetpedwwgetfilterdata.this.AV16DDOName = aP0;
      tmetpedwwgetfilterdata.this.AV14SearchTxt = aP1;
      tmetpedwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tmetpedwwgetfilterdata.this.aP3 = aP3;
      tmetpedwwgetfilterdata.this.aP4 = aP4;
      tmetpedwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_METDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMETDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.TMETPEDWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TMETPEDWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.TMETPEDWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETCOD") == 0 )
         {
            AV10TFMetCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFMetCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC") == 0 )
         {
            AV12TFMetDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETDSC_SEL") == 0 )
         {
            AV13TFMetDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMetDsc = AV14SearchTxt ;
      AV13TFMetDsc_Sel = "" ;
      AV37Stocksquimicos_tmetpedwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_tmetpedwwds_2_tfmetcod = AV10TFMetCod ;
      AV39Stocksquimicos_tmetpedwwds_3_tfmetcod_to = AV11TFMetCod_To ;
      AV40Stocksquimicos_tmetpedwwds_4_tfmetdsc = AV12TFMetDsc ;
      AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel = AV13TFMetDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_tmetpedwwds_1_filterfulltext ,
                                           Byte.valueOf(AV38Stocksquimicos_tmetpedwwds_2_tfmetcod) ,
                                           Byte.valueOf(AV39Stocksquimicos_tmetpedwwds_3_tfmetcod_to) ,
                                           AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel ,
                                           AV40Stocksquimicos_tmetpedwwds_4_tfmetdsc ,
                                           Byte.valueOf(A629MetCod) ,
                                           A630MetDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Stocksquimicos_tmetpedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_tmetpedwwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_tmetpedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_tmetpedwwds_1_filterfulltext), "%", "") ;
      lV40Stocksquimicos_tmetpedwwds_4_tfmetdsc = GXutil.padr( GXutil.rtrim( AV40Stocksquimicos_tmetpedwwds_4_tfmetdsc), 8, "%") ;
      /* Using cursor P08MW2 */
      pr_default.execute(0, new Object[] {lV37Stocksquimicos_tmetpedwwds_1_filterfulltext, lV37Stocksquimicos_tmetpedwwds_1_filterfulltext, Byte.valueOf(AV38Stocksquimicos_tmetpedwwds_2_tfmetcod), Byte.valueOf(AV39Stocksquimicos_tmetpedwwds_3_tfmetcod_to), lV40Stocksquimicos_tmetpedwwds_4_tfmetdsc, AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8MW2 = false ;
         A630MetDsc = P08MW2_A630MetDsc[0] ;
         n630MetDsc = P08MW2_n630MetDsc[0] ;
         A629MetCod = P08MW2_A629MetCod[0] ;
         A396EmprCod = P08MW2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08MW2_A630MetDsc[0], A630MetDsc) == 0 ) )
         {
            brk8MW2 = false ;
            A629MetCod = P08MW2_A629MetCod[0] ;
            A396EmprCod = P08MW2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8MW2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A630MetDsc)==0) )
         {
            AV18Option = A630MetDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8MW2 )
         {
            brk8MW2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmetpedwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tmetpedwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tmetpedwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFMetDsc = "" ;
      AV13TFMetDsc_Sel = "" ;
      A630MetDsc = "" ;
      AV37Stocksquimicos_tmetpedwwds_1_filterfulltext = "" ;
      AV40Stocksquimicos_tmetpedwwds_4_tfmetdsc = "" ;
      AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel = "" ;
      scmdbuf = "" ;
      lV37Stocksquimicos_tmetpedwwds_1_filterfulltext = "" ;
      lV40Stocksquimicos_tmetpedwwds_4_tfmetdsc = "" ;
      P08MW2_A630MetDsc = new String[] {""} ;
      P08MW2_n630MetDsc = new boolean[] {false} ;
      P08MW2_A629MetCod = new byte[1] ;
      P08MW2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tmetpedwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08MW2_A630MetDsc, P08MW2_n630MetDsc, P08MW2_A629MetCod, P08MW2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFMetCod ;
   private byte AV11TFMetCod_To ;
   private byte AV38Stocksquimicos_tmetpedwwds_2_tfmetcod ;
   private byte AV39Stocksquimicos_tmetpedwwds_3_tfmetcod_to ;
   private byte A629MetCod ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFMetDsc ;
   private String AV13TFMetDsc_Sel ;
   private String A630MetDsc ;
   private String AV40Stocksquimicos_tmetpedwwds_4_tfmetdsc ;
   private String AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel ;
   private String scmdbuf ;
   private String lV40Stocksquimicos_tmetpedwwds_4_tfmetdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8MW2 ;
   private boolean n630MetDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Stocksquimicos_tmetpedwwds_1_filterfulltext ;
   private String lV37Stocksquimicos_tmetpedwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08MW2_A630MetDsc ;
   private boolean[] P08MW2_n630MetDsc ;
   private byte[] P08MW2_A629MetCod ;
   private String[] P08MW2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tmetpedwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08MW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_tmetpedwwds_1_filterfulltext ,
                                          byte AV38Stocksquimicos_tmetpedwwds_2_tfmetcod ,
                                          byte AV39Stocksquimicos_tmetpedwwds_3_tfmetcod_to ,
                                          String AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel ,
                                          String AV40Stocksquimicos_tmetpedwwds_4_tfmetdsc ,
                                          byte A629MetCod ,
                                          String A630MetDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MetDsc, MetCod, EmprCod FROM TXPMETPED" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_tmetpedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(MetCod,'90'), 2) like '%' || ?) or ( UPPER(MetDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Stocksquimicos_tmetpedwwds_2_tfmetcod) )
      {
         addWhere(sWhereString, "(MetCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Stocksquimicos_tmetpedwwds_3_tfmetcod_to) )
      {
         addWhere(sWhereString, "(MetCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Stocksquimicos_tmetpedwwds_4_tfmetdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_tmetpedwwds_5_tfmetdsc_sel)==0) )
      {
         addWhere(sWhereString, "(MetDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MetDsc" ;
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
                  return conditional_P08MW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08MW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               return;
      }
   }

}

