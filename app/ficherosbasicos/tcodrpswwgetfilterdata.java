package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcodrpswwgetfilterdata extends GXProcedure
{
   public tcodrpswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcodrpswwgetfilterdata.class ), "" );
   }

   public tcodrpswwgetfilterdata( int remoteHandle ,
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
      tcodrpswwgetfilterdata.this.aP5 = new String[] {""};
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
      tcodrpswwgetfilterdata.this.AV16DDOName = aP0;
      tcodrpswwgetfilterdata.this.AV14SearchTxt = aP1;
      tcodrpswwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tcodrpswwgetfilterdata.this.aP3 = aP3;
      tcodrpswwgetfilterdata.this.aP4 = aP4;
      tcodrpswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_RPS_DSC") == 0 )
      {
         /* Execute user subroutine: 'LOADRPS_DSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TCODRPSWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TCODRPSWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TCODRPSWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_COD") == 0 )
         {
            AV10TFRps_Cod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFRps_Cod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC") == 0 )
         {
            AV12TFRps_Dsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC_SEL") == 0 )
         {
            AV13TFRps_Dsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADRPS_DSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFRps_Dsc = AV14SearchTxt ;
      AV13TFRps_Dsc_Sel = "" ;
      AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext = AV46FilterFullText ;
      AV52Ficherosbasicos_tcodrpswwds_2_tfrps_cod = AV10TFRps_Cod ;
      AV53Ficherosbasicos_tcodrpswwds_3_tfrps_cod_to = AV11TFRps_Cod_To ;
      AV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc = AV12TFRps_Dsc ;
      AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel = AV13TFRps_Dsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext ,
                                           Short.valueOf(AV52Ficherosbasicos_tcodrpswwds_2_tfrps_cod) ,
                                           Short.valueOf(AV53Ficherosbasicos_tcodrpswwds_3_tfrps_cod_to) ,
                                           AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel ,
                                           AV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc ,
                                           Short.valueOf(A7000Rps_Cod) ,
                                           A7001Rps_Dsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV51Ficherosbasicos_tcodrpswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext), "%", "") ;
      lV51Ficherosbasicos_tcodrpswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext), "%", "") ;
      lV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc), 40, "%") ;
      /* Using cursor P081F2 */
      pr_default.execute(0, new Object[] {lV51Ficherosbasicos_tcodrpswwds_1_filterfulltext, lV51Ficherosbasicos_tcodrpswwds_1_filterfulltext, Short.valueOf(AV52Ficherosbasicos_tcodrpswwds_2_tfrps_cod), Short.valueOf(AV53Ficherosbasicos_tcodrpswwds_3_tfrps_cod_to), lV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc, AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk81F2 = false ;
         A7001Rps_Dsc = P081F2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P081F2_n7001Rps_Dsc[0] ;
         A7000Rps_Cod = P081F2_A7000Rps_Cod[0] ;
         A396EmprCod = P081F2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P081F2_A7001Rps_Dsc[0], A7001Rps_Dsc) == 0 ) )
         {
            brk81F2 = false ;
            A7000Rps_Cod = P081F2_A7000Rps_Cod[0] ;
            A396EmprCod = P081F2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk81F2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A7001Rps_Dsc)==0) )
         {
            AV18Option = A7001Rps_Dsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81F2 )
         {
            brk81F2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tcodrpswwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tcodrpswwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tcodrpswwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFRps_Dsc = "" ;
      AV13TFRps_Dsc_Sel = "" ;
      A7001Rps_Dsc = "" ;
      AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext = "" ;
      AV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc = "" ;
      AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel = "" ;
      scmdbuf = "" ;
      lV51Ficherosbasicos_tcodrpswwds_1_filterfulltext = "" ;
      lV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc = "" ;
      P081F2_A7001Rps_Dsc = new String[] {""} ;
      P081F2_n7001Rps_Dsc = new boolean[] {false} ;
      P081F2_A7000Rps_Cod = new short[1] ;
      P081F2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tcodrpswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P081F2_A7001Rps_Dsc, P081F2_n7001Rps_Dsc, P081F2_A7000Rps_Cod, P081F2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFRps_Cod ;
   private short AV11TFRps_Cod_To ;
   private short AV52Ficherosbasicos_tcodrpswwds_2_tfrps_cod ;
   private short AV53Ficherosbasicos_tcodrpswwds_3_tfrps_cod_to ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private long AV26count ;
   private String AV12TFRps_Dsc ;
   private String AV13TFRps_Dsc_Sel ;
   private String A7001Rps_Dsc ;
   private String AV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc ;
   private String AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel ;
   private String scmdbuf ;
   private String lV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk81F2 ;
   private boolean n7001Rps_Dsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext ;
   private String lV51Ficherosbasicos_tcodrpswwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P081F2_A7001Rps_Dsc ;
   private boolean[] P081F2_n7001Rps_Dsc ;
   private short[] P081F2_A7000Rps_Cod ;
   private String[] P081F2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tcodrpswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081F2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext ,
                                          short AV52Ficherosbasicos_tcodrpswwds_2_tfrps_cod ,
                                          short AV53Ficherosbasicos_tcodrpswwds_3_tfrps_cod_to ,
                                          String AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel ,
                                          String AV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc ,
                                          short A7000Rps_Cod ,
                                          String A7001Rps_Dsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Rps_Dsc, Rps_Cod, EmprCod FROM TXPCODRPS" ;
      if ( ! (GXutil.strcmp("", AV51Ficherosbasicos_tcodrpswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Rps_Cod,'9990'), 2) like '%' || ?) or ( UPPER(Rps_Dsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV52Ficherosbasicos_tcodrpswwds_2_tfrps_cod) )
      {
         addWhere(sWhereString, "(Rps_Cod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV53Ficherosbasicos_tcodrpswwds_3_tfrps_cod_to) )
      {
         addWhere(sWhereString, "(Rps_Cod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Ficherosbasicos_tcodrpswwds_4_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_tcodrpswwds_5_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(Rps_Dsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Rps_Dsc" ;
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
                  return conditional_P081F2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081F2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

