package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilfa2 extends GXProcedure
{
   public pkilfa2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilfa2.class ), "" );
   }

   public pkilfa2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 )
   {
      pkilfa2.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pkilfa2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilfa2.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pkilfa2.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkilfa2.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkilfa2.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pkilfa2.this.AV15MetAnt = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Kilos = DecimalUtil.doubleToDec(0) ;
      AV17Metros = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P008W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P008W2_A200BarPieCod[0] ;
         A27AlbPKilEnt = P008W2_A27AlbPKilEnt[0] ;
         AV16Kilos = AV16Kilos.add(A27AlbPKilEnt) ;
         /* Optimized group. */
         /* Using cursor P008W3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         c43AlbPTroMet = P008W3_A43AlbPTroMet[0] ;
         pr_default.close(1);
         AV17Metros = AV17Metros.add(c43AlbPTroMet) ;
         /* End optimized group. */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P008W4 */
      pr_default.execute(2, new Object[] {AV17Metros, AV15MetAnt, AV16Kilos, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilfa2.this.A396EmprCod;
      this.aP1[0] = pkilfa2.this.A30AlbProCod;
      this.aP2[0] = pkilfa2.this.A129BarCod;
      this.aP3[0] = pkilfa2.this.A132BarCodReo;
      this.aP4[0] = pkilfa2.this.A130BarCodPar;
      this.aP5[0] = pkilfa2.this.AV15MetAnt;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilfa2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Kilos = DecimalUtil.ZERO ;
      AV17Metros = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P008W2_A396EmprCod = new String[] {""} ;
      P008W2_A30AlbProCod = new long[1] ;
      P008W2_A129BarCod = new int[1] ;
      P008W2_A132BarCodReo = new byte[1] ;
      P008W2_A130BarCodPar = new String[] {""} ;
      P008W2_A200BarPieCod = new String[] {""} ;
      P008W2_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      c43AlbPTroMet = DecimalUtil.ZERO ;
      P008W3_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1275FasKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilfa2__default(),
         new Object[] {
             new Object[] {
            P008W2_A396EmprCod, P008W2_A30AlbProCod, P008W2_A129BarCod, P008W2_A132BarCodReo, P008W2_A130BarCodPar, P008W2_A200BarPieCod, P008W2_A27AlbPKilEnt
            }
            , new Object[] {
            P008W3_A43AlbPTroMet
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV15MetAnt ;
   private java.math.BigDecimal AV16Kilos ;
   private java.math.BigDecimal AV17Metros ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal c43AlbPTroMet ;
   private java.math.BigDecimal A1275FasKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P008W2_A396EmprCod ;
   private long[] P008W2_A30AlbProCod ;
   private int[] P008W2_A129BarCod ;
   private byte[] P008W2_A132BarCodReo ;
   private String[] P008W2_A130BarCodPar ;
   private String[] P008W2_A200BarPieCod ;
   private java.math.BigDecimal[] P008W2_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P008W3_A43AlbPTroMet ;
}

final  class pkilfa2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008W2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPKilEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008W3", "SELECT SUM(AlbPTroMet) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008W4", "UPDATE TXPALBFAS SET FasMtr=FasMtr + ? - ?, FasKgm=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

