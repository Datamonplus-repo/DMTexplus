package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tnxt000wwgetfilterdata extends GXProcedure
{
   public tnxt000wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnxt000wwgetfilterdata.class ), "" );
   }

   public tnxt000wwgetfilterdata( int remoteHandle ,
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
      tnxt000wwgetfilterdata.this.aP5 = new String[] {""};
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
      tnxt000wwgetfilterdata.this.AV32DDOName = aP0;
      tnxt000wwgetfilterdata.this.AV33SearchTxt = aP1;
      tnxt000wwgetfilterdata.this.AV34SearchTxtTo = aP2;
      tnxt000wwgetfilterdata.this.aP3 = aP3;
      tnxt000wwgetfilterdata.this.aP4 = aP4;
      tnxt000wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_CPTEDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCPTEDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TNXT000WWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TNXT000WWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TNXT000WWGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCPTEID") == 0 )
         {
            AV14TFCpteId = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCpteId_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCPTEDSC") == 0 )
         {
            AV16TFCpteDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCPTEDSC_SEL") == 0 )
         {
            AV17TFCpteDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCPTEDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCpteDsc = AV33SearchTxt ;
      AV17TFCpteDsc_Sel = "" ;
      AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext = AV38FilterFullText ;
      AV44Ficherosbasicos_tnxt000wwds_2_tfcpteid = AV14TFCpteId ;
      AV45Ficherosbasicos_tnxt000wwds_3_tfcpteid_to = AV15TFCpteId_To ;
      AV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc = AV16TFCpteDsc ;
      AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel = AV17TFCpteDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext ,
                                           Short.valueOf(AV44Ficherosbasicos_tnxt000wwds_2_tfcpteid) ,
                                           Short.valueOf(AV45Ficherosbasicos_tnxt000wwds_3_tfcpteid_to) ,
                                           AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel ,
                                           AV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc ,
                                           Short.valueOf(A11860CpteId) ,
                                           A11865CpteDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV43Ficherosbasicos_tnxt000wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext), "%", "") ;
      lV43Ficherosbasicos_tnxt000wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext), "%", "") ;
      lV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc = GXutil.padr( GXutil.rtrim( AV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc), 30, "%") ;
      /* Using cursor P0A0Y2 */
      pr_default.execute(0, new Object[] {lV43Ficherosbasicos_tnxt000wwds_1_filterfulltext, lV43Ficherosbasicos_tnxt000wwds_1_filterfulltext, Short.valueOf(AV44Ficherosbasicos_tnxt000wwds_2_tfcpteid), Short.valueOf(AV45Ficherosbasicos_tnxt000wwds_3_tfcpteid_to), lV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc, AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA0Y2 = false ;
         A11865CpteDsc = P0A0Y2_A11865CpteDsc[0] ;
         n11865CpteDsc = P0A0Y2_n11865CpteDsc[0] ;
         A11860CpteId = P0A0Y2_A11860CpteId[0] ;
         A396EmprCod = P0A0Y2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A0Y2_A11865CpteDsc[0], A11865CpteDsc) == 0 ) )
         {
            brkA0Y2 = false ;
            A11860CpteId = P0A0Y2_A11860CpteId[0] ;
            A396EmprCod = P0A0Y2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkA0Y2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11865CpteDsc)==0) )
         {
            AV21Option = A11865CpteDsc ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA0Y2 )
         {
            brkA0Y2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tnxt000wwgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = tnxt000wwgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = tnxt000wwgetfilterdata.this.AV37OptionIndexesJson;
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
      AV38FilterFullText = "" ;
      AV16TFCpteDsc = "" ;
      AV17TFCpteDsc_Sel = "" ;
      A11865CpteDsc = "" ;
      AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext = "" ;
      AV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc = "" ;
      AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel = "" ;
      scmdbuf = "" ;
      lV43Ficherosbasicos_tnxt000wwds_1_filterfulltext = "" ;
      lV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc = "" ;
      P0A0Y2_A11865CpteDsc = new String[] {""} ;
      P0A0Y2_n11865CpteDsc = new boolean[] {false} ;
      P0A0Y2_A11860CpteId = new short[1] ;
      P0A0Y2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV21Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tnxt000wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A0Y2_A11865CpteDsc, P0A0Y2_n11865CpteDsc, P0A0Y2_A11860CpteId, P0A0Y2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14TFCpteId ;
   private short AV15TFCpteId_To ;
   private short AV44Ficherosbasicos_tnxt000wwds_2_tfcpteid ;
   private short AV45Ficherosbasicos_tnxt000wwds_3_tfcpteid_to ;
   private short A11860CpteId ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private long AV26count ;
   private String AV16TFCpteDsc ;
   private String AV17TFCpteDsc_Sel ;
   private String A11865CpteDsc ;
   private String AV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc ;
   private String AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel ;
   private String scmdbuf ;
   private String lV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA0Y2 ;
   private boolean n11865CpteDsc ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext ;
   private String lV43Ficherosbasicos_tnxt000wwds_1_filterfulltext ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A0Y2_A11865CpteDsc ;
   private boolean[] P0A0Y2_n11865CpteDsc ;
   private short[] P0A0Y2_A11860CpteId ;
   private String[] P0A0Y2_A396EmprCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tnxt000wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A0Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext ,
                                          short AV44Ficherosbasicos_tnxt000wwds_2_tfcpteid ,
                                          short AV45Ficherosbasicos_tnxt000wwds_3_tfcpteid_to ,
                                          String AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel ,
                                          String AV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc ,
                                          short A11860CpteId ,
                                          String A11865CpteDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CpteDsc, CpteId, EmprCod FROM TXPNXT000" ;
      if ( ! (GXutil.strcmp("", AV43Ficherosbasicos_tnxt000wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CpteId,'9990'), 2) like '%' || ?) or ( UPPER(CpteDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV44Ficherosbasicos_tnxt000wwds_2_tfcpteid) )
      {
         addWhere(sWhereString, "(CpteId >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV45Ficherosbasicos_tnxt000wwds_3_tfcpteid_to) )
      {
         addWhere(sWhereString, "(CpteId <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Ficherosbasicos_tnxt000wwds_4_tfcptedsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CpteDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Ficherosbasicos_tnxt000wwds_5_tfcptedsc_sel)==0) )
      {
         addWhere(sWhereString, "(CpteDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CpteDsc" ;
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
                  return conditional_P0A0Y2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

