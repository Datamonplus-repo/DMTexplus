package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranguiatextolibre_proxid extends GXProcedure
{
   public albaranguiatextolibre_proxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiatextolibre_proxid.class ), "" );
   }

   public albaranguiatextolibre_proxid( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            long aP1 ,
                            int aP2 ,
                            byte aP3 ,
                            String aP4 )
   {
      albaranguiatextolibre_proxid.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short[] aP5 )
   {
      albaranguiatextolibre_proxid.this.AV13EmprCod = aP0;
      albaranguiatextolibre_proxid.this.AV9AlbProCod = aP1;
      albaranguiatextolibre_proxid.this.AV10BarCod = aP2;
      albaranguiatextolibre_proxid.this.AV12BarCodReo = aP3;
      albaranguiatextolibre_proxid.this.AV11BarCodPar = aP4;
      albaranguiatextolibre_proxid.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09VA3 */
      pr_default.execute(0, new Object[] {AV13EmprCod, Long.valueOf(AV9AlbProCod), Integer.valueOf(AV10BarCod), Byte.valueOf(AV12BarCodReo), AV11BarCodPar});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09VA3_A40000GXC1[0] ;
         n40000GXC1 = P09VA3_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV8AlbHdrLin = (short)(A40000GXC1+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = albaranguiatextolibre_proxid.this.AV8AlbHdrLin;
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
      P09VA3_A40000GXC1 = new short[1] ;
      P09VA3_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiatextolibre_proxid__default(),
         new Object[] {
             new Object[] {
            P09VA3_A40000GXC1, P09VA3_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarCodReo ;
   private short AV8AlbHdrLin ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private int AV10BarCod ;
   private long AV9AlbProCod ;
   private String AV13EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P09VA3_A40000GXC1 ;
   private boolean[] P09VA3_n40000GXC1 ;
}

final  class albaranguiatextolibre_proxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VA3", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(AlbHdrLin) AS GXC1 FROM TXPALBTXT WHERE (EmprCod = ?) AND (AlbProCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

