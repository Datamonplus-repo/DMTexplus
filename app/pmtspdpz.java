package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtspdpz extends GXProcedure
{
   public pmtspdpz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtspdpz.class ), "" );
   }

   public pmtspdpz( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           long[] aP5 )
   {
      pmtspdpz.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        long[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             long[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pmtspdpz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtspdpz.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmtspdpz.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmtspdpz.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmtspdpz.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pmtspdpz.this.AV9AlbProCod = aP5[0];
      this.aP5 = aP5;
      pmtspdpz.this.AV8MtsPdEnt = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV12Grabisa ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GRABIS", ""), GXv_int1) ;
      pmtspdpz.this.AV12Grabisa = GXv_int1[0] ;
      AV8MtsPdEnt = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00TG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A183BarMetLan = P00TG2_A183BarMetLan[0] ;
         A205BarPieMet = P00TG2_A205BarPieMet[0] ;
         AV8MtsPdEnt = A205BarPieMet.subtract(A183BarMetLan) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12Grabisa == 0 )
      {
         if ( AV9AlbProCod != 0 )
         {
            /* Using cursor P00TG4 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A30AlbProCod = P00TG4_A30AlbProCod[0] ;
               A912AlbPMetEnt = P00TG4_A912AlbPMetEnt[0] ;
               n912AlbPMetEnt = P00TG4_n912AlbPMetEnt[0] ;
               A912AlbPMetEnt = P00TG4_A912AlbPMetEnt[0] ;
               n912AlbPMetEnt = P00TG4_n912AlbPMetEnt[0] ;
               AV10AlbPMetEnt = A912AlbPMetEnt ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            AV8MtsPdEnt = AV10AlbPMetEnt ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtspdpz.this.A396EmprCod;
      this.aP1[0] = pmtspdpz.this.A129BarCod;
      this.aP2[0] = pmtspdpz.this.A132BarCodReo;
      this.aP3[0] = pmtspdpz.this.A130BarCodPar;
      this.aP4[0] = pmtspdpz.this.A200BarPieCod;
      this.aP5[0] = pmtspdpz.this.AV9AlbProCod;
      this.aP6[0] = pmtspdpz.this.AV8MtsPdEnt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00TG2_A396EmprCod = new String[] {""} ;
      P00TG2_A129BarCod = new int[1] ;
      P00TG2_A132BarCodReo = new byte[1] ;
      P00TG2_A130BarCodPar = new String[] {""} ;
      P00TG2_A200BarPieCod = new String[] {""} ;
      P00TG2_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TG2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      P00TG4_A396EmprCod = new String[] {""} ;
      P00TG4_A129BarCod = new int[1] ;
      P00TG4_A132BarCodReo = new byte[1] ;
      P00TG4_A130BarCodPar = new String[] {""} ;
      P00TG4_A200BarPieCod = new String[] {""} ;
      P00TG4_A30AlbProCod = new long[1] ;
      P00TG4_A912AlbPMetEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00TG4_n912AlbPMetEnt = new boolean[] {false} ;
      A912AlbPMetEnt = DecimalUtil.ZERO ;
      AV10AlbPMetEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtspdpz__default(),
         new Object[] {
             new Object[] {
            P00TG2_A396EmprCod, P00TG2_A129BarCod, P00TG2_A132BarCodReo, P00TG2_A130BarCodPar, P00TG2_A200BarPieCod, P00TG2_A183BarMetLan, P00TG2_A205BarPieMet
            }
            , new Object[] {
            P00TG4_A396EmprCod, P00TG4_A129BarCod, P00TG4_A132BarCodReo, P00TG4_A130BarCodPar, P00TG4_A200BarPieCod, P00TG4_A30AlbProCod, P00TG4_A912AlbPMetEnt, P00TG4_n912AlbPMetEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12Grabisa ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private long AV9AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8MtsPdEnt ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A912AlbPMetEnt ;
   private java.math.BigDecimal AV10AlbPMetEnt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private boolean n912AlbPMetEnt ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private long[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00TG2_A396EmprCod ;
   private int[] P00TG2_A129BarCod ;
   private byte[] P00TG2_A132BarCodReo ;
   private String[] P00TG2_A130BarCodPar ;
   private String[] P00TG2_A200BarPieCod ;
   private java.math.BigDecimal[] P00TG2_A183BarMetLan ;
   private java.math.BigDecimal[] P00TG2_A205BarPieMet ;
   private String[] P00TG4_A396EmprCod ;
   private int[] P00TG4_A129BarCod ;
   private byte[] P00TG4_A132BarCodReo ;
   private String[] P00TG4_A130BarCodPar ;
   private String[] P00TG4_A200BarPieCod ;
   private long[] P00TG4_A30AlbProCod ;
   private java.math.BigDecimal[] P00TG4_A912AlbPMetEnt ;
   private boolean[] P00TG4_n912AlbPMetEnt ;
}

final  class pmtspdpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00TG2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarMetLan, BarPieMet FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00TG4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.AlbProCod, COALESCE( T2.AlbPMetEnt, 0) AS AlbPMetEnt FROM (TXPLALPRD T1 LEFT JOIN (SELECT SUM(AlbPTroMet) AS AlbPMetEnt, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.BarPieCod = T1.BarPieCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

