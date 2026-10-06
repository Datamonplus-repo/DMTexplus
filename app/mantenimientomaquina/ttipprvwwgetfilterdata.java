package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipprvwwgetfilterdata extends GXProcedure
{
   public ttipprvwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipprvwwgetfilterdata.class ), "" );
   }

   public ttipprvwwgetfilterdata( int remoteHandle ,
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
      ttipprvwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipprvwwgetfilterdata.this.AV26DDOName = aP0;
      ttipprvwwgetfilterdata.this.AV27SearchTxt = aP1;
      ttipprvwwgetfilterdata.this.AV28SearchTxtTo = aP2;
      ttipprvwwgetfilterdata.this.aP3 = aP3;
      ttipprvwwgetfilterdata.this.aP4 = aP4;
      ttipprvwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PMTIPODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPMTIPODSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("MantenimientoMaquina.TTIPPRVWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TTIPPRVWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("MantenimientoMaquina.TTIPPRVWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPOID") == 0 )
         {
            AV10TFPMTipoID = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPMTipoID_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC") == 0 )
         {
            AV12TFPMTipoDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC_SEL") == 0 )
         {
            AV13TFPMTipoDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMTIPODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPMTipoDsc = AV27SearchTxt ;
      AV13TFPMTipoDsc_Sel = "" ;
      AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Mantenimientomaquina_ttipprvwwds_2_tfpmtipoid = AV10TFPMTipoID ;
      AV39Mantenimientomaquina_ttipprvwwds_3_tfpmtipoid_to = AV11TFPMTipoID_To ;
      AV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc = AV12TFPMTipoDsc ;
      AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel = AV13TFPMTipoDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext ,
                                           Short.valueOf(AV38Mantenimientomaquina_ttipprvwwds_2_tfpmtipoid) ,
                                           Short.valueOf(AV39Mantenimientomaquina_ttipprvwwds_3_tfpmtipoid_to) ,
                                           AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel ,
                                           AV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc ,
                                           Short.valueOf(A14271PMTipoID) ,
                                           A14272PMTipoDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING
                                           }
      });
      lV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext), "%", "") ;
      lV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext), "%", "") ;
      lV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc = GXutil.padr( GXutil.rtrim( AV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc), 30, "%") ;
      /* Using cursor P0ARB2 */
      pr_default.execute(0, new Object[] {lV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext, lV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext, Short.valueOf(AV38Mantenimientomaquina_ttipprvwwds_2_tfpmtipoid), Short.valueOf(AV39Mantenimientomaquina_ttipprvwwds_3_tfpmtipoid_to), lV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc, AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkARB2 = false ;
         A14272PMTipoDsc = P0ARB2_A14272PMTipoDsc[0] ;
         A14271PMTipoID = P0ARB2_A14271PMTipoID[0] ;
         A396EmprCod = P0ARB2_A396EmprCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ARB2_A14272PMTipoDsc[0], A14272PMTipoDsc) == 0 ) )
         {
            brkARB2 = false ;
            A14271PMTipoID = P0ARB2_A14271PMTipoID[0] ;
            A396EmprCod = P0ARB2_A396EmprCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkARB2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14272PMTipoDsc)==0) )
         {
            AV15Option = A14272PMTipoDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkARB2 )
         {
            brkARB2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipprvwwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = ttipprvwwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = ttipprvwwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFPMTipoDsc = "" ;
      AV13TFPMTipoDsc_Sel = "" ;
      A14272PMTipoDsc = "" ;
      AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext = "" ;
      AV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc = "" ;
      AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel = "" ;
      scmdbuf = "" ;
      lV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext = "" ;
      lV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc = "" ;
      P0ARB2_A14272PMTipoDsc = new String[] {""} ;
      P0ARB2_A14271PMTipoID = new short[1] ;
      P0ARB2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.ttipprvwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ARB2_A14272PMTipoDsc, P0ARB2_A14271PMTipoID, P0ARB2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFPMTipoID ;
   private short AV11TFPMTipoID_To ;
   private short AV38Mantenimientomaquina_ttipprvwwds_2_tfpmtipoid ;
   private short AV39Mantenimientomaquina_ttipprvwwds_3_tfpmtipoid_to ;
   private short A14271PMTipoID ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV20count ;
   private String AV12TFPMTipoDsc ;
   private String AV13TFPMTipoDsc_Sel ;
   private String A14272PMTipoDsc ;
   private String AV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc ;
   private String AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel ;
   private String scmdbuf ;
   private String lV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkARB2 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext ;
   private String lV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ARB2_A14272PMTipoDsc ;
   private short[] P0ARB2_A14271PMTipoID ;
   private String[] P0ARB2_A396EmprCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class ttipprvwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ARB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext ,
                                          short AV38Mantenimientomaquina_ttipprvwwds_2_tfpmtipoid ,
                                          short AV39Mantenimientomaquina_ttipprvwwds_3_tfpmtipoid_to ,
                                          String AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel ,
                                          String AV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc ,
                                          short A14271PMTipoID ,
                                          String A14272PMTipoDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PMTipoDsc, PMTipoID, EmprCod FROM TXPTIPPRV" ;
      if ( ! (GXutil.strcmp("", AV37Mantenimientomaquina_ttipprvwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(PMTipoID,'9990'), 2) like '%' || ?) or ( UPPER(PMTipoDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Mantenimientomaquina_ttipprvwwds_2_tfpmtipoid) )
      {
         addWhere(sWhereString, "(PMTipoID >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Mantenimientomaquina_ttipprvwwds_3_tfpmtipoid_to) )
      {
         addWhere(sWhereString, "(PMTipoID <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Mantenimientomaquina_ttipprvwwds_4_tfpmtipodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PMTipoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Mantenimientomaquina_ttipprvwwds_5_tfpmtipodsc_sel)==0) )
      {
         addWhere(sWhereString, "(PMTipoDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PMTipoDsc" ;
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
                  return conditional_P0ARB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
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

