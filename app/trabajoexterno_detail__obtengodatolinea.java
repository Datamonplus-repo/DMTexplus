package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail__obtengodatolinea extends GXProcedure
{
   public trabajoexterno_detail__obtengodatolinea( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail__obtengodatolinea.class ), "" );
   }

   public trabajoexterno_detail__obtengodatolinea( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             int[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 ,
                             short[] aP21 )
   {
      trabajoexterno_detail__obtengodatolinea.this.aP22 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        int[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        int[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 ,
                        byte[] aP19 ,
                        String[] aP20 ,
                        short[] aP21 ,
                        String[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             int[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 ,
                             short[] aP21 ,
                             String[] aP22 )
   {
      trabajoexterno_detail__obtengodatolinea.this.A396EmprCod = aP0;
      trabajoexterno_detail__obtengodatolinea.this.A2253SalExtAlb = aP1;
      trabajoexterno_detail__obtengodatolinea.this.AV8SalExNln = aP2;
      trabajoexterno_detail__obtengodatolinea.this.aP3 = aP3;
      trabajoexterno_detail__obtengodatolinea.this.aP4 = aP4;
      trabajoexterno_detail__obtengodatolinea.this.aP5 = aP5;
      trabajoexterno_detail__obtengodatolinea.this.aP6 = aP6;
      trabajoexterno_detail__obtengodatolinea.this.aP7 = aP7;
      trabajoexterno_detail__obtengodatolinea.this.aP8 = aP8;
      trabajoexterno_detail__obtengodatolinea.this.aP9 = aP9;
      trabajoexterno_detail__obtengodatolinea.this.aP10 = aP10;
      trabajoexterno_detail__obtengodatolinea.this.aP11 = aP11;
      trabajoexterno_detail__obtengodatolinea.this.aP12 = aP12;
      trabajoexterno_detail__obtengodatolinea.this.aP13 = aP13;
      trabajoexterno_detail__obtengodatolinea.this.aP14 = aP14;
      trabajoexterno_detail__obtengodatolinea.this.aP15 = aP15;
      trabajoexterno_detail__obtengodatolinea.this.aP16 = aP16;
      trabajoexterno_detail__obtengodatolinea.this.aP17 = aP17;
      trabajoexterno_detail__obtengodatolinea.this.aP18 = aP18;
      trabajoexterno_detail__obtengodatolinea.this.aP19 = aP19;
      trabajoexterno_detail__obtengodatolinea.this.aP20 = aP20;
      trabajoexterno_detail__obtengodatolinea.this.aP21 = aP21;
      trabajoexterno_detail__obtengodatolinea.this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25EXHDPZ = (short)(0) ;
      AV9barcod = 0 ;
      AV10barcodreo = (byte)(0) ;
      AV11barcodpar = "" ;
      AV12fascodn = "" ;
      AV13OrdLin = (short)(0) ;
      AV14SalExCoE = 0 ;
      AV17SalExCoEold = 0 ;
      AV15SalExKgE = DecimalUtil.ZERO ;
      AV18SalExKgEold = DecimalUtil.ZERO ;
      AV16SalExMtE = DecimalUtil.ZERO ;
      AV19SalExMtEold = DecimalUtil.ZERO ;
      AV20SalExObs = "" ;
      AV21Clicod = 0 ;
      AV22barser = "" ;
      AV23Barcolnom = "" ;
      AV24Barnomcli = "" ;
      AV27barunimed = "" ;
      AV31GXLvl24 = (byte)(0) ;
      /* Using cursor P0AHG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(AV8SalExNln)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6248SalExNln = P0AHG2_A6248SalExNln[0] ;
         A129BarCod = P0AHG2_A129BarCod[0] ;
         A132BarCodReo = P0AHG2_A132BarCodReo[0] ;
         A130BarCodPar = P0AHG2_A130BarCodPar[0] ;
         A6558FasCodn = P0AHG2_A6558FasCodn[0] ;
         A654OrdLin = P0AHG2_A654OrdLin[0] ;
         A6257SalExCoE = P0AHG2_A6257SalExCoE[0] ;
         A6256SalExKgE = P0AHG2_A6256SalExKgE[0] ;
         A6258SalExMtE = P0AHG2_A6258SalExMtE[0] ;
         A6249SalExObs = P0AHG2_A6249SalExObs[0] ;
         A252CliCod = P0AHG2_A252CliCod[0] ;
         n252CliCod = P0AHG2_n252CliCod[0] ;
         A212BarSer = P0AHG2_A212BarSer[0] ;
         A135BarColNom = P0AHG2_A135BarColNom[0] ;
         A1234BarNomCli = P0AHG2_A1234BarNomCli[0] ;
         A213BarSit = P0AHG2_A213BarSit[0] ;
         A228BarUniMed = P0AHG2_A228BarUniMed[0] ;
         A14410FasDscMn = P0AHG2_A14410FasDscMn[0] ;
         A252CliCod = P0AHG2_A252CliCod[0] ;
         n252CliCod = P0AHG2_n252CliCod[0] ;
         A212BarSer = P0AHG2_A212BarSer[0] ;
         A135BarColNom = P0AHG2_A135BarColNom[0] ;
         A1234BarNomCli = P0AHG2_A1234BarNomCli[0] ;
         A213BarSit = P0AHG2_A213BarSit[0] ;
         A228BarUniMed = P0AHG2_A228BarUniMed[0] ;
         AV31GXLvl24 = (byte)(1) ;
         AV9barcod = A129BarCod ;
         AV10barcodreo = A132BarCodReo ;
         AV11barcodpar = A130BarCodPar ;
         AV12fascodn = A6558FasCodn ;
         AV13OrdLin = A654OrdLin ;
         AV14SalExCoE = A6257SalExCoE ;
         AV17SalExCoEold = A6257SalExCoE ;
         AV15SalExKgE = A6256SalExKgE ;
         AV18SalExKgEold = A6256SalExKgE ;
         AV16SalExMtE = A6258SalExMtE ;
         AV19SalExMtEold = A6258SalExMtE ;
         AV20SalExObs = A6249SalExObs ;
         AV21Clicod = A252CliCod ;
         AV22barser = A212BarSer ;
         AV23Barcolnom = A135BarColNom ;
         AV24Barnomcli = A1234BarNomCli ;
         AV26BARSIT = A213BarSit ;
         AV27barunimed = A228BarUniMed ;
         AV28FasdscMn = A14410FasDscMn ;
         AV25EXHDPZ = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV31GXLvl24 == 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = trabajoexterno_detail__obtengodatolinea.this.AV9barcod;
      this.aP4[0] = trabajoexterno_detail__obtengodatolinea.this.AV10barcodreo;
      this.aP5[0] = trabajoexterno_detail__obtengodatolinea.this.AV11barcodpar;
      this.aP6[0] = trabajoexterno_detail__obtengodatolinea.this.AV12fascodn;
      this.aP7[0] = trabajoexterno_detail__obtengodatolinea.this.AV13OrdLin;
      this.aP8[0] = trabajoexterno_detail__obtengodatolinea.this.AV14SalExCoE;
      this.aP9[0] = trabajoexterno_detail__obtengodatolinea.this.AV15SalExKgE;
      this.aP10[0] = trabajoexterno_detail__obtengodatolinea.this.AV16SalExMtE;
      this.aP11[0] = trabajoexterno_detail__obtengodatolinea.this.AV20SalExObs;
      this.aP12[0] = trabajoexterno_detail__obtengodatolinea.this.AV21Clicod;
      this.aP13[0] = trabajoexterno_detail__obtengodatolinea.this.AV22barser;
      this.aP14[0] = trabajoexterno_detail__obtengodatolinea.this.AV23Barcolnom;
      this.aP15[0] = trabajoexterno_detail__obtengodatolinea.this.AV24Barnomcli;
      this.aP16[0] = trabajoexterno_detail__obtengodatolinea.this.AV17SalExCoEold;
      this.aP17[0] = trabajoexterno_detail__obtengodatolinea.this.AV18SalExKgEold;
      this.aP18[0] = trabajoexterno_detail__obtengodatolinea.this.AV19SalExMtEold;
      this.aP19[0] = trabajoexterno_detail__obtengodatolinea.this.AV26BARSIT;
      this.aP20[0] = trabajoexterno_detail__obtengodatolinea.this.AV27barunimed;
      this.aP21[0] = trabajoexterno_detail__obtengodatolinea.this.AV25EXHDPZ;
      this.aP22[0] = trabajoexterno_detail__obtengodatolinea.this.AV28FasdscMn;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11barcodpar = "" ;
      AV12fascodn = "" ;
      AV15SalExKgE = DecimalUtil.ZERO ;
      AV16SalExMtE = DecimalUtil.ZERO ;
      AV20SalExObs = "" ;
      AV22barser = "" ;
      AV23Barcolnom = "" ;
      AV24Barnomcli = "" ;
      AV18SalExKgEold = DecimalUtil.ZERO ;
      AV19SalExMtEold = DecimalUtil.ZERO ;
      AV27barunimed = "" ;
      AV28FasdscMn = "" ;
      scmdbuf = "" ;
      P0AHG2_A396EmprCod = new String[] {""} ;
      P0AHG2_A2253SalExtAlb = new int[1] ;
      P0AHG2_A6248SalExNln = new short[1] ;
      P0AHG2_A129BarCod = new int[1] ;
      P0AHG2_A132BarCodReo = new byte[1] ;
      P0AHG2_A130BarCodPar = new String[] {""} ;
      P0AHG2_A6558FasCodn = new String[] {""} ;
      P0AHG2_A654OrdLin = new short[1] ;
      P0AHG2_A6257SalExCoE = new int[1] ;
      P0AHG2_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHG2_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AHG2_A6249SalExObs = new String[] {""} ;
      P0AHG2_A252CliCod = new int[1] ;
      P0AHG2_n252CliCod = new boolean[] {false} ;
      P0AHG2_A212BarSer = new String[] {""} ;
      P0AHG2_A135BarColNom = new String[] {""} ;
      P0AHG2_A1234BarNomCli = new String[] {""} ;
      P0AHG2_A213BarSit = new byte[1] ;
      P0AHG2_A228BarUniMed = new String[] {""} ;
      P0AHG2_A14410FasDscMn = new String[] {""} ;
      A130BarCodPar = "" ;
      A6558FasCodn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6249SalExObs = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A228BarUniMed = "" ;
      A14410FasDscMn = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajoexterno_detail__obtengodatolinea__default(),
         new Object[] {
             new Object[] {
            P0AHG2_A396EmprCod, P0AHG2_A2253SalExtAlb, P0AHG2_A6248SalExNln, P0AHG2_A129BarCod, P0AHG2_A132BarCodReo, P0AHG2_A130BarCodPar, P0AHG2_A6558FasCodn, P0AHG2_A654OrdLin, P0AHG2_A6257SalExCoE, P0AHG2_A6256SalExKgE,
            P0AHG2_A6258SalExMtE, P0AHG2_A6249SalExObs, P0AHG2_A252CliCod, P0AHG2_n252CliCod, P0AHG2_A212BarSer, P0AHG2_A135BarColNom, P0AHG2_A1234BarNomCli, P0AHG2_A213BarSit, P0AHG2_A228BarUniMed, P0AHG2_A14410FasDscMn
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10barcodreo ;
   private byte AV26BARSIT ;
   private byte AV31GXLvl24 ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV8SalExNln ;
   private short AV13OrdLin ;
   private short AV25EXHDPZ ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int AV9barcod ;
   private int AV14SalExCoE ;
   private int AV21Clicod ;
   private int AV17SalExCoEold ;
   private int A129BarCod ;
   private int A6257SalExCoE ;
   private int A252CliCod ;
   private java.math.BigDecimal AV15SalExKgE ;
   private java.math.BigDecimal AV16SalExMtE ;
   private java.math.BigDecimal AV18SalExKgEold ;
   private java.math.BigDecimal AV19SalExMtEold ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private String A396EmprCod ;
   private String AV11barcodpar ;
   private String AV12fascodn ;
   private String AV20SalExObs ;
   private String AV22barser ;
   private String AV23Barcolnom ;
   private String AV24Barnomcli ;
   private String AV27barunimed ;
   private String AV28FasdscMn ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A6558FasCodn ;
   private String A6249SalExObs ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A228BarUniMed ;
   private String A14410FasDscMn ;
   private boolean n252CliCod ;
   private String[] aP22 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private int[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private int[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private java.math.BigDecimal[] aP18 ;
   private byte[] aP19 ;
   private String[] aP20 ;
   private short[] aP21 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AHG2_A396EmprCod ;
   private int[] P0AHG2_A2253SalExtAlb ;
   private short[] P0AHG2_A6248SalExNln ;
   private int[] P0AHG2_A129BarCod ;
   private byte[] P0AHG2_A132BarCodReo ;
   private String[] P0AHG2_A130BarCodPar ;
   private String[] P0AHG2_A6558FasCodn ;
   private short[] P0AHG2_A654OrdLin ;
   private int[] P0AHG2_A6257SalExCoE ;
   private java.math.BigDecimal[] P0AHG2_A6256SalExKgE ;
   private java.math.BigDecimal[] P0AHG2_A6258SalExMtE ;
   private String[] P0AHG2_A6249SalExObs ;
   private int[] P0AHG2_A252CliCod ;
   private boolean[] P0AHG2_n252CliCod ;
   private String[] P0AHG2_A212BarSer ;
   private String[] P0AHG2_A135BarColNom ;
   private String[] P0AHG2_A1234BarNomCli ;
   private byte[] P0AHG2_A213BarSit ;
   private String[] P0AHG2_A228BarUniMed ;
   private String[] P0AHG2_A14410FasDscMn ;
}

final  class trabajoexterno_detail__obtengodatolinea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AHG2", "SELECT T1.EmprCod, T1.SalExtAlb, T1.SalExNln, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCodn, T1.OrdLin, T1.SalExCoE, T1.SalExKgE, T1.SalExMtE, T1.SalExObs, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarNomCli, T2.BarSit, T2.BarUniMed, T1.FasDscMn FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? and T1.SalExNln = ? ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 30);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

