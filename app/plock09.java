package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock09 extends GXProcedure
{
   public plock09( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock09.class ), "" );
   }

   public plock09( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      plock09.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      plock09.this.A850UsurCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04822 */
      pr_default.execute(0, new Object[] {A850UsurCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A854UsurNom = P04822_A854UsurNom[0] ;
         n854UsurNom = P04822_n854UsurNom[0] ;
         AV9UsurNom = A854UsurNom ;
         A854UsurNom = AV9UsurNom ;
         n854UsurNom = false ;
         /* Using cursor P04823 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n854UsurNom), A854UsurNom, A850UsurCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock09.this.A850UsurCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock09");
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
      P04822_A850UsurCod = new String[] {""} ;
      P04822_A854UsurNom = new String[] {""} ;
      P04822_n854UsurNom = new boolean[] {false} ;
      A854UsurNom = "" ;
      AV9UsurNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock09__default(),
         new Object[] {
             new Object[] {
            P04822_A850UsurCod, P04822_A854UsurNom, P04822_n854UsurNom
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A850UsurCod ;
   private String scmdbuf ;
   private String A854UsurNom ;
   private String AV9UsurNom ;
   private boolean n854UsurNom ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04822_A850UsurCod ;
   private String[] P04822_A854UsurNom ;
   private boolean[] P04822_n854UsurNom ;
}

final  class plock09__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04822", "SELECT UsurCod, UsurNom FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod  FOR UPDATE OF UsurNom NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04823", "UPDATE TXPUSUARI SET UsurNom=?  WHERE UsurCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUSUARI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 35);
               }
               stmt.setString(2, (String)parms[2], 8);
               return;
      }
   }

}

