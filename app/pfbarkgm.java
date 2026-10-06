package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfbarkgm extends GXProcedure
{
   public pfbarkgm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfbarkgm.class ), "" );
   }

   public pfbarkgm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      pfbarkgm.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pfbarkgm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfbarkgm.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfbarkgm.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfbarkgm.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfbarkgm.this.AV8vBarKgmLan = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00IB3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A168BarKgmLan = P00IB3_A168BarKgmLan[0] ;
         n168BarKgmLan = P00IB3_n168BarKgmLan[0] ;
         A168BarKgmLan = P00IB3_A168BarKgmLan[0] ;
         n168BarKgmLan = P00IB3_n168BarKgmLan[0] ;
         AV8vBarKgmLan = A168BarKgmLan ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfbarkgm.this.A396EmprCod;
      this.aP1[0] = pfbarkgm.this.A129BarCod;
      this.aP2[0] = pfbarkgm.this.A132BarCodReo;
      this.aP3[0] = pfbarkgm.this.A130BarCodPar;
      this.aP4[0] = pfbarkgm.this.AV8vBarKgmLan;
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
      P00IB3_A396EmprCod = new String[] {""} ;
      P00IB3_A129BarCod = new int[1] ;
      P00IB3_A132BarCodReo = new byte[1] ;
      P00IB3_A130BarCodPar = new String[] {""} ;
      P00IB3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00IB3_n168BarKgmLan = new boolean[] {false} ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfbarkgm__default(),
         new Object[] {
             new Object[] {
            P00IB3_A396EmprCod, P00IB3_A129BarCod, P00IB3_A132BarCodReo, P00IB3_A130BarCodPar, P00IB3_A168BarKgmLan, P00IB3_n168BarKgmLan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8vBarKgmLan ;
   private java.math.BigDecimal A168BarKgmLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n168BarKgmLan ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00IB3_A396EmprCod ;
   private int[] P00IB3_A129BarCod ;
   private byte[] P00IB3_A132BarCodReo ;
   private String[] P00IB3_A130BarCodPar ;
   private java.math.BigDecimal[] P00IB3_A168BarKgmLan ;
   private boolean[] P00IB3_n168BarKgmLan ;
}

final  class pfbarkgm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00IB3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarKilLan) AS BarKgmLan, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
      }
   }

}

