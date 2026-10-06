package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprdfabwwgetfilterdata extends GXProcedure
{
   public tprdfabwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdfabwwgetfilterdata.class ), "" );
   }

   public tprdfabwwgetfilterdata( int remoteHandle ,
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
      tprdfabwwgetfilterdata.this.aP5 = new String[] {""};
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
      tprdfabwwgetfilterdata.this.AV16DDOName = aP0;
      tprdfabwwgetfilterdata.this.AV14SearchTxt = aP1;
      tprdfabwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tprdfabwwgetfilterdata.this.aP3 = aP3;
      tprdfabwwgetfilterdata.this.aP4 = aP4;
      tprdfabwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDFABNM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDFABNMOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.TPRDFABWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TPRDFABWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.TPRDFABWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFABNM") == 0 )
         {
            AV12TFPrdFabNm = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFABNM_SEL") == 0 )
         {
            AV13TFPrdFabNm_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFABID") == 0 )
         {
            AV10TFPrdFabId = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrdFabId_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDFABNMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdFabNm = AV14SearchTxt ;
      AV13TFPrdFabNm_Sel = "" ;
      AV37Stocksquimicos_tprdfabwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm = AV12TFPrdFabNm ;
      AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel = AV13TFPrdFabNm_Sel ;
      AV40Stocksquimicos_tprdfabwwds_4_tfprdfabid = AV10TFPrdFabId ;
      AV41Stocksquimicos_tprdfabwwds_5_tfprdfabid_to = AV11TFPrdFabId_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_tprdfabwwds_1_filterfulltext ,
                                           AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel ,
                                           AV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm ,
                                           Integer.valueOf(AV40Stocksquimicos_tprdfabwwds_4_tfprdfabid) ,
                                           Integer.valueOf(AV41Stocksquimicos_tprdfabwwds_5_tfprdfabid_to) ,
                                           A12715PrdFabNm ,
                                           Integer.valueOf(A12714PrdFabId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      });
      lV37Stocksquimicos_tprdfabwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_tprdfabwwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_tprdfabwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_tprdfabwwds_1_filterfulltext), "%", "") ;
      lV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm = GXutil.padr( GXutil.rtrim( AV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm), 60, "%") ;
      /* Using cursor P08MO2 */
      pr_default.execute(0, new Object[] {lV37Stocksquimicos_tprdfabwwds_1_filterfulltext, lV37Stocksquimicos_tprdfabwwds_1_filterfulltext, lV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm, AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel, Integer.valueOf(AV40Stocksquimicos_tprdfabwwds_4_tfprdfabid), Integer.valueOf(AV41Stocksquimicos_tprdfabwwds_5_tfprdfabid_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8MO2 = false ;
         A12715PrdFabNm = P08MO2_A12715PrdFabNm[0] ;
         n12715PrdFabNm = P08MO2_n12715PrdFabNm[0] ;
         A12714PrdFabId = P08MO2_A12714PrdFabId[0] ;
         A396EmprCod = P08MO2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08MO2_A12715PrdFabNm[0], A12715PrdFabNm) == 0 ) )
         {
            brk8MO2 = false ;
            A12714PrdFabId = P08MO2_A12714PrdFabId[0] ;
            A396EmprCod = P08MO2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8MO2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A12715PrdFabNm)==0) )
         {
            AV18Option = A12715PrdFabNm ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8MO2 )
         {
            brk8MO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprdfabwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tprdfabwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tprdfabwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFPrdFabNm = "" ;
      AV13TFPrdFabNm_Sel = "" ;
      A12715PrdFabNm = "" ;
      AV37Stocksquimicos_tprdfabwwds_1_filterfulltext = "" ;
      AV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm = "" ;
      AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel = "" ;
      scmdbuf = "" ;
      lV37Stocksquimicos_tprdfabwwds_1_filterfulltext = "" ;
      lV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm = "" ;
      P08MO2_A12715PrdFabNm = new String[] {""} ;
      P08MO2_n12715PrdFabNm = new boolean[] {false} ;
      P08MO2_A12714PrdFabId = new int[1] ;
      P08MO2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tprdfabwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08MO2_A12715PrdFabNm, P08MO2_n12715PrdFabNm, P08MO2_A12714PrdFabId, P08MO2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private int AV10TFPrdFabId ;
   private int AV11TFPrdFabId_To ;
   private int AV40Stocksquimicos_tprdfabwwds_4_tfprdfabid ;
   private int AV41Stocksquimicos_tprdfabwwds_5_tfprdfabid_to ;
   private int A12714PrdFabId ;
   private long AV26count ;
   private String AV12TFPrdFabNm ;
   private String AV13TFPrdFabNm_Sel ;
   private String A12715PrdFabNm ;
   private String AV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm ;
   private String AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel ;
   private String scmdbuf ;
   private String lV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8MO2 ;
   private boolean n12715PrdFabNm ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Stocksquimicos_tprdfabwwds_1_filterfulltext ;
   private String lV37Stocksquimicos_tprdfabwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08MO2_A12715PrdFabNm ;
   private boolean[] P08MO2_n12715PrdFabNm ;
   private int[] P08MO2_A12714PrdFabId ;
   private String[] P08MO2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tprdfabwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08MO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_tprdfabwwds_1_filterfulltext ,
                                          String AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel ,
                                          String AV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm ,
                                          int AV40Stocksquimicos_tprdfabwwds_4_tfprdfabid ,
                                          int AV41Stocksquimicos_tprdfabwwds_5_tfprdfabid_to ,
                                          String A12715PrdFabNm ,
                                          int A12714PrdFabId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdFabNm, PrdFabId, EmprCod FROM TXPPRDFAB" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_tprdfabwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdFabNm) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(PrdFabId,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel)==0) && ( ! (GXutil.strcmp("", AV38Stocksquimicos_tprdfabwwds_2_tfprdfabnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdFabNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_tprdfabwwds_3_tfprdfabnm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdFabNm = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV40Stocksquimicos_tprdfabwwds_4_tfprdfabid) )
      {
         addWhere(sWhereString, "(PrdFabId >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV41Stocksquimicos_tprdfabwwds_5_tfprdfabid_to) )
      {
         addWhere(sWhereString, "(PrdFabId <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdFabNm" ;
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
                  return conditional_P08MO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08MO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
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
                  stmt.setString(sIdx, (String)parms[8], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 60);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

