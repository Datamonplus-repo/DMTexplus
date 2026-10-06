package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock12 extends GXProcedure
{
   public plock12( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock12.class ), "" );
   }

   public plock12( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 )
   {
      plock12.this.aP1 = new short[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 )
   {
      plock12.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock12.this.A656ParCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P048O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A656ParCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9395ParTMAct = P048O2_A9395ParTMAct[0] ;
         n9395ParTMAct = P048O2_n9395ParTMAct[0] ;
         AV11ParTMAct = A9395ParTMAct ;
         A9395ParTMAct = AV11ParTMAct ;
         n9395ParTMAct = false ;
         /* Using cursor P048O3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n9395ParTMAct), A9395ParTMAct, A396EmprCod, Short.valueOf(A656ParCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODPAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock12.this.A396EmprCod;
      this.aP1[0] = plock12.this.A656ParCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock12");
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
      P048O2_A396EmprCod = new String[] {""} ;
      P048O2_A656ParCod = new short[1] ;
      P048O2_A9395ParTMAct = new String[] {""} ;
      P048O2_n9395ParTMAct = new boolean[] {false} ;
      A9395ParTMAct = "" ;
      AV11ParTMAct = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock12__default(),
         new Object[] {
             new Object[] {
            P048O2_A396EmprCod, P048O2_A656ParCod, P048O2_A9395ParTMAct, P048O2_n9395ParTMAct
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A656ParCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9395ParTMAct ;
   private String AV11ParTMAct ;
   private boolean n9395ParTMAct ;
   private short[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P048O2_A396EmprCod ;
   private short[] P048O2_A656ParCod ;
   private String[] P048O2_A9395ParTMAct ;
   private boolean[] P048O2_n9395ParTMAct ;
}

final  class plock12__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P048O2", "SELECT EmprCod, ParCod, ParTMAct FROM TXPCODPAR WHERE EmprCod = ? and ParCod = ? ORDER BY EmprCod, ParCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P048O3", "UPDATE TXPCODPAR SET ParTMAct=?  WHERE EmprCod = ? AND ParCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCODPAR")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

