package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dppiezasareoperar extends GXProcedure
{
   public dppiezasareoperar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dppiezasareoperar.class ), "" );
   }

   public dppiezasareoperar( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTPiezasaReoperar> executeUdp( String aP0 ,
                                                                  int aP1 ,
                                                                  byte aP2 ,
                                                                  String aP3 )
   {
      dppiezasareoperar.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTPiezasaReoperar>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        GXBaseCollection<app.SdtSDTPiezasaReoperar>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             GXBaseCollection<app.SdtSDTPiezasaReoperar>[] aP4 )
   {
      dppiezasareoperar.this.AV8Emprcod = aP0;
      dppiezasareoperar.this.AV5Barcod = aP1;
      dppiezasareoperar.this.AV6Barcodreo = aP2;
      dppiezasareoperar.this.AV7Barcodpar = aP3;
      dppiezasareoperar.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00102 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV5Barcod), Byte.valueOf(AV6Barcodreo), AV7Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A201BarPieEst = P00102_A201BarPieEst[0] ;
         A130BarCodPar = P00102_A130BarCodPar[0] ;
         A132BarCodReo = P00102_A132BarCodReo[0] ;
         A129BarCod = P00102_A129BarCod[0] ;
         A396EmprCod = P00102_A396EmprCod[0] ;
         A203BarPieKil = P00102_A203BarPieKil[0] ;
         A205BarPieMet = P00102_A205BarPieMet[0] ;
         A2186BarPieLoc = P00102_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P00102_n2186BarPieLoc[0] ;
         A170BarKilLan = P00102_A170BarKilLan[0] ;
         A183BarMetLan = P00102_A183BarMetLan[0] ;
         A200BarPieCod = P00102_A200BarPieCod[0] ;
         Gxm1sdtpiezasareoperar = (app.SdtSDTPiezasaReoperar)new app.SdtSDTPiezasaReoperar(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtpiezasareoperar, 0);
         Gxm1sdtpiezasareoperar.setgxTv_SdtSDTPiezasaReoperar_Barpiecod( A200BarPieCod );
         Gxm1sdtpiezasareoperar.setgxTv_SdtSDTPiezasaReoperar_Barpiekil( A203BarPieKil );
         Gxm1sdtpiezasareoperar.setgxTv_SdtSDTPiezasaReoperar_Barpiemet( A205BarPieMet );
         Gxm1sdtpiezasareoperar.setgxTv_SdtSDTPiezasaReoperar_Barpiecoddestino( A200BarPieCod );
         Gxm1sdtpiezasareoperar.setgxTv_SdtSDTPiezasaReoperar_Barpieloc( A2186BarPieLoc );
         Gxm1sdtpiezasareoperar.setgxTv_SdtSDTPiezasaReoperar_Kilosdisponibles( A203BarPieKil.subtract(A170BarKilLan) );
         Gxm1sdtpiezasareoperar.setgxTv_SdtSDTPiezasaReoperar_Metrosdispobibles( A205BarPieMet.subtract(A183BarMetLan) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = dppiezasareoperar.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTPiezasaReoperar>(app.SdtSDTPiezasaReoperar.class, "SDTPiezasaReoperar", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00102_A201BarPieEst = new byte[1] ;
      P00102_A130BarCodPar = new String[] {""} ;
      P00102_A132BarCodReo = new byte[1] ;
      P00102_A129BarCod = new int[1] ;
      P00102_A396EmprCod = new String[] {""} ;
      P00102_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00102_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00102_A2186BarPieLoc = new String[] {""} ;
      P00102_n2186BarPieLoc = new boolean[] {false} ;
      P00102_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00102_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00102_A200BarPieCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      Gxm1sdtpiezasareoperar = new app.SdtSDTPiezasaReoperar(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dppiezasareoperar__default(),
         new Object[] {
             new Object[] {
            P00102_A201BarPieEst, P00102_A130BarCodPar, P00102_A132BarCodReo, P00102_A129BarCod, P00102_A396EmprCod, P00102_A203BarPieKil, P00102_A205BarPieMet, P00102_A2186BarPieLoc, P00102_n2186BarPieLoc, P00102_A170BarKilLan,
            P00102_A183BarMetLan, P00102_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV6Barcodreo ;
   private byte A201BarPieEst ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV5Barcod ;
   private int A129BarCod ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private String AV8Emprcod ;
   private String AV7Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A2186BarPieLoc ;
   private String A200BarPieCod ;
   private boolean n2186BarPieLoc ;
   private GXBaseCollection<app.SdtSDTPiezasaReoperar>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00102_A201BarPieEst ;
   private String[] P00102_A130BarCodPar ;
   private byte[] P00102_A132BarCodReo ;
   private int[] P00102_A129BarCod ;
   private String[] P00102_A396EmprCod ;
   private java.math.BigDecimal[] P00102_A203BarPieKil ;
   private java.math.BigDecimal[] P00102_A205BarPieMet ;
   private String[] P00102_A2186BarPieLoc ;
   private boolean[] P00102_n2186BarPieLoc ;
   private java.math.BigDecimal[] P00102_A170BarKilLan ;
   private java.math.BigDecimal[] P00102_A183BarMetLan ;
   private String[] P00102_A200BarPieCod ;
   private GXBaseCollection<app.SdtSDTPiezasaReoperar> Gxm2rootcol ;
   private app.SdtSDTPiezasaReoperar Gxm1sdtpiezasareoperar ;
}

final  class dppiezasareoperar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00102", "SELECT BarPieEst, BarCodPar, BarCodReo, BarCod, EmprCod, BarPieKil, BarPieMet, BarPieLoc, BarKilLan, BarMetLan, BarPieCod FROM TXPBARPIE WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND ((BarPieEst = 0)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 9);
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

