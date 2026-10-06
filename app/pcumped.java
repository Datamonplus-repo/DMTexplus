package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcumped extends GXProcedure
{
   public pcumped( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcumped.class ), "" );
   }

   public pcumped( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pcumped.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pcumped.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcumped.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      pcumped.this.A719PrdNum = aP2[0];
      this.aP2 = aP2;
      pcumped.this.AV17PedSit = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P01082 */
      pr_default.execute(0, new Object[] {AV17PedSit, A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
      /* End optimized UPDATE. */
      AV15Flag = (byte)(0) ;
      /* Using cursor P01083 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A667PedSit = P01083_A667PedSit[0] ;
         /* Using cursor P01084 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod), A719PrdNum});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A659PedCum = P01084_A659PedCum[0] ;
            AV15Flag = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         A667PedSit = ((0==AV15Flag) ? "S" : "N") ;
         /* Using cursor P01085 */
         pr_default.execute(3, new Object[] {A667PedSit, A396EmprCod, Integer.valueOf(A658PedCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcumped.this.A396EmprCod;
      this.aP1[0] = pcumped.this.A658PedCod;
      this.aP2[0] = pcumped.this.A719PrdNum;
      this.aP3[0] = pcumped.this.AV17PedSit;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcumped");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A659PedCum = "" ;
      scmdbuf = "" ;
      P01083_A396EmprCod = new String[] {""} ;
      P01083_A658PedCod = new int[1] ;
      P01083_A667PedSit = new String[] {""} ;
      A667PedSit = "" ;
      P01084_A396EmprCod = new String[] {""} ;
      P01084_A658PedCod = new int[1] ;
      P01084_A719PrdNum = new String[] {""} ;
      P01084_A659PedCum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcumped__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P01083_A396EmprCod, P01083_A658PedCod, P01083_A667PedSit
            }
            , new Object[] {
            P01084_A396EmprCod, P01084_A658PedCod, P01084_A719PrdNum, P01084_A659PedCum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private int A658PedCod ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV17PedSit ;
   private String A659PedCum ;
   private String scmdbuf ;
   private String A667PedSit ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01083_A396EmprCod ;
   private int[] P01083_A658PedCod ;
   private String[] P01083_A667PedSit ;
   private String[] P01084_A396EmprCod ;
   private int[] P01084_A658PedCod ;
   private String[] P01084_A719PrdNum ;
   private String[] P01084_A659PedCum ;
}

final  class pcumped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01082", "UPDATE TXPLPEDID SET PedCum=?  WHERE EmprCod = ? and PedCod = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
         ,new ForEachCursor("P01083", "SELECT EmprCod, PedCod, PedSit FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01084", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE (EmprCod = ? and PedCod = ? and PrdNum = ?) AND (PedCum = 'N') ORDER BY EmprCod, PedCod, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01085", "UPDATE TXPCPEDID SET PedSit=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

