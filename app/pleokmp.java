package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleokmp extends GXProcedure
{
   public pleokmp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleokmp.class ), "" );
   }

   public pleokmp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          short[] aP6 ,
                          java.math.BigDecimal[] aP7 ,
                          java.math.BigDecimal[] aP8 )
   {
      pleokmp.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 )
   {
      pleokmp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pleokmp.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pleokmp.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pleokmp.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pleokmp.this.AV9Kilos = aP4[0];
      this.aP4 = aP4;
      pleokmp.this.AV8Metros = aP5[0];
      this.aP5 = aP5;
      pleokmp.this.AV10Piezas = aP6[0];
      this.aP6 = aP6;
      pleokmp.this.AV12KilosLan = aP7[0];
      this.aP7 = aP7;
      pleokmp.this.AV11MetrosLan = aP8[0];
      this.aP8 = aP8;
      pleokmp.this.AV13PiezasLan = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00HT3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A166BarKgm = P00HT3_A166BarKgm[0] ;
         A184BarMtr = P00HT3_A184BarMtr[0] ;
         A186BarMtrLan = P00HT3_A186BarMtrLan[0] ;
         A168BarKgmLan = P00HT3_A168BarKgmLan[0] ;
         A199BarPie1 = P00HT3_A199BarPie1[0] ;
         A365DisDes = P00HT3_A365DisDes[0] ;
         A898BarPieNDes = P00HT3_A898BarPieNDes[0] ;
         A166BarKgm = P00HT3_A166BarKgm[0] ;
         A184BarMtr = P00HT3_A184BarMtr[0] ;
         A186BarMtrLan = P00HT3_A186BarMtrLan[0] ;
         A168BarKgmLan = P00HT3_A168BarKgmLan[0] ;
         A199BarPie1 = P00HT3_A199BarPie1[0] ;
         A898BarPieNDes = P00HT3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV9Kilos = A166BarKgm ;
         AV8Metros = A184BarMtr ;
         AV10Piezas = (short)(A198BarPie) ;
         AV11MetrosLan = A186BarMtrLan ;
         AV12KilosLan = A168BarKgmLan ;
         /* Using cursor P00HT4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1271BarPieLzd = P00HT4_A1271BarPieLzd[0] ;
            A200BarPieCod = P00HT4_A200BarPieCod[0] ;
            AV13PiezasLan = A1271BarPieLzd ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleokmp.this.A396EmprCod;
      this.aP1[0] = pleokmp.this.A129BarCod;
      this.aP2[0] = pleokmp.this.A132BarCodReo;
      this.aP3[0] = pleokmp.this.A130BarCodPar;
      this.aP4[0] = pleokmp.this.AV9Kilos;
      this.aP5[0] = pleokmp.this.AV8Metros;
      this.aP6[0] = pleokmp.this.AV10Piezas;
      this.aP7[0] = pleokmp.this.AV12KilosLan;
      this.aP8[0] = pleokmp.this.AV11MetrosLan;
      this.aP9[0] = pleokmp.this.AV13PiezasLan;
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
      P00HT3_A396EmprCod = new String[] {""} ;
      P00HT3_A129BarCod = new int[1] ;
      P00HT3_A132BarCodReo = new byte[1] ;
      P00HT3_A130BarCodPar = new String[] {""} ;
      P00HT3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HT3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HT3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HT3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HT3_A199BarPie1 = new short[1] ;
      P00HT3_A365DisDes = new String[] {""} ;
      P00HT3_A898BarPieNDes = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P00HT4_A396EmprCod = new String[] {""} ;
      P00HT4_A129BarCod = new int[1] ;
      P00HT4_A132BarCodReo = new byte[1] ;
      P00HT4_A130BarCodPar = new String[] {""} ;
      P00HT4_A1271BarPieLzd = new int[1] ;
      P00HT4_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pleokmp__default(),
         new Object[] {
             new Object[] {
            P00HT3_A396EmprCod, P00HT3_A129BarCod, P00HT3_A132BarCodReo, P00HT3_A130BarCodPar, P00HT3_A166BarKgm, P00HT3_A184BarMtr, P00HT3_A186BarMtrLan, P00HT3_A168BarKgmLan, P00HT3_A199BarPie1, P00HT3_A365DisDes,
            P00HT3_A898BarPieNDes
            }
            , new Object[] {
            P00HT4_A396EmprCod, P00HT4_A129BarCod, P00HT4_A132BarCodReo, P00HT4_A130BarCodPar, P00HT4_A1271BarPieLzd, P00HT4_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV10Piezas ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV13PiezasLan ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A1271BarPieLzd ;
   private java.math.BigDecimal AV9Kilos ;
   private java.math.BigDecimal AV8Metros ;
   private java.math.BigDecimal AV12KilosLan ;
   private java.math.BigDecimal AV11MetrosLan ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal A168BarKgmLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String A200BarPieCod ;
   private int[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00HT3_A396EmprCod ;
   private int[] P00HT3_A129BarCod ;
   private byte[] P00HT3_A132BarCodReo ;
   private String[] P00HT3_A130BarCodPar ;
   private java.math.BigDecimal[] P00HT3_A166BarKgm ;
   private java.math.BigDecimal[] P00HT3_A184BarMtr ;
   private java.math.BigDecimal[] P00HT3_A186BarMtrLan ;
   private java.math.BigDecimal[] P00HT3_A168BarKgmLan ;
   private short[] P00HT3_A199BarPie1 ;
   private String[] P00HT3_A365DisDes ;
   private int[] P00HT3_A898BarPieNDes ;
   private String[] P00HT4_A396EmprCod ;
   private int[] P00HT4_A129BarCod ;
   private byte[] P00HT4_A132BarCodReo ;
   private String[] P00HT4_A130BarCodPar ;
   private int[] P00HT4_A1271BarPieLzd ;
   private String[] P00HT4_A200BarPieCod ;
}

final  class pleokmp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HT3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarMetLan) AS BarMtrLan, SUM(BarKilLan) AS BarKgmLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00HT4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieLzd, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
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

