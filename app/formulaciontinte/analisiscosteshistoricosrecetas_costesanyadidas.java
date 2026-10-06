package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class analisiscosteshistoricosrecetas_costesanyadidas extends GXProcedure
{
   public analisiscosteshistoricosrecetas_costesanyadidas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscosteshistoricosrecetas_costesanyadidas.class ), "" );
   }

   public analisiscosteshistoricosrecetas_costesanyadidas( int remoteHandle ,
                                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           byte[] aP4 )
   {
      analisiscosteshistoricosrecetas_costesanyadidas.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      analisiscosteshistoricosrecetas_costesanyadidas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      analisiscosteshistoricosrecetas_costesanyadidas.this.A4492HreBarCod = aP1[0];
      this.aP1 = aP1;
      analisiscosteshistoricosrecetas_costesanyadidas.this.A4493HreBarReo = aP2[0];
      this.aP2 = aP2;
      analisiscosteshistoricosrecetas_costesanyadidas.this.A4494HreBarPar = aP3[0];
      this.aP3 = aP3;
      analisiscosteshistoricosrecetas_costesanyadidas.this.A4495HreNumCie = aP4[0];
      this.aP4 = aP4;
      analisiscosteshistoricosrecetas_costesanyadidas.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Costea = DecimalUtil.ZERO ;
      /* Using cursor P09FU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8604HreCosAnc = P09FU2_A8604HreCosAnc[0] ;
         n8604HreCosAnc = P09FU2_n8604HreCosAnc[0] ;
         A8603HrecosAd = P09FU2_A8603HrecosAd[0] ;
         n8603HrecosAd = P09FU2_n8603HrecosAd[0] ;
         A8602HreCosAA = P09FU2_A8602HreCosAA[0] ;
         n8602HreCosAA = P09FU2_n8602HreCosAA[0] ;
         A4545HreLinMaq = P09FU2_A4545HreLinMaq[0] ;
         AV12Costea = A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = analisiscosteshistoricosrecetas_costesanyadidas.this.A396EmprCod;
      this.aP1[0] = analisiscosteshistoricosrecetas_costesanyadidas.this.A4492HreBarCod;
      this.aP2[0] = analisiscosteshistoricosrecetas_costesanyadidas.this.A4493HreBarReo;
      this.aP3[0] = analisiscosteshistoricosrecetas_costesanyadidas.this.A4494HreBarPar;
      this.aP4[0] = analisiscosteshistoricosrecetas_costesanyadidas.this.A4495HreNumCie;
      this.aP5[0] = analisiscosteshistoricosrecetas_costesanyadidas.this.AV12Costea;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Costea = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P09FU2_A396EmprCod = new String[] {""} ;
      P09FU2_A4492HreBarCod = new int[1] ;
      P09FU2_A4493HreBarReo = new byte[1] ;
      P09FU2_A4494HreBarPar = new String[] {""} ;
      P09FU2_A4495HreNumCie = new byte[1] ;
      P09FU2_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FU2_n8604HreCosAnc = new boolean[] {false} ;
      P09FU2_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FU2_n8603HrecosAd = new boolean[] {false} ;
      P09FU2_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09FU2_n8602HreCosAA = new boolean[] {false} ;
      P09FU2_A4545HreLinMaq = new short[1] ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.analisiscosteshistoricosrecetas_costesanyadidas__default(),
         new Object[] {
             new Object[] {
            P09FU2_A396EmprCod, P09FU2_A4492HreBarCod, P09FU2_A4493HreBarReo, P09FU2_A4494HreBarPar, P09FU2_A4495HreNumCie, P09FU2_A8604HreCosAnc, P09FU2_n8604HreCosAnc, P09FU2_A8603HrecosAd, P09FU2_n8603HrecosAd, P09FU2_A8602HreCosAA,
            P09FU2_n8602HreCosAA, P09FU2_A4545HreLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private java.math.BigDecimal AV12Costea ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8602HreCosAA ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String scmdbuf ;
   private boolean n8604HreCosAnc ;
   private boolean n8603HrecosAd ;
   private boolean n8602HreCosAA ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09FU2_A396EmprCod ;
   private int[] P09FU2_A4492HreBarCod ;
   private byte[] P09FU2_A4493HreBarReo ;
   private String[] P09FU2_A4494HreBarPar ;
   private byte[] P09FU2_A4495HreNumCie ;
   private java.math.BigDecimal[] P09FU2_A8604HreCosAnc ;
   private boolean[] P09FU2_n8604HreCosAnc ;
   private java.math.BigDecimal[] P09FU2_A8603HrecosAd ;
   private boolean[] P09FU2_n8603HrecosAd ;
   private java.math.BigDecimal[] P09FU2_A8602HreCosAA ;
   private boolean[] P09FU2_n8602HreCosAA ;
   private short[] P09FU2_A4545HreLinMaq ;
}

final  class analisiscosteshistoricosrecetas_costesanyadidas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FU2", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreCosAnc, HrecosAd, HreCosAA, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

