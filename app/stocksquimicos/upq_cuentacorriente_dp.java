package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_dp extends GXProcedure
{
   public upq_cuentacorriente_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_dp.class ), "" );
   }

   public upq_cuentacorriente_dp( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT> executeUdp( String aP0 ,
                                                                                      String aP1 ,
                                                                                      java.util.Date aP2 ,
                                                                                      java.util.Date aP3 ,
                                                                                      java.math.BigDecimal aP4 )
   {
      upq_cuentacorriente_dp.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        java.math.BigDecimal aP4 ,
                        GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             java.math.BigDecimal aP4 ,
                             GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT>[] aP5 )
   {
      upq_cuentacorriente_dp.this.AV5EmprCod = aP0;
      upq_cuentacorriente_dp.this.AV6Prdnum = aP1;
      upq_cuentacorriente_dp.this.AV7CCstkfecfrom = aP2;
      upq_cuentacorriente_dp.this.AV8CCstkfecto = aP3;
      upq_cuentacorriente_dp.this.AV12SaldoInicial = aP4;
      upq_cuentacorriente_dp.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Exis = AV12SaldoInicial ;
      /* Using cursor P002S2 */
      pr_default.execute(0, new Object[] {AV5EmprCod, AV6Prdnum, AV7CCstkfecfrom, AV8CCstkfecto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P002S2_A719PrdNum[0] ;
         A396EmprCod = P002S2_A396EmprCod[0] ;
         A3348CCStkFec = P002S2_A3348CCStkFec[0] ;
         A3345TipMovCc = P002S2_A3345TipMovCc[0] ;
         A718PrdNom = P002S2_A718PrdNom[0] ;
         A3342CCStkLin = P002S2_A3342CCStkLin[0] ;
         A3357CCStkDsc = P002S2_A3357CCStkDsc[0] ;
         A3349CCStkPre = P002S2_A3349CCStkPre[0] ;
         A5722CCStkLot = P002S2_A5722CCStkLot[0] ;
         A13979CCStkLotFe = P002S2_A13979CCStkLotFe[0] ;
         A3352CCStkPar = P002S2_A3352CCStkPar[0] ;
         A3351CCStkReo = P002S2_A3351CCStkReo[0] ;
         A3350CCStkBar = P002S2_A3350CCStkBar[0] ;
         A3355CCStkUsu = P002S2_A3355CCStkUsu[0] ;
         A3353CCStkPed = P002S2_A3353CCStkPed[0] ;
         A3358CCStkLen = P002S2_A3358CCStkLen[0] ;
         A3343CCStkCanE = P002S2_A3343CCStkCanE[0] ;
         A3344CCStkCanS = P002S2_A3344CCStkCanS[0] ;
         A3356CCStkHor = P002S2_A3356CCStkHor[0] ;
         A718PrdNom = P002S2_A718PrdNom[0] ;
         Gxm1upq_cuentacorriente_sdt = (app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT)new app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1upq_cuentacorriente_sdt, 0);
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnum( A719PrdNum );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Prdnom( A718PrdNom );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklin( A3342CCStkLin );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Diahora( localUtil.dtoc( A3348CCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")+" "+A3356CCStkHor );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Tipmovcc( A3345TipMovCc );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkdsc( A3357CCStkDsc );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpre( A3349CCStkPre );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklot( A5722CCStkLot );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklotfech( A13979CCStkLotFe );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Hdr( ((A3350CCStkBar==0) ? " " : GXutil.str( A3350CCStkBar, 8, 0)+"-"+GXutil.str( A3351CCStkReo, 1, 0)+A3352CCStkPar) );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkusu( A3355CCStkUsu );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkbar( A3350CCStkBar );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkreo( A3351CCStkReo );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkpar( A3352CCStkPar );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkped( A3353CCStkPed );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstklen( A3358CCStkLen );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkfec( A3348CCStkFec );
         AV9CCStkCanE = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3343CCStkCanE) ;
         AV10Ccstkcans = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? DecimalUtil.doubleToDec(0) : A3344CCStkCanS) ;
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcane( AV9CCStkCanE );
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Ccstkcans( AV10Ccstkcans );
         AV11Exis = AV11Exis.add((AV9CCStkCanE.subtract(AV10Ccstkcans))) ;
         GXt_decimal1 = AV11Exis ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.stocksquimicos.upq_cuentacorriente_recuento(remoteHandle, context).execute( AV5EmprCod, AV6Prdnum, A3348CCStkFec, GXv_decimal2) ;
         upq_cuentacorriente_dp.this.GXt_decimal1 = GXv_decimal2[0] ;
         AV11Exis = ((GXutil.strcmp(A3345TipMovCc, "SR")==0) ? GXt_decimal1 : AV11Exis) ;
         Gxm1upq_cuentacorriente_sdt.setgxTv_SdtUPQ_CuentaCorriente_SDT_Exis( AV11Exis );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = upq_cuentacorriente_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT>(app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT.class, "UPQ_CuentaCorriente_SDT", "TexplusNET", remoteHandle);
      AV11Exis = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P002S2_A719PrdNum = new String[] {""} ;
      P002S2_A396EmprCod = new String[] {""} ;
      P002S2_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P002S2_A3345TipMovCc = new String[] {""} ;
      P002S2_A718PrdNom = new String[] {""} ;
      P002S2_A3342CCStkLin = new long[1] ;
      P002S2_A3357CCStkDsc = new String[] {""} ;
      P002S2_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002S2_A5722CCStkLot = new String[] {""} ;
      P002S2_A13979CCStkLotFe = new java.util.Date[] {GXutil.nullDate()} ;
      P002S2_A3352CCStkPar = new String[] {""} ;
      P002S2_A3351CCStkReo = new byte[1] ;
      P002S2_A3350CCStkBar = new int[1] ;
      P002S2_A3355CCStkUsu = new String[] {""} ;
      P002S2_A3353CCStkPed = new int[1] ;
      P002S2_A3358CCStkLen = new short[1] ;
      P002S2_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002S2_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002S2_A3356CCStkHor = new String[] {""} ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3345TipMovCc = "" ;
      A718PrdNom = "" ;
      A3357CCStkDsc = "" ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A5722CCStkLot = "" ;
      A13979CCStkLotFe = GXutil.nullDate() ;
      A3352CCStkPar = "" ;
      A3355CCStkUsu = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3356CCStkHor = "" ;
      Gxm1upq_cuentacorriente_sdt = new app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT(remoteHandle, context);
      AV9CCStkCanE = DecimalUtil.ZERO ;
      AV10Ccstkcans = DecimalUtil.ZERO ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_dp__default(),
         new Object[] {
             new Object[] {
            P002S2_A719PrdNum, P002S2_A396EmprCod, P002S2_A3348CCStkFec, P002S2_A3345TipMovCc, P002S2_A718PrdNom, P002S2_A3342CCStkLin, P002S2_A3357CCStkDsc, P002S2_A3349CCStkPre, P002S2_A5722CCStkLot, P002S2_A13979CCStkLotFe,
            P002S2_A3352CCStkPar, P002S2_A3351CCStkReo, P002S2_A3350CCStkBar, P002S2_A3355CCStkUsu, P002S2_A3353CCStkPed, P002S2_A3358CCStkLen, P002S2_A3343CCStkCanE, P002S2_A3344CCStkCanS, P002S2_A3356CCStkHor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A3351CCStkReo ;
   private short A3358CCStkLen ;
   private short Gx_err ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV12SaldoInicial ;
   private java.math.BigDecimal AV11Exis ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal AV9CCStkCanE ;
   private java.math.BigDecimal AV10Ccstkcans ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String AV5EmprCod ;
   private String AV6Prdnum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A3345TipMovCc ;
   private String A718PrdNom ;
   private String A3357CCStkDsc ;
   private String A5722CCStkLot ;
   private String A3352CCStkPar ;
   private String A3355CCStkUsu ;
   private String A3356CCStkHor ;
   private java.util.Date AV7CCstkfecfrom ;
   private java.util.Date AV8CCstkfecto ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date A13979CCStkLotFe ;
   private GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P002S2_A719PrdNum ;
   private String[] P002S2_A396EmprCod ;
   private java.util.Date[] P002S2_A3348CCStkFec ;
   private String[] P002S2_A3345TipMovCc ;
   private String[] P002S2_A718PrdNom ;
   private long[] P002S2_A3342CCStkLin ;
   private String[] P002S2_A3357CCStkDsc ;
   private java.math.BigDecimal[] P002S2_A3349CCStkPre ;
   private String[] P002S2_A5722CCStkLot ;
   private java.util.Date[] P002S2_A13979CCStkLotFe ;
   private String[] P002S2_A3352CCStkPar ;
   private byte[] P002S2_A3351CCStkReo ;
   private int[] P002S2_A3350CCStkBar ;
   private String[] P002S2_A3355CCStkUsu ;
   private int[] P002S2_A3353CCStkPed ;
   private short[] P002S2_A3358CCStkLen ;
   private java.math.BigDecimal[] P002S2_A3343CCStkCanE ;
   private java.math.BigDecimal[] P002S2_A3344CCStkCanS ;
   private String[] P002S2_A3356CCStkHor ;
   private GXBaseCollection<app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT> Gxm2rootcol ;
   private app.stocksquimicos.SdtUPQ_CuentaCorriente_SDT Gxm1upq_cuentacorriente_sdt ;
}

final  class upq_cuentacorriente_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002S2", "SELECT T1.PrdNum, T1.EmprCod, T1.CCStkFec, T1.TipMovCc, T2.PrdNom, T1.CCStkLin, T1.CCStkDsc, T1.CCStkPre, T1.CCStkLot, T1.CCStkLotFe, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkUsu, T1.CCStkPed, T1.CCStkLen, T1.CCStkCanE, T1.CCStkCanS, T1.CCStkHor FROM (TXPCCSTKS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ? and T1.PrdNum = ? and T1.CCStkFec >= ?) AND (T1.TipMovCc <> 'EC') AND (T1.CCStkFec <= ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.CCStkFec, T1.CCStkHor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
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
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
      }
   }

}

