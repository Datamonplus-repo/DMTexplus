package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparlav5 extends GXProcedure
{
   public pparlav5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparlav5.class ), "" );
   }

   public pparlav5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pparlav5.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pparlav5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparlav5.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pparlav5.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pparlav5.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pparlav5.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pparlav5.this.A4643BarFasLot = aP5[0];
      this.aP5 = aP5;
      pparlav5.this.AV13HisProKgr = aP6[0];
      this.aP6 = aP6;
      pparlav5.this.Gx_msg = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV15Kgs_p = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01SM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4312BarFasKgm1 = P01SM2_A4312BarFasKgm1[0] ;
         n4312BarFasKgm1 = P01SM2_n4312BarFasKgm1[0] ;
         A4645BarFasKgs = P01SM2_A4645BarFasKgs[0] ;
         n4645BarFasKgs = P01SM2_n4645BarFasKgs[0] ;
         A758ProCod = P01SM2_A758ProCod[0] ;
         AV15Kgs_p = A4645BarFasKgs.subtract(A4312BarFasKgm1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( DecimalUtil.compareTo(AV13HisProKgr, AV15Kgs_p) > 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion¡. Kilos entrados = ", "") + GXutil.str( AV13HisProKgr, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "superior a los Disponibles =", "") + GXutil.str( AV15Kgs_p, 9, 2) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparlav5.this.A396EmprCod;
      this.aP1[0] = pparlav5.this.A129BarCod;
      this.aP2[0] = pparlav5.this.A132BarCodReo;
      this.aP3[0] = pparlav5.this.A130BarCodPar;
      this.aP4[0] = pparlav5.this.A194BarOrdLin;
      this.aP5[0] = pparlav5.this.A4643BarFasLot;
      this.aP6[0] = pparlav5.this.AV13HisProKgr;
      this.aP7[0] = pparlav5.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Kgs_p = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01SM2_A396EmprCod = new String[] {""} ;
      P01SM2_A129BarCod = new int[1] ;
      P01SM2_A132BarCodReo = new byte[1] ;
      P01SM2_A130BarCodPar = new String[] {""} ;
      P01SM2_A194BarOrdLin = new short[1] ;
      P01SM2_A4643BarFasLot = new int[1] ;
      P01SM2_A4312BarFasKgm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SM2_n4312BarFasKgm1 = new boolean[] {false} ;
      P01SM2_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01SM2_n4645BarFasKgs = new boolean[] {false} ;
      P01SM2_A758ProCod = new String[] {""} ;
      A4312BarFasKgm1 = DecimalUtil.ZERO ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparlav5__default(),
         new Object[] {
             new Object[] {
            P01SM2_A396EmprCod, P01SM2_A129BarCod, P01SM2_A132BarCodReo, P01SM2_A130BarCodPar, P01SM2_A194BarOrdLin, P01SM2_A4643BarFasLot, P01SM2_A4312BarFasKgm1, P01SM2_n4312BarFasKgm1, P01SM2_A4645BarFasKgs, P01SM2_n4645BarFasKgs,
            P01SM2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
   private java.math.BigDecimal AV13HisProKgr ;
   private java.math.BigDecimal AV15Kgs_p ;
   private java.math.BigDecimal A4312BarFasKgm1 ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A758ProCod ;
   private boolean n4312BarFasKgm1 ;
   private boolean n4645BarFasKgs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01SM2_A396EmprCod ;
   private int[] P01SM2_A129BarCod ;
   private byte[] P01SM2_A132BarCodReo ;
   private String[] P01SM2_A130BarCodPar ;
   private short[] P01SM2_A194BarOrdLin ;
   private int[] P01SM2_A4643BarFasLot ;
   private java.math.BigDecimal[] P01SM2_A4312BarFasKgm1 ;
   private boolean[] P01SM2_n4312BarFasKgm1 ;
   private java.math.BigDecimal[] P01SM2_A4645BarFasKgs ;
   private boolean[] P01SM2_n4645BarFasKgs ;
   private String[] P01SM2_A758ProCod ;
}

final  class pparlav5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SM2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasKgm1, BarFasKgs, ProCod FROM TXPFASMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (BarFasLot = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

