package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preciounico_prc extends GXProcedure
{
   public preciounico_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preciounico_prc.class ), "" );
   }

   public preciounico_prc( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      preciounico_prc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      preciounico_prc.this.A396EmprCod = aP0;
      preciounico_prc.this.A361DisCod = aP1;
      preciounico_prc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8baracc = "N" ;
      /* Using cursor P09KV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5252DisAcc = P09KV2_A5252DisAcc[0] ;
         AV8baracc = A5252DisAcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = preciounico_prc.this.AV8baracc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8baracc = "" ;
      scmdbuf = "" ;
      P09KV2_A396EmprCod = new String[] {""} ;
      P09KV2_A361DisCod = new int[1] ;
      P09KV2_A5252DisAcc = new String[] {""} ;
      A5252DisAcc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.preciounico_prc__default(),
         new Object[] {
             new Object[] {
            P09KV2_A396EmprCod, P09KV2_A361DisCod, P09KV2_A5252DisAcc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV8baracc ;
   private String scmdbuf ;
   private String A5252DisAcc ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09KV2_A396EmprCod ;
   private int[] P09KV2_A361DisCod ;
   private String[] P09KV2_A5252DisAcc ;
}

final  class preciounico_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09KV2", "SELECT EmprCod, DisCod, DisAcc FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

