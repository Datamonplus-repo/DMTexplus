package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class treccor_del extends GXProcedure
{
   public treccor_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( treccor_del.class ), "" );
   }

   public treccor_del( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        byte aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             byte aP6 )
   {
      treccor_del.this.A396EmprCod = aP0;
      treccor_del.this.A252CliCod = aP1;
      treccor_del.this.A494ForSer = aP2;
      treccor_del.this.A482ForColNom = aP3;
      treccor_del.this.A483ForColNum = aP4;
      treccor_del.this.A831TipColCod = aP5;
      treccor_del.this.AV8RecCorLin = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AMO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Byte.valueOf(AV8RecCorLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECCOR");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.treccor_del");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.treccor_del__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV8RecCorLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private IDataStoreProvider pr_default ;
}

final  class treccor_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMO2", "DELETE FROM TXPRECCOR  WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and RecCorLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECCOR")
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

