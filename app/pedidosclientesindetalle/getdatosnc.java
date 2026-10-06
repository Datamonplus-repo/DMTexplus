package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getdatosnc extends GXProcedure
{
   public getdatosnc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getdatosnc.class ), "" );
   }

   public getdatosnc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          java.math.BigDecimal[] aP6 ,
                          java.math.BigDecimal[] aP7 ,
                          int[] aP8 ,
                          byte[] aP9 )
   {
      getdatosnc.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        byte[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 ,
                             int[] aP10 )
   {
      getdatosnc.this.A396EmprCod = aP0;
      getdatosnc.this.A129BarCod = aP1;
      getdatosnc.this.A132BarCodReo = aP2;
      getdatosnc.this.A130BarCodPar = aP3;
      getdatosnc.this.aP4 = aP4;
      getdatosnc.this.aP5 = aP5;
      getdatosnc.this.aP6 = aP6;
      getdatosnc.this.aP7 = aP7;
      getdatosnc.this.aP8 = aP8;
      getdatosnc.this.aP9 = aP9;
      getdatosnc.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12barkgr = (short)(0) ;
      AV8barmtr = DecimalUtil.ZERO ;
      AV9Barpie = 0 ;
      AV13barSit = (byte)(0) ;
      AV10Barcosany = DecimalUtil.ZERO ;
      AV11Barcospro = DecimalUtil.ZERO ;
      AV15discod = 0 ;
      /* Using cursor P0ASO3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P0ASO3_A213BarSit[0] ;
         A140BarCosAny = P0ASO3_A140BarCosAny[0] ;
         A141BarCosPro = P0ASO3_A141BarCosPro[0] ;
         A361DisCod = P0ASO3_A361DisCod[0] ;
         A166BarKgm = P0ASO3_A166BarKgm[0] ;
         A184BarMtr = P0ASO3_A184BarMtr[0] ;
         A199BarPie1 = P0ASO3_A199BarPie1[0] ;
         A365DisDes = P0ASO3_A365DisDes[0] ;
         A898BarPieNDes = P0ASO3_A898BarPieNDes[0] ;
         A166BarKgm = P0ASO3_A166BarKgm[0] ;
         A184BarMtr = P0ASO3_A184BarMtr[0] ;
         A199BarPie1 = P0ASO3_A199BarPie1[0] ;
         A898BarPieNDes = P0ASO3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV14BarKgm = A166BarKgm ;
         AV8barmtr = A184BarMtr ;
         AV9Barpie = A198BarPie ;
         AV13barSit = A213BarSit ;
         AV10Barcosany = A140BarCosAny ;
         AV11Barcospro = A141BarCosPro ;
         AV15discod = A361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = getdatosnc.this.AV10Barcosany;
      this.aP5[0] = getdatosnc.this.AV11Barcospro;
      this.aP6[0] = getdatosnc.this.AV14BarKgm;
      this.aP7[0] = getdatosnc.this.AV8barmtr;
      this.aP8[0] = getdatosnc.this.AV9Barpie;
      this.aP9[0] = getdatosnc.this.AV13barSit;
      this.aP10[0] = getdatosnc.this.AV15discod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Barcosany = DecimalUtil.ZERO ;
      AV11Barcospro = DecimalUtil.ZERO ;
      AV14BarKgm = DecimalUtil.ZERO ;
      AV8barmtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0ASO3_A396EmprCod = new String[] {""} ;
      P0ASO3_A129BarCod = new int[1] ;
      P0ASO3_A132BarCodReo = new byte[1] ;
      P0ASO3_A130BarCodPar = new String[] {""} ;
      P0ASO3_A213BarSit = new byte[1] ;
      P0ASO3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASO3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASO3_A361DisCod = new int[1] ;
      P0ASO3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASO3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASO3_A199BarPie1 = new short[1] ;
      P0ASO3_A365DisDes = new String[] {""} ;
      P0ASO3_A898BarPieNDes = new int[1] ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.getdatosnc__default(),
         new Object[] {
             new Object[] {
            P0ASO3_A396EmprCod, P0ASO3_A129BarCod, P0ASO3_A132BarCodReo, P0ASO3_A130BarCodPar, P0ASO3_A213BarSit, P0ASO3_A140BarCosAny, P0ASO3_A141BarCosPro, P0ASO3_A361DisCod, P0ASO3_A166BarKgm, P0ASO3_A184BarMtr,
            P0ASO3_A199BarPie1, P0ASO3_A365DisDes, P0ASO3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13barSit ;
   private byte A213BarSit ;
   private short AV12barkgr ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Barpie ;
   private int AV15discod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal AV10Barcosany ;
   private java.math.BigDecimal AV11Barcospro ;
   private java.math.BigDecimal AV14BarKgm ;
   private java.math.BigDecimal AV8barmtr ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A365DisDes ;
   private int[] aP10 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private byte[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ASO3_A396EmprCod ;
   private int[] P0ASO3_A129BarCod ;
   private byte[] P0ASO3_A132BarCodReo ;
   private String[] P0ASO3_A130BarCodPar ;
   private byte[] P0ASO3_A213BarSit ;
   private java.math.BigDecimal[] P0ASO3_A140BarCosAny ;
   private java.math.BigDecimal[] P0ASO3_A141BarCosPro ;
   private int[] P0ASO3_A361DisCod ;
   private java.math.BigDecimal[] P0ASO3_A166BarKgm ;
   private java.math.BigDecimal[] P0ASO3_A184BarMtr ;
   private short[] P0ASO3_A199BarPie1 ;
   private String[] P0ASO3_A365DisDes ;
   private int[] P0ASO3_A898BarPieNDes ;
}

final  class getdatosnc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ASO3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSit, T1.BarCosAny, T1.BarCosPro, T1.DisCod, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
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

