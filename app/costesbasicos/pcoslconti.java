package app.costesbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoslconti extends GXProcedure
{
   public pcoslconti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoslconti.class ), "" );
   }

   public pcoslconti( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           java.math.BigDecimal[] aP7 )
   {
      pcoslconti.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 )
   {
      pcoslconti.this.AV13Emprcod = aP0;
      pcoslconti.this.AV12Barcod = aP1;
      pcoslconti.this.AV11Barcodreo = aP2;
      pcoslconti.this.AV10Barcodpar = aP3;
      pcoslconti.this.aP4 = aP4;
      pcoslconti.this.aP5 = aP5;
      pcoslconti.this.aP6 = aP6;
      pcoslconti.this.aP7 = aP7;
      pcoslconti.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Barcosany = DecimalUtil.ZERO ;
      AV9Barcospro = DecimalUtil.ZERO ;
      AV16lconti = (byte)(0) ;
      /* Using cursor P0ATA2 */
      pr_default.execute(0, new Object[] {AV13Emprcod, Integer.valueOf(AV12Barcod), Byte.valueOf(AV11Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1935BarParTin = P0ATA2_A1935BarParTin[0] ;
         n1935BarParTin = P0ATA2_n1935BarParTin[0] ;
         A1934BarReoTin = P0ATA2_A1934BarReoTin[0] ;
         n1934BarReoTin = P0ATA2_n1934BarReoTin[0] ;
         A1933BarCodTin = P0ATA2_A1933BarCodTin[0] ;
         n1933BarCodTin = P0ATA2_n1933BarCodTin[0] ;
         A396EmprCod = P0ATA2_A396EmprCod[0] ;
         A3705BarCosCol = P0ATA2_A3705BarCosCol[0] ;
         n3705BarCosCol = P0ATA2_n3705BarCosCol[0] ;
         A3658BarCosPA = P0ATA2_A3658BarCosPA[0] ;
         n3658BarCosPA = P0ATA2_n3658BarCosPA[0] ;
         A3654BarCosPD = P0ATA2_A3654BarCosPD[0] ;
         n3654BarCosPD = P0ATA2_n3654BarCosPD[0] ;
         A3706BarCosAnc = P0ATA2_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P0ATA2_n3706BarCosAnc[0] ;
         A3656BarCosAD = P0ATA2_A3656BarCosAD[0] ;
         n3656BarCosAD = P0ATA2_n3656BarCosAD[0] ;
         A3657BarCosAA = P0ATA2_A3657BarCosAA[0] ;
         n3657BarCosAA = P0ATA2_n3657BarCosAA[0] ;
         A1947BarKgmTin = P0ATA2_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P0ATA2_n1947BarKgmTin[0] ;
         A1948BarMtrTin = P0ATA2_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P0ATA2_n1948BarMtrTin[0] ;
         A3646EstTinAny = P0ATA2_A3646EstTinAny[0] ;
         A3647EstTinMes = P0ATA2_A3647EstTinMes[0] ;
         A3648EstTinDia = P0ATA2_A3648EstTinDia[0] ;
         A1929EstTinNr = P0ATA2_A1929EstTinNr[0] ;
         AV16lconti = (byte)(1) ;
         AV9Barcospro = AV9Barcospro.add((A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol))) ;
         AV8Barcosany = AV8Barcosany.add((A3657BarCosAA.add(A3656BarCosAD).add(A3706BarCosAnc))) ;
         AV15BarKgmTin = A1947BarKgmTin ;
         AV14BarMtrTin = A1948BarMtrTin ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pcoslconti.this.AV9Barcospro;
      this.aP5[0] = pcoslconti.this.AV8Barcosany;
      this.aP6[0] = pcoslconti.this.AV15BarKgmTin;
      this.aP7[0] = pcoslconti.this.AV14BarMtrTin;
      this.aP8[0] = pcoslconti.this.AV16lconti;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Barcospro = DecimalUtil.ZERO ;
      AV8Barcosany = DecimalUtil.ZERO ;
      AV15BarKgmTin = DecimalUtil.ZERO ;
      AV14BarMtrTin = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ATA2_A1935BarParTin = new String[] {""} ;
      P0ATA2_n1935BarParTin = new boolean[] {false} ;
      P0ATA2_A1934BarReoTin = new byte[1] ;
      P0ATA2_n1934BarReoTin = new boolean[] {false} ;
      P0ATA2_A1933BarCodTin = new int[1] ;
      P0ATA2_n1933BarCodTin = new boolean[] {false} ;
      P0ATA2_A396EmprCod = new String[] {""} ;
      P0ATA2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n3705BarCosCol = new boolean[] {false} ;
      P0ATA2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n3658BarCosPA = new boolean[] {false} ;
      P0ATA2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n3654BarCosPD = new boolean[] {false} ;
      P0ATA2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n3706BarCosAnc = new boolean[] {false} ;
      P0ATA2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n3656BarCosAD = new boolean[] {false} ;
      P0ATA2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n3657BarCosAA = new boolean[] {false} ;
      P0ATA2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n1947BarKgmTin = new boolean[] {false} ;
      P0ATA2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ATA2_n1948BarMtrTin = new boolean[] {false} ;
      P0ATA2_A3646EstTinAny = new short[1] ;
      P0ATA2_A3647EstTinMes = new byte[1] ;
      P0ATA2_A3648EstTinDia = new byte[1] ;
      P0ATA2_A1929EstTinNr = new short[1] ;
      A1935BarParTin = "" ;
      A396EmprCod = "" ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.pcoslconti__default(),
         new Object[] {
             new Object[] {
            P0ATA2_A1935BarParTin, P0ATA2_n1935BarParTin, P0ATA2_A1934BarReoTin, P0ATA2_n1934BarReoTin, P0ATA2_A1933BarCodTin, P0ATA2_n1933BarCodTin, P0ATA2_A396EmprCod, P0ATA2_A3705BarCosCol, P0ATA2_n3705BarCosCol, P0ATA2_A3658BarCosPA,
            P0ATA2_n3658BarCosPA, P0ATA2_A3654BarCosPD, P0ATA2_n3654BarCosPD, P0ATA2_A3706BarCosAnc, P0ATA2_n3706BarCosAnc, P0ATA2_A3656BarCosAD, P0ATA2_n3656BarCosAD, P0ATA2_A3657BarCosAA, P0ATA2_n3657BarCosAA, P0ATA2_A1947BarKgmTin,
            P0ATA2_n1947BarKgmTin, P0ATA2_A1948BarMtrTin, P0ATA2_n1948BarMtrTin, P0ATA2_A3646EstTinAny, P0ATA2_A3647EstTinMes, P0ATA2_A3648EstTinDia, P0ATA2_A1929EstTinNr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte AV16lconti ;
   private byte A1934BarReoTin ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private short A3646EstTinAny ;
   private short A1929EstTinNr ;
   private short Gx_err ;
   private int AV12Barcod ;
   private int A1933BarCodTin ;
   private java.math.BigDecimal AV9Barcospro ;
   private java.math.BigDecimal AV8Barcosany ;
   private java.math.BigDecimal AV15BarKgmTin ;
   private java.math.BigDecimal AV14BarMtrTin ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private String AV13Emprcod ;
   private String AV10Barcodpar ;
   private String scmdbuf ;
   private String A1935BarParTin ;
   private String A396EmprCod ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean n3706BarCosAnc ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n1947BarKgmTin ;
   private boolean n1948BarMtrTin ;
   private byte[] aP8 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ATA2_A1935BarParTin ;
   private boolean[] P0ATA2_n1935BarParTin ;
   private byte[] P0ATA2_A1934BarReoTin ;
   private boolean[] P0ATA2_n1934BarReoTin ;
   private int[] P0ATA2_A1933BarCodTin ;
   private boolean[] P0ATA2_n1933BarCodTin ;
   private String[] P0ATA2_A396EmprCod ;
   private java.math.BigDecimal[] P0ATA2_A3705BarCosCol ;
   private boolean[] P0ATA2_n3705BarCosCol ;
   private java.math.BigDecimal[] P0ATA2_A3658BarCosPA ;
   private boolean[] P0ATA2_n3658BarCosPA ;
   private java.math.BigDecimal[] P0ATA2_A3654BarCosPD ;
   private boolean[] P0ATA2_n3654BarCosPD ;
   private java.math.BigDecimal[] P0ATA2_A3706BarCosAnc ;
   private boolean[] P0ATA2_n3706BarCosAnc ;
   private java.math.BigDecimal[] P0ATA2_A3656BarCosAD ;
   private boolean[] P0ATA2_n3656BarCosAD ;
   private java.math.BigDecimal[] P0ATA2_A3657BarCosAA ;
   private boolean[] P0ATA2_n3657BarCosAA ;
   private java.math.BigDecimal[] P0ATA2_A1947BarKgmTin ;
   private boolean[] P0ATA2_n1947BarKgmTin ;
   private java.math.BigDecimal[] P0ATA2_A1948BarMtrTin ;
   private boolean[] P0ATA2_n1948BarMtrTin ;
   private short[] P0ATA2_A3646EstTinAny ;
   private byte[] P0ATA2_A3647EstTinMes ;
   private byte[] P0ATA2_A3648EstTinDia ;
   private short[] P0ATA2_A1929EstTinNr ;
}

final  class pcoslconti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ATA2", "SELECT BarParTin, BarReoTin, BarCodTin, EmprCod, BarCosCol, BarCosPA, BarCosPD, BarCosAnc, BarCosAD, BarCosAA, BarKgmTin, BarMtrTin, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ? ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((short[]) buf[26])[0] = rslt.getShort(16);
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

