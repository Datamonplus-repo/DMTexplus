package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalintf extends GXProcedure
{
   public pcalintf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalintf.class ), "" );
   }

   public pcalintf( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           int[] aP6 )
   {
      pcalintf.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      pcalintf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalintf.this.AV28CliCod = aP1[0];
      this.aP1 = aP1;
      pcalintf.this.AV29ForSer = aP2[0];
      this.aP2 = aP2;
      pcalintf.this.AV30ForColNom = aP3[0];
      this.aP3 = aP3;
      pcalintf.this.AV31ForColNum = aP4[0];
      this.aP4 = aP4;
      pcalintf.this.AV32TipColCod = aP5[0];
      this.aP5 = aP5;
      pcalintf.this.AV27ForNumCol = aP6[0];
      this.aP6 = aP6;
      pcalintf.this.AV25IntCodF = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24CosKgmF = DecimalUtil.doubleToDec(0) ;
      AV21ForCanSum = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01R64 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV27ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P01R64_A486ForNumCol[0] ;
         A5361ForCanSum = P01R64_A5361ForCanSum[0] ;
         n5361ForCanSum = P01R64_n5361ForCanSum[0] ;
         A5166CosKgmF = P01R64_A5166CosKgmF[0] ;
         n5166CosKgmF = P01R64_n5166CosKgmF[0] ;
         A5361ForCanSum = P01R64_A5361ForCanSum[0] ;
         n5361ForCanSum = P01R64_n5361ForCanSum[0] ;
         A5166CosKgmF = P01R64_A5166CosKgmF[0] ;
         n5166CosKgmF = P01R64_n5166CosKgmF[0] ;
         AV21ForCanSum = A5361ForCanSum ;
         AV24CosKgmF = A5166CosKgmF ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV25IntCodF = (byte)(0) ;
      AV26IntDscF = GXutil.space( (short)(30)) ;
      /* Using cursor P01R65 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(AV32TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5362IntCodF = P01R65_A5362IntCodF[0] ;
         A5434Tip_ColC = P01R65_A5434Tip_ColC[0] ;
         A5365IntLabFf = P01R65_A5365IntLabFf[0] ;
         n5365IntLabFf = P01R65_n5365IntLabFf[0] ;
         A5364IntLabFi = P01R65_A5364IntLabFi[0] ;
         n5364IntLabFi = P01R65_n5364IntLabFi[0] ;
         A5363IntDscF = P01R65_A5363IntDscF[0] ;
         n5363IntDscF = P01R65_n5363IntDscF[0] ;
         A5363IntDscF = P01R65_A5363IntDscF[0] ;
         n5363IntDscF = P01R65_n5363IntDscF[0] ;
         if ( ( DecimalUtil.compareTo(A5364IntLabFi, AV24CosKgmF) <= 0 ) && ( DecimalUtil.compareTo(A5365IntLabFf, AV24CosKgmF) >= 0 ) )
         {
            AV25IntCodF = A5362IntCodF ;
            AV26IntDscF = A5363IntDscF ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalintf.this.A396EmprCod;
      this.aP1[0] = pcalintf.this.AV28CliCod;
      this.aP2[0] = pcalintf.this.AV29ForSer;
      this.aP3[0] = pcalintf.this.AV30ForColNom;
      this.aP4[0] = pcalintf.this.AV31ForColNum;
      this.aP5[0] = pcalintf.this.AV32TipColCod;
      this.aP6[0] = pcalintf.this.AV27ForNumCol;
      this.aP7[0] = pcalintf.this.AV25IntCodF;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24CosKgmF = DecimalUtil.ZERO ;
      AV21ForCanSum = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01R64_A396EmprCod = new String[] {""} ;
      P01R64_A486ForNumCol = new int[1] ;
      P01R64_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R64_n5361ForCanSum = new boolean[] {false} ;
      P01R64_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R64_n5166CosKgmF = new boolean[] {false} ;
      A5361ForCanSum = DecimalUtil.ZERO ;
      A5166CosKgmF = DecimalUtil.ZERO ;
      AV26IntDscF = "" ;
      P01R65_A396EmprCod = new String[] {""} ;
      P01R65_A5362IntCodF = new byte[1] ;
      P01R65_A5434Tip_ColC = new byte[1] ;
      P01R65_A5365IntLabFf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R65_n5365IntLabFf = new boolean[] {false} ;
      P01R65_A5364IntLabFi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01R65_n5364IntLabFi = new boolean[] {false} ;
      P01R65_A5363IntDscF = new String[] {""} ;
      P01R65_n5363IntDscF = new boolean[] {false} ;
      A5365IntLabFf = DecimalUtil.ZERO ;
      A5364IntLabFi = DecimalUtil.ZERO ;
      A5363IntDscF = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalintf__default(),
         new Object[] {
             new Object[] {
            P01R64_A396EmprCod, P01R64_A486ForNumCol, P01R64_A5361ForCanSum, P01R64_n5361ForCanSum, P01R64_A5166CosKgmF, P01R64_n5166CosKgmF
            }
            , new Object[] {
            P01R65_A396EmprCod, P01R65_A5362IntCodF, P01R65_A5434Tip_ColC, P01R65_A5365IntLabFf, P01R65_n5365IntLabFf, P01R65_A5364IntLabFi, P01R65_n5364IntLabFi, P01R65_A5363IntDscF, P01R65_n5363IntDscF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32TipColCod ;
   private byte AV25IntCodF ;
   private byte A5362IntCodF ;
   private byte A5434Tip_ColC ;
   private short Gx_err ;
   private int AV28CliCod ;
   private int AV31ForColNum ;
   private int AV27ForNumCol ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV24CosKgmF ;
   private java.math.BigDecimal AV21ForCanSum ;
   private java.math.BigDecimal A5361ForCanSum ;
   private java.math.BigDecimal A5166CosKgmF ;
   private java.math.BigDecimal A5365IntLabFf ;
   private java.math.BigDecimal A5364IntLabFi ;
   private String A396EmprCod ;
   private String AV29ForSer ;
   private String AV30ForColNom ;
   private String scmdbuf ;
   private String AV26IntDscF ;
   private String A5363IntDscF ;
   private boolean n5361ForCanSum ;
   private boolean n5166CosKgmF ;
   private boolean n5365IntLabFf ;
   private boolean n5364IntLabFi ;
   private boolean n5363IntDscF ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01R64_A396EmprCod ;
   private int[] P01R64_A486ForNumCol ;
   private java.math.BigDecimal[] P01R64_A5361ForCanSum ;
   private boolean[] P01R64_n5361ForCanSum ;
   private java.math.BigDecimal[] P01R64_A5166CosKgmF ;
   private boolean[] P01R64_n5166CosKgmF ;
   private String[] P01R65_A396EmprCod ;
   private byte[] P01R65_A5362IntCodF ;
   private byte[] P01R65_A5434Tip_ColC ;
   private java.math.BigDecimal[] P01R65_A5365IntLabFf ;
   private boolean[] P01R65_n5365IntLabFf ;
   private java.math.BigDecimal[] P01R65_A5364IntLabFi ;
   private boolean[] P01R65_n5364IntLabFi ;
   private String[] P01R65_A5363IntDscF ;
   private boolean[] P01R65_n5363IntDscF ;
}

final  class pcalintf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01R64", "SELECT T1.EmprCod, T1.ForNumCol, COALESCE( T2.ForCanSum, 0) AS ForCanSum, COALESCE( T3.CosKgmF, 0) AS CosKgmF FROM ((TXPCDFORM T1 LEFT JOIN (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T2 ON T2.EmprCod = T1.EmprCod AND T2.ForNumCol = T1.ForNumCol) LEFT JOIN (SELECT SUM(( CAST(T6.ContNum * CAST(T4.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T5.PrdPreAct * CAST(T5.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T4.EmprCod, T4.ForNumCol FROM ((TXPLDFORM T4 INNER JOIN TXPPRODUC T5 ON T5.EmprCod = T4.EmprCod AND T5.PrdNum = T4.PrdNum) INNER JOIN TXPCDFORM T6 ON T6.EmprCod = T4.EmprCod AND T6.ForNumCol = T4.ForNumCol) GROUP BY T4.EmprCod, T4.ForNumCol ) T3 ON T3.EmprCod = T1.EmprCod AND T3.ForNumCol = T1.ForNumCol) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01R65", "SELECT T1.EmprCod, T1.IntCodF, T1.Tip_ColC, T1.IntLabFf, T1.IntLabFi, T2.IntDscF FROM (TXPCOLIN1 T1 INNER JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) WHERE (T1.EmprCod = ? and T1.Tip_ColC = ? and T1.IntCodF >= 0) AND (T1.IntCodF <= 99) ORDER BY T1.EmprCod, T1.Tip_ColC, T1.IntCodF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

