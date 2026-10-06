package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prelan3 extends GXProcedure
{
   public prelan3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prelan3.class ), "" );
   }

   public prelan3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      prelan3.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      prelan3.this.AV35EmprCod = aP0[0];
      this.aP0 = aP0;
      prelan3.this.AV23BarCod = aP1[0];
      this.aP1 = aP1;
      prelan3.this.AV24BarCodReo = aP2[0];
      this.aP2 = aP2;
      prelan3.this.AV25BarCodPar = aP3[0];
      this.aP3 = aP3;
      prelan3.this.AV26RecLinMaq = aP4[0];
      this.aP4 = aP4;
      prelan3.this.AV27Station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02EO2 */
      pr_default.execute(0, new Object[] {AV35EmprCod, AV27Station, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV26RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A207BarPrfCod = P02EO2_A207BarPrfCod[0] ;
         n207BarPrfCod = P02EO2_n207BarPrfCod[0] ;
         A4869BarPrfVol = P02EO2_A4869BarPrfVol[0] ;
         n4869BarPrfVol = P02EO2_n4869BarPrfVol[0] ;
         A4870BarPrfTie = P02EO2_A4870BarPrfTie[0] ;
         n4870BarPrfTie = P02EO2_n4870BarPrfTie[0] ;
         A4871BarPrfPrg = P02EO2_A4871BarPrfPrg[0] ;
         n4871BarPrfPrg = P02EO2_n4871BarPrfPrg[0] ;
         A7216BarPrfTmp = P02EO2_A7216BarPrfTmp[0] ;
         n7216BarPrfTmp = P02EO2_n7216BarPrfTmp[0] ;
         A7217BarPrfPhx = P02EO2_A7217BarPrfPhx[0] ;
         n7217BarPrfPhx = P02EO2_n7217BarPrfPhx[0] ;
         A7218BarPrfPhm = P02EO2_A7218BarPrfPhm[0] ;
         n7218BarPrfPhm = P02EO2_n7218BarPrfPhm[0] ;
         A7254BarPrfRb = P02EO2_A7254BarPrfRb[0] ;
         n7254BarPrfRb = P02EO2_n7254BarPrfRb[0] ;
         A10543BarPrfH2O = P02EO2_A10543BarPrfH2O[0] ;
         n10543BarPrfH2O = P02EO2_n10543BarPrfH2O[0] ;
         A2794BarLinMaq = P02EO2_A2794BarLinMaq[0] ;
         A130BarCodPar = P02EO2_A130BarCodPar[0] ;
         A132BarCodReo = P02EO2_A132BarCodReo[0] ;
         A129BarCod = P02EO2_A129BarCod[0] ;
         A2792TermiCod = P02EO2_A2792TermiCod[0] ;
         A396EmprCod = P02EO2_A396EmprCod[0] ;
         A1255BarPrfLin = P02EO2_A1255BarPrfLin[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV28RecLinPro = (byte)(A1255BarPrfLin) ;
         /*
            INSERT RECORD ON TABLE TXPCRECET

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV35EmprCod ;
         A129BarCod = AV23BarCod ;
         A132BarCodReo = AV24BarCodReo ;
         A130BarCodPar = AV25BarCodPar ;
         A2804RecLinMaq = AV26RecLinMaq ;
         A1273RecLinPro = AV28RecLinPro ;
         A764ProForCod = A207BarPrfCod ;
         A4695RecVolPrf = A4869BarPrfVol ;
         A4696RecTiempo = A4870BarPrfTie ;
         n4696RecTiempo = false ;
         A4697RecNroPrg = A4871BarPrfPrg ;
         A7228RecTemp = A7216BarPrfTmp ;
         n7228RecTemp = false ;
         A7229RecPhMx = A7217BarPrfPhx ;
         n7229RecPhMx = false ;
         A7230RecPhMn = A7218BarPrfPhm ;
         n7230RecPhMn = false ;
         A7257RecRb = A7254BarPrfRb ;
         n7257RecRb = false ;
         A10544RecNH2O = A10543BarPrfH2O ;
         /* Using cursor P02EO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg), Boolean.valueOf(n7228RecTemp), Short.valueOf(A7228RecTemp), Boolean.valueOf(n7229RecPhMx), A7229RecPhMx, Boolean.valueOf(n7230RecPhMn), A7230RecPhMn, Boolean.valueOf(n7257RecRb), A7257RecRb, Short.valueOf(A10544RecNH2O)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
         if ( (pr_default.getStatus(1) == 1) )
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P02EO4 */
      pr_default.execute(2, new Object[] {AV35EmprCod, AV27Station, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV26RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prelan3.this.AV35EmprCod;
      this.aP1[0] = prelan3.this.AV23BarCod;
      this.aP2[0] = prelan3.this.AV24BarCodReo;
      this.aP3[0] = prelan3.this.AV25BarCodPar;
      this.aP4[0] = prelan3.this.AV26RecLinMaq;
      this.aP5[0] = prelan3.this.AV27Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "prelan3");
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
      P02EO2_A207BarPrfCod = new String[] {""} ;
      P02EO2_n207BarPrfCod = new boolean[] {false} ;
      P02EO2_A4869BarPrfVol = new int[1] ;
      P02EO2_n4869BarPrfVol = new boolean[] {false} ;
      P02EO2_A4870BarPrfTie = new short[1] ;
      P02EO2_n4870BarPrfTie = new boolean[] {false} ;
      P02EO2_A4871BarPrfPrg = new int[1] ;
      P02EO2_n4871BarPrfPrg = new boolean[] {false} ;
      P02EO2_A7216BarPrfTmp = new short[1] ;
      P02EO2_n7216BarPrfTmp = new boolean[] {false} ;
      P02EO2_A7217BarPrfPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EO2_n7217BarPrfPhx = new boolean[] {false} ;
      P02EO2_A7218BarPrfPhm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EO2_n7218BarPrfPhm = new boolean[] {false} ;
      P02EO2_A7254BarPrfRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EO2_n7254BarPrfRb = new boolean[] {false} ;
      P02EO2_A10543BarPrfH2O = new short[1] ;
      P02EO2_n10543BarPrfH2O = new boolean[] {false} ;
      P02EO2_A2794BarLinMaq = new short[1] ;
      P02EO2_A130BarCodPar = new String[] {""} ;
      P02EO2_A132BarCodReo = new byte[1] ;
      P02EO2_A129BarCod = new int[1] ;
      P02EO2_A2792TermiCod = new String[] {""} ;
      P02EO2_A396EmprCod = new String[] {""} ;
      P02EO2_A1255BarPrfLin = new short[1] ;
      A207BarPrfCod = "" ;
      A7217BarPrfPhx = DecimalUtil.ZERO ;
      A7218BarPrfPhm = DecimalUtil.ZERO ;
      A7254BarPrfRb = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A2792TermiCod = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A764ProForCod = "" ;
      A7229RecPhMx = DecimalUtil.ZERO ;
      A7230RecPhMn = DecimalUtil.ZERO ;
      A7257RecRb = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prelan3__default(),
         new Object[] {
             new Object[] {
            P02EO2_A207BarPrfCod, P02EO2_n207BarPrfCod, P02EO2_A4869BarPrfVol, P02EO2_n4869BarPrfVol, P02EO2_A4870BarPrfTie, P02EO2_n4870BarPrfTie, P02EO2_A4871BarPrfPrg, P02EO2_n4871BarPrfPrg, P02EO2_A7216BarPrfTmp, P02EO2_n7216BarPrfTmp,
            P02EO2_A7217BarPrfPhx, P02EO2_n7217BarPrfPhx, P02EO2_A7218BarPrfPhm, P02EO2_n7218BarPrfPhm, P02EO2_A7254BarPrfRb, P02EO2_n7254BarPrfRb, P02EO2_A10543BarPrfH2O, P02EO2_n10543BarPrfH2O, P02EO2_A2794BarLinMaq, P02EO2_A130BarCodPar,
            P02EO2_A132BarCodReo, P02EO2_A129BarCod, P02EO2_A2792TermiCod, P02EO2_A396EmprCod, P02EO2_A1255BarPrfLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte AV28RecLinPro ;
   private byte A1273RecLinPro ;
   private short AV26RecLinMaq ;
   private short A4870BarPrfTie ;
   private short A7216BarPrfTmp ;
   private short A10543BarPrfH2O ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short A2804RecLinMaq ;
   private short A4696RecTiempo ;
   private short A7228RecTemp ;
   private short A10544RecNH2O ;
   private short Gx_err ;
   private int AV23BarCod ;
   private int A4869BarPrfVol ;
   private int A4871BarPrfPrg ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS409 ;
   private int A4695RecVolPrf ;
   private int A4697RecNroPrg ;
   private java.math.BigDecimal A7217BarPrfPhx ;
   private java.math.BigDecimal A7218BarPrfPhm ;
   private java.math.BigDecimal A7254BarPrfRb ;
   private java.math.BigDecimal A7229RecPhMx ;
   private java.math.BigDecimal A7230RecPhMn ;
   private java.math.BigDecimal A7257RecRb ;
   private String AV35EmprCod ;
   private String AV25BarCodPar ;
   private String AV27Station ;
   private String scmdbuf ;
   private String A207BarPrfCod ;
   private String A130BarCodPar ;
   private String A2792TermiCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A764ProForCod ;
   private String Gx_emsg ;
   private boolean n207BarPrfCod ;
   private boolean n4869BarPrfVol ;
   private boolean n4870BarPrfTie ;
   private boolean n4871BarPrfPrg ;
   private boolean n7216BarPrfTmp ;
   private boolean n7217BarPrfPhx ;
   private boolean n7218BarPrfPhm ;
   private boolean n7254BarPrfRb ;
   private boolean n10543BarPrfH2O ;
   private boolean n4696RecTiempo ;
   private boolean n7228RecTemp ;
   private boolean n7229RecPhMx ;
   private boolean n7230RecPhMn ;
   private boolean n7257RecRb ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02EO2_A207BarPrfCod ;
   private boolean[] P02EO2_n207BarPrfCod ;
   private int[] P02EO2_A4869BarPrfVol ;
   private boolean[] P02EO2_n4869BarPrfVol ;
   private short[] P02EO2_A4870BarPrfTie ;
   private boolean[] P02EO2_n4870BarPrfTie ;
   private int[] P02EO2_A4871BarPrfPrg ;
   private boolean[] P02EO2_n4871BarPrfPrg ;
   private short[] P02EO2_A7216BarPrfTmp ;
   private boolean[] P02EO2_n7216BarPrfTmp ;
   private java.math.BigDecimal[] P02EO2_A7217BarPrfPhx ;
   private boolean[] P02EO2_n7217BarPrfPhx ;
   private java.math.BigDecimal[] P02EO2_A7218BarPrfPhm ;
   private boolean[] P02EO2_n7218BarPrfPhm ;
   private java.math.BigDecimal[] P02EO2_A7254BarPrfRb ;
   private boolean[] P02EO2_n7254BarPrfRb ;
   private short[] P02EO2_A10543BarPrfH2O ;
   private boolean[] P02EO2_n10543BarPrfH2O ;
   private short[] P02EO2_A2794BarLinMaq ;
   private String[] P02EO2_A130BarCodPar ;
   private byte[] P02EO2_A132BarCodReo ;
   private int[] P02EO2_A129BarCod ;
   private String[] P02EO2_A2792TermiCod ;
   private String[] P02EO2_A396EmprCod ;
   private short[] P02EO2_A1255BarPrfLin ;
}

final  class prelan3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02EO2", "SELECT BarPrfCod, BarPrfVol, BarPrfTie, BarPrfPrg, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRb, BarPrfH2O, BarLinMaq, BarCodPar, BarCodReo, BarCod, TermiCod, EmprCod, BarPrfLin FROM TXPBARPR2 WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ? ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02EO3", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMx, RecPhMn, RecRb, RecNH2O, ProRecObs, RecNumRec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P02EO4", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((String[]) buf[22])[0] = rslt.getString(14, 10);
               ((String[]) buf[23])[0] = rslt.getString(15, 3);
               ((short[]) buf[24])[0] = rslt.getShort(16);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[9]).shortValue());
               }
               stmt.setInt(10, ((Number) parms[10]).intValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[18], 2);
               }
               stmt.setShort(15, ((Number) parms[19]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

