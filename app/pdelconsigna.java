package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelconsigna extends GXProcedure
{
   public pdelconsigna( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelconsigna.class ), "" );
   }

   public pdelconsigna( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 )
   {
      pdelconsigna.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pdelconsigna.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelconsigna.this.AV8PedCod = aP1[0];
      this.aP1 = aP1;
      pdelconsigna.this.AV9PrdNum = aP2[0];
      this.aP2 = aP2;
      pdelconsigna.this.AV10Almc_UniE = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05BJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A658PedCod = P05BJ2_A658PedCod[0] ;
         A667PedSit = P05BJ2_A667PedSit[0] ;
         /* Using cursor P05BJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), AV9PrdNum});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P05BJ3_A719PrdNum[0] ;
            A657PedCanEnt = P05BJ3_A657PedCanEnt[0] ;
            A659PedCum = P05BJ3_A659PedCum[0] ;
            A657PedCanEnt = A657PedCanEnt.subtract(AV10Almc_UniE) ;
            A659PedCum = httpContext.getMessage( "N", "") ;
            /* Using cursor P05BJ4 */
            pr_default.execute(2, new Object[] {A657PedCanEnt, A659PedCum, A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         A667PedSit = ((GXutil.strcmp(A667PedSit, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "N", "") : A667PedSit) ;
         /* Using cursor P05BJ5 */
         pr_default.execute(3, new Object[] {A667PedSit, A396EmprCod, Integer.valueOf(A658PedCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelconsigna.this.A396EmprCod;
      this.aP1[0] = pdelconsigna.this.AV8PedCod;
      this.aP2[0] = pdelconsigna.this.AV9PrdNum;
      this.aP3[0] = pdelconsigna.this.AV10Almc_UniE;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelconsigna");
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
      P05BJ2_A396EmprCod = new String[] {""} ;
      P05BJ2_A658PedCod = new int[1] ;
      P05BJ2_A667PedSit = new String[] {""} ;
      A667PedSit = "" ;
      P05BJ3_A396EmprCod = new String[] {""} ;
      P05BJ3_A658PedCod = new int[1] ;
      P05BJ3_A719PrdNum = new String[] {""} ;
      P05BJ3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05BJ3_A659PedCum = new String[] {""} ;
      A719PrdNum = "" ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelconsigna__default(),
         new Object[] {
             new Object[] {
            P05BJ2_A396EmprCod, P05BJ2_A658PedCod, P05BJ2_A667PedSit
            }
            , new Object[] {
            P05BJ3_A396EmprCod, P05BJ3_A658PedCod, P05BJ3_A719PrdNum, P05BJ3_A657PedCanEnt, P05BJ3_A659PedCum
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8PedCod ;
   private int A658PedCod ;
   private java.math.BigDecimal AV10Almc_UniE ;
   private java.math.BigDecimal A657PedCanEnt ;
   private String A396EmprCod ;
   private String AV9PrdNum ;
   private String scmdbuf ;
   private String A667PedSit ;
   private String A719PrdNum ;
   private String A659PedCum ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05BJ2_A396EmprCod ;
   private int[] P05BJ2_A658PedCod ;
   private String[] P05BJ2_A667PedSit ;
   private String[] P05BJ3_A396EmprCod ;
   private int[] P05BJ3_A658PedCod ;
   private String[] P05BJ3_A719PrdNum ;
   private java.math.BigDecimal[] P05BJ3_A657PedCanEnt ;
   private String[] P05BJ3_A659PedCum ;
}

final  class pdelconsigna__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05BJ2", "SELECT EmprCod, PedCod, PedSit FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05BJ3", "SELECT EmprCod, PedCod, PrdNum, PedCanEnt, PedCum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? and PrdNum = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05BJ4", "UPDATE TXPLPEDID SET PedCanEnt=?, PedCum=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
         ,new UpdateCursor("P05BJ5", "UPDATE TXPCPEDID SET PedSit=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

