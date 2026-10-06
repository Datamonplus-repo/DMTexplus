package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class determinarprimerarecepcion extends GXProcedure
{
   public determinarprimerarecepcion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( determinarprimerarecepcion.class ), "" );
   }

   public determinarprimerarecepcion( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 )
   {
      determinarprimerarecepcion.this.aP2 = new int[] {0};
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
      determinarprimerarecepcion.this.AV10EmprCod = aP0;
      determinarprimerarecepcion.this.AV16DisCod = aP1;
      determinarprimerarecepcion.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P08E12 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV16DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P08E12_A361DisCod[0] ;
         A396EmprCod = P08E12_A396EmprCod[0] ;
         AV15AlbRecCod = A44AlbRecCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = determinarprimerarecepcion.this.AV15AlbRecCod;
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
      P08E12_A361DisCod = new int[1] ;
      P08E12_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.determinarprimerarecepcion__default(),
         new Object[] {
             new Object[] {
            P08E12_A361DisCod, P08E12_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16DisCod ;
   private int AV15AlbRecCod ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private String AV10EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P08E12_A361DisCod ;
   private String[] P08E12_A396EmprCod ;
}

final  class determinarprimerarecepcion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08E12", "SELECT * FROM (SELECT DisCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

