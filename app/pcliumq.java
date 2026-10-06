package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcliumq extends GXProcedure
{
   public pcliumq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcliumq.class ), "" );
   }

   public pcliumq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      pcliumq.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pcliumq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcliumq.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcliumq.this.AV8CliUltMq = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03172 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7064CliUltMq = P03172_A7064CliUltMq[0] ;
         AV8CliUltMq = A7064CliUltMq ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcliumq.this.A396EmprCod;
      this.aP1[0] = pcliumq.this.A252CliCod;
      this.aP2[0] = pcliumq.this.AV8CliUltMq;
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
      P03172_A396EmprCod = new String[] {""} ;
      P03172_A252CliCod = new int[1] ;
      P03172_A7064CliUltMq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcliumq__default(),
         new Object[] {
             new Object[] {
            P03172_A396EmprCod, P03172_A252CliCod, P03172_A7064CliUltMq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8CliUltMq ;
   private short A7064CliUltMq ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03172_A396EmprCod ;
   private int[] P03172_A252CliCod ;
   private short[] P03172_A7064CliUltMq ;
}

final  class pcliumq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03172", "SELECT EmprCod, CliCod, CliUltMq FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

