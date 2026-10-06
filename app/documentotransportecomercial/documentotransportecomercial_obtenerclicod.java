package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_obtenerclicod extends GXProcedure
{
   public documentotransportecomercial_obtenerclicod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_obtenerclicod.class ), "" );
   }

   public documentotransportecomercial_obtenerclicod( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 )
   {
      documentotransportecomercial_obtenerclicod.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int[] aP2 )
   {
      documentotransportecomercial_obtenerclicod.this.AV10EmprCod = aP0;
      documentotransportecomercial_obtenerclicod.this.AV11AlbComcod = aP1;
      documentotransportecomercial_obtenerclicod.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A8Q2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV11AlbComcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14AlbComCod = P0A8Q2_A14AlbComCod[0] ;
         A396EmprCod = P0A8Q2_A396EmprCod[0] ;
         A252CliCod = P0A8Q2_A252CliCod[0] ;
         AV9CliCod = A252CliCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentotransportecomercial_obtenerclicod.this.AV9CliCod;
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
      P0A8Q2_A14AlbComCod = new int[1] ;
      P0A8Q2_A396EmprCod = new String[] {""} ;
      P0A8Q2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_obtenerclicod__default(),
         new Object[] {
             new Object[] {
            P0A8Q2_A14AlbComCod, P0A8Q2_A396EmprCod, P0A8Q2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV11AlbComcod ;
   private int AV9CliCod ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private String AV10EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P0A8Q2_A14AlbComCod ;
   private String[] P0A8Q2_A396EmprCod ;
   private int[] P0A8Q2_A252CliCod ;
}

final  class documentotransportecomercial_obtenerclicod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A8Q2", "SELECT AlbComCod, EmprCod, CliCod FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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

