package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelihrp extends GXProcedure
{
   public pelihrp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelihrp.class ), "" );
   }

   public pelihrp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pelihrp.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pelihrp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelihrp.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pelihrp.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pelihrp.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pelihrp.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00F32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1265BarAlbPie = P00F32_A1265BarAlbPie[0] ;
         /* Using cursor P00F33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A2754BarSitExt = P00F33_A2754BarSitExt[0] ;
         A213BarSit = P00F33_A213BarSit[0] ;
         /* Using cursor P00F34 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A2242AlbSec = P00F34_A2242AlbSec[0] ;
         /* Optimized DELETE. */
         /* Using cursor P00F35 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized DELETE. */
         if ( A2754BarSitExt == 9 )
         {
            A2754BarSitExt = (byte)(1) ;
         }
         if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "A", "")) == 0 )
         {
            if ( A213BarSit == 9 )
            {
               A213BarSit = (byte)(2) ;
            }
         }
         /* Using cursor P00F36 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Using cursor P00F37 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A2754BarSitExt), Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelihrp.this.A396EmprCod;
      this.aP1[0] = pelihrp.this.A30AlbProCod;
      this.aP2[0] = pelihrp.this.A129BarCod;
      this.aP3[0] = pelihrp.this.A132BarCodReo;
      this.aP4[0] = pelihrp.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelihrp");
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
      P00F32_A396EmprCod = new String[] {""} ;
      P00F32_A30AlbProCod = new long[1] ;
      P00F32_A129BarCod = new int[1] ;
      P00F32_A132BarCodReo = new byte[1] ;
      P00F32_A130BarCodPar = new String[] {""} ;
      P00F32_A1265BarAlbPie = new int[1] ;
      P00F33_A2754BarSitExt = new byte[1] ;
      P00F33_A213BarSit = new byte[1] ;
      P00F34_A2242AlbSec = new String[] {""} ;
      A2242AlbSec = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelihrp__default(),
         new Object[] {
             new Object[] {
            P00F32_A396EmprCod, P00F32_A30AlbProCod, P00F32_A129BarCod, P00F32_A132BarCodReo, P00F32_A130BarCodPar, P00F32_A1265BarAlbPie
            }
            , new Object[] {
            P00F33_A2754BarSitExt, P00F33_A213BarSit
            }
            , new Object[] {
            P00F34_A2242AlbSec
            }
            , new Object[] {
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

   private byte A132BarCodReo ;
   private byte A2754BarSitExt ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2242AlbSec ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00F32_A396EmprCod ;
   private long[] P00F32_A30AlbProCod ;
   private int[] P00F32_A129BarCod ;
   private byte[] P00F32_A132BarCodReo ;
   private String[] P00F32_A130BarCodPar ;
   private int[] P00F32_A1265BarAlbPie ;
   private byte[] P00F33_A2754BarSitExt ;
   private byte[] P00F33_A213BarSit ;
   private String[] P00F34_A2242AlbSec ;
}

final  class pelihrp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00F32", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbPie FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00F33", "SELECT BarSitExt, BarSit FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00F34", "SELECT AlbSec FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00F35", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P00F36", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P00F37", "UPDATE TXPBARCAD SET BarSitExt=?, BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

