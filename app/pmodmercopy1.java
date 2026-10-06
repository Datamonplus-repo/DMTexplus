package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodmercopy1 extends GXProcedure
{
   public pmodmercopy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodmercopy1.class ), "" );
   }

   public pmodmercopy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 )
   {
      pmodmercopy1.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String[] aP9 )
   {
      pmodmercopy1.this.A396EmprCod = aP0;
      pmodmercopy1.this.AV24AlbProcod = aP1;
      pmodmercopy1.this.AV12BarCod = aP2;
      pmodmercopy1.this.AV13BarCodReo = aP3;
      pmodmercopy1.this.AV14BarCodPar = aP4;
      pmodmercopy1.this.AV8KgsEnt = aP5;
      pmodmercopy1.this.AV19Usurcod = aP6;
      pmodmercopy1.this.AV20Station = aP7;
      pmodmercopy1.this.AV21Pgmnamei = aP8;
      pmodmercopy1.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV23Mtsent = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ACC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12BarCod), Byte.valueOf(AV13BarCodReo), AV14BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0ACC2_A130BarCodPar[0] ;
         A132BarCodReo = P0ACC2_A132BarCodReo[0] ;
         A129BarCod = P0ACC2_A129BarCod[0] ;
         A30AlbProCod = P0ACC2_A30AlbProCod[0] ;
         A1263BarAlbMtrE = P0ACC2_A1263BarAlbMtrE[0] ;
         if ( A30AlbProCod != AV24AlbProcod )
         {
            AV23Mtsent = AV23Mtsent.add(A1263BarAlbMtrE) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXv_int1[0] = AV22Porcen_4 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODMER", ""), GXv_int1) ;
      pmodmercopy1.this.AV22Porcen_4 = (short)((short)(GXv_int1[0])) ;
      AV9Porcen = DecimalUtil.doubleToDec(AV22Porcen_4/ (double) (100)) ;
      /* Using cursor P0ACC4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12BarCod), Byte.valueOf(AV13BarCodReo), AV14BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P0ACC4_A130BarCodPar[0] ;
         A132BarCodReo = P0ACC4_A132BarCodReo[0] ;
         A129BarCod = P0ACC4_A129BarCod[0] ;
         A252CliCod = P0ACC4_A252CliCod[0] ;
         n252CliCod = P0ACC4_n252CliCod[0] ;
         A212BarSer = P0ACC4_A212BarSer[0] ;
         A2827BarKgsLot = P0ACC4_A2827BarKgsLot[0] ;
         A166BarKgm = P0ACC4_A166BarKgm[0] ;
         n166BarKgm = P0ACC4_n166BarKgm[0] ;
         A166BarKgm = P0ACC4_A166BarKgm[0] ;
         n166BarKgm = P0ACC4_n166BarKgm[0] ;
         AV15CliCod = A252CliCod ;
         AV16BarSer = A212BarSer ;
         AV17KhsHdr = A166BarKgm ;
         if ( A2827BarKgsLot.doubleValue() != 0 )
         {
            AV17KhsHdr = A166BarKgm ;
         }
         if ( AV9Porcen.doubleValue() == 0 )
         {
            /* Execute user subroutine: 'ARTICU' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV11MermaC = ((AV17KhsHdr.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : (((AV8KgsEnt.add(AV23Mtsent)).subtract(AV17KhsHdr)).divide(AV17KhsHdr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         if ( AV11MermaC.doubleValue() < 0 )
         {
            AV11MermaC = AV11MermaC.multiply(DecimalUtil.doubleToDec((-1))) ;
         }
         if ( ( DecimalUtil.compareTo(AV11MermaC, AV9Porcen) > 0 ) && ( AV9Porcen.doubleValue() != 0 ) )
         {
            Gx_msg = httpContext.getMessage( "Atençao ¡¡¡.Quebra superior ¡¡¡", "") + GXutil.newLine( ) + httpContext.getMessage( "Quebra Calculada = ", "") + GXutil.str( AV11MermaC, 5, 2) + GXutil.newLine( ) + httpContext.getMessage( "Quebra Control   = ", "") + GXutil.str( AV9Porcen, 5, 2) ;
            AV18Texto_i = httpContext.getMessage( "Atençao ¡¡¡.Quebra superior ¡¡¡", "") + GXutil.newLine( ) + httpContext.getMessage( "Quebra Calculada = ", "") + GXutil.str( AV11MermaC, 5, 2) + GXutil.newLine( ) + httpContext.getMessage( "Quebra Control   = ", "") + GXutil.str( AV9Porcen, 5, 2) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV21Pgmnamei, AV19Usurcod, AV20Station, AV18Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV9Porcen = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0ACC5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV16BarSer});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A65ArtCod = P0ACC5_A65ArtCod[0] ;
         A252CliCod = P0ACC5_A252CliCod[0] ;
         n252CliCod = P0ACC5_n252CliCod[0] ;
         A88ArtMer = P0ACC5_A88ArtMer[0] ;
         n88ArtMer = P0ACC5_n88ArtMer[0] ;
         AV9Porcen = A88ArtMer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP9[0] = pmodmercopy1.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      AV23Mtsent = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ACC2_A396EmprCod = new String[] {""} ;
      P0ACC2_A130BarCodPar = new String[] {""} ;
      P0ACC2_A132BarCodReo = new byte[1] ;
      P0ACC2_A129BarCod = new int[1] ;
      P0ACC2_A30AlbProCod = new long[1] ;
      P0ACC2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      GXv_int1 = new int[1] ;
      AV9Porcen = DecimalUtil.ZERO ;
      P0ACC4_A396EmprCod = new String[] {""} ;
      P0ACC4_A130BarCodPar = new String[] {""} ;
      P0ACC4_A132BarCodReo = new byte[1] ;
      P0ACC4_A129BarCod = new int[1] ;
      P0ACC4_A252CliCod = new int[1] ;
      P0ACC4_n252CliCod = new boolean[] {false} ;
      P0ACC4_A212BarSer = new String[] {""} ;
      P0ACC4_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACC4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACC4_n166BarKgm = new boolean[] {false} ;
      A212BarSer = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV16BarSer = "" ;
      AV17KhsHdr = DecimalUtil.ZERO ;
      AV11MermaC = DecimalUtil.ZERO ;
      AV18Texto_i = "" ;
      P0ACC5_A396EmprCod = new String[] {""} ;
      P0ACC5_A65ArtCod = new String[] {""} ;
      P0ACC5_A252CliCod = new int[1] ;
      P0ACC5_n252CliCod = new boolean[] {false} ;
      P0ACC5_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACC5_n88ArtMer = new boolean[] {false} ;
      A65ArtCod = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodmercopy1__default(),
         new Object[] {
             new Object[] {
            P0ACC2_A396EmprCod, P0ACC2_A130BarCodPar, P0ACC2_A132BarCodReo, P0ACC2_A129BarCod, P0ACC2_A30AlbProCod, P0ACC2_A1263BarAlbMtrE
            }
            , new Object[] {
            P0ACC4_A396EmprCod, P0ACC4_A130BarCodPar, P0ACC4_A132BarCodReo, P0ACC4_A129BarCod, P0ACC4_A252CliCod, P0ACC4_n252CliCod, P0ACC4_A212BarSer, P0ACC4_A2827BarKgsLot, P0ACC4_A166BarKgm, P0ACC4_n166BarKgm
            }
            , new Object[] {
            P0ACC5_A396EmprCod, P0ACC5_A65ArtCod, P0ACC5_A252CliCod, P0ACC5_A88ArtMer, P0ACC5_n88ArtMer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13BarCodReo ;
   private byte A132BarCodReo ;
   private short AV22Porcen_4 ;
   private short Gx_err ;
   private int AV12BarCod ;
   private int A129BarCod ;
   private int GXv_int1[] ;
   private int A252CliCod ;
   private int AV15CliCod ;
   private long AV24AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8KgsEnt ;
   private java.math.BigDecimal AV23Mtsent ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV9Porcen ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV17KhsHdr ;
   private java.math.BigDecimal AV11MermaC ;
   private java.math.BigDecimal A88ArtMer ;
   private String A396EmprCod ;
   private String AV14BarCodPar ;
   private String AV19Usurcod ;
   private String AV20Station ;
   private String AV21Pgmnamei ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV16BarSer ;
   private String A65ArtCod ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n88ArtMer ;
   private String AV18Texto_i ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACC2_A396EmprCod ;
   private String[] P0ACC2_A130BarCodPar ;
   private byte[] P0ACC2_A132BarCodReo ;
   private int[] P0ACC2_A129BarCod ;
   private long[] P0ACC2_A30AlbProCod ;
   private java.math.BigDecimal[] P0ACC2_A1263BarAlbMtrE ;
   private String[] P0ACC4_A396EmprCod ;
   private String[] P0ACC4_A130BarCodPar ;
   private byte[] P0ACC4_A132BarCodReo ;
   private int[] P0ACC4_A129BarCod ;
   private int[] P0ACC4_A252CliCod ;
   private boolean[] P0ACC4_n252CliCod ;
   private String[] P0ACC4_A212BarSer ;
   private java.math.BigDecimal[] P0ACC4_A2827BarKgsLot ;
   private java.math.BigDecimal[] P0ACC4_A166BarKgm ;
   private boolean[] P0ACC4_n166BarKgm ;
   private String[] P0ACC5_A396EmprCod ;
   private String[] P0ACC5_A65ArtCod ;
   private int[] P0ACC5_A252CliCod ;
   private boolean[] P0ACC5_n252CliCod ;
   private java.math.BigDecimal[] P0ACC5_A88ArtMer ;
   private boolean[] P0ACC5_n88ArtMer ;
}

final  class pmodmercopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACC2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACC4", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarSer, T1.BarKgsLot, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACC5", "SELECT EmprCod, ArtCod, CliCod, ArtMer FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

