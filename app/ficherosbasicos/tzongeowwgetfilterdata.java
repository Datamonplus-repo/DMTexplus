package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tzongeowwgetfilterdata extends GXProcedure
{
   public tzongeowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tzongeowwgetfilterdata.class ), "" );
   }

   public tzongeowwgetfilterdata( int remoteHandle ,
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
      tzongeowwgetfilterdata.this.aP5 = new String[] {""};
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
      tzongeowwgetfilterdata.this.AV26DDOName = aP0;
      tzongeowwgetfilterdata.this.AV27SearchTxt = aP1;
      tzongeowwgetfilterdata.this.AV28SearchTxtTo = aP2;
      tzongeowwgetfilterdata.this.aP3 = aP3;
      tzongeowwgetfilterdata.this.aP4 = aP4;
      tzongeowwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ZONGEONOM") == 0 )
      {
         /* Execute user subroutine: 'LOADZONGEONOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("FicherosBasicos.TZONGEOWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TZONGEOWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FicherosBasicos.TZONGEOWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFZONGEOCOD") == 0 )
         {
            AV12TFZonGeoCod = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFZonGeoCod_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFZONGEONOM") == 0 )
         {
            AV10TFZonGeoNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFZONGEONOM_SEL") == 0 )
         {
            AV11TFZonGeoNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADZONGEONOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFZonGeoNom = AV27SearchTxt ;
      AV11TFZonGeoNom_Sel = "" ;
      AV37Ficherosbasicos_tzongeowwds_1_filterfulltext = AV32FilterFullText ;
      AV38Ficherosbasicos_tzongeowwds_2_tfzongeocod = AV12TFZonGeoCod ;
      AV39Ficherosbasicos_tzongeowwds_3_tfzongeocod_to = AV13TFZonGeoCod_To ;
      AV40Ficherosbasicos_tzongeowwds_4_tfzongeonom = AV10TFZonGeoNom ;
      AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel = AV11TFZonGeoNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Ficherosbasicos_tzongeowwds_1_filterfulltext ,
                                           Short.valueOf(AV38Ficherosbasicos_tzongeowwds_2_tfzongeocod) ,
                                           Short.valueOf(AV39Ficherosbasicos_tzongeowwds_3_tfzongeocod_to) ,
                                           AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel ,
                                           AV40Ficherosbasicos_tzongeowwds_4_tfzongeonom ,
                                           Short.valueOf(A858ZonGeoCod) ,
                                           A1360ZonGeoNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Ficherosbasicos_tzongeowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ficherosbasicos_tzongeowwds_1_filterfulltext), "%", "") ;
      lV37Ficherosbasicos_tzongeowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Ficherosbasicos_tzongeowwds_1_filterfulltext), "%", "") ;
      lV40Ficherosbasicos_tzongeowwds_4_tfzongeonom = GXutil.padr( GXutil.rtrim( AV40Ficherosbasicos_tzongeowwds_4_tfzongeonom), 30, "%") ;
      /* Using cursor P0A0K2 */
      pr_default.execute(0, new Object[] {lV37Ficherosbasicos_tzongeowwds_1_filterfulltext, lV37Ficherosbasicos_tzongeowwds_1_filterfulltext, Short.valueOf(AV38Ficherosbasicos_tzongeowwds_2_tfzongeocod), Short.valueOf(AV39Ficherosbasicos_tzongeowwds_3_tfzongeocod_to), lV40Ficherosbasicos_tzongeowwds_4_tfzongeonom, AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA0K2 = false ;
         A1360ZonGeoNom = P0A0K2_A1360ZonGeoNom[0] ;
         n1360ZonGeoNom = P0A0K2_n1360ZonGeoNom[0] ;
         A858ZonGeoCod = P0A0K2_A858ZonGeoCod[0] ;
         A396EmprCod = P0A0K2_A396EmprCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A0K2_A1360ZonGeoNom[0], A1360ZonGeoNom) == 0 ) )
         {
            brkA0K2 = false ;
            A858ZonGeoCod = P0A0K2_A858ZonGeoCod[0] ;
            A396EmprCod = P0A0K2_A396EmprCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA0K2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1360ZonGeoNom)==0) )
         {
            AV15Option = A1360ZonGeoNom ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA0K2 )
         {
            brkA0K2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tzongeowwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = tzongeowwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = tzongeowwgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFZonGeoNom = "" ;
      AV11TFZonGeoNom_Sel = "" ;
      A1360ZonGeoNom = "" ;
      AV37Ficherosbasicos_tzongeowwds_1_filterfulltext = "" ;
      AV40Ficherosbasicos_tzongeowwds_4_tfzongeonom = "" ;
      AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel = "" ;
      scmdbuf = "" ;
      lV37Ficherosbasicos_tzongeowwds_1_filterfulltext = "" ;
      lV40Ficherosbasicos_tzongeowwds_4_tfzongeonom = "" ;
      P0A0K2_A1360ZonGeoNom = new String[] {""} ;
      P0A0K2_n1360ZonGeoNom = new boolean[] {false} ;
      P0A0K2_A858ZonGeoCod = new short[1] ;
      P0A0K2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tzongeowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A0K2_A1360ZonGeoNom, P0A0K2_n1360ZonGeoNom, P0A0K2_A858ZonGeoCod, P0A0K2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12TFZonGeoCod ;
   private short AV13TFZonGeoCod_To ;
   private short AV38Ficherosbasicos_tzongeowwds_2_tfzongeocod ;
   private short AV39Ficherosbasicos_tzongeowwds_3_tfzongeocod_to ;
   private short A858ZonGeoCod ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV20count ;
   private String AV10TFZonGeoNom ;
   private String AV11TFZonGeoNom_Sel ;
   private String A1360ZonGeoNom ;
   private String AV40Ficherosbasicos_tzongeowwds_4_tfzongeonom ;
   private String AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel ;
   private String scmdbuf ;
   private String lV40Ficherosbasicos_tzongeowwds_4_tfzongeonom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA0K2 ;
   private boolean n1360ZonGeoNom ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Ficherosbasicos_tzongeowwds_1_filterfulltext ;
   private String lV37Ficherosbasicos_tzongeowwds_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A0K2_A1360ZonGeoNom ;
   private boolean[] P0A0K2_n1360ZonGeoNom ;
   private short[] P0A0K2_A858ZonGeoCod ;
   private String[] P0A0K2_A396EmprCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class tzongeowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A0K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Ficherosbasicos_tzongeowwds_1_filterfulltext ,
                                          short AV38Ficherosbasicos_tzongeowwds_2_tfzongeocod ,
                                          short AV39Ficherosbasicos_tzongeowwds_3_tfzongeocod_to ,
                                          String AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel ,
                                          String AV40Ficherosbasicos_tzongeowwds_4_tfzongeonom ,
                                          short A858ZonGeoCod ,
                                          String A1360ZonGeoNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ZonGeoNom, ZonGeoCod, EmprCod FROM TXPZONGEO" ;
      if ( ! (GXutil.strcmp("", AV37Ficherosbasicos_tzongeowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ZonGeoCod,'990'), 2) like '%' || ?) or ( UPPER(ZonGeoNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Ficherosbasicos_tzongeowwds_2_tfzongeocod) )
      {
         addWhere(sWhereString, "(ZonGeoCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Ficherosbasicos_tzongeowwds_3_tfzongeocod_to) )
      {
         addWhere(sWhereString, "(ZonGeoCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel)==0) && ( ! (GXutil.strcmp("", AV40Ficherosbasicos_tzongeowwds_4_tfzongeonom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ZonGeoNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Ficherosbasicos_tzongeowwds_5_tfzongeonom_sel)==0) )
      {
         addWhere(sWhereString, "(ZonGeoNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ZonGeoNom" ;
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
                  return conditional_P0A0K2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               return;
      }
   }

}

