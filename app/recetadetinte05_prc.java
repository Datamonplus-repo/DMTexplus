package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte05_prc extends GXProcedure
{
   public recetadetinte05_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte05_prc.class ), "" );
   }

   public recetadetinte05_prc( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        int aP5 ,
                        java.math.BigDecimal aP6 ,
                        String aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             int aP5 ,
                             java.math.BigDecimal aP6 ,
                             String aP7 )
   {
      recetadetinte05_prc.this.AV8Emprcod = aP0;
      recetadetinte05_prc.this.AV9Barcod = aP1;
      recetadetinte05_prc.this.AV10Barcodreo = aP2;
      recetadetinte05_prc.this.AV11Barcodpar = aP3;
      recetadetinte05_prc.this.AV12RecLinMaq = aP4;
      recetadetinte05_prc.this.AV16RecVolPrd = aP5;
      recetadetinte05_prc.this.AV18Rectotkgm = aP6;
      recetadetinte05_prc.this.AV13RecNumPrg_to = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P09BK2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar, Short.valueOf(AV12RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
      /* End optimized DELETE. */
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV14RecLinPro = (byte)(5) ;
      /* Using cursor P09BK3 */
      pr_default.execute(1, new Object[] {AV8Emprcod, AV13RecNumPrg_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4586ProForObs = P09BK3_A4586ProForObs[0] ;
         n4586ProForObs = P09BK3_n4586ProForObs[0] ;
         A2392ProNumPro = P09BK3_A2392ProNumPro[0] ;
         A2393ProNumRec = P09BK3_A2393ProNumRec[0] ;
         A10547ProH2O = P09BK3_A10547ProH2O[0] ;
         A771ProForTie = P09BK3_A771ProForTie[0] ;
         A764ProForCod = P09BK3_A764ProForCod[0] ;
         A1514MacProCod = P09BK3_A1514MacProCod[0] ;
         A396EmprCod = P09BK3_A396EmprCod[0] ;
         A1517MacProLin = P09BK3_A1517MacProLin[0] ;
         A4586ProForObs = P09BK3_A4586ProForObs[0] ;
         n4586ProForObs = P09BK3_n4586ProForObs[0] ;
         A2392ProNumPro = P09BK3_A2392ProNumPro[0] ;
         A2393ProNumRec = P09BK3_A2393ProNumRec[0] ;
         A10547ProH2O = P09BK3_A10547ProH2O[0] ;
         A771ProForTie = P09BK3_A771ProForTie[0] ;
         W396EmprCod = A396EmprCod ;
         AV17RecRb = ((DecimalUtil.compareTo(DecimalUtil.ZERO, AV18Rectotkgm)==0) ? DecimalUtil.doubleToDec(0) : GXutil.roundDecimal( DecimalUtil.doubleToDec(AV16RecVolPrd).divide(AV18Rectotkgm, 18, java.math.RoundingMode.DOWN), 1)) ;
         /*
            INSERT RECORD ON TABLE TXPCRECET

         */
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         A396EmprCod = AV8Emprcod ;
         A129BarCod = AV9Barcod ;
         A132BarCodReo = AV10Barcodreo ;
         A130BarCodPar = AV11Barcodpar ;
         A2804RecLinMaq = AV12RecLinMaq ;
         A1273RecLinPro = AV14RecLinPro ;
         A4587ProRecObs = A4586ProForObs ;
         A4697RecNroPrg = A2392ProNumPro ;
         A4695RecVolPrf = AV16RecVolPrd ;
         A7257RecRb = AV17RecRb ;
         n7257RecRb = false ;
         A1251RecNumRec = A2393ProNumRec ;
         A10544RecNH2O = A10547ProH2O ;
         A4696RecTiempo = A771ProForTie ;
         n4696RecTiempo = false ;
         /* Using cursor P09BK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, A4587ProRecObs, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg), Boolean.valueOf(n7257RecRb), A7257RecRb, Integer.valueOf(A1251RecNumRec), Short.valueOf(A10544RecNH2O)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
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
         A396EmprCod = W396EmprCod ;
         A764ProForCod = W764ProForCod ;
         /* End Insert */
         AV14RecLinPro = (byte)(AV14RecLinPro+5) ;
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "recetadetinte05_prc");
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
      P09BK3_A4586ProForObs = new String[] {""} ;
      P09BK3_n4586ProForObs = new boolean[] {false} ;
      P09BK3_A2392ProNumPro = new int[1] ;
      P09BK3_A2393ProNumRec = new int[1] ;
      P09BK3_A10547ProH2O = new short[1] ;
      P09BK3_A771ProForTie = new short[1] ;
      P09BK3_A764ProForCod = new String[] {""} ;
      P09BK3_A1514MacProCod = new String[] {""} ;
      P09BK3_A396EmprCod = new String[] {""} ;
      P09BK3_A1517MacProLin = new short[1] ;
      A4586ProForObs = "" ;
      A764ProForCod = "" ;
      A1514MacProCod = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      AV17RecRb = DecimalUtil.ZERO ;
      W764ProForCod = "" ;
      A130BarCodPar = "" ;
      A4587ProRecObs = "" ;
      A7257RecRb = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte05_prc__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P09BK3_A4586ProForObs, P09BK3_n4586ProForObs, P09BK3_A2392ProNumPro, P09BK3_A2393ProNumRec, P09BK3_A10547ProH2O, P09BK3_A771ProForTie, P09BK3_A764ProForCod, P09BK3_A1514MacProCod, P09BK3_A396EmprCod, P09BK3_A1517MacProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte AV14RecLinPro ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short AV12RecLinMaq ;
   private short A10547ProH2O ;
   private short A771ProForTie ;
   private short A1517MacProLin ;
   private short A2804RecLinMaq ;
   private short A10544RecNH2O ;
   private short A4696RecTiempo ;
   private short Gx_err ;
   private int AV9Barcod ;
   private int AV16RecVolPrd ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private int GX_INS409 ;
   private int A129BarCod ;
   private int A4697RecNroPrg ;
   private int A4695RecVolPrf ;
   private int A1251RecNumRec ;
   private java.math.BigDecimal AV18Rectotkgm ;
   private java.math.BigDecimal AV17RecRb ;
   private java.math.BigDecimal A7257RecRb ;
   private String AV8Emprcod ;
   private String AV11Barcodpar ;
   private String AV13RecNumPrg_to ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A1514MacProCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String W764ProForCod ;
   private String A130BarCodPar ;
   private String Gx_emsg ;
   private boolean n4586ProForObs ;
   private boolean n7257RecRb ;
   private boolean n4696RecTiempo ;
   private String A4587ProRecObs ;
   private String A4586ProForObs ;
   private IDataStoreProvider pr_default ;
   private String[] P09BK3_A4586ProForObs ;
   private boolean[] P09BK3_n4586ProForObs ;
   private int[] P09BK3_A2392ProNumPro ;
   private int[] P09BK3_A2393ProNumRec ;
   private short[] P09BK3_A10547ProH2O ;
   private short[] P09BK3_A771ProForTie ;
   private String[] P09BK3_A764ProForCod ;
   private String[] P09BK3_A1514MacProCod ;
   private String[] P09BK3_A396EmprCod ;
   private short[] P09BK3_A1517MacProLin ;
}

final  class recetadetinte05_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09BK2", "DELETE FROM TXPCRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P09BK3", "SELECT T2.ProForObs, T2.ProNumPro, T2.ProNumRec, T2.ProH2O, T2.ProForTie, T1.ProForCod, T1.MacProCod, T1.EmprCod, T1.MacProLin FROM (TXPLMACPR T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.MacProCod = ? ORDER BY T1.EmprCod, T1.MacProCod, T1.MacProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09BK4", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, ProRecObs, RecVolPrf, RecTiempo, RecNroPrg, RecRb, RecNumRec, RecNH2O, RecTemp, RecPhMx, RecPhMn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setLongVarchar(8, (String)parms[7], false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[10]).shortValue());
               }
               stmt.setInt(11, ((Number) parms[11]).intValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 2);
               }
               stmt.setInt(13, ((Number) parms[14]).intValue());
               stmt.setShort(14, ((Number) parms[15]).shortValue());
               return;
      }
   }

}

