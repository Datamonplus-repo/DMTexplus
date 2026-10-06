package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tgrdtip_wpgetfilterdata extends GXProcedure
{
   public tgrdtip_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgrdtip_wpgetfilterdata.class ), "" );
   }

   public tgrdtip_wpgetfilterdata( int remoteHandle ,
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
      tgrdtip_wpgetfilterdata.this.aP5 = new String[] {""};
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
      tgrdtip_wpgetfilterdata.this.AV26DDOName = aP0;
      tgrdtip_wpgetfilterdata.this.AV27SearchTxt = aP1;
      tgrdtip_wpgetfilterdata.this.AV28SearchTxtTo = aP2;
      tgrdtip_wpgetfilterdata.this.aP3 = aP3;
      tgrdtip_wpgetfilterdata.this.aP4 = aP4;
      tgrdtip_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_TIPARTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADTIPARTDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("FicherosBasicos.Tgrdtip_WPGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.Tgrdtip_WPGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("FicherosBasicos.Tgrdtip_WPGridState"), null, null);
      }
      AV36GXV1 = 1 ;
      while ( AV36GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV36GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTCOD") == 0 )
         {
            AV10TFTipArtCod = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTipArtCod_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC") == 0 )
         {
            AV12TFTipArtDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTDSC_SEL") == 0 )
         {
            AV13TFTipArtDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV36GXV1 = (int)(AV36GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTIPARTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTipArtDsc = AV27SearchTxt ;
      AV13TFTipArtDsc_Sel = "" ;
      AV38Ficherosbasicos_tgrdtip_wpds_1_tftipartcod = AV10TFTipArtCod ;
      AV39Ficherosbasicos_tgrdtip_wpds_2_tftipartcod_to = AV11TFTipArtCod_To ;
      AV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc = AV12TFTipArtDsc ;
      AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel = AV13TFTipArtDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV38Ficherosbasicos_tgrdtip_wpds_1_tftipartcod) ,
                                           Short.valueOf(AV39Ficherosbasicos_tgrdtip_wpds_2_tftipartcod_to) ,
                                           AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel ,
                                           AV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc ,
                                           Short.valueOf(A829TipArtCod) ,
                                           A830TipArtDsc ,
                                           Short.valueOf(A4364GrdTipArt) ,
                                           Short.valueOf(AV33GrdTipArt) ,
                                           AV32emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc = GXutil.padr( GXutil.rtrim( AV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc), 30, "%") ;
      /* Using cursor P0AM42 */
      pr_default.execute(0, new Object[] {AV32emprcod, Short.valueOf(AV33GrdTipArt), Short.valueOf(AV38Ficherosbasicos_tgrdtip_wpds_1_tftipartcod), Short.valueOf(AV39Ficherosbasicos_tgrdtip_wpds_2_tftipartcod_to), lV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc, AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAM42 = false ;
         A829TipArtCod = P0AM42_A829TipArtCod[0] ;
         A396EmprCod = P0AM42_A396EmprCod[0] ;
         A4364GrdTipArt = P0AM42_A4364GrdTipArt[0] ;
         A830TipArtDsc = P0AM42_A830TipArtDsc[0] ;
         n830TipArtDsc = P0AM42_n830TipArtDsc[0] ;
         A830TipArtDsc = P0AM42_A830TipArtDsc[0] ;
         n830TipArtDsc = P0AM42_n830TipArtDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AM42_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AM42_A829TipArtCod[0] == A829TipArtCod ) )
         {
            brkAM42 = false ;
            A4364GrdTipArt = P0AM42_A4364GrdTipArt[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAM42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A830TipArtDsc)==0) )
         {
            AV15Option = A830TipArtDsc ;
            AV14InsertIndex = 1 ;
            while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
            {
               AV14InsertIndex = (int)(AV14InsertIndex+1) ;
            }
            AV16Options.add(AV15Option, AV14InsertIndex);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAM42 )
         {
            brkAM42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tgrdtip_wpgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = tgrdtip_wpgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = tgrdtip_wpgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFTipArtDsc = "" ;
      AV13TFTipArtDsc_Sel = "" ;
      A830TipArtDsc = "" ;
      AV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc = "" ;
      AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel = "" ;
      scmdbuf = "" ;
      lV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc = "" ;
      AV32emprcod = "" ;
      A396EmprCod = "" ;
      P0AM42_A829TipArtCod = new short[1] ;
      P0AM42_A396EmprCod = new String[] {""} ;
      P0AM42_A4364GrdTipArt = new short[1] ;
      P0AM42_A830TipArtDsc = new String[] {""} ;
      P0AM42_n830TipArtDsc = new boolean[] {false} ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tgrdtip_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AM42_A829TipArtCod, P0AM42_A396EmprCod, P0AM42_A4364GrdTipArt, P0AM42_A830TipArtDsc, P0AM42_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTipArtCod ;
   private short AV11TFTipArtCod_To ;
   private short AV38Ficherosbasicos_tgrdtip_wpds_1_tftipartcod ;
   private short AV39Ficherosbasicos_tgrdtip_wpds_2_tftipartcod_to ;
   private short A829TipArtCod ;
   private short A4364GrdTipArt ;
   private short AV33GrdTipArt ;
   private short Gx_err ;
   private int AV36GXV1 ;
   private int AV14InsertIndex ;
   private long AV20count ;
   private String AV12TFTipArtDsc ;
   private String AV13TFTipArtDsc_Sel ;
   private String A830TipArtDsc ;
   private String AV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc ;
   private String AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel ;
   private String scmdbuf ;
   private String lV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc ;
   private String AV32emprcod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAM42 ;
   private boolean n830TipArtDsc ;
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
   private short[] P0AM42_A829TipArtCod ;
   private String[] P0AM42_A396EmprCod ;
   private short[] P0AM42_A4364GrdTipArt ;
   private String[] P0AM42_A830TipArtDsc ;
   private boolean[] P0AM42_n830TipArtDsc ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class tgrdtip_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AM42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV38Ficherosbasicos_tgrdtip_wpds_1_tftipartcod ,
                                          short AV39Ficherosbasicos_tgrdtip_wpds_2_tftipartcod_to ,
                                          String AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel ,
                                          String AV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc ,
                                          short A829TipArtCod ,
                                          String A830TipArtDsc ,
                                          short A4364GrdTipArt ,
                                          short AV33GrdTipArt ,
                                          String AV32emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.TipArtCod, T1.EmprCod, T1.GrdTipArt, T2.TipArtDsc FROM (TXPGRDTI1 T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.GrdTipArt = ?)");
      if ( ! (0==AV38Ficherosbasicos_tgrdtip_wpds_1_tftipartcod) )
      {
         addWhere(sWhereString, "(T1.TipArtCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Ficherosbasicos_tgrdtip_wpds_2_tftipartcod_to) )
      {
         addWhere(sWhereString, "(T1.TipArtCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Ficherosbasicos_tgrdtip_wpds_3_tftipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Ficherosbasicos_tgrdtip_wpds_4_tftipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.TipArtCod" ;
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
                  return conditional_P0AM42(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AM42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
                  stmt.setShort(sIdx, ((Number) parms[7]).shortValue());
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

