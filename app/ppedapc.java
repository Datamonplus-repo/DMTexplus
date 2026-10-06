package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedapc extends GXProcedure
{
   public ppedapc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedapc.class ), "" );
   }

   public ppedapc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      ppedapc.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      ppedapc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedapc.this.AV10PACAlbRec = aP1[0];
      this.aP1 = aP1;
      ppedapc.this.AV16CliCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04QB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10PACAlbRec)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P04QB2_A44AlbRecCod[0] ;
         A252CliCod = P04QB2_A252CliCod[0] ;
         AV16CliCod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedapc.this.A396EmprCod;
      this.aP1[0] = ppedapc.this.AV10PACAlbRec;
      this.aP2[0] = ppedapc.this.AV16CliCod;
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
      P04QB2_A396EmprCod = new String[] {""} ;
      P04QB2_A44AlbRecCod = new int[1] ;
      P04QB2_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedapc__default(),
         new Object[] {
             new Object[] {
            P04QB2_A396EmprCod, P04QB2_A44AlbRecCod, P04QB2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10PACAlbRec ;
   private int AV16CliCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04QB2_A396EmprCod ;
   private int[] P04QB2_A44AlbRecCod ;
   private int[] P04QB2_A252CliCod ;
}

final  class ppedapc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QB2", "SELECT EmprCod, AlbRecCod, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
      }
   }

}

