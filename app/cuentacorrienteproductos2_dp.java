package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cuentacorrienteproductos2_dp extends GXProcedure
{
   public cuentacorrienteproductos2_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cuentacorrienteproductos2_dp.class ), "" );
   }

   public cuentacorrienteproductos2_dp( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> executeUdp( String aP0 ,
                                                                             String aP1 ,
                                                                             java.util.Date aP2 ,
                                                                             java.util.Date aP3 ,
                                                                             String aP4 ,
                                                                             java.math.BigDecimal aP5 )
   {
      cuentacorrienteproductos2_dp.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>[] aP6 )
   {
      cuentacorrienteproductos2_dp.this.AV5Emprcod = aP0;
      cuentacorrienteproductos2_dp.this.AV6Prdnum = aP1;
      cuentacorrienteproductos2_dp.this.AV7CCstkfec = aP2;
      cuentacorrienteproductos2_dp.this.AV15CCstkfec_to = aP3;
      cuentacorrienteproductos2_dp.this.AV14TipMovCcIN = aP4;
      cuentacorrienteproductos2_dp.this.AV16Existencias = aP5;
      cuentacorrienteproductos2_dp.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Saldo = AV16Existencias ;
      AV9Compras = DecimalUtil.ZERO ;
      AV10Consumos = DecimalUtil.ZERO ;
      AV11Devoluciones = DecimalUtil.ZERO ;
      lV14TipMovCcIN = GXutil.padr( GXutil.rtrim( AV14TipMovCcIN), 2, "%") ;
      /* Using cursor P002G2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6Prdnum, AV7CCstkfec, lV14TipMovCcIN, AV14TipMovCcIN, AV15CCstkfec_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P002G2_A719PrdNum[0] ;
         A396EmprCod = P002G2_A396EmprCod[0] ;
         A3345TipMovCc = P002G2_A3345TipMovCc[0] ;
         A3343CCStkCanE = P002G2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P002G2_A3344CCStkCanS[0] ;
         A3342CCStkLin = P002G2_A3342CCStkLin[0] ;
         A3357CCStkDsc = P002G2_A3357CCStkDsc[0] ;
         A3349CCStkPre = P002G2_A3349CCStkPre[0] ;
         A5722CCStkLot = P002G2_A5722CCStkLot[0] ;
         A3353CCStkPed = P002G2_A3353CCStkPed[0] ;
         A3355CCStkUsu = P002G2_A3355CCStkUsu[0] ;
         A3352CCStkPar = P002G2_A3352CCStkPar[0] ;
         A3351CCStkReo = P002G2_A3351CCStkReo[0] ;
         A3350CCStkBar = P002G2_A3350CCStkBar[0] ;
         A3356CCStkHor = P002G2_A3356CCStkHor[0] ;
         A3348CCStkFec = P002G2_A3348CCStkFec[0] ;
         A13865CCstkdiaho = localUtil.ctot( localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+" "+A3356CCStkHor, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         if ( ! (0==A3350CCStkBar) )
         {
            A13866CCstkNHDR = GXutil.trim( GXutil.str( A3350CCStkBar, 8, 0)) + "-" + GXutil.str( A3351CCStkReo, 1, 0) + A3352CCStkPar ;
         }
         else
         {
            if ( (0==A3350CCStkBar) )
            {
               A13866CCstkNHDR = " " ;
            }
            else
            {
               A13866CCstkNHDR = "" ;
            }
         }
         Gxm1cuentacorrienteproductos2_sdt = (app.SdtCuentaCorrienteProductos2_SDT)new app.SdtCuentaCorrienteProductos2_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1cuentacorrienteproductos2_sdt, 0);
         GXt_decimal1 = AV8Saldo ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date4[0] = A3348CCStkFec ;
         GXv_decimal5[0] = GXt_decimal1 ;
         new app.core.existenciassr(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_date4, GXv_decimal5) ;
         cuentacorrienteproductos2_dp.this.A396EmprCod = GXv_char2[0] ;
         cuentacorrienteproductos2_dp.this.A719PrdNum = GXv_char3[0] ;
         cuentacorrienteproductos2_dp.this.A3348CCStkFec = GXv_date4[0] ;
         cuentacorrienteproductos2_dp.this.GXt_decimal1 = GXv_decimal5[0] ;
         AV8Saldo = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? GXt_decimal1 : AV8Saldo) ;
         AV12CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3343CCStkCanE) ;
         AV13CCStkCanS = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3344CCStkCanS) ;
         AV8Saldo = AV8Saldo.add((AV12CCStkCanE.subtract(AV13CCStkCanS))) ;
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklin( A3342CCStkLin );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdiahora( A13865CCstkdiaho );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Tipmovcc( A3345TipMovCc );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkdsc( A3357CCStkDsc );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcane( A3343CCStkCanE );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkcans( A3344CCStkCanS );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpre( A3349CCStkPre );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstklot( A5722CCStkLot );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkped( A3353CCStkPed );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkusu( A3355CCStkUsu );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkbar( A3350CCStkBar );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkreo( A3351CCStkReo );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkpar( A3352CCStkPar );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstknhdr( A13866CCstkNHDR );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Ccstkfec( A3348CCStkFec );
         Gxm1cuentacorrienteproductos2_sdt.setgxTv_SdtCuentaCorrienteProductos2_SDT_Existencias( AV8Saldo );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = cuentacorrienteproductos2_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>(app.SdtCuentaCorrienteProductos2_SDT.class, "CuentaCorrienteProductos2_SDT", "TexplusNET", remoteHandle);
      AV8Saldo = DecimalUtil.ZERO ;
      AV9Compras = DecimalUtil.ZERO ;
      AV10Consumos = DecimalUtil.ZERO ;
      AV11Devoluciones = DecimalUtil.ZERO ;
      lV14TipMovCcIN = "" ;
      scmdbuf = "" ;
      P002G2_A719PrdNum = new String[] {""} ;
      P002G2_A396EmprCod = new String[] {""} ;
      P002G2_A3345TipMovCc = new String[] {""} ;
      P002G2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002G2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002G2_A3342CCStkLin = new long[1] ;
      P002G2_A3357CCStkDsc = new String[] {""} ;
      P002G2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002G2_A5722CCStkLot = new String[] {""} ;
      P002G2_A3353CCStkPed = new int[1] ;
      P002G2_A3355CCStkUsu = new String[] {""} ;
      P002G2_A3352CCStkPar = new String[] {""} ;
      P002G2_A3351CCStkReo = new byte[1] ;
      P002G2_A3350CCStkBar = new int[1] ;
      P002G2_A3356CCStkHor = new String[] {""} ;
      P002G2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A3345TipMovCc = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A3355CCStkUsu = "" ;
      A3352CCStkPar = "" ;
      A3356CCStkHor = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A13865CCstkdiaho = GXutil.resetTime( GXutil.nullDate() );
      A13866CCstkNHDR = "" ;
      Gxm1cuentacorrienteproductos2_sdt = new app.SdtCuentaCorrienteProductos2_SDT(remoteHandle, context);
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV12CCStkCanE = DecimalUtil.ZERO ;
      AV13CCStkCanS = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cuentacorrienteproductos2_dp__default(),
         new Object[] {
             new Object[] {
            P002G2_A719PrdNum, P002G2_A396EmprCod, P002G2_A3345TipMovCc, P002G2_A3343CCStkCanE, P002G2_A3344CCStkCanS, P002G2_A3342CCStkLin, P002G2_A3357CCStkDsc, P002G2_A3349CCStkPre, P002G2_A5722CCStkLot, P002G2_A3353CCStkPed,
            P002G2_A3355CCStkUsu, P002G2_A3352CCStkPar, P002G2_A3351CCStkReo, P002G2_A3350CCStkBar, P002G2_A3356CCStkHor, P002G2_A3348CCStkFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private short Gx_err ;
   private int A3353CCStkPed ;
   private int A3350CCStkBar ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV16Existencias ;
   private java.math.BigDecimal AV8Saldo ;
   private java.math.BigDecimal AV9Compras ;
   private java.math.BigDecimal AV10Consumos ;
   private java.math.BigDecimal AV11Devoluciones ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV12CCStkCanE ;
   private java.math.BigDecimal AV13CCStkCanS ;
   private String AV5Emprcod ;
   private String AV6Prdnum ;
   private String AV14TipMovCcIN ;
   private String lV14TipMovCcIN ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A3345TipMovCc ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3355CCStkUsu ;
   private String A3352CCStkPar ;
   private String A3356CCStkHor ;
   private String A13866CCstkNHDR ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private java.util.Date A13865CCstkdiaho ;
   private java.util.Date AV7CCstkfec ;
   private java.util.Date AV15CCstkfec_to ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date GXv_date4[] ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P002G2_A719PrdNum ;
   private String[] P002G2_A396EmprCod ;
   private String[] P002G2_A3345TipMovCc ;
   private java.math.BigDecimal[] P002G2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P002G2_A3344CCStkCanS ;
   private long[] P002G2_A3342CCStkLin ;
   private String[] P002G2_A3357CCStkDsc ;
   private java.math.BigDecimal[] P002G2_A3349CCStkPre ;
   private String[] P002G2_A5722CCStkLot ;
   private int[] P002G2_A3353CCStkPed ;
   private String[] P002G2_A3355CCStkUsu ;
   private String[] P002G2_A3352CCStkPar ;
   private byte[] P002G2_A3351CCStkReo ;
   private int[] P002G2_A3350CCStkBar ;
   private String[] P002G2_A3356CCStkHor ;
   private java.util.Date[] P002G2_A3348CCStkFec ;
   private GXBaseCollection<app.SdtCuentaCorrienteProductos2_SDT> Gxm2rootcol ;
   private app.SdtCuentaCorrienteProductos2_SDT Gxm1cuentacorrienteproductos2_sdt ;
}

final  class cuentacorrienteproductos2_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002G2", "SELECT PrdNum, EmprCod, TipMovCc, CCStkCanE, CCStkCanS, CCStkLin, CCStkDsc, CCStkPre, CCStkLot, CCStkPed, CCStkUsu, CCStkPar, CCStkReo, CCStkBar, CCStkHor, CCStkFec FROM TXPCCSTKS WHERE (EmprCod = ? and PrdNum = ? and CCStkFec >= ?) AND (TipMovCc like ? or (rtrim(?) IS NULL)) AND (TipMovCc <> 'EC') AND (CCStkFec <= ?) ORDER BY EmprCod, PrdNum, CCStkFec, CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 2);
               stmt.setString(5, (String)parms[4], 2);
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

