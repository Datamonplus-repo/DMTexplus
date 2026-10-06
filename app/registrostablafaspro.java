package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrostablafaspro extends GXProcedure
{
   public registrostablafaspro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrostablafaspro.class ), "" );
   }

   public registrostablafaspro( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      registrostablafaspro.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      registrostablafaspro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      registrostablafaspro.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8NumeroRegistros = 0 ;
      /* Optimized group. */
      /* Using cursor P09862 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      cV8NumeroRegistros = P09862_AV8NumeroRegistros[0] ;
      pr_default.close(0);
      AV8NumeroRegistros = (long)(AV8NumeroRegistros+cV8NumeroRegistros*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = registrostablafaspro.this.A396EmprCod;
      this.aP1[0] = registrostablafaspro.this.AV8NumeroRegistros;
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
      P09862_AV8NumeroRegistros = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.registrostablafaspro__default(),
         new Object[] {
             new Object[] {
            P09862_AV8NumeroRegistros
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV8NumeroRegistros ;
   private long cV8NumeroRegistros ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private long[] P09862_AV8NumeroRegistros ;
}

final  class registrostablafaspro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09862", "SELECT COUNT(*) FROM TXPFASPRO WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               return;
      }
   }

}

