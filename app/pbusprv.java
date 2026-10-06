package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprv extends GXProcedure
{
   public pbusprv( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprv.class ), "" );
   }

   public pbusprv( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pbusprv.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pbusprv.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprv.this.A795PrvNum = aP1[0];
      this.aP1 = aP1;
      pbusprv.this.AV15Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprv.this.A396EmprCod;
      this.aP1[0] = pbusprv.this.A795PrvNum;
      this.aP2[0] = pbusprv.this.AV15Flag;
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
      P001I2_A396EmprCod = new String[] {""} ;
      P001I2_A795PrvNum = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprv__default(),
         new Object[] {
             new Object[] {
            P001I2_A396EmprCod, P001I2_A795PrvNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private int A795PrvNum ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P001I2_A396EmprCod ;
   private int[] P001I2_A795PrvNum ;
}

final  class pbusprv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001I2", "SELECT EmprCod, PrvNum FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

