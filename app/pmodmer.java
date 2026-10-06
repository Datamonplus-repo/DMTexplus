package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodmer extends GXProcedure
{
   public pmodmer( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodmer.class ), "" );
   }

   public pmodmer( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pmodmer.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pmodmer.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodmer.this.AV35AlbProcod = aP1[0];
      this.aP1 = aP1;
      pmodmer.this.AV23BarCod = aP2[0];
      this.aP2 = aP2;
      pmodmer.this.AV24BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmodmer.this.AV25BarCodPar = aP4[0];
      this.aP4 = aP4;
      pmodmer.this.AV19KgsEnt = aP5[0];
      this.aP5 = aP5;
      pmodmer.this.AV30Usurcod = aP6[0];
      this.aP6 = aP6;
      pmodmer.this.AV31Station = aP7[0];
      this.aP7 = aP7;
      pmodmer.this.AV32Pgmnamei = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Mtsent = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01WJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01WJ2_A130BarCodPar[0] ;
         A132BarCodReo = P01WJ2_A132BarCodReo[0] ;
         A129BarCod = P01WJ2_A129BarCod[0] ;
         A30AlbProCod = P01WJ2_A30AlbProCod[0] ;
         A1263BarAlbMtrE = P01WJ2_A1263BarAlbMtrE[0] ;
         if ( A30AlbProCod != AV35AlbProcod )
         {
            AV34Mtsent = AV34Mtsent.add(A1263BarAlbMtrE) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXv_int1[0] = AV33Porcen_4 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODMER", ""), GXv_int1) ;
      pmodmer.this.AV33Porcen_4 = (short)((short)(GXv_int1[0])) ;
      AV20Porcen = DecimalUtil.doubleToDec(AV33Porcen_4/ (double) (100)) ;
      /* Using cursor P01WJ4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P01WJ4_A130BarCodPar[0] ;
         A132BarCodReo = P01WJ4_A132BarCodReo[0] ;
         A129BarCod = P01WJ4_A129BarCod[0] ;
         A252CliCod = P01WJ4_A252CliCod[0] ;
         n252CliCod = P01WJ4_n252CliCod[0] ;
         A212BarSer = P01WJ4_A212BarSer[0] ;
         A2827BarKgsLot = P01WJ4_A2827BarKgsLot[0] ;
         A166BarKgm = P01WJ4_A166BarKgm[0] ;
         n166BarKgm = P01WJ4_n166BarKgm[0] ;
         A166BarKgm = P01WJ4_A166BarKgm[0] ;
         n166BarKgm = P01WJ4_n166BarKgm[0] ;
         AV26CliCod = A252CliCod ;
         AV27BarSer = A212BarSer ;
         AV28KhsHdr = A166BarKgm ;
         if ( A2827BarKgsLot.doubleValue() != 0 )
         {
            AV28KhsHdr = A166BarKgm ;
         }
         if ( AV20Porcen.doubleValue() == 0 )
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
         AV22MermaC = (((AV19KgsEnt.add(AV34Mtsent)).subtract(AV28KhsHdr)).divide(AV28KhsHdr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
         if ( AV22MermaC.doubleValue() < 0 )
         {
            AV22MermaC = AV22MermaC.multiply(DecimalUtil.doubleToDec((-1))) ;
         }
         if ( ( DecimalUtil.compareTo(AV22MermaC, AV20Porcen) > 0 ) && ( AV20Porcen.doubleValue() != 0 ) )
         {
            Gx_msg = httpContext.getMessage( "Atençao ¡¡¡.Quebra superior ¡¡¡", "") + GXutil.newLine( ) + httpContext.getMessage( "Quebra Calculada = ", "") + GXutil.str( AV22MermaC, 5, 2) + GXutil.newLine( ) + httpContext.getMessage( "Quebra Control   = ", "") + GXutil.str( AV20Porcen, 5, 2) ;
            httpContext.GX_msglist.addItem(Gx_msg);
            AV29Texto_i = httpContext.getMessage( "Atençao ¡¡¡.Quebra superior ¡¡¡", "") + GXutil.newLine( ) + httpContext.getMessage( "Quebra Calculada = ", "") + GXutil.str( AV22MermaC, 5, 2) + GXutil.newLine( ) + httpContext.getMessage( "Quebra Control   = ", "") + GXutil.str( AV20Porcen, 5, 2) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV32Pgmnamei, AV30Usurcod, AV31Station, AV29Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      AV20Porcen = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01WJ5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV26CliCod), AV27BarSer});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A65ArtCod = P01WJ5_A65ArtCod[0] ;
         A252CliCod = P01WJ5_A252CliCod[0] ;
         n252CliCod = P01WJ5_n252CliCod[0] ;
         A88ArtMer = P01WJ5_A88ArtMer[0] ;
         n88ArtMer = P01WJ5_n88ArtMer[0] ;
         AV20Porcen = A88ArtMer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodmer.this.A396EmprCod;
      this.aP1[0] = pmodmer.this.AV35AlbProcod;
      this.aP2[0] = pmodmer.this.AV23BarCod;
      this.aP3[0] = pmodmer.this.AV24BarCodReo;
      this.aP4[0] = pmodmer.this.AV25BarCodPar;
      this.aP5[0] = pmodmer.this.AV19KgsEnt;
      this.aP6[0] = pmodmer.this.AV30Usurcod;
      this.aP7[0] = pmodmer.this.AV31Station;
      this.aP8[0] = pmodmer.this.AV32Pgmnamei;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34Mtsent = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01WJ2_A396EmprCod = new String[] {""} ;
      P01WJ2_A130BarCodPar = new String[] {""} ;
      P01WJ2_A132BarCodReo = new byte[1] ;
      P01WJ2_A129BarCod = new int[1] ;
      P01WJ2_A30AlbProCod = new long[1] ;
      P01WJ2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      GXv_int1 = new int[1] ;
      AV20Porcen = DecimalUtil.ZERO ;
      P01WJ4_A396EmprCod = new String[] {""} ;
      P01WJ4_A130BarCodPar = new String[] {""} ;
      P01WJ4_A132BarCodReo = new byte[1] ;
      P01WJ4_A129BarCod = new int[1] ;
      P01WJ4_A252CliCod = new int[1] ;
      P01WJ4_n252CliCod = new boolean[] {false} ;
      P01WJ4_A212BarSer = new String[] {""} ;
      P01WJ4_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WJ4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WJ4_n166BarKgm = new boolean[] {false} ;
      A212BarSer = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV27BarSer = "" ;
      AV28KhsHdr = DecimalUtil.ZERO ;
      AV22MermaC = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV29Texto_i = "" ;
      P01WJ5_A396EmprCod = new String[] {""} ;
      P01WJ5_A65ArtCod = new String[] {""} ;
      P01WJ5_A252CliCod = new int[1] ;
      P01WJ5_n252CliCod = new boolean[] {false} ;
      P01WJ5_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WJ5_n88ArtMer = new boolean[] {false} ;
      A65ArtCod = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodmer__default(),
         new Object[] {
             new Object[] {
            P01WJ2_A396EmprCod, P01WJ2_A130BarCodPar, P01WJ2_A132BarCodReo, P01WJ2_A129BarCod, P01WJ2_A30AlbProCod, P01WJ2_A1263BarAlbMtrE
            }
            , new Object[] {
            P01WJ4_A396EmprCod, P01WJ4_A130BarCodPar, P01WJ4_A132BarCodReo, P01WJ4_A129BarCod, P01WJ4_A252CliCod, P01WJ4_n252CliCod, P01WJ4_A212BarSer, P01WJ4_A2827BarKgsLot, P01WJ4_A166BarKgm, P01WJ4_n166BarKgm
            }
            , new Object[] {
            P01WJ5_A396EmprCod, P01WJ5_A65ArtCod, P01WJ5_A252CliCod, P01WJ5_A88ArtMer, P01WJ5_n88ArtMer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte A132BarCodReo ;
   private short AV33Porcen_4 ;
   private short Gx_err ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private int GXv_int1[] ;
   private int A252CliCod ;
   private int AV26CliCod ;
   private long AV35AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV19KgsEnt ;
   private java.math.BigDecimal AV34Mtsent ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV20Porcen ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV28KhsHdr ;
   private java.math.BigDecimal AV22MermaC ;
   private java.math.BigDecimal A88ArtMer ;
   private String A396EmprCod ;
   private String AV25BarCodPar ;
   private String AV30Usurcod ;
   private String AV31Station ;
   private String AV32Pgmnamei ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String AV27BarSer ;
   private String Gx_msg ;
   private String A65ArtCod ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean returnInSub ;
   private boolean n88ArtMer ;
   private String AV29Texto_i ;
   private String[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WJ2_A396EmprCod ;
   private String[] P01WJ2_A130BarCodPar ;
   private byte[] P01WJ2_A132BarCodReo ;
   private int[] P01WJ2_A129BarCod ;
   private long[] P01WJ2_A30AlbProCod ;
   private java.math.BigDecimal[] P01WJ2_A1263BarAlbMtrE ;
   private String[] P01WJ4_A396EmprCod ;
   private String[] P01WJ4_A130BarCodPar ;
   private byte[] P01WJ4_A132BarCodReo ;
   private int[] P01WJ4_A129BarCod ;
   private int[] P01WJ4_A252CliCod ;
   private boolean[] P01WJ4_n252CliCod ;
   private String[] P01WJ4_A212BarSer ;
   private java.math.BigDecimal[] P01WJ4_A2827BarKgsLot ;
   private java.math.BigDecimal[] P01WJ4_A166BarKgm ;
   private boolean[] P01WJ4_n166BarKgm ;
   private String[] P01WJ5_A396EmprCod ;
   private String[] P01WJ5_A65ArtCod ;
   private int[] P01WJ5_A252CliCod ;
   private boolean[] P01WJ5_n252CliCod ;
   private java.math.BigDecimal[] P01WJ5_A88ArtMer ;
   private boolean[] P01WJ5_n88ArtMer ;
}

final  class pmodmer__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WJ2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbProCod, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01WJ4", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarSer, T1.BarKgsLot, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01WJ5", "SELECT EmprCod, ArtCod, CliCod, ArtMer FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

