package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prelan2 extends GXProcedure
{
   public prelan2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prelan2.class ), "" );
   }

   public prelan2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      prelan2.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      prelan2.this.AV35EmprCod = aP0[0];
      this.aP0 = aP0;
      prelan2.this.AV23BarCod = aP1[0];
      this.aP1 = aP1;
      prelan2.this.AV24BarCodReo = aP2[0];
      this.aP2 = aP2;
      prelan2.this.AV25BarCodPar = aP3[0];
      this.aP3 = aP3;
      prelan2.this.AV26RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV36Recal = httpContext.getMessage( "S", "") ;
      AV27Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV35EmprCod ;
      GXv_char2[0] = AV30EmprNom ;
      GXv_char3[0] = AV29Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char1, GXv_char2, GXv_char3) ;
      prelan2.this.AV35EmprCod = GXv_char1[0] ;
      prelan2.this.AV30EmprNom = GXv_char2[0] ;
      prelan2.this.AV29Usurcod = GXv_char3[0] ;
      /* Optimized DELETE. */
      /* Using cursor P02EN2 */
      pr_default.execute(0, new Object[] {AV35EmprCod, AV27Station, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV26RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
      /* End optimized DELETE. */
      /* Using cursor P02EN3 */
      pr_default.execute(1, new Object[] {AV35EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV26RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1273RecLinPro = P02EN3_A1273RecLinPro[0] ;
         A764ProForCod = P02EN3_A764ProForCod[0] ;
         A4695RecVolPrf = P02EN3_A4695RecVolPrf[0] ;
         A4696RecTiempo = P02EN3_A4696RecTiempo[0] ;
         n4696RecTiempo = P02EN3_n4696RecTiempo[0] ;
         A4697RecNroPrg = P02EN3_A4697RecNroPrg[0] ;
         A7228RecTemp = P02EN3_A7228RecTemp[0] ;
         n7228RecTemp = P02EN3_n7228RecTemp[0] ;
         A7229RecPhMx = P02EN3_A7229RecPhMx[0] ;
         n7229RecPhMx = P02EN3_n7229RecPhMx[0] ;
         A7230RecPhMn = P02EN3_A7230RecPhMn[0] ;
         n7230RecPhMn = P02EN3_n7230RecPhMn[0] ;
         A7257RecRb = P02EN3_A7257RecRb[0] ;
         n7257RecRb = P02EN3_n7257RecRb[0] ;
         A4706ProForRb = P02EN3_A4706ProForRb[0] ;
         A10544RecNH2O = P02EN3_A10544RecNH2O[0] ;
         A396EmprCod = P02EN3_A396EmprCod[0] ;
         A2804RecLinMaq = P02EN3_A2804RecLinMaq[0] ;
         A130BarCodPar = P02EN3_A130BarCodPar[0] ;
         A132BarCodReo = P02EN3_A132BarCodReo[0] ;
         A129BarCod = P02EN3_A129BarCod[0] ;
         A4706ProForRb = P02EN3_A4706ProForRb[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARPR2

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A2792TermiCod = AV27Station ;
         A129BarCod = AV23BarCod ;
         A132BarCodReo = AV24BarCodReo ;
         A130BarCodPar = AV25BarCodPar ;
         A2794BarLinMaq = AV26RecLinMaq ;
         A1255BarPrfLin = A1273RecLinPro ;
         A207BarPrfCod = A764ProForCod ;
         n207BarPrfCod = false ;
         A4869BarPrfVol = A4695RecVolPrf ;
         n4869BarPrfVol = false ;
         A4870BarPrfTie = A4696RecTiempo ;
         n4870BarPrfTie = false ;
         A4871BarPrfPrg = A4697RecNroPrg ;
         n4871BarPrfPrg = false ;
         A7216BarPrfTmp = A7228RecTemp ;
         n7216BarPrfTmp = false ;
         A7217BarPrfPhx = A7229RecPhMx ;
         n7217BarPrfPhx = false ;
         A7218BarPrfPhm = A7230RecPhMn ;
         n7218BarPrfPhm = false ;
         if ( A7257RecRb.doubleValue() == 0 )
         {
            A7254BarPrfRb = DecimalUtil.doubleToDec(A4706ProForRb) ;
            n7254BarPrfRb = false ;
         }
         else
         {
            A7254BarPrfRb = A7257RecRb ;
            n7254BarPrfRb = false ;
         }
         A10543BarPrfH2O = A10544RecNH2O ;
         n10543BarPrfH2O = false ;
         /* Using cursor P02EN4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod, Boolean.valueOf(n4869BarPrfVol), Integer.valueOf(A4869BarPrfVol), Boolean.valueOf(n4870BarPrfTie), Short.valueOf(A4870BarPrfTie), Boolean.valueOf(n4871BarPrfPrg), Integer.valueOf(A4871BarPrfPrg), Boolean.valueOf(n7216BarPrfTmp), Short.valueOf(A7216BarPrfTmp), Boolean.valueOf(n7217BarPrfPhx), A7217BarPrfPhx, Boolean.valueOf(n7218BarPrfPhm), A7218BarPrfPhm, Boolean.valueOf(n7254BarPrfRb), A7254BarPrfRb, Boolean.valueOf(n10543BarPrfH2O), Short.valueOf(A10543BarPrfH2O)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prelan2.this.AV35EmprCod;
      this.aP1[0] = prelan2.this.AV23BarCod;
      this.aP2[0] = prelan2.this.AV24BarCodReo;
      this.aP3[0] = prelan2.this.AV25BarCodPar;
      this.aP4[0] = prelan2.this.AV26RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "prelan2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36Recal = "" ;
      AV27Station = "" ;
      GXv_char1 = new String[1] ;
      AV30EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV29Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02EN3_A1273RecLinPro = new byte[1] ;
      P02EN3_A764ProForCod = new String[] {""} ;
      P02EN3_A4695RecVolPrf = new int[1] ;
      P02EN3_A4696RecTiempo = new short[1] ;
      P02EN3_n4696RecTiempo = new boolean[] {false} ;
      P02EN3_A4697RecNroPrg = new int[1] ;
      P02EN3_A7228RecTemp = new short[1] ;
      P02EN3_n7228RecTemp = new boolean[] {false} ;
      P02EN3_A7229RecPhMx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EN3_n7229RecPhMx = new boolean[] {false} ;
      P02EN3_A7230RecPhMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EN3_n7230RecPhMn = new boolean[] {false} ;
      P02EN3_A7257RecRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EN3_n7257RecRb = new boolean[] {false} ;
      P02EN3_A4706ProForRb = new short[1] ;
      P02EN3_A10544RecNH2O = new short[1] ;
      P02EN3_A396EmprCod = new String[] {""} ;
      P02EN3_A2804RecLinMaq = new short[1] ;
      P02EN3_A130BarCodPar = new String[] {""} ;
      P02EN3_A132BarCodReo = new byte[1] ;
      P02EN3_A129BarCod = new int[1] ;
      A764ProForCod = "" ;
      A7229RecPhMx = DecimalUtil.ZERO ;
      A7230RecPhMn = DecimalUtil.ZERO ;
      A7257RecRb = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A2792TermiCod = "" ;
      A207BarPrfCod = "" ;
      A7217BarPrfPhx = DecimalUtil.ZERO ;
      A7218BarPrfPhm = DecimalUtil.ZERO ;
      A7254BarPrfRb = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prelan2__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P02EN3_A1273RecLinPro, P02EN3_A764ProForCod, P02EN3_A4695RecVolPrf, P02EN3_A4696RecTiempo, P02EN3_n4696RecTiempo, P02EN3_A4697RecNroPrg, P02EN3_A7228RecTemp, P02EN3_n7228RecTemp, P02EN3_A7229RecPhMx, P02EN3_n7229RecPhMx,
            P02EN3_A7230RecPhMn, P02EN3_n7230RecPhMn, P02EN3_A7257RecRb, P02EN3_n7257RecRb, P02EN3_A4706ProForRb, P02EN3_A10544RecNH2O, P02EN3_A396EmprCod, P02EN3_A2804RecLinMaq, P02EN3_A130BarCodPar, P02EN3_A132BarCodReo,
            P02EN3_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private short AV26RecLinMaq ;
   private short A4696RecTiempo ;
   private short A7228RecTemp ;
   private short A4706ProForRb ;
   private short A10544RecNH2O ;
   private short A2804RecLinMaq ;
   private short A2794BarLinMaq ;
   private short A1255BarPrfLin ;
   private short A4870BarPrfTie ;
   private short A7216BarPrfTmp ;
   private short A10543BarPrfH2O ;
   private short Gx_err ;
   private int AV23BarCod ;
   private int A4695RecVolPrf ;
   private int A4697RecNroPrg ;
   private int A129BarCod ;
   private int W129BarCod ;
   private int GX_INS407 ;
   private int A4869BarPrfVol ;
   private int A4871BarPrfPrg ;
   private java.math.BigDecimal A7229RecPhMx ;
   private java.math.BigDecimal A7230RecPhMn ;
   private java.math.BigDecimal A7257RecRb ;
   private java.math.BigDecimal A7217BarPrfPhx ;
   private java.math.BigDecimal A7218BarPrfPhm ;
   private java.math.BigDecimal A7254BarPrfRb ;
   private String AV35EmprCod ;
   private String AV25BarCodPar ;
   private String AV36Recal ;
   private String AV27Station ;
   private String GXv_char1[] ;
   private String AV30EmprNom ;
   private String GXv_char2[] ;
   private String AV29Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A2792TermiCod ;
   private String A207BarPrfCod ;
   private String Gx_emsg ;
   private boolean n4696RecTiempo ;
   private boolean n7228RecTemp ;
   private boolean n7229RecPhMx ;
   private boolean n7230RecPhMn ;
   private boolean n7257RecRb ;
   private boolean n207BarPrfCod ;
   private boolean n4869BarPrfVol ;
   private boolean n4870BarPrfTie ;
   private boolean n4871BarPrfPrg ;
   private boolean n7216BarPrfTmp ;
   private boolean n7217BarPrfPhx ;
   private boolean n7218BarPrfPhm ;
   private boolean n7254BarPrfRb ;
   private boolean n10543BarPrfH2O ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private byte[] P02EN3_A1273RecLinPro ;
   private String[] P02EN3_A764ProForCod ;
   private int[] P02EN3_A4695RecVolPrf ;
   private short[] P02EN3_A4696RecTiempo ;
   private boolean[] P02EN3_n4696RecTiempo ;
   private int[] P02EN3_A4697RecNroPrg ;
   private short[] P02EN3_A7228RecTemp ;
   private boolean[] P02EN3_n7228RecTemp ;
   private java.math.BigDecimal[] P02EN3_A7229RecPhMx ;
   private boolean[] P02EN3_n7229RecPhMx ;
   private java.math.BigDecimal[] P02EN3_A7230RecPhMn ;
   private boolean[] P02EN3_n7230RecPhMn ;
   private java.math.BigDecimal[] P02EN3_A7257RecRb ;
   private boolean[] P02EN3_n7257RecRb ;
   private short[] P02EN3_A4706ProForRb ;
   private short[] P02EN3_A10544RecNH2O ;
   private String[] P02EN3_A396EmprCod ;
   private short[] P02EN3_A2804RecLinMaq ;
   private String[] P02EN3_A130BarCodPar ;
   private byte[] P02EN3_A132BarCodReo ;
   private int[] P02EN3_A129BarCod ;
}

final  class prelan2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02EN2", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
         ,new ForEachCursor("P02EN3", "SELECT T1.RecLinPro, T1.ProForCod, T1.RecVolPrf, T1.RecTiempo, T1.RecNroPrg, T1.RecTemp, T1.RecPhMx, T1.RecPhMn, T1.RecRb, T2.ProForRb, T1.RecNH2O, T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02EN4", "INSERT INTO TXPBARPR2(EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin, BarPrfCod, BarPrfVol, BarPrfTie, BarPrfPrg, BarPrfTmp, BarPrfPhx, BarPrfPhm, BarPrfRb, BarPrfH2O, BarPrfRec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((String[]) buf[16])[0] = rslt.getString(12, 3);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((String[]) buf[18])[0] = rslt.getString(14, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(15);
               ((int[]) buf[20])[0] = rslt.getInt(16);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[24]).shortValue());
               }
               return;
      }
   }

}

