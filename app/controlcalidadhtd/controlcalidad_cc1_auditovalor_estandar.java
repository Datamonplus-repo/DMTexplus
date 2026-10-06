package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_cc1_auditovalor_estandar extends GXProcedure
{
   public controlcalidad_cc1_auditovalor_estandar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_cc1_auditovalor_estandar.class ), "" );
   }

   public controlcalidad_cc1_auditovalor_estandar( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 ,
                           String aP3 ,
                           int aP4 ,
                           int aP5 ,
                           byte aP6 ,
                           String aP7 ,
                           String aP8 ,
                           short aP9 ,
                           int aP10 ,
                           short aP11 ,
                           String aP12 ,
                           String aP13 ,
                           String[] aP14 )
   {
      controlcalidad_cc1_auditovalor_estandar.this.aP15 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        int aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        String aP8 ,
                        short aP9 ,
                        int aP10 ,
                        short aP11 ,
                        String aP12 ,
                        String aP13 ,
                        String[] aP14 ,
                        byte[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             String aP8 ,
                             short aP9 ,
                             int aP10 ,
                             short aP11 ,
                             String aP12 ,
                             String aP13 ,
                             String[] aP14 ,
                             byte[] aP15 )
   {
      controlcalidad_cc1_auditovalor_estandar.this.A396EmprCod = aP0;
      controlcalidad_cc1_auditovalor_estandar.this.AV60Clicod = aP1;
      controlcalidad_cc1_auditovalor_estandar.this.AV61barser = aP2;
      controlcalidad_cc1_auditovalor_estandar.this.AV62barcolnom = aP3;
      controlcalidad_cc1_auditovalor_estandar.this.AV63barcolnum = aP4;
      controlcalidad_cc1_auditovalor_estandar.this.AV48Barcod = aP5;
      controlcalidad_cc1_auditovalor_estandar.this.AV53Barcodreo = aP6;
      controlcalidad_cc1_auditovalor_estandar.this.AV54barcodpar = aP7;
      controlcalidad_cc1_auditovalor_estandar.this.AV58ProCod = aP8;
      controlcalidad_cc1_auditovalor_estandar.this.AV59BarOrdLin = aP9;
      controlcalidad_cc1_auditovalor_estandar.this.AV64CCTCod = aP10;
      controlcalidad_cc1_auditovalor_estandar.this.AV65CCTLin = aP11;
      controlcalidad_cc1_auditovalor_estandar.this.AV56CCTLinDsc = aP12;
      controlcalidad_cc1_auditovalor_estandar.this.AV57ccvalin = aP13;
      controlcalidad_cc1_auditovalor_estandar.this.aP14 = aP14;
      controlcalidad_cc1_auditovalor_estandar.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21CCOk = (byte)(1) ;
      AV32MsgErr = "" ;
      AV8Ok = (byte)(2) ;
      AV46ValNum = CommonUtil.decimalVal( AV57ccvalin, ".") ;
      AV11CCVal = AV57ccvalin ;
      AV69CCSAuto = (byte)(0) ;
      AV73GXLvl8 = (byte)(0) ;
      /* Using cursor P0AQ42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV64CCTCod), Short.valueOf(AV65CCTLin), AV61barser, AV62barcolnom, Integer.valueOf(AV63barcolnum), Integer.valueOf(AV60Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4034CCTLin = P0AQ42_A4034CCTLin[0] ;
         A4031CCTCod = P0AQ42_A4031CCTCod[0] ;
         A4060CCSVal = P0AQ42_A4060CCSVal[0] ;
         n4060CCSVal = P0AQ42_n4060CCSVal[0] ;
         A4059CCFColNum = P0AQ42_A4059CCFColNum[0] ;
         A4058CCFColNom = P0AQ42_A4058CCFColNom[0] ;
         A65ArtCod = P0AQ42_A65ArtCod[0] ;
         A252CliCod = P0AQ42_A252CliCod[0] ;
         A11530CCSAuto = P0AQ42_A11530CCSAuto[0] ;
         A11532CCSVTol = P0AQ42_A11532CCSVTol[0] ;
         A4044CCTLinTpoD = P0AQ42_A4044CCTLinTpoD[0] ;
         A11482CCSMin = P0AQ42_A11482CCSMin[0] ;
         n11482CCSMin = P0AQ42_n11482CCSMin[0] ;
         A11483CCSMax = P0AQ42_A11483CCSMax[0] ;
         n11483CCSMax = P0AQ42_n11483CCSMax[0] ;
         A4044CCTLinTpoD = P0AQ42_A4044CCTLinTpoD[0] ;
         AV73GXLvl8 = (byte)(1) ;
         AV74GXLvl17 = (byte)(0) ;
         /* Using cursor P0AQ43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Boolean.valueOf(n4060CCSVal), A4060CCSVal});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4051CCTVal = P0AQ43_A4051CCTVal[0] ;
            A4050CCTValDsc = P0AQ43_A4050CCTValDsc[0] ;
            A4049CCTValLin = P0AQ43_A4049CCTValLin[0] ;
            AV74GXLvl17 = (byte)(1) ;
            AV12CCValDsc = A4050CCTValDsc ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV74GXLvl17 == 0 )
         {
            AV12CCValDsc = A4060CCSVal ;
         }
         AV69CCSAuto = A11530CCSAuto ;
         if ( A11530CCSAuto == 1 )
         {
            AV47CCSVTol = A11532CCSVTol ;
            if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 )
            {
               AV26CCSValN = GXutil.lval( AV25CCSVal) ;
               AV23CCSMin1 = GXutil.str( DecimalUtil.doubleToDec(AV26CCSValN).multiply((DecimalUtil.doubleToDec(1).subtract(A11532CCSVTol.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 15, 0) ;
               AV23CCSMin1 = GXutil.trim( AV23CCSMin1) ;
               AV24CCSMax1 = GXutil.str( DecimalUtil.doubleToDec(AV26CCSValN).multiply((DecimalUtil.doubleToDec(1).add(A11532CCSVTol.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 15, 0) ;
               AV24CCSMax1 = GXutil.trim( AV24CCSMax1) ;
               AV45Cal = DecimalUtil.doubleToDec(0) ;
               if ( AV26CCSValN > 0 )
               {
                  AV45Cal = ((DecimalUtil.doubleToDec(AV26CCSValN).subtract(AV46ValNum)).divide(DecimalUtil.doubleToDec(AV26CCSValN), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) ;
               }
            }
            else
            {
               AV27CCSValF = localUtil.ctod( AV25CCSVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV23CCSMin1 = localUtil.dtoc( GXutil.dadd(AV27CCSValF,-(A11532CCSVTol.intValue())), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               AV24CCSMax1 = localUtil.dtoc( GXutil.dadd(AV27CCSValF,+(A11532CCSVTol.intValue())), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
         }
         else
         {
            AV70ValorAux = (byte)(1) ;
            AV25CCSVal = GXutil.str( AV70ValorAux, 1, 0) ;
            AV23CCSMin1 = A11482CCSMin ;
            AV24CCSMax1 = A11483CCSMax ;
         }
         AV10CCSMin = ((GXutil.strcmp(A4044CCTLinTpoD, "N")==0) ? AV23CCSMin1 : "0") ;
         AV10CCSMin = ((GXutil.strcmp(A4044CCTLinTpoD, "C")==0) ? AV23CCSMin1 : AV10CCSMin) ;
         AV10CCSMin = ((GXutil.strcmp(A4044CCTLinTpoD, "T")==0) ? AV23CCSMin1 : AV10CCSMin) ;
         AV9CCSMax = ((GXutil.strcmp(A4044CCTLinTpoD, "N")==0) ? AV24CCSMax1 : "0") ;
         AV9CCSMax = ((GXutil.strcmp(A4044CCTLinTpoD, "C")==0) ? AV24CCSMax1 : AV9CCSMax) ;
         AV9CCSMax = ((GXutil.strcmp(A4044CCTLinTpoD, "T")==0) ? AV24CCSMax1 : AV9CCSMax) ;
         if ( ( GXutil.strcmp(GXutil.trim( AV23CCSMin1), "") == 0 ) && ( GXutil.strcmp(GXutil.trim( A4060CCSVal), "") == 0 ) && ( GXutil.strcmp(GXutil.trim( AV24CCSMax1), "") == 0 ) )
         {
            AV8Ok = (byte)(2) ;
         }
         else
         {
            AV66ValMin = CommonUtil.decimalVal( GXutil.substring( AV10CCSMin, 1, 10), ".") ;
            AV67ValMax = CommonUtil.decimalVal( GXutil.substring( AV9CCSMax, 1, 10), ".") ;
            AV68Valor = CommonUtil.decimalVal( GXutil.substring( AV11CCVal, 1, 10), ".") ;
            AV10CCSMin = GXutil.padl( GXutil.trim( AV10CCSMin), (short)(40), "0") ;
            AV9CCSMax = GXutil.padl( GXutil.trim( AV9CCSMax), (short)(40), "0") ;
            AV11CCVal = GXutil.padl( GXutil.trim( AV11CCVal), (short)(40), "0") ;
            AV8Ok = (byte)(((GXutil.strcmp(AV10CCSMin, AV11CCVal)<=0)&&(GXutil.strcmp(AV11CCVal, AV9CCSMax)<=0) ? 1 : 0)) ;
            AV12CCValDsc = ((GXutil.strcmp(GXutil.trim( AV23CCSMin1), "")!=0) ? GXutil.trim( AV23CCSMin1) : "") + ((GXutil.strcmp(GXutil.trim( AV23CCSMin1), "")!=0)&&((GXutil.strcmp(GXutil.trim( AV12CCValDsc), "")!=0)||(GXutil.strcmp(GXutil.trim( AV24CCSMax1), "")!=0)) ? " - " : "") + ((GXutil.strcmp(GXutil.trim( AV12CCValDsc), "")!=0) ? GXutil.trim( AV12CCValDsc) : "") + ((GXutil.strcmp(GXutil.trim( AV24CCSMax1), "")!=0)&&((GXutil.strcmp(GXutil.trim( AV12CCValDsc), "")!=0)&&(GXutil.strcmp(GXutil.trim( AV23CCSMin1), "")!=0)) ? " - " : "") + ((GXutil.strcmp(GXutil.trim( AV24CCSMax1), "")!=0) ? GXutil.trim( AV24CCSMax1) : "") + ((AV31OkVal==0) ? " "+GXutil.trim( Gx_msg) : "") ;
         }
         AV21CCOk = (byte)(((AV8Ok==0) ? 0 : AV21CCOk)) ;
         if ( AV8Ok == 0 )
         {
            AV32MsgErr += httpContext.getMessage( "Atencion.", "") + GXutil.trim( AV55CCTDsc) + GXutil.newLine( ) ;
            if ( AV69CCSAuto == 1 )
            {
               AV32MsgErr += httpContext.getMessage( "Resultado Teorico        = ", "") + GXutil.trim( AV25CCSVal) + GXutil.newLine( ) ;
               AV32MsgErr += httpContext.getMessage( "Valor de Referencia      = ", "") + "+/- " + GXutil.str( AV47CCSVTol, 5, 2) + "%" + GXutil.newLine( ) ;
            }
            AV32MsgErr += GXutil.trim( AV56CCTLinDsc) + "                  = " + GXutil.trim( GXutil.str( AV46ValNum, 9, 2)) + GXutil.newLine( ) ;
            AV32MsgErr += httpContext.getMessage( "Rango Permitido          = ", "") + GXutil.trim( AV12CCValDsc) + GXutil.newLine( ) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV73GXLvl8 == 0 )
      {
         AV12CCValDsc = "" ;
         AV8Ok = (byte)(2) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP14[0] = controlcalidad_cc1_auditovalor_estandar.this.AV32MsgErr;
      this.aP15[0] = controlcalidad_cc1_auditovalor_estandar.this.AV21CCOk;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32MsgErr = "" ;
      AV46ValNum = DecimalUtil.ZERO ;
      AV11CCVal = "" ;
      scmdbuf = "" ;
      P0AQ42_A396EmprCod = new String[] {""} ;
      P0AQ42_A4034CCTLin = new short[1] ;
      P0AQ42_A4031CCTCod = new int[1] ;
      P0AQ42_A4060CCSVal = new String[] {""} ;
      P0AQ42_n4060CCSVal = new boolean[] {false} ;
      P0AQ42_A4059CCFColNum = new int[1] ;
      P0AQ42_A4058CCFColNom = new String[] {""} ;
      P0AQ42_A65ArtCod = new String[] {""} ;
      P0AQ42_A252CliCod = new int[1] ;
      P0AQ42_A11530CCSAuto = new byte[1] ;
      P0AQ42_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQ42_A4044CCTLinTpoD = new String[] {""} ;
      P0AQ42_A11482CCSMin = new String[] {""} ;
      P0AQ42_n11482CCSMin = new boolean[] {false} ;
      P0AQ42_A11483CCSMax = new String[] {""} ;
      P0AQ42_n11483CCSMax = new boolean[] {false} ;
      A4060CCSVal = "" ;
      A4058CCFColNom = "" ;
      A65ArtCod = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A4044CCTLinTpoD = "" ;
      A11482CCSMin = "" ;
      A11483CCSMax = "" ;
      P0AQ43_A396EmprCod = new String[] {""} ;
      P0AQ43_A4031CCTCod = new int[1] ;
      P0AQ43_A4034CCTLin = new short[1] ;
      P0AQ43_A4051CCTVal = new String[] {""} ;
      P0AQ43_A4050CCTValDsc = new String[] {""} ;
      P0AQ43_A4049CCTValLin = new byte[1] ;
      A4051CCTVal = "" ;
      A4050CCTValDsc = "" ;
      AV12CCValDsc = "" ;
      AV47CCSVTol = DecimalUtil.ZERO ;
      AV25CCSVal = "" ;
      AV23CCSMin1 = "" ;
      AV24CCSMax1 = "" ;
      AV45Cal = DecimalUtil.ZERO ;
      AV27CCSValF = GXutil.nullDate() ;
      AV10CCSMin = "" ;
      AV9CCSMax = "" ;
      AV66ValMin = DecimalUtil.ZERO ;
      AV67ValMax = DecimalUtil.ZERO ;
      AV68Valor = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV55CCTDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_cc1_auditovalor_estandar__default(),
         new Object[] {
             new Object[] {
            P0AQ42_A396EmprCod, P0AQ42_A4034CCTLin, P0AQ42_A4031CCTCod, P0AQ42_A4060CCSVal, P0AQ42_n4060CCSVal, P0AQ42_A4059CCFColNum, P0AQ42_A4058CCFColNom, P0AQ42_A65ArtCod, P0AQ42_A252CliCod, P0AQ42_A11530CCSAuto,
            P0AQ42_A11532CCSVTol, P0AQ42_A4044CCTLinTpoD, P0AQ42_A11482CCSMin, P0AQ42_n11482CCSMin, P0AQ42_A11483CCSMax, P0AQ42_n11483CCSMax
            }
            , new Object[] {
            P0AQ43_A396EmprCod, P0AQ43_A4031CCTCod, P0AQ43_A4034CCTLin, P0AQ43_A4051CCTVal, P0AQ43_A4050CCTValDsc, P0AQ43_A4049CCTValLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV53Barcodreo ;
   private byte AV21CCOk ;
   private byte AV8Ok ;
   private byte AV69CCSAuto ;
   private byte AV73GXLvl8 ;
   private byte A11530CCSAuto ;
   private byte AV74GXLvl17 ;
   private byte A4049CCTValLin ;
   private byte AV70ValorAux ;
   private byte AV31OkVal ;
   private short AV59BarOrdLin ;
   private short AV65CCTLin ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int AV60Clicod ;
   private int AV63barcolnum ;
   private int AV48Barcod ;
   private int AV64CCTCod ;
   private int A4031CCTCod ;
   private int A4059CCFColNum ;
   private int A252CliCod ;
   private long AV26CCSValN ;
   private java.math.BigDecimal AV46ValNum ;
   private java.math.BigDecimal A11532CCSVTol ;
   private java.math.BigDecimal AV47CCSVTol ;
   private java.math.BigDecimal AV45Cal ;
   private java.math.BigDecimal AV66ValMin ;
   private java.math.BigDecimal AV67ValMax ;
   private java.math.BigDecimal AV68Valor ;
   private String A396EmprCod ;
   private String AV61barser ;
   private String AV62barcolnom ;
   private String AV54barcodpar ;
   private String AV58ProCod ;
   private String AV56CCTLinDsc ;
   private String AV57ccvalin ;
   private String AV32MsgErr ;
   private String AV11CCVal ;
   private String scmdbuf ;
   private String A4060CCSVal ;
   private String A4058CCFColNom ;
   private String A65ArtCod ;
   private String A4044CCTLinTpoD ;
   private String A11482CCSMin ;
   private String A11483CCSMax ;
   private String A4051CCTVal ;
   private String A4050CCTValDsc ;
   private String AV12CCValDsc ;
   private String AV25CCSVal ;
   private String AV23CCSMin1 ;
   private String AV24CCSMax1 ;
   private String AV10CCSMin ;
   private String AV9CCSMax ;
   private String Gx_msg ;
   private String AV55CCTDsc ;
   private java.util.Date AV27CCSValF ;
   private boolean n4060CCSVal ;
   private boolean n11482CCSMin ;
   private boolean n11483CCSMax ;
   private byte[] aP15 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQ42_A396EmprCod ;
   private short[] P0AQ42_A4034CCTLin ;
   private int[] P0AQ42_A4031CCTCod ;
   private String[] P0AQ42_A4060CCSVal ;
   private boolean[] P0AQ42_n4060CCSVal ;
   private int[] P0AQ42_A4059CCFColNum ;
   private String[] P0AQ42_A4058CCFColNom ;
   private String[] P0AQ42_A65ArtCod ;
   private int[] P0AQ42_A252CliCod ;
   private byte[] P0AQ42_A11530CCSAuto ;
   private java.math.BigDecimal[] P0AQ42_A11532CCSVTol ;
   private String[] P0AQ42_A4044CCTLinTpoD ;
   private String[] P0AQ42_A11482CCSMin ;
   private boolean[] P0AQ42_n11482CCSMin ;
   private String[] P0AQ42_A11483CCSMax ;
   private boolean[] P0AQ42_n11483CCSMax ;
   private String[] P0AQ43_A396EmprCod ;
   private int[] P0AQ43_A4031CCTCod ;
   private short[] P0AQ43_A4034CCTLin ;
   private String[] P0AQ43_A4051CCTVal ;
   private String[] P0AQ43_A4050CCTValDsc ;
   private byte[] P0AQ43_A4049CCTValLin ;
}

final  class controlcalidad_cc1_auditovalor_estandar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQ42", "SELECT T1.EmprCod, T1.CCTLin, T1.CCTCod, T1.CCSVal, T1.CCFColNum, T1.CCFColNom, T1.ArtCod, T1.CliCod, T1.CCSAuto, T1.CCSVTol, T2.CCTLinTpoD, T1.CCSMin, T1.CCSMax FROM (TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) WHERE (T1.EmprCod = ? and T1.CCTCod = ? and T1.CCTLin = ?) AND (T1.ArtCod = ? or (rtrim(T1.ArtCod) IS NULL AND NOT(T1.ArtCod IS NULL))) AND (T1.CCFColNom = ? or (rtrim(T1.CCFColNom) IS NULL AND NOT(T1.CCFColNom IS NULL))) AND (T1.CCFColNum = ? or (T1.CCFColNum = 0)) AND (T1.CliCod = ?) ORDER BY T1.EmprCod, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQ43", "SELECT EmprCod, CCTCod, CCTLin, CCTVal, CCTValDsc, CCTValLin FROM TXPCCDef2 WHERE (EmprCod = ? and CCTCod = ? and CCTLin = ?) AND (CCTVal = ?) ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 40);
               }
               return;
      }
   }

}

