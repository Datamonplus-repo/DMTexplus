package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbreccod extends GXProcedure
{
   public palbreccod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbreccod.class ), "" );
   }

   public palbreccod( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          String aP1 )
   {
      palbreccod.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int[] aP2 )
   {
      palbreccod.this.A396EmprCod = aP0;
      palbreccod.this.A2159AlbRecPie = aP1;
      palbreccod.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01CM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2159AlbRecPie});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P01CM2_A44AlbRecCod[0] ;
         AV8AlbRecCod = A44AlbRecCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = palbreccod.this.AV8AlbRecCod;
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
      P01CM2_A396EmprCod = new String[] {""} ;
      P01CM2_A2159AlbRecPie = new String[] {""} ;
      P01CM2_A44AlbRecCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbreccod__default(),
         new Object[] {
             new Object[] {
            P01CM2_A396EmprCod, P01CM2_A2159AlbRecPie, P01CM2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8AlbRecCod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String A2159AlbRecPie ;
   private String scmdbuf ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01CM2_A396EmprCod ;
   private String[] P01CM2_A2159AlbRecPie ;
   private int[] P01CM2_A44AlbRecCod ;
}

final  class palbreccod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01CM2", "SELECT * FROM (SELECT EmprCod, AlbRecPie, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecPie) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
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
               stmt.setString(2, (String)parms[1], 9);
               return;
      }
   }

}

