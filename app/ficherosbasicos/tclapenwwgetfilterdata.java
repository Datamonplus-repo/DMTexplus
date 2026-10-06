package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclapenwwgetfilterdata extends GXProcedure
{
   public tclapenwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclapenwwgetfilterdata.class ), "" );
   }

   public tclapenwwgetfilterdata( int remoteHandle ,
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
      tclapenwwgetfilterdata.this.aP5 = new String[] {""};
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
      tclapenwwgetfilterdata.this.AV16DDOName = aP0;
      tclapenwwgetfilterdata.this.AV14SearchTxt = aP1;
      tclapenwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tclapenwwgetfilterdata.this.aP3 = aP3;
      tclapenwwgetfilterdata.this.aP4 = aP4;
      tclapenwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_CLASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCLASDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TCLAPENWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TCLAPENWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TCLAPENWWGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLASCOD") == 0 )
         {
            AV10TFClasCod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFClasCod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLASDSC") == 0 )
         {
            AV12TFClasDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLASDSC_SEL") == 0 )
         {
            AV13TFClasDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFClasDsc = AV14SearchTxt ;
      AV13TFClasDsc_Sel = "" ;
      AV50Ficherosbasicos_tclapenwwds_1_filterfulltext = AV43FilterFullText ;
      AV51Ficherosbasicos_tclapenwwds_2_tfclascod = AV10TFClasCod ;
      AV52Ficherosbasicos_tclapenwwds_3_tfclascod_to = AV11TFClasCod_To ;
      AV53Ficherosbasicos_tclapenwwds_4_tfclasdsc = AV12TFClasDsc ;
      AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel = AV13TFClasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Ficherosbasicos_tclapenwwds_1_filterfulltext ,
                                           Short.valueOf(AV51Ficherosbasicos_tclapenwwds_2_tfclascod) ,
                                           Short.valueOf(AV52Ficherosbasicos_tclapenwwds_3_tfclascod_to) ,
                                           AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel ,
                                           AV53Ficherosbasicos_tclapenwwds_4_tfclasdsc ,
                                           Short.valueOf(A4295ClasCod) ,
                                           A4296ClasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV50Ficherosbasicos_tclapenwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Ficherosbasicos_tclapenwwds_1_filterfulltext), "%", "") ;
      lV50Ficherosbasicos_tclapenwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Ficherosbasicos_tclapenwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_tclapenwwds_4_tfclasdsc = GXutil.padr( GXutil.rtrim( AV53Ficherosbasicos_tclapenwwds_4_tfclasdsc), 40, "%") ;
      /* Using cursor P082W2 */
      pr_default.execute(0, new Object[] {lV50Ficherosbasicos_tclapenwwds_1_filterfulltext, lV50Ficherosbasicos_tclapenwwds_1_filterfulltext, Short.valueOf(AV51Ficherosbasicos_tclapenwwds_2_tfclascod), Short.valueOf(AV52Ficherosbasicos_tclapenwwds_3_tfclascod_to), lV53Ficherosbasicos_tclapenwwds_4_tfclasdsc, AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk82W2 = false ;
         A4296ClasDsc = P082W2_A4296ClasDsc[0] ;
         n4296ClasDsc = P082W2_n4296ClasDsc[0] ;
         A4295ClasCod = P082W2_A4295ClasCod[0] ;
         A396EmprCod = P082W2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P082W2_A4296ClasDsc[0], A4296ClasDsc) == 0 ) )
         {
            brk82W2 = false ;
            A4295ClasCod = P082W2_A4295ClasCod[0] ;
            A396EmprCod = P082W2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk82W2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4296ClasDsc)==0) )
         {
            AV18Option = A4296ClasDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk82W2 )
         {
            brk82W2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tclapenwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tclapenwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tclapenwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFClasDsc = "" ;
      AV13TFClasDsc_Sel = "" ;
      A4296ClasDsc = "" ;
      AV50Ficherosbasicos_tclapenwwds_1_filterfulltext = "" ;
      AV53Ficherosbasicos_tclapenwwds_4_tfclasdsc = "" ;
      AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel = "" ;
      scmdbuf = "" ;
      lV50Ficherosbasicos_tclapenwwds_1_filterfulltext = "" ;
      lV53Ficherosbasicos_tclapenwwds_4_tfclasdsc = "" ;
      P082W2_A4296ClasDsc = new String[] {""} ;
      P082W2_n4296ClasDsc = new boolean[] {false} ;
      P082W2_A4295ClasCod = new short[1] ;
      P082W2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclapenwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P082W2_A4296ClasDsc, P082W2_n4296ClasDsc, P082W2_A4295ClasCod, P082W2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFClasCod ;
   private short AV11TFClasCod_To ;
   private short AV51Ficherosbasicos_tclapenwwds_2_tfclascod ;
   private short AV52Ficherosbasicos_tclapenwwds_3_tfclascod_to ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private long AV26count ;
   private String AV12TFClasDsc ;
   private String AV13TFClasDsc_Sel ;
   private String A4296ClasDsc ;
   private String AV53Ficherosbasicos_tclapenwwds_4_tfclasdsc ;
   private String AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel ;
   private String scmdbuf ;
   private String lV53Ficherosbasicos_tclapenwwds_4_tfclasdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk82W2 ;
   private boolean n4296ClasDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV50Ficherosbasicos_tclapenwwds_1_filterfulltext ;
   private String lV50Ficherosbasicos_tclapenwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P082W2_A4296ClasDsc ;
   private boolean[] P082W2_n4296ClasDsc ;
   private short[] P082W2_A4295ClasCod ;
   private String[] P082W2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tclapenwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P082W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Ficherosbasicos_tclapenwwds_1_filterfulltext ,
                                          short AV51Ficherosbasicos_tclapenwwds_2_tfclascod ,
                                          short AV52Ficherosbasicos_tclapenwwds_3_tfclascod_to ,
                                          String AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel ,
                                          String AV53Ficherosbasicos_tclapenwwds_4_tfclasdsc ,
                                          short A4295ClasCod ,
                                          String A4296ClasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ClasDsc, ClasCod, EmprCod FROM TXPCLAPEN" ;
      if ( ! (GXutil.strcmp("", AV50Ficherosbasicos_tclapenwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ClasCod,'9990'), 2) like '%' || ?) or ( UPPER(ClasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV51Ficherosbasicos_tclapenwwds_2_tfclascod) )
      {
         addWhere(sWhereString, "(ClasCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV52Ficherosbasicos_tclapenwwds_3_tfclascod_to) )
      {
         addWhere(sWhereString, "(ClasCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Ficherosbasicos_tclapenwwds_4_tfclasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ClasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Ficherosbasicos_tclapenwwds_5_tfclasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(ClasDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ClasDsc" ;
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
                  return conditional_P082W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P082W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
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
                  stmt.setString(sIdx, (String)parms[10], 40);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 40);
               }
               return;
      }
   }

}

