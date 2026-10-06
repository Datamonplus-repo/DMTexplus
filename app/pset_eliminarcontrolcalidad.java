package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pset_eliminarcontrolcalidad extends GXProcedure
{
   public pset_eliminarcontrolcalidad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pset_eliminarcontrolcalidad.class ), "" );
   }

   public pset_eliminarcontrolcalidad( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      pset_eliminarcontrolcalidad.this.AV8EmprCod = aP0;
      pset_eliminarcontrolcalidad.this.AV9CCTCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pccpol6(remoteHandle, context).execute( AV8EmprCod, AV9CCTCod) ;
      /* Optimized DELETE. */
      /* Using cursor P09SF2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9CCTCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDefN");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P09SF3 */
      pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV9CCTCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pset_eliminarcontrolcalidad");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pset_eliminarcontrolcalidad__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9CCTCod ;
   private String AV8EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class pset_eliminarcontrolcalidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09SF2", "DELETE FROM TXPCCDefN  WHERE EmprCod = ? and CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDefN")
         ,new UpdateCursor("P09SF3", "DELETE FROM TXPCCDef  WHERE EmprCod = ? and CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

