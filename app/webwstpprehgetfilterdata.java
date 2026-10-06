package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwstpprehgetfilterdata extends GXProcedure
{
   public webwstpprehgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwstpprehgetfilterdata.class ), "" );
   }

   public webwstpprehgetfilterdata( int remoteHandle ,
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
      webwstpprehgetfilterdata.this.aP5 = new String[] {""};
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
      webwstpprehgetfilterdata.this.AV26DDOName = aP0;
      webwstpprehgetfilterdata.this.AV27SearchTxt = aP1;
      webwstpprehgetfilterdata.this.AV28SearchTxtTo = aP2;
      webwstpprehgetfilterdata.this.aP3 = aP3;
      webwstpprehgetfilterdata.this.aP4 = aP4;
      webwstpprehgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_TIPPREDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPPREDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("WebWSTpPreHGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWSTpPreHGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("WebWSTpPreHGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRECOD") == 0 )
         {
            AV10TFTipPreCod = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipPreCod_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPREDSC") == 0 )
         {
            AV12TFTipPreDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPREDSC_SEL") == 0 )
         {
            AV13TFTipPreDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV33Emprcod = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV34Barcod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV35Barcodreo = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV36Barcodpar = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPPREDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipPreDsc = AV27SearchTxt ;
      AV13TFTipPreDsc_Sel = "" ;
      AV41Webwstpprehds_1_emprcod = AV33Emprcod ;
      AV42Webwstpprehds_2_filterfulltext = AV32FilterFullText ;
      AV43Webwstpprehds_3_tftipprecod = AV10TFTipPreCod ;
      AV44Webwstpprehds_4_tftipprecod_to = AV11TFTipPreCod_To ;
      AV45Webwstpprehds_5_tftippredsc = AV12TFTipPreDsc ;
      AV46Webwstpprehds_6_tftippredsc_sel = AV13TFTipPreDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV42Webwstpprehds_2_filterfulltext ,
                                           Short.valueOf(AV43Webwstpprehds_3_tftipprecod) ,
                                           Short.valueOf(AV44Webwstpprehds_4_tftipprecod_to) ,
                                           AV46Webwstpprehds_6_tftippredsc_sel ,
                                           AV45Webwstpprehds_5_tftippredsc ,
                                           Short.valueOf(A1962TipPreCod) ,
                                           A1963TipPreDsc ,
                                           AV41Webwstpprehds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42Webwstpprehds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Webwstpprehds_2_filterfulltext), "%", "") ;
      lV42Webwstpprehds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV42Webwstpprehds_2_filterfulltext), "%", "") ;
      lV45Webwstpprehds_5_tftippredsc = GXutil.padr( GXutil.rtrim( AV45Webwstpprehds_5_tftippredsc), 60, "%") ;
      /* Using cursor P08FZ2 */
      pr_default.execute(0, new Object[] {AV41Webwstpprehds_1_emprcod, lV42Webwstpprehds_2_filterfulltext, lV42Webwstpprehds_2_filterfulltext, Short.valueOf(AV43Webwstpprehds_3_tftipprecod), Short.valueOf(AV44Webwstpprehds_4_tftipprecod_to), lV45Webwstpprehds_5_tftippredsc, AV46Webwstpprehds_6_tftippredsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8FZ2 = false ;
         A396EmprCod = P08FZ2_A396EmprCod[0] ;
         A1963TipPreDsc = P08FZ2_A1963TipPreDsc[0] ;
         A1962TipPreCod = P08FZ2_A1962TipPreCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08FZ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08FZ2_A1963TipPreDsc[0], A1963TipPreDsc) == 0 ) )
         {
            brk8FZ2 = false ;
            A1962TipPreCod = P08FZ2_A1962TipPreCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brk8FZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1963TipPreDsc)==0) )
         {
            AV15Option = A1963TipPreDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FZ2 )
         {
            brk8FZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwstpprehgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = webwstpprehgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = webwstpprehgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFTipPreDsc = "" ;
      AV13TFTipPreDsc_Sel = "" ;
      AV33Emprcod = "" ;
      AV36Barcodpar = "" ;
      A1963TipPreDsc = "" ;
      AV41Webwstpprehds_1_emprcod = "" ;
      AV42Webwstpprehds_2_filterfulltext = "" ;
      AV45Webwstpprehds_5_tftippredsc = "" ;
      AV46Webwstpprehds_6_tftippredsc_sel = "" ;
      scmdbuf = "" ;
      lV42Webwstpprehds_2_filterfulltext = "" ;
      lV45Webwstpprehds_5_tftippredsc = "" ;
      A396EmprCod = "" ;
      P08FZ2_A396EmprCod = new String[] {""} ;
      P08FZ2_A1963TipPreDsc = new String[] {""} ;
      P08FZ2_A1962TipPreCod = new short[1] ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwstpprehgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08FZ2_A396EmprCod, P08FZ2_A1963TipPreDsc, P08FZ2_A1962TipPreCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV35Barcodreo ;
   private short AV10TFTipPreCod ;
   private short AV11TFTipPreCod_To ;
   private short AV43Webwstpprehds_3_tftipprecod ;
   private short AV44Webwstpprehds_4_tftipprecod_to ;
   private short A1962TipPreCod ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV34Barcod ;
   private long AV20count ;
   private String AV12TFTipPreDsc ;
   private String AV13TFTipPreDsc_Sel ;
   private String AV33Emprcod ;
   private String AV36Barcodpar ;
   private String A1963TipPreDsc ;
   private String AV41Webwstpprehds_1_emprcod ;
   private String AV45Webwstpprehds_5_tftippredsc ;
   private String AV46Webwstpprehds_6_tftippredsc_sel ;
   private String scmdbuf ;
   private String lV45Webwstpprehds_5_tftippredsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8FZ2 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV42Webwstpprehds_2_filterfulltext ;
   private String lV42Webwstpprehds_2_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08FZ2_A396EmprCod ;
   private String[] P08FZ2_A1963TipPreDsc ;
   private short[] P08FZ2_A1962TipPreCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class webwstpprehgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42Webwstpprehds_2_filterfulltext ,
                                          short AV43Webwstpprehds_3_tftipprecod ,
                                          short AV44Webwstpprehds_4_tftipprecod_to ,
                                          String AV46Webwstpprehds_6_tftippredsc_sel ,
                                          String AV45Webwstpprehds_5_tftippredsc ,
                                          short A1962TipPreCod ,
                                          String A1963TipPreDsc ,
                                          String AV41Webwstpprehds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, TipPreDsc, TipPreCod FROM TXPTIPPRE" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV42Webwstpprehds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TipPreCod,'9990'), 2) like '%' || ?) or ( UPPER(TipPreDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV43Webwstpprehds_3_tftipprecod) )
      {
         addWhere(sWhereString, "(TipPreCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV44Webwstpprehds_4_tftipprecod_to) )
      {
         addWhere(sWhereString, "(TipPreCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV46Webwstpprehds_6_tftippredsc_sel)==0) && ( ! (GXutil.strcmp("", AV45Webwstpprehds_5_tftippredsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipPreDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Webwstpprehds_6_tftippredsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipPreDsc = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, TipPreDsc" ;
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
                  return conditional_P08FZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               return;
      }
   }

}

