package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putil181 extends GXProcedure
{
   public putil181( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putil181.class ), "" );
   }

   public putil181( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      putil181.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      putil181.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putil181.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00WX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A707PrdFacCon = P00WX2_A707PrdFacCon[0] ;
         A685PrdCanRes = P00WX2_A685PrdCanRes[0] ;
         A705PrdExiCC = P00WX2_A705PrdExiCC[0] ;
         AV18PrdNum = A719PrdNum ;
         AV19PrdCant = DecimalUtil.doubleToDec(0) ;
         /* Optimized group. */
         /* Using cursor P00WX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV18PrdNum});
         c686PrdCant = P00WX3_A686PrdCant[0] ;
         pr_default.close(1);
         AV19PrdCant = AV19PrdCant.add(c686PrdCant) ;
         /* End optimized group. */
         /* Optimized group. */
         /* Using cursor P00WX4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV18PrdNum});
         c2119RecEstCP = P00WX4_A2119RecEstCP[0] ;
         n2119RecEstCP = P00WX4_n2119RecEstCP[0] ;
         pr_default.close(2);
         AV19PrdCant = AV19PrdCant.add(c2119RecEstCP) ;
         /* End optimized group. */
         /* Optimized group. */
         /* Using cursor P00WX5 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV18PrdNum});
         c2670RecPasCP = P00WX5_A2670RecPasCP[0] ;
         n2670RecPasCP = P00WX5_n2670RecPasCP[0] ;
         pr_default.close(3);
         AV19PrdCant = AV19PrdCant.add(c2670RecPasCP) ;
         /* End optimized group. */
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
         {
            A685PrdCanRes = (AV19PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A705PrdExiCC = DecimalUtil.doubleToDec(0) ;
         }
         AV21Mensa = httpContext.getMessage( "Producto= ", "") + A719PrdNum + httpContext.getMessage( " Reserva= ", "") + GXutil.str( A685PrdCanRes, 12, 4) ;
         System.out.println( AV21Mensa );
         /* Using cursor P00WX6 */
         pr_default.execute(4, new Object[] {A685PrdCanRes, A705PrdExiCC, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = putil181.this.A396EmprCod;
      this.aP1[0] = putil181.this.A719PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "putil181");
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
      P00WX2_A396EmprCod = new String[] {""} ;
      P00WX2_A719PrdNum = new String[] {""} ;
      P00WX2_n719PrdNum = new boolean[] {false} ;
      P00WX2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WX2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WX2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      AV18PrdNum = "" ;
      AV19PrdCant = DecimalUtil.ZERO ;
      c686PrdCant = DecimalUtil.ZERO ;
      P00WX3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      c2119RecEstCP = DecimalUtil.ZERO ;
      P00WX4_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WX4_n2119RecEstCP = new boolean[] {false} ;
      c2670RecPasCP = DecimalUtil.ZERO ;
      P00WX5_A2670RecPasCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WX5_n2670RecPasCP = new boolean[] {false} ;
      AV21Mensa = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putil181__default(),
         new Object[] {
             new Object[] {
            P00WX2_A396EmprCod, P00WX2_A719PrdNum, P00WX2_A707PrdFacCon, P00WX2_A685PrdCanRes, P00WX2_A705PrdExiCC
            }
            , new Object[] {
            P00WX3_A686PrdCant
            }
            , new Object[] {
            P00WX4_A2119RecEstCP, P00WX4_n2119RecEstCP
            }
            , new Object[] {
            P00WX5_A2670RecPasCP, P00WX5_n2670RecPasCP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV19PrdCant ;
   private java.math.BigDecimal c686PrdCant ;
   private java.math.BigDecimal c2119RecEstCP ;
   private java.math.BigDecimal c2670RecPasCP ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private String AV18PrdNum ;
   private String AV21Mensa ;
   private boolean n719PrdNum ;
   private boolean n2119RecEstCP ;
   private boolean n2670RecPasCP ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WX2_A396EmprCod ;
   private String[] P00WX2_A719PrdNum ;
   private boolean[] P00WX2_n719PrdNum ;
   private java.math.BigDecimal[] P00WX2_A707PrdFacCon ;
   private java.math.BigDecimal[] P00WX2_A685PrdCanRes ;
   private java.math.BigDecimal[] P00WX2_A705PrdExiCC ;
   private java.math.BigDecimal[] P00WX3_A686PrdCant ;
   private java.math.BigDecimal[] P00WX4_A2119RecEstCP ;
   private boolean[] P00WX4_n2119RecEstCP ;
   private java.math.BigDecimal[] P00WX5_A2670RecPasCP ;
   private boolean[] P00WX5_n2670RecPasCP ;
}

final  class putil181__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WX2", "SELECT EmprCod, PrdNum, PrdFacCon, PrdCanRes, PrdExiCC FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WX3", "SELECT SUM(PrdCant) FROM TXPLRECET WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00WX4", "SELECT SUM(T1.RecEstCP) FROM (TXPRECPRD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T2.BarSit = 4 or T2.BarSitEst = 4) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00WX5", "SELECT SUM(T1.RecPasCP) FROM (TXPRECDEP T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T2.BarSit = 4 or T2.BarSitEst = 4) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00WX6", "UPDATE TXPPRODUC SET PrdCanRes=?, PrdExiCC=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               return;
      }
   }

}

