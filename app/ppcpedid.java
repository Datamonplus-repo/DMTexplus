package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppcpedid extends GXProcedure
{
   public ppcpedid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppcpedid.class ), "" );
   }

   public ppcpedid( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      ppcpedid.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      ppcpedid.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppcpedid.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      ppcpedid.this.AV8PrvNum = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PrvNum = 0 ;
      /* Using cursor P036S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P036S2_A795PrvNum[0] ;
         AV8PrvNum = A795PrvNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppcpedid.this.A396EmprCod;
      this.aP1[0] = ppcpedid.this.A658PedCod;
      this.aP2[0] = ppcpedid.this.AV8PrvNum;
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
      P036S2_A396EmprCod = new String[] {""} ;
      P036S2_A658PedCod = new int[1] ;
      P036S2_A795PrvNum = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppcpedid__default(),
         new Object[] {
             new Object[] {
            P036S2_A396EmprCod, P036S2_A658PedCod, P036S2_A795PrvNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A658PedCod ;
   private int AV8PrvNum ;
   private int A795PrvNum ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P036S2_A396EmprCod ;
   private int[] P036S2_A658PedCod ;
   private int[] P036S2_A795PrvNum ;
}

final  class ppcpedid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036S2", "SELECT EmprCod, PedCod, PrvNum FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

