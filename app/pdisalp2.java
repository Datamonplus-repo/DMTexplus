package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisalp2 extends GXProcedure
{
   public pdisalp2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisalp2.class ), "" );
   }

   public pdisalp2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 )
   {
      pdisalp2.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 )
   {
      pdisalp2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisalp2.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisalp2.this.A44AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pdisalp2.this.AV14DisPiePie = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14DisPiePie = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P01YV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      cV14DisPiePie = P01YV2_AV14DisPiePie[0] ;
      pr_default.close(0);
      AV14DisPiePie = (short)(AV14DisPiePie+cV14DisPiePie*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisalp2.this.A396EmprCod;
      this.aP1[0] = pdisalp2.this.A361DisCod;
      this.aP2[0] = pdisalp2.this.A44AlbRecCod;
      this.aP3[0] = pdisalp2.this.AV14DisPiePie;
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
      P01YV2_AV14DisPiePie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisalp2__default(),
         new Object[] {
             new Object[] {
            P01YV2_AV14DisPiePie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14DisPiePie ;
   private short cV14DisPiePie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P01YV2_AV14DisPiePie ;
}

final  class pdisalp2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YV2", "SELECT COUNT(*) FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

