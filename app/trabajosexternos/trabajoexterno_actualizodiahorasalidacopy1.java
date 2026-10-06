package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_actualizodiahorasalidacopy1 extends GXProcedure
{
   public trabajoexterno_actualizodiahorasalidacopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_actualizodiahorasalidacopy1.class ), "" );
   }

   public trabajoexterno_actualizodiahorasalidacopy1( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        java.util.Date aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             java.util.Date aP4 )
   {
      trabajoexterno_actualizodiahorasalidacopy1.this.A396EmprCod = aP0;
      trabajoexterno_actualizodiahorasalidacopy1.this.A2253SalExtAlb = aP1;
      trabajoexterno_actualizodiahorasalidacopy1.this.AV12SalFecSal = aP2;
      trabajoexterno_actualizodiahorasalidacopy1.this.AV8SalExtHor = aP3;
      trabajoexterno_actualizodiahorasalidacopy1.this.AV11SalFhh = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0AJX2 */
      pr_default.execute(0, new Object[] {AV11SalFhh, AV8SalExtHor, AV12SalFecSal, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_actualizodiahorasalidacopy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      A6396SalExtHor = "" ;
      A14398SalFecSal = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_actualizodiahorasalidacopy1__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A2253SalExtAlb ;
   private String A396EmprCod ;
   private String AV8SalExtHor ;
   private String A6396SalExtHor ;
   private java.util.Date AV11SalFhh ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date AV12SalFecSal ;
   private java.util.Date A14398SalFecSal ;
   private IDataStoreProvider pr_default ;
}

final  class trabajoexterno_actualizodiahorasalidacopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AJX2", "UPDATE TXPCEXTSA SET SalFhh=?, SalExtHor=?, SalFecSal=?  WHERE EmprCod = ? and SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

