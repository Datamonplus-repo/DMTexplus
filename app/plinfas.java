package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plinfas extends GXProcedure
{
   public plinfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plinfas.class ), "" );
   }

   public plinfas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 )
   {
      plinfas.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 )
   {
      plinfas.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      plinfas.this.AV15ProCod = aP1[0];
      this.aP1 = aP1;
      plinfas.this.AV18DisCod = aP2[0];
      this.aP2 = aP2;
      plinfas.this.AV16DisFasLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000H2 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV18DisCod), AV15ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P000H2_A758ProCod[0] ;
         A361DisCod = P000H2_A361DisCod[0] ;
         A396EmprCod = P000H2_A396EmprCod[0] ;
         A846UltFasLin = P000H2_A846UltFasLin[0] ;
         if ( ( A846UltFasLin + 100 ) <= 9900 )
         {
            A846UltFasLin = (short)(A846UltFasLin+100) ;
            AV16DisFasLin = A846UltFasLin ;
         }
         else
         {
            AV16DisFasLin = (short)(9999) ;
         }
         /* Using cursor P000H3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A846UltFasLin), A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plinfas.this.AV17EmprCod;
      this.aP1[0] = plinfas.this.AV15ProCod;
      this.aP2[0] = plinfas.this.AV18DisCod;
      this.aP3[0] = plinfas.this.AV16DisFasLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "plinfas");
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
      P000H2_A758ProCod = new String[] {""} ;
      P000H2_A361DisCod = new int[1] ;
      P000H2_A396EmprCod = new String[] {""} ;
      P000H2_A846UltFasLin = new short[1] ;
      A758ProCod = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plinfas__default(),
         new Object[] {
             new Object[] {
            P000H2_A758ProCod, P000H2_A361DisCod, P000H2_A396EmprCod, P000H2_A846UltFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16DisFasLin ;
   private short A846UltFasLin ;
   private short Gx_err ;
   private int AV18DisCod ;
   private int A361DisCod ;
   private String AV17EmprCod ;
   private String AV15ProCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A396EmprCod ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000H2_A758ProCod ;
   private int[] P000H2_A361DisCod ;
   private String[] P000H2_A396EmprCod ;
   private short[] P000H2_A846UltFasLin ;
}

final  class plinfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000H2", "SELECT ProCod, DisCod, EmprCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P000H3", "UPDATE TXPDISLIN SET UltFasLin=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

