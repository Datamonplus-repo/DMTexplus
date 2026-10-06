package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfchalb extends GXProcedure
{
   public pfchalb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfchalb.class ), "" );
   }

   public pfchalb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           java.util.Date[] aP4 )
   {
      pfchalb.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             byte[] aP5 )
   {
      pfchalb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfchalb.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfchalb.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfchalb.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfchalb.this.AV24FecSal = aP4[0];
      this.aP4 = aP4;
      pfchalb.this.AV23ExisteHdr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23ExisteHdr = (byte)(0) ;
      AV24FecSal = GXutil.nullDate() ;
      /* Using cursor P00WP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P00WP2_A30AlbProCod[0] ;
         A32AlbProEsp = P00WP2_A32AlbProEsp[0] ;
         A34AlbProfch = P00WP2_A34AlbProfch[0] ;
         A34AlbProfch = P00WP2_A34AlbProfch[0] ;
         AV23ExisteHdr = (byte)(1) ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24FecSal)) || GXutil.resetTime(AV24FecSal).before( GXutil.resetTime( A34AlbProfch )) )
         {
            AV24FecSal = A34AlbProfch ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfchalb.this.A396EmprCod;
      this.aP1[0] = pfchalb.this.A129BarCod;
      this.aP2[0] = pfchalb.this.A132BarCodReo;
      this.aP3[0] = pfchalb.this.A130BarCodPar;
      this.aP4[0] = pfchalb.this.AV24FecSal;
      this.aP5[0] = pfchalb.this.AV23ExisteHdr;
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
      P00WP2_A30AlbProCod = new long[1] ;
      P00WP2_A396EmprCod = new String[] {""} ;
      P00WP2_A129BarCod = new int[1] ;
      P00WP2_A132BarCodReo = new byte[1] ;
      P00WP2_A130BarCodPar = new String[] {""} ;
      P00WP2_A32AlbProEsp = new byte[1] ;
      P00WP2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfchalb__default(),
         new Object[] {
             new Object[] {
            P00WP2_A30AlbProCod, P00WP2_A396EmprCod, P00WP2_A129BarCod, P00WP2_A132BarCodReo, P00WP2_A130BarCodPar, P00WP2_A32AlbProEsp, P00WP2_A34AlbProfch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV23ExisteHdr ;
   private byte A32AlbProEsp ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private java.util.Date AV24FecSal ;
   private java.util.Date A34AlbProfch ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.util.Date[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P00WP2_A30AlbProCod ;
   private String[] P00WP2_A396EmprCod ;
   private int[] P00WP2_A129BarCod ;
   private byte[] P00WP2_A132BarCodReo ;
   private String[] P00WP2_A130BarCodPar ;
   private byte[] P00WP2_A32AlbProEsp ;
   private java.util.Date[] P00WP2_A34AlbProfch ;
}

final  class pfchalb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WP2", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProEsp, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
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
      }
   }

}

