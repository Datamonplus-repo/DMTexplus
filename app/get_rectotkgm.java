package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_rectotkgm extends GXProcedure
{
   public get_rectotkgm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_rectotkgm.class ), "" );
   }

   public get_rectotkgm( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 ,
                                           short aP4 )
   {
      get_rectotkgm.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      get_rectotkgm.this.A396EmprCod = aP0;
      get_rectotkgm.this.A129BarCod = aP1;
      get_rectotkgm.this.A132BarCodReo = aP2;
      get_rectotkgm.this.A130BarCodPar = aP3;
      get_rectotkgm.this.A2804RecLinMaq = aP4;
      get_rectotkgm.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8RecTotKgm = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ALL4 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A166BarKgm = P0ALL4_A166BarKgm[0] ;
         n166BarKgm = P0ALL4_n166BarKgm[0] ;
         A219BarTotAgr = P0ALL4_A219BarTotAgr[0] ;
         n219BarTotAgr = P0ALL4_n219BarTotAgr[0] ;
         A219BarTotAgr = P0ALL4_A219BarTotAgr[0] ;
         n219BarTotAgr = P0ALL4_n219BarTotAgr[0] ;
         A166BarKgm = P0ALL4_A166BarKgm[0] ;
         n166BarKgm = P0ALL4_n166BarKgm[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         AV8RecTotKgm = A812RecTotKgm ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = get_rectotkgm.this.AV8RecTotKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8RecTotKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ALL4_A396EmprCod = new String[] {""} ;
      P0ALL4_A129BarCod = new int[1] ;
      P0ALL4_A132BarCodReo = new byte[1] ;
      P0ALL4_A130BarCodPar = new String[] {""} ;
      P0ALL4_A2804RecLinMaq = new short[1] ;
      P0ALL4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALL4_n166BarKgm = new boolean[] {false} ;
      P0ALL4_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ALL4_n219BarTotAgr = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.get_rectotkgm__default(),
         new Object[] {
             new Object[] {
            P0ALL4_A396EmprCod, P0ALL4_A129BarCod, P0ALL4_A132BarCodReo, P0ALL4_A130BarCodPar, P0ALL4_A2804RecLinMaq, P0ALL4_A166BarKgm, P0ALL4_n166BarKgm, P0ALL4_A219BarTotAgr, P0ALL4_n219BarTotAgr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV8RecTotKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALL4_A396EmprCod ;
   private int[] P0ALL4_A129BarCod ;
   private byte[] P0ALL4_A132BarCodReo ;
   private String[] P0ALL4_A130BarCodPar ;
   private short[] P0ALL4_A2804RecLinMaq ;
   private java.math.BigDecimal[] P0ALL4_A166BarKgm ;
   private boolean[] P0ALL4_n166BarKgm ;
   private java.math.BigDecimal[] P0ALL4_A219BarTotAgr ;
   private boolean[] P0ALL4_n219BarTotAgr ;
}

final  class get_rectotkgm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALL4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPRECMAQ T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

