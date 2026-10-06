package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelprd extends GXProcedure
{
   public pdelprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelprd.class ), "" );
   }

   public pdelprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pdelprd.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pdelprd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelprd.this.AV15PrdNum = aP1[0];
      this.aP1 = aP1;
      pdelprd.this.A719PrdNum = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P004Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, AV15PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDALT");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelprd.this.A396EmprCod;
      this.aP1[0] = pdelprd.this.AV15PrdNum;
      this.aP2[0] = pdelprd.this.A719PrdNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelprd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelprd__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String AV15PrdNum ;
   private String A719PrdNum ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pdelprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004Y2", "DELETE FROM TXPPRDALT  WHERE EmprCod = ? and PrdNum = ? and PrdAltNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRDALT")
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

