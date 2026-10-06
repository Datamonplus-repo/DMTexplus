package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tforctrwwgetfilterdata extends GXProcedure
{
   public tforctrwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tforctrwwgetfilterdata.class ), "" );
   }

   public tforctrwwgetfilterdata( int remoteHandle ,
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
      tforctrwwgetfilterdata.this.aP5 = new String[] {""};
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
      tforctrwwgetfilterdata.this.AV16DDOName = aP0;
      tforctrwwgetfilterdata.this.AV14SearchTxt = aP1;
      tforctrwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tforctrwwgetfilterdata.this.aP3 = aP3;
      tforctrwwgetfilterdata.this.aP4 = aP4;
      tforctrwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_FORCONDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCONDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FormulacionTinte.TFORCTRWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TFORCTRWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FormulacionTinte.TFORCTRWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCON") == 0 )
         {
            AV10TFForCon = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFForCon_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCONDSC") == 0 )
         {
            AV12TFForConDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCONDSC_SEL") == 0 )
         {
            AV13TFForConDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFORCONDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFForConDsc = AV14SearchTxt ;
      AV13TFForConDsc_Sel = "" ;
      AV37Formulaciontinte_tforctrwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Formulaciontinte_tforctrwwds_2_tfforcon = AV10TFForCon ;
      AV39Formulaciontinte_tforctrwwds_3_tfforcon_to = AV11TFForCon_To ;
      AV40Formulaciontinte_tforctrwwds_4_tfforcondsc = AV12TFForConDsc ;
      AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel = AV13TFForConDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Formulaciontinte_tforctrwwds_1_filterfulltext ,
                                           Byte.valueOf(AV38Formulaciontinte_tforctrwwds_2_tfforcon) ,
                                           Byte.valueOf(AV39Formulaciontinte_tforctrwwds_3_tfforcon_to) ,
                                           AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel ,
                                           AV40Formulaciontinte_tforctrwwds_4_tfforcondsc ,
                                           Byte.valueOf(A484ForCon) ,
                                           A3792ForConDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Formulaciontinte_tforctrwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Formulaciontinte_tforctrwwds_1_filterfulltext), "%", "") ;
      lV37Formulaciontinte_tforctrwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Formulaciontinte_tforctrwwds_1_filterfulltext), "%", "") ;
      lV40Formulaciontinte_tforctrwwds_4_tfforcondsc = GXutil.padr( GXutil.rtrim( AV40Formulaciontinte_tforctrwwds_4_tfforcondsc), 25, "%") ;
      /* Using cursor P08HX2 */
      pr_default.execute(0, new Object[] {lV37Formulaciontinte_tforctrwwds_1_filterfulltext, lV37Formulaciontinte_tforctrwwds_1_filterfulltext, Byte.valueOf(AV38Formulaciontinte_tforctrwwds_2_tfforcon), Byte.valueOf(AV39Formulaciontinte_tforctrwwds_3_tfforcon_to), lV40Formulaciontinte_tforctrwwds_4_tfforcondsc, AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8HX2 = false ;
         A3792ForConDsc = P08HX2_A3792ForConDsc[0] ;
         n3792ForConDsc = P08HX2_n3792ForConDsc[0] ;
         A484ForCon = P08HX2_A484ForCon[0] ;
         A396EmprCod = P08HX2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08HX2_A3792ForConDsc[0], A3792ForConDsc) == 0 ) )
         {
            brk8HX2 = false ;
            A484ForCon = P08HX2_A484ForCon[0] ;
            A396EmprCod = P08HX2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8HX2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3792ForConDsc)==0) )
         {
            AV18Option = A3792ForConDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HX2 )
         {
            brk8HX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tforctrwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tforctrwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tforctrwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFForConDsc = "" ;
      AV13TFForConDsc_Sel = "" ;
      A3792ForConDsc = "" ;
      AV37Formulaciontinte_tforctrwwds_1_filterfulltext = "" ;
      AV40Formulaciontinte_tforctrwwds_4_tfforcondsc = "" ;
      AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel = "" ;
      scmdbuf = "" ;
      lV37Formulaciontinte_tforctrwwds_1_filterfulltext = "" ;
      lV40Formulaciontinte_tforctrwwds_4_tfforcondsc = "" ;
      P08HX2_A3792ForConDsc = new String[] {""} ;
      P08HX2_n3792ForConDsc = new boolean[] {false} ;
      P08HX2_A484ForCon = new byte[1] ;
      P08HX2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tforctrwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08HX2_A3792ForConDsc, P08HX2_n3792ForConDsc, P08HX2_A484ForCon, P08HX2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFForCon ;
   private byte AV11TFForCon_To ;
   private byte AV38Formulaciontinte_tforctrwwds_2_tfforcon ;
   private byte AV39Formulaciontinte_tforctrwwds_3_tfforcon_to ;
   private byte A484ForCon ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFForConDsc ;
   private String AV13TFForConDsc_Sel ;
   private String A3792ForConDsc ;
   private String AV40Formulaciontinte_tforctrwwds_4_tfforcondsc ;
   private String AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel ;
   private String scmdbuf ;
   private String lV40Formulaciontinte_tforctrwwds_4_tfforcondsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8HX2 ;
   private boolean n3792ForConDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Formulaciontinte_tforctrwwds_1_filterfulltext ;
   private String lV37Formulaciontinte_tforctrwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HX2_A3792ForConDsc ;
   private boolean[] P08HX2_n3792ForConDsc ;
   private byte[] P08HX2_A484ForCon ;
   private String[] P08HX2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tforctrwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Formulaciontinte_tforctrwwds_1_filterfulltext ,
                                          byte AV38Formulaciontinte_tforctrwwds_2_tfforcon ,
                                          byte AV39Formulaciontinte_tforctrwwds_3_tfforcon_to ,
                                          String AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel ,
                                          String AV40Formulaciontinte_tforctrwwds_4_tfforcondsc ,
                                          byte A484ForCon ,
                                          String A3792ForConDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ForConDsc, ForCon, EmprCod FROM TXPFORCTR" ;
      if ( ! (GXutil.strcmp("", AV37Formulaciontinte_tforctrwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ForCon,'90'), 2) like '%' || ?) or ( UPPER(ForConDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Formulaciontinte_tforctrwwds_2_tfforcon) )
      {
         addWhere(sWhereString, "(ForCon >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Formulaciontinte_tforctrwwds_3_tfforcon_to) )
      {
         addWhere(sWhereString, "(ForCon <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Formulaciontinte_tforctrwwds_4_tfforcondsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForConDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Formulaciontinte_tforctrwwds_5_tfforcondsc_sel)==0) )
      {
         addWhere(sWhereString, "(ForConDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ForConDsc" ;
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
                  return conditional_P08HX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
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
                  stmt.setString(sIdx, (String)parms[10], 25);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 25);
               }
               return;
      }
   }

}

