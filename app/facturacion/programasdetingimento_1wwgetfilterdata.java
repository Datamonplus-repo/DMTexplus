package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class programasdetingimento_1wwgetfilterdata extends GXProcedure
{
   public programasdetingimento_1wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( programasdetingimento_1wwgetfilterdata.class ), "" );
   }

   public programasdetingimento_1wwgetfilterdata( int remoteHandle ,
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
      programasdetingimento_1wwgetfilterdata.this.aP5 = new String[] {""};
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
      programasdetingimento_1wwgetfilterdata.this.AV28DDOName = aP0;
      programasdetingimento_1wwgetfilterdata.this.AV29SearchTxt = aP1;
      programasdetingimento_1wwgetfilterdata.this.AV30SearchTxtTo = aP2;
      programasdetingimento_1wwgetfilterdata.this.aP3 = aP3;
      programasdetingimento_1wwgetfilterdata.this.aP4 = aP4;
      programasdetingimento_1wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_PMDDSC") == 0 )
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
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("Facturacion.ProgramasdeTingimento_1WWGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.ProgramasdeTingimento_1WWGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("Facturacion.ProgramasdeTingimento_1WWGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOD") == 0 )
         {
            AV35TFPMDCod = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFPMDCod_To = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC") == 0 )
         {
            AV37TFPMDDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDSC_SEL") == 0 )
         {
            AV38TFPMDDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPMDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV37TFPMDDsc = AV29SearchTxt ;
      AV38TFPMDDsc_Sel = "" ;
      AV47Facturacion_programasdetingimento_1wwds_1_tfpmdcod = AV35TFPMDCod ;
      AV48Facturacion_programasdetingimento_1wwds_2_tfpmdcod_to = AV36TFPMDCod_To ;
      AV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc = AV37TFPMDDsc ;
      AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel = AV38TFPMDDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV47Facturacion_programasdetingimento_1wwds_1_tfpmdcod) ,
                                           Short.valueOf(AV48Facturacion_programasdetingimento_1wwds_2_tfpmdcod_to) ,
                                           AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel ,
                                           AV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc ,
                                           Short.valueOf(A8391PMDCod) ,
                                           A8392PMDDsc ,
                                           A396EmprCod ,
                                           AV39Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV40Clicod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT
                                           }
      });
      lV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc = GXutil.padr( GXutil.rtrim( AV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc), 30, "%") ;
      /* Using cursor P0A4J2 */
      pr_default.execute(0, new Object[] {AV39Emprcod, Integer.valueOf(AV40Clicod), Short.valueOf(AV47Facturacion_programasdetingimento_1wwds_1_tfpmdcod), Short.valueOf(AV48Facturacion_programasdetingimento_1wwds_2_tfpmdcod_to), lV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc, AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA4J2 = false ;
         A396EmprCod = P0A4J2_A396EmprCod[0] ;
         A252CliCod = P0A4J2_A252CliCod[0] ;
         A8392PMDDsc = P0A4J2_A8392PMDDsc[0] ;
         n8392PMDDsc = P0A4J2_n8392PMDDsc[0] ;
         A8391PMDCod = P0A4J2_A8391PMDCod[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A4J2_A8392PMDDsc[0], A8392PMDDsc) == 0 ) )
         {
            brkA4J2 = false ;
            A396EmprCod = P0A4J2_A396EmprCod[0] ;
            A252CliCod = P0A4J2_A252CliCod[0] ;
            A8391PMDCod = P0A4J2_A8391PMDCod[0] ;
            AV22count = (long)(AV22count+1) ;
            brkA4J2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A8392PMDDsc)==0) )
         {
            AV17Option = A8392PMDDsc ;
            AV18Options.add(AV17Option, 0);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA4J2 )
         {
            brkA4J2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = programasdetingimento_1wwgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = programasdetingimento_1wwgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = programasdetingimento_1wwgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV31OptionsJson = "" ;
      AV32OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV18Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV21OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV25GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV26GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV37TFPMDDsc = "" ;
      AV38TFPMDDsc_Sel = "" ;
      A8392PMDDsc = "" ;
      AV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc = "" ;
      AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel = "" ;
      scmdbuf = "" ;
      lV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc = "" ;
      A396EmprCod = "" ;
      AV39Emprcod = "" ;
      P0A4J2_A396EmprCod = new String[] {""} ;
      P0A4J2_A252CliCod = new int[1] ;
      P0A4J2_A8392PMDDsc = new String[] {""} ;
      P0A4J2_n8392PMDDsc = new boolean[] {false} ;
      P0A4J2_A8391PMDCod = new short[1] ;
      AV17Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.programasdetingimento_1wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A4J2_A396EmprCod, P0A4J2_A252CliCod, P0A4J2_A8392PMDDsc, P0A4J2_n8392PMDDsc, P0A4J2_A8391PMDCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV35TFPMDCod ;
   private short AV36TFPMDCod_To ;
   private short AV47Facturacion_programasdetingimento_1wwds_1_tfpmdcod ;
   private short AV48Facturacion_programasdetingimento_1wwds_2_tfpmdcod_to ;
   private short A8391PMDCod ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int A252CliCod ;
   private int AV40Clicod ;
   private long AV22count ;
   private String AV37TFPMDDsc ;
   private String AV38TFPMDDsc_Sel ;
   private String A8392PMDDsc ;
   private String AV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc ;
   private String AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel ;
   private String scmdbuf ;
   private String lV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc ;
   private String A396EmprCod ;
   private String AV39Emprcod ;
   private boolean returnInSub ;
   private boolean brkA4J2 ;
   private boolean n8392PMDDsc ;
   private String AV31OptionsJson ;
   private String AV32OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV17Option ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A4J2_A396EmprCod ;
   private int[] P0A4J2_A252CliCod ;
   private String[] P0A4J2_A8392PMDDsc ;
   private boolean[] P0A4J2_n8392PMDDsc ;
   private short[] P0A4J2_A8391PMDCod ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class programasdetingimento_1wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A4J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV47Facturacion_programasdetingimento_1wwds_1_tfpmdcod ,
                                          short AV48Facturacion_programasdetingimento_1wwds_2_tfpmdcod_to ,
                                          String AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel ,
                                          String AV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc ,
                                          short A8391PMDCod ,
                                          String A8392PMDDsc ,
                                          String A396EmprCod ,
                                          String AV39Emprcod ,
                                          int A252CliCod ,
                                          int AV40Clicod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, PMDDsc, PMDCod FROM TXPProMD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (0==AV47Facturacion_programasdetingimento_1wwds_1_tfpmdcod) )
      {
         addWhere(sWhereString, "(PMDCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV48Facturacion_programasdetingimento_1wwds_2_tfpmdcod_to) )
      {
         addWhere(sWhereString, "(PMDCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Facturacion_programasdetingimento_1wwds_3_tfpmddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PMDDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Facturacion_programasdetingimento_1wwds_4_tfpmddsc_sel)==0) )
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
                  return conditional_P0A4J2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

