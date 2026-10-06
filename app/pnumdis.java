package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumdis extends GXProcedure
{
   public pnumdis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumdis.class ), "" );
   }

   public pnumdis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 )
   {
      pnumdis.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 )
   {
      pnumdis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumdis.this.A313ContCod = aP1[0];
      this.aP1 = aP1;
      pnumdis.this.A361DisCod = aP2[0];
      this.aP2 = aP2;
      pnumdis.this.AV15FlagDisp = aP3[0];
      this.aP3 = aP3;
      pnumdis.this.AV16FlagCont = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16FlagCont = (byte)(0) ;
      AV15FlagDisp = (byte)(0) ;
      /* Using cursor P00L02 */
      pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A316ContVal = P00L02_A316ContVal[0] ;
         if ( A361DisCod > A316ContVal )
         {
            A316ContVal = A361DisCod ;
            AV16FlagCont = (byte)(1) ;
         }
         /* Using cursor P00L03 */
         pr_default.execute(1, new Object[] {Integer.valueOf(A316ContVal), A396EmprCod, A313ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00L04 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         AV15FlagDisp = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumdis.this.A396EmprCod;
      this.aP1[0] = pnumdis.this.A313ContCod;
      this.aP2[0] = pnumdis.this.A361DisCod;
      this.aP3[0] = pnumdis.this.AV15FlagDisp;
      this.aP4[0] = pnumdis.this.AV16FlagCont;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumdis");
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
      P00L02_A396EmprCod = new String[] {""} ;
      P00L02_A313ContCod = new String[] {""} ;
      P00L02_A316ContVal = new int[1] ;
      P00L04_A396EmprCod = new String[] {""} ;
      P00L04_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumdis__default(),
         new Object[] {
             new Object[] {
            P00L02_A396EmprCod, P00L02_A313ContCod, P00L02_A316ContVal
            }
            , new Object[] {
            }
            , new Object[] {
            P00L04_A396EmprCod, P00L04_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15FlagDisp ;
   private byte AV16FlagCont ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A316ContVal ;
   private String A396EmprCod ;
   private String A313ContCod ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00L02_A396EmprCod ;
   private String[] P00L02_A313ContCod ;
   private int[] P00L02_A316ContVal ;
   private String[] P00L04_A396EmprCod ;
   private int[] P00L04_A361DisCod ;
}

final  class pnumdis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00L02", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00L03", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new ForEachCursor("P00L04", "SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

