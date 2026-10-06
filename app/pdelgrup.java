package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelgrup extends GXProcedure
{
   public pdelgrup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelgrup.class ), "" );
   }

   public pdelgrup( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdelgrup.this.aP1 = new int[] {0};
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
      pdelgrup.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelgrup.this.AV8OpeCod_in = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01DW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8OpeCod_in)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A503GruOpeCod = P01DW2_A503GruOpeCod[0] ;
         A504GruOpeDsc = P01DW2_A504GruOpeDsc[0] ;
         n504GruOpeDsc = P01DW2_n504GruOpeDsc[0] ;
         /* Optimized DELETE. */
         /* Using cursor P01DW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLGRUOP");
         /* End optimized DELETE. */
         /* Using cursor P01DW4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRUOP");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelgrup.this.A396EmprCod;
      this.aP1[0] = pdelgrup.this.AV8OpeCod_in;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelgrup");
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
      P01DW2_A396EmprCod = new String[] {""} ;
      P01DW2_A503GruOpeCod = new int[1] ;
      P01DW2_A504GruOpeDsc = new String[] {""} ;
      P01DW2_n504GruOpeDsc = new boolean[] {false} ;
      A504GruOpeDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelgrup__default(),
         new Object[] {
             new Object[] {
            P01DW2_A396EmprCod, P01DW2_A503GruOpeCod, P01DW2_A504GruOpeDsc, P01DW2_n504GruOpeDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8OpeCod_in ;
   private int A503GruOpeCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A504GruOpeDsc ;
   private boolean n504GruOpeDsc ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01DW2_A396EmprCod ;
   private int[] P01DW2_A503GruOpeCod ;
   private String[] P01DW2_A504GruOpeDsc ;
   private boolean[] P01DW2_n504GruOpeDsc ;
}

final  class pdelgrup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01DW2", "SELECT EmprCod, GruOpeCod, GruOpeDsc FROM TXPCGRUOP WHERE EmprCod = ? and GruOpeCod = ? ORDER BY EmprCod, GruOpeCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01DW3", "DELETE FROM TXPLGRUOP  WHERE EmprCod = ? and GruOpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLGRUOP")
         ,new UpdateCursor("P01DW4", "DELETE FROM TXPCGRUOP  WHERE EmprCod = ? AND GruOpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRUOP")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

