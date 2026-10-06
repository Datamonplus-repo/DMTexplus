package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tnxt001wwgetfilterdata extends GXProcedure
{
   public tnxt001wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnxt001wwgetfilterdata.class ), "" );
   }

   public tnxt001wwgetfilterdata( int remoteHandle ,
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
      tnxt001wwgetfilterdata.this.aP5 = new String[] {""};
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
      tnxt001wwgetfilterdata.this.AV32DDOName = aP0;
      tnxt001wwgetfilterdata.this.AV33SearchTxt = aP1;
      tnxt001wwgetfilterdata.this.AV34SearchTxtTo = aP2;
      tnxt001wwgetfilterdata.this.aP3 = aP3;
      tnxt001wwgetfilterdata.this.aP4 = aP4;
      tnxt001wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_DESADSC") == 0 )
      {
         /* Execute user subroutine: 'LOADDESADSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TNXT001WWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TNXT001WWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TNXT001WWGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDESAID") == 0 )
         {
            AV14TFDesaID = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFDesaID_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDESADSC") == 0 )
         {
            AV16TFDesaDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDESADSC_SEL") == 0 )
         {
            AV17TFDesaDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDESADSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFDesaDsc = AV33SearchTxt ;
      AV17TFDesaDsc_Sel = "" ;
      AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext = AV38FilterFullText ;
      AV44Ficherosbasicos_tnxt001wwds_2_tfdesaid = AV14TFDesaID ;
      AV45Ficherosbasicos_tnxt001wwds_3_tfdesaid_to = AV15TFDesaID_To ;
      AV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc = AV16TFDesaDsc ;
      AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel = AV17TFDesaDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext ,
                                           Short.valueOf(AV44Ficherosbasicos_tnxt001wwds_2_tfdesaid) ,
                                           Short.valueOf(AV45Ficherosbasicos_tnxt001wwds_3_tfdesaid_to) ,
                                           AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel ,
                                           AV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc ,
                                           Short.valueOf(A11862DesaID) ,
                                           A11866DesaDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV43Ficherosbasicos_tnxt001wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext), "%", "") ;
      lV43Ficherosbasicos_tnxt001wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext), "%", "") ;
      lV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc = GXutil.padr( GXutil.rtrim( AV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc), 30, "%") ;
      /* Using cursor P0A192 */
      pr_default.execute(0, new Object[] {lV43Ficherosbasicos_tnxt001wwds_1_filterfulltext, lV43Ficherosbasicos_tnxt001wwds_1_filterfulltext, Short.valueOf(AV44Ficherosbasicos_tnxt001wwds_2_tfdesaid), Short.valueOf(AV45Ficherosbasicos_tnxt001wwds_3_tfdesaid_to), lV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc, AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA192 = false ;
         A11866DesaDsc = P0A192_A11866DesaDsc[0] ;
         n11866DesaDsc = P0A192_n11866DesaDsc[0] ;
         A11862DesaID = P0A192_A11862DesaID[0] ;
         A396EmprCod = P0A192_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A192_A11866DesaDsc[0], A11866DesaDsc) == 0 ) )
         {
            brkA192 = false ;
            A11862DesaID = P0A192_A11862DesaID[0] ;
            A396EmprCod = P0A192_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brkA192 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11866DesaDsc)==0) )
         {
            AV21Option = A11866DesaDsc ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA192 )
         {
            brkA192 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tnxt001wwgetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = tnxt001wwgetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = tnxt001wwgetfilterdata.this.AV37OptionIndexesJson;
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
      AV16TFDesaDsc = "" ;
      AV17TFDesaDsc_Sel = "" ;
      A11866DesaDsc = "" ;
      AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext = "" ;
      AV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc = "" ;
      AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel = "" ;
      scmdbuf = "" ;
      lV43Ficherosbasicos_tnxt001wwds_1_filterfulltext = "" ;
      lV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc = "" ;
      P0A192_A11866DesaDsc = new String[] {""} ;
      P0A192_n11866DesaDsc = new boolean[] {false} ;
      P0A192_A11862DesaID = new short[1] ;
      P0A192_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV21Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tnxt001wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A192_A11866DesaDsc, P0A192_n11866DesaDsc, P0A192_A11862DesaID, P0A192_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14TFDesaID ;
   private short AV15TFDesaID_To ;
   private short AV44Ficherosbasicos_tnxt001wwds_2_tfdesaid ;
   private short AV45Ficherosbasicos_tnxt001wwds_3_tfdesaid_to ;
   private short A11862DesaID ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private long AV26count ;
   private String AV16TFDesaDsc ;
   private String AV17TFDesaDsc_Sel ;
   private String A11866DesaDsc ;
   private String AV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc ;
   private String AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel ;
   private String scmdbuf ;
   private String lV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA192 ;
   private boolean n11866DesaDsc ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext ;
   private String lV43Ficherosbasicos_tnxt001wwds_1_filterfulltext ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A192_A11866DesaDsc ;
   private boolean[] P0A192_n11866DesaDsc ;
   private short[] P0A192_A11862DesaID ;
   private String[] P0A192_A396EmprCod ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tnxt001wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A192( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext ,
                                          short AV44Ficherosbasicos_tnxt001wwds_2_tfdesaid ,
                                          short AV45Ficherosbasicos_tnxt001wwds_3_tfdesaid_to ,
                                          String AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel ,
                                          String AV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc ,
                                          short A11862DesaID ,
                                          String A11866DesaDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DesaDsc, DesaID, EmprCod FROM TXPNXT001" ;
      if ( ! (GXutil.strcmp("", AV43Ficherosbasicos_tnxt001wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DesaID,'9990'), 2) like '%' || ?) or ( UPPER(DesaDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV44Ficherosbasicos_tnxt001wwds_2_tfdesaid) )
      {
         addWhere(sWhereString, "(DesaID >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV45Ficherosbasicos_tnxt001wwds_3_tfdesaid_to) )
      {
         addWhere(sWhereString, "(DesaID <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Ficherosbasicos_tnxt001wwds_4_tfdesadsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DesaDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Ficherosbasicos_tnxt001wwds_5_tfdesadsc_sel)==0) )
      {
         addWhere(sWhereString, "(DesaDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DesaDsc" ;
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
                  return conditional_P0A192(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A192", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

