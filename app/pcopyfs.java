package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopyfs extends GXProcedure
{
   public pcopyfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopyfs.class ), "" );
   }

   public pcopyfs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pcopyfs.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pcopyfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopyfs.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcopyfs.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pcopyfs.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcopyfs.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV63Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV64EmprNom ;
      GXv_char3[0] = AV65UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char1, GXv_char2, GXv_char3) ;
      pcopyfs.this.A396EmprCod = GXv_char1[0] ;
      pcopyfs.this.AV64EmprNom = GXv_char2[0] ;
      pcopyfs.this.AV65UsurCod = GXv_char3[0] ;
      AV20LinFas = (short)(0) ;
      /* Using cursor P057K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P057K2_A130BarCodPar[0] ;
         A132BarCodReo = P057K2_A132BarCodReo[0] ;
         A129BarCod = P057K2_A129BarCod[0] ;
         A30AlbProCod = P057K2_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P057K2_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P057K2_A1263BarAlbMtrE[0] ;
         A12195BarAlbUnd = P057K2_A12195BarAlbUnd[0] ;
         A1265BarAlbPie = P057K2_A1265BarAlbPie[0] ;
         A5019AlbHdrgm2 = P057K2_A5019AlbHdrgm2[0] ;
         A252CliCod = P057K2_A252CliCod[0] ;
         n252CliCod = P057K2_n252CliCod[0] ;
         A212BarSer = P057K2_A212BarSer[0] ;
         A252CliCod = P057K2_A252CliCod[0] ;
         n252CliCod = P057K2_n252CliCod[0] ;
         A212BarSer = P057K2_A212BarSer[0] ;
         AV27FasKgm = A1261BarAlbKgmE ;
         AV28FasMtr = A1263BarAlbMtrE ;
         AV70FasUnd = A12195BarAlbUnd ;
         AV35Pie_a = A1265BarAlbPie ;
         AV49BarGraAca = A5019AlbHdrgm2 ;
         AV67Pml = 0 ;
         AV25CliCod = A252CliCod ;
         AV71Barser = A212BarSer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P057K3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P057K3_A130BarCodPar[0] ;
         A132BarCodReo = P057K3_A132BarCodReo[0] ;
         A129BarCod = P057K3_A129BarCod[0] ;
         A227BarUni = P057K3_A227BarUni[0] ;
         A252CliCod = P057K3_A252CliCod[0] ;
         n252CliCod = P057K3_n252CliCod[0] ;
         A457FasCod = P057K3_A457FasCod[0] ;
         A2010BarTipDis = P057K3_A2010BarTipDis[0] ;
         A194BarOrdLin = P057K3_A194BarOrdLin[0] ;
         A758ProCod = P057K3_A758ProCod[0] ;
         A252CliCod = P057K3_A252CliCod[0] ;
         n252CliCod = P057K3_n252CliCod[0] ;
         A2010BarTipDis = P057K3_A2010BarTipDis[0] ;
         AV25CliCod = A252CliCod ;
         AV24FasCod = A457FasCod ;
         AV38BarOrdLin = A194BarOrdLin ;
         AV53Bartipdis = A2010BarTipDis ;
         /* Execute user subroutine: 'ALBFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBFAS' Routine */
      returnInSub = false ;
      AV20LinFas = (short)(AV20LinFas+10) ;
      /*
         INSERT RECORD ON TABLE TXPALBFAS

      */
      A30AlbProCod = AV15AlbProCod ;
      A1240GuiFasLin = AV20LinFas ;
      A457FasCod = AV24FasCod ;
      A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
      A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
      A1275FasKgm = AV27FasKgm ;
      A1276FasMtr = AV28FasMtr ;
      A3272FasCodF = " " ;
      n3272FasCodF = false ;
      /* Using cursor P057K4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n3272FasCodF), A3272FasCodF});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopyfs.this.A396EmprCod;
      this.aP1[0] = pcopyfs.this.AV15AlbProCod;
      this.aP2[0] = pcopyfs.this.AV16BarCod;
      this.aP3[0] = pcopyfs.this.AV17BarCodReo;
      this.aP4[0] = pcopyfs.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopyfs");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV63Station = "" ;
      GXv_char1 = new String[1] ;
      AV64EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV65UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P057K2_A396EmprCod = new String[] {""} ;
      P057K2_A130BarCodPar = new String[] {""} ;
      P057K2_A132BarCodReo = new byte[1] ;
      P057K2_A129BarCod = new int[1] ;
      P057K2_A30AlbProCod = new long[1] ;
      P057K2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057K2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057K2_A12195BarAlbUnd = new int[1] ;
      P057K2_A1265BarAlbPie = new int[1] ;
      P057K2_A5019AlbHdrgm2 = new short[1] ;
      P057K2_A252CliCod = new int[1] ;
      P057K2_n252CliCod = new boolean[] {false} ;
      P057K2_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      AV27FasKgm = DecimalUtil.ZERO ;
      AV28FasMtr = DecimalUtil.ZERO ;
      AV71Barser = "" ;
      P057K3_A396EmprCod = new String[] {""} ;
      P057K3_A130BarCodPar = new String[] {""} ;
      P057K3_A132BarCodReo = new byte[1] ;
      P057K3_A129BarCod = new int[1] ;
      P057K3_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057K3_A252CliCod = new int[1] ;
      P057K3_n252CliCod = new boolean[] {false} ;
      P057K3_A457FasCod = new String[] {""} ;
      P057K3_A2010BarTipDis = new String[] {""} ;
      P057K3_A194BarOrdLin = new short[1] ;
      P057K3_A758ProCod = new String[] {""} ;
      A227BarUni = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A2010BarTipDis = "" ;
      A758ProCod = "" ;
      AV24FasCod = "" ;
      AV53Bartipdis = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A3272FasCodF = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopyfs__default(),
         new Object[] {
             new Object[] {
            P057K2_A396EmprCod, P057K2_A130BarCodPar, P057K2_A132BarCodReo, P057K2_A129BarCod, P057K2_A30AlbProCod, P057K2_A1261BarAlbKgmE, P057K2_A1263BarAlbMtrE, P057K2_A12195BarAlbUnd, P057K2_A1265BarAlbPie, P057K2_A5019AlbHdrgm2,
            P057K2_A252CliCod, P057K2_n252CliCod, P057K2_A212BarSer
            }
            , new Object[] {
            P057K3_A396EmprCod, P057K3_A130BarCodPar, P057K3_A132BarCodReo, P057K3_A129BarCod, P057K3_A227BarUni, P057K3_A252CliCod, P057K3_n252CliCod, P057K3_A457FasCod, P057K3_A2010BarTipDis, P057K3_A194BarOrdLin,
            P057K3_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte A132BarCodReo ;
   private short AV20LinFas ;
   private short A5019AlbHdrgm2 ;
   private short AV49BarGraAca ;
   private short A194BarOrdLin ;
   private short AV38BarOrdLin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A12195BarAlbUnd ;
   private int A1265BarAlbPie ;
   private int A252CliCod ;
   private int AV70FasUnd ;
   private int AV35Pie_a ;
   private int AV67Pml ;
   private int AV25CliCod ;
   private int GX_INS194 ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV27FasKgm ;
   private java.math.BigDecimal AV28FasMtr ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String AV63Station ;
   private String GXv_char1[] ;
   private String AV64EmprNom ;
   private String GXv_char2[] ;
   private String AV65UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV71Barser ;
   private String A457FasCod ;
   private String A2010BarTipDis ;
   private String A758ProCod ;
   private String AV24FasCod ;
   private String AV53Bartipdis ;
   private String A3272FasCodF ;
   private String Gx_emsg ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n3272FasCodF ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P057K2_A396EmprCod ;
   private String[] P057K2_A130BarCodPar ;
   private byte[] P057K2_A132BarCodReo ;
   private int[] P057K2_A129BarCod ;
   private long[] P057K2_A30AlbProCod ;
   private java.math.BigDecimal[] P057K2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P057K2_A1263BarAlbMtrE ;
   private int[] P057K2_A12195BarAlbUnd ;
   private int[] P057K2_A1265BarAlbPie ;
   private short[] P057K2_A5019AlbHdrgm2 ;
   private int[] P057K2_A252CliCod ;
   private boolean[] P057K2_n252CliCod ;
   private String[] P057K2_A212BarSer ;
   private String[] P057K3_A396EmprCod ;
   private String[] P057K3_A130BarCodPar ;
   private byte[] P057K3_A132BarCodReo ;
   private int[] P057K3_A129BarCod ;
   private java.math.BigDecimal[] P057K3_A227BarUni ;
   private int[] P057K3_A252CliCod ;
   private boolean[] P057K3_n252CliCod ;
   private String[] P057K3_A457FasCod ;
   private String[] P057K3_A2010BarTipDis ;
   private short[] P057K3_A194BarOrdLin ;
   private String[] P057K3_A758ProCod ;
}

final  class pcopyfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P057K2", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbUnd, T1.BarAlbPie, T1.AlbHdrgm2, T2.CliCod, T2.BarSer FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057K3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarUni, T2.CliCod, T1.FasCod, T2.BarTipDis, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057K4", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[12], 6);
               }
               return;
      }
   }

}

