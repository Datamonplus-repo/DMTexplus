package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rprm019_impl extends GXWebReport
{
   public rprm019_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            n252CliCod = false ;
            AV15PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
            AV16PBarCodPar = httpContext.GetPar( "PBarCodPar") ;
            AV17PBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarCodReo"))) ;
            AV18PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
            AV19PColor = httpContext.GetPar( "PColor") ;
            AV20PDisCli = httpContext.GetPar( "PDisCli") ;
            AV21PFecDisCli = localUtil.parseDateParm( httpContext.GetPar( "PFecDisCli")) ;
            AV22PSerie = httpContext.GetPar( "PSerie") ;
            AV23PSitua = (byte)(GXutil.lval( httpContext.GetPar( "PSitua"))) ;
            AV24UBarCod = (int)(GXutil.lval( httpContext.GetPar( "UBarCod"))) ;
            AV25UBarCodPar = httpContext.GetPar( "UBarCodPar") ;
            AV26UBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "UBarCodReo"))) ;
            AV27UColNum = (int)(GXutil.lval( httpContext.GetPar( "UColNum"))) ;
            AV28UColor = httpContext.GetPar( "UColor") ;
            AV29UDisCli = httpContext.GetPar( "UDisCli") ;
            AV30UFecDisCli = localUtil.parseDateParm( httpContext.GetPar( "UFecDisCli")) ;
            AV31USerie = httpContext.GetPar( "USerie") ;
            AV32USitua = (byte)(GXutil.lval( httpContext.GetPar( "USitua"))) ;
            AV55PfecEnt = localUtil.parseDateParm( httpContext.GetPar( "PfecEnt")) ;
            AV56UfecEnt = localUtil.parseDateParm( httpContext.GetPar( "UfecEnt")) ;
            AV66PSerDsc = httpContext.GetPar( "PSerDsc") ;
            AV67USerDsc = httpContext.GetPar( "USerDsc") ;
            AV70NomClii = httpContext.GetPar( "NomClii") ;
            AV71NomClif = httpContext.GetPar( "NomClif") ;
            AV72NumClii = (int)(GXutil.lval( httpContext.GetPar( "NumClii"))) ;
            AV73NumClif = (int)(GXutil.lval( httpContext.GetPar( "NumClif"))) ;
            AV78bartipart1 = (short)(GXutil.lval( httpContext.GetPar( "bartipart1"))) ;
            AV79bartipart2 = (short)(GXutil.lval( httpContext.GetPar( "bartipart2"))) ;
            AV87Barcolnomin = httpContext.GetPar( "Barcolnomin") ;
            AV89Norma = httpContext.GetPar( "Norma") ;
            AV88Trati = httpContext.GetPar( "Trati") ;
            AV33ImpCod = httpContext.GetPar( "ImpCod") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV68F_tinamar ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int1) ;
         rprm019_impl.this.AV68F_tinamar = GXv_int1[0] ;
         GXv_int1[0] = AV77Moda21 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
         rprm019_impl.this.AV77Moda21 = GXv_int1[0] ;
         GXt_int2 = AV85Samofil ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SAMOFI", ""), GXv_int1) ;
         rprm019_impl.this.GXt_int2 = GXv_int1[0] ;
         AV85Samofil = GXt_int2 ;
         GXt_int2 = AV91Carvema ;
         GXv_int1[0] = GXt_int2 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
         rprm019_impl.this.GXt_int2 = GXv_int1[0] ;
         AV91Carvema = GXt_int2 ;
         GXt_char3 = AV38Lit0 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV38Lit0 = GXt_char3 ;
         GXt_char3 = AV39Lit1 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV39Lit1 = GXt_char3 ;
         GXt_char3 = AV40Lit2 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN241_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV40Lit2 = GXt_char3 ;
         GXt_char3 = AV41Lit3 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV41Lit3 = GXt_char3 ;
         GXt_char3 = AV42Lit4 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN420_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV42Lit4 = GXt_char3 ;
         GXt_char3 = AV43Lit5 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV43Lit5 = GXt_char3 ;
         GXt_char3 = AV44Lit6 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN436_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV44Lit6 = GXt_char3 ;
         GXt_char3 = AV45Lit7 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2167_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV45Lit7 = GXt_char3 ;
         GXt_char3 = AV46Lit8 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN428_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV46Lit8 = GXt_char3 ;
         GXt_char3 = AV47Lit9 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV47Lit9 = GXt_char3 ;
         GXt_char3 = AV48Lit10 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV48Lit10 = GXt_char3 ;
         GXt_char3 = AV49Lit11 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV49Lit11 = GXt_char3 ;
         GXt_char3 = AV50Lit12 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV50Lit12 = GXt_char3 ;
         GXt_char3 = AV51Lit13 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV51Lit13 = GXt_char3 ;
         GXt_char3 = AV52Lit14 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN484_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV52Lit14 = GXt_char3 ;
         GXt_char3 = AV53Lit15 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2515_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV53Lit15 = GXt_char3 ;
         GXt_char3 = AV54Lit16 ;
         GXv_char4[0] = GXt_char3 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1351_", ""), (byte)(99), GXv_char4) ;
         rprm019_impl.this.GXt_char3 = GXv_char4[0] ;
         AV54Lit16 = GXt_char3 ;
         /* Using cursor P06NZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06NZ2_A407EmprNom[0] ;
            n407EmprNom = P06NZ2_n407EmprNom[0] ;
            AV37NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV77Moda21 == 0 )
         {
            AV76Texto_d = httpContext.getMessage( "Entrega", "") ;
         }
         else
         {
            AV76Texto_d = httpContext.getMessage( "O.S.", "") ;
         }
         GxHdr3 = true ;
         /* Using cursor P06NZ6 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), AV20PDisCli, Integer.valueOf(AV15PBarCod), Byte.valueOf(AV17PBarCodReo), AV16PBarCodPar, Integer.valueOf(AV24UBarCod), Byte.valueOf(AV26UBarCodReo), AV25UBarCodPar, AV22PSerie, AV31USerie, AV19PColor, AV28UColor, Integer.valueOf(AV18PColNum), Integer.valueOf(AV27UColNum), AV21PFecDisCli, AV30UFecDisCli, Byte.valueOf(AV23PSitua), Byte.valueOf(AV32USitua), AV55PfecEnt, AV56UfecEnt, AV66PSerDsc, AV67USerDsc, AV70NomClii, AV71NomClif, Integer.valueOf(AV72NumClii), Integer.valueOf(AV73NumClif), Short.valueOf(AV78bartipart1), Short.valueOf(AV79bartipart2), AV87Barcolnomin, AV87Barcolnomin, AV29UDisCli});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6NZ3 = false ;
            A361DisCod = P06NZ6_A361DisCod[0] ;
            A192BarNumUni = P06NZ6_A192BarNumUni[0] ;
            A228BarUniMed = P06NZ6_A228BarUniMed[0] ;
            A191BarNumPie = P06NZ6_A191BarNumPie[0] ;
            A2827BarKgsLot = P06NZ6_A2827BarKgsLot[0] ;
            A213BarSit = P06NZ6_A213BarSit[0] ;
            A212BarSer = P06NZ6_A212BarSer[0] ;
            A135BarColNom = P06NZ6_A135BarColNom[0] ;
            A1234BarNomCli = P06NZ6_A1234BarNomCli[0] ;
            A158BarFecFpr = P06NZ6_A158BarFecFpr[0] ;
            A159BarFecGen = P06NZ6_A159BarFecGen[0] ;
            A1652BarSerDsc = P06NZ6_A1652BarSerDsc[0] ;
            A136BarColNum = P06NZ6_A136BarColNum[0] ;
            A155BarFecCli = P06NZ6_A155BarFecCli[0] ;
            A130BarCodPar = P06NZ6_A130BarCodPar[0] ;
            A132BarCodReo = P06NZ6_A132BarCodReo[0] ;
            A129BarCod = P06NZ6_A129BarCod[0] ;
            A143BarDisNum = P06NZ6_A143BarDisNum[0] ;
            A217BarTipArt = P06NZ6_A217BarTipArt[0] ;
            n217BarTipArt = P06NZ6_n217BarTipArt[0] ;
            A1235BarNumCli = P06NZ6_A1235BarNumCli[0] ;
            A279CliNom = P06NZ6_A279CliNom[0] ;
            A166BarKgm = P06NZ6_A166BarKgm[0] ;
            A151BarFasCod = P06NZ6_A151BarFasCod[0] ;
            n151BarFasCod = P06NZ6_n151BarFasCod[0] ;
            A199BarPie1 = P06NZ6_A199BarPie1[0] ;
            A365DisDes = P06NZ6_A365DisDes[0] ;
            A898BarPieNDes = P06NZ6_A898BarPieNDes[0] ;
            A166BarKgm = P06NZ6_A166BarKgm[0] ;
            A199BarPie1 = P06NZ6_A199BarPie1[0] ;
            A898BarPieNDes = P06NZ6_A898BarPieNDes[0] ;
            A151BarFasCod = P06NZ6_A151BarFasCod[0] ;
            n151BarFasCod = P06NZ6_n151BarFasCod[0] ;
            A279CliNom = P06NZ6_A279CliNom[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06NZ6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06NZ6_A252CliCod[0] == A252CliCod ) )
            {
               brk6NZ3 = false ;
               A361DisCod = P06NZ6_A361DisCod[0] ;
               A192BarNumUni = P06NZ6_A192BarNumUni[0] ;
               A228BarUniMed = P06NZ6_A228BarUniMed[0] ;
               A191BarNumPie = P06NZ6_A191BarNumPie[0] ;
               A2827BarKgsLot = P06NZ6_A2827BarKgsLot[0] ;
               A213BarSit = P06NZ6_A213BarSit[0] ;
               A212BarSer = P06NZ6_A212BarSer[0] ;
               A135BarColNom = P06NZ6_A135BarColNom[0] ;
               A1234BarNomCli = P06NZ6_A1234BarNomCli[0] ;
               A158BarFecFpr = P06NZ6_A158BarFecFpr[0] ;
               A159BarFecGen = P06NZ6_A159BarFecGen[0] ;
               A1652BarSerDsc = P06NZ6_A1652BarSerDsc[0] ;
               A136BarColNum = P06NZ6_A136BarColNum[0] ;
               A155BarFecCli = P06NZ6_A155BarFecCli[0] ;
               A130BarCodPar = P06NZ6_A130BarCodPar[0] ;
               A132BarCodReo = P06NZ6_A132BarCodReo[0] ;
               A129BarCod = P06NZ6_A129BarCod[0] ;
               A143BarDisNum = P06NZ6_A143BarDisNum[0] ;
               A365DisDes = P06NZ6_A365DisDes[0] ;
               /* Using cursor P06NZ8 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               if ( (pr_default.getStatus(2) != 101) )
               {
                  A166BarKgm = P06NZ8_A166BarKgm[0] ;
                  A199BarPie1 = P06NZ8_A199BarPie1[0] ;
                  A898BarPieNDes = P06NZ8_A898BarPieNDes[0] ;
               }
               else
               {
                  A166BarKgm = DecimalUtil.doubleToDec(0) ;
                  A898BarPieNDes = 0 ;
                  A199BarPie1 = (short)(0) ;
               }
               pr_default.close(2);
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
               {
                  A198BarPie = A898BarPieNDes ;
               }
               else
               {
                  A198BarPie = A199BarPie1 ;
               }
               /* Using cursor P06NZ11 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               if ( (pr_default.getStatus(3) != 101) )
               {
                  A151BarFasCod = P06NZ11_A151BarFasCod[0] ;
                  n151BarFasCod = P06NZ11_n151BarFasCod[0] ;
               }
               else
               {
                  A151BarFasCod = " " ;
                  n151BarFasCod = false ;
               }
               pr_default.close(3);
               AV90Disnorma = (byte)(1) ;
               if ( ! (GXutil.strcmp("", AV89Norma)==0) && ( AV91Carvema == 1 ) )
               {
                  AV90Disnorma = (byte)(0) ;
                  /* Using cursor P06NZ12 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), AV89Norma});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A13213DisNormID = P06NZ12_A13213DisNormID[0] ;
                     AV90Disnorma = (byte)(1) ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(4);
               }
               AV92Tratamiento = (byte)(1) ;
               if ( ! (GXutil.strcmp("", AV88Trati)==0) && ( AV91Carvema == 1 ) )
               {
                  AV92Tratamiento = (byte)(0) ;
                  /* Using cursor P06NZ13 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV88Trati});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A13905BarTraID = P06NZ13_A13905BarTraID[0] ;
                     AV92Tratamiento = (byte)(1) ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(5);
               }
               if ( ( AV90Disnorma == 1 ) && ( AV92Tratamiento == 1 ) )
               {
                  AV84Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                  AV57KgsS = DecimalUtil.doubleToDec(0) ;
                  AV59AlbProCod = 0 ;
                  AV60AlbProFch = GXutil.nullDate() ;
                  /* Using cursor P06NZ14 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A1261BarAlbKgmE = P06NZ14_A1261BarAlbKgmE[0] ;
                     A30AlbProCod = P06NZ14_A30AlbProCod[0] ;
                     A34AlbProfch = P06NZ14_A34AlbProfch[0] ;
                     A34AlbProfch = P06NZ14_A34AlbProfch[0] ;
                     AV57KgsS = AV57KgsS.add(A1261BarAlbKgmE) ;
                     AV59AlbProCod = A30AlbProCod ;
                     AV60AlbProFch = A34AlbProfch ;
                     pr_default.readNext(6);
                  }
                  pr_default.close(6);
                  AV58PorMerma = (short)(0) ;
                  AV65Lam = GXutil.space( (short)(1)) ;
                  AV64BarKgm = ((A166BarKgm.doubleValue()==0)&&(AV85Samofil==1)&&(GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0) ? A192BarNumUni : A166BarKgm) ;
                  AV86BarPie = ((A198BarPie==0)&&(AV85Samofil==1) ? A191BarNumPie : A198BarPie) ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2827BarKgsLot)==0) )
                  {
                     AV64BarKgm = A2827BarKgsLot ;
                     AV65Lam = httpContext.getMessage( "L", "") ;
                  }
                  AV64BarKgm = ((A166BarKgm.doubleValue()==0)&&(AV85Samofil==0) ? DecimalUtil.doubleToDec(0) : AV64BarKgm) ;
                  GXt_char3 = AV93Color ;
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int5[0] = A129BarCod ;
                  GXv_int1[0] = A132BarCodReo ;
                  GXv_char6[0] = A130BarCodPar ;
                  GXv_char7[0] = GXt_char3 ;
                  new app.pnortt(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int1, GXv_char6, GXv_char7) ;
                  rprm019_impl.this.A396EmprCod = GXv_char4[0] ;
                  rprm019_impl.this.A129BarCod = GXv_int5[0] ;
                  rprm019_impl.this.A132BarCodReo = GXv_int1[0] ;
                  rprm019_impl.this.A130BarCodPar = GXv_char6[0] ;
                  rprm019_impl.this.GXt_char3 = GXv_char7[0] ;
                  AV93Color = GXt_char3 ;
                  if ( ( AV64BarKgm.doubleValue() > 0 ) && ( AV57KgsS.doubleValue() > 0 ) && ( A213BarSit >= 9 ) )
                  {
                     AV58PorMerma = (short)(DecimalUtil.decToDouble(((AV57KgsS.subtract(AV64BarKgm)).divide(AV64BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)))) ;
                  }
                  AV63Barser10 = GXutil.substring( A212BarSer, 1, 10) ;
                  AV69BarColNom = A135BarColNom ;
                  if ( AV68F_tinamar == 1 )
                  {
                     AV69BarColNom = A1234BarNomCli ;
                  }
                  if ( AV77Moda21 == 0 )
                  {
                     AV75barFecGen = A158BarFecFpr ;
                  }
                  else
                  {
                     AV75barFecGen = A159BarFecGen ;
                  }
                  if ( (0==AV91Carvema) )
                  {
                     h6NZ0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 15, Gx_line+0, 74, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 88, Gx_line+0, 147, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Barser10, "")), 299, Gx_line+0, 373, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69BarColNom, "")), 569, Gx_line+0, 665, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 670, Gx_line+0, 715, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64BarKgm, "ZZZZZ9.99")), 720, Gx_line+0, 787, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV75barFecGen, "99/99/99"), 153, Gx_line+0, 212, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57KgsS, "ZZZZZ9.99")), 803, Gx_line+0, 870, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58PorMerma), "ZZ9")), 882, Gx_line+0, 905, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59AlbProCod), "ZZZZZZZZZ9")), 916, Gx_line+0, 990, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV60AlbProFch, "99/99/99"), 994, Gx_line+0, 1053, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")), 1126, Gx_line+0, 1142, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A151BarFasCod, "")), 1058, Gx_line+0, 1117, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lam, "")), 791, Gx_line+0, 799, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 375, Gx_line+0, 566, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Hdr, "")), 216, Gx_line+0, 296, Gx_line+17, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     h6NZ0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 15, Gx_line+0, 74, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( A155BarFecCli, "99/99/99"), 88, Gx_line+0, 147, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 299, Gx_line+0, 417, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93Color, "")), 423, Gx_line+0, 643, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64BarKgm, "ZZZZZ9.99")), 664, Gx_line+0, 731, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(localUtil.format( AV75barFecGen, "99/99/99"), 153, Gx_line+0, 212, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57KgsS, "ZZZZZ9.99")), 747, Gx_line+0, 814, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58PorMerma), "ZZ9")), 826, Gx_line+0, 849, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59AlbProCod), "ZZZZZZZZZ9")), 859, Gx_line+0, 933, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(localUtil.format( AV60AlbProFch, "99/99/99"), 938, Gx_line+0, 997, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9")), 1070, Gx_line+0, 1086, Gx_line+18, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A151BarFasCod, "")), 1002, Gx_line+0, 1061, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lam, "")), 734, Gx_line+0, 742, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Hdr, "")), 216, Gx_line+0, 296, Gx_line+17, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  if ( A213BarSit == 9 )
                  {
                     AV80Barcod = A129BarCod ;
                     AV81barcodpar = A130BarCodPar ;
                     AV82Barcodreo = A132BarCodReo ;
                     /* Execute user subroutine: 'ALBBAR' */
                     S111 ();
                     if ( returnInSub )
                     {
                        pr_default.close(3);
                        pr_default.close(2);
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(1);
                        pr_default.close(1);
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  AV61TotKE = AV61TotKE.add(AV64BarKgm) ;
                  AV62TotKS = AV62TotKS.add(AV57KgsS) ;
               }
               brk6NZ3 = true ;
               pr_default.readNext(1);
            }
            if ( ! brk6NZ3 )
            {
               brk6NZ3 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         GxHdr3 = false ;
         if ( (0==AV91Carvema) )
         {
            h6NZ0( false, 23) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61TotKE, "ZZZZZ9.99")), 720, Gx_line+5, 787, Gx_line+23, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62TotKS, "ZZZZZ9.99")), 803, Gx_line+5, 870, Gx_line+23, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
         }
         else
         {
            h6NZ0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV61TotKE, "ZZZZZ9.99")), 664, Gx_line+0, 731, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV62TotKS, "ZZZZZ9.99")), 747, Gx_line+0, 814, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6NZ0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV83Num_l = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P06NZ15 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV80Barcod), Byte.valueOf(AV82Barcodreo), AV81barcodpar});
      cV83Num_l = P06NZ15_AV83Num_l[0] ;
      pr_default.close(7);
      AV83Num_l = (byte)(AV83Num_l+cV83Num_l*1) ;
      /* End optimized group. */
      if ( AV83Num_l > 1 )
      {
         /* Using cursor P06NZ16 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV80Barcod), Byte.valueOf(AV82Barcodreo), AV81barcodpar});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A130BarCodPar = P06NZ16_A130BarCodPar[0] ;
            A132BarCodReo = P06NZ16_A132BarCodReo[0] ;
            A129BarCod = P06NZ16_A129BarCod[0] ;
            A30AlbProCod = P06NZ16_A30AlbProCod[0] ;
            A34AlbProfch = P06NZ16_A34AlbProfch[0] ;
            A1261BarAlbKgmE = P06NZ16_A1261BarAlbKgmE[0] ;
            A34AlbProfch = P06NZ16_A34AlbProfch[0] ;
            h6NZ0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99")), 803, Gx_line+0, 870, Gx_line+18, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A34AlbProfch, "99/99/99"), 994, Gx_line+0, 1053, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), 916, Gx_line+0, 990, Gx_line+18, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
      }
   }

   public void h6NZ0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr3 )
            {
               if ( (0==AV91Carvema) )
               {
                  getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37NomEmp, "")), 7, Gx_line+17, 258, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit0, "")), 786, Gx_line+20, 850, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 855, Gx_line+20, 914, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 919, Gx_line+20, 1020, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit2, "")), 7, Gx_line+50, 250, Gx_line+72, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit3, "")), 925, Gx_line+50, 1001, Gx_line+67, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 976, Gx_line+50, 1027, Gx_line+67, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Encomenda", ""), 15, Gx_line+126, 85, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 15, Gx_line+145, 57, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data Enc", ""), 89, Gx_line+126, 145, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 96, Gx_line+145, 138, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 168, Gx_line+126, 197, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 216, Gx_line+145, 271, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 299, Gx_line+145, 334, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 569, Gx_line+145, 590, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 664, Gx_line+145, 710, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos ", ""), 744, Gx_line+126, 786, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 732, Gx_line+145, 785, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos ", ""), 827, Gx_line+126, 869, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 828, Gx_line+145, 869, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quebra", ""), 872, Gx_line+145, 916, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 882, Gx_line+126, 892, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Guia", ""), 960, Gx_line+145, 988, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(5, Gx_line+74, 1146, Gx_line+74, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(5, Gx_line+163, 1146, Gx_line+163, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 1008, Gx_line+126, 1037, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Guia", ""), 1008, Gx_line+145, 1036, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "S", ""), 1128, Gx_line+145, 1137, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 1073, Gx_line+145, 1102, Gx_line+159, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ultima", ""), 1069, Gx_line+126, 1106, Gx_line+140, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit5, "")), 25, Gx_line+92, 114, Gx_line+109, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 121, Gx_line+91, 166, Gx_line+109, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 178, Gx_line+91, 398, Gx_line+109, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Texto_d, "")), 153, Gx_line+144, 211, Gx_line+158, 1, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+167) ;
               }
               else
               {
                  getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37NomEmp, "")), 7, Gx_line+16, 258, Gx_line+38, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit0, "")), 786, Gx_line+19, 850, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 855, Gx_line+19, 914, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 919, Gx_line+19, 1020, Gx_line+36, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Lit2, "")), 7, Gx_line+49, 250, Gx_line+71, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Lit3, "")), 925, Gx_line+49, 1001, Gx_line+66, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 976, Gx_line+49, 1027, Gx_line+66, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Encomenda", ""), 15, Gx_line+125, 85, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 15, Gx_line+144, 57, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data Enc", ""), 89, Gx_line+125, 145, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 96, Gx_line+144, 138, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 168, Gx_line+125, 197, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 216, Gx_line+144, 271, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 299, Gx_line+144, 334, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 423, Gx_line+144, 444, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos ", ""), 688, Gx_line+125, 730, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 676, Gx_line+144, 729, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos ", ""), 771, Gx_line+125, 813, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 772, Gx_line+144, 813, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quebra", ""), 816, Gx_line+144, 860, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("%", 826, Gx_line+125, 836, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Guia", ""), 904, Gx_line+144, 932, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(5, Gx_line+73, 1146, Gx_line+73, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(5, Gx_line+161, 1146, Gx_line+161, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 952, Gx_line+125, 981, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Guia", ""), 952, Gx_line+144, 980, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "S", ""), 1072, Gx_line+144, 1081, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 1017, Gx_line+144, 1046, Gx_line+158, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ultima", ""), 1013, Gx_line+125, 1050, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit5, "")), 25, Gx_line+91, 114, Gx_line+108, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 121, Gx_line+90, 166, Gx_line+108, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 178, Gx_line+90, 398, Gx_line+108, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Texto_d, "")), 153, Gx_line+143, 211, Gx_line+157, 1, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+172) ;
               }
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV16PBarCodPar = "" ;
      AV19PColor = "" ;
      AV20PDisCli = "" ;
      AV21PFecDisCli = GXutil.nullDate() ;
      AV22PSerie = "" ;
      AV25UBarCodPar = "" ;
      AV28UColor = "" ;
      AV29UDisCli = "" ;
      AV30UFecDisCli = GXutil.nullDate() ;
      AV31USerie = "" ;
      AV55PfecEnt = GXutil.nullDate() ;
      AV56UfecEnt = GXutil.nullDate() ;
      AV66PSerDsc = "" ;
      AV67USerDsc = "" ;
      AV70NomClii = "" ;
      AV71NomClif = "" ;
      AV87Barcolnomin = "" ;
      AV89Norma = "" ;
      AV88Trati = "" ;
      AV33ImpCod = "" ;
      AV38Lit0 = "" ;
      AV39Lit1 = "" ;
      AV40Lit2 = "" ;
      AV41Lit3 = "" ;
      AV42Lit4 = "" ;
      AV43Lit5 = "" ;
      AV44Lit6 = "" ;
      AV45Lit7 = "" ;
      AV46Lit8 = "" ;
      AV47Lit9 = "" ;
      AV48Lit10 = "" ;
      AV49Lit11 = "" ;
      AV50Lit12 = "" ;
      AV51Lit13 = "" ;
      AV52Lit14 = "" ;
      AV53Lit15 = "" ;
      AV54Lit16 = "" ;
      scmdbuf = "" ;
      P06NZ2_A396EmprCod = new String[] {""} ;
      P06NZ2_A407EmprNom = new String[] {""} ;
      P06NZ2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV37NomEmp = "" ;
      AV76Texto_d = "" ;
      P06NZ6_A396EmprCod = new String[] {""} ;
      P06NZ6_A252CliCod = new int[1] ;
      P06NZ6_n252CliCod = new boolean[] {false} ;
      P06NZ6_A361DisCod = new int[1] ;
      P06NZ6_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NZ6_A228BarUniMed = new String[] {""} ;
      P06NZ6_A191BarNumPie = new short[1] ;
      P06NZ6_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NZ6_A213BarSit = new byte[1] ;
      P06NZ6_A212BarSer = new String[] {""} ;
      P06NZ6_A135BarColNom = new String[] {""} ;
      P06NZ6_A1234BarNomCli = new String[] {""} ;
      P06NZ6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P06NZ6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P06NZ6_A1652BarSerDsc = new String[] {""} ;
      P06NZ6_A136BarColNum = new int[1] ;
      P06NZ6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P06NZ6_A130BarCodPar = new String[] {""} ;
      P06NZ6_A132BarCodReo = new byte[1] ;
      P06NZ6_A129BarCod = new int[1] ;
      P06NZ6_A143BarDisNum = new String[] {""} ;
      P06NZ6_A217BarTipArt = new short[1] ;
      P06NZ6_n217BarTipArt = new boolean[] {false} ;
      P06NZ6_A1235BarNumCli = new int[1] ;
      P06NZ6_A279CliNom = new String[] {""} ;
      P06NZ6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NZ6_A151BarFasCod = new String[] {""} ;
      P06NZ6_n151BarFasCod = new boolean[] {false} ;
      P06NZ6_A199BarPie1 = new short[1] ;
      P06NZ6_A365DisDes = new String[] {""} ;
      P06NZ6_A898BarPieNDes = new int[1] ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A159BarFecGen = GXutil.nullDate() ;
      A1652BarSerDsc = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A365DisDes = "" ;
      P06NZ8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NZ8_A199BarPie1 = new short[1] ;
      P06NZ8_A898BarPieNDes = new int[1] ;
      P06NZ11_A151BarFasCod = new String[] {""} ;
      P06NZ11_n151BarFasCod = new boolean[] {false} ;
      P06NZ12_A396EmprCod = new String[] {""} ;
      P06NZ12_A361DisCod = new int[1] ;
      P06NZ12_A13213DisNormID = new String[] {""} ;
      A13213DisNormID = "" ;
      P06NZ13_A396EmprCod = new String[] {""} ;
      P06NZ13_A129BarCod = new int[1] ;
      P06NZ13_A132BarCodReo = new byte[1] ;
      P06NZ13_A130BarCodPar = new String[] {""} ;
      P06NZ13_A13905BarTraID = new String[] {""} ;
      A13905BarTraID = "" ;
      AV84Hdr = "" ;
      AV57KgsS = DecimalUtil.ZERO ;
      AV60AlbProFch = GXutil.nullDate() ;
      P06NZ14_A396EmprCod = new String[] {""} ;
      P06NZ14_A129BarCod = new int[1] ;
      P06NZ14_A132BarCodReo = new byte[1] ;
      P06NZ14_A130BarCodPar = new String[] {""} ;
      P06NZ14_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06NZ14_A30AlbProCod = new long[1] ;
      P06NZ14_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A34AlbProfch = GXutil.nullDate() ;
      AV65Lam = "" ;
      AV64BarKgm = DecimalUtil.ZERO ;
      AV93Color = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      AV63Barser10 = "" ;
      AV69BarColNom = "" ;
      AV75barFecGen = GXutil.nullDate() ;
      AV81barcodpar = "" ;
      AV61TotKE = DecimalUtil.ZERO ;
      AV62TotKS = DecimalUtil.ZERO ;
      P06NZ15_AV83Num_l = new byte[1] ;
      P06NZ16_A396EmprCod = new String[] {""} ;
      P06NZ16_A130BarCodPar = new String[] {""} ;
      P06NZ16_A132BarCodReo = new byte[1] ;
      P06NZ16_A129BarCod = new int[1] ;
      P06NZ16_A30AlbProCod = new long[1] ;
      P06NZ16_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P06NZ16_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprm019__default(),
         new Object[] {
             new Object[] {
            P06NZ2_A396EmprCod, P06NZ2_A407EmprNom, P06NZ2_n407EmprNom
            }
            , new Object[] {
            P06NZ6_A396EmprCod, P06NZ6_A252CliCod, P06NZ6_n252CliCod, P06NZ6_A361DisCod, P06NZ6_A192BarNumUni, P06NZ6_A228BarUniMed, P06NZ6_A191BarNumPie, P06NZ6_A2827BarKgsLot, P06NZ6_A213BarSit, P06NZ6_A212BarSer,
            P06NZ6_A135BarColNom, P06NZ6_A1234BarNomCli, P06NZ6_A158BarFecFpr, P06NZ6_A159BarFecGen, P06NZ6_A1652BarSerDsc, P06NZ6_A136BarColNum, P06NZ6_A155BarFecCli, P06NZ6_A130BarCodPar, P06NZ6_A132BarCodReo, P06NZ6_A129BarCod,
            P06NZ6_A143BarDisNum, P06NZ6_A217BarTipArt, P06NZ6_n217BarTipArt, P06NZ6_A1235BarNumCli, P06NZ6_A279CliNom, P06NZ6_A166BarKgm, P06NZ6_A151BarFasCod, P06NZ6_n151BarFasCod, P06NZ6_A199BarPie1, P06NZ6_A365DisDes,
            P06NZ6_A898BarPieNDes
            }
            , new Object[] {
            P06NZ8_A166BarKgm, P06NZ8_A199BarPie1, P06NZ8_A898BarPieNDes
            }
            , new Object[] {
            P06NZ11_A151BarFasCod, P06NZ11_n151BarFasCod
            }
            , new Object[] {
            P06NZ12_A396EmprCod, P06NZ12_A361DisCod, P06NZ12_A13213DisNormID
            }
            , new Object[] {
            P06NZ13_A396EmprCod, P06NZ13_A129BarCod, P06NZ13_A132BarCodReo, P06NZ13_A130BarCodPar, P06NZ13_A13905BarTraID
            }
            , new Object[] {
            P06NZ14_A396EmprCod, P06NZ14_A129BarCod, P06NZ14_A132BarCodReo, P06NZ14_A130BarCodPar, P06NZ14_A1261BarAlbKgmE, P06NZ14_A30AlbProCod, P06NZ14_A34AlbProfch
            }
            , new Object[] {
            P06NZ15_AV83Num_l
            }
            , new Object[] {
            P06NZ16_A396EmprCod, P06NZ16_A130BarCodPar, P06NZ16_A132BarCodReo, P06NZ16_A129BarCod, P06NZ16_A30AlbProCod, P06NZ16_A34AlbProfch, P06NZ16_A1261BarAlbKgmE
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17PBarCodReo ;
   private byte AV23PSitua ;
   private byte AV26UBarCodReo ;
   private byte AV32USitua ;
   private byte AV68F_tinamar ;
   private byte AV77Moda21 ;
   private byte AV85Samofil ;
   private byte AV91Carvema ;
   private byte GXt_int2 ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV90Disnorma ;
   private byte AV92Tratamiento ;
   private byte GXv_int1[] ;
   private byte AV82Barcodreo ;
   private byte AV83Num_l ;
   private byte cV83Num_l ;
   private short gxcookieaux ;
   private short AV78bartipart1 ;
   private short AV79bartipart2 ;
   private short A191BarNumPie ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short AV58PorMerma ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV15PBarCod ;
   private int AV18PColNum ;
   private int AV24UBarCod ;
   private int AV27UColNum ;
   private int AV72NumClii ;
   private int AV73NumClif ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV86BarPie ;
   private int GXv_int5[] ;
   private int Gx_OldLine ;
   private int AV80Barcod ;
   private long AV59AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV57KgsS ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal AV64BarKgm ;
   private java.math.BigDecimal AV61TotKE ;
   private java.math.BigDecimal AV62TotKS ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV16PBarCodPar ;
   private String AV19PColor ;
   private String AV20PDisCli ;
   private String AV22PSerie ;
   private String AV25UBarCodPar ;
   private String AV28UColor ;
   private String AV29UDisCli ;
   private String AV31USerie ;
   private String AV66PSerDsc ;
   private String AV67USerDsc ;
   private String AV70NomClii ;
   private String AV71NomClif ;
   private String AV87Barcolnomin ;
   private String AV89Norma ;
   private String AV88Trati ;
   private String AV33ImpCod ;
   private String AV38Lit0 ;
   private String AV39Lit1 ;
   private String AV40Lit2 ;
   private String AV41Lit3 ;
   private String AV42Lit4 ;
   private String AV43Lit5 ;
   private String AV44Lit6 ;
   private String AV45Lit7 ;
   private String AV46Lit8 ;
   private String AV47Lit9 ;
   private String AV48Lit10 ;
   private String AV49Lit11 ;
   private String AV50Lit12 ;
   private String AV51Lit13 ;
   private String AV52Lit14 ;
   private String AV53Lit15 ;
   private String AV54Lit16 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV37NomEmp ;
   private String AV76Texto_d ;
   private String A228BarUniMed ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A1652BarSerDsc ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A279CliNom ;
   private String A151BarFasCod ;
   private String A365DisDes ;
   private String A13213DisNormID ;
   private String A13905BarTraID ;
   private String AV84Hdr ;
   private String AV65Lam ;
   private String AV93Color ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String AV63Barser10 ;
   private String AV69BarColNom ;
   private String AV81barcodpar ;
   private String Gx_time ;
   private java.util.Date AV21PFecDisCli ;
   private java.util.Date AV30UFecDisCli ;
   private java.util.Date AV55PfecEnt ;
   private java.util.Date AV56UfecEnt ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV60AlbProFch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV75barFecGen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean brk6NZ3 ;
   private boolean n217BarTipArt ;
   private boolean n151BarFasCod ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06NZ2_A396EmprCod ;
   private String[] P06NZ2_A407EmprNom ;
   private boolean[] P06NZ2_n407EmprNom ;
   private String[] P06NZ6_A396EmprCod ;
   private int[] P06NZ6_A252CliCod ;
   private boolean[] P06NZ6_n252CliCod ;
   private int[] P06NZ6_A361DisCod ;
   private java.math.BigDecimal[] P06NZ6_A192BarNumUni ;
   private String[] P06NZ6_A228BarUniMed ;
   private short[] P06NZ6_A191BarNumPie ;
   private java.math.BigDecimal[] P06NZ6_A2827BarKgsLot ;
   private byte[] P06NZ6_A213BarSit ;
   private String[] P06NZ6_A212BarSer ;
   private String[] P06NZ6_A135BarColNom ;
   private String[] P06NZ6_A1234BarNomCli ;
   private java.util.Date[] P06NZ6_A158BarFecFpr ;
   private java.util.Date[] P06NZ6_A159BarFecGen ;
   private String[] P06NZ6_A1652BarSerDsc ;
   private int[] P06NZ6_A136BarColNum ;
   private java.util.Date[] P06NZ6_A155BarFecCli ;
   private String[] P06NZ6_A130BarCodPar ;
   private byte[] P06NZ6_A132BarCodReo ;
   private int[] P06NZ6_A129BarCod ;
   private String[] P06NZ6_A143BarDisNum ;
   private short[] P06NZ6_A217BarTipArt ;
   private boolean[] P06NZ6_n217BarTipArt ;
   private int[] P06NZ6_A1235BarNumCli ;
   private String[] P06NZ6_A279CliNom ;
   private java.math.BigDecimal[] P06NZ6_A166BarKgm ;
   private String[] P06NZ6_A151BarFasCod ;
   private boolean[] P06NZ6_n151BarFasCod ;
   private short[] P06NZ6_A199BarPie1 ;
   private String[] P06NZ6_A365DisDes ;
   private int[] P06NZ6_A898BarPieNDes ;
   private java.math.BigDecimal[] P06NZ8_A166BarKgm ;
   private short[] P06NZ8_A199BarPie1 ;
   private int[] P06NZ8_A898BarPieNDes ;
   private String[] P06NZ11_A151BarFasCod ;
   private boolean[] P06NZ11_n151BarFasCod ;
   private String[] P06NZ12_A396EmprCod ;
   private int[] P06NZ12_A361DisCod ;
   private String[] P06NZ12_A13213DisNormID ;
   private String[] P06NZ13_A396EmprCod ;
   private int[] P06NZ13_A129BarCod ;
   private byte[] P06NZ13_A132BarCodReo ;
   private String[] P06NZ13_A130BarCodPar ;
   private String[] P06NZ13_A13905BarTraID ;
   private String[] P06NZ14_A396EmprCod ;
   private int[] P06NZ14_A129BarCod ;
   private byte[] P06NZ14_A132BarCodReo ;
   private String[] P06NZ14_A130BarCodPar ;
   private java.math.BigDecimal[] P06NZ14_A1261BarAlbKgmE ;
   private long[] P06NZ14_A30AlbProCod ;
   private java.util.Date[] P06NZ14_A34AlbProfch ;
   private byte[] P06NZ15_AV83Num_l ;
   private String[] P06NZ16_A396EmprCod ;
   private String[] P06NZ16_A130BarCodPar ;
   private byte[] P06NZ16_A132BarCodReo ;
   private int[] P06NZ16_A129BarCod ;
   private long[] P06NZ16_A30AlbProCod ;
   private java.util.Date[] P06NZ16_A34AlbProfch ;
   private java.math.BigDecimal[] P06NZ16_A1261BarAlbKgmE ;
}

final  class rprm019__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06NZ2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NZ6", "SELECT T1.EmprCod, T1.CliCod, T1.DisCod, T1.BarNumUni, T1.BarUniMed, T1.BarNumPie, T1.BarKgsLot, T1.BarSit, T1.BarSer, T1.BarColNom, T1.BarNomCli, T1.BarFecFpr, T1.BarFecGen, T1.BarSerDsc, T1.BarColNum, T1.BarFecCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarTipArt, T1.BarNumCli, T4.CliNom, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarFasCod, ' ') AS BarFasCod, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) WHERE (T5.BarOrdLin = T6.GXC2) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.BarDisNum >= ? and T1.BarCod >= ? and T1.BarCodReo >= ? and T1.BarCodPar >= ?) AND (T1.BarCod <= ?) AND (T1.BarCodReo <= ?) AND (T1.BarCodPar <= ?) AND (T1.BarSer >= ? and T1.BarSer <= ?) AND (T1.BarColNom >= ? and T1.BarColNom <= ?) AND (T1.BarColNum >= ? and T1.BarColNum <= ?) AND (T1.BarFecCli >= ? and T1.BarFecCli <= ?) AND (T1.BarSit >= ? and T1.BarSit <= ?) AND (T1.BarFecFpr >= ? and T1.BarFecFpr <= ?) AND (T1.BarSerDsc >= ? and T1.BarSerDsc <= ?) AND (T1.BarNomCli >= ? and T1.BarNomCli <= ?) AND (T1.BarNumCli >= ? and T1.BarNumCli <= ?) AND (T1.BarTipArt >= ? and T1.BarTipArt <= ?) AND (T1.BarColNom <> ? or (rtrim(?) IS NULL)) AND (T1.BarDisNum <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NZ8", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NZ11", "SELECT COALESCE( T1.BarFasCod, ' ') AS BarFasCod FROM (SELECT MIN(T2.FasCod) AS BarFasCod, T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar FROM (TXPBARFAS T2 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T2.EmprCod AND T3.BarCod = T2.BarCod AND T3.BarCodReo = T2.BarCodReo AND T3.BarCodPar = T2.BarCodPar) WHERE (T2.BarOrdLin = T3.GXC2) AND (T2.BarFasEst <> 0) GROUP BY T2.EmprCod, T2.BarCod, T2.BarCodReo, T2.BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NZ12", "SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? and DisNormID = ? ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NZ13", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID FROM TXPBARTTI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarTraID = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06NZ14", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE, T1.AlbProCod, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NZ15", "SELECT COUNT(*) FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06NZ16", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T2.AlbProfch, T1.BarAlbKgmE FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 30);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[26])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((int[]) buf[30])[0] = rslt.getInt(28);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
               stmt.setString(10, (String)parms[10], 16);
               stmt.setString(11, (String)parms[11], 16);
               stmt.setString(12, (String)parms[12], 13);
               stmt.setString(13, (String)parms[13], 13);
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setDate(16, (java.util.Date)parms[16]);
               stmt.setDate(17, (java.util.Date)parms[17]);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setByte(19, ((Number) parms[19]).byteValue());
               stmt.setDate(20, (java.util.Date)parms[20]);
               stmt.setDate(21, (java.util.Date)parms[21]);
               stmt.setString(22, (String)parms[22], 26);
               stmt.setString(23, (String)parms[23], 26);
               stmt.setString(24, (String)parms[24], 13);
               stmt.setString(25, (String)parms[25], 13);
               stmt.setInt(26, ((Number) parms[26]).intValue());
               stmt.setInt(27, ((Number) parms[27]).intValue());
               stmt.setShort(28, ((Number) parms[28]).shortValue());
               stmt.setShort(29, ((Number) parms[29]).shortValue());
               stmt.setString(30, (String)parms[30], 13);
               stmt.setString(31, (String)parms[31], 13);
               stmt.setString(32, (String)parms[32], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 4);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

