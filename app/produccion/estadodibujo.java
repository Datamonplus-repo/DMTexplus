package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class estadodibujo extends GXProcedure
{
   public estadodibujo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( estadodibujo.class ), "" );
   }

   public estadodibujo( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 )
   {
      estadodibujo.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        int aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             String[] aP4 )
   {
      estadodibujo.this.A396EmprCod = aP0;
      estadodibujo.this.A1013DibCli = aP1;
      estadodibujo.this.A252CliCod = aP2;
      estadodibujo.this.A1014DibInt = aP3;
      estadodibujo.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Estado = "" ;
      /* Using cursor P09ZO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV9BarDibCli, Integer.valueOf(AV10CliCod), Integer.valueOf(AV11BardibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1017DibFecEnt = P09ZO2_A1017DibFecEnt[0] ;
         n1017DibFecEnt = P09ZO2_n1017DibFecEnt[0] ;
         AV8Estado = (!GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A1017DibFecEnt)) ? httpContext.getMessage( "Grabado", "") : httpContext.getMessage( "sin grabar", "")) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = estadodibujo.this.AV8Estado;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Estado = "" ;
      scmdbuf = "" ;
      AV9BarDibCli = "" ;
      P09ZO2_A396EmprCod = new String[] {""} ;
      P09ZO2_A1014DibInt = new int[1] ;
      P09ZO2_A252CliCod = new int[1] ;
      P09ZO2_A1013DibCli = new String[] {""} ;
      P09ZO2_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09ZO2_n1017DibFecEnt = new boolean[] {false} ;
      A1017DibFecEnt = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.estadodibujo__default(),
         new Object[] {
             new Object[] {
            P09ZO2_A396EmprCod, P09ZO2_A1014DibInt, P09ZO2_A252CliCod, P09ZO2_A1013DibCli, P09ZO2_A1017DibFecEnt, P09ZO2_n1017DibFecEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int AV10CliCod ;
   private int AV11BardibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String AV8Estado ;
   private String scmdbuf ;
   private String AV9BarDibCli ;
   private java.util.Date A1017DibFecEnt ;
   private boolean n1017DibFecEnt ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZO2_A396EmprCod ;
   private int[] P09ZO2_A1014DibInt ;
   private int[] P09ZO2_A252CliCod ;
   private String[] P09ZO2_A1013DibCli ;
   private java.util.Date[] P09ZO2_A1017DibFecEnt ;
   private boolean[] P09ZO2_n1017DibFecEnt ;
}

final  class estadodibujo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZO2", "SELECT EmprCod, DibInt, CliCod, DibCli, DibFecEnt FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

