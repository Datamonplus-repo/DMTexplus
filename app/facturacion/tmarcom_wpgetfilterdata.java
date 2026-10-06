package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmarcom_wpgetfilterdata extends GXProcedure
{
   public tmarcom_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmarcom_wpgetfilterdata.class ), "" );
   }

   public tmarcom_wpgetfilterdata( int remoteHandle ,
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
      tmarcom_wpgetfilterdata.this.aP5 = new String[] {""};
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
      tmarcom_wpgetfilterdata.this.AV28DDOName = aP0;
      tmarcom_wpgetfilterdata.this.AV29SearchTxt = aP1;
      tmarcom_wpgetfilterdata.this.AV30SearchTxtTo = aP2;
      tmarcom_wpgetfilterdata.this.aP3 = aP3;
      tmarcom_wpgetfilterdata.this.aP4 = aP4;
      tmarcom_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_GRDTIPDSC") == 0 )
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
      AV31OptionsJson = AV18Options.toJSonString(false) ;
      AV32OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV21OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue("Facturacion.Tmarcom_WPGridState"), "") == 0 )
      {
         AV25GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Facturacion.Tmarcom_WPGridState"), null, null);
      }
      else
      {
         AV25GridState.fromxml(AV23Session.getValue("Facturacion.Tmarcom_WPGridState"), null, null);
      }
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV26GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV25GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV38GXV1));
         if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRDTIPART") == 0 )
         {
            AV10TFGrdTipArt = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFGrdTipArt_To = (short)(GXutil.lval( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRDTIPDSC") == 0 )
         {
            AV12TFGrdTipDsc = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRDTIPDSC_SEL") == 0 )
         {
            AV13TFGrdTipDsc_Sel = AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMGEN_VAL") == 0 )
         {
            AV14TFMgen_val = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFMgen_val_To = CommonUtil.decimalVal( AV26GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADGRDTIPDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFGrdTipDsc = AV29SearchTxt ;
      AV13TFGrdTipDsc_Sel = "" ;
      AV40Facturacion_tmarcom_wpds_1_tfgrdtipart = AV10TFGrdTipArt ;
      AV41Facturacion_tmarcom_wpds_2_tfgrdtipart_to = AV11TFGrdTipArt_To ;
      AV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc = AV12TFGrdTipDsc ;
      AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel = AV13TFGrdTipDsc_Sel ;
      AV44Facturacion_tmarcom_wpds_5_tfmgen_val = AV14TFMgen_val ;
      AV45Facturacion_tmarcom_wpds_6_tfmgen_val_to = AV15TFMgen_val_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV40Facturacion_tmarcom_wpds_1_tfgrdtipart) ,
                                           Short.valueOf(AV41Facturacion_tmarcom_wpds_2_tfgrdtipart_to) ,
                                           AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel ,
                                           AV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc ,
                                           AV44Facturacion_tmarcom_wpds_5_tfmgen_val ,
                                           AV45Facturacion_tmarcom_wpds_6_tfmgen_val_to ,
                                           Short.valueOf(A4364GrdTipArt) ,
                                           A4368GrdTipDsc ,
                                           A5655Mgen_val ,
                                           A5654Mgen_com ,
                                           AV35Mgen_com ,
                                           AV34emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc = GXutil.padr( GXutil.rtrim( AV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc), 30, "%") ;
      /* Using cursor P0AMA2 */
      pr_default.execute(0, new Object[] {AV34emprcod, AV35Mgen_com, Short.valueOf(AV40Facturacion_tmarcom_wpds_1_tfgrdtipart), Short.valueOf(AV41Facturacion_tmarcom_wpds_2_tfgrdtipart_to), lV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc, AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel, AV44Facturacion_tmarcom_wpds_5_tfmgen_val, AV45Facturacion_tmarcom_wpds_6_tfmgen_val_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAMA2 = false ;
         A4364GrdTipArt = P0AMA2_A4364GrdTipArt[0] ;
         A396EmprCod = P0AMA2_A396EmprCod[0] ;
         A5654Mgen_com = P0AMA2_A5654Mgen_com[0] ;
         A5655Mgen_val = P0AMA2_A5655Mgen_val[0] ;
         n5655Mgen_val = P0AMA2_n5655Mgen_val[0] ;
         A4368GrdTipDsc = P0AMA2_A4368GrdTipDsc[0] ;
         A4368GrdTipDsc = P0AMA2_A4368GrdTipDsc[0] ;
         AV22count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AMA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AMA2_A4364GrdTipArt[0] == A4364GrdTipArt ) )
         {
            brkAMA2 = false ;
            A5654Mgen_com = P0AMA2_A5654Mgen_com[0] ;
            AV22count = (long)(AV22count+1) ;
            brkAMA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4368GrdTipDsc)==0) )
         {
            AV17Option = A4368GrdTipDsc ;
            AV16InsertIndex = 1 ;
            while ( ( AV16InsertIndex <= AV18Options.size() ) && ( GXutil.strcmp((String)AV18Options.elementAt(-1+AV16InsertIndex), AV17Option) < 0 ) )
            {
               AV16InsertIndex = (int)(AV16InsertIndex+1) ;
            }
            AV18Options.add(AV17Option, AV16InsertIndex);
            AV21OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV22count), "Z,ZZZ,ZZZ,ZZ9")), AV16InsertIndex);
         }
         if ( AV18Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAMA2 )
         {
            brkAMA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmarcom_wpgetfilterdata.this.AV31OptionsJson;
      this.aP4[0] = tmarcom_wpgetfilterdata.this.AV32OptionsDescJson;
      this.aP5[0] = tmarcom_wpgetfilterdata.this.AV33OptionIndexesJson;
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
      AV12TFGrdTipDsc = "" ;
      AV13TFGrdTipDsc_Sel = "" ;
      AV14TFMgen_val = DecimalUtil.ZERO ;
      AV15TFMgen_val_To = DecimalUtil.ZERO ;
      A4368GrdTipDsc = "" ;
      AV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc = "" ;
      AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel = "" ;
      AV44Facturacion_tmarcom_wpds_5_tfmgen_val = DecimalUtil.ZERO ;
      AV45Facturacion_tmarcom_wpds_6_tfmgen_val_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc = "" ;
      A5655Mgen_val = DecimalUtil.ZERO ;
      A5654Mgen_com = "" ;
      AV35Mgen_com = "" ;
      AV34emprcod = "" ;
      A396EmprCod = "" ;
      P0AMA2_A4364GrdTipArt = new short[1] ;
      P0AMA2_A396EmprCod = new String[] {""} ;
      P0AMA2_A5654Mgen_com = new String[] {""} ;
      P0AMA2_A5655Mgen_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMA2_n5655Mgen_val = new boolean[] {false} ;
      P0AMA2_A4368GrdTipDsc = new String[] {""} ;
      AV17Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmarcom_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AMA2_A4364GrdTipArt, P0AMA2_A396EmprCod, P0AMA2_A5654Mgen_com, P0AMA2_A5655Mgen_val, P0AMA2_n5655Mgen_val, P0AMA2_A4368GrdTipDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFGrdTipArt ;
   private short AV11TFGrdTipArt_To ;
   private short AV40Facturacion_tmarcom_wpds_1_tfgrdtipart ;
   private short AV41Facturacion_tmarcom_wpds_2_tfgrdtipart_to ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private int AV38GXV1 ;
   private int AV16InsertIndex ;
   private long AV22count ;
   private java.math.BigDecimal AV14TFMgen_val ;
   private java.math.BigDecimal AV15TFMgen_val_To ;
   private java.math.BigDecimal AV44Facturacion_tmarcom_wpds_5_tfmgen_val ;
   private java.math.BigDecimal AV45Facturacion_tmarcom_wpds_6_tfmgen_val_to ;
   private java.math.BigDecimal A5655Mgen_val ;
   private String AV12TFGrdTipDsc ;
   private String AV13TFGrdTipDsc_Sel ;
   private String A4368GrdTipDsc ;
   private String AV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc ;
   private String AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel ;
   private String scmdbuf ;
   private String lV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc ;
   private String A5654Mgen_com ;
   private String AV35Mgen_com ;
   private String AV34emprcod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAMA2 ;
   private boolean n5655Mgen_val ;
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
   private short[] P0AMA2_A4364GrdTipArt ;
   private String[] P0AMA2_A396EmprCod ;
   private String[] P0AMA2_A5654Mgen_com ;
   private java.math.BigDecimal[] P0AMA2_A5655Mgen_val ;
   private boolean[] P0AMA2_n5655Mgen_val ;
   private String[] P0AMA2_A4368GrdTipDsc ;
   private GXSimpleCollection<String> AV18Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV21OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV25GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV26GridStateFilterValue ;
}

