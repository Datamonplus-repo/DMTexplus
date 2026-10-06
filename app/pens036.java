package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens036 extends GXProcedure
{
   public pens036( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens036.class ), "" );
   }

   public pens036( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            java.math.BigDecimal[] aP2 ,
                            byte[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            int[] aP6 ,
                            short[] aP7 ,
                            String[] aP8 ,
                            short[] aP9 ,
                            byte[] aP10 ,
                            String[] aP11 ,
                            short[] aP12 ,
                            java.math.BigDecimal[] aP13 ,
                            short[] aP14 ,
                            int[] aP15 ,
                            String[] aP16 ,
                            String[] aP17 )
   {
      pens036.this.aP18 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        short[] aP14 ,
                        int[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        short[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             short[] aP14 ,
                             int[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             short[] aP18 )
   {
      pens036.this.AV9EmprCod = aP0[0];
      this.aP0 = aP0;
      pens036.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pens036.this.AV10Cantidad = aP2[0];
      this.aP2 = aP2;
      pens036.this.AV11UniMed = aP3[0];
      this.aP3 = aP3;
      pens036.this.AV12TotKil = aP4[0];
      this.aP4 = aP4;
      pens036.this.AV13Volumen = aP5[0];
      this.aP5 = aP5;
      pens036.this.AV14ValCos = aP6[0];
      this.aP6 = aP6;
      pens036.this.AV15LinRec = aP7[0];
      this.aP7 = aP7;
      pens036.this.AV16Station = aP8[0];
      this.aP8 = aP8;
      pens036.this.AV17UltRecLin = aP9[0];
      this.aP9 = aP9;
      pens036.this.AV18FlagComp = aP10[0];
      this.aP10 = aP10;
      pens036.this.AV20ProForCod = aP11[0];
      this.aP11 = aP11;
      pens036.this.AV22ContLinea = aP12[0];
      this.aP12 = aP12;
      pens036.this.AV23Incre = aP13[0];
      this.aP13 = aP13;
      pens036.this.AV28EscMRb = aP14[0];
      this.aP14 = aP14;
      pens036.this.AV30Solu_ml = aP15[0];
      this.aP15 = aP15;
      pens036.this.AV33Tipo = aP16[0];
      this.aP16 = aP16;
      pens036.this.AV31PrdNom = aP17[0];
      this.aP17 = aP17;
      pens036.this.AV36Num_ord = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV29F_precio2 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "PRECI2", ""), GXv_int2) ;
      pens036.this.GXt_int1 = GXv_int2[0] ;
      AV29F_precio2 = GXt_int1 ;
      GXt_int1 = AV32Pervaf ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "PERVAF", ""), GXv_int2) ;
      pens036.this.GXt_int1 = GXv_int2[0] ;
      AV32Pervaf = GXt_int1 ;
      GXt_int1 = AV34Hss ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV9EmprCod, httpContext.getMessage( "HSS", ""), GXv_int2) ;
      pens036.this.GXt_int1 = GXv_int2[0] ;
      AV34Hss = GXt_int1 ;
      /* Using cursor P028E2 */
      pr_default.execute(0, new Object[] {AV9EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P028E2_A396EmprCod[0] ;
         A3915EmpNumDec = P028E2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P028E2_n3915EmpNumDec[0] ;
         AV24EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV8PrdNum)==0) )
      {
         /* Using cursor P028E3 */
         pr_default.execute(1, new Object[] {AV9EmprCod, AV8PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P028E3_A719PrdNum[0] ;
            A396EmprCod = P028E3_A396EmprCod[0] ;
            A707PrdFacCon = P028E3_A707PrdFacCon[0] ;
            A724PrdPreAct = P028E3_A724PrdPreAct[0] ;
            A718PrdNom = P028E3_A718PrdNom[0] ;
            A5255PrdPreAc2 = P028E3_A5255PrdPreAc2[0] ;
            AV27PrdFacCon = A707PrdFacCon ;
            AV21PrdPreAct = A724PrdPreAct ;
            AV31PrdNom = A718PrdNom ;
            if ( ( AV29F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
            {
               AV21PrdPreAct = A5255PrdPreAc2 ;
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23Incre)==0) )
            {
               if ( AV24EmpNumDec == 2 )
               {
                  AV21PrdPreAct = GXutil.roundDecimal( A724PrdPreAct.add(((A724PrdPreAct.multiply(AV23Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 3) ;
                  if ( ( AV29F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
                  {
                     AV21PrdPreAct = GXutil.roundDecimal( A5255PrdPreAc2.add(((A5255PrdPreAc2.multiply(AV23Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 3) ;
                  }
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      if ( GXutil.strcmp(GXutil.substring( AV8PrdNum, 1, 1), "0") == 0 )
      {
         /* Using cursor P028E5 */
         pr_default.execute(2, new Object[] {AV9EmprCod, AV8PrdNum});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A688PrdComCod = P028E5_A688PrdComCod[0] ;
            A396EmprCod = P028E5_A396EmprCod[0] ;
            A1185PrdComPr = P028E5_A1185PrdComPr[0] ;
            n1185PrdComPr = P028E5_n1185PrdComPr[0] ;
            A1185PrdComPr = P028E5_A1185PrdComPr[0] ;
            n1185PrdComPr = P028E5_n1185PrdComPr[0] ;
            AV21PrdPreAct = A1185PrdComPr ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV23Incre)==0) )
            {
               if ( AV24EmpNumDec == 2 )
               {
                  AV21PrdPreAct = GXutil.roundDecimal( A1185PrdComPr.add(((A1185PrdComPr.multiply(AV23Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 3) ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      if ( (0==AV18FlagComp) )
      {
         AV17UltRecLin = (short)(AV15LinRec+1) ;
      }
      if ( AV30Solu_ml == 0 )
      {
         AV30Solu_ml = 1 ;
      }
      if ( AV11UniMed == 3 )
      {
         AV19CanTeo = AV10Cantidad.multiply(AV12TotKil).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         AV19CanTeo = AV19CanTeo.multiply(DecimalUtil.doubleToDec(AV30Solu_ml)) ;
      }
      else
      {
         AV19CanTeo = AV10Cantidad.multiply(AV13Volumen).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         AV19CanTeo = AV19CanTeo.multiply(DecimalUtil.doubleToDec(AV30Solu_ml)) ;
      }
      AV15LinRec = (short)(AV15LinRec+1) ;
      /*
         INSERT RECORD ON TABLE TXPESCMAN

      */
      A396EmprCod = AV9EmprCod ;
      A910Workstat = AV16Station ;
      A887EscMLin = AV15LinRec ;
      A719PrdNum = AV8PrdNum ;
      A764ProForCod = AV20ProForCod ;
      A897EscMDsc = AV31PrdNom ;
      A889EscMPrdPre = AV21PrdPreAct ;
      A890EscMCan = AV19CanTeo ;
      A490ForPrdUMe = AV11UniMed ;
      AV25EscMCos2 = AV19CanTeo.multiply(AV21PrdPreAct).multiply(AV27PrdFacCon) ;
      A891EscMCos = AV25EscMCos2 ;
      A4713EscMRb = AV28EscMRb ;
      A4712EscMFacCon = AV10Cantidad ;
      A6060EscSol = AV30Solu_ml ;
      A4709EscMMdlCod = AV33Tipo ;
      A7583EscOrdn = AV36Num_ord ;
      /* Using cursor P028E6 */
      pr_default.execute(3, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin), A719PrdNum, A764ProForCod, A897EscMDsc, A889EscMPrdPre, A890EscMCan, Byte.valueOf(A490ForPrdUMe), A891EscMCos, A4709EscMMdlCod, A4712EscMFacCon, Short.valueOf(A4713EscMRb), Integer.valueOf(A6060EscSol), Short.valueOf(A7583EscOrdn)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
      if ( (pr_default.getStatus(3) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens036.this.AV9EmprCod;
      this.aP1[0] = pens036.this.AV8PrdNum;
      this.aP2[0] = pens036.this.AV10Cantidad;
      this.aP3[0] = pens036.this.AV11UniMed;
      this.aP4[0] = pens036.this.AV12TotKil;
      this.aP5[0] = pens036.this.AV13Volumen;
      this.aP6[0] = pens036.this.AV14ValCos;
      this.aP7[0] = pens036.this.AV15LinRec;
      this.aP8[0] = pens036.this.AV16Station;
      this.aP9[0] = pens036.this.AV17UltRecLin;
      this.aP10[0] = pens036.this.AV18FlagComp;
      this.aP11[0] = pens036.this.AV20ProForCod;
      this.aP12[0] = pens036.this.AV22ContLinea;
      this.aP13[0] = pens036.this.AV23Incre;
      this.aP14[0] = pens036.this.AV28EscMRb;
      this.aP15[0] = pens036.this.AV30Solu_ml;
      this.aP16[0] = pens036.this.AV33Tipo;
      this.aP17[0] = pens036.this.AV31PrdNom;
      this.aP18[0] = pens036.this.AV36Num_ord;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P028E2_A396EmprCod = new String[] {""} ;
      P028E2_A3915EmpNumDec = new byte[1] ;
      P028E2_n3915EmpNumDec = new boolean[] {false} ;
      A396EmprCod = "" ;
      P028E3_A719PrdNum = new String[] {""} ;
      P028E3_A396EmprCod = new String[] {""} ;
      P028E3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028E3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028E3_A718PrdNom = new String[] {""} ;
      P028E3_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      AV27PrdFacCon = DecimalUtil.ZERO ;
      AV21PrdPreAct = DecimalUtil.ZERO ;
      P028E5_A688PrdComCod = new String[] {""} ;
      P028E5_A396EmprCod = new String[] {""} ;
      P028E5_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P028E5_n1185PrdComPr = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A1185PrdComPr = DecimalUtil.ZERO ;
      AV19CanTeo = DecimalUtil.ZERO ;
      A910Workstat = "" ;
      A764ProForCod = "" ;
      A897EscMDsc = "" ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      AV25EscMCos2 = DecimalUtil.ZERO ;
      A891EscMCos = DecimalUtil.ZERO ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A4709EscMMdlCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens036__default(),
         new Object[] {
             new Object[] {
            P028E2_A396EmprCod, P028E2_A3915EmpNumDec, P028E2_n3915EmpNumDec
            }
            , new Object[] {
            P028E3_A719PrdNum, P028E3_A396EmprCod, P028E3_A707PrdFacCon, P028E3_A724PrdPreAct, P028E3_A718PrdNom, P028E3_A5255PrdPreAc2
            }
            , new Object[] {
            P028E5_A688PrdComCod, P028E5_A396EmprCod, P028E5_A1185PrdComPr, P028E5_n1185PrdComPr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11UniMed ;
   private byte AV18FlagComp ;
   private byte AV29F_precio2 ;
   private byte AV32Pervaf ;
   private byte AV34Hss ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3915EmpNumDec ;
   private byte AV24EmpNumDec ;
   private byte A490ForPrdUMe ;
   private short AV15LinRec ;
   private short AV17UltRecLin ;
   private short AV22ContLinea ;
   private short AV28EscMRb ;
   private short AV36Num_ord ;
   private short A4713EscMRb ;
   private short A7583EscOrdn ;
   private short Gx_err ;
   private int AV14ValCos ;
   private int AV30Solu_ml ;
   private int GX_INS120 ;
   private int A887EscMLin ;
   private int A6060EscSol ;
   private java.math.BigDecimal AV10Cantidad ;
   private java.math.BigDecimal AV12TotKil ;
   private java.math.BigDecimal AV13Volumen ;
   private java.math.BigDecimal AV23Incre ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal AV27PrdFacCon ;
   private java.math.BigDecimal AV21PrdPreAct ;
   private java.math.BigDecimal A1185PrdComPr ;
   private java.math.BigDecimal AV19CanTeo ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal AV25EscMCos2 ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private String AV9EmprCod ;
   private String AV8PrdNum ;
   private String AV16Station ;
   private String AV20ProForCod ;
   private String AV33Tipo ;
   private String AV31PrdNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A688PrdComCod ;
   private String A910Workstat ;
   private String A764ProForCod ;
   private String A897EscMDsc ;
   private String A4709EscMMdlCod ;
   private String Gx_emsg ;
   private boolean n3915EmpNumDec ;
   private boolean n1185PrdComPr ;
   private short[] aP18 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private short[] aP14 ;
   private int[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P028E2_A396EmprCod ;
   private byte[] P028E2_A3915EmpNumDec ;
   private boolean[] P028E2_n3915EmpNumDec ;
   private String[] P028E3_A719PrdNum ;
   private String[] P028E3_A396EmprCod ;
   private java.math.BigDecimal[] P028E3_A707PrdFacCon ;
   private java.math.BigDecimal[] P028E3_A724PrdPreAct ;
   private String[] P028E3_A718PrdNom ;
   private java.math.BigDecimal[] P028E3_A5255PrdPreAc2 ;
   private String[] P028E5_A688PrdComCod ;
   private String[] P028E5_A396EmprCod ;
   private java.math.BigDecimal[] P028E5_A1185PrdComPr ;
   private boolean[] P028E5_n1185PrdComPr ;
}

final  class pens036__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P028E2", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028E3", "SELECT PrdNum, EmprCod, PrdFacCon, PrdPreAct, PrdNom, PrdPreAc2 FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P028E5", "SELECT T1.PrdComCod, T1.EmprCod, COALESCE( T2.PrdComPr, 0) AS PrdComPr FROM (TXPCPRDCO T1 LEFT JOIN (SELECT SUM(PrdComVal) AS PrdComPr, EmprCod, PrdComCod FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdComCod = T1.PrdComCod) WHERE T1.EmprCod = ? and T1.PrdComCod = ? ORDER BY T1.EmprCod, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P028E6", "INSERT INTO TXPESCMAN(EmprCod, Workstat, EscMLin, PrdNum, ProForCod, EscMDsc, EscMPrdPre, EscMCan, ForPrdUMe, EscMCos, EscMMdlCod, EscMFacCon, EscMRb, EscSol, EscOrdn, EscMCliCod, EscMArtCod, EscMProCod, EscMFasCod, EscVolm, EscMCant) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 4);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
      }
   }

}

