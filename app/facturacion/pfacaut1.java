package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacaut1 extends GXProcedure
{
   public pfacaut1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacaut1.class ), "" );
   }

   public pfacaut1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
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
                                     String[] aP11 )
   {
      pfacaut1.this.aP12 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
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
                        java.util.Date[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
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
                             java.util.Date[] aP12 )
   {
      pfacaut1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacaut1.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pfacaut1.this.AV16PFecha = aP2[0];
      this.aP2 = aP2;
      pfacaut1.this.AV17UFecha = aP3[0];
      this.aP3 = aP3;
      pfacaut1.this.AV18PALB = aP4[0];
      this.aP4 = aP4;
      pfacaut1.this.AV19UALB = aP5[0];
      this.aP5 = aP5;
      pfacaut1.this.AV20PRIO = aP6[0];
      this.aP6 = aP6;
      pfacaut1.this.AV21FacFch = aP7[0];
      this.aP7 = aP7;
      pfacaut1.this.AV22FacSerNum = aP8[0];
      this.aP8 = aP8;
      pfacaut1.this.AV75CliFac = aP9[0];
      this.aP9 = aP9;
      pfacaut1.this.AV107TipProd = aP10[0];
      this.aP10 = aP10;
      pfacaut1.this.AV115TipAlb = aP11[0];
      this.aP11 = aP11;
      pfacaut1.this.AV119FacHor = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV73FlagPil ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PILTEX", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV73FlagPil = GXt_int1 ;
      GXt_int1 = AV110Tas ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TAS", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV110Tas = GXt_int1 ;
      GXt_int1 = AV112Erfoc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV112Erfoc = GXt_int1 ;
      GXv_int2[0] = AV74FlagSal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int2) ;
      pfacaut1.this.AV74FlagSal = GXv_int2[0] ;
      GXv_int2[0] = AV108PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int2) ;
      pfacaut1.this.AV108PLinea = GXv_int2[0] ;
      GXv_int2[0] = AV78FlagTint ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTBO", ""), GXv_int2) ;
      pfacaut1.this.AV78FlagTint = GXv_int2[0] ;
      GXv_int2[0] = AV81FlagDsc ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACDSC", ""), GXv_int2) ;
      pfacaut1.this.AV81FlagDsc = GXv_int2[0] ;
      GXv_int2[0] = AV82FlagHSS ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int2) ;
      pfacaut1.this.AV82FlagHSS = GXv_int2[0] ;
      GXv_int2[0] = AV84FlagFacPro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FACPRO", ""), GXv_int2) ;
      pfacaut1.this.AV84FlagFacPro = GXv_int2[0] ;
      GXv_int2[0] = AV86Guasch ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GUASCH", ""), GXv_int2) ;
      pfacaut1.this.AV86Guasch = GXv_int2[0] ;
      GXv_int2[0] = AV94Texknit ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int2) ;
      pfacaut1.this.AV94Texknit = GXv_int2[0] ;
      GXv_int2[0] = AV103Martex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int2) ;
      pfacaut1.this.AV103Martex = GXv_int2[0] ;
      GXt_int1 = AV95Flag_af ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FAAUT1", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV95Flag_af = GXt_int1 ;
      GXv_int2[0] = AV96FlagBonAlb ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BONALB", ""), GXv_int2) ;
      pfacaut1.this.AV96FlagBonAlb = GXv_int2[0] ;
      GXv_int2[0] = AV100FlagRieClF ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RIECLF", ""), GXv_int2) ;
      pfacaut1.this.AV100FlagRieClF = GXv_int2[0] ;
      GXv_int2[0] = AV104Hidro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HIDRO", ""), GXv_int2) ;
      pfacaut1.this.AV104Hidro = GXv_int2[0] ;
      GXv_int2[0] = AV109FlagPorRec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PORREC", ""), GXv_int2) ;
      pfacaut1.this.AV109FlagPorRec = GXv_int2[0] ;
      GXt_int1 = AV114Itram ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV114Itram = GXt_int1 ;
      GXt_int1 = AV116Magosa ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGOSA", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV116Magosa = GXt_int1 ;
      GXt_int1 = AV118Mafitex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAFITE", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV118Mafitex = GXt_int1 ;
      GXt_int1 = AV121Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV121Tinamar = GXt_int1 ;
      GXt_int1 = AV123Torient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      pfacaut1.this.GXt_int1 = GXv_int2[0] ;
      AV123Torient = GXt_int1 ;
      AV25ContCod = "040100" ;
      if ( GXutil.strcmp(AV20PRIO, "1") == 0 )
      {
         AV25ContCod = "040200" ;
      }
      /* Using cursor P002Z2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV25ContCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A313ContCod = P002Z2_A313ContCod[0] ;
         A316ContVal = P002Z2_A316ContVal[0] ;
         AV23NumFac = A316ContVal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P002Z3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV75CliFac)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P002Z3_A252CliCod[0] ;
         n252CliCod = P002Z3_n252CliCod[0] ;
         A3073RepCod = P002Z3_A3073RepCod[0] ;
         AV83RepCod = A3073RepCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P002Z4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV75CliFac)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P002Z4_A252CliCod[0] ;
         n252CliCod = P002Z4_n252CliCod[0] ;
         A3140CliDivCod = P002Z4_A3140CliDivCod[0] ;
         n3140CliDivCod = P002Z4_n3140CliDivCod[0] ;
         A3091CliDivTra = P002Z4_A3091CliDivTra[0] ;
         n3091CliDivTra = P002Z4_n3091CliDivTra[0] ;
         A858ZonGeoCod = P002Z4_A858ZonGeoCod[0] ;
         A14240stMeivaId = P002Z4_A14240stMeivaId[0] ;
         n14240stMeivaId = P002Z4_n14240stMeivaId[0] ;
         A2028CliImpMin = P002Z4_A2028CliImpMin[0] ;
         n2028CliImpMin = P002Z4_n2028CliImpMin[0] ;
         A14245CliImpMnEs = P002Z4_A14245CliImpMnEs[0] ;
         A14242CliEnergia = P002Z4_A14242CliEnergia[0] ;
         AV76FacDivCod = A3140CliDivCod ;
         AV77FacDivTCod = A3091CliDivTra ;
         AV79Extranjero = httpContext.getMessage( "N", "") ;
         if ( ( A858ZonGeoCod == 999 ) || ( A858ZonGeoCod == 998 ) )
         {
            AV79Extranjero = httpContext.getMessage( "S", "") ;
         }
         AV124stMeivaId = A14240stMeivaId ;
         AV106CliImpMin = A2028CliImpMin ;
         AV125CliImpMnEst = A14245CliImpMnEs ;
         AV126CliEnergia = A14242CliEnergia ;
         /* Using cursor P002Z5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV20PRIO});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A297CliPri = P002Z5_A297CliPri[0] ;
            A497FpgCod = P002Z5_A497FpgCod[0] ;
            A261CliDtoGrl = P002Z5_A261CliDtoGrl[0] ;
            A262CliDtoPpg = P002Z5_A262CliDtoPpg[0] ;
            A6630CliDto = P002Z5_A6630CliDto[0] ;
            A299CliRegIVA = P002Z5_A299CliRegIVA[0] ;
            A280CliNroVto = P002Z5_A280CliNroVto[0] ;
            A296CliPrd = P002Z5_A296CliPrd[0] ;
            A259CliDiaPag = P002Z5_A259CliDiaPag[0] ;
            AV26CodFpg = A497FpgCod ;
            AV27DtoGen = A261CliDtoGrl ;
            AV28DtoPP = A262CliDtoPpg ;
            AV113Clidto = A6630CliDto ;
            AV29RegIVA = A299CliRegIVA ;
            AV30CliNroVto = A280CliNroVto ;
            AV31CliPrd = A296CliPrd ;
            AV32CliDiaPag = A259CliDiaPag ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( ( GXutil.strcmp(AV115TipAlb, "1") == 0 ) || (GXutil.strcmp("", AV115TipAlb)==0) )
      {
         /* Using cursor P002Z6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(AV18PALB), A396EmprCod, Long.valueOf(AV18PALB), AV16PFecha, AV17UFecha, AV107TipProd, Byte.valueOf(AV94Texknit), Integer.valueOf(AV15CliCod), AV20PRIO, Long.valueOf(AV19UALB)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            brk2Z6 = false ;
            A5140AlbMarca = P002Z6_A5140AlbMarca[0] ;
            A1782AlbProEso = P002Z6_A1782AlbProEso[0] ;
            A2242AlbSec = P002Z6_A2242AlbSec[0] ;
            A39AlbProPri = P002Z6_A39AlbProPri[0] ;
            A34AlbProfch = P002Z6_A34AlbProfch[0] ;
            A30AlbProCod = P002Z6_A30AlbProCod[0] ;
            A1243GuiRemCli = P002Z6_A1243GuiRemCli[0] ;
            A5041AlbProTBo = P002Z6_A5041AlbProTBo[0] ;
            n5041AlbProTBo = P002Z6_n5041AlbProTBo[0] ;
            A5040AlbProBon = P002Z6_A5040AlbProBon[0] ;
            n5040AlbProBon = P002Z6_n5040AlbProBon[0] ;
            A33AlbProEst = P002Z6_A33AlbProEst[0] ;
            if ( (( GXutil.resetTime(A34AlbProfch).after( GXutil.resetTime( AV16PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV16PFecha)) )) && (( GXutil.resetTime(A34AlbProfch).before( GXutil.resetTime( AV17UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV17UFecha)) )) )
            {
               if ( ( GXutil.strcmp(A2242AlbSec, AV107TipProd) == 0 ) || ( AV94Texknit == 0 ) )
               {
                  if ( GXutil.strcmp(A5140AlbMarca, "A") != 0 )
                  {
                     if ( A1243GuiRemCli == AV15CliCod )
                     {
                        if ( GXutil.strcmp(A39AlbProPri, AV20PRIO) == 0 )
                        {
                           /* Using cursor P002Z7 */
                           pr_default.execute(5, new Object[] {A396EmprCod});
                           A953IvaCod = P002Z7_A953IvaCod[0] ;
                           n953IvaCod = P002Z7_n953IvaCod[0] ;
                           pr_default.close(5);
                           /* Using cursor P002Z8 */
                           pr_default.execute(6, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
                           A588IvaPor = P002Z8_A588IvaPor[0] ;
                           n588IvaPor = P002Z8_n588IvaPor[0] ;
                           A589IvaRec = P002Z8_A589IvaRec[0] ;
                           n589IvaRec = P002Z8_n589IvaRec[0] ;
                           pr_default.close(6);
                           while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P002Z6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P002Z6_A1782AlbProEso[0] == A1782AlbProEso ) )
                           {
                              brk2Z6 = false ;
                              A5140AlbMarca = P002Z6_A5140AlbMarca[0] ;
                              A2242AlbSec = P002Z6_A2242AlbSec[0] ;
                              A39AlbProPri = P002Z6_A39AlbProPri[0] ;
                              A34AlbProfch = P002Z6_A34AlbProfch[0] ;
                              A30AlbProCod = P002Z6_A30AlbProCod[0] ;
                              A1243GuiRemCli = P002Z6_A1243GuiRemCli[0] ;
                              A5041AlbProTBo = P002Z6_A5041AlbProTBo[0] ;
                              n5041AlbProTBo = P002Z6_n5041AlbProTBo[0] ;
                              A5040AlbProBon = P002Z6_A5040AlbProBon[0] ;
                              n5040AlbProBon = P002Z6_n5040AlbProBon[0] ;
                              A33AlbProEst = P002Z6_A33AlbProEst[0] ;
                              if ( A30AlbProCod <= AV19UALB )
                              {
                                 if ( A30AlbProCod >= AV18PALB )
                                 {
                                    if ( A1782AlbProEso == 1 )
                                    {
                                       /* Using cursor P002Z7 */
                                       pr_default.execute(5, new Object[] {A396EmprCod});
                                       A953IvaCod = P002Z7_A953IvaCod[0] ;
                                       n953IvaCod = P002Z7_n953IvaCod[0] ;
                                       /* Using cursor P002Z8 */
                                       pr_default.execute(6, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
                                       A588IvaPor = P002Z8_A588IvaPor[0] ;
                                       n588IvaPor = P002Z8_n588IvaPor[0] ;
                                       A589IvaRec = P002Z8_A589IvaRec[0] ;
                                       n589IvaRec = P002Z8_n589IvaRec[0] ;
                                       if ( (( GXutil.resetTime(A34AlbProfch).after( GXutil.resetTime( AV16PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV16PFecha)) )) && (( GXutil.resetTime(A34AlbProfch).before( GXutil.resetTime( AV17UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A34AlbProfch), GXutil.resetTime(AV17UFecha)) )) )
                                       {
                                          if ( ( GXutil.strcmp(A2242AlbSec, AV107TipProd) == 0 ) || ( AV94Texknit == 0 ) )
                                          {
                                             if ( GXutil.strcmp(A5140AlbMarca, "A") != 0 )
                                             {
                                                if ( A1243GuiRemCli == AV15CliCod )
                                                {
                                                   if ( GXutil.strcmp(A39AlbProPri, AV20PRIO) == 0 )
                                                   {
                                                      AV23NumFac = (int)(AV23NumFac+1) ;
                                                      AV24NumLin = 0 ;
                                                      AV99BonToP = GXutil.substring( A5041AlbProTBo, 2, 1) ;
                                                      AV101AlbProBon = A5040AlbProBon ;
                                                      AV102TotAlb = (short)(0) ;
                                                      AV72Flag1 = (byte)(0) ;
                                                      /* Using cursor P002Z9 */
                                                      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                                                      while ( (pr_default.getStatus(7) != 101) )
                                                      {
                                                         A32AlbProEsp = P002Z9_A32AlbProEsp[0] ;
                                                         A130BarCodPar = P002Z9_A130BarCodPar[0] ;
                                                         A132BarCodReo = P002Z9_A132BarCodReo[0] ;
                                                         A129BarCod = P002Z9_A129BarCod[0] ;
                                                         AV72Flag1 = (byte)(1) ;
                                                         /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                         if (true) break;
                                                         pr_default.readNext(7);
                                                      }
                                                      pr_default.close(7);
                                                      if ( (0==AV72Flag1) )
                                                      {
                                                         /* Using cursor P002Z10 */
                                                         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                                                         while ( (pr_default.getStatus(8) != 101) )
                                                         {
                                                            A1208TubPre = P002Z10_A1208TubPre[0] ;
                                                            n1208TubPre = P002Z10_n1208TubPre[0] ;
                                                            A1266BarAlbTub = P002Z10_A1266BarAlbTub[0] ;
                                                            A1207TubNom = P002Z10_A1207TubNom[0] ;
                                                            n1207TubNom = P002Z10_n1207TubNom[0] ;
                                                            A1458BarAlbBul = P002Z10_A1458BarAlbBul[0] ;
                                                            A2762AlbBarDto = P002Z10_A2762AlbBarDto[0] ;
                                                            n2762AlbBarDto = P002Z10_n2762AlbBarDto[0] ;
                                                            A212BarSer = P002Z10_A212BarSer[0] ;
                                                            A1262BarPreKgm = P002Z10_A1262BarPreKgm[0] ;
                                                            A1264BarPreMtr = P002Z10_A1264BarPreMtr[0] ;
                                                            A12196BarPreUnd = P002Z10_A12196BarPreUnd[0] ;
                                                            A1261BarAlbKgmE = P002Z10_A1261BarAlbKgmE[0] ;
                                                            A1263BarAlbMtrE = P002Z10_A1263BarAlbMtrE[0] ;
                                                            A12195BarAlbUnd = P002Z10_A12195BarAlbUnd[0] ;
                                                            A40AlbProRec = P002Z10_A40AlbProRec[0] ;
                                                            A1652BarSerDsc = P002Z10_A1652BarSerDsc[0] ;
                                                            A135BarColNom = P002Z10_A135BarColNom[0] ;
                                                            A136BarColNum = P002Z10_A136BarColNum[0] ;
                                                            A2010BarTipDis = P002Z10_A2010BarTipDis[0] ;
                                                            A1503BarPart = P002Z10_A1503BarPart[0] ;
                                                            A2761AlbBarRec = P002Z10_A2761AlbBarRec[0] ;
                                                            A4812BarEncCli = P002Z10_A4812BarEncCli[0] ;
                                                            A218BarTipCol = P002Z10_A218BarTipCol[0] ;
                                                            A1234BarNomCli = P002Z10_A1234BarNomCli[0] ;
                                                            A1235BarNumCli = P002Z10_A1235BarNumCli[0] ;
                                                            A5354AlbImpMan = P002Z10_A5354AlbImpMan[0] ;
                                                            A217BarTipArt = P002Z10_A217BarTipArt[0] ;
                                                            n217BarTipArt = P002Z10_n217BarTipArt[0] ;
                                                            A252CliCod = P002Z10_A252CliCod[0] ;
                                                            n252CliCod = P002Z10_n252CliCod[0] ;
                                                            A4466BarAcaAnh = P002Z10_A4466BarAcaAnh[0] ;
                                                            A130BarCodPar = P002Z10_A130BarCodPar[0] ;
                                                            A132BarCodReo = P002Z10_A132BarCodReo[0] ;
                                                            A129BarCod = P002Z10_A129BarCod[0] ;
                                                            A32AlbProEsp = P002Z10_A32AlbProEsp[0] ;
                                                            A143BarDisNum = P002Z10_A143BarDisNum[0] ;
                                                            A1206TubCod = P002Z10_A1206TubCod[0] ;
                                                            n1206TubCod = P002Z10_n1206TubCod[0] ;
                                                            A6466PlasCod = P002Z10_A6466PlasCod[0] ;
                                                            n6466PlasCod = P002Z10_n6466PlasCod[0] ;
                                                            A6467BarAlbPlas = P002Z10_A6467BarAlbPlas[0] ;
                                                            A212BarSer = P002Z10_A212BarSer[0] ;
                                                            A1652BarSerDsc = P002Z10_A1652BarSerDsc[0] ;
                                                            A135BarColNom = P002Z10_A135BarColNom[0] ;
                                                            A136BarColNum = P002Z10_A136BarColNum[0] ;
                                                            A2010BarTipDis = P002Z10_A2010BarTipDis[0] ;
                                                            A1503BarPart = P002Z10_A1503BarPart[0] ;
                                                            A4812BarEncCli = P002Z10_A4812BarEncCli[0] ;
                                                            A218BarTipCol = P002Z10_A218BarTipCol[0] ;
                                                            A1234BarNomCli = P002Z10_A1234BarNomCli[0] ;
                                                            A1235BarNumCli = P002Z10_A1235BarNumCli[0] ;
                                                            A217BarTipArt = P002Z10_A217BarTipArt[0] ;
                                                            n217BarTipArt = P002Z10_n217BarTipArt[0] ;
                                                            A252CliCod = P002Z10_A252CliCod[0] ;
                                                            n252CliCod = P002Z10_n252CliCod[0] ;
                                                            A4466BarAcaAnh = P002Z10_A4466BarAcaAnh[0] ;
                                                            A143BarDisNum = P002Z10_A143BarDisNum[0] ;
                                                            A1208TubPre = P002Z10_A1208TubPre[0] ;
                                                            n1208TubPre = P002Z10_n1208TubPre[0] ;
                                                            A1207TubNom = P002Z10_A1207TubNom[0] ;
                                                            n1207TubNom = P002Z10_n1207TubNom[0] ;
                                                            if ( AV95Flag_af == 1 )
                                                            {
                                                               AV23NumFac = (int)(A30AlbProCod) ;
                                                            }
                                                            AV39BarSer = A212BarSer ;
                                                            AV40BarDisNum = A143BarDisNum ;
                                                            AV88AlbProCod = A30AlbProCod ;
                                                            AV89BarCod = A129BarCod ;
                                                            AV90BarCodReo = A132BarCodReo ;
                                                            AV91BarCodPar = A130BarCodPar ;
                                                            AV24NumLin = (int)(AV24NumLin+1) ;
                                                            /* Using cursor P002Z11 */
                                                            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                                                            while ( (pr_default.getStatus(9) != 101) )
                                                            {
                                                               A758ProCod = P002Z11_A758ProCod[0] ;
                                                               n758ProCod = P002Z11_n758ProCod[0] ;
                                                               A1468AlbPrdLin = P002Z11_A1468AlbPrdLin[0] ;
                                                               AV120Procod = A758ProCod ;
                                                               /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                                               if (true) break;
                                                               pr_default.readNext(9);
                                                            }
                                                            pr_default.close(9);
                                                            /* Execute user subroutine: 'OBSFAC' */
                                                            S111 ();
                                                            if ( returnInSub )
                                                            {
                                                               pr_default.close(8);
                                                               pr_default.close(8);
                                                               pr_default.close(8);
                                                               pr_default.close(6);
                                                               pr_default.close(5);
                                                               pr_default.close(4);
                                                               returnInSub = true;
                                                               cleanup();
                                                               if (true) return;
                                                            }
                                                            if ( ! (GXutil.strcmp("", AV38ArtObsFac)==0) )
                                                            {
                                                               GXv_char3[0] = A396EmprCod ;
                                                               GXv_int4[0] = A30AlbProCod ;
                                                               GXv_int5[0] = A129BarCod ;
                                                               GXv_int2[0] = A132BarCodReo ;
                                                               GXv_char6[0] = A130BarCodPar ;
                                                               GXv_int7[0] = AV23NumFac ;
                                                               GXv_int8[0] = AV24NumLin ;
                                                               GXv_char9[0] = AV38ArtObsFac ;
                                                               GXv_int10[0] = AV74FlagSal ;
                                                               GXv_int11[0] = AV102TotAlb ;
                                                               GXv_int12[0] = AV75CliFac ;
                                                               new app.facturacion.pfacau11(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_int2, GXv_char6, GXv_int7, GXv_int8, GXv_char9, GXv_int10, GXv_int11, GXv_int12) ;
                                                               pfacaut1.this.A396EmprCod = GXv_char3[0] ;
                                                               pfacaut1.this.A30AlbProCod = GXv_int4[0] ;
                                                               pfacaut1.this.A129BarCod = GXv_int5[0] ;
                                                               pfacaut1.this.A132BarCodReo = GXv_int2[0] ;
                                                               pfacaut1.this.A130BarCodPar = GXv_char6[0] ;
                                                               pfacaut1.this.AV23NumFac = GXv_int7[0] ;
                                                               pfacaut1.this.AV24NumLin = GXv_int8[0] ;
                                                               pfacaut1.this.AV38ArtObsFac = GXv_char9[0] ;
                                                               pfacaut1.this.AV74FlagSal = GXv_int10[0] ;
                                                               pfacaut1.this.AV102TotAlb = GXv_int11[0] ;
                                                               pfacaut1.this.AV75CliFac = GXv_int12[0] ;
                                                            }
                                                            AV41LenSer = (byte)(GXutil.len( A212BarSer)) ;
                                                            AV42LenColNom = (byte)(GXutil.len( A135BarColNom)) ;
                                                            if ( AV78FlagTint == 1 )
                                                            {
                                                               AV80FacDsc = httpContext.getMessage( "TENYIR", "") ;
                                                               if ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "A", "")) == 0 )
                                                               {
                                                                  AV80FacDsc = " " ;
                                                               }
                                                            }
                                                            if ( AV84FlagFacPro == 1 )
                                                            {
                                                               AV24NumLin = (int)(AV24NumLin-1) ;
                                                               /* Execute user subroutine: 'PROCESO' */
                                                               S121 ();
                                                               if ( returnInSub )
                                                               {
                                                                  pr_default.close(8);
                                                                  pr_default.close(8);
                                                                  pr_default.close(8);
                                                                  pr_default.close(6);
                                                                  pr_default.close(5);
                                                                  pr_default.close(4);
                                                                  returnInSub = true;
                                                                  cleanup();
                                                                  if (true) return;
                                                               }
                                                            }
                                                            else
                                                            {
                                                               /*
                                                                  INSERT RECORD ON TABLE TXPLFAVEN

                                                               */
                                                               A430FacCod = AV23NumFac ;
                                                               A446FacLin = AV24NumLin ;
                                                               A427FacAlbCod = A30AlbProCod ;
                                                               A1294FacBarCod = A129BarCod ;
                                                               A1295FacBarReo = A132BarCodReo ;
                                                               A1296FacBarPar = A130BarCodPar ;
                                                               A428FacAlbTip = (byte)(1) ;
                                                               A454FacSer = A212BarSer ;
                                                               A448FacPreKgs = ((AV123Torient==0) ? A1262BarPreKgm : GXutil.roundDecimal( A1262BarPreKgm, 2)) ;
                                                               A449FacPreMts = ((AV123Torient==0) ? A1264BarPreMtr : GXutil.roundDecimal( A1264BarPreMtr, 2)) ;
                                                               A12198FacPreUnd = A12196BarPreUnd ;
                                                               A444FacKgs = A1261BarAlbKgmE ;
                                                               A447FacMts = A1263BarAlbMtrE ;
                                                               A12197FacUnds = A12195BarAlbUnd ;
                                                               A451FacRec = A40AlbProRec ;
                                                               if ( AV81FlagDsc == 1 )
                                                               {
                                                                  AV41LenSer = (byte)(GXutil.len( A1652BarSerDsc)) ;
                                                                  A432FacDsc = GXutil.substring( A1652BarSerDsc, 1, AV41LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV42LenColNom) ;
                                                                  if ( ! (0==A136BarColNum) )
                                                                  {
                                                                     A432FacDsc = GXutil.substring( A1652BarSerDsc, 1, AV41LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV42LenColNom) + "-" + GXutil.str( A136BarColNum, 6, 0) ;
                                                                  }
                                                               }
                                                               else
                                                               {
                                                                  if ( AV78FlagTint == 1 )
                                                                  {
                                                                     A432FacDsc = AV80FacDsc ;
                                                                  }
                                                                  else
                                                                  {
                                                                     A432FacDsc = GXutil.substring( A212BarSer, 1, AV41LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV42LenColNom) ;
                                                                     if ( ! (0==A136BarColNum) )
                                                                     {
                                                                        A432FacDsc = GXutil.substring( A212BarSer, 1, AV41LenSer) + " / " + GXutil.substring( A135BarColNom, 1, AV42LenColNom) + "-" + GXutil.str( A136BarColNum, 6, 0) ;
                                                                     }
                                                                  }
                                                               }
                                                               A1498FacDisNum = AV40BarDisNum ;
                                                               A3097FacTipPro = A2010BarTipDis ;
                                                               A3303FacNPart = A1503BarPart ;
                                                               A3397FacFasCod = " " ;
                                                               if ( ( AV104Hidro == 1 ) || ( AV109FlagPorRec == 1 ) )
                                                               {
                                                                  A3897FacKgsA = A2761AlbBarRec ;
                                                               }
                                                               A4814FacEncCli = A4812BarEncCli ;
                                                               A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                                               A3878FacColNom = A135BarColNom ;
                                                               A3879FocColNum = A136BarColNum ;
                                                               A3880FacTipColC = A218BarTipCol ;
                                                               A3881FacNomCol = A1234BarNomCli ;
                                                               A3882FacNumCol = A1235BarNumCli ;
                                                               A5353FacImpMan = A5354AlbImpMan ;
                                                               if ( AV121Tinamar == 1 )
                                                               {
                                                                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                                               }
                                                               else
                                                               {
                                                                  A5355FacImpMin = ((0==AV114Itram) ? AV106CliImpMin : ((GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "E", ""))!=0) ? AV106CliImpMin : AV125CliImpMnEst)) ;
                                                               }
                                                               A3883FacCliCod = AV75CliFac ;
                                                               A5189FacTipArt = A217BarTipArt ;
                                                               A3884FacProCod = AV120Procod ;
                                                               GXv_char9[0] = A396EmprCod ;
                                                               GXv_int12[0] = A252CliCod ;
                                                               GXv_char6[0] = A212BarSer ;
                                                               GXv_char3[0] = A135BarColNom ;
                                                               GXv_int8[0] = A136BarColNum ;
                                                               GXv_int10[0] = A218BarTipCol ;
                                                               GXv_int2[0] = AV122intcod ;
                                                               GXv_char13[0] = "" ;
                                                               new app.pbusin3(remoteHandle, context).execute( GXv_char9, GXv_int12, GXv_char6, GXv_char3, GXv_int8, GXv_int10, GXv_int2, GXv_char13) ;
                                                               pfacaut1.this.A396EmprCod = GXv_char9[0] ;
                                                               pfacaut1.this.A252CliCod = GXv_int12[0] ;
                                                               pfacaut1.this.A212BarSer = GXv_char6[0] ;
                                                               pfacaut1.this.A135BarColNom = GXv_char3[0] ;
                                                               pfacaut1.this.A136BarColNum = GXv_int8[0] ;
                                                               pfacaut1.this.A218BarTipCol = GXv_int10[0] ;
                                                               pfacaut1.this.AV122intcod = GXv_int2[0] ;
                                                               A12693FacInt = AV122intcod ;
                                                               A12906FacCadEnc = A4466BarAcaAnh ;
                                                               /* Using cursor P002Z12 */
                                                               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, A3097FacTipPro, Short.valueOf(A3303FacNPart), A3397FacFasCod, A3878FacColNom, Integer.valueOf(A3879FocColNum), Byte.valueOf(A3880FacTipColC), A3881FacNomCol, Integer.valueOf(A3882FacNumCol), Integer.valueOf(A3883FacCliCod), A3884FacProCod, A4814FacEncCli, A5050FacBonLi, Short.valueOf(A5189FacTipArt), A5353FacImpMan, A5355FacImpMin, A3897FacKgsA, Integer.valueOf(A12197FacUnds), A12198FacPreUnd, Byte.valueOf(A12693FacInt), Short.valueOf(A12906FacCadEnc)});
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
                                                               GXt_decimal14 = DecimalUtil.doubleToDec(AV102TotAlb) ;
                                                               GXv_char13[0] = A396EmprCod ;
                                                               GXv_int12[0] = AV23NumFac ;
                                                               GXv_int8[0] = AV24NumLin ;
                                                               GXv_decimal15[0] = GXt_decimal14 ;
                                                               new app.pfacimli(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int8, GXv_decimal15) ;
                                                               pfacaut1.this.A396EmprCod = GXv_char13[0] ;
                                                               pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                               pfacaut1.this.AV24NumLin = GXv_int8[0] ;
                                                               pfacaut1.this.GXt_decimal14 = GXv_decimal15[0] ;
                                                               AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal14)))) ;
                                                               if ( ( AV96FlagBonAlb == 1 ) && ( GXutil.strcmp(AV99BonToP, httpContext.getMessage( "P", "")) == 0 ) && ( A2762AlbBarDto.doubleValue() != 0 ) )
                                                               {
                                                                  AV24NumLin = (int)(AV24NumLin+1) ;
                                                                  /*
                                                                     INSERT RECORD ON TABLE TXPLFAVEN

                                                                  */
                                                                  A430FacCod = AV23NumFac ;
                                                                  A446FacLin = AV24NumLin ;
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
                                                                  A1498FacDisNum = AV40BarDisNum ;
                                                                  A3303FacNPart = A1503BarPart ;
                                                                  A3397FacFasCod = httpContext.getMessage( "BONIFPAR", "") ;
                                                                  A4814FacEncCli = A4812BarEncCli ;
                                                                  A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                                                  A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                                                  A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                                                  A3883FacCliCod = AV75CliFac ;
                                                                  /* Using cursor P002Z13 */
                                                                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                                                                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                                                  if ( (pr_default.getStatus(11) == 1) )
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
                                                                  GXt_decimal14 = DecimalUtil.doubleToDec(AV102TotAlb) ;
                                                                  GXv_char13[0] = A396EmprCod ;
                                                                  GXv_int12[0] = AV23NumFac ;
                                                                  GXv_int8[0] = AV24NumLin ;
                                                                  GXv_decimal15[0] = GXt_decimal14 ;
                                                                  new app.pfacimli(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int8, GXv_decimal15) ;
                                                                  pfacaut1.this.A396EmprCod = GXv_char13[0] ;
                                                                  pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                                  pfacaut1.this.AV24NumLin = GXv_int8[0] ;
                                                                  pfacaut1.this.GXt_decimal14 = GXv_decimal15[0] ;
                                                                  AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal14)))) ;
                                                               }
                                                            }
                                                            if ( ( AV112Erfoc == 0 ) && ( AV118Mafitex == 0 ) )
                                                            {
                                                               GXv_char13[0] = A396EmprCod ;
                                                               GXv_int4[0] = A30AlbProCod ;
                                                               GXv_int12[0] = A129BarCod ;
                                                               GXv_int10[0] = A132BarCodReo ;
                                                               GXv_char9[0] = A130BarCodPar ;
                                                               GXv_int8[0] = AV23NumFac ;
                                                               GXv_int7[0] = AV24NumLin ;
                                                               GXv_char6[0] = AV38ArtObsFac ;
                                                               GXv_int2[0] = AV74FlagSal ;
                                                               GXv_int11[0] = AV102TotAlb ;
                                                               GXv_int5[0] = AV75CliFac ;
                                                               new app.facturacion.pfacau12(remoteHandle, context).execute( GXv_char13, GXv_int4, GXv_int12, GXv_int10, GXv_char9, GXv_int8, GXv_int7, GXv_char6, GXv_int2, GXv_int11, GXv_int5) ;
                                                               pfacaut1.this.A396EmprCod = GXv_char13[0] ;
                                                               pfacaut1.this.A30AlbProCod = GXv_int4[0] ;
                                                               pfacaut1.this.A129BarCod = GXv_int12[0] ;
                                                               pfacaut1.this.A132BarCodReo = GXv_int10[0] ;
                                                               pfacaut1.this.A130BarCodPar = GXv_char9[0] ;
                                                               pfacaut1.this.AV23NumFac = GXv_int8[0] ;
                                                               pfacaut1.this.AV24NumLin = GXv_int7[0] ;
                                                               pfacaut1.this.AV38ArtObsFac = GXv_char6[0] ;
                                                               pfacaut1.this.AV74FlagSal = GXv_int2[0] ;
                                                               pfacaut1.this.AV102TotAlb = GXv_int11[0] ;
                                                               pfacaut1.this.AV75CliFac = GXv_int5[0] ;
                                                            }
                                                            if ( (0==AV84FlagFacPro) )
                                                            {
                                                               /* Execute user subroutine: 'PROCESO' */
                                                               S121 ();
                                                               if ( returnInSub )
                                                               {
                                                                  pr_default.close(8);
                                                                  pr_default.close(8);
                                                                  pr_default.close(8);
                                                                  pr_default.close(6);
                                                                  pr_default.close(5);
                                                                  pr_default.close(4);
                                                                  returnInSub = true;
                                                                  cleanup();
                                                                  if (true) return;
                                                               }
                                                            }
                                                            if ( ! (0==A1266BarAlbTub) && ! (0==A1206TubCod) )
                                                            {
                                                               AV24NumLin = (int)(AV24NumLin+1) ;
                                                               /*
                                                                  INSERT RECORD ON TABLE TXPLFAVEN

                                                               */
                                                               A430FacCod = AV23NumFac ;
                                                               A446FacLin = AV24NumLin ;
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
                                                               A1498FacDisNum = AV40BarDisNum ;
                                                               if ( ( AV74FlagSal == 1 ) || ( AV108PLinea == 1 ) )
                                                               {
                                                                  A1498FacDisNum = GXutil.str( A1458BarAlbBul, 4, 0) ;
                                                               }
                                                               A3303FacNPart = A1503BarPart ;
                                                               A4814FacEncCli = A4812BarEncCli ;
                                                               A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                                               A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                                               A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                                               A3883FacCliCod = AV75CliFac ;
                                                               A3397FacFasCod = " " ;
                                                               /* Using cursor P002Z14 */
                                                               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A451FacRec, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A1498FacDisNum, Short.valueOf(A3303FacNPart), A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A4814FacEncCli, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
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
                                                               GXt_decimal14 = DecimalUtil.doubleToDec(AV102TotAlb) ;
                                                               GXv_char13[0] = A396EmprCod ;
                                                               GXv_int12[0] = AV23NumFac ;
                                                               GXv_int8[0] = AV24NumLin ;
                                                               GXv_decimal15[0] = GXt_decimal14 ;
                                                               new app.pfacimli(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int8, GXv_decimal15) ;
                                                               pfacaut1.this.A396EmprCod = GXv_char13[0] ;
                                                               pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                               pfacaut1.this.AV24NumLin = GXv_int8[0] ;
                                                               pfacaut1.this.GXt_decimal14 = GXv_decimal15[0] ;
                                                               AV102TotAlb = (short)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV102TotAlb).add((GXt_decimal14)))) ;
                                                            }
                                                            if ( ! (0==A6467BarAlbPlas) && ! (0==A6466PlasCod) )
                                                            {
                                                               GXv_char13[0] = A396EmprCod ;
                                                               GXv_int4[0] = A30AlbProCod ;
                                                               GXv_int12[0] = A129BarCod ;
                                                               GXv_int10[0] = A132BarCodReo ;
                                                               GXv_char9[0] = A130BarCodPar ;
                                                               GXv_int8[0] = AV23NumFac ;
                                                               GXv_int7[0] = AV24NumLin ;
                                                               GXv_char6[0] = " " ;
                                                               GXv_int2[0] = AV74FlagSal ;
                                                               GXv_int11[0] = AV102TotAlb ;
                                                               GXv_int5[0] = AV75CliFac ;
                                                               new app.facturacion.pfacau15(remoteHandle, context).execute( GXv_char13, GXv_int4, GXv_int12, GXv_int10, GXv_char9, GXv_int8, GXv_int7, GXv_char6, GXv_int2, GXv_int11, GXv_int5) ;
                                                               pfacaut1.this.A396EmprCod = GXv_char13[0] ;
                                                               pfacaut1.this.A30AlbProCod = GXv_int4[0] ;
                                                               pfacaut1.this.A129BarCod = GXv_int12[0] ;
                                                               pfacaut1.this.A132BarCodReo = GXv_int10[0] ;
                                                               pfacaut1.this.A130BarCodPar = GXv_char9[0] ;
                                                               pfacaut1.this.AV23NumFac = GXv_int8[0] ;
                                                               pfacaut1.this.AV24NumLin = GXv_int7[0] ;
                                                               pfacaut1.this.AV74FlagSal = GXv_int2[0] ;
                                                               pfacaut1.this.AV102TotAlb = GXv_int11[0] ;
                                                               pfacaut1.this.AV75CliFac = GXv_int5[0] ;
                                                            }
                                                            pr_default.readNext(8);
                                                         }
                                                         pr_default.close(8);
                                                         if ( ( AV96FlagBonAlb == 1 ) && ( GXutil.strcmp(AV99BonToP, httpContext.getMessage( "T", "")) == 0 ) )
                                                         {
                                                            AV24NumLin = (int)(AV24NumLin+1) ;
                                                            /*
                                                               INSERT RECORD ON TABLE TXPLFAVEN

                                                            */
                                                            A430FacCod = AV23NumFac ;
                                                            A446FacLin = AV24NumLin ;
                                                            A427FacAlbCod = A30AlbProCod ;
                                                            A1294FacBarCod = 99999999 ;
                                                            A1295FacBarReo = (byte)(0) ;
                                                            A1296FacBarPar = " " ;
                                                            A428FacAlbTip = (byte)(1) ;
                                                            A454FacSer = httpContext.getMessage( "BONIFICACION", "") ;
                                                            A448FacPreKgs = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV102TotAlb).multiply(AV101AlbProBon).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)), 2).multiply(DecimalUtil.doubleToDec((-1))) ;
                                                            A449FacPreMts = DecimalUtil.doubleToDec(0) ;
                                                            A444FacKgs = DecimalUtil.doubleToDec(1) ;
                                                            A447FacMts = DecimalUtil.doubleToDec(0) ;
                                                            A3397FacFasCod = httpContext.getMessage( "BONIFTOT", "") ;
                                                            A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                                            A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                                            A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                                            A3883FacCliCod = AV75CliFac ;
                                                            /* Using cursor P002Z15 */
                                                            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, A3397FacFasCod, Integer.valueOf(A3883FacCliCod), A5050FacBonLi, A5353FacImpMan, A5355FacImpMin});
                                                            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                                            if ( (pr_default.getStatus(13) == 1) )
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
                                                      if ( AV24NumLin > 0 )
                                                      {
                                                         GXv_char13[0] = A396EmprCod ;
                                                         GXv_int12[0] = AV23NumFac ;
                                                         GXv_int8[0] = AV75CliFac ;
                                                         GXv_date16[0] = AV21FacFch ;
                                                         GXv_char9[0] = AV20PRIO ;
                                                         GXv_char6[0] = AV26CodFpg ;
                                                         GXv_decimal15[0] = AV27DtoGen ;
                                                         GXv_decimal17[0] = AV28DtoPP ;
                                                         GXv_int7[0] = AV24NumLin ;
                                                         GXv_int10[0] = AV30CliNroVto ;
                                                         GXv_char3[0] = AV31CliPrd ;
                                                         GXv_char18[0] = AV32CliDiaPag ;
                                                         GXv_char19[0] = AV29RegIVA ;
                                                         GXv_char20[0] = A953IvaCod ;
                                                         GXv_int2[0] = A588IvaPor ;
                                                         GXv_decimal21[0] = A589IvaRec ;
                                                         GXv_char22[0] = AV22FacSerNum ;
                                                         GXv_int23[0] = AV76FacDivCod ;
                                                         GXv_char24[0] = AV83RepCod ;
                                                         GXv_char25[0] = AV79Extranjero ;
                                                         GXv_decimal26[0] = AV113Clidto ;
                                                         GXv_dtime27[0] = AV119FacHor ;
                                                         GXv_char28[0] = AV124stMeivaId ;
                                                         GXv_decimal29[0] = AV126CliEnergia ;
                                                         new app.facturacion.pfacau13(remoteHandle, context).execute( GXv_char13, GXv_int12, GXv_int8, GXv_date16, GXv_char9, GXv_char6, GXv_decimal15, GXv_decimal17, GXv_int7, GXv_int10, GXv_char3, GXv_char18, GXv_char19, GXv_char20, GXv_int2, GXv_decimal21, GXv_char22, GXv_int23, GXv_char24, GXv_char25, GXv_decimal26, GXv_dtime27, GXv_char28, GXv_decimal29) ;
                                                         pfacaut1.this.A396EmprCod = GXv_char13[0] ;
                                                         pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                         pfacaut1.this.AV75CliFac = GXv_int8[0] ;
                                                         pfacaut1.this.AV21FacFch = GXv_date16[0] ;
                                                         pfacaut1.this.AV20PRIO = GXv_char9[0] ;
                                                         pfacaut1.this.AV26CodFpg = GXv_char6[0] ;
                                                         pfacaut1.this.AV27DtoGen = GXv_decimal15[0] ;
                                                         pfacaut1.this.AV28DtoPP = GXv_decimal17[0] ;
                                                         pfacaut1.this.AV24NumLin = GXv_int7[0] ;
                                                         pfacaut1.this.AV30CliNroVto = GXv_int10[0] ;
                                                         pfacaut1.this.AV31CliPrd = GXv_char3[0] ;
                                                         pfacaut1.this.AV32CliDiaPag = GXv_char18[0] ;
                                                         pfacaut1.this.AV29RegIVA = GXv_char19[0] ;
                                                         pfacaut1.this.A953IvaCod = GXv_char20[0] ;
                                                         pfacaut1.this.A588IvaPor = GXv_int2[0] ;
                                                         pfacaut1.this.A589IvaRec = GXv_decimal21[0] ;
                                                         pfacaut1.this.AV22FacSerNum = GXv_char22[0] ;
                                                         pfacaut1.this.AV76FacDivCod = GXv_int23[0] ;
                                                         pfacaut1.this.AV83RepCod = GXv_char24[0] ;
                                                         pfacaut1.this.AV79Extranjero = GXv_char25[0] ;
                                                         pfacaut1.this.AV113Clidto = GXv_decimal26[0] ;
                                                         pfacaut1.this.AV119FacHor = GXv_dtime27[0] ;
                                                         pfacaut1.this.AV124stMeivaId = GXv_char28[0] ;
                                                         pfacaut1.this.AV126CliEnergia = GXv_decimal29[0] ;
                                                         GXv_char28[0] = A396EmprCod ;
                                                         GXv_int12[0] = AV23NumFac ;
                                                         new app.facturacion.pcalvtnc(remoteHandle, context).execute( GXv_char28, GXv_int12) ;
                                                         pfacaut1.this.A396EmprCod = GXv_char28[0] ;
                                                         pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                         GXv_char28[0] = AV127Cadena ;
                                                         GXv_char25[0] = AV128firma ;
                                                         new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, AV23NumFac, AV119FacHor, GXv_char28, GXv_char25) ;
                                                         pfacaut1.this.AV127Cadena = GXv_char28[0] ;
                                                         pfacaut1.this.AV128firma = GXv_char25[0] ;
                                                         GXv_char28[0] = AV132Hash ;
                                                         GXv_objcol_SdtMessages_Message30[0] = AV130Messages ;
                                                         GXv_boolean31[0] = AV131Ok ;
                                                         new app.hash_obtener(remoteHandle, context).execute( AV127Cadena, GXv_char28, GXv_objcol_SdtMessages_Message30, GXv_boolean31) ;
                                                         pfacaut1.this.AV132Hash = GXv_char28[0] ;
                                                         AV130Messages = GXv_objcol_SdtMessages_Message30[0] ;
                                                         pfacaut1.this.AV131Ok = GXv_boolean31[0] ;
                                                         GXv_char28[0] = A396EmprCod ;
                                                         GXv_int12[0] = AV23NumFac ;
                                                         GXv_char25[0] = AV127Cadena ;
                                                         GXv_char24[0] = AV132Hash ;
                                                         new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char28, GXv_int12, GXv_char25, GXv_char24) ;
                                                         pfacaut1.this.A396EmprCod = GXv_char28[0] ;
                                                         pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                         pfacaut1.this.AV127Cadena = GXv_char25[0] ;
                                                         pfacaut1.this.AV132Hash = GXv_char24[0] ;
                                                         A33AlbProEst = (byte)(2) ;
                                                         if ( AV100FlagRieClF == 1 )
                                                         {
                                                            GXv_char28[0] = A396EmprCod ;
                                                            GXv_int12[0] = AV15CliCod ;
                                                            GXv_int8[0] = AV23NumFac ;
                                                            GXv_char25[0] = httpContext.getMessage( "A", "") ;
                                                            GXv_decimal29[0] = AV98Noseusa ;
                                                            new app.prieclup(remoteHandle, context).execute( GXv_char28, GXv_int12, GXv_int8, GXv_char25, GXv_decimal29) ;
                                                            pfacaut1.this.A396EmprCod = GXv_char28[0] ;
                                                            pfacaut1.this.AV15CliCod = GXv_int12[0] ;
                                                            pfacaut1.this.AV23NumFac = GXv_int8[0] ;
                                                            pfacaut1.this.AV98Noseusa = GXv_decimal29[0] ;
                                                         }
                                                      }
                                                      /* Using cursor P002Z16 */
                                                      pr_default.execute(14, new Object[] {Byte.valueOf(A33AlbProEst), A396EmprCod, Long.valueOf(A30AlbProCod)});
                                                      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                              brk2Z6 = true ;
                              pr_default.readNext(4);
                           }
                        }
                     }
                  }
               }
            }
            if ( ! brk2Z6 )
            {
               brk2Z6 = true ;
               pr_default.readNext(4);
            }
         }
         pr_default.close(4);
         pr_default.close(5);
         pr_default.close(6);
         GXv_char28[0] = A396EmprCod ;
         GXv_int12[0] = AV15CliCod ;
         GXv_char25[0] = AV20PRIO ;
         new app.psitala(remoteHandle, context).execute( GXv_char28, GXv_int12, GXv_char25) ;
         pfacaut1.this.A396EmprCod = GXv_char28[0] ;
         pfacaut1.this.AV15CliCod = GXv_int12[0] ;
         pfacaut1.this.AV20PRIO = GXv_char25[0] ;
      }
      if ( ( GXutil.strcmp(AV115TipAlb, "2") == 0 ) || (GXutil.strcmp("", AV115TipAlb)==0) )
      {
         /* Using cursor P002Z17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(AV18PALB), A396EmprCod, Long.valueOf(AV18PALB), AV16PFecha, AV17UFecha, Integer.valueOf(AV15CliCod), AV20PRIO, Long.valueOf(AV19UALB)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            brk2Z15 = false ;
            A10738AlbComSt = P002Z17_A10738AlbComSt[0] ;
            A1783AlbComEso = P002Z17_A1783AlbComEso[0] ;
            A22AlbComPri = P002Z17_A22AlbComPri[0] ;
            A17AlbComFch = P002Z17_A17AlbComFch[0] ;
            A14AlbComCod = P002Z17_A14AlbComCod[0] ;
            A252CliCod = P002Z17_A252CliCod[0] ;
            n252CliCod = P002Z17_n252CliCod[0] ;
            A16AlbComEst = P002Z17_A16AlbComEst[0] ;
            if ( (( GXutil.resetTime(A17AlbComFch).after( GXutil.resetTime( AV16PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV16PFecha)) )) && (( GXutil.resetTime(A17AlbComFch).before( GXutil.resetTime( AV17UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV17UFecha)) )) )
            {
               if ( GXutil.strcmp(A10738AlbComSt, "A") != 0 )
               {
                  if ( A252CliCod == AV15CliCod )
                  {
                     if ( GXutil.strcmp(A22AlbComPri, AV20PRIO) == 0 )
                     {
                        /* Using cursor P002Z18 */
                        pr_default.execute(16, new Object[] {A396EmprCod});
                        A953IvaCod = P002Z18_A953IvaCod[0] ;
                        n953IvaCod = P002Z18_n953IvaCod[0] ;
                        pr_default.close(16);
                        /* Using cursor P002Z19 */
                        pr_default.execute(17, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
                        A588IvaPor = P002Z19_A588IvaPor[0] ;
                        n588IvaPor = P002Z19_n588IvaPor[0] ;
                        A589IvaRec = P002Z19_A589IvaRec[0] ;
                        n589IvaRec = P002Z19_n589IvaRec[0] ;
                        pr_default.close(17);
                        while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(P002Z17_A396EmprCod[0], A396EmprCod) == 0 ) && ( P002Z17_A1783AlbComEso[0] == A1783AlbComEso ) )
                        {
                           brk2Z15 = false ;
                           A10738AlbComSt = P002Z17_A10738AlbComSt[0] ;
                           A22AlbComPri = P002Z17_A22AlbComPri[0] ;
                           A17AlbComFch = P002Z17_A17AlbComFch[0] ;
                           A14AlbComCod = P002Z17_A14AlbComCod[0] ;
                           A252CliCod = P002Z17_A252CliCod[0] ;
                           n252CliCod = P002Z17_n252CliCod[0] ;
                           A16AlbComEst = P002Z17_A16AlbComEst[0] ;
                           if ( A14AlbComCod <= AV19UALB )
                           {
                              if ( A14AlbComCod >= AV18PALB )
                              {
                                 if ( A1783AlbComEso == 1 )
                                 {
                                    /* Using cursor P002Z18 */
                                    pr_default.execute(16, new Object[] {A396EmprCod});
                                    A953IvaCod = P002Z18_A953IvaCod[0] ;
                                    n953IvaCod = P002Z18_n953IvaCod[0] ;
                                    /* Using cursor P002Z19 */
                                    pr_default.execute(17, new Object[] {Boolean.valueOf(n953IvaCod), A953IvaCod});
                                    A588IvaPor = P002Z19_A588IvaPor[0] ;
                                    n588IvaPor = P002Z19_n588IvaPor[0] ;
                                    A589IvaRec = P002Z19_A589IvaRec[0] ;
                                    n589IvaRec = P002Z19_n589IvaRec[0] ;
                                    if ( (( GXutil.resetTime(A17AlbComFch).after( GXutil.resetTime( AV16PFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV16PFecha)) )) && (( GXutil.resetTime(A17AlbComFch).before( GXutil.resetTime( AV17UFecha )) ) || ( GXutil.dateCompare(GXutil.resetTime(A17AlbComFch), GXutil.resetTime(AV17UFecha)) )) )
                                    {
                                       if ( GXutil.strcmp(A10738AlbComSt, "A") != 0 )
                                       {
                                          if ( A252CliCod == AV15CliCod )
                                          {
                                             if ( GXutil.strcmp(A22AlbComPri, AV20PRIO) == 0 )
                                             {
                                                AV37FlagFac2 = (byte)(0) ;
                                                AV23NumFac = (int)(AV23NumFac+1) ;
                                                AV24NumLin = 0 ;
                                                /* Using cursor P002Z20 */
                                                pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
                                                while ( (pr_default.getStatus(18) != 101) )
                                                {
                                                   A15AlbComDsc = P002Z20_A15AlbComDsc[0] ;
                                                   A13AlbComCnt = P002Z20_A13AlbComCnt[0] ;
                                                   A21AlbComPre = P002Z20_A21AlbComPre[0] ;
                                                   A4717AlbComUni = P002Z20_A4717AlbComUni[0] ;
                                                   A20AlbComLin = P002Z20_A20AlbComLin[0] ;
                                                   AV24NumLin = (int)(AV24NumLin+1) ;
                                                   AV37FlagFac2 = (byte)(1) ;
                                                   /*
                                                      INSERT RECORD ON TABLE TXPLFAVEN

                                                   */
                                                   A430FacCod = AV23NumFac ;
                                                   A446FacLin = AV24NumLin ;
                                                   A427FacAlbCod = A14AlbComCod ;
                                                   A428FacAlbTip = (byte)(2) ;
                                                   A432FacDsc = A15AlbComDsc ;
                                                   if ( AV114Itram == 1 )
                                                   {
                                                      A447FacMts = A13AlbComCnt ;
                                                      A449FacPreMts = DecimalUtil.doubleToDec(0) ;
                                                      A447FacMts = DecimalUtil.doubleToDec(0) ;
                                                      A444FacKgs = A13AlbComCnt ;
                                                      A448FacPreKgs = A21AlbComPre ;
                                                   }
                                                   else
                                                   {
                                                      A444FacKgs = DecimalUtil.doubleToDec(0) ;
                                                      A448FacPreKgs = DecimalUtil.doubleToDec(0) ;
                                                      A447FacMts = A13AlbComCnt ;
                                                      A449FacPreMts = A21AlbComPre ;
                                                      A12197FacUnds = 0 ;
                                                      A12198FacPreUnd = DecimalUtil.doubleToDec(0) ;
                                                      if ( A4717AlbComUni == 4 )
                                                      {
                                                         A12197FacUnds = (int)(DecimalUtil.decToDouble(A13AlbComCnt)) ;
                                                         A12198FacPreUnd = A21AlbComPre ;
                                                         A447FacMts = DecimalUtil.doubleToDec(0) ;
                                                         A449FacPreMts = DecimalUtil.doubleToDec(0) ;
                                                      }
                                                   }
                                                   A454FacSer = httpContext.getMessage( "COMERCIAL", "") ;
                                                   A5050FacBonLi = DecimalUtil.doubleToDec(0) ;
                                                   A5353FacImpMan = DecimalUtil.doubleToDec(0) ;
                                                   A5355FacImpMin = DecimalUtil.doubleToDec(0) ;
                                                   A3397FacFasCod = " " ;
                                                   /* Using cursor P002Z21 */
                                                   pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Integer.valueOf(A446FacLin), Long.valueOf(A427FacAlbCod), Byte.valueOf(A428FacAlbTip), A454FacSer, A432FacDsc, A447FacMts, A449FacPreMts, A444FacKgs, A448FacPreKgs, A3397FacFasCod, A5050FacBonLi, A5353FacImpMan, A5355FacImpMin, Integer.valueOf(A12197FacUnds), A12198FacPreUnd});
                                                   Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
                                                   if ( (pr_default.getStatus(19) == 1) )
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
                                                   pr_default.readNext(18);
                                                }
                                                pr_default.close(18);
                                                GXv_char28[0] = A396EmprCod ;
                                                GXv_int12[0] = AV23NumFac ;
                                                GXv_int8[0] = AV75CliFac ;
                                                GXv_date16[0] = AV21FacFch ;
                                                GXv_char25[0] = AV20PRIO ;
                                                GXv_char24[0] = AV26CodFpg ;
                                                GXv_decimal29[0] = AV27DtoGen ;
                                                GXv_decimal26[0] = AV28DtoPP ;
                                                GXv_int7[0] = AV24NumLin ;
                                                GXv_int23[0] = AV30CliNroVto ;
                                                GXv_char22[0] = AV31CliPrd ;
                                                GXv_char20[0] = AV32CliDiaPag ;
                                                GXv_char19[0] = AV29RegIVA ;
                                                GXv_char18[0] = A953IvaCod ;
                                                GXv_int10[0] = A588IvaPor ;
                                                GXv_decimal21[0] = A589IvaRec ;
                                                GXv_char13[0] = AV22FacSerNum ;
                                                GXv_int2[0] = AV76FacDivCod ;
                                                GXv_char9[0] = AV83RepCod ;
                                                GXv_char6[0] = AV79Extranjero ;
                                                GXv_decimal17[0] = AV113Clidto ;
                                                GXv_dtime27[0] = AV119FacHor ;
                                                GXv_char3[0] = AV124stMeivaId ;
                                                GXv_decimal15[0] = AV126CliEnergia ;
                                                new app.facturacion.pfacau13(remoteHandle, context).execute( GXv_char28, GXv_int12, GXv_int8, GXv_date16, GXv_char25, GXv_char24, GXv_decimal29, GXv_decimal26, GXv_int7, GXv_int23, GXv_char22, GXv_char20, GXv_char19, GXv_char18, GXv_int10, GXv_decimal21, GXv_char13, GXv_int2, GXv_char9, GXv_char6, GXv_decimal17, GXv_dtime27, GXv_char3, GXv_decimal15) ;
                                                pfacaut1.this.A396EmprCod = GXv_char28[0] ;
                                                pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                pfacaut1.this.AV75CliFac = GXv_int8[0] ;
                                                pfacaut1.this.AV21FacFch = GXv_date16[0] ;
                                                pfacaut1.this.AV20PRIO = GXv_char25[0] ;
                                                pfacaut1.this.AV26CodFpg = GXv_char24[0] ;
                                                pfacaut1.this.AV27DtoGen = GXv_decimal29[0] ;
                                                pfacaut1.this.AV28DtoPP = GXv_decimal26[0] ;
                                                pfacaut1.this.AV24NumLin = GXv_int7[0] ;
                                                pfacaut1.this.AV30CliNroVto = GXv_int23[0] ;
                                                pfacaut1.this.AV31CliPrd = GXv_char22[0] ;
                                                pfacaut1.this.AV32CliDiaPag = GXv_char20[0] ;
                                                pfacaut1.this.AV29RegIVA = GXv_char19[0] ;
                                                pfacaut1.this.A953IvaCod = GXv_char18[0] ;
                                                pfacaut1.this.A588IvaPor = GXv_int10[0] ;
                                                pfacaut1.this.A589IvaRec = GXv_decimal21[0] ;
                                                pfacaut1.this.AV22FacSerNum = GXv_char13[0] ;
                                                pfacaut1.this.AV76FacDivCod = GXv_int2[0] ;
                                                pfacaut1.this.AV83RepCod = GXv_char9[0] ;
                                                pfacaut1.this.AV79Extranjero = GXv_char6[0] ;
                                                pfacaut1.this.AV113Clidto = GXv_decimal17[0] ;
                                                pfacaut1.this.AV119FacHor = GXv_dtime27[0] ;
                                                pfacaut1.this.AV124stMeivaId = GXv_char3[0] ;
                                                pfacaut1.this.AV126CliEnergia = GXv_decimal15[0] ;
                                                GXv_char28[0] = A396EmprCod ;
                                                GXv_int12[0] = AV23NumFac ;
                                                new app.facturacion.pcalvtnc(remoteHandle, context).execute( GXv_char28, GXv_int12) ;
                                                pfacaut1.this.A396EmprCod = GXv_char28[0] ;
                                                pfacaut1.this.AV23NumFac = GXv_int12[0] ;
                                                if ( ! (0==AV37FlagFac2) )
                                                {
                                                   A16AlbComEst = (byte)(2) ;
                                                }
                                                if ( AV100FlagRieClF == 1 )
                                                {
                                                   GXv_char28[0] = A396EmprCod ;
                                                   GXv_int12[0] = AV15CliCod ;
                                                   GXv_int8[0] = AV23NumFac ;
                                                   GXv_char25[0] = httpContext.getMessage( "A", "") ;
                                                   GXv_decimal29[0] = AV98Noseusa ;
                                                   new app.prieclup(remoteHandle, context).execute( GXv_char28, GXv_int12, GXv_int8, GXv_char25, GXv_decimal29) ;
                                                   pfacaut1.this.A396EmprCod = GXv_char28[0] ;
                                                   pfacaut1.this.AV15CliCod = GXv_int12[0] ;
                                                   pfacaut1.this.AV23NumFac = GXv_int8[0] ;
                                                   pfacaut1.this.AV98Noseusa = GXv_decimal29[0] ;
                                                }
                                                /* Using cursor P002Z22 */
                                                pr_default.execute(20, new Object[] {Byte.valueOf(A16AlbComEst), A396EmprCod, Integer.valueOf(A14AlbComCod)});
                                                Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                           brk2Z15 = true ;
                           pr_default.readNext(15);
                        }
                     }
                  }
               }
            }
            if ( ! brk2Z15 )
            {
               brk2Z15 = true ;
               pr_default.readNext(15);
            }
         }
         pr_default.close(15);
         pr_default.close(16);
         pr_default.close(17);
         GXv_char28[0] = A396EmprCod ;
         GXv_int12[0] = AV15CliCod ;
         GXv_char25[0] = AV20PRIO ;
         new app.psitaca(remoteHandle, context).execute( GXv_char28, GXv_int12, GXv_char25) ;
         pfacaut1.this.A396EmprCod = GXv_char28[0] ;
         pfacaut1.this.AV15CliCod = GXv_int12[0] ;
         pfacaut1.this.AV20PRIO = GXv_char25[0] ;
      }
      /* Optimized UPDATE. */
      /* Using cursor P002Z23 */
      pr_default.execute(21, new Object[] {Integer.valueOf(AV23NumFac), A396EmprCod, AV25ContCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'OBSFAC' Routine */
      returnInSub = false ;
      AV38ArtObsFac = "" ;
      /* Using cursor P002Z24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(AV15CliCod), AV39BarSer});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A65ArtCod = P002Z24_A65ArtCod[0] ;
         A252CliCod = P002Z24_A252CliCod[0] ;
         n252CliCod = P002Z24_n252CliCod[0] ;
         A90ArtObsFac = P002Z24_A90ArtObsFac[0] ;
         n90ArtObsFac = P002Z24_n90ArtObsFac[0] ;
         AV38ArtObsFac = A90ArtObsFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(22);
   }

   public void S121( )
   {
      /* 'PROCESO' Routine */
      returnInSub = false ;
      GXv_char28[0] = A396EmprCod ;
      GXv_int4[0] = AV88AlbProCod ;
      GXv_int12[0] = AV89BarCod ;
      GXv_int23[0] = AV90BarCodReo ;
      GXv_char25[0] = AV91BarCodPar ;
      GXv_int8[0] = AV24NumLin ;
      GXv_int7[0] = AV23NumFac ;
      GXv_char24[0] = AV40BarDisNum ;
      GXv_int10[0] = AV94Texknit ;
      GXv_int2[0] = AV103Martex ;
      GXv_int32[0] = AV74FlagSal ;
      GXv_int33[0] = AV86Guasch ;
      GXv_int11[0] = AV102TotAlb ;
      GXv_int5[0] = AV75CliFac ;
      new app.facturacion.pfacau14(remoteHandle, context).execute( GXv_char28, GXv_int4, GXv_int12, GXv_int23, GXv_char25, GXv_int8, GXv_int7, GXv_char24, GXv_int10, GXv_int2, GXv_int32, GXv_int33, GXv_int11, GXv_int5) ;
      pfacaut1.this.A396EmprCod = GXv_char28[0] ;
      pfacaut1.this.AV88AlbProCod = GXv_int4[0] ;
      pfacaut1.this.AV89BarCod = GXv_int12[0] ;
      pfacaut1.this.AV90BarCodReo = GXv_int23[0] ;
      pfacaut1.this.AV91BarCodPar = GXv_char25[0] ;
      pfacaut1.this.AV24NumLin = GXv_int8[0] ;
      pfacaut1.this.AV23NumFac = GXv_int7[0] ;
      pfacaut1.this.AV40BarDisNum = GXv_char24[0] ;
      pfacaut1.this.AV94Texknit = GXv_int10[0] ;
      pfacaut1.this.AV103Martex = GXv_int2[0] ;
      pfacaut1.this.AV74FlagSal = GXv_int32[0] ;
      pfacaut1.this.AV86Guasch = GXv_int33[0] ;
      pfacaut1.this.AV102TotAlb = GXv_int11[0] ;
      pfacaut1.this.AV75CliFac = GXv_int5[0] ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacaut1.this.A396EmprCod;
      this.aP1[0] = pfacaut1.this.AV15CliCod;
      this.aP2[0] = pfacaut1.this.AV16PFecha;
      this.aP3[0] = pfacaut1.this.AV17UFecha;
      this.aP4[0] = pfacaut1.this.AV18PALB;
      this.aP5[0] = pfacaut1.this.AV19UALB;
      this.aP6[0] = pfacaut1.this.AV20PRIO;
      this.aP7[0] = pfacaut1.this.AV21FacFch;
      this.aP8[0] = pfacaut1.this.AV22FacSerNum;
      this.aP9[0] = pfacaut1.this.AV75CliFac;
      this.aP10[0] = pfacaut1.this.AV107TipProd;
      this.aP11[0] = pfacaut1.this.AV115TipAlb;
      this.aP12[0] = pfacaut1.this.AV119FacHor;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pfacaut1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25ContCod = "" ;
      scmdbuf = "" ;
      P002Z2_A396EmprCod = new String[] {""} ;
      P002Z2_A313ContCod = new String[] {""} ;
      P002Z2_A316ContVal = new int[1] ;
      A313ContCod = "" ;
      P002Z3_A396EmprCod = new String[] {""} ;
      P002Z3_A252CliCod = new int[1] ;
      P002Z3_n252CliCod = new boolean[] {false} ;
      P002Z3_A3073RepCod = new String[] {""} ;
      A3073RepCod = "" ;
      AV83RepCod = "" ;
      P002Z4_A396EmprCod = new String[] {""} ;
      P002Z4_A252CliCod = new int[1] ;
      P002Z4_n252CliCod = new boolean[] {false} ;
      P002Z4_A3140CliDivCod = new byte[1] ;
      P002Z4_n3140CliDivCod = new boolean[] {false} ;
      P002Z4_A3091CliDivTra = new String[] {""} ;
      P002Z4_n3091CliDivTra = new boolean[] {false} ;
      P002Z4_A858ZonGeoCod = new short[1] ;
      P002Z4_A14240stMeivaId = new String[] {""} ;
      P002Z4_n14240stMeivaId = new boolean[] {false} ;
      P002Z4_A2028CliImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z4_n2028CliImpMin = new boolean[] {false} ;
      P002Z4_A14245CliImpMnEs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z4_A14242CliEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3091CliDivTra = "" ;
      A14240stMeivaId = "" ;
      A2028CliImpMin = DecimalUtil.ZERO ;
      A14245CliImpMnEs = DecimalUtil.ZERO ;
      A14242CliEnergia = DecimalUtil.ZERO ;
      AV77FacDivTCod = "" ;
      AV79Extranjero = "" ;
      AV124stMeivaId = "" ;
      AV106CliImpMin = DecimalUtil.ZERO ;
      AV125CliImpMnEst = DecimalUtil.ZERO ;
      AV126CliEnergia = DecimalUtil.ZERO ;
      P002Z5_A396EmprCod = new String[] {""} ;
      P002Z5_A252CliCod = new int[1] ;
      P002Z5_n252CliCod = new boolean[] {false} ;
      P002Z5_A297CliPri = new String[] {""} ;
      P002Z5_A497FpgCod = new String[] {""} ;
      P002Z5_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z5_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z5_A6630CliDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z5_A299CliRegIVA = new String[] {""} ;
      P002Z5_A280CliNroVto = new byte[1] ;
      P002Z5_A296CliPrd = new String[] {""} ;
      P002Z5_A259CliDiaPag = new String[] {""} ;
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
      AV113Clidto = DecimalUtil.ZERO ;
      AV29RegIVA = "" ;
      AV31CliPrd = "" ;
      AV32CliDiaPag = "" ;
      P002Z6_A396EmprCod = new String[] {""} ;
      P002Z6_A5140AlbMarca = new String[] {""} ;
      P002Z6_A1782AlbProEso = new byte[1] ;
      P002Z6_A2242AlbSec = new String[] {""} ;
      P002Z6_A39AlbProPri = new String[] {""} ;
      P002Z6_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P002Z6_A30AlbProCod = new long[1] ;
      P002Z6_A1243GuiRemCli = new int[1] ;
      P002Z6_A5041AlbProTBo = new String[] {""} ;
      P002Z6_n5041AlbProTBo = new boolean[] {false} ;
      P002Z6_A5040AlbProBon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z6_n5040AlbProBon = new boolean[] {false} ;
      P002Z6_A33AlbProEst = new byte[1] ;
      A5140AlbMarca = "" ;
      A2242AlbSec = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A5041AlbProTBo = "" ;
      A5040AlbProBon = DecimalUtil.ZERO ;
      P002Z7_A953IvaCod = new String[] {""} ;
      P002Z7_n953IvaCod = new boolean[] {false} ;
      A953IvaCod = "" ;
      P002Z8_A588IvaPor = new byte[1] ;
      P002Z8_n588IvaPor = new boolean[] {false} ;
      P002Z8_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z8_n589IvaRec = new boolean[] {false} ;
      A589IvaRec = DecimalUtil.ZERO ;
      AV99BonToP = "" ;
      AV101AlbProBon = DecimalUtil.ZERO ;
      P002Z9_A396EmprCod = new String[] {""} ;
      P002Z9_A30AlbProCod = new long[1] ;
      P002Z9_A32AlbProEsp = new byte[1] ;
      P002Z9_A130BarCodPar = new String[] {""} ;
      P002Z9_A132BarCodReo = new byte[1] ;
      P002Z9_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      P002Z10_A396EmprCod = new String[] {""} ;
      P002Z10_A30AlbProCod = new long[1] ;
      P002Z10_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_n1208TubPre = new boolean[] {false} ;
      P002Z10_A1266BarAlbTub = new int[1] ;
      P002Z10_A1207TubNom = new String[] {""} ;
      P002Z10_n1207TubNom = new boolean[] {false} ;
      P002Z10_A1458BarAlbBul = new short[1] ;
      P002Z10_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_n2762AlbBarDto = new boolean[] {false} ;
      P002Z10_A212BarSer = new String[] {""} ;
      P002Z10_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A12195BarAlbUnd = new int[1] ;
      P002Z10_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A1652BarSerDsc = new String[] {""} ;
      P002Z10_A135BarColNom = new String[] {""} ;
      P002Z10_A136BarColNum = new int[1] ;
      P002Z10_A2010BarTipDis = new String[] {""} ;
      P002Z10_A1503BarPart = new short[1] ;
      P002Z10_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A4812BarEncCli = new String[] {""} ;
      P002Z10_A218BarTipCol = new byte[1] ;
      P002Z10_A1234BarNomCli = new String[] {""} ;
      P002Z10_A1235BarNumCli = new int[1] ;
      P002Z10_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z10_A217BarTipArt = new short[1] ;
      P002Z10_n217BarTipArt = new boolean[] {false} ;
      P002Z10_A252CliCod = new int[1] ;
      P002Z10_n252CliCod = new boolean[] {false} ;
      P002Z10_A4466BarAcaAnh = new short[1] ;
      P002Z10_A130BarCodPar = new String[] {""} ;
      P002Z10_A132BarCodReo = new byte[1] ;
      P002Z10_A129BarCod = new int[1] ;
      P002Z10_A32AlbProEsp = new byte[1] ;
      P002Z10_A143BarDisNum = new String[] {""} ;
      P002Z10_A1206TubCod = new short[1] ;
      P002Z10_n1206TubCod = new boolean[] {false} ;
      P002Z10_A6466PlasCod = new short[1] ;
      P002Z10_n6466PlasCod = new boolean[] {false} ;
      P002Z10_A6467BarAlbPlas = new short[1] ;
      A1208TubPre = DecimalUtil.ZERO ;
      A1207TubNom = "" ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A143BarDisNum = "" ;
      AV39BarSer = "" ;
      AV40BarDisNum = "" ;
      AV91BarCodPar = "" ;
      P002Z11_A396EmprCod = new String[] {""} ;
      P002Z11_A30AlbProCod = new long[1] ;
      P002Z11_A129BarCod = new int[1] ;
      P002Z11_A132BarCodReo = new byte[1] ;
      P002Z11_A130BarCodPar = new String[] {""} ;
      P002Z11_A758ProCod = new String[] {""} ;
      P002Z11_n758ProCod = new boolean[] {false} ;
      P002Z11_A1468AlbPrdLin = new short[1] ;
      A758ProCod = "" ;
      AV120Procod = "" ;
      AV38ArtObsFac = "" ;
      AV80FacDsc = "" ;
      A1296FacBarPar = "" ;
      A454FacSer = "" ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A432FacDsc = "" ;
      A1498FacDisNum = "" ;
      A3097FacTipPro = "" ;
      A3397FacFasCod = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A4814FacEncCli = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A3878FacColNom = "" ;
      A3881FacNomCol = "" ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A3884FacProCod = "" ;
      Gx_emsg = "" ;
      GXt_decimal14 = DecimalUtil.ZERO ;
      AV127Cadena = "" ;
      AV128firma = "" ;
      AV132Hash = "" ;
      AV130Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message30 = new GXBaseCollection[1] ;
      GXv_boolean31 = new boolean[1] ;
      AV98Noseusa = DecimalUtil.ZERO ;
      P002Z17_A396EmprCod = new String[] {""} ;
      P002Z17_A10738AlbComSt = new String[] {""} ;
      P002Z17_A1783AlbComEso = new byte[1] ;
      P002Z17_A22AlbComPri = new String[] {""} ;
      P002Z17_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P002Z17_A14AlbComCod = new int[1] ;
      P002Z17_A252CliCod = new int[1] ;
      P002Z17_n252CliCod = new boolean[] {false} ;
      P002Z17_A16AlbComEst = new byte[1] ;
      A10738AlbComSt = "" ;
      A22AlbComPri = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      P002Z18_A953IvaCod = new String[] {""} ;
      P002Z18_n953IvaCod = new boolean[] {false} ;
      P002Z19_A588IvaPor = new byte[1] ;
      P002Z19_n588IvaPor = new boolean[] {false} ;
      P002Z19_A589IvaRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z19_n589IvaRec = new boolean[] {false} ;
      P002Z20_A396EmprCod = new String[] {""} ;
      P002Z20_A14AlbComCod = new int[1] ;
      P002Z20_A15AlbComDsc = new String[] {""} ;
      P002Z20_A13AlbComCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z20_A21AlbComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002Z20_A4717AlbComUni = new byte[1] ;
      P002Z20_A20AlbComLin = new short[1] ;
      A15AlbComDsc = "" ;
      A13AlbComCnt = DecimalUtil.ZERO ;
      A21AlbComPre = DecimalUtil.ZERO ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_char22 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_char13 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_dtime27 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal29 = new java.math.BigDecimal[1] ;
      P002Z24_A396EmprCod = new String[] {""} ;
      P002Z24_A65ArtCod = new String[] {""} ;
      P002Z24_A252CliCod = new int[1] ;
      P002Z24_n252CliCod = new boolean[] {false} ;
      P002Z24_A90ArtObsFac = new String[] {""} ;
      P002Z24_n90ArtObsFac = new boolean[] {false} ;
      A65ArtCod = "" ;
      A90ArtObsFac = "" ;
      GXv_char28 = new String[1] ;
      GXv_int4 = new long[1] ;
      GXv_int12 = new int[1] ;
      GXv_int23 = new byte[1] ;
      GXv_char25 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_char24 = new String[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int32 = new byte[1] ;
      GXv_int33 = new byte[1] ;
      GXv_int11 = new short[1] ;
      GXv_int5 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacaut1__default(),
         new Object[] {
             new Object[] {
            P002Z2_A396EmprCod, P002Z2_A313ContCod, P002Z2_A316ContVal
            }
            , new Object[] {
            P002Z3_A396EmprCod, P002Z3_A252CliCod, P002Z3_A3073RepCod
            }
            , new Object[] {
            P002Z4_A396EmprCod, P002Z4_A252CliCod, P002Z4_A3140CliDivCod, P002Z4_n3140CliDivCod, P002Z4_A3091CliDivTra, P002Z4_n3091CliDivTra, P002Z4_A858ZonGeoCod, P002Z4_A14240stMeivaId, P002Z4_n14240stMeivaId, P002Z4_A2028CliImpMin,
            P002Z4_n2028CliImpMin, P002Z4_A14245CliImpMnEs, P002Z4_A14242CliEnergia
            }
            , new Object[] {
            P002Z5_A396EmprCod, P002Z5_A252CliCod, P002Z5_A297CliPri, P002Z5_A497FpgCod, P002Z5_A261CliDtoGrl, P002Z5_A262CliDtoPpg, P002Z5_A6630CliDto, P002Z5_A299CliRegIVA, P002Z5_A280CliNroVto, P002Z5_A296CliPrd,
            P002Z5_A259CliDiaPag
            }
            , new Object[] {
            P002Z6_A396EmprCod, P002Z6_A5140AlbMarca, P002Z6_A1782AlbProEso, P002Z6_A2242AlbSec, P002Z6_A39AlbProPri, P002Z6_A34AlbProfch, P002Z6_A30AlbProCod, P002Z6_A1243GuiRemCli, P002Z6_A5041AlbProTBo, P002Z6_n5041AlbProTBo,
            P002Z6_A5040AlbProBon, P002Z6_n5040AlbProBon, P002Z6_A33AlbProEst
            }
            , new Object[] {
            P002Z7_A953IvaCod, P002Z7_n953IvaCod
            }
            , new Object[] {
            P002Z8_A588IvaPor, P002Z8_n588IvaPor, P002Z8_A589IvaRec, P002Z8_n589IvaRec
            }
            , new Object[] {
            P002Z9_A396EmprCod, P002Z9_A30AlbProCod, P002Z9_A32AlbProEsp, P002Z9_A130BarCodPar, P002Z9_A132BarCodReo, P002Z9_A129BarCod
            }
            , new Object[] {
            P002Z10_A396EmprCod, P002Z10_A30AlbProCod, P002Z10_A1208TubPre, P002Z10_n1208TubPre, P002Z10_A1266BarAlbTub, P002Z10_A1207TubNom, P002Z10_n1207TubNom, P002Z10_A1458BarAlbBul, P002Z10_A2762AlbBarDto, P002Z10_n2762AlbBarDto,
            P002Z10_A212BarSer, P002Z10_A1262BarPreKgm, P002Z10_A1264BarPreMtr, P002Z10_A12196BarPreUnd, P002Z10_A1261BarAlbKgmE, P002Z10_A1263BarAlbMtrE, P002Z10_A12195BarAlbUnd, P002Z10_A40AlbProRec, P002Z10_A1652BarSerDsc, P002Z10_A135BarColNom,
            P002Z10_A136BarColNum, P002Z10_A2010BarTipDis, P002Z10_A1503BarPart, P002Z10_A2761AlbBarRec, P002Z10_A4812BarEncCli, P002Z10_A218BarTipCol, P002Z10_A1234BarNomCli, P002Z10_A1235BarNumCli, P002Z10_A5354AlbImpMan, P002Z10_A217BarTipArt,
            P002Z10_n217BarTipArt, P002Z10_A252CliCod, P002Z10_n252CliCod, P002Z10_A4466BarAcaAnh, P002Z10_A130BarCodPar, P002Z10_A132BarCodReo, P002Z10_A129BarCod, P002Z10_A32AlbProEsp, P002Z10_A143BarDisNum, P002Z10_A1206TubCod,
            P002Z10_n1206TubCod, P002Z10_A6466PlasCod, P002Z10_n6466PlasCod, P002Z10_A6467BarAlbPlas
            }
            , new Object[] {
            P002Z11_A396EmprCod, P002Z11_A30AlbProCod, P002Z11_A129BarCod, P002Z11_A132BarCodReo, P002Z11_A130BarCodPar, P002Z11_A758ProCod, P002Z11_n758ProCod, P002Z11_A1468AlbPrdLin
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
            P002Z17_A396EmprCod, P002Z17_A10738AlbComSt, P002Z17_A1783AlbComEso, P002Z17_A22AlbComPri, P002Z17_A17AlbComFch, P002Z17_A14AlbComCod, P002Z17_A252CliCod, P002Z17_A16AlbComEst
            }
            , new Object[] {
            P002Z18_A953IvaCod, P002Z18_n953IvaCod
            }
            , new Object[] {
            P002Z19_A588IvaPor, P002Z19_n588IvaPor, P002Z19_A589IvaRec, P002Z19_n589IvaRec
            }
            , new Object[] {
            P002Z20_A396EmprCod, P002Z20_A14AlbComCod, P002Z20_A15AlbComDsc, P002Z20_A13AlbComCnt, P002Z20_A21AlbComPre, P002Z20_A4717AlbComUni, P002Z20_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P002Z24_A396EmprCod, P002Z24_A65ArtCod, P002Z24_A252CliCod, P002Z24_A90ArtObsFac, P002Z24_n90ArtObsFac
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV73FlagPil ;
   private byte AV110Tas ;
   private byte AV112Erfoc ;
   private byte AV74FlagSal ;
   private byte AV108PLinea ;
   private byte AV78FlagTint ;
   private byte AV81FlagDsc ;
   private byte AV82FlagHSS ;
   private byte AV84FlagFacPro ;
   private byte AV86Guasch ;
   private byte AV94Texknit ;
   private byte AV103Martex ;
   private byte AV95Flag_af ;
   private byte AV96FlagBonAlb ;
   private byte AV100FlagRieClF ;
   private byte AV104Hidro ;
   private byte AV109FlagPorRec ;
   private byte AV114Itram ;
   private byte AV116Magosa ;
   private byte AV118Mafitex ;
   private byte AV121Tinamar ;
   private byte AV123Torient ;
   private byte GXt_int1 ;
   private byte A3140CliDivCod ;
   private byte AV76FacDivCod ;
   private byte A280CliNroVto ;
   private byte AV30CliNroVto ;
   private byte A1782AlbProEso ;
   private byte A33AlbProEst ;
   private byte A588IvaPor ;
   private byte AV72Flag1 ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV90BarCodReo ;
   private byte AV41LenSer ;
   private byte AV42LenColNom ;
   private byte A1295FacBarReo ;
   private byte A428FacAlbTip ;
   private byte A3880FacTipColC ;
   private byte AV122intcod ;
   private byte A12693FacInt ;
   private byte A1783AlbComEso ;
   private byte A16AlbComEst ;
   private byte AV37FlagFac2 ;
   private byte A4717AlbComUni ;
   private byte GXv_int23[] ;
   private byte GXv_int10[] ;
   private byte GXv_int2[] ;
   private byte GXv_int32[] ;
   private byte GXv_int33[] ;
   private short A858ZonGeoCod ;
   private short AV102TotAlb ;
   private short A1458BarAlbBul ;
   private short A1503BarPart ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short A1468AlbPrdLin ;
   private short A3303FacNPart ;
   private short A5189FacTipArt ;
   private short A12906FacCadEnc ;
   private short Gx_err ;
   private short A20AlbComLin ;
   private short GXv_int11[] ;
   private int AV15CliCod ;
   private int AV75CliFac ;
   private int A316ContVal ;
   private int AV23NumFac ;
   private int A252CliCod ;
   private int A1243GuiRemCli ;
   private int AV24NumLin ;
   private int A129BarCod ;
   private int A1266BarAlbTub ;
   private int A12195BarAlbUnd ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int AV89BarCod ;
   private int GX_INS44 ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int A3879FocColNum ;
   private int A3882FacNumCol ;
   private int A3883FacCliCod ;
   private int A14AlbComCod ;
   private int GXv_int12[] ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private long AV18PALB ;
   private long AV19UALB ;
   private long A30AlbProCod ;
   private long AV88AlbProCod ;
   private long A427FacAlbCod ;
   private long GXv_int4[] ;
   private java.math.BigDecimal A2028CliImpMin ;
   private java.math.BigDecimal A14245CliImpMnEs ;
   private java.math.BigDecimal A14242CliEnergia ;
   private java.math.BigDecimal AV106CliImpMin ;
   private java.math.BigDecimal AV125CliImpMnEst ;
   private java.math.BigDecimal AV126CliEnergia ;
   private java.math.BigDecimal A261CliDtoGrl ;
   private java.math.BigDecimal A262CliDtoPpg ;
   private java.math.BigDecimal A6630CliDto ;
   private java.math.BigDecimal AV27DtoGen ;
   private java.math.BigDecimal AV28DtoPP ;
   private java.math.BigDecimal AV113Clidto ;
   private java.math.BigDecimal A5040AlbProBon ;
   private java.math.BigDecimal A589IvaRec ;
   private java.math.BigDecimal AV101AlbProBon ;
   private java.math.BigDecimal A1208TubPre ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal GXt_decimal14 ;
   private java.math.BigDecimal AV98Noseusa ;
   private java.math.BigDecimal A13AlbComCnt ;
   private java.math.BigDecimal A21AlbComPre ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal29[] ;
   private String A396EmprCod ;
   private String AV20PRIO ;
   private String AV22FacSerNum ;
   private String AV107TipProd ;
   private String AV115TipAlb ;
   private String AV25ContCod ;
   private String scmdbuf ;
   private String A313ContCod ;
   private String A3073RepCod ;
   private String AV83RepCod ;
   private String A3091CliDivTra ;
   private String A14240stMeivaId ;
   private String AV77FacDivTCod ;
   private String AV79Extranjero ;
   private String AV124stMeivaId ;
   private String A297CliPri ;
   private String A497FpgCod ;
   private String A299CliRegIVA ;
   private String A296CliPrd ;
   private String A259CliDiaPag ;
   private String AV26CodFpg ;
   private String AV29RegIVA ;
   private String AV31CliPrd ;
   private String AV32CliDiaPag ;
   private String A5140AlbMarca ;
   private String A2242AlbSec ;
   private String A39AlbProPri ;
   private String A5041AlbProTBo ;
   private String A953IvaCod ;
   private String AV99BonToP ;
   private String A130BarCodPar ;
   private String A1207TubNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String AV39BarSer ;
   private String AV40BarDisNum ;
   private String AV91BarCodPar ;
   private String A758ProCod ;
   private String AV120Procod ;
   private String AV38ArtObsFac ;
   private String AV80FacDsc ;
   private String A1296FacBarPar ;
   private String A454FacSer ;
   private String A432FacDsc ;
   private String A1498FacDisNum ;
   private String A3097FacTipPro ;
   private String A3397FacFasCod ;
   private String A4814FacEncCli ;
   private String A3878FacColNom ;
   private String A3881FacNomCol ;
   private String A3884FacProCod ;
   private String Gx_emsg ;
   private String AV128firma ;
   private String A10738AlbComSt ;
   private String A22AlbComPri ;
   private String A15AlbComDsc ;
   private String GXv_char22[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char13[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private String A65ArtCod ;
   private String A90ArtObsFac ;
   private String GXv_char28[] ;
   private String GXv_char25[] ;
   private String GXv_char24[] ;
   private java.util.Date AV119FacHor ;
   private java.util.Date GXv_dtime27[] ;
   private java.util.Date AV16PFecha ;
   private java.util.Date AV17UFecha ;
   private java.util.Date AV21FacFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A17AlbComFch ;
   private java.util.Date GXv_date16[] ;
   private boolean n252CliCod ;
   private boolean n3140CliDivCod ;
   private boolean n3091CliDivTra ;
   private boolean n14240stMeivaId ;
   private boolean n2028CliImpMin ;
   private boolean brk2Z6 ;
   private boolean n5041AlbProTBo ;
   private boolean n5040AlbProBon ;
   private boolean n953IvaCod ;
   private boolean n588IvaPor ;
   private boolean n589IvaRec ;
   private boolean n1208TubPre ;
   private boolean n1207TubNom ;
   private boolean n2762AlbBarDto ;
   private boolean n217BarTipArt ;
   private boolean n1206TubCod ;
   private boolean n6466PlasCod ;
   private boolean n758ProCod ;
   private boolean returnInSub ;
   private boolean AV131Ok ;
   private boolean GXv_boolean31[] ;
   private boolean brk2Z15 ;
   private boolean n90ArtObsFac ;
   private String AV127Cadena ;
   private String AV132Hash ;
   private java.util.Date[] aP12 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P002Z2_A396EmprCod ;
   private String[] P002Z2_A313ContCod ;
   private int[] P002Z2_A316ContVal ;
   private String[] P002Z3_A396EmprCod ;
   private int[] P002Z3_A252CliCod ;
   private boolean[] P002Z3_n252CliCod ;
   private String[] P002Z3_A3073RepCod ;
   private String[] P002Z4_A396EmprCod ;
   private int[] P002Z4_A252CliCod ;
   private boolean[] P002Z4_n252CliCod ;
   private byte[] P002Z4_A3140CliDivCod ;
   private boolean[] P002Z4_n3140CliDivCod ;
   private String[] P002Z4_A3091CliDivTra ;
   private boolean[] P002Z4_n3091CliDivTra ;
   private short[] P002Z4_A858ZonGeoCod ;
   private String[] P002Z4_A14240stMeivaId ;
   private boolean[] P002Z4_n14240stMeivaId ;
   private java.math.BigDecimal[] P002Z4_A2028CliImpMin ;
   private boolean[] P002Z4_n2028CliImpMin ;
   private java.math.BigDecimal[] P002Z4_A14245CliImpMnEs ;
   private java.math.BigDecimal[] P002Z4_A14242CliEnergia ;
   private String[] P002Z5_A396EmprCod ;
   private int[] P002Z5_A252CliCod ;
   private boolean[] P002Z5_n252CliCod ;
   private String[] P002Z5_A297CliPri ;
   private String[] P002Z5_A497FpgCod ;
   private java.math.BigDecimal[] P002Z5_A261CliDtoGrl ;
   private java.math.BigDecimal[] P002Z5_A262CliDtoPpg ;
   private java.math.BigDecimal[] P002Z5_A6630CliDto ;
   private String[] P002Z5_A299CliRegIVA ;
   private byte[] P002Z5_A280CliNroVto ;
   private String[] P002Z5_A296CliPrd ;
   private String[] P002Z5_A259CliDiaPag ;
   private String[] P002Z6_A396EmprCod ;
   private String[] P002Z6_A5140AlbMarca ;
   private byte[] P002Z6_A1782AlbProEso ;
   private String[] P002Z6_A2242AlbSec ;
   private String[] P002Z6_A39AlbProPri ;
   private java.util.Date[] P002Z6_A34AlbProfch ;
   private long[] P002Z6_A30AlbProCod ;
   private int[] P002Z6_A1243GuiRemCli ;
   private String[] P002Z6_A5041AlbProTBo ;
   private boolean[] P002Z6_n5041AlbProTBo ;
   private java.math.BigDecimal[] P002Z6_A5040AlbProBon ;
   private boolean[] P002Z6_n5040AlbProBon ;
   private byte[] P002Z6_A33AlbProEst ;
   private String[] P002Z7_A953IvaCod ;
   private boolean[] P002Z7_n953IvaCod ;
   private byte[] P002Z8_A588IvaPor ;
   private boolean[] P002Z8_n588IvaPor ;
   private java.math.BigDecimal[] P002Z8_A589IvaRec ;
   private boolean[] P002Z8_n589IvaRec ;
   private String[] P002Z9_A396EmprCod ;
   private long[] P002Z9_A30AlbProCod ;
   private byte[] P002Z9_A32AlbProEsp ;
   private String[] P002Z9_A130BarCodPar ;
   private byte[] P002Z9_A132BarCodReo ;
   private int[] P002Z9_A129BarCod ;
   private String[] P002Z10_A396EmprCod ;
   private long[] P002Z10_A30AlbProCod ;
   private java.math.BigDecimal[] P002Z10_A1208TubPre ;
   private boolean[] P002Z10_n1208TubPre ;
   private int[] P002Z10_A1266BarAlbTub ;
   private String[] P002Z10_A1207TubNom ;
   private boolean[] P002Z10_n1207TubNom ;
   private short[] P002Z10_A1458BarAlbBul ;
   private java.math.BigDecimal[] P002Z10_A2762AlbBarDto ;
   private boolean[] P002Z10_n2762AlbBarDto ;
   private String[] P002Z10_A212BarSer ;
   private java.math.BigDecimal[] P002Z10_A1262BarPreKgm ;
   private java.math.BigDecimal[] P002Z10_A1264BarPreMtr ;
   private java.math.BigDecimal[] P002Z10_A12196BarPreUnd ;
   private java.math.BigDecimal[] P002Z10_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P002Z10_A1263BarAlbMtrE ;
   private int[] P002Z10_A12195BarAlbUnd ;
   private java.math.BigDecimal[] P002Z10_A40AlbProRec ;
   private String[] P002Z10_A1652BarSerDsc ;
   private String[] P002Z10_A135BarColNom ;
   private int[] P002Z10_A136BarColNum ;
   private String[] P002Z10_A2010BarTipDis ;
   private short[] P002Z10_A1503BarPart ;
   private java.math.BigDecimal[] P002Z10_A2761AlbBarRec ;
   private String[] P002Z10_A4812BarEncCli ;
   private byte[] P002Z10_A218BarTipCol ;
   private String[] P002Z10_A1234BarNomCli ;
   private int[] P002Z10_A1235BarNumCli ;
   private java.math.BigDecimal[] P002Z10_A5354AlbImpMan ;
   private short[] P002Z10_A217BarTipArt ;
   private boolean[] P002Z10_n217BarTipArt ;
   private int[] P002Z10_A252CliCod ;
   private boolean[] P002Z10_n252CliCod ;
   private short[] P002Z10_A4466BarAcaAnh ;
   private String[] P002Z10_A130BarCodPar ;
   private byte[] P002Z10_A132BarCodReo ;
   private int[] P002Z10_A129BarCod ;
   private byte[] P002Z10_A32AlbProEsp ;
   private String[] P002Z10_A143BarDisNum ;
   private short[] P002Z10_A1206TubCod ;
   private boolean[] P002Z10_n1206TubCod ;
   private short[] P002Z10_A6466PlasCod ;
   private boolean[] P002Z10_n6466PlasCod ;
   private short[] P002Z10_A6467BarAlbPlas ;
   private String[] P002Z11_A396EmprCod ;
   private long[] P002Z11_A30AlbProCod ;
   private int[] P002Z11_A129BarCod ;
   private byte[] P002Z11_A132BarCodReo ;
   private String[] P002Z11_A130BarCodPar ;
   private String[] P002Z11_A758ProCod ;
   private boolean[] P002Z11_n758ProCod ;
   private short[] P002Z11_A1468AlbPrdLin ;
   private String[] P002Z17_A396EmprCod ;
   private String[] P002Z17_A10738AlbComSt ;
   private byte[] P002Z17_A1783AlbComEso ;
   private String[] P002Z17_A22AlbComPri ;
   private java.util.Date[] P002Z17_A17AlbComFch ;
   private int[] P002Z17_A14AlbComCod ;
   private int[] P002Z17_A252CliCod ;
   private boolean[] P002Z17_n252CliCod ;
   private byte[] P002Z17_A16AlbComEst ;
   private String[] P002Z18_A953IvaCod ;
   private boolean[] P002Z18_n953IvaCod ;
   private byte[] P002Z19_A588IvaPor ;
   private boolean[] P002Z19_n588IvaPor ;
   private java.math.BigDecimal[] P002Z19_A589IvaRec ;
   private boolean[] P002Z19_n589IvaRec ;
   private String[] P002Z20_A396EmprCod ;
   private int[] P002Z20_A14AlbComCod ;
   private String[] P002Z20_A15AlbComDsc ;
   private java.math.BigDecimal[] P002Z20_A13AlbComCnt ;
   private java.math.BigDecimal[] P002Z20_A21AlbComPre ;
   private byte[] P002Z20_A4717AlbComUni ;
   private short[] P002Z20_A20AlbComLin ;
   private String[] P002Z24_A396EmprCod ;
   private String[] P002Z24_A65ArtCod ;
   private int[] P002Z24_A252CliCod ;
   private boolean[] P002Z24_n252CliCod ;
   private String[] P002Z24_A90ArtObsFac ;
   private boolean[] P002Z24_n90ArtObsFac ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV130Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message30[] ;
}

final  class pfacaut1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002Z2", "SELECT EmprCod, ContCod, ContVal FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002Z3", "SELECT EmprCod, CliCod, RepCod FROM TXPCOMREP WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z4", "SELECT EmprCod, CliCod, CliDivCod, CliDivTra, ZonGeoCod, stMeivaId, CliImpMin, CliImpMnEs, CliEnergia FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002Z5", "SELECT EmprCod, CliCod, CliPri, FpgCod, CliDtoGrl, CliDtoPpg, CliDto, CliRegIVA, CliNroVto, CliPrd, CliDiaPag FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002Z6", "SELECT EmprCod, AlbMarca, AlbProEso, AlbSec, AlbProPri, AlbProfch, AlbProCod, GuiRemCli, AlbProTBo, AlbProBon, AlbProEst FROM TXPCALPRD WHERE (EmprCod = ? AND AlbProEso = 1 AND AlbProCod >= ?) AND ((EmprCod = ? and AlbProEso = 1 and AlbProCod >= ?) AND (AlbProfch >= ? and AlbProfch <= ?) AND (AlbSec = ? or ? = 0) AND (AlbMarca <> 'A') AND (GuiRemCli = ?) AND (AlbProPri = ?) AND (AlbProCod <= ?)) ORDER BY EmprCod, AlbProEso, AlbProCod  FOR UPDATE OF AlbProEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z7", "SELECT IvaCod FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z8", "SELECT IvaPor, IvaRec FROM TXPTIPIVA WHERE IvaCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z9", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbProEsp, BarCodPar, BarCodReo, BarCod FROM TXPALBBAR WHERE (EmprCod = ? and AlbProCod = ?) AND (Not (AlbProEsp = 0) and AlbProEsp < 10) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002Z10", "SELECT T1.EmprCod, T1.AlbProCod, T3.TubPre, T1.BarAlbTub, T3.TubNom, T1.BarAlbBul, T1.AlbBarDto, T2.BarSer, T1.BarPreKgm, T1.BarPreMtr, T1.BarPreUnd, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbUnd, T1.AlbProRec, T2.BarSerDsc, T2.BarColNom, T2.BarColNum, T2.BarTipDis, T2.BarPart, T1.AlbBarRec, T2.BarEncCli, T2.BarTipCol, T2.BarNomCli, T2.BarNumCli, T1.AlbImpMan, T2.BarTipArt, T2.CliCod, T2.BarAcaAnh, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProEsp, T2.BarDisNum, T1.TubCod, T1.PlasCod, T1.BarAlbPlas FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTUBOS T3 ON T3.EmprCod = T1.EmprCod AND T3.TubCod = T1.TubCod) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T1.AlbProEsp = 0 or T1.AlbProEsp >= 10) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z11", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, ProCod, AlbPrdLin FROM TXPALBPRD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (AlbProCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002Z12", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacFasCod, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacEncCli, FacBonLi, FacTipArt, FacImpMan, FacImpMin, FacKgsA, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacPreKgsA, FacDsc2, FacDishCod, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacFecAlb, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P002Z13", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacDsc, FacRec, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P002Z14", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacNPart, FacFasCod, FacCliCod, FacEncCli, FacBonLi, FacImpMan, FacImpMin, FacTipPro, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P002Z15", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacMts, FacPreMts, FacKgs, FacPreKgs, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacCliCod, FacBonLi, FacImpMan, FacImpMin, FacDsc, FacRec, FacDisNum, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacProCod, FacPreKgsA, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacUnds, FacPreUnd, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', 0, ' ', 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P002Z16", "UPDATE TXPCALPRD SET AlbProEst=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P002Z17", "SELECT EmprCod, AlbComSt, AlbComEso, AlbComPri, AlbComFch, AlbComCod, CliCod, AlbComEst FROM TXPCALCOM WHERE (EmprCod = ? AND AlbComEso = 1 AND AlbComCod >= ?) AND ((EmprCod = ? and AlbComEso = 1 and AlbComCod >= ?) AND (AlbComFch >= ? and AlbComFch <= ?) AND (AlbComSt <> 'A') AND (CliCod = ?) AND (AlbComPri = ?) AND (AlbComCod <= ?)) ORDER BY EmprCod, AlbComEso, AlbComCod  FOR UPDATE OF AlbComEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z18", "SELECT IvaCod FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z19", "SELECT IvaPor, IvaRec FROM TXPTIPIVA WHERE IvaCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002Z20", "SELECT EmprCod, AlbComCod, AlbComDsc, AlbComCnt, AlbComPre, AlbComUni, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002Z21", "INSERT INTO TXPLFAVEN(EmprCod, FacCod, FacLin, FacAlbCod, FacAlbTip, FacSer, FacDsc, FacMts, FacPreMts, FacKgs, FacPreKgs, FacFasCod, FacBonLi, FacImpMan, FacImpMin, FacUnds, FacPreUnd, FacRec, FacBarCod, FacBarReo, FacBarPar, FacDisNum, FacTipPro, FacNPart, FacColNom, FocColNum, FacTipColC, FacNomCol, FacNumCol, FacCliCod, FacProCod, FacPreKgsA, FacDsc2, FacEncCli, FacDishCod, FacTipArt, FacCosPQ, FacImpdto, FacDtoL, FacPKDto, FacPMdto, FacImpd, FacDscII, FacAcs, FacKgsA, FacFecAlb, FacInt, FacCadEnc, FacLinTRM, FACLinTRMF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
         ,new UpdateCursor("P002Z22", "UPDATE TXPCALCOM SET AlbComEst=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
         ,new UpdateCursor("P002Z23", "UPDATE TXPEMPLIN SET ContVal=?  WHERE EmprCod = ? and ContCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEMPLIN")
         ,new ForEachCursor("P002Z24", "SELECT EmprCod, ArtCod, CliCod, ArtObsFac FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
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
            case 3 :
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
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,5);
               ((String[]) buf[18])[0] = rslt.getString(16, 26);
               ((String[]) buf[19])[0] = rslt.getString(17, 13);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((String[]) buf[26])[0] = rslt.getString(24, 13);
               ((int[]) buf[27])[0] = rslt.getInt(25);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((short[]) buf[29])[0] = rslt.getShort(27);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
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
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
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
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setLong(11, ((Number) parms[10]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 10 :
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
               stmt.setString(26, (String)parms[25], 8);
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
            case 11 :
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
               stmt.setString(18, (String)parms[17], 20);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
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
               stmt.setString(20, (String)parms[19], 20);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               return;
            case 13 :
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
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
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
               stmt.setString(12, (String)parms[11], 8);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 5);
               return;
            case 20 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

