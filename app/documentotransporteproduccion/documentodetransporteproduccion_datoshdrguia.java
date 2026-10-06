package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_datoshdrguia extends GXProcedure
{
   public documentodetransporteproduccion_datoshdrguia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_datoshdrguia.class ), "" );
   }

   public documentodetransporteproduccion_datoshdrguia( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           int[] aP6 ,
                           byte[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           int[] aP10 ,
                           String[] aP11 ,
                           int[] aP12 ,
                           short[] aP13 ,
                           short[] aP14 ,
                           String[] aP15 ,
                           byte[] aP16 ,
                           String[] aP17 )
   {
      documentodetransporteproduccion_datoshdrguia.this.aP18 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        short[] aP13 ,
                        short[] aP14 ,
                        String[] aP15 ,
                        byte[] aP16 ,
                        String[] aP17 ,
                        byte[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             String[] aP15 ,
                             byte[] aP16 ,
                             String[] aP17 ,
                             byte[] aP18 )
   {
      documentodetransporteproduccion_datoshdrguia.this.AV23EmprCod = aP0;
      documentodetransporteproduccion_datoshdrguia.this.AV24BarCod = aP1;
      documentodetransporteproduccion_datoshdrguia.this.AV25BarCodReo = aP2;
      documentodetransporteproduccion_datoshdrguia.this.AV26BarCodPar = aP3;
      documentodetransporteproduccion_datoshdrguia.this.aP4 = aP4;
      documentodetransporteproduccion_datoshdrguia.this.aP5 = aP5;
      documentodetransporteproduccion_datoshdrguia.this.aP6 = aP6;
      documentodetransporteproduccion_datoshdrguia.this.aP7 = aP7;
      documentodetransporteproduccion_datoshdrguia.this.aP8 = aP8;
      documentodetransporteproduccion_datoshdrguia.this.aP9 = aP9;
      documentodetransporteproduccion_datoshdrguia.this.aP10 = aP10;
      documentodetransporteproduccion_datoshdrguia.this.aP11 = aP11;
      documentodetransporteproduccion_datoshdrguia.this.aP12 = aP12;
      documentodetransporteproduccion_datoshdrguia.this.aP13 = aP13;
      documentodetransporteproduccion_datoshdrguia.this.aP14 = aP14;
      documentodetransporteproduccion_datoshdrguia.this.aP15 = aP15;
      documentodetransporteproduccion_datoshdrguia.this.aP16 = aP16;
      documentodetransporteproduccion_datoshdrguia.this.aP17 = aP17;
      documentodetransporteproduccion_datoshdrguia.this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10BarAncAca1 = (short)(0) ;
      AV11BarColNom = "" ;
      AV12BarColNum = 0 ;
      AV18BarGraAca = (short)(0) ;
      AV17BarNomCli = "" ;
      AV8BarNumcli = 0 ;
      AV14BarSer = "" ;
      AV15Barserdsc = "" ;
      AV9BarTipArt = (short)(0) ;
      AV13BarTipCol = (byte)(0) ;
      AV16CliCod = 0 ;
      AV20BarEstReo = (byte)(0) ;
      AV21BarTipCor = "NO" ;
      AV19BarEncCli = "" ;
      /* Using cursor P0ACB2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A125BarAncAca1 = P0ACB2_A125BarAncAca1[0] ;
         A135BarColNom = P0ACB2_A135BarColNom[0] ;
         A136BarColNum = P0ACB2_A136BarColNum[0] ;
         A1909BarGraAca = P0ACB2_A1909BarGraAca[0] ;
         A1234BarNomCli = P0ACB2_A1234BarNomCli[0] ;
         A1235BarNumCli = P0ACB2_A1235BarNumCli[0] ;
         A212BarSer = P0ACB2_A212BarSer[0] ;
         A1652BarSerDsc = P0ACB2_A1652BarSerDsc[0] ;
         A217BarTipArt = P0ACB2_A217BarTipArt[0] ;
         n217BarTipArt = P0ACB2_n217BarTipArt[0] ;
         A218BarTipCol = P0ACB2_A218BarTipCol[0] ;
         A252CliCod = P0ACB2_A252CliCod[0] ;
         n252CliCod = P0ACB2_n252CliCod[0] ;
         A148BarEstReo = P0ACB2_A148BarEstReo[0] ;
         A5291BarTipCor = P0ACB2_A5291BarTipCor[0] ;
         A213BarSit = P0ACB2_A213BarSit[0] ;
         A130BarCodPar = P0ACB2_A130BarCodPar[0] ;
         A132BarCodReo = P0ACB2_A132BarCodReo[0] ;
         A129BarCod = P0ACB2_A129BarCod[0] ;
         A143BarDisNum = P0ACB2_A143BarDisNum[0] ;
         A4812BarEncCli = P0ACB2_A4812BarEncCli[0] ;
         A396EmprCod = P0ACB2_A396EmprCod[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         documentodetransporteproduccion_datoshdrguia.this.A396EmprCod = GXv_char2[0] ;
         documentodetransporteproduccion_datoshdrguia.this.A4812BarEncCli = GXv_char3[0] ;
         documentodetransporteproduccion_datoshdrguia.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_datoshdrguia.this.GXt_char1 = GXv_char5[0] ;
         A13878PedidoClie = GXt_char1 ;
         AV10BarAncAca1 = A125BarAncAca1 ;
         AV11BarColNom = A135BarColNom ;
         AV12BarColNum = A136BarColNum ;
         AV18BarGraAca = A1909BarGraAca ;
         AV17BarNomCli = A1234BarNomCli ;
         AV8BarNumcli = A1235BarNumCli ;
         AV14BarSer = A212BarSer ;
         AV15Barserdsc = A1652BarSerDsc ;
         AV9BarTipArt = A217BarTipArt ;
         AV13BarTipCol = A218BarTipCol ;
         AV16CliCod = A252CliCod ;
         AV20BarEstReo = A148BarEstReo ;
         AV21BarTipCor = A5291BarTipCor ;
         AV22Barsit = A213BarSit ;
         AV19BarEncCli = A13878PedidoClie ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = documentodetransporteproduccion_datoshdrguia.this.AV10BarAncAca1;
      this.aP5[0] = documentodetransporteproduccion_datoshdrguia.this.AV11BarColNom;
      this.aP6[0] = documentodetransporteproduccion_datoshdrguia.this.AV12BarColNum;
      this.aP7[0] = documentodetransporteproduccion_datoshdrguia.this.AV13BarTipCol;
      this.aP8[0] = documentodetransporteproduccion_datoshdrguia.this.AV14BarSer;
      this.aP9[0] = documentodetransporteproduccion_datoshdrguia.this.AV15Barserdsc;
      this.aP10[0] = documentodetransporteproduccion_datoshdrguia.this.AV16CliCod;
      this.aP11[0] = documentodetransporteproduccion_datoshdrguia.this.AV17BarNomCli;
      this.aP12[0] = documentodetransporteproduccion_datoshdrguia.this.AV8BarNumcli;
      this.aP13[0] = documentodetransporteproduccion_datoshdrguia.this.AV9BarTipArt;
      this.aP14[0] = documentodetransporteproduccion_datoshdrguia.this.AV18BarGraAca;
      this.aP15[0] = documentodetransporteproduccion_datoshdrguia.this.AV19BarEncCli;
      this.aP16[0] = documentodetransporteproduccion_datoshdrguia.this.AV20BarEstReo;
      this.aP17[0] = documentodetransporteproduccion_datoshdrguia.this.AV21BarTipCor;
      this.aP18[0] = documentodetransporteproduccion_datoshdrguia.this.AV22Barsit;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11BarColNom = "" ;
      AV14BarSer = "" ;
      AV15Barserdsc = "" ;
      AV17BarNomCli = "" ;
      AV19BarEncCli = "" ;
      AV21BarTipCor = "" ;
      scmdbuf = "" ;
      P0ACB2_A125BarAncAca1 = new short[1] ;
      P0ACB2_A135BarColNom = new String[] {""} ;
      P0ACB2_A136BarColNum = new int[1] ;
      P0ACB2_A1909BarGraAca = new short[1] ;
      P0ACB2_A1234BarNomCli = new String[] {""} ;
      P0ACB2_A1235BarNumCli = new int[1] ;
      P0ACB2_A212BarSer = new String[] {""} ;
      P0ACB2_A1652BarSerDsc = new String[] {""} ;
      P0ACB2_A217BarTipArt = new short[1] ;
      P0ACB2_n217BarTipArt = new boolean[] {false} ;
      P0ACB2_A218BarTipCol = new byte[1] ;
      P0ACB2_A252CliCod = new int[1] ;
      P0ACB2_n252CliCod = new boolean[] {false} ;
      P0ACB2_A148BarEstReo = new byte[1] ;
      P0ACB2_A5291BarTipCor = new String[] {""} ;
      P0ACB2_A213BarSit = new byte[1] ;
      P0ACB2_A130BarCodPar = new String[] {""} ;
      P0ACB2_A132BarCodReo = new byte[1] ;
      P0ACB2_A129BarCod = new int[1] ;
      P0ACB2_A143BarDisNum = new String[] {""} ;
      P0ACB2_A4812BarEncCli = new String[] {""} ;
      P0ACB2_A396EmprCod = new String[] {""} ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A5291BarTipCor = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A396EmprCod = "" ;
      A13878PedidoClie = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_datoshdrguia__default(),
         new Object[] {
             new Object[] {
            P0ACB2_A125BarAncAca1, P0ACB2_A135BarColNom, P0ACB2_A136BarColNum, P0ACB2_A1909BarGraAca, P0ACB2_A1234BarNomCli, P0ACB2_A1235BarNumCli, P0ACB2_A212BarSer, P0ACB2_A1652BarSerDsc, P0ACB2_A217BarTipArt, P0ACB2_n217BarTipArt,
            P0ACB2_A218BarTipCol, P0ACB2_A252CliCod, P0ACB2_n252CliCod, P0ACB2_A148BarEstReo, P0ACB2_A5291BarTipCor, P0ACB2_A213BarSit, P0ACB2_A130BarCodPar, P0ACB2_A132BarCodReo, P0ACB2_A129BarCod, P0ACB2_A143BarDisNum,
            P0ACB2_A4812BarEncCli, P0ACB2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25BarCodReo ;
   private byte AV13BarTipCol ;
   private byte AV20BarEstReo ;
   private byte AV22Barsit ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short AV10BarAncAca1 ;
   private short AV9BarTipArt ;
   private short AV18BarGraAca ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV24BarCod ;
   private int AV12BarColNum ;
   private int AV16CliCod ;
   private int AV8BarNumcli ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A252CliCod ;
   private int A129BarCod ;
   private String AV23EmprCod ;
   private String AV26BarCodPar ;
   private String AV11BarColNom ;
   private String AV14BarSer ;
   private String AV15Barserdsc ;
   private String AV17BarNomCli ;
   private String AV19BarEncCli ;
   private String AV21BarTipCor ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A5291BarTipCor ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A396EmprCod ;
   private String A13878PedidoClie ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private byte[] aP18 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private short[] aP13 ;
   private short[] aP14 ;
   private String[] aP15 ;
   private byte[] aP16 ;
   private String[] aP17 ;
   private IDataStoreProvider pr_default ;
   private short[] P0ACB2_A125BarAncAca1 ;
   private String[] P0ACB2_A135BarColNom ;
   private int[] P0ACB2_A136BarColNum ;
   private short[] P0ACB2_A1909BarGraAca ;
   private String[] P0ACB2_A1234BarNomCli ;
   private int[] P0ACB2_A1235BarNumCli ;
   private String[] P0ACB2_A212BarSer ;
   private String[] P0ACB2_A1652BarSerDsc ;
   private short[] P0ACB2_A217BarTipArt ;
   private boolean[] P0ACB2_n217BarTipArt ;
   private byte[] P0ACB2_A218BarTipCol ;
   private int[] P0ACB2_A252CliCod ;
   private boolean[] P0ACB2_n252CliCod ;
   private byte[] P0ACB2_A148BarEstReo ;
   private String[] P0ACB2_A5291BarTipCor ;
   private byte[] P0ACB2_A213BarSit ;
   private String[] P0ACB2_A130BarCodPar ;
   private byte[] P0ACB2_A132BarCodReo ;
   private int[] P0ACB2_A129BarCod ;
   private String[] P0ACB2_A143BarDisNum ;
   private String[] P0ACB2_A4812BarEncCli ;
   private String[] P0ACB2_A396EmprCod ;
}

final  class documentodetransporteproduccion_datoshdrguia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACB2", "SELECT BarAncAca1, BarColNom, BarColNum, BarGraAca, BarNomCli, BarNumCli, BarSer, BarSerDsc, BarTipArt, BarTipCol, CliCod, BarEstReo, BarTipCor, BarSit, BarCodPar, BarCodReo, BarCod, BarDisNum, BarEncCli, EmprCod FROM TXPBARCAD ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 2);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 20);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

