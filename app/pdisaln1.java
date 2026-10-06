package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisaln1 extends GXProcedure
{
   public pdisaln1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisaln1.class ), "" );
   }

   public pdisaln1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 )
   {
      pdisaln1.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 )
   {
      pdisaln1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisaln1.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisaln1.this.AV11Piezas = aP2[0];
      this.aP2 = aP2;
      pdisaln1.this.AV8DisPieNor = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01632 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A365DisDes = P01632_A365DisDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A386DisPieNor = (short)(getDisPieNor0( A396EmprCod, A361DisCod)) ;
         }
         else
         {
            A386DisPieNor = (short)(0) ;
         }
         AV8DisPieNor = (short)(A386DisPieNor+AV11Piezas) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisaln1.this.A396EmprCod;
      this.aP1[0] = pdisaln1.this.A361DisCod;
      this.aP2[0] = pdisaln1.this.AV11Piezas;
      this.aP3[0] = pdisaln1.this.AV8DisPieNor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public int getDisPieNor0( String E396EmprCod ,
                             int E361DisCod )
   {
      X673Piezas = 0 ;
      /* Using cursor P01633 */
      pr_default.execute(1, new Object[] {E396EmprCod, Integer.valueOf(E361DisCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         X673Piezas = P01633_A673Piezas[0] ;
      }
      pr_default.close(1);
      return X673Piezas ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      P01632_A396EmprCod = new String[] {""} ;
      P01632_A361DisCod = new int[1] ;
      P01632_A365DisDes = new String[] {""} ;
      A365DisDes = "" ;
      P01633_A673Piezas = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisaln1__default(),
         new Object[] {
             new Object[] {
            P01632_A396EmprCod, P01632_A361DisCod, P01632_A365DisDes
            }
            , new Object[] {
            P01633_A673Piezas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8DisPieNor ;
   private short A386DisPieNor ;
   private short Gx_err ;
   private int A361DisCod ;
   private int AV11Piezas ;
   private int X673Piezas ;
   private int E361DisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String E396EmprCod ;
   private short[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01632_A396EmprCod ;
   private int[] P01632_A361DisCod ;
   private String[] P01632_A365DisDes ;
   private int[] P01633_A673Piezas ;
}

final  class pdisaln1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01632", "SELECT EmprCod, DisCod, DisDes FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01633", "SELECT SUM(Piezas) AS GXC1 FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

