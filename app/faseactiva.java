package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class faseactiva extends GXProcedure
{
   public faseactiva( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( faseactiva.class ), "" );
   }

   public faseactiva( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      faseactiva.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      faseactiva.this.A396EmprCod = aP0;
      faseactiva.this.A457FasCod = aP1;
      faseactiva.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasActiva = "N" ;
      /* Using cursor P0A4I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14042FasActiva = P0A4I2_A14042FasActiva[0] ;
         AV8FasActiva = A14042FasActiva ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = faseactiva.this.AV8FasActiva;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8FasActiva = "" ;
      scmdbuf = "" ;
      P0A4I2_A396EmprCod = new String[] {""} ;
      P0A4I2_A457FasCod = new String[] {""} ;
      P0A4I2_A14042FasActiva = new String[] {""} ;
      A14042FasActiva = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.faseactiva__default(),
         new Object[] {
             new Object[] {
            P0A4I2_A396EmprCod, P0A4I2_A457FasCod, P0A4I2_A14042FasActiva
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV8FasActiva ;
   private String scmdbuf ;
   private String A14042FasActiva ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A4I2_A396EmprCod ;
   private String[] P0A4I2_A457FasCod ;
   private String[] P0A4I2_A14042FasActiva ;
}

final  class faseactiva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A4I2", "SELECT EmprCod, FasCod, FasActiva FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

