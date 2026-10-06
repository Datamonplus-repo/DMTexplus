package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdellan extends GXProcedure
{
   public pdellan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdellan.class ), "" );
   }

   public pdellan( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      pdellan.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      pdellan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV15Termin ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pdellan.this.GXt_char1 = GXv_char2[0] ;
      AV15Termin = GXt_char1 ;
      /* Optimized DELETE. */
      /* Using cursor P004G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15Termin});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARLAN");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdellan.this.A396EmprCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdellan");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Termin = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdellan__default(),
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
   private String AV15Termin ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class pdellan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P004G2", "DELETE FROM TXPBARLAN  WHERE EmprCod = ? and BarTerCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARLAN")
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
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

