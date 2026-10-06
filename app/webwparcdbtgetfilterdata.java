package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwparcdbtgetfilterdata extends GXProcedure
{
   public webwparcdbtgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwparcdbtgetfilterdata.class ), "" );
   }

   public webwparcdbtgetfilterdata( int remoteHandle ,
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
      webwparcdbtgetfilterdata.this.aP5 = new String[] {""};
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
      webwparcdbtgetfilterdata.this.AV16DDOName = aP0;
      webwparcdbtgetfilterdata.this.AV14SearchTxt = aP1;
      webwparcdbtgetfilterdata.this.AV15SearchTxtTo = aP2;
      webwparcdbtgetfilterdata.this.aP3 = aP3;
      webwparcdbtgetfilterdata.this.aP4 = aP4;
      webwparcdbtgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PARCODNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPARCODNOMOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("WebWParCdbtGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWParCdbtGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WebWParCdbtGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV10TFParCod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFParCod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV12TFParCodNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV13TFParCodNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPARCODNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFParCodNom = AV14SearchTxt ;
      AV13TFParCodNom_Sel = "" ;
      AV48Webwparcdbtds_1_filterfulltext = AV43FilterFullText ;
      AV49Webwparcdbtds_2_tfparcod = AV10TFParCod ;
      AV50Webwparcdbtds_3_tfparcod_to = AV11TFParCod_To ;
      AV51Webwparcdbtds_4_tfparcodnom = AV12TFParCodNom ;
      AV52Webwparcdbtds_5_tfparcodnom_sel = AV13TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Webwparcdbtds_1_filterfulltext ,
                                           Short.valueOf(AV49Webwparcdbtds_2_tfparcod) ,
                                           Short.valueOf(AV50Webwparcdbtds_3_tfparcod_to) ,
                                           AV52Webwparcdbtds_5_tfparcodnom_sel ,
                                           AV51Webwparcdbtds_4_tfparcodnom ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV48Webwparcdbtds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Webwparcdbtds_1_filterfulltext), "%", "") ;
      lV48Webwparcdbtds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Webwparcdbtds_1_filterfulltext), "%", "") ;
      lV51Webwparcdbtds_4_tfparcodnom = GXutil.padr( GXutil.rtrim( AV51Webwparcdbtds_4_tfparcodnom), 30, "%") ;
      /* Using cursor P08CL2 */
      pr_default.execute(0, new Object[] {lV48Webwparcdbtds_1_filterfulltext, lV48Webwparcdbtds_1_filterfulltext, Short.valueOf(AV49Webwparcdbtds_2_tfparcod), Short.valueOf(AV50Webwparcdbtds_3_tfparcod_to), lV51Webwparcdbtds_4_tfparcodnom, AV52Webwparcdbtds_5_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8CL2 = false ;
         A867ParCodNom = P08CL2_A867ParCodNom[0] ;
         n867ParCodNom = P08CL2_n867ParCodNom[0] ;
         A656ParCod = P08CL2_A656ParCod[0] ;
         A396EmprCod = P08CL2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08CL2_A867ParCodNom[0], A867ParCodNom) == 0 ) )
         {
            brk8CL2 = false ;
            A656ParCod = P08CL2_A656ParCod[0] ;
            A396EmprCod = P08CL2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8CL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A867ParCodNom)==0) )
         {
            AV18Option = A867ParCodNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8CL2 )
         {
            brk8CL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwparcdbtgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = webwparcdbtgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = webwparcdbtgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFParCodNom = "" ;
      AV13TFParCodNom_Sel = "" ;
      A867ParCodNom = "" ;
      AV48Webwparcdbtds_1_filterfulltext = "" ;
      AV51Webwparcdbtds_4_tfparcodnom = "" ;
      AV52Webwparcdbtds_5_tfparcodnom_sel = "" ;
      scmdbuf = "" ;
      lV48Webwparcdbtds_1_filterfulltext = "" ;
      lV51Webwparcdbtds_4_tfparcodnom = "" ;
      P08CL2_A867ParCodNom = new String[] {""} ;
      P08CL2_n867ParCodNom = new boolean[] {false} ;
      P08CL2_A656ParCod = new short[1] ;
      P08CL2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwparcdbtgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08CL2_A867ParCodNom, P08CL2_n867ParCodNom, P08CL2_A656ParCod, P08CL2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFParCod ;
   private short AV11TFParCod_To ;
   private short AV49Webwparcdbtds_2_tfparcod ;
   private short AV50Webwparcdbtds_3_tfparcod_to ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private long AV26count ;
   private String AV12TFParCodNom ;
   private String AV13TFParCodNom_Sel ;
   private String A867ParCodNom ;
   private String AV51Webwparcdbtds_4_tfparcodnom ;
   private String AV52Webwparcdbtds_5_tfparcodnom_sel ;
   private String scmdbuf ;
   private String lV51Webwparcdbtds_4_tfparcodnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8CL2 ;
   private boolean n867ParCodNom ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV48Webwparcdbtds_1_filterfulltext ;
   private String lV48Webwparcdbtds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08CL2_A867ParCodNom ;
   private boolean[] P08CL2_n867ParCodNom ;
   private short[] P08CL2_A656ParCod ;
   private String[] P08CL2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwparcdbtgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Webwparcdbtds_1_filterfulltext ,
                                          short AV49Webwparcdbtds_2_tfparcod ,
                                          short AV50Webwparcdbtds_3_tfparcod_to ,
                                          String AV52Webwparcdbtds_5_tfparcodnom_sel ,
                                          String AV51Webwparcdbtds_4_tfparcodnom ,
                                          short A656ParCod ,
                                          String A867ParCodNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ParCodNom, ParCod, EmprCod FROM TXPCODPAR" ;
      if ( ! (GXutil.strcmp("", AV48Webwparcdbtds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ParCod,'9990'), 2) like '%' || ?) or ( UPPER(ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV49Webwparcdbtds_2_tfparcod) )
      {
         addWhere(sWhereString, "(ParCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Webwparcdbtds_3_tfparcod_to) )
      {
         addWhere(sWhereString, "(ParCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Webwparcdbtds_5_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Webwparcdbtds_4_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Webwparcdbtds_5_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(ParCodNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ParCodNom" ;
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
                  return conditional_P08CL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

