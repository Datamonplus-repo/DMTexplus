package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_get_lmeti extends GXProcedure
{
   public documentodetransporteproduccion_get_lmeti( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_get_lmeti.class ), "" );
   }

   public documentodetransporteproduccion_get_lmeti( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           int aP2 ,
                                           byte aP3 ,
                                           String aP4 ,
                                           String aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           short[] aP8 )
   {
      documentodetransporteproduccion_get_lmeti.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      documentodetransporteproduccion_get_lmeti.this.AV8emprcod = aP0;
      documentodetransporteproduccion_get_lmeti.this.AV9MetTerCod = aP1;
      documentodetransporteproduccion_get_lmeti.this.AV10Barcod = aP2;
      documentodetransporteproduccion_get_lmeti.this.AV11Barcodreo = aP3;
      documentodetransporteproduccion_get_lmeti.this.AV12barcodpar = aP4;
      documentodetransporteproduccion_get_lmeti.this.AV13metpiecod = aP5;
      documentodetransporteproduccion_get_lmeti.this.aP6 = aP6;
      documentodetransporteproduccion_get_lmeti.this.aP7 = aP7;
      documentodetransporteproduccion_get_lmeti.this.aP8 = aP8;
      documentodetransporteproduccion_get_lmeti.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14metpiekil = DecimalUtil.ZERO ;
      AV15metpiemet = DecimalUtil.ZERO ;
      AV16MetPieAnc = (short)(0) ;
      AV17MetPieMtD = DecimalUtil.ZERO ;
      /* Using cursor P0AKZ2 */
      pr_default.execute(0, new Object[] {AV8emprcod, AV9MetTerCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV11Barcodreo), AV12barcodpar, AV13metpiecod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2813MetPieCod = P0AKZ2_A2813MetPieCod[0] ;
         A130BarCodPar = P0AKZ2_A130BarCodPar[0] ;
         A132BarCodReo = P0AKZ2_A132BarCodReo[0] ;
         A129BarCod = P0AKZ2_A129BarCod[0] ;
         A2809MetTerCod = P0AKZ2_A2809MetTerCod[0] ;
         A396EmprCod = P0AKZ2_A396EmprCod[0] ;
         A2814MetPieKil = P0AKZ2_A2814MetPieKil[0] ;
         A2815MetPieMet = P0AKZ2_A2815MetPieMet[0] ;
         A6635MetPieAnc = P0AKZ2_A6635MetPieAnc[0] ;
         A4910MetPieMtD = P0AKZ2_A4910MetPieMtD[0] ;
         AV14metpiekil = A2814MetPieKil ;
         AV15metpiemet = A2815MetPieMet ;
         AV16MetPieAnc = A6635MetPieAnc ;
         AV17MetPieMtD = A4910MetPieMtD ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = documentodetransporteproduccion_get_lmeti.this.AV14metpiekil;
      this.aP7[0] = documentodetransporteproduccion_get_lmeti.this.AV15metpiemet;
      this.aP8[0] = documentodetransporteproduccion_get_lmeti.this.AV16MetPieAnc;
      this.aP9[0] = documentodetransporteproduccion_get_lmeti.this.AV17MetPieMtD;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14metpiekil = DecimalUtil.ZERO ;
      AV15metpiemet = DecimalUtil.ZERO ;
      AV17MetPieMtD = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AKZ2_A2813MetPieCod = new String[] {""} ;
      P0AKZ2_A130BarCodPar = new String[] {""} ;
      P0AKZ2_A132BarCodReo = new byte[1] ;
      P0AKZ2_A129BarCod = new int[1] ;
      P0AKZ2_A2809MetTerCod = new String[] {""} ;
      P0AKZ2_A396EmprCod = new String[] {""} ;
      P0AKZ2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKZ2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AKZ2_A6635MetPieAnc = new short[1] ;
      P0AKZ2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2813MetPieCod = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      A396EmprCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_get_lmeti__default(),
         new Object[] {
             new Object[] {
            P0AKZ2_A2813MetPieCod, P0AKZ2_A130BarCodPar, P0AKZ2_A132BarCodReo, P0AKZ2_A129BarCod, P0AKZ2_A2809MetTerCod, P0AKZ2_A396EmprCod, P0AKZ2_A2814MetPieKil, P0AKZ2_A2815MetPieMet, P0AKZ2_A6635MetPieAnc, P0AKZ2_A4910MetPieMtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte A132BarCodReo ;
   private short AV16MetPieAnc ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int AV10Barcod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV14metpiekil ;
   private java.math.BigDecimal AV15metpiemet ;
   private java.math.BigDecimal AV17MetPieMtD ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String AV8emprcod ;
   private String AV9MetTerCod ;
   private String AV12barcodpar ;
   private String AV13metpiecod ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String A396EmprCod ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKZ2_A2813MetPieCod ;
   private String[] P0AKZ2_A130BarCodPar ;
   private byte[] P0AKZ2_A132BarCodReo ;
   private int[] P0AKZ2_A129BarCod ;
   private String[] P0AKZ2_A2809MetTerCod ;
   private String[] P0AKZ2_A396EmprCod ;
   private java.math.BigDecimal[] P0AKZ2_A2814MetPieKil ;
   private java.math.BigDecimal[] P0AKZ2_A2815MetPieMet ;
   private short[] P0AKZ2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P0AKZ2_A4910MetPieMtD ;
}

final  class documentodetransporteproduccion_get_lmeti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKZ2", "SELECT MetPieCod, BarCodPar, BarCodReo, BarCod, MetTerCod, EmprCod, MetPieKil, MetPieMet, MetPieAnc, MetPieMtD FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

