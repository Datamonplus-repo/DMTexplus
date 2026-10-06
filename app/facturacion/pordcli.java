package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pordcli extends GXProcedure
{
   public pordcli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pordcli.class ), "" );
   }

   public pordcli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pordcli.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      pordcli.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pordcli.this.AV15PCli = aP1[0];
      this.aP1 = aP1;
      pordcli.this.AV16UCli = aP2[0];
      this.aP2 = aP2;
      pordcli.this.AV17Anyo = aP3[0];
      this.aP3 = aP3;
      pordcli.this.AV18Prio = aP4[0];
      this.aP4 = aP4;
      pordcli.this.AV19TotCom = aP5[0];
      this.aP5 = aP5;
      pordcli.this.AV20EstSerFac = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19TotCom = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00532 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15PCli), Short.valueOf(AV17Anyo), AV20EstSerFac, A396EmprCod, Integer.valueOf(AV15PCli), Short.valueOf(AV17Anyo), AV20EstSerFac, Integer.valueOf(AV16UCli)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2755EstSerFac = P00532_A2755EstSerFac[0] ;
         A425EstAny = P00532_A425EstAny[0] ;
         A252CliCod = P00532_A252CliCod[0] ;
         A902AcuOrd0 = P00532_A902AcuOrd0[0] ;
         n902AcuOrd0 = P00532_n902AcuOrd0[0] ;
         /* Using cursor P00533 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         A3915EmpNumDec = P00533_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00533_n3915EmpNumDec[0] ;
         /* Using cursor P00535 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A1432AcuCli0 = P00535_A1432AcuCli0[0] ;
            A1433AcuCli1 = P00535_A1433AcuCli1[0] ;
         }
         else
         {
            A1432AcuCli0 = DecimalUtil.doubleToDec(0) ;
            A1433AcuCli1 = DecimalUtil.doubleToDec(0) ;
         }
         if ( A1432AcuCli0.doubleValue() < 0 )
         {
            AV21AcuCli0 = A1432AcuCli0.negate() ;
         }
         else
         {
            AV21AcuCli0 = A1432AcuCli0 ;
         }
         if ( A1433AcuCli1.doubleValue() < 0 )
         {
            AV22AcuCli1 = A1433AcuCli1.negate() ;
         }
         else
         {
            AV22AcuCli1 = A1433AcuCli1 ;
         }
         if ( GXutil.strcmp(AV18Prio, "2") == 0 )
         {
            AV19TotCom = AV19TotCom.add(A1432AcuCli0).add(A1433AcuCli1) ;
            if ( A3915EmpNumDec == 0 )
            {
               A902AcuOrd0 = DecimalUtil.doubleToDec(9999999999L).subtract(AV21AcuCli0).subtract(AV22AcuCli1) ;
               n902AcuOrd0 = false ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  A902AcuOrd0 = DecimalUtil.stringToDec("9999999999.99").subtract(AV21AcuCli0).subtract(AV22AcuCli1) ;
                  n902AcuOrd0 = false ;
               }
            }
         }
         else
         {
            if ( GXutil.strcmp(AV18Prio, "0") == 0 )
            {
               AV19TotCom = AV19TotCom.add(A1432AcuCli0) ;
               if ( A3915EmpNumDec == 0 )
               {
                  A902AcuOrd0 = DecimalUtil.doubleToDec(9999999999L).subtract(AV21AcuCli0) ;
                  n902AcuOrd0 = false ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     A902AcuOrd0 = DecimalUtil.stringToDec("9999999999.99").subtract(AV21AcuCli0) ;
                     n902AcuOrd0 = false ;
                  }
               }
            }
            if ( GXutil.strcmp(AV18Prio, "1") == 0 )
            {
               AV19TotCom = AV19TotCom.add(A1433AcuCli1) ;
               if ( A3915EmpNumDec == 0 )
               {
                  A902AcuOrd0 = DecimalUtil.doubleToDec(9999999999L).subtract(AV22AcuCli1) ;
                  n902AcuOrd0 = false ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     A902AcuOrd0 = DecimalUtil.stringToDec("9999999999.99").subtract(AV22AcuCli1) ;
                     n902AcuOrd0 = false ;
                  }
               }
            }
         }
         /* Using cursor P00536 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n902AcuOrd0), A902AcuOrd0, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A425EstAny), A2755EstSerFac});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCLI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pordcli.this.A396EmprCod;
      this.aP1[0] = pordcli.this.AV15PCli;
      this.aP2[0] = pordcli.this.AV16UCli;
      this.aP3[0] = pordcli.this.AV17Anyo;
      this.aP4[0] = pordcli.this.AV18Prio;
      this.aP5[0] = pordcli.this.AV19TotCom;
      this.aP6[0] = pordcli.this.AV20EstSerFac;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pordcli");
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
      P00532_A396EmprCod = new String[] {""} ;
      P00532_A2755EstSerFac = new String[] {""} ;
      P00532_A425EstAny = new short[1] ;
      P00532_A252CliCod = new int[1] ;
      P00532_A902AcuOrd0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00532_n902AcuOrd0 = new boolean[] {false} ;
      A2755EstSerFac = "" ;
      A902AcuOrd0 = DecimalUtil.ZERO ;
      P00533_A3915EmpNumDec = new byte[1] ;
      P00533_n3915EmpNumDec = new boolean[] {false} ;
      P00535_A1432AcuCli0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00535_A1433AcuCli1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1432AcuCli0 = DecimalUtil.ZERO ;
      A1433AcuCli1 = DecimalUtil.ZERO ;
      AV21AcuCli0 = DecimalUtil.ZERO ;
      AV22AcuCli1 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pordcli__default(),
         new Object[] {
             new Object[] {
            P00532_A396EmprCod, P00532_A2755EstSerFac, P00532_A425EstAny, P00532_A252CliCod, P00532_A902AcuOrd0, P00532_n902AcuOrd0
            }
            , new Object[] {
            P00533_A3915EmpNumDec, P00533_n3915EmpNumDec
            }
            , new Object[] {
            P00535_A1432AcuCli0, P00535_A1433AcuCli1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private short AV17Anyo ;
   private short A425EstAny ;
   private short Gx_err ;
   private int AV15PCli ;
   private int AV16UCli ;
   private int A252CliCod ;
   private java.math.BigDecimal AV19TotCom ;
   private java.math.BigDecimal A902AcuOrd0 ;
   private java.math.BigDecimal A1432AcuCli0 ;
   private java.math.BigDecimal A1433AcuCli1 ;
   private java.math.BigDecimal AV21AcuCli0 ;
   private java.math.BigDecimal AV22AcuCli1 ;
   private String A396EmprCod ;
   private String AV18Prio ;
   private String AV20EstSerFac ;
   private String scmdbuf ;
   private String A2755EstSerFac ;
   private boolean n902AcuOrd0 ;
   private boolean n3915EmpNumDec ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00532_A396EmprCod ;
   private String[] P00532_A2755EstSerFac ;
   private short[] P00532_A425EstAny ;
   private int[] P00532_A252CliCod ;
   private java.math.BigDecimal[] P00532_A902AcuOrd0 ;
   private boolean[] P00532_n902AcuOrd0 ;
   private byte[] P00533_A3915EmpNumDec ;
   private boolean[] P00533_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00535_A1432AcuCli0 ;
   private java.math.BigDecimal[] P00535_A1433AcuCli1 ;
}

final  class pordcli__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00532", "SELECT EmprCod, EstSerFac, EstAny, CliCod, AcuOrd0 FROM TXPCESCLI WHERE (EmprCod = ? AND CliCod >= ? AND EstAny = ? AND EstSerFac = ?) AND ((EmprCod = ? and CliCod >= ? and EstAny = ? and EstSerFac = ?) AND (CliCod <= ?)) ORDER BY EmprCod, CliCod, EstAny, EstSerFac  FOR UPDATE OF AcuOrd0 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00533", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00535", "SELECT COALESCE( T1.AcuCli0, 0) AS AcuCli0, COALESCE( T1.AcuCli1, 0) AS AcuCli1 FROM (SELECT SUM(ImpCli0) AS AcuCli0, EmprCod, CliCod, EstAny, EstSerFac, SUM(ImpCli1) AS AcuCli1 FROM TXPLESCLI GROUP BY EmprCod, CliCod, EstAny, EstSerFac ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.EstAny = ? AND T1.EstSerFac = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00536", "UPDATE TXPCESCLI SET AcuOrd0=?  WHERE EmprCod = ? AND CliCod = ? AND EstAny = ? AND EstSerFac = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESCLI")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 3 :
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
               stmt.setString(5, (String)parms[5], 3);
               return;
      }
   }

}

