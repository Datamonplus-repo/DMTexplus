package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock38 extends GXProcedure
{
   public plock38( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock38.class ), "" );
   }

   public plock38( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      plock38.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      plock38.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock38.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04SN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9786DisItem5 = P04SN2_A9786DisItem5[0] ;
         AV9DisItem5 = A9786DisItem5 ;
         A9786DisItem5 = AV9DisItem5 ;
         /* Using cursor P04SN3 */
         pr_default.execute(1, new Object[] {A9786DisItem5, A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock38.this.A396EmprCod;
      this.aP1[0] = plock38.this.A361DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock38");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04SN2_A396EmprCod = new String[] {""} ;
      P04SN2_A361DisCod = new int[1] ;
      P04SN2_A9786DisItem5 = new String[] {""} ;
      A9786DisItem5 = "" ;
      AV9DisItem5 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock38__default(),
         new Object[] {
             new Object[] {
            P04SN2_A396EmprCod, P04SN2_A361DisCod, P04SN2_A9786DisItem5
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9786DisItem5 ;
   private String AV9DisItem5 ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04SN2_A396EmprCod ;
   private int[] P04SN2_A361DisCod ;
   private String[] P04SN2_A9786DisItem5 ;
}

final  class plock38__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SN2", "SELECT EmprCod, DisCod, DisItem5 FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04SN3", "UPDATE TXPDISPOS SET DisItem5=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
      }
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
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

