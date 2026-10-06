package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparlav6 extends GXProcedure
{
   public pparlav6( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparlav6.class ), "" );
   }

   public pparlav6( int remoteHandle ,
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
                             short[] aP6 )
   {
      pparlav6.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        short[] aP6 ,
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
                             short[] aP6 ,
                             String[] aP7 )
   {
      pparlav6.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparlav6.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pparlav6.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pparlav6.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pparlav6.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pparlav6.this.A4643BarFasLot = aP5[0];
      this.aP5 = aP5;
      pparlav6.this.AV14HisProNpzs = aP6[0];
      this.aP6 = aP6;
      pparlav6.this.Gx_msg = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      AV16Pzs_p = (short)(0) ;
      /* Using cursor P01SN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4647BarFasNPr1 = P01SN2_A4647BarFasNPr1[0] ;
         n4647BarFasNPr1 = P01SN2_n4647BarFasNPr1[0] ;
         A4644BarFasNPrd = P01SN2_A4644BarFasNPrd[0] ;
         n4644BarFasNPrd = P01SN2_n4644BarFasNPrd[0] ;
         A758ProCod = P01SN2_A758ProCod[0] ;
         AV16Pzs_p = (short)(A4644BarFasNPrd-A4647BarFasNPr1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14HisProNpzs > AV16Pzs_p )
      {
         Gx_msg = httpContext.getMessage( "Atencion¡. Prendas entradas = ", "") + GXutil.str( AV14HisProNpzs, 4, 0) + GXutil.newLine( ) + httpContext.getMessage( "superior a las Disponibles =", "") + GXutil.str( AV16Pzs_p, 10, 0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparlav6.this.A396EmprCod;
      this.aP1[0] = pparlav6.this.A129BarCod;
      this.aP2[0] = pparlav6.this.A132BarCodReo;
      this.aP3[0] = pparlav6.this.A130BarCodPar;
      this.aP4[0] = pparlav6.this.A194BarOrdLin;
      this.aP5[0] = pparlav6.this.A4643BarFasLot;
      this.aP6[0] = pparlav6.this.AV14HisProNpzs;
      this.aP7[0] = pparlav6.this.Gx_msg;
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
      P01SN2_A396EmprCod = new String[] {""} ;
      P01SN2_A129BarCod = new int[1] ;
      P01SN2_A132BarCodReo = new byte[1] ;
      P01SN2_A130BarCodPar = new String[] {""} ;
      P01SN2_A194BarOrdLin = new short[1] ;
      P01SN2_A4643BarFasLot = new int[1] ;
      P01SN2_A4647BarFasNPr1 = new short[1] ;
      P01SN2_n4647BarFasNPr1 = new boolean[] {false} ;
      P01SN2_A4644BarFasNPrd = new short[1] ;
      P01SN2_n4644BarFasNPrd = new boolean[] {false} ;
      P01SN2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparlav6__default(),
         new Object[] {
             new Object[] {
            P01SN2_A396EmprCod, P01SN2_A129BarCod, P01SN2_A132BarCodReo, P01SN2_A130BarCodPar, P01SN2_A194BarOrdLin, P01SN2_A4643BarFasLot, P01SN2_A4647BarFasNPr1, P01SN2_n4647BarFasNPr1, P01SN2_A4644BarFasNPrd, P01SN2_n4644BarFasNPrd,
            P01SN2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A194BarOrdLin ;
   private short AV14HisProNpzs ;
   private short AV16Pzs_p ;
   private short A4647BarFasNPr1 ;
   private short A4644BarFasNPrd ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4643BarFasLot ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A758ProCod ;
   private boolean n4647BarFasNPr1 ;
   private boolean n4644BarFasNPrd ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01SN2_A396EmprCod ;
   private int[] P01SN2_A129BarCod ;
   private byte[] P01SN2_A132BarCodReo ;
   private String[] P01SN2_A130BarCodPar ;
   private short[] P01SN2_A194BarOrdLin ;
   private int[] P01SN2_A4643BarFasLot ;
   private short[] P01SN2_A4647BarFasNPr1 ;
   private boolean[] P01SN2_n4647BarFasNPr1 ;
   private short[] P01SN2_A4644BarFasNPrd ;
   private boolean[] P01SN2_n4644BarFasNPrd ;
   private String[] P01SN2_A758ProCod ;
}

final  class pparlav6__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01SN2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasNPr1, BarFasNPrd, ProCod FROM TXPFASMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (BarFasLot = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
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

