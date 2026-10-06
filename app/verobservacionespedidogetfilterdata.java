package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class verobservacionespedidogetfilterdata extends GXProcedure
{
   public verobservacionespedidogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( verobservacionespedidogetfilterdata.class ), "" );
   }

   public verobservacionespedidogetfilterdata( int remoteHandle ,
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
      verobservacionespedidogetfilterdata.this.aP5 = new String[] {""};
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
      verobservacionespedidogetfilterdata.this.AV26DDOName = aP0;
      verobservacionespedidogetfilterdata.this.AV27SearchTxt = aP1;
      verobservacionespedidogetfilterdata.this.AV28SearchTxtTo = aP2;
      verobservacionespedidogetfilterdata.this.aP3 = aP3;
      verobservacionespedidogetfilterdata.this.aP4 = aP4;
      verobservacionespedidogetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV21Session.getValue("VerObservacionesPedidoGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "VerObservacionesPedidoGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("VerObservacionesPedidoGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISOBSLIN") == 0 )
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
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISOBSTXTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDisObsTxt = AV27SearchTxt ;
      AV13TFDisObsTxt_Sel = "" ;
      AV39Verobservacionespedidods_1_filterfulltext = AV32FilterFullText ;
      AV40Verobservacionespedidods_2_tfdisobslin = AV10TFDisObsLin ;
      AV41Verobservacionespedidods_3_tfdisobslin_to = AV11TFDisObsLin_To ;
      AV42Verobservacionespedidods_4_tfdisobstxt = AV12TFDisObsTxt ;
      AV43Verobservacionespedidods_5_tfdisobstxt_sel = AV13TFDisObsTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Verobservacionespedidods_1_filterfulltext ,
                                           Byte.valueOf(AV40Verobservacionespedidods_2_tfdisobslin) ,
                                           Byte.valueOf(AV41Verobservacionespedidods_3_tfdisobslin_to) ,
                                           AV43Verobservacionespedidods_5_tfdisobstxt_sel ,
                                           AV42Verobservacionespedidods_4_tfdisobstxt ,
                                           Byte.valueOf(A376DisObsLin) ,
                                           A377DisObsTxt ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(AV34Discod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT
                                           }
      });
      lV39Verobservacionespedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Verobservacionespedidods_1_filterfulltext), "%", "") ;
      lV39Verobservacionespedidods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Verobservacionespedidods_1_filterfulltext), "%", "") ;
      lV42Verobservacionespedidods_4_tfdisobstxt = GXutil.padr( GXutil.rtrim( AV42Verobservacionespedidods_4_tfdisobstxt), 60, "%") ;
      /* Using cursor P0ADI2 */
      pr_default.execute(0, new Object[] {AV33Emprcod, Integer.valueOf(AV34Discod), lV39Verobservacionespedidods_1_filterfulltext, lV39Verobservacionespedidods_1_filterfulltext, Byte.valueOf(AV40Verobservacionespedidods_2_tfdisobslin), Byte.valueOf(AV41Verobservacionespedidods_3_tfdisobslin_to), lV42Verobservacionespedidods_4_tfdisobstxt, AV43Verobservacionespedidods_5_tfdisobstxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkADI2 = false ;
         A396EmprCod = P0ADI2_A396EmprCod[0] ;
         A361DisCod = P0ADI2_A361DisCod[0] ;
         A377DisObsTxt = P0ADI2_A377DisObsTxt[0] ;
         A376DisObsLin = P0ADI2_A376DisObsLin[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ADI2_A377DisObsTxt[0], A377DisObsTxt) == 0 ) )
         {
            brkADI2 = false ;
            A396EmprCod = P0ADI2_A396EmprCod[0] ;
            A361DisCod = P0ADI2_A361DisCod[0] ;
            A376DisObsLin = P0ADI2_A376DisObsLin[0] ;
            AV20count = (long)(AV20count+1) ;
            brkADI2 = true ;
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
         if ( ! brkADI2 )
         {
            brkADI2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = verobservacionespedidogetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = verobservacionespedidogetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = verobservacionespedidogetfilterdata.this.AV31OptionIndexesJson;
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
      AV32FilterFullText = "" ;
      AV12TFDisObsTxt = "" ;
      AV13TFDisObsTxt_Sel = "" ;
      A377DisObsTxt = "" ;
      AV39Verobservacionespedidods_1_filterfulltext = "" ;
      AV42Verobservacionespedidods_4_tfdisobstxt = "" ;
      AV43Verobservacionespedidods_5_tfdisobstxt_sel = "" ;
      scmdbuf = "" ;
      lV39Verobservacionespedidods_1_filterfulltext = "" ;
      lV42Verobservacionespedidods_4_tfdisobstxt = "" ;
      A396EmprCod = "" ;
      AV33Emprcod = "" ;
      P0ADI2_A396EmprCod = new String[] {""} ;
      P0ADI2_A361DisCod = new int[1] ;
      P0ADI2_A377DisObsTxt = new String[] {""} ;
      P0ADI2_A376DisObsLin = new byte[1] ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.verobservacionespedidogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ADI2_A396EmprCod, P0ADI2_A361DisCod, P0ADI2_A377DisObsTxt, P0ADI2_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFDisObsLin ;
   private byte AV11TFDisObsLin_To ;
   private byte AV40Verobservacionespedidods_2_tfdisobslin ;
   private byte AV41Verobservacionespedidods_3_tfdisobslin_to ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private int A361DisCod ;
   private int AV34Discod ;
   private long AV20count ;
   private String AV12TFDisObsTxt ;
   private String AV13TFDisObsTxt_Sel ;
   private String A377DisObsTxt ;
   private String AV42Verobservacionespedidods_4_tfdisobstxt ;
   private String AV43Verobservacionespedidods_5_tfdisobstxt_sel ;
   private String scmdbuf ;
   private String lV42Verobservacionespedidods_4_tfdisobstxt ;
   private String A396EmprCod ;
   private String AV33Emprcod ;
   private boolean returnInSub ;
   private boolean brkADI2 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV39Verobservacionespedidods_1_filterfulltext ;
   private String lV39Verobservacionespedidods_1_filterfulltext ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADI2_A396EmprCod ;
   private int[] P0ADI2_A361DisCod ;
   private String[] P0ADI2_A377DisObsTxt ;
   private byte[] P0ADI2_A376DisObsLin ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class verobservacionespedidogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ADI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Verobservacionespedidods_1_filterfulltext ,
                                          byte AV40Verobservacionespedidods_2_tfdisobslin ,
                                          byte AV41Verobservacionespedidods_3_tfdisobslin_to ,
                                          String AV43Verobservacionespedidods_5_tfdisobstxt_sel ,
                                          String AV42Verobservacionespedidods_4_tfdisobstxt ,
                                          byte A376DisObsLin ,
                                          String A377DisObsTxt ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          int A361DisCod ,
                                          int AV34Discod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(DisCod = ?)");
      if ( ! (GXutil.strcmp("", AV39Verobservacionespedidods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(DisObsLin,'90'), 2) like '%' || ?) or ( UPPER(DisObsTxt) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV40Verobservacionespedidods_2_tfdisobslin) )
      {
         addWhere(sWhereString, "(DisObsLin >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV41Verobservacionespedidods_3_tfdisobslin_to) )
      {
         addWhere(sWhereString, "(DisObsLin <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Verobservacionespedidods_5_tfdisobstxt_sel)==0) && ( ! (GXutil.strcmp("", AV42Verobservacionespedidods_4_tfdisobstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DisObsTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Verobservacionespedidods_5_tfdisobstxt_sel)==0) )
      {
         addWhere(sWhereString, "(DisObsTxt = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
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
                  return conditional_P0ADI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 60);
               }
               return;
      }
   }

}

