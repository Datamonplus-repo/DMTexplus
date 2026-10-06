package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tsolidewwgetfilterdata extends GXProcedure
{
   public tsolidewwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tsolidewwgetfilterdata.class ), "" );
   }

   public tsolidewwgetfilterdata( int remoteHandle ,
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
      tsolidewwgetfilterdata.this.aP5 = new String[] {""};
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
      tsolidewwgetfilterdata.this.AV16DDOName = aP0;
      tsolidewwgetfilterdata.this.AV14SearchTxt = aP1;
      tsolidewwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tsolidewwgetfilterdata.this.aP3 = aP3;
      tsolidewwgetfilterdata.this.aP4 = aP4;
      tsolidewwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_DSCSOL") == 0 )
      {
         /* Execute user subroutine: 'LOADDSCSOLOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FormulacionTinte.TSOLIDEWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TSOLIDEWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FormulacionTinte.TSOLIDEWWGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODSOL") == 0 )
         {
            AV10TFCodSol = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCodSol_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCSOL") == 0 )
         {
            AV12TFDscSol = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCSOL_SEL") == 0 )
         {
            AV13TFDscSol_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDSCSOLOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDscSol = AV14SearchTxt ;
      AV13TFDscSol_Sel = "" ;
      AV39Formulaciontinte_tsolidewwds_1_filterfulltext = AV34FilterFullText ;
      AV40Formulaciontinte_tsolidewwds_2_tfcodsol = AV10TFCodSol ;
      AV41Formulaciontinte_tsolidewwds_3_tfcodsol_to = AV11TFCodSol_To ;
      AV42Formulaciontinte_tsolidewwds_4_tfdscsol = AV12TFDscSol ;
      AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel = AV13TFDscSol_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Formulaciontinte_tsolidewwds_1_filterfulltext ,
                                           Short.valueOf(AV40Formulaciontinte_tsolidewwds_2_tfcodsol) ,
                                           Short.valueOf(AV41Formulaciontinte_tsolidewwds_3_tfcodsol_to) ,
                                           AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel ,
                                           AV42Formulaciontinte_tsolidewwds_4_tfdscsol ,
                                           Short.valueOf(A3316CodSol) ,
                                           A3317DscSol } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV39Formulaciontinte_tsolidewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Formulaciontinte_tsolidewwds_1_filterfulltext), "%", "") ;
      lV39Formulaciontinte_tsolidewwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Formulaciontinte_tsolidewwds_1_filterfulltext), "%", "") ;
      lV42Formulaciontinte_tsolidewwds_4_tfdscsol = GXutil.padr( GXutil.rtrim( AV42Formulaciontinte_tsolidewwds_4_tfdscsol), 30, "%") ;
      /* Using cursor P08HT2 */
      pr_default.execute(0, new Object[] {lV39Formulaciontinte_tsolidewwds_1_filterfulltext, lV39Formulaciontinte_tsolidewwds_1_filterfulltext, Short.valueOf(AV40Formulaciontinte_tsolidewwds_2_tfcodsol), Short.valueOf(AV41Formulaciontinte_tsolidewwds_3_tfcodsol_to), lV42Formulaciontinte_tsolidewwds_4_tfdscsol, AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8HT2 = false ;
         A3317DscSol = P08HT2_A3317DscSol[0] ;
         n3317DscSol = P08HT2_n3317DscSol[0] ;
         A3316CodSol = P08HT2_A3316CodSol[0] ;
         A396EmprCod = P08HT2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08HT2_A3317DscSol[0], A3317DscSol) == 0 ) )
         {
            brk8HT2 = false ;
            A3316CodSol = P08HT2_A3316CodSol[0] ;
            A396EmprCod = P08HT2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8HT2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3317DscSol)==0) )
         {
            AV18Option = A3317DscSol ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8HT2 )
         {
            brk8HT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tsolidewwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tsolidewwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tsolidewwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV12TFDscSol = "" ;
      AV13TFDscSol_Sel = "" ;
      A3317DscSol = "" ;
      AV39Formulaciontinte_tsolidewwds_1_filterfulltext = "" ;
      AV42Formulaciontinte_tsolidewwds_4_tfdscsol = "" ;
      AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel = "" ;
      scmdbuf = "" ;
      lV39Formulaciontinte_tsolidewwds_1_filterfulltext = "" ;
      lV42Formulaciontinte_tsolidewwds_4_tfdscsol = "" ;
      P08HT2_A3317DscSol = new String[] {""} ;
      P08HT2_n3317DscSol = new boolean[] {false} ;
      P08HT2_A3316CodSol = new short[1] ;
      P08HT2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tsolidewwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08HT2_A3317DscSol, P08HT2_n3317DscSol, P08HT2_A3316CodSol, P08HT2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFCodSol ;
   private short AV11TFCodSol_To ;
   private short AV40Formulaciontinte_tsolidewwds_2_tfcodsol ;
   private short AV41Formulaciontinte_tsolidewwds_3_tfcodsol_to ;
   private short A3316CodSol ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV26count ;
   private String AV12TFDscSol ;
   private String AV13TFDscSol_Sel ;
   private String A3317DscSol ;
   private String AV42Formulaciontinte_tsolidewwds_4_tfdscsol ;
   private String AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel ;
   private String scmdbuf ;
   private String lV42Formulaciontinte_tsolidewwds_4_tfdscsol ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8HT2 ;
   private boolean n3317DscSol ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Formulaciontinte_tsolidewwds_1_filterfulltext ;
   private String lV39Formulaciontinte_tsolidewwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08HT2_A3317DscSol ;
   private boolean[] P08HT2_n3317DscSol ;
   private short[] P08HT2_A3316CodSol ;
   private String[] P08HT2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tsolidewwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08HT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Formulaciontinte_tsolidewwds_1_filterfulltext ,
                                          short AV40Formulaciontinte_tsolidewwds_2_tfcodsol ,
                                          short AV41Formulaciontinte_tsolidewwds_3_tfcodsol_to ,
                                          String AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel ,
                                          String AV42Formulaciontinte_tsolidewwds_4_tfdscsol ,
                                          short A3316CodSol ,
                                          String A3317DscSol )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DscSol, CodSol, EmprCod FROM TXPSOLIDE" ;
      if ( ! (GXutil.strcmp("", AV39Formulaciontinte_tsolidewwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CodSol,'990'), 2) like '%' || ?) or ( UPPER(DscSol) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV40Formulaciontinte_tsolidewwds_2_tfcodsol) )
      {
         addWhere(sWhereString, "(CodSol >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV41Formulaciontinte_tsolidewwds_3_tfcodsol_to) )
      {
         addWhere(sWhereString, "(CodSol <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel)==0) && ( ! (GXutil.strcmp("", AV42Formulaciontinte_tsolidewwds_4_tfdscsol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DscSol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Formulaciontinte_tsolidewwds_5_tfdscsol_sel)==0) )
      {
         addWhere(sWhereString, "(DscSol = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DscSol" ;
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
                  return conditional_P08HT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08HT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

