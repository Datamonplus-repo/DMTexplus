package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfchsal extends GXProcedure
{
   public pfchsal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfchsal.class ), "" );
   }

   public pfchsal( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     long[] aP1 )
   {
      pfchsal.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pfchsal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfchsal.this.AV22AlbProCod = aP1[0];
      this.aP1 = aP1;
      pfchsal.this.AV29AlbProFch = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23ExisteHdr = (byte)(0) ;
      AV24FecSal = GXutil.nullDate() ;
      /* Using cursor P00S72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV22AlbProCod), A396EmprCod, Long.valueOf(AV22AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P00S72_A30AlbProCod[0] ;
         A1265BarAlbPie = P00S72_A1265BarAlbPie[0] ;
         A130BarCodPar = P00S72_A130BarCodPar[0] ;
         A132BarCodReo = P00S72_A132BarCodReo[0] ;
         A129BarCod = P00S72_A129BarCod[0] ;
         /* Using cursor P00S73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A161BarFecSal = P00S73_A161BarFecSal[0] ;
         /* Using cursor P00S74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A34AlbProfch = P00S74_A34AlbProfch[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_date5[0] = AV24FecSal ;
         GXv_int6[0] = AV23ExisteHdr ;
         new app.pfchalb(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_date5, GXv_int6) ;
         pfchsal.this.A396EmprCod = GXv_char1[0] ;
         pfchsal.this.A129BarCod = GXv_int2[0] ;
         pfchsal.this.A132BarCodReo = GXv_int3[0] ;
         pfchsal.this.A130BarCodPar = GXv_char4[0] ;
         pfchsal.this.AV24FecSal = GXv_date5[0] ;
         pfchsal.this.AV23ExisteHdr = GXv_int6[0] ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24FecSal)) || (( GXutil.resetTime(AV24FecSal).before( GXutil.resetTime( A34AlbProfch )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV24FecSal), GXutil.resetTime(A34AlbProfch)) )) )
         {
            A161BarFecSal = A34AlbProfch ;
         }
         /* Using cursor P00S75 */
         pr_default.execute(3, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfchsal.this.A396EmprCod;
      this.aP1[0] = pfchsal.this.AV22AlbProCod;
      this.aP2[0] = pfchsal.this.AV29AlbProFch;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfchsal");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24FecSal = GXutil.nullDate() ;
      scmdbuf = "" ;
      P00S72_A396EmprCod = new String[] {""} ;
      P00S72_A30AlbProCod = new long[1] ;
      P00S72_A1265BarAlbPie = new int[1] ;
      P00S72_A130BarCodPar = new String[] {""} ;
      P00S72_A132BarCodReo = new byte[1] ;
      P00S72_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      P00S73_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A161BarFecSal = GXutil.nullDate() ;
      P00S74_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_int6 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfchsal__default(),
         new Object[] {
             new Object[] {
            P00S72_A396EmprCod, P00S72_A30AlbProCod, P00S72_A1265BarAlbPie, P00S72_A130BarCodPar, P00S72_A132BarCodReo, P00S72_A129BarCod
            }
            , new Object[] {
            P00S73_A161BarFecSal
            }
            , new Object[] {
            P00S74_A34AlbProfch
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23ExisteHdr ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private long AV22AlbProCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private java.util.Date AV29AlbProFch ;
   private java.util.Date AV24FecSal ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00S72_A396EmprCod ;
   private long[] P00S72_A30AlbProCod ;
   private int[] P00S72_A1265BarAlbPie ;
   private String[] P00S72_A130BarCodPar ;
   private byte[] P00S72_A132BarCodReo ;
   private int[] P00S72_A129BarCod ;
   private java.util.Date[] P00S73_A161BarFecSal ;
   private java.util.Date[] P00S74_A34AlbProfch ;
}

final  class pfchsal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00S72", "SELECT EmprCod, AlbProCod, BarAlbPie, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ?) AND (EmprCod = ? and AlbProCod = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00S73", "SELECT BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00S74", "SELECT AlbProfch FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00S75", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               return;
            case 2 :
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

