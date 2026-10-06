package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tdivisa_prxid extends GXProcedure
{
   public tdivisa_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdivisa_prxid.class ), "" );
   }

   public tdivisa_prxid( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( )
   {
      tdivisa_prxid.this.aP0 = new byte[] {0};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( byte[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( byte[] aP0 )
   {
      tdivisa_prxid.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10DivCod = (byte)(0) ;
      /* Using cursor P0A0D2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3099DivCod = P0A0D2_A3099DivCod[0] ;
         AV10DivCod = A3099DivCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10DivCod = (byte)(AV10DivCod+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = tdivisa_prxid.this.AV10DivCod;
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
      P0A0D2_A3099DivCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tdivisa_prxid__default(),
         new Object[] {
             new Object[] {
            P0A0D2_A3099DivCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10DivCod ;
   private byte A3099DivCod ;
   private short Gx_err ;
   private String scmdbuf ;
   private byte[] aP0 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0A0D2_A3099DivCod ;
}

final  class tdivisa_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0D2", "SELECT * FROM (SELECT DivCod FROM TXPDIVISA ORDER BY DivCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

