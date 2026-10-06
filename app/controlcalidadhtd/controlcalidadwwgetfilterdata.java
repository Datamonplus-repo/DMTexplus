package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidadwwgetfilterdata extends GXProcedure
{
   public controlcalidadwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadwwgetfilterdata.class ), "" );
   }

   public controlcalidadwwgetfilterdata( int remoteHandle ,
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
      controlcalidadwwgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidadwwgetfilterdata.this.AV41DDOName = aP0;
      controlcalidadwwgetfilterdata.this.AV42SearchTxt = aP1;
      controlcalidadwwgetfilterdata.this.AV43SearchTxtTo = aP2;
      controlcalidadwwgetfilterdata.this.aP3 = aP3;
      controlcalidadwwgetfilterdata.this.aP4 = aP4;
      controlcalidadwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_CCTDSC") == 0 )
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
      AV44OptionsJson = AV31Options.toJSonString(false) ;
      AV45OptionsDescJson = AV33OptionsDesc.toJSonString(false) ;
      AV46OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("ControlCalidadHTD.ControlCalidadWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidadWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("ControlCalidadHTD.ControlCalidadWWGridState"), null, null);
      }
      AV50GXV1 = 1 ;
      while ( AV50GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV50GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV14TFCCTCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCCTCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV16TFCCTDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV17TFCCTDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV50GXV1 = (int)(AV50GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCCTDsc = AV42SearchTxt ;
      AV17TFCCTDsc_Sel = "" ;
      AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext = AV47FilterFullText ;
      AV53Controlcalidadhtd_controlcalidadwwds_2_tfcctcod = AV14TFCCTCod ;
      AV54Controlcalidadhtd_controlcalidadwwds_3_tfcctcod_to = AV15TFCCTCod_To ;
      AV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc = AV16TFCCTDsc ;
      AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel = AV17TFCCTDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext ,
                                           Integer.valueOf(AV53Controlcalidadhtd_controlcalidadwwds_2_tfcctcod) ,
                                           Integer.valueOf(AV54Controlcalidadhtd_controlcalidadwwds_3_tfcctcod_to) ,
                                           AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel ,
                                           AV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext), "%", "") ;
      lV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext), "%", "") ;
      lV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc = GXutil.padr( GXutil.rtrim( AV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc), 30, "%") ;
      /* Using cursor P09PR2 */
      pr_default.execute(0, new Object[] {lV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext, lV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext, Integer.valueOf(AV53Controlcalidadhtd_controlcalidadwwds_2_tfcctcod), Integer.valueOf(AV54Controlcalidadhtd_controlcalidadwwds_3_tfcctcod_to), lV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc, AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9PR2 = false ;
         A4036CCTDsc = P09PR2_A4036CCTDsc[0] ;
         A4031CCTCod = P09PR2_A4031CCTCod[0] ;
         A396EmprCod = P09PR2_A396EmprCod[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09PR2_A4036CCTDsc[0], A4036CCTDsc) == 0 ) )
         {
            brk9PR2 = false ;
            A4031CCTCod = P09PR2_A4031CCTCod[0] ;
            A396EmprCod = P09PR2_A396EmprCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brk9PR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4036CCTDsc)==0) )
         {
            AV30Option = A4036CCTDsc ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9PR2 )
         {
            brk9PR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidadwwgetfilterdata.this.AV44OptionsJson;
      this.aP4[0] = controlcalidadwwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = controlcalidadwwgetfilterdata.this.AV46OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV46OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47FilterFullText = "" ;
      AV16TFCCTDsc = "" ;
      AV17TFCCTDsc_Sel = "" ;
      A4036CCTDsc = "" ;
      AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext = "" ;
      AV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc = "" ;
      AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel = "" ;
      scmdbuf = "" ;
      lV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext = "" ;
      lV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc = "" ;
      P09PR2_A4036CCTDsc = new String[] {""} ;
      P09PR2_A4031CCTCod = new int[1] ;
      P09PR2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV30Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09PR2_A4036CCTDsc, P09PR2_A4031CCTCod, P09PR2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV50GXV1 ;
   private int AV14TFCCTCod ;
   private int AV15TFCCTCod_To ;
   private int AV53Controlcalidadhtd_controlcalidadwwds_2_tfcctcod ;
   private int AV54Controlcalidadhtd_controlcalidadwwds_3_tfcctcod_to ;
   private int A4031CCTCod ;
   private long AV35count ;
   private String AV16TFCCTDsc ;
   private String AV17TFCCTDsc_Sel ;
   private String A4036CCTDsc ;
   private String AV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc ;
   private String AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel ;
   private String scmdbuf ;
   private String lV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9PR2 ;
   private String AV44OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV46OptionIndexesJson ;
   private String AV41DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV47FilterFullText ;
   private String AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext ;
   private String lV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09PR2_A4036CCTDsc ;
   private int[] P09PR2_A4031CCTCod ;
   private String[] P09PR2_A396EmprCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV33OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class controlcalidadwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09PR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext ,
                                          int AV53Controlcalidadhtd_controlcalidadwwds_2_tfcctcod ,
                                          int AV54Controlcalidadhtd_controlcalidadwwds_3_tfcctcod_to ,
                                          String AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel ,
                                          String AV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CCTDsc, CCTCod, EmprCod FROM TXPCCDef" ;
      if ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidadwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(CCTDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV53Controlcalidadhtd_controlcalidadwwds_2_tfcctcod) )
      {
         addWhere(sWhereString, "(CCTCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV54Controlcalidadhtd_controlcalidadwwds_3_tfcctcod_to) )
      {
         addWhere(sWhereString, "(CCTCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidadwwds_4_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidadwwds_5_tfcctdsc_sel)==0) )
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
                  return conditional_P09PR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09PR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

