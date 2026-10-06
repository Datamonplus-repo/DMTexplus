package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class topasenwwgetfilterdata extends GXProcedure
{
   public topasenwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( topasenwwgetfilterdata.class ), "" );
   }

   public topasenwwgetfilterdata( int remoteHandle ,
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
      topasenwwgetfilterdata.this.aP5 = new String[] {""};
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
      topasenwwgetfilterdata.this.AV16DDOName = aP0;
      topasenwwgetfilterdata.this.AV14SearchTxt = aP1;
      topasenwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      topasenwwgetfilterdata.this.aP3 = aP3;
      topasenwwgetfilterdata.this.aP4 = aP4;
      topasenwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_TPOPD") == 0 )
      {
         /* Execute user subroutine: 'LOADTPOPDOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TOPASENWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TOPASENWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TOPASENWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTPOPC") == 0 )
         {
            AV10TFTpOpC = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTpOpC_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTPOPD") == 0 )
         {
            AV12TFTpOpD = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTPOPD_SEL") == 0 )
         {
            AV13TFTpOpD_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTPOPDOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTpOpD = AV14SearchTxt ;
      AV13TFTpOpD_Sel = "" ;
      AV37Topasenwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Topasenwwds_2_tftpopc = AV10TFTpOpC ;
      AV39Topasenwwds_3_tftpopc_to = AV11TFTpOpC_To ;
      AV40Topasenwwds_4_tftpopd = AV12TFTpOpD ;
      AV41Topasenwwds_5_tftpopd_sel = AV13TFTpOpD_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Topasenwwds_1_filterfulltext ,
                                           Short.valueOf(AV38Topasenwwds_2_tftpopc) ,
                                           Short.valueOf(AV39Topasenwwds_3_tftpopc_to) ,
                                           AV41Topasenwwds_5_tftpopd_sel ,
                                           AV40Topasenwwds_4_tftpopd ,
                                           Short.valueOf(A11180TpOpC) ,
                                           A11181TpOpD } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Topasenwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Topasenwwds_1_filterfulltext), "%", "") ;
      lV37Topasenwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Topasenwwds_1_filterfulltext), "%", "") ;
      lV40Topasenwwds_4_tftpopd = GXutil.padr( GXutil.rtrim( AV40Topasenwwds_4_tftpopd), 40, "%") ;
      /* Using cursor P08SZ2 */
      pr_default.execute(0, new Object[] {lV37Topasenwwds_1_filterfulltext, lV37Topasenwwds_1_filterfulltext, Short.valueOf(AV38Topasenwwds_2_tftpopc), Short.valueOf(AV39Topasenwwds_3_tftpopc_to), lV40Topasenwwds_4_tftpopd, AV41Topasenwwds_5_tftpopd_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8SZ2 = false ;
         A11181TpOpD = P08SZ2_A11181TpOpD[0] ;
         n11181TpOpD = P08SZ2_n11181TpOpD[0] ;
         A11180TpOpC = P08SZ2_A11180TpOpC[0] ;
         A396EmprCod = P08SZ2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08SZ2_A11181TpOpD[0], A11181TpOpD) == 0 ) )
         {
            brk8SZ2 = false ;
            A11180TpOpC = P08SZ2_A11180TpOpC[0] ;
            A396EmprCod = P08SZ2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8SZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11181TpOpD)==0) )
         {
            AV18Option = A11181TpOpD ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8SZ2 )
         {
            brk8SZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = topasenwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = topasenwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = topasenwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFTpOpD = "" ;
      AV13TFTpOpD_Sel = "" ;
      A11181TpOpD = "" ;
      AV37Topasenwwds_1_filterfulltext = "" ;
      AV40Topasenwwds_4_tftpopd = "" ;
      AV41Topasenwwds_5_tftpopd_sel = "" ;
      scmdbuf = "" ;
      lV37Topasenwwds_1_filterfulltext = "" ;
      lV40Topasenwwds_4_tftpopd = "" ;
      P08SZ2_A11181TpOpD = new String[] {""} ;
      P08SZ2_n11181TpOpD = new boolean[] {false} ;
      P08SZ2_A11180TpOpC = new short[1] ;
      P08SZ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.topasenwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08SZ2_A11181TpOpD, P08SZ2_n11181TpOpD, P08SZ2_A11180TpOpC, P08SZ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTpOpC ;
   private short AV11TFTpOpC_To ;
   private short AV38Topasenwwds_2_tftpopc ;
   private short AV39Topasenwwds_3_tftpopc_to ;
   private short A11180TpOpC ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFTpOpD ;
   private String AV13TFTpOpD_Sel ;
   private String A11181TpOpD ;
   private String AV40Topasenwwds_4_tftpopd ;
   private String AV41Topasenwwds_5_tftpopd_sel ;
   private String scmdbuf ;
   private String lV40Topasenwwds_4_tftpopd ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8SZ2 ;
   private boolean n11181TpOpD ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Topasenwwds_1_filterfulltext ;
   private String lV37Topasenwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08SZ2_A11181TpOpD ;
   private boolean[] P08SZ2_n11181TpOpD ;
   private short[] P08SZ2_A11180TpOpC ;
   private String[] P08SZ2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class topasenwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08SZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Topasenwwds_1_filterfulltext ,
                                          short AV38Topasenwwds_2_tftpopc ,
                                          short AV39Topasenwwds_3_tftpopc_to ,
                                          String AV41Topasenwwds_5_tftpopd_sel ,
                                          String AV40Topasenwwds_4_tftpopd ,
                                          short A11180TpOpC ,
                                          String A11181TpOpD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TpOpD, TpOpC, EmprCod FROM TXPOPASEN" ;
      if ( ! (GXutil.strcmp("", AV37Topasenwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TpOpC,'9990'), 2) like '%' || ?) or ( UPPER(TpOpD) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Topasenwwds_2_tftpopc) )
      {
         addWhere(sWhereString, "(TpOpC >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Topasenwwds_3_tftpopc_to) )
      {
         addWhere(sWhereString, "(TpOpC <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Topasenwwds_5_tftpopd_sel)==0) && ( ! (GXutil.strcmp("", AV40Topasenwwds_4_tftpopd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TpOpD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Topasenwwds_5_tftpopd_sel)==0) )
      {
         addWhere(sWhereString, "(TpOpD = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TpOpD" ;
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
                  return conditional_P08SZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08SZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

