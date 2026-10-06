package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipvalwwgetfilterdata extends GXProcedure
{
   public ttipvalwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipvalwwgetfilterdata.class ), "" );
   }

   public ttipvalwwgetfilterdata( int remoteHandle ,
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
      ttipvalwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipvalwwgetfilterdata.this.AV16DDOName = aP0;
      ttipvalwwgetfilterdata.this.AV14SearchTxt = aP1;
      ttipvalwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttipvalwwgetfilterdata.this.aP3 = aP3;
      ttipvalwwgetfilterdata.this.aP4 = aP4;
      ttipvalwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("StocksQuimicos.TTIPVALWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.TTIPVALWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("StocksQuimicos.TTIPVALWWGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALCOD") == 0 )
         {
            AV10TFValCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFValCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV12TFValDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV13TFValDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFValDsc = AV14SearchTxt ;
      AV13TFValDsc_Sel = "" ;
      AV39Stocksquimicos_ttipvalwwds_1_filterfulltext = AV34FilterFullText ;
      AV40Stocksquimicos_ttipvalwwds_2_tfvalcod = AV10TFValCod ;
      AV41Stocksquimicos_ttipvalwwds_3_tfvalcod_to = AV11TFValCod_To ;
      AV42Stocksquimicos_ttipvalwwds_4_tfvaldsc = AV12TFValDsc ;
      AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel = AV13TFValDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Stocksquimicos_ttipvalwwds_1_filterfulltext ,
                                           Byte.valueOf(AV40Stocksquimicos_ttipvalwwds_2_tfvalcod) ,
                                           Byte.valueOf(AV41Stocksquimicos_ttipvalwwds_3_tfvalcod_to) ,
                                           AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel ,
                                           AV42Stocksquimicos_ttipvalwwds_4_tfvaldsc ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV39Stocksquimicos_ttipvalwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Stocksquimicos_ttipvalwwds_1_filterfulltext), "%", "") ;
      lV39Stocksquimicos_ttipvalwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Stocksquimicos_ttipvalwwds_1_filterfulltext), "%", "") ;
      lV42Stocksquimicos_ttipvalwwds_4_tfvaldsc = GXutil.padr( GXutil.rtrim( AV42Stocksquimicos_ttipvalwwds_4_tfvaldsc), 16, "%") ;
      /* Using cursor P08MC2 */
      pr_default.execute(0, new Object[] {lV39Stocksquimicos_ttipvalwwds_1_filterfulltext, lV39Stocksquimicos_ttipvalwwds_1_filterfulltext, Byte.valueOf(AV40Stocksquimicos_ttipvalwwds_2_tfvalcod), Byte.valueOf(AV41Stocksquimicos_ttipvalwwds_3_tfvalcod_to), lV42Stocksquimicos_ttipvalwwds_4_tfvaldsc, AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8MC2 = false ;
         A857ValDsc = P08MC2_A857ValDsc[0] ;
         n857ValDsc = P08MC2_n857ValDsc[0] ;
         A856ValCod = P08MC2_A856ValCod[0] ;
         A396EmprCod = P08MC2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08MC2_A857ValDsc[0], A857ValDsc) == 0 ) )
         {
            brk8MC2 = false ;
            A856ValCod = P08MC2_A856ValCod[0] ;
            A396EmprCod = P08MC2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8MC2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV18Option = A857ValDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8MC2 )
         {
            brk8MC2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipvalwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttipvalwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttipvalwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV12TFValDsc = "" ;
      AV13TFValDsc_Sel = "" ;
      A857ValDsc = "" ;
      AV39Stocksquimicos_ttipvalwwds_1_filterfulltext = "" ;
      AV42Stocksquimicos_ttipvalwwds_4_tfvaldsc = "" ;
      AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel = "" ;
      scmdbuf = "" ;
      lV39Stocksquimicos_ttipvalwwds_1_filterfulltext = "" ;
      lV42Stocksquimicos_ttipvalwwds_4_tfvaldsc = "" ;
      P08MC2_A857ValDsc = new String[] {""} ;
      P08MC2_n857ValDsc = new boolean[] {false} ;
      P08MC2_A856ValCod = new byte[1] ;
      P08MC2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipvalwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08MC2_A857ValDsc, P08MC2_n857ValDsc, P08MC2_A856ValCod, P08MC2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFValCod ;
   private byte AV11TFValCod_To ;
   private byte AV40Stocksquimicos_ttipvalwwds_2_tfvalcod ;
   private byte AV41Stocksquimicos_ttipvalwwds_3_tfvalcod_to ;
   private byte A856ValCod ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV26count ;
   private String AV12TFValDsc ;
   private String AV13TFValDsc_Sel ;
   private String A857ValDsc ;
   private String AV42Stocksquimicos_ttipvalwwds_4_tfvaldsc ;
   private String AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel ;
   private String scmdbuf ;
   private String lV42Stocksquimicos_ttipvalwwds_4_tfvaldsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8MC2 ;
   private boolean n857ValDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Stocksquimicos_ttipvalwwds_1_filterfulltext ;
   private String lV39Stocksquimicos_ttipvalwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08MC2_A857ValDsc ;
   private boolean[] P08MC2_n857ValDsc ;
   private byte[] P08MC2_A856ValCod ;
   private String[] P08MC2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttipvalwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08MC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Stocksquimicos_ttipvalwwds_1_filterfulltext ,
                                          byte AV40Stocksquimicos_ttipvalwwds_2_tfvalcod ,
                                          byte AV41Stocksquimicos_ttipvalwwds_3_tfvalcod_to ,
                                          String AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel ,
                                          String AV42Stocksquimicos_ttipvalwwds_4_tfvaldsc ,
                                          byte A856ValCod ,
                                          String A857ValDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ValDsc, ValCod, EmprCod FROM TXPTIPVAL" ;
      if ( ! (GXutil.strcmp("", AV39Stocksquimicos_ttipvalwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ValCod,'90'), 2) like '%' || ?) or ( UPPER(ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV40Stocksquimicos_ttipvalwwds_2_tfvalcod) )
      {
         addWhere(sWhereString, "(ValCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV41Stocksquimicos_ttipvalwwds_3_tfvalcod_to) )
      {
         addWhere(sWhereString, "(ValCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Stocksquimicos_ttipvalwwds_4_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Stocksquimicos_ttipvalwwds_5_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(ValDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ValDsc" ;
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
                  return conditional_P08MC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08MC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
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
                  stmt.setString(sIdx, (String)parms[10], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 16);
               }
               return;
      }
   }

}

