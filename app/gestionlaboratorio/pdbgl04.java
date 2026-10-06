package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdbgl04 extends GXProcedure
{
   public pdbgl04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdbgl04.class ), "" );
   }

   public pdbgl04( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdbgl04.this.aP1 = new int[] {0};
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
      pdbgl04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdbgl04.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03L42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8947Lb_NOpR = P03L42_A8947Lb_NOpR[0] ;
         AV10Lb_nopr = 0 ;
         /* Optimized group. */
         /* Using cursor P03L43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         cV10Lb_nopr = P03L43_AV10Lb_nopr[0] ;
         pr_default.close(1);
         AV10Lb_nopr = (int)(AV10Lb_nopr+cV10Lb_nopr*1) ;
         /* End optimized group. */
         A8947Lb_NOpR = AV10Lb_nopr ;
         /* Using cursor P03L44 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A8947Lb_NOpR), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdbgl04.this.A396EmprCod;
      this.aP1[0] = pdbgl04.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pdbgl04");
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
      P03L42_A396EmprCod = new String[] {""} ;
      P03L42_A5532Lb_numero = new int[1] ;
      P03L42_A8947Lb_NOpR = new int[1] ;
      P03L43_AV10Lb_nopr = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pdbgl04__default(),
         new Object[] {
             new Object[] {
            P03L42_A396EmprCod, P03L42_A5532Lb_numero, P03L42_A8947Lb_NOpR
            }
            , new Object[] {
            P03L43_AV10Lb_nopr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private int A8947Lb_NOpR ;
   private int AV10Lb_nopr ;
   private int cV10Lb_nopr ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03L42_A396EmprCod ;
   private int[] P03L42_A5532Lb_numero ;
   private int[] P03L42_A8947Lb_NOpR ;
   private int[] P03L43_AV10Lb_nopr ;
}

final  class pdbgl04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03L42", "SELECT EmprCod, Lb_numero, Lb_NOpR FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03L43", "SELECT COUNT(*) FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03L44", "UPDATE TXPENS001 SET Lb_NOpR=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

