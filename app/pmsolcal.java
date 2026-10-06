package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmsolcal extends GXProcedure
{
   public pmsolcal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmsolcal.class ), "" );
   }

   public pmsolcal( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pmsolcal.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pmsolcal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmsolcal.this.A9428SMCod = aP1[0];
      this.aP1 = aP1;
      pmsolcal.this.AV8SMCal = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03MT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9428SMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9522SMEst = P03MT2_A9522SMEst[0] ;
         n9522SMEst = P03MT2_n9522SMEst[0] ;
         A9524SMCal = P03MT2_A9524SMCal[0] ;
         n9524SMCal = P03MT2_n9524SMCal[0] ;
         A9522SMEst = httpContext.getMessage( "T", "") ;
         n9522SMEst = false ;
         A9524SMCal = AV8SMCal ;
         n9524SMCal = false ;
         /* Using cursor P03MT3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n9522SMEst), A9522SMEst, Boolean.valueOf(n9524SMCal), Byte.valueOf(A9524SMCal), A396EmprCod, Integer.valueOf(A9428SMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmsolcal.this.A396EmprCod;
      this.aP1[0] = pmsolcal.this.A9428SMCod;
      this.aP2[0] = pmsolcal.this.AV8SMCal;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmsolcal");
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
      P03MT2_A396EmprCod = new String[] {""} ;
      P03MT2_A9428SMCod = new int[1] ;
      P03MT2_A9522SMEst = new String[] {""} ;
      P03MT2_n9522SMEst = new boolean[] {false} ;
      P03MT2_A9524SMCal = new byte[1] ;
      P03MT2_n9524SMCal = new boolean[] {false} ;
      A9522SMEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmsolcal__default(),
         new Object[] {
             new Object[] {
            P03MT2_A396EmprCod, P03MT2_A9428SMCod, P03MT2_A9522SMEst, P03MT2_n9522SMEst, P03MT2_A9524SMCal, P03MT2_n9524SMCal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8SMCal ;
   private byte A9524SMCal ;
   private short Gx_err ;
   private int A9428SMCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9522SMEst ;
   private boolean n9522SMEst ;
   private boolean n9524SMCal ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MT2_A396EmprCod ;
   private int[] P03MT2_A9428SMCod ;
   private String[] P03MT2_A9522SMEst ;
   private boolean[] P03MT2_n9522SMEst ;
   private byte[] P03MT2_A9524SMCal ;
   private boolean[] P03MT2_n9524SMCal ;
}

final  class pmsolcal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MT2", "SELECT EmprCod, SMCod, SMEst, SMCal FROM TXPMSOLIC WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod  FOR UPDATE OF SMEst, SMCal NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03MT3", "UPDATE TXPMSOLIC SET SMEst=?, SMCal=?  WHERE EmprCod = ? AND SMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMSOLIC")
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
      }
   }

}

