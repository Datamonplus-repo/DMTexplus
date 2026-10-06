package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pregcor1 extends GXProcedure
{
   public pregcor1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pregcor1.class ), "" );
   }

   public pregcor1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pregcor1.this.aP2 = new int[] {0};
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
      pregcor1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pregcor1.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pregcor1.this.AV19Lb_rcLin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02PG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6932Lb_Linurc = P02PG2_A6932Lb_Linurc[0] ;
         n6932Lb_Linurc = P02PG2_n6932Lb_Linurc[0] ;
         if ( ( A6932Lb_Linurc + 1 ) <= 99999999 )
         {
            A6932Lb_Linurc = (int)(A6932Lb_Linurc+1) ;
            n6932Lb_Linurc = false ;
            AV19Lb_rcLin = A6932Lb_Linurc ;
         }
         else
         {
            AV19Lb_rcLin = 99999999 ;
         }
         /* Using cursor P02PG3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n6932Lb_Linurc), Integer.valueOf(A6932Lb_Linurc), A396EmprCod, Integer.valueOf(A252CliCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pregcor1.this.A396EmprCod;
      this.aP1[0] = pregcor1.this.A252CliCod;
      this.aP2[0] = pregcor1.this.AV19Lb_rcLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "pregcor1");
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
      P02PG2_A396EmprCod = new String[] {""} ;
      P02PG2_A252CliCod = new int[1] ;
      P02PG2_A6932Lb_Linurc = new int[1] ;
      P02PG2_n6932Lb_Linurc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pregcor1__default(),
         new Object[] {
             new Object[] {
            P02PG2_A396EmprCod, P02PG2_A252CliCod, P02PG2_A6932Lb_Linurc, P02PG2_n6932Lb_Linurc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV19Lb_rcLin ;
   private int A6932Lb_Linurc ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n6932Lb_Linurc ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02PG2_A396EmprCod ;
   private int[] P02PG2_A252CliCod ;
   private int[] P02PG2_A6932Lb_Linurc ;
   private boolean[] P02PG2_n6932Lb_Linurc ;
}

final  class pregcor1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02PG2", "SELECT EmprCod, CliCod, Lb_Linurc FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02PG3", "UPDATE TXPCLIENT SET Lb_Linurc=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

