package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrcolagr extends GXProcedure
{
   public pctrcolagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrcolagr.class ), "" );
   }

   public pctrcolagr( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pctrcolagr.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pctrcolagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrcolagr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrcolagr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrcolagr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pctrcolagr.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      GXv_char2[0] = AV20BuscarEmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      pctrcolagr.this.AV20BuscarEmprCod = GXv_char2[0] ;
      pctrcolagr.this.AV22EmprNom = GXv_char3[0] ;
      pctrcolagr.this.AV24UsurCod = GXv_char4[0] ;
      /* Using cursor P02KM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P02KM2_A120BarAgrEst[0] ;
         AV11Barcod = A129BarCod ;
         AV12Barcodpar = A130BarCodPar ;
         AV13Barcodreo = A132BarCodReo ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV11Barcod, AV13Barcodreo, AV12Barcodpar) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02KM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11Barcod), Byte.valueOf(AV13Barcodreo), AV12Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P02KM3_A252CliCod[0] ;
         n252CliCod = P02KM3_n252CliCod[0] ;
         A212BarSer = P02KM3_A212BarSer[0] ;
         A135BarColNom = P02KM3_A135BarColNom[0] ;
         A136BarColNum = P02KM3_A136BarColNum[0] ;
         A218BarTipCol = P02KM3_A218BarTipCol[0] ;
         A1234BarNomCli = P02KM3_A1234BarNomCli[0] ;
         A1235BarNumCli = P02KM3_A1235BarNumCli[0] ;
         A279CliNom = P02KM3_A279CliNom[0] ;
         A1652BarSerDsc = P02KM3_A1652BarSerDsc[0] ;
         A120BarAgrEst = P02KM3_A120BarAgrEst[0] ;
         A279CliNom = P02KM3_A279CliNom[0] ;
         AV21CliCod = A252CliCod ;
         AV18Barser = A212BarSer ;
         AV14Barcolnom = A135BarColNom ;
         AV15Barcolnum = A136BarColNum ;
         AV19BarTipCol = A218BarTipCol ;
         AV16Barnomcli = A1234BarNomCli ;
         AV17Barnumcli = A1235BarNumCli ;
         if ( ! ( GXutil.strcmp("NE"+GXutil.trim( AV24UsurCod), GXutil.trim( AV23Station)) == 0 ) )
         {
         }
         else
         {
            AV10CliNom = A279CliNom ;
            AV9BarSerDsc = A1652BarSerDsc ;
            AV8BarAgrEst = A120BarAgrEst ;
            callWebObject(formatLink("app.webwchgcolor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV12Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV21CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10CliNom)),GXutil.URLEncode(GXutil.rtrim(AV18Barser)),GXutil.URLEncode(GXutil.rtrim(AV9BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(AV14Barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV15Barcolnum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV16Barnomcli)),GXutil.URLEncode(GXutil.ltrimstr(AV17Barnumcli,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarTipCol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarAgrEst)),GXutil.URLEncode(GXutil.ltrimstr(AV25FlagCambios,1,0))}, new String[] {"EmprCod","Barcod","barcodreo","barcodpar","clicod","CliNom","Barser","BarSerdsc","Barcolnomout","Barcolnumout","barnomcliout","Barnumcliout","BarTipcolOut","BarAGrEst","FlagCambios"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrcolagr.this.A396EmprCod;
      this.aP1[0] = pctrcolagr.this.A129BarCod;
      this.aP2[0] = pctrcolagr.this.A132BarCodReo;
      this.aP3[0] = pctrcolagr.this.A130BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23Station = "" ;
      GXt_char1 = "" ;
      AV20BuscarEmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV22EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV24UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P02KM2_A396EmprCod = new String[] {""} ;
      P02KM2_A129BarCod = new int[1] ;
      P02KM2_A132BarCodReo = new byte[1] ;
      P02KM2_A130BarCodPar = new String[] {""} ;
      P02KM2_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      AV12Barcodpar = "" ;
      P02KM3_A396EmprCod = new String[] {""} ;
      P02KM3_A130BarCodPar = new String[] {""} ;
      P02KM3_A132BarCodReo = new byte[1] ;
      P02KM3_A129BarCod = new int[1] ;
      P02KM3_A252CliCod = new int[1] ;
      P02KM3_n252CliCod = new boolean[] {false} ;
      P02KM3_A212BarSer = new String[] {""} ;
      P02KM3_A135BarColNom = new String[] {""} ;
      P02KM3_A136BarColNum = new int[1] ;
      P02KM3_A218BarTipCol = new byte[1] ;
      P02KM3_A1234BarNomCli = new String[] {""} ;
      P02KM3_A1235BarNumCli = new int[1] ;
      P02KM3_A279CliNom = new String[] {""} ;
      P02KM3_A1652BarSerDsc = new String[] {""} ;
      P02KM3_A120BarAgrEst = new String[] {""} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      AV18Barser = "" ;
      AV14Barcolnom = "" ;
      AV16Barnomcli = "" ;
      AV10CliNom = "" ;
      AV9BarSerDsc = "" ;
      AV8BarAgrEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrcolagr__default(),
         new Object[] {
             new Object[] {
            P02KM2_A396EmprCod, P02KM2_A129BarCod, P02KM2_A132BarCodReo, P02KM2_A130BarCodPar, P02KM2_A120BarAgrEst
            }
            , new Object[] {
            P02KM3_A396EmprCod, P02KM3_A130BarCodPar, P02KM3_A132BarCodReo, P02KM3_A129BarCod, P02KM3_A252CliCod, P02KM3_n252CliCod, P02KM3_A212BarSer, P02KM3_A135BarColNom, P02KM3_A136BarColNum, P02KM3_A218BarTipCol,
            P02KM3_A1234BarNomCli, P02KM3_A1235BarNumCli, P02KM3_A279CliNom, P02KM3_A1652BarSerDsc, P02KM3_A120BarAgrEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13Barcodreo ;
   private byte A218BarTipCol ;
   private byte AV19BarTipCol ;
   private byte AV25FlagCambios ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11Barcod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV21CliCod ;
   private int AV15Barcolnum ;
   private int AV17Barnumcli ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV23Station ;
   private String GXt_char1 ;
   private String AV20BuscarEmprCod ;
   private String GXv_char2[] ;
   private String AV22EmprNom ;
   private String GXv_char3[] ;
   private String AV24UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String AV12Barcodpar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String AV18Barser ;
   private String AV14Barcolnom ;
   private String AV16Barnomcli ;
   private String AV10CliNom ;
   private String AV9BarSerDsc ;
   private String AV8BarAgrEst ;
   private boolean n252CliCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02KM2_A396EmprCod ;
   private int[] P02KM2_A129BarCod ;
   private byte[] P02KM2_A132BarCodReo ;
   private String[] P02KM2_A130BarCodPar ;
   private String[] P02KM2_A120BarAgrEst ;
   private String[] P02KM3_A396EmprCod ;
   private String[] P02KM3_A130BarCodPar ;
   private byte[] P02KM3_A132BarCodReo ;
   private int[] P02KM3_A129BarCod ;
   private int[] P02KM3_A252CliCod ;
   private boolean[] P02KM3_n252CliCod ;
   private String[] P02KM3_A212BarSer ;
   private String[] P02KM3_A135BarColNom ;
   private int[] P02KM3_A136BarColNum ;
   private byte[] P02KM3_A218BarTipCol ;
   private String[] P02KM3_A1234BarNomCli ;
   private int[] P02KM3_A1235BarNumCli ;
   private String[] P02KM3_A279CliNom ;
   private String[] P02KM3_A1652BarSerDsc ;
   private String[] P02KM3_A120BarAgrEst ;
}

final  class pctrcolagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02KM2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02KM3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarNomCli, T1.BarNumCli, T2.CliNom, T1.BarSerDsc, T1.BarAgrEst FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

