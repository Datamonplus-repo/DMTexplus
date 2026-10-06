package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_obtengofecha extends GXProcedure
{
   public devoluciontejido_obtengofecha( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_obtengofecha.class ), "" );
   }

   public devoluciontejido_obtengofecha( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 )
   {
      devoluciontejido_obtengofecha.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date[] aP2 )
   {
      devoluciontejido_obtengofecha.this.A396EmprCod = aP0;
      devoluciontejido_obtengofecha.this.A11669DevCruId = aP1;
      devoluciontejido_obtengofecha.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DevCruFec = GXutil.nullDate() ;
      /* Using cursor P0AJ42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11670DevCruFec = P0AJ42_A11670DevCruFec[0] ;
         AV8DevCruFec = A11670DevCruFec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = devoluciontejido_obtengofecha.this.AV8DevCruFec;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8DevCruFec = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0AJ42_A396EmprCod = new String[] {""} ;
      P0AJ42_A11669DevCruId = new int[1] ;
      P0AJ42_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      A11670DevCruFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_obtengofecha__default(),
         new Object[] {
             new Object[] {
            P0AJ42_A396EmprCod, P0AJ42_A11669DevCruId, P0AJ42_A11670DevCruFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11669DevCruId ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.util.Date AV8DevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJ42_A396EmprCod ;
   private int[] P0AJ42_A11669DevCruId ;
   private java.util.Date[] P0AJ42_A11670DevCruFec ;
}

final  class devoluciontejido_obtengofecha__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJ42", "SELECT EmprCod, DevCruId, DevCruFec FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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

