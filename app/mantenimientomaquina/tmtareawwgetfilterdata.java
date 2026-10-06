package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmtareawwgetfilterdata extends GXProcedure
{
   public tmtareawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmtareawwgetfilterdata.class ), "" );
   }

   public tmtareawwgetfilterdata( int remoteHandle ,
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
      tmtareawwgetfilterdata.this.aP5 = new String[] {""};
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
      tmtareawwgetfilterdata.this.AV18DDOName = aP0;
      tmtareawwgetfilterdata.this.AV16SearchTxt = aP1;
      tmtareawwgetfilterdata.this.AV17SearchTxtTo = aP2;
      tmtareawwgetfilterdata.this.aP3 = aP3;
      tmtareawwgetfilterdata.this.aP4 = aP4;
      tmtareawwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_TMDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTMDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("MantenimientoMaquina.TMTareaWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMTareaWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("MantenimientoMaquina.TMTareaWWGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTMDSC") == 0 )
         {
            AV12TFTMDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTMDSC_SEL") == 0 )
         {
            AV13TFTMDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTMCOD") == 0 )
         {
            AV10TFTMCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTMCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTMDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTMDsc = AV16SearchTxt ;
      AV13TFTMDsc_Sel = "" ;
      AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext = AV34FilterFullText ;
      AV42Mantenimientomaquina_tmtareawwds_2_tftmdsc = AV12TFTMDsc ;
      AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel = AV13TFTMDsc_Sel ;
      AV44Mantenimientomaquina_tmtareawwds_4_tftmcod = AV10TFTMCod ;
      AV45Mantenimientomaquina_tmtareawwds_5_tftmcod_to = AV11TFTMCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext ,
                                           AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel ,
                                           AV42Mantenimientomaquina_tmtareawwds_2_tftmdsc ,
                                           Integer.valueOf(AV44Mantenimientomaquina_tmtareawwds_4_tftmcod) ,
                                           Integer.valueOf(AV45Mantenimientomaquina_tmtareawwds_5_tftmcod_to) ,
                                           A9431TMDsc ,
                                           Integer.valueOf(A9430TMCod) ,
                                           A9432TMTxt } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext), "%", "") ;
      lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext), "%", "") ;
      lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext), "%", "") ;
      lV42Mantenimientomaquina_tmtareawwds_2_tftmdsc = GXutil.padr( GXutil.rtrim( AV42Mantenimientomaquina_tmtareawwds_2_tftmdsc), 30, "%") ;
      /* Using cursor P08BJ2 */
      pr_default.execute(0, new Object[] {lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext, lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext, lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext, lV42Mantenimientomaquina_tmtareawwds_2_tftmdsc, AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel, Integer.valueOf(AV44Mantenimientomaquina_tmtareawwds_4_tftmcod), Integer.valueOf(AV45Mantenimientomaquina_tmtareawwds_5_tftmcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8BJ2 = false ;
         A9431TMDsc = P08BJ2_A9431TMDsc[0] ;
         n9431TMDsc = P08BJ2_n9431TMDsc[0] ;
         A9432TMTxt = P08BJ2_A9432TMTxt[0] ;
         n9432TMTxt = P08BJ2_n9432TMTxt[0] ;
         A9430TMCod = P08BJ2_A9430TMCod[0] ;
         A396EmprCod = P08BJ2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08BJ2_A9431TMDsc[0], A9431TMDsc) == 0 ) )
         {
            brk8BJ2 = false ;
            A9430TMCod = P08BJ2_A9430TMCod[0] ;
            A396EmprCod = P08BJ2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk8BJ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9431TMDsc)==0) )
         {
            AV20Option = A9431TMDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8BJ2 )
         {
            brk8BJ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmtareawwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = tmtareawwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = tmtareawwgetfilterdata.this.AV27OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV12TFTMDsc = "" ;
      AV13TFTMDsc_Sel = "" ;
      A9431TMDsc = "" ;
      AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext = "" ;
      AV42Mantenimientomaquina_tmtareawwds_2_tftmdsc = "" ;
      AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel = "" ;
      scmdbuf = "" ;
      lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext = "" ;
      lV42Mantenimientomaquina_tmtareawwds_2_tftmdsc = "" ;
      A9432TMTxt = "" ;
      P08BJ2_A9431TMDsc = new String[] {""} ;
      P08BJ2_n9431TMDsc = new boolean[] {false} ;
      P08BJ2_A9432TMTxt = new String[] {""} ;
      P08BJ2_n9432TMTxt = new boolean[] {false} ;
      P08BJ2_A9430TMCod = new int[1] ;
      P08BJ2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmtareawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08BJ2_A9431TMDsc, P08BJ2_n9431TMDsc, P08BJ2_A9432TMTxt, P08BJ2_n9432TMTxt, P08BJ2_A9430TMCod, P08BJ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV10TFTMCod ;
   private int AV11TFTMCod_To ;
   private int AV44Mantenimientomaquina_tmtareawwds_4_tftmcod ;
   private int AV45Mantenimientomaquina_tmtareawwds_5_tftmcod_to ;
   private int A9430TMCod ;
   private long AV28count ;
   private String AV12TFTMDsc ;
   private String AV13TFTMDsc_Sel ;
   private String A9431TMDsc ;
   private String AV42Mantenimientomaquina_tmtareawwds_2_tftmdsc ;
   private String AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel ;
   private String scmdbuf ;
   private String lV42Mantenimientomaquina_tmtareawwds_2_tftmdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8BJ2 ;
   private boolean n9431TMDsc ;
   private boolean n9432TMTxt ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext ;
   private String lV41Mantenimientomaquina_tmtareawwds_1_filterfulltext ;
   private String A9432TMTxt ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08BJ2_A9431TMDsc ;
   private boolean[] P08BJ2_n9431TMDsc ;
   private String[] P08BJ2_A9432TMTxt ;
   private boolean[] P08BJ2_n9432TMTxt ;
   private int[] P08BJ2_A9430TMCod ;
   private String[] P08BJ2_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tmtareawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext ,
                                          String AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel ,
                                          String AV42Mantenimientomaquina_tmtareawwds_2_tftmdsc ,
                                          int AV44Mantenimientomaquina_tmtareawwds_4_tftmcod ,
                                          int AV45Mantenimientomaquina_tmtareawwds_5_tftmcod_to ,
                                          String A9431TMDsc ,
                                          int A9430TMCod ,
                                          String A9432TMTxt )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TMDsc, TMTxt, TMCod, EmprCod FROM TXPMTAREA" ;
      if ( ! (GXutil.strcmp("", AV41Mantenimientomaquina_tmtareawwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(TMDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(TMCod,'99999990'), 2) like '%' || ?) or ( UPPER(TMTxt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Mantenimientomaquina_tmtareawwds_2_tftmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Mantenimientomaquina_tmtareawwds_3_tftmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(TMDsc = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV44Mantenimientomaquina_tmtareawwds_4_tftmcod) )
      {
         addWhere(sWhereString, "(TMCod >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV45Mantenimientomaquina_tmtareawwds_5_tftmcod_to) )
      {
         addWhere(sWhereString, "(TMCod <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TMDsc" ;
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
                  return conditional_P08BJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
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
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

