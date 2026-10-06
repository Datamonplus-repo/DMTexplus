package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plecto2b extends GXProcedure
{
   public plecto2b( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plecto2b.class ), "" );
   }

   public plecto2b( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           int[] aP6 )
   {
      plecto2b.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      plecto2b.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      plecto2b.this.AV18Barcada = aP1[0];
      this.aP1 = aP1;
      plecto2b.this.AV19BarCodReo = aP2[0];
      this.aP2 = aP2;
      plecto2b.this.AV20BarCodPar = aP3[0];
      this.aP3 = aP3;
      plecto2b.this.AV53OrdLinA = aP4[0];
      this.aP4 = aP4;
      plecto2b.this.AV54FasCodA = aP5[0];
      this.aP5 = aP5;
      plecto2b.this.AV16OpeCod = aP6[0];
      this.aP6 = aP6;
      plecto2b.this.AV68FlagCC = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03LB2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18Barcada), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV53OrdLinA), AV54FasCodA});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P03LB2_A457FasCod[0] ;
         A194BarOrdLin = P03LB2_A194BarOrdLin[0] ;
         A130BarCodPar = P03LB2_A130BarCodPar[0] ;
         A132BarCodReo = P03LB2_A132BarCodReo[0] ;
         A129BarCod = P03LB2_A129BarCod[0] ;
         A396EmprCod = P03LB2_A396EmprCod[0] ;
         A153BarFasEst = P03LB2_A153BarFasEst[0] ;
         A165BarHorIni = P03LB2_A165BarHorIni[0] ;
         A758ProCod = P03LB2_A758ProCod[0] ;
         if ( (0==A165BarHorIni) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_char5[0] = A758ProCod ;
            GXv_int6[0] = A194BarOrdLin ;
            GXv_int7[0] = AV16OpeCod ;
            GXv_char8[0] = httpContext.getMessage( "I", "") ;
            new app.controlcalidadhtd.pccing(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_char8) ;
            plecto2b.this.A396EmprCod = GXv_char1[0] ;
            plecto2b.this.A129BarCod = GXv_int2[0] ;
            plecto2b.this.A132BarCodReo = GXv_int3[0] ;
            plecto2b.this.A130BarCodPar = GXv_char4[0] ;
            plecto2b.this.A758ProCod = GXv_char5[0] ;
            plecto2b.this.A194BarOrdLin = GXv_int6[0] ;
            plecto2b.this.AV16OpeCod = GXv_int7[0] ;
            AV68FlagCC = (byte)(0) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plecto2b.this.AV15EmprCod;
      this.aP1[0] = plecto2b.this.AV18Barcada;
      this.aP2[0] = plecto2b.this.AV19BarCodReo;
      this.aP3[0] = plecto2b.this.AV20BarCodPar;
      this.aP4[0] = plecto2b.this.AV53OrdLinA;
      this.aP5[0] = plecto2b.this.AV54FasCodA;
      this.aP6[0] = plecto2b.this.AV16OpeCod;
      this.aP7[0] = plecto2b.this.AV68FlagCC;
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
      P03LB2_A457FasCod = new String[] {""} ;
      P03LB2_A194BarOrdLin = new short[1] ;
      P03LB2_A130BarCodPar = new String[] {""} ;
      P03LB2_A132BarCodReo = new byte[1] ;
      P03LB2_A129BarCod = new int[1] ;
      P03LB2_A396EmprCod = new String[] {""} ;
      P03LB2_A153BarFasEst = new byte[1] ;
      P03LB2_A165BarHorIni = new short[1] ;
      P03LB2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plecto2b__default(),
         new Object[] {
             new Object[] {
            P03LB2_A457FasCod, P03LB2_A194BarOrdLin, P03LB2_A130BarCodPar, P03LB2_A132BarCodReo, P03LB2_A129BarCod, P03LB2_A396EmprCod, P03LB2_A153BarFasEst, P03LB2_A165BarHorIni, P03LB2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19BarCodReo ;
   private byte AV68FlagCC ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte GXv_int3[] ;
   private short AV53OrdLinA ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int AV18Barcada ;
   private int AV16OpeCod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private int GXv_int7[] ;
   private String AV15EmprCod ;
   private String AV20BarCodPar ;
   private String AV54FasCodA ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char8[] ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P03LB2_A457FasCod ;
   private short[] P03LB2_A194BarOrdLin ;
   private String[] P03LB2_A130BarCodPar ;
   private byte[] P03LB2_A132BarCodReo ;
   private int[] P03LB2_A129BarCod ;
   private String[] P03LB2_A396EmprCod ;
   private byte[] P03LB2_A153BarFasEst ;
   private short[] P03LB2_A165BarHorIni ;
   private String[] P03LB2_A758ProCod ;
}

final  class plecto2b__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03LB2", "SELECT FasCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst, BarHorIni, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and FasCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
               stmt.setString(6, (String)parms[5], 8);
               return;
      }
   }

}

