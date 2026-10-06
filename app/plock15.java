package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock15 extends GXProcedure
{
   public plock15( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock15.class ), "" );
   }

   public plock15( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      plock15.this.aP1 = new int[] {0};
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
      plock15.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock15.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04AO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1291AlbRDes = P04AO2_A1291AlbRDes[0] ;
         AV13ALbrdes = A1291AlbRDes ;
         A1291AlbRDes = AV13ALbrdes ;
         /* Using cursor P04AO3 */
         pr_default.execute(1, new Object[] {A1291AlbRDes, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock15.this.A396EmprCod;
      this.aP1[0] = plock15.this.A44AlbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock15");
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
      P04AO2_A396EmprCod = new String[] {""} ;
      P04AO2_A44AlbRecCod = new int[1] ;
      P04AO2_A1291AlbRDes = new String[] {""} ;
      A1291AlbRDes = "" ;
      AV13ALbrdes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock15__default(),
         new Object[] {
             new Object[] {
            P04AO2_A396EmprCod, P04AO2_A44AlbRecCod, P04AO2_A1291AlbRDes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1291AlbRDes ;
   private String AV13ALbrdes ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04AO2_A396EmprCod ;
   private int[] P04AO2_A44AlbRecCod ;
   private String[] P04AO2_A1291AlbRDes ;
}

final  class plock15__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04AO2", "SELECT EmprCod, AlbRecCod, AlbRDes FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04AO3", "UPDATE TXPALBREC SET AlbRDes=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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

