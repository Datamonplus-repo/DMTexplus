package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranobservacion__wwgetfilterdata extends GXProcedure
{
   public albaranobservacion__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranobservacion__wwgetfilterdata.class ), "" );
   }

   public albaranobservacion__wwgetfilterdata( int remoteHandle ,
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
      albaranobservacion__wwgetfilterdata.this.aP5 = new String[] {""};
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
      albaranobservacion__wwgetfilterdata.this.AV26DDOName = aP0;
      albaranobservacion__wwgetfilterdata.this.AV27SearchTxt = aP1;
      albaranobservacion__wwgetfilterdata.this.AV28SearchTxtTo = aP2;
      albaranobservacion__wwgetfilterdata.this.aP3 = aP3;
      albaranobservacion__wwgetfilterdata.this.aP4 = aP4;
      albaranobservacion__wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBPOBS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBPOBSOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("Albaranes.AlbaranObservacion__WWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Albaranes.AlbaranObservacion__WWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("Albaranes.AlbaranObservacion__WWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPOBSLIN") == 0 )
         {
            AV10TFAlbPObsLin = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbPObsLin_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPOBS") == 0 )
         {
            AV12TFAlbPObs = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPOBS_SEL") == 0 )
         {
            AV13TFAlbPObs_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBPOBSOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbPObs = AV27SearchTxt ;
      AV13TFAlbPObs_Sel = "" ;
      AV37Albaranes_albaranobservacion__wwds_1_filterfulltext = AV32FilterFullText ;
      AV38Albaranes_albaranobservacion__wwds_2_tfalbpobslin = AV10TFAlbPObsLin ;
      AV39Albaranes_albaranobservacion__wwds_3_tfalbpobslin_to = AV11TFAlbPObsLin_To ;
      AV40Albaranes_albaranobservacion__wwds_4_tfalbpobs = AV12TFAlbPObs ;
      AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel = AV13TFAlbPObs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Albaranes_albaranobservacion__wwds_1_filterfulltext ,
                                           Byte.valueOf(AV38Albaranes_albaranobservacion__wwds_2_tfalbpobslin) ,
                                           Byte.valueOf(AV39Albaranes_albaranobservacion__wwds_3_tfalbpobslin_to) ,
                                           AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel ,
                                           AV40Albaranes_albaranobservacion__wwds_4_tfalbpobs ,
                                           Byte.valueOf(A915AlbPObsLin) ,
                                           A916AlbPObs } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV37Albaranes_albaranobservacion__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Albaranes_albaranobservacion__wwds_1_filterfulltext), "%", "") ;
      lV37Albaranes_albaranobservacion__wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Albaranes_albaranobservacion__wwds_1_filterfulltext), "%", "") ;
      lV40Albaranes_albaranobservacion__wwds_4_tfalbpobs = GXutil.padr( GXutil.rtrim( AV40Albaranes_albaranobservacion__wwds_4_tfalbpobs), 50, "%") ;
      /* Using cursor P09V72 */
      pr_default.execute(0, new Object[] {lV37Albaranes_albaranobservacion__wwds_1_filterfulltext, lV37Albaranes_albaranobservacion__wwds_1_filterfulltext, Byte.valueOf(AV38Albaranes_albaranobservacion__wwds_2_tfalbpobslin), Byte.valueOf(AV39Albaranes_albaranobservacion__wwds_3_tfalbpobslin_to), lV40Albaranes_albaranobservacion__wwds_4_tfalbpobs, AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9V72 = false ;
         A916AlbPObs = P09V72_A916AlbPObs[0] ;
         A915AlbPObsLin = P09V72_A915AlbPObsLin[0] ;
         A396EmprCod = P09V72_A396EmprCod[0] ;
         A30AlbProCod = P09V72_A30AlbProCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09V72_A916AlbPObs[0], A916AlbPObs) == 0 ) )
         {
            brk9V72 = false ;
            A915AlbPObsLin = P09V72_A915AlbPObsLin[0] ;
            A396EmprCod = P09V72_A396EmprCod[0] ;
            A30AlbProCod = P09V72_A30AlbProCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brk9V72 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A916AlbPObs)==0) )
         {
            AV15Option = A916AlbPObs ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9V72 )
         {
            brk9V72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = albaranobservacion__wwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = albaranobservacion__wwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = albaranobservacion__wwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFAlbPObs = "" ;
      AV13TFAlbPObs_Sel = "" ;
      A916AlbPObs = "" ;
      AV37Albaranes_albaranobservacion__wwds_1_filterfulltext = "" ;
      AV40Albaranes_albaranobservacion__wwds_4_tfalbpobs = "" ;
      AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel = "" ;
      scmdbuf = "" ;
      lV37Albaranes_albaranobservacion__wwds_1_filterfulltext = "" ;
      lV40Albaranes_albaranobservacion__wwds_4_tfalbpobs = "" ;
      P09V72_A916AlbPObs = new String[] {""} ;
      P09V72_A915AlbPObsLin = new byte[1] ;
      P09V72_A396EmprCod = new String[] {""} ;
      P09V72_A30AlbProCod = new long[1] ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranobservacion__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09V72_A916AlbPObs, P09V72_A915AlbPObsLin, P09V72_A396EmprCod, P09V72_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFAlbPObsLin ;
   private byte AV11TFAlbPObsLin_To ;
   private byte AV38Albaranes_albaranobservacion__wwds_2_tfalbpobslin ;
   private byte AV39Albaranes_albaranobservacion__wwds_3_tfalbpobslin_to ;
   private byte A915AlbPObsLin ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long A30AlbProCod ;
   private long AV20count ;
   private String AV12TFAlbPObs ;
   private String AV13TFAlbPObs_Sel ;
   private String A916AlbPObs ;
   private String AV40Albaranes_albaranobservacion__wwds_4_tfalbpobs ;
   private String AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel ;
   private String scmdbuf ;
   private String lV40Albaranes_albaranobservacion__wwds_4_tfalbpobs ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9V72 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Albaranes_albaranobservacion__wwds_1_filterfulltext ;
   private String lV37Albaranes_albaranobservacion__wwds_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09V72_A916AlbPObs ;
   private byte[] P09V72_A915AlbPObsLin ;
   private String[] P09V72_A396EmprCod ;
   private long[] P09V72_A30AlbProCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class albaranobservacion__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09V72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Albaranes_albaranobservacion__wwds_1_filterfulltext ,
                                          byte AV38Albaranes_albaranobservacion__wwds_2_tfalbpobslin ,
                                          byte AV39Albaranes_albaranobservacion__wwds_3_tfalbpobslin_to ,
                                          String AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel ,
                                          String AV40Albaranes_albaranobservacion__wwds_4_tfalbpobs ,
                                          byte A915AlbPObsLin ,
                                          String A916AlbPObs )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT AlbPObs, AlbPObsLin, EmprCod, AlbProCod FROM TXPOBSALB" ;
      if ( ! (GXutil.strcmp("", AV37Albaranes_albaranobservacion__wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbPObsLin,'90'), 2) like '%' || ?) or ( UPPER(AlbPObs) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Albaranes_albaranobservacion__wwds_2_tfalbpobslin) )
      {
         addWhere(sWhereString, "(AlbPObsLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Albaranes_albaranobservacion__wwds_3_tfalbpobslin_to) )
      {
         addWhere(sWhereString, "(AlbPObsLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel)==0) && ( ! (GXutil.strcmp("", AV40Albaranes_albaranobservacion__wwds_4_tfalbpobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbPObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Albaranes_albaranobservacion__wwds_5_tfalbpobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbPObs = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbPObs" ;
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
                  return conditional_P09V72(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 50);
               }
               return;
      }
   }

}

