package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class workaroundttrn09popup extends GXProcedure
{
   public workaroundttrn09popup( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workaroundttrn09popup.class ), "" );
   }

   public workaroundttrn09popup( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        java.math.BigDecimal aP5 ,
                        short aP6 ,
                        String aP7 ,
                        int aP8 ,
                        String aP9 ,
                        int aP10 ,
                        String aP11 ,
                        String aP12 ,
                        String aP13 ,
                        java.math.BigDecimal aP14 ,
                        java.math.BigDecimal aP15 ,
                        String aP16 ,
                        java.math.BigDecimal aP17 ,
                        short aP18 ,
                        short aP19 ,
                        String aP20 ,
                        short aP21 ,
                        java.math.BigDecimal aP22 ,
                        short aP23 ,
                        String aP24 ,
                        String aP25 ,
                        int aP26 ,
                        String aP27 ,
                        byte aP28 ,
                        java.math.BigDecimal aP29 ,
                        String aP30 ,
                        String aP31 ,
                        String aP32 ,
                        short aP33 ,
                        byte aP34 ,
                        String aP35 ,
                        short aP36 ,
                        java.math.BigDecimal aP37 ,
                        java.math.BigDecimal aP38 ,
                        int aP39 ,
                        short aP40 ,
                        java.math.BigDecimal aP41 ,
                        int aP42 ,
                        int aP43 ,
                        String aP44 ,
                        java.math.BigDecimal aP45 ,
                        java.math.BigDecimal aP46 ,
                        java.math.BigDecimal aP47 ,
                        String aP48 ,
                        short aP49 ,
                        short aP50 ,
                        short aP51 ,
                        short aP52 ,
                        byte aP53 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             java.math.BigDecimal aP5 ,
                             short aP6 ,
                             String aP7 ,
                             int aP8 ,
                             String aP9 ,
                             int aP10 ,
                             String aP11 ,
                             String aP12 ,
                             String aP13 ,
                             java.math.BigDecimal aP14 ,
                             java.math.BigDecimal aP15 ,
                             String aP16 ,
                             java.math.BigDecimal aP17 ,
                             short aP18 ,
                             short aP19 ,
                             String aP20 ,
                             short aP21 ,
                             java.math.BigDecimal aP22 ,
                             short aP23 ,
                             String aP24 ,
                             String aP25 ,
                             int aP26 ,
                             String aP27 ,
                             byte aP28 ,
                             java.math.BigDecimal aP29 ,
                             String aP30 ,
                             String aP31 ,
                             String aP32 ,
                             short aP33 ,
                             byte aP34 ,
                             String aP35 ,
                             short aP36 ,
                             java.math.BigDecimal aP37 ,
                             java.math.BigDecimal aP38 ,
                             int aP39 ,
                             short aP40 ,
                             java.math.BigDecimal aP41 ,
                             int aP42 ,
                             int aP43 ,
                             String aP44 ,
                             java.math.BigDecimal aP45 ,
                             java.math.BigDecimal aP46 ,
                             java.math.BigDecimal aP47 ,
                             String aP48 ,
                             short aP49 ,
                             short aP50 ,
                             short aP51 ,
                             short aP52 ,
                             byte aP53 )
   {
      workaroundttrn09popup.this.A396EmprCod = aP0;
      workaroundttrn09popup.this.A30AlbProCod = aP1;
      workaroundttrn09popup.this.AV53BarCod = aP2;
      workaroundttrn09popup.this.AV55BarCodReo = aP3;
      workaroundttrn09popup.this.AV54BarCodPar = aP4;
      workaroundttrn09popup.this.AV9AlbBarRec = aP5;
      workaroundttrn09popup.this.AV10AlbCadEnc = aP6;
      workaroundttrn09popup.this.AV11AlbCald = aP7;
      workaroundttrn09popup.this.AV12AlbCliCod = aP8;
      workaroundttrn09popup.this.AV13AlbColNom = aP9;
      workaroundttrn09popup.this.AV14AlbColNum = aP10;
      workaroundttrn09popup.this.AV15AlbDf1 = aP11;
      workaroundttrn09popup.this.AV16AlbDf2 = aP12;
      workaroundttrn09popup.this.AV17AlbDf3 = aP13;
      workaroundttrn09popup.this.AV18AlbDto = aP14;
      workaroundttrn09popup.this.AV19AlbEncA = aP15;
      workaroundttrn09popup.this.AV20AlbEncCli = aP16;
      workaroundttrn09popup.this.AV21AlbEncL = aP17;
      workaroundttrn09popup.this.AV22AlbHdrAnc = aP18;
      workaroundttrn09popup.this.AV23AlbHdrgm2 = aP19;
      workaroundttrn09popup.this.AV24AlbHdrObs = aP20;
      workaroundttrn09popup.this.AV25AlbHdrUlin = aP21;
      workaroundttrn09popup.this.AV26AlbImpMan = aP22;
      workaroundttrn09popup.this.AV27AlbMetULi = aP23;
      workaroundttrn09popup.this.AV28AlbMqTj = aP24;
      workaroundttrn09popup.this.AV29AlbNomCli = aP25;
      workaroundttrn09popup.this.AV30AlbNumcli = aP26;
      workaroundttrn09popup.this.AV31AlbObsM = aP27;
      workaroundttrn09popup.this.AV32AlbProEsp = aP28;
      workaroundttrn09popup.this.AV33AlbProRec = aP29;
      workaroundttrn09popup.this.AV34AlbProVal = aP30;
      workaroundttrn09popup.this.AV35AlbSer = aP31;
      workaroundttrn09popup.this.AV36AlbSerD = aP32;
      workaroundttrn09popup.this.AV37AlbTipArt = aP33;
      workaroundttrn09popup.this.AV38AlbTipCol = aP34;
      workaroundttrn09popup.this.AV39AlbTipEnt = aP35;
      workaroundttrn09popup.this.AV44BarAlbBul = aP36;
      workaroundttrn09popup.this.AV45BarAlbKgmE = aP37;
      workaroundttrn09popup.this.AV46BarAlbMtrE = aP38;
      workaroundttrn09popup.this.AV47BarAlbPie = aP39;
      workaroundttrn09popup.this.AV48BarAlbPlas = aP40;
      workaroundttrn09popup.this.AV49BarAlbPN = aP41;
      workaroundttrn09popup.this.AV50BarAlbTub = aP42;
      workaroundttrn09popup.this.AV51BarAlbUnd = aP43;
      workaroundttrn09popup.this.AV63BarFasExt = aP44;
      workaroundttrn09popup.this.AV74BarPreKgm = aP45;
      workaroundttrn09popup.this.AV75BarPreMtr = aP46;
      workaroundttrn09popup.this.AV76BarPreUnd = aP47;
      workaroundttrn09popup.this.AV85CodCod = aP48;
      workaroundttrn09popup.this.AV89GuiFasULin = aP49;
      workaroundttrn09popup.this.AV90PlasCod = aP50;
      workaroundttrn09popup.this.AV99TipAcaCod = aP51;
      workaroundttrn09popup.this.AV100TubCod = aP52;
      workaroundttrn09popup.this.AV101FlagFas = aP53;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! (0==AV53BarCod) )
      {
         AV104GXLvl2 = (byte)(0) ;
         /* Using cursor P08OC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(AV53BarCod), Byte.valueOf(AV55BarCodReo), AV54BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P08OC2_A130BarCodPar[0] ;
            A132BarCodReo = P08OC2_A132BarCodReo[0] ;
            A129BarCod = P08OC2_A129BarCod[0] ;
            AV104GXLvl2 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV104GXLvl2 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPALBBAR

            */
            A129BarCod = AV53BarCod ;
            A132BarCodReo = AV55BarCodReo ;
            A130BarCodPar = AV54BarCodPar ;
            A2761AlbBarRec = AV9AlbBarRec ;
            A12905AlbCadEnc = AV10AlbCadEnc ;
            A7989AlbCald = AV11AlbCald ;
            A3886AlbCliCod = AV12AlbCliCod ;
            A3392AlbColNom = AV13AlbColNom ;
            A3393AlbColNum = AV14AlbColNum ;
            A7990AlbDf1 = AV15AlbDf1 ;
            A7991AlbDf2 = AV16AlbDf2 ;
            A7992AlbDf3 = AV17AlbDf3 ;
            A7994AlbDto = AV18AlbDto ;
            A7104AlbEncA = AV19AlbEncA ;
            A4815AlbEncCli = AV20AlbEncCli ;
            A7103AlbEncL = AV21AlbEncL ;
            A3271AlbHdrAnc = AV22AlbHdrAnc ;
            A5019AlbHdrgm2 = AV23AlbHdrgm2 ;
            A2441AlbHdrObs = AV24AlbHdrObs ;
            A2763AlbHdrUlin = AV25AlbHdrUlin ;
            A5354AlbImpMan = AV26AlbImpMan ;
            A6645AlbMetULi = AV27AlbMetULi ;
            A7993AlbMqTj = AV28AlbMqTj ;
            A12232AlbNomCli = AV29AlbNomCli ;
            A12233AlbNumcli = AV30AlbNumcli ;
            A6814AlbObsM = AV31AlbObsM ;
            A32AlbProEsp = AV32AlbProEsp ;
            A40AlbProRec = AV33AlbProRec ;
            A2839AlbProVal = AV34AlbProVal ;
            A3391AlbSer = AV35AlbSer ;
            A8879AlbSerD = AV36AlbSerD ;
            A12234AlbTipArt = AV37AlbTipArt ;
            A3394AlbTipCol = AV38AlbTipCol ;
            A1095AlbTipEnt = AV39AlbTipEnt ;
            A1458BarAlbBul = AV44BarAlbBul ;
            A1261BarAlbKgmE = AV45BarAlbKgmE ;
            A1263BarAlbMtrE = AV46BarAlbMtrE ;
            A1265BarAlbPie = AV47BarAlbPie ;
            A6467BarAlbPlas = AV48BarAlbPlas ;
            A1461BarAlbPN = AV49BarAlbPN ;
            A1266BarAlbTub = AV50BarAlbTub ;
            A12195BarAlbUnd = AV51BarAlbUnd ;
            A2398BarFasExt = AV63BarFasExt ;
            A1262BarPreKgm = AV74BarPreKgm ;
            A1264BarPreMtr = AV75BarPreMtr ;
            A12196BarPreUnd = AV76BarPreUnd ;
            A3153CodCod = AV85CodCod ;
            n3153CodCod = false ;
            A1248GuiFasULin = AV89GuiFasULin ;
            A6466PlasCod = AV90PlasCod ;
            n6466PlasCod = false ;
            A5051TipAcaCod = AV99TipAcaCod ;
            A1206TubCod = AV100TubCod ;
            n1206TubCod = false ;
            /* Using cursor P08OC3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A32AlbProEsp), A40AlbProRec, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), Integer.valueOf(A1266BarAlbTub), Short.valueOf(A1248GuiFasULin), A1262BarPreKgm, A1264BarPreMtr, Short.valueOf(A1458BarAlbBul), A1461BarAlbPN, A2398BarFasExt, A2441AlbHdrObs, A2761AlbBarRec, Short.valueOf(A2763AlbHdrUlin), A2839AlbProVal, Short.valueOf(A3271AlbHdrAnc), Boolean.valueOf(n3153CodCod), A3153CodCod, A3391AlbSer, A3392AlbColNom, Integer.valueOf(A3393AlbColNum), Byte.valueOf(A3394AlbTipCol), A4815AlbEncCli, Short.valueOf(A5019AlbHdrgm2), Short.valueOf(A5051TipAcaCod), A1095AlbTipEnt, A5354AlbImpMan, Boolean.valueOf(n6466PlasCod), Short.valueOf(A6466PlasCod), Short.valueOf(A6467BarAlbPlas), A6814AlbObsM, A7103AlbEncL, A7104AlbEncA, A7989AlbCald, A7990AlbDf1, A7991AlbDf2, A7992AlbDf3, A7993AlbMqTj, A7994AlbDto, A8879AlbSerD, Short.valueOf(A6645AlbMetULi), Integer.valueOf(A3886AlbCliCod), A12196BarPreUnd, Integer.valueOf(A12195BarAlbUnd), A12232AlbNomCli, Integer.valueOf(A12233AlbNumcli), Short.valueOf(A12234AlbTipArt), Short.valueOf(A12905AlbCadEnc)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            Application.commitDataStores(context, remoteHandle, pr_default, "workaroundttrn09popup");
            if ( AV101FlagFas == 1 )
            {
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A30AlbProCod ;
               GXv_int3[0] = AV53BarCod ;
               GXv_int4[0] = AV55BarCodReo ;
               GXv_char5[0] = AV54BarCodPar ;
               new app.pcopfas(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5) ;
               workaroundttrn09popup.this.A396EmprCod = GXv_char1[0] ;
               workaroundttrn09popup.this.A30AlbProCod = GXv_int2[0] ;
               workaroundttrn09popup.this.AV53BarCod = GXv_int3[0] ;
               workaroundttrn09popup.this.AV55BarCodReo = GXv_int4[0] ;
               workaroundttrn09popup.this.AV54BarCodPar = GXv_char5[0] ;
            }
            /* Window Datatype Object Property */
            AV8Window.setUrl( formatLink("app.ttrn09", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54BarCodPar))}, new String[] {"Mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  );
            AV8Window.setReturnParms(new Object[] {});
            httpContext.newWindow(AV8Window);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "workaroundttrn09popup");
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
      P08OC2_A396EmprCod = new String[] {""} ;
      P08OC2_A30AlbProCod = new long[1] ;
      P08OC2_A130BarCodPar = new String[] {""} ;
      P08OC2_A132BarCodReo = new byte[1] ;
      P08OC2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A7989AlbCald = "" ;
      A3392AlbColNom = "" ;
      A7990AlbDf1 = "" ;
      A7991AlbDf2 = "" ;
      A7992AlbDf3 = "" ;
      A7994AlbDto = DecimalUtil.ZERO ;
      A7104AlbEncA = DecimalUtil.ZERO ;
      A4815AlbEncCli = "" ;
      A7103AlbEncL = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A7993AlbMqTj = "" ;
      A12232AlbNomCli = "" ;
      A6814AlbObsM = "" ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A2839AlbProVal = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A1095AlbTipEnt = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A2398BarFasExt = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A3153CodCod = "" ;
      Gx_emsg = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      AV8Window = new com.genexus.webpanels.GXWindow();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.workaroundttrn09popup__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.workaroundttrn09popup__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.workaroundttrn09popup__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.workaroundttrn09popup__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.workaroundttrn09popup__default(),
         new Object[] {
             new Object[] {
            P08OC2_A396EmprCod, P08OC2_A30AlbProCod, P08OC2_A130BarCodPar, P08OC2_A132BarCodReo, P08OC2_A129BarCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV55BarCodReo ;
   private byte AV32AlbProEsp ;
   private byte AV38AlbTipCol ;
   private byte AV101FlagFas ;
   private byte AV104GXLvl2 ;
   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private byte A3394AlbTipCol ;
   private byte GXv_int4[] ;
   private short AV10AlbCadEnc ;
   private short AV22AlbHdrAnc ;
   private short AV23AlbHdrgm2 ;
   private short AV25AlbHdrUlin ;
   private short AV27AlbMetULi ;
   private short AV37AlbTipArt ;
   private short AV44BarAlbBul ;
   private short AV48BarAlbPlas ;
   private short AV89GuiFasULin ;
   private short AV90PlasCod ;
   private short AV99TipAcaCod ;
   private short AV100TubCod ;
   private short A12905AlbCadEnc ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A2763AlbHdrUlin ;
   private short A6645AlbMetULi ;
   private short A12234AlbTipArt ;
   private short A1458BarAlbBul ;
   private short A6467BarAlbPlas ;
   private short A1248GuiFasULin ;
   private short A6466PlasCod ;
   private short A5051TipAcaCod ;
   private short A1206TubCod ;
   private short Gx_err ;
   private int AV53BarCod ;
   private int AV12AlbCliCod ;
   private int AV14AlbColNum ;
   private int AV30AlbNumcli ;
   private int AV47BarAlbPie ;
   private int AV50BarAlbTub ;
   private int AV51BarAlbUnd ;
   private int A129BarCod ;
   private int GX_INS195 ;
   private int A3886AlbCliCod ;
   private int A3393AlbColNum ;
   private int A12233AlbNumcli ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int A12195BarAlbUnd ;
   private int GXv_int3[] ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private java.math.BigDecimal AV9AlbBarRec ;
   private java.math.BigDecimal AV18AlbDto ;
   private java.math.BigDecimal AV19AlbEncA ;
   private java.math.BigDecimal AV21AlbEncL ;
   private java.math.BigDecimal AV26AlbImpMan ;
   private java.math.BigDecimal AV33AlbProRec ;
   private java.math.BigDecimal AV45BarAlbKgmE ;
   private java.math.BigDecimal AV46BarAlbMtrE ;
   private java.math.BigDecimal AV49BarAlbPN ;
   private java.math.BigDecimal AV74BarPreKgm ;
   private java.math.BigDecimal AV75BarPreMtr ;
   private java.math.BigDecimal AV76BarPreUnd ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A7994AlbDto ;
   private java.math.BigDecimal A7104AlbEncA ;
   private java.math.BigDecimal A7103AlbEncL ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private String A396EmprCod ;
   private String AV54BarCodPar ;
   private String AV11AlbCald ;
   private String AV13AlbColNom ;
   private String AV15AlbDf1 ;
   private String AV16AlbDf2 ;
   private String AV17AlbDf3 ;
   private String AV20AlbEncCli ;
   private String AV24AlbHdrObs ;
   private String AV28AlbMqTj ;
   private String AV29AlbNomCli ;
   private String AV34AlbProVal ;
   private String AV35AlbSer ;
   private String AV36AlbSerD ;
   private String AV39AlbTipEnt ;
   private String AV63BarFasExt ;
   private String AV85CodCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A7989AlbCald ;
   private String A3392AlbColNom ;
   private String A7990AlbDf1 ;
   private String A7991AlbDf2 ;
   private String A7992AlbDf3 ;
   private String A4815AlbEncCli ;
   private String A2441AlbHdrObs ;
   private String A7993AlbMqTj ;
   private String A12232AlbNomCli ;
   private String A2839AlbProVal ;
   private String A3391AlbSer ;
   private String A8879AlbSerD ;
   private String A1095AlbTipEnt ;
   private String A2398BarFasExt ;
   private String A3153CodCod ;
   private String Gx_emsg ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private boolean n3153CodCod ;
   private boolean n6466PlasCod ;
   private boolean n1206TubCod ;
   private String AV31AlbObsM ;
   private String A6814AlbObsM ;
   private com.genexus.webpanels.GXWindow AV8Window ;
   private IDataStoreProvider pr_default ;
   private String[] P08OC2_A396EmprCod ;
   private long[] P08OC2_A30AlbProCod ;
   private String[] P08OC2_A130BarCodPar ;
   private byte[] P08OC2_A132BarCodReo ;
   private int[] P08OC2_A129BarCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class workaroundttrn09popup__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class workaroundttrn09popup__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class workaroundttrn09popup__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class workaroundttrn09popup__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class workaroundttrn09popup__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08OC2", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P08OC3", "INSERT INTO TXPALBBAR(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbProEsp, AlbProRec, TubCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, BarAlbBul, BarAlbPN, BarFasExt, AlbHdrObs, AlbBarRec, AlbHdrUlin, AlbProVal, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, PlasCod, BarAlbPlas, AlbObsM, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbPConPie, BarAlbTar, BarAlbFor, BarAlbTip, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbBarDto, AlbTipCon, AlbPckUlin, P_ForULin, AlbHdRUl, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, Et_UltNum, BarKgsCli, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 5);
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setString(18, (String)parms[18], 8);
               stmt.setString(19, (String)parms[19], 60);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setString(22, (String)parms[22], 1);
               stmt.setShort(23, ((Number) parms[23]).shortValue());
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[25], 6);
               }
               stmt.setString(25, (String)parms[26], 16);
               stmt.setString(26, (String)parms[27], 13);
               stmt.setInt(27, ((Number) parms[28]).intValue());
               stmt.setByte(28, ((Number) parms[29]).byteValue());
               stmt.setString(29, (String)parms[30], 20);
               stmt.setShort(30, ((Number) parms[31]).shortValue());
               stmt.setShort(31, ((Number) parms[32]).shortValue());
               stmt.setString(32, (String)parms[33], 1);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[34], 2);
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[36]).shortValue());
               }
               stmt.setShort(35, ((Number) parms[37]).shortValue());
               stmt.setVarchar(36, (String)parms[38], 2000, false);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[39], 2);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[40], 2);
               stmt.setString(39, (String)parms[41], 12);
               stmt.setString(40, (String)parms[42], 50);
               stmt.setString(41, (String)parms[43], 50);
               stmt.setString(42, (String)parms[44], 50);
               stmt.setString(43, (String)parms[45], 16);
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[46], 3);
               stmt.setString(45, (String)parms[47], 26);
               stmt.setShort(46, ((Number) parms[48]).shortValue());
               stmt.setInt(47, ((Number) parms[49]).intValue());
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[50], 5);
               stmt.setInt(49, ((Number) parms[51]).intValue());
               stmt.setString(50, (String)parms[52], 13);
               stmt.setInt(51, ((Number) parms[53]).intValue());
               stmt.setShort(52, ((Number) parms[54]).shortValue());
               stmt.setShort(53, ((Number) parms[55]).shortValue());
               return;
      }
   }

}

