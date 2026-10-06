package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexpdo3 extends GXProcedure
{
   public pexpdo3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexpdo3.class ), "" );
   }

   public pexpdo3( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pexpdo3.this.aP1 = new int[] {0};
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
      pexpdo3.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pexpdo3.this.AV16ExtPdoAlb = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Flag = (byte)(0) ;
      /* Using cursor P00DM2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16ExtPdoAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2333ExtPdoAlb = P00DM2_A2333ExtPdoAlb[0] ;
         A396EmprCod = P00DM2_A396EmprCod[0] ;
         A2334ExtPdoFec = P00DM2_A2334ExtPdoFec[0] ;
         n2334ExtPdoFec = P00DM2_n2334ExtPdoFec[0] ;
         /* Using cursor P00DM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2345ExtPdoObs = P00DM3_A2345ExtPdoObs[0] ;
            n2345ExtPdoObs = P00DM3_n2345ExtPdoObs[0] ;
            A2790ExtPdoLin = P00DM3_A2790ExtPdoLin[0] ;
            AV17Flag = (byte)(1) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV17Flag == 0 )
         {
            /* Using cursor P00DM4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A2333ExtPdoAlb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTPD");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexpdo3.this.AV15EmprCod;
      this.aP1[0] = pexpdo3.this.AV16ExtPdoAlb;
      Application.commitDataStores(context, remoteHandle, pr_default, "pexpdo3");
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
      P00DM2_A2333ExtPdoAlb = new int[1] ;
      P00DM2_A396EmprCod = new String[] {""} ;
      P00DM2_A2334ExtPdoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00DM2_n2334ExtPdoFec = new boolean[] {false} ;
      A396EmprCod = "" ;
      A2334ExtPdoFec = GXutil.nullDate() ;
      P00DM3_A396EmprCod = new String[] {""} ;
      P00DM3_A2333ExtPdoAlb = new int[1] ;
      P00DM3_A2345ExtPdoObs = new String[] {""} ;
      P00DM3_n2345ExtPdoObs = new boolean[] {false} ;
      P00DM3_A2790ExtPdoLin = new short[1] ;
      A2345ExtPdoObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexpdo3__default(),
         new Object[] {
             new Object[] {
            P00DM2_A2333ExtPdoAlb, P00DM2_A396EmprCod, P00DM2_A2334ExtPdoFec, P00DM2_n2334ExtPdoFec
            }
            , new Object[] {
            P00DM3_A396EmprCod, P00DM3_A2333ExtPdoAlb, P00DM3_A2345ExtPdoObs, P00DM3_n2345ExtPdoObs, P00DM3_A2790ExtPdoLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Flag ;
   private short A2790ExtPdoLin ;
   private short Gx_err ;
   private int AV16ExtPdoAlb ;
   private int A2333ExtPdoAlb ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A2345ExtPdoObs ;
   private java.util.Date A2334ExtPdoFec ;
   private boolean n2334ExtPdoFec ;
   private boolean n2345ExtPdoObs ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private int[] P00DM2_A2333ExtPdoAlb ;
   private String[] P00DM2_A396EmprCod ;
   private java.util.Date[] P00DM2_A2334ExtPdoFec ;
   private boolean[] P00DM2_n2334ExtPdoFec ;
   private String[] P00DM3_A396EmprCod ;
   private int[] P00DM3_A2333ExtPdoAlb ;
   private String[] P00DM3_A2345ExtPdoObs ;
   private boolean[] P00DM3_n2345ExtPdoObs ;
   private short[] P00DM3_A2790ExtPdoLin ;
}

final  class pexpdo3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DM2", "SELECT ExtPdoAlb, EmprCod, ExtPdoFec FROM TXPCEXTPD WHERE EmprCod = ? and ExtPdoAlb = ? ORDER BY EmprCod, ExtPdoAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00DM3", "SELECT EmprCod, ExtPdoAlb, ExtPdoObs, ExtPdoLin FROM TXPLEXTPD WHERE EmprCod = ? and ExtPdoAlb = ? ORDER BY EmprCod, ExtPdoAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00DM4", "DELETE FROM TXPCEXTPD  WHERE EmprCod = ? AND ExtPdoAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTPD")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
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

