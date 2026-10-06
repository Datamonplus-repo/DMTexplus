package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disfas_proxid extends GXProcedure
{
   public disfas_proxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disfas_proxid.class ), "" );
   }

   public disfas_proxid( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 )
   {
      disfas_proxid.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short[] aP3 )
   {
      disfas_proxid.this.AV8EmprCod = aP0;
      disfas_proxid.this.AV9DisCod = aP1;
      disfas_proxid.this.AV10ProCod = aP2;
      disfas_proxid.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09VY3 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9DisCod), AV10ProCod});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09VY3_A40000GXC1[0] ;
         n40000GXC1 = P09VY3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV11DisFasLin = (short)(A40000GXC1+100) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = disfas_proxid.this.AV11DisFasLin;
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
      P09VY3_A40000GXC1 = new short[1] ;
      P09VY3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disfas_proxid__default(),
         new Object[] {
             new Object[] {
            P09VY3_A40000GXC1, P09VY3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11DisFasLin ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private int AV9DisCod ;
   private String AV8EmprCod ;
   private String AV10ProCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P09VY3_A40000GXC1 ;
   private boolean[] P09VY3_n40000GXC1 ;
}

final  class disfas_proxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VY3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(DisFasLin) AS GXC1 FROM TXPDISFAS WHERE (EmprCod = ?) AND (DisCod = ?) AND (ProCod = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

