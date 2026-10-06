package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformealmacentejidocrudodistribucion extends GXProcedure
{
   public dpinformealmacentejidocrudodistribucion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformealmacentejidocrudodistribucion.class ), "" );
   }

   public dpinformealmacentejidocrudodistribucion( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTInformeAlmacenenCrudoDistribucion> executeUdp( String aP0 ,
                                                                                    java.util.Date aP1 ,
                                                                                    java.util.Date aP2 ,
                                                                                    int aP3 ,
                                                                                    int aP4 ,
                                                                                    String aP5 ,
                                                                                    String aP6 ,
                                                                                    short aP7 ,
                                                                                    short aP8 ,
                                                                                    byte aP9 ,
                                                                                    byte aP10 ,
                                                                                    String aP11 ,
                                                                                    String aP12 ,
                                                                                    short aP13 ,
                                                                                    String aP14 ,
                                                                                    int aP15 )
   {
      dpinformealmacentejidocrudodistribucion.this.aP16 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTInformeAlmacenenCrudoDistribucion>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        String aP5 ,
                        String aP6 ,
                        short aP7 ,
                        short aP8 ,
                        byte aP9 ,
                        byte aP10 ,
                        String aP11 ,
                        String aP12 ,
                        short aP13 ,
                        String aP14 ,
                        int aP15 ,
                        GXBaseCollection<app.SdtSDTInformeAlmacenenCrudoDistribucion>[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             String aP5 ,
                             String aP6 ,
                             short aP7 ,
                             short aP8 ,
                             byte aP9 ,
                             byte aP10 ,
                             String aP11 ,
                             String aP12 ,
                             short aP13 ,
                             String aP14 ,
                             int aP15 ,
                             GXBaseCollection<app.SdtSDTInformeAlmacenenCrudoDistribucion>[] aP16 )
   {
      dpinformealmacentejidocrudodistribucion.this.AV5Emprcod = aP0;
      dpinformealmacentejidocrudodistribucion.this.AV7AlbRFen = aP1;
      dpinformealmacentejidocrudodistribucion.this.AV28AlbRFen_to = aP2;
      dpinformealmacentejidocrudodistribucion.this.AV6Clicod = aP3;
      dpinformealmacentejidocrudodistribucion.this.AV32CliCod_to = aP4;
      dpinformealmacentejidocrudodistribucion.this.AV8AlbRef = aP5;
      dpinformealmacentejidocrudodistribucion.this.AV26AlbRef_to = aP6;
      dpinformealmacentejidocrudodistribucion.this.AV9AlbRTartC = aP7;
      dpinformealmacentejidocrudodistribucion.this.AV30AlbRTartC_to = aP8;
      dpinformealmacentejidocrudodistribucion.this.AV33Albrestfrom = aP9;
      dpinformealmacentejidocrudodistribucion.this.AV34Albrestto = aP10;
      dpinformealmacentejidocrudodistribucion.this.AV35AlbREntfrom = aP11;
      dpinformealmacentejidocrudodistribucion.this.AV36AlbREntto = aP12;
      dpinformealmacentejidocrudodistribucion.this.AV37TipEntCod = aP13;
      dpinformealmacentejidocrudodistribucion.this.AV38Tipo = aP14;
      dpinformealmacentejidocrudodistribucion.this.AV39AlbReccod = aP15;
      dpinformealmacentejidocrudodistribucion.this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV35AlbREntfrom ,
                                           AV36AlbREntto ,
                                           Integer.valueOf(AV39AlbReccod) ,
                                           A46AlbREnt ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV32CliCod_to) ,
                                           A45AlbRef ,
                                           AV8AlbRef ,
                                           AV26AlbRef_to ,
                                           Short.valueOf(A6263AlbRTartC) ,
                                           Short.valueOf(AV9AlbRTartC) ,
                                           Short.valueOf(AV30AlbRTartC_to) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV33Albrestfrom) ,
                                           Byte.valueOf(AV34Albrestto) ,
                                           A55AlbRReo ,
                                           AV38Tipo ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV37TipEntCod) ,
                                           AV5Emprcod ,
                                           AV7AlbRFen ,
                                           Integer.valueOf(AV6Clicod) ,
                                           A396EmprCod ,
                                           A49AlbRFen ,
                                           AV28AlbRFen_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P00202 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV7AlbRFen, Integer.valueOf(AV6Clicod), Integer.valueOf(AV32CliCod_to), AV8AlbRef, AV26AlbRef_to, Short.valueOf(AV9AlbRTartC), Short.valueOf(AV30AlbRTartC_to), Byte.valueOf(AV33Albrestfrom), Byte.valueOf(AV34Albrestto), Short.valueOf(AV37TipEntCod), Short.valueOf(AV37TipEntCod), AV28AlbRFen_to, AV35AlbREntfrom, AV36AlbREntto, Integer.valueOf(AV39AlbReccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00202_A396EmprCod[0] ;
         A44AlbRecCod = P00202_A44AlbRecCod[0] ;
         A46AlbREnt = P00202_A46AlbREnt[0] ;
         A1211TipEntCod = P00202_A1211TipEntCod[0] ;
         n1211TipEntCod = P00202_n1211TipEntCod[0] ;
         A55AlbRReo = P00202_A55AlbRReo[0] ;
         A47AlbREst = P00202_A47AlbREst[0] ;
         A6263AlbRTartC = P00202_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P00202_n6263AlbRTartC[0] ;
         A45AlbRef = P00202_A45AlbRef[0] ;
         A49AlbRFen = P00202_A49AlbRFen[0] ;
         A252CliCod = P00202_A252CliCod[0] ;
         A279CliNom = P00202_A279CliNom[0] ;
         A5806AlbREnt2 = P00202_A5806AlbREnt2[0] ;
         A6463AlbRLote = P00202_A6463AlbRLote[0] ;
         A58AlbRUniEnt = P00202_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P00202_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P00202_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P00202_A52AlbRPieEnt[0] ;
         A279CliNom = P00202_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV38Tipo) == 0 ) || ( GXutil.strcmp(AV38Tipo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            Gxm1sdtinformealmacenencrudodistribucion = (app.SdtSDTInformeAlmacenenCrudoDistribucion)new app.SdtSDTInformeAlmacenenCrudoDistribucion(remoteHandle, context);
            Gxm2rootcol.add(Gxm1sdtinformealmacenencrudodistribucion, 0);
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clicod( A252CliCod );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Clinom( A279CliNom );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albreccod( A44AlbRecCod );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrfen( A49AlbRFen );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrent2( ((GXutil.strcmp("", A5806AlbREnt2)==0) ? A46AlbREnt : A5806AlbREnt2) );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albrlote( A6463AlbRLote );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesentradas( A58AlbRUniEnt );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadesutilizadas( A60AlbRUniUti );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Unidadeslibres( (A58AlbRUniEnt.subtract(A60AlbRUniUti)) );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasentradas( A52AlbRPieEnt );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasutilizadas( A54AlbRPieUti );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Piezasdisponibles( A51AlbRPieDis );
            AV10Barnhdr = "" ;
            AV24FechaHdr = GXutil.nullDate() ;
            AV11Barser = "" ;
            AV12Barserdsc = "" ;
            AV13Barcolnom = "" ;
            AV14Barcolnum = 0 ;
            AV15Bartipcol = (byte)(0) ;
            AV16BarKgm = DecimalUtil.ZERO ;
            AV17BarMtr = DecimalUtil.ZERO ;
            AV18BarPie = 0 ;
            AV19AlbProcod = 0 ;
            AV20Albprofch = GXutil.nullDate() ;
            AV21BarAlbKgmE = DecimalUtil.ZERO ;
            AV22BarAlbMtrE = DecimalUtil.ZERO ;
            AV23BarAlbPie = 0 ;
            /* Using cursor P00204 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A159BarFecGen = P00204_A159BarFecGen[0] ;
               A212BarSer = P00204_A212BarSer[0] ;
               A1652BarSerDsc = P00204_A1652BarSerDsc[0] ;
               A135BarColNom = P00204_A135BarColNom[0] ;
               A136BarColNum = P00204_A136BarColNum[0] ;
               A218BarTipCol = P00204_A218BarTipCol[0] ;
               A166BarKgm = P00204_A166BarKgm[0] ;
               A184BarMtr = P00204_A184BarMtr[0] ;
               A199BarPie1 = P00204_A199BarPie1[0] ;
               A365DisDes = P00204_A365DisDes[0] ;
               A898BarPieNDes = P00204_A898BarPieNDes[0] ;
               A130BarCodPar = P00204_A130BarCodPar[0] ;
               A132BarCodReo = P00204_A132BarCodReo[0] ;
               A129BarCod = P00204_A129BarCod[0] ;
               A200BarPieCod = P00204_A200BarPieCod[0] ;
               A159BarFecGen = P00204_A159BarFecGen[0] ;
               A212BarSer = P00204_A212BarSer[0] ;
               A1652BarSerDsc = P00204_A1652BarSerDsc[0] ;
               A135BarColNom = P00204_A135BarColNom[0] ;
               A136BarColNum = P00204_A136BarColNum[0] ;
               A218BarTipCol = P00204_A218BarTipCol[0] ;
               A365DisDes = P00204_A365DisDes[0] ;
               A166BarKgm = P00204_A166BarKgm[0] ;
               A184BarMtr = P00204_A184BarMtr[0] ;
               A199BarPie1 = P00204_A199BarPie1[0] ;
               A898BarPieNDes = P00204_A898BarPieNDes[0] ;
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               AV10Barnhdr = A13696BarNHdr ;
               AV24FechaHdr = A159BarFecGen ;
               AV11Barser = A212BarSer ;
               AV12Barserdsc = A1652BarSerDsc ;
               AV13Barcolnom = A135BarColNom ;
               AV14Barcolnum = A136BarColNum ;
               AV15Bartipcol = A218BarTipCol ;
               AV16BarKgm = A166BarKgm ;
               AV17BarMtr = A184BarMtr ;
               AV18BarPie = A198BarPie ;
               /* Using cursor P00205 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A30AlbProCod = P00205_A30AlbProCod[0] ;
                  A34AlbProfch = P00205_A34AlbProfch[0] ;
                  A1261BarAlbKgmE = P00205_A1261BarAlbKgmE[0] ;
                  A1263BarAlbMtrE = P00205_A1263BarAlbMtrE[0] ;
                  A1265BarAlbPie = P00205_A1265BarAlbPie[0] ;
                  A34AlbProfch = P00205_A34AlbProfch[0] ;
                  AV19AlbProcod = A30AlbProCod ;
                  AV20Albprofch = A34AlbProfch ;
                  AV21BarAlbKgmE = AV21BarAlbKgmE.add(A1261BarAlbKgmE) ;
                  AV22BarAlbMtrE = AV22BarAlbMtrE.add(A1263BarAlbMtrE) ;
                  AV23BarAlbPie = (int)(AV23BarAlbPie+A1265BarAlbPie) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               pr_default.readNext(1);
            }
            pr_default.close(1);
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barnhdr( AV10Barnhdr );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Fechahdr( AV24FechaHdr );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barser( AV11Barser );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barserdsc( AV12Barserdsc );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnom( AV13Barcolnom );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barcolnum( AV14Barcolnum );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Bartipcol( AV15Bartipcol );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barkgm( AV16BarKgm );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barmtr( AV17BarMtr );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Barpie( AV18BarPie );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprocod( AV19AlbProcod );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Albprofch( AV20Albprofch );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbkgme( AV21BarAlbKgmE );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbmtre( AV22BarAlbMtrE );
            Gxm1sdtinformealmacenencrudodistribucion.setgxTv_SdtSDTInformeAlmacenenCrudoDistribucion_Baralbpie( AV23BarAlbPie );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP16[0] = dpinformealmacentejidocrudodistribucion.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTInformeAlmacenenCrudoDistribucion>(app.SdtSDTInformeAlmacenenCrudoDistribucion.class, "SDTInformeAlmacenenCrudoDistribucion", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A55AlbRReo = "" ;
      A396EmprCod = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      P00202_A396EmprCod = new String[] {""} ;
      P00202_A44AlbRecCod = new int[1] ;
      P00202_A46AlbREnt = new String[] {""} ;
      P00202_A1211TipEntCod = new short[1] ;
      P00202_n1211TipEntCod = new boolean[] {false} ;
      P00202_A55AlbRReo = new String[] {""} ;
      P00202_A47AlbREst = new byte[1] ;
      P00202_A6263AlbRTartC = new short[1] ;
      P00202_n6263AlbRTartC = new boolean[] {false} ;
      P00202_A45AlbRef = new String[] {""} ;
      P00202_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P00202_A252CliCod = new int[1] ;
      P00202_A279CliNom = new String[] {""} ;
      P00202_A5806AlbREnt2 = new String[] {""} ;
      P00202_A6463AlbRLote = new String[] {""} ;
      P00202_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00202_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00202_A54AlbRPieUti = new int[1] ;
      P00202_A52AlbRPieEnt = new int[1] ;
      A279CliNom = "" ;
      A5806AlbREnt2 = "" ;
      A6463AlbRLote = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      Gxm1sdtinformealmacenencrudodistribucion = new app.SdtSDTInformeAlmacenenCrudoDistribucion(remoteHandle, context);
      AV10Barnhdr = "" ;
      AV24FechaHdr = GXutil.nullDate() ;
      AV11Barser = "" ;
      AV12Barserdsc = "" ;
      AV13Barcolnom = "" ;
      AV16BarKgm = DecimalUtil.ZERO ;
      AV17BarMtr = DecimalUtil.ZERO ;
      AV20Albprofch = GXutil.nullDate() ;
      AV21BarAlbKgmE = DecimalUtil.ZERO ;
      AV22BarAlbMtrE = DecimalUtil.ZERO ;
      P00204_A396EmprCod = new String[] {""} ;
      P00204_A44AlbRecCod = new int[1] ;
      P00204_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P00204_A212BarSer = new String[] {""} ;
      P00204_A1652BarSerDsc = new String[] {""} ;
      P00204_A135BarColNom = new String[] {""} ;
      P00204_A136BarColNum = new int[1] ;
      P00204_A218BarTipCol = new byte[1] ;
      P00204_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00204_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00204_A199BarPie1 = new short[1] ;
      P00204_A365DisDes = new String[] {""} ;
      P00204_A898BarPieNDes = new int[1] ;
      P00204_A130BarCodPar = new String[] {""} ;
      P00204_A132BarCodReo = new byte[1] ;
      P00204_A129BarCod = new int[1] ;
      P00204_A200BarPieCod = new String[] {""} ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A13696BarNHdr = "" ;
      P00205_A396EmprCod = new String[] {""} ;
      P00205_A129BarCod = new int[1] ;
      P00205_A132BarCodReo = new byte[1] ;
      P00205_A130BarCodPar = new String[] {""} ;
      P00205_A30AlbProCod = new long[1] ;
      P00205_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P00205_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00205_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00205_A1265BarAlbPie = new int[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpinformealmacentejidocrudodistribucion__default(),
         new Object[] {
             new Object[] {
            P00202_A396EmprCod, P00202_A44AlbRecCod, P00202_A46AlbREnt, P00202_A1211TipEntCod, P00202_n1211TipEntCod, P00202_A55AlbRReo, P00202_A47AlbREst, P00202_A6263AlbRTartC, P00202_n6263AlbRTartC, P00202_A45AlbRef,
            P00202_A49AlbRFen, P00202_A252CliCod, P00202_A279CliNom, P00202_A5806AlbREnt2, P00202_A6463AlbRLote, P00202_A58AlbRUniEnt, P00202_A60AlbRUniUti, P00202_A54AlbRPieUti, P00202_A52AlbRPieEnt
            }
            , new Object[] {
            P00204_A396EmprCod, P00204_A44AlbRecCod, P00204_A159BarFecGen, P00204_A212BarSer, P00204_A1652BarSerDsc, P00204_A135BarColNom, P00204_A136BarColNum, P00204_A218BarTipCol, P00204_A166BarKgm, P00204_A184BarMtr,
            P00204_A199BarPie1, P00204_A365DisDes, P00204_A898BarPieNDes, P00204_A130BarCodPar, P00204_A132BarCodReo, P00204_A129BarCod, P00204_A200BarPieCod
            }
            , new Object[] {
            P00205_A396EmprCod, P00205_A129BarCod, P00205_A132BarCodReo, P00205_A130BarCodPar, P00205_A30AlbProCod, P00205_A34AlbProfch, P00205_A1261BarAlbKgmE, P00205_A1263BarAlbMtrE, P00205_A1265BarAlbPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV33Albrestfrom ;
   private byte AV34Albrestto ;
   private byte A47AlbREst ;
   private byte AV15Bartipcol ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private short AV9AlbRTartC ;
   private short AV30AlbRTartC_to ;
   private short AV37TipEntCod ;
   private short A6263AlbRTartC ;
   private short A1211TipEntCod ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int AV32CliCod_to ;
   private int AV39AlbReccod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A51AlbRPieDis ;
   private int AV14Barcolnum ;
   private int AV18BarPie ;
   private int AV23BarAlbPie ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int A1265BarAlbPie ;
   private long AV19AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV16BarKgm ;
   private java.math.BigDecimal AV17BarMtr ;
   private java.math.BigDecimal AV21BarAlbKgmE ;
   private java.math.BigDecimal AV22BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String AV5Emprcod ;
   private String AV8AlbRef ;
   private String AV26AlbRef_to ;
   private String AV35AlbREntfrom ;
   private String AV36AlbREntto ;
   private String AV38Tipo ;
   private String scmdbuf ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A55AlbRReo ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A5806AlbREnt2 ;
   private String A6463AlbRLote ;
   private String AV10Barnhdr ;
   private String AV11Barser ;
   private String AV12Barserdsc ;
   private String AV13Barcolnom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A365DisDes ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String A13696BarNHdr ;
   private java.util.Date AV7AlbRFen ;
   private java.util.Date AV28AlbRFen_to ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV24FechaHdr ;
   private java.util.Date AV20Albprofch ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A34AlbProfch ;
   private boolean n1211TipEntCod ;
   private boolean n6263AlbRTartC ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenenCrudoDistribucion>[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P00202_A396EmprCod ;
   private int[] P00202_A44AlbRecCod ;
   private String[] P00202_A46AlbREnt ;
   private short[] P00202_A1211TipEntCod ;
   private boolean[] P00202_n1211TipEntCod ;
   private String[] P00202_A55AlbRReo ;
   private byte[] P00202_A47AlbREst ;
   private short[] P00202_A6263AlbRTartC ;
   private boolean[] P00202_n6263AlbRTartC ;
   private String[] P00202_A45AlbRef ;
   private java.util.Date[] P00202_A49AlbRFen ;
   private int[] P00202_A252CliCod ;
   private String[] P00202_A279CliNom ;
   private String[] P00202_A5806AlbREnt2 ;
   private String[] P00202_A6463AlbRLote ;
   private java.math.BigDecimal[] P00202_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P00202_A60AlbRUniUti ;
   private int[] P00202_A54AlbRPieUti ;
   private int[] P00202_A52AlbRPieEnt ;
   private String[] P00204_A396EmprCod ;
   private int[] P00204_A44AlbRecCod ;
   private java.util.Date[] P00204_A159BarFecGen ;
   private String[] P00204_A212BarSer ;
   private String[] P00204_A1652BarSerDsc ;
   private String[] P00204_A135BarColNom ;
   private int[] P00204_A136BarColNum ;
   private byte[] P00204_A218BarTipCol ;
   private java.math.BigDecimal[] P00204_A166BarKgm ;
   private java.math.BigDecimal[] P00204_A184BarMtr ;
   private short[] P00204_A199BarPie1 ;
   private String[] P00204_A365DisDes ;
   private int[] P00204_A898BarPieNDes ;
   private String[] P00204_A130BarCodPar ;
   private byte[] P00204_A132BarCodReo ;
   private int[] P00204_A129BarCod ;
   private String[] P00204_A200BarPieCod ;
   private String[] P00205_A396EmprCod ;
   private int[] P00205_A129BarCod ;
   private byte[] P00205_A132BarCodReo ;
   private String[] P00205_A130BarCodPar ;
   private long[] P00205_A30AlbProCod ;
   private java.util.Date[] P00205_A34AlbProfch ;
   private java.math.BigDecimal[] P00205_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00205_A1263BarAlbMtrE ;
   private int[] P00205_A1265BarAlbPie ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenenCrudoDistribucion> Gxm2rootcol ;
   private app.SdtSDTInformeAlmacenenCrudoDistribucion Gxm1sdtinformealmacenencrudodistribucion ;
}

final  class dpinformealmacentejidocrudodistribucion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00202( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV35AlbREntfrom ,
                                          String AV36AlbREntto ,
                                          int AV39AlbReccod ,
                                          String A46AlbREnt ,
                                          int A44AlbRecCod ,
                                          int A252CliCod ,
                                          int AV32CliCod_to ,
                                          String A45AlbRef ,
                                          String AV8AlbRef ,
                                          String AV26AlbRef_to ,
                                          short A6263AlbRTartC ,
                                          short AV9AlbRTartC ,
                                          short AV30AlbRTartC_to ,
                                          byte A47AlbREst ,
                                          byte AV33Albrestfrom ,
                                          byte AV34Albrestto ,
                                          String A55AlbRReo ,
                                          String AV38Tipo ,
                                          short A1211TipEntCod ,
                                          short AV37TipEntCod ,
                                          String AV5Emprcod ,
                                          java.util.Date AV7AlbRFen ,
                                          int AV6Clicod ,
                                          String A396EmprCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date AV28AlbRFen_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[16];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRecCod, T1.AlbREnt, T1.TipEntCod, T1.AlbRReo, T1.AlbREst, T1.AlbRTartC, T1.AlbRef, T1.AlbRFen, T1.CliCod, T2.CliNom, T1.AlbREnt2, T1.AlbRLote," ;
      scmdbuf += " T1.AlbRUniEnt, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRPieEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRFen >= ? and T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC >= ?)");
      addWhere(sWhereString, "(T1.AlbRTartC <= ?)");
      addWhere(sWhereString, "(T1.AlbREst >= ?)");
      addWhere(sWhereString, "(T1.AlbREst <= ?)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      if ( ! (GXutil.strcmp("", AV35AlbREntfrom)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt >= ?)");
      }
      else
      {
         GXv_int1[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36AlbREntto)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt <= ?)");
      }
      else
      {
         GXv_int1[14] = (byte)(1) ;
      }
      if ( ! (0==AV39AlbReccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int1[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRFen, T1.CliCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_P00202(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00202", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00204", "SELECT T1.EmprCod, T1.AlbRecCod, T2.BarFecGen, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarTipCol, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarPieCod FROM ((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00205", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbProCod, T2.AlbProfch, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 2);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((String[]) buf[13])[0] = rslt.getString(12, 20);
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

