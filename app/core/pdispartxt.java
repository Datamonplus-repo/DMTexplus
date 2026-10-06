package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdispartxt extends GXProcedure
{
   public pdispartxt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdispartxt.class ), "" );
   }

   public pdispartxt( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             short aP4 )
   {
      pdispartxt.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        short aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             short aP4 ,
                             String[] aP5 )
   {
      pdispartxt.this.A396EmprCod = aP0;
      pdispartxt.this.A361DisCod = aP1;
      pdispartxt.this.A758ProCod = aP2;
      pdispartxt.this.A368DisFasLin = aP3;
      pdispartxt.this.A1664ParFasCod = aP4;
      pdispartxt.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01YQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A1664ParFasCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3687DisParTxt = P01YQ2_A3687DisParTxt[0] ;
         AV8Profasnot = A3687DisParTxt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pdispartxt.this.AV8Profasnot;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Profasnot = "" ;
      scmdbuf = "" ;
      P01YQ2_A3687DisParTxt = new String[] {""} ;
      P01YQ2_A396EmprCod = new String[] {""} ;
      P01YQ2_A361DisCod = new int[1] ;
      P01YQ2_A758ProCod = new String[] {""} ;
      P01YQ2_A368DisFasLin = new short[1] ;
      P01YQ2_A1664ParFasCod = new short[1] ;
      A3687DisParTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pdispartxt__default(),
         new Object[] {
             new Object[] {
            P01YQ2_A3687DisParTxt, P01YQ2_A396EmprCod, P01YQ2_A361DisCod, P01YQ2_A758ProCod, P01YQ2_A368DisFasLin, P01YQ2_A1664ParFasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A368DisFasLin ;
   private short A1664ParFasCod ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A3687DisParTxt ;
   private String AV8Profasnot ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01YQ2_A3687DisParTxt ;
   private String[] P01YQ2_A396EmprCod ;
   private int[] P01YQ2_A361DisCod ;
   private String[] P01YQ2_A758ProCod ;
   private short[] P01YQ2_A368DisFasLin ;
   private short[] P01YQ2_A1664ParFasCod ;
}

final  class pdispartxt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01YQ2", "SELECT DisParTxt, EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and ParFasCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

