package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pciebae extends GXProcedure
{
   public pciebae( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pciebae.class ), "" );
   }

   public pciebae( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 )
   {
      pciebae.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 )
   {
      pciebae.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pciebae.this.AV16AlbProCod = aP1[0];
      this.aP1 = aP1;
      pciebae.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      pciebae.this.AV18BarCodReo = aP3[0];
      this.aP3 = aP3;
      pciebae.this.AV19BarCodPar = aP4[0];
      this.aP4 = aP4;
      pciebae.this.AV20Modo = aP5[0];
      this.aP5 = aP5;
      pciebae.this.AV21BarSit = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "pCIEBAE ", "") );
      AV40Ecapi = (byte)(0) ;
      GXv_int1[0] = AV40Ecapi ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ECAPI", ""), GXv_int1) ;
      pciebae.this.AV40Ecapi = GXv_int1[0] ;
      AV33BarKgm = DecimalUtil.ZERO ;
      AV34BarKgmLan = DecimalUtil.ZERO ;
      AV35DifKgm = DecimalUtil.ZERO ;
      /* Using cursor P00YH4 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P00YH4_A130BarCodPar[0] ;
         A132BarCodReo = P00YH4_A132BarCodReo[0] ;
         A129BarCod = P00YH4_A129BarCod[0] ;
         A396EmprCod = P00YH4_A396EmprCod[0] ;
         A252CliCod = P00YH4_A252CliCod[0] ;
         n252CliCod = P00YH4_n252CliCod[0] ;
         A212BarSer = P00YH4_A212BarSer[0] ;
         A166BarKgm = P00YH4_A166BarKgm[0] ;
         n166BarKgm = P00YH4_n166BarKgm[0] ;
         A1538BarCMtr = P00YH4_A1538BarCMtr[0] ;
         A1537BarCMLan = P00YH4_A1537BarCMLan[0] ;
         A166BarKgm = P00YH4_A166BarKgm[0] ;
         n166BarKgm = P00YH4_n166BarKgm[0] ;
         A1538BarCMtr = P00YH4_A1538BarCMtr[0] ;
         A1537BarCMLan = P00YH4_A1537BarCMLan[0] ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_decimal5[0] = AV39ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_decimal5) ;
         pciebae.this.A396EmprCod = GXv_char2[0] ;
         pciebae.this.A252CliCod = GXv_int3[0] ;
         pciebae.this.A212BarSer = GXv_char4[0] ;
         pciebae.this.AV39ArtMer = GXv_decimal5[0] ;
         AV36BarMtr = A1538BarCMtr ;
         AV37BarMtrLan = A1537BarCMLan ;
         AV38DifMtr = AV36BarMtr.subtract(AV37BarMtrLan) ;
         if ( AV40Ecapi == 1 )
         {
            /* Using cursor P00YH5 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A457FasCod = P00YH5_A457FasCod[0] ;
               A153BarFasEst = P00YH5_A153BarFasEst[0] ;
               A227BarUni = P00YH5_A227BarUni[0] ;
               A160BarFecRea = P00YH5_A160BarFecRea[0] ;
               A194BarOrdLin = P00YH5_A194BarOrdLin[0] ;
               A758ProCod = P00YH5_A758ProCod[0] ;
               if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "PLEG", "")) == 0 )
               {
                  A153BarFasEst = (byte)(2) ;
                  A227BarUni = A166BarKgm ;
                  A160BarFecRea = Gx_date ;
                  /* Using cursor P00YH6 */
                  pr_default.execute(2, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV22OK = " " ;
      if ( AV21BarSit != 9 )
      {
         if ( GXutil.strcmp(AV20Modo, httpContext.getMessage( "DEL", "")) != 0 )
         {
            while ( ( GXutil.strcmp(AV22OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV22OK, httpContext.getMessage( "S", "")) != 0 ) )
            {
            }
         }
         else
         {
            AV22OK = httpContext.getMessage( "N", "") ;
         }
      }
      if ( GXutil.strcmp(AV22OK, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char4[0] = AV15EmprCod ;
         GXv_int3[0] = AV17BarCod ;
         GXv_int1[0] = AV18BarCodReo ;
         GXv_char2[0] = AV19BarCodPar ;
         GXv_char6[0] = httpContext.getMessage( "C", "") ;
         new app.pciehoj(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int1, GXv_char2, GXv_char6) ;
         pciebae.this.AV15EmprCod = GXv_char4[0] ;
         pciebae.this.AV17BarCod = GXv_int3[0] ;
         pciebae.this.AV18BarCodReo = GXv_int1[0] ;
         pciebae.this.AV19BarCodPar = GXv_char2[0] ;
         GXv_char6[0] = AV15EmprCod ;
         GXv_int7[0] = AV16AlbProCod ;
         GXv_int3[0] = AV17BarCod ;
         GXv_int1[0] = AV18BarCodReo ;
         GXv_char4[0] = AV19BarCodPar ;
         new app.pcosest(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int3, GXv_int1, GXv_char4) ;
         pciebae.this.AV15EmprCod = GXv_char6[0] ;
         pciebae.this.AV16AlbProCod = GXv_int7[0] ;
         pciebae.this.AV17BarCod = GXv_int3[0] ;
         pciebae.this.AV18BarCodReo = GXv_int1[0] ;
         pciebae.this.AV19BarCodPar = GXv_char4[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pciebae.this.AV15EmprCod;
      this.aP1[0] = pciebae.this.AV16AlbProCod;
      this.aP2[0] = pciebae.this.AV17BarCod;
      this.aP3[0] = pciebae.this.AV18BarCodReo;
      this.aP4[0] = pciebae.this.AV19BarCodPar;
      this.aP5[0] = pciebae.this.AV20Modo;
      this.aP6[0] = pciebae.this.AV21BarSit;
      Application.commitDataStores(context, remoteHandle, pr_default, "pciebae");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33BarKgm = DecimalUtil.ZERO ;
      AV34BarKgmLan = DecimalUtil.ZERO ;
      AV35DifKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00YH4_A130BarCodPar = new String[] {""} ;
      P00YH4_A132BarCodReo = new byte[1] ;
      P00YH4_A129BarCod = new int[1] ;
      P00YH4_A396EmprCod = new String[] {""} ;
      P00YH4_A252CliCod = new int[1] ;
      P00YH4_n252CliCod = new boolean[] {false} ;
      P00YH4_A212BarSer = new String[] {""} ;
      P00YH4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YH4_n166BarKgm = new boolean[] {false} ;
      P00YH4_A1538BarCMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YH4_A1537BarCMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A1538BarCMtr = DecimalUtil.ZERO ;
      A1537BarCMLan = DecimalUtil.ZERO ;
      AV39ArtMer = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV36BarMtr = DecimalUtil.ZERO ;
      AV37BarMtrLan = DecimalUtil.ZERO ;
      AV38DifMtr = DecimalUtil.ZERO ;
      P00YH5_A396EmprCod = new String[] {""} ;
      P00YH5_A129BarCod = new int[1] ;
      P00YH5_A132BarCodReo = new byte[1] ;
      P00YH5_A130BarCodPar = new String[] {""} ;
      P00YH5_A457FasCod = new String[] {""} ;
      P00YH5_A153BarFasEst = new byte[1] ;
      P00YH5_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YH5_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P00YH5_A194BarOrdLin = new short[1] ;
      P00YH5_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A758ProCod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV22OK = "" ;
      GXv_char2 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pciebae__default(),
         new Object[] {
             new Object[] {
            P00YH4_A130BarCodPar, P00YH4_A132BarCodReo, P00YH4_A129BarCod, P00YH4_A396EmprCod, P00YH4_A252CliCod, P00YH4_n252CliCod, P00YH4_A212BarSer, P00YH4_A166BarKgm, P00YH4_n166BarKgm, P00YH4_A1538BarCMtr,
            P00YH4_A1537BarCMLan
            }
            , new Object[] {
            P00YH5_A396EmprCod, P00YH5_A129BarCod, P00YH5_A132BarCodReo, P00YH5_A130BarCodPar, P00YH5_A457FasCod, P00YH5_A153BarFasEst, P00YH5_A227BarUni, P00YH5_A160BarFecRea, P00YH5_A194BarOrdLin, P00YH5_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV18BarCodReo ;
   private byte AV21BarSit ;
   private byte AV40Ecapi ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte GXv_int1[] ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int3[] ;
   private long AV16AlbProCod ;
   private long GXv_int7[] ;
   private java.math.BigDecimal AV33BarKgm ;
   private java.math.BigDecimal AV34BarKgmLan ;
   private java.math.BigDecimal AV35DifKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A1538BarCMtr ;
   private java.math.BigDecimal A1537BarCMLan ;
   private java.math.BigDecimal AV39ArtMer ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV36BarMtr ;
   private java.math.BigDecimal AV37BarMtrLan ;
   private java.math.BigDecimal AV38DifMtr ;
   private java.math.BigDecimal A227BarUni ;
   private String AV15EmprCod ;
   private String AV19BarCodPar ;
   private String AV20Modo ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV22OK ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YH4_A130BarCodPar ;
   private byte[] P00YH4_A132BarCodReo ;
   private int[] P00YH4_A129BarCod ;
   private String[] P00YH4_A396EmprCod ;
   private int[] P00YH4_A252CliCod ;
   private boolean[] P00YH4_n252CliCod ;
   private String[] P00YH4_A212BarSer ;
   private java.math.BigDecimal[] P00YH4_A166BarKgm ;
   private boolean[] P00YH4_n166BarKgm ;
   private java.math.BigDecimal[] P00YH4_A1538BarCMtr ;
   private java.math.BigDecimal[] P00YH4_A1537BarCMLan ;
   private String[] P00YH5_A396EmprCod ;
   private int[] P00YH5_A129BarCod ;
   private byte[] P00YH5_A132BarCodReo ;
   private String[] P00YH5_A130BarCodPar ;
   private String[] P00YH5_A457FasCod ;
   private byte[] P00YH5_A153BarFasEst ;
   private java.math.BigDecimal[] P00YH5_A227BarUni ;
   private java.util.Date[] P00YH5_A160BarFecRea ;
   private short[] P00YH5_A194BarOrdLin ;
   private String[] P00YH5_A758ProCod ;
}

final  class pciebae__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YH4", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarCMtr, 0) AS BarCMtr, COALESCE( T3.BarCMLan, 0) AS BarCMLan FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarComMtr) AS BarCMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarComMLan) AS BarCMLan FROM TXPBARCOM GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YH5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarUni, BarFecRea, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00YH6", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
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
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
      }
   }

}

