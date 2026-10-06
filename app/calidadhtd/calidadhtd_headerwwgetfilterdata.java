package app.calidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class calidadhtd_headerwwgetfilterdata extends GXProcedure
{
   public calidadhtd_headerwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calidadhtd_headerwwgetfilterdata.class ), "" );
   }

   public calidadhtd_headerwwgetfilterdata( int remoteHandle ,
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
      calidadhtd_headerwwgetfilterdata.this.aP5 = new String[] {""};
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
      calidadhtd_headerwwgetfilterdata.this.AV26DDOName = aP0;
      calidadhtd_headerwwgetfilterdata.this.AV27SearchTxt = aP1;
      calidadhtd_headerwwgetfilterdata.this.AV28SearchTxtTo = aP2;
      calidadhtd_headerwwgetfilterdata.this.aP3 = aP3;
      calidadhtd_headerwwgetfilterdata.this.aP4 = aP4;
      calidadhtd_headerwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV21Session.getValue("CalidadHTD.CalidadHTD_headerWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CalidadHTD.CalidadHTD_headerWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("CalidadHTD.CalidadHTD_headerWWGridState"), null, null);
      }
      AV36GXV1 = 1 ;
      while ( AV36GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV36GXV1));
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
         AV36GXV1 = (int)(AV36GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTDsc = AV27SearchTxt ;
      AV13TFCCTDsc_Sel = "" ;
      AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext = AV32FilterFullText ;
      AV39Calidadhtd_calidadhtd_headerwwds_2_tfcctcod = AV10TFCCTCod ;
      AV40Calidadhtd_calidadhtd_headerwwds_3_tfcctcod_to = AV11TFCCTCod_To ;
      AV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc = AV12TFCCTDsc ;
      AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel = AV13TFCCTDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext ,
                                           Integer.valueOf(AV39Calidadhtd_calidadhtd_headerwwds_2_tfcctcod) ,
                                           Integer.valueOf(AV40Calidadhtd_calidadhtd_headerwwds_3_tfcctcod_to) ,
                                           AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel ,
                                           AV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           A396EmprCod ,
                                           AV33Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext), "%", "") ;
      lV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext), "%", "") ;
      lV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc = GXutil.padr( GXutil.rtrim( AV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc), 30, "%") ;
      /* Using cursor P0AB12 */
      pr_default.execute(0, new Object[] {AV33Emprcod, lV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext, lV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext, Integer.valueOf(AV39Calidadhtd_calidadhtd_headerwwds_2_tfcctcod), Integer.valueOf(AV40Calidadhtd_calidadhtd_headerwwds_3_tfcctcod_to), lV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc, AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAB12 = false ;
         A396EmprCod = P0AB12_A396EmprCod[0] ;
         A4036CCTDsc = P0AB12_A4036CCTDsc[0] ;
         A4031CCTCod = P0AB12_A4031CCTCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AB12_A4036CCTDsc[0], A4036CCTDsc) == 0 ) )
         {
            brkAB12 = false ;
            A396EmprCod = P0AB12_A396EmprCod[0] ;
            A4031CCTCod = P0AB12_A4031CCTCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAB12 = true ;
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
         if ( ! brkAB12 )
         {
            brkAB12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = calidadhtd_headerwwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = calidadhtd_headerwwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = calidadhtd_headerwwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext = "" ;
      AV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc = "" ;
      AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel = "" ;
      scmdbuf = "" ;
      lV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext = "" ;
      lV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc = "" ;
      A396EmprCod = "" ;
      AV33Emprcod = "" ;
      P0AB12_A396EmprCod = new String[] {""} ;
      P0AB12_A4036CCTDsc = new String[] {""} ;
      P0AB12_A4031CCTCod = new int[1] ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calidadhtd.calidadhtd_headerwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AB12_A396EmprCod, P0AB12_A4036CCTDsc, P0AB12_A4031CCTCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV36GXV1 ;
   private int AV10TFCCTCod ;
   private int AV11TFCCTCod_To ;
   private int AV39Calidadhtd_calidadhtd_headerwwds_2_tfcctcod ;
   private int AV40Calidadhtd_calidadhtd_headerwwds_3_tfcctcod_to ;
   private int A4031CCTCod ;
   private long AV20count ;
   private String AV12TFCCTDsc ;
   private String AV13TFCCTDsc_Sel ;
   private String A4036CCTDsc ;
   private String AV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc ;
   private String AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel ;
   private String scmdbuf ;
   private String lV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc ;
   private String A396EmprCod ;
   private String AV33Emprcod ;
   private boolean returnInSub ;
   private boolean brkAB12 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext ;
   private String lV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AB12_A396EmprCod ;
   private String[] P0AB12_A4036CCTDsc ;
   private int[] P0AB12_A4031CCTCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class calidadhtd_headerwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AB12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext ,
                                          int AV39Calidadhtd_calidadhtd_headerwwds_2_tfcctcod ,
                                          int AV40Calidadhtd_calidadhtd_headerwwds_3_tfcctcod_to ,
                                          String AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel ,
                                          String AV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          String A396EmprCod ,
                                          String AV33Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CCTDsc, CCTCod FROM TXPCCDef" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV38Calidadhtd_calidadhtd_headerwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CCTCod,'999990'), 2) like '%' || ?) or ( UPPER(CCTDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Calidadhtd_calidadhtd_headerwwds_2_tfcctcod) )
      {
         addWhere(sWhereString, "(CCTCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV40Calidadhtd_calidadhtd_headerwwds_3_tfcctcod_to) )
      {
         addWhere(sWhereString, "(CCTCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV41Calidadhtd_calidadhtd_headerwwds_4_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Calidadhtd_calidadhtd_headerwwds_5_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CCTDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
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
                  return conditional_P0AB12(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AB12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               return;
      }
   }

}

