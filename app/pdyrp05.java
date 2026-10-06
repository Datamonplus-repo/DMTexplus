package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp05 extends GXProcedure
{
   public pdyrp05( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp05.class ), "" );
   }

   public pdyrp05( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 )
   {
      pdyrp05.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pdyrp05.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp05.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pdyrp05.this.AV10ExiRes = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P098W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A707PrdFacCon = P098W2_A707PrdFacCon[0] ;
         A685PrdCanRes = P098W2_A685PrdCanRes[0] ;
         if ( DecimalUtil.compareTo((A685PrdCanRes.add((AV10ExiRes.multiply(A707PrdFacCon)))), DecimalUtil.stringToDec("9999999.9999")) > 0 )
         {
         }
         else
         {
            A685PrdCanRes = A685PrdCanRes.add(((AV10ExiRes.multiply(A707PrdFacCon)))) ;
            A685PrdCanRes = ((A685PrdCanRes.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A685PrdCanRes) ;
         }
         /* Using cursor P098W3 */
         pr_default.execute(1, new Object[] {A685PrdCanRes, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp05.this.A396EmprCod;
      this.aP1[0] = pdyrp05.this.A719PrdNum;
      this.aP2[0] = pdyrp05.this.AV10ExiRes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdyrp05");
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
      P098W2_A396EmprCod = new String[] {""} ;
      P098W2_A719PrdNum = new String[] {""} ;
      P098W2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P098W2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp05__default(),
         new Object[] {
             new Object[] {
            P098W2_A396EmprCod, P098W2_A719PrdNum, P098W2_A707PrdFacCon, P098W2_A685PrdCanRes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV10ExiRes ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P098W2_A396EmprCod ;
   private String[] P098W2_A719PrdNum ;
   private java.math.BigDecimal[] P098W2_A707PrdFacCon ;
   private java.math.BigDecimal[] P098W2_A685PrdCanRes ;
}

final  class pdyrp05__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P098W2", "SELECT EmprCod, PrdNum, PrdFacCon, PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P098W3", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

