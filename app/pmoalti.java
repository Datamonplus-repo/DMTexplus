package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmoalti extends GXProcedure
{
   public pmoalti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmoalti.class ), "" );
   }

   public pmoalti( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      pmoalti.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             long[] aP4 )
   {
      pmoalti.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmoalti.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmoalti.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmoalti.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmoalti.this.AV15AlbProCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00FT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2242AlbSec = P00FT2_A2242AlbSec[0] ;
         A30AlbProCod = P00FT2_A30AlbProCod[0] ;
         A2242AlbSec = P00FT2_A2242AlbSec[0] ;
         if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "T", "")) == 0 )
         {
            AV17BarAlbTin = (int)(A30AlbProCod) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      n2397BarAlbTin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00FT3 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n2397BarAlbTin), Integer.valueOf(AV17BarAlbTin), A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmoalti.this.A396EmprCod;
      this.aP1[0] = pmoalti.this.A129BarCod;
      this.aP2[0] = pmoalti.this.A132BarCodReo;
      this.aP3[0] = pmoalti.this.A130BarCodPar;
      this.aP4[0] = pmoalti.this.AV15AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmoalti");
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
      P00FT2_A396EmprCod = new String[] {""} ;
      P00FT2_A129BarCod = new int[1] ;
      P00FT2_A132BarCodReo = new byte[1] ;
      P00FT2_A130BarCodPar = new String[] {""} ;
      P00FT2_A2242AlbSec = new String[] {""} ;
      P00FT2_A30AlbProCod = new long[1] ;
      A2242AlbSec = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmoalti__default(),
         new Object[] {
             new Object[] {
            P00FT2_A396EmprCod, P00FT2_A129BarCod, P00FT2_A132BarCodReo, P00FT2_A130BarCodPar, P00FT2_A2242AlbSec, P00FT2_A30AlbProCod
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
   private int AV17BarAlbTin ;
   private int A2397BarAlbTin ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2242AlbSec ;
   private boolean n2397BarAlbTin ;
   private long[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00FT2_A396EmprCod ;
   private int[] P00FT2_A129BarCod ;
   private byte[] P00FT2_A132BarCodReo ;
   private String[] P00FT2_A130BarCodPar ;
   private String[] P00FT2_A2242AlbSec ;
   private long[] P00FT2_A30AlbProCod ;
}

final  class pmoalti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FT2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbSec, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FT3", "UPDATE TXPALBBAR SET BarAlbTin=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
      }
   }

}

