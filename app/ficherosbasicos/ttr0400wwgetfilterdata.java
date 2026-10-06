package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttr0400wwgetfilterdata extends GXProcedure
{
   public ttr0400wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr0400wwgetfilterdata.class ), "" );
   }

   public ttr0400wwgetfilterdata( int remoteHandle ,
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
      ttr0400wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttr0400wwgetfilterdata.this.AV20DDOName = aP0;
      ttr0400wwgetfilterdata.this.AV18SearchTxt = aP1;
      ttr0400wwgetfilterdata.this.AV19SearchTxtTo = aP2;
      ttr0400wwgetfilterdata.this.aP3 = aP3;
      ttr0400wwgetfilterdata.this.aP4 = aP4;
      ttr0400wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_DSC_PAIS") == 0 )
      {
         /* Execute user subroutine: 'LOADDSC_PAISOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("FicherosBasicos.TTR0400WWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTR0400WWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("FicherosBasicos.TTR0400WWGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV50FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOD_PAIS") == 0 )
         {
            AV12TFCod_pais = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCod_pais_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_PAIS") == 0 )
         {
            AV16TFDsc_pais = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_PAIS_SEL") == 0 )
         {
            AV17TFDsc_pais_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDSC_PAISOPTIONS' Routine */
      returnInSub = false ;
      AV16TFDsc_pais = AV18SearchTxt ;
      AV17TFDsc_pais_Sel = "" ;
      AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext = AV50FilterFullText ;
      AV56Ficherosbasicos_ttr0400wwds_2_tfcod_pais = AV12TFCod_pais ;
      AV57Ficherosbasicos_ttr0400wwds_3_tfcod_pais_to = AV13TFCod_pais_To ;
      AV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais = AV16TFDsc_pais ;
      AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel = AV17TFDsc_pais_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext ,
                                           Short.valueOf(AV56Ficherosbasicos_ttr0400wwds_2_tfcod_pais) ,
                                           Short.valueOf(AV57Ficherosbasicos_ttr0400wwds_3_tfcod_pais_to) ,
                                           AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel ,
                                           AV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais ,
                                           Short.valueOf(A10301Cod_pais) ,
                                           A10302Dsc_pais } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV55Ficherosbasicos_ttr0400wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext), "%", "") ;
      lV55Ficherosbasicos_ttr0400wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext), "%", "") ;
      lV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais = GXutil.padr( GXutil.rtrim( AV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais), 40, "%") ;
      /* Using cursor P080Z2 */
      pr_default.execute(0, new Object[] {lV55Ficherosbasicos_ttr0400wwds_1_filterfulltext, lV55Ficherosbasicos_ttr0400wwds_1_filterfulltext, Short.valueOf(AV56Ficherosbasicos_ttr0400wwds_2_tfcod_pais), Short.valueOf(AV57Ficherosbasicos_ttr0400wwds_3_tfcod_pais_to), lV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais, AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk80Z2 = false ;
         A10302Dsc_pais = P080Z2_A10302Dsc_pais[0] ;
         n10302Dsc_pais = P080Z2_n10302Dsc_pais[0] ;
         A10301Cod_pais = P080Z2_A10301Cod_pais[0] ;
         A396EmprCod = P080Z2_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P080Z2_A10302Dsc_pais[0], A10302Dsc_pais) == 0 ) )
         {
            brk80Z2 = false ;
            A10301Cod_pais = P080Z2_A10301Cod_pais[0] ;
            A396EmprCod = P080Z2_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk80Z2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A10302Dsc_pais)==0) )
         {
            AV22Option = A10302Dsc_pais ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk80Z2 )
         {
            brk80Z2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttr0400wwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = ttr0400wwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = ttr0400wwgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50FilterFullText = "" ;
      AV16TFDsc_pais = "" ;
      AV17TFDsc_pais_Sel = "" ;
      A10302Dsc_pais = "" ;
      AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext = "" ;
      AV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais = "" ;
      AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel = "" ;
      scmdbuf = "" ;
      lV55Ficherosbasicos_ttr0400wwds_1_filterfulltext = "" ;
      lV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais = "" ;
      P080Z2_A10302Dsc_pais = new String[] {""} ;
      P080Z2_n10302Dsc_pais = new boolean[] {false} ;
      P080Z2_A10301Cod_pais = new short[1] ;
      P080Z2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttr0400wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P080Z2_A10302Dsc_pais, P080Z2_n10302Dsc_pais, P080Z2_A10301Cod_pais, P080Z2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12TFCod_pais ;
   private short AV13TFCod_pais_To ;
   private short AV56Ficherosbasicos_ttr0400wwds_2_tfcod_pais ;
   private short AV57Ficherosbasicos_ttr0400wwds_3_tfcod_pais_to ;
   private short A10301Cod_pais ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private long AV30count ;
   private String AV16TFDsc_pais ;
   private String AV17TFDsc_pais_Sel ;
   private String A10302Dsc_pais ;
   private String AV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais ;
   private String AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel ;
   private String scmdbuf ;
   private String lV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk80Z2 ;
   private boolean n10302Dsc_pais ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV50FilterFullText ;
   private String AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext ;
   private String lV55Ficherosbasicos_ttr0400wwds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P080Z2_A10302Dsc_pais ;
   private boolean[] P080Z2_n10302Dsc_pais ;
   private short[] P080Z2_A10301Cod_pais ;
   private String[] P080Z2_A396EmprCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class ttr0400wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext ,
                                          short AV56Ficherosbasicos_ttr0400wwds_2_tfcod_pais ,
                                          short AV57Ficherosbasicos_ttr0400wwds_3_tfcod_pais_to ,
                                          String AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel ,
                                          String AV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais ,
                                          short A10301Cod_pais ,
                                          String A10302Dsc_pais )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Dsc_pais, Cod_pais, EmprCod FROM TXPTR0400" ;
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_ttr0400wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Cod_pais,'9990'), 2) like '%' || ?) or ( UPPER(Dsc_pais) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Ficherosbasicos_ttr0400wwds_2_tfcod_pais) )
      {
         addWhere(sWhereString, "(Cod_pais >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Ficherosbasicos_ttr0400wwds_3_tfcod_pais_to) )
      {
         addWhere(sWhereString, "(Cod_pais <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel)==0) && ( ! (GXutil.strcmp("", AV58Ficherosbasicos_ttr0400wwds_4_tfdsc_pais)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Dsc_pais) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Ficherosbasicos_ttr0400wwds_5_tfdsc_pais_sel)==0) )
      {
         addWhere(sWhereString, "(Dsc_pais = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Dsc_pais" ;
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
                  return conditional_P080Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

