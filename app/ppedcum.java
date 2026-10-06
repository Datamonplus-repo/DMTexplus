package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedcum extends GXProcedure
{
   public ppedcum( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedcum.class ), "" );
   }

   public ppedcum( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      ppedcum.this.aP1 = new int[] {0};
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
      ppedcum.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedcum.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P004R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A667PedSit = P004R2_A667PedSit[0] ;
         /* Using cursor P004R3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A659PedCum = P004R3_A659PedCum[0] ;
            A719PrdNum = P004R3_A719PrdNum[0] ;
            if ( GXutil.strcmp(A659PedCum, httpContext.getMessage( "N", "")) == 0 )
            {
               AV15Flag = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV15Flag == 0 )
         {
            A667PedSit = httpContext.getMessage( "S", "") ;
         }
         else
         {
            A667PedSit = httpContext.getMessage( "N", "") ;
         }
         /* Using cursor P004R4 */
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
      this.aP0[0] = ppedcum.this.A396EmprCod;
      this.aP1[0] = ppedcum.this.A658PedCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppedcum");
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
      P004R2_A396EmprCod = new String[] {""} ;
      P004R2_A658PedCod = new int[1] ;
      P004R2_A667PedSit = new String[] {""} ;
      A667PedSit = "" ;
      P004R3_A396EmprCod = new String[] {""} ;
      P004R3_A658PedCod = new int[1] ;
      P004R3_A659PedCum = new String[] {""} ;
      P004R3_A719PrdNum = new String[] {""} ;
      A659PedCum = "" ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedcum__default(),
         new Object[] {
             new Object[] {
            P004R2_A396EmprCod, P004R2_A658PedCod, P004R2_A667PedSit
            }
            , new Object[] {
            P004R3_A396EmprCod, P004R3_A658PedCod, P004R3_A659PedCum, P004R3_A719PrdNum
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
   private String scmdbuf ;
   private String A667PedSit ;
   private String A659PedCum ;
   private String A719PrdNum ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P004R2_A396EmprCod ;
   private int[] P004R2_A658PedCod ;
   private String[] P004R2_A667PedSit ;
   private String[] P004R3_A396EmprCod ;
   private int[] P004R3_A658PedCod ;
   private String[] P004R3_A659PedCum ;
   private String[] P004R3_A719PrdNum ;
}

final  class ppedcum__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004R2", "SELECT EmprCod, PedCod, PedSit FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P004R3", "SELECT EmprCod, PedCod, PedCum, PrdNum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P004R4", "UPDATE TXPCPEDID SET PedSit=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPEDID")
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

