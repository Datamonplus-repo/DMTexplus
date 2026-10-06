package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdatweb extends GXProcedure
{
   public pdatweb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdatweb.class ), "" );
   }

   public pdatweb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pdatweb.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pdatweb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdatweb.this.AV8BarLineaID = aP1[0];
      this.aP1 = aP1;
      pdatweb.this.AV9Lineadsc = aP2[0];
      this.aP2 = aP2;
      pdatweb.this.AV10BarCanalID = aP3[0];
      this.aP3 = aP3;
      pdatweb.this.AV11CliNomCanal = aP4[0];
      this.aP4 = aP4;
      pdatweb.this.AV12BarProdID = aP5[0];
      this.aP5 = aP5;
      pdatweb.this.AV13Prodds = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11CliNomCanal = "" ;
      /* Using cursor P06242 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10BarCanalID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12843CanalID = P06242_A12843CanalID[0] ;
         A12844CanalNm = P06242_A12844CanalNm[0] ;
         n12844CanalNm = P06242_n12844CanalNm[0] ;
         AV11CliNomCanal = A12844CanalNm ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV13Prodds = " " ;
      /* Using cursor P06243 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV12BarProdID});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A12755PRODId = P06243_A12755PRODId[0] ;
         A12756PRODDs = P06243_A12756PRODDs[0] ;
         n12756PRODDs = P06243_n12756PRODDs[0] ;
         AV13Prodds = A12756PRODDs ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV9Lineadsc = " " ;
      /* Using cursor P06244 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV8BarLineaID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13064LineaID = P06244_A13064LineaID[0] ;
         A13065LineaDsc = P06244_A13065LineaDsc[0] ;
         n13065LineaDsc = P06244_n13065LineaDsc[0] ;
         AV9Lineadsc = A13065LineaDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdatweb.this.A396EmprCod;
      this.aP1[0] = pdatweb.this.AV8BarLineaID;
      this.aP2[0] = pdatweb.this.AV9Lineadsc;
      this.aP3[0] = pdatweb.this.AV10BarCanalID;
      this.aP4[0] = pdatweb.this.AV11CliNomCanal;
      this.aP5[0] = pdatweb.this.AV12BarProdID;
      this.aP6[0] = pdatweb.this.AV13Prodds;
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
      P06242_A396EmprCod = new String[] {""} ;
      P06242_A12843CanalID = new int[1] ;
      P06242_A12844CanalNm = new String[] {""} ;
      P06242_n12844CanalNm = new boolean[] {false} ;
      A12844CanalNm = "" ;
      P06243_A396EmprCod = new String[] {""} ;
      P06243_A12755PRODId = new String[] {""} ;
      P06243_A12756PRODDs = new String[] {""} ;
      P06243_n12756PRODDs = new boolean[] {false} ;
      A12755PRODId = "" ;
      A12756PRODDs = "" ;
      P06244_A396EmprCod = new String[] {""} ;
      P06244_A13064LineaID = new short[1] ;
      P06244_A13065LineaDsc = new String[] {""} ;
      P06244_n13065LineaDsc = new boolean[] {false} ;
      A13065LineaDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdatweb__default(),
         new Object[] {
             new Object[] {
            P06242_A396EmprCod, P06242_A12843CanalID, P06242_A12844CanalNm, P06242_n12844CanalNm
            }
            , new Object[] {
            P06243_A396EmprCod, P06243_A12755PRODId, P06243_A12756PRODDs, P06243_n12756PRODDs
            }
            , new Object[] {
            P06244_A396EmprCod, P06244_A13064LineaID, P06244_A13065LineaDsc, P06244_n13065LineaDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8BarLineaID ;
   private short A13064LineaID ;
   private short Gx_err ;
   private int AV10BarCanalID ;
   private int A12843CanalID ;
   private String A396EmprCod ;
   private String AV9Lineadsc ;
   private String AV11CliNomCanal ;
   private String AV12BarProdID ;
   private String AV13Prodds ;
   private String scmdbuf ;
   private String A12844CanalNm ;
   private String A12755PRODId ;
   private String A12756PRODDs ;
   private String A13065LineaDsc ;
   private boolean n12844CanalNm ;
   private boolean n12756PRODDs ;
   private boolean n13065LineaDsc ;
   private String[] aP6 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P06242_A396EmprCod ;
   private int[] P06242_A12843CanalID ;
   private String[] P06242_A12844CanalNm ;
   private boolean[] P06242_n12844CanalNm ;
   private String[] P06243_A396EmprCod ;
   private String[] P06243_A12755PRODId ;
   private String[] P06243_A12756PRODDs ;
   private boolean[] P06243_n12756PRODDs ;
   private String[] P06244_A396EmprCod ;
   private short[] P06244_A13064LineaID ;
   private String[] P06244_A13065LineaDsc ;
   private boolean[] P06244_n13065LineaDsc ;
}

final  class pdatweb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06242", "SELECT EmprCod, CanalID, CanalNm FROM TXPCANAL WHERE EmprCod = ? and CanalID = ? ORDER BY EmprCod, CanalID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06243", "SELECT EmprCod, PRODId, PRODDs FROM TXPPRIORD WHERE EmprCod = ? and PRODId = ? ORDER BY EmprCod, PRODId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06244", "SELECT EmprCod, LineaID, LineaDsc FROM TXPLINEA WHERE EmprCod = ? and LineaID = ? ORDER BY EmprCod, LineaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

