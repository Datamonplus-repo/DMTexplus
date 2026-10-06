package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumalb extends GXProcedure
{
   public pnumalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumalb.class ), "" );
   }

   public pnumalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 )
   {
      pnumalb.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      pnumalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumalb.this.AV16ContCod = aP1[0];
      this.aP1 = aP1;
      pnumalb.this.AV15ContVal = aP2[0];
      this.aP2 = aP2;
      pnumalb.this.AV19AlbProPri = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00HQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV16ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P00HQ2_A313ContCod[0] ;
         A316ContVal = P00HQ2_A316ContVal[0] ;
         AV15ContVal = A316ContVal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV17Exist = (byte)(0) ;
      while ( AV17Exist == 0 )
      {
         AV15ContVal = (int)(AV15ContVal+1) ;
         AV17Exist = (byte)(1) ;
         /* Using cursor P00HQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15ContVal), AV19AlbProPri});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A39AlbProPri = P00HQ3_A39AlbProPri[0] ;
            A30AlbProCod = P00HQ3_A30AlbProCod[0] ;
            AV17Exist = (byte)(0) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      /* Optimized UPDATE. */
      /* Using cursor P00HQ4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV15ContVal), A396EmprCod, AV16ContCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumalb.this.A396EmprCod;
      this.aP1[0] = pnumalb.this.AV16ContCod;
      this.aP2[0] = pnumalb.this.AV15ContVal;
      this.aP3[0] = pnumalb.this.AV19AlbProPri;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnumalb");
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
      P00HQ2_A396EmprCod = new String[] {""} ;
      P00HQ2_A313ContCod = new String[] {""} ;
      P00HQ2_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      P00HQ3_A396EmprCod = new String[] {""} ;
      P00HQ3_A39AlbProPri = new String[] {""} ;
      P00HQ3_A30AlbProCod = new long[1] ;
      A39AlbProPri = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumalb__default(),
         new Object[] {
             new Object[] {
            P00HQ2_A396EmprCod, P00HQ2_A313ContCod, P00HQ2_A316ContVal
            }
            , new Object[] {
            P00HQ3_A396EmprCod, P00HQ3_A39AlbProPri, P00HQ3_A30AlbProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17Exist ;
   private short Gx_err ;
   private int AV15ContVal ;
   private int A316ContVal ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV16ContCod ;
   private String AV19AlbProPri ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A39AlbProPri ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00HQ2_A396EmprCod ;
   private String[] P00HQ2_A313ContCod ;
   private int[] P00HQ2_A316ContVal ;
   private String[] P00HQ3_A396EmprCod ;
   private String[] P00HQ3_A39AlbProPri ;
   private long[] P00HQ3_A30AlbProCod ;
}

final  class pnumalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HQ2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00HQ3", "SELECT EmprCod, AlbProPri, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ? and AlbProCod = ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00HQ4", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

