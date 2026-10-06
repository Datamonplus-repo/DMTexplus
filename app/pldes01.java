package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pldes01 extends GXProcedure
{
   public pldes01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pldes01.class ), "" );
   }

   public pldes01( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pldes01.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      pldes01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pldes01.this.A13350PEQId = aP1[0];
      this.aP1 = aP1;
      pldes01.this.AV11GrabCod = aP2[0];
      this.aP2 = aP2;
      pldes01.this.AV10PEQDibCli = aP3[0];
      this.aP3 = aP3;
      pldes01.this.AV9PEQDibInt = aP4[0];
      this.aP4 = aP4;
      pldes01.this.AV8PEQRef = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05Y22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A13350PEQId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13372PEQGrabCod = P05Y22_A13372PEQGrabCod[0] ;
         n13372PEQGrabCod = P05Y22_n13372PEQGrabCod[0] ;
         A13353PEQDibCli = P05Y22_A13353PEQDibCli[0] ;
         n13353PEQDibCli = P05Y22_n13353PEQDibCli[0] ;
         A13354PEQDibInt = P05Y22_A13354PEQDibInt[0] ;
         n13354PEQDibInt = P05Y22_n13354PEQDibInt[0] ;
         A13355PEQRef = P05Y22_A13355PEQRef[0] ;
         n13355PEQRef = P05Y22_n13355PEQRef[0] ;
         AV11GrabCod = A13372PEQGrabCod ;
         AV10PEQDibCli = A13353PEQDibCli ;
         AV9PEQDibInt = A13354PEQDibInt ;
         AV8PEQRef = A13355PEQRef ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pldes01.this.A396EmprCod;
      this.aP1[0] = pldes01.this.A13350PEQId;
      this.aP2[0] = pldes01.this.AV11GrabCod;
      this.aP3[0] = pldes01.this.AV10PEQDibCli;
      this.aP4[0] = pldes01.this.AV9PEQDibInt;
      this.aP5[0] = pldes01.this.AV8PEQRef;
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
      P05Y22_A396EmprCod = new String[] {""} ;
      P05Y22_A13350PEQId = new long[1] ;
      P05Y22_A13372PEQGrabCod = new short[1] ;
      P05Y22_n13372PEQGrabCod = new boolean[] {false} ;
      P05Y22_A13353PEQDibCli = new String[] {""} ;
      P05Y22_n13353PEQDibCli = new boolean[] {false} ;
      P05Y22_A13354PEQDibInt = new int[1] ;
      P05Y22_n13354PEQDibInt = new boolean[] {false} ;
      P05Y22_A13355PEQRef = new String[] {""} ;
      P05Y22_n13355PEQRef = new boolean[] {false} ;
      A13353PEQDibCli = "" ;
      A13355PEQRef = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pldes01__default(),
         new Object[] {
             new Object[] {
            P05Y22_A396EmprCod, P05Y22_A13350PEQId, P05Y22_A13372PEQGrabCod, P05Y22_n13372PEQGrabCod, P05Y22_A13353PEQDibCli, P05Y22_n13353PEQDibCli, P05Y22_A13354PEQDibInt, P05Y22_n13354PEQDibInt, P05Y22_A13355PEQRef, P05Y22_n13355PEQRef
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11GrabCod ;
   private short A13372PEQGrabCod ;
   private short Gx_err ;
   private int AV9PEQDibInt ;
   private int A13354PEQDibInt ;
   private long A13350PEQId ;
   private String A396EmprCod ;
   private String AV10PEQDibCli ;
   private String AV8PEQRef ;
   private String scmdbuf ;
   private String A13353PEQDibCli ;
   private String A13355PEQRef ;
   private boolean n13372PEQGrabCod ;
   private boolean n13353PEQDibCli ;
   private boolean n13354PEQDibInt ;
   private boolean n13355PEQRef ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05Y22_A396EmprCod ;
   private long[] P05Y22_A13350PEQId ;
   private short[] P05Y22_A13372PEQGrabCod ;
   private boolean[] P05Y22_n13372PEQGrabCod ;
   private String[] P05Y22_A13353PEQDibCli ;
   private boolean[] P05Y22_n13353PEQDibCli ;
   private int[] P05Y22_A13354PEQDibInt ;
   private boolean[] P05Y22_n13354PEQDibInt ;
   private String[] P05Y22_A13355PEQRef ;
   private boolean[] P05Y22_n13355PEQRef ;
}

final  class pldes01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Y22", "SELECT EmprCod, PEQId, PEQGrabCod, PEQDibCli, PEQDibInt, PEQRef FROM TXPPEQ000 WHERE EmprCod = ? and PEQId = ? ORDER BY EmprCod, PEQId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

