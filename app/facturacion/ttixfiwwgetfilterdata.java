package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttixfiwwgetfilterdata extends GXProcedure
{
   public ttixfiwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttixfiwwgetfilterdata.class ), "" );
   }

   public ttixfiwwgetfilterdata( int remoteHandle ,
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
      ttixfiwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttixfiwwgetfilterdata.this.AV26DDOName = aP0;
      ttixfiwwgetfilterdata.this.AV27SearchTxt = aP1;
      ttixfiwwgetfilterdata.this.AV28SearchTxtTo = aP2;
      ttixfiwwgetfilterdata.this.aP3 = aP3;
      ttixfiwwgetfilterdata.this.aP4 = aP4;
      ttixfiwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_GRDTIPDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADGRDTIPDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("Facturacion.TTIxFIWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TTIxFIWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("Facturacion.TTIxFIWWGridState"), null, null);
      }
      AV34GXV1 = 1 ;
      while ( AV34GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV34GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRDTIPART") == 0 )
         {
            AV10TFGrdTipArt = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFGrdTipArt_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRDTIPDSC") == 0 )
         {
            AV12TFGrdTipDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRDTIPDSC_SEL") == 0 )
         {
            AV13TFGrdTipDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV34GXV1 = (int)(AV34GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADGRDTIPDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFGrdTipDsc = AV27SearchTxt ;
      AV13TFGrdTipDsc_Sel = "" ;
      AV36Facturacion_ttixfiwwds_1_tfgrdtipart = AV10TFGrdTipArt ;
      AV37Facturacion_ttixfiwwds_2_tfgrdtipart_to = AV11TFGrdTipArt_To ;
      AV38Facturacion_ttixfiwwds_3_tfgrdtipdsc = AV12TFGrdTipDsc ;
      AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel = AV13TFGrdTipDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV36Facturacion_ttixfiwwds_1_tfgrdtipart) ,
                                           Short.valueOf(AV37Facturacion_ttixfiwwds_2_tfgrdtipart_to) ,
                                           AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel ,
                                           AV38Facturacion_ttixfiwwds_3_tfgrdtipdsc ,
                                           Short.valueOf(A4364GrdTipArt) ,
                                           A4368GrdTipDsc } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING
                                           }
      });
      lV38Facturacion_ttixfiwwds_3_tfgrdtipdsc = GXutil.padr( GXutil.rtrim( AV38Facturacion_ttixfiwwds_3_tfgrdtipdsc), 30, "%") ;
      /* Using cursor P0A502 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV36Facturacion_ttixfiwwds_1_tfgrdtipart), Short.valueOf(AV37Facturacion_ttixfiwwds_2_tfgrdtipart_to), lV38Facturacion_ttixfiwwds_3_tfgrdtipdsc, AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA502 = false ;
         A4368GrdTipDsc = P0A502_A4368GrdTipDsc[0] ;
         A4364GrdTipArt = P0A502_A4364GrdTipArt[0] ;
         A396EmprCod = P0A502_A396EmprCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A502_A4368GrdTipDsc[0], A4368GrdTipDsc) == 0 ) )
         {
            brkA502 = false ;
            A4364GrdTipArt = P0A502_A4364GrdTipArt[0] ;
            A396EmprCod = P0A502_A396EmprCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA502 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4368GrdTipDsc)==0) )
         {
            AV15Option = A4368GrdTipDsc ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA502 )
         {
            brkA502 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttixfiwwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = ttixfiwwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = ttixfiwwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFGrdTipDsc = "" ;
      AV13TFGrdTipDsc_Sel = "" ;
      A4368GrdTipDsc = "" ;
      AV38Facturacion_ttixfiwwds_3_tfgrdtipdsc = "" ;
      AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel = "" ;
      scmdbuf = "" ;
      lV38Facturacion_ttixfiwwds_3_tfgrdtipdsc = "" ;
      P0A502_A4368GrdTipDsc = new String[] {""} ;
      P0A502_A4364GrdTipArt = new short[1] ;
      P0A502_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.ttixfiwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A502_A4368GrdTipDsc, P0A502_A4364GrdTipArt, P0A502_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFGrdTipArt ;
   private short AV11TFGrdTipArt_To ;
   private short AV36Facturacion_ttixfiwwds_1_tfgrdtipart ;
   private short AV37Facturacion_ttixfiwwds_2_tfgrdtipart_to ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private int AV34GXV1 ;
   private long AV20count ;
   private String AV12TFGrdTipDsc ;
   private String AV13TFGrdTipDsc_Sel ;
   private String A4368GrdTipDsc ;
   private String AV38Facturacion_ttixfiwwds_3_tfgrdtipdsc ;
   private String AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel ;
   private String scmdbuf ;
   private String lV38Facturacion_ttixfiwwds_3_tfgrdtipdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA502 ;
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
   private String[] P0A502_A4368GrdTipDsc ;
   private short[] P0A502_A4364GrdTipArt ;
   private String[] P0A502_A396EmprCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class ttixfiwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A502( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV36Facturacion_ttixfiwwds_1_tfgrdtipart ,
                                          short AV37Facturacion_ttixfiwwds_2_tfgrdtipart_to ,
                                          String AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel ,
                                          String AV38Facturacion_ttixfiwwds_3_tfgrdtipdsc ,
                                          short A4364GrdTipArt ,
                                          String A4368GrdTipDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[4];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT GrdTipDsc, GrdTipArt, EmprCod FROM TXPGRDTIP" ;
      if ( ! (0==AV36Facturacion_ttixfiwwds_1_tfgrdtipart) )
      {
         addWhere(sWhereString, "(GrdTipArt >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV37Facturacion_ttixfiwwds_2_tfgrdtipart_to) )
      {
         addWhere(sWhereString, "(GrdTipArt <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel)==0) && ( ! (GXutil.strcmp("", AV38Facturacion_ttixfiwwds_3_tfgrdtipdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(GrdTipDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Facturacion_ttixfiwwds_4_tfgrdtipdsc_sel)==0) )
      {
         addWhere(sWhereString, "(GrdTipDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY GrdTipDsc" ;
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
                  return conditional_P0A502(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A502", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setShort(sIdx, ((Number) parms[4]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[5]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 30);
               }
               return;
      }
   }

}

