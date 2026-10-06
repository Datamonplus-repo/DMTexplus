package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_wwwgetfilterdata extends GXProcedure
{
   public tpromd_wwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_wwwgetfilterdata.class ), "" );
   }

   public tpromd_wwwgetfilterdata( int remoteHandle ,
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
      tpromd_wwwgetfilterdata.this.aP5 = new String[] {""};
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
      tpromd_wwwgetfilterdata.this.AV26DDOName = aP0;
      tpromd_wwwgetfilterdata.this.AV27SearchTxt = aP1;
      tpromd_wwwgetfilterdata.this.AV28SearchTxtTo = aP2;
      tpromd_wwwgetfilterdata.this.aP3 = aP3;
      tpromd_wwwgetfilterdata.this.aP4 = aP4;
      tpromd_wwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PMDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPMDDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("Facturacion.TProMD_WWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TProMD_WWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("Facturacion.TProMD_WWWGridState"), null, null);
      }
      AV36GXV1 = 1 ;
      while ( AV36GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV36GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOD") == 0 )
         {
            AV10TFPMDCod = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPMDCod_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC") == 0 )
         {
            AV12TFPMDDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC_SEL") == 0 )
         {
            AV13TFPMDDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV36GXV1 = (int)(AV36GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPMDDsc = AV27SearchTxt ;
      AV13TFPMDDsc_Sel = "" ;
      AV38Facturacion_tpromd_wwwds_1_tfpmdcod = AV10TFPMDCod ;
      AV39Facturacion_tpromd_wwwds_2_tfpmdcod_to = AV11TFPMDCod_To ;
      AV40Facturacion_tpromd_wwwds_3_tfpmddsc = AV12TFPMDDsc ;
      AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel = AV13TFPMDDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV38Facturacion_tpromd_wwwds_1_tfpmdcod) ,
                                           Short.valueOf(AV39Facturacion_tpromd_wwwds_2_tfpmdcod_to) ,
                                           AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel ,
                                           AV40Facturacion_tpromd_wwwds_3_tfpmddsc ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           A396EmprCod ,
                                           AV32Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV33Clicod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT
                                           }
      });
      lV40Facturacion_tpromd_wwwds_3_tfpmddsc = GXutil.padr( GXutil.rtrim( AV40Facturacion_tpromd_wwwds_3_tfpmddsc), 30, "%") ;
      /* Using cursor P0AMX2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, Integer.valueOf(AV33Clicod), Short.valueOf(AV38Facturacion_tpromd_wwwds_1_tfpmdcod), Short.valueOf(AV39Facturacion_tpromd_wwwds_2_tfpmdcod_to), lV40Facturacion_tpromd_wwwds_3_tfpmddsc, AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAMX2 = false ;
         A396EmprCod = P0AMX2_A396EmprCod[0] ;
         A252CliCod = P0AMX2_A252CliCod[0] ;
         A8392PMDDsc = P0AMX2_A8392PMDDsc[0] ;
         n8392PMDDsc = P0AMX2_n8392PMDDsc[0] ;
         A8391PMDCod = P0AMX2_A8391PMDCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AMX2_A8392PMDDsc[0], A8392PMDDsc) == 0 ) )
         {
            brkAMX2 = false ;
            A396EmprCod = P0AMX2_A396EmprCod[0] ;
            A252CliCod = P0AMX2_A252CliCod[0] ;
            A8391PMDCod = P0AMX2_A8391PMDCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAMX2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A8392PMDDsc)==0) )
         {
            AV15Option = A8392PMDDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAMX2 )
         {
            brkAMX2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tpromd_wwwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = tpromd_wwwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = tpromd_wwwgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPMDDsc = "" ;
      AV13TFPMDDsc_Sel = "" ;
      A8392PMDDsc = "" ;
      AV40Facturacion_tpromd_wwwds_3_tfpmddsc = "" ;
      AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel = "" ;
      scmdbuf = "" ;
      lV40Facturacion_tpromd_wwwds_3_tfpmddsc = "" ;
      A396EmprCod = "" ;
      AV32Emprcod = "" ;
      P0AMX2_A396EmprCod = new String[] {""} ;
      P0AMX2_A252CliCod = new int[1] ;
      P0AMX2_A8392PMDDsc = new String[] {""} ;
      P0AMX2_n8392PMDDsc = new boolean[] {false} ;
      P0AMX2_A8391PMDCod = new short[1] ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_wwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AMX2_A396EmprCod, P0AMX2_A252CliCod, P0AMX2_A8392PMDDsc, P0AMX2_n8392PMDDsc, P0AMX2_A8391PMDCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFPMDCod ;
   private short AV11TFPMDCod_To ;
   private short AV38Facturacion_tpromd_wwwds_1_tfpmdcod ;
   private short AV39Facturacion_tpromd_wwwds_2_tfpmdcod_to ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int AV36GXV1 ;
   private int A252CliCod ;
   private int AV33Clicod ;
   private long AV20count ;
   private String AV12TFPMDDsc ;
   private String AV13TFPMDDsc_Sel ;
   private String A8392PMDDsc ;
   private String AV40Facturacion_tpromd_wwwds_3_tfpmddsc ;
   private String AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel ;
   private String scmdbuf ;
   private String lV40Facturacion_tpromd_wwwds_3_tfpmddsc ;
   private String A396EmprCod ;
   private String AV32Emprcod ;
   private boolean returnInSub ;
   private boolean brkAMX2 ;
   private boolean n8392PMDDsc ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMX2_A396EmprCod ;
   private int[] P0AMX2_A252CliCod ;
   private String[] P0AMX2_A8392PMDDsc ;
   private boolean[] P0AMX2_n8392PMDDsc ;
   private short[] P0AMX2_A8391PMDCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class tpromd_wwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AMX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV38Facturacion_tpromd_wwwds_1_tfpmdcod ,
                                          short AV39Facturacion_tpromd_wwwds_2_tfpmdcod_to ,
                                          String AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel ,
                                          String AV40Facturacion_tpromd_wwwds_3_tfpmddsc ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          String A396EmprCod ,
                                          String AV32Emprcod ,
                                          int A252CliCod ,
                                          int AV33Clicod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, PMDDsc, PMDCod FROM TXPProMD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (0==AV38Facturacion_tpromd_wwwds_1_tfpmdcod) )
      {
         addWhere(sWhereString, "(PMDCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Facturacion_tpromd_wwwds_2_tfpmdcod_to) )
      {
         addWhere(sWhereString, "(PMDCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Facturacion_tpromd_wwwds_3_tfpmddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Facturacion_tpromd_wwwds_4_tfpmddsc_sel)==0) )
      {
         addWhere(sWhereString, "(PMDDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PMDDsc" ;
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
                  return conditional_P0AMX2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
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

