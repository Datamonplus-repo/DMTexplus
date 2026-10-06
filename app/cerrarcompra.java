package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cerrarcompra extends GXProcedure
{
   public cerrarcompra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cerrarcompra.class ), "" );
   }

   public cerrarcompra( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      cerrarcompra.this.aP1 = new int[] {0};
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
      cerrarcompra.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      cerrarcompra.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Flag = (short)(0) ;
      /* Using cursor P08QY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A667PedSit = P08QY2_A667PedSit[0] ;
         /* Using cursor P08QY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A659PedCum = P08QY3_A659PedCum[0] ;
            A719PrdNum = P08QY3_A719PrdNum[0] ;
            AV8Flag = (short)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A667PedSit = ((AV8Flag==0) ? "S" : "N") ;
         /* Using cursor P08QY4 */
         pr_default.execute(2, new Object[] {A667PedSit, A396EmprCod, Integer.valueOf(A658PedCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = cerrarcompra.this.A396EmprCod;
      this.aP1[0] = cerrarcompra.this.A658PedCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "cerrarcompra");
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
      P08QY2_A396EmprCod = new String[] {""} ;
      P08QY2_A658PedCod = new int[1] ;
      P08QY2_A667PedSit = new String[] {""} ;
      A667PedSit = "" ;
      P08QY3_A396EmprCod = new String[] {""} ;
      P08QY3_A658PedCod = new int[1] ;
      P08QY3_A659PedCum = new String[] {""} ;
      P08QY3_A719PrdNum = new String[] {""} ;
      A659PedCum = "" ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cerrarcompra__default(),
         new Object[] {
             new Object[] {
            P08QY2_A396EmprCod, P08QY2_A658PedCod, P08QY2_A667PedSit
            }
            , new Object[] {
            P08QY3_A396EmprCod, P08QY3_A658PedCod, P08QY3_A659PedCum, P08QY3_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Flag ;
   private short Gx_err ;
   private int A658PedCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String A719PrdNum ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P08QY2_A396EmprCod ;
   private int[] P08QY2_A658PedCod ;
   private String[] P08QY2_A667PedSit ;
   private String[] P08QY3_A396EmprCod ;
   private int[] P08QY3_A658PedCod ;
   private String[] P08QY3_A659PedCum ;
   private String[] P08QY3_A719PrdNum ;
}

final  class cerrarcompra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08QY2", "SELECT EmprCod, PedCod, PedSit FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08QY3", "SELECT * FROM (SELECT EmprCod, PedCod, PedCum, PrdNum FROM TXPLPEDID WHERE (EmprCod = ? and PedCod = ?) AND (PedCum = 'N') ORDER BY EmprCod, PedCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08QY4", "UPDATE TXPCPEDID SET PedSit=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

