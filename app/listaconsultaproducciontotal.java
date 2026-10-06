package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listaconsultaproducciontotal extends GXProcedure
{
   public listaconsultaproducciontotal( int remoteHandle )
   {
      super( true, remoteHandle , new ModelContext( listaconsultaproducciontotal.class ), "" );
   }

   public listaconsultaproducciontotal( int remoteHandle ,
                                        ModelContext context )
   {
      super( true, remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            int aP2 ,
                            String aP3 ,
                            String aP4 ,
                            java.util.Date aP5 ,
                            java.util.Date aP6 ,
                            byte aP7 ,
                            byte aP8 ,
                            java.util.Date aP9 ,
                            java.util.Date aP10 ,
                            java.util.Date aP11 ,
                            java.util.Date aP12 ,
                            java.util.Date aP13 ,
                            java.util.Date aP14 ,
                            String aP15 ,
                            String aP16 ,
                            short aP17 ,
                            short aP18 ,
                            String aP19 ,
                            String aP20 ,
                            int aP21 ,
                            int aP22 ,
                            String aP23 ,
                            String aP24 ,
                            int aP25 ,
                            int aP26 ,
                            short aP27 ,
                            short aP28 ,
                            String aP29 ,
                            int aP30 ,
                            int aP31 ,
                            byte aP32 ,
                            byte aP33 ,
                            String aP34 ,
                            String aP35 ,
                            String aP36 ,
                            String aP37 ,
                            String aP38 ,
                            java.math.BigDecimal[] aP39 ,
                            java.math.BigDecimal[] aP40 )
   {
      listaconsultaproducciontotal.this.aP41 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41);
      return aP41[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        java.util.Date aP5 ,
                        java.util.Date aP6 ,
                        byte aP7 ,
                        byte aP8 ,
                        java.util.Date aP9 ,
                        java.util.Date aP10 ,
                        java.util.Date aP11 ,
                        java.util.Date aP12 ,
                        java.util.Date aP13 ,
                        java.util.Date aP14 ,
                        String aP15 ,
                        String aP16 ,
                        short aP17 ,
                        short aP18 ,
                        String aP19 ,
                        String aP20 ,
                        int aP21 ,
                        int aP22 ,
                        String aP23 ,
                        String aP24 ,
                        int aP25 ,
                        int aP26 ,
                        short aP27 ,
                        short aP28 ,
                        String aP29 ,
                        int aP30 ,
                        int aP31 ,
                        byte aP32 ,
                        byte aP33 ,
                        String aP34 ,
                        String aP35 ,
                        String aP36 ,
                        String aP37 ,
                        String aP38 ,
                        java.math.BigDecimal[] aP39 ,
                        java.math.BigDecimal[] aP40 ,
                        short[] aP41 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.util.Date aP5 ,
                             java.util.Date aP6 ,
                             byte aP7 ,
                             byte aP8 ,
                             java.util.Date aP9 ,
                             java.util.Date aP10 ,
                             java.util.Date aP11 ,
                             java.util.Date aP12 ,
                             java.util.Date aP13 ,
                             java.util.Date aP14 ,
                             String aP15 ,
                             String aP16 ,
                             short aP17 ,
                             short aP18 ,
                             String aP19 ,
                             String aP20 ,
                             int aP21 ,
                             int aP22 ,
                             String aP23 ,
                             String aP24 ,
                             int aP25 ,
                             int aP26 ,
                             short aP27 ,
                             short aP28 ,
                             String aP29 ,
                             int aP30 ,
                             int aP31 ,
                             byte aP32 ,
                             byte aP33 ,
                             String aP34 ,
                             String aP35 ,
                             String aP36 ,
                             String aP37 ,
                             String aP38 ,
                             java.math.BigDecimal[] aP39 ,
                             java.math.BigDecimal[] aP40 ,
                             short[] aP41 )
   {
      listaconsultaproducciontotal.this.AV59Emprcod = aP0;
      listaconsultaproducciontotal.this.AV44CliCodfrom = aP1;
      listaconsultaproducciontotal.this.AV45CliCodto = aP2;
      listaconsultaproducciontotal.this.AV21BarDisNumfrom = aP3;
      listaconsultaproducciontotal.this.AV22BarDisNumto = aP4;
      listaconsultaproducciontotal.this.AV29BarFecGenfrom = aP5;
      listaconsultaproducciontotal.this.AV30BarFecGento = aP6;
      listaconsultaproducciontotal.this.AV40BarSitfrom = aP7;
      listaconsultaproducciontotal.this.AV41BarSitto = aP8;
      listaconsultaproducciontotal.this.AV25BarFecClifrom = aP9;
      listaconsultaproducciontotal.this.AV26BarFecClito = aP10;
      listaconsultaproducciontotal.this.AV27BarFecFprfrom = aP11;
      listaconsultaproducciontotal.this.AV28BarFecFprto = aP12;
      listaconsultaproducciontotal.this.AV31BarFecSalfrom = aP13;
      listaconsultaproducciontotal.this.AV32BarFecSalto = aP14;
      listaconsultaproducciontotal.this.AV38BarSerfrom = aP15;
      listaconsultaproducciontotal.this.AV39BarSerto = aP16;
      listaconsultaproducciontotal.this.AV42BarTipArtfrom = aP17;
      listaconsultaproducciontotal.this.AV43BarTipArtto = aP18;
      listaconsultaproducciontotal.this.AV17BarColNomfrom = aP19;
      listaconsultaproducciontotal.this.AV18BarColNomto = aP20;
      listaconsultaproducciontotal.this.AV19BarColNumfrom = aP21;
      listaconsultaproducciontotal.this.AV20BarColNumto = aP22;
      listaconsultaproducciontotal.this.AV34BarNomClifrom = aP23;
      listaconsultaproducciontotal.this.AV35BarNomClito = aP24;
      listaconsultaproducciontotal.this.AV36BarNumClifrom = aP25;
      listaconsultaproducciontotal.this.AV37BarNumClito = aP26;
      listaconsultaproducciontotal.this.AV42BarTipArtfrom = aP27;
      listaconsultaproducciontotal.this.AV43BarTipArtto = aP28;
      listaconsultaproducciontotal.this.AV77muestras = aP29;
      listaconsultaproducciontotal.this.AV11BarCodfrom = aP30;
      listaconsultaproducciontotal.this.AV16BarCodto = aP31;
      listaconsultaproducciontotal.this.AV14BarCodReofrom = aP32;
      listaconsultaproducciontotal.this.AV15BarCodReoto = aP33;
      listaconsultaproducciontotal.this.AV12BarCodParfrom = aP34;
      listaconsultaproducciontotal.this.AV13BarCodParto = aP35;
      listaconsultaproducciontotal.this.AV165Cod_idtx = aP36;
      listaconsultaproducciontotal.this.AV33BarGirar = aP37;
      listaconsultaproducciontotal.this.AV63FilterFullText = aP38;
      listaconsultaproducciontotal.this.aP39 = aP39;
      listaconsultaproducciontotal.this.aP40 = aP40;
      listaconsultaproducciontotal.this.aP41 = aP41;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63FilterFullText ,
                                           AV21BarDisNumfrom ,
                                           AV22BarDisNumto ,
                                           Integer.valueOf(AV44CliCodfrom) ,
                                           Integer.valueOf(AV45CliCodto) ,
                                           Byte.valueOf(AV40BarSitfrom) ,
                                           Byte.valueOf(AV41BarSitto) ,
                                           AV29BarFecGenfrom ,
                                           AV30BarFecGento ,
                                           AV31BarFecSalfrom ,
                                           AV32BarFecSalto ,
                                           AV25BarFecClifrom ,
                                           AV26BarFecClito ,
                                           AV27BarFecFprfrom ,
                                           AV28BarFecFprto ,
                                           AV38BarSerfrom ,
                                           AV39BarSerto ,
                                           AV17BarColNomfrom ,
                                           AV18BarColNomto ,
                                           Integer.valueOf(AV19BarColNumfrom) ,
                                           Integer.valueOf(AV20BarColNumto) ,
                                           AV34BarNomClifrom ,
                                           AV35BarNomClito ,
                                           Integer.valueOf(AV36BarNumClifrom) ,
                                           Integer.valueOf(AV37BarNumClito) ,
                                           Short.valueOf(AV42BarTipArtfrom) ,
                                           Short.valueOf(AV43BarTipArtto) ,
                                           Integer.valueOf(AV11BarCodfrom) ,
                                           Integer.valueOf(AV16BarCodto) ,
                                           Byte.valueOf(AV14BarCodReofrom) ,
                                           Byte.valueOf(AV15BarCodReoto) ,
                                           AV12BarCodParfrom ,
                                           AV13BarCodParto ,
                                           AV165Cod_idtx ,
                                           AV33BarGirar ,
                                           AV77muestras ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14319CP_BARAGRE ,
                                           A14311CP_BARSER ,
                                           A14312CP_BARSERD ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14343CP_TARTDSC ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           c14336CP_BARKGM ,
                                           A14337CP_BARMTR ,
                                           Integer.valueOf(A14338CP_BARPIE) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14339CP_BARALBK ,
                                           A14340CP_BARALBM ,
                                           A14317CP_BARGIRA ,
                                           A14323CP_BARPROP ,
                                           A14334CP_DSC_BAR ,
                                           A14341CP_DISUSRC ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           A14306CP_BARPLF ,
                                           AV59Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      /* Using cursor P0AC82 */
      pr_default.execute(0, new Object[] {AV59Emprcod, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, AV21BarDisNumfrom, AV22BarDisNumto, Integer.valueOf(AV44CliCodfrom), Integer.valueOf(AV45CliCodto), Byte.valueOf(AV40BarSitfrom), Byte.valueOf(AV41BarSitto), AV29BarFecGenfrom, AV30BarFecGento, AV31BarFecSalfrom, AV32BarFecSalto, AV25BarFecClifrom, AV26BarFecClito, AV27BarFecFprfrom, AV28BarFecFprto, AV38BarSerfrom, AV39BarSerto, AV17BarColNomfrom, AV18BarColNomto, Integer.valueOf(AV19BarColNumfrom), Integer.valueOf(AV20BarColNumto), AV34BarNomClifrom, AV35BarNomClito, Integer.valueOf(AV36BarNumClifrom), Integer.valueOf(AV37BarNumClito), Short.valueOf(AV42BarTipArtfrom), Short.valueOf(AV43BarTipArtto), Integer.valueOf(AV11BarCodfrom), Integer.valueOf(AV16BarCodto), Byte.valueOf(AV14BarCodReofrom), Byte.valueOf(AV15BarCodReoto), AV12BarCodParfrom, AV13BarCodParto, AV165Cod_idtx, AV33BarGirar, AV77muestras});
      c14336CP_BARKGM = P0AC82_A14336CP_BARKGM[0] ;
      pr_default.close(0);
      AV155TotCP_BARKGM = AV155TotCP_BARKGM.add(c14336CP_BARKGM) ;
      /* End optimized group. */
      /* Optimized group. */
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV63FilterFullText ,
                                           AV21BarDisNumfrom ,
                                           AV22BarDisNumto ,
                                           Integer.valueOf(AV44CliCodfrom) ,
                                           Integer.valueOf(AV45CliCodto) ,
                                           Byte.valueOf(AV40BarSitfrom) ,
                                           Byte.valueOf(AV41BarSitto) ,
                                           AV29BarFecGenfrom ,
                                           AV30BarFecGento ,
                                           AV31BarFecSalfrom ,
                                           AV32BarFecSalto ,
                                           AV25BarFecClifrom ,
                                           AV26BarFecClito ,
                                           AV27BarFecFprfrom ,
                                           AV28BarFecFprto ,
                                           AV38BarSerfrom ,
                                           AV39BarSerto ,
                                           AV17BarColNomfrom ,
                                           AV18BarColNomto ,
                                           Integer.valueOf(AV19BarColNumfrom) ,
                                           Integer.valueOf(AV20BarColNumto) ,
                                           AV34BarNomClifrom ,
                                           AV35BarNomClito ,
                                           Integer.valueOf(AV36BarNumClifrom) ,
                                           Integer.valueOf(AV37BarNumClito) ,
                                           Short.valueOf(AV42BarTipArtfrom) ,
                                           Short.valueOf(AV43BarTipArtto) ,
                                           Integer.valueOf(AV11BarCodfrom) ,
                                           Integer.valueOf(AV16BarCodto) ,
                                           Byte.valueOf(AV14BarCodReofrom) ,
                                           Byte.valueOf(AV15BarCodReoto) ,
                                           AV12BarCodParfrom ,
                                           AV13BarCodParto ,
                                           AV165Cod_idtx ,
                                           AV33BarGirar ,
                                           AV77muestras ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14319CP_BARAGRE ,
                                           A14311CP_BARSER ,
                                           A14312CP_BARSERD ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14343CP_TARTDSC ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           A14336CP_BARKGM ,
                                           c14337CP_BARMTR ,
                                           Integer.valueOf(A14338CP_BARPIE) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14339CP_BARALBK ,
                                           A14340CP_BARALBM ,
                                           A14317CP_BARGIRA ,
                                           A14323CP_BARPROP ,
                                           A14334CP_DSC_BAR ,
                                           A14341CP_DISUSRC ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           A14306CP_BARPLF ,
                                           AV59Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      /* Using cursor P0AC83 */
      pr_default.execute(1, new Object[] {AV59Emprcod, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, AV21BarDisNumfrom, AV22BarDisNumto, Integer.valueOf(AV44CliCodfrom), Integer.valueOf(AV45CliCodto), Byte.valueOf(AV40BarSitfrom), Byte.valueOf(AV41BarSitto), AV29BarFecGenfrom, AV30BarFecGento, AV31BarFecSalfrom, AV32BarFecSalto, AV25BarFecClifrom, AV26BarFecClito, AV27BarFecFprfrom, AV28BarFecFprto, AV38BarSerfrom, AV39BarSerto, AV17BarColNomfrom, AV18BarColNomto, Integer.valueOf(AV19BarColNumfrom), Integer.valueOf(AV20BarColNumto), AV34BarNomClifrom, AV35BarNomClito, Integer.valueOf(AV36BarNumClifrom), Integer.valueOf(AV37BarNumClito), Short.valueOf(AV42BarTipArtfrom), Short.valueOf(AV43BarTipArtto), Integer.valueOf(AV11BarCodfrom), Integer.valueOf(AV16BarCodto), Byte.valueOf(AV14BarCodReofrom), Byte.valueOf(AV15BarCodReoto), AV12BarCodParfrom, AV13BarCodParto, AV165Cod_idtx, AV33BarGirar, AV77muestras});
      c14337CP_BARMTR = P0AC83_A14337CP_BARMTR[0] ;
      pr_default.close(1);
      AV156TotCP_BARMTR = AV156TotCP_BARMTR.add(c14337CP_BARMTR) ;
      /* End optimized group. */
      /* Optimized group. */
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV63FilterFullText ,
                                           AV21BarDisNumfrom ,
                                           AV22BarDisNumto ,
                                           Integer.valueOf(AV44CliCodfrom) ,
                                           Integer.valueOf(AV45CliCodto) ,
                                           Byte.valueOf(AV40BarSitfrom) ,
                                           Byte.valueOf(AV41BarSitto) ,
                                           AV29BarFecGenfrom ,
                                           AV30BarFecGento ,
                                           AV31BarFecSalfrom ,
                                           AV32BarFecSalto ,
                                           AV25BarFecClifrom ,
                                           AV26BarFecClito ,
                                           AV27BarFecFprfrom ,
                                           AV28BarFecFprto ,
                                           AV38BarSerfrom ,
                                           AV39BarSerto ,
                                           AV17BarColNomfrom ,
                                           AV18BarColNomto ,
                                           Integer.valueOf(AV19BarColNumfrom) ,
                                           Integer.valueOf(AV20BarColNumto) ,
                                           AV34BarNomClifrom ,
                                           AV35BarNomClito ,
                                           Integer.valueOf(AV36BarNumClifrom) ,
                                           Integer.valueOf(AV37BarNumClito) ,
                                           Short.valueOf(AV42BarTipArtfrom) ,
                                           Short.valueOf(AV43BarTipArtto) ,
                                           Integer.valueOf(AV11BarCodfrom) ,
                                           Integer.valueOf(AV16BarCodto) ,
                                           Byte.valueOf(AV14BarCodReofrom) ,
                                           Byte.valueOf(AV15BarCodReoto) ,
                                           AV12BarCodParfrom ,
                                           AV13BarCodParto ,
                                           AV165Cod_idtx ,
                                           AV33BarGirar ,
                                           AV77muestras ,
                                           Integer.valueOf(A14326CP_CLICOD) ,
                                           A14327CP_CLINOM ,
                                           A14324CP_BARDISN ,
                                           Integer.valueOf(A14301CP_BARCOD) ,
                                           Byte.valueOf(A14302CP_BARCODR) ,
                                           A14303CP_BARCODP ,
                                           A14319CP_BARAGRE ,
                                           A14311CP_BARSER ,
                                           A14312CP_BARSERD ,
                                           Short.valueOf(A14316CP_BARTIPA) ,
                                           A14343CP_TARTDSC ,
                                           A14331CP_BARCOLO ,
                                           Integer.valueOf(A14332CP_BARCOLU) ,
                                           A14315CP_BARNOMC ,
                                           A14336CP_BARKGM ,
                                           A14337CP_BARMTR ,
                                           Integer.valueOf(c14338CP_BARPIE) ,
                                           Byte.valueOf(A14307CP_BARSIT) ,
                                           A14339CP_BARALBK ,
                                           A14340CP_BARALBM ,
                                           A14317CP_BARGIRA ,
                                           A14323CP_BARPROP ,
                                           A14334CP_DSC_BAR ,
                                           A14341CP_DISUSRC ,
                                           A14308CP_BARFECG ,
                                           A14310CP_BARFECS ,
                                           A14309CP_BARFECC ,
                                           A14304CP_BARFECF ,
                                           Integer.valueOf(A14305CP_BARNUMC) ,
                                           A14306CP_BARPLF ,
                                           AV59Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      lV63FilterFullText = GXutil.concat( GXutil.rtrim( AV63FilterFullText), "%", "") ;
      /* Using cursor P0AC84 */
      pr_default.execute(2, new Object[] {AV59Emprcod, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, lV63FilterFullText, AV21BarDisNumfrom, AV22BarDisNumto, Integer.valueOf(AV44CliCodfrom), Integer.valueOf(AV45CliCodto), Byte.valueOf(AV40BarSitfrom), Byte.valueOf(AV41BarSitto), AV29BarFecGenfrom, AV30BarFecGento, AV31BarFecSalfrom, AV32BarFecSalto, AV25BarFecClifrom, AV26BarFecClito, AV27BarFecFprfrom, AV28BarFecFprto, AV38BarSerfrom, AV39BarSerto, AV17BarColNomfrom, AV18BarColNomto, Integer.valueOf(AV19BarColNumfrom), Integer.valueOf(AV20BarColNumto), AV34BarNomClifrom, AV35BarNomClito, Integer.valueOf(AV36BarNumClifrom), Integer.valueOf(AV37BarNumClito), Short.valueOf(AV42BarTipArtfrom), Short.valueOf(AV43BarTipArtto), Integer.valueOf(AV11BarCodfrom), Integer.valueOf(AV16BarCodto), Byte.valueOf(AV14BarCodReofrom), Byte.valueOf(AV15BarCodReoto), AV12BarCodParfrom, AV13BarCodParto, AV165Cod_idtx, AV33BarGirar, AV77muestras});
      c14338CP_BARPIE = (short)((short)(P0AC84_A14338CP_BARPIE[0])) ;
      pr_default.close(2);
      AV157TotCP_BARPIE = (short)(AV157TotCP_BARPIE+c14338CP_BARPIE) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP39[0] = listaconsultaproducciontotal.this.AV155TotCP_BARKGM;
      this.aP40[0] = listaconsultaproducciontotal.this.AV156TotCP_BARMTR;
      this.aP41[0] = listaconsultaproducciontotal.this.AV157TotCP_BARPIE;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV155TotCP_BARKGM = DecimalUtil.ZERO ;
      AV156TotCP_BARMTR = DecimalUtil.ZERO ;
      c14336CP_BARKGM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV63FilterFullText = "" ;
      A14327CP_CLINOM = "" ;
      A14324CP_BARDISN = "" ;
      A14303CP_BARCODP = "" ;
      A14319CP_BARAGRE = "" ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14343CP_TARTDSC = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14317CP_BARGIRA = "" ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14341CP_DISUSRC = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14306CP_BARPLF = "" ;
      P0AC82_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      c14337CP_BARMTR = DecimalUtil.ZERO ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      P0AC83_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AC84_A14338CP_BARPIE = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listaconsultaproducciontotal__default(),
         new Object[] {
             new Object[] {
            P0AC82_A14336CP_BARKGM
            }
            , new Object[] {
            P0AC83_A14337CP_BARMTR
            }
            , new Object[] {
            P0AC84_A14338CP_BARPIE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40BarSitfrom ;
   private byte AV41BarSitto ;
   private byte AV14BarCodReofrom ;
   private byte AV15BarCodReoto ;
   private byte A14302CP_BARCODR ;
   private byte A14307CP_BARSIT ;
   private short AV42BarTipArtfrom ;
   private short AV43BarTipArtto ;
   private short AV157TotCP_BARPIE ;
   private short A14316CP_BARTIPA ;
   private short c14338CP_BARPIE ;
   private short Gx_err ;
   private int AV44CliCodfrom ;
   private int AV45CliCodto ;
   private int AV19BarColNumfrom ;
   private int AV20BarColNumto ;
   private int AV36BarNumClifrom ;
   private int AV37BarNumClito ;
   private int AV11BarCodfrom ;
   private int AV16BarCodto ;
   private int A14326CP_CLICOD ;
   private int A14301CP_BARCOD ;
   private int A14332CP_BARCOLU ;
   private int A14338CP_BARPIE ;
   private int A14305CP_BARNUMC ;
   private java.math.BigDecimal AV155TotCP_BARKGM ;
   private java.math.BigDecimal AV156TotCP_BARMTR ;
   private java.math.BigDecimal c14336CP_BARKGM ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private java.math.BigDecimal c14337CP_BARMTR ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private String AV59Emprcod ;
   private String AV21BarDisNumfrom ;
   private String AV22BarDisNumto ;
   private String AV38BarSerfrom ;
   private String AV39BarSerto ;
   private String AV17BarColNomfrom ;
   private String AV18BarColNomto ;
   private String AV34BarNomClifrom ;
   private String AV35BarNomClito ;
   private String AV77muestras ;
   private String AV12BarCodParfrom ;
   private String AV13BarCodParto ;
   private String AV165Cod_idtx ;
   private String AV33BarGirar ;
   private String scmdbuf ;
   private String A14324CP_BARDISN ;
   private String A14303CP_BARCODP ;
   private String A14319CP_BARAGRE ;
   private String A14311CP_BARSER ;
   private String A14331CP_BARCOLO ;
   private String A14323CP_BARPROP ;
   private String A14341CP_DISUSRC ;
   private String A14306CP_BARPLF ;
   private java.util.Date AV29BarFecGenfrom ;
   private java.util.Date AV30BarFecGento ;
   private java.util.Date AV25BarFecClifrom ;
   private java.util.Date AV26BarFecClito ;
   private java.util.Date AV27BarFecFprfrom ;
   private java.util.Date AV28BarFecFprto ;
   private java.util.Date AV31BarFecSalfrom ;
   private java.util.Date AV32BarFecSalto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private String AV63FilterFullText ;
   private String lV63FilterFullText ;
   private String A14327CP_CLINOM ;
   private String A14312CP_BARSERD ;
   private String A14343CP_TARTDSC ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private String A14334CP_DSC_BAR ;
   private short[] aP41 ;
   private java.math.BigDecimal[] aP39 ;
   private java.math.BigDecimal[] aP40 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AC82_A14336CP_BARKGM ;
   private java.math.BigDecimal[] P0AC83_A14337CP_BARMTR ;
   private int[] P0AC84_A14338CP_BARPIE ;
}

final  class listaconsultaproducciontotal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AC82( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63FilterFullText ,
                                          String AV21BarDisNumfrom ,
                                          String AV22BarDisNumto ,
                                          int AV44CliCodfrom ,
                                          int AV45CliCodto ,
                                          byte AV40BarSitfrom ,
                                          byte AV41BarSitto ,
                                          java.util.Date AV29BarFecGenfrom ,
                                          java.util.Date AV30BarFecGento ,
                                          java.util.Date AV31BarFecSalfrom ,
                                          java.util.Date AV32BarFecSalto ,
                                          java.util.Date AV25BarFecClifrom ,
                                          java.util.Date AV26BarFecClito ,
                                          java.util.Date AV27BarFecFprfrom ,
                                          java.util.Date AV28BarFecFprto ,
                                          String AV38BarSerfrom ,
                                          String AV39BarSerto ,
                                          String AV17BarColNomfrom ,
                                          String AV18BarColNomto ,
                                          int AV19BarColNumfrom ,
                                          int AV20BarColNumto ,
                                          String AV34BarNomClifrom ,
                                          String AV35BarNomClito ,
                                          int AV36BarNumClifrom ,
                                          int AV37BarNumClito ,
                                          short AV42BarTipArtfrom ,
                                          short AV43BarTipArtto ,
                                          int AV11BarCodfrom ,
                                          int AV16BarCodto ,
                                          byte AV14BarCodReofrom ,
                                          byte AV15BarCodReoto ,
                                          String AV12BarCodParfrom ,
                                          String AV13BarCodParto ,
                                          String AV165Cod_idtx ,
                                          String AV33BarGirar ,
                                          String AV77muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          String AV59Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[60];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT SUM(CP_BARKGM) FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV63FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
         GXv_int1[2] = (byte)(1) ;
         GXv_int1[3] = (byte)(1) ;
         GXv_int1[4] = (byte)(1) ;
         GXv_int1[5] = (byte)(1) ;
         GXv_int1[6] = (byte)(1) ;
         GXv_int1[7] = (byte)(1) ;
         GXv_int1[8] = (byte)(1) ;
         GXv_int1[9] = (byte)(1) ;
         GXv_int1[10] = (byte)(1) ;
         GXv_int1[11] = (byte)(1) ;
         GXv_int1[12] = (byte)(1) ;
         GXv_int1[13] = (byte)(1) ;
         GXv_int1[14] = (byte)(1) ;
         GXv_int1[15] = (byte)(1) ;
         GXv_int1[16] = (byte)(1) ;
         GXv_int1[17] = (byte)(1) ;
         GXv_int1[18] = (byte)(1) ;
         GXv_int1[19] = (byte)(1) ;
         GXv_int1[20] = (byte)(1) ;
         GXv_int1[21] = (byte)(1) ;
         GXv_int1[22] = (byte)(1) ;
         GXv_int1[23] = (byte)(1) ;
         GXv_int1[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int1[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int1[26] = (byte)(1) ;
      }
      if ( ! (0==AV44CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int1[27] = (byte)(1) ;
      }
      if ( ! (0==AV45CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int1[28] = (byte)(1) ;
      }
      if ( ! (0==AV40BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int1[29] = (byte)(1) ;
      }
      if ( ! (0==AV41BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int1[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int1[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int1[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int1[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int1[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int1[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int1[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int1[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int1[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int1[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int1[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int1[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int1[42] = (byte)(1) ;
      }
      if ( ! (0==AV19BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int1[43] = (byte)(1) ;
      }
      if ( ! (0==AV20BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int1[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int1[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int1[46] = (byte)(1) ;
      }
      if ( ! (0==AV36BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int1[47] = (byte)(1) ;
      }
      if ( ! (0==AV37BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int1[48] = (byte)(1) ;
      }
      if ( ! (0==AV42BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int1[49] = (byte)(1) ;
      }
      if ( ! (0==AV43BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int1[50] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int1[51] = (byte)(1) ;
      }
      if ( ! (0==AV16BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int1[52] = (byte)(1) ;
      }
      if ( ! (0==AV14BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int1[53] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int1[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int1[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int1[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int1[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int1[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int1[59] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   protected Object[] conditional_P0AC83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63FilterFullText ,
                                          String AV21BarDisNumfrom ,
                                          String AV22BarDisNumto ,
                                          int AV44CliCodfrom ,
                                          int AV45CliCodto ,
                                          byte AV40BarSitfrom ,
                                          byte AV41BarSitto ,
                                          java.util.Date AV29BarFecGenfrom ,
                                          java.util.Date AV30BarFecGento ,
                                          java.util.Date AV31BarFecSalfrom ,
                                          java.util.Date AV32BarFecSalto ,
                                          java.util.Date AV25BarFecClifrom ,
                                          java.util.Date AV26BarFecClito ,
                                          java.util.Date AV27BarFecFprfrom ,
                                          java.util.Date AV28BarFecFprto ,
                                          String AV38BarSerfrom ,
                                          String AV39BarSerto ,
                                          String AV17BarColNomfrom ,
                                          String AV18BarColNomto ,
                                          int AV19BarColNumfrom ,
                                          int AV20BarColNumto ,
                                          String AV34BarNomClifrom ,
                                          String AV35BarNomClito ,
                                          int AV36BarNumClifrom ,
                                          int AV37BarNumClito ,
                                          short AV42BarTipArtfrom ,
                                          short AV43BarTipArtto ,
                                          int AV11BarCodfrom ,
                                          int AV16BarCodto ,
                                          byte AV14BarCodReofrom ,
                                          byte AV15BarCodReoto ,
                                          String AV12BarCodParfrom ,
                                          String AV13BarCodParto ,
                                          String AV165Cod_idtx ,
                                          String AV33BarGirar ,
                                          String AV77muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          String AV59Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[60];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT SUM(CP_BARMTR) FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV63FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
         GXv_int3[2] = (byte)(1) ;
         GXv_int3[3] = (byte)(1) ;
         GXv_int3[4] = (byte)(1) ;
         GXv_int3[5] = (byte)(1) ;
         GXv_int3[6] = (byte)(1) ;
         GXv_int3[7] = (byte)(1) ;
         GXv_int3[8] = (byte)(1) ;
         GXv_int3[9] = (byte)(1) ;
         GXv_int3[10] = (byte)(1) ;
         GXv_int3[11] = (byte)(1) ;
         GXv_int3[12] = (byte)(1) ;
         GXv_int3[13] = (byte)(1) ;
         GXv_int3[14] = (byte)(1) ;
         GXv_int3[15] = (byte)(1) ;
         GXv_int3[16] = (byte)(1) ;
         GXv_int3[17] = (byte)(1) ;
         GXv_int3[18] = (byte)(1) ;
         GXv_int3[19] = (byte)(1) ;
         GXv_int3[20] = (byte)(1) ;
         GXv_int3[21] = (byte)(1) ;
         GXv_int3[22] = (byte)(1) ;
         GXv_int3[23] = (byte)(1) ;
         GXv_int3[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int3[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int3[26] = (byte)(1) ;
      }
      if ( ! (0==AV44CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int3[27] = (byte)(1) ;
      }
      if ( ! (0==AV45CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int3[28] = (byte)(1) ;
      }
      if ( ! (0==AV40BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int3[29] = (byte)(1) ;
      }
      if ( ! (0==AV41BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int3[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int3[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int3[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int3[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int3[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int3[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int3[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int3[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int3[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int3[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int3[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int3[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int3[42] = (byte)(1) ;
      }
      if ( ! (0==AV19BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int3[43] = (byte)(1) ;
      }
      if ( ! (0==AV20BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int3[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int3[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int3[46] = (byte)(1) ;
      }
      if ( ! (0==AV36BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int3[47] = (byte)(1) ;
      }
      if ( ! (0==AV37BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int3[48] = (byte)(1) ;
      }
      if ( ! (0==AV42BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int3[49] = (byte)(1) ;
      }
      if ( ! (0==AV43BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int3[50] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int3[51] = (byte)(1) ;
      }
      if ( ! (0==AV16BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int3[52] = (byte)(1) ;
      }
      if ( ! (0==AV14BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int3[53] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int3[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int3[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int3[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int3[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int3[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int3[59] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P0AC84( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63FilterFullText ,
                                          String AV21BarDisNumfrom ,
                                          String AV22BarDisNumto ,
                                          int AV44CliCodfrom ,
                                          int AV45CliCodto ,
                                          byte AV40BarSitfrom ,
                                          byte AV41BarSitto ,
                                          java.util.Date AV29BarFecGenfrom ,
                                          java.util.Date AV30BarFecGento ,
                                          java.util.Date AV31BarFecSalfrom ,
                                          java.util.Date AV32BarFecSalto ,
                                          java.util.Date AV25BarFecClifrom ,
                                          java.util.Date AV26BarFecClito ,
                                          java.util.Date AV27BarFecFprfrom ,
                                          java.util.Date AV28BarFecFprto ,
                                          String AV38BarSerfrom ,
                                          String AV39BarSerto ,
                                          String AV17BarColNomfrom ,
                                          String AV18BarColNomto ,
                                          int AV19BarColNumfrom ,
                                          int AV20BarColNumto ,
                                          String AV34BarNomClifrom ,
                                          String AV35BarNomClito ,
                                          int AV36BarNumClifrom ,
                                          int AV37BarNumClito ,
                                          short AV42BarTipArtfrom ,
                                          short AV43BarTipArtto ,
                                          int AV11BarCodfrom ,
                                          int AV16BarCodto ,
                                          byte AV14BarCodReofrom ,
                                          byte AV15BarCodReoto ,
                                          String AV12BarCodParfrom ,
                                          String AV13BarCodParto ,
                                          String AV165Cod_idtx ,
                                          String AV33BarGirar ,
                                          String AV77muestras ,
                                          int A14326CP_CLICOD ,
                                          String A14327CP_CLINOM ,
                                          String A14324CP_BARDISN ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14319CP_BARAGRE ,
                                          String A14311CP_BARSER ,
                                          String A14312CP_BARSERD ,
                                          short A14316CP_BARTIPA ,
                                          String A14343CP_TARTDSC ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          java.math.BigDecimal A14336CP_BARKGM ,
                                          java.math.BigDecimal A14337CP_BARMTR ,
                                          int A14338CP_BARPIE ,
                                          byte A14307CP_BARSIT ,
                                          java.math.BigDecimal A14339CP_BARALBK ,
                                          java.math.BigDecimal A14340CP_BARALBM ,
                                          String A14317CP_BARGIRA ,
                                          String A14323CP_BARPROP ,
                                          String A14334CP_DSC_BAR ,
                                          String A14341CP_DISUSRC ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          int A14305CP_BARNUMC ,
                                          String A14306CP_BARPLF ,
                                          String AV59Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[60];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT SUM(CP_BARPIE) FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV63FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CP_CLICOD,'999990'), 2) like '%' || ?) or ( UPPER(CP_CLINOM) like '%' || UPPER(?)) or ( UPPER(CP_BARDISN) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOD,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARCODR,'90'), 2) like '%' || ?) or ( UPPER(CP_BARCODP) like '%' || UPPER(?)) or ( UPPER(CP_BARAGRE) like '%' || UPPER(?)) or ( UPPER(CP_BARSER) like '%' || UPPER(?)) or ( UPPER(CP_BARSERD) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARTIPA,'9990'), 2) like '%' || ?) or ( UPPER(CP_TARTDSC) like '%' || UPPER(?)) or ( UPPER(CP_BARCOLO) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARCOLU,'999990'), 2) like '%' || ?) or ( UPPER(CP_BARNOMC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CP_BARKGM,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARMTR,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARPIE,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARSIT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBK,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(CP_BARALBM,'999990.99'), 2) like '%' || ?) or ( UPPER(CP_BARGIRA) like '%' || UPPER(?)) or ( UPPER(CP_BARPROP) like '%' || UPPER(?)) or ( UPPER(CP_DSC_BAR) like '%' || UPPER(?)) or ( UPPER(CP_DISUSRC) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
         GXv_int5[14] = (byte)(1) ;
         GXv_int5[15] = (byte)(1) ;
         GXv_int5[16] = (byte)(1) ;
         GXv_int5[17] = (byte)(1) ;
         GXv_int5[18] = (byte)(1) ;
         GXv_int5[19] = (byte)(1) ;
         GXv_int5[20] = (byte)(1) ;
         GXv_int5[21] = (byte)(1) ;
         GXv_int5[22] = (byte)(1) ;
         GXv_int5[23] = (byte)(1) ;
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (0==AV44CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV45CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV40BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV41BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      if ( ! (0==AV19BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int5[43] = (byte)(1) ;
      }
      if ( ! (0==AV20BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int5[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int5[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int5[46] = (byte)(1) ;
      }
      if ( ! (0==AV36BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int5[47] = (byte)(1) ;
      }
      if ( ! (0==AV37BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int5[48] = (byte)(1) ;
      }
      if ( ! (0==AV42BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int5[49] = (byte)(1) ;
      }
      if ( ! (0==AV43BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int5[50] = (byte)(1) ;
      }
      if ( ! (0==AV11BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int5[51] = (byte)(1) ;
      }
      if ( ! (0==AV16BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int5[52] = (byte)(1) ;
      }
      if ( ! (0==AV14BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int5[53] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int5[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int5[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int5[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int5[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int5[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int5[59] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
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
                  return conditional_P0AC82(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] );
            case 1 :
                  return conditional_P0AC83(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] );
            case 2 :
                  return conditional_P0AC84(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AC82", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AC83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AC84", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[90]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[113]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[114]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[90]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[113]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[114]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[90]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[94]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[113]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[114]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               return;
      }
   }

}

