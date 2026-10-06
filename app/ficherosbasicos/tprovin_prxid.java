package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tprovin_prxid extends GXProcedure
{
   public tprovin_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprovin_prxid.class ), "" );
   }

   public tprovin_prxid( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( )
   {
      tprovin_prxid.this.aP0 = new short[] {0};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( short[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( short[] aP0 )
   {
      tprovin_prxid.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10PrvCod = (short)(0) ;
      /* Using cursor P0A0S2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A781PrvCod = P0A0S2_A781PrvCod[0] ;
         AV10PrvCod = A781PrvCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV10PrvCod = (short)(AV10PrvCod+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = tprovin_prxid.this.AV10PrvCod;
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
      P0A0S2_A781PrvCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tprovin_prxid__default(),
         new Object[] {
             new Object[] {
            P0A0S2_A781PrvCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10PrvCod ;
   private short A781PrvCod ;
   private short Gx_err ;
   private String scmdbuf ;
   private short[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A0S2_A781PrvCod ;
}

final  class tprovin_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A0S2", "SELECT * FROM (SELECT PrvCod FROM TXPPROVIN ORDER BY PrvCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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

