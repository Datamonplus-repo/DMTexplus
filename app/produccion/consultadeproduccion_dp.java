package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_dp extends GXProcedure
{
   public consultadeproduccion_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_dp.class ), "" );
   }

   public consultadeproduccion_dp( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item> executeUdp( String aP0 ,
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
                                                                                        int aP38 ,
                                                                                        int aP39 ,
                                                                                        String aP40 ,
                                                                                        String aP41 ,
                                                                                        String aP42 ,
                                                                                        String aP43 ,
                                                                                        byte aP44 ,
                                                                                        byte aP45 ,
                                                                                        java.util.Date aP46 ,
                                                                                        java.util.Date aP47 ,
                                                                                        java.util.Date aP48 ,
                                                                                        java.util.Date aP49 ,
                                                                                        java.util.Date aP50 ,
                                                                                        java.util.Date aP51 ,
                                                                                        String aP52 ,
                                                                                        String aP53 ,
                                                                                        String aP54 ,
                                                                                        String aP55 ,
                                                                                        String aP56 ,
                                                                                        String aP57 ,
                                                                                        int aP58 ,
                                                                                        int aP59 ,
                                                                                        String aP60 ,
                                                                                        String aP61 ,
                                                                                        short aP62 ,
                                                                                        short aP63 ,
                                                                                        String aP64 ,
                                                                                        String aP65 ,
                                                                                        String aP66 ,
                                                                                        String aP67 ,
                                                                                        String aP68 ,
                                                                                        String aP69 ,
                                                                                        String aP70 ,
                                                                                        String aP71 ,
                                                                                        String aP72 ,
                                                                                        String aP73 ,
                                                                                        long aP74 ,
                                                                                        long aP75 ,
                                                                                        int aP76 ,
                                                                                        int aP77 ,
                                                                                        short aP78 ,
                                                                                        short aP79 ,
                                                                                        String aP80 ,
                                                                                        String aP81 ,
                                                                                        String aP82 ,
                                                                                        String aP83 ,
                                                                                        String aP84 ,
                                                                                        String aP85 ,
                                                                                        String aP86 ,
                                                                                        String aP87 ,
                                                                                        short aP88 ,
                                                                                        short aP89 )
   {
      consultadeproduccion_dp.this.aP90 = new GXBaseCollection[] {new GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67, aP68, aP69, aP70, aP71, aP72, aP73, aP74, aP75, aP76, aP77, aP78, aP79, aP80, aP81, aP82, aP83, aP84, aP85, aP86, aP87, aP88, aP89, aP90);
      return aP90[0];
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
                        int aP38 ,
                        int aP39 ,
                        String aP40 ,
                        String aP41 ,
                        String aP42 ,
                        String aP43 ,
                        byte aP44 ,
                        byte aP45 ,
                        java.util.Date aP46 ,
                        java.util.Date aP47 ,
                        java.util.Date aP48 ,
                        java.util.Date aP49 ,
                        java.util.Date aP50 ,
                        java.util.Date aP51 ,
                        String aP52 ,
                        String aP53 ,
                        String aP54 ,
                        String aP55 ,
                        String aP56 ,
                        String aP57 ,
                        int aP58 ,
                        int aP59 ,
                        String aP60 ,
                        String aP61 ,
                        short aP62 ,
                        short aP63 ,
                        String aP64 ,
                        String aP65 ,
                        String aP66 ,
                        String aP67 ,
                        String aP68 ,
                        String aP69 ,
                        String aP70 ,
                        String aP71 ,
                        String aP72 ,
                        String aP73 ,
                        long aP74 ,
                        long aP75 ,
                        int aP76 ,
                        int aP77 ,
                        short aP78 ,
                        short aP79 ,
                        String aP80 ,
                        String aP81 ,
                        String aP82 ,
                        String aP83 ,
                        String aP84 ,
                        String aP85 ,
                        String aP86 ,
                        String aP87 ,
                        short aP88 ,
                        short aP89 ,
                        GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item>[] aP90 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67, aP68, aP69, aP70, aP71, aP72, aP73, aP74, aP75, aP76, aP77, aP78, aP79, aP80, aP81, aP82, aP83, aP84, aP85, aP86, aP87, aP88, aP89, aP90);
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
                             int aP38 ,
                             int aP39 ,
                             String aP40 ,
                             String aP41 ,
                             String aP42 ,
                             String aP43 ,
                             byte aP44 ,
                             byte aP45 ,
                             java.util.Date aP46 ,
                             java.util.Date aP47 ,
                             java.util.Date aP48 ,
                             java.util.Date aP49 ,
                             java.util.Date aP50 ,
                             java.util.Date aP51 ,
                             String aP52 ,
                             String aP53 ,
                             String aP54 ,
                             String aP55 ,
                             String aP56 ,
                             String aP57 ,
                             int aP58 ,
                             int aP59 ,
                             String aP60 ,
                             String aP61 ,
                             short aP62 ,
                             short aP63 ,
                             String aP64 ,
                             String aP65 ,
                             String aP66 ,
                             String aP67 ,
                             String aP68 ,
                             String aP69 ,
                             String aP70 ,
                             String aP71 ,
                             String aP72 ,
                             String aP73 ,
                             long aP74 ,
                             long aP75 ,
                             int aP76 ,
                             int aP77 ,
                             short aP78 ,
                             short aP79 ,
                             String aP80 ,
                             String aP81 ,
                             String aP82 ,
                             String aP83 ,
                             String aP84 ,
                             String aP85 ,
                             String aP86 ,
                             String aP87 ,
                             short aP88 ,
                             short aP89 ,
                             GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item>[] aP90 )
   {
      consultadeproduccion_dp.this.AV38Emprcod = aP0;
      consultadeproduccion_dp.this.AV36clicodfrom = aP1;
      consultadeproduccion_dp.this.AV37clicodto = aP2;
      consultadeproduccion_dp.this.AV15bardisnumfrom = aP3;
      consultadeproduccion_dp.this.AV16bardisnumto = aP4;
      consultadeproduccion_dp.this.AV21barfecgenfrom = aP5;
      consultadeproduccion_dp.this.AV22barfecgento = aP6;
      consultadeproduccion_dp.this.AV32barsitfrom = aP7;
      consultadeproduccion_dp.this.AV33barsitto = aP8;
      consultadeproduccion_dp.this.AV17BarFecClifrom = aP9;
      consultadeproduccion_dp.this.AV18BarFecClito = aP10;
      consultadeproduccion_dp.this.AV19BarFecFprfrom = aP11;
      consultadeproduccion_dp.this.AV20BarFecFprto = aP12;
      consultadeproduccion_dp.this.AV23BarFecSalfrom = aP13;
      consultadeproduccion_dp.this.AV24BarFecSalto = aP14;
      consultadeproduccion_dp.this.AV30BarSerfrom = aP15;
      consultadeproduccion_dp.this.AV31BarSerto = aP16;
      consultadeproduccion_dp.this.AV34BarTipArtfrom = aP17;
      consultadeproduccion_dp.this.AV35BarTipArtto = aP18;
      consultadeproduccion_dp.this.AV11BarColNomfrom = aP19;
      consultadeproduccion_dp.this.AV12BarColNomto = aP20;
      consultadeproduccion_dp.this.AV13BarColNumfrom = aP21;
      consultadeproduccion_dp.this.AV14BarColNumto = aP22;
      consultadeproduccion_dp.this.AV26BarNomClifrom = aP23;
      consultadeproduccion_dp.this.AV27BarNomClito = aP24;
      consultadeproduccion_dp.this.AV28BarNumClifrom = aP25;
      consultadeproduccion_dp.this.AV29BarNumClito = aP26;
      consultadeproduccion_dp.this.AV34BarTipArtfrom = aP27;
      consultadeproduccion_dp.this.AV35BarTipArtto = aP28;
      consultadeproduccion_dp.this.AV110TFBarPlf = aP29;
      consultadeproduccion_dp.this.AV5BarCodfrom = aP30;
      consultadeproduccion_dp.this.AV10BarCodto = aP31;
      consultadeproduccion_dp.this.AV8BarCodReofrom = aP32;
      consultadeproduccion_dp.this.AV9BarCodReoto = aP33;
      consultadeproduccion_dp.this.AV6BarCodParfrom = aP34;
      consultadeproduccion_dp.this.AV7BarCodParto = aP35;
      consultadeproduccion_dp.this.AV126Cod_Idtx = aP36;
      consultadeproduccion_dp.this.AV25BarGirar = aP37;
      consultadeproduccion_dp.this.AV100TFCliCod = aP38;
      consultadeproduccion_dp.this.AV101TFCliCod_To = aP39;
      consultadeproduccion_dp.this.AV102TFCliNom = aP40;
      consultadeproduccion_dp.this.AV103TFCliNom_Sel = aP41;
      consultadeproduccion_dp.this.AV78TFBarNHdr = aP42;
      consultadeproduccion_dp.this.AV79TFBarNHdr_Sel = aP43;
      consultadeproduccion_dp.this.AV94TFBarSit = aP44;
      consultadeproduccion_dp.this.AV95TFBarSit_To = aP45;
      consultadeproduccion_dp.this.AV68TFBarFecGen = aP46;
      consultadeproduccion_dp.this.AV69TFBarFecGen_To = aP47;
      consultadeproduccion_dp.this.AV64TFBarFecCli = aP48;
      consultadeproduccion_dp.this.AV65TFBarFecCli_To = aP49;
      consultadeproduccion_dp.this.AV70TFBarFecSal = aP50;
      consultadeproduccion_dp.this.AV71TFBarFecSal_To = aP51;
      consultadeproduccion_dp.this.AV90TFBarSer = aP52;
      consultadeproduccion_dp.this.AV91TFBarSer_Sel = aP53;
      consultadeproduccion_dp.this.AV92TFBarSerDsc = aP54;
      consultadeproduccion_dp.this.AV93TFBarSerDsc_Sel = aP55;
      consultadeproduccion_dp.this.AV52TFBarColNom = aP56;
      consultadeproduccion_dp.this.AV53TFBarColNom_Sel = aP57;
      consultadeproduccion_dp.this.AV54TFBarColNum = aP58;
      consultadeproduccion_dp.this.AV55TFBarColNum_To = aP59;
      consultadeproduccion_dp.this.AV80TFBarNomCli = aP60;
      consultadeproduccion_dp.this.AV81TFBarNomCli_Sel = aP61;
      consultadeproduccion_dp.this.AV96TFBarTipArt = aP62;
      consultadeproduccion_dp.this.AV97TFBarTipArt_To = aP63;
      consultadeproduccion_dp.this.AV98TFBarTipArtDsc = aP64;
      consultadeproduccion_dp.this.AV99TFBarTipArtDsc_Sel = aP65;
      consultadeproduccion_dp.this.AV86TFBarProPer = aP66;
      consultadeproduccion_dp.this.AV87TFBarProPer_Sel = aP67;
      consultadeproduccion_dp.this.AV72TFBarGirar = aP68;
      consultadeproduccion_dp.this.AV73TFBarGirar_Sel = aP69;
      consultadeproduccion_dp.this.AV60TFBarFasCod = aP70;
      consultadeproduccion_dp.this.AV61TFBarFasCod_Sel = aP71;
      consultadeproduccion_dp.this.AV62TFBarFasSig = aP72;
      consultadeproduccion_dp.this.AV63TFBarFasSig_Sel = aP73;
      consultadeproduccion_dp.this.AV50TFBarAlbUltimo = aP74;
      consultadeproduccion_dp.this.AV51TFBarAlbUltimo_To = aP75;
      consultadeproduccion_dp.this.AV44TFBarAlbFact = aP76;
      consultadeproduccion_dp.this.AV45TFBarAlbFact_To = aP77;
      consultadeproduccion_dp.this.AV40TFBarAcaAnh = aP78;
      consultadeproduccion_dp.this.AV41TFBarAcaAnh_To = aP79;
      consultadeproduccion_dp.this.AV56TFBarCuaderno = aP80;
      consultadeproduccion_dp.this.AV57TFBarCuaderno_Sel = aP81;
      consultadeproduccion_dp.this.AV88TFBarProPerIdtx = aP82;
      consultadeproduccion_dp.this.AV89TFBarProPerIdtx_Sel = aP83;
      consultadeproduccion_dp.this.AV82TFBarNormas = aP84;
      consultadeproduccion_dp.this.AV83TFBarNormas_Sel = aP85;
      consultadeproduccion_dp.this.AV104TFDisUsrCod = aP86;
      consultadeproduccion_dp.this.AV105TFDisUsrCod_Sel = aP87;
      consultadeproduccion_dp.this.AV131PageNumber = aP88;
      consultadeproduccion_dp.this.AV130PageSize = aP89;
      consultadeproduccion_dp.this.aP90 = aP90;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXPagingIdx2 = 0 ;
      GXPagingFrom2 = (int)((AV131PageNumber-1)*AV130PageSize) ;
      GXPagingTo2 = (int)((AV131PageNumber-1)*AV130PageSize+AV130PageSize) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV105TFDisUsrCod_Sel ,
                                           AV104TFDisUsrCod ,
                                           AV87TFBarProPer_Sel ,
                                           AV86TFBarProPer ,
                                           Short.valueOf(AV41TFBarAcaAnh_To) ,
                                           Short.valueOf(AV40TFBarAcaAnh) ,
                                           AV73TFBarGirar_Sel ,
                                           AV72TFBarGirar ,
                                           AV99TFBarTipArtDsc_Sel ,
                                           AV98TFBarTipArtDsc ,
                                           Short.valueOf(AV97TFBarTipArt_To) ,
                                           Short.valueOf(AV96TFBarTipArt) ,
                                           AV81TFBarNomCli_Sel ,
                                           AV80TFBarNomCli ,
                                           Integer.valueOf(AV55TFBarColNum_To) ,
                                           Integer.valueOf(AV54TFBarColNum) ,
                                           AV53TFBarColNom_Sel ,
                                           AV52TFBarColNom ,
                                           AV93TFBarSerDsc_Sel ,
                                           AV92TFBarSerDsc ,
                                           AV91TFBarSer_Sel ,
                                           AV90TFBarSer ,
                                           AV71TFBarFecSal_To ,
                                           AV70TFBarFecSal ,
                                           AV65TFBarFecCli_To ,
                                           AV64TFBarFecCli ,
                                           AV69TFBarFecGen_To ,
                                           AV68TFBarFecGen ,
                                           Byte.valueOf(AV95TFBarSit_To) ,
                                           Byte.valueOf(AV94TFBarSit) ,
                                           AV79TFBarNHdr_Sel ,
                                           AV78TFBarNHdr ,
                                           AV103TFCliNom_Sel ,
                                           AV102TFCliNom ,
                                           Integer.valueOf(AV101TFCliCod_To) ,
                                           Integer.valueOf(AV100TFCliCod) ,
                                           AV25BarGirar ,
                                           AV126Cod_Idtx ,
                                           AV7BarCodParto ,
                                           AV6BarCodParfrom ,
                                           Byte.valueOf(AV9BarCodReoto) ,
                                           Byte.valueOf(AV8BarCodReofrom) ,
                                           Integer.valueOf(AV10BarCodto) ,
                                           Integer.valueOf(AV5BarCodfrom) ,
                                           AV110TFBarPlf ,
                                           Short.valueOf(AV35BarTipArtto) ,
                                           Short.valueOf(AV34BarTipArtfrom) ,
                                           Integer.valueOf(AV29BarNumClito) ,
                                           Integer.valueOf(AV28BarNumClifrom) ,
                                           AV27BarNomClito ,
                                           AV26BarNomClifrom ,
                                           Integer.valueOf(AV14BarColNumto) ,
                                           Integer.valueOf(AV13BarColNumfrom) ,
                                           AV12BarColNomto ,
                                           AV11BarColNomfrom ,
                                           AV31BarSerto ,
                                           AV30BarSerfrom ,
                                           AV20BarFecFprto ,
                                           AV19BarFecFprfrom ,
                                           AV18BarFecClito ,
                                           AV17BarFecClifrom ,
                                           AV24BarFecSalto ,
                                           AV23BarFecSalfrom ,
                                           AV22barfecgento ,
                                           AV21barfecgenfrom ,
                                           Integer.valueOf(AV37clicodto) ,
                                           Integer.valueOf(AV36clicodfrom) ,
                                           A4348DisUsrCod ,
                                           A2829BarProPer ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A2454BarGirar ,
                                           A13711BarTipArtD ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A135BarColNom ,
                                           A1652BarSerDsc ,
                                           A212BarSer ,
                                           A161BarFecSal ,
                                           A155BarFecCli ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           Integer.valueOf(A252CliCod) ,
                                           A3030BarPlf ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A158BarFecFpr ,
                                           AV83TFBarNormas_Sel ,
                                           A13934BarNormas ,
                                           AV82TFBarNormas ,
                                           AV89TFBarProPerIdtx_Sel ,
                                           A14204BarProPerI ,
                                           AV88TFBarProPerIdtx ,
                                           AV57TFBarCuaderno_Sel ,
                                           A13933BarCuadern ,
                                           AV56TFBarCuaderno ,
                                           Integer.valueOf(AV45TFBarAlbFact_To) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV44TFBarAlbFact) ,
                                           Long.valueOf(AV51TFBarAlbUltimo_To) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV50TFBarAlbUltimo) ,
                                           AV63TFBarFasSig_Sel ,
                                           A1955BarFasSig ,
                                           AV62TFBarFasSig ,
                                           AV61TFBarFasCod_Sel ,
                                           A151BarFasCod ,
                                           AV60TFBarFasCod ,
                                           Byte.valueOf(AV33barsitto) ,
                                           Byte.valueOf(AV32barsitfrom) ,
                                           AV16bardisnumto ,
                                           A13878PedidoClie ,
                                           AV15bardisnumfrom ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV56TFBarCuaderno = GXutil.padr( GXutil.rtrim( AV56TFBarCuaderno), 20, "%") ;
      lV62TFBarFasSig = GXutil.padr( GXutil.rtrim( AV62TFBarFasSig), 8, "%") ;
      lV60TFBarFasCod = GXutil.padr( GXutil.rtrim( AV60TFBarFasCod), 8, "%") ;
      lV104TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV104TFDisUsrCod), 8, "%") ;
      lV86TFBarProPer = GXutil.padr( GXutil.rtrim( AV86TFBarProPer), 8, "%") ;
      lV72TFBarGirar = GXutil.padr( GXutil.rtrim( AV72TFBarGirar), 20, "%") ;
      lV98TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV98TFBarTipArtDsc), 30, "%") ;
      lV80TFBarNomCli = GXutil.padr( GXutil.rtrim( AV80TFBarNomCli), 13, "%") ;
      lV52TFBarColNom = GXutil.padr( GXutil.rtrim( AV52TFBarColNom), 13, "%") ;
      lV92TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV92TFBarSerDsc), 26, "%") ;
      lV90TFBarSer = GXutil.padr( GXutil.rtrim( AV90TFBarSer), 16, "%") ;
      lV78TFBarNHdr = GXutil.padr( GXutil.rtrim( AV78TFBarNHdr), 11, "%") ;
      lV102TFCliNom = GXutil.padr( GXutil.rtrim( AV102TFCliNom), 30, "%") ;
      /* Using cursor P003Z10 */
      pr_default.execute(0, new Object[] {AV38Emprcod, AV57TFBarCuaderno_Sel, AV57TFBarCuaderno_Sel, AV57TFBarCuaderno_Sel, AV56TFBarCuaderno, lV56TFBarCuaderno, AV63TFBarFasSig_Sel, AV63TFBarFasSig_Sel, AV63TFBarFasSig_Sel, AV62TFBarFasSig, lV62TFBarFasSig, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, AV61TFBarFasCod_Sel, AV60TFBarFasCod, lV60TFBarFasCod, Byte.valueOf(AV33barsitto), Byte.valueOf(AV32barsitfrom), AV105TFDisUsrCod_Sel, lV104TFDisUsrCod, AV87TFBarProPer_Sel, lV86TFBarProPer, Short.valueOf(AV41TFBarAcaAnh_To), Short.valueOf(AV40TFBarAcaAnh), AV73TFBarGirar_Sel, lV72TFBarGirar, AV99TFBarTipArtDsc_Sel, lV98TFBarTipArtDsc, Short.valueOf(AV97TFBarTipArt_To), Short.valueOf(AV96TFBarTipArt), AV81TFBarNomCli_Sel, lV80TFBarNomCli, Integer.valueOf(AV55TFBarColNum_To), Integer.valueOf(AV54TFBarColNum), AV53TFBarColNom_Sel, lV52TFBarColNom, AV93TFBarSerDsc_Sel, lV92TFBarSerDsc, AV91TFBarSer_Sel, lV90TFBarSer, AV71TFBarFecSal_To, AV70TFBarFecSal, AV65TFBarFecCli_To, AV64TFBarFecCli, AV69TFBarFecGen_To, AV68TFBarFecGen, Byte.valueOf(AV95TFBarSit_To), Byte.valueOf(AV94TFBarSit), AV79TFBarNHdr_Sel, lV78TFBarNHdr, AV103TFCliNom_Sel, lV102TFCliNom, Integer.valueOf(AV101TFCliCod_To), Integer.valueOf(AV100TFCliCod), AV25BarGirar, AV126Cod_Idtx, AV7BarCodParto, AV6BarCodParfrom, Byte.valueOf(AV9BarCodReoto), Byte.valueOf(AV8BarCodReofrom), Integer.valueOf(AV10BarCodto), Integer.valueOf(AV5BarCodfrom), AV110TFBarPlf, Short.valueOf(AV35BarTipArtto), Short.valueOf(AV34BarTipArtfrom), Integer.valueOf(AV29BarNumClito), Integer.valueOf(AV28BarNumClifrom), AV27BarNomClito, AV26BarNomClifrom, Integer.valueOf(AV14BarColNumto), Integer.valueOf(AV13BarColNumfrom), AV12BarColNomto, AV11BarColNomfrom, AV31BarSerto, AV30BarSerfrom, AV20BarFecFprto, AV19BarFecFprfrom, AV18BarFecClito, AV17BarFecClifrom, AV24BarFecSalto, AV23BarFecSalfrom, AV22barfecgento, AV21barfecgenfrom, Integer.valueOf(AV37clicodto), Integer.valueOf(AV36clicodfrom)});
      while ( ( (pr_default.getStatus(0) != 101) ) && ( ( GXPagingTo2 == GXPagingFrom2 ) || ( GXPagingIdx2 < GXPagingTo2 ) ) )
      {
         A158BarFecFpr = P003Z10_A158BarFecFpr[0] ;
         A1235BarNumCli = P003Z10_A1235BarNumCli[0] ;
         A3030BarPlf = P003Z10_A3030BarPlf[0] ;
         A252CliCod = P003Z10_A252CliCod[0] ;
         n252CliCod = P003Z10_n252CliCod[0] ;
         A279CliNom = P003Z10_A279CliNom[0] ;
         A213BarSit = P003Z10_A213BarSit[0] ;
         A159BarFecGen = P003Z10_A159BarFecGen[0] ;
         A155BarFecCli = P003Z10_A155BarFecCli[0] ;
         A161BarFecSal = P003Z10_A161BarFecSal[0] ;
         A212BarSer = P003Z10_A212BarSer[0] ;
         A1652BarSerDsc = P003Z10_A1652BarSerDsc[0] ;
         A135BarColNom = P003Z10_A135BarColNom[0] ;
         A136BarColNum = P003Z10_A136BarColNum[0] ;
         A1234BarNomCli = P003Z10_A1234BarNomCli[0] ;
         A217BarTipArt = P003Z10_A217BarTipArt[0] ;
         n217BarTipArt = P003Z10_n217BarTipArt[0] ;
         A13711BarTipArtD = P003Z10_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P003Z10_n13711BarTipArtD[0] ;
         A2454BarGirar = P003Z10_A2454BarGirar[0] ;
         A4466BarAcaAnh = P003Z10_A4466BarAcaAnh[0] ;
         A4348DisUsrCod = P003Z10_A4348DisUsrCod[0] ;
         A120BarAgrEst = P003Z10_A120BarAgrEst[0] ;
         A2265BarExt = P003Z10_A2265BarExt[0] ;
         n2265BarExt = P003Z10_n2265BarExt[0] ;
         A151BarFasCod = P003Z10_A151BarFasCod[0] ;
         n151BarFasCod = P003Z10_n151BarFasCod[0] ;
         A1955BarFasSig = P003Z10_A1955BarFasSig[0] ;
         n1955BarFasSig = P003Z10_n1955BarFasSig[0] ;
         A13933BarCuadern = P003Z10_A13933BarCuadern[0] ;
         n13933BarCuadern = P003Z10_n13933BarCuadern[0] ;
         A166BarKgm = P003Z10_A166BarKgm[0] ;
         A184BarMtr = P003Z10_A184BarMtr[0] ;
         A13931BarAlbMts = P003Z10_A13931BarAlbMts[0] ;
         A13932BarAlbKgs = P003Z10_A13932BarAlbKgs[0] ;
         A199BarPie1 = P003Z10_A199BarPie1[0] ;
         A365DisDes = P003Z10_A365DisDes[0] ;
         A898BarPieNDes = P003Z10_A898BarPieNDes[0] ;
         A361DisCod = P003Z10_A361DisCod[0] ;
         A2829BarProPer = P003Z10_A2829BarProPer[0] ;
         A130BarCodPar = P003Z10_A130BarCodPar[0] ;
         A132BarCodReo = P003Z10_A132BarCodReo[0] ;
         A129BarCod = P003Z10_A129BarCod[0] ;
         A143BarDisNum = P003Z10_A143BarDisNum[0] ;
         A4812BarEncCli = P003Z10_A4812BarEncCli[0] ;
         A396EmprCod = P003Z10_A396EmprCod[0] ;
         A4348DisUsrCod = P003Z10_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P003Z10_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P003Z10_n13711BarTipArtD[0] ;
         A279CliNom = P003Z10_A279CliNom[0] ;
         A151BarFasCod = P003Z10_A151BarFasCod[0] ;
         n151BarFasCod = P003Z10_n151BarFasCod[0] ;
         A1955BarFasSig = P003Z10_A1955BarFasSig[0] ;
         n1955BarFasSig = P003Z10_n1955BarFasSig[0] ;
         A13933BarCuadern = P003Z10_A13933BarCuadern[0] ;
         n13933BarCuadern = P003Z10_n13933BarCuadern[0] ;
         A166BarKgm = P003Z10_A166BarKgm[0] ;
         A184BarMtr = P003Z10_A184BarMtr[0] ;
         A199BarPie1 = P003Z10_A199BarPie1[0] ;
         A898BarPieNDes = P003Z10_A898BarPieNDes[0] ;
         A13931BarAlbMts = P003Z10_A13931BarAlbMts[0] ;
         A13932BarAlbKgs = P003Z10_A13932BarAlbKgs[0] ;
         GXt_char1 = A13934BarNormas ;
         GXv_char2[0] = GXt_char1 ;
         new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
         consultadeproduccion_dp.this.GXt_char1 = GXv_char2[0] ;
         A13934BarNormas = GXt_char1 ;
         if ( (GXutil.strcmp("", AV83TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV83TFBarNormas_Sel) == 0 ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV83TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV82TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV82TFBarNormas) , 255 , "%"),  ' ' ) ) )
            {
               GXt_char1 = A14204BarProPerI ;
               GXv_char2[0] = GXt_char1 ;
               new app.pinditexin(remoteHandle, context).execute( A396EmprCod, A2829BarProPer, GXv_char2) ;
               consultadeproduccion_dp.this.GXt_char1 = GXv_char2[0] ;
               A14204BarProPerI = GXt_char1 ;
               if ( (GXutil.strcmp("", AV89TFBarProPerIdtx_Sel)==0) || ( ( GXutil.strcmp(A14204BarProPerI, AV89TFBarProPerIdtx_Sel) == 0 ) ) )
               {
                  if ( ! ( (GXutil.strcmp("", AV89TFBarProPerIdtx_Sel)==0) && ( ! (GXutil.strcmp("", AV88TFBarProPerIdtx)==0) ) ) || ( GXutil.like( GXutil.upper( A14204BarProPerI) , GXutil.padr( "%" + GXutil.upper( AV88TFBarProPerIdtx) , 255 , "%"),  ' ' ) ) )
                  {
                     GXt_int3 = A13935BarAlbFact ;
                     GXv_int4[0] = GXt_int3 ;
                     new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int4) ;
                     consultadeproduccion_dp.this.GXt_int3 = GXv_int4[0] ;
                     A13935BarAlbFact = GXt_int3 ;
                     if ( (0==AV45TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV45TFBarAlbFact_To ) ) )
                     {
                        if ( (0==AV44TFBarAlbFact) || ( ( A13935BarAlbFact >= AV44TFBarAlbFact ) ) )
                        {
                           GXt_int5 = A13930BarAlbUlti ;
                           GXv_int6[0] = GXt_int5 ;
                           new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int6) ;
                           consultadeproduccion_dp.this.GXt_int5 = GXv_int6[0] ;
                           A13930BarAlbUlti = GXt_int5 ;
                           if ( (0==AV51TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV51TFBarAlbUltimo_To ) ) )
                           {
                              if ( (0==AV50TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV50TFBarAlbUltimo ) ) )
                              {
                                 GXt_char1 = A13878PedidoClie ;
                                 GXv_char2[0] = A396EmprCod ;
                                 GXv_char7[0] = A4812BarEncCli ;
                                 GXv_char8[0] = A143BarDisNum ;
                                 GXv_char9[0] = GXt_char1 ;
                                 new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char7, GXv_char8, GXv_char9) ;
                                 consultadeproduccion_dp.this.A396EmprCod = GXv_char2[0] ;
                                 consultadeproduccion_dp.this.A4812BarEncCli = GXv_char7[0] ;
                                 consultadeproduccion_dp.this.A143BarDisNum = GXv_char8[0] ;
                                 consultadeproduccion_dp.this.GXt_char1 = GXv_char9[0] ;
                                 A13878PedidoClie = GXt_char1 ;
                                 if ( (GXutil.strcmp("", AV16bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV16bardisnumto) <= 0 ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV15bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV15bardisnumfrom) >= 0 ) ) )
                                    {
                                       A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                       if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                       {
                                          A198BarPie = A898BarPieNDes ;
                                       }
                                       else
                                       {
                                          A198BarPie = A199BarPie1 ;
                                       }
                                       GXPagingIdx2 = (int)(GXPagingIdx2+1) ;
                                       if ( GXPagingIdx2 > GXPagingFrom2 )
                                       {
                                          Gxm1consultadeproduccion_sdt = (app.produccion.SdtConsultadeProduccion_SDT_Item)new app.produccion.SdtConsultadeProduccion_SDT_Item(remoteHandle, context);
                                          Gxm2rootcol.add(Gxm1consultadeproduccion_sdt, 0);
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Clicod( A252CliCod );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Clinom( A279CliNom );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr( A13696BarNHdr );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Baragrest( A120BarAgrEst );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente( A13878PedidoClie );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barser( A212BarSer );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc( A1652BarSerDsc );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Bartipart( A217BarTipArt );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc( A13711BarTipArtD );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom( A135BarColNom );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum( A136BarColNum );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli( A1234BarNomCli );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barkgm( A166BarKgm );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barmtr( A184BarMtr );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barpie( A198BarPie );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barsit( A213BarSit );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen( A159BarFecGen );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli( A155BarFecCli );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal( A161BarFecSal );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr( A158BarFecFpr );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barfascod( A151BarFasCod );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barfassig( A1955BarFasSig );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo( A13930BarAlbUlti );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact( A13935BarAlbFact );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts( A13931BarAlbMts );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs( A13932BarAlbKgs );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Bargirar( A2454BarGirar );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh( A4466BarAcaAnh );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno( A13933BarCuadern );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barproper( A2829BarProPer );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx( A14204BarProPerI );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barnormas( A13934BarNormas );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod( A4348DisUsrCod );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barcod( A129BarCod );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo( A132BarCodReo );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar( A130BarCodPar );
                                          Gxm1consultadeproduccion_sdt.setgxTv_SdtConsultadeProduccion_SDT_Item_Barext( A2265BarExt );
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP90[0] = consultadeproduccion_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item>(app.produccion.SdtConsultadeProduccion_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV56TFBarCuaderno = "" ;
      lV62TFBarFasSig = "" ;
      lV60TFBarFasCod = "" ;
      lV104TFDisUsrCod = "" ;
      lV86TFBarProPer = "" ;
      lV72TFBarGirar = "" ;
      lV98TFBarTipArtDsc = "" ;
      lV80TFBarNomCli = "" ;
      lV52TFBarColNom = "" ;
      lV92TFBarSerDsc = "" ;
      lV90TFBarSer = "" ;
      lV78TFBarNHdr = "" ;
      lV102TFCliNom = "" ;
      A4348DisUsrCod = "" ;
      A2829BarProPer = "" ;
      A2454BarGirar = "" ;
      A13711BarTipArtD = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A3030BarPlf = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A13934BarNormas = "" ;
      A14204BarProPerI = "" ;
      A13933BarCuadern = "" ;
      A1955BarFasSig = "" ;
      A151BarFasCod = "" ;
      A13878PedidoClie = "" ;
      A396EmprCod = "" ;
      P003Z10_A9713Tb1_Cod = new short[1] ;
      P003Z10_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P003Z10_A1235BarNumCli = new int[1] ;
      P003Z10_A3030BarPlf = new String[] {""} ;
      P003Z10_A252CliCod = new int[1] ;
      P003Z10_n252CliCod = new boolean[] {false} ;
      P003Z10_A279CliNom = new String[] {""} ;
      P003Z10_A213BarSit = new byte[1] ;
      P003Z10_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P003Z10_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P003Z10_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P003Z10_A212BarSer = new String[] {""} ;
      P003Z10_A1652BarSerDsc = new String[] {""} ;
      P003Z10_A135BarColNom = new String[] {""} ;
      P003Z10_A136BarColNum = new int[1] ;
      P003Z10_A1234BarNomCli = new String[] {""} ;
      P003Z10_A217BarTipArt = new short[1] ;
      P003Z10_n217BarTipArt = new boolean[] {false} ;
      P003Z10_A13711BarTipArtD = new String[] {""} ;
      P003Z10_n13711BarTipArtD = new boolean[] {false} ;
      P003Z10_A2454BarGirar = new String[] {""} ;
      P003Z10_A4466BarAcaAnh = new short[1] ;
      P003Z10_A4348DisUsrCod = new String[] {""} ;
      P003Z10_A120BarAgrEst = new String[] {""} ;
      P003Z10_A2265BarExt = new byte[1] ;
      P003Z10_n2265BarExt = new boolean[] {false} ;
      P003Z10_A151BarFasCod = new String[] {""} ;
      P003Z10_n151BarFasCod = new boolean[] {false} ;
      P003Z10_A1955BarFasSig = new String[] {""} ;
      P003Z10_n1955BarFasSig = new boolean[] {false} ;
      P003Z10_A13933BarCuadern = new String[] {""} ;
      P003Z10_n13933BarCuadern = new boolean[] {false} ;
      P003Z10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Z10_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Z10_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Z10_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003Z10_A199BarPie1 = new short[1] ;
      P003Z10_A365DisDes = new String[] {""} ;
      P003Z10_A898BarPieNDes = new int[1] ;
      P003Z10_A361DisCod = new int[1] ;
      P003Z10_A2829BarProPer = new String[] {""} ;
      P003Z10_A130BarCodPar = new String[] {""} ;
      P003Z10_A132BarCodReo = new byte[1] ;
      P003Z10_A129BarCod = new int[1] ;
      P003Z10_A143BarDisNum = new String[] {""} ;
      P003Z10_A4812BarEncCli = new String[] {""} ;
      P003Z10_A396EmprCod = new String[] {""} ;
      A120BarAgrEst = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A13931BarAlbMts = DecimalUtil.ZERO ;
      A13932BarAlbKgs = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXv_int4 = new int[1] ;
      GXv_int6 = new long[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      A13696BarNHdr = "" ;
      Gxm1consultadeproduccion_sdt = new app.produccion.SdtConsultadeProduccion_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_dp__default(),
         new Object[] {
             new Object[] {
            P003Z10_A9713Tb1_Cod, P003Z10_A158BarFecFpr, P003Z10_A1235BarNumCli, P003Z10_A3030BarPlf, P003Z10_A252CliCod, P003Z10_n252CliCod, P003Z10_A279CliNom, P003Z10_A213BarSit, P003Z10_A159BarFecGen, P003Z10_A155BarFecCli,
            P003Z10_A161BarFecSal, P003Z10_A212BarSer, P003Z10_A1652BarSerDsc, P003Z10_A135BarColNom, P003Z10_A136BarColNum, P003Z10_A1234BarNomCli, P003Z10_A217BarTipArt, P003Z10_n217BarTipArt, P003Z10_A13711BarTipArtD, P003Z10_n13711BarTipArtD,
            P003Z10_A2454BarGirar, P003Z10_A4466BarAcaAnh, P003Z10_A4348DisUsrCod, P003Z10_A120BarAgrEst, P003Z10_A2265BarExt, P003Z10_n2265BarExt, P003Z10_A151BarFasCod, P003Z10_n151BarFasCod, P003Z10_A1955BarFasSig, P003Z10_n1955BarFasSig,
            P003Z10_A13933BarCuadern, P003Z10_n13933BarCuadern, P003Z10_A166BarKgm, P003Z10_A184BarMtr, P003Z10_A13931BarAlbMts, P003Z10_A13932BarAlbKgs, P003Z10_A199BarPie1, P003Z10_A365DisDes, P003Z10_A898BarPieNDes, P003Z10_A361DisCod,
            P003Z10_A2829BarProPer, P003Z10_A130BarCodPar, P003Z10_A132BarCodReo, P003Z10_A129BarCod, P003Z10_A143BarDisNum, P003Z10_A4812BarEncCli, P003Z10_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV32barsitfrom ;
   private byte AV33barsitto ;
   private byte AV8BarCodReofrom ;
   private byte AV9BarCodReoto ;
   private byte AV94TFBarSit ;
   private byte AV95TFBarSit_To ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private short AV34BarTipArtfrom ;
   private short AV35BarTipArtto ;
   private short AV96TFBarTipArt ;
   private short AV97TFBarTipArt_To ;
   private short AV40TFBarAcaAnh ;
   private short AV41TFBarAcaAnh_To ;
   private short AV131PageNumber ;
   private short AV130PageSize ;
   private short A4466BarAcaAnh ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV36clicodfrom ;
   private int AV37clicodto ;
   private int AV13BarColNumfrom ;
   private int AV14BarColNumto ;
   private int AV28BarNumClifrom ;
   private int AV29BarNumClito ;
   private int AV5BarCodfrom ;
   private int AV10BarCodto ;
   private int AV100TFCliCod ;
   private int AV101TFCliCod_To ;
   private int AV54TFBarColNum ;
   private int AV55TFBarColNum_To ;
   private int AV44TFBarAlbFact ;
   private int AV45TFBarAlbFact_To ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXPagingIdx2 ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A1235BarNumCli ;
   private int A13935BarAlbFact ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int A198BarPie ;
   private long AV50TFBarAlbUltimo ;
   private long AV51TFBarAlbUltimo_To ;
   private long A13930BarAlbUlti ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A13931BarAlbMts ;
   private java.math.BigDecimal A13932BarAlbKgs ;
   private String AV38Emprcod ;
   private String AV15bardisnumfrom ;
   private String AV16bardisnumto ;
   private String AV30BarSerfrom ;
   private String AV31BarSerto ;
   private String AV11BarColNomfrom ;
   private String AV12BarColNomto ;
   private String AV26BarNomClifrom ;
   private String AV27BarNomClito ;
   private String AV110TFBarPlf ;
   private String AV6BarCodParfrom ;
   private String AV7BarCodParto ;
   private String AV126Cod_Idtx ;
   private String AV25BarGirar ;
   private String AV102TFCliNom ;
   private String AV103TFCliNom_Sel ;
   private String AV78TFBarNHdr ;
   private String AV79TFBarNHdr_Sel ;
   private String AV90TFBarSer ;
   private String AV91TFBarSer_Sel ;
   private String AV92TFBarSerDsc ;
   private String AV93TFBarSerDsc_Sel ;
   private String AV52TFBarColNom ;
   private String AV53TFBarColNom_Sel ;
   private String AV80TFBarNomCli ;
   private String AV81TFBarNomCli_Sel ;
   private String AV98TFBarTipArtDsc ;
   private String AV99TFBarTipArtDsc_Sel ;
   private String AV86TFBarProPer ;
   private String AV87TFBarProPer_Sel ;
   private String AV72TFBarGirar ;
   private String AV73TFBarGirar_Sel ;
   private String AV60TFBarFasCod ;
   private String AV61TFBarFasCod_Sel ;
   private String AV62TFBarFasSig ;
   private String AV63TFBarFasSig_Sel ;
   private String AV56TFBarCuaderno ;
   private String AV57TFBarCuaderno_Sel ;
   private String AV88TFBarProPerIdtx ;
   private String AV89TFBarProPerIdtx_Sel ;
   private String AV104TFDisUsrCod ;
   private String AV105TFDisUsrCod_Sel ;
   private String scmdbuf ;
   private String lV56TFBarCuaderno ;
   private String lV62TFBarFasSig ;
   private String lV60TFBarFasCod ;
   private String lV104TFDisUsrCod ;
   private String lV86TFBarProPer ;
   private String lV72TFBarGirar ;
   private String lV98TFBarTipArtDsc ;
   private String lV80TFBarNomCli ;
   private String lV52TFBarColNom ;
   private String lV92TFBarSerDsc ;
   private String lV90TFBarSer ;
   private String lV78TFBarNHdr ;
   private String lV102TFCliNom ;
   private String A4348DisUsrCod ;
   private String A2829BarProPer ;
   private String A2454BarGirar ;
   private String A13711BarTipArtD ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A3030BarPlf ;
   private String A14204BarProPerI ;
   private String A13933BarCuadern ;
   private String A1955BarFasSig ;
   private String A151BarFasCod ;
   private String A13878PedidoClie ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String A365DisDes ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String A13696BarNHdr ;
   private java.util.Date AV21barfecgenfrom ;
   private java.util.Date AV22barfecgento ;
   private java.util.Date AV17BarFecClifrom ;
   private java.util.Date AV18BarFecClito ;
   private java.util.Date AV19BarFecFprfrom ;
   private java.util.Date AV20BarFecFprto ;
   private java.util.Date AV23BarFecSalfrom ;
   private java.util.Date AV24BarFecSalto ;
   private java.util.Date AV68TFBarFecGen ;
   private java.util.Date AV69TFBarFecGen_To ;
   private java.util.Date AV64TFBarFecCli ;
   private java.util.Date AV65TFBarFecCli_To ;
   private java.util.Date AV70TFBarFecSal ;
   private java.util.Date AV71TFBarFecSal_To ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A158BarFecFpr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13711BarTipArtD ;
   private boolean n2265BarExt ;
   private boolean n151BarFasCod ;
   private boolean n1955BarFasSig ;
   private boolean n13933BarCuadern ;
   private String AV82TFBarNormas ;
   private String AV83TFBarNormas_Sel ;
   private String A13934BarNormas ;
   private GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item>[] aP90 ;
   private IDataStoreProvider pr_default ;
   private short[] P003Z10_A9713Tb1_Cod ;
   private java.util.Date[] P003Z10_A158BarFecFpr ;
   private int[] P003Z10_A1235BarNumCli ;
   private String[] P003Z10_A3030BarPlf ;
   private int[] P003Z10_A252CliCod ;
   private boolean[] P003Z10_n252CliCod ;
   private String[] P003Z10_A279CliNom ;
   private byte[] P003Z10_A213BarSit ;
   private java.util.Date[] P003Z10_A159BarFecGen ;
   private java.util.Date[] P003Z10_A155BarFecCli ;
   private java.util.Date[] P003Z10_A161BarFecSal ;
   private String[] P003Z10_A212BarSer ;
   private String[] P003Z10_A1652BarSerDsc ;
   private String[] P003Z10_A135BarColNom ;
   private int[] P003Z10_A136BarColNum ;
   private String[] P003Z10_A1234BarNomCli ;
   private short[] P003Z10_A217BarTipArt ;
   private boolean[] P003Z10_n217BarTipArt ;
   private String[] P003Z10_A13711BarTipArtD ;
   private boolean[] P003Z10_n13711BarTipArtD ;
   private String[] P003Z10_A2454BarGirar ;
   private short[] P003Z10_A4466BarAcaAnh ;
   private String[] P003Z10_A4348DisUsrCod ;
   private String[] P003Z10_A120BarAgrEst ;
   private byte[] P003Z10_A2265BarExt ;
   private boolean[] P003Z10_n2265BarExt ;
   private String[] P003Z10_A151BarFasCod ;
   private boolean[] P003Z10_n151BarFasCod ;
   private String[] P003Z10_A1955BarFasSig ;
   private boolean[] P003Z10_n1955BarFasSig ;
   private String[] P003Z10_A13933BarCuadern ;
   private boolean[] P003Z10_n13933BarCuadern ;
   private java.math.BigDecimal[] P003Z10_A166BarKgm ;
   private java.math.BigDecimal[] P003Z10_A184BarMtr ;
   private java.math.BigDecimal[] P003Z10_A13931BarAlbMts ;
   private java.math.BigDecimal[] P003Z10_A13932BarAlbKgs ;
   private short[] P003Z10_A199BarPie1 ;
   private String[] P003Z10_A365DisDes ;
   private int[] P003Z10_A898BarPieNDes ;
   private int[] P003Z10_A361DisCod ;
   private String[] P003Z10_A2829BarProPer ;
   private String[] P003Z10_A130BarCodPar ;
   private byte[] P003Z10_A132BarCodReo ;
   private int[] P003Z10_A129BarCod ;
   private String[] P003Z10_A143BarDisNum ;
   private String[] P003Z10_A4812BarEncCli ;
   private String[] P003Z10_A396EmprCod ;
   private GXBaseCollection<app.produccion.SdtConsultadeProduccion_SDT_Item> Gxm2rootcol ;
   private app.produccion.SdtConsultadeProduccion_SDT_Item Gxm1consultadeproduccion_sdt ;
}

final  class consultadeproduccion_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003Z10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV105TFDisUsrCod_Sel ,
                                           String AV104TFDisUsrCod ,
                                           String AV87TFBarProPer_Sel ,
                                           String AV86TFBarProPer ,
                                           short AV41TFBarAcaAnh_To ,
                                           short AV40TFBarAcaAnh ,
                                           String AV73TFBarGirar_Sel ,
                                           String AV72TFBarGirar ,
                                           String AV99TFBarTipArtDsc_Sel ,
                                           String AV98TFBarTipArtDsc ,
                                           short AV97TFBarTipArt_To ,
                                           short AV96TFBarTipArt ,
                                           String AV81TFBarNomCli_Sel ,
                                           String AV80TFBarNomCli ,
                                           int AV55TFBarColNum_To ,
                                           int AV54TFBarColNum ,
                                           String AV53TFBarColNom_Sel ,
                                           String AV52TFBarColNom ,
                                           String AV93TFBarSerDsc_Sel ,
                                           String AV92TFBarSerDsc ,
                                           String AV91TFBarSer_Sel ,
                                           String AV90TFBarSer ,
                                           java.util.Date AV71TFBarFecSal_To ,
                                           java.util.Date AV70TFBarFecSal ,
                                           java.util.Date AV65TFBarFecCli_To ,
                                           java.util.Date AV64TFBarFecCli ,
                                           java.util.Date AV69TFBarFecGen_To ,
                                           java.util.Date AV68TFBarFecGen ,
                                           byte AV95TFBarSit_To ,
                                           byte AV94TFBarSit ,
                                           String AV79TFBarNHdr_Sel ,
                                           String AV78TFBarNHdr ,
                                           String AV103TFCliNom_Sel ,
                                           String AV102TFCliNom ,
                                           int AV101TFCliCod_To ,
                                           int AV100TFCliCod ,
                                           String AV25BarGirar ,
                                           String AV126Cod_Idtx ,
                                           String AV7BarCodParto ,
                                           String AV6BarCodParfrom ,
                                           byte AV9BarCodReoto ,
                                           byte AV8BarCodReofrom ,
                                           int AV10BarCodto ,
                                           int AV5BarCodfrom ,
                                           String AV110TFBarPlf ,
                                           short AV35BarTipArtto ,
                                           short AV34BarTipArtfrom ,
                                           int AV29BarNumClito ,
                                           int AV28BarNumClifrom ,
                                           String AV27BarNomClito ,
                                           String AV26BarNomClifrom ,
                                           int AV14BarColNumto ,
                                           int AV13BarColNumfrom ,
                                           String AV12BarColNomto ,
                                           String AV11BarColNomfrom ,
                                           String AV31BarSerto ,
                                           String AV30BarSerfrom ,
                                           java.util.Date AV20BarFecFprto ,
                                           java.util.Date AV19BarFecFprfrom ,
                                           java.util.Date AV18BarFecClito ,
                                           java.util.Date AV17BarFecClifrom ,
                                           java.util.Date AV24BarFecSalto ,
                                           java.util.Date AV23BarFecSalfrom ,
                                           java.util.Date AV22barfecgento ,
                                           java.util.Date AV21barfecgenfrom ,
                                           int AV37clicodto ,
                                           int AV36clicodfrom ,
                                           String A4348DisUsrCod ,
                                           String A2829BarProPer ,
                                           short A4466BarAcaAnh ,
                                           String A2454BarGirar ,
                                           String A13711BarTipArtD ,
                                           short A217BarTipArt ,
                                           String A1234BarNomCli ,
                                           int A136BarColNum ,
                                           String A135BarColNom ,
                                           String A1652BarSerDsc ,
                                           String A212BarSer ,
                                           java.util.Date A161BarFecSal ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A159BarFecGen ,
                                           byte A213BarSit ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A279CliNom ,
                                           int A252CliCod ,
                                           String A3030BarPlf ,
                                           int A1235BarNumCli ,
                                           java.util.Date A158BarFecFpr ,
                                           String AV83TFBarNormas_Sel ,
                                           String A13934BarNormas ,
                                           String AV82TFBarNormas ,
                                           String AV89TFBarProPerIdtx_Sel ,
                                           String A14204BarProPerI ,
                                           String AV88TFBarProPerIdtx ,
                                           String AV57TFBarCuaderno_Sel ,
                                           String A13933BarCuadern ,
                                           String AV56TFBarCuaderno ,
                                           int AV45TFBarAlbFact_To ,
                                           int A13935BarAlbFact ,
                                           int AV44TFBarAlbFact ,
                                           long AV51TFBarAlbUltimo_To ,
                                           long A13930BarAlbUlti ,
                                           long AV50TFBarAlbUltimo ,
                                           String AV63TFBarFasSig_Sel ,
                                           String A1955BarFasSig ,
                                           String AV62TFBarFasSig ,
                                           String AV61TFBarFasCod_Sel ,
                                           String A151BarFasCod ,
                                           String AV60TFBarFasCod ,
                                           byte AV33barsitto ,
                                           byte AV32barsitfrom ,
                                           String AV16bardisnumto ,
                                           String A13878PedidoClie ,
                                           String AV15bardisnumfrom ,
                                           String AV38Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[85];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T7.Tb1_Cod, T1.BarFecFpr, T1.BarNumCli, T1.BarPlf, T1.CliCod, T4.CliNom, T1.BarSit, T1.BarFecGen, T1.BarFecCli, T1.BarFecSal, T1.BarSer, T1.BarSerDsc, T1.BarColNom," ;
      scmdbuf += " T1.BarColNum, T1.BarNomCli, T1.BarTipArt AS BarTipArt, T3.TipArtDsc AS BarTipArtD, T1.BarGirar, T1.BarAcaAnh, T2.DisUsrCod, T1.BarAgrEst, T1.BarExt, COALESCE( T5.BarFasCod," ;
      scmdbuf += " ' ') AS BarFasCod, COALESCE( T6.BarFasCod, ' ') AS BarFasSig, COALESCE( T7.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T8.BarKgm, 0) AS BarKgm, COALESCE( T8.BarMtr," ;
      scmdbuf += " 0) AS BarMtr, COALESCE( T9.BarAlbMts, 0) AS BarAlbMts, COALESCE( T9.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T8.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T8.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.DisCod, T1.BarProPer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((((((((TXPBARCAD T1 INNER JOIN TXPDISPOS" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM" ;
      scmdbuf += " (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin" ;
      scmdbuf += " = T11.GXC1) AND (T10.BarFasEst <> 0) GROUP BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND" ;
      scmdbuf += " T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod, COALESCE( T11.BarFasLin, 0) AS BarFasLin, T10.EmprCod," ;
      scmdbuf += " T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM ((TXPBARFAS T10 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS" ;
      scmdbuf += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo" ;
      scmdbuf += " AND T11.BarCodPar = T10.BarCodPar) INNER JOIN (SELECT MIN(T13.BarOrdLin) AS GXC2, COALESCE( T14.BarFasLin, 0) AS BarFasLin, T13.EmprCod, T13.BarCod, T13.BarCodReo," ;
      scmdbuf += " T13.BarCodPar FROM (TXPBARFAS T13 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T14 ON T14.EmprCod = T13.EmprCod AND T14.BarCod = T13.BarCod AND T14.BarCodReo = T13.BarCodReo AND T14.BarCodPar = T13.BarCodPar)" ;
      scmdbuf += " WHERE (T13.BarOrdLin >= 0) AND (T13.BarOrdLin > COALESCE( T14.BarFasLin, 0)) AND (T13.BarFasEst = 0) GROUP BY T14.BarFasLin, T13.EmprCod, T13.BarCod, T13.BarCodReo," ;
      scmdbuf += " T13.BarCodPar ) T12 ON T12.EmprCod = T10.EmprCod AND T12.BarCod = T10.BarCod AND T12.BarCodReo = T10.BarCodReo AND T12.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin" ;
      scmdbuf += " = T12.GXC2) AND (T10.BarOrdLin >= 0) AND (T10.BarOrdLin > COALESCE( T11.BarFasLin, 0)) AND (T10.BarFasEst = 0) GROUP BY T11.BarFasLin, T10.EmprCod, T10.BarCod," ;
      scmdbuf += " T10.BarCodReo, T10.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " TXPTABLE1 T7 ON T7.EmprCod = T1.EmprCod AND T7.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet)" ;
      scmdbuf += " AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod" ;
      scmdbuf += " = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarAlbMtrE) AS BarAlbMts, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbKgmE) AS BarAlbKgs FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T1.EmprCod AND T9.BarCod = T1.BarCod AND T9.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T9.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      if ( ! (GXutil.strcmp("", AV105TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV104TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV86TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV41TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV40TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV72TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV98TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV97TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV96TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV80TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV92TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV90TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71TFBarFecSal_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV65TFBarFecCli_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69TFBarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (0==AV95TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (0==AV94TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV78TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV102TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (0==AV101TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( ! (0==AV100TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV25BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV6BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int10[57] = (byte)(1) ;
      }
      if ( ! (0==AV9BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[58] = (byte)(1) ;
      }
      if ( ! (0==AV8BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[59] = (byte)(1) ;
      }
      if ( ! (0==AV10BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[60] = (byte)(1) ;
      }
      if ( ! (0==AV5BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int10[62] = (byte)(1) ;
      }
      if ( ! (0==AV35BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int10[63] = (byte)(1) ;
      }
      if ( ! (0==AV34BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int10[64] = (byte)(1) ;
      }
      if ( ! (0==AV29BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int10[65] = (byte)(1) ;
      }
      if ( ! (0==AV28BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int10[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV27BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int10[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV26BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int10[68] = (byte)(1) ;
      }
      if ( ! (0==AV14BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[69] = (byte)(1) ;
      }
      if ( ! (0==AV13BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int10[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int10[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int10[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int10[74] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int10[75] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int10[76] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int10[77] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[78] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int10[79] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[80] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int10[81] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[82] = (byte)(1) ;
      }
      if ( ! (0==AV37clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[83] = (byte)(1) ;
      }
      if ( ! (0==AV36clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[84] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P003Z10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).intValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.util.Date)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , (java.util.Date)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , (String)dynConstraints[70] , (String)dynConstraints[71] , ((Number) dynConstraints[72]).shortValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (java.util.Date)dynConstraints[79] , (java.util.Date)dynConstraints[80] , ((Number) dynConstraints[81]).byteValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).byteValue() , (String)dynConstraints[84] , (String)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , (String)dynConstraints[87] , ((Number) dynConstraints[88]).intValue() , (java.util.Date)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , (String)dynConstraints[98] , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , ((Number) dynConstraints[101]).intValue() , ((Number) dynConstraints[102]).longValue() , ((Number) dynConstraints[103]).longValue() , ((Number) dynConstraints[104]).longValue() , (String)dynConstraints[105] , (String)dynConstraints[106] , (String)dynConstraints[107] , (String)dynConstraints[108] , (String)dynConstraints[109] , (String)dynConstraints[110] , ((Number) dynConstraints[111]).byteValue() , ((Number) dynConstraints[112]).byteValue() , (String)dynConstraints[113] , (String)dynConstraints[114] , (String)dynConstraints[115] , (String)dynConstraints[116] , (String)dynConstraints[117] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003Z10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 8);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(29,2);
               ((short[]) buf[36])[0] = rslt.getShort(30);
               ((String[]) buf[37])[0] = rslt.getString(31, 1);
               ((int[]) buf[38])[0] = rslt.getInt(32);
               ((int[]) buf[39])[0] = rslt.getInt(33);
               ((String[]) buf[40])[0] = rslt.getString(34, 8);
               ((String[]) buf[41])[0] = rslt.getString(35, 1);
               ((byte[]) buf[42])[0] = rslt.getByte(36);
               ((int[]) buf[43])[0] = rslt.getInt(37);
               ((String[]) buf[44])[0] = rslt.getString(38, 8);
               ((String[]) buf[45])[0] = rslt.getString(39, 20);
               ((String[]) buf[46])[0] = rslt.getString(40, 3);
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
                  stmt.setString(sIdx, (String)parms[85], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 20);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[101]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[102]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[113]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[114]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[118]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[125]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[128]);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[129]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[130]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 11);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 30);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 20);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 4);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[143]).byteValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[145]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[146]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 1);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[148]).shortValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[149]).shortValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[151]).intValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[154]).intValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[155]).intValue());
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[156], 13);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[157], 13);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[158], 16);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[159], 16);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[160]);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[161]);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[162]);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[163]);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[164]);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[165]);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[166]);
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[167]);
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[168]).intValue());
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[169]).intValue());
               }
               return;
      }
   }

}

