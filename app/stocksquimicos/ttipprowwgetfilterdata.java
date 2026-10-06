package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipprowwgetfilterdata extends GXProcedure
{
   public ttipprowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipprowwgetfilterdata.class ), "" );
   }

   public ttipprowwgetfilterdata( int remoteHandle ,
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
      ttipprowwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipprowwgetfilterdata.this.AV16DDOName = aP0;
      ttipprowwgetfilterdata.this.AV14SearchTxt = aP1;
      ttipprowwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttipprowwgetfilterdata.this.aP3 = aP3;
      ttipprowwgetfilterdata.this.aP4 = aP4;
      ttipprowwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.TTIPPROWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TTIPPROWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.TTIPPROWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDSC") == 0 )
         {
            AV12TFPrdDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDSC_SEL") == 0 )
         {
            AV13TFPrdDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCOD") == 0 )
         {
            AV10TFPrdCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrdCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdDsc = AV14SearchTxt ;
      AV13TFPrdDsc_Sel = "" ;
      AV37Stocksquimicos_ttipprowwds_1_filterfulltext = AV32FilterFullText ;
      AV38Stocksquimicos_ttipprowwds_2_tfprddsc = AV12TFPrdDsc ;
      AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel = AV13TFPrdDsc_Sel ;
      AV40Stocksquimicos_ttipprowwds_4_tfprdcod = AV10TFPrdCod ;
      AV41Stocksquimicos_ttipprowwds_5_tfprdcod_to = AV11TFPrdCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Stocksquimicos_ttipprowwds_1_filterfulltext ,
                                           AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel ,
                                           AV38Stocksquimicos_ttipprowwds_2_tfprddsc ,
                                           Byte.valueOf(AV40Stocksquimicos_ttipprowwds_4_tfprdcod) ,
                                           Byte.valueOf(AV41Stocksquimicos_ttipprowwds_5_tfprdcod_to) ,
                                           A701PrdDsc ,
                                           Byte.valueOf(A687PrdCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE
                                           }
      });
      lV37Stocksquimicos_ttipprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipprowwds_1_filterfulltext), "%", "") ;
      lV37Stocksquimicos_ttipprowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Stocksquimicos_ttipprowwds_1_filterfulltext), "%", "") ;
      lV38Stocksquimicos_ttipprowwds_2_tfprddsc = GXutil.padr( GXutil.rtrim( AV38Stocksquimicos_ttipprowwds_2_tfprddsc), 30, "%") ;
      /* Using cursor P08MK2 */
      pr_default.execute(0, new Object[] {lV37Stocksquimicos_ttipprowwds_1_filterfulltext, lV37Stocksquimicos_ttipprowwds_1_filterfulltext, lV38Stocksquimicos_ttipprowwds_2_tfprddsc, AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel, Byte.valueOf(AV40Stocksquimicos_ttipprowwds_4_tfprdcod), Byte.valueOf(AV41Stocksquimicos_ttipprowwds_5_tfprdcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8MK2 = false ;
         A701PrdDsc = P08MK2_A701PrdDsc[0] ;
         n701PrdDsc = P08MK2_n701PrdDsc[0] ;
         A687PrdCod = P08MK2_A687PrdCod[0] ;
         A396EmprCod = P08MK2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08MK2_A701PrdDsc[0], A701PrdDsc) == 0 ) )
         {
            brk8MK2 = false ;
            A687PrdCod = P08MK2_A687PrdCod[0] ;
            A396EmprCod = P08MK2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8MK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A701PrdDsc)==0) )
         {
            AV18Option = A701PrdDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8MK2 )
         {
            brk8MK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipprowwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttipprowwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttipprowwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFPrdDsc = "" ;
      AV13TFPrdDsc_Sel = "" ;
      A701PrdDsc = "" ;
      AV37Stocksquimicos_ttipprowwds_1_filterfulltext = "" ;
      AV38Stocksquimicos_ttipprowwds_2_tfprddsc = "" ;
      AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel = "" ;
      scmdbuf = "" ;
      lV37Stocksquimicos_ttipprowwds_1_filterfulltext = "" ;
      lV38Stocksquimicos_ttipprowwds_2_tfprddsc = "" ;
      P08MK2_A701PrdDsc = new String[] {""} ;
      P08MK2_n701PrdDsc = new boolean[] {false} ;
      P08MK2_A687PrdCod = new byte[1] ;
      P08MK2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipprowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08MK2_A701PrdDsc, P08MK2_n701PrdDsc, P08MK2_A687PrdCod, P08MK2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFPrdCod ;
   private byte AV11TFPrdCod_To ;
   private byte AV40Stocksquimicos_ttipprowwds_4_tfprdcod ;
   private byte AV41Stocksquimicos_ttipprowwds_5_tfprdcod_to ;
   private byte A687PrdCod ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFPrdDsc ;
   private String AV13TFPrdDsc_Sel ;
   private String A701PrdDsc ;
   private String AV38Stocksquimicos_ttipprowwds_2_tfprddsc ;
   private String AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel ;
   private String scmdbuf ;
   private String lV38Stocksquimicos_ttipprowwds_2_tfprddsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8MK2 ;
   private boolean n701PrdDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Stocksquimicos_ttipprowwds_1_filterfulltext ;
   private String lV37Stocksquimicos_ttipprowwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08MK2_A701PrdDsc ;
   private boolean[] P08MK2_n701PrdDsc ;
   private byte[] P08MK2_A687PrdCod ;
   private String[] P08MK2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttipprowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08MK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Stocksquimicos_ttipprowwds_1_filterfulltext ,
                                          String AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel ,
                                          String AV38Stocksquimicos_ttipprowwds_2_tfprddsc ,
                                          byte AV40Stocksquimicos_ttipprowwds_4_tfprdcod ,
                                          byte AV41Stocksquimicos_ttipprowwds_5_tfprdcod_to ,
                                          String A701PrdDsc ,
                                          byte A687PrdCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdDsc, PrdCod, EmprCod FROM TXPTIPPRO" ;
      if ( ! (GXutil.strcmp("", AV37Stocksquimicos_ttipprowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(PrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(PrdCod,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV38Stocksquimicos_ttipprowwds_2_tfprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_ttipprowwds_3_tfprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(PrdDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV40Stocksquimicos_ttipprowwds_4_tfprdcod) )
      {
         addWhere(sWhereString, "(PrdCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV41Stocksquimicos_ttipprowwds_5_tfprdcod_to) )
      {
         addWhere(sWhereString, "(PrdCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdDsc" ;
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
                  return conditional_P08MK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08MK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

