package app.balance ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpexpautogetfilterdata extends GXProcedure
{
   public wpexpautogetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpexpautogetfilterdata.class ), "" );
   }

   public wpexpautogetfilterdata( int remoteHandle ,
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
      wpexpautogetfilterdata.this.aP5 = new String[] {""};
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
      wpexpautogetfilterdata.this.AV24DDOName = aP0;
      wpexpautogetfilterdata.this.AV25SearchTxt = aP1;
      wpexpautogetfilterdata.this.AV26SearchTxtTo = aP2;
      wpexpautogetfilterdata.this.aP3 = aP3;
      wpexpautogetfilterdata.this.aP4 = aP4;
      wpexpautogetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_METPIECOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMETPIECODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV27OptionsJson = AV14Options.toJSonString(false) ;
      AV28OptionsDescJson = AV16OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV17OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Balance.WPExpAutoGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Balance.WPExpAutoGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("Balance.WPExpAutoGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV10TFMetPieCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV11TFMetPieCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INOPECOD") == 0 )
         {
            AV30InOpeCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INOPENOM") == 0 )
         {
            AV31InOpeNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INMAQCOD") == 0 )
         {
            AV32InMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INMAQNOM") == 0 )
         {
            AV33InMaqNom = (short)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMETPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMetPieCod = AV25SearchTxt ;
      AV11TFMetPieCod_Sel = "" ;
      AV41Balance_wpexpautods_1_tfmetpiecod = AV10TFMetPieCod ;
      AV42Balance_wpexpautods_2_tfmetpiecod_sel = AV11TFMetPieCod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV42Balance_wpexpautods_2_tfmetpiecod_sel ,
                                           AV41Balance_wpexpautods_1_tfmetpiecod ,
                                           A2813MetPieCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV34BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV35BarCodReo) ,
                                           A130BarCodPar ,
                                           AV36BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Balance_wpexpautods_1_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV41Balance_wpexpautods_1_tfmetpiecod), 9, "%") ;
      /* Using cursor P0AVR2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV34BarCod), Byte.valueOf(AV35BarCodReo), AV36BarCodPar, lV41Balance_wpexpautods_1_tfmetpiecod, AV42Balance_wpexpautods_2_tfmetpiecod_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAVR2 = false ;
         A129BarCod = P0AVR2_A129BarCod[0] ;
         A132BarCodReo = P0AVR2_A132BarCodReo[0] ;
         A130BarCodPar = P0AVR2_A130BarCodPar[0] ;
         A2813MetPieCod = P0AVR2_A2813MetPieCod[0] ;
         A396EmprCod = P0AVR2_A396EmprCod[0] ;
         A2809MetTerCod = P0AVR2_A2809MetTerCod[0] ;
         AV18count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AVR2_A2813MetPieCod[0], A2813MetPieCod) == 0 ) )
         {
            brkAVR2 = false ;
            A129BarCod = P0AVR2_A129BarCod[0] ;
            A132BarCodReo = P0AVR2_A132BarCodReo[0] ;
            A130BarCodPar = P0AVR2_A130BarCodPar[0] ;
            A396EmprCod = P0AVR2_A396EmprCod[0] ;
            A2809MetTerCod = P0AVR2_A2809MetTerCod[0] ;
            AV18count = (long)(AV18count+1) ;
            brkAVR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A2813MetPieCod)==0) )
         {
            AV13Option = A2813MetPieCod ;
            AV14Options.add(AV13Option, 0);
            AV17OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV18count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV14Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAVR2 )
         {
            brkAVR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wpexpautogetfilterdata.this.AV27OptionsJson;
      this.aP4[0] = wpexpautogetfilterdata.this.AV28OptionsDescJson;
      this.aP5[0] = wpexpautogetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27OptionsJson = "" ;
      AV28OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV14Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFMetPieCod = "" ;
      AV11TFMetPieCod_Sel = "" ;
      AV31InOpeNom = "" ;
      AV32InMaqCod = "" ;
      A2813MetPieCod = "" ;
      AV41Balance_wpexpautods_1_tfmetpiecod = "" ;
      AV42Balance_wpexpautods_2_tfmetpiecod_sel = "" ;
      scmdbuf = "" ;
      lV41Balance_wpexpautods_1_tfmetpiecod = "" ;
      A130BarCodPar = "" ;
      AV36BarCodPar = "" ;
      P0AVR2_A129BarCod = new int[1] ;
      P0AVR2_A132BarCodReo = new byte[1] ;
      P0AVR2_A130BarCodPar = new String[] {""} ;
      P0AVR2_A2813MetPieCod = new String[] {""} ;
      P0AVR2_A396EmprCod = new String[] {""} ;
      P0AVR2_A2809MetTerCod = new String[] {""} ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      AV13Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.balance.wpexpautogetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AVR2_A129BarCod, P0AVR2_A132BarCodReo, P0AVR2_A130BarCodPar, P0AVR2_A2813MetPieCod, P0AVR2_A396EmprCod, P0AVR2_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV35BarCodReo ;
   private short AV33InMaqNom ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV30InOpeCod ;
   private int A129BarCod ;
   private int AV34BarCod ;
   private long AV18count ;
   private String AV10TFMetPieCod ;
   private String AV11TFMetPieCod_Sel ;
   private String AV31InOpeNom ;
   private String AV32InMaqCod ;
   private String A2813MetPieCod ;
   private String AV41Balance_wpexpautods_1_tfmetpiecod ;
   private String AV42Balance_wpexpautods_2_tfmetpiecod_sel ;
   private String scmdbuf ;
   private String lV41Balance_wpexpautods_1_tfmetpiecod ;
   private String A130BarCodPar ;
   private String AV36BarCodPar ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private boolean returnInSub ;
   private boolean brkAVR2 ;
   private String AV27OptionsJson ;
   private String AV28OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV25SearchTxt ;
   private String AV26SearchTxtTo ;
   private String AV13Option ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AVR2_A129BarCod ;
   private byte[] P0AVR2_A132BarCodReo ;
   private String[] P0AVR2_A130BarCodPar ;
   private String[] P0AVR2_A2813MetPieCod ;
   private String[] P0AVR2_A396EmprCod ;
   private String[] P0AVR2_A2809MetTerCod ;
   private GXSimpleCollection<String> AV14Options ;
   private GXSimpleCollection<String> AV16OptionsDesc ;
   private GXSimpleCollection<String> AV17OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class wpexpautogetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AVR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV42Balance_wpexpautods_2_tfmetpiecod_sel ,
                                          String AV41Balance_wpexpautods_1_tfmetpiecod ,
                                          String A2813MetPieCod ,
                                          int A129BarCod ,
                                          int AV34BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV35BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV36BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[5];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarCod, BarCodReo, BarCodPar, MetPieCod, EmprCod, MetTerCod FROM TXPLMETPI" ;
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV42Balance_wpexpautods_2_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV41Balance_wpexpautods_1_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Balance_wpexpautods_2_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MetPieCod" ;
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
                  return conditional_P0AVR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AVR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
                  stmt.setByte(sIdx, ((Number) parms[6]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 9);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 9);
               }
               return;
      }
   }

}

