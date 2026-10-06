package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prbcolor extends GXProcedure
{
   public prbcolor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prbcolor.class ), "" );
   }

   public prbcolor( int remoteHandle ,
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
                                           byte[] aP5 )
   {
      prbcolor.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      prbcolor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prbcolor.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      prbcolor.this.AV9BarSer = aP2[0];
      this.aP2 = aP2;
      prbcolor.this.AV10BarColNom = aP3[0];
      this.aP3 = aP3;
      prbcolor.this.AV11BarColNum = aP4[0];
      this.aP4 = aP4;
      prbcolor.this.AV12BarTipCol = aP5[0];
      this.aP5 = aP5;
      prbcolor.this.AV13RelBany = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13RelBany = DecimalUtil.ZERO ;
      /* Using cursor P054I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9BarSer, AV10BarColNom, Integer.valueOf(AV11BarColNum), Byte.valueOf(AV12BarTipCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P054I2_A831TipColCod[0] ;
         A483ForColNum = P054I2_A483ForColNum[0] ;
         A482ForColNom = P054I2_A482ForColNom[0] ;
         A494ForSer = P054I2_A494ForSer[0] ;
         A252CliCod = P054I2_A252CliCod[0] ;
         A2838ForRelBan = P054I2_A2838ForRelBan[0] ;
         n2838ForRelBan = P054I2_n2838ForRelBan[0] ;
         AV13RelBany = A2838ForRelBan ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prbcolor.this.A396EmprCod;
      this.aP1[0] = prbcolor.this.AV8CliCod;
      this.aP2[0] = prbcolor.this.AV9BarSer;
      this.aP3[0] = prbcolor.this.AV10BarColNom;
      this.aP4[0] = prbcolor.this.AV11BarColNum;
      this.aP5[0] = prbcolor.this.AV12BarTipCol;
      this.aP6[0] = prbcolor.this.AV13RelBany;
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
      P054I2_A396EmprCod = new String[] {""} ;
      P054I2_A831TipColCod = new byte[1] ;
      P054I2_A483ForColNum = new int[1] ;
      P054I2_A482ForColNom = new String[] {""} ;
      P054I2_A494ForSer = new String[] {""} ;
      P054I2_A252CliCod = new int[1] ;
      P054I2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P054I2_n2838ForRelBan = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prbcolor__default(),
         new Object[] {
             new Object[] {
            P054I2_A396EmprCod, P054I2_A831TipColCod, P054I2_A483ForColNum, P054I2_A482ForColNom, P054I2_A494ForSer, P054I2_A252CliCod, P054I2_A2838ForRelBan, P054I2_n2838ForRelBan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12BarTipCol ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV11BarColNum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private java.math.BigDecimal AV13RelBany ;
   private java.math.BigDecimal A2838ForRelBan ;
   private String A396EmprCod ;
   private String AV9BarSer ;
   private String AV10BarColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n2838ForRelBan ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P054I2_A396EmprCod ;
   private byte[] P054I2_A831TipColCod ;
   private int[] P054I2_A483ForColNum ;
   private String[] P054I2_A482ForColNom ;
   private String[] P054I2_A494ForSer ;
   private int[] P054I2_A252CliCod ;
   private java.math.BigDecimal[] P054I2_A2838ForRelBan ;
   private boolean[] P054I2_n2838ForRelBan ;
}

final  class prbcolor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P054I2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForRelBan FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

