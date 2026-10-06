package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodnmt extends GXProcedure
{
   public pmodnmt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodnmt.class ), "" );
   }

   public pmodnmt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pmodnmt.this.aP3 = new String[] {""};
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
      pmodnmt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodnmt.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pmodnmt.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pmodnmt.this.AV28DisNMtr = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n967ArtNMtr = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00NK2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n967ArtNMtr), AV28DisNMtr, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodnmt.this.A396EmprCod;
      this.aP1[0] = pmodnmt.this.A252CliCod;
      this.aP2[0] = pmodnmt.this.A65ArtCod;
      this.aP3[0] = pmodnmt.this.AV28DisNMtr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodnmt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A967ArtNMtr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodnmt__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV28DisNMtr ;
   private String A967ArtNMtr ;
   private boolean n967ArtNMtr ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pmodnmt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00NK2", "UPDATE TXPARTICU SET ArtNMtr=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               return;
      }
   }

}

