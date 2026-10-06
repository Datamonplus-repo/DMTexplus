package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdefwwgetfilterdata extends GXProcedure
{
   public controlcalidad_ccdefwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdefwwgetfilterdata.class ), "" );
   }

   public controlcalidad_ccdefwwgetfilterdata( int remoteHandle ,
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
      controlcalidad_ccdefwwgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidad_ccdefwwgetfilterdata.this.AV26DDOName = aP0;
      controlcalidad_ccdefwwgetfilterdata.this.AV27SearchTxt = aP1;
      controlcalidad_ccdefwwgetfilterdata.this.AV28SearchTxtTo = aP2;
      controlcalidad_ccdefwwgetfilterdata.this.aP3 = aP3;
      controlcalidad_ccdefwwgetfilterdata.this.aP4 = aP4;
      controlcalidad_ccdefwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_CCTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("ControlCalidadHTD.ControlCalidad_CCDEFWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CCDEFWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("ControlCalidadHTD.ControlCalidad_CCDEFWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV10TFCCTCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV12TFCCTDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV13TFCCTDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTDsc = AV27SearchTxt ;
      AV13TFCCTDsc_Sel = "" ;
      AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Controlcalidadhtd_controlcalidad_ccdefwwds_2_tfcctcod = AV10TFCCTCod ;
      AV39Controlcalidadhtd_controlcalidad_ccdefwwds_3_tfcctcod_to = AV11TFCCTCod_To ;
      AV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc = AV12TFCCTDsc ;
      AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel = AV13TFCCTDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext ,
                                           Integer.valueOf(AV38Controlcalidadhtd_controlcalidad_ccdefwwds_2_tfcctcod) ,
                                           Integer.valueOf(AV39Controlcalidadhtd_controlcalidad_ccdefwwds_3_tfcctcod_to) ,
                                           AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel ,
                                           AV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext), "%", "") ;
      lV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext), "%", "") ;
      lV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc = GXutil.padr( GXutil.rtrim( AV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc), 30, "%") ;
      /* Using cursor P0AP12 */
      pr_default.execute(0, new Object[] {lV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext, lV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext, Integer.valueOf(AV38Controlcalidadhtd_controlcalidad_ccdefwwds_2_tfcctcod), Integer.valueOf(AV39Controlcalidadhtd_controlcalidad_ccdefwwds_3_tfcctcod_to), lV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc, AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAP12 = false ;
         A4036CCTDsc = P0AP12_A4036CCTDsc[0] ;
         A4031CCTCod = P0AP12_A4031CCTCod[0] ;
         A396EmprCod = P0AP12_A396EmprCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AP12_A4036CCTDsc[0], A4036CCTDsc) == 0 ) )
         {
            brkAP12 = false ;
            A4031CCTCod = P0AP12_A4031CCTCod[0] ;
            A396EmprCod = P0AP12_A396EmprCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAP12 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4036CCTDsc)==0) )
         {
            AV15Option = A4036CCTDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAP12 )
         {
            brkAP12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccdefwwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = controlcalidad_ccdefwwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = controlcalidad_ccdefwwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFCCTDsc = "" ;
      AV13TFCCTDsc_Sel = "" ;
      A4036CCTDsc = "" ;
      AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext = "" ;
      AV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc = "" ;
      AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel = "" ;
      scmdbuf = "" ;
      lV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext = "" ;
      lV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc = "" ;
      P0AP12_A4036CCTDsc = new String[] {""} ;
      P0AP12_A4031CCTCod = new int[1] ;
      P0AP12_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdefwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AP12_A4036CCTDsc, P0AP12_A4031CCTCod, P0AP12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV35GXV1 ;
   private int AV10TFCCTCod ;
   private int AV11TFCCTCod_To ;
   private int AV38Controlcalidadhtd_controlcalidad_ccdefwwds_2_tfcctcod ;
   private int AV39Controlcalidadhtd_controlcalidad_ccdefwwds_3_tfcctcod_to ;
   private int A4031CCTCod ;
   private long AV20count ;
   private String AV12TFCCTDsc ;
   private String AV13TFCCTDsc_Sel ;
   private String A4036CCTDsc ;
   private String AV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc ;
   private String AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel ;
   private String scmdbuf ;
   private String lV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAP12 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext ;
   private String lV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AP12_A4036CCTDsc ;
   private int[] P0AP12_A4031CCTCod ;
   private String[] P0AP12_A396EmprCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class controlcalidad_ccdefwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AP12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext ,
                                          int AV38Controlcalidadhtd_controlcalidad_ccdefwwds_2_tfcctcod ,
                                          int AV39Controlcalidadhtd_controlcalidad_ccdefwwds_3_tfcctcod_to ,
                                          String AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel ,
                                          String AV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CCTDsc, CCTCod, EmprCod FROM TXPCCDef" ;
      if ( ! (GXutil.strcmp("", AV37Controlcalidadhtd_controlcalidad_ccdefwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(CCTDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Controlcalidadhtd_controlcalidad_ccdefwwds_2_tfcctcod) )
      {
         addWhere(sWhereString, "(CCTCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Controlcalidadhtd_controlcalidad_ccdefwwds_3_tfcctcod_to) )
      {
         addWhere(sWhereString, "(CCTCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Controlcalidadhtd_controlcalidad_ccdefwwds_4_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Controlcalidadhtd_controlcalidad_ccdefwwds_5_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CCTDsc" ;
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
                  return conditional_P0AP12(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AP12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
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

