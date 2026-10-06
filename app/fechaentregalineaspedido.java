package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class fechaentregalineaspedido extends GXProcedure
{
   public fechaentregalineaspedido( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( fechaentregalineaspedido.class ), "" );
   }

   public fechaentregalineaspedido( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      fechaentregalineaspedido.this.aP1 = new int[] {0};
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
      fechaentregalineaspedido.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      fechaentregalineaspedido.this.A658PedCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P09XI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A658PedCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A662PedFecEnt = P09XI2_A662PedFecEnt[0] ;
         AV16PedFecEnt = A662PedFecEnt ;
         /* Optimized UPDATE. */
         /* Using cursor P09XI3 */
         pr_default.execute(1, new Object[] {AV16PedFecEnt, A396EmprCod, Integer.valueOf(A658PedCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = fechaentregalineaspedido.this.A396EmprCod;
      this.aP1[0] = fechaentregalineaspedido.this.A658PedCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "fechaentregalineaspedido");
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
      P09XI2_A396EmprCod = new String[] {""} ;
      P09XI2_A658PedCod = new int[1] ;
      P09XI2_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      A662PedFecEnt = GXutil.nullDate() ;
      AV16PedFecEnt = GXutil.nullDate() ;
      A8158PedFecPEn = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.fechaentregalineaspedido__default(),
         new Object[] {
             new Object[] {
            P09XI2_A396EmprCod, P09XI2_A658PedCod, P09XI2_A662PedFecEnt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A658PedCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date AV16PedFecEnt ;
   private java.util.Date A8158PedFecPEn ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P09XI2_A396EmprCod ;
   private int[] P09XI2_A658PedCod ;
   private java.util.Date[] P09XI2_A662PedFecEnt ;
}

final  class fechaentregalineaspedido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09XI2", "SELECT EmprCod, PedCod, PedFecEnt FROM TXPCPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09XI3", "UPDATE TXPLPEDID SET PedFecPEn=?  WHERE EmprCod = ? and PedCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPEDID")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

