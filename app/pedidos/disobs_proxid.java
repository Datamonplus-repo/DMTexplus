package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disobs_proxid extends GXProcedure
{
   public disobs_proxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disobs_proxid.class ), "" );
   }

   public disobs_proxid( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 )
   {
      disobs_proxid.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte[] aP2 )
   {
      disobs_proxid.this.AV10EmprCod = aP0;
      disobs_proxid.this.AV8DisCod = aP1;
      disobs_proxid.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09VT3 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV8DisCod)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09VT3_A40000GXC1[0] ;
         n40000GXC1 = P09VT3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (byte)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV9DisObsLin = (byte)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = disobs_proxid.this.AV9DisObsLin;
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
      P09VT3_A40000GXC1 = new byte[1] ;
      P09VT3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs_proxid__default(),
         new Object[] {
             new Object[] {
            P09VT3_A40000GXC1, P09VT3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9DisObsLin ;
   private byte A40000GXC1 ;
   private short Gx_err ;
   private int AV8DisCod ;
   private String AV10EmprCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09VT3_A40000GXC1 ;
   private boolean[] P09VT3_n40000GXC1 ;
}

final  class disobs_proxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VT3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(DisObsLin) AS GXC1 FROM TXPOBSERV WHERE (EmprCod = ?) AND (DisCod = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

