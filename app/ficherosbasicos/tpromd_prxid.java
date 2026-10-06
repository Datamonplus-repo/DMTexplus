package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_prxid extends GXProcedure
{
   public tpromd_prxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_prxid.class ), "" );
   }

   public tpromd_prxid( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      tpromd_prxid.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short[] aP2 )
   {
      tpromd_prxid.this.AV8EmprCod = aP0;
      tpromd_prxid.this.AV10clicod = aP1;
      tpromd_prxid.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0ABD3 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV10clicod)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P0ABD3_A40000GXC1[0] ;
         n40000GXC1 = P0ABD3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV9PMDCod = (short)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tpromd_prxid.this.AV9PMDCod;
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
      P0ABD3_A40000GXC1 = new short[1] ;
      P0ABD3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tpromd_prxid__default(),
         new Object[] {
             new Object[] {
            P0ABD3_A40000GXC1, P0ABD3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9PMDCod ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private int AV10clicod ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P0ABD3_A40000GXC1 ;
   private boolean[] P0ABD3_n40000GXC1 ;
}

final  class tpromd_prxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABD3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(PMDCod) AS GXC1 FROM TXPProMD WHERE (EmprCod = ?) AND (CliCod = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

