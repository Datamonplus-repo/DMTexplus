package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdatlabdip extends GXProcedure
{
   public pdatlabdip( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdatlabdip.class ), "" );
   }

   public pdatlabdip( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pdatlabdip.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      pdatlabdip.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdatlabdip.this.A13324LDESID = aP1[0];
      this.aP1 = aP1;
      pdatlabdip.this.AV11GrabCod = aP2[0];
      this.aP2 = aP2;
      pdatlabdip.this.AV8LDESDibCli = aP3[0];
      this.aP3 = aP3;
      pdatlabdip.this.AV9LDESDibInt = aP4[0];
      this.aP4 = aP4;
      pdatlabdip.this.AV10LDESRefGraB = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05YI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13324LDESID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13325LDESDibCli = P05YI2_A13325LDESDibCli[0] ;
         n13325LDESDibCli = P05YI2_n13325LDESDibCli[0] ;
         A13326LDESDibInt = P05YI2_A13326LDESDibInt[0] ;
         n13326LDESDibInt = P05YI2_n13326LDESDibInt[0] ;
         A13329LDESRefGra = P05YI2_A13329LDESRefGra[0] ;
         n13329LDESRefGra = P05YI2_n13329LDESRefGra[0] ;
         A1005GrabCod = P05YI2_A1005GrabCod[0] ;
         n1005GrabCod = P05YI2_n1005GrabCod[0] ;
         AV8LDESDibCli = A13325LDESDibCli ;
         AV9LDESDibInt = A13326LDESDibInt ;
         AV10LDESRefGraB = A13329LDESRefGra ;
         AV11GrabCod = A1005GrabCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdatlabdip.this.A396EmprCod;
      this.aP1[0] = pdatlabdip.this.A13324LDESID;
      this.aP2[0] = pdatlabdip.this.AV11GrabCod;
      this.aP3[0] = pdatlabdip.this.AV8LDESDibCli;
      this.aP4[0] = pdatlabdip.this.AV9LDESDibInt;
      this.aP5[0] = pdatlabdip.this.AV10LDESRefGraB;
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
      P05YI2_A396EmprCod = new String[] {""} ;
      P05YI2_A13324LDESID = new int[1] ;
      P05YI2_A13325LDESDibCli = new String[] {""} ;
      P05YI2_n13325LDESDibCli = new boolean[] {false} ;
      P05YI2_A13326LDESDibInt = new int[1] ;
      P05YI2_n13326LDESDibInt = new boolean[] {false} ;
      P05YI2_A13329LDESRefGra = new String[] {""} ;
      P05YI2_n13329LDESRefGra = new boolean[] {false} ;
      P05YI2_A1005GrabCod = new short[1] ;
      P05YI2_n1005GrabCod = new boolean[] {false} ;
      A13325LDESDibCli = "" ;
      A13329LDESRefGra = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdatlabdip__default(),
         new Object[] {
             new Object[] {
            P05YI2_A396EmprCod, P05YI2_A13324LDESID, P05YI2_A13325LDESDibCli, P05YI2_n13325LDESDibCli, P05YI2_A13326LDESDibInt, P05YI2_n13326LDESDibInt, P05YI2_A13329LDESRefGra, P05YI2_n13329LDESRefGra, P05YI2_A1005GrabCod, P05YI2_n1005GrabCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11GrabCod ;
   private short A1005GrabCod ;
   private short Gx_err ;
   private int A13324LDESID ;
   private int AV9LDESDibInt ;
   private int A13326LDESDibInt ;
   private String A396EmprCod ;
   private String AV8LDESDibCli ;
   private String AV10LDESRefGraB ;
   private String scmdbuf ;
   private String A13325LDESDibCli ;
   private String A13329LDESRefGra ;
   private boolean n13325LDESDibCli ;
   private boolean n13326LDESDibInt ;
   private boolean n13329LDESRefGra ;
   private boolean n1005GrabCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05YI2_A396EmprCod ;
   private int[] P05YI2_A13324LDESID ;
   private String[] P05YI2_A13325LDESDibCli ;
   private boolean[] P05YI2_n13325LDESDibCli ;
   private int[] P05YI2_A13326LDESDibInt ;
   private boolean[] P05YI2_n13326LDESDibInt ;
   private String[] P05YI2_A13329LDESRefGra ;
   private boolean[] P05YI2_n13329LDESRefGra ;
   private short[] P05YI2_A1005GrabCod ;
   private boolean[] P05YI2_n1005GrabCod ;
}

final  class pdatlabdip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05YI2", "SELECT EmprCod, LDESID, LDESDibCli, LDESDibInt, LDESRefGra, GrabCod FROM TXPLDES00 WHERE EmprCod = ? and LDESID = ? ORDER BY EmprCod, LDESID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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

