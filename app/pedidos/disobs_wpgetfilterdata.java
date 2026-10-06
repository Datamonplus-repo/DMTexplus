package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disobs_wpgetfilterdata extends GXProcedure
{
   public disobs_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disobs_wpgetfilterdata.class ), "" );
   }

   public disobs_wpgetfilterdata( int remoteHandle ,
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
      disobs_wpgetfilterdata.this.aP5 = new String[] {""};
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
      disobs_wpgetfilterdata.this.AV26DDOName = aP0;
      disobs_wpgetfilterdata.this.AV27SearchTxt = aP1;
      disobs_wpgetfilterdata.this.AV28SearchTxtTo = aP2;
      disobs_wpgetfilterdata.this.aP3 = aP3;
      disobs_wpgetfilterdata.this.aP4 = aP4;
      disobs_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV21Session.getValue("Pedidos.DisObs_WPGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.DisObs_WPGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("Pedidos.DisObs_WPGridState"), null, null);
      }
      AV36GXV1 = 1 ;
      while ( AV36GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV36GXV1));
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
         AV36GXV1 = (int)(AV36GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDISOBSTXTOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDisObsTxt = AV27SearchTxt ;
      AV13TFDisObsTxt_Sel = "" ;
      AV38Pedidos_disobs_wpds_1_tfdisobslin = AV10TFDisObsLin ;
      AV39Pedidos_disobs_wpds_2_tfdisobslin_to = AV11TFDisObsLin_To ;
      AV40Pedidos_disobs_wpds_3_tfdisobstxt = AV12TFDisObsTxt ;
      AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel = AV13TFDisObsTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV38Pedidos_disobs_wpds_1_tfdisobslin) ,
                                           Byte.valueOf(AV39Pedidos_disobs_wpds_2_tfdisobslin_to) ,
                                           AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel ,
                                           AV40Pedidos_disobs_wpds_3_tfdisobstxt ,
                                           Byte.valueOf(A376DisObsLin) ,
                                           A377DisObsTxt ,
                                           A396EmprCod ,
                                           AV32EmprCod ,
                                           Integer.valueOf(A361DisCod) ,
                                           Integer.valueOf(AV33DisCod) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV40Pedidos_disobs_wpds_3_tfdisobstxt = GXutil.padr( GXutil.rtrim( AV40Pedidos_disobs_wpds_3_tfdisobstxt), 60, "%") ;
      /* Using cursor P0A882 */
      pr_default.execute(0, new Object[] {AV32EmprCod, Integer.valueOf(AV33DisCod), Byte.valueOf(AV38Pedidos_disobs_wpds_1_tfdisobslin), Byte.valueOf(AV39Pedidos_disobs_wpds_2_tfdisobslin_to), lV40Pedidos_disobs_wpds_3_tfdisobstxt, AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA882 = false ;
         A396EmprCod = P0A882_A396EmprCod[0] ;
         A361DisCod = P0A882_A361DisCod[0] ;
         A377DisObsTxt = P0A882_A377DisObsTxt[0] ;
         A376DisObsLin = P0A882_A376DisObsLin[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A882_A377DisObsTxt[0], A377DisObsTxt) == 0 ) )
         {
            brkA882 = false ;
            A396EmprCod = P0A882_A396EmprCod[0] ;
            A361DisCod = P0A882_A361DisCod[0] ;
            A376DisObsLin = P0A882_A376DisObsLin[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA882 = true ;
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
         if ( ! brkA882 )
         {
            brkA882 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = disobs_wpgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = disobs_wpgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = disobs_wpgetfilterdata.this.AV31OptionIndexesJson;
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
      A377DisObsTxt = "" ;
      AV40Pedidos_disobs_wpds_3_tfdisobstxt = "" ;
      AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel = "" ;
      scmdbuf = "" ;
      lV40Pedidos_disobs_wpds_3_tfdisobstxt = "" ;
      A396EmprCod = "" ;
      AV32EmprCod = "" ;
      P0A882_A396EmprCod = new String[] {""} ;
      P0A882_A361DisCod = new int[1] ;
      P0A882_A377DisObsTxt = new String[] {""} ;
      P0A882_A376DisObsLin = new byte[1] ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A882_A396EmprCod, P0A882_A361DisCod, P0A882_A377DisObsTxt, P0A882_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFDisObsLin ;
   private byte AV11TFDisObsLin_To ;
   private byte AV38Pedidos_disobs_wpds_1_tfdisobslin ;
   private byte AV39Pedidos_disobs_wpds_2_tfdisobslin_to ;
   private byte A376DisObsLin ;
   private short Gx_err ;
   private int AV36GXV1 ;
   private int A361DisCod ;
   private int AV33DisCod ;
   private long AV20count ;
   private String AV12TFDisObsTxt ;
   private String AV13TFDisObsTxt_Sel ;
   private String A377DisObsTxt ;
   private String AV40Pedidos_disobs_wpds_3_tfdisobstxt ;
   private String AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel ;
   private String scmdbuf ;
   private String lV40Pedidos_disobs_wpds_3_tfdisobstxt ;
   private String A396EmprCod ;
   private String AV32EmprCod ;
   private boolean returnInSub ;
   private boolean brkA882 ;
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
   private String[] P0A882_A396EmprCod ;
   private int[] P0A882_A361DisCod ;
   private String[] P0A882_A377DisObsTxt ;
   private byte[] P0A882_A376DisObsLin ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class disobs_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A882( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV38Pedidos_disobs_wpds_1_tfdisobslin ,
                                          byte AV39Pedidos_disobs_wpds_2_tfdisobslin_to ,
                                          String AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel ,
                                          String AV40Pedidos_disobs_wpds_3_tfdisobstxt ,
                                          byte A376DisObsLin ,
                                          String A377DisObsTxt ,
                                          String A396EmprCod ,
                                          String AV32EmprCod ,
                                          int A361DisCod ,
                                          int AV33DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(DisCod = ?)");
      if ( ! (0==AV38Pedidos_disobs_wpds_1_tfdisobslin) )
      {
         addWhere(sWhereString, "(DisObsLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Pedidos_disobs_wpds_2_tfdisobslin_to) )
      {
         addWhere(sWhereString, "(DisObsLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel)==0) && ( ! (GXutil.strcmp("", AV40Pedidos_disobs_wpds_3_tfdisobstxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DisObsTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Pedidos_disobs_wpds_4_tfdisobstxt_sel)==0) )
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
                  return conditional_P0A882(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A882", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

