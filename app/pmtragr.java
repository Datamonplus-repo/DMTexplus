package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtragr extends GXProcedure
{
   public pmtragr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtragr.class ), "" );
   }

   public pmtragr( int remoteHandle ,
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
      pmtragr.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pmtragr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtragr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmtragr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmtragr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmtragr.this.AV8RecTotMtr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8RecTotMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P029H4 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A184BarMtr = P029H4_A184BarMtr[0] ;
         n184BarMtr = P029H4_n184BarMtr[0] ;
         A870BarTotMtr = P029H4_A870BarTotMtr[0] ;
         n870BarTotMtr = P029H4_n870BarTotMtr[0] ;
         A870BarTotMtr = P029H4_A870BarTotMtr[0] ;
         n870BarTotMtr = P029H4_n870BarTotMtr[0] ;
         A184BarMtr = P029H4_A184BarMtr[0] ;
         n184BarMtr = P029H4_n184BarMtr[0] ;
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
         }
         AV8RecTotMtr = A871RecTotMtr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtragr.this.A396EmprCod;
      this.aP1[0] = pmtragr.this.A129BarCod;
      this.aP2[0] = pmtragr.this.A132BarCodReo;
      this.aP3[0] = pmtragr.this.A130BarCodPar;
      this.aP4[0] = pmtragr.this.AV8RecTotMtr;
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
      P029H4_A396EmprCod = new String[] {""} ;
      P029H4_A129BarCod = new int[1] ;
      P029H4_A132BarCodReo = new byte[1] ;
      P029H4_A130BarCodPar = new String[] {""} ;
      P029H4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029H4_n184BarMtr = new boolean[] {false} ;
      P029H4_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P029H4_n870BarTotMtr = new boolean[] {false} ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtragr__default(),
         new Object[] {
             new Object[] {
            P029H4_A396EmprCod, P029H4_A129BarCod, P029H4_A132BarCodReo, P029H4_A130BarCodPar, P029H4_A184BarMtr, P029H4_n184BarMtr, P029H4_A870BarTotMtr, P029H4_n870BarTotMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8RecTotMtr ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n184BarMtr ;
   private boolean n870BarTotMtr ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P029H4_A396EmprCod ;
   private int[] P029H4_A129BarCod ;
   private byte[] P029H4_A132BarCodReo ;
   private String[] P029H4_A130BarCodPar ;
   private java.math.BigDecimal[] P029H4_A184BarMtr ;
   private boolean[] P029H4_n184BarMtr ;
   private java.math.BigDecimal[] P029H4_A870BarTotMtr ;
   private boolean[] P029H4_n870BarTotMtr ;
}

final  class pmtragr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P029H4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T2.BarTotMtr, 0) AS BarTotMtr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
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
               return;
      }
   }

}

