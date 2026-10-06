package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtofor extends GXProcedure
{
   public pmtofor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtofor.class ), "" );
   }

   public pmtofor( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pmtofor.this.aP3 = new String[] {""};
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
      pmtofor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtofor.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmtofor.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmtofor.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00OD3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A140BarCosAny = P00OD3_A140BarCosAny[0] ;
         A141BarCosPro = P00OD3_A141BarCosPro[0] ;
         A252CliCod = P00OD3_A252CliCod[0] ;
         n252CliCod = P00OD3_n252CliCod[0] ;
         A212BarSer = P00OD3_A212BarSer[0] ;
         A135BarColNom = P00OD3_A135BarColNom[0] ;
         A136BarColNum = P00OD3_A136BarColNum[0] ;
         A218BarTipCol = P00OD3_A218BarTipCol[0] ;
         A166BarKgm = P00OD3_A166BarKgm[0] ;
         n166BarKgm = P00OD3_n166BarKgm[0] ;
         A166BarKgm = P00OD3_A166BarKgm[0] ;
         n166BarKgm = P00OD3_n166BarKgm[0] ;
         AV15BarCostot = A141BarCosPro.add(A140BarCosAny) ;
         AV16BarCosKg = GXutil.roundDecimal( AV15BarCostot.divide(A166BarKgm, 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.wjLoc = formatLink("app.tmtofor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A218BarTipCol,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV15BarCostot)),GXutil.URLEncode(DecimalUtil.decToString(AV16BarCosKg))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","BarCosTot","BarCosKil"})  ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtofor.this.A396EmprCod;
      this.aP1[0] = pmtofor.this.A129BarCod;
      this.aP2[0] = pmtofor.this.A132BarCodReo;
      this.aP3[0] = pmtofor.this.A130BarCodPar;
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
      P00OD3_A396EmprCod = new String[] {""} ;
      P00OD3_A129BarCod = new int[1] ;
      P00OD3_A132BarCodReo = new byte[1] ;
      P00OD3_A130BarCodPar = new String[] {""} ;
      P00OD3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OD3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OD3_A252CliCod = new int[1] ;
      P00OD3_n252CliCod = new boolean[] {false} ;
      P00OD3_A212BarSer = new String[] {""} ;
      P00OD3_A135BarColNom = new String[] {""} ;
      P00OD3_A136BarColNum = new int[1] ;
      P00OD3_A218BarTipCol = new byte[1] ;
      P00OD3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OD3_n166BarKgm = new boolean[] {false} ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV15BarCostot = DecimalUtil.ZERO ;
      AV16BarCosKg = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtofor__default(),
         new Object[] {
             new Object[] {
            P00OD3_A396EmprCod, P00OD3_A129BarCod, P00OD3_A132BarCodReo, P00OD3_A130BarCodPar, P00OD3_A140BarCosAny, P00OD3_A141BarCosPro, P00OD3_A252CliCod, P00OD3_n252CliCod, P00OD3_A212BarSer, P00OD3_A135BarColNom,
            P00OD3_A136BarColNum, P00OD3_A218BarTipCol, P00OD3_A166BarKgm, P00OD3_n166BarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV15BarCostot ;
   private java.math.BigDecimal AV16BarCosKg ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00OD3_A396EmprCod ;
   private int[] P00OD3_A129BarCod ;
   private byte[] P00OD3_A132BarCodReo ;
   private String[] P00OD3_A130BarCodPar ;
   private java.math.BigDecimal[] P00OD3_A140BarCosAny ;
   private java.math.BigDecimal[] P00OD3_A141BarCosPro ;
   private int[] P00OD3_A252CliCod ;
   private boolean[] P00OD3_n252CliCod ;
   private String[] P00OD3_A212BarSer ;
   private String[] P00OD3_A135BarColNom ;
   private int[] P00OD3_A136BarColNum ;
   private byte[] P00OD3_A218BarTipCol ;
   private java.math.BigDecimal[] P00OD3_A166BarKgm ;
   private boolean[] P00OD3_n166BarKgm ;
}

final  class pmtofor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OD3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarCosAny, T1.BarCosPro, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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

