package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pasipda4 extends GXProcedure
{
   public pasipda4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pasipda4.class ), "" );
   }

   public pasipda4( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pasipda4.this.aP1 = new int[] {0};
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
      pasipda4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pasipda4.this.AV12BarMacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02DT2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1199MacCod = P02DT2_A1199MacCod[0] ;
         AV12BarMacCod = A1199MacCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pasipda4.this.A396EmprCod;
      this.aP1[0] = pasipda4.this.AV12BarMacCod;
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
      P02DT2_A396EmprCod = new String[] {""} ;
      P02DT2_A1199MacCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pasipda4__default(),
         new Object[] {
             new Object[] {
            P02DT2_A396EmprCod, P02DT2_A1199MacCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV12BarMacCod ;
   private int A1199MacCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DT2_A396EmprCod ;
   private int[] P02DT2_A1199MacCod ;
}

final  class pasipda4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DT2", "SELECT * FROM (SELECT EmprCod, MacCod FROM TXPCMACRO WHERE EmprCod = ? and MacCod > 0 ORDER BY EmprCod, MacCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

