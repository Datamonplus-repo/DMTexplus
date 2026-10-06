package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc56 extends GXProcedure
{
   public pprc56( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc56.class ), "" );
   }

   public pprc56( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      pprc56.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pprc56.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc56.this.AV15Hisprolot = aP1[0];
      this.aP1 = aP1;
      pprc56.this.AV16Barcosany = aP2[0];
      this.aP2 = aP2;
      pprc56.this.AV17barcospro = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Barcosany = DecimalUtil.doubleToDec(0) ;
      AV17barcospro = DecimalUtil.doubleToDec(0) ;
      AV18Barcod = (int)(GXutil.lval( GXutil.substring( AV15Hisprolot, 1, 8))) ;
      AV19Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV15Hisprolot, 9, 1))) ;
      AV20Barcodpar = GXutil.substring( AV15Hisprolot, 10, 8) ;
      /* Using cursor P05FD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV19Barcodreo), AV20Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05FD2_A130BarCodPar[0] ;
         A132BarCodReo = P05FD2_A132BarCodReo[0] ;
         A129BarCod = P05FD2_A129BarCod[0] ;
         A141BarCosPro = P05FD2_A141BarCosPro[0] ;
         A140BarCosAny = P05FD2_A140BarCosAny[0] ;
         AV17barcospro = A141BarCosPro ;
         AV16Barcosany = A140BarCosAny ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P05FD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18Barcod), Byte.valueOf(AV19Barcodreo), AV20Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4494HreBarPar = P05FD3_A4494HreBarPar[0] ;
         A4493HreBarReo = P05FD3_A4493HreBarReo[0] ;
         A4492HreBarCod = P05FD3_A4492HreBarCod[0] ;
         A8607HreCosPD = P05FD3_A8607HreCosPD[0] ;
         n8607HreCosPD = P05FD3_n8607HreCosPD[0] ;
         A8606HreCosPA = P05FD3_A8606HreCosPA[0] ;
         n8606HreCosPA = P05FD3_n8606HreCosPA[0] ;
         A8605HreCosCol = P05FD3_A8605HreCosCol[0] ;
         n8605HreCosCol = P05FD3_n8605HreCosCol[0] ;
         A8604HreCosAnc = P05FD3_A8604HreCosAnc[0] ;
         n8604HreCosAnc = P05FD3_n8604HreCosAnc[0] ;
         A8603HrecosAd = P05FD3_A8603HrecosAd[0] ;
         n8603HrecosAd = P05FD3_n8603HrecosAd[0] ;
         A8602HreCosAA = P05FD3_A8602HreCosAA[0] ;
         n8602HreCosAA = P05FD3_n8602HreCosAA[0] ;
         A4495HreNumCie = P05FD3_A4495HreNumCie[0] ;
         A4545HreLinMaq = P05FD3_A4545HreLinMaq[0] ;
         AV17barcospro = (A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD)) ;
         AV16Barcosany = DecimalUtil.doubleToDec(0) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc56.this.A396EmprCod;
      this.aP1[0] = pprc56.this.AV15Hisprolot;
      this.aP2[0] = pprc56.this.AV16Barcosany;
      this.aP3[0] = pprc56.this.AV17barcospro;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20Barcodpar = "" ;
      scmdbuf = "" ;
      P05FD2_A396EmprCod = new String[] {""} ;
      P05FD2_A130BarCodPar = new String[] {""} ;
      P05FD2_A132BarCodReo = new byte[1] ;
      P05FD2_A129BarCod = new int[1] ;
      P05FD2_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05FD2_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      P05FD3_A396EmprCod = new String[] {""} ;
      P05FD3_A4494HreBarPar = new String[] {""} ;
      P05FD3_A4493HreBarReo = new byte[1] ;
      P05FD3_A4492HreBarCod = new int[1] ;
      P05FD3_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05FD3_n8607HreCosPD = new boolean[] {false} ;
      P05FD3_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05FD3_n8606HreCosPA = new boolean[] {false} ;
      P05FD3_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05FD3_n8605HreCosCol = new boolean[] {false} ;
      P05FD3_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05FD3_n8604HreCosAnc = new boolean[] {false} ;
      P05FD3_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05FD3_n8603HrecosAd = new boolean[] {false} ;
      P05FD3_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05FD3_n8602HreCosAA = new boolean[] {false} ;
      P05FD3_A4495HreNumCie = new byte[1] ;
      P05FD3_A4545HreLinMaq = new short[1] ;
      A4494HreBarPar = "" ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc56__default(),
         new Object[] {
             new Object[] {
            P05FD2_A396EmprCod, P05FD2_A130BarCodPar, P05FD2_A132BarCodReo, P05FD2_A129BarCod, P05FD2_A141BarCosPro, P05FD2_A140BarCosAny
            }
            , new Object[] {
            P05FD3_A396EmprCod, P05FD3_A4494HreBarPar, P05FD3_A4493HreBarReo, P05FD3_A4492HreBarCod, P05FD3_A8607HreCosPD, P05FD3_n8607HreCosPD, P05FD3_A8606HreCosPA, P05FD3_n8606HreCosPA, P05FD3_A8605HreCosCol, P05FD3_n8605HreCosCol,
            P05FD3_A8604HreCosAnc, P05FD3_n8604HreCosAnc, P05FD3_A8603HrecosAd, P05FD3_n8603HrecosAd, P05FD3_A8602HreCosAA, P05FD3_n8602HreCosAA, P05FD3_A4495HreNumCie, P05FD3_A4545HreLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19Barcodreo ;
   private byte A132BarCodReo ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV18Barcod ;
   private int A129BarCod ;
   private int A4492HreBarCod ;
   private java.math.BigDecimal AV16Barcosany ;
   private java.math.BigDecimal AV17barcospro ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8602HreCosAA ;
   private String A396EmprCod ;
   private String AV15Hisprolot ;
   private String AV20Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A4494HreBarPar ;
   private boolean n8607HreCosPD ;
   private boolean n8606HreCosPA ;
   private boolean n8605HreCosCol ;
   private boolean n8604HreCosAnc ;
   private boolean n8603HrecosAd ;
   private boolean n8602HreCosAA ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05FD2_A396EmprCod ;
   private String[] P05FD2_A130BarCodPar ;
   private byte[] P05FD2_A132BarCodReo ;
   private int[] P05FD2_A129BarCod ;
   private java.math.BigDecimal[] P05FD2_A141BarCosPro ;
   private java.math.BigDecimal[] P05FD2_A140BarCosAny ;
   private String[] P05FD3_A396EmprCod ;
   private String[] P05FD3_A4494HreBarPar ;
   private byte[] P05FD3_A4493HreBarReo ;
   private int[] P05FD3_A4492HreBarCod ;
   private java.math.BigDecimal[] P05FD3_A8607HreCosPD ;
   private boolean[] P05FD3_n8607HreCosPD ;
   private java.math.BigDecimal[] P05FD3_A8606HreCosPA ;
   private boolean[] P05FD3_n8606HreCosPA ;
   private java.math.BigDecimal[] P05FD3_A8605HreCosCol ;
   private boolean[] P05FD3_n8605HreCosCol ;
   private java.math.BigDecimal[] P05FD3_A8604HreCosAnc ;
   private boolean[] P05FD3_n8604HreCosAnc ;
   private java.math.BigDecimal[] P05FD3_A8603HrecosAd ;
   private boolean[] P05FD3_n8603HrecosAd ;
   private java.math.BigDecimal[] P05FD3_A8602HreCosAA ;
   private boolean[] P05FD3_n8602HreCosAA ;
   private byte[] P05FD3_A4495HreNumCie ;
   private short[] P05FD3_A4545HreLinMaq ;
}

final  class pprc56__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05FD2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarCosPro, BarCosAny FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05FD3", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreCosPD, HreCosPA, HreCosCol, HreCosAnc, HrecosAd, HreCosAA, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((short[]) buf[17])[0] = rslt.getShort(12);
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

