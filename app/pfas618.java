package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfas618 extends GXProcedure
{
   public pfas618( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfas618.class ), "" );
   }

   public pfas618( int remoteHandle ,
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
      pfas618.this.aP4 = new String[] {""};
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
      pfas618.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pfas618.this.AV23AlbProcod = aP1[0];
      this.aP1 = aP1;
      pfas618.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pfas618.this.AV17BarReo = aP3[0];
      this.aP3 = aP3;
      pfas618.this.AV18BarPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV95Precio_Acc = (byte)(0) ;
      /* Using cursor P02D42 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02D42_A130BarCodPar[0] ;
         A132BarCodReo = P02D42_A132BarCodReo[0] ;
         A129BarCod = P02D42_A129BarCod[0] ;
         A396EmprCod = P02D42_A396EmprCod[0] ;
         A227BarUni = P02D42_A227BarUni[0] ;
         A252CliCod = P02D42_A252CliCod[0] ;
         n252CliCod = P02D42_n252CliCod[0] ;
         A457FasCod = P02D42_A457FasCod[0] ;
         A194BarOrdLin = P02D42_A194BarOrdLin[0] ;
         A758ProCod = P02D42_A758ProCod[0] ;
         A252CliCod = P02D42_A252CliCod[0] ;
         n252CliCod = P02D42_n252CliCod[0] ;
         AV35CliCod = A252CliCod ;
         AV37FasCod = A457FasCod ;
         /* Execute user subroutine: 'PREFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV95Precio_Acc == 1 )
         {
            /* Execute user subroutine: 'PRECIOUNICO' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PRECIOUNICO' Routine */
      returnInSub = false ;
      /* Using cursor P02D43 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Long.valueOf(AV23AlbProcod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02D43_A130BarCodPar[0] ;
         A132BarCodReo = P02D43_A132BarCodReo[0] ;
         A129BarCod = P02D43_A129BarCod[0] ;
         A30AlbProCod = P02D43_A30AlbProCod[0] ;
         A396EmprCod = P02D43_A396EmprCod[0] ;
         A1248GuiFasULin = P02D43_A1248GuiFasULin[0] ;
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV96LinFas = (short)(A1248GuiFasULin+1) ;
         /*
            INSERT RECORD ON TABLE TXPALBFAS

         */
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV15EmprCod ;
         A30AlbProCod = AV23AlbProcod ;
         A129BarCod = AV16BarCod ;
         A132BarCodReo = AV17BarReo ;
         A130BarCodPar = AV18BarPar ;
         A1240GuiFasLin = AV96LinFas ;
         A457FasCod = AV37FasCod ;
         A1241GuiFasPKg = AV38FasPreKgm ;
         A1242GuiFasPMt = AV39FasPreMtr ;
         A1275FasKgm = DecimalUtil.doubleToDec(0) ;
         A1276FasMtr = DecimalUtil.doubleToDec(0) ;
         A3272FasCodF = GXutil.substring( AV37FasCod, 1, 6) ;
         n3272FasCodF = false ;
         A4390FasPreDsK = " " ;
         n4390FasPreDsK = false ;
         A4391FasPreDsM = " " ;
         n4391FasPreDsM = false ;
         A5462F_TipPza = (short)(0) ;
         n5462F_TipPza = false ;
         /* Using cursor P02D44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n3272FasCodF), A3272FasCodF, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK, Boolean.valueOf(n4391FasPreDsM), A4391FasPreDsM, Boolean.valueOf(n5462F_TipPza), Short.valueOf(A5462F_TipPza)});
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
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A1248GuiFasULin = AV96LinFas ;
         /* Using cursor P02D45 */
         pr_default.execute(3, new Object[] {Short.valueOf(A1248GuiFasULin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'PREFAS' Routine */
      returnInSub = false ;
      AV95Precio_Acc = (byte)(0) ;
      AV38FasPreKgm = DecimalUtil.doubleToDec(0) ;
      AV39FasPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02D46 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV35CliCod), AV37FasCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A457FasCod = P02D46_A457FasCod[0] ;
         A252CliCod = P02D46_A252CliCod[0] ;
         n252CliCod = P02D46_n252CliCod[0] ;
         A10882FasPreU = P02D46_A10882FasPreU[0] ;
         n10882FasPreU = P02D46_n10882FasPreU[0] ;
         A466FasPreKgm = P02D46_A466FasPreKgm[0] ;
         n466FasPreKgm = P02D46_n466FasPreKgm[0] ;
         A467FasPreMtr = P02D46_A467FasPreMtr[0] ;
         n467FasPreMtr = P02D46_n467FasPreMtr[0] ;
         A396EmprCod = P02D46_A396EmprCod[0] ;
         AV95Precio_Acc = A10882FasPreU ;
         AV38FasPreKgm = A466FasPreKgm ;
         AV39FasPreMtr = A467FasPreMtr ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfas618.this.AV15EmprCod;
      this.aP1[0] = pfas618.this.AV23AlbProcod;
      this.aP2[0] = pfas618.this.AV16BarCod;
      this.aP3[0] = pfas618.this.AV17BarReo;
      this.aP4[0] = pfas618.this.AV18BarPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfas618");
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
      P02D42_A130BarCodPar = new String[] {""} ;
      P02D42_A132BarCodReo = new byte[1] ;
      P02D42_A129BarCod = new int[1] ;
      P02D42_A396EmprCod = new String[] {""} ;
      P02D42_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D42_A252CliCod = new int[1] ;
      P02D42_n252CliCod = new boolean[] {false} ;
      P02D42_A457FasCod = new String[] {""} ;
      P02D42_A194BarOrdLin = new short[1] ;
      P02D42_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      AV37FasCod = "" ;
      P02D43_A130BarCodPar = new String[] {""} ;
      P02D43_A132BarCodReo = new byte[1] ;
      P02D43_A129BarCod = new int[1] ;
      P02D43_A30AlbProCod = new long[1] ;
      P02D43_A396EmprCod = new String[] {""} ;
      P02D43_A1248GuiFasULin = new short[1] ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV38FasPreKgm = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      AV39FasPreMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A3272FasCodF = "" ;
      A4390FasPreDsK = "" ;
      A4391FasPreDsM = "" ;
      Gx_emsg = "" ;
      P02D46_A457FasCod = new String[] {""} ;
      P02D46_A252CliCod = new int[1] ;
      P02D46_n252CliCod = new boolean[] {false} ;
      P02D46_A10882FasPreU = new byte[1] ;
      P02D46_n10882FasPreU = new boolean[] {false} ;
      P02D46_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D46_n466FasPreKgm = new boolean[] {false} ;
      P02D46_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02D46_n467FasPreMtr = new boolean[] {false} ;
      P02D46_A396EmprCod = new String[] {""} ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfas618__default(),
         new Object[] {
             new Object[] {
            P02D42_A130BarCodPar, P02D42_A132BarCodReo, P02D42_A129BarCod, P02D42_A396EmprCod, P02D42_A227BarUni, P02D42_A252CliCod, P02D42_n252CliCod, P02D42_A457FasCod, P02D42_A194BarOrdLin, P02D42_A758ProCod
            }
            , new Object[] {
            P02D43_A130BarCodPar, P02D43_A132BarCodReo, P02D43_A129BarCod, P02D43_A30AlbProCod, P02D43_A396EmprCod, P02D43_A1248GuiFasULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02D46_A457FasCod, P02D46_A252CliCod, P02D46_A10882FasPreU, P02D46_n10882FasPreU, P02D46_A466FasPreKgm, P02D46_n466FasPreKgm, P02D46_A467FasPreMtr, P02D46_n467FasPreMtr, P02D46_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV95Precio_Acc ;
   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private byte A10882FasPreU ;
   private short A194BarOrdLin ;
   private short A1248GuiFasULin ;
   private short AV96LinFas ;
   private short A1240GuiFasLin ;
   private short A5462F_TipPza ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV35CliCod ;
   private int W129BarCod ;
   private int GX_INS194 ;
   private long AV23AlbProcod ;
   private long A30AlbProCod ;
   private long W30AlbProCod ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV38FasPreKgm ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV39FasPreMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String AV37FasCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A3272FasCodF ;
   private String A4390FasPreDsK ;
   private String A4391FasPreDsM ;
   private String Gx_emsg ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n3272FasCodF ;
   private boolean n4390FasPreDsK ;
   private boolean n4391FasPreDsM ;
   private boolean n5462F_TipPza ;
   private boolean n10882FasPreU ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02D42_A130BarCodPar ;
   private byte[] P02D42_A132BarCodReo ;
   private int[] P02D42_A129BarCod ;
   private String[] P02D42_A396EmprCod ;
   private java.math.BigDecimal[] P02D42_A227BarUni ;
   private int[] P02D42_A252CliCod ;
   private boolean[] P02D42_n252CliCod ;
   private String[] P02D42_A457FasCod ;
   private short[] P02D42_A194BarOrdLin ;
   private String[] P02D42_A758ProCod ;
   private String[] P02D43_A130BarCodPar ;
   private byte[] P02D43_A132BarCodReo ;
   private int[] P02D43_A129BarCod ;
   private long[] P02D43_A30AlbProCod ;
   private String[] P02D43_A396EmprCod ;
   private short[] P02D43_A1248GuiFasULin ;
   private String[] P02D46_A457FasCod ;
   private int[] P02D46_A252CliCod ;
   private boolean[] P02D46_n252CliCod ;
   private byte[] P02D46_A10882FasPreU ;
   private boolean[] P02D46_n10882FasPreU ;
   private java.math.BigDecimal[] P02D46_A466FasPreKgm ;
   private boolean[] P02D46_n466FasPreKgm ;
   private java.math.BigDecimal[] P02D46_A467FasPreMtr ;
   private boolean[] P02D46_n467FasPreMtr ;
   private String[] P02D46_A396EmprCod ;
}

final  class pfas618__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02D42", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarUni, T2.CliCod, T1.FasCod, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02D43", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, GuiFasULin FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02D44", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P02D45", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02D46", "SELECT FasCod, CliCod, FasPreU, FasPreKgm, FasPreMtr, EmprCod FROM TXPPREFAS WHERE (CliCod = ?) AND (FasCod = ?) ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[18]).shortValue());
               }
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

