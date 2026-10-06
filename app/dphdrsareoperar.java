package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dphdrsareoperar extends GXProcedure
{
   public dphdrsareoperar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dphdrsareoperar.class ), "" );
   }

   public dphdrsareoperar( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTHdrsaReoperar> executeUdp( String aP0 ,
                                                                java.util.Date aP1 ,
                                                                java.util.Date aP2 ,
                                                                String aP3 ,
                                                                String aP4 )
   {
      dphdrsareoperar.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTHdrsaReoperar>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXBaseCollection<app.SdtSDTHdrsaReoperar>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXBaseCollection<app.SdtSDTHdrsaReoperar>[] aP5 )
   {
      dphdrsareoperar.this.AV5Emprcod = aP0;
      dphdrsareoperar.this.AV6BarFecGen = aP1;
      dphdrsareoperar.this.AV7BarFecGen_To = aP2;
      dphdrsareoperar.this.AV8BarNHdr = aP3;
      dphdrsareoperar.this.AV9CliNom = aP4;
      dphdrsareoperar.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      lV8BarNHdr = GXutil.padr( GXutil.rtrim( AV8BarNHdr), 11, "%") ;
      lV9CliNom = GXutil.padr( GXutil.rtrim( AV9CliNom), 30, "%") ;
      /* Using cursor P000Y3 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6BarFecGen, AV7BarFecGen_To, lV8BarNHdr, AV8BarNHdr, lV9CliNom, AV9CliNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P000Y3_A213BarSit[0] ;
         A279CliNom = P000Y3_A279CliNom[0] ;
         A13696BarNHdr = P000Y3_A13696BarNHdr[0] ;
         A159BarFecGen = P000Y3_A159BarFecGen[0] ;
         A396EmprCod = P000Y3_A396EmprCod[0] ;
         A252CliCod = P000Y3_A252CliCod[0] ;
         n252CliCod = P000Y3_n252CliCod[0] ;
         A212BarSer = P000Y3_A212BarSer[0] ;
         A1652BarSerDsc = P000Y3_A1652BarSerDsc[0] ;
         A217BarTipArt = P000Y3_A217BarTipArt[0] ;
         n217BarTipArt = P000Y3_n217BarTipArt[0] ;
         A135BarColNom = P000Y3_A135BarColNom[0] ;
         A136BarColNum = P000Y3_A136BarColNum[0] ;
         A218BarTipCol = P000Y3_A218BarTipCol[0] ;
         A1234BarNomCli = P000Y3_A1234BarNomCli[0] ;
         A120BarAgrEst = P000Y3_A120BarAgrEst[0] ;
         A228BarUniMed = P000Y3_A228BarUniMed[0] ;
         A361DisCod = P000Y3_A361DisCod[0] ;
         A141BarCosPro = P000Y3_A141BarCosPro[0] ;
         A140BarCosAny = P000Y3_A140BarCosAny[0] ;
         A129BarCod = P000Y3_A129BarCod[0] ;
         A132BarCodReo = P000Y3_A132BarCodReo[0] ;
         A130BarCodPar = P000Y3_A130BarCodPar[0] ;
         A166BarKgm = P000Y3_A166BarKgm[0] ;
         A184BarMtr = P000Y3_A184BarMtr[0] ;
         A199BarPie1 = P000Y3_A199BarPie1[0] ;
         A365DisDes = P000Y3_A365DisDes[0] ;
         A898BarPieNDes = P000Y3_A898BarPieNDes[0] ;
         A279CliNom = P000Y3_A279CliNom[0] ;
         A166BarKgm = P000Y3_A166BarKgm[0] ;
         A184BarMtr = P000Y3_A184BarMtr[0] ;
         A199BarPie1 = P000Y3_A199BarPie1[0] ;
         A898BarPieNDes = P000Y3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         Gxm1sdthdrsareoperar = (app.SdtSDTHdrsaReoperar)new app.SdtSDTHdrsaReoperar(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdthdrsareoperar, 0);
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barnhdr( A13696BarNHdr );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barfecgen( A159BarFecGen );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Clicod( A252CliCod );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Clinom( A279CliNom );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barser( A212BarSer );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barserdsc( A1652BarSerDsc );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Bartipart( A217BarTipArt );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char2) ;
         dphdrsareoperar.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Tipartdsc( GXt_char1 );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barcolnom( A135BarColNom );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barcolnum( A136BarColNum );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Bartipcol( A218BarTipCol );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barnomcli( A1234BarNomCli );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barkgm( A166BarKgm );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barmtr( A184BarMtr );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barpie( A198BarPie );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barsit( A213BarSit );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Baragrest( A120BarAgrEst );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barunimed( A228BarUniMed );
         GXt_int3 = (byte)(0) ;
         GXv_int4[0] = GXt_int3 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int4) ;
         dphdrsareoperar.this.GXt_int3 = GXv_int4[0] ;
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Rctinte( GXutil.toBoolean( GXt_int3) );
         GXt_int3 = (byte)(0) ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int4[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_int7[0] = GXt_int3 ;
         new app.phayrcacabado(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_int4, GXv_char6, GXv_int7) ;
         dphdrsareoperar.this.A396EmprCod = GXv_char2[0] ;
         dphdrsareoperar.this.A129BarCod = GXv_int5[0] ;
         dphdrsareoperar.this.A132BarCodReo = GXv_int4[0] ;
         dphdrsareoperar.this.A130BarCodPar = GXv_char6[0] ;
         dphdrsareoperar.this.GXt_int3 = GXv_int7[0] ;
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Rcacabado( GXutil.toBoolean( GXt_int3) );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barcod( A129BarCod );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barcodreo( A132BarCodReo );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barcodpar( A130BarCodPar );
         GXt_int3 = (byte)(0) ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int7[0] = GXt_int3 ;
         new app.ultimoreoperado(remoteHandle, context).execute( GXv_char6, GXv_int5, GXv_char2, GXv_int7) ;
         dphdrsareoperar.this.A396EmprCod = GXv_char6[0] ;
         dphdrsareoperar.this.A129BarCod = GXv_int5[0] ;
         dphdrsareoperar.this.A130BarCodPar = GXv_char2[0] ;
         dphdrsareoperar.this.GXt_int3 = GXv_int7[0] ;
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barconreo( GXt_int3 );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Discod( A361DisCod );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barcospro( A141BarCosPro );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Barcosany( A140BarCosAny );
         Gxm1sdthdrsareoperar.setgxTv_SdtSDTHdrsaReoperar_Disdes( A365DisDes );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dphdrsareoperar.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTHdrsaReoperar>(app.SdtSDTHdrsaReoperar.class, "SDTHdrsaReoperar", "TexplusNET", remoteHandle);
      lV8BarNHdr = "" ;
      lV9CliNom = "" ;
      scmdbuf = "" ;
      P000Y3_A213BarSit = new byte[1] ;
      P000Y3_A279CliNom = new String[] {""} ;
      P000Y3_A13696BarNHdr = new String[] {""} ;
      P000Y3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P000Y3_A396EmprCod = new String[] {""} ;
      P000Y3_A252CliCod = new int[1] ;
      P000Y3_n252CliCod = new boolean[] {false} ;
      P000Y3_A212BarSer = new String[] {""} ;
      P000Y3_A1652BarSerDsc = new String[] {""} ;
      P000Y3_A217BarTipArt = new short[1] ;
      P000Y3_n217BarTipArt = new boolean[] {false} ;
      P000Y3_A135BarColNom = new String[] {""} ;
      P000Y3_A136BarColNum = new int[1] ;
      P000Y3_A218BarTipCol = new byte[1] ;
      P000Y3_A1234BarNomCli = new String[] {""} ;
      P000Y3_A120BarAgrEst = new String[] {""} ;
      P000Y3_A228BarUniMed = new String[] {""} ;
      P000Y3_A361DisCod = new int[1] ;
      P000Y3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000Y3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000Y3_A129BarCod = new int[1] ;
      P000Y3_A132BarCodReo = new byte[1] ;
      P000Y3_A130BarCodPar = new String[] {""} ;
      P000Y3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000Y3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000Y3_A199BarPie1 = new short[1] ;
      P000Y3_A365DisDes = new String[] {""} ;
      P000Y3_A898BarPieNDes = new int[1] ;
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A120BarAgrEst = "" ;
      A228BarUniMed = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      Gxm1sdthdrsareoperar = new app.SdtSDTHdrsaReoperar(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_int4 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dphdrsareoperar__default(),
         new Object[] {
             new Object[] {
            P000Y3_A213BarSit, P000Y3_A279CliNom, P000Y3_A13696BarNHdr, P000Y3_A159BarFecGen, P000Y3_A396EmprCod, P000Y3_A252CliCod, P000Y3_n252CliCod, P000Y3_A212BarSer, P000Y3_A1652BarSerDsc, P000Y3_A217BarTipArt,
            P000Y3_n217BarTipArt, P000Y3_A135BarColNom, P000Y3_A136BarColNum, P000Y3_A218BarTipCol, P000Y3_A1234BarNomCli, P000Y3_A120BarAgrEst, P000Y3_A228BarUniMed, P000Y3_A361DisCod, P000Y3_A141BarCosPro, P000Y3_A140BarCosAny,
            P000Y3_A129BarCod, P000Y3_A132BarCodReo, P000Y3_A130BarCodPar, P000Y3_A166BarKgm, P000Y3_A184BarMtr, P000Y3_A199BarPie1, P000Y3_A365DisDes, P000Y3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int4[] ;
   private byte GXt_int3 ;
   private byte GXv_int7[] ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GXv_int5[] ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV5Emprcod ;
   private String AV8BarNHdr ;
   private String AV9CliNom ;
   private String lV8BarNHdr ;
   private String lV9CliNom ;
   private String scmdbuf ;
   private String A279CliNom ;
   private String A13696BarNHdr ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A120BarAgrEst ;
   private String A228BarUniMed ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String GXt_char1 ;
   private String GXv_char6[] ;
   private String GXv_char2[] ;
   private java.util.Date AV6BarFecGen ;
   private java.util.Date AV7BarFecGen_To ;
   private java.util.Date A159BarFecGen ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P000Y3_A213BarSit ;
   private String[] P000Y3_A279CliNom ;
   private String[] P000Y3_A13696BarNHdr ;
   private java.util.Date[] P000Y3_A159BarFecGen ;
   private String[] P000Y3_A396EmprCod ;
   private int[] P000Y3_A252CliCod ;
   private boolean[] P000Y3_n252CliCod ;
   private String[] P000Y3_A212BarSer ;
   private String[] P000Y3_A1652BarSerDsc ;
   private short[] P000Y3_A217BarTipArt ;
   private boolean[] P000Y3_n217BarTipArt ;
   private String[] P000Y3_A135BarColNom ;
   private int[] P000Y3_A136BarColNum ;
   private byte[] P000Y3_A218BarTipCol ;
   private String[] P000Y3_A1234BarNomCli ;
   private String[] P000Y3_A120BarAgrEst ;
   private String[] P000Y3_A228BarUniMed ;
   private int[] P000Y3_A361DisCod ;
   private java.math.BigDecimal[] P000Y3_A141BarCosPro ;
   private java.math.BigDecimal[] P000Y3_A140BarCosAny ;
   private int[] P000Y3_A129BarCod ;
   private byte[] P000Y3_A132BarCodReo ;
   private String[] P000Y3_A130BarCodPar ;
   private java.math.BigDecimal[] P000Y3_A166BarKgm ;
   private java.math.BigDecimal[] P000Y3_A184BarMtr ;
   private short[] P000Y3_A199BarPie1 ;
   private String[] P000Y3_A365DisDes ;
   private int[] P000Y3_A898BarPieNDes ;
   private GXBaseCollection<app.SdtSDTHdrsaReoperar> Gxm2rootcol ;
   private app.SdtSDTHdrsaReoperar Gxm1sdthdrsareoperar ;
}

final  class dphdrsareoperar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000Y3", "SELECT T1.BarSit, T2.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.BarFecGen, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarNomCli, T1.BarAgrEst, T1.BarUniMed, T1.DisCod, T1.BarCosPro, T1.BarCosAny, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.BarFecGen >= ?) AND (T1.BarFecGen <= ?) AND (RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like '%' || ? or (rtrim(?) IS NULL)) AND (T2.CliNom like '%' || ? or (rtrim(?) IS NULL)) AND (T1.BarSit < 6) ORDER BY T1.EmprCod, T1.BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 11);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 13);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,2);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 11);
               stmt.setString(5, (String)parms[4], 11);
               stmt.setString(6, (String)parms[5], 30);
               stmt.setString(7, (String)parms[6], 30);
               return;
      }
   }

}

