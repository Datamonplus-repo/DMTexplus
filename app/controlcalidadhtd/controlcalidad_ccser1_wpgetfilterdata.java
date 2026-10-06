package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccser1_wpgetfilterdata extends GXProcedure
{
   public controlcalidad_ccser1_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccser1_wpgetfilterdata.class ), "" );
   }

   public controlcalidad_ccser1_wpgetfilterdata( int remoteHandle ,
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
      controlcalidad_ccser1_wpgetfilterdata.this.aP5 = new String[] {""};
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
      controlcalidad_ccser1_wpgetfilterdata.this.AV26DDOName = aP0;
      controlcalidad_ccser1_wpgetfilterdata.this.AV27SearchTxt = aP1;
      controlcalidad_ccser1_wpgetfilterdata.this.AV28SearchTxtTo = aP2;
      controlcalidad_ccser1_wpgetfilterdata.this.aP3 = aP3;
      controlcalidad_ccser1_wpgetfilterdata.this.aP4 = aP4;
      controlcalidad_ccser1_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_CCTDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCCTDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV21Session.getValue("ControlCalidadHTD.ControlCalidad_CCSER1_WPGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CCSER1_WPGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("ControlCalidadHTD.ControlCalidad_CCSER1_WPGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTCOD") == 0 )
         {
            AV10TFCCTCod = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCCTCod_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC") == 0 )
         {
            AV12TFCCTDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCTDSC_SEL") == 0 )
         {
            AV13TFCCTDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCCTDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCCTDsc = AV27SearchTxt ;
      AV13TFCCTDsc_Sel = "" ;
      AV41Controlcalidadhtd_controlcalidad_ccser1_wpds_1_tfcctcod = AV10TFCCTCod ;
      AV42Controlcalidadhtd_controlcalidad_ccser1_wpds_2_tfcctcod_to = AV11TFCCTCod_To ;
      AV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc = AV12TFCCTDsc ;
      AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel = AV13TFCCTDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV41Controlcalidadhtd_controlcalidad_ccser1_wpds_1_tfcctcod) ,
                                           Integer.valueOf(AV42Controlcalidadhtd_controlcalidad_ccser1_wpds_2_tfcctcod_to) ,
                                           AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel ,
                                           AV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc ,
                                           Integer.valueOf(A4031CCTCod) ,
                                           A4036CCTDsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV33Clicod) ,
                                           A65ArtCod ,
                                           AV34Artcod ,
                                           A4058CCFColNom ,
                                           AV35CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Integer.valueOf(AV36CCFColNum) ,
                                           AV32EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc = GXutil.padr( GXutil.rtrim( AV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc), 30, "%") ;
      /* Using cursor P0AOF2 */
      pr_default.execute(0, new Object[] {AV32EmprCod, Integer.valueOf(AV33Clicod), AV34Artcod, AV35CCFColNom, Integer.valueOf(AV36CCFColNum), Integer.valueOf(AV41Controlcalidadhtd_controlcalidad_ccser1_wpds_1_tfcctcod), Integer.valueOf(AV42Controlcalidadhtd_controlcalidad_ccser1_wpds_2_tfcctcod_to), lV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc, AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAOF2 = false ;
         A4031CCTCod = P0AOF2_A4031CCTCod[0] ;
         A396EmprCod = P0AOF2_A396EmprCod[0] ;
         A4059CCFColNum = P0AOF2_A4059CCFColNum[0] ;
         A4058CCFColNom = P0AOF2_A4058CCFColNom[0] ;
         A65ArtCod = P0AOF2_A65ArtCod[0] ;
         A252CliCod = P0AOF2_A252CliCod[0] ;
         A4036CCTDsc = P0AOF2_A4036CCTDsc[0] ;
         A4036CCTDsc = P0AOF2_A4036CCTDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AOF2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AOF2_A4031CCTCod[0] == A4031CCTCod ) )
         {
            brkAOF2 = false ;
            A4059CCFColNum = P0AOF2_A4059CCFColNum[0] ;
            A4058CCFColNom = P0AOF2_A4058CCFColNom[0] ;
            A65ArtCod = P0AOF2_A65ArtCod[0] ;
            A252CliCod = P0AOF2_A252CliCod[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAOF2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4036CCTDsc)==0) )
         {
            AV15Option = A4036CCTDsc ;
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
         if ( ! brkAOF2 )
         {
            brkAOF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlcalidad_ccser1_wpgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = controlcalidad_ccser1_wpgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = controlcalidad_ccser1_wpgetfilterdata.this.AV31OptionIndexesJson;
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
      AV12TFCCTDsc = "" ;
      AV13TFCCTDsc_Sel = "" ;
      A4036CCTDsc = "" ;
      AV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc = "" ;
      AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel = "" ;
      scmdbuf = "" ;
      lV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc = "" ;
      A65ArtCod = "" ;
      AV34Artcod = "" ;
      A4058CCFColNom = "" ;
      AV35CCFColNom = "" ;
      AV32EmprCod = "" ;
      A396EmprCod = "" ;
      P0AOF2_A4031CCTCod = new int[1] ;
      P0AOF2_A396EmprCod = new String[] {""} ;
      P0AOF2_A4059CCFColNum = new int[1] ;
      P0AOF2_A4058CCFColNom = new String[] {""} ;
      P0AOF2_A65ArtCod = new String[] {""} ;
      P0AOF2_A252CliCod = new int[1] ;
      P0AOF2_A4036CCTDsc = new String[] {""} ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccser1_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AOF2_A4031CCTCod, P0AOF2_A396EmprCod, P0AOF2_A4059CCFColNum, P0AOF2_A4058CCFColNom, P0AOF2_A65ArtCod, P0AOF2_A252CliCod, P0AOF2_A4036CCTDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV10TFCCTCod ;
   private int AV11TFCCTCod_To ;
   private int AV41Controlcalidadhtd_controlcalidad_ccser1_wpds_1_tfcctcod ;
   private int AV42Controlcalidadhtd_controlcalidad_ccser1_wpds_2_tfcctcod_to ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int AV33Clicod ;
   private int A4059CCFColNum ;
   private int AV36CCFColNum ;
   private int AV14InsertIndex ;
   private long AV20count ;
   private String AV12TFCCTDsc ;
   private String AV13TFCCTDsc_Sel ;
   private String A4036CCTDsc ;
   private String AV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc ;
   private String AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel ;
   private String scmdbuf ;
   private String lV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc ;
   private String A65ArtCod ;
   private String AV34Artcod ;
   private String A4058CCFColNom ;
   private String AV35CCFColNom ;
   private String AV32EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAOF2 ;
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
   private int[] P0AOF2_A4031CCTCod ;
   private String[] P0AOF2_A396EmprCod ;
   private int[] P0AOF2_A4059CCFColNum ;
   private String[] P0AOF2_A4058CCFColNom ;
   private String[] P0AOF2_A65ArtCod ;
   private int[] P0AOF2_A252CliCod ;
   private String[] P0AOF2_A4036CCTDsc ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class controlcalidad_ccser1_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AOF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV41Controlcalidadhtd_controlcalidad_ccser1_wpds_1_tfcctcod ,
                                          int AV42Controlcalidadhtd_controlcalidad_ccser1_wpds_2_tfcctcod_to ,
                                          String AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel ,
                                          String AV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc ,
                                          int A4031CCTCod ,
                                          String A4036CCTDsc ,
                                          int A252CliCod ,
                                          int AV33Clicod ,
                                          String A65ArtCod ,
                                          String AV34Artcod ,
                                          String A4058CCFColNom ,
                                          String AV35CCFColNom ,
                                          int A4059CCFColNum ,
                                          int AV36CCFColNum ,
                                          String AV32EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CCTCod, T1.EmprCod, T1.CCFColNum, T1.CCFColNom, T1.ArtCod, T1.CliCod, T2.CCTDsc FROM (TXPCCSer1 T1 INNER JOIN TXPCCDef T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CCTCod = T1.CCTCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ArtCod = ?)");
      addWhere(sWhereString, "(T1.CCFColNom = ?)");
      addWhere(sWhereString, "(T1.CCFColNum = ?)");
      if ( ! (0==AV41Controlcalidadhtd_controlcalidad_ccser1_wpds_1_tfcctcod) )
      {
         addWhere(sWhereString, "(T1.CCTCod >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV42Controlcalidadhtd_controlcalidad_ccser1_wpds_2_tfcctcod_to) )
      {
         addWhere(sWhereString, "(T1.CCTCod <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel)==0) && ( ! (GXutil.strcmp("", AV43Controlcalidadhtd_controlcalidad_ccser1_wpds_3_tfcctdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CCTDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Controlcalidadhtd_controlcalidad_ccser1_wpds_4_tfcctdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CCTDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CCTCod" ;
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
                  return conditional_P0AOF2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               return;
      }
   }

}

