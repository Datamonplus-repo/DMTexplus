package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdemo4 extends GXProcedure
{
   public pdemo4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdemo4.class ), "" );
   }

   public pdemo4( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pdemo4.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pdemo4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdemo4.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01N22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2242AlbSec = P01N22_A2242AlbSec[0] ;
         AV24BarTipdis = "" ;
         /* Using cursor P01N23 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2010BarTipDis = P01N23_A2010BarTipDis[0] ;
            A130BarCodPar = P01N23_A130BarCodPar[0] ;
            A132BarCodReo = P01N23_A132BarCodReo[0] ;
            A129BarCod = P01N23_A129BarCod[0] ;
            A2010BarTipDis = P01N23_A2010BarTipDis[0] ;
            AV24BarTipdis = A2010BarTipDis ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A2242AlbSec = AV24BarTipdis ;
         Gx_msg = httpContext.getMessage( "Tipo= ", "") + AV24BarTipdis ;
         System.out.println( Gx_msg );
         /* Using cursor P01N24 */
         pr_default.execute(2, new Object[] {A2242AlbSec, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdemo4.this.A396EmprCod;
      this.aP1[0] = pdemo4.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdemo4");
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
      P01N22_A396EmprCod = new String[] {""} ;
      P01N22_A30AlbProCod = new long[1] ;
      P01N22_A2242AlbSec = new String[] {""} ;
      A2242AlbSec = "" ;
      AV24BarTipdis = "" ;
      P01N23_A396EmprCod = new String[] {""} ;
      P01N23_A30AlbProCod = new long[1] ;
      P01N23_A2010BarTipDis = new String[] {""} ;
      P01N23_A130BarCodPar = new String[] {""} ;
      P01N23_A132BarCodReo = new byte[1] ;
      P01N23_A129BarCod = new int[1] ;
      A2010BarTipDis = "" ;
      A130BarCodPar = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdemo4__default(),
         new Object[] {
             new Object[] {
            P01N22_A396EmprCod, P01N22_A30AlbProCod, P01N22_A2242AlbSec
            }
            , new Object[] {
            P01N23_A396EmprCod, P01N23_A30AlbProCod, P01N23_A2010BarTipDis, P01N23_A130BarCodPar, P01N23_A132BarCodReo, P01N23_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A2242AlbSec ;
   private String AV24BarTipdis ;
   private String A2010BarTipDis ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01N22_A396EmprCod ;
   private long[] P01N22_A30AlbProCod ;
   private String[] P01N22_A2242AlbSec ;
   private String[] P01N23_A396EmprCod ;
   private long[] P01N23_A30AlbProCod ;
   private String[] P01N23_A2010BarTipDis ;
   private String[] P01N23_A130BarCodPar ;
   private byte[] P01N23_A132BarCodReo ;
   private int[] P01N23_A129BarCod ;
}

final  class pdemo4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01N22", "SELECT EmprCod, AlbProCod, AlbSec FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01N23", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarTipDis, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01N24", "UPDATE TXPCALPRD SET AlbSec=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

