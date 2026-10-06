package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cambiodescripcionfase extends GXProcedure
{
   public cambiodescripcionfase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cambiodescripcionfase.class ), "" );
   }

   public cambiodescripcionfase( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      cambiodescripcionfase.this.AV10Emprcod = aP0;
      cambiodescripcionfase.this.AV8MaqFCod = aP1;
      cambiodescripcionfase.this.AV9MaqFDsc = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0A612 */
      pr_default.execute(0, new Object[] {AV9MaqFDsc, AV10Emprcod, AV8MaqFCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "cambiodescripcionfase");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1143MaqFDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cambiodescripcionfase__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10Emprcod ;
   private String AV8MaqFCod ;
   private String AV9MaqFDsc ;
   private String A1143MaqFDsc ;
   private IDataStoreProvider pr_default ;
}

final  class cambiodescripcionfase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A612", "UPDATE TXPMAQFAS SET MaqFDsc=?  WHERE EmprCod = ? and MaqFCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMAQFAS")
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
               stmt.setString(1, (String)parms[0], 28);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

