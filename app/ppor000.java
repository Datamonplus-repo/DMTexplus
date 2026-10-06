package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppor000 extends GXProcedure
{
   public ppor000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppor000.class ), "" );
   }

   public ppor000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           String[] aP5 )
   {
      ppor000.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      ppor000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppor000.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      ppor000.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      ppor000.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      ppor000.this.AV16Discomcod = aP4[0];
      this.aP4 = aP4;
      ppor000.this.AV17FonCod = aP5[0];
      this.aP5 = aP5;
      ppor000.this.AV19Varpor = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15barcad = (byte)(0) ;
      /* Using cursor P03PG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03PG2_A130BarCodPar[0] ;
         A132BarCodReo = P03PG2_A132BarCodReo[0] ;
         A129BarCod = P03PG2_A129BarCod[0] ;
         A212BarSer = P03PG2_A212BarSer[0] ;
         A1798BarDibCli = P03PG2_A1798BarDibCli[0] ;
         A1799BarDibInt = P03PG2_A1799BarDibInt[0] ;
         A252CliCod = P03PG2_A252CliCod[0] ;
         n252CliCod = P03PG2_n252CliCod[0] ;
         AV11Barser = A212BarSer ;
         AV12Bardibcli = A1798BarDibCli ;
         AV13bardibint = A1799BarDibInt ;
         AV14Clicod = A252CliCod ;
         AV15barcad = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV15barcad == 1 )
      {
         AV18Porvar = (short)(DecimalUtil.decToDouble(AV19Varpor.multiply(DecimalUtil.doubleToDec(100)))) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV14Clicod ;
         GXv_char3[0] = AV11Barser ;
         GXv_char4[0] = AV12Bardibcli ;
         GXv_int5[0] = AV13bardibint ;
         GXv_char6[0] = AV16Discomcod ;
         GXv_char7[0] = AV17FonCod ;
         GXv_int8[0] = AV18Porvar ;
         new app.ppor001(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_int8) ;
         ppor000.this.A396EmprCod = GXv_char1[0] ;
         ppor000.this.AV14Clicod = GXv_int2[0] ;
         ppor000.this.AV11Barser = GXv_char3[0] ;
         ppor000.this.AV12Bardibcli = GXv_char4[0] ;
         ppor000.this.AV13bardibint = GXv_int5[0] ;
         ppor000.this.AV16Discomcod = GXv_char6[0] ;
         ppor000.this.AV17FonCod = GXv_char7[0] ;
         ppor000.this.AV18Porvar = GXv_int8[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppor000.this.A396EmprCod;
      this.aP1[0] = ppor000.this.AV8Barcod;
      this.aP2[0] = ppor000.this.AV9Barcodreo;
      this.aP3[0] = ppor000.this.AV10Barcodpar;
      this.aP4[0] = ppor000.this.AV16Discomcod;
      this.aP5[0] = ppor000.this.AV17FonCod;
      this.aP6[0] = ppor000.this.AV19Varpor;
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
      P03PG2_A396EmprCod = new String[] {""} ;
      P03PG2_A130BarCodPar = new String[] {""} ;
      P03PG2_A132BarCodReo = new byte[1] ;
      P03PG2_A129BarCod = new int[1] ;
      P03PG2_A212BarSer = new String[] {""} ;
      P03PG2_A1798BarDibCli = new String[] {""} ;
      P03PG2_A1799BarDibInt = new int[1] ;
      P03PG2_A252CliCod = new int[1] ;
      P03PG2_n252CliCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1798BarDibCli = "" ;
      AV11Barser = "" ;
      AV12Bardibcli = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppor000__default(),
         new Object[] {
             new Object[] {
            P03PG2_A396EmprCod, P03PG2_A130BarCodPar, P03PG2_A132BarCodReo, P03PG2_A129BarCod, P03PG2_A212BarSer, P03PG2_A1798BarDibCli, P03PG2_A1799BarDibInt, P03PG2_A252CliCod, P03PG2_n252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte AV15barcad ;
   private byte A132BarCodReo ;
   private short AV18Porvar ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A129BarCod ;
   private int A1799BarDibInt ;
   private int A252CliCod ;
   private int AV13bardibint ;
   private int AV14Clicod ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV19Varpor ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV16Discomcod ;
   private String AV17FonCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String AV11Barser ;
   private String AV12Bardibcli ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private boolean n252CliCod ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03PG2_A396EmprCod ;
   private String[] P03PG2_A130BarCodPar ;
   private byte[] P03PG2_A132BarCodReo ;
   private int[] P03PG2_A129BarCod ;
   private String[] P03PG2_A212BarSer ;
   private String[] P03PG2_A1798BarDibCli ;
   private int[] P03PG2_A1799BarDibInt ;
   private int[] P03PG2_A252CliCod ;
   private boolean[] P03PG2_n252CliCod ;
}

final  class ppor000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03PG2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer, BarDibCli, BarDibInt, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

