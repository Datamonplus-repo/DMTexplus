package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprovinwwgetfilterdata extends GXProcedure
{
   public tprovinwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprovinwwgetfilterdata.class ), "" );
   }

   public tprovinwwgetfilterdata( int remoteHandle ,
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
      tprovinwwgetfilterdata.this.aP5 = new String[] {""};
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
      tprovinwwgetfilterdata.this.AV16DDOName = aP0;
      tprovinwwgetfilterdata.this.AV14SearchTxt = aP1;
      tprovinwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tprovinwwgetfilterdata.this.aP3 = aP3;
      tprovinwwgetfilterdata.this.aP4 = aP4;
      tprovinwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRVDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TPROVINWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPROVINWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TPROVINWWGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV10TFPrvCod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrvCod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV12TFPrvDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV13TFPrvDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrvDsc = AV14SearchTxt ;
      AV13TFPrvDsc_Sel = "" ;
      AV50Ficherosbasicos_tprovinwwds_1_filterfulltext = AV43FilterFullText ;
      AV51Ficherosbasicos_tprovinwwds_2_tfprvcod = AV10TFPrvCod ;
      AV52Ficherosbasicos_tprovinwwds_3_tfprvcod_to = AV11TFPrvCod_To ;
      AV53Ficherosbasicos_tprovinwwds_4_tfprvdsc = AV12TFPrvDsc ;
      AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel = AV13TFPrvDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Ficherosbasicos_tprovinwwds_1_filterfulltext ,
                                           Short.valueOf(AV51Ficherosbasicos_tprovinwwds_2_tfprvcod) ,
                                           Short.valueOf(AV52Ficherosbasicos_tprovinwwds_3_tfprvcod_to) ,
                                           AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel ,
                                           AV53Ficherosbasicos_tprovinwwds_4_tfprvdsc ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV50Ficherosbasicos_tprovinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Ficherosbasicos_tprovinwwds_1_filterfulltext), "%", "") ;
      lV50Ficherosbasicos_tprovinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Ficherosbasicos_tprovinwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_tprovinwwds_4_tfprvdsc = GXutil.padr( GXutil.rtrim( AV53Ficherosbasicos_tprovinwwds_4_tfprvdsc), 30, "%") ;
      /* Using cursor P07WO2 */
      pr_default.execute(0, new Object[] {lV50Ficherosbasicos_tprovinwwds_1_filterfulltext, lV50Ficherosbasicos_tprovinwwds_1_filterfulltext, Short.valueOf(AV51Ficherosbasicos_tprovinwwds_2_tfprvcod), Short.valueOf(AV52Ficherosbasicos_tprovinwwds_3_tfprvcod_to), lV53Ficherosbasicos_tprovinwwds_4_tfprvdsc, AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7WO2 = false ;
         A787PrvDsc = P07WO2_A787PrvDsc[0] ;
         n787PrvDsc = P07WO2_n787PrvDsc[0] ;
         A781PrvCod = P07WO2_A781PrvCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07WO2_A787PrvDsc[0], A787PrvDsc) == 0 ) )
         {
            brk7WO2 = false ;
            A781PrvCod = P07WO2_A781PrvCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk7WO2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A787PrvDsc)==0) )
         {
            AV18Option = A787PrvDsc ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A787PrvDsc, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7WO2 )
         {
            brk7WO2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprovinwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tprovinwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tprovinwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFPrvDsc = "" ;
      AV13TFPrvDsc_Sel = "" ;
      A787PrvDsc = "" ;
      AV50Ficherosbasicos_tprovinwwds_1_filterfulltext = "" ;
      AV53Ficherosbasicos_tprovinwwds_4_tfprvdsc = "" ;
      AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel = "" ;
      scmdbuf = "" ;
      lV50Ficherosbasicos_tprovinwwds_1_filterfulltext = "" ;
      lV53Ficherosbasicos_tprovinwwds_4_tfprvdsc = "" ;
      P07WO2_A787PrvDsc = new String[] {""} ;
      P07WO2_n787PrvDsc = new boolean[] {false} ;
      P07WO2_A781PrvCod = new short[1] ;
      AV18Option = "" ;
      AV21OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tprovinwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07WO2_A787PrvDsc, P07WO2_n787PrvDsc, P07WO2_A781PrvCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFPrvCod ;
   private short AV11TFPrvCod_To ;
   private short AV51Ficherosbasicos_tprovinwwds_2_tfprvcod ;
   private short AV52Ficherosbasicos_tprovinwwds_3_tfprvcod_to ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private long AV26count ;
   private String AV12TFPrvDsc ;
   private String AV13TFPrvDsc_Sel ;
   private String A787PrvDsc ;
   private String AV53Ficherosbasicos_tprovinwwds_4_tfprvdsc ;
   private String AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel ;
   private String scmdbuf ;
   private String lV53Ficherosbasicos_tprovinwwds_4_tfprvdsc ;
   private boolean returnInSub ;
   private boolean brk7WO2 ;
   private boolean n787PrvDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV50Ficherosbasicos_tprovinwwds_1_filterfulltext ;
   private String lV50Ficherosbasicos_tprovinwwds_1_filterfulltext ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07WO2_A787PrvDsc ;
   private boolean[] P07WO2_n787PrvDsc ;
   private short[] P07WO2_A781PrvCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tprovinwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07WO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Ficherosbasicos_tprovinwwds_1_filterfulltext ,
                                          short AV51Ficherosbasicos_tprovinwwds_2_tfprvcod ,
                                          short AV52Ficherosbasicos_tprovinwwds_3_tfprvcod_to ,
                                          String AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel ,
                                          String AV53Ficherosbasicos_tprovinwwds_4_tfprvdsc ,
                                          short A781PrvCod ,
                                          String A787PrvDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrvDsc, PrvCod FROM TXPPROVIN" ;
      if ( ! (GXutil.strcmp("", AV50Ficherosbasicos_tprovinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(PrvCod,'990'), 2) like '%' || ?) or ( UPPER(PrvDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV51Ficherosbasicos_tprovinwwds_2_tfprvcod) )
      {
         addWhere(sWhereString, "(PrvCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV52Ficherosbasicos_tprovinwwds_3_tfprvcod_to) )
      {
         addWhere(sWhereString, "(PrvCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV53Ficherosbasicos_tprovinwwds_4_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Ficherosbasicos_tprovinwwds_5_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvDsc" ;
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
                  return conditional_P07WO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07WO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

