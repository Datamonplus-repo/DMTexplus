package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppieune extends GXProcedure
{
   public ppieune( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppieune.class ), "" );
   }

   public ppieune( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ppieune.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      ppieune.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppieune.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00ZV3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A374DisNumPie = P00ZV3_A374DisNumPie[0] ;
         A375DisNumUni = P00ZV3_A375DisNumUni[0] ;
         A1054TotNPie = P00ZV3_A1054TotNPie[0] ;
         A1055TotNUni = P00ZV3_A1055TotNUni[0] ;
         A1054TotNPie = P00ZV3_A1054TotNPie[0] ;
         A1055TotNUni = P00ZV3_A1055TotNUni[0] ;
         A374DisNumPie = ((A1054TotNPie>0) ? A1054TotNPie : A374DisNumPie) ;
         A375DisNumUni = ((A1055TotNUni.doubleValue()>0) ? A1055TotNUni : DecimalUtil.doubleToDec(A374DisNumPie)) ;
         /* Using cursor P00ZV4 */
         pr_default.execute(1, new Object[] {Short.valueOf(A374DisNumPie), A375DisNumUni, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppieune.this.A396EmprCod;
      this.aP1[0] = ppieune.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppieune");
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
      P00ZV3_A396EmprCod = new String[] {""} ;
      P00ZV3_A361DisCod = new int[1] ;
      P00ZV3_A374DisNumPie = new short[1] ;
      P00ZV3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00ZV3_A1054TotNPie = new short[1] ;
      P00ZV3_A1055TotNUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A1055TotNUni = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppieune__default(),
         new Object[] {
             new Object[] {
            P00ZV3_A396EmprCod, P00ZV3_A361DisCod, P00ZV3_A374DisNumPie, P00ZV3_A375DisNumUni, P00ZV3_A1054TotNPie, P00ZV3_A1055TotNUni
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A374DisNumPie ;
   private short A1054TotNPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A1055TotNUni ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P00ZV3_A396EmprCod ;
   private int[] P00ZV3_A361DisCod ;
   private short[] P00ZV3_A374DisNumPie ;
   private java.math.BigDecimal[] P00ZV3_A375DisNumUni ;
   private short[] P00ZV3_A1054TotNPie ;
   private java.math.BigDecimal[] P00ZV3_A1055TotNUni ;
}

final  class ppieune__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00ZV3", "SELECT T1.EmprCod, T1.DisCod, T1.DisNumPie, T1.DisNumUni, COALESCE( T2.TotNPie, 0) AS TotNPie, COALESCE( T2.TotNUni, 0) AS TotNUni FROM (TXPDISPOS T1 LEFT JOIN (SELECT SUM(DisComPie) AS TotNPie, EmprCod, DisCod, SUM(DisComMtr) AS TotNUni FROM TXPDISCOM GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00ZV4", "UPDATE TXPDISPOS SET DisNumPie=?, DisNumUni=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
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
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

