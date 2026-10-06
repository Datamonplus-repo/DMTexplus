package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psumkil extends GXProcedure
{
   public psumkil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psumkil.class ), "" );
   }

   public psumkil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      psumkil.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      psumkil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psumkil.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      psumkil.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      psumkil.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      psumkil.this.AV15BarKgm = aP4[0];
      this.aP4 = aP4;
      psumkil.this.AV16BarKgmE = aP5[0];
      this.aP5 = aP5;
      psumkil.this.AV17TipAlb = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15BarKgm = DecimalUtil.ZERO ;
      AV16BarKgmE = DecimalUtil.ZERO ;
      AV18BarKgmT2 = DecimalUtil.ZERO ;
      AV19BarKgmE2 = DecimalUtil.ZERO ;
      /* Using cursor P00NC3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A166BarKgm = P00NC3_A166BarKgm[0] ;
         n166BarKgm = P00NC3_n166BarKgm[0] ;
         A166BarKgm = P00NC3_A166BarKgm[0] ;
         n166BarKgm = P00NC3_n166BarKgm[0] ;
         AV15BarKgm = A166BarKgm ;
         /* Using cursor P00NC4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A30AlbProCod = P00NC4_A30AlbProCod[0] ;
            A2242AlbSec = P00NC4_A2242AlbSec[0] ;
            A1261BarAlbKgmE = P00NC4_A1261BarAlbKgmE[0] ;
            A2242AlbSec = P00NC4_A2242AlbSec[0] ;
            if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "T", "")) == 0 )
            {
               AV18BarKgmT2 = AV18BarKgmT2.add(A1261BarAlbKgmE) ;
            }
            else
            {
               if ( GXutil.strcmp(A2242AlbSec, httpContext.getMessage( "E", "")) == 0 )
               {
                  AV19BarKgmE2 = AV19BarKgmE2.add(A1261BarAlbKgmE) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV17TipAlb, httpContext.getMessage( "T", "")) == 0 )
      {
         AV16BarKgmE = AV15BarKgm.subtract(AV18BarKgmT2) ;
      }
      else
      {
         AV16BarKgmE = AV15BarKgm.subtract(AV19BarKgmE2) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psumkil.this.A396EmprCod;
      this.aP1[0] = psumkil.this.A129BarCod;
      this.aP2[0] = psumkil.this.A132BarCodReo;
      this.aP3[0] = psumkil.this.A130BarCodPar;
      this.aP4[0] = psumkil.this.AV15BarKgm;
      this.aP5[0] = psumkil.this.AV16BarKgmE;
      this.aP6[0] = psumkil.this.AV17TipAlb;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18BarKgmT2 = DecimalUtil.ZERO ;
      AV19BarKgmE2 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00NC3_A396EmprCod = new String[] {""} ;
      P00NC3_A129BarCod = new int[1] ;
      P00NC3_A132BarCodReo = new byte[1] ;
      P00NC3_A130BarCodPar = new String[] {""} ;
      P00NC3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00NC3_n166BarKgm = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      P00NC4_A30AlbProCod = new long[1] ;
      P00NC4_A396EmprCod = new String[] {""} ;
      P00NC4_A129BarCod = new int[1] ;
      P00NC4_A132BarCodReo = new byte[1] ;
      P00NC4_A130BarCodPar = new String[] {""} ;
      P00NC4_A2242AlbSec = new String[] {""} ;
      P00NC4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2242AlbSec = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psumkil__default(),
         new Object[] {
             new Object[] {
            P00NC3_A396EmprCod, P00NC3_A129BarCod, P00NC3_A132BarCodReo, P00NC3_A130BarCodPar, P00NC3_A166BarKgm, P00NC3_n166BarKgm
            }
            , new Object[] {
            P00NC4_A30AlbProCod, P00NC4_A396EmprCod, P00NC4_A129BarCod, P00NC4_A132BarCodReo, P00NC4_A130BarCodPar, P00NC4_A2242AlbSec, P00NC4_A1261BarAlbKgmE
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
   private java.math.BigDecimal AV15BarKgm ;
   private java.math.BigDecimal AV16BarKgmE ;
   private java.math.BigDecimal AV18BarKgmT2 ;
   private java.math.BigDecimal AV19BarKgmE2 ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV17TipAlb ;
   private String scmdbuf ;
   private String A2242AlbSec ;
   private boolean n166BarKgm ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NC3_A396EmprCod ;
   private int[] P00NC3_A129BarCod ;
   private byte[] P00NC3_A132BarCodReo ;
   private String[] P00NC3_A130BarCodPar ;
   private java.math.BigDecimal[] P00NC3_A166BarKgm ;
   private boolean[] P00NC3_n166BarKgm ;
   private long[] P00NC4_A30AlbProCod ;
   private String[] P00NC4_A396EmprCod ;
   private int[] P00NC4_A129BarCod ;
   private byte[] P00NC4_A132BarCodReo ;
   private String[] P00NC4_A130BarCodPar ;
   private String[] P00NC4_A2242AlbSec ;
   private java.math.BigDecimal[] P00NC4_A1261BarAlbKgmE ;
}

final  class psumkil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NC3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00NC4", "SELECT T1.AlbProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbSec, T1.BarAlbKgmE FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

