package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwhojarutaobsgetfilterdata extends GXProcedure
{
   public wwhojarutaobsgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwhojarutaobsgetfilterdata.class ), "" );
   }

   public wwhojarutaobsgetfilterdata( int remoteHandle ,
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
      wwhojarutaobsgetfilterdata.this.aP5 = new String[] {""};
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
      wwhojarutaobsgetfilterdata.this.AV26DDOName = aP0;
      wwhojarutaobsgetfilterdata.this.AV27SearchTxt = aP1;
      wwhojarutaobsgetfilterdata.this.AV28SearchTxtTo = aP2;
      wwhojarutaobsgetfilterdata.this.aP3 = aP3;
      wwhojarutaobsgetfilterdata.this.aP4 = aP4;
      wwhojarutaobsgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_DISOBSTXT") == 0 )
      {
         /* Execute user subroutine: 'LOADDISOBSTXTOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("FormulacionTinte.WWHojaRutaObsGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WWHojaRutaObsGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FormulacionTinte.WWHojaRutaObsGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISOBSLIN") == 0 )
         {
            AV10TFDisObsLin = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFDisObsLin_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISOBSTXT") == 0 )
         {
            AV12TFDisObsTxt = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISOBSTXT_SEL") == 0 )
         {
            AV13TFDisObsTxt_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODE") == 0 )
         {
            Gx_mode = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISCOD") == 0 )
         {
            AV32DisCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARPRI") == 0 )
         {
            AV33BarPri = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV34CliCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV35CliNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV36BarSer = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV37BarSerDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV38BarFecGen = localUtil.ctod( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISOBSTXTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDisObsTxt = AV27SearchTxt ;
      AV13TFDisObsTxt_Sel = "" ;
      AV46Formulaciontinte_wwhojarutaobsds_1_tfdisobslin = AV10TFDisObsLin ;
      AV47Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to = AV11TFDisObsLin_To ;
      AV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = AV12TFDisObsTxt ;
      AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = AV13TFDisObsTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV46Formulaciontinte_wwhojarutaobsds_1_tfdisobslin) ,
                                           Byte.valueOf(AV47Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to) ,
                                           AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ,
                                           AV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ,
                                           Byte.valueOf(A376DisObsLin) ,
                                           A377DisObsTxt ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(AV32DisCod) ,
                                           A396EmprCod ,
                                           AV39EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt), 60, "%") ;
      /* Using cursor P0ADF2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV32DisCod), AV39EmprCod, Byte.valueOf(AV46Formulaciontinte_wwhojarutaobsds_1_tfdisobslin), Byte.valueOf(AV47Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to), lV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt, AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkADF2 = false ;
         A361DisCod = P0ADF2_A361DisCod[0] ;
         A396EmprCod = P0ADF2_A396EmprCod[0] ;
         A377DisObsTxt = P0ADF2_A377DisObsTxt[0] ;
         A376DisObsLin = P0ADF2_A376DisObsLin[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ADF2_A377DisObsTxt[0], A377DisObsTxt) == 0 ) )
         {
            brkADF2 = false ;
            A361DisCod = P0ADF2_A361DisCod[0] ;
            A396EmprCod = P0ADF2_A396EmprCod[0] ;
            A376DisObsLin = P0ADF2_A376DisObsLin[0] ;
            AV20count = (long)(AV20count+1) ;
            brkADF2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A377DisObsTxt)==0) )
         {
            AV15Option = A377DisObsTxt ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkADF2 )
         {
            brkADF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wwhojarutaobsgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = wwhojarutaobsgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = wwhojarutaobsgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFDisObsTxt = "" ;
      AV13TFDisObsTxt_Sel = "" ;
      Gx_mode = "" ;
      AV33BarPri = "" ;
      AV35CliNom = "" ;
      AV36BarSer = "" ;
      AV37BarSerDsc = "" ;
      AV38BarFecGen = GXutil.nullDate() ;
      A377DisObsTxt = "" ;
      AV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = "" ;
      AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel = "" ;
      scmdbuf = "" ;
      lV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt = "" ;
      A396EmprCod = "" ;
      AV39EmprCod = "" ;
      P0ADF2_A361DisCod = new int[1] ;
      P0ADF2_A396EmprCod = new String[] {""} ;
      P0ADF2_A377DisObsTxt = new String[] {""} ;
      P0ADF2_A376DisObsLin = new byte[1] ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wwhojarutaobsgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADF2_A361DisCod, P0ADF2_A396EmprCod, P0ADF2_A377DisObsTxt, P0ADF2_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFDisObsLin ;
   private byte AV11TFDisObsLin_To ;
   private byte AV46Formulaciontinte_wwhojarutaobsds_1_tfdisobslin ;
   private byte AV47Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV32DisCod ;
   private int AV34CliCod ;
   private int A361DisCod ;
   private long AV20count ;
   private String AV12TFDisObsTxt ;
   private String AV13TFDisObsTxt_Sel ;
   private String Gx_mode ;
   private String AV33BarPri ;
   private String AV35CliNom ;
   private String AV36BarSer ;
   private String AV37BarSerDsc ;
   private String A377DisObsTxt ;
   private String AV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ;
   private String AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ;
   private String scmdbuf ;
   private String lV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ;
   private String A396EmprCod ;
   private String AV39EmprCod ;
   private java.util.Date AV38BarFecGen ;
   private boolean returnInSub ;
   private boolean brkADF2 ;
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
   private int[] P0ADF2_A361DisCod ;
   private String[] P0ADF2_A396EmprCod ;
   private String[] P0ADF2_A377DisObsTxt ;
   private byte[] P0ADF2_A376DisObsLin ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class wwhojarutaobsgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV46Formulaciontinte_wwhojarutaobsds_1_tfdisobslin ,
                                          byte AV47Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to ,
                                          String AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel ,
                                          String AV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt ,
                                          byte A376DisObsLin ,
                                          String A377DisObsTxt ,
                                          int A361DisCod ,
                                          int AV32DisCod ,
                                          String A396EmprCod ,
                                          String AV39EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DisCod, EmprCod, DisObsTxt, DisObsLin FROM TXPOBSERV" ;
      addWhere(sWhereString, "(DisCod = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (0==AV46Formulaciontinte_wwhojarutaobsds_1_tfdisobslin) )
      {
         addWhere(sWhereString, "(DisObsLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV47Formulaciontinte_wwhojarutaobsds_2_tfdisobslin_to) )
      {
         addWhere(sWhereString, "(DisObsLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_wwhojarutaobsds_3_tfdisobstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DisObsTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_wwhojarutaobsds_4_tfdisobstxt_sel)==0) )
      {
         addWhere(sWhereString, "(DisObsTxt = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DisObsTxt" ;
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
                  return conditional_P0ADF2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
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
                  stmt.setString(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 60);
               }
               return;
      }
   }

}

