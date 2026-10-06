package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class importedocumento extends GXProcedure
{
   public importedocumento( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( importedocumento.class ), "" );
   }

   public importedocumento( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           long aP1 )
   {
      importedocumento.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      importedocumento.this.A396EmprCod = aP0;
      importedocumento.this.A30AlbProCod = aP1;
      importedocumento.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9ImpAlb = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0A002 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3391AlbSer = P0A002_A3391AlbSer[0] ;
         A12196BarPreUnd = P0A002_A12196BarPreUnd[0] ;
         A12195BarAlbUnd = P0A002_A12195BarAlbUnd[0] ;
         A1264BarPreMtr = P0A002_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P0A002_A1263BarAlbMtrE[0] ;
         A1262BarPreKgm = P0A002_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P0A002_A1261BarAlbKgmE[0] ;
         A129BarCod = P0A002_A129BarCod[0] ;
         A132BarCodReo = P0A002_A132BarCodReo[0] ;
         A130BarCodPar = P0A002_A130BarCodPar[0] ;
         AV9ImpAlb = AV9ImpAlb.add((GXutil.roundDecimal( (A1261BarAlbKgmE.multiply(A1262BarPreKgm)), 2).add(GXutil.roundDecimal( (A1263BarAlbMtrE.multiply(A1264BarPreMtr)), 2)).add(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A12195BarAlbUnd).multiply(A12196BarPreUnd)), 2)))) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P0A003 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A12194FasPreUnd = P0A003_A12194FasPreUnd[0] ;
         A12193FasUnd = P0A003_A12193FasUnd[0] ;
         A1242GuiFasPMt = P0A003_A1242GuiFasPMt[0] ;
         A1276FasMtr = P0A003_A1276FasMtr[0] ;
         A1275FasKgm = P0A003_A1275FasKgm[0] ;
         A1241GuiFasPKg = P0A003_A1241GuiFasPKg[0] ;
         A129BarCod = P0A003_A129BarCod[0] ;
         A132BarCodReo = P0A003_A132BarCodReo[0] ;
         A130BarCodPar = P0A003_A130BarCodPar[0] ;
         A1240GuiFasLin = P0A003_A1240GuiFasLin[0] ;
         AV9ImpAlb = AV9ImpAlb.add(((GXutil.roundDecimal( (A1241GuiFasPKg.multiply(A1275FasKgm)), 2).add(GXutil.roundDecimal( (A1276FasMtr.multiply(A1242GuiFasPMt)), 2)).add(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A12193FasUnd).multiply(A12194FasPreUnd)), 2))))) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P0A004 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2767AlbHdrPKg = P0A004_A2767AlbHdrPKg[0] ;
         A2768AlbHdrKgs = P0A004_A2768AlbHdrKgs[0] ;
         A2769AlbHdrPMt = P0A004_A2769AlbHdrPMt[0] ;
         A2770ALbHdrMts = P0A004_A2770ALbHdrMts[0] ;
         A129BarCod = P0A004_A129BarCod[0] ;
         A132BarCodReo = P0A004_A132BarCodReo[0] ;
         A130BarCodPar = P0A004_A130BarCodPar[0] ;
         A2764AlbHdrLin = P0A004_A2764AlbHdrLin[0] ;
         AV9ImpAlb = AV9ImpAlb.add(((GXutil.roundDecimal( (A2770ALbHdrMts.multiply(A2769AlbHdrPMt)), 2).add(GXutil.roundDecimal( (A2768AlbHdrKgs.multiply(A2767AlbHdrPKg)), 2))))) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = importedocumento.this.AV9ImpAlb;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ImpAlb = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0A002_A396EmprCod = new String[] {""} ;
      P0A002_A30AlbProCod = new long[1] ;
      P0A002_A3391AlbSer = new String[] {""} ;
      P0A002_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A002_A12195BarAlbUnd = new int[1] ;
      P0A002_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A002_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A002_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A002_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A002_A129BarCod = new int[1] ;
      P0A002_A132BarCodReo = new byte[1] ;
      P0A002_A130BarCodPar = new String[] {""} ;
      A3391AlbSer = "" ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      P0A003_A396EmprCod = new String[] {""} ;
      P0A003_A30AlbProCod = new long[1] ;
      P0A003_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A003_A12193FasUnd = new int[1] ;
      P0A003_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A003_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A003_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A003_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A003_A129BarCod = new int[1] ;
      P0A003_A132BarCodReo = new byte[1] ;
      P0A003_A130BarCodPar = new String[] {""} ;
      P0A003_A1240GuiFasLin = new short[1] ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      P0A004_A396EmprCod = new String[] {""} ;
      P0A004_A30AlbProCod = new long[1] ;
      P0A004_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A004_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A004_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A004_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A004_A129BarCod = new int[1] ;
      P0A004_A132BarCodReo = new byte[1] ;
      P0A004_A130BarCodPar = new String[] {""} ;
      P0A004_A2764AlbHdrLin = new short[1] ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.importedocumento__default(),
         new Object[] {
             new Object[] {
            P0A002_A396EmprCod, P0A002_A30AlbProCod, P0A002_A3391AlbSer, P0A002_A12196BarPreUnd, P0A002_A12195BarAlbUnd, P0A002_A1264BarPreMtr, P0A002_A1263BarAlbMtrE, P0A002_A1262BarPreKgm, P0A002_A1261BarAlbKgmE, P0A002_A129BarCod,
            P0A002_A132BarCodReo, P0A002_A130BarCodPar
            }
            , new Object[] {
            P0A003_A396EmprCod, P0A003_A30AlbProCod, P0A003_A12194FasPreUnd, P0A003_A12193FasUnd, P0A003_A1242GuiFasPMt, P0A003_A1276FasMtr, P0A003_A1275FasKgm, P0A003_A1241GuiFasPKg, P0A003_A129BarCod, P0A003_A132BarCodReo,
            P0A003_A130BarCodPar, P0A003_A1240GuiFasLin
            }
            , new Object[] {
            P0A004_A396EmprCod, P0A004_A30AlbProCod, P0A004_A2767AlbHdrPKg, P0A004_A2768AlbHdrKgs, P0A004_A2769AlbHdrPMt, P0A004_A2770ALbHdrMts, P0A004_A129BarCod, P0A004_A132BarCodReo, P0A004_A130BarCodPar, P0A004_A2764AlbHdrLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short A2764AlbHdrLin ;
   private short Gx_err ;
   private int A12195BarAlbUnd ;
   private int A129BarCod ;
   private int A12193FasUnd ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV9ImpAlb ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3391AlbSer ;
   private String A130BarCodPar ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A002_A396EmprCod ;
   private long[] P0A002_A30AlbProCod ;
   private String[] P0A002_A3391AlbSer ;
   private java.math.BigDecimal[] P0A002_A12196BarPreUnd ;
   private int[] P0A002_A12195BarAlbUnd ;
   private java.math.BigDecimal[] P0A002_A1264BarPreMtr ;
   private java.math.BigDecimal[] P0A002_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0A002_A1262BarPreKgm ;
   private java.math.BigDecimal[] P0A002_A1261BarAlbKgmE ;
   private int[] P0A002_A129BarCod ;
   private byte[] P0A002_A132BarCodReo ;
   private String[] P0A002_A130BarCodPar ;
   private String[] P0A003_A396EmprCod ;
   private long[] P0A003_A30AlbProCod ;
   private java.math.BigDecimal[] P0A003_A12194FasPreUnd ;
   private int[] P0A003_A12193FasUnd ;
   private java.math.BigDecimal[] P0A003_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0A003_A1276FasMtr ;
   private java.math.BigDecimal[] P0A003_A1275FasKgm ;
   private java.math.BigDecimal[] P0A003_A1241GuiFasPKg ;
   private int[] P0A003_A129BarCod ;
   private byte[] P0A003_A132BarCodReo ;
   private String[] P0A003_A130BarCodPar ;
   private short[] P0A003_A1240GuiFasLin ;
   private String[] P0A004_A396EmprCod ;
   private long[] P0A004_A30AlbProCod ;
   private java.math.BigDecimal[] P0A004_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P0A004_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P0A004_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] P0A004_A2770ALbHdrMts ;
   private int[] P0A004_A129BarCod ;
   private byte[] P0A004_A132BarCodReo ;
   private String[] P0A004_A130BarCodPar ;
   private short[] P0A004_A2764AlbHdrLin ;
}

final  class importedocumento__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A002", "SELECT EmprCod, AlbProCod, AlbSer, BarPreUnd, BarAlbUnd, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A003", "SELECT EmprCod, AlbProCod, FasPreUnd, FasUnd, GuiFasPMt, FasMtr, FasKgm, GuiFasPKg, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A004", "SELECT EmprCod, AlbProCod, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

