package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class registrostipcol extends GXProcedure
{
   public registrostipcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( registrostipcol.class ), "" );
   }

   public registrostipcol( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 )
   {
      registrostipcol.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             short[] aP1 )
   {
      registrostipcol.this.A396EmprCod = aP0;
      registrostipcol.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      /* Using cursor P0A452 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      cV9NumeroRegistros = P0A452_AV9NumeroRegistros[0] ;
      pr_default.close(0);
      AV9NumeroRegistros = (short)(AV9NumeroRegistros+cV9NumeroRegistros*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = registrostipcol.this.AV9NumeroRegistros;
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
      P0A452_AV9NumeroRegistros = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.registrostipcol__default(),
         new Object[] {
             new Object[] {
            P0A452_AV9NumeroRegistros
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9NumeroRegistros ;
   private short cV9NumeroRegistros ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A452_AV9NumeroRegistros ;
}

final  class registrostipcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A452", "SELECT COUNT(*) FROM TXPTIPCOL WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
      }
   }

}

