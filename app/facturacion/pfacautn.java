package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacautn extends GXProcedure
{
   public pfacautn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacautn.class ), "" );
   }

   public pfacautn( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.genexus.SdtMessages_Message> executeUdp( String[] aP0 ,
                                                                        int[] aP1 ,
                                                                        java.util.Date[] aP2 ,
                                                                        java.util.Date[] aP3 ,
                                                                        long[] aP4 ,
                                                                        long[] aP5 ,
                                                                        String[] aP6 ,
                                                                        java.util.Date[] aP7 ,
                                                                        String[] aP8 ,
                                                                        int[] aP9 ,
                                                                        String[] aP10 ,
                                                                        String[] aP11 ,
                                                                        java.util.Date[] aP12 ,
                                                                        String[] aP13 )
   {
      pfacautn.this.aP14 = new GXBaseCollection[] {new GXBaseCollection<com.genexus.SdtMessages_Message>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        long[] aP4 ,
                        long[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        java.util.Date[] aP12 ,
                        String[] aP13 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             long[] aP4 ,
                             long[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP14 )
   {
      pfacautn.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacautn.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pfacautn.this.AV16PFecha = aP2[0];
      this.aP2 = aP2;
      pfacautn.this.AV17UFecha = aP3[0];
      this.aP3 = aP3;
      pfacautn.this.AV18PALB = aP4[0];
      this.aP4 = aP4;
      pfacautn.this.AV19UALB = aP5[0];
      this.aP5 = aP5;
      pfacautn.this.AV20PRIO = aP6[0];
      this.aP6 = aP6;
      pfacautn.this.AV21FacFch = aP7[0];
      this.aP7 = aP7;
      pfacautn.this.AV22FacSerNum = aP8[0];
      this.aP8 = aP8;
      pfacautn.this.AV84CliFac = aP9[0];
      this.aP9 = aP9;
      pfacautn.this.AV113TipProd = aP10[0];
      this.aP10 = aP10;
      pfacautn.this.AV120TipAlb = aP11[0];
      this.aP11 = aP11;
      pfacautn.this.AV127FacHor = aP12[0];
      this.aP12 = aP12;
      pfacautn.this.aP13 = aP13;
      pfacautn.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV144mensajes = "" ;
      /* Using cursor P00302 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV84CliFac)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00302_A252CliCod[0] ;
         n252CliCod = P00302_n252CliCod[0] ;
         A3073RepCod = P00302_A3073RepCod[0] ;
         AV92RepCod = A3073RepCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_int1 = AV118Erfoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      pfacautn.this.GXt_int1 = GXv_int2[0] ;
      AV118Erfoc = GXt_int1 ;
      GXv_int2[0] = AV90FlagDsc ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACDSC", ""), GXv_int2) ;
      pfacautn.this.AV90FlagDsc = GXv_int2[0] ;
      GXv_int2[0] = AV93FlagFacPro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACPRO", ""), GXv_int2) ;
      pfacautn.this.AV93FlagFacPro = GXv_int2[0] ;
      GXv_int2[0] = AV103FlagBonAlb ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BONALB", ""), GXv_int2) ;
      pfacautn.this.AV103FlagBonAlb = GXv_int2[0] ;
      GXv_int2[0] = AV104FlagRieClF ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RIECLF", ""), GXv_int2) ;
      pfacautn.this.AV104FlagRieClF = GXv_int2[0] ;
      GXv_int2[0] = AV111FlagPorRec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PORREC", ""), GXv_int2) ;
      pfacautn.this.AV111FlagPorRec = GXv_int2[0] ;
      GXt_int1 = AV115Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pfacautn.this.GXt_int1 = GXv_int2[0] ;
      AV115Carvema = GXt_int1 ;
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV124Moda21)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pfacautn.this.GXt_int1 = GXv_int2[0] ;
      AV124Moda21 = DecimalUtil.doubleToDec(GXt_int1) ;
      GXt_int1 = AV129Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      pfacautn.this.GXt_int1 = GXv_int2[0] ;
      AV129Torient = GXt_int1 ;
      GXt_int1 = AV130Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      pfacautn.this.GXt_int1 = GXv_int2[0] ;
      AV130Tinamar = GXt_int1 ;
      GXt_int1 = AV131Vts ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int2) ;
      pfacautn.this.GXt_int1 = GXv_int2[0] ;
      AV131Vts = GXt_int1 ;
      GXt_int1 = (byte)(AV143Itram) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int2) ;
      pfacautn.this.GXt_int1 = GXv_int2[0] ;
      AV143Itram = GXt_int1 ;
      AV30ContCod = "040200" ;
      if ( GXutil.strcmp(AV20PRIO, "0") == 0 )
      {
         AV30ContCod = "040100" ;
      }
      /* Using cursor P00303 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV30ContCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A313ContCod = P00303_A313ContCod[0] ;
         A316ContVal = P00303_A316ContVal[0] ;
         A953IvaCod = P00303_A953IvaCod[0] ;
         n953IvaCod = P00303_n953IvaCod[0] ;
         A953IvaCod = P00303_A953IvaCod[0] ;
         n953IvaCod = P00303_n953IvaCod[0] ;
         AV24NumFac = A316ContVal ;
         AV37IvaCod = A953IvaCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV24NumFac = (int)(AV24NumFac+1) ;
      AV25NumLin = 0 ;
      /* Using cursor P00304 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV37IvaCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A953IvaCod = P00304_A953IvaCod[0] ;
         n953IvaCod = P00304_n953IvaCod[0] ;
         A408EmprPob = P00304_A408EmprPob[0] ;
         n408EmprPob = P00304_n408EmprPob[0] ;
         A588IvaPor = P00304_A588IvaPor[0] ;
         n588IvaPor = P00304_n588IvaPor[0] ;
         A589IvaRec = P00304_A589IvaRec[0] ;
         n589IvaRec = P00304_n589IvaRec[0] ;
         A588IvaPor = P00304_A588IvaPor[0] ;
         n588IvaPor = P00304_n588IvaPor[0] ;
         A589IvaRec = P00304_A589IvaRec[0] ;
         n589IvaRec = P00304_n589IvaRec[0] ;
         AV34IvaPor = A588IvaPor ;
         AV35IvaRec = A589IvaRec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P00305 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV84CliFac)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = P00305_A252CliCod[0] ;
         n252CliCod = P00305_n252CliCod[0] ;
         A3140CliDivCod = P00305_A3140CliDivCod[0] ;
         n3140CliDivCod = P00305_n3140CliDivCod[0] ;
         A3091CliDivTra = P00305_A3091CliDivTra[0] ;
         n3091CliDivTra = P00305_n3091CliDivTra[0] ;
         A858ZonGeoCod = P00305_A858ZonGeoCod[0] ;
         A14240stMeivaId = P00305_A14240stMeivaId[0] ;
         n14240stMeivaId = P00305_n14240stMeivaId[0] ;
         A2028CliImpMin = P00305_A2028CliImpMin[0] ;
         n2028CliImpMin = P00305_n2028CliImpMin[0] ;
         A14245CliImpMnEs = P00305_A14245CliImpMnEs[0] ;
         A14242CliEnergia = P00305_A14242CliEnergia[0] ;
         AV85FacDivCod = A3140CliDivCod ;
         AV86FacDivTCod = A3091CliDivTra ;
         AV88Extranjero = httpContext.getMessage( "N", "") ;
         if ( ( A858ZonGeoCod == 999 ) || ( A858ZonGeoCod == 998 ) )
         {
            AV88Extranjero = httpContext.getMessage( "S", "") ;
         }
         AV137stMeivaId = A14240stMeivaId ;
         AV112CliImpMin = A2028CliImpMin ;
         AV138CliImpMnEst = A14245CliImpMnEs ;
         AV139CliEnergia = A14242CliEnergia ;
         /* Using cursor P00306 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV20PRIO});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A297CliPri = P00306_A297CliPri[0] ;
            A497FpgCod = P00306_A497FpgCod[0] ;
            A261CliDtoGrl = P00306_A261CliDtoGrl[0] ;
            A262CliDtoPpg = P00306_A262CliDtoPpg[0] ;
            A6630CliDto = P00306_A6630CliDto[0] ;
            A299CliRegIVA = P00306_A299CliRegIVA[0] ;
            A280CliNroVto = P00306_A280CliNroVto[0] ;
            A296CliPrd = P00306_A296CliPrd[0] ;
            A259CliDiaPag = P00306_A259CliDiaPag[0] ;
            AV26CodFpg = A497FpgCod ;
            AV27DtoGen = A261CliDtoGrl ;
            AV28DtoPP = A262CliDtoPpg ;
            AV119Clidto = A6630CliDto ;
            AV29RegIVA = A299CliRegIVA ;
            AV31CliNroVto = A280CliNroVto ;
            AV32CliPrd = A296CliPrd ;
            AV33CliDiaPag = A259CliDiaPag ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( ( GXutil.strcmp(AV120TipAlb, "1") == 0 ) || (GXutil.strcmp("", AV120TipAlb)==0) )
      {
         GX_I = 1 ;
         while ( GX_I <= 10000 )
         {
            AV135Tab_Ndoc[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         AV136i = 1 ;
         pr_default.dynParam(5, new Object[]{ new Object[]{
                                              Long.valueOf(AV18PALB) ,
                                              Long.valueOf(AV19UALB) ,
                                              AV16PFecha ,
                                              AV17UFecha ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A34AlbProfch ,
                                              A5140AlbMarca ,
                                              A39AlbProPri ,
                                              AV20PRIO ,
                                              A396EmprCod ,
                                              Integer.valueOf(AV15CliCod) ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              Byte.valueOf(A1782AlbProEso) } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE
                                              }
         });
         /* Using cursor P00307 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV20PRIO, Long.valueOf(AV18PALB), Long.valueOf(AV19UALB), AV16PFecha, AV17UFecha});
         while ( (pr_default.getStatus(5) != 101) )
         {
            brk307 = false ;
            A1243GuiRemCli = P00307_A1243GuiRemCli[0] ;
            A39AlbProPri = P00307_A39AlbProPri[0] ;
            A1782AlbProEso = P00307_A1782AlbProEso[0] ;
            A5140AlbMarca = P00307_A5140AlbMarca[0] ;
            A34AlbProfch = P00307_A34AlbProfch[0] ;
            A30AlbProCod = P00307_A30AlbProCod[0] ;
            A5041AlbProTBo = P00307_A5041AlbProTBo[0] ;
            n5041AlbProTBo = P00307_n5041AlbProTBo[0] ;
            A5040AlbProBon = P00307_A5040AlbProBon[0] ;
            n5040AlbProBon = P00307_n5040AlbProBon[0] ;
            A33AlbProEst = P00307_A33AlbProEst[0] ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P00307_A396EmprCod[0], A396EmprCod) == 0 ) && ( P00307_A1243GuiRemCli[0] == A1243GuiRemCli ) && ( P00307_A1782AlbProEso[0] == A1782AlbProEso ) && GXutil.dateCompare(GXutil.resetTime(P00307_A34AlbProfch[0]), GXutil.resetTime(A34AlbProfch)) )
            {
               brk307 = false ;
               A39AlbProPri = P00307_A39AlbProPri[0] ;
               A5140AlbMarca = P00307_A5140AlbMarca[0] ;
               A30AlbProCod = P00307_A30AlbProCod[0] ;
               A5041AlbProTBo = P00307_A5041AlbProTBo[0] ;
               n5041AlbProTBo = P00307_n5041AlbProTBo[0] ;
               A5040AlbProBon = P00307_A5040AlbProBon[0] ;
               n5040AlbProBon = P00307_n5040AlbProBon[0] ;
               A33AlbProEst = P00307_A33AlbProEst[0] ;
               if ( A1243GuiRemCli == AV15CliCod )
               {
                  if ( A1782AlbProEso == 1 )
                  {
                     if ( GXutil.strcmp(A5140AlbMarca, "A") != 0 )
                     {
                        if ( GXutil.strcmp(A39AlbProPri, AV20PRIO) == 0 )
                        {
                           AV77FlagAlb = (byte)(0) ;
                           AV108BonToP = GXutil.substring( A5041AlbProTBo, 2, 1) ;
                           AV106AlbProBon = A5040AlbProBon ;
                           AV79Flag2 = (byte)(0) ;
                           /* Using cursor P00308 */
                           pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                           while ( (pr_default.getStatus(6) != 101) )
                           {
                              A32AlbProEsp = P00308_A32AlbProEsp[0] ;
                              A130BarCodPar = P00308_A130BarCodPar[0] ;
                              A132BarCodReo = P00308_A132BarCodReo[0] ;
                              A129BarCod = P00308_A129BarCod[0] ;
                              AV79Flag2 = (byte)(1) ;
                              /* Exit For each command. Update data (if necessary), close cursors & exit. */
                              if (true) break;
                              pr_default.readNext(6);
                           }
                           pr_default.close(6);
                           if ( (0==AV79Flag2) )
                           {
                              /* Using cursor P00309 */
                              pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                              while ( (pr_default.getStatus(7) != 101) )
                              {
                                 A1208TubPre = P00309_A1208TubPre[0] ;
                                 n1208TubPre = P00309_n1208TubPre[0] ;
                                 A1266BarAlbTub = P00309_A1266BarAlbTub[0] ;
                                 A1207TubNom = P00309_A1207TubNom[0] ;
                                 n1207TubNom = P00309_n1207TubNom[0] ;
                                 A212BarSer = P00309_A212BarSer[0] ;
                                 A1262BarPreKgm = P00309_A1262BarPreKgm[0] ;
                                 A1264BarPreMtr = P00309_A1264BarPreMtr[0] ;
                                 A12196BarPreUnd = P00309_A12196BarPreUnd[0] ;
                                 A1261BarAlbKgmE = P00309_A1261BarAlbKgmE[0] ;
                                 A1263BarAlbMtrE = P00309_A1263BarAlbMtrE[0] ;
                                 A12195BarAlbUnd = P00309_A12195BarAlbUnd[0] ;
                                 A40AlbProRec = P00309_A40AlbProRec[0] ;
                                 A136BarColNum = P00309_A136BarColNum[0] ;
                                 A135BarColNom = P00309_A135BarColNom[0] ;
                                 A1652BarSerDsc = P00309_A1652BarSerDsc[0] ;
                                 A2010BarTipDis = P00309_A2010BarTipDis[0] ;
                                 A1503BarPart = P00309_A1503BarPart[0] ;
                                 A2761AlbBarRec = P00309_A2761AlbBarRec[0] ;
                                 A4812BarEncCli = P00309_A4812BarEncCli[0] ;
                                 A218BarTipCol = P00309_A218BarTipCol[0] ;
                                 A1234BarNomCli = P00309_A1234BarNomCli[0] ;
                                 A1235BarNumCli = P00309_A1235BarNumCli[0] ;
                                 A5354AlbImpMan = P00309_A5354AlbImpMan[0] ;
                                 A2762AlbBarDto = P00309_A2762AlbBarDto[0] ;
                                 n2762AlbBarDto = P00309_n2762AlbBarDto[0] ;
                                 A217BarTipArt = P00309_A217BarTipArt[0] ;
                                 n217BarTipArt = P00309_n217BarTipArt[0] ;
                                 A3746BarNPed = P00309_A3746BarNPed[0] ;
                                 A252CliCod = P00309_A252CliCod[0] ;
                                 n252CliCod = P00309_n252CliCod[0] ;
                                 A4466BarAcaAnh = P00309_A4466BarAcaAnh[0] ;
                                 A130BarCodPar = P00309_A130BarCodPar[0] ;
                                 A132BarCodReo = P00309_A132BarCodReo[0] ;
                                 A129BarCod = P00309_A129BarCod[0] ;
                                 A32AlbProEsp = P00309_A32AlbProEsp[0] ;
                                 A143BarDisNum = P00309_A143BarDisNum[0] ;
                                 A1206TubCod = P00309_A1206TubCod[0] ;
                                 n1206TubCod = P00309_n1206TubCod[0] ;
                                 A6466PlasCod = P00309_A6466PlasCod[0] ;
                                 n6466PlasCod = P00309_n6466PlasCod[0] ;
                                 A6467BarAlbPlas = P00309_A6467BarAlbPlas[0] ;
                                 A212BarSer = P00309_A212BarSer[0] ;
                                 A136BarColNum = P00309_A136BarColNum[0] ;
                                 A135BarColNom = P00309_A135BarColNom[0] ;
                                 A1652BarSerDsc = P00309_A1652BarSerDsc[0] ;
                                 A2010BarTipDis = P00309_A2010BarTipDis[0] ;
                                 A1503BarPart = P00309_A1503BarPart[0] ;
                                 A4812BarEncCli = P00309_A4812BarEncCli[0] ;
                                 A218BarTipCol = P00309_A218BarTipCol[0] ;
                                 A1234BarNomCli = P00309_A1234BarNomCli[0] ;
                                 A1235BarNumCli = P00309_A1235BarNumCli[0] ;
                                 A217BarTipArt = P00309_A217BarTipArt[0] ;
                                 n217BarTipArt = P00309_n217BarTipArt[0] ;
                                 A3746BarNPed = P00309_A3746BarNPed[0] ;
                                 A252CliCod = P00309_A252CliCod[0] ;
                                 n252CliCod = P00309_n252CliCod[0] ;
                                 A4466BarAcaAnh = P00309_A4466BarAcaAnh[0] ;
                                 A143BarDisNum = P00309_A143BarDisNum[0] ;
                                 A1208TubPre = P00309_A1208TubPre[0] ;
                                 n1208TubPre = P00309_n1208TubPre[0] ;
                                 A1207TubNom = P00309_A1207TubNom[0] ;
                                 n1207TubNom = P00309_n1207TubNom[0] ;
                                 AV44BarSer = A212BarSer ;
                                 AV45BarDisNum = A143BarDisNum ;
                                 AV96AlbProCod = A30AlbProCod ;
                                 AV97BarCod = A129BarCod ;
                                 AV98BarCodReo = A132BarCodReo ;
                                 AV99BarCodPar = A130BarCodPar ;
                                 AV25NumLin = (int)(AV25NumLin+1) ;
                                 /* Using cursor P003010 */
                                 pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                                 while ( (pr_default.getStatus(8) != 101) )
                                 {
                                    A758ProCod = P003010_A758ProCod[0] ;
                                    n758ProCod = P003010_n758ProCod[0] ;
                                    A1468AlbPrdLin = P003010_A1468AlbPrdLin[0] ;
                                    AV128Procod = A758ProCod ;
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                    pr_default.readNext(8);
                                 }
                                 pr_default.close(8);
                                 /* Execute user subroutine: 'OBSFAC' */
                                 S111 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(7);
                                    pr_default.close(7);
                                    pr_default.close(7);
                                    pr_default.close(5);
                                    returnInSub = true;
                                    cleanup();
                                    if (true) return;
                                 }
                                 if ( ! (GXutil.strcmp("", AV43ArtObsFac)==0) )
                                 {
                                    GXv_char3[0] = A396EmprCod ;
                                    GXv_int4[0] = A30AlbProCod ;
                                    GXv_int5[0] = A129BarCod ;
                                    GXv_int2[0] = A132BarCodReo ;
                                    GXv_char6[0] = A130BarCodPar ;
                                    GXv_int7[0] = AV24NumFac ;
                                    GXv_int8[0] = AV25NumLin ;
                                    GXv_char9[0] = AV43ArtObsFac ;
                                    GXv_int10[0] = AV83FlagSal ;
                                    GXv_int11[0] = AV107TotAlb ;
                                    GXv_int12[0] = AV84CliFac ;
                                    new app.facturacion.pfacau11(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_int2, GXv_char6, GXv_int7, GXv_int8, GXv_char9, GXv_int10, GXv_int11, GXv_int12) ;
                                    pfacautn.this.A396EmprCod = GXv_char3[0] ;
                                    pfacautn.this.A30AlbProCod = GXv_int4[0] ;
                                    pfacautn.this.A129BarCod = GXv_int5[0] ;
                                    pfacautn.this.A132BarCodReo = GXv_int2[0] ;
                                    pfacautn.this.A130BarCodPar = GXv_char6[0] ;
                                    pfacautn.this.AV24NumFac = GXv_int7[0] ;
                                    pfacautn.this.AV25NumLin = GXv_int8[0] ;
                                    pfacautn.this.AV43ArtObsFac = GXv_char9[0] ;
                                    pfacautn.this.AV83FlagSal = GXv_int10[0] ;
                                    pfacautn.this.AV107TotAlb = GXv_int11[0] ;
                                    pfacautn.this.AV84CliFac = GXv_int12[0] ;
                                    AV77FlagAlb = (byte)(1) ;
                                 }
                                 if ( (0==AV48Flag) )
                                 {
                                    AV46LenSer = (byte)(GXutil.len( A212BarSer)) ;
                                    AV47LenColNom = (byte)(GXutil.len( A135BarColNom)) ;
                                    if ( AV93FlagFacPro == 1 )
                                    {
                                       AV25NumLin = (int)(AV25NumLin-1) ;
                                       GXv_char9[0] = A396EmprCod ;
                                       GXv_int4[0] = A30AlbProCod ;
                                       GXv_int12[0] = A129BarCod ;
                                       GXv_int10[0] = A132BarCodReo ;
                                       GXv_char6[0] = A130BarCodPar ;
                                       GXv_char3[0] = A143BarDisNum ;
                                       GXv_int8[0] = AV25NumLin ;
                                       GXv_int7[0] = AV24NumFac ;
                                       GXv_int5[0] = AV84CliFac ;
                                       new app.pfacmapr(remoteHandle, context).execute( GXv_char9, GXv_int4, GXv_int12, GXv_int10, GXv_char6, GXv_char3, GXv_int8, GXv_int7, GXv_int5) ;
                                       pfacautn.this.A396EmprCod = GXv_char9[0] ;
                                       pfacautn.this.A30AlbProCod = GXv_int4[0] ;
                                       pfacautn.this.A129BarCod = GXv_int12[0] ;
                                       pfacautn.this.A132BarCodReo = GXv_int10[0] ;
                                       pfacautn.this.A130BarCodPar = GXv_char6[0] ;
                                       pfacautn.this.A143BarDisNum = GXv_char3[0] ;
                                       pfacautn.this.AV25NumLin = GXv_int8[0] ;
                                       pfacautn.this.AV24NumFac = GXv_int7[0] ;
                                       pfacautn.this.AV84CliFac = GXv_int5[0] ;
                                    }
                                    else
                                    {
                                       /*
                                          INSERT RECORD ON TABLE TXPLFAVEN

                                       */
                                       A430FacCod = AV24NumFac ;
                                       A446FacLin = AV25NumLin ;
                                       A427FacAlbCod = A30AlbProCod ;
                                       A1294FacBarCod = A129BarCod ;
                                       A1295FacBarReo = A132BarCodReo ;
                                       A1296FacBarPar = A130BarCodPar ;
                                       A428FacAlbTip = (byte)(1) ;
                                       A454FacSer = A212BarSer ;
                                       A448FacPreKgs = A1262BarPreKgm ;
                                       A449FacPreMts = A1264BarPreMtr ;
                                       A12198FacPreUnd = A12196BarPreUnd ;
                                       A444FacKgs = A1261BarAlbKgmE ;
                                       A447FacMts = A1263BarAlbMtrE ;
                                       A12197FacUnds = A12195BarAlbUnd ;
                                       A451FacRec = A40AlbProRec ;
                                       if ( AV90FlagDsc == 1 )
                                       {
                                          if ( ! (0==A136BarColNum) )
                                          {
                                             A432FacDsc = GXutil.substring( A1652BarSerDsc, 1, AV46LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV47LenColNom) + "-" + GXutil.str( A136BarColNum, 6, 0) ;
                                          }
                                          else
                                          {
                                             A432FacDsc = GXutil.substring( A1652BarSerDsc, 1, AV46LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV47LenColNom) ;
                                          }
                                       }
                                       else
                                       {
                                          if ( AV87FlagTint == 1 )
                                          {
                                             A432FacDsc = AV89FacDsc ;
                                          }
                                          else
                                          {
                                             if ( ! (0==A136BarColNum) )
                                             {
                                                A432FacDsc = GXutil.substring( A212BarSer, 1, AV46LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV47LenColNom) + "-" + GXutil.str( A136BarColNum, 6, 0) ;
                                             }
                                             else
                                             {
                                                A432FacDsc = GXutil.substring( A212BarSer, 1, AV46LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV47LenColNom) ;
                                             }
                                          }
                                       }
                                       A1498FacDisNum = AV45BarDisNum ;
                                       A3097FacTipPro = A2010BarTipDis ;
                                       A3303FacNPart = A1503BarPart ;
                                       A3397FacFasCod = " " ;
                                       if ( AV111FlagPorRec == 1 )
                                       {
                                          A3897FacKgsA = A2761AlbBarRec ;
                                       }
                                       A4814FacEncCli = A4812BarEncCli ;
                                       A3878FacColNom = A135BarColNom ;
                                       A3879FocColNum = A136BarColNum ;
                                       A3880FacTipColC = A218BarTipCol ;
                                       A3881FacNomCol = A1234BarNomCli ;
                                       A3882FacNumCol = A1235BarNumCli ;
                                       A5353FacImpMan = A5354AlbImpMan ;
                                       A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                       if ( AV124Moda21.doubleValue() == 1 )
                                       {
                                          A451FacRec = DecimalUtil.doubleToDec(0) ;
                                          A3898FacPreKgsA = DecimalUtil.doubleToDec(0) ;
                                          A3897FacKgsA = DecimalUtil.doubleToDec(0) ;
                                          if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2762AlbBarDto)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2761AlbBarRec)==0) )
                                          {
                                             A5050FacBonLi = A2762AlbBarDto ;
                                             A451FacRec = A2761AlbBarRec ;
                                             A3898FacPreKgsA = (A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2761AlbBarRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2762AlbBarDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
                                             A3897FacKgsA = DecimalUtil.doubleToDec(1) ;
                                          }
                                       }
                                       if ( AV130Tinamar == 0 )
                                       {
                                          A5355FacImpMin = ((0==AV143Itram) ? AV112CliImpMin : ((GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "E", ""))!=0) ? AV112CliImpMin : AV138CliImpMnEst)) ;
                                       }
                                       else
                                       {
                                          A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                       }
                                       A3883FacCliCod = AV84CliFac ;
                                       A5189FacTipArt = A217BarTipArt ;
                                       if ( AV131Vts == 1 )
                                       {
                                          A432FacDsc = A3746BarNPed ;
                                       }
                                       GXv_char9[0] = A396EmprCod ;
                                       GXv_int12[0] = A252CliCod ;
                                       GXv_char6[0] = A212BarSer ;
                                       GXv_char3[0] = A135BarColNom ;
                                       GXv_int8[0] = A136BarColNum ;
                                       GXv_int10[0] = A218BarTipCol ;
                                       GXv_int2[0] = AV134intcod ;
                                       GXv_char13[0] = "" ;
                                       new app.pbusin3(remoteHandle, context).execute( GXv_char9, GXv_int12, GXv_char6, GXv_char3, GXv_int8, GXv_int10, GXv_int2, GXv_char13) ;
                                       pfacautn.this.A396EmprCod = GXv_char9[0] ;
                                       pfacautn.this.A252CliCod = GXv_int12[0] ;
                                       pfacautn.this.A212BarSer = GXv_char6[0] ;
                                       pfacautn.this.A135BarColNom = GXv_char3[0] ;
                                       pfacautn.this.A136BarColNum = GXv_int8[0] ;
                                       pfacautn.this.A218BarTipCol = GXv_int10[0] ;
                                       pfacautn.this.AV134intcod = GXv_int2[0] ;
                                       A12693FacInt = AV134intcod ;
                                       A12906FacCadEnc = A4466BarAcaAnh ;
                                       AV146Item_Col_in_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
                                       AV146Item_Col_in_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Lfaven.ALBBAR. Nº Documento ", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+httpContext.getMessage( "Nº Factura ", "")+GXutil.trim( GXutil.str( AV24NumFac, 8, 0))+httpContext.getMessage( " FacLin ", "")+GXutil.trim( GXutil.str( AV25NumLin, 6, 0)) );
                                       AV146Item_Col_in_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV146Item_Col_in_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( " Nº Hdr ", "")+GXutil.trim( GXutil.str( A129BarCod, 8, 0))+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar );
                                       AV145Col_Inc_obs.add(AV146Item_Col_in_obs, 0);
                                       /* Using cursor P003011 */
                                       pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3878FacColNom, Integer.valueOf(A3879FocColNum), Byte.valueOf(A3880FacTipColC), A3881FacNomCol, Integer.valueOf(A3882FacNumCol), Integer.valueOf(A3883FacCliCod), A3898FacPreKgsA, A4814FacEncCli, A5050FacBonLi, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3897FacKgsA, Integer.valueOf(A12197FacUnds), A12198FacPreUnd, Byte.valueOf(A12693FacInt), Short.valueOf(A12906FacCadEnc)});
                                       Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                       if ( (pr_default.getStatus(9) == 1) )
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
                                       if ( ( AV103FlagBonAlb == 1 ) && ( GXutil.strcmp(AV108BonToP, httpContext.getMessage( "P", "")) == 0 ) && ( A2762AlbBarDto.doubleValue() != 0 ) )
                                       {
                                          AV25NumLin = (int)(AV25NumLin+1) ;
                                          /*
                                             INSERT RECORD ON TABLE TXPLFAVEN

                                          */
                                          A430FacCod = AV24NumFac ;
                                          A446FacLin = AV25NumLin ;
                                          A427FacAlbCod = A30AlbProCod ;
                                          A1294FacBarCod = A129BarCod ;
                                          A1295FacBarReo = A132BarCodReo ;
                                          A1296FacBarPar = A130BarCodPar ;
                                          A428FacAlbTip = (byte)(1) ;
                                          A454FacSer = httpContext.getMessage( "BONIFICACION", "") ;
                                          A448FacPreKgs = GXutil.roundDecimal( (A1261BarAlbKgmE.multiply(A1262BarPreKgm).multiply(A2762AlbBarDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2).multiply(DecimalUtil.doubleToDec((-1))) ;
                                          A449FacPreMts = GXutil.roundDecimal( (A1263BarAlbMtrE.multiply(A1264BarPreMtr).multiply(A2762AlbBarDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2).multiply(DecimalUtil.doubleToDec((-1))) ;
                                          A444FacKgs = DecimalUtil.doubleToDec(1) ;
                                          A447FacMts = DecimalUtil.doubleToDec(1) ;
                                          A1498FacDisNum = AV45BarDisNum ;
                                          A3303FacNPart = A1503BarPart ;
                                          A3397FacFasCod = httpContext.getMessage( "BONIFPAR", "") ;
                                          A4814FacEncCli = A4812BarEncCli ;
                                          A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                          A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                          A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                          A3883FacCliCod = AV84CliFac ;
                                          A3884FacProCod = AV128Procod ;
                                          /* Using cursor P003012 */
                                          pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A3884FacProCod, A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                                          Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                          if ( (pr_default.getStatus(10) == 1) )
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
                                       }
                                    }
                                    AV77FlagAlb = (byte)(1) ;
                                 }
                                 else
                                 {
                                 }
                                 if ( AV118Erfoc == 0 )
                                 {
                                    /* Using cursor P003013 */
                                    pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                    while ( (pr_default.getStatus(11) != 101) )
                                    {
                                       A212BarSer = P003013_A212BarSer[0] ;
                                       A460FasDsc = P003013_A460FasDsc[0] ;
                                       A1503BarPart = P003013_A1503BarPart[0] ;
                                       A457FasCod = P003013_A457FasCod[0] ;
                                       A4812BarEncCli = P003013_A4812BarEncCli[0] ;
                                       A7752GuiFasRec = P003013_A7752GuiFasRec[0] ;
                                       n7752GuiFasRec = P003013_n7752GuiFasRec[0] ;
                                       A7751GuiFasDto = P003013_A7751GuiFasDto[0] ;
                                       n7751GuiFasDto = P003013_n7751GuiFasDto[0] ;
                                       A217BarTipArt = P003013_A217BarTipArt[0] ;
                                       n217BarTipArt = P003013_n217BarTipArt[0] ;
                                       A1276FasMtr = P003013_A1276FasMtr[0] ;
                                       A1275FasKgm = P003013_A1275FasKgm[0] ;
                                       A12193FasUnd = P003013_A12193FasUnd[0] ;
                                       A1241GuiFasPKg = P003013_A1241GuiFasPKg[0] ;
                                       A1242GuiFasPMt = P003013_A1242GuiFasPMt[0] ;
                                       A12194FasPreUnd = P003013_A12194FasPreUnd[0] ;
                                       A1240GuiFasLin = P003013_A1240GuiFasLin[0] ;
                                       A460FasDsc = P003013_A460FasDsc[0] ;
                                       A212BarSer = P003013_A212BarSer[0] ;
                                       A1503BarPart = P003013_A1503BarPart[0] ;
                                       A4812BarEncCli = P003013_A4812BarEncCli[0] ;
                                       A217BarTipArt = P003013_A217BarTipArt[0] ;
                                       n217BarTipArt = P003013_n217BarTipArt[0] ;
                                       AV25NumLin = (int)(AV25NumLin+1) ;
                                       AV38Metros = A1276FasMtr ;
                                       AV39Kilos = A1275FasKgm ;
                                       AV132Unidades = A12193FasUnd ;
                                       AV40PrecioKg = A1241GuiFasPKg ;
                                       AV41PrecioMt = A1242GuiFasPMt ;
                                       AV133PrecioUn = A12194FasPreUnd ;
                                       if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41PrecioMt)==0) )
                                       {
                                          AV41PrecioMt = DecimalUtil.ZERO ;
                                       }
                                       if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40PrecioKg)==0) )
                                       {
                                          AV40PrecioKg = DecimalUtil.ZERO ;
                                       }
                                       /*
                                          INSERT RECORD ON TABLE TXPLFAVEN

                                       */
                                       A430FacCod = AV24NumFac ;
                                       A446FacLin = AV25NumLin ;
                                       A427FacAlbCod = A30AlbProCod ;
                                       A1294FacBarCod = A129BarCod ;
                                       A1295FacBarReo = A132BarCodReo ;
                                       A1296FacBarPar = A130BarCodPar ;
                                       A428FacAlbTip = (byte)(1) ;
                                       A454FacSer = A212BarSer ;
                                       A448FacPreKgs = AV40PrecioKg ;
                                       A449FacPreMts = AV41PrecioMt ;
                                       A12198FacPreUnd = AV133PrecioUn ;
                                       A444FacKgs = AV39Kilos ;
                                       A447FacMts = AV38Metros ;
                                       A12197FacUnds = AV132Unidades ;
                                       A432FacDsc = A460FasDsc ;
                                       A1498FacDisNum = AV45BarDisNum ;
                                       A3303FacNPart = A1503BarPart ;
                                       A3397FacFasCod = A457FasCod ;
                                       A4814FacEncCli = A4812BarEncCli ;
                                       A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                       A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                       if ( AV124Moda21.doubleValue() == 1 )
                                       {
                                          A451FacRec = DecimalUtil.doubleToDec(0) ;
                                          A3898FacPreKgsA = DecimalUtil.doubleToDec(0) ;
                                          A3897FacKgsA = DecimalUtil.doubleToDec(0) ;
                                          if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7751GuiFasDto)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7752GuiFasRec)==0) )
                                          {
                                             A451FacRec = A7752GuiFasRec ;
                                             A5050FacBonLi = A7751GuiFasDto ;
                                             A3898FacPreKgsA = ((AV40PrecioKg.multiply(AV39Kilos).multiply(A7752GuiFasRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV40PrecioKg.multiply(AV39Kilos).multiply(A7751GuiFasDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))).add(((AV41PrecioMt.multiply(AV38Metros).multiply(A7752GuiFasRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV41PrecioMt.multiply(AV38Metros).multiply(A7751GuiFasDto).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))) ;
                                             A3897FacKgsA = DecimalUtil.doubleToDec(1) ;
                                          }
                                       }
                                       A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                       A3883FacCliCod = AV84CliFac ;
                                       A5189FacTipArt = A217BarTipArt ;
                                       /* Using cursor P003014 */
                                       pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A3898FacPreKgsA, A4814FacEncCli, A5050FacBonLi, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3897FacKgsA, Integer.valueOf(A12197FacUnds), A12198FacPreUnd});
                                       Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                       if ( (pr_default.getStatus(12) == 1) )
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
                                       AV77FlagAlb = (byte)(1) ;
                                       pr_default.readNext(11);
                                    }
                                    pr_default.close(11);
                                 }
                                 /* Using cursor P003015 */
                                 pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                 while ( (pr_default.getStatus(13) != 101) )
                                 {
                                    A212BarSer = P003015_A212BarSer[0] ;
                                    A2765AlbHdrTxt = P003015_A2765AlbHdrTxt[0] ;
                                    A1503BarPart = P003015_A1503BarPart[0] ;
                                    A4812BarEncCli = P003015_A4812BarEncCli[0] ;
                                    A2770ALbHdrMts = P003015_A2770ALbHdrMts[0] ;
                                    A2768AlbHdrKgs = P003015_A2768AlbHdrKgs[0] ;
                                    A2767AlbHdrPKg = P003015_A2767AlbHdrPKg[0] ;
                                    A2769AlbHdrPMt = P003015_A2769AlbHdrPMt[0] ;
                                    A2764AlbHdrLin = P003015_A2764AlbHdrLin[0] ;
                                    A212BarSer = P003015_A212BarSer[0] ;
                                    A1503BarPart = P003015_A1503BarPart[0] ;
                                    A4812BarEncCli = P003015_A4812BarEncCli[0] ;
                                    AV25NumLin = (int)(AV25NumLin+1) ;
                                    AV38Metros = A2770ALbHdrMts ;
                                    AV39Kilos = A2768AlbHdrKgs ;
                                    AV40PrecioKg = A2767AlbHdrPKg ;
                                    AV41PrecioMt = A2769AlbHdrPMt ;
                                    if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38Metros)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41PrecioMt)==0) )
                                    {
                                       AV41PrecioMt = DecimalUtil.ZERO ;
                                    }
                                    if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV39Kilos)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40PrecioKg)==0) )
                                    {
                                       AV40PrecioKg = DecimalUtil.ZERO ;
                                    }
                                    /*
                                       INSERT RECORD ON TABLE TXPLFAVEN

                                    */
                                    A430FacCod = AV24NumFac ;
                                    A446FacLin = AV25NumLin ;
                                    A427FacAlbCod = A30AlbProCod ;
                                    A1294FacBarCod = A129BarCod ;
                                    A1295FacBarReo = A132BarCodReo ;
                                    A1296FacBarPar = A130BarCodPar ;
                                    A428FacAlbTip = (byte)(1) ;
                                    A454FacSer = A212BarSer ;
                                    A448FacPreKgs = AV40PrecioKg ;
                                    A449FacPreMts = AV41PrecioMt ;
                                    A444FacKgs = AV39Kilos ;
                                    A447FacMts = AV38Metros ;
                                    A432FacDsc = A2765AlbHdrTxt ;
                                    A1498FacDisNum = AV45BarDisNum ;
                                    A3303FacNPart = A1503BarPart ;
                                    A3397FacFasCod = httpContext.getMessage( "ZZZZZZZZ", "") ;
                                    A4814FacEncCli = A4812BarEncCli ;
                                    A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                    A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                    A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                    A3883FacCliCod = AV84CliFac ;
                                    AV146Item_Col_in_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
                                    AV146Item_Col_in_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Lfaven.ALBTXT. Nº Documento ", "")+GXutil.trim( GXutil.str( A30AlbProCod, 10, 0))+httpContext.getMessage( "Nº Factura ", "")+GXutil.trim( GXutil.str( AV24NumFac, 8, 0))+httpContext.getMessage( " FacLin ", "")+GXutil.trim( GXutil.str( AV25NumLin, 6, 0)) );
                                    AV146Item_Col_in_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( AV146Item_Col_in_obs.getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs()+httpContext.getMessage( " Nº Hdr ", "")+GXutil.trim( GXutil.str( A129BarCod, 8, 0))+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar+httpContext.getMessage( " Txt ", "")+GXutil.trim( A2765AlbHdrTxt) );
                                    AV145Col_Inc_obs.add(AV146Item_Col_in_obs, 0);
                                    /* Using cursor P003016 */
                                    pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                                    Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                    if ( (pr_default.getStatus(14) == 1) )
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
                                    pr_default.readNext(13);
                                 }
                                 pr_default.close(13);
                                 if ( (0==AV93FlagFacPro) )
                                 {
                                    GXv_char13[0] = A396EmprCod ;
                                    GXv_int4[0] = A30AlbProCod ;
                                    GXv_int12[0] = A129BarCod ;
                                    GXv_int10[0] = A132BarCodReo ;
                                    GXv_char9[0] = A130BarCodPar ;
                                    GXv_char6[0] = A143BarDisNum ;
                                    GXv_int8[0] = AV25NumLin ;
                                    GXv_int7[0] = AV24NumFac ;
                                    GXv_int5[0] = AV84CliFac ;
                                    new app.pfacmapr(remoteHandle, context).execute( GXv_char13, GXv_int4, GXv_int12, GXv_int10, GXv_char9, GXv_char6, GXv_int8, GXv_int7, GXv_int5) ;
                                    pfacautn.this.A396EmprCod = GXv_char13[0] ;
                                    pfacautn.this.A30AlbProCod = GXv_int4[0] ;
                                    pfacautn.this.A129BarCod = GXv_int12[0] ;
                                    pfacautn.this.A132BarCodReo = GXv_int10[0] ;
                                    pfacautn.this.A130BarCodPar = GXv_char9[0] ;
                                    pfacautn.this.A143BarDisNum = GXv_char6[0] ;
                                    pfacautn.this.AV25NumLin = GXv_int8[0] ;
                                    pfacautn.this.AV24NumFac = GXv_int7[0] ;
                                    pfacautn.this.AV84CliFac = GXv_int5[0] ;
                                 }
                                 if ( ! (0==A1266BarAlbTub) && ! (0==A1206TubCod) )
                                 {
                                    AV25NumLin = (int)(AV25NumLin+1) ;
                                    /*
                                       INSERT RECORD ON TABLE TXPLFAVEN

                                    */
                                    A430FacCod = AV24NumFac ;
                                    A446FacLin = AV25NumLin ;
                                    A427FacAlbCod = A30AlbProCod ;
                                    A1294FacBarCod = A129BarCod ;
                                    A1295FacBarReo = A132BarCodReo ;
                                    A1296FacBarPar = A130BarCodPar ;
                                    A428FacAlbTip = (byte)(1) ;
                                    A454FacSer = httpContext.getMessage( "Tubos", "") ;
                                    A448FacPreKgs = A1208TubPre ;
                                    A449FacPreMts = DecimalUtil.ZERO ;
                                    A444FacKgs = DecimalUtil.doubleToDec(A1266BarAlbTub) ;
                                    A447FacMts = DecimalUtil.ZERO ;
                                    A451FacRec = DecimalUtil.ZERO ;
                                    A432FacDsc = A1207TubNom ;
                                    A1498FacDisNum = AV45BarDisNum ;
                                    A3303FacNPart = A1503BarPart ;
                                    A4814FacEncCli = A4812BarEncCli ;
                                    A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                    A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                    A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                    A3883FacCliCod = AV84CliFac ;
                                    /* Using cursor P003017 */
                                    pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                                    Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                    if ( (pr_default.getStatus(15) == 1) )
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
                                    AV77FlagAlb = (byte)(1) ;
                                 }
                                 if ( ! (0==A6467BarAlbPlas) && ! (0==A6466PlasCod) )
                                 {
                                    GXv_char13[0] = A396EmprCod ;
                                    GXv_int4[0] = A30AlbProCod ;
                                    GXv_int12[0] = A129BarCod ;
                                    GXv_int10[0] = A132BarCodReo ;
                                    GXv_char9[0] = A130BarCodPar ;
                                    GXv_int8[0] = AV24NumFac ;
                                    GXv_int7[0] = AV25NumLin ;
                                    GXv_char6[0] = " " ;
                                    GXv_int2[0] = AV83FlagSal ;
                                    GXv_int11[0] = AV107TotAlb ;
                                    GXv_int5[0] = AV84CliFac ;
                                    new app.facturacion.pfacau15(remoteHandle, context).execute( GXv_char13, GXv_int4, GXv_int12, GXv_int10, GXv_char9, GXv_int8, GXv_int7, GXv_char6, GXv_int2, GXv_int11, GXv_int5) ;
                                    pfacautn.this.A396EmprCod = GXv_char13[0] ;
                                    pfacautn.this.A30AlbProCod = GXv_int4[0] ;
                                    pfacautn.this.A129BarCod = GXv_int12[0] ;
                                    pfacautn.this.A132BarCodReo = GXv_int10[0] ;
                                    pfacautn.this.A130BarCodPar = GXv_char9[0] ;
                                    pfacautn.this.AV24NumFac = GXv_int8[0] ;
                                    pfacautn.this.AV25NumLin = GXv_int7[0] ;
                                    pfacautn.this.AV83FlagSal = GXv_int2[0] ;
                                    pfacautn.this.AV107TotAlb = GXv_int11[0] ;
                                    pfacautn.this.AV84CliFac = GXv_int5[0] ;
                                    AV77FlagAlb = (byte)(1) ;
                                 }
                                 pr_default.readNext(7);
                              }
                              pr_default.close(7);
                              if ( ( AV103FlagBonAlb == 1 ) && ( GXutil.strcmp(AV108BonToP, httpContext.getMessage( "T", "")) == 0 ) )
                              {
                                 AV25NumLin = (int)(AV25NumLin+1) ;
                                 GXt_int14 = AV107TotAlb ;
                                 GXv_char13[0] = A396EmprCod ;
                                 GXv_int12[0] = AV24NumFac ;
                                 GXv_int4[0] = A30AlbProCod ;
                                 GXv_int11[0] = GXt_int14 ;
                                 new app.pfactoli(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int4, GXv_int11) ;
                                 pfacautn.this.A396EmprCod = GXv_char13[0] ;
                                 pfacautn.this.AV24NumFac = GXv_int12[0] ;
                                 pfacautn.this.A30AlbProCod = GXv_int4[0] ;
                                 pfacautn.this.GXt_int14 = GXv_int11[0] ;
                                 AV107TotAlb = GXt_int14 ;
                                 /*
                                    INSERT RECORD ON TABLE TXPLFAVEN

                                 */
                                 A430FacCod = AV24NumFac ;
                                 A446FacLin = AV25NumLin ;
                                 A427FacAlbCod = A30AlbProCod ;
                                 A1294FacBarCod = 99999999 ;
                                 A1295FacBarReo = (byte)(0) ;
                                 A1296FacBarPar = " " ;
                                 A428FacAlbTip = (byte)(1) ;
                                 A454FacSer = httpContext.getMessage( "BONIFICACION", "") ;
                                 A448FacPreKgs = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV107TotAlb).multiply(AV106AlbProBon).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2).multiply(DecimalUtil.doubleToDec((-1))) ;
                                 A449FacPreMts = DecimalUtil.doubleToDec(0) ;
                                 A444FacKgs = DecimalUtil.doubleToDec(1) ;
                                 A447FacMts = DecimalUtil.doubleToDec(0) ;
                                 A3397FacFasCod = httpContext.getMessage( "BONIFTOT", "") ;
                                 A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                 A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                 A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                 A3883FacCliCod = AV84CliFac ;
                                 /* Using cursor P003018 */
                                 pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                                 Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                 if ( (pr_default.getStatus(16) == 1) )
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
                              }
                           }
                           if ( AV77FlagAlb == 1 )
                           {
                              A33AlbProEst = (byte)(2) ;
                              if ( AV136i > 10000 )
                              {
                                 httpContext.GX_msglist.addItem(httpContext.getMessage( "Array definida para 10000 documentos¡¡¡¡", ""));
                              }
                              else
                              {
                                 AV135Tab_Ndoc[AV136i-1] = A30AlbProCod ;
                              }
                              AV136i = (int)(AV136i+1) ;
                              AV146Item_Col_in_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
                              AV146Item_Col_in_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "Actualizando Array Tab_Ndoc(), NºDocumento ", "")+GXutil.str( A30AlbProCod, 10, 0)+httpContext.getMessage( " Cliente ", "")+GXutil.str( AV15CliCod, 6, 0)+httpContext.getMessage( " Estado =", "")+GXutil.str( A33AlbProEst, 1, 0) );
                              AV145Col_Inc_obs.add(AV146Item_Col_in_obs, 0);
                           }
                           /* Using cursor P003019 */
                           pr_default.execute(17, new Object[] {Byte.valueOf(A33AlbProEst), A396EmprCod, Long.valueOf(A30AlbProCod)});
                           Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                        }
                     }
                  }
               }
               brk307 = true ;
               pr_default.readNext(5);
            }
            if ( ! brk307 )
            {
               brk307 = true ;
               pr_default.readNext(5);
            }
         }
         pr_default.close(5);
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = AV15CliCod ;
         GXv_char9[0] = AV20PRIO ;
         new app.pprc64(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_char9, AV135Tab_Ndoc) ;
         pfacautn.this.A396EmprCod = GXv_char13[0] ;
         pfacautn.this.AV15CliCod = GXv_int12[0] ;
         pfacautn.this.AV20PRIO = GXv_char9[0] ;
      }
      if ( ( GXutil.strcmp(AV120TipAlb, "2") == 0 ) || (GXutil.strcmp("", AV120TipAlb)==0) )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = AV15CliCod ;
         GXv_date15[0] = AV16PFecha ;
         GXv_date16[0] = AV17UFecha ;
         GXv_int4[0] = AV18PALB ;
         GXv_int17[0] = AV19UALB ;
         GXv_char9[0] = AV20PRIO ;
         GXv_date18[0] = AV21FacFch ;
         GXv_char6[0] = AV22FacSerNum ;
         GXv_int8[0] = AV84CliFac ;
         GXv_char3[0] = AV113TipProd ;
         GXv_int7[0] = AV25NumLin ;
         GXv_int5[0] = AV24NumFac ;
         new app.facturacion.pfacatn2(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_date15, GXv_date16, GXv_int4, GXv_int17, GXv_char9, GXv_date18, GXv_char6, GXv_int8, GXv_char3, GXv_int7, GXv_int5) ;
         pfacautn.this.A396EmprCod = GXv_char13[0] ;
         pfacautn.this.AV15CliCod = GXv_int12[0] ;
         pfacautn.this.AV16PFecha = GXv_date15[0] ;
         pfacautn.this.AV17UFecha = GXv_date16[0] ;
         pfacautn.this.AV18PALB = GXv_int4[0] ;
         pfacautn.this.AV19UALB = GXv_int17[0] ;
         pfacautn.this.AV20PRIO = GXv_char9[0] ;
         pfacautn.this.AV21FacFch = GXv_date18[0] ;
         pfacautn.this.AV22FacSerNum = GXv_char6[0] ;
         pfacautn.this.AV84CliFac = GXv_int8[0] ;
         pfacautn.this.AV113TipProd = GXv_char3[0] ;
         pfacautn.this.AV25NumLin = GXv_int7[0] ;
         pfacautn.this.AV24NumFac = GXv_int5[0] ;
      }
      if ( AV25NumLin > 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCFAVEN

         */
         A430FacCod = AV24NumFac ;
         A252CliCod = AV84CliFac ;
         n252CliCod = false ;
         A436FacFch = AV21FacFch ;
         A450FacPri = AV20PRIO ;
         A437FacFpg = AV26CodFpg ;
         A433FacDtoGen = AV27DtoGen ;
         A434FacDtoPP = AV28DtoPP ;
         A6632FacDto = AV119Clidto ;
         if ( GXutil.strcmp(AV88Extranjero, httpContext.getMessage( "S", "")) == 0 )
         {
            A443FacIVAPor = (byte)(0) ;
            A453FacRECPor = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( GXutil.strcmp(AV20PRIO, "1") == 0 )
            {
               A443FacIVAPor = AV34IvaPor ;
               if ( GXutil.strcmp(AV29RegIVA, httpContext.getMessage( "R", "")) == 0 )
               {
                  A453FacRECPor = AV35IvaRec ;
               }
            }
         }
         A445FacLiC = AV25NumLin ;
         A1150FacNumVto = AV31CliNroVto ;
         A1151FacPer = AV32CliPrd ;
         A1152FacDiaPag = AV33CliDiaPag ;
         A960FacIVACod = AV37IvaCod ;
         A2739FacSerNum = AV22FacSerNum ;
         A965FacCob = " " ;
         A3115FacDivCod = AV85FacDivCod ;
         n3115FacDivCod = false ;
         A3096FacDivTCod = AV86FacDivTCod ;
         n3096FacDivTCod = false ;
         A435FacEst = (byte)(0) ;
         A1153FacTipFac = (byte)(0) ;
         A3119FacRepCod = AV92RepCod ;
         n3119FacRepCod = false ;
         A9606FacHor = AV127FacHor ;
         A11513FacRecIca = DecimalUtil.doubleToDec(0) ;
         A8346FacRecI = DecimalUtil.doubleToDec(0) ;
         n8346FacRecI = false ;
         A7212FacRect = DecimalUtil.doubleToDec(0) ;
         A11629MeivaId = AV137stMeivaId ;
         n11629MeivaId = false ;
         A14219FacEnergia = AV139CliEnergia ;
         GXv_char13[0] = AV140facidate ;
         GXv_char9[0] = AV141FacSerAT ;
         GXv_char6[0] = AV142FacTipAT ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, AV30ContCod, GXv_char13, GXv_char9, GXv_char6, GXutil.trim( AV167Pgmdesc)) ;
         pfacautn.this.AV140facidate = GXv_char13[0] ;
         pfacautn.this.AV141FacSerAT = GXv_char9[0] ;
         pfacautn.this.AV142FacTipAT = GXv_char6[0] ;
         A14230FacIDATe = AV140facidate ;
         A14236FacSerAT = AV141FacSerAT ;
         A14237FacTipAT = AV142FacTipAT ;
         /* Using cursor P003020 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A436FacFch, A450FacPri, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A437FacFpg, A433FacDtoGen, A434FacDtoPP, Byte.valueOf(A443FacIVAPor), A453FacRECPor, Byte.valueOf(A435FacEst), Integer.valueOf(A445FacLiC), A960FacIVACod, A965FacCob, Byte.valueOf(A1150FacNumVto), A1151FacPer, A1152FacDiaPag, Byte.valueOf(A1153FacTipFac), A2739FacSerNum, Boolean.valueOf(n3096FacDivTCod), A3096FacDivTCod, Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod), Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, A6632FacDto, A7212FacRect, Boolean.valueOf(n8346FacRecI), A8346FacRecI, A9606FacHor, A11513FacRecIca, Boolean.valueOf(n11629MeivaId), A11629MeivaId, A14219FacEnergia, A14230FacIDATe, A14236FacSerAT, A14237FacTipAT});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         if ( (pr_default.getStatus(18) == 1) )
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
         if ( AV104FlagRieClF == 1 )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_int12[0] = AV15CliCod ;
            GXv_int8[0] = AV24NumFac ;
            GXv_char9[0] = httpContext.getMessage( "A", "") ;
            GXv_decimal19[0] = AV105Noseusa ;
            new app.prieclup(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int8, GXv_char9, GXv_decimal19) ;
            pfacautn.this.A396EmprCod = GXv_char13[0] ;
            pfacautn.this.AV15CliCod = GXv_int12[0] ;
            pfacautn.this.AV24NumFac = GXv_int8[0] ;
            pfacautn.this.AV105Noseusa = GXv_decimal19[0] ;
         }
         /* Optimized UPDATE. */
         /* Using cursor P003021 */
         pr_default.execute(19, new Object[] {Integer.valueOf(AV24NumFac), A396EmprCod, AV30ContCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
         /* End optimized UPDATE. */
         new app.pcalvto(remoteHandle, context).execute( A396EmprCod, AV24NumFac) ;
         GXv_char13[0] = AV147Cadena ;
         GXv_char9[0] = AV148firma ;
         new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, AV24NumFac, AV127FacHor, GXv_char13, GXv_char9) ;
         pfacautn.this.AV147Cadena = GXv_char13[0] ;
         pfacautn.this.AV148firma = GXv_char9[0] ;
         GXv_char13[0] = AV151Hash ;
         GXv_objcol_SdtMessages_Message20[0] = AV149Messages ;
         GXv_boolean21[0] = AV150ok ;
         new app.hash_obtener(remoteHandle, context).execute( AV147Cadena, GXv_char13, GXv_objcol_SdtMessages_Message20, GXv_boolean21) ;
         pfacautn.this.AV151Hash = GXv_char13[0] ;
         AV149Messages = GXv_objcol_SdtMessages_Message20[0] ;
         pfacautn.this.AV150ok = GXv_boolean21[0] ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int12[0] = AV24NumFac ;
         GXv_char9[0] = AV147Cadena ;
         GXv_char6[0] = AV151Hash ;
         new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_char9, GXv_char6) ;
         pfacautn.this.A396EmprCod = GXv_char13[0] ;
         pfacautn.this.AV24NumFac = GXv_int12[0] ;
         pfacautn.this.AV147Cadena = GXv_char9[0] ;
         pfacautn.this.AV151Hash = GXv_char6[0] ;
         AV146Item_Col_in_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV146Item_Col_in_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "CFAVEN, Nº Factura ", "")+GXutil.trim( GXutil.str( AV24NumFac, 8, 0))+httpContext.getMessage( " Hash=", "")+GXutil.trim( AV148firma) );
         AV145Col_Inc_obs.add(AV146Item_Col_in_obs, 0);
      }
      else
      {
         AV146Item_Col_in_obs = (app.SdtIncidenciasObservaciones_SDT)new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
         AV146Item_Col_in_obs.setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( httpContext.getMessage( "NO se ha creado FACTURA.Contador lineas, &NumLin= ", "")+GXutil.str( AV25NumLin, 6, 0) );
         AV145Col_Inc_obs.add(AV146Item_Col_in_obs, 0);
      }
      AV144mensajes = AV145Col_Inc_obs.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'OBSFAC' Routine */
      returnInSub = false ;
      AV43ArtObsFac = "" ;
      /* Using cursor P003022 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV44BarSer});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A65ArtCod = P003022_A65ArtCod[0] ;
         A252CliCod = P003022_A252CliCod[0] ;
         n252CliCod = P003022_n252CliCod[0] ;
         A90ArtObsFac = P003022_A90ArtObsFac[0] ;
         n90ArtObsFac = P003022_n90ArtObsFac[0] ;
         AV43ArtObsFac = A90ArtObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacautn.this.A396EmprCod;
      this.aP1[0] = pfacautn.this.AV15CliCod;
      this.aP2[0] = pfacautn.this.AV16PFecha;
      this.aP3[0] = pfacautn.this.AV17UFecha;
      this.aP4[0] = pfacautn.this.AV18PALB;
      this.aP5[0] = pfacautn.this.AV19UALB;
      this.aP6[0] = pfacautn.this.AV20PRIO;
      this.aP7[0] = pfacautn.this.AV21FacFch;
      this.aP8[0] = pfacautn.this.AV22FacSerNum;
      this.aP9[0] = pfacautn.this.AV84CliFac;
      this.aP10[0] = pfacautn.this.AV113TipProd;
      this.aP11[0] = pfacautn.this.AV120TipAlb;
      this.aP12[0] = pfacautn.this.AV127FacHor;
      this.aP13[0] = pfacautn.this.AV144mensajes;
      this.aP14[0] = pfacautn.this.AV149Messages;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pfacautn");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV144mensajes = "" ;
      AV149Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      P00302_A396EmprCod = new String[] {""} ;
      P00302_A252CliCod = new int[1] ;
      P00302_n252CliCod = new boolean[] {false} ;
      P00302_A3073RepCod = new String[] {""} ;
      A3073RepCod = "" ;
      AV92RepCod = "" ;
      AV124Moda21 = DecimalUtil.ZERO ;
      AV30ContCod = "" ;
      P00303_A396EmprCod = new String[] {""} ;
      P00303_A313ContCod = new String[] {""} ;
      P00303_A316ContVal = new int[1] ;
      P00303_A953IvaCod = new String[] {""} ;
      P00303_n953IvaCod = new boolean[] {false} ;
      A313ContCod = "" ;
      A953IvaCod = "" ;
      AV37IvaCod = "" ;
      P00304_A396EmprCod = new String[] {""} ;
      P00304_A953IvaCod = new String[] {""} ;
      P00304_n953IvaCod = new boolean[] {false} ;
      P00304_A408EmprPob = new String[] {""} ;
      P00304_n408EmprPob = new boolean[] {false} ;
      P00304_A588IvaPor = new byte[1] ;
      P00304_n588IvaPor = new boolean[] {false} ;
      P00304_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00304_n589IvaRec = new boolean[] {false} ;
      A408EmprPob = "" ;
      A589IvaRec = DecimalUtil.ZERO ;
      AV35IvaRec = DecimalUtil.ZERO ;
      P00305_A396EmprCod = new String[] {""} ;
      P00305_A252CliCod = new int[1] ;
      P00305_n252CliCod = new boolean[] {false} ;
      P00305_A3140CliDivCod = new byte[1] ;
      P00305_n3140CliDivCod = new boolean[] {false} ;
      P00305_A3091CliDivTra = new String[] {""} ;
      P00305_n3091CliDivTra = new boolean[] {false} ;
      P00305_A858ZonGeoCod = new short[1] ;
      P00305_A14240stMeivaId = new String[] {""} ;
      P00305_n14240stMeivaId = new boolean[] {false} ;
      P00305_A2028CliImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00305_n2028CliImpMin = new boolean[] {false} ;
      P00305_A14245CliImpMnEs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00305_A14242CliEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3091CliDivTra = "" ;
      A14240stMeivaId = "" ;
      A2028CliImpMin = DecimalUtil.ZERO ;
      A14245CliImpMnEs = DecimalUtil.ZERO ;
      A14242CliEnergia = DecimalUtil.ZERO ;
      AV86FacDivTCod = "" ;
      AV88Extranjero = "" ;
      AV137stMeivaId = "" ;
      AV112CliImpMin = DecimalUtil.ZERO ;
      AV138CliImpMnEst = DecimalUtil.ZERO ;
      AV139CliEnergia = DecimalUtil.ZERO ;
      P00306_A396EmprCod = new String[] {""} ;
      P00306_A252CliCod = new int[1] ;
      P00306_n252CliCod = new boolean[] {false} ;
      P00306_A297CliPri = new String[] {""} ;
      P00306_A497FpgCod = new String[] {""} ;
      P00306_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00306_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00306_A6630CliDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00306_A299CliRegIVA = new String[] {""} ;
      P00306_A280CliNroVto = new byte[1] ;
      P00306_A296CliPrd = new String[] {""} ;
      P00306_A259CliDiaPag = new String[] {""} ;
      A297CliPri = "" ;
      A497FpgCod = "" ;
      A261CliDtoGrl = DecimalUtil.ZERO ;
      A262CliDtoPpg = DecimalUtil.ZERO ;
      A6630CliDto = DecimalUtil.ZERO ;
      A299CliRegIVA = "" ;
      A296CliPrd = "" ;
      A259CliDiaPag = "" ;
      AV26CodFpg = "" ;
      AV27DtoGen = DecimalUtil.ZERO ;
      AV28DtoPP = DecimalUtil.ZERO ;
      AV119Clidto = DecimalUtil.ZERO ;
      AV29RegIVA = "" ;
      AV32CliPrd = "" ;
      AV33CliDiaPag = "" ;
      AV135Tab_Ndoc = new long[10000] ;
      A34AlbProfch = GXutil.nullDate() ;
      A5140AlbMarca = "" ;
      A39AlbProPri = "" ;
      P00307_A396EmprCod = new String[] {""} ;
      P00307_A1243GuiRemCli = new int[1] ;
      P00307_A39AlbProPri = new String[] {""} ;
      P00307_A1782AlbProEso = new byte[1] ;
      P00307_A5140AlbMarca = new String[] {""} ;
      P00307_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P00307_A30AlbProCod = new long[1] ;
      P00307_A5041AlbProTBo = new String[] {""} ;
      P00307_n5041AlbProTBo = new boolean[] {false} ;
      P00307_A5040AlbProBon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00307_n5040AlbProBon = new boolean[] {false} ;
      P00307_A33AlbProEst = new byte[1] ;
      A5041AlbProTBo = "" ;
      A5040AlbProBon = DecimalUtil.ZERO ;
      AV108BonToP = "" ;
      AV106AlbProBon = DecimalUtil.ZERO ;
      P00308_A396EmprCod = new String[] {""} ;
      P00308_A30AlbProCod = new long[1] ;
      P00308_A32AlbProEsp = new byte[1] ;
      P00308_A130BarCodPar = new String[] {""} ;
      P00308_A132BarCodReo = new byte[1] ;
      P00308_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      P00309_A396EmprCod = new String[] {""} ;
      P00309_A30AlbProCod = new long[1] ;
      P00309_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_n1208TubPre = new boolean[] {false} ;
      P00309_A1266BarAlbTub = new int[1] ;
      P00309_A1207TubNom = new String[] {""} ;
      P00309_n1207TubNom = new boolean[] {false} ;
      P00309_A212BarSer = new String[] {""} ;
      P00309_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A12195BarAlbUnd = new int[1] ;
      P00309_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A136BarColNum = new int[1] ;
      P00309_A135BarColNom = new String[] {""} ;
      P00309_A1652BarSerDsc = new String[] {""} ;
      P00309_A2010BarTipDis = new String[] {""} ;
      P00309_A1503BarPart = new short[1] ;
      P00309_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A4812BarEncCli = new String[] {""} ;
      P00309_A218BarTipCol = new byte[1] ;
      P00309_A1234BarNomCli = new String[] {""} ;
      P00309_A1235BarNumCli = new int[1] ;
      P00309_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00309_n2762AlbBarDto = new boolean[] {false} ;
      P00309_A217BarTipArt = new short[1] ;
      P00309_n217BarTipArt = new boolean[] {false} ;
      P00309_A3746BarNPed = new String[] {""} ;
      P00309_A252CliCod = new int[1] ;
      P00309_n252CliCod = new boolean[] {false} ;
      P00309_A4466BarAcaAnh = new short[1] ;
      P00309_A130BarCodPar = new String[] {""} ;
      P00309_A132BarCodReo = new byte[1] ;
      P00309_A129BarCod = new int[1] ;
      P00309_A32AlbProEsp = new byte[1] ;
      P00309_A143BarDisNum = new String[] {""} ;
      P00309_A1206TubCod = new short[1] ;
      P00309_n1206TubCod = new boolean[] {false} ;
      P00309_A6466PlasCod = new short[1] ;
      P00309_n6466PlasCod = new boolean[] {false} ;
      P00309_A6467BarAlbPlas = new short[1] ;
      A1208TubPre = DecimalUtil.ZERO ;
      A1207TubNom = "" ;
      A212BarSer = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A2010BarTipDis = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A3746BarNPed = "" ;
      A143BarDisNum = "" ;
      AV44BarSer = "" ;
      AV45BarDisNum = "" ;
      AV99BarCodPar = "" ;
      P003010_A396EmprCod = new String[] {""} ;
      P003010_A30AlbProCod = new long[1] ;
      P003010_A129BarCod = new int[1] ;
      P003010_A132BarCodReo = new byte[1] ;
      P003010_A130BarCodPar = new String[] {""} ;
      P003010_A758ProCod = new String[] {""} ;
      P003010_n758ProCod = new boolean[] {false} ;
      P003010_A1468AlbPrdLin = new short[1] ;
      A758ProCod = "" ;
      AV128Procod = "" ;
      AV43ArtObsFac = "" ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      AV89FacDsc = "" ;
      A1498FacDisNum = "" ;
      A3097FacTipPro = "" ;
      A3397FacFasCod = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A4814FacEncCli = "" ;
      A3878FacColNom = "" ;
      A3881FacNomCol = "" ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      AV146Item_Col_in_obs = new app.SdtIncidenciasObservaciones_SDT(remoteHandle, context);
      AV145Col_Inc_obs = new GXBaseCollection<app.SdtIncidenciasObservaciones_SDT>(app.SdtIncidenciasObservaciones_SDT.class, "IncidenciasObservaciones_SDT", "TexplusNET", remoteHandle);
      Gx_emsg = "" ;
      A3884FacProCod = "" ;
      P003013_A396EmprCod = new String[] {""} ;
      P003013_A30AlbProCod = new long[1] ;
      P003013_A129BarCod = new int[1] ;
      P003013_A132BarCodReo = new byte[1] ;
      P003013_A130BarCodPar = new String[] {""} ;
      P003013_A212BarSer = new String[] {""} ;
      P003013_A460FasDsc = new String[] {""} ;
      P003013_A1503BarPart = new short[1] ;
      P003013_A457FasCod = new String[] {""} ;
      P003013_A4812BarEncCli = new String[] {""} ;
      P003013_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003013_n7752GuiFasRec = new boolean[] {false} ;
      P003013_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003013_n7751GuiFasDto = new boolean[] {false} ;
      P003013_A217BarTipArt = new short[1] ;
      P003013_n217BarTipArt = new boolean[] {false} ;
      P003013_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003013_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003013_A12193FasUnd = new int[1] ;
      P003013_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003013_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003013_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003013_A1240GuiFasLin = new short[1] ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      AV38Metros = DecimalUtil.ZERO ;
      AV39Kilos = DecimalUtil.ZERO ;
      AV40PrecioKg = DecimalUtil.ZERO ;
      AV41PrecioMt = DecimalUtil.ZERO ;
      AV133PrecioUn = DecimalUtil.ZERO ;
      P003015_A396EmprCod = new String[] {""} ;
      P003015_A30AlbProCod = new long[1] ;
      P003015_A129BarCod = new int[1] ;
      P003015_A132BarCodReo = new byte[1] ;
      P003015_A130BarCodPar = new String[] {""} ;
      P003015_A212BarSer = new String[] {""} ;
      P003015_A2765AlbHdrTxt = new String[] {""} ;
      P003015_A1503BarPart = new short[1] ;
      P003015_A4812BarEncCli = new String[] {""} ;
      P003015_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003015_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003015_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003015_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003015_A2764AlbHdrLin = new short[1] ;
      A2765AlbHdrTxt = "" ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      GXv_int10 = new byte[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int11 = new short[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_int4 = new long[1] ;
      GXv_int17 = new long[1] ;
      GXv_date18 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new int[1] ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A437FacFpg = "" ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A6632FacDto = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A1151FacPer = "" ;
      A1152FacDiaPag = "" ;
      A960FacIVACod = "" ;
      A2739FacSerNum = "" ;
      A965FacCob = "" ;
      A3096FacDivTCod = "" ;
      A3119FacRepCod = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A11629MeivaId = "" ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      AV140facidate = "" ;
      AV141FacSerAT = "" ;
      AV142FacTipAT = "" ;
      AV167Pgmdesc = "" ;
      A14230FacIDATe = "" ;
      A14236FacSerAT = "" ;
      A14237FacTipAT = "" ;
      GXv_int8 = new int[1] ;
      AV105Noseusa = DecimalUtil.ZERO ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      AV147Cadena = "" ;
      AV148firma = "" ;
      AV151Hash = "" ;
      GXv_objcol_SdtMessages_Message20 = new GXBaseCollection[1] ;
      GXv_boolean21 = new boolean[1] ;
      GXv_char13 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_char6 = new String[1] ;
      P003022_A396EmprCod = new String[] {""} ;
      P003022_A65ArtCod = new String[] {""} ;
      P003022_A252CliCod = new int[1] ;
      P003022_n252CliCod = new boolean[] {false} ;
      P003022_A90ArtObsFac = new String[] {""} ;
      P003022_n90ArtObsFac = new boolean[] {false} ;
      A65ArtCod = "" ;
      A90ArtObsFac = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacautn__default(),
         new Object[] {
             new Object[] {
            P00302_A396EmprCod, P00302_A252CliCod, P00302_A3073RepCod
            }
            , new Object[] {
            P00303_A396EmprCod, P00303_A313ContCod, P00303_A316ContVal, P00303_A953IvaCod, P00303_n953IvaCod
            }
            , new Object[] {
            P00304_A396EmprCod, P00304_A953IvaCod, P00304_n953IvaCod, P00304_A408EmprPob, P00304_n408EmprPob, P00304_A588IvaPor, P00304_n588IvaPor, P00304_A589IvaRec, P00304_n589IvaRec
            }
            , new Object[] {
            P00305_A396EmprCod, P00305_A252CliCod, P00305_A3140CliDivCod, P00305_n3140CliDivCod, P00305_A3091CliDivTra, P00305_n3091CliDivTra, P00305_A858ZonGeoCod, P00305_A14240stMeivaId, P00305_n14240stMeivaId, P00305_A2028CliImpMin,
            P00305_n2028CliImpMin, P00305_A14245CliImpMnEs, P00305_A14242CliEnergia
            }
            , new Object[] {
            P00306_A396EmprCod, P00306_A252CliCod, P00306_A297CliPri, P00306_A497FpgCod, P00306_A261CliDtoGrl, P00306_A262CliDtoPpg, P00306_A6630CliDto, P00306_A299CliRegIVA, P00306_A280CliNroVto, P00306_A296CliPrd,
            P00306_A259CliDiaPag
            }
            , new Object[] {
            P00307_A396EmprCod, P00307_A1243GuiRemCli, P00307_A39AlbProPri, P00307_A1782AlbProEso, P00307_A5140AlbMarca, P00307_A34AlbProfch, P00307_A30AlbProCod, P00307_A5041AlbProTBo, P00307_n5041AlbProTBo, P00307_A5040AlbProBon,
            P00307_n5040AlbProBon, P00307_A33AlbProEst
            }
            , new Object[] {
            P00308_A396EmprCod, P00308_A30AlbProCod, P00308_A32AlbProEsp, P00308_A130BarCodPar, P00308_A132BarCodReo, P00308_A129BarCod
            }
            , new Object[] {
            P00309_A396EmprCod, P00309_A30AlbProCod, P00309_A1208TubPre, P00309_n1208TubPre, P00309_A1266BarAlbTub, P00309_A1207TubNom, P00309_n1207TubNom, P00309_A212BarSer, P00309_A1262BarPreKgm, P00309_A1264BarPreMtr,
            P00309_A12196BarPreUnd, P00309_A1261BarAlbKgmE, P00309_A1263BarAlbMtrE, P00309_A12195BarAlbUnd, P00309_A40AlbProRec, P00309_A136BarColNum, P00309_A135BarColNom, P00309_A1652BarSerDsc, P00309_A2010BarTipDis, P00309_A1503BarPart,
            P00309_A2761AlbBarRec, P00309_A4812BarEncCli, P00309_A218BarTipCol, P00309_A1234BarNomCli, P00309_A1235BarNumCli, P00309_A5354AlbImpMan, P00309_A2762AlbBarDto, P00309_n2762AlbBarDto, P00309_A217BarTipArt, P00309_n217BarTipArt,
            P00309_A3746BarNPed, P00309_A252CliCod, P00309_n252CliCod, P00309_A4466BarAcaAnh, P00309_A130BarCodPar, P00309_A132BarCodReo, P00309_A129BarCod, P00309_A32AlbProEsp, P00309_A143BarDisNum, P00309_A1206TubCod,
            P00309_n1206TubCod, P00309_A6466PlasCod, P00309_n6466PlasCod, P00309_A6467BarAlbPlas
            }
            , new Object[] {
            P003010_A396EmprCod, P003010_A30AlbProCod, P003010_A129BarCod, P003010_A132BarCodReo, P003010_A130BarCodPar, P003010_A758ProCod, P003010_n758ProCod, P003010_A1468AlbPrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003013_A396EmprCod, P003013_A30AlbProCod, P003013_A129BarCod, P003013_A132BarCodReo, P003013_A130BarCodPar, P003013_A212BarSer, P003013_A460FasDsc, P003013_A1503BarPart, P003013_A457FasCod, P003013_A4812BarEncCli,
            P003013_A7752GuiFasRec, P003013_n7752GuiFasRec, P003013_A7751GuiFasDto, P003013_n7751GuiFasDto, P003013_A217BarTipArt, P003013_n217BarTipArt, P003013_A1276FasMtr, P003013_A1275FasKgm, P003013_A12193FasUnd, P003013_A1241GuiFasPKg,
            P003013_A1242GuiFasPMt, P003013_A12194FasPreUnd, P003013_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P003015_A396EmprCod, P003015_A30AlbProCod, P003015_A129BarCod, P003015_A132BarCodReo, P003015_A130BarCodPar, P003015_A212BarSer, P003015_A2765AlbHdrTxt, P003015_A1503BarPart, P003015_A4812BarEncCli, P003015_A2770ALbHdrMts,
            P003015_A2768AlbHdrKgs, P003015_A2767AlbHdrPKg, P003015_A2769AlbHdrPMt, P003015_A2764AlbHdrLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003022_A396EmprCod, P003022_A65ArtCod, P003022_A252CliCod, P003022_A90ArtObsFac, P003022_n90ArtObsFac
            }
         }
      );
      AV167Pgmdesc = httpContext.getMessage( "Fac. Aut.  N Alb. --> 1 Fact.", "") ;
      /* GeneXus formulas. */
      AV167Pgmdesc = httpContext.getMessage( "Fac. Aut.  N Alb. --> 1 Fact.", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV118Erfoc ;
   private byte AV90FlagDsc ;
   private byte AV93FlagFacPro ;
   private byte AV103FlagBonAlb ;
   private byte AV104FlagRieClF ;
   private byte AV111FlagPorRec ;
   private byte AV115Carvema ;
   private byte AV129Torient ;
   private byte AV130Tinamar ;
   private byte AV131Vts ;
   private byte GXt_int1 ;
   private byte A588IvaPor ;
   private byte AV34IvaPor ;
   private byte A3140CliDivCod ;
   private byte AV85FacDivCod ;
   private byte A280CliNroVto ;
   private byte AV31CliNroVto ;
   private byte A1782AlbProEso ;
   private byte A33AlbProEst ;
   private byte AV77FlagAlb ;
   private byte AV79Flag2 ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV98BarCodReo ;
   private byte AV83FlagSal ;
   private byte AV48Flag ;
   private byte AV46LenSer ;
   private byte AV47LenColNom ;
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private byte AV87FlagTint ;
   private byte A3880FacTipColC ;
   private byte AV134intcod ;
   private byte A12693FacInt ;
   private byte GXv_int10[] ;
   private byte GXv_int2[] ;
   private byte A443FacIVAPor ;
   private byte A1150FacNumVto ;
   private byte A3115FacDivCod ;
   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private short AV143Itram ;
   private short A858ZonGeoCod ;
   private short A1503BarPart ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short A1468AlbPrdLin ;
   private short AV107TotAlb ;
   private short A3303FacNPart ;
   private short A5189FacTipArt ;
   private short A12906FacCadEnc ;
   private short Gx_err ;
   private short A1240GuiFasLin ;
   private short A2764AlbHdrLin ;
   private short GXt_int14 ;
   private short GXv_int11[] ;
   private int AV15CliCod ;
   private int AV84CliFac ;
   private int A252CliCod ;
   private int A316ContVal ;
   private int AV24NumFac ;
   private int AV25NumLin ;
   private int GX_I ;
   private int AV136i ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int A1266BarAlbTub ;
   private int A12195BarAlbUnd ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV97BarCod ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int A3879FocColNum ;
   private int A3882FacNumCol ;
   private int A3883FacCliCod ;
   private int A12193FasUnd ;
   private int AV132Unidades ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int GX_INS43 ;
   private int A445FacLiC ;
   private int GXv_int8[] ;
   private int GXv_int12[] ;
   private long AV18PALB ;
   private long AV19UALB ;
   private long AV135Tab_Ndoc[] ;
   private long A30AlbProCod ;
   private long AV96AlbProCod ;
   private long A427FacAlbCod ;
   private long GXv_int4[] ;
   private long GXv_int17[] ;
   private java.math.BigDecimal AV124Moda21 ;
   private java.math.BigDecimal A589IvaRec ;
   private java.math.BigDecimal AV35IvaRec ;
   private java.math.BigDecimal A2028CliImpMin ;
   private java.math.BigDecimal A14245CliImpMnEs ;
   private java.math.BigDecimal A14242CliEnergia ;
   private java.math.BigDecimal AV112CliImpMin ;
   private java.math.BigDecimal AV138CliImpMnEst ;
   private java.math.BigDecimal AV139CliEnergia ;
   private java.math.BigDecimal A261CliDtoGrl ;
   private java.math.BigDecimal A262CliDtoPpg ;
   private java.math.BigDecimal A6630CliDto ;
   private java.math.BigDecimal AV27DtoGen ;
   private java.math.BigDecimal AV28DtoPP ;
   private java.math.BigDecimal AV119Clidto ;
   private java.math.BigDecimal A5040AlbProBon ;
   private java.math.BigDecimal AV106AlbProBon ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal AV38Metros ;
   private java.math.BigDecimal AV39Kilos ;
   private java.math.BigDecimal AV40PrecioKg ;
   private java.math.BigDecimal AV41PrecioMt ;
   private java.math.BigDecimal AV133PrecioUn ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A6632FacDto ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal AV105Noseusa ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private String A396EmprCod ;
   private String AV20PRIO ;
   private String AV22FacSerNum ;
   private String AV113TipProd ;
   private String AV120TipAlb ;
   private String scmdbuf ;
   private String A3073RepCod ;
   private String AV92RepCod ;
   private String AV30ContCod ;
   private String A313ContCod ;
   private String A953IvaCod ;
   private String AV37IvaCod ;
   private String A408EmprPob ;
   private String A3091CliDivTra ;
   private String A14240stMeivaId ;
   private String AV86FacDivTCod ;
   private String AV88Extranjero ;
   private String AV137stMeivaId ;
   private String A297CliPri ;
   private String A497FpgCod ;
   private String A299CliRegIVA ;
   private String A296CliPrd ;
   private String A259CliDiaPag ;
   private String AV26CodFpg ;
   private String AV29RegIVA ;
   private String AV32CliPrd ;
   private String AV33CliDiaPag ;
   private String A5140AlbMarca ;
   private String A39AlbProPri ;
   private String A5041AlbProTBo ;
   private String AV108BonToP ;
   private String A130BarCodPar ;
   private String A1207TubNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A2010BarTipDis ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A3746BarNPed ;
   private String A143BarDisNum ;
   private String AV44BarSer ;
   private String AV45BarDisNum ;
   private String AV99BarCodPar ;
   private String A758ProCod ;
   private String AV128Procod ;
   private String AV43ArtObsFac ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String AV89FacDsc ;
   private String A1498FacDisNum ;
   private String A3097FacTipPro ;
   private String A3397FacFasCod ;
   private String A4814FacEncCli ;
   private String A3878FacColNom ;
   private String A3881FacNomCol ;
   private String Gx_emsg ;
   private String A3884FacProCod ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String A2765AlbHdrTxt ;
   private String GXv_char3[] ;
   private String A450FacPri ;
   private String A437FacFpg ;
   private String A1151FacPer ;
   private String A1152FacDiaPag ;
   private String A960FacIVACod ;
   private String A2739FacSerNum ;
   private String A965FacCob ;
   private String A3096FacDivTCod ;
   private String A3119FacRepCod ;
   private String A11629MeivaId ;
   private String AV140facidate ;
   private String AV141FacSerAT ;
   private String AV142FacTipAT ;
   private String AV167Pgmdesc ;
   private String A14230FacIDATe ;
   private String A14236FacSerAT ;
   private String A14237FacTipAT ;
   private String AV147Cadena ;
   private String AV148firma ;
   private String AV151Hash ;
   private String GXv_char13[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
   private String A65ArtCod ;
   private String A90ArtObsFac ;
   private java.util.Date AV127FacHor ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV16PFecha ;
   private java.util.Date AV17UFecha ;
   private java.util.Date AV21FacFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date GXv_date16[] ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date A436FacFch ;
   private boolean n252CliCod ;
   private boolean n953IvaCod ;
   private boolean n408EmprPob ;
   private boolean n588IvaPor ;
   private boolean n589IvaRec ;
   private boolean n3140CliDivCod ;
   private boolean n3091CliDivTra ;
   private boolean n14240stMeivaId ;
   private boolean n2028CliImpMin ;
   private boolean brk307 ;
   private boolean n5041AlbProTBo ;
   private boolean n5040AlbProBon ;
   private boolean n1208TubPre ;
   private boolean n1207TubNom ;
   private boolean n2762AlbBarDto ;
   private boolean n217BarTipArt ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean n758ProCod ;
   private boolean returnInSub ;
   private boolean n7752GuiFasRec ;
   private boolean n7751GuiFasDto ;
   private boolean n3115FacDivCod ;
   private boolean n3096FacDivTCod ;
   private boolean n3119FacRepCod ;
   private boolean n8346FacRecI ;
   private boolean n11629MeivaId ;
   private boolean AV150ok ;
   private boolean GXv_boolean21[] ;
   private boolean n90ArtObsFac ;
   private String AV144mensajes ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private long[] aP4 ;
   private long[] aP5 ;
   private String[] aP6 ;
   private java.util.Date[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private java.util.Date[] aP12 ;
   private String[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P00302_A396EmprCod ;
   private int[] P00302_A252CliCod ;
   private boolean[] P00302_n252CliCod ;
   private String[] P00302_A3073RepCod ;
   private String[] P00303_A396EmprCod ;
   private String[] P00303_A313ContCod ;
   private int[] P00303_A316ContVal ;
   private String[] P00303_A953IvaCod ;
   private boolean[] P00303_n953IvaCod ;
   private String[] P00304_A396EmprCod ;
   private String[] P00304_A953IvaCod ;
   private boolean[] P00304_n953IvaCod ;
   private String[] P00304_A408EmprPob ;
   private boolean[] P00304_n408EmprPob ;
   private byte[] P00304_A588IvaPor ;
   private boolean[] P00304_n588IvaPor ;
   private java.math.BigDecimal[] P00304_A589IvaRec ;
   private boolean[] P00304_n589IvaRec ;
   private String[] P00305_A396EmprCod ;
   private int[] P00305_A252CliCod ;
   private boolean[] P00305_n252CliCod ;
   private byte[] P00305_A3140CliDivCod ;
   private boolean[] P00305_n3140CliDivCod ;
   private String[] P00305_A3091CliDivTra ;
   private boolean[] P00305_n3091CliDivTra ;
   private short[] P00305_A858ZonGeoCod ;
   private String[] P00305_A14240stMeivaId ;
   private boolean[] P00305_n14240stMeivaId ;
   private java.math.BigDecimal[] P00305_A2028CliImpMin ;
   private boolean[] P00305_n2028CliImpMin ;
   private java.math.BigDecimal[] P00305_A14245CliImpMnEs ;
   private java.math.BigDecimal[] P00305_A14242CliEnergia ;
   private String[] P00306_A396EmprCod ;
   private int[] P00306_A252CliCod ;
   private boolean[] P00306_n252CliCod ;
   private String[] P00306_A297CliPri ;
   private String[] P00306_A497FpgCod ;
   private java.math.BigDecimal[] P00306_A261CliDtoGrl ;
   private java.math.BigDecimal[] P00306_A262CliDtoPpg ;
   private java.math.BigDecimal[] P00306_A6630CliDto ;
   private String[] P00306_A299CliRegIVA ;
   private byte[] P00306_A280CliNroVto ;
   private String[] P00306_A296CliPrd ;
   private String[] P00306_A259CliDiaPag ;
   private String[] P00307_A396EmprCod ;
   private int[] P00307_A1243GuiRemCli ;
   private String[] P00307_A39AlbProPri ;
   private byte[] P00307_A1782AlbProEso ;
   private String[] P00307_A5140AlbMarca ;
   private java.util.Date[] P00307_A34AlbProfch ;
   private long[] P00307_A30AlbProCod ;
   private String[] P00307_A5041AlbProTBo ;
   private boolean[] P00307_n5041AlbProTBo ;
   private java.math.BigDecimal[] P00307_A5040AlbProBon ;
   private boolean[] P00307_n5040AlbProBon ;
   private byte[] P00307_A33AlbProEst ;
   private String[] P00308_A396EmprCod ;
   private long[] P00308_A30AlbProCod ;
   private byte[] P00308_A32AlbProEsp ;
   private String[] P00308_A130BarCodPar ;
   private byte[] P00308_A132BarCodReo ;
   private int[] P00308_A129BarCod ;
   private String[] P00309_A396EmprCod ;
   private long[] P00309_A30AlbProCod ;
   private java.math.BigDecimal[] P00309_A1208TubPre ;
   private boolean[] P00309_n1208TubPre ;
   private int[] P00309_A1266BarAlbTub ;
   private String[] P00309_A1207TubNom ;
   private boolean[] P00309_n1207TubNom ;
   private String[] P00309_A212BarSer ;
   private java.math.BigDecimal[] P00309_A1262BarPreKgm ;
   private java.math.BigDecimal[] P00309_A1264BarPreMtr ;
   private java.math.BigDecimal[] P00309_A12196BarPreUnd ;
   private java.math.BigDecimal[] P00309_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00309_A1263BarAlbMtrE ;
   private int[] P00309_A12195BarAlbUnd ;
   private java.math.BigDecimal[] P00309_A40AlbProRec ;
   private int[] P00309_A136BarColNum ;
   private String[] P00309_A135BarColNom ;
   private String[] P00309_A1652BarSerDsc ;
   private String[] P00309_A2010BarTipDis ;
   private short[] P00309_A1503BarPart ;
   private java.math.BigDecimal[] P00309_A2761AlbBarRec ;
   private String[] P00309_A4812BarEncCli ;
   private byte[] P00309_A218BarTipCol ;
   private String[] P00309_A1234BarNomCli ;
   private int[] P00309_A1235BarNumCli ;
   private java.math.BigDecimal[] P00309_A5354AlbImpMan ;
   private java.math.BigDecimal[] P00309_A2762AlbBarDto ;
   private boolean[] P00309_n2762AlbBarDto ;
   private short[] P00309_A217BarTipArt ;
   private boolean[] P00309_n217BarTipArt ;
   private String[] P00309_A3746BarNPed ;
   private int[] P00309_A252CliCod ;
   private boolean[] P00309_n252CliCod ;
   private short[] P00309_A4466BarAcaAnh ;
   private String[] P00309_A130BarCodPar ;
   private byte[] P00309_A132BarCodReo ;
   private int[] P00309_A129BarCod ;
   private byte[] P00309_A32AlbProEsp ;
   private String[] P00309_A143BarDisNum ;
   private short[] P00309_A1206TubCod ;
   private boolean[] P00309_n1206TubCod ;
   private short[] P00309_A6466PlasCod ;
   private boolean[] P00309_n6466PlasCod ;
   private short[] P00309_A6467BarAlbPlas ;
   private String[] P003010_A396EmprCod ;
   private long[] P003010_A30AlbProCod ;
   private int[] P003010_A129BarCod ;
   private byte[] P003010_A132BarCodReo ;
   private String[] P003010_A130BarCodPar ;
   private String[] P003010_A758ProCod ;
   private boolean[] P003010_n758ProCod ;
   private short[] P003010_A1468AlbPrdLin ;
   private String[] P003013_A396EmprCod ;
   private long[] P003013_A30AlbProCod ;
   private int[] P003013_A129BarCod ;
   private byte[] P003013_A132BarCodReo ;
   private String[] P003013_A130BarCodPar ;
   private String[] P003013_A212BarSer ;
   private String[] P003013_A460FasDsc ;
   private short[] P003013_A1503BarPart ;
   private String[] P003013_A457FasCod ;
   private String[] P003013_A4812BarEncCli ;
   private java.math.BigDecimal[] P003013_A7752GuiFasRec ;
   private boolean[] P003013_n7752GuiFasRec ;
   private java.math.BigDecimal[] P003013_A7751GuiFasDto ;
   private boolean[] P003013_n7751GuiFasDto ;
   private short[] P003013_A217BarTipArt ;
   private boolean[] P003013_n217BarTipArt ;
   private java.math.BigDecimal[] P003013_A1276FasMtr ;
   private java.math.BigDecimal[] P003013_A1275FasKgm ;
   private int[] P003013_A12193FasUnd ;
   private java.math.BigDecimal[] P003013_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P003013_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P003013_A12194FasPreUnd ;
   private short[] P003013_A1240GuiFasLin ;
   private String[] P003015_A396EmprCod ;
   private long[] P003015_A30AlbProCod ;
   private int[] P003015_A129BarCod ;
   private byte[] P003015_A132BarCodReo ;
   private String[] P003015_A130BarCodPar ;
   private String[] P003015_A212BarSer ;
   private String[] P003015_A2765AlbHdrTxt ;
   private short[] P003015_A1503BarPart ;
   private String[] P003015_A4812BarEncCli ;
   private java.math.BigDecimal[] P003015_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P003015_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P003015_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P003015_A2769AlbHdrPMt ;
   private short[] P003015_A2764AlbHdrLin ;
   private String[] P003022_A396EmprCod ;
   private String[] P003022_A65ArtCod ;
   private int[] P003022_A252CliCod ;
   private boolean[] P003022_n252CliCod ;
   private String[] P003022_A90ArtObsFac ;
   private boolean[] P003022_n90ArtObsFac ;
   private GXBaseCollection<app.SdtIncidenciasObservaciones_SDT> AV145Col_Inc_obs ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV149Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message20[] ;
   private app.SdtIncidenciasObservaciones_SDT AV146Item_Col_in_obs ;
}

final  class pfacautn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00307( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV18PALB ,
                                          long AV19UALB ,
                                          java.util.Date AV16PFecha ,
                                          java.util.Date AV17UFecha ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          String A5140AlbMarca ,
                                          String A39AlbProPri ,
                                          String AV20PRIO ,
                                          String A396EmprCod ,
                                          int AV15CliCod ,
                                          int A1243GuiRemCli ,
                                          byte A1782AlbProEso )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[7];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT EmprCod, GuiRemCli, AlbProPri, AlbProEso, AlbMarca, AlbProfch, AlbProCod, AlbProTBo, AlbProBon, AlbProEst FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and GuiRemCli = ? and AlbProEso = 1)");
      addWhere(sWhereString, "(AlbMarca <> 'A')");
      addWhere(sWhereString, "(AlbProPri = ?)");
      if ( ! (0==AV18PALB) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( ! (0==AV19UALB) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16PFecha)) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17UFecha)) )
      {
         addWhere(sWhereString, "(AlbProfch <= ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, GuiRemCli, AlbProEso, AlbProfch, AlbProCod" ;
      scmdbuf += " FOR UPDATE OF AlbProEst NOWAIT" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 5 :
                  return conditional_P00307(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00302", "SELECT EmprCod, CliCod, RepCod FROM TXPCOMREP WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00303", "SELECT T1.EmprCod, T1.ContCod, T1.ContVal, T2.IvaCod FROM (TXPEMPLIN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.ContCod = ? ORDER BY T1.EmprCod, T1.ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00304", "SELECT T1.EmprCod, T1.IvaCod, T1.EmprPob, T2.IvaPor, T2.IvaRec FROM (TXPEMPRES T1 LEFT JOIN TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod) WHERE (T1.EmprCod = ?) AND (T1.IvaCod = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00305", "SELECT EmprCod, CliCod, CliDivCod, CliDivTra, ZonGeoCod, stMeivaId, CliImpMin, CliImpMnEs, CliEnergia FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00306", "SELECT EmprCod, CliCod, CliPri, FpgCod, CliDtoGrl, CliDtoPpg, CliDto, CliRegIVA, CliNroVto, CliPrd, CliDiaPag FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00307", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00308", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbProEsp, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE (EmprCod = ? and AlbProCod = ?) AND (Not (AlbProEsp = 0) and AlbProEsp < 10) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00309", "SELECT T1.EmprCod, T1.AlbProCod, T3.TubPre, T1.BarAlbTub, T3.TubNom, T2.BarSer, T1.BarPreKgm, T1.BarPreMtr, T1.BarPreUnd, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbUnd, T1.AlbProRec, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarTipDis, T2.BarPart, T1.AlbBarRec, T2.BarEncCli, T2.BarTipCol, T2.BarNomCli, T2.BarNumCli, T1.AlbImpMan, T1.AlbBarDto, T2.BarTipArt, T2.BarNPed, T2.CliCod, T2.BarAcaAnh, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProEsp, T2.BarDisNum, T1.TubCod, T1.PlasCod, T1.BarAlbPlas FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTUBOS T3 ON T3.EmprCod = T1.EmprCod AND T3.TubCod = T1.TubCod) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T1.AlbProEsp = 0 or T1.AlbProEsp >= 10) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003010", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, ProCod, AlbPrdLin FROM TXPALBPRD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (AlbProCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003011", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacPreKgsA, FacEncCli, FacBonLi, FacTipArt, FacImpMan, FacImpMin, FacKgsA, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacProCod, FacDsc2, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P003012", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacProCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacDsc, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P003013", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T2.FasDsc, T3.BarPart, T1.FasCod, T3.BarEncCli, T1.GuiFasRec, T1.GuiFasDto, T3.BarTipArt, T1.FasMtr, T1.FasKgm, T1.FasUnd, T1.GuiFasPKg, T1.GuiFasPMt, T1.FasPreUnd, T1.GuiFasLin FROM ((TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003014", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacPreKgsA, FacEncCli, FacBonLi, FacTipArt, FacImpMan, FacImpMin, FacKgsA, FacUnds, FacPreUnd, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacDsc2, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new ForEachCursor("P003015", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarSer, T1.AlbHdrTxt, T3.BarPart, T3.BarEncCli, T1.ALbHdrMts, T1.AlbHdrKgs, T1.AlbHdrPKg, T1.AlbHdrPMt, T1.AlbHdrLin FROM ((TXPALBTXT T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003016", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P003017", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacTipPro, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P003018", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacCliCod, FacBonLi, FacImpMan, FacImpMin, FacDsc, FacRec, FacDisNum, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P003019", "UPDATE TXPCALPRD SET AlbProEst=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P003020", "INSERT INTO TXPCFAVEN(EmprCod, FacCod, FacFch, FacPri, CliCod, FacFpg, FacDtoGen, FacDtoPP, FacIVAPor, FacRECPor, FacEst, FacLiC, FacIVACod, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacSerNum, FacDivTCod, FacDivCod, FacRepCod, FacDto, FacRect, FacRecI, FacHor, FacRecIca, MeivaId, FacEnergia, FacIDATe, FacSerAT, FacTipAT, FacRegIva, FacObs, Factrm, FacFirma, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacObs2, FacMan, FacTpFra, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, MotAnuID, FacSFD, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new UpdateCursor("P003021", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new ForEachCursor("P003022", "SELECT EmprCod, ArtCod, CliCod, ArtObsFac FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 5);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,5);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[21])[0] = rslt.getString(20, 20);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 13);
               ((int[]) buf[24])[0] = rslt.getInt(23);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 20);
               ((int[]) buf[31])[0] = rslt.getInt(28);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((byte[]) buf[37])[0] = rslt.getByte(33);
               ((String[]) buf[38])[0] = rslt.getString(34, 8);
               ((short[]) buf[39])[0] = rslt.getShort(35);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(36);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(37);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,5);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,5);
               ((short[]) buf[22])[0] = rslt.getShort(20);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 1);
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               stmt.setString(19, (String)parms[18], 8);
               stmt.setString(20, (String)parms[19], 13);
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 13);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setInt(25, ((Number) parms[24]).intValue());
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 5);
               stmt.setString(27, (String)parms[26], 20);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 2);
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 2);
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 5);
               stmt.setByte(35, ((Number) parms[34]).byteValue());
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 8);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 8);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 8);
               stmt.setString(19, (String)parms[18], 20);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setString(18, (String)parms[17], 8);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 5);
               stmt.setString(21, (String)parms[20], 20);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 2);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 2);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 2);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 5);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 8);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 20);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 40);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 20);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 8);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               return;
            case 17 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               stmt.setString(6, (String)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 3);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setString(13, (String)parms[13], 3);
               stmt.setString(14, (String)parms[14], 1);
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setString(16, (String)parms[16], 5);
               stmt.setString(17, (String)parms[17], 6);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setString(19, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[25], 6);
               }
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[26], 2);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[27], 2);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[29], 2);
               }
               stmt.setDateTime(26, (java.util.Date)parms[30], false);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[31], 3);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[33], 4);
               }
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[34], 2);
               stmt.setString(30, (String)parms[35], 20);
               stmt.setString(31, (String)parms[36], 20);
               stmt.setString(32, (String)parms[37], 4);
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

