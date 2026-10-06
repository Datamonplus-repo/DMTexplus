package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengovaloresproforl extends GXProcedure
{
   public obtengovaloresproforl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengovaloresproforl.class ), "" );
   }

   public obtengovaloresproforl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          String aP2 ,
                          String aP3 ,
                          int aP4 ,
                          byte aP5 ,
                          short aP6 ,
                          String[] aP7 ,
                          String[] aP8 ,
                          java.math.BigDecimal[] aP9 ,
                          java.math.BigDecimal[] aP10 )
   {
      obtengovaloresproforl.this.aP11 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        short aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        int[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             short aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             int[] aP11 )
   {
      obtengovaloresproforl.this.AV20EmprCod = aP0;
      obtengovaloresproforl.this.AV19CliCod = aP1;
      obtengovaloresproforl.this.AV9ForSer = aP2;
      obtengovaloresproforl.this.AV10ForColNom = aP3;
      obtengovaloresproforl.this.AV18ForColNum = aP4;
      obtengovaloresproforl.this.AV17TipColCod = aP5;
      obtengovaloresproforl.this.AV11ProForL = aP6;
      obtengovaloresproforl.this.aP7 = aP7;
      obtengovaloresproforl.this.aP8 = aP8;
      obtengovaloresproforl.this.aP9 = aP9;
      obtengovaloresproforl.this.aP10 = aP10;
      obtengovaloresproforl.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13ProFoNPrg = 0 ;
      AV12ProForCod = "" ;
      AV14ProforFabs = DecimalUtil.ZERO ;
      AV16ProForFR = "" ;
      AV15ProForrbn = DecimalUtil.ZERO ;
      /* Using cursor P0AF22 */
      pr_default.execute(0, new Object[] {AV20EmprCod, Integer.valueOf(AV19CliCod), AV9ForSer, AV10ForColNom, Integer.valueOf(AV18ForColNum), Byte.valueOf(AV17TipColCod), Short.valueOf(AV11ProForL)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1160ProForL = P0AF22_A1160ProForL[0] ;
         A831TipColCod = P0AF22_A831TipColCod[0] ;
         A483ForColNum = P0AF22_A483ForColNum[0] ;
         A482ForColNom = P0AF22_A482ForColNom[0] ;
         A494ForSer = P0AF22_A494ForSer[0] ;
         A252CliCod = P0AF22_A252CliCod[0] ;
         A396EmprCod = P0AF22_A396EmprCod[0] ;
         A7802ProFoNPrg = P0AF22_A7802ProFoNPrg[0] ;
         A764ProForCod = P0AF22_A764ProForCod[0] ;
         A14198ProforFabs = P0AF22_A14198ProforFabs[0] ;
         A6549ProForFR = P0AF22_A6549ProForFR[0] ;
         A8656ProForrbn = P0AF22_A8656ProForrbn[0] ;
         AV13ProFoNPrg = A7802ProFoNPrg ;
         AV12ProForCod = A764ProForCod ;
         AV14ProforFabs = A14198ProforFabs ;
         AV16ProForFR = A6549ProForFR ;
         AV15ProForrbn = A8656ProForrbn ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = obtengovaloresproforl.this.AV12ProForCod;
      this.aP8[0] = obtengovaloresproforl.this.AV16ProForFR;
      this.aP9[0] = obtengovaloresproforl.this.AV15ProForrbn;
      this.aP10[0] = obtengovaloresproforl.this.AV14ProforFabs;
      this.aP11[0] = obtengovaloresproforl.this.AV13ProFoNPrg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12ProForCod = "" ;
      AV16ProForFR = "" ;
      AV15ProForrbn = DecimalUtil.ZERO ;
      AV14ProforFabs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AF22_A1160ProForL = new short[1] ;
      P0AF22_A831TipColCod = new byte[1] ;
      P0AF22_A483ForColNum = new int[1] ;
      P0AF22_A482ForColNom = new String[] {""} ;
      P0AF22_A494ForSer = new String[] {""} ;
      P0AF22_A252CliCod = new int[1] ;
      P0AF22_A396EmprCod = new String[] {""} ;
      P0AF22_A7802ProFoNPrg = new int[1] ;
      P0AF22_A764ProForCod = new String[] {""} ;
      P0AF22_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AF22_A6549ProForFR = new String[] {""} ;
      P0AF22_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A14198ProforFabs = DecimalUtil.ZERO ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtengovaloresproforl__default(),
         new Object[] {
             new Object[] {
            P0AF22_A1160ProForL, P0AF22_A831TipColCod, P0AF22_A483ForColNum, P0AF22_A482ForColNom, P0AF22_A494ForSer, P0AF22_A252CliCod, P0AF22_A396EmprCod, P0AF22_A7802ProFoNPrg, P0AF22_A764ProForCod, P0AF22_A14198ProforFabs,
            P0AF22_A6549ProForFR, P0AF22_A8656ProForrbn
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17TipColCod ;
   private byte A831TipColCod ;
   private short AV11ProForL ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV19CliCod ;
   private int AV18ForColNum ;
   private int AV13ProFoNPrg ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A7802ProFoNPrg ;
   private java.math.BigDecimal AV15ProForrbn ;
   private java.math.BigDecimal AV14ProforFabs ;
   private java.math.BigDecimal A14198ProforFabs ;
   private java.math.BigDecimal A8656ProForrbn ;
   private String AV20EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String AV12ProForCod ;
   private String AV16ProForFR ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A6549ProForFR ;
   private int[] aP11 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AF22_A1160ProForL ;
   private byte[] P0AF22_A831TipColCod ;
   private int[] P0AF22_A483ForColNum ;
   private String[] P0AF22_A482ForColNom ;
   private String[] P0AF22_A494ForSer ;
   private int[] P0AF22_A252CliCod ;
   private String[] P0AF22_A396EmprCod ;
   private int[] P0AF22_A7802ProFoNPrg ;
   private String[] P0AF22_A764ProForCod ;
   private java.math.BigDecimal[] P0AF22_A14198ProforFabs ;
   private String[] P0AF22_A6549ProForFR ;
   private java.math.BigDecimal[] P0AF22_A8656ProForrbn ;
}

final  class obtengovaloresproforl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AF22", "SELECT ProForL, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ProFoNPrg, ProForCod, ProforFabs, ProForFR, ProForrbn FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ProForL = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

