package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedatp extends GXProcedure
{
   public ppedatp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedatp.class ), "" );
   }

   public ppedatp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      ppedatp.this.aP2 = new short[] {0};
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
      ppedatp.this.A396EmprCod = aP0;
      ppedatp.this.A11604PArtId = aP1;
      ppedatp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      /* Using cursor P04MA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      cV8PArtPie = P04MA2_AV8PArtPie[0] ;
      pr_default.close(0);
      AV8PArtPie = (short)(AV8PArtPie+cV8PArtPie*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ppedatp.this.AV8PArtPie;
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
      P04MA2_AV8PArtPie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedatp__default(),
         new Object[] {
             new Object[] {
            P04MA2_AV8PArtPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8PArtPie ;
   private short cV8PArtPie ;
   private short Gx_err ;
   private int A11604PArtId ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P04MA2_AV8PArtPie ;
}

final  class ppedatp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04MA2", "SELECT COUNT(*) FROM TXPPedACr WHERE EmprCod = ? and PArtId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

