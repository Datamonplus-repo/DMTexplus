package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusmtd extends GXProcedure
{
   public pbusmtd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusmtd.class ), "" );
   }

   public pbusmtd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 )
   {
      pbusmtd.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      pbusmtd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusmtd.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pbusmtd.this.AV18DisMtsDib = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P036K2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4469DisCruMts = P036K2_A4469DisCruMts[0] ;
         AV18DisMtsDib = A4469DisCruMts ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusmtd.this.A396EmprCod;
      this.aP1[0] = pbusmtd.this.A361DisCod;
      this.aP2[0] = pbusmtd.this.AV18DisMtsDib;
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
      P036K2_A396EmprCod = new String[] {""} ;
      P036K2_A361DisCod = new int[1] ;
      P036K2_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4469DisCruMts = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusmtd__default(),
         new Object[] {
             new Object[] {
            P036K2_A396EmprCod, P036K2_A361DisCod, P036K2_A4469DisCruMts
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private java.math.BigDecimal AV18DisMtsDib ;
   private java.math.BigDecimal A4469DisCruMts ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P036K2_A396EmprCod ;
   private int[] P036K2_A361DisCod ;
   private java.math.BigDecimal[] P036K2_A4469DisCruMts ;
}

final  class pbusmtd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036K2", "SELECT EmprCod, DisCod, DisCruMts FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
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
      }
   }

}

