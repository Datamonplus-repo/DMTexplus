package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppiedes extends GXProcedure
{
   public ppiedes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppiedes.class ), "" );
   }

   public ppiedes( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      ppiedes.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      ppiedes.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppiedes.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      ppiedes.this.AV15ContPie1 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15ContPie1 = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P007V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      cV15ContPie1 = P007V2_AV15ContPie1[0] ;
      pr_default.close(0);
      AV15ContPie1 = (short)(AV15ContPie1+cV15ContPie1*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppiedes.this.A396EmprCod;
      this.aP1[0] = ppiedes.this.A361DisCod;
      this.aP2[0] = ppiedes.this.AV15ContPie1;
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
      P007V2_AV15ContPie1 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppiedes__default(),
         new Object[] {
             new Object[] {
            P007V2_AV15ContPie1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15ContPie1 ;
   private short cV15ContPie1 ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P007V2_AV15ContPie1 ;
}

final  class ppiedes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007V2", "SELECT COUNT(*) FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

