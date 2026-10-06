package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipentwwgetfilterdata extends GXProcedure
{
   public ttipentwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipentwwgetfilterdata.class ), "" );
   }

   public ttipentwwgetfilterdata( int remoteHandle ,
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
      ttipentwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipentwwgetfilterdata.this.AV16DDOName = aP0;
      ttipentwwgetfilterdata.this.AV14SearchTxt = aP1;
      ttipentwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttipentwwgetfilterdata.this.aP3 = aP3;
      ttipentwwgetfilterdata.this.aP4 = aP4;
      ttipentwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TIPENTNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPENTNOMOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TTIPENTWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTIPENTWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TTIPENTWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV10TFTipEntCod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipEntCod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV12TFTipEntNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV13TFTipEntNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPENTNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipEntNom = AV14SearchTxt ;
      AV13TFTipEntNom_Sel = "" ;
      AV51Ttipentwwds_1_filterfulltext = AV46FilterFullText ;
      AV52Ttipentwwds_2_tftipentcod = AV10TFTipEntCod ;
      AV53Ttipentwwds_3_tftipentcod_to = AV11TFTipEntCod_To ;
      AV54Ttipentwwds_4_tftipentnom = AV12TFTipEntNom ;
      AV55Ttipentwwds_5_tftipentnom_sel = AV13TFTipEntNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Ttipentwwds_1_filterfulltext ,
                                           Short.valueOf(AV52Ttipentwwds_2_tftipentcod) ,
                                           Short.valueOf(AV53Ttipentwwds_3_tftipentcod_to) ,
                                           AV55Ttipentwwds_5_tftipentnom_sel ,
                                           AV54Ttipentwwds_4_tftipentnom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV51Ttipentwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ttipentwwds_1_filterfulltext), "%", "") ;
      lV51Ttipentwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ttipentwwds_1_filterfulltext), "%", "") ;
      lV54Ttipentwwds_4_tftipentnom = GXutil.padr( GXutil.rtrim( AV54Ttipentwwds_4_tftipentnom), 25, "%") ;
      /* Using cursor P07Y32 */
      pr_default.execute(0, new Object[] {lV51Ttipentwwds_1_filterfulltext, lV51Ttipentwwds_1_filterfulltext, Short.valueOf(AV52Ttipentwwds_2_tftipentcod), Short.valueOf(AV53Ttipentwwds_3_tftipentcod_to), lV54Ttipentwwds_4_tftipentnom, AV55Ttipentwwds_5_tftipentnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7Y32 = false ;
         A1212TipEntNom = P07Y32_A1212TipEntNom[0] ;
         n1212TipEntNom = P07Y32_n1212TipEntNom[0] ;
         A1211TipEntCod = P07Y32_A1211TipEntCod[0] ;
         A396EmprCod = P07Y32_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07Y32_A1212TipEntNom[0], A1212TipEntNom) == 0 ) )
         {
            brk7Y32 = false ;
            A1211TipEntCod = P07Y32_A1211TipEntCod[0] ;
            A396EmprCod = P07Y32_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk7Y32 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1212TipEntNom)==0) )
         {
            AV18Option = A1212TipEntNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7Y32 )
         {
            brk7Y32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipentwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttipentwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttipentwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV12TFTipEntNom = "" ;
      AV13TFTipEntNom_Sel = "" ;
      A1212TipEntNom = "" ;
      AV51Ttipentwwds_1_filterfulltext = "" ;
      AV54Ttipentwwds_4_tftipentnom = "" ;
      AV55Ttipentwwds_5_tftipentnom_sel = "" ;
      scmdbuf = "" ;
      lV51Ttipentwwds_1_filterfulltext = "" ;
      lV54Ttipentwwds_4_tftipentnom = "" ;
      P07Y32_A1212TipEntNom = new String[] {""} ;
      P07Y32_n1212TipEntNom = new boolean[] {false} ;
      P07Y32_A1211TipEntCod = new short[1] ;
      P07Y32_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttipentwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07Y32_A1212TipEntNom, P07Y32_n1212TipEntNom, P07Y32_A1211TipEntCod, P07Y32_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTipEntCod ;
   private short AV11TFTipEntCod_To ;
   private short AV52Ttipentwwds_2_tftipentcod ;
   private short AV53Ttipentwwds_3_tftipentcod_to ;
   private short A1211TipEntCod ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private long AV26count ;
   private String AV12TFTipEntNom ;
   private String AV13TFTipEntNom_Sel ;
   private String A1212TipEntNom ;
   private String AV54Ttipentwwds_4_tftipentnom ;
   private String AV55Ttipentwwds_5_tftipentnom_sel ;
   private String scmdbuf ;
   private String lV54Ttipentwwds_4_tftipentnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk7Y32 ;
   private boolean n1212TipEntNom ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Ttipentwwds_1_filterfulltext ;
   private String lV51Ttipentwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07Y32_A1212TipEntNom ;
   private boolean[] P07Y32_n1212TipEntNom ;
   private short[] P07Y32_A1211TipEntCod ;
   private String[] P07Y32_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttipentwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07Y32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Ttipentwwds_1_filterfulltext ,
                                          short AV52Ttipentwwds_2_tftipentcod ,
                                          short AV53Ttipentwwds_3_tftipentcod_to ,
                                          String AV55Ttipentwwds_5_tftipentnom_sel ,
                                          String AV54Ttipentwwds_4_tftipentnom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TipEntNom, TipEntCod, EmprCod FROM TXPENTRAD" ;
      if ( ! (GXutil.strcmp("", AV51Ttipentwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipEntCod,'9990'), 2) like '%' || ?) or ( UPPER(TipEntNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV52Ttipentwwds_2_tftipentcod) )
      {
         addWhere(sWhereString, "(TipEntCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Ttipentwwds_3_tftipentcod_to) )
      {
         addWhere(sWhereString, "(TipEntCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ttipentwwds_5_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV54Ttipentwwds_4_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ttipentwwds_5_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(TipEntNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TipEntNom" ;
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
                  return conditional_P07Y32(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07Y32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
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
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 25);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 25);
               }
               return;
      }
   }

}

