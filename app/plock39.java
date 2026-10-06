package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock39 extends GXProcedure
{
   public plock39( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock39.class ), "" );
   }

   public plock39( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      plock39.this.aP1 = new int[] {0};
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
      plock39.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock39.this.A11604PArtId = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04SO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11546PArtSua = P04SO2_A11546PArtSua[0] ;
         n11546PArtSua = P04SO2_n11546PArtSua[0] ;
         AV10PArtSua = A11546PArtSua ;
         A11546PArtSua = AV10PArtSua ;
         n11546PArtSua = false ;
         /* Using cursor P04SO3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11546PArtSua), A11546PArtSua, A396EmprCod, Integer.valueOf(A11604PArtId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAEs");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock39.this.A396EmprCod;
      this.aP1[0] = plock39.this.A11604PArtId;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock39");
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
      P04SO2_A396EmprCod = new String[] {""} ;
      P04SO2_A11604PArtId = new int[1] ;
      P04SO2_A11546PArtSua = new String[] {""} ;
      P04SO2_n11546PArtSua = new boolean[] {false} ;
      A11546PArtSua = "" ;
      AV10PArtSua = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock39__default(),
         new Object[] {
             new Object[] {
            P04SO2_A396EmprCod, P04SO2_A11604PArtId, P04SO2_A11546PArtSua, P04SO2_n11546PArtSua
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11604PArtId ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A11546PArtSua ;
   private String AV10PArtSua ;
   private boolean n11546PArtSua ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04SO2_A396EmprCod ;
   private int[] P04SO2_A11604PArtId ;
   private String[] P04SO2_A11546PArtSua ;
   private boolean[] P04SO2_n11546PArtSua ;
}

final  class plock39__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SO2", "SELECT EmprCod, PArtId, PArtSua FROM TXPPedAEs WHERE EmprCod = ? and PArtId = ? ORDER BY EmprCod, PArtId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04SO3", "UPDATE TXPPedAEs SET PArtSua=?  WHERE EmprCod = ? AND PArtId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAEs")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

