package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenercontval2 extends GXProcedure
{
   public obtenercontval2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenercontval2.class ), "" );
   }

   public obtenercontval2( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           String aP1 )
   {
      obtenercontval2.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long[] aP2 )
   {
      obtenercontval2.this.AV17EmprCod = aP0;
      obtenercontval2.this.AV18ContCod = aP1;
      obtenercontval2.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P08UZ2 */
      pr_default.execute(0, new Object[] {AV17EmprCod, AV18ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P08UZ2_A313ContCod[0] ;
         A396EmprCod = P08UZ2_A396EmprCod[0] ;
         A1147ContVal2 = P08UZ2_A1147ContVal2[0] ;
         AV9ContVal2 = A1147ContVal2 ;
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
      this.aP2[0] = obtenercontval2.this.AV9ContVal2;
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
      P08UZ2_A313ContCod = new String[] {""} ;
      P08UZ2_A396EmprCod = new String[] {""} ;
      P08UZ2_A1147ContVal2 = new long[1] ;
      A313ContCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtenercontval2__default(),
         new Object[] {
             new Object[] {
            P08UZ2_A313ContCod, P08UZ2_A396EmprCod, P08UZ2_A1147ContVal2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV9ContVal2 ;
   private long A1147ContVal2 ;
   private String AV17EmprCod ;
   private String AV18ContCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A396EmprCod ;
   private long[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P08UZ2_A313ContCod ;
   private String[] P08UZ2_A396EmprCod ;
   private long[] P08UZ2_A1147ContVal2 ;
}

final  class obtenercontval2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08UZ2", "SELECT * FROM (SELECT ContCod, EmprCod, ContVal2 FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

