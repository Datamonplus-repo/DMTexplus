package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class detalleproductoscompuestos extends GXProcedure
{
   public detalleproductoscompuestos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( detalleproductoscompuestos.class ), "" );
   }

   public detalleproductoscompuestos( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 )
   {
      detalleproductoscompuestos.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      detalleproductoscompuestos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      detalleproductoscompuestos.this.A688PrdComCod = aP1[0];
      this.aP1 = aP1;
      detalleproductoscompuestos.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8lineas = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P09I12 */
      pr_default.execute(0, new Object[] {A396EmprCod, A688PrdComCod});
      cV8lineas = P09I12_AV8lineas[0] ;
      pr_default.close(0);
      AV8lineas = (short)(AV8lineas+cV8lineas*1) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = detalleproductoscompuestos.this.A396EmprCod;
      this.aP1[0] = detalleproductoscompuestos.this.A688PrdComCod;
      this.aP2[0] = detalleproductoscompuestos.this.AV8lineas;
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
      P09I12_AV8lineas = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.detalleproductoscompuestos__default(),
         new Object[] {
             new Object[] {
            P09I12_AV8lineas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8lineas ;
   private short cV8lineas ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A688PrdComCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P09I12_AV8lineas ;
}

final  class detalleproductoscompuestos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09I12", "SELECT COUNT(*) FROM TXPLPRDCO WHERE EmprCod = ? and PrdComCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

