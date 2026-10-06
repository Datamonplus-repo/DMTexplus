package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizohashdevolucionalmacen extends GXProcedure
{
   public actualizohashdevolucionalmacen( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizohashdevolucionalmacen.class ), "" );
   }

   public actualizohashdevolucionalmacen( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      actualizohashdevolucionalmacen.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      actualizohashdevolucionalmacen.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      actualizohashdevolucionalmacen.this.A11669DevCruId = aP1[0];
      this.aP1 = aP1;
      actualizohashdevolucionalmacen.this.AV41Cadena = aP2[0];
      this.aP2 = aP2;
      actualizohashdevolucionalmacen.this.AV40DevCruHash = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P099O2 */
      pr_default.execute(0, new Object[] {AV40DevCruHash, AV41Cadena, A396EmprCod, Integer.valueOf(A11669DevCruId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = actualizohashdevolucionalmacen.this.A396EmprCod;
      this.aP1[0] = actualizohashdevolucionalmacen.this.A11669DevCruId;
      this.aP2[0] = actualizohashdevolucionalmacen.this.AV41Cadena;
      this.aP3[0] = actualizohashdevolucionalmacen.this.AV40DevCruHash;
      Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.actualizohashdevolucionalmacen");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.actualizohashdevolucionalmacen__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11669DevCruId ;
   private String A396EmprCod ;
   private String AV41Cadena ;
   private String AV40DevCruHash ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class actualizohashdevolucionalmacen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P099O2", "UPDATE TXPDEVCRU SET DevCruHash=?, DevCruDesc=?, DevCruGros=0  WHERE EmprCod = ? and DevCruId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCRU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 200);
               stmt.setString(2, (String)parms[1], 300);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

