package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_countrecord extends GXProcedure
{
   public consultadeproduccion_countrecord( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_countrecord.class ), "" );
   }

   public consultadeproduccion_countrecord( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
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
                            String aP87 )
   {
      consultadeproduccion_countrecord.this.aP88 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67, aP68, aP69, aP70, aP71, aP72, aP73, aP74, aP75, aP76, aP77, aP78, aP79, aP80, aP81, aP82, aP83, aP84, aP85, aP86, aP87, aP88);
      return aP88[0];
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
                        short[] aP88 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67, aP68, aP69, aP70, aP71, aP72, aP73, aP74, aP75, aP76, aP77, aP78, aP79, aP80, aP81, aP82, aP83, aP84, aP85, aP86, aP87, aP88);
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
                             short[] aP88 )
   {
      consultadeproduccion_countrecord.this.AV9Emprcod = aP0;
      consultadeproduccion_countrecord.this.AV41clicodfrom = aP1;
      consultadeproduccion_countrecord.this.AV42clicodto = aP2;
      consultadeproduccion_countrecord.this.AV20bardisnumfrom = aP3;
      consultadeproduccion_countrecord.this.AV21bardisnumto = aP4;
      consultadeproduccion_countrecord.this.AV26barfecgenfrom = aP5;
      consultadeproduccion_countrecord.this.AV27barfecgento = aP6;
      consultadeproduccion_countrecord.this.AV37barsitfrom = aP7;
      consultadeproduccion_countrecord.this.AV38barsitto = aP8;
      consultadeproduccion_countrecord.this.AV22BarFecClifrom = aP9;
      consultadeproduccion_countrecord.this.AV23BarFecClito = aP10;
      consultadeproduccion_countrecord.this.AV24BarFecFprfrom = aP11;
      consultadeproduccion_countrecord.this.AV25BarFecFprto = aP12;
      consultadeproduccion_countrecord.this.AV28BarFecSalfrom = aP13;
      consultadeproduccion_countrecord.this.AV29BarFecSalto = aP14;
      consultadeproduccion_countrecord.this.AV35BarSerfrom = aP15;
      consultadeproduccion_countrecord.this.AV36BarSerto = aP16;
      consultadeproduccion_countrecord.this.AV39BarTipArtfrom = aP17;
      consultadeproduccion_countrecord.this.AV40BarTipArtto = aP18;
      consultadeproduccion_countrecord.this.AV16BarColNomfrom = aP19;
      consultadeproduccion_countrecord.this.AV17BarColNomto = aP20;
      consultadeproduccion_countrecord.this.AV18BarColNumfrom = aP21;
      consultadeproduccion_countrecord.this.AV19BarColNumto = aP22;
      consultadeproduccion_countrecord.this.AV31BarNomClifrom = aP23;
      consultadeproduccion_countrecord.this.AV32BarNomClito = aP24;
      consultadeproduccion_countrecord.this.AV33BarNumClifrom = aP25;
      consultadeproduccion_countrecord.this.AV34BarNumClito = aP26;
      consultadeproduccion_countrecord.this.AV39BarTipArtfrom = aP27;
      consultadeproduccion_countrecord.this.AV40BarTipArtto = aP28;
      consultadeproduccion_countrecord.this.AV104TFBarPlf = aP29;
      consultadeproduccion_countrecord.this.AV10BarCodfrom = aP30;
      consultadeproduccion_countrecord.this.AV15BarCodto = aP31;
      consultadeproduccion_countrecord.this.AV13BarCodReofrom = aP32;
      consultadeproduccion_countrecord.this.AV14BarCodReoto = aP33;
      consultadeproduccion_countrecord.this.AV11BarCodParfrom = aP34;
      consultadeproduccion_countrecord.this.AV12BarCodParto = aP35;
      consultadeproduccion_countrecord.this.AV8Cod_Idtx = aP36;
      consultadeproduccion_countrecord.this.AV30BarGirar = aP37;
      consultadeproduccion_countrecord.this.AV120TFCliCod = aP38;
      consultadeproduccion_countrecord.this.AV121TFCliCod_To = aP39;
      consultadeproduccion_countrecord.this.AV122TFCliNom = aP40;
      consultadeproduccion_countrecord.this.AV123TFCliNom_Sel = aP41;
      consultadeproduccion_countrecord.this.AV93TFBarNHdr = aP42;
      consultadeproduccion_countrecord.this.AV94TFBarNHdr_Sel = aP43;
      consultadeproduccion_countrecord.this.AV114TFBarSit = aP44;
      consultadeproduccion_countrecord.this.AV115TFBarSit_To = aP45;
      consultadeproduccion_countrecord.this.AV83TFBarFecGen = aP46;
      consultadeproduccion_countrecord.this.AV84TFBarFecGen_To = aP47;
      consultadeproduccion_countrecord.this.AV79TFBarFecCli = aP48;
      consultadeproduccion_countrecord.this.AV80TFBarFecCli_To = aP49;
      consultadeproduccion_countrecord.this.AV85TFBarFecSal = aP50;
      consultadeproduccion_countrecord.this.AV86TFBarFecSal_To = aP51;
      consultadeproduccion_countrecord.this.AV109TFBarSer = aP52;
      consultadeproduccion_countrecord.this.AV110TFBarSer_Sel = aP53;
      consultadeproduccion_countrecord.this.AV112TFBarSerDsc = aP54;
      consultadeproduccion_countrecord.this.AV113TFBarSerDsc_Sel = aP55;
      consultadeproduccion_countrecord.this.AV63TFBarColNom = aP56;
      consultadeproduccion_countrecord.this.AV64TFBarColNom_Sel = aP57;
      consultadeproduccion_countrecord.this.AV66TFBarColNum = aP58;
      consultadeproduccion_countrecord.this.AV67TFBarColNum_To = aP59;
      consultadeproduccion_countrecord.this.AV95TFBarNomCli = aP60;
      consultadeproduccion_countrecord.this.AV96TFBarNomCli_Sel = aP61;
      consultadeproduccion_countrecord.this.AV116TFBarTipArt = aP62;
      consultadeproduccion_countrecord.this.AV117TFBarTipArt_To = aP63;
      consultadeproduccion_countrecord.this.AV118TFBarTipArtDsc = aP64;
      consultadeproduccion_countrecord.this.AV119TFBarTipArtDsc_Sel = aP65;
      consultadeproduccion_countrecord.this.AV105TFBarProPer = aP66;
      consultadeproduccion_countrecord.this.AV106TFBarProPer_Sel = aP67;
      consultadeproduccion_countrecord.this.AV87TFBarGirar = aP68;
      consultadeproduccion_countrecord.this.AV88TFBarGirar_Sel = aP69;
      consultadeproduccion_countrecord.this.AV75TFBarFasCod = aP70;
      consultadeproduccion_countrecord.this.AV76TFBarFasCod_Sel = aP71;
      consultadeproduccion_countrecord.this.AV77TFBarFasSig = aP72;
      consultadeproduccion_countrecord.this.AV78TFBarFasSig_Sel = aP73;
      consultadeproduccion_countrecord.this.AV55TFBarAlbUltimo = aP74;
      consultadeproduccion_countrecord.this.AV56TFBarAlbUltimo_To = aP75;
      consultadeproduccion_countrecord.this.AV49TFBarAlbFact = aP76;
      consultadeproduccion_countrecord.this.AV50TFBarAlbFact_To = aP77;
      consultadeproduccion_countrecord.this.AV45TFBarAcaAnh = aP78;
      consultadeproduccion_countrecord.this.AV46TFBarAcaAnh_To = aP79;
      consultadeproduccion_countrecord.this.AV68TFBarCuaderno = aP80;
      consultadeproduccion_countrecord.this.AV69TFBarCuaderno_Sel = aP81;
      consultadeproduccion_countrecord.this.AV107TFBarProPerIdtx = aP82;
      consultadeproduccion_countrecord.this.AV108TFBarProPerIdtx_Sel = aP83;
      consultadeproduccion_countrecord.this.AV98TFBarNormas = aP84;
      consultadeproduccion_countrecord.this.AV99TFBarNormas_Sel = aP85;
      consultadeproduccion_countrecord.this.AV128TFDisUsrCod = aP86;
      consultadeproduccion_countrecord.this.AV129TFDisUsrCod_Sel = aP87;
      consultadeproduccion_countrecord.this.aP88 = aP88;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV41clicodfrom) ,
                                           Integer.valueOf(AV42clicodto) ,
                                           AV26barfecgenfrom ,
                                           AV27barfecgento ,
                                           AV28BarFecSalfrom ,
                                           AV29BarFecSalto ,
                                           AV22BarFecClifrom ,
                                           AV23BarFecClito ,
                                           AV24BarFecFprfrom ,
                                           AV25BarFecFprto ,
                                           AV35BarSerfrom ,
                                           AV36BarSerto ,
                                           AV16BarColNomfrom ,
                                           AV17BarColNomto ,
                                           Integer.valueOf(AV18BarColNumfrom) ,
                                           Integer.valueOf(AV19BarColNumto) ,
                                           AV31BarNomClifrom ,
                                           AV32BarNomClito ,
                                           Integer.valueOf(AV33BarNumClifrom) ,
                                           Integer.valueOf(AV34BarNumClito) ,
                                           Short.valueOf(AV39BarTipArtfrom) ,
                                           Short.valueOf(AV40BarTipArtto) ,
                                           AV104TFBarPlf ,
                                           Integer.valueOf(AV10BarCodfrom) ,
                                           Integer.valueOf(AV15BarCodto) ,
                                           Byte.valueOf(AV13BarCodReofrom) ,
                                           Byte.valueOf(AV14BarCodReoto) ,
                                           AV11BarCodParfrom ,
                                           AV12BarCodParto ,
                                           AV8Cod_Idtx ,
                                           AV30BarGirar ,
                                           Integer.valueOf(AV120TFCliCod) ,
                                           Integer.valueOf(AV121TFCliCod_To) ,
                                           AV123TFCliNom_Sel ,
                                           AV122TFCliNom ,
                                           AV94TFBarNHdr_Sel ,
                                           AV93TFBarNHdr ,
                                           Byte.valueOf(AV114TFBarSit) ,
                                           Byte.valueOf(AV115TFBarSit_To) ,
                                           AV83TFBarFecGen ,
                                           AV84TFBarFecGen_To ,
                                           AV79TFBarFecCli ,
                                           AV80TFBarFecCli_To ,
                                           AV85TFBarFecSal ,
                                           AV86TFBarFecSal_To ,
                                           AV110TFBarSer_Sel ,
                                           AV109TFBarSer ,
                                           AV113TFBarSerDsc_Sel ,
                                           AV112TFBarSerDsc ,
                                           AV64TFBarColNom_Sel ,
                                           AV63TFBarColNom ,
                                           Integer.valueOf(AV66TFBarColNum) ,
                                           Integer.valueOf(AV67TFBarColNum_To) ,
                                           AV96TFBarNomCli_Sel ,
                                           AV95TFBarNomCli ,
                                           Short.valueOf(AV116TFBarTipArt) ,
                                           Short.valueOf(AV117TFBarTipArt_To) ,
                                           AV119TFBarTipArtDsc_Sel ,
                                           AV118TFBarTipArtDsc ,
                                           AV88TFBarGirar_Sel ,
                                           AV87TFBarGirar ,
                                           Short.valueOf(AV45TFBarAcaAnh) ,
                                           Short.valueOf(AV46TFBarAcaAnh_To) ,
                                           AV106TFBarProPer_Sel ,
                                           AV105TFBarProPer ,
                                           AV129TFDisUsrCod_Sel ,
                                           AV128TFDisUsrCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A3030BarPlf ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           A279CliNom ,
                                           Byte.valueOf(A213BarSit) ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           A4348DisUsrCod ,
                                           AV20bardisnumfrom ,
                                           A13878PedidoClie ,
                                           AV21bardisnumto ,
                                           Byte.valueOf(AV37barsitfrom) ,
                                           Byte.valueOf(AV38barsitto) ,
                                           AV76TFBarFasCod_Sel ,
                                           AV75TFBarFasCod ,
                                           A151BarFasCod ,
                                           AV78TFBarFasSig_Sel ,
                                           AV77TFBarFasSig ,
                                           A1955BarFasSig ,
                                           Long.valueOf(AV55TFBarAlbUltimo) ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           Long.valueOf(AV56TFBarAlbUltimo_To) ,
                                           Integer.valueOf(AV49TFBarAlbFact) ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           Integer.valueOf(AV50TFBarAlbFact_To) ,
                                           AV69TFBarCuaderno_Sel ,
                                           AV68TFBarCuaderno ,
                                           A13933BarCuadern ,
                                           AV108TFBarProPerIdtx_Sel ,
                                           AV107TFBarProPerIdtx ,
                                           A14204BarProPerI ,
                                           AV99TFBarNormas_Sel ,
                                           AV98TFBarNormas ,
                                           A13934BarNormas ,
                                           AV9Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV75TFBarFasCod = GXutil.padr( GXutil.rtrim( AV75TFBarFasCod), 8, "%") ;
      lV77TFBarFasSig = GXutil.padr( GXutil.rtrim( AV77TFBarFasSig), 8, "%") ;
      lV68TFBarCuaderno = GXutil.padr( GXutil.rtrim( AV68TFBarCuaderno), 20, "%") ;
      lV122TFCliNom = GXutil.padr( GXutil.rtrim( AV122TFCliNom), 30, "%") ;
      lV93TFBarNHdr = GXutil.padr( GXutil.rtrim( AV93TFBarNHdr), 11, "%") ;
      lV109TFBarSer = GXutil.padr( GXutil.rtrim( AV109TFBarSer), 16, "%") ;
      lV112TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV112TFBarSerDsc), 26, "%") ;
      lV63TFBarColNom = GXutil.padr( GXutil.rtrim( AV63TFBarColNom), 13, "%") ;
      lV95TFBarNomCli = GXutil.padr( GXutil.rtrim( AV95TFBarNomCli), 13, "%") ;
      lV118TFBarTipArtDsc = GXutil.padr( GXutil.rtrim( AV118TFBarTipArtDsc), 30, "%") ;
      lV87TFBarGirar = GXutil.padr( GXutil.rtrim( AV87TFBarGirar), 20, "%") ;
      lV105TFBarProPer = GXutil.padr( GXutil.rtrim( AV105TFBarProPer), 8, "%") ;
      lV128TFDisUsrCod = GXutil.padr( GXutil.rtrim( AV128TFDisUsrCod), 8, "%") ;
      /* Using cursor P0A6E8 */
      pr_default.execute(0, new Object[] {AV9Emprcod, Byte.valueOf(AV37barsitfrom), Byte.valueOf(AV38barsitto), AV76TFBarFasCod_Sel, AV75TFBarFasCod, lV75TFBarFasCod, AV76TFBarFasCod_Sel, AV76TFBarFasCod_Sel, AV78TFBarFasSig_Sel, AV77TFBarFasSig, lV77TFBarFasSig, AV78TFBarFasSig_Sel, AV78TFBarFasSig_Sel, AV69TFBarCuaderno_Sel, AV68TFBarCuaderno, lV68TFBarCuaderno, AV69TFBarCuaderno_Sel, AV69TFBarCuaderno_Sel, Integer.valueOf(AV41clicodfrom), Integer.valueOf(AV42clicodto), AV26barfecgenfrom, AV27barfecgento, AV28BarFecSalfrom, AV29BarFecSalto, AV22BarFecClifrom, AV23BarFecClito, AV24BarFecFprfrom, AV25BarFecFprto, AV35BarSerfrom, AV36BarSerto, AV16BarColNomfrom, AV17BarColNomto, Integer.valueOf(AV18BarColNumfrom), Integer.valueOf(AV19BarColNumto), AV31BarNomClifrom, AV32BarNomClito, Integer.valueOf(AV33BarNumClifrom), Integer.valueOf(AV34BarNumClito), Short.valueOf(AV39BarTipArtfrom), Short.valueOf(AV40BarTipArtto), AV104TFBarPlf, Integer.valueOf(AV10BarCodfrom), Integer.valueOf(AV15BarCodto), Byte.valueOf(AV13BarCodReofrom), Byte.valueOf(AV14BarCodReoto), AV11BarCodParfrom, AV12BarCodParto, AV8Cod_Idtx, AV30BarGirar, Integer.valueOf(AV120TFCliCod), Integer.valueOf(AV121TFCliCod_To), lV122TFCliNom, AV123TFCliNom_Sel, lV93TFBarNHdr, AV94TFBarNHdr_Sel, Byte.valueOf(AV114TFBarSit), Byte.valueOf(AV115TFBarSit_To), AV83TFBarFecGen, AV84TFBarFecGen_To, AV79TFBarFecCli, AV80TFBarFecCli_To, AV85TFBarFecSal, AV86TFBarFecSal_To, lV109TFBarSer, AV110TFBarSer_Sel, lV112TFBarSerDsc, AV113TFBarSerDsc_Sel, lV63TFBarColNom, AV64TFBarColNom_Sel, Integer.valueOf(AV66TFBarColNum), Integer.valueOf(AV67TFBarColNum_To), lV95TFBarNomCli, AV96TFBarNomCli_Sel, Short.valueOf(AV116TFBarTipArt), Short.valueOf(AV117TFBarTipArt_To), lV118TFBarTipArtDsc, AV119TFBarTipArtDsc_Sel, lV87TFBarGirar, AV88TFBarGirar_Sel, Short.valueOf(AV45TFBarAcaAnh), Short.valueOf(AV46TFBarAcaAnh_To), lV105TFBarProPer, AV106TFBarProPer_Sel, lV128TFDisUsrCod, AV129TFDisUsrCod_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4348DisUsrCod = P0A6E8_A4348DisUsrCod[0] ;
         A4466BarAcaAnh = P0A6E8_A4466BarAcaAnh[0] ;
         A13711BarTipArtD = P0A6E8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P0A6E8_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P0A6E8_A1652BarSerDsc[0] ;
         A279CliNom = P0A6E8_A279CliNom[0] ;
         A2454BarGirar = P0A6E8_A2454BarGirar[0] ;
         A3030BarPlf = P0A6E8_A3030BarPlf[0] ;
         A217BarTipArt = P0A6E8_A217BarTipArt[0] ;
         n217BarTipArt = P0A6E8_n217BarTipArt[0] ;
         A1235BarNumCli = P0A6E8_A1235BarNumCli[0] ;
         A1234BarNomCli = P0A6E8_A1234BarNomCli[0] ;
         A136BarColNum = P0A6E8_A136BarColNum[0] ;
         A135BarColNom = P0A6E8_A135BarColNom[0] ;
         A212BarSer = P0A6E8_A212BarSer[0] ;
         A213BarSit = P0A6E8_A213BarSit[0] ;
         A158BarFecFpr = P0A6E8_A158BarFecFpr[0] ;
         A155BarFecCli = P0A6E8_A155BarFecCli[0] ;
         A161BarFecSal = P0A6E8_A161BarFecSal[0] ;
         A159BarFecGen = P0A6E8_A159BarFecGen[0] ;
         A252CliCod = P0A6E8_A252CliCod[0] ;
         n252CliCod = P0A6E8_n252CliCod[0] ;
         A13933BarCuadern = P0A6E8_A13933BarCuadern[0] ;
         n13933BarCuadern = P0A6E8_n13933BarCuadern[0] ;
         A1955BarFasSig = P0A6E8_A1955BarFasSig[0] ;
         n1955BarFasSig = P0A6E8_n1955BarFasSig[0] ;
         A151BarFasCod = P0A6E8_A151BarFasCod[0] ;
         n151BarFasCod = P0A6E8_n151BarFasCod[0] ;
         A143BarDisNum = P0A6E8_A143BarDisNum[0] ;
         A4812BarEncCli = P0A6E8_A4812BarEncCli[0] ;
         A130BarCodPar = P0A6E8_A130BarCodPar[0] ;
         A132BarCodReo = P0A6E8_A132BarCodReo[0] ;
         A129BarCod = P0A6E8_A129BarCod[0] ;
         A2829BarProPer = P0A6E8_A2829BarProPer[0] ;
         A361DisCod = P0A6E8_A361DisCod[0] ;
         A396EmprCod = P0A6E8_A396EmprCod[0] ;
         A4348DisUsrCod = P0A6E8_A4348DisUsrCod[0] ;
         A13711BarTipArtD = P0A6E8_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P0A6E8_n13711BarTipArtD[0] ;
         A279CliNom = P0A6E8_A279CliNom[0] ;
         A13933BarCuadern = P0A6E8_A13933BarCuadern[0] ;
         n13933BarCuadern = P0A6E8_n13933BarCuadern[0] ;
         A1955BarFasSig = P0A6E8_A1955BarFasSig[0] ;
         n1955BarFasSig = P0A6E8_n1955BarFasSig[0] ;
         A151BarFasCod = P0A6E8_A151BarFasCod[0] ;
         n151BarFasCod = P0A6E8_n151BarFasCod[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         consultadeproduccion_countrecord.this.A396EmprCod = GXv_char2[0] ;
         consultadeproduccion_countrecord.this.A4812BarEncCli = GXv_char3[0] ;
         consultadeproduccion_countrecord.this.A143BarDisNum = GXv_char4[0] ;
         consultadeproduccion_countrecord.this.GXt_char1 = GXv_char5[0] ;
         A13878PedidoClie = GXt_char1 ;
         if ( (GXutil.strcmp("", AV20bardisnumfrom)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV20bardisnumfrom) >= 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV21bardisnumto)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV21bardisnumto) <= 0 ) ) )
            {
               GXt_int6 = A13930BarAlbUlti ;
               GXv_int7[0] = GXt_int6 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int7) ;
               consultadeproduccion_countrecord.this.GXt_int6 = GXv_int7[0] ;
               A13930BarAlbUlti = GXt_int6 ;
               if ( (0==AV55TFBarAlbUltimo) || ( ( A13930BarAlbUlti >= AV55TFBarAlbUltimo ) ) )
               {
                  if ( (0==AV56TFBarAlbUltimo_To) || ( ( A13930BarAlbUlti <= AV56TFBarAlbUltimo_To ) ) )
                  {
                     GXt_int8 = A13935BarAlbFact ;
                     GXv_int9[0] = GXt_int8 ;
                     new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int9) ;
                     consultadeproduccion_countrecord.this.GXt_int8 = GXv_int9[0] ;
                     A13935BarAlbFact = GXt_int8 ;
                     if ( (0==AV49TFBarAlbFact) || ( ( A13935BarAlbFact >= AV49TFBarAlbFact ) ) )
                     {
                        if ( (0==AV50TFBarAlbFact_To) || ( ( A13935BarAlbFact <= AV50TFBarAlbFact_To ) ) )
                        {
                           GXt_char1 = A14204BarProPerI ;
                           GXv_char5[0] = GXt_char1 ;
                           new app.pinditexin(remoteHandle, context).execute( A396EmprCod, A2829BarProPer, GXv_char5) ;
                           consultadeproduccion_countrecord.this.GXt_char1 = GXv_char5[0] ;
                           A14204BarProPerI = GXt_char1 ;
                           if ( ! ( (GXutil.strcmp("", AV108TFBarProPerIdtx_Sel)==0) && ( ! (GXutil.strcmp("", AV107TFBarProPerIdtx)==0) ) ) || ( GXutil.like( GXutil.upper( A14204BarProPerI) , GXutil.padr( "%" + GXutil.upper( AV107TFBarProPerIdtx) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV108TFBarProPerIdtx_Sel)==0) || ( ( GXutil.strcmp(A14204BarProPerI, AV108TFBarProPerIdtx_Sel) == 0 ) ) )
                              {
                                 GXt_char1 = A13934BarNormas ;
                                 GXv_char5[0] = GXt_char1 ;
                                 new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char5) ;
                                 consultadeproduccion_countrecord.this.GXt_char1 = GXv_char5[0] ;
                                 A13934BarNormas = GXt_char1 ;
                                 if ( ! ( (GXutil.strcmp("", AV99TFBarNormas_Sel)==0) && ( ! (GXutil.strcmp("", AV98TFBarNormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV98TFBarNormas) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV99TFBarNormas_Sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV99TFBarNormas_Sel) == 0 ) ) )
                                    {
                                       A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
                                       AV132count = (short)(AV132count+1) ;
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
      this.aP88[0] = consultadeproduccion_countrecord.this.AV132count;
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
      lV75TFBarFasCod = "" ;
      lV77TFBarFasSig = "" ;
      lV68TFBarCuaderno = "" ;
      lV122TFCliNom = "" ;
      lV93TFBarNHdr = "" ;
      lV109TFBarSer = "" ;
      lV112TFBarSerDsc = "" ;
      lV63TFBarColNom = "" ;
      lV95TFBarNomCli = "" ;
      lV118TFBarTipArtDsc = "" ;
      lV87TFBarGirar = "" ;
      lV105TFBarProPer = "" ;
      lV128TFDisUsrCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A3030BarPlf = "" ;
      A130BarCodPar = "" ;
      A2829BarProPer = "" ;
      A2454BarGirar = "" ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A4348DisUsrCod = "" ;
      A13878PedidoClie = "" ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A13933BarCuadern = "" ;
      A14204BarProPerI = "" ;
      A13934BarNormas = "" ;
      A396EmprCod = "" ;
      P0A6E8_A9713Tb1_Cod = new short[1] ;
      P0A6E8_A4348DisUsrCod = new String[] {""} ;
      P0A6E8_A4466BarAcaAnh = new short[1] ;
      P0A6E8_A13711BarTipArtD = new String[] {""} ;
      P0A6E8_n13711BarTipArtD = new boolean[] {false} ;
      P0A6E8_A1652BarSerDsc = new String[] {""} ;
      P0A6E8_A279CliNom = new String[] {""} ;
      P0A6E8_A2454BarGirar = new String[] {""} ;
      P0A6E8_A3030BarPlf = new String[] {""} ;
      P0A6E8_A217BarTipArt = new short[1] ;
      P0A6E8_n217BarTipArt = new boolean[] {false} ;
      P0A6E8_A1235BarNumCli = new int[1] ;
      P0A6E8_A1234BarNomCli = new String[] {""} ;
      P0A6E8_A136BarColNum = new int[1] ;
      P0A6E8_A135BarColNom = new String[] {""} ;
      P0A6E8_A212BarSer = new String[] {""} ;
      P0A6E8_A213BarSit = new byte[1] ;
      P0A6E8_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6E8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6E8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6E8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6E8_A252CliCod = new int[1] ;
      P0A6E8_n252CliCod = new boolean[] {false} ;
      P0A6E8_A13933BarCuadern = new String[] {""} ;
      P0A6E8_n13933BarCuadern = new boolean[] {false} ;
      P0A6E8_A1955BarFasSig = new String[] {""} ;
      P0A6E8_n1955BarFasSig = new boolean[] {false} ;
      P0A6E8_A151BarFasCod = new String[] {""} ;
      P0A6E8_n151BarFasCod = new boolean[] {false} ;
      P0A6E8_A143BarDisNum = new String[] {""} ;
      P0A6E8_A4812BarEncCli = new String[] {""} ;
      P0A6E8_A130BarCodPar = new String[] {""} ;
      P0A6E8_A132BarCodReo = new byte[1] ;
      P0A6E8_A129BarCod = new int[1] ;
      P0A6E8_A2829BarProPer = new String[] {""} ;
      P0A6E8_A361DisCod = new int[1] ;
      P0A6E8_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new long[1] ;
      GXv_int9 = new int[1] ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      A13696BarNHdr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_countrecord__default(),
         new Object[] {
             new Object[] {
            P0A6E8_A9713Tb1_Cod, P0A6E8_A4348DisUsrCod, P0A6E8_A4466BarAcaAnh, P0A6E8_A13711BarTipArtD, P0A6E8_n13711BarTipArtD, P0A6E8_A1652BarSerDsc, P0A6E8_A279CliNom, P0A6E8_A2454BarGirar, P0A6E8_A3030BarPlf, P0A6E8_A217BarTipArt,
            P0A6E8_n217BarTipArt, P0A6E8_A1235BarNumCli, P0A6E8_A1234BarNomCli, P0A6E8_A136BarColNum, P0A6E8_A135BarColNom, P0A6E8_A212BarSer, P0A6E8_A213BarSit, P0A6E8_A158BarFecFpr, P0A6E8_A155BarFecCli, P0A6E8_A161BarFecSal,
            P0A6E8_A159BarFecGen, P0A6E8_A252CliCod, P0A6E8_n252CliCod, P0A6E8_A13933BarCuadern, P0A6E8_n13933BarCuadern, P0A6E8_A1955BarFasSig, P0A6E8_n1955BarFasSig, P0A6E8_A151BarFasCod, P0A6E8_n151BarFasCod, P0A6E8_A143BarDisNum,
            P0A6E8_A4812BarEncCli, P0A6E8_A130BarCodPar, P0A6E8_A132BarCodReo, P0A6E8_A129BarCod, P0A6E8_A2829BarProPer, P0A6E8_A361DisCod, P0A6E8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37barsitfrom ;
   private byte AV38barsitto ;
   private byte AV13BarCodReofrom ;
   private byte AV14BarCodReoto ;
   private byte AV114TFBarSit ;
   private byte AV115TFBarSit_To ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV39BarTipArtfrom ;
   private short AV40BarTipArtto ;
   private short AV116TFBarTipArt ;
   private short AV117TFBarTipArt_To ;
   private short AV45TFBarAcaAnh ;
   private short AV46TFBarAcaAnh_To ;
   private short AV132count ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short Gx_err ;
   private int AV41clicodfrom ;
   private int AV42clicodto ;
   private int AV18BarColNumfrom ;
   private int AV19BarColNumto ;
   private int AV33BarNumClifrom ;
   private int AV34BarNumClito ;
   private int AV10BarCodfrom ;
   private int AV15BarCodto ;
   private int AV120TFCliCod ;
   private int AV121TFCliCod_To ;
   private int AV66TFBarColNum ;
   private int AV67TFBarColNum_To ;
   private int AV49TFBarAlbFact ;
   private int AV50TFBarAlbFact_To ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int A13935BarAlbFact ;
   private int A361DisCod ;
   private int GXt_int8 ;
   private int GXv_int9[] ;
   private long AV55TFBarAlbUltimo ;
   private long AV56TFBarAlbUltimo_To ;
   private long A13930BarAlbUlti ;
   private long GXt_int6 ;
   private long GXv_int7[] ;
   private String AV9Emprcod ;
   private String AV20bardisnumfrom ;
   private String AV21bardisnumto ;
   private String AV35BarSerfrom ;
   private String AV36BarSerto ;
   private String AV16BarColNomfrom ;
   private String AV17BarColNomto ;
   private String AV31BarNomClifrom ;
   private String AV32BarNomClito ;
   private String AV104TFBarPlf ;
   private String AV11BarCodParfrom ;
   private String AV12BarCodParto ;
   private String AV8Cod_Idtx ;
   private String AV30BarGirar ;
   private String AV122TFCliNom ;
   private String AV123TFCliNom_Sel ;
   private String AV93TFBarNHdr ;
   private String AV94TFBarNHdr_Sel ;
   private String AV109TFBarSer ;
   private String AV110TFBarSer_Sel ;
   private String AV112TFBarSerDsc ;
   private String AV113TFBarSerDsc_Sel ;
   private String AV63TFBarColNom ;
   private String AV64TFBarColNom_Sel ;
   private String AV95TFBarNomCli ;
   private String AV96TFBarNomCli_Sel ;
   private String AV118TFBarTipArtDsc ;
   private String AV119TFBarTipArtDsc_Sel ;
   private String AV105TFBarProPer ;
   private String AV106TFBarProPer_Sel ;
   private String AV87TFBarGirar ;
   private String AV88TFBarGirar_Sel ;
   private String AV75TFBarFasCod ;
   private String AV76TFBarFasCod_Sel ;
   private String AV77TFBarFasSig ;
   private String AV78TFBarFasSig_Sel ;
   private String AV68TFBarCuaderno ;
   private String AV69TFBarCuaderno_Sel ;
   private String AV107TFBarProPerIdtx ;
   private String AV108TFBarProPerIdtx_Sel ;
   private String AV128TFDisUsrCod ;
   private String AV129TFDisUsrCod_Sel ;
   private String scmdbuf ;
   private String lV75TFBarFasCod ;
   private String lV77TFBarFasSig ;
   private String lV68TFBarCuaderno ;
   private String lV122TFCliNom ;
   private String lV93TFBarNHdr ;
   private String lV109TFBarSer ;
   private String lV112TFBarSerDsc ;
   private String lV63TFBarColNom ;
   private String lV95TFBarNomCli ;
   private String lV118TFBarTipArtDsc ;
   private String lV87TFBarGirar ;
   private String lV105TFBarProPer ;
   private String lV128TFDisUsrCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A3030BarPlf ;
   private String A130BarCodPar ;
   private String A2829BarProPer ;
   private String A2454BarGirar ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A4348DisUsrCod ;
   private String A13878PedidoClie ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String A13933BarCuadern ;
   private String A14204BarProPerI ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String A13696BarNHdr ;
   private java.util.Date AV26barfecgenfrom ;
   private java.util.Date AV27barfecgento ;
   private java.util.Date AV22BarFecClifrom ;
   private java.util.Date AV23BarFecClito ;
   private java.util.Date AV24BarFecFprfrom ;
   private java.util.Date AV25BarFecFprto ;
   private java.util.Date AV28BarFecSalfrom ;
   private java.util.Date AV29BarFecSalto ;
   private java.util.Date AV83TFBarFecGen ;
   private java.util.Date AV84TFBarFecGen_To ;
   private java.util.Date AV79TFBarFecCli ;
   private java.util.Date AV80TFBarFecCli_To ;
   private java.util.Date AV85TFBarFecSal ;
   private java.util.Date AV86TFBarFecSal_To ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private boolean n13711BarTipArtD ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13933BarCuadern ;
   private boolean n1955BarFasSig ;
   private boolean n151BarFasCod ;
   private String AV98TFBarNormas ;
   private String AV99TFBarNormas_Sel ;
   private String A13934BarNormas ;
   private short[] aP88 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A6E8_A9713Tb1_Cod ;
   private String[] P0A6E8_A4348DisUsrCod ;
   private short[] P0A6E8_A4466BarAcaAnh ;
   private String[] P0A6E8_A13711BarTipArtD ;
   private boolean[] P0A6E8_n13711BarTipArtD ;
   private String[] P0A6E8_A1652BarSerDsc ;
   private String[] P0A6E8_A279CliNom ;
   private String[] P0A6E8_A2454BarGirar ;
   private String[] P0A6E8_A3030BarPlf ;
   private short[] P0A6E8_A217BarTipArt ;
   private boolean[] P0A6E8_n217BarTipArt ;
   private int[] P0A6E8_A1235BarNumCli ;
   private String[] P0A6E8_A1234BarNomCli ;
   private int[] P0A6E8_A136BarColNum ;
   private String[] P0A6E8_A135BarColNom ;
   private String[] P0A6E8_A212BarSer ;
   private byte[] P0A6E8_A213BarSit ;
   private java.util.Date[] P0A6E8_A158BarFecFpr ;
   private java.util.Date[] P0A6E8_A155BarFecCli ;
   private java.util.Date[] P0A6E8_A161BarFecSal ;
   private java.util.Date[] P0A6E8_A159BarFecGen ;
   private int[] P0A6E8_A252CliCod ;
   private boolean[] P0A6E8_n252CliCod ;
   private String[] P0A6E8_A13933BarCuadern ;
   private boolean[] P0A6E8_n13933BarCuadern ;
   private String[] P0A6E8_A1955BarFasSig ;
   private boolean[] P0A6E8_n1955BarFasSig ;
   private String[] P0A6E8_A151BarFasCod ;
   private boolean[] P0A6E8_n151BarFasCod ;
   private String[] P0A6E8_A143BarDisNum ;
   private String[] P0A6E8_A4812BarEncCli ;
   private String[] P0A6E8_A130BarCodPar ;
   private byte[] P0A6E8_A132BarCodReo ;
   private int[] P0A6E8_A129BarCod ;
   private String[] P0A6E8_A2829BarProPer ;
   private int[] P0A6E8_A361DisCod ;
   private String[] P0A6E8_A396EmprCod ;
}

final  class consultadeproduccion_countrecord__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A6E8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV41clicodfrom ,
                                          int AV42clicodto ,
                                          java.util.Date AV26barfecgenfrom ,
                                          java.util.Date AV27barfecgento ,
                                          java.util.Date AV28BarFecSalfrom ,
                                          java.util.Date AV29BarFecSalto ,
                                          java.util.Date AV22BarFecClifrom ,
                                          java.util.Date AV23BarFecClito ,
                                          java.util.Date AV24BarFecFprfrom ,
                                          java.util.Date AV25BarFecFprto ,
                                          String AV35BarSerfrom ,
                                          String AV36BarSerto ,
                                          String AV16BarColNomfrom ,
                                          String AV17BarColNomto ,
                                          int AV18BarColNumfrom ,
                                          int AV19BarColNumto ,
                                          String AV31BarNomClifrom ,
                                          String AV32BarNomClito ,
                                          int AV33BarNumClifrom ,
                                          int AV34BarNumClito ,
                                          short AV39BarTipArtfrom ,
                                          short AV40BarTipArtto ,
                                          String AV104TFBarPlf ,
                                          int AV10BarCodfrom ,
                                          int AV15BarCodto ,
                                          byte AV13BarCodReofrom ,
                                          byte AV14BarCodReoto ,
                                          String AV11BarCodParfrom ,
                                          String AV12BarCodParto ,
                                          String AV8Cod_Idtx ,
                                          String AV30BarGirar ,
                                          int AV120TFCliCod ,
                                          int AV121TFCliCod_To ,
                                          String AV123TFCliNom_Sel ,
                                          String AV122TFCliNom ,
                                          String AV94TFBarNHdr_Sel ,
                                          String AV93TFBarNHdr ,
                                          byte AV114TFBarSit ,
                                          byte AV115TFBarSit_To ,
                                          java.util.Date AV83TFBarFecGen ,
                                          java.util.Date AV84TFBarFecGen_To ,
                                          java.util.Date AV79TFBarFecCli ,
                                          java.util.Date AV80TFBarFecCli_To ,
                                          java.util.Date AV85TFBarFecSal ,
                                          java.util.Date AV86TFBarFecSal_To ,
                                          String AV110TFBarSer_Sel ,
                                          String AV109TFBarSer ,
                                          String AV113TFBarSerDsc_Sel ,
                                          String AV112TFBarSerDsc ,
                                          String AV64TFBarColNom_Sel ,
                                          String AV63TFBarColNom ,
                                          int AV66TFBarColNum ,
                                          int AV67TFBarColNum_To ,
                                          String AV96TFBarNomCli_Sel ,
                                          String AV95TFBarNomCli ,
                                          short AV116TFBarTipArt ,
                                          short AV117TFBarTipArt_To ,
                                          String AV119TFBarTipArtDsc_Sel ,
                                          String AV118TFBarTipArtDsc ,
                                          String AV88TFBarGirar_Sel ,
                                          String AV87TFBarGirar ,
                                          short AV45TFBarAcaAnh ,
                                          short AV46TFBarAcaAnh_To ,
                                          String AV106TFBarProPer_Sel ,
                                          String AV105TFBarProPer ,
                                          String AV129TFDisUsrCod_Sel ,
                                          String AV128TFDisUsrCod ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          short A217BarTipArt ,
                                          String A3030BarPlf ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          String A279CliNom ,
                                          byte A213BarSit ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          short A4466BarAcaAnh ,
                                          String A4348DisUsrCod ,
                                          String AV20bardisnumfrom ,
                                          String A13878PedidoClie ,
                                          String AV21bardisnumto ,
                                          byte AV37barsitfrom ,
                                          byte AV38barsitto ,
                                          String AV76TFBarFasCod_Sel ,
                                          String AV75TFBarFasCod ,
                                          String A151BarFasCod ,
                                          String AV78TFBarFasSig_Sel ,
                                          String AV77TFBarFasSig ,
                                          String A1955BarFasSig ,
                                          long AV55TFBarAlbUltimo ,
                                          long A13930BarAlbUlti ,
                                          long AV56TFBarAlbUltimo_To ,
                                          int AV49TFBarAlbFact ,
                                          int A13935BarAlbFact ,
                                          int AV50TFBarAlbFact_To ,
                                          String AV69TFBarCuaderno_Sel ,
                                          String AV68TFBarCuaderno ,
                                          String A13933BarCuadern ,
                                          String AV108TFBarProPerIdtx_Sel ,
                                          String AV107TFBarProPerIdtx ,
                                          String A14204BarProPerI ,
                                          String AV99TFBarNormas_Sel ,
                                          String AV98TFBarNormas ,
                                          String A13934BarNormas ,
                                          String AV9Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[85];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T2.DisUsrCod, T1.BarAcaAnh, T3.TipArtDsc AS BarTipArtD, T1.BarSerDsc, T4.CliNom, T1.BarGirar, T1.BarPlf, T1.BarTipArt AS BarTipArt, T1.BarNumCli," ;
      scmdbuf += " T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarSit, T1.BarFecFpr, T1.BarFecCli, T1.BarFecSal, T1.BarFecGen, T1.CliCod, COALESCE( T5.Tb1_Dsc, ' ') AS" ;
      scmdbuf += " BarCuadern, COALESCE( T6.BarFasSig, ' ') AS BarFasSig, COALESCE( T7.BarFasSig, ' ') AS BarFasCod, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.BarProPer, T1.DisCod, T1.EmprCod FROM ((((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3" ;
      scmdbuf += " ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5" ;
      scmdbuf += " ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM" ;
      scmdbuf += " (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin" ;
      scmdbuf += " >= 0) AND (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar )" ;
      scmdbuf += " T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND" ;
      scmdbuf += " (T8.BarOrdLin >= 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS" ;
      scmdbuf += " WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND" ;
      scmdbuf += " T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      if ( ! (0==AV41clicodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV42clicodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26barfecgenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27barfecgento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV28BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22BarFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23BarFecClito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV18BarColNumfrom) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV19BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV32BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (0==AV33BarNumClifrom) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV34BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV39BarTipArtfrom) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (0==AV40BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104TFBarPlf)==0) )
      {
         addWhere(sWhereString, "(T1.BarPlf = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV10BarCodfrom) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (0==AV13BarCodReofrom) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (0==AV14BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV30BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (0==AV120TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (0==AV121TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV122TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV93TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( ! (0==AV114TFBarSit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( ! (0==AV115TFBarSit_To) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83TFBarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[57] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFBarFecGen_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int10[58] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[59] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80TFBarFecCli_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int10[60] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85TFBarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[61] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86TFBarFecSal_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int10[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV109TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[64] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV112TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV63TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[68] = (byte)(1) ;
      }
      if ( ! (0==AV66TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[69] = (byte)(1) ;
      }
      if ( ! (0==AV67TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[70] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV95TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[72] = (byte)(1) ;
      }
      if ( ! (0==AV116TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int10[73] = (byte)(1) ;
      }
      if ( ! (0==AV117TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int10[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119TFBarTipArtDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV118TFBarTipArtDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119TFBarTipArtDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int10[76] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88TFBarGirar_Sel)==0) && ( ! (GXutil.strcmp("", AV87TFBarGirar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarGirar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[77] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88TFBarGirar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int10[78] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int10[79] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T1.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int10[80] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106TFBarProPer_Sel)==0) && ( ! (GXutil.strcmp("", AV105TFBarProPer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarProPer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[81] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106TFBarProPer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int10[82] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129TFDisUsrCod_Sel)==0) && ( ! (GXutil.strcmp("", AV128TFDisUsrCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[83] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129TFDisUsrCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.DisUsrCod = ?)");
      }
      else
      {
         GXv_int10[84] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarFecGen" ;
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
                  return conditional_P0A6E8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , ((Number) dynConstraints[38]).byteValue() , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).intValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Number) dynConstraints[56]).shortValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).shortValue() , ((Number) dynConstraints[62]).shortValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , ((Number) dynConstraints[67]).intValue() , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , (java.util.Date)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (String)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).shortValue() , (String)dynConstraints[78] , ((Number) dynConstraints[79]).intValue() , ((Number) dynConstraints[80]).byteValue() , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , ((Number) dynConstraints[85]).byteValue() , (String)dynConstraints[86] , (String)dynConstraints[87] , ((Number) dynConstraints[88]).shortValue() , (String)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , ((Number) dynConstraints[93]).byteValue() , ((Number) dynConstraints[94]).byteValue() , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , ((Number) dynConstraints[101]).longValue() , ((Number) dynConstraints[102]).longValue() , ((Number) dynConstraints[103]).longValue() , ((Number) dynConstraints[104]).intValue() , ((Number) dynConstraints[105]).intValue() , ((Number) dynConstraints[106]).intValue() , (String)dynConstraints[107] , (String)dynConstraints[108] , (String)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] , (String)dynConstraints[112] , (String)dynConstraints[113] , (String)dynConstraints[114] , (String)dynConstraints[115] , (String)dynConstraints[116] , (String)dynConstraints[117] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6E8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 13);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(18);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(24, 8);
               ((String[]) buf[30])[0] = rslt.getString(25, 20);
               ((String[]) buf[31])[0] = rslt.getString(26, 1);
               ((byte[]) buf[32])[0] = rslt.getByte(27);
               ((int[]) buf[33])[0] = rslt.getInt(28);
               ((String[]) buf[34])[0] = rslt.getString(29, 8);
               ((int[]) buf[35])[0] = rslt.getInt(30);
               ((String[]) buf[36])[0] = rslt.getString(31, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 8);
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
                  stmt.setString(sIdx, (String)parms[98], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[111]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[112]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 16);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 16);
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
                  stmt.setInt(sIdx, ((Number) parms[121]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[122]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[126]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[127]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[128]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[129]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 4);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 20);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[140]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[141]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[142]);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[143]);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[144]);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[145]);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[146]);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[147]);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 16);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 16);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[150], 26);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[151], 26);
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
                  stmt.setShort(sIdx, ((Number) parms[158]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[160], 30);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[161], 30);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[162], 20);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 20);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[164]).shortValue());
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[165]).shortValue());
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[166], 8);
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 8);
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 8);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[169], 8);
               }
               return;
      }
   }

}

