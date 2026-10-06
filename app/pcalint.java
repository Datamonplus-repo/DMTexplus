package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalint extends GXProcedure
{
   public pcalint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalint.class ), "" );
   }

   public pcalint( int remoteHandle ,
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
      pcalint.this.aP7 = new byte[] {0};
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
      pcalint.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalint.this.AV28CliCod = aP1[0];
      this.aP1 = aP1;
      pcalint.this.AV29ForSer = aP2[0];
      this.aP2 = aP2;
      pcalint.this.AV30ForColNom = aP3[0];
      this.aP3 = aP3;
      pcalint.this.AV31ForColNum = aP4[0];
      this.aP4 = aP4;
      pcalint.this.AV32TipColCod = aP5[0];
      this.aP5 = aP5;
      pcalint.this.AV27ForNumCol = aP6[0];
      this.aP6 = aP6;
      pcalint.this.AV22IntCod = aP7[0];
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
      /* Using cursor P01OT4 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV27ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P01OT4_A486ForNumCol[0] ;
         A5361ForCanSum = P01OT4_A5361ForCanSum[0] ;
         n5361ForCanSum = P01OT4_n5361ForCanSum[0] ;
         A5166CosKgmF = P01OT4_A5166CosKgmF[0] ;
         n5166CosKgmF = P01OT4_n5166CosKgmF[0] ;
         A5361ForCanSum = P01OT4_A5361ForCanSum[0] ;
         n5361ForCanSum = P01OT4_n5361ForCanSum[0] ;
         A5166CosKgmF = P01OT4_A5166CosKgmF[0] ;
         n5166CosKgmF = P01OT4_n5166CosKgmF[0] ;
         AV21ForCanSum = A5361ForCanSum ;
         AV24CosKgmF = A5166CosKgmF ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV22IntCod = (byte)(0) ;
      AV23IntDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P01OT5 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A583IntCod = P01OT5_A583IntCod[0] ;
         A5360IntLabLf = P01OT5_A5360IntLabLf[0] ;
         n5360IntLabLf = P01OT5_n5360IntLabLf[0] ;
         A5359IntLabLi = P01OT5_A5359IntLabLi[0] ;
         n5359IntLabLi = P01OT5_n5359IntLabLi[0] ;
         A584IntDsc = P01OT5_A584IntDsc[0] ;
         n584IntDsc = P01OT5_n584IntDsc[0] ;
         if ( ( DecimalUtil.compareTo(A5359IntLabLi, AV21ForCanSum) <= 0 ) && ( DecimalUtil.compareTo(A5360IntLabLf, AV21ForCanSum) >= 0 ) )
         {
            AV22IntCod = A583IntCod ;
            AV23IntDsc = A584IntDsc ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P01OT6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV28CliCod), AV29ForSer, AV30ForColNom, Integer.valueOf(AV31ForColNum), Byte.valueOf(AV32TipColCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P01OT6_A831TipColCod[0] ;
         A483ForColNum = P01OT6_A483ForColNum[0] ;
         A482ForColNom = P01OT6_A482ForColNom[0] ;
         A494ForSer = P01OT6_A494ForSer[0] ;
         A252CliCod = P01OT6_A252CliCod[0] ;
         A583IntCod = P01OT6_A583IntCod[0] ;
         A583IntCod = AV22IntCod ;
         Gx_msg = httpContext.getMessage( "Intendidad Lab calculada =", "") + GXutil.str( AV22IntCod, 2, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P01OT7 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A583IntCod), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalint.this.A396EmprCod;
      this.aP1[0] = pcalint.this.AV28CliCod;
      this.aP2[0] = pcalint.this.AV29ForSer;
      this.aP3[0] = pcalint.this.AV30ForColNom;
      this.aP4[0] = pcalint.this.AV31ForColNum;
      this.aP5[0] = pcalint.this.AV32TipColCod;
      this.aP6[0] = pcalint.this.AV27ForNumCol;
      this.aP7[0] = pcalint.this.AV22IntCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcalint");
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
      P01OT4_A396EmprCod = new String[] {""} ;
      P01OT4_A486ForNumCol = new int[1] ;
      P01OT4_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OT4_n5361ForCanSum = new boolean[] {false} ;
      P01OT4_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OT4_n5166CosKgmF = new boolean[] {false} ;
      A5361ForCanSum = DecimalUtil.ZERO ;
      A5166CosKgmF = DecimalUtil.ZERO ;
      AV23IntDsc = "" ;
      P01OT5_A396EmprCod = new String[] {""} ;
      P01OT5_A583IntCod = new byte[1] ;
      P01OT5_A5360IntLabLf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OT5_n5360IntLabLf = new boolean[] {false} ;
      P01OT5_A5359IntLabLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01OT5_n5359IntLabLi = new boolean[] {false} ;
      P01OT5_A584IntDsc = new String[] {""} ;
      P01OT5_n584IntDsc = new boolean[] {false} ;
      A5360IntLabLf = DecimalUtil.ZERO ;
      A5359IntLabLi = DecimalUtil.ZERO ;
      A584IntDsc = "" ;
      P01OT6_A396EmprCod = new String[] {""} ;
      P01OT6_A831TipColCod = new byte[1] ;
      P01OT6_A483ForColNum = new int[1] ;
      P01OT6_A482ForColNom = new String[] {""} ;
      P01OT6_A494ForSer = new String[] {""} ;
      P01OT6_A252CliCod = new int[1] ;
      P01OT6_A583IntCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalint__default(),
         new Object[] {
             new Object[] {
            P01OT4_A396EmprCod, P01OT4_A486ForNumCol, P01OT4_A5361ForCanSum, P01OT4_n5361ForCanSum, P01OT4_A5166CosKgmF, P01OT4_n5166CosKgmF
            }
            , new Object[] {
            P01OT5_A396EmprCod, P01OT5_A583IntCod, P01OT5_A5360IntLabLf, P01OT5_n5360IntLabLf, P01OT5_A5359IntLabLi, P01OT5_n5359IntLabLi, P01OT5_A584IntDsc, P01OT5_n584IntDsc
            }
            , new Object[] {
            P01OT6_A396EmprCod, P01OT6_A831TipColCod, P01OT6_A483ForColNum, P01OT6_A482ForColNom, P01OT6_A494ForSer, P01OT6_A252CliCod, P01OT6_A583IntCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32TipColCod ;
   private byte AV22IntCod ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV28CliCod ;
   private int AV31ForColNum ;
   private int AV27ForNumCol ;
   private int A486ForNumCol ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private java.math.BigDecimal AV24CosKgmF ;
   private java.math.BigDecimal AV21ForCanSum ;
   private java.math.BigDecimal A5361ForCanSum ;
   private java.math.BigDecimal A5166CosKgmF ;
   private java.math.BigDecimal A5360IntLabLf ;
   private java.math.BigDecimal A5359IntLabLi ;
   private String A396EmprCod ;
   private String AV29ForSer ;
   private String AV30ForColNom ;
   private String scmdbuf ;
   private String AV23IntDsc ;
   private String A584IntDsc ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String Gx_msg ;
   private boolean n5361ForCanSum ;
   private boolean n5166CosKgmF ;
   private boolean n5360IntLabLf ;
   private boolean n5359IntLabLi ;
   private boolean n584IntDsc ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01OT4_A396EmprCod ;
   private int[] P01OT4_A486ForNumCol ;
   private java.math.BigDecimal[] P01OT4_A5361ForCanSum ;
   private boolean[] P01OT4_n5361ForCanSum ;
   private java.math.BigDecimal[] P01OT4_A5166CosKgmF ;
   private boolean[] P01OT4_n5166CosKgmF ;
   private String[] P01OT5_A396EmprCod ;
   private byte[] P01OT5_A583IntCod ;
   private java.math.BigDecimal[] P01OT5_A5360IntLabLf ;
   private boolean[] P01OT5_n5360IntLabLf ;
   private java.math.BigDecimal[] P01OT5_A5359IntLabLi ;
   private boolean[] P01OT5_n5359IntLabLi ;
   private String[] P01OT5_A584IntDsc ;
   private boolean[] P01OT5_n584IntDsc ;
   private String[] P01OT6_A396EmprCod ;
   private byte[] P01OT6_A831TipColCod ;
   private int[] P01OT6_A483ForColNum ;
   private String[] P01OT6_A482ForColNom ;
   private String[] P01OT6_A494ForSer ;
   private int[] P01OT6_A252CliCod ;
   private byte[] P01OT6_A583IntCod ;
}

final  class pcalint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01OT4", "SELECT T1.EmprCod, T1.ForNumCol, COALESCE( T2.ForCanSum, 0) AS ForCanSum, COALESCE( T3.CosKgmF, 0) AS CosKgmF FROM ((TXPCDFORM T1 LEFT JOIN (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T2 ON T2.EmprCod = T1.EmprCod AND T2.ForNumCol = T1.ForNumCol) LEFT JOIN (SELECT SUM(( CAST(T6.ContNum * CAST(T4.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T5.PrdPreAct * CAST(T5.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T4.EmprCod, T4.ForNumCol FROM ((TXPLDFORM T4 INNER JOIN TXPPRODUC T5 ON T5.EmprCod = T4.EmprCod AND T5.PrdNum = T4.PrdNum) INNER JOIN TXPCDFORM T6 ON T6.EmprCod = T4.EmprCod AND T6.ForNumCol = T4.ForNumCol) GROUP BY T4.EmprCod, T4.ForNumCol ) T3 ON T3.EmprCod = T1.EmprCod AND T3.ForNumCol = T1.ForNumCol) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01OT5", "SELECT EmprCod, IntCod, IntLabLf, IntLabLi, IntDsc FROM TXPINTENS WHERE (EmprCod = ? and IntCod >= 0) AND (IntCod <= 99) ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01OT6", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01OT7", "UPDATE TXPCFORMU SET IntCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

