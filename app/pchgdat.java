package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchgdat extends GXProcedure
{
   public pchgdat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchgdat.class ), "" );
   }

   public pchgdat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pchgdat.this.aP1 = new long[] {0};
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
      pchgdat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchgdat.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P015E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A34AlbProfch = P015E2_A34AlbProfch[0] ;
         AV8AlbProFch = A34AlbProfch ;
         /* Using cursor P015E3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P015E3_A129BarCod[0] ;
            A132BarCodReo = P015E3_A132BarCodReo[0] ;
            A130BarCodPar = P015E3_A130BarCodPar[0] ;
            A1261BarAlbKgmE = P015E3_A1261BarAlbKgmE[0] ;
            /* Using cursor P015E4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            /* Using cursor P015E5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A161BarFecSal = P015E5_A161BarFecSal[0] ;
            A161BarFecSal = AV8AlbProFch ;
            /* Using cursor P015E6 */
            pr_default.execute(4, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchgdat.this.A396EmprCod;
      this.aP1[0] = pchgdat.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pchgdat");
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
      P015E2_A396EmprCod = new String[] {""} ;
      P015E2_A30AlbProCod = new long[1] ;
      P015E2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      AV8AlbProFch = GXutil.nullDate() ;
      P015E3_A129BarCod = new int[1] ;
      P015E3_A132BarCodReo = new byte[1] ;
      P015E3_A130BarCodPar = new String[] {""} ;
      P015E3_A396EmprCod = new String[] {""} ;
      P015E3_A30AlbProCod = new long[1] ;
      P015E3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P015E4_A396EmprCod = new String[] {""} ;
      P015E5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A161BarFecSal = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchgdat__default(),
         new Object[] {
             new Object[] {
            P015E2_A396EmprCod, P015E2_A30AlbProCod, P015E2_A34AlbProfch
            }
            , new Object[] {
            P015E3_A129BarCod, P015E3_A132BarCodReo, P015E3_A130BarCodPar, P015E3_A396EmprCod, P015E3_A30AlbProCod, P015E3_A1261BarAlbKgmE
            }
            , new Object[] {
            P015E4_A396EmprCod
            }
            , new Object[] {
            P015E5_A161BarFecSal
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
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV8AlbProFch ;
   private java.util.Date A161BarFecSal ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P015E2_A396EmprCod ;
   private long[] P015E2_A30AlbProCod ;
   private java.util.Date[] P015E2_A34AlbProfch ;
   private int[] P015E3_A129BarCod ;
   private byte[] P015E3_A132BarCodReo ;
   private String[] P015E3_A130BarCodPar ;
   private String[] P015E3_A396EmprCod ;
   private long[] P015E3_A30AlbProCod ;
   private java.math.BigDecimal[] P015E3_A1261BarAlbKgmE ;
   private String[] P015E4_A396EmprCod ;
   private java.util.Date[] P015E5_A161BarFecSal ;
}

final  class pchgdat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P015E2", "SELECT EmprCod, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P015E3", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, AlbProCod, BarAlbKgmE FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P015E4", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P015E5", "SELECT BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015E6", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

