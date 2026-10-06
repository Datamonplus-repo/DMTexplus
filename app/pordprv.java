package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordprv extends GXProcedure
{
   public pordprv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordprv.class ), "" );
   }

   public pordprv( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 )
   {
      pordprv.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 )
   {
      pordprv.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pordprv.this.A779PrvAny = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n330DifEstCa1 = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00462 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A779PrvAny)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
      /* End optimized UPDATE. */
      /* Using cursor P00463 */
      pr_default.execute(1, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A779PrvAny)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A330DifEstCa1 = P00463_A330DifEstCa1[0] ;
         n330DifEstCa1 = P00463_n330DifEstCa1[0] ;
         A795PrvNum = P00463_A795PrvNum[0] ;
         if ( P00463_A779PrvAny[0] == A779PrvAny )
         {
            /* Using cursor P00464 */
            pr_default.execute(2, new Object[] {A396EmprCod});
            A3915EmpNumDec = P00464_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P00464_n3915EmpNumDec[0] ;
            /* Using cursor P00466 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny)});
            if ( (pr_default.getStatus(3) != 101) )
            {
               A789PrvEstCa1 = P00466_A789PrvEstCa1[0] ;
               n789PrvEstCa1 = P00466_n789PrvEstCa1[0] ;
            }
            else
            {
               A789PrvEstCa1 = DecimalUtil.doubleToDec(0) ;
               n789PrvEstCa1 = false ;
            }
            if ( A789PrvEstCa1.doubleValue() < 0 )
            {
               AV15PrvEstCa1 = A789PrvEstCa1.negate() ;
            }
            else
            {
               AV15PrvEstCa1 = A789PrvEstCa1 ;
            }
            if ( A3915EmpNumDec == 0 )
            {
               A330DifEstCa1 = DecimalUtil.doubleToDec(999999999).subtract(AV15PrvEstCa1) ;
               n330DifEstCa1 = false ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  A330DifEstCa1 = DecimalUtil.stringToDec("999999999.99").subtract(AV15PrvEstCa1) ;
                  n330DifEstCa1 = false ;
               }
            }
            /* Using cursor P00467 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n330DifEstCa1), A330DifEstCa1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pordprv.this.A396EmprCod;
      this.aP1[0] = pordprv.this.A779PrvAny;
      Application.commitDataStores(context, remoteHandle, pr_default, "pordprv");
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
      P00463_A396EmprCod = new String[] {""} ;
      P00463_A779PrvAny = new short[1] ;
      P00463_A330DifEstCa1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00463_n330DifEstCa1 = new boolean[] {false} ;
      P00463_A795PrvNum = new int[1] ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      P00464_A3915EmpNumDec = new byte[1] ;
      P00464_n3915EmpNumDec = new boolean[] {false} ;
      P00466_A789PrvEstCa1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00466_n789PrvEstCa1 = new boolean[] {false} ;
      A789PrvEstCa1 = DecimalUtil.ZERO ;
      AV15PrvEstCa1 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pordprv__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00463_A396EmprCod, P00463_A779PrvAny, P00463_A330DifEstCa1, P00463_n330DifEstCa1, P00463_A795PrvNum
            }
            , new Object[] {
            P00464_A3915EmpNumDec, P00464_n3915EmpNumDec
            }
            , new Object[] {
            P00466_A789PrvEstCa1, P00466_n789PrvEstCa1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int A795PrvNum ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private java.math.BigDecimal A789PrvEstCa1 ;
   private java.math.BigDecimal AV15PrvEstCa1 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n330DifEstCa1 ;
   private boolean n3915EmpNumDec ;
   private boolean n789PrvEstCa1 ;
   private short[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00463_A396EmprCod ;
   private short[] P00463_A779PrvAny ;
   private java.math.BigDecimal[] P00463_A330DifEstCa1 ;
   private boolean[] P00463_n330DifEstCa1 ;
   private int[] P00463_A795PrvNum ;
   private byte[] P00464_A3915EmpNumDec ;
   private boolean[] P00464_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00466_A789PrvEstCa1 ;
   private boolean[] P00466_n789PrvEstCa1 ;
}

final  class pordprv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00462", "UPDATE TXPCPRVES SET DifEstCa1=0  WHERE (EmprCod = ?) AND (PrvAny = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
         ,new ForEachCursor("P00463", "SELECT EmprCod, PrvAny, DifEstCa1, PrvNum FROM TXPCPRVES WHERE (EmprCod = ?) AND ((EmprCod = ?) AND (PrvAny = ?)) ORDER BY EmprCod, PrvNum, PrvAny  FOR UPDATE OF DifEstCa1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00464", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00466", "SELECT COALESCE( T1.PrvEstCa1, 0) AS PrvEstCa1 FROM (SELECT SUM(PrvEstCm1) AS PrvEstCa1, EmprCod, PrvNum, PrvAny FROM TXPLPRVES GROUP BY EmprCod, PrvNum, PrvAny ) T1 WHERE T1.EmprCod = ? AND T1.PrvNum = ? AND T1.PrvAny = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00467", "UPDATE TXPCPRVES SET DifEstCa1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

