package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disqui_proxid extends GXProcedure
{
   public disqui_proxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disqui_proxid.class ), "" );
   }

   public disqui_proxid( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            short aP3 )
   {
      disqui_proxid.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             short[] aP4 )
   {
      disqui_proxid.this.AV8EmprCod = aP0;
      disqui_proxid.this.AV9DisCod = aP1;
      disqui_proxid.this.AV10ProCod = aP2;
      disqui_proxid.this.AV11DisFasLin = aP3;
      disqui_proxid.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09VZ3 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9DisCod), AV10ProCod, Short.valueOf(AV11DisFasLin)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09VZ3_A40000GXC1[0] ;
         n40000GXC1 = P09VZ3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV12DisQuiLin = (short)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = disqui_proxid.this.AV12DisQuiLin;
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
      P09VZ3_A40000GXC1 = new short[1] ;
      P09VZ3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disqui_proxid__default(),
         new Object[] {
             new Object[] {
            P09VZ3_A40000GXC1, P09VZ3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11DisFasLin ;
   private short AV12DisQuiLin ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private int AV9DisCod ;
   private String AV8EmprCod ;
   private String AV10ProCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09VZ3_A40000GXC1 ;
   private boolean[] P09VZ3_n40000GXC1 ;
}

final  class disqui_proxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VZ3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(DisQuiLin) AS GXC1 FROM TXPDISQUI WHERE (EmprCod = ?) AND (DisCod = ?) AND (ProCod = ?) AND (DisFasLin = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

