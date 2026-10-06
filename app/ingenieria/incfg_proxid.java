package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class incfg_proxid extends GXProcedure
{
   public incfg_proxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( incfg_proxid.class ), "" );
   }

   public incfg_proxid( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( )
   {
      incfg_proxid.this.aP0 = new short[] {0};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( short[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( short[] aP0 )
   {
      incfg_proxid.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09X63 */
      pr_default.execute(0);
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09X63_A40000GXC1[0] ;
         n40000GXC1 = P09X63_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV8InCfgId = (short)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = incfg_proxid.this.AV8InCfgId;
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
      P09X63_A40000GXC1 = new short[1] ;
      P09X63_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.incfg_proxid__default(),
         new Object[] {
             new Object[] {
            P09X63_A40000GXC1, P09X63_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8InCfgId ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P09X63_A40000GXC1 ;
   private boolean[] P09X63_n40000GXC1 ;
}

final  class incfg_proxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09X63", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(InCfgId) AS GXC1 FROM TXPINCFG ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
      }
   }

}

