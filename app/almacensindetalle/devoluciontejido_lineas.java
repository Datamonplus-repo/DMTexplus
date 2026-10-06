package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_lineas extends GXProcedure
{
   public devoluciontejido_lineas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_lineas.class ), "" );
   }

   public devoluciontejido_lineas( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      devoluciontejido_lineas.this.aP2 = new short[] {0};
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
      devoluciontejido_lineas.this.A396EmprCod = aP0;
      devoluciontejido_lineas.this.A11669DevCruId = aP1;
      devoluciontejido_lineas.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lineas = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P0AJ72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      cV8Lineas = P0AJ72_AV8Lineas[0] ;
      pr_default.close(0);
      AV8Lineas = (short)(AV8Lineas+cV8Lineas*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = devoluciontejido_lineas.this.AV8Lineas;
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
      P0AJ72_AV8Lineas = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_lineas__default(),
         new Object[] {
             new Object[] {
            P0AJ72_AV8Lineas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Lineas ;
   private short cV8Lineas ;
   private short Gx_err ;
   private int A11669DevCruId ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AJ72_AV8Lineas ;
}

final  class devoluciontejido_lineas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJ72", "SELECT COUNT(*) FROM TXPDEVCR1 WHERE EmprCod = ? and DevCruId = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

