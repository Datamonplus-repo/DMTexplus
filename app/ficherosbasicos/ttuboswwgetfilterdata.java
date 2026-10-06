package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttuboswwgetfilterdata extends GXProcedure
{
   public ttuboswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttuboswwgetfilterdata.class ), "" );
   }

   public ttuboswwgetfilterdata( int remoteHandle ,
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
      ttuboswwgetfilterdata.this.aP5 = new String[] {""};
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
      ttuboswwgetfilterdata.this.AV18DDOName = aP0;
      ttuboswwgetfilterdata.this.AV16SearchTxt = aP1;
      ttuboswwgetfilterdata.this.AV17SearchTxtTo = aP2;
      ttuboswwgetfilterdata.this.aP3 = aP3;
      ttuboswwgetfilterdata.this.aP4 = aP4;
      ttuboswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_TUBNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTUBNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("FicherosBasicos.TTUBOSWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTUBOSWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FicherosBasicos.TTUBOSWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV10TFTubCod = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTubCod_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBNOM") == 0 )
         {
            AV12TFTubNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBNOM_SEL") == 0 )
         {
            AV13TFTubNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBPRE") == 0 )
         {
            AV14TFTubPre = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFTubPre_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTUBNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTubNom = AV16SearchTxt ;
      AV13TFTubNom_Sel = "" ;
      AV53Ficherosbasicos_ttuboswwds_1_filterfulltext = AV48FilterFullText ;
      AV54Ficherosbasicos_ttuboswwds_2_tftubcod = AV10TFTubCod ;
      AV55Ficherosbasicos_ttuboswwds_3_tftubcod_to = AV11TFTubCod_To ;
      AV56Ficherosbasicos_ttuboswwds_4_tftubnom = AV12TFTubNom ;
      AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel = AV13TFTubNom_Sel ;
      AV58Ficherosbasicos_ttuboswwds_6_tftubpre = AV14TFTubPre ;
      AV59Ficherosbasicos_ttuboswwds_7_tftubpre_to = AV15TFTubPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Ficherosbasicos_ttuboswwds_1_filterfulltext ,
                                           Short.valueOf(AV54Ficherosbasicos_ttuboswwds_2_tftubcod) ,
                                           Short.valueOf(AV55Ficherosbasicos_ttuboswwds_3_tftubcod_to) ,
                                           AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel ,
                                           AV56Ficherosbasicos_ttuboswwds_4_tftubnom ,
                                           AV58Ficherosbasicos_ttuboswwds_6_tftubpre ,
                                           AV59Ficherosbasicos_ttuboswwds_7_tftubpre_to ,
                                           Short.valueOf(A1206TubCod) ,
                                           A1207TubNom ,
                                           A1208TubPre } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN
                                           }
      });
      lV53Ficherosbasicos_ttuboswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttuboswwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_ttuboswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttuboswwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_ttuboswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_ttuboswwds_1_filterfulltext), "%", "") ;
      lV56Ficherosbasicos_ttuboswwds_4_tftubnom = GXutil.padr( GXutil.rtrim( AV56Ficherosbasicos_ttuboswwds_4_tftubnom), 30, "%") ;
      /* Using cursor P080J2 */
      pr_default.execute(0, new Object[] {lV53Ficherosbasicos_ttuboswwds_1_filterfulltext, lV53Ficherosbasicos_ttuboswwds_1_filterfulltext, lV53Ficherosbasicos_ttuboswwds_1_filterfulltext, Short.valueOf(AV54Ficherosbasicos_ttuboswwds_2_tftubcod), Short.valueOf(AV55Ficherosbasicos_ttuboswwds_3_tftubcod_to), lV56Ficherosbasicos_ttuboswwds_4_tftubnom, AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel, AV58Ficherosbasicos_ttuboswwds_6_tftubpre, AV59Ficherosbasicos_ttuboswwds_7_tftubpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk80J2 = false ;
         A1207TubNom = P080J2_A1207TubNom[0] ;
         n1207TubNom = P080J2_n1207TubNom[0] ;
         A1208TubPre = P080J2_A1208TubPre[0] ;
         n1208TubPre = P080J2_n1208TubPre[0] ;
         A1206TubCod = P080J2_A1206TubCod[0] ;
         A396EmprCod = P080J2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P080J2_A1207TubNom[0], A1207TubNom) == 0 ) )
         {
            brk80J2 = false ;
            A1206TubCod = P080J2_A1206TubCod[0] ;
            A396EmprCod = P080J2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk80J2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1207TubNom)==0) )
         {
            AV20Option = A1207TubNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk80J2 )
         {
            brk80J2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttuboswwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = ttuboswwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = ttuboswwgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV12TFTubNom = "" ;
      AV13TFTubNom_Sel = "" ;
      AV14TFTubPre = DecimalUtil.ZERO ;
      AV15TFTubPre_To = DecimalUtil.ZERO ;
      A1207TubNom = "" ;
      AV53Ficherosbasicos_ttuboswwds_1_filterfulltext = "" ;
      AV56Ficherosbasicos_ttuboswwds_4_tftubnom = "" ;
      AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel = "" ;
      AV58Ficherosbasicos_ttuboswwds_6_tftubpre = DecimalUtil.ZERO ;
      AV59Ficherosbasicos_ttuboswwds_7_tftubpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV53Ficherosbasicos_ttuboswwds_1_filterfulltext = "" ;
      lV56Ficherosbasicos_ttuboswwds_4_tftubnom = "" ;
      A1208TubPre = DecimalUtil.ZERO ;
      P080J2_A1207TubNom = new String[] {""} ;
      P080J2_n1207TubNom = new boolean[] {false} ;
      P080J2_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P080J2_n1208TubPre = new boolean[] {false} ;
      P080J2_A1206TubCod = new short[1] ;
      P080J2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttuboswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P080J2_A1207TubNom, P080J2_n1207TubNom, P080J2_A1208TubPre, P080J2_n1208TubPre, P080J2_A1206TubCod, P080J2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTubCod ;
   private short AV11TFTubCod_To ;
   private short AV54Ficherosbasicos_ttuboswwds_2_tftubcod ;
   private short AV55Ficherosbasicos_ttuboswwds_3_tftubcod_to ;
   private short A1206TubCod ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private long AV28count ;
   private java.math.BigDecimal AV14TFTubPre ;
   private java.math.BigDecimal AV15TFTubPre_To ;
   private java.math.BigDecimal AV58Ficherosbasicos_ttuboswwds_6_tftubpre ;
   private java.math.BigDecimal AV59Ficherosbasicos_ttuboswwds_7_tftubpre_to ;
   private java.math.BigDecimal A1208TubPre ;
   private String AV12TFTubNom ;
   private String AV13TFTubNom_Sel ;
   private String A1207TubNom ;
   private String AV56Ficherosbasicos_ttuboswwds_4_tftubnom ;
   private String AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel ;
   private String scmdbuf ;
   private String lV56Ficherosbasicos_ttuboswwds_4_tftubnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk80J2 ;
   private boolean n1207TubNom ;
   private boolean n1208TubPre ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV53Ficherosbasicos_ttuboswwds_1_filterfulltext ;
   private String lV53Ficherosbasicos_ttuboswwds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P080J2_A1207TubNom ;
   private boolean[] P080J2_n1207TubNom ;
   private java.math.BigDecimal[] P080J2_A1208TubPre ;
   private boolean[] P080J2_n1208TubPre ;
   private short[] P080J2_A1206TubCod ;
   private String[] P080J2_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class ttuboswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Ficherosbasicos_ttuboswwds_1_filterfulltext ,
                                          short AV54Ficherosbasicos_ttuboswwds_2_tftubcod ,
                                          short AV55Ficherosbasicos_ttuboswwds_3_tftubcod_to ,
                                          String AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel ,
                                          String AV56Ficherosbasicos_ttuboswwds_4_tftubnom ,
                                          java.math.BigDecimal AV58Ficherosbasicos_ttuboswwds_6_tftubpre ,
                                          java.math.BigDecimal AV59Ficherosbasicos_ttuboswwds_7_tftubpre_to ,
                                          short A1206TubCod ,
                                          String A1207TubNom ,
                                          java.math.BigDecimal A1208TubPre )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TubNom, TubPre, TubCod, EmprCod FROM TXPTUBOS" ;
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_ttuboswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TubCod,'9990'), 2) like '%' || ?) or ( UPPER(TubNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TubPre,'9990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV54Ficherosbasicos_ttuboswwds_2_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV55Ficherosbasicos_ttuboswwds_3_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Ficherosbasicos_ttuboswwds_4_tftubnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TubNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ficherosbasicos_ttuboswwds_5_tftubnom_sel)==0) )
      {
         addWhere(sWhereString, "(TubNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Ficherosbasicos_ttuboswwds_6_tftubpre)==0) )
      {
         addWhere(sWhereString, "(TubPre >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Ficherosbasicos_ttuboswwds_7_tftubpre_to)==0) )
      {
         addWhere(sWhereString, "(TubPre <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TubNom" ;
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
                  return conditional_P080J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 5);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 5);
               }
               return;
      }
   }

}

