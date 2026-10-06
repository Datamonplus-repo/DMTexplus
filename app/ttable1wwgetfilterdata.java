package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttable1wwgetfilterdata extends GXProcedure
{
   public ttable1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttable1wwgetfilterdata.class ), "" );
   }

   public ttable1wwgetfilterdata( int remoteHandle ,
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
      ttable1wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttable1wwgetfilterdata.this.AV16DDOName = aP0;
      ttable1wwgetfilterdata.this.AV14SearchTxt = aP1;
      ttable1wwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttable1wwgetfilterdata.this.aP3 = aP3;
      ttable1wwgetfilterdata.this.aP4 = aP4;
      ttable1wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TB1_DSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTB1_DSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TTABLE1WWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTABLE1WWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TTABLE1WWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTB1_DSC") == 0 )
         {
            AV12TFTb1_Dsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTB1_DSC_SEL") == 0 )
         {
            AV13TFTb1_Dsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTB1_COD") == 0 )
         {
            AV10TFTb1_Cod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTb1_Cod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTB1_DSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTb1_Dsc = AV14SearchTxt ;
      AV13TFTb1_Dsc_Sel = "" ;
      AV51Ttable1wwds_1_filterfulltext = AV46FilterFullText ;
      AV52Ttable1wwds_2_tftb1_dsc = AV12TFTb1_Dsc ;
      AV53Ttable1wwds_3_tftb1_dsc_sel = AV13TFTb1_Dsc_Sel ;
      AV54Ttable1wwds_4_tftb1_cod = AV10TFTb1_Cod ;
      AV55Ttable1wwds_5_tftb1_cod_to = AV11TFTb1_Cod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Ttable1wwds_1_filterfulltext ,
                                           AV53Ttable1wwds_3_tftb1_dsc_sel ,
                                           AV52Ttable1wwds_2_tftb1_dsc ,
                                           Short.valueOf(AV54Ttable1wwds_4_tftb1_cod) ,
                                           Short.valueOf(AV55Ttable1wwds_5_tftb1_cod_to) ,
                                           A9715Tb1_Dsc ,
                                           Short.valueOf(A9713Tb1_Cod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                           }
      });
      lV51Ttable1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ttable1wwds_1_filterfulltext), "%", "") ;
      lV51Ttable1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ttable1wwds_1_filterfulltext), "%", "") ;
      lV52Ttable1wwds_2_tftb1_dsc = GXutil.padr( GXutil.rtrim( AV52Ttable1wwds_2_tftb1_dsc), 80, "%") ;
      /* Using cursor P07XN2 */
      pr_default.execute(0, new Object[] {lV51Ttable1wwds_1_filterfulltext, lV51Ttable1wwds_1_filterfulltext, lV52Ttable1wwds_2_tftb1_dsc, AV53Ttable1wwds_3_tftb1_dsc_sel, Short.valueOf(AV54Ttable1wwds_4_tftb1_cod), Short.valueOf(AV55Ttable1wwds_5_tftb1_cod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7XN2 = false ;
         A9715Tb1_Dsc = P07XN2_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = P07XN2_n9715Tb1_Dsc[0] ;
         A9713Tb1_Cod = P07XN2_A9713Tb1_Cod[0] ;
         A396EmprCod = P07XN2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07XN2_A9715Tb1_Dsc[0], A9715Tb1_Dsc) == 0 ) )
         {
            brk7XN2 = false ;
            A9713Tb1_Cod = P07XN2_A9713Tb1_Cod[0] ;
            A396EmprCod = P07XN2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk7XN2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9715Tb1_Dsc)==0) )
         {
            AV18Option = A9715Tb1_Dsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7XN2 )
         {
            brk7XN2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttable1wwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttable1wwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttable1wwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV12TFTb1_Dsc = "" ;
      AV13TFTb1_Dsc_Sel = "" ;
      A9715Tb1_Dsc = "" ;
      AV51Ttable1wwds_1_filterfulltext = "" ;
      AV52Ttable1wwds_2_tftb1_dsc = "" ;
      AV53Ttable1wwds_3_tftb1_dsc_sel = "" ;
      scmdbuf = "" ;
      lV51Ttable1wwds_1_filterfulltext = "" ;
      lV52Ttable1wwds_2_tftb1_dsc = "" ;
      P07XN2_A9715Tb1_Dsc = new String[] {""} ;
      P07XN2_n9715Tb1_Dsc = new boolean[] {false} ;
      P07XN2_A9713Tb1_Cod = new short[1] ;
      P07XN2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttable1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07XN2_A9715Tb1_Dsc, P07XN2_n9715Tb1_Dsc, P07XN2_A9713Tb1_Cod, P07XN2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTb1_Cod ;
   private short AV11TFTb1_Cod_To ;
   private short AV54Ttable1wwds_4_tftb1_cod ;
   private short AV55Ttable1wwds_5_tftb1_cod_to ;
   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private long AV26count ;
   private String AV12TFTb1_Dsc ;
   private String AV13TFTb1_Dsc_Sel ;
   private String A9715Tb1_Dsc ;
   private String AV52Ttable1wwds_2_tftb1_dsc ;
   private String AV53Ttable1wwds_3_tftb1_dsc_sel ;
   private String scmdbuf ;
   private String lV52Ttable1wwds_2_tftb1_dsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk7XN2 ;
   private boolean n9715Tb1_Dsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Ttable1wwds_1_filterfulltext ;
   private String lV51Ttable1wwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07XN2_A9715Tb1_Dsc ;
   private boolean[] P07XN2_n9715Tb1_Dsc ;
   private short[] P07XN2_A9713Tb1_Cod ;
   private String[] P07XN2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttable1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07XN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Ttable1wwds_1_filterfulltext ,
                                          String AV53Ttable1wwds_3_tftb1_dsc_sel ,
                                          String AV52Ttable1wwds_2_tftb1_dsc ,
                                          short AV54Ttable1wwds_4_tftb1_cod ,
                                          short AV55Ttable1wwds_5_tftb1_cod_to ,
                                          String A9715Tb1_Dsc ,
                                          short A9713Tb1_Cod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Tb1_Dsc, Tb1_Cod, EmprCod FROM TXPTABLE1" ;
      if ( ! (GXutil.strcmp("", AV51Ttable1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(Tb1_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Ttable1wwds_3_tftb1_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Ttable1wwds_2_tftb1_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Tb1_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Ttable1wwds_3_tftb1_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(Tb1_Dsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Ttable1wwds_4_tftb1_cod) )
      {
         addWhere(sWhereString, "(Tb1_Cod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV55Ttable1wwds_5_tftb1_cod_to) )
      {
         addWhere(sWhereString, "(Tb1_Cod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Tb1_Dsc" ;
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
                  return conditional_P07XN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07XN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
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
                  stmt.setString(sIdx, (String)parms[8], 80);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 80);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               return;
      }
   }

}

