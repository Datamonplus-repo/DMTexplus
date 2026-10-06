package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranguiafase_proxid extends GXProcedure
{
   public albaranguiafase_proxid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguiafase_proxid.class ), "" );
   }

   public albaranguiafase_proxid( int remoteHandle ,
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
      albaranguiafase_proxid.this.aP5 = new short[] {0};
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
      albaranguiafase_proxid.this.AV8EmprCod = aP0;
      albaranguiafase_proxid.this.AV9AlbProCod = aP1;
      albaranguiafase_proxid.this.AV10BarCod = aP2;
      albaranguiafase_proxid.this.AV11BarCodReo = aP3;
      albaranguiafase_proxid.this.AV13BarCodPar = aP4;
      albaranguiafase_proxid.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09V93 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Long.valueOf(AV9AlbProCod), Integer.valueOf(AV10BarCod), Byte.valueOf(AV11BarCodReo), AV13BarCodPar});
      if ( (pr_default.getStatus(0) != 101) )
      {
         A40000GXC1 = P09V93_A40000GXC1[0] ;
         n40000GXC1 = P09V93_n40000GXC1[0] ;
      }
      else
      {
         A40000GXC1 = (short)(0) ;
         n40000GXC1 = false ;
      }
      pr_default.close(0);
      AV12GuiFasLin = (short)(A40000GXC1+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = albaranguiafase_proxid.this.AV12GuiFasLin;
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
      P09V93_A40000GXC1 = new short[1] ;
      P09V93_n40000GXC1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguiafase_proxid__default(),
         new Object[] {
             new Object[] {
            P09V93_A40000GXC1, P09V93_n40000GXC1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11BarCodReo ;
   private short AV12GuiFasLin ;
   private short A40000GXC1 ;
   private short Gx_err ;
   private int AV10BarCod ;
   private long AV9AlbProCod ;
   private String AV8EmprCod ;
   private String AV13BarCodPar ;
   private String scmdbuf ;
   private boolean n40000GXC1 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P09V93_A40000GXC1 ;
   private boolean[] P09V93_n40000GXC1 ;
}

final  class albaranguiafase_proxid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09V93", "SELECT COALESCE( T1.GXC1, 0) AS GXC1 FROM (SELECT MAX(GuiFasLin) AS GXC1 FROM TXPALBFAS WHERE (EmprCod = ?) AND (AlbProCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ) T1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

