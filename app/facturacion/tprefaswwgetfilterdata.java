package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprefaswwgetfilterdata extends GXProcedure
{
   public tprefaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprefaswwgetfilterdata.class ), "" );
   }

   public tprefaswwgetfilterdata( int remoteHandle ,
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
      tprefaswwgetfilterdata.this.aP5 = new String[] {""};
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
      tprefaswwgetfilterdata.this.AV26DDOName = aP0;
      tprefaswwgetfilterdata.this.AV27SearchTxt = aP1;
      tprefaswwgetfilterdata.this.AV28SearchTxtTo = aP2;
      tprefaswwgetfilterdata.this.aP3 = aP3;
      tprefaswwgetfilterdata.this.aP4 = aP4;
      tprefaswwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("Facturacion.TPREFASWWGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.TPREFASWWGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("Facturacion.TPREFASWWGridState"), null, null);
      }
      AV36GXV1 = 1 ;
      while ( AV36GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV36GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIACT_SEL") == 0 )
         {
            AV33TFCliAct_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV36GXV1 = (int)(AV36GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV27SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV38Facturacion_tprefaswwds_1_tfclicod = AV10TFCliCod ;
      AV39Facturacion_tprefaswwds_2_tfclicod_to = AV11TFCliCod_To ;
      AV40Facturacion_tprefaswwds_3_tfclinom = AV12TFCliNom ;
      AV41Facturacion_tprefaswwds_4_tfclinom_sel = AV13TFCliNom_Sel ;
      AV42Facturacion_tprefaswwds_5_tfcliact_sel = AV33TFCliAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV38Facturacion_tprefaswwds_1_tfclicod) ,
                                           Integer.valueOf(AV39Facturacion_tprefaswwds_2_tfclicod_to) ,
                                           AV41Facturacion_tprefaswwds_4_tfclinom_sel ,
                                           AV40Facturacion_tprefaswwds_3_tfclinom ,
                                           AV42Facturacion_tprefaswwds_5_tfcliact_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV40Facturacion_tprefaswwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV40Facturacion_tprefaswwds_3_tfclinom), 30, "%") ;
      /* Using cursor P0A2E2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV38Facturacion_tprefaswwds_1_tfclicod), Integer.valueOf(AV39Facturacion_tprefaswwds_2_tfclicod_to), lV40Facturacion_tprefaswwds_3_tfclinom, AV41Facturacion_tprefaswwds_4_tfclinom_sel, AV42Facturacion_tprefaswwds_5_tfcliact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA2E2 = false ;
         A279CliNom = P0A2E2_A279CliNom[0] ;
         A10045CliAct = P0A2E2_A10045CliAct[0] ;
         A252CliCod = P0A2E2_A252CliCod[0] ;
         A396EmprCod = P0A2E2_A396EmprCod[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A2E2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkA2E2 = false ;
            A252CliCod = P0A2E2_A252CliCod[0] ;
            A396EmprCod = P0A2E2_A396EmprCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkA2E2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV15Option = A279CliNom ;
            AV16Options.add(AV15Option, 0);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA2E2 )
         {
            brkA2E2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tprefaswwgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = tprefaswwgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = tprefaswwgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV33TFCliAct_Sel = "" ;
      A279CliNom = "" ;
      AV40Facturacion_tprefaswwds_3_tfclinom = "" ;
      AV41Facturacion_tprefaswwds_4_tfclinom_sel = "" ;
      AV42Facturacion_tprefaswwds_5_tfcliact_sel = "" ;
      scmdbuf = "" ;
      lV40Facturacion_tprefaswwds_3_tfclinom = "" ;
      A10045CliAct = "" ;
      P0A2E2_A279CliNom = new String[] {""} ;
      P0A2E2_A10045CliAct = new String[] {""} ;
      P0A2E2_A252CliCod = new int[1] ;
      P0A2E2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tprefaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A2E2_A279CliNom, P0A2E2_A10045CliAct, P0A2E2_A252CliCod, P0A2E2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV36GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV38Facturacion_tprefaswwds_1_tfclicod ;
   private int AV39Facturacion_tprefaswwds_2_tfclicod_to ;
   private int A252CliCod ;
   private long AV20count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV33TFCliAct_Sel ;
   private String A279CliNom ;
   private String AV40Facturacion_tprefaswwds_3_tfclinom ;
   private String AV41Facturacion_tprefaswwds_4_tfclinom_sel ;
   private String AV42Facturacion_tprefaswwds_5_tfcliact_sel ;
   private String scmdbuf ;
   private String lV40Facturacion_tprefaswwds_3_tfclinom ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA2E2 ;
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
   private String[] P0A2E2_A279CliNom ;
   private String[] P0A2E2_A10045CliAct ;
   private int[] P0A2E2_A252CliCod ;
   private String[] P0A2E2_A396EmprCod ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class tprefaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A2E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV38Facturacion_tprefaswwds_1_tfclicod ,
                                          int AV39Facturacion_tprefaswwds_2_tfclicod_to ,
                                          String AV41Facturacion_tprefaswwds_4_tfclinom_sel ,
                                          String AV40Facturacion_tprefaswwds_3_tfclinom ,
                                          String AV42Facturacion_tprefaswwds_5_tfcliact_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[5];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CliNom, CliAct, CliCod, EmprCod FROM TXPCLIENT" ;
      addWhere(sWhereString, "(CliAct = 'S')");
      if ( ! (0==AV38Facturacion_tprefaswwds_1_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV39Facturacion_tprefaswwds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Facturacion_tprefaswwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV40Facturacion_tprefaswwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Facturacion_tprefaswwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(CliNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Facturacion_tprefaswwds_5_tfcliact_sel)==0) )
      {
         addWhere(sWhereString, "(CliAct = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CliNom" ;
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
                  return conditional_P0A2E2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               return;
      }
   }

}

