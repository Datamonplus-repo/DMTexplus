package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetpia extends GXProcedure
{
   public pmetpia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetpia.class ), "" );
   }

   public pmetpia( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 ,
                                           long aP4 ,
                                           int[] aP5 ,
                                           java.math.BigDecimal[] aP6 )
   {
      pmetpia.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        long aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             long aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pmetpia.this.A396EmprCod = aP0;
      pmetpia.this.AV13Barcod = aP1;
      pmetpia.this.AV14Barcodreo = aP2;
      pmetpia.this.AV15Barcodpar = aP3;
      pmetpia.this.AV9AlbProcod = aP4;
      pmetpia.this.AV10Pzs = aP5[0];
      this.aP5 = aP5;
      pmetpia.this.AV11Kgs = aP6[0];
      this.aP6 = aP6;
      pmetpia.this.AV12Mts = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CMetpi = (byte)(0) ;
      AV16NumR = 0 ;
      /* Using cursor P04NN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2809MetTerCod = P04NN2_A2809MetTerCod[0] ;
         A130BarCodPar = P04NN2_A130BarCodPar[0] ;
         A132BarCodReo = P04NN2_A132BarCodReo[0] ;
         A129BarCod = P04NN2_A129BarCod[0] ;
         AV8CMetpi = (byte)(1) ;
         AV16NumR = 0 ;
         /* Optimized group. */
         /* Using cursor P04NN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2809MetTerCod});
         cV16NumR = P04NN3_AV16NumR[0] ;
         pr_default.close(1);
         AV16NumR = (int)(AV16NumR+cV16NumR*1) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV8CMetpi == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCMETPI

         */
         A129BarCod = AV13Barcod ;
         A132BarCodReo = AV14Barcodreo ;
         A130BarCodPar = AV15Barcodpar ;
         A2809MetTerCod = "9999999999" ;
         /* Using cursor P04NN4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
         if ( (pr_default.getStatus(2) == 1) )
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
         AV18i = (short)(1) ;
         while ( AV18i <= AV10Pzs )
         {
            AV22Vaux = GXutil.padl( GXutil.trim( GXutil.str( AV18i, 4, 0)), (short)(4), "0") ;
            AV19BarPiecod = AV22Vaux ;
            AV20BarPieKil = AV11Kgs.divide(DecimalUtil.doubleToDec(AV10Pzs), 18, java.math.RoundingMode.DOWN) ;
            AV21BarPieMet = AV12Mts.divide(DecimalUtil.doubleToDec(AV10Pzs), 18, java.math.RoundingMode.DOWN) ;
            /*
               INSERT RECORD ON TABLE TXPLMETPI

            */
            A129BarCod = AV13Barcod ;
            A132BarCodReo = AV14Barcodreo ;
            A130BarCodPar = AV15Barcodpar ;
            A2809MetTerCod = "9999999999" ;
            A2813MetPieCod = AV19BarPiecod ;
            A2814MetPieKil = AV20BarPieKil ;
            A2815MetPieMet = AV21BarPieMet ;
            /* Using cursor P04NN5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A2814MetPieKil, A2815MetPieMet});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
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
            AV18i = (short)(AV18i+1) ;
         }
         Application.commitDataStores(context, remoteHandle, pr_default, "pmetpia");
      }
      else
      {
         AV23MetPieCtr = " " ;
         /* Using cursor P04NN6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A129BarCod = P04NN6_A129BarCod[0] ;
            A132BarCodReo = P04NN6_A132BarCodReo[0] ;
            A130BarCodPar = P04NN6_A130BarCodPar[0] ;
            A10780MetPiectr = P04NN6_A10780MetPiectr[0] ;
            A2809MetTerCod = P04NN6_A2809MetTerCod[0] ;
            A2813MetPieCod = P04NN6_A2813MetPieCod[0] ;
            AV23MetPieCtr = A10780MetPiectr ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV13Barcod ;
         GXv_int3[0] = AV14Barcodreo ;
         GXv_char4[0] = AV15Barcodpar ;
         GXv_char5[0] = AV23MetPieCtr ;
         new app.pmetpir(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5) ;
         pmetpia.this.A396EmprCod = GXv_char1[0] ;
         pmetpia.this.AV13Barcod = GXv_int2[0] ;
         pmetpia.this.AV14Barcodreo = GXv_int3[0] ;
         pmetpia.this.AV15Barcodpar = GXv_char4[0] ;
         pmetpia.this.AV23MetPieCtr = GXv_char5[0] ;
         Application.commitDataStores(context, remoteHandle, pr_default, "pmetpia");
         AV23MetPieCtr = " " ;
         /* Using cursor P04NN7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A2809MetTerCod = P04NN7_A2809MetTerCod[0] ;
            A129BarCod = P04NN7_A129BarCod[0] ;
            A132BarCodReo = P04NN7_A132BarCodReo[0] ;
            A130BarCodPar = P04NN7_A130BarCodPar[0] ;
            A10780MetPiectr = P04NN7_A10780MetPiectr[0] ;
            A2813MetPieCod = P04NN7_A2813MetPieCod[0] ;
            AV23MetPieCtr = A10780MetPiectr ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      AV16NumR = 0 ;
      /* Using cursor P04NN8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk4NN8 = false ;
         A2809MetTerCod = P04NN8_A2809MetTerCod[0] ;
         A129BarCod = P04NN8_A129BarCod[0] ;
         A132BarCodReo = P04NN8_A132BarCodReo[0] ;
         A130BarCodPar = P04NN8_A130BarCodPar[0] ;
         A2813MetPieCod = P04NN8_A2813MetPieCod[0] ;
         A10780MetPiectr = P04NN8_A10780MetPiectr[0] ;
         AV16NumR = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P04NN8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P04NN8_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( P04NN8_A129BarCod[0] == A129BarCod ) && ( P04NN8_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P04NN8_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P04NN8_A10780MetPiectr[0], A10780MetPiectr) == 0 ) ) )
            {
               if (true) break;
            }
            brk4NN8 = false ;
            A2813MetPieCod = P04NN8_A2813MetPieCod[0] ;
            AV16NumR = (int)(AV16NumR+1) ;
            brk4NN8 = true ;
            pr_default.readNext(6);
         }
         if ( ! brk4NN8 )
         {
            brk4NN8 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
      if ( AV16NumR != AV10Pzs )
      {
         Gx_msg = httpContext.getMessage( "El Total Piezas en Guia es ", "") + GXutil.str( AV10Pzs, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "El Total Piezas introducidos es ", "") + GXutil.str( AV16NumR, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Aviso.NO Coinciden", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pmetpia.this.AV10Pzs;
      this.aP6[0] = pmetpia.this.AV11Kgs;
      this.aP7[0] = pmetpia.this.AV12Mts;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04NN2_A396EmprCod = new String[] {""} ;
      P04NN2_A2809MetTerCod = new String[] {""} ;
      P04NN2_A130BarCodPar = new String[] {""} ;
      P04NN2_A132BarCodReo = new byte[1] ;
      P04NN2_A129BarCod = new int[1] ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      P04NN3_AV16NumR = new int[1] ;
      Gx_emsg = "" ;
      AV22Vaux = "" ;
      AV19BarPiecod = "" ;
      AV20BarPieKil = DecimalUtil.ZERO ;
      AV21BarPieMet = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      AV23MetPieCtr = "" ;
      P04NN6_A396EmprCod = new String[] {""} ;
      P04NN6_A129BarCod = new int[1] ;
      P04NN6_A132BarCodReo = new byte[1] ;
      P04NN6_A130BarCodPar = new String[] {""} ;
      P04NN6_A10780MetPiectr = new String[] {""} ;
      P04NN6_A2809MetTerCod = new String[] {""} ;
      P04NN6_A2813MetPieCod = new String[] {""} ;
      A10780MetPiectr = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      P04NN7_A396EmprCod = new String[] {""} ;
      P04NN7_A2809MetTerCod = new String[] {""} ;
      P04NN7_A129BarCod = new int[1] ;
      P04NN7_A132BarCodReo = new byte[1] ;
      P04NN7_A130BarCodPar = new String[] {""} ;
      P04NN7_A10780MetPiectr = new String[] {""} ;
      P04NN7_A2813MetPieCod = new String[] {""} ;
      P04NN8_A396EmprCod = new String[] {""} ;
      P04NN8_A2809MetTerCod = new String[] {""} ;
      P04NN8_A129BarCod = new int[1] ;
      P04NN8_A132BarCodReo = new byte[1] ;
      P04NN8_A130BarCodPar = new String[] {""} ;
      P04NN8_A2813MetPieCod = new String[] {""} ;
      P04NN8_A10780MetPiectr = new String[] {""} ;
      Gx_msg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pmetpia__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pmetpia__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pmetpia__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmetpia__default(),
         new Object[] {
             new Object[] {
            P04NN2_A396EmprCod, P04NN2_A2809MetTerCod, P04NN2_A130BarCodPar, P04NN2_A132BarCodReo, P04NN2_A129BarCod
            }
            , new Object[] {
            P04NN3_AV16NumR
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04NN6_A396EmprCod, P04NN6_A129BarCod, P04NN6_A132BarCodReo, P04NN6_A130BarCodPar, P04NN6_A10780MetPiectr, P04NN6_A2809MetTerCod, P04NN6_A2813MetPieCod
            }
            , new Object[] {
            P04NN7_A396EmprCod, P04NN7_A2809MetTerCod, P04NN7_A129BarCod, P04NN7_A132BarCodReo, P04NN7_A130BarCodPar, P04NN7_A10780MetPiectr, P04NN7_A2813MetPieCod
            }
            , new Object[] {
            P04NN8_A396EmprCod, P04NN8_A2809MetTerCod, P04NN8_A129BarCod, P04NN8_A132BarCodReo, P04NN8_A130BarCodPar, P04NN8_A2813MetPieCod, P04NN8_A10780MetPiectr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Barcodreo ;
   private byte AV8CMetpi ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private short AV18i ;
   private int AV13Barcod ;
   private int AV10Pzs ;
   private int AV16NumR ;
   private int A129BarCod ;
   private int cV16NumR ;
   private int GX_INS412 ;
   private int GX_INS413 ;
   private int GXv_int2[] ;
   private long AV9AlbProcod ;
   private java.math.BigDecimal AV11Kgs ;
   private java.math.BigDecimal AV12Mts ;
   private java.math.BigDecimal AV20BarPieKil ;
   private java.math.BigDecimal AV21BarPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private String A396EmprCod ;
   private String AV15Barcodpar ;
   private String scmdbuf ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String Gx_emsg ;
   private String AV22Vaux ;
   private String AV19BarPiecod ;
   private String A2813MetPieCod ;
   private String AV23MetPieCtr ;
   private String A10780MetPiectr ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String Gx_msg ;
   private boolean brk4NN8 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NN2_A396EmprCod ;
   private String[] P04NN2_A2809MetTerCod ;
   private String[] P04NN2_A130BarCodPar ;
   private byte[] P04NN2_A132BarCodReo ;
   private int[] P04NN2_A129BarCod ;
   private int[] P04NN3_AV16NumR ;
   private String[] P04NN6_A396EmprCod ;
   private int[] P04NN6_A129BarCod ;
   private byte[] P04NN6_A132BarCodReo ;
   private String[] P04NN6_A130BarCodPar ;
   private String[] P04NN6_A10780MetPiectr ;
   private String[] P04NN6_A2809MetTerCod ;
   private String[] P04NN6_A2813MetPieCod ;
   private String[] P04NN7_A396EmprCod ;
   private String[] P04NN7_A2809MetTerCod ;
   private int[] P04NN7_A129BarCod ;
   private byte[] P04NN7_A132BarCodReo ;
   private String[] P04NN7_A130BarCodPar ;
   private String[] P04NN7_A10780MetPiectr ;
   private String[] P04NN7_A2813MetPieCod ;
   private String[] P04NN8_A396EmprCod ;
   private String[] P04NN8_A2809MetTerCod ;
   private int[] P04NN8_A129BarCod ;
   private byte[] P04NN8_A132BarCodReo ;
   private String[] P04NN8_A130BarCodPar ;
   private String[] P04NN8_A2813MetPieCod ;
   private String[] P04NN8_A10780MetPiectr ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pmetpia__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pmetpia__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pmetpia__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pmetpia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NN2", "SELECT EmprCod, MetTerCod, BarCodPar, BarCodReo, BarCod FROM TXPCMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04NN3", "SELECT COUNT(*) FROM TXPLMETPI WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MetTerCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04NN4", "INSERT INTO TXPCMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo) VALUES(?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMETPI")
         ,new UpdateCursor("P04NN5", "INSERT INTO TXPLMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new ForEachCursor("P04NN6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetTerCod, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPiectr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04NN7", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = '9999999999' and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04NN8", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPiectr FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = '9999999999' and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

