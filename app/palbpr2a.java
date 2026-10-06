package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbpr2a extends GXProcedure
{
   public palbpr2a( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbpr2a.class ), "" );
   }

   public palbpr2a( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           String[] aP5 )
   {
      palbpr2a.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      palbpr2a.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbpr2a.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbpr2a.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      palbpr2a.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbpr2a.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      palbpr2a.this.A200BarPieCod = aP5[0];
      this.aP5 = aP5;
      palbpr2a.this.A912AlbPMetEnt = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P014W3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Boolean.valueOf(n912AlbPMetEnt), A912AlbPMetEnt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1270AlbPMtrEnt = P014W3_A1270AlbPMtrEnt[0] ;
         A1270AlbPMtrEnt = A912AlbPMetEnt ;
         /* Using cursor P014W4 */
         pr_default.execute(1, new Object[] {A1270AlbPMtrEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbpr2a.this.A396EmprCod;
      this.aP1[0] = palbpr2a.this.A30AlbProCod;
      this.aP2[0] = palbpr2a.this.A129BarCod;
      this.aP3[0] = palbpr2a.this.A132BarCodReo;
      this.aP4[0] = palbpr2a.this.A130BarCodPar;
      this.aP5[0] = palbpr2a.this.A200BarPieCod;
      this.aP6[0] = palbpr2a.this.A912AlbPMetEnt;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbpr2a");
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
      P014W3_A396EmprCod = new String[] {""} ;
      P014W3_A30AlbProCod = new long[1] ;
      P014W3_A129BarCod = new int[1] ;
      P014W3_A132BarCodReo = new byte[1] ;
      P014W3_A130BarCodPar = new String[] {""} ;
      P014W3_A200BarPieCod = new String[] {""} ;
      P014W3_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P014W3_A912AlbPMetEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P014W3_n912AlbPMetEnt = new boolean[] {false} ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbpr2a__default(),
         new Object[] {
             new Object[] {
            P014W3_A396EmprCod, P014W3_A30AlbProCod, P014W3_A129BarCod, P014W3_A132BarCodReo, P014W3_A130BarCodPar, P014W3_A200BarPieCod, P014W3_A1270AlbPMtrEnt, P014W3_A912AlbPMetEnt, P014W3_n912AlbPMetEnt
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
   private java.math.BigDecimal A912AlbPMetEnt ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private boolean n912AlbPMetEnt ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P014W3_A396EmprCod ;
   private long[] P014W3_A30AlbProCod ;
   private int[] P014W3_A129BarCod ;
   private byte[] P014W3_A132BarCodReo ;
   private String[] P014W3_A130BarCodPar ;
   private String[] P014W3_A200BarPieCod ;
   private java.math.BigDecimal[] P014W3_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P014W3_A912AlbPMetEnt ;
   private boolean[] P014W3_n912AlbPMetEnt ;
}

final  class palbpr2a__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P014W3", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.AlbPMtrEnt, COALESCE( T2.AlbPMetEnt, 0) AS AlbPMetEnt FROM (TXPLALPRD T1 LEFT JOIN (SELECT SUM(AlbPTroMet) AS AlbPMetEnt, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.BarPieCod = T1.BarPieCod) WHERE (T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ?) AND (COALESCE( T2.AlbPMetEnt, 0) = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P014W4", "UPDATE TXPLALPRD SET AlbPMtrEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
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
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(6, (String)parms[5], 9);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
      }
   }

}

