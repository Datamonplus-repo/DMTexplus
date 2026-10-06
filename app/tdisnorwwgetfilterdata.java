package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdisnorwwgetfilterdata extends GXProcedure
{
   public tdisnorwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisnorwwgetfilterdata.class ), "" );
   }

   public tdisnorwwgetfilterdata( int remoteHandle ,
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
      tdisnorwwgetfilterdata.this.aP5 = new String[] {""};
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
      tdisnorwwgetfilterdata.this.AV16DDOName = aP0;
      tdisnorwwgetfilterdata.this.AV14SearchTxt = aP1;
      tdisnorwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tdisnorwwgetfilterdata.this.aP3 = aP3;
      tdisnorwwgetfilterdata.this.aP4 = aP4;
      tdisnorwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_DISDEST") == 0 )
      {
         /* Execute user subroutine: 'LOADDISDESTOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TDISNORWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDISNORWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TDISNORWWGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV10TFDisCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDisCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISDEST") == 0 )
         {
            AV12TFDisDest = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISDEST_SEL") == 0 )
         {
            AV13TFDisDest_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISDESTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDisDest = AV14SearchTxt ;
      AV13TFDisDest_Sel = "" ;
      AV48Tdisnorwwds_1_filterfulltext = AV43FilterFullText ;
      AV49Tdisnorwwds_2_tfdiscod = AV10TFDisCod ;
      AV50Tdisnorwwds_3_tfdiscod_to = AV11TFDisCod_To ;
      AV51Tdisnorwwds_4_tfdisdest = AV12TFDisDest ;
      AV52Tdisnorwwds_5_tfdisdest_sel = AV13TFDisDest_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Tdisnorwwds_1_filterfulltext ,
                                           Integer.valueOf(AV49Tdisnorwwds_2_tfdiscod) ,
                                           Integer.valueOf(AV50Tdisnorwwds_3_tfdiscod_to) ,
                                           AV52Tdisnorwwds_5_tfdisdest_sel ,
                                           AV51Tdisnorwwds_4_tfdisdest ,
                                           Integer.valueOf(A361DisCod) ,
                                           A8886DisDest } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV48Tdisnorwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Tdisnorwwds_1_filterfulltext), "%", "") ;
      lV48Tdisnorwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Tdisnorwwds_1_filterfulltext), "%", "") ;
      lV51Tdisnorwwds_4_tfdisdest = GXutil.padr( GXutil.rtrim( AV51Tdisnorwwds_4_tfdisdest), 30, "%") ;
      /* Using cursor P088L2 */
      pr_default.execute(0, new Object[] {lV48Tdisnorwwds_1_filterfulltext, lV48Tdisnorwwds_1_filterfulltext, Integer.valueOf(AV49Tdisnorwwds_2_tfdiscod), Integer.valueOf(AV50Tdisnorwwds_3_tfdiscod_to), lV51Tdisnorwwds_4_tfdisdest, AV52Tdisnorwwds_5_tfdisdest_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk88L2 = false ;
         A8886DisDest = P088L2_A8886DisDest[0] ;
         A361DisCod = P088L2_A361DisCod[0] ;
         A396EmprCod = P088L2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P088L2_A8886DisDest[0], A8886DisDest) == 0 ) )
         {
            brk88L2 = false ;
            A361DisCod = P088L2_A361DisCod[0] ;
            A396EmprCod = P088L2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk88L2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A8886DisDest)==0) )
         {
            AV18Option = A8886DisDest ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk88L2 )
         {
            brk88L2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tdisnorwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tdisnorwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tdisnorwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV43FilterFullText = "" ;
      AV12TFDisDest = "" ;
      AV13TFDisDest_Sel = "" ;
      A8886DisDest = "" ;
      AV48Tdisnorwwds_1_filterfulltext = "" ;
      AV51Tdisnorwwds_4_tfdisdest = "" ;
      AV52Tdisnorwwds_5_tfdisdest_sel = "" ;
      scmdbuf = "" ;
      lV48Tdisnorwwds_1_filterfulltext = "" ;
      lV51Tdisnorwwds_4_tfdisdest = "" ;
      P088L2_A8886DisDest = new String[] {""} ;
      P088L2_A361DisCod = new int[1] ;
      P088L2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisnorwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P088L2_A8886DisDest, P088L2_A361DisCod, P088L2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV10TFDisCod ;
   private int AV11TFDisCod_To ;
   private int AV49Tdisnorwwds_2_tfdiscod ;
   private int AV50Tdisnorwwds_3_tfdiscod_to ;
   private int A361DisCod ;
   private long AV26count ;
   private String AV12TFDisDest ;
   private String AV13TFDisDest_Sel ;
   private String A8886DisDest ;
   private String AV51Tdisnorwwds_4_tfdisdest ;
   private String AV52Tdisnorwwds_5_tfdisdest_sel ;
   private String scmdbuf ;
   private String lV51Tdisnorwwds_4_tfdisdest ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk88L2 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV48Tdisnorwwds_1_filterfulltext ;
   private String lV48Tdisnorwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P088L2_A8886DisDest ;
   private int[] P088L2_A361DisCod ;
   private String[] P088L2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tdisnorwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P088L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Tdisnorwwds_1_filterfulltext ,
                                          int AV49Tdisnorwwds_2_tfdiscod ,
                                          int AV50Tdisnorwwds_3_tfdiscod_to ,
                                          String AV52Tdisnorwwds_5_tfdisdest_sel ,
                                          String AV51Tdisnorwwds_4_tfdisdest ,
                                          int A361DisCod ,
                                          String A8886DisDest )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DisDest, DisCod, EmprCod FROM TXPDISPOS" ;
      if ( ! (GXutil.strcmp("", AV48Tdisnorwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DisCod,'99999990'), 2) like '%' || ?) or ( UPPER(DisDest) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV49Tdisnorwwds_2_tfdiscod) )
      {
         addWhere(sWhereString, "(DisCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Tdisnorwwds_3_tfdiscod_to) )
      {
         addWhere(sWhereString, "(DisCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Tdisnorwwds_5_tfdisdest_sel)==0) && ( ! (GXutil.strcmp("", AV51Tdisnorwwds_4_tfdisdest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DisDest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Tdisnorwwds_5_tfdisdest_sel)==0) )
      {
         addWhere(sWhereString, "(DisDest = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DisDest" ;
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
                  return conditional_P088L2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P088L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

