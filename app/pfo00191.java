package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfo00191 extends GXProcedure
{
   public pfo00191( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfo00191.class ), "" );
   }

   public pfo00191( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            String[] aP5 ,
                            int[] aP6 )
   {
      pfo00191.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 )
   {
      pfo00191.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfo00191.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfo00191.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfo00191.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfo00191.this.AV8RecTotKgm = aP4[0];
      this.aP4 = aP4;
      pfo00191.this.AV9MaqCod = aP5[0];
      this.aP5 = aP5;
      pfo00191.this.AV10RecVolPrd = aP6[0];
      this.aP6 = aP6;
      pfo00191.this.AV11recLinmaq = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8RecTotKgm = DecimalUtil.doubleToDec(0) ;
      AV10RecVolPrd = 0 ;
      AV9MaqCod = GXutil.space( (short)(6)) ;
      /* Using cursor P019W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV11recLinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P019W2_A2804RecLinMaq[0] ;
         A2805RecVolPrd = P019W2_A2805RecVolPrd[0] ;
         A602MaqCod = P019W2_A602MaqCod[0] ;
         AV10RecVolPrd = A2805RecVolPrd ;
         AV9MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P019W5 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A166BarKgm = P019W5_A166BarKgm[0] ;
         n166BarKgm = P019W5_n166BarKgm[0] ;
         A219BarTotAgr = P019W5_A219BarTotAgr[0] ;
         n219BarTotAgr = P019W5_n219BarTotAgr[0] ;
         A219BarTotAgr = P019W5_A219BarTotAgr[0] ;
         n219BarTotAgr = P019W5_n219BarTotAgr[0] ;
         A166BarKgm = P019W5_A166BarKgm[0] ;
         n166BarKgm = P019W5_n166BarKgm[0] ;
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
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfo00191.this.A396EmprCod;
      this.aP1[0] = pfo00191.this.A129BarCod;
      this.aP2[0] = pfo00191.this.A132BarCodReo;
      this.aP3[0] = pfo00191.this.A130BarCodPar;
      this.aP4[0] = pfo00191.this.AV8RecTotKgm;
      this.aP5[0] = pfo00191.this.AV9MaqCod;
      this.aP6[0] = pfo00191.this.AV10RecVolPrd;
      this.aP7[0] = pfo00191.this.AV11recLinmaq;
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
      P019W2_A396EmprCod = new String[] {""} ;
      P019W2_A129BarCod = new int[1] ;
      P019W2_A132BarCodReo = new byte[1] ;
      P019W2_A130BarCodPar = new String[] {""} ;
      P019W2_A2804RecLinMaq = new short[1] ;
      P019W2_A2805RecVolPrd = new int[1] ;
      P019W2_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      P019W5_A396EmprCod = new String[] {""} ;
      P019W5_A129BarCod = new int[1] ;
      P019W5_A132BarCodReo = new byte[1] ;
      P019W5_A130BarCodPar = new String[] {""} ;
      P019W5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019W5_n166BarKgm = new boolean[] {false} ;
      P019W5_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019W5_n219BarTotAgr = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfo00191__default(),
         new Object[] {
             new Object[] {
            P019W2_A396EmprCod, P019W2_A129BarCod, P019W2_A132BarCodReo, P019W2_A130BarCodPar, P019W2_A2804RecLinMaq, P019W2_A2805RecVolPrd, P019W2_A602MaqCod
            }
            , new Object[] {
            P019W5_A396EmprCod, P019W5_A129BarCod, P019W5_A132BarCodReo, P019W5_A130BarCodPar, P019W5_A166BarKgm, P019W5_n166BarKgm, P019W5_A219BarTotAgr, P019W5_n219BarTotAgr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV11recLinmaq ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV10RecVolPrd ;
   private int A2805RecVolPrd ;
   private java.math.BigDecimal AV8RecTotKgm ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private boolean n166BarKgm ;
   private boolean n219BarTotAgr ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P019W2_A396EmprCod ;
   private int[] P019W2_A129BarCod ;
   private byte[] P019W2_A132BarCodReo ;
   private String[] P019W2_A130BarCodPar ;
   private short[] P019W2_A2804RecLinMaq ;
   private int[] P019W2_A2805RecVolPrd ;
   private String[] P019W2_A602MaqCod ;
   private String[] P019W5_A396EmprCod ;
   private int[] P019W5_A129BarCod ;
   private byte[] P019W5_A132BarCodReo ;
   private String[] P019W5_A130BarCodPar ;
   private java.math.BigDecimal[] P019W5_A166BarKgm ;
   private boolean[] P019W5_n166BarKgm ;
   private java.math.BigDecimal[] P019W5_A219BarTotAgr ;
   private boolean[] P019W5_n219BarTotAgr ;
}

final  class pfo00191__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019W2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecVolPrd, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P019W5", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 1 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

