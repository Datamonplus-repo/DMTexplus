package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class diariodefacturacion_lineas_dp extends GXProcedure
{
   public diariodefacturacion_lineas_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( diariodefacturacion_lineas_dp.class ), "" );
   }

   public diariodefacturacion_lineas_dp( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item> executeUdp( String aP0 ,
                                                                                               int aP1 ,
                                                                                               int aP2 ,
                                                                                               java.util.Date aP3 ,
                                                                                               java.util.Date aP4 ,
                                                                                               String aP5 ,
                                                                                               String aP6 ,
                                                                                               short aP7 )
   {
      diariodefacturacion_lineas_dp.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
                        GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>[] aP8 )
   {
      diariodefacturacion_lineas_dp.this.AV11Emprcod = aP0;
      diariodefacturacion_lineas_dp.this.AV9Clicodfrom = aP1;
      diariodefacturacion_lineas_dp.this.AV10Clicodto = aP2;
      diariodefacturacion_lineas_dp.this.AV12Facfchfrom = aP3;
      diariodefacturacion_lineas_dp.this.AV13Facfchto = aP4;
      diariodefacturacion_lineas_dp.this.AV8FacPri = aP5;
      diariodefacturacion_lineas_dp.this.AV7FacSerNum = aP6;
      diariodefacturacion_lineas_dp.this.AV16noserie = aP7;
      diariodefacturacion_lineas_dp.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV10Clicodto) ,
                                           Integer.valueOf(AV9Clicodfrom) ,
                                           AV13Facfchto ,
                                           AV12Facfchfrom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A436FacFch ,
                                           A450FacPri ,
                                           AV8FacPri ,
                                           A2739FacSerNum ,
                                           AV7FacSerNum ,
                                           Short.valueOf(AV16noserie) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT
                                           }
      });
      /* Using cursor P00412 */
      pr_default.execute(0, new Object[] {AV8FacPri, AV8FacPri, AV7FacSerNum, Short.valueOf(AV16noserie), Integer.valueOf(AV10Clicodto), Integer.valueOf(AV9Clicodfrom), AV13Facfchto, AV12Facfchfrom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A436FacFch = P00412_A436FacFch[0] ;
         A252CliCod = P00412_A252CliCod[0] ;
         A2739FacSerNum = P00412_A2739FacSerNum[0] ;
         A450FacPri = P00412_A450FacPri[0] ;
         A454FacSer = P00412_A454FacSer[0] ;
         A427FacAlbCod = P00412_A427FacAlbCod[0] ;
         A1294FacBarCod = P00412_A1294FacBarCod[0] ;
         A1295FacBarReo = P00412_A1295FacBarReo[0] ;
         A1296FacBarPar = P00412_A1296FacBarPar[0] ;
         A428FacAlbTip = P00412_A428FacAlbTip[0] ;
         A279CliNom = P00412_A279CliNom[0] ;
         A432FacDsc = P00412_A432FacDsc[0] ;
         A446FacLin = P00412_A446FacLin[0] ;
         A430FacCod = P00412_A430FacCod[0] ;
         A396EmprCod = P00412_A396EmprCod[0] ;
         A12197FacUnds = P00412_A12197FacUnds[0] ;
         A3897FacKgsA = P00412_A3897FacKgsA[0] ;
         A3898FacPreKgsA = P00412_A3898FacPreKgsA[0] ;
         A12198FacPreUnd = P00412_A12198FacPreUnd[0] ;
         A449FacPreMts = P00412_A449FacPreMts[0] ;
         A5353FacImpMan = P00412_A5353FacImpMan[0] ;
         A447FacMts = P00412_A447FacMts[0] ;
         A444FacKgs = P00412_A444FacKgs[0] ;
         A448FacPreKgs = P00412_A448FacPreKgs[0] ;
         A5355FacImpMin = P00412_A5355FacImpMin[0] ;
         A436FacFch = P00412_A436FacFch[0] ;
         A252CliCod = P00412_A252CliCod[0] ;
         A2739FacSerNum = P00412_A2739FacSerNum[0] ;
         A450FacPri = P00412_A450FacPri[0] ;
         A279CliNom = P00412_A279CliNom[0] ;
         A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
         if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
         {
            A3923FacImp1 = A5355FacImpMin ;
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
            {
               A3923FacImp1 = A5353FacImpMan ;
            }
            else
            {
               if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
               {
                  A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A3923FacImp1 = A2239FacIml ;
               }
            }
         }
         A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
         Gxm1diariodefacturacion_lineas_sdt = (app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item)new app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1diariodefacturacion_lineas_sdt, 0);
         AV5varlen = (short)(GXutil.len( GXutil.trim( A454FacSer))) ;
         AV6posicion = (short)(AV5varlen+4) ;
         GXt_int1 = AV18BarAlbPie ;
         GXv_char2[0] = A1296FacBarPar ;
         GXv_date3[0] = AV17AlbProfch ;
         GXv_int4[0] = GXt_int1 ;
         new app.facturacion.diariodefacturacion_datos(remoteHandle, context).execute( A396EmprCod, A427FacAlbCod, A1294FacBarCod, A1295FacBarReo, GXv_char2, A428FacAlbTip, GXv_date3, GXv_int4) ;
         diariodefacturacion_lineas_dp.this.A1296FacBarPar = GXv_char2[0] ;
         diariodefacturacion_lineas_dp.this.AV17AlbProfch = GXv_date3[0] ;
         diariodefacturacion_lineas_dp.this.GXt_int1 = GXv_int4[0] ;
         AV18BarAlbPie = GXt_int1 ;
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facfch( A436FacFch );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Faccod( A430FacCod );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clicod( A252CliCod );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Clinom( A279CliNom );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facalbcod( A427FacAlbCod );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Albprofch( AV17AlbProfch );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facser( A454FacSer );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Color( ((AV5varlen==0) ? "" : GXutil.substring( A432FacDsc, AV6posicion, 13)) );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Fackgs( A444FacKgs );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facprekgs( A448FacPreKgs );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facmts( A447FacMts );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facpremts( A449FacPreMts );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Baralbpie( AV18BarAlbPie );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Facimp( A438FacImp );
         Gxm1diariodefacturacion_lineas_sdt.setgxTv_SdtDiariodeFacturacion_lineas_SDT_Item_Barnhdr( ((A1294FacBarCod>0) ? GXutil.str( A1294FacBarCod, 8, 0)+"-"+GXutil.str( A1295FacBarReo, 1, 0)+A1296FacBarPar : " ") );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = diariodefacturacion_lineas_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>(app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A2739FacSerNum = "" ;
      P00412_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P00412_A252CliCod = new int[1] ;
      P00412_A2739FacSerNum = new String[] {""} ;
      P00412_A450FacPri = new String[] {""} ;
      P00412_A454FacSer = new String[] {""} ;
      P00412_A427FacAlbCod = new long[1] ;
      P00412_A1294FacBarCod = new int[1] ;
      P00412_A1295FacBarReo = new byte[1] ;
      P00412_A1296FacBarPar = new String[] {""} ;
      P00412_A428FacAlbTip = new byte[1] ;
      P00412_A279CliNom = new String[] {""} ;
      P00412_A432FacDsc = new String[] {""} ;
      P00412_A446FacLin = new int[1] ;
      P00412_A430FacCod = new int[1] ;
      P00412_A396EmprCod = new String[] {""} ;
      P00412_A12197FacUnds = new int[1] ;
      P00412_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00412_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A454FacSer = "" ;
      A1296FacBarPar = "" ;
      A279CliNom = "" ;
      A432FacDsc = "" ;
      A396EmprCod = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      Gxm1diariodefacturacion_lineas_sdt = new app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item(remoteHandle, context);
      GXv_char2 = new String[1] ;
      AV17AlbProfch = GXutil.nullDate() ;
      GXv_date3 = new java.util.Date[1] ;
      GXv_int4 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.diariodefacturacion_lineas_dp__default(),
         new Object[] {
             new Object[] {
            P00412_A436FacFch, P00412_A252CliCod, P00412_A2739FacSerNum, P00412_A450FacPri, P00412_A454FacSer, P00412_A427FacAlbCod, P00412_A1294FacBarCod, P00412_A1295FacBarReo, P00412_A1296FacBarPar, P00412_A428FacAlbTip,
            P00412_A279CliNom, P00412_A432FacDsc, P00412_A446FacLin, P00412_A430FacCod, P00412_A396EmprCod, P00412_A12197FacUnds, P00412_A3897FacKgsA, P00412_A3898FacPreKgsA, P00412_A12198FacPreUnd, P00412_A449FacPreMts,
            P00412_A5353FacImpMan, P00412_A447FacMts, P00412_A444FacKgs, P00412_A448FacPreKgs, P00412_A5355FacImpMin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private short AV16noserie ;
   private short AV5varlen ;
   private short AV6posicion ;
   private short Gx_err ;
   private int AV9Clicodfrom ;
   private int AV10Clicodto ;
   private int A252CliCod ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private int A430FacCod ;
   private int A12197FacUnds ;
   private int AV18BarAlbPie ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A438FacImp ;
   private String AV11Emprcod ;
   private String AV8FacPri ;
   private String AV7FacSerNum ;
   private String scmdbuf ;
   private String A450FacPri ;
   private String A2739FacSerNum ;
   private String A454FacSer ;
   private String A1296FacBarPar ;
   private String A279CliNom ;
   private String A432FacDsc ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private java.util.Date AV12Facfchfrom ;
   private java.util.Date AV13Facfchto ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV17AlbProfch ;
   private java.util.Date GXv_date3[] ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00412_A436FacFch ;
   private int[] P00412_A252CliCod ;
   private String[] P00412_A2739FacSerNum ;
   private String[] P00412_A450FacPri ;
   private String[] P00412_A454FacSer ;
   private long[] P00412_A427FacAlbCod ;
   private int[] P00412_A1294FacBarCod ;
   private byte[] P00412_A1295FacBarReo ;
   private String[] P00412_A1296FacBarPar ;
   private byte[] P00412_A428FacAlbTip ;
   private String[] P00412_A279CliNom ;
   private String[] P00412_A432FacDsc ;
   private int[] P00412_A446FacLin ;
   private int[] P00412_A430FacCod ;
   private String[] P00412_A396EmprCod ;
   private int[] P00412_A12197FacUnds ;
   private java.math.BigDecimal[] P00412_A3897FacKgsA ;
   private java.math.BigDecimal[] P00412_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P00412_A12198FacPreUnd ;
   private java.math.BigDecimal[] P00412_A449FacPreMts ;
   private java.math.BigDecimal[] P00412_A5353FacImpMan ;
   private java.math.BigDecimal[] P00412_A447FacMts ;
   private java.math.BigDecimal[] P00412_A444FacKgs ;
   private java.math.BigDecimal[] P00412_A448FacPreKgs ;
   private java.math.BigDecimal[] P00412_A5355FacImpMin ;
   private GXBaseCollection<app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtDiariodeFacturacion_lineas_SDT_Item Gxm1diariodefacturacion_lineas_sdt ;
}

final  class diariodefacturacion_lineas_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00412( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV10Clicodto ,
                                          int AV9Clicodfrom ,
                                          java.util.Date AV13Facfchto ,
                                          java.util.Date AV12Facfchfrom ,
                                          int A252CliCod ,
                                          java.util.Date A436FacFch ,
                                          String A450FacPri ,
                                          String AV8FacPri ,
                                          String A2739FacSerNum ,
                                          String AV7FacSerNum ,
                                          short AV16noserie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[8];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T2.FacFch, T2.CliCod, T2.FacSerNum, T2.FacPri, T1.FacSer, T1.FacAlbCod, T1.FacBarCod, T1.FacBarReo, T1.FacBarPar, T1.FacAlbTip, T3.CliNom, T1.FacDsc, T1.FacLin," ;
      scmdbuf += " T1.FacCod, T1.EmprCod, T1.FacUnds, T1.FacKgsA, T1.FacPreKgsA, T1.FacPreUnd, T1.FacPreMts, T1.FacImpMan, T1.FacMts, T1.FacKgs, T1.FacPreKgs, T1.FacImpMin FROM ((TXPLFAVEN" ;
      scmdbuf += " T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T2.FacPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.FacSerNum = ? or ? = 1)");
      if ( ! (0==AV10Clicodto) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV9Clicodfrom) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13Facfchto)) )
      {
         addWhere(sWhereString, "(T2.FacFch <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12Facfchfrom)) )
      {
         addWhere(sWhereString, "(T2.FacFch >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.FacFch, T1.FacCod, T1.FacLin" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00412(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00412", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 1);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
      }
   }

}

