package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetpiacopy1 extends GXProcedure
{
   public pmetpiacopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetpiacopy1.class ), "" );
   }

   public pmetpiacopy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             long aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      pmetpiacopy1.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        long aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             long aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pmetpiacopy1.this.A396EmprCod = aP0;
      pmetpiacopy1.this.AV13Barcod = aP1;
      pmetpiacopy1.this.AV14Barcodreo = aP2;
      pmetpiacopy1.this.AV15Barcodpar = aP3;
      pmetpiacopy1.this.AV9AlbProcod = aP4;
      pmetpiacopy1.this.AV10Pzs = aP5[0];
      this.aP5 = aP5;
      pmetpiacopy1.this.AV11Kgs = aP6[0];
      this.aP6 = aP6;
      pmetpiacopy1.this.AV12Mts = aP7[0];
      this.aP7 = aP7;
      pmetpiacopy1.this.aP8 = aP8;
      pmetpiacopy1.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CMetpi = (byte)(0) ;
      AV16NumR = 0 ;
      AV22MetPieCtr = "" ;
      Gx_msg = "" ;
      /* Using cursor P0ACD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2809MetTerCod = P0ACD2_A2809MetTerCod[0] ;
         A130BarCodPar = P0ACD2_A130BarCodPar[0] ;
         A132BarCodReo = P0ACD2_A132BarCodReo[0] ;
         A129BarCod = P0ACD2_A129BarCod[0] ;
         AV8CMetpi = (byte)(1) ;
         AV16NumR = 0 ;
         /* Optimized group. */
         /* Using cursor P0ACD3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2809MetTerCod});
         cV16NumR = P0ACD3_AV16NumR[0] ;
         pr_default.close(1);
         AV16NumR = (int)(AV16NumR+cV16NumR*1) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV8CMetpi == 0 )
      {
         System.out.println( httpContext.getMessage( "&CMetpi=0.Actualizando tabla CMETPI", "") );
         /*
            INSERT RECORD ON TABLE TXPCMETPI

         */
         A129BarCod = AV13Barcod ;
         A132BarCodReo = AV14Barcodreo ;
         A130BarCodPar = AV15Barcodpar ;
         A2809MetTerCod = "9999999999" ;
         /* Using cursor P0ACD4 */
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
         AV17i = (short)(1) ;
         while ( AV17i <= AV10Pzs )
         {
            AV21Vaux = GXutil.padl( GXutil.trim( GXutil.str( AV17i, 4, 0)), (short)(4), "0") ;
            AV18BarPiecod = AV21Vaux ;
            AV19BarPieKil = AV11Kgs.divide(DecimalUtil.doubleToDec(AV10Pzs), 18, java.math.RoundingMode.DOWN) ;
            AV20BarPieMet = AV12Mts.divide(DecimalUtil.doubleToDec(AV10Pzs), 18, java.math.RoundingMode.DOWN) ;
            /*
               INSERT RECORD ON TABLE TXPLMETPI

            */
            A129BarCod = AV13Barcod ;
            A132BarCodReo = AV14Barcodreo ;
            A130BarCodPar = AV15Barcodpar ;
            A2809MetTerCod = "9999999999" ;
            A2813MetPieCod = AV18BarPiecod ;
            A2814MetPieKil = AV19BarPieKil ;
            A2815MetPieMet = AV20BarPieMet ;
            /* Using cursor P0ACD5 */
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
            AV17i = (short)(AV17i+1) ;
            System.out.println( httpContext.getMessage( "actualizando tabla LMETPI", "") );
         }
         Application.commitDataStores(context, remoteHandle, pr_default, "pmetpiacopy1");
      }
      else
      {
         AV22MetPieCtr = " " ;
         /* Using cursor P0ACD6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A129BarCod = P0ACD6_A129BarCod[0] ;
            A132BarCodReo = P0ACD6_A132BarCodReo[0] ;
            A130BarCodPar = P0ACD6_A130BarCodPar[0] ;
            A10780MetPiectr = P0ACD6_A10780MetPiectr[0] ;
            A2809MetTerCod = P0ACD6_A2809MetTerCod[0] ;
            A2813MetPieCod = P0ACD6_A2813MetPieCod[0] ;
            AV22MetPieCtr = A10780MetPiectr ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         System.out.println( httpContext.getMessage( "go PMETPIr", "") );
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV13Barcod ;
         GXv_int3[0] = AV14Barcodreo ;
         GXv_char4[0] = AV15Barcodpar ;
         GXv_char5[0] = AV22MetPieCtr ;
         new app.pmetpir(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5) ;
         pmetpiacopy1.this.A396EmprCod = GXv_char1[0] ;
         pmetpiacopy1.this.AV13Barcod = GXv_int2[0] ;
         pmetpiacopy1.this.AV14Barcodreo = GXv_int3[0] ;
         pmetpiacopy1.this.AV15Barcodpar = GXv_char4[0] ;
         pmetpiacopy1.this.AV22MetPieCtr = GXv_char5[0] ;
         System.out.println( httpContext.getMessage( "return PMETPIr", "") );
         Application.commitDataStores(context, remoteHandle, pr_default, "pmetpiacopy1");
         AV22MetPieCtr = " " ;
         /* Using cursor P0ACD7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A2809MetTerCod = P0ACD7_A2809MetTerCod[0] ;
            A129BarCod = P0ACD7_A129BarCod[0] ;
            A132BarCodReo = P0ACD7_A132BarCodReo[0] ;
            A130BarCodPar = P0ACD7_A130BarCodPar[0] ;
            A10780MetPiectr = P0ACD7_A10780MetPiectr[0] ;
            A2813MetPieCod = P0ACD7_A2813MetPieCod[0] ;
            AV22MetPieCtr = A10780MetPiectr ;
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pmetpiacopy1.this.AV10Pzs;
      this.aP6[0] = pmetpiacopy1.this.AV11Kgs;
      this.aP7[0] = pmetpiacopy1.this.AV12Mts;
      this.aP8[0] = pmetpiacopy1.this.AV22MetPieCtr;
      this.aP9[0] = pmetpiacopy1.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22MetPieCtr = "" ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P0ACD2_A396EmprCod = new String[] {""} ;
      P0ACD2_A2809MetTerCod = new String[] {""} ;
      P0ACD2_A130BarCodPar = new String[] {""} ;
      P0ACD2_A132BarCodReo = new byte[1] ;
      P0ACD2_A129BarCod = new int[1] ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      P0ACD3_AV16NumR = new int[1] ;
      Gx_emsg = "" ;
      AV21Vaux = "" ;
      AV18BarPiecod = "" ;
      AV19BarPieKil = DecimalUtil.ZERO ;
      AV20BarPieMet = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      P0ACD6_A396EmprCod = new String[] {""} ;
      P0ACD6_A129BarCod = new int[1] ;
      P0ACD6_A132BarCodReo = new byte[1] ;
      P0ACD6_A130BarCodPar = new String[] {""} ;
      P0ACD6_A10780MetPiectr = new String[] {""} ;
      P0ACD6_A2809MetTerCod = new String[] {""} ;
      P0ACD6_A2813MetPieCod = new String[] {""} ;
      A10780MetPiectr = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      P0ACD7_A396EmprCod = new String[] {""} ;
      P0ACD7_A2809MetTerCod = new String[] {""} ;
      P0ACD7_A129BarCod = new int[1] ;
      P0ACD7_A132BarCodReo = new byte[1] ;
      P0ACD7_A130BarCodPar = new String[] {""} ;
      P0ACD7_A10780MetPiectr = new String[] {""} ;
      P0ACD7_A2813MetPieCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pmetpiacopy1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pmetpiacopy1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pmetpiacopy1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmetpiacopy1__default(),
         new Object[] {
             new Object[] {
            P0ACD2_A396EmprCod, P0ACD2_A2809MetTerCod, P0ACD2_A130BarCodPar, P0ACD2_A132BarCodReo, P0ACD2_A129BarCod
            }
            , new Object[] {
            P0ACD3_AV16NumR
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0ACD6_A396EmprCod, P0ACD6_A129BarCod, P0ACD6_A132BarCodReo, P0ACD6_A130BarCodPar, P0ACD6_A10780MetPiectr, P0ACD6_A2809MetTerCod, P0ACD6_A2813MetPieCod
            }
            , new Object[] {
            P0ACD7_A396EmprCod, P0ACD7_A2809MetTerCod, P0ACD7_A129BarCod, P0ACD7_A132BarCodReo, P0ACD7_A130BarCodPar, P0ACD7_A10780MetPiectr, P0ACD7_A2813MetPieCod
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
   private short AV17i ;
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
   private java.math.BigDecimal AV19BarPieKil ;
   private java.math.BigDecimal AV20BarPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private String A396EmprCod ;
   private String AV15Barcodpar ;
   private String AV22MetPieCtr ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String Gx_emsg ;
   private String AV21Vaux ;
   private String AV18BarPiecod ;
   private String A2813MetPieCod ;
   private String A10780MetPiectr ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String[] aP9 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACD2_A396EmprCod ;
   private String[] P0ACD2_A2809MetTerCod ;
   private String[] P0ACD2_A130BarCodPar ;
   private byte[] P0ACD2_A132BarCodReo ;
   private int[] P0ACD2_A129BarCod ;
   private int[] P0ACD3_AV16NumR ;
   private String[] P0ACD6_A396EmprCod ;
   private int[] P0ACD6_A129BarCod ;
   private byte[] P0ACD6_A132BarCodReo ;
   private String[] P0ACD6_A130BarCodPar ;
   private String[] P0ACD6_A10780MetPiectr ;
   private String[] P0ACD6_A2809MetTerCod ;
   private String[] P0ACD6_A2813MetPieCod ;
   private String[] P0ACD7_A396EmprCod ;
   private String[] P0ACD7_A2809MetTerCod ;
   private int[] P0ACD7_A129BarCod ;
   private byte[] P0ACD7_A132BarCodReo ;
   private String[] P0ACD7_A130BarCodPar ;
   private String[] P0ACD7_A10780MetPiectr ;
   private String[] P0ACD7_A2813MetPieCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pmetpiacopy1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmetpiacopy1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmetpiacopy1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pmetpiacopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACD2", "SELECT EmprCod, MetTerCod, BarCodPar, BarCodReo, BarCod FROM TXPCMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACD3", "SELECT COUNT(*) FROM TXPLMETPI WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MetTerCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0ACD4", "INSERT INTO TXPCMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo) VALUES(?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMETPI")
         ,new UpdateCursor("P0ACD5", "INSERT INTO TXPLMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new ForEachCursor("P0ACD6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetTerCod, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPiectr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACD7", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieCod FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = '9999999999' and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
      }
   }

}

