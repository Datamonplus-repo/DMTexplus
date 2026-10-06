package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class talmacewwgetfilterdata extends GXProcedure
{
   public talmacewwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talmacewwgetfilterdata.class ), "" );
   }

   public talmacewwgetfilterdata( int remoteHandle ,
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
      talmacewwgetfilterdata.this.aP5 = new String[] {""};
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
      talmacewwgetfilterdata.this.AV16DDOName = aP0;
      talmacewwgetfilterdata.this.AV14SearchTxt = aP1;
      talmacewwgetfilterdata.this.AV15SearchTxtTo = aP2;
      talmacewwgetfilterdata.this.aP3 = aP3;
      talmacewwgetfilterdata.this.aP4 = aP4;
      talmacewwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_ALMNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADALMNOMOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TAlmaceWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TAlmaceWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TAlmaceWWGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALMCOD") == 0 )
         {
            AV10TFAlmCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlmCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALMNOM") == 0 )
         {
            AV12TFAlmNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALMNOM_SEL") == 0 )
         {
            AV13TFAlmNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALMNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlmNom = AV14SearchTxt ;
      AV13TFAlmNom_Sel = "" ;
      AV48Talmacewwds_1_filterfulltext = AV43FilterFullText ;
      AV49Talmacewwds_2_tfalmcod = AV10TFAlmCod ;
      AV50Talmacewwds_3_tfalmcod_to = AV11TFAlmCod_To ;
      AV51Talmacewwds_4_tfalmnom = AV12TFAlmNom ;
      AV52Talmacewwds_5_tfalmnom_sel = AV13TFAlmNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Talmacewwds_1_filterfulltext ,
                                           Byte.valueOf(AV49Talmacewwds_2_tfalmcod) ,
                                           Byte.valueOf(AV50Talmacewwds_3_tfalmcod_to) ,
                                           AV52Talmacewwds_5_tfalmnom_sel ,
                                           AV51Talmacewwds_4_tfalmnom ,
                                           Byte.valueOf(A4792AlmCod) ,
                                           A4793AlmNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV48Talmacewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Talmacewwds_1_filterfulltext), "%", "") ;
      lV48Talmacewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Talmacewwds_1_filterfulltext), "%", "") ;
      lV51Talmacewwds_4_tfalmnom = GXutil.padr( GXutil.rtrim( AV51Talmacewwds_4_tfalmnom), 30, "%") ;
      /* Using cursor P083X2 */
      pr_default.execute(0, new Object[] {lV48Talmacewwds_1_filterfulltext, lV48Talmacewwds_1_filterfulltext, Byte.valueOf(AV49Talmacewwds_2_tfalmcod), Byte.valueOf(AV50Talmacewwds_3_tfalmcod_to), lV51Talmacewwds_4_tfalmnom, AV52Talmacewwds_5_tfalmnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk83X2 = false ;
         A4793AlmNom = P083X2_A4793AlmNom[0] ;
         n4793AlmNom = P083X2_n4793AlmNom[0] ;
         A4792AlmCod = P083X2_A4792AlmCod[0] ;
         A396EmprCod = P083X2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P083X2_A4793AlmNom[0], A4793AlmNom) == 0 ) )
         {
            brk83X2 = false ;
            A4792AlmCod = P083X2_A4792AlmCod[0] ;
            A396EmprCod = P083X2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk83X2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4793AlmNom)==0) )
         {
            AV18Option = A4793AlmNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk83X2 )
         {
            brk83X2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = talmacewwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = talmacewwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = talmacewwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFAlmNom = "" ;
      AV13TFAlmNom_Sel = "" ;
      A4793AlmNom = "" ;
      AV48Talmacewwds_1_filterfulltext = "" ;
      AV51Talmacewwds_4_tfalmnom = "" ;
      AV52Talmacewwds_5_tfalmnom_sel = "" ;
      scmdbuf = "" ;
      lV48Talmacewwds_1_filterfulltext = "" ;
      lV51Talmacewwds_4_tfalmnom = "" ;
      P083X2_A4793AlmNom = new String[] {""} ;
      P083X2_n4793AlmNom = new boolean[] {false} ;
      P083X2_A4792AlmCod = new byte[1] ;
      P083X2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talmacewwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P083X2_A4793AlmNom, P083X2_n4793AlmNom, P083X2_A4792AlmCod, P083X2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFAlmCod ;
   private byte AV11TFAlmCod_To ;
   private byte AV49Talmacewwds_2_tfalmcod ;
   private byte AV50Talmacewwds_3_tfalmcod_to ;
   private byte A4792AlmCod ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private long AV26count ;
   private String AV12TFAlmNom ;
   private String AV13TFAlmNom_Sel ;
   private String A4793AlmNom ;
   private String AV51Talmacewwds_4_tfalmnom ;
   private String AV52Talmacewwds_5_tfalmnom_sel ;
   private String scmdbuf ;
   private String lV51Talmacewwds_4_tfalmnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk83X2 ;
   private boolean n4793AlmNom ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV48Talmacewwds_1_filterfulltext ;
   private String lV48Talmacewwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P083X2_A4793AlmNom ;
   private boolean[] P083X2_n4793AlmNom ;
   private byte[] P083X2_A4792AlmCod ;
   private String[] P083X2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class talmacewwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P083X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Talmacewwds_1_filterfulltext ,
                                          byte AV49Talmacewwds_2_tfalmcod ,
                                          byte AV50Talmacewwds_3_tfalmcod_to ,
                                          String AV52Talmacewwds_5_tfalmnom_sel ,
                                          String AV51Talmacewwds_4_tfalmnom ,
                                          byte A4792AlmCod ,
                                          String A4793AlmNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT AlmNom, AlmCod, EmprCod FROM TXPAlmace" ;
      if ( ! (GXutil.strcmp("", AV48Talmacewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlmCod,'90'), 2) like '%' || ?) or ( UPPER(AlmNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV49Talmacewwds_2_tfalmcod) )
      {
         addWhere(sWhereString, "(AlmCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Talmacewwds_3_tfalmcod_to) )
      {
         addWhere(sWhereString, "(AlmCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Talmacewwds_5_tfalmnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Talmacewwds_4_tfalmnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlmNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Talmacewwds_5_tfalmnom_sel)==0) )
      {
         addWhere(sWhereString, "(AlmNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlmNom" ;
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
                  return conditional_P083X2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P083X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

