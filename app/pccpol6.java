package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pccpol6 extends GXProcedure
{
   public pccpol6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pccpol6.class ), "" );
   }

   public pccpol6( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      pccpol6.this.AV10EmprCod = aP0;
      pccpol6.this.AV9CCTCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P030Z2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV9CCTCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4031CCTCod = P030Z2_A4031CCTCod[0] ;
         A396EmprCod = P030Z2_A396EmprCod[0] ;
         /* Using cursor P030Z3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4034CCTLin = P030Z3_A4034CCTLin[0] ;
            /* Optimized DELETE. */
            /* Using cursor P030Z4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
            /* End optimized DELETE. */
            /* Using cursor P030Z5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pccpol6");
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
      P030Z2_A4031CCTCod = new int[1] ;
      P030Z2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      P030Z3_A396EmprCod = new String[] {""} ;
      P030Z3_A4031CCTCod = new int[1] ;
      P030Z3_A4034CCTLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pccpol6__default(),
         new Object[] {
             new Object[] {
            P030Z2_A4031CCTCod, P030Z2_A396EmprCod
            }
            , new Object[] {
            P030Z3_A396EmprCod, P030Z3_A4031CCTCod, P030Z3_A4034CCTLin
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

   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV9CCTCod ;
   private int A4031CCTCod ;
   private String AV10EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private int[] P030Z2_A4031CCTCod ;
   private String[] P030Z2_A396EmprCod ;
   private String[] P030Z3_A396EmprCod ;
   private int[] P030Z3_A4031CCTCod ;
   private short[] P030Z3_A4034CCTLin ;
}

final  class pccpol6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P030Z2", "SELECT CCTCod, EmprCod FROM TXPCCDef WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P030Z3", "SELECT EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P030Z4", "DELETE FROM TXPCCDef2  WHERE EmprCod = ? and CCTCod = ? and CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P030Z5", "DELETE FROM TXPCCDef1  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef1")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

