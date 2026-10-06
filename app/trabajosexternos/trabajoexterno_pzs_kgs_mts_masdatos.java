package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabajoexterno_pzs_kgs_mts_masdatos extends GXProcedure
{
   public trabajoexterno_pzs_kgs_mts_masdatos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_pzs_kgs_mts_masdatos.class ), "" );
   }

   public trabajoexterno_pzs_kgs_mts_masdatos( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             String[] aP11 )
   {
      trabajoexterno_pzs_kgs_mts_masdatos.this.A396EmprCod = aP0;
      trabajoexterno_pzs_kgs_mts_masdatos.this.A129BarCod = aP1;
      trabajoexterno_pzs_kgs_mts_masdatos.this.A132BarCodReo = aP2;
      trabajoexterno_pzs_kgs_mts_masdatos.this.A130BarCodPar = aP3;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP4 = aP4;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP5 = aP5;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP6 = aP6;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP7 = aP7;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP8 = aP8;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP9 = aP9;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP10 = aP10;
      trabajoexterno_pzs_kgs_mts_masdatos.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Barcolnom = "" ;
      AV13Barkgm = DecimalUtil.ZERO ;
      AV14Barmtr = DecimalUtil.ZERO ;
      AV9barnomcli = "" ;
      AV12Barpie = 0 ;
      AV11Barser = "" ;
      AV10Clicod = 0 ;
      /* Using cursor P0ABQ3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A135BarColNom = P0ABQ3_A135BarColNom[0] ;
         A1234BarNomCli = P0ABQ3_A1234BarNomCli[0] ;
         A212BarSer = P0ABQ3_A212BarSer[0] ;
         A252CliCod = P0ABQ3_A252CliCod[0] ;
         n252CliCod = P0ABQ3_n252CliCod[0] ;
         A228BarUniMed = P0ABQ3_A228BarUniMed[0] ;
         A166BarKgm = P0ABQ3_A166BarKgm[0] ;
         A184BarMtr = P0ABQ3_A184BarMtr[0] ;
         A199BarPie1 = P0ABQ3_A199BarPie1[0] ;
         A365DisDes = P0ABQ3_A365DisDes[0] ;
         A898BarPieNDes = P0ABQ3_A898BarPieNDes[0] ;
         A166BarKgm = P0ABQ3_A166BarKgm[0] ;
         A184BarMtr = P0ABQ3_A184BarMtr[0] ;
         A199BarPie1 = P0ABQ3_A199BarPie1[0] ;
         A898BarPieNDes = P0ABQ3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV8Barcolnom = A135BarColNom ;
         AV13Barkgm = A166BarKgm ;
         AV14Barmtr = A184BarMtr ;
         AV9barnomcli = A1234BarNomCli ;
         AV12Barpie = A198BarPie ;
         AV11Barser = A212BarSer ;
         AV10Clicod = A252CliCod ;
         AV15barunimed = A228BarUniMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV8Barcolnom;
      this.aP5[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV9barnomcli;
      this.aP6[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV10Clicod;
      this.aP7[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV11Barser;
      this.aP8[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV12Barpie;
      this.aP9[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV13Barkgm;
      this.aP10[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV14Barmtr;
      this.aP11[0] = trabajoexterno_pzs_kgs_mts_masdatos.this.AV15barunimed;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Barcolnom = "" ;
      AV9barnomcli = "" ;
      AV11Barser = "" ;
      AV13Barkgm = DecimalUtil.ZERO ;
      AV14Barmtr = DecimalUtil.ZERO ;
      AV15barunimed = "" ;
      scmdbuf = "" ;
      P0ABQ3_A396EmprCod = new String[] {""} ;
      P0ABQ3_A129BarCod = new int[1] ;
      P0ABQ3_A132BarCodReo = new byte[1] ;
      P0ABQ3_A130BarCodPar = new String[] {""} ;
      P0ABQ3_A135BarColNom = new String[] {""} ;
      P0ABQ3_A1234BarNomCli = new String[] {""} ;
      P0ABQ3_A212BarSer = new String[] {""} ;
      P0ABQ3_A252CliCod = new int[1] ;
      P0ABQ3_n252CliCod = new boolean[] {false} ;
      P0ABQ3_A228BarUniMed = new String[] {""} ;
      P0ABQ3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABQ3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ABQ3_A199BarPie1 = new short[1] ;
      P0ABQ3_A365DisDes = new String[] {""} ;
      P0ABQ3_A898BarPieNDes = new int[1] ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A212BarSer = "" ;
      A228BarUniMed = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_pzs_kgs_mts_masdatos__default(),
         new Object[] {
             new Object[] {
            P0ABQ3_A396EmprCod, P0ABQ3_A129BarCod, P0ABQ3_A132BarCodReo, P0ABQ3_A130BarCodPar, P0ABQ3_A135BarColNom, P0ABQ3_A1234BarNomCli, P0ABQ3_A212BarSer, P0ABQ3_A252CliCod, P0ABQ3_n252CliCod, P0ABQ3_A228BarUniMed,
            P0ABQ3_A166BarKgm, P0ABQ3_A184BarMtr, P0ABQ3_A199BarPie1, P0ABQ3_A365DisDes, P0ABQ3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV10Clicod ;
   private int AV12Barpie ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal AV13Barkgm ;
   private java.math.BigDecimal AV14Barmtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Barcolnom ;
   private String AV9barnomcli ;
   private String AV11Barser ;
   private String AV15barunimed ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String A228BarUniMed ;
   private String A365DisDes ;
   private boolean n252CliCod ;
   private String[] aP11 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ABQ3_A396EmprCod ;
   private int[] P0ABQ3_A129BarCod ;
   private byte[] P0ABQ3_A132BarCodReo ;
   private String[] P0ABQ3_A130BarCodPar ;
   private String[] P0ABQ3_A135BarColNom ;
   private String[] P0ABQ3_A1234BarNomCli ;
   private String[] P0ABQ3_A212BarSer ;
   private int[] P0ABQ3_A252CliCod ;
   private boolean[] P0ABQ3_n252CliCod ;
   private String[] P0ABQ3_A228BarUniMed ;
   private java.math.BigDecimal[] P0ABQ3_A166BarKgm ;
   private java.math.BigDecimal[] P0ABQ3_A184BarMtr ;
   private short[] P0ABQ3_A199BarPie1 ;
   private String[] P0ABQ3_A365DisDes ;
   private int[] P0ABQ3_A898BarPieNDes ;
}

final  class trabajoexterno_pzs_kgs_mts_masdatos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ABQ3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarColNom, T1.BarNomCli, T1.BarSer, T1.CliCod, T1.BarUniMed, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((int[]) buf[14])[0] = rslt.getInt(14);
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

