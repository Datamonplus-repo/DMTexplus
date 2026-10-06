package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranobservacion_proxid extends GXProcedure
{
   public albaranobservacion_proxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranobservacion_proxid.class ), "" );
   }

   public albaranobservacion_proxid( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           long aP1 )
   {
      albaranobservacion_proxid.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             byte[] aP2 )
   {
      albaranobservacion_proxid.this.AV9EmprCod = aP0;
      albaranobservacion_proxid.this.AV10AlbProCod = aP1;
      albaranobservacion_proxid.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09VB3 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Long.valueOf(AV10AlbProCod)});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09VB3_A40000GXC1[0] ;
         n40000GXC1 = P09VB3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (byte)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV8AlbPObsLin = (byte)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = albaranobservacion_proxid.this.AV8AlbPObsLin;
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
      P09VB3_A40000GXC1 = new byte[1] ;
      P09VB3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranobservacion_proxid__default(),
         new Object[] {
             new Object[] {
            P09VB3_A40000GXC1, P09VB3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8AlbPObsLin ;
   private byte A40000GXC1 ;
   private short Gx_err ;
   private long AV10AlbProCod ;
   private String AV9EmprCod ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09VB3_A40000GXC1 ;
   private boolean[] P09VB3_n40000GXC1 ;
}

final  class albaranobservacion_proxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VB3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(AlbPObsLin) AS GXC1 FROM TXPOBSALB WHERE (EmprCod = ?) AND (AlbProCod = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

