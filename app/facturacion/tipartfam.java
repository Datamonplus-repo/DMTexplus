package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tipartfam extends GXProcedure
{
   public tipartfam( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tipartfam.class ), "" );
   }

   public tipartfam( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            byte aP1 )
   {
      tipartfam.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             short[] aP2 )
   {
      tipartfam.this.A396EmprCod = aP0;
      tipartfam.this.A831TipColCod = aP1;
      tipartfam.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TipArtFam = (short)(0) ;
      /* Using cursor P0A512 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5723TipArtFam = P0A512_A5723TipArtFam[0] ;
         n5723TipArtFam = P0A512_n5723TipArtFam[0] ;
         AV8TipArtFam = A5723TipArtFam ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tipartfam.this.AV8TipArtFam;
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
      P0A512_A396EmprCod = new String[] {""} ;
      P0A512_A831TipColCod = new byte[1] ;
      P0A512_A5723TipArtFam = new short[1] ;
      P0A512_n5723TipArtFam = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tipartfam__default(),
         new Object[] {
             new Object[] {
            P0A512_A396EmprCod, P0A512_A831TipColCod, P0A512_A5723TipArtFam, P0A512_n5723TipArtFam
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short AV8TipArtFam ;
   private short A5723TipArtFam ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5723TipArtFam ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A512_A396EmprCod ;
   private byte[] P0A512_A831TipColCod ;
   private short[] P0A512_A5723TipArtFam ;
   private boolean[] P0A512_n5723TipArtFam ;
}

final  class tipartfam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A512", "SELECT EmprCod, TipColCod, TipArtFam FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

