package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dp_sdt_hdr extends GXProcedure
{
   public dp_sdt_hdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dp_sdt_hdr.class ), "" );
   }

   public dp_sdt_hdr( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.expedicionesautomatizadas.SdtSDT_Hdr executeUdp( String aP0 ,
                                                               int aP1 ,
                                                               byte aP2 ,
                                                               String aP3 )
   {
      dp_sdt_hdr.this.aP4 = new app.expedicionesautomatizadas.SdtSDT_Hdr[] {new app.expedicionesautomatizadas.SdtSDT_Hdr()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        app.expedicionesautomatizadas.SdtSDT_Hdr[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             app.expedicionesautomatizadas.SdtSDT_Hdr[] aP4 )
   {
      dp_sdt_hdr.this.A396EmprCod = aP0;
      dp_sdt_hdr.this.A129BarCod = aP1;
      dp_sdt_hdr.this.A132BarCodReo = aP2;
      dp_sdt_hdr.this.A130BarCodPar = aP3;
      dp_sdt_hdr.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002L3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A279CliNom = P002L3_A279CliNom[0] ;
         A252CliCod = P002L3_A252CliCod[0] ;
         n252CliCod = P002L3_n252CliCod[0] ;
         A361DisCod = P002L3_A361DisCod[0] ;
         A212BarSer = P002L3_A212BarSer[0] ;
         A1652BarSerDsc = P002L3_A1652BarSerDsc[0] ;
         A217BarTipArt = P002L3_A217BarTipArt[0] ;
         n217BarTipArt = P002L3_n217BarTipArt[0] ;
         A136BarColNum = P002L3_A136BarColNum[0] ;
         A135BarColNom = P002L3_A135BarColNom[0] ;
         A1234BarNomCli = P002L3_A1234BarNomCli[0] ;
         A218BarTipCol = P002L3_A218BarTipCol[0] ;
         A159BarFecGen = P002L3_A159BarFecGen[0] ;
         A143BarDisNum = P002L3_A143BarDisNum[0] ;
         A228BarUniMed = P002L3_A228BarUniMed[0] ;
         A125BarAncAca1 = P002L3_A125BarAncAca1[0] ;
         A1909BarGraAca = P002L3_A1909BarGraAca[0] ;
         A864BarPes = P002L3_A864BarPes[0] ;
         A211BarRdt = P002L3_A211BarRdt[0] ;
         A184BarMtr = P002L3_A184BarMtr[0] ;
         A166BarKgm = P002L3_A166BarKgm[0] ;
         A199BarPie1 = P002L3_A199BarPie1[0] ;
         A365DisDes = P002L3_A365DisDes[0] ;
         A898BarPieNDes = P002L3_A898BarPieNDes[0] ;
         A279CliNom = P002L3_A279CliNom[0] ;
         A184BarMtr = P002L3_A184BarMtr[0] ;
         A166BarKgm = P002L3_A166BarKgm[0] ;
         A199BarPie1 = P002L3_A199BarPie1[0] ;
         A898BarPieNDes = P002L3_A898BarPieNDes[0] ;
         A13694BarHdr = GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0") + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + GXutil.padl( A130BarCodPar, (short)(1), " ") ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Emprcod( A396EmprCod );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barcod( A129BarCod );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barcodreo( A132BarCodReo );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barcodpar( A130BarCodPar );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Clinom( A279CliNom );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Clicod( A252CliCod );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Discod( A361DisCod );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Disdes( A365DisDes );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barser( A212BarSer );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barserdsc( A1652BarSerDsc );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Bartipart( A217BarTipArt );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barcolnum( A136BarColNum );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barcolnom( A135BarColNom );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barnomcli( A1234BarNomCli );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Bartipcol( A218BarTipCol );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barfecgen( A159BarFecGen );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Bardisnum( A143BarDisNum );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barunimed( A228BarUniMed );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barancaca1( A125BarAncAca1 );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barmtr( A184BarMtr );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barkgm( A166BarKgm );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barpie( A198BarPie );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Bargraaca( A1909BarGraAca );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barpes( A864BarPes );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barrdt( A211BarRdt );
         Gxm1sdt_hdr.setgxTv_SdtSDT_Hdr_Barhdr( A13694BarHdr );
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = dp_sdt_hdr.this.Gxm1sdt_hdr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1sdt_hdr = new app.expedicionesautomatizadas.SdtSDT_Hdr(remoteHandle, context);
      scmdbuf = "" ;
      P002L3_A396EmprCod = new String[] {""} ;
      P002L3_A279CliNom = new String[] {""} ;
      P002L3_A252CliCod = new int[1] ;
      P002L3_n252CliCod = new boolean[] {false} ;
      P002L3_A361DisCod = new int[1] ;
      P002L3_A212BarSer = new String[] {""} ;
      P002L3_A1652BarSerDsc = new String[] {""} ;
      P002L3_A217BarTipArt = new short[1] ;
      P002L3_n217BarTipArt = new boolean[] {false} ;
      P002L3_A136BarColNum = new int[1] ;
      P002L3_A135BarColNom = new String[] {""} ;
      P002L3_A1234BarNomCli = new String[] {""} ;
      P002L3_A218BarTipCol = new byte[1] ;
      P002L3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P002L3_A143BarDisNum = new String[] {""} ;
      P002L3_A228BarUniMed = new String[] {""} ;
      P002L3_A125BarAncAca1 = new short[1] ;
      P002L3_A1909BarGraAca = new short[1] ;
      P002L3_A864BarPes = new short[1] ;
      P002L3_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002L3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002L3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002L3_A129BarCod = new int[1] ;
      P002L3_A132BarCodReo = new byte[1] ;
      P002L3_A130BarCodPar = new String[] {""} ;
      P002L3_A199BarPie1 = new short[1] ;
      P002L3_A365DisDes = new String[] {""} ;
      P002L3_A898BarPieNDes = new int[1] ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      A228BarUniMed = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A13694BarHdr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.dp_sdt_hdr__default(),
         new Object[] {
             new Object[] {
            P002L3_A396EmprCod, P002L3_A279CliNom, P002L3_A252CliCod, P002L3_n252CliCod, P002L3_A361DisCod, P002L3_A212BarSer, P002L3_A1652BarSerDsc, P002L3_A217BarTipArt, P002L3_n217BarTipArt, P002L3_A136BarColNum,
            P002L3_A135BarColNom, P002L3_A1234BarNomCli, P002L3_A218BarTipCol, P002L3_A159BarFecGen, P002L3_A143BarDisNum, P002L3_A228BarUniMed, P002L3_A125BarAncAca1, P002L3_A1909BarGraAca, P002L3_A864BarPes, P002L3_A211BarRdt,
            P002L3_A184BarMtr, P002L3_A166BarKgm, P002L3_A129BarCod, P002L3_A132BarCodReo, P002L3_A130BarCodPar, P002L3_A199BarPie1, P002L3_A365DisDes, P002L3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private short A217BarTipArt ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A864BarPes ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A228BarUniMed ;
   private String A365DisDes ;
   private String A13694BarHdr ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private app.expedicionesautomatizadas.SdtSDT_Hdr[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P002L3_A396EmprCod ;
   private String[] P002L3_A279CliNom ;
   private int[] P002L3_A252CliCod ;
   private boolean[] P002L3_n252CliCod ;
   private int[] P002L3_A361DisCod ;
   private String[] P002L3_A212BarSer ;
   private String[] P002L3_A1652BarSerDsc ;
   private short[] P002L3_A217BarTipArt ;
   private boolean[] P002L3_n217BarTipArt ;
   private int[] P002L3_A136BarColNum ;
   private String[] P002L3_A135BarColNom ;
   private String[] P002L3_A1234BarNomCli ;
   private byte[] P002L3_A218BarTipCol ;
   private java.util.Date[] P002L3_A159BarFecGen ;
   private String[] P002L3_A143BarDisNum ;
   private String[] P002L3_A228BarUniMed ;
   private short[] P002L3_A125BarAncAca1 ;
   private short[] P002L3_A1909BarGraAca ;
   private short[] P002L3_A864BarPes ;
   private java.math.BigDecimal[] P002L3_A211BarRdt ;
   private java.math.BigDecimal[] P002L3_A184BarMtr ;
   private java.math.BigDecimal[] P002L3_A166BarKgm ;
   private int[] P002L3_A129BarCod ;
   private byte[] P002L3_A132BarCodReo ;
   private String[] P002L3_A130BarCodPar ;
   private short[] P002L3_A199BarPie1 ;
   private String[] P002L3_A365DisDes ;
   private int[] P002L3_A898BarPieNDes ;
   private app.expedicionesautomatizadas.SdtSDT_Hdr Gxm1sdt_hdr ;
}

final  class dp_sdt_hdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002L3", "SELECT T1.EmprCod, T2.CliNom, T1.CliCod, T1.DisCod, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNum, T1.BarColNom, T1.BarNomCli, T1.BarTipCol, T1.BarFecGen, T1.BarDisNum, T1.BarUniMed, T1.BarAncAca1, T1.BarGraAca, T1.BarPes, T1.BarRdt, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((int[]) buf[27])[0] = rslt.getInt(26);
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
      }
   }

}

