package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestcolrgb extends GXProcedure
{
   public pestcolrgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestcolrgb.class ), "" );
   }

   public pestcolrgb( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pestcolrgb.this.aP3 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        long[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             long[] aP3 )
   {
      pestcolrgb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestcolrgb.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pestcolrgb.this.A4415EstCol = aP2[0];
      this.aP2 = aP2;
      pestcolrgb.this.AV8Selected = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n12712EstColRGB = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05GL2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n12712EstColRGB), Long.valueOf(AV8Selected), A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEstCo");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestcolrgb.this.A396EmprCod;
      this.aP1[0] = pestcolrgb.this.A252CliCod;
      this.aP2[0] = pestcolrgb.this.A4415EstCol;
      this.aP3[0] = pestcolrgb.this.AV8Selected;
      Application.commitDataStores(context, remoteHandle, pr_default, "pestcolrgb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestcolrgb__default(),
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
   private long AV8Selected ;
   private long A12712EstColRGB ;
   private String A396EmprCod ;
   private String A4415EstCol ;
   private boolean n12712EstColRGB ;
   private long[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pestcolrgb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05GL2", "UPDATE TXPCEstCo SET EstColRGB=?  WHERE EmprCod = ? and CliCod = ? and EstCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEstCo")
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 20);
               return;
      }
   }

}

