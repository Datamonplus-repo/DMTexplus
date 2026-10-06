package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pintlav extends GXProcedure
{
   public pintlav( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pintlav.class ), "" );
   }

   public pintlav( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            byte[] aP6 ,
                            java.math.BigDecimal[] aP7 )
   {
      pintlav.this.aP8 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 )
   {
      pintlav.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pintlav.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pintlav.this.A494ForSer = aP2[0];
      this.aP2 = aP2;
      pintlav.this.A482ForColNom = aP3[0];
      this.aP3 = aP3;
      pintlav.this.A483ForColNum = aP4[0];
      this.aP4 = aP4;
      pintlav.this.A831TipColCod = aP5[0];
      this.aP5 = aP5;
      pintlav.this.AV20IntCod = aP6[0];
      this.aP6 = aP6;
      pintlav.this.AV24IntLava = aP7[0];
      this.aP7 = aP7;
      pintlav.this.AV27TotLav = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27TotLav = (short)(0) ;
      AV20IntCod = (byte)(0) ;
      AV24IntLava = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P024S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P024S2_A486ForNumCol[0] ;
         A583IntCod = P024S2_A583IntCod[0] ;
         A5991IntLava = P024S2_A5991IntLava[0] ;
         n5991IntLava = P024S2_n5991IntLava[0] ;
         A5991IntLava = P024S2_A5991IntLava[0] ;
         n5991IntLava = P024S2_n5991IntLava[0] ;
         AV20IntCod = A583IntCod ;
         AV24IntLava = A5991IntLava ;
         AV25Hh = (short)(GXutil.Int( DecimalUtil.decToDouble(A5991IntLava))) ;
         AV26Mm = (short)(DecimalUtil.decToDouble((A5991IntLava.multiply(DecimalUtil.doubleToDec(100))).subtract(DecimalUtil.doubleToDec((AV25Hh*100))))) ;
         AV27TotLav = (short)((AV25Hh*60)+AV26Mm) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pintlav.this.A396EmprCod;
      this.aP1[0] = pintlav.this.A252CliCod;
      this.aP2[0] = pintlav.this.A494ForSer;
      this.aP3[0] = pintlav.this.A482ForColNom;
      this.aP4[0] = pintlav.this.A483ForColNum;
      this.aP5[0] = pintlav.this.A831TipColCod;
      this.aP6[0] = pintlav.this.AV20IntCod;
      this.aP7[0] = pintlav.this.AV24IntLava;
      this.aP8[0] = pintlav.this.AV27TotLav;
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
      P024S2_A396EmprCod = new String[] {""} ;
      P024S2_A252CliCod = new int[1] ;
      P024S2_A494ForSer = new String[] {""} ;
      P024S2_A482ForColNom = new String[] {""} ;
      P024S2_A483ForColNum = new int[1] ;
      P024S2_A831TipColCod = new byte[1] ;
      P024S2_A486ForNumCol = new int[1] ;
      P024S2_A583IntCod = new byte[1] ;
      P024S2_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024S2_n5991IntLava = new boolean[] {false} ;
      A5991IntLava = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pintlav__default(),
         new Object[] {
             new Object[] {
            P024S2_A396EmprCod, P024S2_A252CliCod, P024S2_A494ForSer, P024S2_A482ForColNom, P024S2_A483ForColNum, P024S2_A831TipColCod, P024S2_A486ForNumCol, P024S2_A583IntCod, P024S2_A5991IntLava, P024S2_n5991IntLava
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV20IntCod ;
   private byte A583IntCod ;
   private short AV27TotLav ;
   private short AV25Hh ;
   private short AV26Mm ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV24IntLava ;
   private java.math.BigDecimal A5991IntLava ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private boolean n5991IntLava ;
   private short[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P024S2_A396EmprCod ;
   private int[] P024S2_A252CliCod ;
   private String[] P024S2_A494ForSer ;
   private String[] P024S2_A482ForColNom ;
   private int[] P024S2_A483ForColNum ;
   private byte[] P024S2_A831TipColCod ;
   private int[] P024S2_A486ForNumCol ;
   private byte[] P024S2_A583IntCod ;
   private java.math.BigDecimal[] P024S2_A5991IntLava ;
   private boolean[] P024S2_n5991IntLava ;
}

final  class pintlav__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024S2", "SELECT T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ForNumCol, T1.IntCod, T2.IntLava FROM (TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

