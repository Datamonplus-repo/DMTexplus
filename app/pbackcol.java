package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbackcol extends GXProcedure
{
   public pbackcol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbackcol.class ), "" );
   }

   public pbackcol( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 ,
                                           String[] aP6 ,
                                           int[] aP7 ,
                                           byte[] aP8 )
   {
      pbackcol.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      pbackcol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbackcol.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbackcol.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pbackcol.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pbackcol.this.AV16ForColNum = aP4[0];
      this.aP4 = aP4;
      pbackcol.this.AV17TipColCod = aP5[0];
      this.aP5 = aP5;
      pbackcol.this.AV18ForNomCli = aP6[0];
      this.aP6 = aP6;
      pbackcol.this.AV19ForNumCli = aP7[0];
      this.aP7 = aP7;
      pbackcol.this.AV20VSit = aP8[0];
      this.aP8 = aP8;
      pbackcol.this.AV22ForCanSum = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_line = 0 ;
      AV20VSit = (byte)(2) ;
      /* Using cursor P01M72 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A483ForColNum = P01M72_A483ForColNum[0] ;
         A1191ForNomCli = P01M72_A1191ForNomCli[0] ;
         n1191ForNomCli = P01M72_n1191ForNomCli[0] ;
         A1192ForNumCli = P01M72_A1192ForNumCli[0] ;
         n1192ForNumCli = P01M72_n1192ForNumCli[0] ;
         A831TipColCod = P01M72_A831TipColCod[0] ;
         A486ForNumCol = P01M72_A486ForNumCol[0] ;
         AV16ForColNum = A483ForColNum ;
         AV18ForNomCli = A1191ForNomCli ;
         AV19ForNumCli = A1192ForNumCli ;
         AV17TipColCod = A831TipColCod ;
         AV20VSit = (byte)(1) ;
         Gx_line = (int)(Gx_line+1) ;
         AV21ForNumCol = A486ForNumCol ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV22ForCanSum = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01M74 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV21ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P01M74_A486ForNumCol[0] ;
         A5361ForCanSum = P01M74_A5361ForCanSum[0] ;
         n5361ForCanSum = P01M74_n5361ForCanSum[0] ;
         A5361ForCanSum = P01M74_A5361ForCanSum[0] ;
         n5361ForCanSum = P01M74_n5361ForCanSum[0] ;
         AV22ForCanSum = A5361ForCanSum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbackcol.this.A396EmprCod;
      this.aP1[0] = pbackcol.this.A252CliCod;
      this.aP2[0] = pbackcol.this.A494ForSer;
      this.aP3[0] = pbackcol.this.A482ForColNom;
      this.aP4[0] = pbackcol.this.AV16ForColNum;
      this.aP5[0] = pbackcol.this.AV17TipColCod;
      this.aP6[0] = pbackcol.this.AV18ForNomCli;
      this.aP7[0] = pbackcol.this.AV19ForNumCli;
      this.aP8[0] = pbackcol.this.AV20VSit;
      this.aP9[0] = pbackcol.this.AV22ForCanSum;
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
      P01M72_A396EmprCod = new String[] {""} ;
      P01M72_A252CliCod = new int[1] ;
      P01M72_A494ForSer = new String[] {""} ;
      P01M72_A482ForColNom = new String[] {""} ;
      P01M72_A483ForColNum = new int[1] ;
      P01M72_A1191ForNomCli = new String[] {""} ;
      P01M72_n1191ForNomCli = new boolean[] {false} ;
      P01M72_A1192ForNumCli = new int[1] ;
      P01M72_n1192ForNumCli = new boolean[] {false} ;
      P01M72_A831TipColCod = new byte[1] ;
      P01M72_A486ForNumCol = new int[1] ;
      A1191ForNomCli = "" ;
      P01M74_A396EmprCod = new String[] {""} ;
      P01M74_A486ForNumCol = new int[1] ;
      P01M74_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01M74_n5361ForCanSum = new boolean[] {false} ;
      A5361ForCanSum = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbackcol__default(),
         new Object[] {
             new Object[] {
            P01M72_A396EmprCod, P01M72_A252CliCod, P01M72_A494ForSer, P01M72_A482ForColNom, P01M72_A483ForColNum, P01M72_A1191ForNomCli, P01M72_n1191ForNomCli, P01M72_A1192ForNumCli, P01M72_n1192ForNumCli, P01M72_A831TipColCod,
            P01M72_A486ForNumCol
            }
            , new Object[] {
            P01M74_A396EmprCod, P01M74_A486ForNumCol, P01M74_A5361ForCanSum, P01M74_n5361ForCanSum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17TipColCod ;
   private byte AV20VSit ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV16ForColNum ;
   private int AV19ForNumCli ;
   private int Gx_line ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int A486ForNumCol ;
   private int AV21ForNumCol ;
   private java.math.BigDecimal AV22ForCanSum ;
   private java.math.BigDecimal A5361ForCanSum ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String AV18ForNomCli ;
   private String scmdbuf ;
   private String A1191ForNomCli ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n5361ForCanSum ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P01M72_A396EmprCod ;
   private int[] P01M72_A252CliCod ;
   private String[] P01M72_A494ForSer ;
   private String[] P01M72_A482ForColNom ;
   private int[] P01M72_A483ForColNum ;
   private String[] P01M72_A1191ForNomCli ;
   private boolean[] P01M72_n1191ForNomCli ;
   private int[] P01M72_A1192ForNumCli ;
   private boolean[] P01M72_n1192ForNumCli ;
   private byte[] P01M72_A831TipColCod ;
   private int[] P01M72_A486ForNumCol ;
   private String[] P01M74_A396EmprCod ;
   private int[] P01M74_A486ForNumCol ;
   private java.math.BigDecimal[] P01M74_A5361ForCanSum ;
   private boolean[] P01M74_n5361ForCanSum ;
}

final  class pbackcol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01M72", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, ForNomCli, ForNumCli, TipColCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01M74", "SELECT T1.EmprCod, T1.ForNumCol, COALESCE( T2.ForCanSum, 0) AS ForCanSum FROM (TXPCDFORM T1 LEFT JOIN (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T2 ON T2.EmprCod = T1.EmprCod AND T2.ForNumCol = T1.ForNumCol) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

