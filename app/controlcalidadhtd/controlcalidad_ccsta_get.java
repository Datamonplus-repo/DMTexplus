package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccsta_get extends GXProcedure
{
   public controlcalidad_ccsta_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccsta_get.class ), "" );
   }

   public controlcalidad_ccsta_get( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             short aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      controlcalidad_ccsta_get.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        int aP5 ,
                        short aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             short aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      controlcalidad_ccsta_get.this.A396EmprCod = aP0;
      controlcalidad_ccsta_get.this.A252CliCod = aP1;
      controlcalidad_ccsta_get.this.A65ArtCod = aP2;
      controlcalidad_ccsta_get.this.A4058CCFColNom = aP3;
      controlcalidad_ccsta_get.this.A4059CCFColNum = aP4;
      controlcalidad_ccsta_get.this.A4031CCTCod = aP5;
      controlcalidad_ccsta_get.this.A4034CCTLin = aP6;
      controlcalidad_ccsta_get.this.aP7 = aP7;
      controlcalidad_ccsta_get.this.aP8 = aP8;
      controlcalidad_ccsta_get.this.aP9 = aP9;
      controlcalidad_ccsta_get.this.aP10 = aP10;
      controlcalidad_ccsta_get.this.aP11 = aP11;
      controlcalidad_ccsta_get.this.aP12 = aP12;
      controlcalidad_ccsta_get.this.aP13 = aP13;
      controlcalidad_ccsta_get.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9CCSMetodo = "" ;
      AV10CCSEspecif = "" ;
      AV11CCSAuto = (byte)(0) ;
      AV12CCSVTol = DecimalUtil.ZERO ;
      AV13CCSMin = "" ;
      AV14CCSVal = "" ;
      AV15CCSMax = "" ;
      AV16Mask = "" ;
      /* Using cursor P0AOO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13247CCSMetodo = P0AOO2_A13247CCSMetodo[0] ;
         n13247CCSMetodo = P0AOO2_n13247CCSMetodo[0] ;
         A13248CCSEspecif = P0AOO2_A13248CCSEspecif[0] ;
         n13248CCSEspecif = P0AOO2_n13248CCSEspecif[0] ;
         A11530CCSAuto = P0AOO2_A11530CCSAuto[0] ;
         A11532CCSVTol = P0AOO2_A11532CCSVTol[0] ;
         A11482CCSMin = P0AOO2_A11482CCSMin[0] ;
         n11482CCSMin = P0AOO2_n11482CCSMin[0] ;
         A4060CCSVal = P0AOO2_A4060CCSVal[0] ;
         n4060CCSVal = P0AOO2_n4060CCSVal[0] ;
         A11483CCSMax = P0AOO2_A11483CCSMax[0] ;
         n11483CCSMax = P0AOO2_n11483CCSMax[0] ;
         A4045CCTLinLgoD = P0AOO2_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = P0AOO2_A4046CCTLinPict[0] ;
         A279CliNom = P0AOO2_A279CliNom[0] ;
         A279CliNom = P0AOO2_A279CliNom[0] ;
         A4045CCTLinLgoD = P0AOO2_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = P0AOO2_A4046CCTLinPict[0] ;
         AV9CCSMetodo = A13247CCSMetodo ;
         AV10CCSEspecif = A13248CCSEspecif ;
         AV11CCSAuto = A11530CCSAuto ;
         AV12CCSVTol = A11532CCSVTol ;
         AV13CCSMin = A11482CCSMin ;
         AV14CCSVal = A4060CCSVal ;
         AV15CCSMax = A11483CCSMax ;
         if ( A11530CCSAuto == 0 )
         {
            GXt_char1 = AV16Mask ;
            GXv_char2[0] = A4046CCTLinPict ;
            GXv_int3[0] = A4045CCTLinLgoD ;
            GXv_char4[0] = GXt_char1 ;
            new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            controlcalidad_ccsta_get.this.A4046CCTLinPict = GXv_char2[0] ;
            controlcalidad_ccsta_get.this.A4045CCTLinLgoD = (short)((short)(GXv_int3[0])) ;
            controlcalidad_ccsta_get.this.GXt_char1 = GXv_char4[0] ;
            AV16Mask = GXt_char1 ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = controlcalidad_ccsta_get.this.AV9CCSMetodo;
      this.aP8[0] = controlcalidad_ccsta_get.this.AV10CCSEspecif;
      this.aP9[0] = controlcalidad_ccsta_get.this.AV11CCSAuto;
      this.aP10[0] = controlcalidad_ccsta_get.this.AV12CCSVTol;
      this.aP11[0] = controlcalidad_ccsta_get.this.AV13CCSMin;
      this.aP12[0] = controlcalidad_ccsta_get.this.AV14CCSVal;
      this.aP13[0] = controlcalidad_ccsta_get.this.AV15CCSMax;
      this.aP14[0] = controlcalidad_ccsta_get.this.AV16Mask;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9CCSMetodo = "" ;
      AV10CCSEspecif = "" ;
      AV12CCSVTol = DecimalUtil.ZERO ;
      AV13CCSMin = "" ;
      AV14CCSVal = "" ;
      AV15CCSMax = "" ;
      AV16Mask = "" ;
      scmdbuf = "" ;
      P0AOO2_A396EmprCod = new String[] {""} ;
      P0AOO2_A252CliCod = new int[1] ;
      P0AOO2_A65ArtCod = new String[] {""} ;
      P0AOO2_A4058CCFColNom = new String[] {""} ;
      P0AOO2_A4059CCFColNum = new int[1] ;
      P0AOO2_A4031CCTCod = new int[1] ;
      P0AOO2_A4034CCTLin = new short[1] ;
      P0AOO2_A13247CCSMetodo = new String[] {""} ;
      P0AOO2_n13247CCSMetodo = new boolean[] {false} ;
      P0AOO2_A13248CCSEspecif = new String[] {""} ;
      P0AOO2_n13248CCSEspecif = new boolean[] {false} ;
      P0AOO2_A11530CCSAuto = new byte[1] ;
      P0AOO2_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AOO2_A11482CCSMin = new String[] {""} ;
      P0AOO2_n11482CCSMin = new boolean[] {false} ;
      P0AOO2_A4060CCSVal = new String[] {""} ;
      P0AOO2_n4060CCSVal = new boolean[] {false} ;
      P0AOO2_A11483CCSMax = new String[] {""} ;
      P0AOO2_n11483CCSMax = new boolean[] {false} ;
      P0AOO2_A4045CCTLinLgoD = new short[1] ;
      P0AOO2_A4046CCTLinPict = new String[] {""} ;
      P0AOO2_A279CliNom = new String[] {""} ;
      A13247CCSMetodo = "" ;
      A13248CCSEspecif = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A11482CCSMin = "" ;
      A4060CCSVal = "" ;
      A11483CCSMax = "" ;
      A4046CCTLinPict = "" ;
      A279CliNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccsta_get__default(),
         new Object[] {
             new Object[] {
            P0AOO2_A396EmprCod, P0AOO2_A252CliCod, P0AOO2_A65ArtCod, P0AOO2_A4058CCFColNom, P0AOO2_A4059CCFColNum, P0AOO2_A4031CCTCod, P0AOO2_A4034CCTLin, P0AOO2_A13247CCSMetodo, P0AOO2_n13247CCSMetodo, P0AOO2_A13248CCSEspecif,
            P0AOO2_n13248CCSEspecif, P0AOO2_A11530CCSAuto, P0AOO2_A11532CCSVTol, P0AOO2_A11482CCSMin, P0AOO2_n11482CCSMin, P0AOO2_A4060CCSVal, P0AOO2_n4060CCSVal, P0AOO2_A11483CCSMax, P0AOO2_n11483CCSMax, P0AOO2_A4045CCTLinLgoD,
            P0AOO2_A4046CCTLinPict, P0AOO2_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11CCSAuto ;
   private byte A11530CCSAuto ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal AV12CCSVTol ;
   private java.math.BigDecimal A11532CCSVTol ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String AV9CCSMetodo ;
   private String AV10CCSEspecif ;
   private String AV13CCSMin ;
   private String AV14CCSVal ;
   private String AV15CCSMax ;
   private String scmdbuf ;
   private String A13247CCSMetodo ;
   private String A13248CCSEspecif ;
   private String A11482CCSMin ;
   private String A4060CCSVal ;
   private String A11483CCSMax ;
   private String A4046CCTLinPict ;
   private String A279CliNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private boolean n13247CCSMetodo ;
   private boolean n13248CCSEspecif ;
   private boolean n11482CCSMin ;
   private boolean n4060CCSVal ;
   private boolean n11483CCSMax ;
   private String AV16Mask ;
   private String[] aP14 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private byte[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOO2_A396EmprCod ;
   private int[] P0AOO2_A252CliCod ;
   private String[] P0AOO2_A65ArtCod ;
   private String[] P0AOO2_A4058CCFColNom ;
   private int[] P0AOO2_A4059CCFColNum ;
   private int[] P0AOO2_A4031CCTCod ;
   private short[] P0AOO2_A4034CCTLin ;
   private String[] P0AOO2_A13247CCSMetodo ;
   private boolean[] P0AOO2_n13247CCSMetodo ;
   private String[] P0AOO2_A13248CCSEspecif ;
   private boolean[] P0AOO2_n13248CCSEspecif ;
   private byte[] P0AOO2_A11530CCSAuto ;
   private java.math.BigDecimal[] P0AOO2_A11532CCSVTol ;
   private String[] P0AOO2_A11482CCSMin ;
   private boolean[] P0AOO2_n11482CCSMin ;
   private String[] P0AOO2_A4060CCSVal ;
   private boolean[] P0AOO2_n4060CCSVal ;
   private String[] P0AOO2_A11483CCSMax ;
   private boolean[] P0AOO2_n11483CCSMax ;
   private short[] P0AOO2_A4045CCTLinLgoD ;
   private String[] P0AOO2_A4046CCTLinPict ;
   private String[] P0AOO2_A279CliNom ;
}

final  class controlcalidad_ccsta_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOO2", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin, T1.CCSMetodo, T1.CCSEspecif, T1.CCSAuto, T1.CCSVTol, T1.CCSMin, T1.CCSVal, T1.CCSMax, T3.CCTLinLgoD, T3.CCTLinPict, T2.CliNom FROM ((TXPCCSta T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPCCDef1 T3 ON T3.EmprCod = T1.EmprCod AND T3.CCTCod = T1.CCTCod AND T3.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.CCFColNom = ? and T1.CCFColNum = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[13])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((String[]) buf[20])[0] = rslt.getString(16, 40);
               ((String[]) buf[21])[0] = rslt.getString(17, 30);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