final  class tmarcom_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AMA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV40Facturacion_tmarcom_wpds_1_tfgrdtipart ,
                                          short AV41Facturacion_tmarcom_wpds_2_tfgrdtipart_to ,
                                          String AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel ,
                                          String AV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc ,
                                          java.math.BigDecimal AV44Facturacion_tmarcom_wpds_5_tfmgen_val ,
                                          java.math.BigDecimal AV45Facturacion_tmarcom_wpds_6_tfmgen_val_to ,
                                          short A4364GrdTipArt ,
                                          String A4368GrdTipDsc ,
                                          java.math.BigDecimal A5655Mgen_val ,
                                          String A5654Mgen_com ,
                                          String AV35Mgen_com ,
                                          String AV34emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.GrdTipArt, T1.EmprCod, T1.Mgen_com, T1.Mgen_val, T2.GrdTipDsc FROM (TXPLMARCO T1 INNER JOIN TXPGRDTIP T2 ON T2.EmprCod = T1.EmprCod AND T2.GrdTipArt =" ;
      scmdbuf += " T1.GrdTipArt)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Mgen_com = ?)");
      if ( ! (0==AV40Facturacion_tmarcom_wpds_1_tfgrdtipart) )
      {
         addWhere(sWhereString, "(T1.GrdTipArt >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV41Facturacion_tmarcom_wpds_2_tfgrdtipart_to) )
      {
         addWhere(sWhereString, "(T1.GrdTipArt <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel)==0) && ( ! (GXutil.strcmp("", AV42Facturacion_tmarcom_wpds_3_tfgrdtipdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.GrdTipDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Facturacion_tmarcom_wpds_4_tfgrdtipdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.GrdTipDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44Facturacion_tmarcom_wpds_5_tfmgen_val)==0) )
      {
         addWhere(sWhereString, "(T1.Mgen_val >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Facturacion_tmarcom_wpds_6_tfmgen_val_to)==0) )
      {
         addWhere(sWhereString, "(T1.Mgen_val <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.GrdTipArt" ;
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
                  return conditional_P0AMA2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
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
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[15], 3);
               }
               return;
      }
   }

}

