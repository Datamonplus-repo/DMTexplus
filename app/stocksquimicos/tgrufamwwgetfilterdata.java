package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tgrufamwwgetfilterdata extends GXProcedure
{
   public tgrufamwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgrufamwwgetfilterdata.class ), "" );
   }

   public tgrufamwwgetfilterdata( int remoteHandle ,
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
      tgrufamwwgetfilterdata.this.aP5 = new String[] {""};
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
      tgrufamwwgetfilterdata.this.AV16DDOName = aP0;
      tgrufamwwgetfilterdata.this.AV14SearchTxt = aP1;
      tgrufamwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tgrufamwwgetfilterdata.this.aP3 = aP3;
      tgrufamwwgetfilterdata.this.aP4 = aP4;
      tgrufamwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_GRPFAMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADGRPFAMDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.TGRUFAMWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TGRUFAMWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.TGRUFAMWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRPFAMCOD") == 0 )
         {
            AV10TFGrpFamCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFGrpFamCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRPFAMDSC") == 0 )
         {
            AV12TFGrpFamDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRPFAMDSC_SEL") == 0 )
         {
            AV13TFGrpFamDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADGRPFAMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFGrpFamDsc = AV14SearchTxt ;
      AV13TFGrpFamDsc_Sel = "" ;
      AV37Stocksquimicos_tgrufamwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_tgrufamwwds_2_tfgrpfamcod = AV10TFGrpFamCod ;
      AV39Stocksquimicos_tgrufamwwds_3_tfgrpfamcod_to = AV11TFGrpFamCod_To ;
      AV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc = AV12TFGrpFamDsc ;
      AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel = AV13TFGrpFamDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_tgrufamwwds_1_filterfulltext ,
                                           Byte.valueOf(AV38Stocksquimicos_tgrufamwwds_2_tfgrpfamcod) ,
                                           Byte.valueOf(AV39Stocksquimicos_tgrufamwwds_3_tfgrpfamcod_to) ,
                                           AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel ,
                                           AV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc ,
                                           Byte.valueOf(A499GrpFamCod) ,
                                           A500GrpFamDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Stocksquimicos_tgrufamwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_tgrufamwwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_tgrufamwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_tgrufamwwds_1_filterfulltext), "%", "") ;
      lV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc = GXutil.padr( GXutil.rtrim( AV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc), 30, "%") ;
      /* Using cursor P08IH2 */
      pr_default.execute(0, new Object[] {lV37Stocksquimicos_tgrufamwwds_1_filterfulltext, lV37Stocksquimicos_tgrufamwwds_1_filterfulltext, Byte.valueOf(AV38Stocksquimicos_tgrufamwwds_2_tfgrpfamcod), Byte.valueOf(AV39Stocksquimicos_tgrufamwwds_3_tfgrpfamcod_to), lV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc, AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8IH2 = false ;
         A500GrpFamDsc = P08IH2_A500GrpFamDsc[0] ;
         n500GrpFamDsc = P08IH2_n500GrpFamDsc[0] ;
         A499GrpFamCod = P08IH2_A499GrpFamCod[0] ;
         A396EmprCod = P08IH2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08IH2_A500GrpFamDsc[0], A500GrpFamDsc) == 0 ) )
         {
            brk8IH2 = false ;
            A499GrpFamCod = P08IH2_A499GrpFamCod[0] ;
            A396EmprCod = P08IH2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8IH2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A500GrpFamDsc)==0) )
         {
            AV18Option = A500GrpFamDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8IH2 )
         {
            brk8IH2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tgrufamwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tgrufamwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tgrufamwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV32FilterFullText = "" ;
      AV12TFGrpFamDsc = "" ;
      AV13TFGrpFamDsc_Sel = "" ;
      A500GrpFamDsc = "" ;
      AV37Stocksquimicos_tgrufamwwds_1_filterfulltext = "" ;
      AV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc = "" ;
      AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel = "" ;
      scmdbuf = "" ;
      lV37Stocksquimicos_tgrufamwwds_1_filterfulltext = "" ;
      lV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc = "" ;
      P08IH2_A500GrpFamDsc = new String[] {""} ;
      P08IH2_n500GrpFamDsc = new boolean[] {false} ;
      P08IH2_A499GrpFamCod = new byte[1] ;
      P08IH2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tgrufamwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08IH2_A500GrpFamDsc, P08IH2_n500GrpFamDsc, P08IH2_A499GrpFamCod, P08IH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFGrpFamCod ;
   private byte AV11TFGrpFamCod_To ;
   private byte AV38Stocksquimicos_tgrufamwwds_2_tfgrpfamcod ;
   private byte AV39Stocksquimicos_tgrufamwwds_3_tfgrpfamcod_to ;
   private byte A499GrpFamCod ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFGrpFamDsc ;
   private String AV13TFGrpFamDsc_Sel ;
   private String A500GrpFamDsc ;
   private String AV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc ;
   private String AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel ;
   private String scmdbuf ;
   private String lV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8IH2 ;
   private boolean n500GrpFamDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Stocksquimicos_tgrufamwwds_1_filterfulltext ;
   private String lV37Stocksquimicos_tgrufamwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08IH2_A500GrpFamDsc ;
   private boolean[] P08IH2_n500GrpFamDsc ;
   private byte[] P08IH2_A499GrpFamCod ;
   private String[] P08IH2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tgrufamwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08IH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_tgrufamwwds_1_filterfulltext ,
                                          byte AV38Stocksquimicos_tgrufamwwds_2_tfgrpfamcod ,
                                          byte AV39Stocksquimicos_tgrufamwwds_3_tfgrpfamcod_to ,
                                          String AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel ,
                                          String AV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc ,
                                          byte A499GrpFamCod ,
                                          String A500GrpFamDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT GrpFamDsc, GrpFamCod, EmprCod FROM TXPGRUFAM" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_tgrufamwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(GrpFamCod,'90'), 2) like '%' || ?) or ( UPPER(GrpFamDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Stocksquimicos_tgrufamwwds_2_tfgrpfamcod) )
      {
         addWhere(sWhereString, "(GrpFamCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Stocksquimicos_tgrufamwwds_3_tfgrpfamcod_to) )
      {
         addWhere(sWhereString, "(GrpFamCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Stocksquimicos_tgrufamwwds_4_tfgrpfamdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(GrpFamDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Stocksquimicos_tgrufamwwds_5_tfgrpfamdsc_sel)==0) )
      {
         addWhere(sWhereString, "(GrpFamDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY GrpFamDsc" ;
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
                  return conditional_P08IH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08IH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(2);
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

