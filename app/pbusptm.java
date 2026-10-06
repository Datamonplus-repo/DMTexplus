package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusptm extends GXProcedure
{
   public pbusptm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusptm.class ), "" );
   }

   public pbusptm( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             short aP2 )
   {
      pbusptm.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 )
   {
      pbusptm.this.A396EmprCod = aP0;
      pbusptm.this.A252CliCod = aP1;
      pbusptm.this.A8391PMDCod = aP2;
      pbusptm.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14PMDDsc = "" ;
      /* Using cursor P038C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8392PMDDsc = P038C2_A8392PMDDsc[0] ;
         n8392PMDDsc = P038C2_n8392PMDDsc[0] ;
         AV14PMDDsc = A8392PMDDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pbusptm.this.AV14PMDDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14PMDDsc = "" ;
      scmdbuf = "" ;
      P038C2_A396EmprCod = new String[] {""} ;
      P038C2_A252CliCod = new int[1] ;
      P038C2_A8391PMDCod = new short[1] ;
      P038C2_A8392PMDDsc = new String[] {""} ;
      P038C2_n8392PMDDsc = new boolean[] {false} ;
      A8392PMDDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusptm__default(),
         new Object[] {
             new Object[] {
            P038C2_A396EmprCod, P038C2_A252CliCod, P038C2_A8391PMDCod, P038C2_A8392PMDDsc, P038C2_n8392PMDDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8391PMDCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV14PMDDsc ;
   private String scmdbuf ;
   private String A8392PMDDsc ;
   private boolean n8392PMDDsc ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P038C2_A396EmprCod ;
   private int[] P038C2_A252CliCod ;
   private short[] P038C2_A8391PMDCod ;
   private String[] P038C2_A8392PMDDsc ;
   private boolean[] P038C2_n8392PMDDsc ;
}

final  class pbusptm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038C2", "SELECT EmprCod, CliCod, PMDCod, PMDDsc FROM TXPProMD WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

