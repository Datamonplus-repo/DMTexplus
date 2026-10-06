package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminolotprd extends GXProcedure
{
   public eliminolotprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminolotprd.class ), "" );
   }

   public eliminolotprd( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        String aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             String aP3 )
   {
      eliminolotprd.this.AV8Emprcod = aP0;
      eliminolotprd.this.AV9Prdnum = aP1;
      eliminolotprd.this.AV10LoteFec = aP2;
      eliminolotprd.this.AV11LoteID = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P09YH2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV9Prdnum, AV11LoteID, AV10LoteFec});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.eliminolotprd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.eliminolotprd__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8Emprcod ;
   private String AV9Prdnum ;
   private String AV11LoteID ;
   private java.util.Date AV10LoteFec ;
   private IDataStoreProvider pr_default ;
}

final  class eliminolotprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09YH2", "DELETE FROM TXPLOTPRD  WHERE EmprCod = ? and PrdNum = ? and LoteID = ? and LoteFec = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLOTPRD")
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

