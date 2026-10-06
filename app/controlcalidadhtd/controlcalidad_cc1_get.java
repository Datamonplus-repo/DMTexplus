package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc1_get extends GXProcedure
{
   public controlcalidad_cc1_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc1_get.class ), "" );
   }

   public controlcalidad_cc1_get( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             short aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      controlcalidad_cc1_get.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        int aP6 ,
                        short aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             int aP6 ,
                             short aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      controlcalidad_cc1_get.this.A396EmprCod = aP0;
      controlcalidad_cc1_get.this.A129BarCod = aP1;
      controlcalidad_cc1_get.this.A132BarCodReo = aP2;
      controlcalidad_cc1_get.this.A130BarCodPar = aP3;
      controlcalidad_cc1_get.this.A758ProCod = aP4;
      controlcalidad_cc1_get.this.A194BarOrdLin = aP5;
      controlcalidad_cc1_get.this.A4031CCTCod = aP6;
      controlcalidad_cc1_get.this.A4034CCTLin = aP7;
      controlcalidad_cc1_get.this.aP8 = aP8;
      controlcalidad_cc1_get.this.aP9 = aP9;
      controlcalidad_cc1_get.this.aP10 = aP10;
      controlcalidad_cc1_get.this.aP11 = aP11;
      controlcalidad_cc1_get.this.aP12 = aP12;
      controlcalidad_cc1_get.this.aP13 = aP13;
      controlcalidad_cc1_get.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9CCSMetodo = "" ;
      AV10CCSEspecif = "" ;
      AV14CCSVal = "" ;
      AV17CCoklin = (byte)(0) ;
      AV16Mask = "" ;
      AV18CCTLinDsc = "" ;
      AV19CCTLinDC2 = "" ;
      /* Using cursor P0AQ32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13251CCMetodo = P0AQ32_A13251CCMetodo[0] ;
         A13252CCEspecif = P0AQ32_A13252CCEspecif[0] ;
         A4035CCVal = P0AQ32_A4035CCVal[0] ;
         A12750CCOkLin = P0AQ32_A12750CCOkLin[0] ;
         A4043CCTLinDsc = P0AQ32_A4043CCTLinDsc[0] ;
         A14344CCTLinDc2 = P0AQ32_A14344CCTLinDc2[0] ;
         A4045CCTLinLgoD = P0AQ32_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = P0AQ32_A4046CCTLinPict[0] ;
         A4043CCTLinDsc = P0AQ32_A4043CCTLinDsc[0] ;
         A14344CCTLinDc2 = P0AQ32_A14344CCTLinDc2[0] ;
         A4045CCTLinLgoD = P0AQ32_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = P0AQ32_A4046CCTLinPict[0] ;
         AV9CCSMetodo = A13251CCMetodo ;
         AV10CCSEspecif = A13252CCEspecif ;
         AV14CCSVal = A4035CCVal ;
         AV17CCoklin = A12750CCOkLin ;
         AV18CCTLinDsc = A4043CCTLinDsc ;
         AV19CCTLinDC2 = A14344CCTLinDc2 ;
         GXt_char1 = AV16Mask ;
         GXv_char2[0] = A4046CCTLinPict ;
         GXv_int3[0] = A4045CCTLinLgoD ;
         GXv_char4[0] = GXt_char1 ;
         new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         controlcalidad_cc1_get.this.A4046CCTLinPict = GXv_char2[0] ;
         controlcalidad_cc1_get.this.A4045CCTLinLgoD = (short)((short)(GXv_int3[0])) ;
         controlcalidad_cc1_get.this.GXt_char1 = GXv_char4[0] ;
         AV16Mask = GXt_char1 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = controlcalidad_cc1_get.this.AV9CCSMetodo;
      this.aP9[0] = controlcalidad_cc1_get.this.AV10CCSEspecif;
      this.aP10[0] = controlcalidad_cc1_get.this.AV14CCSVal;
      this.aP11[0] = controlcalidad_cc1_get.this.AV17CCoklin;
      this.aP12[0] = controlcalidad_cc1_get.this.AV18CCTLinDsc;
      this.aP13[0] = controlcalidad_cc1_get.this.AV19CCTLinDC2;
      this.aP14[0] = controlcalidad_cc1_get.this.AV16Mask;
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
      AV14CCSVal = "" ;
      AV18CCTLinDsc = "" ;
      AV19CCTLinDC2 = "" ;
      AV16Mask = "" ;
      scmdbuf = "" ;
      P0AQ32_A396EmprCod = new String[] {""} ;
      P0AQ32_A129BarCod = new int[1] ;
      P0AQ32_A132BarCodReo = new byte[1] ;
      P0AQ32_A130BarCodPar = new String[] {""} ;
      P0AQ32_A758ProCod = new String[] {""} ;
      P0AQ32_A194BarOrdLin = new short[1] ;
      P0AQ32_A4031CCTCod = new int[1] ;
      P0AQ32_A4034CCTLin = new short[1] ;
      P0AQ32_A13251CCMetodo = new String[] {""} ;
      P0AQ32_A13252CCEspecif = new String[] {""} ;
      P0AQ32_A4035CCVal = new String[] {""} ;
      P0AQ32_A12750CCOkLin = new byte[1] ;
      P0AQ32_A4043CCTLinDsc = new String[] {""} ;
      P0AQ32_A14344CCTLinDc2 = new String[] {""} ;
      P0AQ32_A4045CCTLinLgoD = new short[1] ;
      P0AQ32_A4046CCTLinPict = new String[] {""} ;
      A13251CCMetodo = "" ;
      A13252CCEspecif = "" ;
      A4035CCVal = "" ;
      A4043CCTLinDsc = "" ;
      A14344CCTLinDc2 = "" ;
      A4046CCTLinPict = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc1_get__default(),
         new Object[] {
             new Object[] {
            P0AQ32_A396EmprCod, P0AQ32_A129BarCod, P0AQ32_A132BarCodReo, P0AQ32_A130BarCodPar, P0AQ32_A758ProCod, P0AQ32_A194BarOrdLin, P0AQ32_A4031CCTCod, P0AQ32_A4034CCTLin, P0AQ32_A13251CCMetodo, P0AQ32_A13252CCEspecif,
            P0AQ32_A4035CCVal, P0AQ32_A12750CCOkLin, P0AQ32_A4043CCTLinDsc, P0AQ32_A14344CCTLinDc2, P0AQ32_A4045CCTLinLgoD, P0AQ32_A4046CCTLinPict
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17CCoklin ;
   private byte A12750CCOkLin ;
   private short A194BarOrdLin ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private long GXv_int3[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV9CCSMetodo ;
   private String AV10CCSEspecif ;
   private String AV14CCSVal ;
   private String AV18CCTLinDsc ;
   private String AV19CCTLinDC2 ;
   private String scmdbuf ;
   private String A13251CCMetodo ;
   private String A13252CCEspecif ;
   private String A4035CCVal ;
   private String A4043CCTLinDsc ;
   private String A14344CCTLinDc2 ;
   private String A4046CCTLinPict ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV16Mask ;
   private String[] aP14 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private byte[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQ32_A396EmprCod ;
   private int[] P0AQ32_A129BarCod ;
   private byte[] P0AQ32_A132BarCodReo ;
   private String[] P0AQ32_A130BarCodPar ;
   private String[] P0AQ32_A758ProCod ;
   private short[] P0AQ32_A194BarOrdLin ;
   private int[] P0AQ32_A4031CCTCod ;
   private short[] P0AQ32_A4034CCTLin ;
   private String[] P0AQ32_A13251CCMetodo ;
   private String[] P0AQ32_A13252CCEspecif ;
   private String[] P0AQ32_A4035CCVal ;
   private byte[] P0AQ32_A12750CCOkLin ;
   private String[] P0AQ32_A4043CCTLinDsc ;
   private String[] P0AQ32_A14344CCTLinDc2 ;
   private short[] P0AQ32_A4045CCTLinLgoD ;
   private String[] P0AQ32_A4046CCTLinPict ;
}

final  class controlcalidad_cc1_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQ32", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin, T1.CCMetodo, T1.CCEspecif, T1.CCVal, T1.CCOkLin, T2.CCTLinDsc, T2.CCTLinDc2, T2.CCTLinLgoD, T2.CCTLinPict FROM (TXPCC1 T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.CCTCod = ? and T1.CCTLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 40);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((String[]) buf[13])[0] = rslt.getString(14, 60);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 40);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

