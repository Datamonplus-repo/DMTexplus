package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp026 extends GXProcedure
{
   public pdyrp026( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp026.class ), "" );
   }

   public pdyrp026( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      pdyrp026.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pdyrp026.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp026.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp026.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp026.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp026.this.AV13RelBany = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13RelBany = DecimalUtil.ZERO ;
      /* Using cursor P099J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P099J2_A130BarCodPar[0] ;
         A132BarCodReo = P099J2_A132BarCodReo[0] ;
         A129BarCod = P099J2_A129BarCod[0] ;
         A252CliCod = P099J2_A252CliCod[0] ;
         n252CliCod = P099J2_n252CliCod[0] ;
         A212BarSer = P099J2_A212BarSer[0] ;
         A135BarColNom = P099J2_A135BarColNom[0] ;
         A136BarColNum = P099J2_A136BarColNum[0] ;
         A218BarTipCol = P099J2_A218BarTipCol[0] ;
         AV8CliCod = A252CliCod ;
         AV9BarSer = A212BarSer ;
         AV10BarColNom = A135BarColNom ;
         AV11BarColNum = A136BarColNum ;
         AV12BarTipCol = A218BarTipCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV13RelBany = DecimalUtil.ZERO ;
      /* Using cursor P099J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), AV9BarSer, AV10BarColNom, Integer.valueOf(AV11BarColNum), Byte.valueOf(AV12BarTipCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P099J3_A831TipColCod[0] ;
         A483ForColNum = P099J3_A483ForColNum[0] ;
         A482ForColNom = P099J3_A482ForColNom[0] ;
         A494ForSer = P099J3_A494ForSer[0] ;
         A252CliCod = P099J3_A252CliCod[0] ;
         n252CliCod = P099J3_n252CliCod[0] ;
         A2838ForRelBan = P099J3_A2838ForRelBan[0] ;
         n2838ForRelBan = P099J3_n2838ForRelBan[0] ;
         AV13RelBany = A2838ForRelBan ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp026.this.A396EmprCod;
      this.aP1[0] = pdyrp026.this.AV15BarCod;
      this.aP2[0] = pdyrp026.this.AV16BarCodReo;
      this.aP3[0] = pdyrp026.this.AV17BarCodPar;
      this.aP4[0] = pdyrp026.this.AV13RelBany;
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
      P099J2_A396EmprCod = new String[] {""} ;
      P099J2_A130BarCodPar = new String[] {""} ;
      P099J2_A132BarCodReo = new byte[1] ;
      P099J2_A129BarCod = new int[1] ;
      P099J2_A252CliCod = new int[1] ;
      P099J2_n252CliCod = new boolean[] {false} ;
      P099J2_A212BarSer = new String[] {""} ;
      P099J2_A135BarColNom = new String[] {""} ;
      P099J2_A136BarColNum = new int[1] ;
      P099J2_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV9BarSer = "" ;
      AV10BarColNom = "" ;
      P099J3_A396EmprCod = new String[] {""} ;
      P099J3_A831TipColCod = new byte[1] ;
      P099J3_A483ForColNum = new int[1] ;
      P099J3_A482ForColNom = new String[] {""} ;
      P099J3_A494ForSer = new String[] {""} ;
      P099J3_A252CliCod = new int[1] ;
      P099J3_n252CliCod = new boolean[] {false} ;
      P099J3_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099J3_n2838ForRelBan = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp026__default(),
         new Object[] {
             new Object[] {
            P099J2_A396EmprCod, P099J2_A130BarCodPar, P099J2_A132BarCodReo, P099J2_A129BarCod, P099J2_A252CliCod, P099J2_n252CliCod, P099J2_A212BarSer, P099J2_A135BarColNom, P099J2_A136BarColNum, P099J2_A218BarTipCol
            }
            , new Object[] {
            P099J3_A396EmprCod, P099J3_A831TipColCod, P099J3_A483ForColNum, P099J3_A482ForColNom, P099J3_A494ForSer, P099J3_A252CliCod, P099J3_A2838ForRelBan, P099J3_n2838ForRelBan
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV12BarTipCol ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV8CliCod ;
   private int AV11BarColNum ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV13RelBany ;
   private java.math.BigDecimal A2838ForRelBan ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV9BarSer ;
   private String AV10BarColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n252CliCod ;
   private boolean n2838ForRelBan ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P099J2_A396EmprCod ;
   private String[] P099J2_A130BarCodPar ;
   private byte[] P099J2_A132BarCodReo ;
   private int[] P099J2_A129BarCod ;
   private int[] P099J2_A252CliCod ;
   private boolean[] P099J2_n252CliCod ;
   private String[] P099J2_A212BarSer ;
   private String[] P099J2_A135BarColNom ;
   private int[] P099J2_A136BarColNum ;
   private byte[] P099J2_A218BarTipCol ;
   private String[] P099J3_A396EmprCod ;
   private byte[] P099J3_A831TipColCod ;
   private int[] P099J3_A483ForColNum ;
   private String[] P099J3_A482ForColNom ;
   private String[] P099J3_A494ForSer ;
   private int[] P099J3_A252CliCod ;
   private boolean[] P099J3_n252CliCod ;
   private java.math.BigDecimal[] P099J3_A2838ForRelBan ;
   private boolean[] P099J3_n2838ForRelBan ;
}

final  class pdyrp026__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099J2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P099J3", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForRelBan FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 1 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
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

