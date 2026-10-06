package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class confirmacionpreciodocumento_producciones_dp extends GXProcedure
{
   public confirmacionpreciodocumento_producciones_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( confirmacionpreciodocumento_producciones_dp.class ), "" );
   }

   public confirmacionpreciodocumento_producciones_dp( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item> executeUdp( String aP0 ,
                                                                                                             long aP1 )
   {
      confirmacionpreciodocumento_producciones_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item>[] aP2 )
   {
      confirmacionpreciodocumento_producciones_dp.this.AV5Emprcod = aP0;
      confirmacionpreciodocumento_producciones_dp.this.AV6AlbProcod = aP1;
      confirmacionpreciodocumento_producciones_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P003A2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Long.valueOf(AV6AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P003A2_A396EmprCod[0] ;
         A30AlbProCod = P003A2_A30AlbProCod[0] ;
         A143BarDisNum = P003A2_A143BarDisNum[0] ;
         A4812BarEncCli = P003A2_A4812BarEncCli[0] ;
         A129BarCod = P003A2_A129BarCod[0] ;
         A132BarCodReo = P003A2_A132BarCodReo[0] ;
         A130BarCodPar = P003A2_A130BarCodPar[0] ;
         A212BarSer = P003A2_A212BarSer[0] ;
         A1652BarSerDsc = P003A2_A1652BarSerDsc[0] ;
         A135BarColNom = P003A2_A135BarColNom[0] ;
         A136BarColNum = P003A2_A136BarColNum[0] ;
         A218BarTipCol = P003A2_A218BarTipCol[0] ;
         A1263BarAlbMtrE = P003A2_A1263BarAlbMtrE[0] ;
         A1264BarPreMtr = P003A2_A1264BarPreMtr[0] ;
         A1261BarAlbKgmE = P003A2_A1261BarAlbKgmE[0] ;
         A1262BarPreKgm = P003A2_A1262BarPreKgm[0] ;
         A32AlbProEsp = P003A2_A32AlbProEsp[0] ;
         A5354AlbImpMan = P003A2_A5354AlbImpMan[0] ;
         A40AlbProRec = P003A2_A40AlbProRec[0] ;
         A2761AlbBarRec = P003A2_A2761AlbBarRec[0] ;
         A143BarDisNum = P003A2_A143BarDisNum[0] ;
         A4812BarEncCli = P003A2_A4812BarEncCli[0] ;
         A212BarSer = P003A2_A212BarSer[0] ;
         A1652BarSerDsc = P003A2_A1652BarSerDsc[0] ;
         A135BarColNom = P003A2_A135BarColNom[0] ;
         A136BarColNum = P003A2_A136BarColNum[0] ;
         A218BarTipCol = P003A2_A218BarTipCol[0] ;
         Gxm1confirmacionpreciodocumento_producciones_sdt = (app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)new app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1confirmacionpreciodocumento_producciones_sdt, 0);
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion( false );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla( httpContext.getMessage( "ALBBAR", "") );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli( ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod( A129BarCod );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo( A132BarCodReo );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar( A130BarCodPar );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser( A212BarSer );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc( A1652BarSerDsc );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom( A135BarColNom );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum( A136BarColNum );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol( A218BarTipCol );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre( A1263BarAlbMtrE );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr( A1264BarPreMtr );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme( A1261BarAlbKgmE );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm( A1262BarPreKgm );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp( A32AlbProEsp );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman( A5354AlbImpMan );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec( A40AlbProRec );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin( (short)(0) );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod( "" );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc( "" );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec( A2761AlbBarRec );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P003A3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Long.valueOf(AV6AlbProcod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P003A3_A396EmprCod[0] ;
         A30AlbProCod = P003A3_A30AlbProCod[0] ;
         A143BarDisNum = P003A3_A143BarDisNum[0] ;
         A4812BarEncCli = P003A3_A4812BarEncCli[0] ;
         A129BarCod = P003A3_A129BarCod[0] ;
         A132BarCodReo = P003A3_A132BarCodReo[0] ;
         A130BarCodPar = P003A3_A130BarCodPar[0] ;
         A212BarSer = P003A3_A212BarSer[0] ;
         A1652BarSerDsc = P003A3_A1652BarSerDsc[0] ;
         A135BarColNom = P003A3_A135BarColNom[0] ;
         A136BarColNum = P003A3_A136BarColNum[0] ;
         A218BarTipCol = P003A3_A218BarTipCol[0] ;
         A1242GuiFasPMt = P003A3_A1242GuiFasPMt[0] ;
         A1276FasMtr = P003A3_A1276FasMtr[0] ;
         A1275FasKgm = P003A3_A1275FasKgm[0] ;
         A1241GuiFasPKg = P003A3_A1241GuiFasPKg[0] ;
         A7752GuiFasRec = P003A3_A7752GuiFasRec[0] ;
         n7752GuiFasRec = P003A3_n7752GuiFasRec[0] ;
         A1240GuiFasLin = P003A3_A1240GuiFasLin[0] ;
         A457FasCod = P003A3_A457FasCod[0] ;
         A460FasDsc = P003A3_A460FasDsc[0] ;
         A143BarDisNum = P003A3_A143BarDisNum[0] ;
         A4812BarEncCli = P003A3_A4812BarEncCli[0] ;
         A212BarSer = P003A3_A212BarSer[0] ;
         A1652BarSerDsc = P003A3_A1652BarSerDsc[0] ;
         A135BarColNom = P003A3_A135BarColNom[0] ;
         A136BarColNum = P003A3_A136BarColNum[0] ;
         A218BarTipCol = P003A3_A218BarTipCol[0] ;
         A460FasDsc = P003A3_A460FasDsc[0] ;
         Gxm1confirmacionpreciodocumento_producciones_sdt = (app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)new app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1confirmacionpreciodocumento_producciones_sdt, 0);
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion( false );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla( httpContext.getMessage( "ALBFAS", "") );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli( ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod( A129BarCod );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo( A132BarCodReo );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar( A130BarCodPar );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser( A212BarSer );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc( A1652BarSerDsc );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom( A135BarColNom );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum( A136BarColNum );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol( A218BarTipCol );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre( A1242GuiFasPMt );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr( A1276FasMtr );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme( A1275FasKgm );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm( A1241GuiFasPKg );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp( (byte)(0) );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman( DecimalUtil.doubleToDec(0) );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec( A7752GuiFasRec );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin( A1240GuiFasLin );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod( A457FasCod );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc( A460FasDsc );
         Gxm1confirmacionpreciodocumento_producciones_sdt.setgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec( DecimalUtil.doubleToDec(0) );
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = confirmacionpreciodocumento_producciones_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item>(app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P003A2_A396EmprCod = new String[] {""} ;
      P003A2_A30AlbProCod = new long[1] ;
      P003A2_A143BarDisNum = new String[] {""} ;
      P003A2_A4812BarEncCli = new String[] {""} ;
      P003A2_A129BarCod = new int[1] ;
      P003A2_A132BarCodReo = new byte[1] ;
      P003A2_A130BarCodPar = new String[] {""} ;
      P003A2_A212BarSer = new String[] {""} ;
      P003A2_A1652BarSerDsc = new String[] {""} ;
      P003A2_A135BarColNom = new String[] {""} ;
      P003A2_A136BarColNum = new int[1] ;
      P003A2_A218BarTipCol = new byte[1] ;
      P003A2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_A32AlbProEsp = new byte[1] ;
      P003A2_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A2_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      Gxm1confirmacionpreciodocumento_producciones_sdt = new app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item(remoteHandle, context);
      P003A3_A396EmprCod = new String[] {""} ;
      P003A3_A30AlbProCod = new long[1] ;
      P003A3_A143BarDisNum = new String[] {""} ;
      P003A3_A4812BarEncCli = new String[] {""} ;
      P003A3_A129BarCod = new int[1] ;
      P003A3_A132BarCodReo = new byte[1] ;
      P003A3_A130BarCodPar = new String[] {""} ;
      P003A3_A212BarSer = new String[] {""} ;
      P003A3_A1652BarSerDsc = new String[] {""} ;
      P003A3_A135BarColNom = new String[] {""} ;
      P003A3_A136BarColNum = new int[1] ;
      P003A3_A218BarTipCol = new byte[1] ;
      P003A3_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A3_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A3_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A3_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A3_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003A3_n7752GuiFasRec = new boolean[] {false} ;
      P003A3_A1240GuiFasLin = new short[1] ;
      P003A3_A457FasCod = new String[] {""} ;
      P003A3_A460FasDsc = new String[] {""} ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.confirmacionpreciodocumento_producciones_dp__default(),
         new Object[] {
             new Object[] {
            P003A2_A396EmprCod, P003A2_A30AlbProCod, P003A2_A143BarDisNum, P003A2_A4812BarEncCli, P003A2_A129BarCod, P003A2_A132BarCodReo, P003A2_A130BarCodPar, P003A2_A212BarSer, P003A2_A1652BarSerDsc, P003A2_A135BarColNom,
            P003A2_A136BarColNum, P003A2_A218BarTipCol, P003A2_A1263BarAlbMtrE, P003A2_A1264BarPreMtr, P003A2_A1261BarAlbKgmE, P003A2_A1262BarPreKgm, P003A2_A32AlbProEsp, P003A2_A5354AlbImpMan, P003A2_A40AlbProRec, P003A2_A2761AlbBarRec
            }
            , new Object[] {
            P003A3_A396EmprCod, P003A3_A30AlbProCod, P003A3_A143BarDisNum, P003A3_A4812BarEncCli, P003A3_A129BarCod, P003A3_A132BarCodReo, P003A3_A130BarCodPar, P003A3_A212BarSer, P003A3_A1652BarSerDsc, P003A3_A135BarColNom,
            P003A3_A136BarColNum, P003A3_A218BarTipCol, P003A3_A1242GuiFasPMt, P003A3_A1276FasMtr, P003A3_A1275FasKgm, P003A3_A1241GuiFasPKg, P003A3_A7752GuiFasRec, P003A3_n7752GuiFasRec, P003A3_A1240GuiFasLin, P003A3_A457FasCod,
            P003A3_A460FasDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A32AlbProEsp ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private long AV6AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private boolean n7752GuiFasRec ;
   private GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P003A2_A396EmprCod ;
   private long[] P003A2_A30AlbProCod ;
   private String[] P003A2_A143BarDisNum ;
   private String[] P003A2_A4812BarEncCli ;
   private int[] P003A2_A129BarCod ;
   private byte[] P003A2_A132BarCodReo ;
   private String[] P003A2_A130BarCodPar ;
   private String[] P003A2_A212BarSer ;
   private String[] P003A2_A1652BarSerDsc ;
   private String[] P003A2_A135BarColNom ;
   private int[] P003A2_A136BarColNum ;
   private byte[] P003A2_A218BarTipCol ;
   private java.math.BigDecimal[] P003A2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P003A2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P003A2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P003A2_A1262BarPreKgm ;
   private byte[] P003A2_A32AlbProEsp ;
   private java.math.BigDecimal[] P003A2_A5354AlbImpMan ;
   private java.math.BigDecimal[] P003A2_A40AlbProRec ;
   private java.math.BigDecimal[] P003A2_A2761AlbBarRec ;
   private String[] P003A3_A396EmprCod ;
   private long[] P003A3_A30AlbProCod ;
   private String[] P003A3_A143BarDisNum ;
   private String[] P003A3_A4812BarEncCli ;
   private int[] P003A3_A129BarCod ;
   private byte[] P003A3_A132BarCodReo ;
   private String[] P003A3_A130BarCodPar ;
   private String[] P003A3_A212BarSer ;
   private String[] P003A3_A1652BarSerDsc ;
   private String[] P003A3_A135BarColNom ;
   private int[] P003A3_A136BarColNum ;
   private byte[] P003A3_A218BarTipCol ;
   private java.math.BigDecimal[] P003A3_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P003A3_A1276FasMtr ;
   private java.math.BigDecimal[] P003A3_A1275FasKgm ;
   private java.math.BigDecimal[] P003A3_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P003A3_A7752GuiFasRec ;
   private boolean[] P003A3_n7752GuiFasRec ;
   private short[] P003A3_A1240GuiFasLin ;
   private String[] P003A3_A457FasCod ;
   private String[] P003A3_A460FasDsc ;
   private GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item Gxm1confirmacionpreciodocumento_producciones_sdt ;
}

final  class confirmacionpreciodocumento_producciones_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003A2", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarDisNum, T2.BarEncCli, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.BarAlbMtrE, T1.BarPreMtr, T1.BarAlbKgmE, T1.BarPreKgm, T1.AlbProEsp, T1.AlbImpMan, T1.AlbProRec, T1.AlbBarRec FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003A3", "SELECT T1.EmprCod, T1.AlbProCod, T2.BarDisNum, T2.BarEncCli, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.GuiFasPMt, T1.FasMtr, T1.FasKgm, T1.GuiFasPKg, T1.GuiFasRec, T1.GuiFasLin, T1.FasCod, T3.FasDsc FROM ((TXPALBFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 8);
               ((String[]) buf[20])[0] = rslt.getString(20, 28);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

