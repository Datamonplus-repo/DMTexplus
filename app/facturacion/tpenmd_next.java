package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpenmd_next extends GXProcedure
{
   public tpenmd_next( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_next.class ), "" );
   }

   public tpenmd_next( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 )
   {
      tpenmd_next.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short[] aP2 )
   {
      tpenmd_next.this.A396EmprCod = aP0;
      tpenmd_next.this.A252CliCod = aP1;
      tpenmd_next.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Pmdlin = (short)(0) ;
      /* Using cursor P0AMP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8403PMDLin = P0AMP2_A8403PMDLin[0] ;
         AV8Pmdlin = A8403PMDLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8Pmdlin = (short)(AV8Pmdlin+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tpenmd_next.this.AV8Pmdlin;
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
      P0AMP2_A396EmprCod = new String[] {""} ;
      P0AMP2_A252CliCod = new int[1] ;
      P0AMP2_A8403PMDLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_next__default(),
         new Object[] {
             new Object[] {
            P0AMP2_A396EmprCod, P0AMP2_A252CliCod, P0AMP2_A8403PMDLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Pmdlin ;
   private short A8403PMDLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMP2_A396EmprCod ;
   private int[] P0AMP2_A252CliCod ;
   private short[] P0AMP2_A8403PMDLin ;
}

final  class tpenmd_next__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMP2", "SELECT * FROM (SELECT EmprCod, CliCod, PMDLin FROM TXPPenMD WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, PMDLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
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

