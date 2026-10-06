package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_obtenerclicod extends GXProcedure
{
   public documentodetransporteproduccion_obtenerclicod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_obtenerclicod.class ), "" );
   }

   public documentodetransporteproduccion_obtenerclicod( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          long aP1 )
   {
      documentodetransporteproduccion_obtenerclicod.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int[] aP2 )
   {
      documentodetransporteproduccion_obtenerclicod.this.AV8EmprCod = aP0;
      documentodetransporteproduccion_obtenerclicod.this.AV11AlbProcod = aP1;
      documentodetransporteproduccion_obtenerclicod.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0A6V2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Long.valueOf(AV11AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0A6V2_A30AlbProCod[0] ;
         A396EmprCod = P0A6V2_A396EmprCod[0] ;
         A1243GuiRemCli = P0A6V2_A1243GuiRemCli[0] ;
         AV10CliCod = A1243GuiRemCli ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentodetransporteproduccion_obtenerclicod.this.AV10CliCod;
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
      P0A6V2_A30AlbProCod = new long[1] ;
      P0A6V2_A396EmprCod = new String[] {""} ;
      P0A6V2_A1243GuiRemCli = new int[1] ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_obtenerclicod__default(),
         new Object[] {
             new Object[] {
            P0A6V2_A30AlbProCod, P0A6V2_A396EmprCod, P0A6V2_A1243GuiRemCli
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV10CliCod ;
   private int A1243GuiRemCli ;
   private long AV11AlbProcod ;
   private long A30AlbProCod ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P0A6V2_A30AlbProCod ;
   private String[] P0A6V2_A396EmprCod ;
   private int[] P0A6V2_A1243GuiRemCli ;
}

final  class documentodetransporteproduccion_obtenerclicod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6V2", "SELECT AlbProCod, EmprCod, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

