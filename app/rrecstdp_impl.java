package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rrecstdp_impl extends GXWebReport
{
   public rrecstdp_impl( com.genexus.internet.HttpContext context )
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
         AV44EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV11BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            AV13BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            AV12BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV15BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
            AV17BarSua = httpContext.GetPar( "BarSua") ;
            AV156Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            AV148RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            AV91ImpCod = httpContext.GetPar( "ImpCod") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
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
      M_bot = 2 ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*2)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: 'INICIAR' */
         S201 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P06S63 */
         pr_default.execute(0, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P06S63_A361DisCod[0] ;
            A396EmprCod = P06S63_A396EmprCod[0] ;
            A130BarCodPar = P06S63_A130BarCodPar[0] ;
            A132BarCodReo = P06S63_A132BarCodReo[0] ;
            A129BarCod = P06S63_A129BarCod[0] ;
            A2829BarProPer = P06S63_A2829BarProPer[0] ;
            A252CliCod = P06S63_A252CliCod[0] ;
            n252CliCod = P06S63_n252CliCod[0] ;
            A212BarSer = P06S63_A212BarSer[0] ;
            A135BarColNom = P06S63_A135BarColNom[0] ;
            A136BarColNum = P06S63_A136BarColNum[0] ;
            A218BarTipCol = P06S63_A218BarTipCol[0] ;
            A1652BarSerDsc = P06S63_A1652BarSerDsc[0] ;
            A148BarEstReo = P06S63_A148BarEstReo[0] ;
            A1431BarLocDis = P06S63_A1431BarLocDis[0] ;
            A4845BarAudObs = P06S63_A4845BarAudObs[0] ;
            n4845BarAudObs = P06S63_n4845BarAudObs[0] ;
            A166BarKgm = P06S63_A166BarKgm[0] ;
            A184BarMtr = P06S63_A184BarMtr[0] ;
            A199BarPie1 = P06S63_A199BarPie1[0] ;
            A365DisDes = P06S63_A365DisDes[0] ;
            A898BarPieNDes = P06S63_A898BarPieNDes[0] ;
            A166BarKgm = P06S63_A166BarKgm[0] ;
            A184BarMtr = P06S63_A184BarMtr[0] ;
            A199BarPie1 = P06S63_A199BarPie1[0] ;
            A898BarPieNDes = P06S63_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV296Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S221 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV301NormaDsc = ((AV246Moda21==1) ? GXutil.trim( AV295Dsc_Idtx) : " ") ;
            AV162Cliente = A252CliCod ;
            AV161ForSer = A212BarSer ;
            AV110ForColNom = A135BarColNom ;
            AV111ForColNum = A136BarColNum ;
            AV117TipColCod = A218BarTipCol ;
            AV113Serie = A1652BarSerDsc ;
            AV191Texto_r = "" ;
            AV190DSCCAUSA = "" ;
            /* Execute user subroutine: 'ARTICU' */
            S211 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( A148BarEstReo == 1 ) && ( AV163FlagEnd == 1 ) )
            {
               /* Execute user subroutine: 'HISREO' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV208BarKgm = A166BarKgm ;
            AV209BarMtr = A184BarMtr ;
            AV210BarPie = A198BarPie ;
            GX_I = 1 ;
            while ( GX_I <= 9 )
            {
               AV216Obstxt[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            AV90I = (byte)(1) ;
            /* Using cursor P06S64 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A377DisObsTxt = P06S64_A377DisObsTxt[0] ;
               A376DisObsLin = P06S64_A376DisObsLin[0] ;
               AV216Obstxt[AV90I-1] = A377DisObsTxt ;
               AV90I = (byte)(AV90I+1) ;
               if ( AV90I > 9 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            GXv_int1[0] = AV222barmaccod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int1) ;
            rrecstdp_impl.this.AV222barmaccod = GXv_int1[0] ;
            AV232Albrloc = " " ;
            AV233Lit99 = "" ;
            /* Execute user subroutine: 'LOTES' */
            S191 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV232Albrloc = ((AV294brochado==1) ? AV295Dsc_Idtx : AV232Albrloc) ;
            AV244barlocdis = A1431BarLocDis ;
            AV257Baraudobs = A4845BarAudObs ;
            GXv_char2[0] = AV302DisNormID ;
            GXv_char3[0] = AV303DisTraID ;
            new app.pnormtt(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A361DisCod, GXv_char2, GXv_char3) ;
            rrecstdp_impl.this.AV302DisNormID = GXv_char2[0] ;
            rrecstdp_impl.this.AV303DisTraID = GXv_char3[0] ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char3[0] = AV92Intens ;
         GXv_char2[0] = AV135Matiz ;
         GXv_int4[0] = AV134MatCod ;
         GXv_int5[0] = AV117TipColCod ;
         GXv_char6[0] = AV116TipCol ;
         GXv_char7[0] = AV118Tonalidad ;
         GXv_int1[0] = AV142NumCli ;
         GXv_char8[0] = AV182ForTonal ;
         GXv_char9[0] = AV172DscSol ;
         GXv_int10[0] = AV173CodSol ;
         GXv_char11[0] = AV225Macprocod ;
         GXv_char12[0] = AV235ForNomcli3 ;
         new app.pmasinf(remoteHandle, context).execute( AV44EmprCod, AV162Cliente, AV161ForSer, AV110ForColNom, AV111ForColNum, AV117TipColCod, GXv_char3, GXv_char2, GXv_int4, GXv_int5, GXv_char6, GXv_char7, GXv_int1, GXv_char8, GXv_char9, GXv_int10, GXv_char11, GXv_char12) ;
         rrecstdp_impl.this.AV92Intens = GXv_char3[0] ;
         rrecstdp_impl.this.AV135Matiz = GXv_char2[0] ;
         rrecstdp_impl.this.AV134MatCod = GXv_int4[0] ;
         rrecstdp_impl.this.AV117TipColCod = GXv_int5[0] ;
         rrecstdp_impl.this.AV116TipCol = GXv_char6[0] ;
         rrecstdp_impl.this.AV118Tonalidad = GXv_char7[0] ;
         rrecstdp_impl.this.AV142NumCli = GXv_int1[0] ;
         rrecstdp_impl.this.AV182ForTonal = GXv_char8[0] ;
         rrecstdp_impl.this.AV172DscSol = GXv_char9[0] ;
         rrecstdp_impl.this.AV173CodSol = GXv_int10[0] ;
         rrecstdp_impl.this.AV225Macprocod = GXv_char11[0] ;
         rrecstdp_impl.this.AV235ForNomcli3 = GXv_char12[0] ;
         /* Using cursor P06S65 */
         pr_default.execute(2, new Object[] {AV44EmprCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A396EmprCod = P06S65_A396EmprCod[0] ;
            A407EmprNom = P06S65_A407EmprNom[0] ;
            n407EmprNom = P06S65_n407EmprNom[0] ;
            AV139NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GXt_char13 = AV114Termin ;
         GXv_char12[0] = GXt_char13 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char12) ;
         rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
         AV114Termin = GXt_char13 ;
         /* Using cursor P06S66 */
         pr_default.execute(3, new Object[] {AV114Termin});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A942TermCod = P06S66_A942TermCod[0] ;
            A1189TermUsu = P06S66_A1189TermUsu[0] ;
            n1189TermUsu = P06S66_n1189TermUsu[0] ;
            AV61TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV35Coste = DecimalUtil.doubleToDec(0) ;
         AV36Coste2 = DecimalUtil.doubleToDec(0) ;
         AV38DesCol = GXutil.substring( AV116TipCol, 1, 15) ;
         AV39DesInt = GXutil.substring( AV92Intens, 1, 20) ;
         GxHdr6 = true ;
         /* Using cursor P06S69 */
         pr_default.execute(4, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar, Short.valueOf(AV148RecLinMaq)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A3915EmpNumDec = P06S69_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06S69_n3915EmpNumDec[0] ;
            A130BarCodPar = P06S69_A130BarCodPar[0] ;
            A132BarCodReo = P06S69_A132BarCodReo[0] ;
            A396EmprCod = P06S69_A396EmprCod[0] ;
            A129BarCod = P06S69_A129BarCod[0] ;
            A2804RecLinMaq = P06S69_A2804RecLinMaq[0] ;
            A12270Rsedo7 = P06S69_A12270Rsedo7[0] ;
            A12273Rsedo10 = P06S69_A12273Rsedo10[0] ;
            A12274Rsedo11 = P06S69_A12274Rsedo11[0] ;
            A12272Rsedo9 = P06S69_A12272Rsedo9[0] ;
            A361DisCod = P06S69_A361DisCod[0] ;
            A206BarPle = P06S69_A206BarPle[0] ;
            A118BarAcaQui = P06S69_A118BarAcaQui[0] ;
            A602MaqCod = P06S69_A602MaqCod[0] ;
            A4609BarMdlCod = P06S69_A4609BarMdlCod[0] ;
            A9777BarItem3 = P06S69_A9777BarItem3[0] ;
            A4812BarEncCli = P06S69_A4812BarEncCli[0] ;
            A148BarEstReo = P06S69_A148BarEstReo[0] ;
            A3006BarCoef = P06S69_A3006BarCoef[0] ;
            n3006BarCoef = P06S69_n3006BarCoef[0] ;
            A1226BarGraCru = P06S69_A1226BarGraCru[0] ;
            A3629CliObs = P06S69_A3629CliObs[0] ;
            A5109RecNumInt = P06S69_A5109RecNumInt[0] ;
            A4866RecFecAlt = P06S69_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P06S69_n4866RecFecAlt[0] ;
            A4402RecUsrCod = P06S69_A4402RecUsrCod[0] ;
            A4867RecFecMod = P06S69_A4867RecFecMod[0] ;
            n4867RecFecMod = P06S69_n4867RecFecMod[0] ;
            A4868RecUsrMod = P06S69_A4868RecUsrMod[0] ;
            n4868RecUsrMod = P06S69_n4868RecUsrMod[0] ;
            A212BarSer = P06S69_A212BarSer[0] ;
            A224BarTraP1 = P06S69_A224BarTraP1[0] ;
            A221BarTra1 = P06S69_A221BarTra1[0] ;
            A225BarTraP2 = P06S69_A225BarTraP2[0] ;
            A222BarTra2 = P06S69_A222BarTra2[0] ;
            A226BarTraP3 = P06S69_A226BarTraP3[0] ;
            A223BarTra3 = P06S69_A223BarTra3[0] ;
            A232BarUrdP1 = P06S69_A232BarUrdP1[0] ;
            A229BarUrd1 = P06S69_A229BarUrd1[0] ;
            A233BarUrdP2 = P06S69_A233BarUrdP2[0] ;
            A230BarUrd2 = P06S69_A230BarUrd2[0] ;
            A234BarUrdP3 = P06S69_A234BarUrdP3[0] ;
            A231BarUrd3 = P06S69_A231BarUrd3[0] ;
            A217BarTipArt = P06S69_A217BarTipArt[0] ;
            n217BarTipArt = P06S69_n217BarTipArt[0] ;
            A135BarColNom = P06S69_A135BarColNom[0] ;
            A125BarAncAca1 = P06S69_A125BarAncAca1[0] ;
            A1909BarGraAca = P06S69_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P06S69_A3137BarGraAca2[0] ;
            A126BarAncAca2 = P06S69_A126BarAncAca2[0] ;
            A1652BarSerDsc = P06S69_A1652BarSerDsc[0] ;
            A2806RecFA = P06S69_A2806RecFA[0] ;
            A5110RecNumPrg = P06S69_A5110RecNumPrg[0] ;
            A218BarTipCol = P06S69_A218BarTipCol[0] ;
            A1235BarNumCli = P06S69_A1235BarNumCli[0] ;
            A1234BarNomCli = P06S69_A1234BarNomCli[0] ;
            A136BarColNum = P06S69_A136BarColNum[0] ;
            A279CliNom = P06S69_A279CliNom[0] ;
            A252CliCod = P06S69_A252CliCod[0] ;
            n252CliCod = P06S69_n252CliCod[0] ;
            A143BarDisNum = P06S69_A143BarDisNum[0] ;
            A2454BarGirar = P06S69_A2454BarGirar[0] ;
            A1503BarPart = P06S69_A1503BarPart[0] ;
            A9775BarItem1 = P06S69_A9775BarItem1[0] ;
            A4259RecTotKgs = P06S69_A4259RecTotKgs[0] ;
            A199BarPie1 = P06S69_A199BarPie1[0] ;
            A365DisDes = P06S69_A365DisDes[0] ;
            A898BarPieNDes = P06S69_A898BarPieNDes[0] ;
            A220BarTotPie = P06S69_A220BarTotPie[0] ;
            A184BarMtr = P06S69_A184BarMtr[0] ;
            A870BarTotMtr = P06S69_A870BarTotMtr[0] ;
            A166BarKgm = P06S69_A166BarKgm[0] ;
            A219BarTotAgr = P06S69_A219BarTotAgr[0] ;
            A3915EmpNumDec = P06S69_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06S69_n3915EmpNumDec[0] ;
            A361DisCod = P06S69_A361DisCod[0] ;
            A206BarPle = P06S69_A206BarPle[0] ;
            A118BarAcaQui = P06S69_A118BarAcaQui[0] ;
            A4609BarMdlCod = P06S69_A4609BarMdlCod[0] ;
            A9777BarItem3 = P06S69_A9777BarItem3[0] ;
            A4812BarEncCli = P06S69_A4812BarEncCli[0] ;
            A148BarEstReo = P06S69_A148BarEstReo[0] ;
            A3006BarCoef = P06S69_A3006BarCoef[0] ;
            n3006BarCoef = P06S69_n3006BarCoef[0] ;
            A1226BarGraCru = P06S69_A1226BarGraCru[0] ;
            A212BarSer = P06S69_A212BarSer[0] ;
            A224BarTraP1 = P06S69_A224BarTraP1[0] ;
            A221BarTra1 = P06S69_A221BarTra1[0] ;
            A225BarTraP2 = P06S69_A225BarTraP2[0] ;
            A222BarTra2 = P06S69_A222BarTra2[0] ;
            A226BarTraP3 = P06S69_A226BarTraP3[0] ;
            A223BarTra3 = P06S69_A223BarTra3[0] ;
            A232BarUrdP1 = P06S69_A232BarUrdP1[0] ;
            A229BarUrd1 = P06S69_A229BarUrd1[0] ;
            A233BarUrdP2 = P06S69_A233BarUrdP2[0] ;
            A230BarUrd2 = P06S69_A230BarUrd2[0] ;
            A234BarUrdP3 = P06S69_A234BarUrdP3[0] ;
            A231BarUrd3 = P06S69_A231BarUrd3[0] ;
            A217BarTipArt = P06S69_A217BarTipArt[0] ;
            n217BarTipArt = P06S69_n217BarTipArt[0] ;
            A135BarColNom = P06S69_A135BarColNom[0] ;
            A125BarAncAca1 = P06S69_A125BarAncAca1[0] ;
            A1909BarGraAca = P06S69_A1909BarGraAca[0] ;
            A3137BarGraAca2 = P06S69_A3137BarGraAca2[0] ;
            A126BarAncAca2 = P06S69_A126BarAncAca2[0] ;
            A1652BarSerDsc = P06S69_A1652BarSerDsc[0] ;
            A218BarTipCol = P06S69_A218BarTipCol[0] ;
            A1235BarNumCli = P06S69_A1235BarNumCli[0] ;
            A1234BarNomCli = P06S69_A1234BarNomCli[0] ;
            A136BarColNum = P06S69_A136BarColNum[0] ;
            A252CliCod = P06S69_A252CliCod[0] ;
            n252CliCod = P06S69_n252CliCod[0] ;
            A143BarDisNum = P06S69_A143BarDisNum[0] ;
            A2454BarGirar = P06S69_A2454BarGirar[0] ;
            A1503BarPart = P06S69_A1503BarPart[0] ;
            A9775BarItem1 = P06S69_A9775BarItem1[0] ;
            A365DisDes = P06S69_A365DisDes[0] ;
            A3629CliObs = P06S69_A3629CliObs[0] ;
            A279CliNom = P06S69_A279CliNom[0] ;
            A220BarTotPie = P06S69_A220BarTotPie[0] ;
            A870BarTotMtr = P06S69_A870BarTotMtr[0] ;
            A219BarTotAgr = P06S69_A219BarTotAgr[0] ;
            A199BarPie1 = P06S69_A199BarPie1[0] ;
            A898BarPieNDes = P06S69_A898BarPieNDes[0] ;
            A184BarMtr = P06S69_A184BarMtr[0] ;
            A166BarKgm = P06S69_A166BarKgm[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            if ( A220BarTotPie != 0 )
            {
               A813RecTotPie = (int)(A220BarTotPie+A198BarPie) ;
            }
            else
            {
               A813RecTotPie = A198BarPie ;
            }
            if ( A870BarTotMtr.doubleValue() != 0 )
            {
               A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
            }
            else
            {
               A871RecTotMtr = A184BarMtr ;
            }
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            AV286Tvueltas = A12270Rsedo7 ;
            AV287Vbomba = A12273Rsedo10 ;
            AV288Vsarillo = A12274Rsedo11 ;
            AV289Ainjector = A12272Rsedo9 ;
            GXv_int1[0] = AV193MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int1) ;
            rrecstdp_impl.this.AV193MacCod = GXv_int1[0] ;
            if ( AV236JPF == 1 )
            {
               GXv_char12[0] = A396EmprCod ;
               GXv_int1[0] = A129BarCod ;
               GXv_int5[0] = A132BarCodReo ;
               GXv_char11[0] = A130BarCodPar ;
               GXv_char9[0] = AV237BarCal ;
               new app.pmetpie(remoteHandle, context).execute( GXv_char12, GXv_int1, GXv_int5, GXv_char11, GXv_char9) ;
               rrecstdp_impl.this.A396EmprCod = GXv_char12[0] ;
               rrecstdp_impl.this.A129BarCod = GXv_int1[0] ;
               rrecstdp_impl.this.A132BarCodReo = GXv_int5[0] ;
               rrecstdp_impl.this.A130BarCodPar = GXv_char11[0] ;
               rrecstdp_impl.this.AV237BarCal = GXv_char9[0] ;
            }
            AV218DesAcaqui = "" ;
            AV219BarPle = "" ;
            if ( AV215erfoc == 1 )
            {
               AV219BarPle = A206BarPle ;
               GXv_char12[0] = A396EmprCod ;
               GXv_char11[0] = A118BarAcaQui ;
               GXv_int5[0] = (byte)(0) ;
               GXv_char9[0] = AV218DesAcaqui ;
               new app.pbusprot(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_int5, GXv_char9) ;
               rrecstdp_impl.this.A396EmprCod = GXv_char12[0] ;
               rrecstdp_impl.this.A118BarAcaQui = GXv_char11[0] ;
               rrecstdp_impl.this.AV218DesAcaqui = GXv_char9[0] ;
            }
            AV231RecNumPrg = A5110RecNumPrg ;
            GXv_char12[0] = A396EmprCod ;
            GXv_char11[0] = A5110RecNumPrg ;
            GXv_char9[0] = AV230MacProDsc ;
            new app.pbuftdsc(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char9) ;
            rrecstdp_impl.this.A396EmprCod = GXv_char12[0] ;
            rrecstdp_impl.this.A5110RecNumPrg = GXv_char11[0] ;
            rrecstdp_impl.this.AV230MacProDsc = GXv_char9[0] ;
            AV205MaqCod = A602MaqCod ;
            /* Execute user subroutine: 'MAQUIN' */
            S181 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV195Partida = A1503BarPart ;
            AV214BarMdlcod = A4609BarMdlCod ;
            AV264Baritem1 = GXutil.substring( A9775BarItem1, 1, 10) ;
            AV265BarItem3 = GXutil.substring( A9777BarItem3, 1, 10) ;
            AV285BarEnccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
            if ( AV215erfoc == 0 )
            {
               AV214BarMdlcod = GXutil.space( (short)(13)) ;
               AV213Lit53 = " " ;
               AV266Litnop = " " ;
               AV267Litnov = " " ;
               AV264Baritem1 = " " ;
               AV265BarItem3 = " " ;
            }
            AV19CliCod = A252CliCod ;
            AV8ArtCod = A212BarSer ;
            AV110ForColNom = A135BarColNom ;
            AV111ForColNum = A136BarColNum ;
            AV25Colorante = AV117TipColCod ;
            if ( ( AV146RecAca == 1 ) && ( GXutil.strcmp(GXutil.substring( AV15BarMaqCod, 1, 2), httpContext.getMessage( "TI", "")) != 0 ) )
            {
               GXv_char12[0] = AV31ContDsc ;
               new app.pexidsc(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "RECACA", ""), GXv_char12) ;
               rrecstdp_impl.this.AV31ContDsc = GXv_char12[0] ;
               GXt_char13 = AV94Lit0 ;
               GXv_char12[0] = GXt_char13 ;
               new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN046", ""), (byte)(99), GXv_char12) ;
               rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
               AV94Lit0 = GXt_char13 ;
            }
            AV62Remonta = "" ;
            if ( A148BarEstReo >= 1 )
            {
               AV62Remonta = AV125Lit44 ;
            }
            AV93Largura = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
            AV14BarGraAca = A1909BarGraAca ;
            AV115TiempoV = A3006BarCoef ;
            AV87GrMlin = DecimalUtil.doubleToDec(A1226BarGraCru*(A125BarAncAca1/ (double) (100))) ;
            AV27CompTP = DecimalUtil.doubleToDec(0) ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87GrMlin)==0) )
            {
               AV27CompTP = (A812RecTotKgm.multiply(DecimalUtil.doubleToDec(1000))).divide(AV87GrMlin, 18, java.math.RoundingMode.DOWN) ;
            }
            AV131Lts1 = AV156Volumen ;
            AV132Lts2 = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV131Lts1).subtract(((DecimalUtil.doubleToDec(2).multiply(A812RecTotKgm)).multiply(DecimalUtil.stringToDec("0.9")))))) ;
            AV149RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV156Volumen).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN)), 0))) ;
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV58Procesos[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV59Tiempos[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV90I = (byte)(1) ;
            AV119TotTiempo = 0 ;
            /* Using cursor P06S610 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV148RecLinMaq)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A2804RecLinMaq = P06S610_A2804RecLinMaq[0] ;
               A764ProForCod = P06S610_A764ProForCod[0] ;
               A771ProForTie = P06S610_A771ProForTie[0] ;
               A1273RecLinPro = P06S610_A1273RecLinPro[0] ;
               A771ProForTie = P06S610_A771ProForTie[0] ;
               AV58Procesos[AV90I-1] = A764ProForCod ;
               AV59Tiempos[AV90I-1] = A771ProForTie ;
               AV119TotTiempo = (long)(AV119TotTiempo+A771ProForTie) ;
               AV90I = (byte)(AV90I+1) ;
               if ( AV90I > 6 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV180RecObs[GX_I-1] = GXutil.space( (short)(60)) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV90I = (byte)(1) ;
            /* Using cursor P06S611 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A5258RecTxtObs = P06S611_A5258RecTxtObs[0] ;
               n5258RecTxtObs = P06S611_n5258RecTxtObs[0] ;
               A5257RecLinObs = P06S611_A5257RecLinObs[0] ;
               if ( AV90I > 10 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV180RecObs[AV90I-1] = A5258RecTxtObs ;
               AV90I = (byte)(AV90I+1) ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            AV298Hdrcode39 = ((GXutil.strcmp(A130BarCodPar, "")==0) ? GXutil.trim( GXutil.str( A129BarCod, 8, 0))+GXutil.str( A132BarCodReo, 1, 0) : GXutil.trim( GXutil.str( A129BarCod, 8, 0))+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar) ;
            AV300Code39 = "*" + GXutil.rtrim( GXutil.trim( AV298Hdrcode39)) + "*" ;
            AV299hdrcode39azalea = AV300Code39 ;
            AV89HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV63Hdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            AV241ceros8 = "00000000" ;
            AV239HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
            AV239HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV239HdrAlfa)) ;
            AV242Lenvar = (byte)(GXutil.len( AV239HdrAlfa)) ;
            AV242Lenvar = (byte)(8-AV242Lenvar) ;
            AV198MaqCdb = "*" + AV15BarMaqCod + "*" ;
            AV206VolProd = 0 ;
            AV207VolCor = 0 ;
            if ( ( AV204Dosea > 0 ) && ( AV211Tejido == 1 ) )
            {
               AV206VolProd = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(AV156Volumen/ (double) (AV204Dosea)), 0))) ;
               AV207VolCor = (int)(AV156Volumen-AV206VolProd) ;
            }
            AV269Tot_kgs = A812RecTotKgm ;
            AV270M = "" ;
            if ( ( A4259RecTotKgs.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A812RecTotKgm, A4259RecTotKgs) != 0 ) )
            {
               AV269Tot_kgs = A4259RecTotKgs ;
               AV270M = "*" ;
            }
            /* Execute user subroutine: 'DESCMAQ' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( (0==AV141NumCam) )
            {
               AV141NumCam = (byte)(1) ;
            }
            AV26CompCamar = (AV27CompTP.divide(DecimalUtil.doubleToDec(AV141NumCam), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(80)).divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
            /* Using cursor P06S612 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV148RecLinMaq)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A1273RecLinPro = P06S612_A1273RecLinPro[0] ;
               A2804RecLinMaq = P06S612_A2804RecLinMaq[0] ;
               A2392ProNumPro = P06S612_A2392ProNumPro[0] ;
               A4697RecNroPrg = P06S612_A4697RecNroPrg[0] ;
               A2393ProNumRec = P06S612_A2393ProNumRec[0] ;
               A1251RecNumRec = P06S612_A1251RecNumRec[0] ;
               A764ProForCod = P06S612_A764ProForCod[0] ;
               A4695RecVolPrf = P06S612_A4695RecVolPrf[0] ;
               A766ProForDsc = P06S612_A766ProForDsc[0] ;
               A771ProForTie = P06S612_A771ProForTie[0] ;
               A2392ProNumPro = P06S612_A2392ProNumPro[0] ;
               A2393ProNumRec = P06S612_A2393ProNumRec[0] ;
               A766ProForDsc = P06S612_A766ProForDsc[0] ;
               A771ProForTie = P06S612_A771ProForTie[0] ;
               AV199ProNumPro = A2392ProNumPro ;
               if ( A4697RecNroPrg > 0 )
               {
                  AV199ProNumPro = A4697RecNroPrg ;
               }
               AV263Pronumrec = A2393ProNumRec ;
               if ( A1251RecNumRec > 0 )
               {
                  AV263Pronumrec = A1251RecNumRec ;
               }
               AV200Proforcod = A764ProForCod ;
               h6S60( false, 24) ;
               getPrinter().GxDrawRect(6, Gx_line+2, 797, Gx_line+23, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m", ""), 451, Gx_line+4, 462, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 34, Gx_line+4, 84, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 414, Gx_line+4, 444, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 97, Gx_line+4, 286, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV199ProNumPro), "ZZZZ9")), 570, Gx_line+4, 607, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV263Pronumrec), "ZZZZ9")), 686, Gx_line+4, 723, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit35, "")), 343, Gx_line+4, 415, Gx_line+20, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Lit36, "")), 469, Gx_line+4, 552, Gx_line+21, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit37, "")), 625, Gx_line+4, 683, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9")), 733, Gx_line+4, 765, Gx_line+21, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
               /* Using cursor P06S613 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A719PrdNum = P06S613_A719PrdNum[0] ;
                  n719PrdNum = P06S613_n719PrdNum[0] ;
                  A431FacCon = P06S613_A431FacCon[0] ;
                  A3274RecPrdTnq = P06S613_A3274RecPrdTnq[0] ;
                  A4900PrdCanMac = P06S613_A4900PrdCanMac[0] ;
                  A5725RecLote = P06S613_A5725RecLote[0] ;
                  A490ForPrdUMe = P06S613_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P06S613_n490ForPrdUMe[0] ;
                  A1643PrdTip = P06S613_A1643PrdTip[0] ;
                  A2394RecForNro = P06S613_A2394RecForNro[0] ;
                  A686PrdCant = P06S613_A686PrdCant[0] ;
                  A872RecPrdNum = P06S613_A872RecPrdNum[0] ;
                  A875RecPrdDsc = P06S613_A875RecPrdDsc[0] ;
                  A743PrdUniCon = P06S613_A743PrdUniCon[0] ;
                  A11687PrdList = P06S613_A11687PrdList[0] ;
                  A11363PrdGots = P06S613_A11363PrdGots[0] ;
                  A13301PrdZDHC = P06S613_A13301PrdZDHC[0] ;
                  A13302PrdTHELIST = P06S613_A13302PrdTHELIST[0] ;
                  n13302PrdTHELIST = P06S613_n13302PrdTHELIST[0] ;
                  A707PrdFacCon = P06S613_A707PrdFacCon[0] ;
                  A724PrdPreAct = P06S613_A724PrdPreAct[0] ;
                  A811RecLin = P06S613_A811RecLin[0] ;
                  A1643PrdTip = P06S613_A1643PrdTip[0] ;
                  A743PrdUniCon = P06S613_A743PrdUniCon[0] ;
                  A11687PrdList = P06S613_A11687PrdList[0] ;
                  A11363PrdGots = P06S613_A11363PrdGots[0] ;
                  A13301PrdZDHC = P06S613_A13301PrdZDHC[0] ;
                  A13302PrdTHELIST = P06S613_A13302PrdTHELIST[0] ;
                  n13302PrdTHELIST = P06S613_n13302PrdTHELIST[0] ;
                  A707PrdFacCon = P06S613_A707PrdFacCon[0] ;
                  A724PrdPreAct = P06S613_A724PrdPreAct[0] ;
                  AV279CodeBar1 = "*" + GXutil.padl( GXutil.trim( GXutil.str( A1273RecLinPro, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( A811RecLin, 4, 0)), (short)(4), "0") + "*" ;
                  AV282CodeBar2 = "*" + GXutil.padl( GXutil.trim( GXutil.str( A1273RecLinPro, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( A811RecLin, 4, 0)), (short)(4), "0") + "*" ;
                  AV280faccon = A431FacCon ;
                  AV197Tnq = A3274RecPrdTnq ;
                  AV224Densidad = A4900PrdCanMac ;
                  AV255VarAux10 = GXutil.str( AV197Tnq, 1, 0) + " " + GXutil.trim( GXutil.str( AV224Densidad, 5, 3)) ;
                  if ( ( AV246Moda21 == 1 ) || ( AV262Artemalha == 1 ) || ( AV192Carvema == 1 ) || ( AV215erfoc == 1 ) || ( AV268Lote01 == 1 ) )
                  {
                     AV255VarAux10 = GXutil.substring( A5725RecLote, 1, 15) ;
                  }
                  if ( A490ForPrdUMe == 1 )
                  {
                     AV120Unidades = httpContext.getMessage( "Gr", "") ;
                     AV122Var2 = httpContext.getMessage( "Gr/L", "") ;
                  }
                  if ( A490ForPrdUMe == 2 )
                  {
                     AV120Unidades = httpContext.getMessage( "Cc", "") ;
                     AV122Var2 = httpContext.getMessage( "Cc/L", "") ;
                  }
                  if ( A490ForPrdUMe == 3 )
                  {
                     AV120Unidades = httpContext.getMessage( "Gr", "") ;
                     AV122Var2 = "%" ;
                  }
                  AV306manual = ((GXutil.strcmp(A1643PrdTip, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "MANUAL", "") : "") ;
                  AV280faccon = A431FacCon ;
                  AV121Var1 = ((AV246Moda21==0) ? GXutil.str( A431FacCon, 11, 5)+" "+AV122Var2 : ((GXutil.strcmp("", AV306manual)==0) ? GXutil.str( AV280faccon, 9, 5)+" "+AV122Var2 : GXutil.str( AV280faccon, 9, 5)+" "+AV122Var2+" "+AV306manual)) ;
                  AV250Var4 = GXutil.str( A431FacCon, 9, 5) + " " + AV122Var2 ;
                  AV283Factor = GXutil.str( A431FacCon, 7, 4) + " " + AV122Var2 ;
                  if ( (0==A2394RecForNro) )
                  {
                     AV147RecForNro = "  " ;
                  }
                  else
                  {
                     AV147RecForNro = GXutil.str( A2394RecForNro, 2, 0) ;
                  }
                  if ( (GXutil.strcmp("", A872RecPrdNum)==0) && ( A686PrdCant.doubleValue() == 0 ) )
                  {
                     if ( (GXutil.strcmp("", A875RecPrdDsc)==0) && ( AV56FlagNline == 0 ) )
                     {
                        h6S60( false, 10) ;
                        getPrinter().GxDrawLine(6, Gx_line+6, 797, Gx_line+6, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+10) ;
                     }
                     else
                     {
                        if ( GXutil.strcmp(A875RecPrdDsc, ".") == 0 )
                        {
                           h6S60( false, 17) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                        else
                        {
                           AV145PrdDsc = A875RecPrdDsc ;
                           h6S60( false, 17) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145PrdDsc, "")), 206, Gx_line+0, 423, Gx_line+17, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                     }
                  }
                  else
                  {
                     AV24CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                     if ( A490ForPrdUMe == 2 )
                     {
                        AV120Unidades = httpContext.getMessage( "Cc", "") ;
                     }
                     else
                     {
                        if ( A490ForPrdUMe == 3 )
                        {
                           if ( A743PrdUniCon == 3 )
                           {
                              AV120Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                           else
                           {
                              AV120Unidades = httpContext.getMessage( "Gr", "") ;
                           }
                        }
                        else
                        {
                           AV120Unidades = httpContext.getMessage( "Gr", "") ;
                           if ( A743PrdUniCon == 3 )
                           {
                              AV120Unidades = httpContext.getMessage( "Cc", "") ;
                           }
                        }
                     }
                     if ( AV54FlagImp == 1 )
                     {
                        if ( ( A686PrdCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV24CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "9") == 0 ) ) )
                        {
                           AV18Cantidad = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV120Unidades = httpContext.getMessage( "Lt", "") ;
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "Lt", "") ;
                                 }
                                 else
                                 {
                                    AV120Unidades = httpContext.getMessage( "Kg", "") ;
                                 }
                              }
                              else
                              {
                                 AV120Unidades = httpContext.getMessage( "Kg", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "Lt", "") ;
                                 }
                              }
                           }
                        }
                        else
                        {
                           AV18Cantidad = A686PrdCant ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV120Unidades = httpContext.getMessage( "Cc", "") ;
                              if ( A4900PrdCanMac.doubleValue() > 0 )
                              {
                                 AV120Unidades = httpContext.getMessage( "ml", "") ;
                              }
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "Cc", "") ;
                                 }
                                 else
                                 {
                                    AV120Unidades = httpContext.getMessage( "Gr", "") ;
                                 }
                              }
                              else
                              {
                                 AV120Unidades = httpContext.getMessage( "Gr", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "Cc", "") ;
                                 }
                              }
                           }
                        }
                        if ( ( GXutil.strcmp(AV24CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "0") == 0 ) )
                        {
                           AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                           if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                           {
                              AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                              h6S60( false, 19) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 517, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+0, 583, Gx_line+16, 0, 0, 0, 0) ;
                              getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(626, Gx_line+0, 626, Gx_line+16, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+1, 804, Gx_line+16, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+19) ;
                           }
                           else
                           {
                              if ( AV192Carvema == 0 )
                              {
                                 if ( ( AV274Gavim == 1 ) && ( AV281Act3of9 == 1 ) )
                                 {
                                    h6S60( false, 31) ;
                                    getPrinter().GxAttris("3 of 9 Barcode", 20, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV279CodeBar1, "")), 11, Gx_line+4, 145, Gx_line+26, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+6, 202, Gx_line+23, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+6, 439, Gx_line+23, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 532, Gx_line+6, 602, Gx_line+23, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 601, Gx_line+6, 623, Gx_line+22, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+7, 804, Gx_line+22, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(624, Gx_line+6, 706, Gx_line+23, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(665, Gx_line+6, 665, Gx_line+23, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV283Factor, "")), 442, Gx_line+7, 495, Gx_line+24, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+31) ;
                                 }
                                 else
                                 {
                                    h6S60( false, 18) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 492, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+0, 583, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(626, Gx_line+1, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+1, 804, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                              }
                              else
                              {
                                 if ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 )
                                 {
                                    h6S60( false, 19) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 13, Gx_line+0, 146, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 153, Gx_line+0, 203, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 207, Gx_line+0, 440, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 448, Gx_line+0, 465, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 470, Gx_line+0, 563, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 563, Gx_line+1, 585, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV197Tnq), "Z")), 743, Gx_line+0, 751, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV305Normas, "")), 588, Gx_line+0, 735, Gx_line+17, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+19) ;
                                 }
                                 else
                                 {
                                    h6S60( false, 17) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 492, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+0, 583, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV197Tnq), "Z")), 743, Gx_line+0, 751, Gx_line+17, 2+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                              }
                           }
                        }
                        else
                        {
                           if ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 )
                           {
                              h6S60( false, 17) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           else
                           {
                              AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                              if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                              {
                                 AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                                 h6S60( false, 19) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 502, Gx_line+0, 561, Gx_line+19, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(626, Gx_line+1, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+1, 583, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+1, 804, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+19) ;
                              }
                              else
                              {
                                 if ( AV192Carvema == 0 )
                                 {
                                    if ( ( AV274Gavim == 1 ) && ( AV281Act3of9 == 1 ) )
                                    {
                                       h6S60( false, 32) ;
                                       getPrinter().GxAttris("3 of 9 Barcode", 20, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV279CodeBar1, "")), 11, Gx_line+4, 145, Gx_line+26, 0+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+6, 202, Gx_line+23, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+6, 439, Gx_line+23, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 509, Gx_line+5, 602, Gx_line+24, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 601, Gx_line+6, 623, Gx_line+22, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+7, 804, Gx_line+22, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawRect(624, Gx_line+6, 706, Gx_line+23, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(665, Gx_line+6, 665, Gx_line+23, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV283Factor, "")), 439, Gx_line+6, 492, Gx_line+23, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+32) ;
                                    }
                                    else
                                    {
                                       h6S60( false, 19) ;
                                       getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 469, Gx_line+0, 562, Gx_line+19, 2+256, 0, 0, 0) ;
                                       getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+1, 583, Gx_line+17, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(626, Gx_line+1, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+2, 804, Gx_line+17, 0+256, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+19) ;
                                    }
                                 }
                                 else
                                 {
                                    AV305Normas = "" ;
                                    if ( GXutil.strcmp(A11363PrdGots, httpContext.getMessage( "S", "")) == 0 )
                                    {
                                       AV305Normas = httpContext.getMessage( "GOTS", "") ;
                                    }
                                    if ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) != 0 )
                                    {
                                       if ( (GXutil.strcmp("", AV305Normas)==0) )
                                       {
                                          AV305Normas = httpContext.getMessage( "ZDHC ", "") + GXutil.trim( A13301PrdZDHC) ;
                                       }
                                       else
                                       {
                                          AV305Normas += "/" + httpContext.getMessage( "ZDHC ", "") + GXutil.trim( A13301PrdZDHC) ;
                                       }
                                    }
                                    if ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 )
                                    {
                                       if ( (GXutil.strcmp("", AV305Normas)==0) )
                                       {
                                          AV305Normas = httpContext.getMessage( "LIST", "") ;
                                       }
                                       else
                                       {
                                          AV305Normas += "/" + httpContext.getMessage( "LIST", "") ;
                                       }
                                    }
                                    if ( GXutil.strcmp(A13302PrdTHELIST, "") != 0 )
                                    {
                                       if ( (GXutil.strcmp("", AV305Normas)==0) )
                                       {
                                          AV305Normas = httpContext.getMessage( "THELIST ", "") + GXutil.trim( A13302PrdTHELIST) ;
                                       }
                                       else
                                       {
                                          AV305Normas += "/" + httpContext.getMessage( "THELIST ", "") + GXutil.trim( A13302PrdTHELIST) ;
                                       }
                                    }
                                    h6S60( false, 19) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 13, Gx_line+0, 146, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 153, Gx_line+0, 203, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 207, Gx_line+0, 440, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 448, Gx_line+0, 465, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 470, Gx_line+0, 563, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 563, Gx_line+1, 585, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV197Tnq), "Z")), 743, Gx_line+0, 751, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV305Normas, "")), 588, Gx_line+0, 735, Gx_line+17, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+19) ;
                                 }
                              }
                           }
                        }
                     }
                     else
                     {
                        AV18Cantidad = A686PrdCant ;
                        if ( ( GXutil.strcmp(AV24CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "0") == 0 ) )
                        {
                           AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                           if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                           {
                              AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                              h6S60( false, 18) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 517, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(626, Gx_line+1, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+0, 583, Gx_line+16, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+1, 804, Gx_line+16, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                           }
                           else
                           {
                              h6S60( false, 18) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 492, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(626, Gx_line+1, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+0, 583, Gx_line+16, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+2, 804, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+18) ;
                           }
                        }
                        else
                        {
                           if ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 )
                           {
                              h6S60( false, 17) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV197Tnq), "Z")), 743, Gx_line+0, 751, Gx_line+17, 2+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           else
                           {
                              AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                              if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                              {
                                 AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                                 h6S60( false, 18) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 509, Gx_line+0, 561, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(626, Gx_line+1, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+0, 583, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+1, 804, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                              else
                              {
                                 h6S60( false, 19) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 464, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(588, Gx_line+0, 707, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(626, Gx_line+1, 626, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(666, Gx_line+0, 666, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.999")), 469, Gx_line+0, 562, Gx_line+19, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 561, Gx_line+0, 583, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 709, Gx_line+1, 804, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+19) ;
                              }
                           }
                        }
                     }
                  }
                  if ( AV47Flag == 1 )
                  {
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV36Coste2 = AV36Coste2.add((A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     }
                     else
                     {
                        if ( A3915EmpNumDec == 2 )
                        {
                           if ( A490ForPrdUMe == 4 )
                           {
                              AV36Coste2 = AV36Coste2.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon), 2)) ;
                           }
                           else
                           {
                              AV36Coste2 = AV36Coste2.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                           }
                        }
                     }
                  }
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( ( AV202Staack == 0 ) && ( AV220Serzedelo == 0 ) )
            {
               /* Execute user subroutine: 'OBSFOR' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               AV57FlagObs = (byte)(0) ;
               /* Using cursor P06S614 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A5258RecTxtObs = P06S614_A5258RecTxtObs[0] ;
                  n5258RecTxtObs = P06S614_n5258RecTxtObs[0] ;
                  A5257RecLinObs = P06S614_A5257RecLinObs[0] ;
                  if ( AV57FlagObs == 0 )
                  {
                     AV57FlagObs = (byte)(1) ;
                     h6S60( false, 23) ;
                     getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit38, "")), 11, Gx_line+4, 120, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(7, Gx_line+2, 780, Gx_line+2, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5258RecTxtObs, "")), 135, Gx_line+4, 574, Gx_line+21, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+23) ;
                  }
                  else
                  {
                     h6S60( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5258RecTxtObs, "")), 135, Gx_line+0, 574, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  pr_default.readNext(9);
               }
               pr_default.close(9);
            }
            if ( AV236JPF == 1 )
            {
               if ( GXutil.strcmp(A3629CliObs, "") != 0 )
               {
                  h6S60( false, 73) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3629CliObs, "")), 7, Gx_line+19, 780, Gx_line+64, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes Cliente:", ""), 7, Gx_line+0, 129, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+73) ;
               }
               /* Execute user subroutine: 'ARTICU' */
               S211 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  pr_default.close(4);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( GXutil.strcmp(AV251ArtObslon, " ") != 0 )
               {
                  h6S60( false, 81) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(AV251ArtObslon, 7, Gx_line+21, 779, Gx_line+77, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes Artigo:", ""), 7, Gx_line+3, 124, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+81) ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         GxHdr6 = false ;
         if ( ( AV211Tejido == 1 ) && ( AV204Dosea > 0 ) )
         {
            h6S60( false, 33) ;
            getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Banho de Alcalis:", ""), 17, Gx_line+6, 165, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV206VolProd), "ZZZZ9")), 197, Gx_line+6, 245, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Banho de Corantes:", ""), 411, Gx_line+6, 581, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV207VolCor), "ZZZZ9")), 588, Gx_line+6, 636, Gx_line+29, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lts.", ""), 248, Gx_line+6, 281, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lts.", ""), 639, Gx_line+6, 672, Gx_line+29, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+2, 780, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
         }
         if ( AV109FlagTtx == 1 )
         {
            AV124Velocidad = DecimalUtil.doubleToDec(0) ;
            if ( (AV115TiempoV.multiply(DecimalUtil.doubleToDec(AV14BarGraAca)).multiply(DecimalUtil.doubleToDec(AV140NTubos)).multiply(AV93Largura)).doubleValue() > 0 )
            {
               AV124Velocidad = (A812RecTotKgm.multiply(DecimalUtil.doubleToDec(1000))).divide((AV115TiempoV.multiply(DecimalUtil.doubleToDec(AV14BarGraAca)).multiply(DecimalUtil.doubleToDec(AV140NTubos)).multiply(AV93Largura)), 18, java.math.RoundingMode.DOWN) ;
            }
            h6S60( false, 33) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV124Velocidad, "ZZZZZZ9.99")), 229, Gx_line+10, 302, Gx_line+26, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Velocidade de Circulaçao", ""), 30, Gx_line+10, 202, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(25, Gx_line+5, 761, Gx_line+30, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+2, 780, Gx_line+2, 3, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV269Tot_kgs, "ZZZZZ9.99")), 444, Gx_line+10, 501, Gx_line+27, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 405, Gx_line+9, 434, Gx_line+26, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "G", ""), 659, Gx_line+10, 666, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14BarGraAca), "ZZZ9")), 677, Gx_line+10, 706, Gx_line+26, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "T", ""), 716, Gx_line+10, 723, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV93Largura, "ZZ9.99")), 544, Gx_line+10, 588, Gx_line+26, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "L", ""), 526, Gx_line+10, 533, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV140NTubos), "9")), 733, Gx_line+10, 740, Gx_line+26, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "m/min", ""), 320, Gx_line+10, 356, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV115TiempoV, "Z9.99")), 614, Gx_line+10, 650, Gx_line+26, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "t", ""), 597, Gx_line+10, 604, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(366, Gx_line+5, 366, Gx_line+30, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+33) ;
         }
         if ( AV52FlagEtm == 1 )
         {
            h6S60( false, 199) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Gr/mlin =", ""), 57, Gx_line+8, 165, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "( Gr/m2 x Largura(m) )", ""), 248, Gx_line+10, 473, Gx_line+27, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ctotpecas =", ""), 57, Gx_line+42, 165, Gx_line+59, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87GrMlin, "ZZZ9.99")), 169, Gx_line+8, 228, Gx_line+26, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "( Pmalha (Grama) / Gr/mlin)", ""), 248, Gx_line+43, 473, Gx_line+60, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lts1      =", ""), 57, Gx_line+75, 165, Gx_line+92, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27CompTP, "ZZZZ9.99")), 169, Gx_line+42, 237, Gx_line+60, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "( Volume Maquina)", ""), 248, Gx_line+76, 473, Gx_line+93, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lts2      =", ""), 57, Gx_line+108, 165, Gx_line+125, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122Var2, "")), 169, Gx_line+75, 203, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "( Lts1 - (2xKg) )", ""), 248, Gx_line+108, 473, Gx_line+125, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nro Camaras =", ""), 57, Gx_line+142, 166, Gx_line+159, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV132Lts2), "ZZZZZ9")), 169, Gx_line+108, 214, Gx_line+125, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cxcamara  =", ""), 57, Gx_line+175, 165, Gx_line+192, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV141NumCam), "Z9")), 169, Gx_line+142, 187, Gx_line+160, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "( Ctotpecas / Nro Camaras )", ""), 248, Gx_line+175, 474, Gx_line+192, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26CompCamar, "ZZZ9.99")), 169, Gx_line+175, 228, Gx_line+193, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawRect(7, Gx_line+4, 780, Gx_line+196, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(504, Gx_line+9, 757, Gx_line+188, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(631, Gx_line+10, 631, Gx_line+188, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(504, Gx_line+43, 757, Gx_line+43, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DATA", ""), 540, Gx_line+18, 583, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "APROVADO", ""), 661, Gx_line+18, 745, Gx_line+37, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+199) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6S60( true, 0) ;
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

   public void S129( ) throws ProcessInterruptedException
   {
      /* 'AGRUPADAS' Routine */
      returnInSub = false ;
      AV157Flag_Agr = (byte)(0) ;
      AV252NumHdrs = (short)(1) ;
      AV254NMaxAg = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P06S615 */
      pr_default.execute(10, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
      cV254NMaxAg = P06S615_AV254NMaxAg[0] ;
      pr_default.close(10);
      AV254NMaxAg = (short)(AV254NMaxAg+cV254NMaxAg*1) ;
      /* End optimized group. */
      /* Using cursor P06S616 */
      pr_default.execute(11, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P06S616_A130BarCodPar[0] ;
         A132BarCodReo = P06S616_A132BarCodReo[0] ;
         A129BarCod = P06S616_A129BarCod[0] ;
         A396EmprCod = P06S616_A396EmprCod[0] ;
         A122BarAgrPar = P06S616_A122BarAgrPar[0] ;
         A124BarAgrReo = P06S616_A124BarAgrReo[0] ;
         A119BarAgrCod = P06S616_A119BarAgrCod[0] ;
         A1508CliCodAgr = P06S616_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P06S616_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P06S616_A1245BarAgrSer[0] ;
         A869MtrAgr = P06S616_A869MtrAgr[0] ;
         A671PieAgr = P06S616_A671PieAgr[0] ;
         A1512ColNumAgr = P06S616_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P06S616_A1510ColNomAgr[0] ;
         A590KgmAgr = P06S616_A590KgmAgr[0] ;
         if ( ( AV11BarCod == A119BarAgrCod ) && ( AV13BarCodReo == A124BarAgrReo ) && ( GXutil.strcmp(AV12BarCodPar, A122BarAgrPar) == 0 ) )
         {
            if ( AV53Flagidioma == 0 )
            {
               Gx_msg = httpContext.getMessage( "ERROR. La Hdr= ", "") + GXutil.str( AV11BarCod, 8, 0) + "-" + GXutil.str( AV13BarCodReo, 1, 0) + AV12BarCodPar + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "esta AGRUPADA consigo misma ¡¡¡", "") + GXutil.chr( (short)(13)) ;
            }
            else
            {
               Gx_msg = httpContext.getMessage( "ERRO.O número OS=", "") + GXutil.str( AV11BarCod, 8, 0) + "-" + GXutil.str( AV13BarCodReo, 1, 0) + AV12BarCodPar + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "é agrupado com ele mesmo ¡¡¡", "") + GXutil.chr( (short)(13)) ;
            }
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         if ( AV252NumHdrs > AV253MaxAgr )
         {
            h6S60( false, 18) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "El sistema imprimio", ""), 241, Gx_line+0, 356, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV253MaxAgr), "Z9")), 356, Gx_line+0, 372, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( " agrupaciones como maximo ¡¡¡¡", ""), 419, Gx_line+0, 598, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV254NMaxAg), "ZZZ9")), 381, Gx_line+0, 411, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("/", 374, Gx_line+0, 379, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV158Hdr_a = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         GXv_char12[0] = AV159CliNom_a ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A1508CliCodAgr, GXv_char12) ;
         rrecstdp_impl.this.AV159CliNom_a = GXv_char12[0] ;
         AV159CliNom_a = GXutil.substring( AV159CliNom_a, 1, 20) ;
         AV196Agrdsc = A1507BarAgrDsc ;
         if ( ( AV194Ricoltex == 1 ) || ( AV220Serzedelo == 1 ) )
         {
            AV196Agrdsc = A1245BarAgrSer ;
         }
         AV221MtrAgr = A869MtrAgr ;
         if ( AV220Serzedelo == 1 )
         {
            AV179Lit49 = httpContext.getMessage( "Bobinas", "") ;
            AV221MtrAgr = DecimalUtil.doubleToDec(A671PieAgr) ;
         }
         if ( AV236JPF == 1 )
         {
            GXv_char12[0] = A396EmprCod ;
            GXv_int1[0] = A119BarAgrCod ;
            GXv_int5[0] = A124BarAgrReo ;
            GXv_char11[0] = A122BarAgrPar ;
            GXv_char9[0] = AV237BarCal ;
            new app.pmetpie(remoteHandle, context).execute( GXv_char12, GXv_int1, GXv_int5, GXv_char11, GXv_char9) ;
            rrecstdp_impl.this.A396EmprCod = GXv_char12[0] ;
            rrecstdp_impl.this.A119BarAgrCod = GXv_int1[0] ;
            rrecstdp_impl.this.A124BarAgrReo = GXv_int5[0] ;
            rrecstdp_impl.this.A122BarAgrPar = GXv_char11[0] ;
            rrecstdp_impl.this.AV237BarCal = GXv_char9[0] ;
         }
         AV248Litpda = "" ;
         AV247Barpart = (short)(0) ;
         if ( ( AV246Moda21 == 1 ) || ( AV274Gavim == 1 ) )
         {
            AV248Litpda = httpContext.getMessage( "Partida", "") ;
            GXv_char12[0] = A396EmprCod ;
            GXv_int1[0] = A119BarAgrCod ;
            GXv_int5[0] = A124BarAgrReo ;
            GXv_char11[0] = A122BarAgrPar ;
            GXv_int10[0] = AV247Barpart ;
            new app.ppdamd21(remoteHandle, context).execute( GXv_char12, GXv_int1, GXv_int5, GXv_char11, GXv_int10) ;
            rrecstdp_impl.this.A396EmprCod = GXv_char12[0] ;
            rrecstdp_impl.this.A119BarAgrCod = GXv_int1[0] ;
            rrecstdp_impl.this.A124BarAgrReo = GXv_int5[0] ;
            rrecstdp_impl.this.A122BarAgrPar = GXv_char11[0] ;
            rrecstdp_impl.this.AV247Barpart = GXv_int10[0] ;
         }
         GXv_char12[0] = A396EmprCod ;
         GXv_int1[0] = A119BarAgrCod ;
         GXv_int5[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char9[0] = "" ;
         GXv_int15[0] = AV277Reccod ;
         GXv_char8[0] = AV278LocAlbr ;
         GXv_int16[0] = 0 ;
         new app.pinfagralbrec(remoteHandle, context).execute( GXv_char12, GXv_int1, GXv_int5, GXv_char11, GXv_decimal14, GXv_char9, GXv_int15, GXv_char8, GXv_int16) ;
         rrecstdp_impl.this.A396EmprCod = GXv_char12[0] ;
         rrecstdp_impl.this.A119BarAgrCod = GXv_int1[0] ;
         rrecstdp_impl.this.A124BarAgrReo = GXv_int5[0] ;
         rrecstdp_impl.this.A122BarAgrPar = GXv_char11[0] ;
         rrecstdp_impl.this.AV277Reccod = GXv_int15[0] ;
         rrecstdp_impl.this.AV278LocAlbr = GXv_char8[0] ;
         GXv_char12[0] = AV307distraidagr ;
         new app.pdistraid(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_char12) ;
         rrecstdp_impl.this.AV307distraidagr = GXv_char12[0] ;
         GXv_char12[0] = AV308po ;
         new app.barordcomp(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_char12) ;
         rrecstdp_impl.this.AV308po = GXv_char12[0] ;
         AV293ColAgr = ((AV192Carvema==0) ? GXutil.trim( A1510ColNomAgr)+"-"+GXutil.trim( GXutil.str( A1512ColNumAgr, 6, 0)) : GXutil.trim( A1510ColNomAgr)+" "+GXutil.trim( AV307distraidagr)) ;
         if ( AV157Flag_Agr == 0 )
         {
            AV157Flag_Agr = (byte)(1) ;
            if ( AV47Flag == 0 )
            {
            }
            if ( AV163FlagEnd == 0 )
            {
               if ( AV246Moda21 == 0 )
               {
                  h6S60( false, 57) ;
                  getPrinter().GxDrawRect(7, Gx_line+0, 780, Gx_line+39, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 14, Gx_line+40, 95, Gx_line+57, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196Agrdsc, "")), 251, Gx_line+40, 442, Gx_line+57, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159CliNom_a, "")), 100, Gx_line+40, 247, Gx_line+57, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")), 568, Gx_line+40, 643, Gx_line+57, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Lit39, "")), 14, Gx_line+20, 139, Gx_line+37, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lit40, "")), 103, Gx_line+20, 186, Gx_line+37, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Lit41, "")), 256, Gx_line+20, 391, Gx_line+37, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Lit42, "")), 593, Gx_line+20, 643, Gx_line+37, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Lit43, "")), 14, Gx_line+4, 167, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV221MtrAgr, "ZZZZZ9.99")), 648, Gx_line+40, 715, Gx_line+57, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV179Lit49, "")), 651, Gx_line+20, 715, Gx_line+37, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 448, Gx_line+20, 517, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV248Litpda, "")), 713, Gx_line+20, 776, Gx_line+36, 1, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV247Barpart), "ZZZZ")), 727, Gx_line+40, 757, Gx_line+57, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV293ColAgr, "")), 420, Gx_line+40, 567, Gx_line+57, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+57) ;
               }
               else
               {
                  h6S60( false, 65) ;
                  getPrinter().GxDrawRect(7, Gx_line+2, 780, Gx_line+41, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Agrupado com:", ""), 14, Gx_line+0, 100, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "OS", ""), 42, Gx_line+17, 62, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 158, Gx_line+17, 201, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 242, Gx_line+17, 281, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 458, Gx_line+17, 481, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 652, Gx_line+17, 692, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 733, Gx_line+17, 775, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 42, Gx_line+46, 123, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9")), 158, Gx_line+46, 203, Gx_line+63, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV293ColAgr, "")), 458, Gx_line+46, 605, Gx_line+63, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")), 617, Gx_line+46, 692, Gx_line+63, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV221MtrAgr, "ZZZZZ9.99")), 708, Gx_line+46, 775, Gx_line+63, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196Agrdsc, "")), 242, Gx_line+46, 433, Gx_line+63, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+65) ;
               }
            }
            else
            {
               h6S60( false, 57) ;
               getPrinter().GxDrawRect(6, Gx_line+0, 779, Gx_line+39, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 13, Gx_line+40, 94, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196Agrdsc, "")), 248, Gx_line+40, 420, Gx_line+56, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159CliNom_a, "")), 99, Gx_line+40, 246, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")), 524, Gx_line+40, 599, Gx_line+57, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Lit43, "")), 13, Gx_line+4, 166, Gx_line+19, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV221MtrAgr, "ZZZZZ9.99")), 604, Gx_line+40, 671, Gx_line+57, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1510ColNomAgr, "")), 424, Gx_line+40, 520, Gx_line+57, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV277Reccod), "ZZZZZZZ9")), 675, Gx_line+41, 726, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV278LocAlbr, "")), 730, Gx_line+41, 794, Gx_line+56, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote Nº", ""), 675, Gx_line+21, 712, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local.", ""), 730, Gx_line+21, 759, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros", ""), 634, Gx_line+21, 670, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 424, Gx_line+21, 442, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos", ""), 568, Gx_line+21, 600, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 248, Gx_line+21, 278, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 99, Gx_line+21, 135, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 13, Gx_line+21, 33, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196Agrdsc, "")), 242, Gx_line+0, 433, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+57) ;
            }
         }
         else
         {
            if ( AV163FlagEnd == 0 )
            {
               if ( AV246Moda21 == 0 )
               {
                  h6S60( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 14, Gx_line+0, 95, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196Agrdsc, "")), 251, Gx_line+0, 442, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159CliNom_a, "")), 100, Gx_line+0, 247, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")), 568, Gx_line+0, 643, Gx_line+16, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV221MtrAgr, "ZZZZZ9.99")), 648, Gx_line+0, 715, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV247Barpart), "ZZZZ")), 727, Gx_line+0, 757, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV293ColAgr, "")), 420, Gx_line+0, 567, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               else
               {
                  h6S60( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV221MtrAgr, "ZZZZZ9.99")), 708, Gx_line+1, 775, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")), 617, Gx_line+1, 692, Gx_line+18, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV293ColAgr, "")), 458, Gx_line+1, 605, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196Agrdsc, "")), 242, Gx_line+1, 433, Gx_line+18, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9")), 158, Gx_line+0, 203, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 42, Gx_line+0, 123, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
            }
            else
            {
               h6S60( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 13, Gx_line+0, 94, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159CliNom_a, "")), 99, Gx_line+0, 246, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196Agrdsc, "")), 248, Gx_line+0, 420, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1510ColNomAgr, "")), 424, Gx_line+0, 520, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A590KgmAgr, "ZZZZZ9.99")), 524, Gx_line+0, 599, Gx_line+17, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV221MtrAgr, "ZZZZZ9.99")), 604, Gx_line+0, 671, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV277Reccod), "ZZZZZZZ9")), 675, Gx_line+1, 726, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV278LocAlbr, "")), 730, Gx_line+1, 794, Gx_line+16, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
         }
         if ( ( AV236JPF == 1 ) && ( GXutil.strcmp(AV237BarCal, " ") != 0 ) )
         {
            h6S60( false, 19) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote Fiaçao:", ""), 14, Gx_line+1, 84, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV237BarCal, "")), 110, Gx_line+1, 257, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+19) ;
         }
         AV252NumHdrs = (short)(AV252NumHdrs+1) ;
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'DESCMAQ' Routine */
      returnInSub = false ;
      AV140NTubos = (byte)(0) ;
      /* Using cursor P06S617 */
      pr_default.execute(12, new Object[] {AV44EmprCod, AV15BarMaqCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A602MaqCod = P06S617_A602MaqCod[0] ;
         A396EmprCod = P06S617_A396EmprCod[0] ;
         A606MaqDsc = P06S617_A606MaqDsc[0] ;
         n606MaqDsc = P06S617_n606MaqDsc[0] ;
         A2391MaqMicro = P06S617_A2391MaqMicro[0] ;
         n2391MaqMicro = P06S617_n2391MaqMicro[0] ;
         A3598MaqNroTub = P06S617_A3598MaqNroTub[0] ;
         n3598MaqNroTub = P06S617_n3598MaqNroTub[0] ;
         AV37DescMaq = A606MaqDsc ;
         AV133MaqMicro = A2391MaqMicro ;
         AV141NumCam = A2391MaqMicro ;
         AV140NTubos = A3598MaqNroTub ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'OBSFOR' Routine */
      returnInSub = false ;
      AV57FlagObs = (byte)(0) ;
      /* Using cursor P06S618 */
      pr_default.execute(13, new Object[] {AV44EmprCod, Integer.valueOf(AV19CliCod), AV8ArtCod, AV110ForColNom, Integer.valueOf(AV111ForColNum), Byte.valueOf(AV25Colorante)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A831TipColCod = P06S618_A831TipColCod[0] ;
         A483ForColNum = P06S618_A483ForColNum[0] ;
         A482ForColNom = P06S618_A482ForColNom[0] ;
         A494ForSer = P06S618_A494ForSer[0] ;
         A252CliCod = P06S618_A252CliCod[0] ;
         n252CliCod = P06S618_n252CliCod[0] ;
         A396EmprCod = P06S618_A396EmprCod[0] ;
         A649ObsForTxt = P06S618_A649ObsForTxt[0] ;
         A650ObsLin = P06S618_A650ObsLin[0] ;
         if ( AV57FlagObs == 0 )
         {
            AV57FlagObs = (byte)(1) ;
            h6S60( false, 24) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 122, Gx_line+6, 373, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit38, "")), 7, Gx_line+6, 116, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+2, 780, Gx_line+2, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+24) ;
         }
         else
         {
            h6S60( false, 18) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 122, Gx_line+0, 373, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         pr_default.readNext(13);
      }
      pr_default.close(13);
      if ( ( AV215erfoc == 1 ) && ( GXutil.strcmp(AV216Obstxt[1-1], " ") != 0 ) )
      {
         h6S60( false, 23) ;
         getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit38, "")), 7, Gx_line+4, 116, Gx_line+21, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(7, Gx_line+1, 780, Gx_line+1, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV216Obstxt[1-1], "")), 130, Gx_line+4, 569, Gx_line+21, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+23) ;
         if ( GXutil.strcmp(AV216Obstxt[2-1], " ") != 0 )
         {
            h6S60( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV216Obstxt[2-1], "")), 130, Gx_line+0, 569, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         if ( GXutil.strcmp(AV216Obstxt[3-1], " ") != 0 )
         {
            h6S60( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV216Obstxt[3-1], "")), 130, Gx_line+0, 569, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
      }
   }

   public void S119( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV164TipArtDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P06S619 */
      pr_default.execute(14, new Object[] {AV44EmprCod, Short.valueOf(AV167BarTipArt)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A829TipArtCod = P06S619_A829TipArtCod[0] ;
         A396EmprCod = P06S619_A396EmprCod[0] ;
         A830TipArtDsc = P06S619_A830TipArtDsc[0] ;
         n830TipArtDsc = P06S619_n830TipArtDsc[0] ;
         AV164TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      AV190DSCCAUSA = "" ;
      AV191Texto_r = "" ;
      /* Using cursor P06S620 */
      pr_default.execute(15, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A833TipDefCod = P06S620_A833TipDefCod[0] ;
         A5085CodCausa = P06S620_A5085CodCausa[0] ;
         n5085CodCausa = P06S620_n5085CodCausa[0] ;
         A544HisCodPar = P06S620_A544HisCodPar[0] ;
         A545HisCodReo = P06S620_A545HisCodReo[0] ;
         A539HisBarCod = P06S620_A539HisBarCod[0] ;
         A396EmprCod = P06S620_A396EmprCod[0] ;
         A5086DscCausa = P06S620_A5086DscCausa[0] ;
         n5086DscCausa = P06S620_n5086DscCausa[0] ;
         A834TipDefDsc = P06S620_A834TipDefDsc[0] ;
         n834TipDefDsc = P06S620_n834TipDefDsc[0] ;
         A834TipDefDsc = P06S620_A834TipDefDsc[0] ;
         n834TipDefDsc = P06S620_n834TipDefDsc[0] ;
         A5086DscCausa = P06S620_A5086DscCausa[0] ;
         n5086DscCausa = P06S620_n5086DscCausa[0] ;
         AV190DSCCAUSA = GXutil.substring( A5086DscCausa, 1, 30) ;
         AV191Texto_r = GXutil.substring( A834TipDefDsc, 1, 15) ;
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PROFOC' Routine */
      returnInSub = false ;
      /* Using cursor P06S621 */
      pr_default.execute(16, new Object[] {AV44EmprCod, AV200Proforcod, AV15BarMaqCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A396EmprCod = P06S621_A396EmprCod[0] ;
         A764ProForCod = P06S621_A764ProForCod[0] ;
         A6229ProFoMaq = P06S621_A6229ProFoMaq[0] ;
         n6229ProFoMaq = P06S621_n6229ProFoMaq[0] ;
         A5192ProFoPgC = P06S621_A5192ProFoPgC[0] ;
         n5192ProFoPgC = P06S621_n5192ProFoPgC[0] ;
         A5191ProForLC = P06S621_A5191ProForLC[0] ;
         if ( A5192ProFoPgC > 0 )
         {
            AV199ProNumPro = A5192ProFoPgC ;
         }
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV204Dosea = 0 ;
      /* Using cursor P06S622 */
      pr_default.execute(17, new Object[] {AV44EmprCod, AV205MaqCod});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A602MaqCod = P06S622_A602MaqCod[0] ;
         A396EmprCod = P06S622_A396EmprCod[0] ;
         A5950MaqDteCol = P06S622_A5950MaqDteCol[0] ;
         n5950MaqDteCol = P06S622_n5950MaqDteCol[0] ;
         AV204Dosea = A5950MaqDteCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'LOTES' Routine */
      returnInSub = false ;
      if ( AV215erfoc == 1 )
      {
         GXv_char12[0] = AV44EmprCod ;
         GXv_int16[0] = AV11BarCod ;
         GXv_int5[0] = AV13BarCodReo ;
         GXv_char11[0] = AV12BarCodPar ;
         GXv_int10[0] = AV227lotes ;
         new app.pprec001(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int5, GXv_char11, AV226AlbRLote, GXv_int10) ;
         rrecstdp_impl.this.AV44EmprCod = GXv_char12[0] ;
         rrecstdp_impl.this.AV11BarCod = GXv_int16[0] ;
         rrecstdp_impl.this.AV13BarCodReo = GXv_int5[0] ;
         rrecstdp_impl.this.AV12BarCodPar = GXv_char11[0] ;
         rrecstdp_impl.this.AV227lotes = (byte)((byte)(GXv_int10[0])) ;
      }
      if ( ( AV192Carvema == 1 ) || ( AV163FlagEnd == 1 ) )
      {
         GXv_char12[0] = AV44EmprCod ;
         GXv_int16[0] = AV11BarCod ;
         GXv_int5[0] = AV13BarCodReo ;
         GXv_char11[0] = AV12BarCodPar ;
         GXv_char9[0] = AV232Albrloc ;
         GXv_char8[0] = AV276Loc ;
         GXv_int15[0] = AV275Albreccod ;
         new app.pprec002(remoteHandle, context).execute( GXv_char12, GXv_int16, GXv_int5, GXv_char11, GXv_char9, GXv_char8, GXv_int15) ;
         rrecstdp_impl.this.AV44EmprCod = GXv_char12[0] ;
         rrecstdp_impl.this.AV11BarCod = GXv_int16[0] ;
         rrecstdp_impl.this.AV13BarCodReo = GXv_int5[0] ;
         rrecstdp_impl.this.AV12BarCodPar = GXv_char11[0] ;
         rrecstdp_impl.this.AV232Albrloc = GXv_char9[0] ;
         rrecstdp_impl.this.AV276Loc = GXv_char8[0] ;
         rrecstdp_impl.this.AV275Albreccod = GXv_int15[0] ;
         AV233Lit99 = httpContext.getMessage( "Local.", "") ;
      }
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'INICIAR' Routine */
      returnInSub = false ;
      AV168Imp_agrup = (byte)(0) ;
      GXt_int17 = AV211Tejido ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV211Tejido = GXt_int17 ;
      GXt_int17 = AV236JPF ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "JPF", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV236JPF = GXt_int17 ;
      GXt_int17 = AV185Induyco ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV185Induyco = GXt_int17 ;
      GXt_int17 = AV189Sin_dec ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "SINDEC", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV189Sin_dec = GXt_int17 ;
      GXv_int5[0] = AV171FlagVt ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "VTABUA", ""), GXv_int5) ;
      rrecstdp_impl.this.AV171FlagVt = GXv_int5[0] ;
      GXv_int5[0] = AV53Flagidioma ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100001", GXv_int5) ;
      rrecstdp_impl.this.AV53Flagidioma = GXv_int5[0] ;
      GXt_int17 = AV192Carvema ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV192Carvema = GXt_int17 ;
      GXt_int17 = AV215erfoc ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV215erfoc = GXt_int17 ;
      GXt_int17 = AV249ImpLote ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV249ImpLote = GXt_int17 ;
      AV123Var3 = " " ;
      if ( AV53Flagidioma == 1 )
      {
         AV123Var3 = httpContext.getMessage( "Processado por Computador", "") ;
      }
      GXv_int5[0] = AV47Flag ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "030800", GXv_int5) ;
      rrecstdp_impl.this.AV47Flag = GXv_int5[0] ;
      GXv_int5[0] = AV54FlagImp ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100000", GXv_int5) ;
      rrecstdp_impl.this.AV54FlagImp = GXv_int5[0] ;
      GXv_int5[0] = AV48FlagBar ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100007", GXv_int5) ;
      rrecstdp_impl.this.AV48FlagBar = GXv_int5[0] ;
      GXv_int5[0] = AV50FlagCod ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100009", GXv_int5) ;
      rrecstdp_impl.this.AV50FlagCod = GXv_int5[0] ;
      GXv_int5[0] = AV52FlagEtm ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "ETM", ""), GXv_int5) ;
      rrecstdp_impl.this.AV52FlagEtm = GXv_int5[0] ;
      GXv_int5[0] = AV56FlagNline ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "NOLINE", ""), GXv_int5) ;
      rrecstdp_impl.this.AV56FlagNline = GXv_int5[0] ;
      GXv_char12[0] = AV31ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "RECPZA", ""), GXv_char12) ;
      rrecstdp_impl.this.AV31ContDsc = GXv_char12[0] ;
      GXv_int5[0] = AV109FlagTtx ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int5) ;
      rrecstdp_impl.this.AV109FlagTtx = GXv_int5[0] ;
      GXv_int5[0] = AV55FlagJbp ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "JBP", ""), GXv_int5) ;
      rrecstdp_impl.this.AV55FlagJbp = GXv_int5[0] ;
      GXv_int5[0] = AV234Carolina ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "CAROLI", ""), GXv_int5) ;
      rrecstdp_impl.this.AV234Carolina = GXv_int5[0] ;
      GXv_int5[0] = AV238indutexma ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int5) ;
      rrecstdp_impl.this.AV238indutexma = GXv_int5[0] ;
      GXv_int5[0] = AV108FlagSeq ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "SEQUEI", ""), GXv_int5) ;
      rrecstdp_impl.this.AV108FlagSeq = GXv_int5[0] ;
      GXv_int5[0] = AV163FlagEnd ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int5) ;
      rrecstdp_impl.this.AV163FlagEnd = GXv_int5[0] ;
      GXv_int5[0] = AV146RecAca ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "RECACA", ""), GXv_int5) ;
      rrecstdp_impl.this.AV146RecAca = GXv_int5[0] ;
      GXt_int17 = AV194Ricoltex ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "RICOLT", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV194Ricoltex = GXt_int17 ;
      GXt_int17 = AV201Kohler ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "KOHLER", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV201Kohler = GXt_int17 ;
      GXt_int17 = AV202Staack ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV202Staack = GXt_int17 ;
      GXt_char13 = AV94Lit0 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN045", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV94Lit0 = GXt_char13 ;
      GXt_char13 = AV73Lit3 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN674_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV73Lit3 = GXt_char13 ;
      GXt_char13 = AV84Lit4 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV84Lit4 = GXt_char13 ;
      GXt_char13 = AV126Lit5 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1211_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV126Lit5 = GXt_char13 ;
      GXt_char13 = AV127Lit6 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV127Lit6 = GXt_char13 ;
      GXt_char13 = AV128Lit7 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV128Lit7 = GXt_char13 ;
      GXt_char13 = AV129Lit8 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV129Lit8 = GXt_char13 ;
      GXt_char13 = AV130Lit9 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV130Lit9 = GXt_char13 ;
      GXt_char13 = AV96Lit10 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV96Lit10 = GXt_char13 ;
      GXt_char13 = AV97Lit11 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1127_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV97Lit11 = GXt_char13 ;
      GXt_char13 = AV98Lit12 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV98Lit12 = GXt_char13 ;
      GXt_char13 = AV99Lit13 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV99Lit13 = GXt_char13 ;
      GXt_char13 = AV100Lit14 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV100Lit14 = GXt_char13 ;
      GXt_char13 = AV101Lit15 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV101Lit15 = GXt_char13 ;
      GXt_char13 = AV102Lit16 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2205_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV102Lit16 = GXt_char13 ;
      GXt_char13 = AV103Lit17 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN416_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV103Lit17 = GXt_char13 ;
      GXt_char13 = AV104Lit18 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1022_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV104Lit18 = GXt_char13 ;
      GXt_char13 = AV105Lit19 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV105Lit19 = GXt_char13 ;
      GXt_char13 = AV107Lit20 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2396_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV107Lit20 = GXt_char13 ;
      GXt_char13 = AV64Lit21 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV64Lit21 = GXt_char13 ;
      GXt_char13 = AV65Lit22 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV65Lit22 = GXt_char13 ;
      GXt_char13 = AV66Lit23 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV66Lit23 = GXt_char13 ;
      GXt_char13 = AV67Lit24 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV67Lit24 = GXt_char13 ;
      GXt_char13 = AV68Lit25 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV68Lit25 = GXt_char13 ;
      GXt_char13 = AV69Lit26 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1663_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV69Lit26 = GXt_char13 ;
      GXt_char13 = AV70Lit27 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3003_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV70Lit27 = GXt_char13 ;
      GXt_char13 = AV71Lit28 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1373_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV71Lit28 = GXt_char13 ;
      GXt_char13 = AV72Lit29 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV72Lit29 = GXt_char13 ;
      GXt_char13 = AV74Lit30 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV74Lit30 = GXt_char13 ;
      GXt_char13 = AV75Lit31 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV75Lit31 = GXt_char13 ;
      GXt_char13 = AV76Lit32 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2470_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV76Lit32 = GXt_char13 ;
      GXt_char13 = AV77Lit33 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV77Lit33 = GXt_char13 ;
      GXt_char13 = AV78Lit34 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN352_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV78Lit34 = GXt_char13 ;
      GXt_char13 = AV79Lit35 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV79Lit35 = GXt_char13 ;
      GXt_char13 = AV80Lit36 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV80Lit36 = GXt_char13 ;
      GXt_char13 = AV81Lit37 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT108_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV81Lit37 = GXt_char13 ;
      GXt_char13 = AV82Lit38 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV82Lit38 = GXt_char13 ;
      GXt_char13 = AV83Lit39 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV83Lit39 = GXt_char13 ;
      GXt_char13 = AV85Lit40 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV85Lit40 = GXt_char13 ;
      GXt_char13 = AV86Lit41 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV86Lit41 = GXt_char13 ;
      GXt_char13 = AV151Lit42 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV151Lit42 = GXt_char13 ;
      GXt_char13 = AV150Lit43 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV150Lit43 = GXt_char13 ;
      GXt_char13 = AV174Lit45 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT188_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV174Lit45 = GXt_char13 ;
      GXt_char13 = AV175Lit46 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN209_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV175Lit46 = GXt_char13 ;
      GXt_char13 = AV176Lit47 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV176Lit47 = GXt_char13 ;
      GXt_char13 = AV178Lit48 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2028_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV178Lit48 = GXt_char13 ;
      GXt_char13 = AV179Lit49 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV179Lit49 = GXt_char13 ;
      AV181Lit50 = httpContext.getMessage( "Gr/m2", "") ;
      GXt_char13 = AV183Lit51 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV183Lit51 = GXt_char13 ;
      GXt_char13 = AV184Lit52 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      AV184Lit52 = GXt_char13 ;
      AV213Lit53 = httpContext.getMessage( "Modelo", "") ;
      GXt_int17 = AV220Serzedelo ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "SERZED", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV220Serzedelo = GXt_int17 ;
      GXt_int17 = AV240Code128 ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "COD128", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV240Code128 = GXt_int17 ;
      GXt_int17 = AV246Moda21 ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV246Moda21 = GXt_int17 ;
      GXt_int18 = AV253MaxAgr ;
      GXv_char12[0] = AV44EmprCod ;
      GXv_char11[0] = httpContext.getMessage( "MAXAGR", "") ;
      GXv_int16[0] = GXt_int18 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_int16) ;
      rrecstdp_impl.this.AV44EmprCod = GXv_char12[0] ;
      rrecstdp_impl.this.GXt_int18 = GXv_int16[0] ;
      AV253MaxAgr = (byte)(GXt_int18) ;
      GXt_int17 = AV262Artemalha ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV262Artemalha = GXt_int17 ;
      GXt_int17 = AV268Lote01 ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV268Lote01 = GXt_int17 ;
      GXt_int17 = AV271Tinamar ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV271Tinamar = GXt_int17 ;
      GXt_int17 = AV274Gavim ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "GAVIM", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV274Gavim = GXt_int17 ;
      GXt_int17 = AV281Act3of9 ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "GAV3O9", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV281Act3of9 = GXt_int17 ;
      GXt_int17 = AV294brochado ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "TONALI", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV294brochado = GXt_int17 ;
      GXt_int17 = AV297Code39azalea ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "COD39A", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV297Code39azalea = GXt_int17 ;
      AV256Lit60 = httpContext.getMessage( "Tq", "") ;
      if ( ( AV246Moda21 == 1 ) || ( AV215erfoc == 1 ) || ( AV192Carvema == 1 ) || ( AV268Lote01 == 1 ) )
      {
         AV256Lit60 = httpContext.getMessage( "Lote", "") ;
      }
      if ( AV253MaxAgr == 0 )
      {
         AV253MaxAgr = (byte)(10) ;
      }
      AV266Litnop = httpContext.getMessage( "NOP", "") ;
      AV267Litnov = httpContext.getMessage( "NOV", "") ;
      GXt_int17 = AV284Enc20c ;
      GXv_int5[0] = GXt_int17 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "20ENCO", ""), GXv_int5) ;
      rrecstdp_impl.this.GXt_int17 = GXv_int5[0] ;
      AV284Enc20c = GXt_int17 ;
      GXt_char13 = AV175Lit46 ;
      GXv_char12[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1098_", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char12[0] ;
      GXt_char19 = AV175Lit46 ;
      GXv_char11[0] = GXt_char19 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "20ENCO01", ""), (byte)(99), GXv_char11) ;
      rrecstdp_impl.this.GXt_char19 = GXv_char11[0] ;
      AV175Lit46 = ((AV284Enc20c==0) ? GXt_char13 : GXt_char19) ;
      GXt_char19 = AV266Litnop ;
      GXv_char12[0] = GXt_char19 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "VAR000", ""), (byte)(99), GXv_char12) ;
      rrecstdp_impl.this.GXt_char19 = GXv_char12[0] ;
      GXt_char13 = AV266Litnop ;
      GXv_char11[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "20ENCO02", ""), (byte)(99), GXv_char11) ;
      rrecstdp_impl.this.GXt_char13 = GXv_char11[0] ;
      AV266Litnop = ((AV284Enc20c==0) ? GXt_char19 : GXt_char13) ;
   }

   public void S211( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV251ArtObslon = " " ;
      /* Using cursor P06S623 */
      pr_default.execute(18, new Object[] {AV44EmprCod, Integer.valueOf(AV19CliCod), AV161ForSer});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A3072ArtObsLon = P06S623_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P06S623_n3072ArtObsLon[0] ;
         A65ArtCod = P06S623_A65ArtCod[0] ;
         A252CliCod = P06S623_A252CliCod[0] ;
         n252CliCod = P06S623_n252CliCod[0] ;
         A396EmprCod = P06S623_A396EmprCod[0] ;
         AV251ArtObslon = A3072ArtObsLon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(18);
   }

   public void S139( ) throws ProcessInterruptedException
   {
      /* 'OBS' Routine */
      returnInSub = false ;
      AV258IniI = (byte)(0) ;
      AV291CtrlLineas = (byte)(1) ;
      /* Using cursor P06S624 */
      pr_default.execute(19, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A130BarCodPar = P06S624_A130BarCodPar[0] ;
         A132BarCodReo = P06S624_A132BarCodReo[0] ;
         A129BarCod = P06S624_A129BarCod[0] ;
         A396EmprCod = P06S624_A396EmprCod[0] ;
         A187BarNotDsc = P06S624_A187BarNotDsc[0] ;
         A188BarNotLin = P06S624_A188BarNotLin[0] ;
         AV292BarNotDsc = A187BarNotDsc ;
         if ( AV258IniI == 0 )
         {
            h6S60( false, 18) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes:", ""), 7, Gx_line+0, 84, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+15, 481, Gx_line+15, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV258IniI = (byte)(1) ;
         }
         h6S60( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV292BarNotDsc, "")), 7, Gx_line+0, 482, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV291CtrlLineas = (byte)(AV291CtrlLineas+1) ;
         pr_default.readNext(19);
      }
      pr_default.close(19);
      AV259Nlin = (short)(GXutil.gxmlines( AV257Baraudobs, (short)(53))) ;
      AV260j = (byte)(1) ;
      AV258IniI = (byte)(0) ;
      while ( AV260j <= AV259Nlin )
      {
         if ( AV258IniI == 0 )
         {
            h6S60( false, 18) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes:", ""), 7, Gx_line+0, 84, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+15, 481, Gx_line+15, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV258IniI = (byte)(1) ;
         }
         AV261Obss = GXutil.gxgetmli( AV257Baraudobs, AV260j, (short)(53)) ;
         h6S60( false, 18) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV261Obss, "")), 7, Gx_line+1, 394, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         AV260j = (byte)(AV260j+1) ;
      }
      h6S60( false, 24) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "VB:", ""), 113, Gx_line+6, 137, Gx_line+24, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV287Vbomba), "ZZZ9")), 150, Gx_line+6, 180, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(7, Gx_line+3, 780, Gx_line+3, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "VS:", ""), 205, Gx_line+6, 228, Gx_line+24, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV288Vsarillo), "ZZ9")), 231, Gx_line+6, 254, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AI:", ""), 278, Gx_line+6, 297, Gx_line+24, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV289Ainjector), "ZZ9")), 301, Gx_line+6, 324, Gx_line+23, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tv:", ""), 350, Gx_line+6, 369, Gx_line+24, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV286Tvueltas, "ZZ9.9")), 372, Gx_line+6, 409, Gx_line+23, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+24) ;
   }

   public void S221( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      AV295Dsc_Idtx = " " ;
      /* Using cursor P06S625 */
      pr_default.execute(20, new Object[] {AV296Cod_Idtx});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A10887Cod_Idtx = P06S625_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P06S625_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P06S625_n10888Dsc_Idtx[0] ;
         A396EmprCod = P06S625_A396EmprCod[0] ;
         AV295Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         pr_default.readNext(20);
      }
      pr_default.close(20);
   }

   public void h6S60( boolean bFoot ,
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
               AV228TxtKg = "" ;
               AV229TxtMt = "" ;
               if ( AV47Flag == 1 )
               {
                  AV35Coste = GXutil.roundDecimal( AV36Coste2, 2) ;
                  AV33CosKgm = DecimalUtil.doubleToDec(0) ;
                  AV34CosMtr = DecimalUtil.doubleToDec(0) ;
                  if ( A812RecTotKgm.doubleValue() != 0 )
                  {
                     AV33CosKgm = GXutil.roundDecimal( AV35Coste.divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV228TxtKg = httpContext.getMessage( "K", "") ;
                  }
                  if ( A871RecTotMtr.doubleValue() != 0 )
                  {
                     AV34CosMtr = GXutil.roundDecimal( AV35Coste.divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV229TxtMt = httpContext.getMessage( "M", "") ;
                  }
               }
               getPrinter().GxAttris("Times New Roman", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Var3, "")), 650, Gx_line+2, 774, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31ContDsc, "")), 7, Gx_line+2, 91, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 119, Gx_line+0, 172, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TermUsu, "@!")), 179, Gx_line+0, 238, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 255, Gx_line+0, 322, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 335, Gx_line+0, 393, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 327, Gx_line+0, 332, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35Coste, "ZZZZZ.ZZ")), 406, Gx_line+0, 465, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33CosKgm, "ZZZZZ.ZZ")), 479, Gx_line+0, 537, Gx_line+16, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosMtr, "ZZZZZ.ZZ")), 558, Gx_line+0, 617, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV228TxtKg, "")), 541, Gx_line+0, 556, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV229TxtMt, "")), 619, Gx_line+0, 634, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+1, 779, Gx_line+1, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
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
            if ( GxHdr6 )
            {
               if ( ! (0==AV48FlagBar) )
               {
                  if ( AV297Code39azalea == 1 )
                  {
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV191Texto_r, "")), 574, Gx_line+0, 684, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV190DSCCAUSA, "")), 574, Gx_line+24, 731, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 711, Gx_line+44, 806, Gx_line+59, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV299hdrcode39azalea, "")), 209, Gx_line+6, 298, Gx_line+23, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+66) ;
                  }
                  else
                  {
                     if ( AV240Code128 == 0 )
                     {
                        getPrinter().GxAttris("3 of 9 Barcode", 26, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89HojRut, "")), 275, Gx_line+5, 526, Gx_line+33, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV191Texto_r, "")), 574, Gx_line+1, 684, Gx_line+22, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV190DSCCAUSA, "")), 574, Gx_line+25, 731, Gx_line+42, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255VarAux10, "")), 715, Gx_line+29, 810, Gx_line+44, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+44) ;
                     }
                     else
                     {
                        getPrinter().GxAttris("Code 128", 40, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV243Hdr11, "")), 300, Gx_line+0, 489, Gx_line+55, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV191Texto_r, "")), 579, Gx_line+0, 689, Gx_line+21, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV190DSCCAUSA, "")), 579, Gx_line+24, 736, Gx_line+41, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV239HdrAlfa, "")), 579, Gx_line+43, 653, Gx_line+60, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+60) ;
                     }
                  }
               }
               if ( A5109RecNumInt > 0 )
               {
                  AV169Num_int = "(" + GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)) + ")" ;
               }
               else
               {
                  AV169Num_int = GXutil.space( (short)(10)) ;
               }
               AV170LinMaq = "(" + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + ")" ;
               if ( ( ( AV163FlagEnd == 1 ) ) || ( ( AV262Artemalha == 1 ) ) )
               {
                  getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139NomEmp, "")), 20, Gx_line+5, 270, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 500, Gx_line+5, 559, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 644, Gx_line+5, 747, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+1, 780, Gx_line+60, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit3, "")), 434, Gx_line+5, 492, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84Lit4, "")), 594, Gx_line+5, 632, Gx_line+21, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(426, Gx_line+1, 771, Gx_line+25, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128Lit7, "")), 654, Gx_line+44, 724, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 725, Gx_line+44, 770, Gx_line+61, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV180RecObs[1-1], "")), 20, Gx_line+26, 459, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV180RecObs[2-1], "")), 20, Gx_line+44, 459, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Remonta, "")), 520, Gx_line+43, 629, Gx_line+60, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+63) ;
               }
               else
               {
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 350, Gx_line+6, 417, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 424, Gx_line+6, 527, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Remonta, "")), 168, Gx_line+24, 277, Gx_line+41, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+1, 780, Gx_line+42, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit3, "")), 284, Gx_line+6, 342, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128Lit7, "")), 661, Gx_line+6, 731, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 725, Gx_line+6, 770, Gx_line+23, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV184Lit52, "")), 284, Gx_line+24, 342, Gx_line+40, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")), 350, Gx_line+24, 417, Gx_line+40, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4867RecFecMod, "99/99/99 99:99"), 423, Gx_line+24, 526, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV222barmaccod), "ZZZZZZZZ")), 710, Gx_line+24, 769, Gx_line+41, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94Lit0, "")), 15, Gx_line+24, 110, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139NomEmp, "")), 15, Gx_line+6, 265, Gx_line+23, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+43) ;
               }
               if ( AV215erfoc == 1 )
               {
                  getPrinter().GxDrawRect(7, Gx_line+5, 170, Gx_line+36, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Control Peroxido:", ""), 15, Gx_line+7, 114, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(313, Gx_line+5, 476, Gx_line+36, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Controlo pH:", ""), 318, Gx_line+7, 391, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(618, Gx_line+5, 781, Gx_line+36, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Ok da Cor:", ""), 623, Gx_line+7, 685, Gx_line+21, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+42) ;
                  getPrinter().GxDrawRect(7, Gx_line+0, 780, Gx_line+24, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lotes", ""), 15, Gx_line+4, 47, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV226AlbRLote[1-1], "")), 72, Gx_line+4, 177, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV226AlbRLote[3-1], "")), 370, Gx_line+4, 475, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV226AlbRLote[2-1], "")), 222, Gx_line+4, 327, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV226AlbRLote[5-1], "")), 669, Gx_line+4, 774, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV226AlbRLote[4-1], "")), 520, Gx_line+4, 625, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 197, Gx_line+4, 202, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("/", 346, Gx_line+4, 351, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("/", 496, Gx_line+4, 501, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("/", 645, Gx_line+4, 650, Gx_line+22, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+24) ;
               }
               AV166BarSer_10 = GXutil.substring( A212BarSer, 1, 10) ;
               if ( A224BarTraP1 > 0 )
               {
                  AV165VCompo = GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
                  if ( A225BarTraP2 > 0 )
                  {
                     AV165VCompo += GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
                  }
                  if ( A226BarTraP3 > 0 )
                  {
                     AV165VCompo += GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
                  }
               }
               if ( A232BarUrdP1 > 0 )
               {
                  AV223Vcomp2 = GXutil.trim( A229BarUrd1) + " " + GXutil.trim( GXutil.str( A232BarUrdP1, 3, 0)) + "%" ;
                  if ( A233BarUrdP2 > 0 )
                  {
                     AV223Vcomp2 = AV165VCompo + GXutil.trim( A230BarUrd2) + " " + GXutil.trim( GXutil.str( A233BarUrdP2, 3, 0)) + "%" ;
                  }
                  if ( A234BarUrdP3 > 0 )
                  {
                     AV223Vcomp2 = AV165VCompo + GXutil.trim( A231BarUrd3) + " " + GXutil.trim( GXutil.str( A234BarUrdP3, 3, 0)) + "%" ;
                  }
               }
               AV167BarTipArt = A217BarTipArt ;
               GXv_char12[0] = AV308po ;
               new app.barordcomp(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char12) ;
               rrecstdp_impl.this.AV308po = GXv_char12[0] ;
               AV304color = ((GXutil.strcmp("", AV302DisNormID)==0)&&(GXutil.strcmp("", AV303DisTraID)==0) ? GXutil.trim( A135BarColNom) : ((GXutil.strcmp("", AV302DisNormID)==0) ? GXutil.trim( A135BarColNom)+" "+GXutil.trim( AV303DisTraID) : GXutil.trim( AV302DisNormID)+" "+GXutil.trim( A135BarColNom)+" "+GXutil.trim( AV303DisTraID))) ;
               /* Execute user subroutine: 'TIPART' */
               S119 ();
               if ( returnInSub )
               {
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( ( AV163FlagEnd == 1 ) ) || ( ( AV262Artemalha == 1 ) ) )
               {
                  AV212BarPes = (short)(A1909BarGraAca*(A125BarAncAca1/ (double) (100))) ;
                  getPrinter().GxDrawRect(520, Gx_line+1, 786, Gx_line+52, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 88, Gx_line+7, 138, Gx_line+23, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 152, Gx_line+7, 405, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 88, Gx_line+26, 206, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 95, Gx_line+102, 191, Gx_line+119, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 264, Gx_line+103, 309, Gx_line+120, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 322, Gx_line+102, 337, Gx_line+120, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DesCol, "")), 384, Gx_line+102, 509, Gx_line+119, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DesInt, "")), 393, Gx_line+124, 503, Gx_line+141, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 95, Gx_line+124, 191, Gx_line+141, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9")), 264, Gx_line+124, 309, Gx_line+141, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 20, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Hdr, "")), 622, Gx_line+4, 773, Gx_line+37, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+3, 518, Gx_line+95, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+98, 514, Gx_line+149, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit8, "")), 21, Gx_line+7, 71, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Lit10, "")), 21, Gx_line+26, 71, Gx_line+42, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Lit11, "")), 21, Gx_line+60, 71, Gx_line+76, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 23, Gx_line+102, 90, Gx_line+118, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Lit13, "")), 209, Gx_line+102, 260, Gx_line+118, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit14, "")), 23, Gx_line+124, 90, Gx_line+140, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Lit15, "")), 209, Gx_line+124, 260, Gx_line+140, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit16, "")), 322, Gx_line+124, 372, Gx_line+140, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 366, Gx_line+102, 382, Gx_line+119, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165VCompo, "")), 88, Gx_line+60, 308, Gx_line+77, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164TipArtDsc, "")), 88, Gx_line+43, 308, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 524, Gx_line+56, 589, Gx_line+72, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarMaqCod, "")), 524, Gx_line+80, 619, Gx_line+101, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DescMaq, "")), 593, Gx_line+55, 760, Gx_line+74, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit29, "")), 524, Gx_line+110, 589, Gx_line+126, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), 596, Gx_line+110, 678, Gx_line+127, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit28, "")), 524, Gx_line+129, 589, Gx_line+145, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 594, Gx_line+129, 644, Gx_line+146, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit27, "")), 690, Gx_line+110, 748, Gx_line+126, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV133MaqMicro), "Z9")), 755, Gx_line+110, 772, Gx_line+127, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170LinMaq, "")), 527, Gx_line+35, 572, Gx_line+52, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Num_int, "")), 656, Gx_line+35, 739, Gx_line+52, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 225, Gx_line+26, 416, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178Lit48, "")), 380, Gx_line+50, 438, Gx_line+67, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 380, Gx_line+72, 403, Gx_line+89, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 417, Gx_line+72, 440, Gx_line+89, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181Lit50, "")), 449, Gx_line+50, 513, Gx_line+67, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 449, Gx_line+72, 479, Gx_line+89, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9")), 482, Gx_line+72, 512, Gx_line+89, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(373, Gx_line+45, 516, Gx_line+91, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198MaqCdb, "")), 644, Gx_line+79, 787, Gx_line+103, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(520, Gx_line+51, 786, Gx_line+51, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(520, Gx_line+51, 520, Gx_line+146, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(520, Gx_line+146, 786, Gx_line+146, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(373, Gx_line+24, 516, Gx_line+46, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Gr/m/l", ""), 438, Gx_line+28, 478, Gx_line+46, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV212BarPes), "ZZZ9")), 479, Gx_line+28, 509, Gx_line+45, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV276Loc, "")), 88, Gx_line+78, 162, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV233Lit99, "")), 21, Gx_line+78, 71, Gx_line+94, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lote Nº", ""), 181, Gx_line+78, 224, Gx_line+96, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV275Albreccod), "ZZZZZZZ9")), 231, Gx_line+78, 290, Gx_line+95, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "O.S.", ""), 527, Gx_line+13, 553, Gx_line+31, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+151) ;
               }
               else
               {
                  if ( AV246Moda21 == 1 )
                  {
                     getPrinter().GxDrawRect(520, Gx_line+4, 786, Gx_line+51, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 75, Gx_line+8, 126, Gx_line+26, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 129, Gx_line+8, 380, Gx_line+26, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 75, Gx_line+27, 209, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 94, Gx_line+91, 203, Gx_line+109, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 263, Gx_line+91, 314, Gx_line+109, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 321, Gx_line+91, 336, Gx_line+109, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DesCol, "")), 383, Gx_line+91, 509, Gx_line+109, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Tonalidad, "")), 94, Gx_line+109, 203, Gx_line+127, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV142NumCli), "ZZZZZ9")), 263, Gx_line+109, 314, Gx_line+127, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Hdr, "")), 655, Gx_line+9, 756, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(7, Gx_line+3, 514, Gx_line+83, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(7, Gx_line+85, 514, Gx_line+149, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit8, "")), 20, Gx_line+8, 70, Gx_line+24, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130Lit9, "")), 526, Gx_line+13, 651, Gx_line+30, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Lit10, "")), 20, Gx_line+27, 70, Gx_line+43, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Lit11, "")), 20, Gx_line+45, 87, Gx_line+61, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 20, Gx_line+91, 87, Gx_line+107, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Lit13, "")), 208, Gx_line+91, 259, Gx_line+107, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit14, "")), 20, Gx_line+109, 87, Gx_line+125, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Lit15, "")), 208, Gx_line+109, 259, Gx_line+125, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 358, Gx_line+91, 376, Gx_line+109, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165VCompo, "")), 92, Gx_line+45, 342, Gx_line+62, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170LinMaq, "")), 526, Gx_line+33, 571, Gx_line+50, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Num_int, "")), 655, Gx_line+32, 738, Gx_line+49, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 440, Gx_line+27, 508, Gx_line+45, 1+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Lit46, "")), 440, Gx_line+8, 507, Gx_line+25, 1, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 384, Gx_line+63, 410, Gx_line+81, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178Lit48, "")), 384, Gx_line+45, 442, Gx_line+62, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 418, Gx_line+63, 444, Gx_line+81, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 211, Gx_line+27, 429, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 526, Gx_line+76, 591, Gx_line+92, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarMaqCod, "")), 526, Gx_line+100, 621, Gx_line+121, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DescMaq, "")), 596, Gx_line+75, 763, Gx_line+94, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198MaqCdb, "")), 629, Gx_line+99, 772, Gx_line+123, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(520, Gx_line+73, 786, Gx_line+73, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(520, Gx_line+73, 520, Gx_line+148, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(520, Gx_line+147, 786, Gx_line+147, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14BarGraAca), "ZZZ9")), 454, Gx_line+63, 484, Gx_line+80, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit16, "")), 331, Gx_line+109, 381, Gx_line+125, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DesInt, "")), 383, Gx_line+109, 493, Gx_line+126, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182ForTonal, "")), 92, Gx_line+63, 259, Gx_line+79, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Lit51, "")), 20, Gx_line+63, 87, Gx_line+79, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Gr/m2", ""), 450, Gx_line+45, 489, Gx_line+63, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV301NormaDsc, "")), 572, Gx_line+127, 729, Gx_line+147, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "PO", ""), 20, Gx_line+127, 40, Gx_line+145, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV308po, "")), 94, Gx_line+127, 460, Gx_line+144, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+152) ;
                  }
                  else
                  {
                     if ( AV185Induyco == 1 )
                     {
                     }
                     else
                     {
                        if ( AV192Carvema == 1 )
                        {
                           AV174Lit45 = "" ;
                           AV172DscSol = "" ;
                        }
                        else
                        {
                           AV181Lit50 = " " ;
                           AV14BarGraAca = (short)(0) ;
                           AV195Partida = ((AV274Gavim==0) ? 0 : AV195Partida) ;
                           AV176Lit47 = " " ;
                        }
                        if ( AV211Tejido == 0 )
                        {
                           AV182ForTonal = ((AV271Tinamar==1) ? A2454BarGirar : AV182ForTonal) ;
                           if ( AV274Gavim == 0 )
                           {
                              if ( AV192Carvema == 0 )
                              {
                                 getPrinter().GxDrawRect(520, Gx_line+6, 786, Gx_line+53, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 69, Gx_line+5, 119, Gx_line+22, 2, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 124, Gx_line+5, 377, Gx_line+22, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 69, Gx_line+24, 202, Gx_line+41, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 85, Gx_line+127, 193, Gx_line+143, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 254, Gx_line+128, 299, Gx_line+145, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 322, Gx_line+127, 337, Gx_line+145, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DesCol, "")), 384, Gx_line+127, 509, Gx_line+144, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Tonalidad, "")), 85, Gx_line+148, 193, Gx_line+164, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV142NumCli), "ZZZZZ9")), 254, Gx_line+148, 299, Gx_line+165, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Hdr, "")), 656, Gx_line+11, 757, Gx_line+35, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(7, Gx_line+1, 514, Gx_line+120, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(7, Gx_line+123, 514, Gx_line+189, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit8, "")), 15, Gx_line+5, 65, Gx_line+21, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130Lit9, "")), 527, Gx_line+15, 652, Gx_line+32, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Lit10, "")), 15, Gx_line+24, 65, Gx_line+40, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Lit11, "")), 15, Gx_line+80, 65, Gx_line+96, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 14, Gx_line+127, 81, Gx_line+143, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Lit13, "")), 200, Gx_line+127, 251, Gx_line+143, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit14, "")), 14, Gx_line+148, 81, Gx_line+164, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Lit15, "")), 200, Gx_line+148, 251, Gx_line+164, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 350, Gx_line+127, 366, Gx_line+144, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165VCompo, "")), 69, Gx_line+79, 319, Gx_line+96, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164TipArtDsc, "")), 69, Gx_line+60, 319, Gx_line+77, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170LinMaq, "")), 527, Gx_line+35, 572, Gx_line+52, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Num_int, "")), 656, Gx_line+34, 739, Gx_line+51, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV285BarEnccli, "")), 331, Gx_line+31, 478, Gx_line+48, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Lit46, "")), 405, Gx_line+7, 472, Gx_line+24, 1, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV195Partida), "ZZZZZZZZ")), 449, Gx_line+69, 508, Gx_line+86, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176Lit47, "")), 445, Gx_line+49, 503, Gx_line+66, 1, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 389, Gx_line+69, 412, Gx_line+86, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178Lit48, "")), 382, Gx_line+51, 440, Gx_line+68, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 422, Gx_line+69, 445, Gx_line+86, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(382, Gx_line+2, 382, Gx_line+28, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit16, "")), 306, Gx_line+148, 382, Gx_line+165, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DesInt, "")), 384, Gx_line+148, 494, Gx_line+165, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 69, Gx_line+43, 260, Gx_line+60, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Lit51, "")), 14, Gx_line+168, 81, Gx_line+184, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182ForTonal, "")), 85, Gx_line+168, 252, Gx_line+184, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV174Lit45, "")), 295, Gx_line+168, 384, Gx_line+185, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV172DscSol, "")), 384, Gx_line+168, 494, Gx_line+185, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 526, Gx_line+63, 591, Gx_line+79, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarMaqCod, "")), 613, Gx_line+108, 695, Gx_line+125, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DescMaq, "")), 601, Gx_line+61, 768, Gx_line+80, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit29, "")), 526, Gx_line+127, 591, Gx_line+143, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), 601, Gx_line+127, 683, Gx_line+144, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit28, "")), 526, Gx_line+146, 591, Gx_line+162, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 601, Gx_line+146, 651, Gx_line+163, 2, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit27, "")), 697, Gx_line+127, 755, Gx_line+143, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV133MaqMicro), "Z9")), 763, Gx_line+127, 780, Gx_line+144, 2, 0, 0, 0) ;
                                 getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198MaqCdb, "")), 582, Gx_line+82, 725, Gx_line+106, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(520, Gx_line+56, 786, Gx_line+56, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(520, Gx_line+56, 520, Gx_line+188, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(520, Gx_line+188, 786, Gx_line+188, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV218DesAcaqui, "")), 14, Gx_line+101, 234, Gx_line+118, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV219BarPle, "")), 169, Gx_line+101, 243, Gx_line+118, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV232Albrloc, "")), 619, Gx_line+166, 808, Gx_line+185, 1+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV233Lit99, "")), 526, Gx_line+167, 608, Gx_line+184, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14BarGraAca), "ZZZ9")), 456, Gx_line+69, 486, Gx_line+86, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181Lit50, "")), 445, Gx_line+51, 498, Gx_line+68, 1+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV264Baritem1, "")), 307, Gx_line+101, 381, Gx_line+118, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV265BarItem3, "")), 441, Gx_line+101, 515, Gx_line+118, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV266Litnop, "")), 250, Gx_line+101, 305, Gx_line+118, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV267Litnov, "")), 383, Gx_line+101, 438, Gx_line+118, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV213Lit53, "")), 356, Gx_line+85, 438, Gx_line+102, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV214BarMdlcod, "")), 419, Gx_line+85, 515, Gx_line+102, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(326, Gx_line+28, 384, Gx_line+28, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(326, Gx_line+29, 326, Gx_line+99, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(8, Gx_line+98, 327, Gx_line+98, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(327, Gx_line+49, 515, Gx_line+49, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+190) ;
                              }
                              else
                              {
                                 getPrinter().GxDrawRect(519, Gx_line+9, 785, Gx_line+56, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 68, Gx_line+8, 118, Gx_line+25, 2, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 123, Gx_line+8, 376, Gx_line+25, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 68, Gx_line+27, 201, Gx_line+44, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV304color, "")), 85, Gx_line+118, 261, Gx_line+135, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 322, Gx_line+118, 337, Gx_line+136, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DesCol, "")), 384, Gx_line+118, 509, Gx_line+135, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Tonalidad, "")), 85, Gx_line+139, 193, Gx_line+155, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV142NumCli), "ZZZZZ9")), 254, Gx_line+139, 299, Gx_line+156, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Hdr, "")), 655, Gx_line+15, 756, Gx_line+39, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(7, Gx_line+4, 514, Gx_line+106, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(7, Gx_line+110, 514, Gx_line+182, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit8, "")), 14, Gx_line+8, 64, Gx_line+24, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130Lit9, "")), 526, Gx_line+18, 651, Gx_line+35, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Lit10, "")), 14, Gx_line+27, 64, Gx_line+43, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Lit11, "")), 14, Gx_line+83, 64, Gx_line+99, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 14, Gx_line+118, 81, Gx_line+134, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit14, "")), 14, Gx_line+139, 81, Gx_line+155, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Lit15, "")), 200, Gx_line+139, 251, Gx_line+155, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 350, Gx_line+118, 366, Gx_line+135, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165VCompo, "")), 68, Gx_line+82, 318, Gx_line+99, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164TipArtDsc, "")), 68, Gx_line+64, 318, Gx_line+81, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170LinMaq, "")), 526, Gx_line+39, 571, Gx_line+56, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Num_int, "")), 655, Gx_line+38, 738, Gx_line+55, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV285BarEnccli, "")), 330, Gx_line+34, 477, Gx_line+51, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Lit46, "")), 404, Gx_line+10, 471, Gx_line+27, 1, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV195Partida), "ZZZZZZZZ")), 448, Gx_line+72, 507, Gx_line+89, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176Lit47, "")), 444, Gx_line+52, 502, Gx_line+69, 1, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 388, Gx_line+72, 411, Gx_line+89, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178Lit48, "")), 381, Gx_line+54, 439, Gx_line+71, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 421, Gx_line+72, 444, Gx_line+89, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(381, Gx_line+5, 381, Gx_line+31, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit16, "")), 306, Gx_line+139, 382, Gx_line+156, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DesInt, "")), 384, Gx_line+139, 494, Gx_line+156, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 68, Gx_line+46, 259, Gx_line+63, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Lit51, "")), 14, Gx_line+158, 81, Gx_line+174, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182ForTonal, "")), 85, Gx_line+158, 252, Gx_line+174, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV174Lit45, "")), 295, Gx_line+158, 384, Gx_line+175, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV172DscSol, "")), 384, Gx_line+158, 494, Gx_line+175, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 525, Gx_line+66, 590, Gx_line+82, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarMaqCod, "")), 611, Gx_line+111, 693, Gx_line+128, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DescMaq, "")), 600, Gx_line+65, 767, Gx_line+84, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit29, "")), 525, Gx_line+130, 590, Gx_line+146, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), 600, Gx_line+130, 682, Gx_line+147, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit28, "")), 525, Gx_line+149, 590, Gx_line+165, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 600, Gx_line+149, 650, Gx_line+166, 2, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit27, "")), 696, Gx_line+130, 754, Gx_line+146, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV133MaqMicro), "Z9")), 761, Gx_line+130, 778, Gx_line+147, 2, 0, 0, 0) ;
                                 getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198MaqCdb, "")), 581, Gx_line+85, 724, Gx_line+109, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(519, Gx_line+59, 785, Gx_line+59, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(519, Gx_line+59, 519, Gx_line+191, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(519, Gx_line+191, 785, Gx_line+191, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV232Albrloc, "")), 618, Gx_line+169, 807, Gx_line+188, 1+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV233Lit99, "")), 525, Gx_line+170, 607, Gx_line+187, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14BarGraAca), "ZZZ9")), 455, Gx_line+72, 485, Gx_line+89, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV181Lit50, "")), 444, Gx_line+54, 497, Gx_line+71, 1+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(325, Gx_line+31, 383, Gx_line+31, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(325, Gx_line+32, 325, Gx_line+106, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(326, Gx_line+52, 514, Gx_line+52, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+195) ;
                              }
                           }
                           else
                           {
                              AV248Litpda = ((AV274Gavim==1) ? httpContext.getMessage( "Partida", "") : "") ;
                              AV195Partida = A1503BarPart ;
                              getPrinter().GxDrawRect(519, Gx_line+2, 785, Gx_line+49, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 82, Gx_line+6, 133, Gx_line+24, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 148, Gx_line+6, 399, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 82, Gx_line+25, 215, Gx_line+42, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 84, Gx_line+96, 207, Gx_line+115, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 270, Gx_line+96, 327, Gx_line+115, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 346, Gx_line+97, 361, Gx_line+115, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DesCol, "")), 383, Gx_line+97, 508, Gx_line+114, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Tonalidad, "")), 84, Gx_line+118, 192, Gx_line+134, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV142NumCli), "ZZZZZ9")), 253, Gx_line+118, 298, Gx_line+135, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Hdr, "")), 655, Gx_line+7, 756, Gx_line+31, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawRect(6, Gx_line+0, 513, Gx_line+89, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxDrawRect(6, Gx_line+93, 513, Gx_line+140, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit8, "")), 13, Gx_line+6, 63, Gx_line+22, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130Lit9, "")), 526, Gx_line+10, 651, Gx_line+27, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Lit10, "")), 13, Gx_line+25, 63, Gx_line+41, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Lit11, "")), 13, Gx_line+65, 63, Gx_line+81, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 13, Gx_line+97, 80, Gx_line+113, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Lit13, "")), 216, Gx_line+97, 267, Gx_line+113, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit14, "")), 13, Gx_line+118, 80, Gx_line+134, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Lit15, "")), 199, Gx_line+118, 250, Gx_line+134, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 364, Gx_line+97, 380, Gx_line+114, 2+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165VCompo, "")), 82, Gx_line+65, 332, Gx_line+82, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164TipArtDsc, "")), 82, Gx_line+45, 332, Gx_line+62, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170LinMaq, "")), 526, Gx_line+31, 571, Gx_line+48, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Num_int, "")), 655, Gx_line+30, 738, Gx_line+47, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 440, Gx_line+25, 507, Gx_line+42, 1, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Lit46, "")), 440, Gx_line+6, 507, Gx_line+23, 1, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV195Partida), "ZZZZZZZZ")), 427, Gx_line+65, 503, Gx_line+84, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(349, Gx_line+45, 349, Gx_line+87, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(349, Gx_line+45, 432, Gx_line+45, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(431, Gx_line+1, 431, Gx_line+46, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit16, "")), 305, Gx_line+118, 381, Gx_line+135, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DesInt, "")), 383, Gx_line+118, 493, Gx_line+135, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 226, Gx_line+25, 417, Gx_line+42, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 525, Gx_line+58, 590, Gx_line+74, 0, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarMaqCod, "")), 611, Gx_line+104, 693, Gx_line+121, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DescMaq, "")), 600, Gx_line+57, 767, Gx_line+76, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit29, "")), 525, Gx_line+123, 590, Gx_line+139, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), 600, Gx_line+123, 682, Gx_line+140, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit27, "")), 696, Gx_line+123, 754, Gx_line+139, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV133MaqMicro), "Z9")), 761, Gx_line+123, 778, Gx_line+140, 2, 0, 0, 0) ;
                              getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198MaqCdb, "")), 581, Gx_line+78, 724, Gx_line+102, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(519, Gx_line+52, 785, Gx_line+52, 1, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(519, Gx_line+52, 519, Gx_line+142, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV248Litpda, "")), 356, Gx_line+65, 423, Gx_line+84, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+142) ;
                           }
                        }
                        else
                        {
                           getPrinter().GxDrawRect(520, Gx_line+5, 786, Gx_line+52, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 83, Gx_line+11, 133, Gx_line+28, 2, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 144, Gx_line+11, 397, Gx_line+28, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 83, Gx_line+30, 216, Gx_line+47, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 85, Gx_line+127, 193, Gx_line+144, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 254, Gx_line+127, 304, Gx_line+144, 2, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 320, Gx_line+127, 335, Gx_line+145, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DesCol, "")), 379, Gx_line+127, 504, Gx_line+144, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Tonalidad, "")), 85, Gx_line+148, 193, Gx_line+165, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV142NumCli), "ZZZZZ9")), 254, Gx_line+148, 304, Gx_line+165, 2, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Hdr, "")), 661, Gx_line+13, 762, Gx_line+37, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawRect(7, Gx_line+5, 514, Gx_line+121, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                           getPrinter().GxDrawRect(7, Gx_line+123, 514, Gx_line+189, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit8, "")), 14, Gx_line+11, 64, Gx_line+27, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130Lit9, "")), 532, Gx_line+16, 657, Gx_line+33, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Lit10, "")), 14, Gx_line+30, 64, Gx_line+46, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Lit11, "")), 14, Gx_line+67, 64, Gx_line+83, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 14, Gx_line+127, 81, Gx_line+143, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Lit13, "")), 200, Gx_line+127, 251, Gx_line+143, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit14, "")), 14, Gx_line+148, 81, Gx_line+164, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Lit15, "")), 200, Gx_line+148, 251, Gx_line+164, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 350, Gx_line+127, 366, Gx_line+144, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165VCompo, "")), 83, Gx_line+67, 333, Gx_line+84, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164TipArtDsc, "")), 83, Gx_line+49, 333, Gx_line+66, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170LinMaq, "")), 532, Gx_line+36, 577, Gx_line+53, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Num_int, "")), 661, Gx_line+35, 744, Gx_line+52, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 436, Gx_line+34, 503, Gx_line+51, 1, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Lit46, "")), 436, Gx_line+16, 503, Gx_line+33, 1, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV195Partida), "ZZZZZZZZ")), 450, Gx_line+77, 509, Gx_line+94, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176Lit47, "")), 442, Gx_line+59, 500, Gx_line+76, 1, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 385, Gx_line+77, 408, Gx_line+94, 2+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178Lit48, "")), 381, Gx_line+59, 439, Gx_line+76, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 419, Gx_line+77, 442, Gx_line+94, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawLine(371, Gx_line+50, 371, Gx_line+121, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(371, Gx_line+50, 429, Gx_line+50, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(428, Gx_line+6, 428, Gx_line+51, 1, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit16, "")), 310, Gx_line+148, 375, Gx_line+165, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DesInt, "")), 379, Gx_line+148, 489, Gx_line+165, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 222, Gx_line+30, 357, Gx_line+47, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Lit51, "")), 14, Gx_line+168, 81, Gx_line+184, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182ForTonal, "")), 85, Gx_line+168, 252, Gx_line+185, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV174Lit45, "")), 288, Gx_line+168, 377, Gx_line+185, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV172DscSol, "")), 379, Gx_line+168, 489, Gx_line+185, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 526, Gx_line+64, 591, Gx_line+80, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarMaqCod, "")), 526, Gx_line+96, 621, Gx_line+117, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DescMaq, "")), 606, Gx_line+63, 773, Gx_line+82, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit29, "")), 526, Gx_line+127, 591, Gx_line+143, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV231RecNumPrg, "")), 603, Gx_line+127, 658, Gx_line+144, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit27, "")), 526, Gx_line+168, 584, Gx_line+184, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV133MaqMicro), "Z9")), 641, Gx_line+168, 658, Gx_line+185, 2, 0, 0, 0) ;
                           getPrinter().GxDrawLine(520, Gx_line+57, 786, Gx_line+57, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(520, Gx_line+57, 520, Gx_line+187, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(520, Gx_line+188, 786, Gx_line+188, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV223Vcomp2, "")), 83, Gx_line+84, 333, Gx_line+100, 0, 0, 0, 0) ;
                           getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198MaqCdb, "")), 644, Gx_line+94, 787, Gx_line+118, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV218DesAcaqui, "")), 14, Gx_line+102, 234, Gx_line+119, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV219BarPle, "")), 198, Gx_line+102, 272, Gx_line+119, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV230MacProDsc, "")), 669, Gx_line+128, 774, Gx_line+145, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 607, Gx_line+147, 657, Gx_line+164, 2, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit28, "")), 526, Gx_line+147, 591, Gx_line+163, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+190) ;
                           if ( AV236JPF == 1 )
                           {
                              if ( GXutil.strcmp(A9775BarItem1, " ") != 0 )
                              {
                                 AV237BarCal = A9775BarItem1 ;
                              }
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(httpContext.getMessage( "Lote Fiaçao :", ""), 18, Gx_line+1, 91, Gx_line+19, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV237BarCal, "")), 95, Gx_line+1, 242, Gx_line+18, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+21) ;
                           }
                        }
                     }
                  }
               }
               if ( AV168Imp_agrup == 0 )
               {
                  /* Execute user subroutine: 'AGRUPADAS' */
                  S129 ();
                  if ( returnInSub )
                  {
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV168Imp_agrup = (byte)(1) ;
               }
               if ( ( GXutil.strcmp(AV180RecObs[1-1], " ") != 0 ) && ( AV215erfoc == 1 ) )
               {
                  AV245Texto_un = httpContext.getMessage( "Unidades: ", "") + AV244barlocdis ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit38, "")), 23, Gx_line+3, 118, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV180RecObs[1-1], "")), 123, Gx_line+3, 562, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+1, 780, Gx_line+25, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV245Texto_un, "")), 622, Gx_line+3, 776, Gx_line+20, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               if ( AV163FlagEnd == 0 )
               {
                  if ( AV192Carvema == 1 )
                  {
                     /* Execute user subroutine: 'OBS' */
                     S139 ();
                     if ( returnInSub )
                     {
                        getPrinter().GxEndPage() ;
                        /* Close printer file */
                        getPrinter().GxEndDocument() ;
                        endPrinter();
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                  }
                  if ( GXutil.strcmp(AV270M, "*") == 0 )
                  {
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "(*) Atencion. Los Kgs han sido modificados para Teñir. Los Kgs Origen son", ""), 28, Gx_line+3, 453, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A812RecTotKgm, "ZZZZZZ9.99")), 466, Gx_line+3, 530, Gx_line+20, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "y los Kgs a Teñir son", ""), 536, Gx_line+3, 656, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4259RecTotKgs, "ZZZZZZ9.99")), 666, Gx_line+3, 730, Gx_line+20, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawRect(7, Gx_line+0, 780, Gx_line+22, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+30) ;
                  }
                  AV272Pml = (short)(DecimalUtil.decToDouble(((A871RecTotMtr.doubleValue()>0) ? (AV269Tot_kgs.divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)))) ;
                  AV273TxtPml = ((AV272Pml>0)&&(AV271Tinamar==1) ? httpContext.getMessage( "Pml = ", "")+GXutil.trim( GXutil.str( AV272Pml, 4, 0)) : " ") ;
                  if ( AV281Act3of9 == 1 )
                  {
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Lts", ""), 157, Gx_line+5, 182, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 225, Gx_line+4, 246, Gx_line+23, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV156Volumen), "ZZZZ9")), 105, Gx_line+5, 147, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A813RecTotPie), "ZZZZ9")), 729, Gx_line+5, 771, Gx_line+22, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV149RelBany), "ZZZ9")), 272, Gx_line+5, 305, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A871RecTotMtr, "ZZZZZZ9.99")), 584, Gx_line+5, 667, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(7, Gx_line+2, 339, Gx_line+45, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("1:", 251, Gx_line+5, 268, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit22, "")), 24, Gx_line+4, 97, Gx_line+23, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit23, "")), 345, Gx_line+4, 408, Gx_line+23, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit24, "")), 683, Gx_line+5, 716, Gx_line+22, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit25, "")), 524, Gx_line+5, 574, Gx_line+22, 2, 0, 0, 0) ;
                     getPrinter().GxDrawRect(340, Gx_line+2, 782, Gx_line+45, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(7, Gx_line+44, 798, Gx_line+67, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV208BarKgm, "ZZZZZ9.99")), 429, Gx_line+24, 505, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV209BarMtr, "ZZZZZ9.99")), 593, Gx_line+24, 669, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV210BarPie), "ZZZZZ9")), 727, Gx_line+25, 772, Gx_line+42, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit28, "")), 22, Gx_line+27, 87, Gx_line+43, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 105, Gx_line+27, 155, Gx_line+44, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV269Tot_kgs, "ZZZZZ9.99")), 413, Gx_line+4, 488, Gx_line+23, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV270M, "")), 493, Gx_line+5, 508, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV273TxtPml, "")), 225, Gx_line+24, 299, Gx_line+45, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 206, Gx_line+46, 282, Gx_line+64, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 453, Gx_line+46, 504, Gx_line+64, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 536, Gx_line+46, 620, Gx_line+64, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Acertos", ""), 636, Gx_line+46, 695, Gx_line+64, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 740, Gx_line+46, 774, Gx_line+64, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(148, Gx_line+44, 148, Gx_line+67, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(439, Gx_line+44, 439, Gx_line+67, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(532, Gx_line+44, 532, Gx_line+67, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(624, Gx_line+44, 624, Gx_line+67, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(705, Gx_line+44, 705, Gx_line+67, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+70) ;
                  }
                  else
                  {
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Lts", ""), 156, Gx_line+4, 181, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 224, Gx_line+3, 245, Gx_line+22, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV156Volumen), "ZZZZ9")), 104, Gx_line+4, 146, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A813RecTotPie), "ZZZZ9")), 728, Gx_line+4, 770, Gx_line+21, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV149RelBany), "ZZZ9")), 271, Gx_line+4, 304, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A871RecTotMtr, "ZZZZZZ9.99")), 583, Gx_line+4, 666, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(7, Gx_line+1, 339, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText("1:", 250, Gx_line+4, 267, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit22, "")), 23, Gx_line+3, 96, Gx_line+22, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit23, "")), 344, Gx_line+3, 407, Gx_line+22, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit24, "")), 682, Gx_line+4, 715, Gx_line+21, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit25, "")), 523, Gx_line+4, 573, Gx_line+21, 2, 0, 0, 0) ;
                     getPrinter().GxDrawRect(339, Gx_line+1, 781, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxDrawRect(7, Gx_line+43, 798, Gx_line+66, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 440, Gx_line+46, 457, Gx_line+63, 1, 0, 0, 0) ;
                     getPrinter().GxDrawLine(436, Gx_line+43, 436, Gx_line+66, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(458, Gx_line+43, 458, Gx_line+66, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(589, Gx_line+43, 589, Gx_line+66, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(150, Gx_line+43, 150, Gx_line+66, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Lit30, "")), 39, Gx_line+46, 89, Gx_line+63, 1, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit31, "")), 183, Gx_line+46, 400, Gx_line+63, 1, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Lit33, "")), 482, Gx_line+46, 565, Gx_line+63, 1, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit34, "")), 607, Gx_line+46, 707, Gx_line+63, 1, 0, 0, 0) ;
                     getPrinter().GxDrawLine(711, Gx_line+43, 711, Gx_line+66, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV208BarKgm, "ZZZZZ9.99")), 428, Gx_line+23, 504, Gx_line+44, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV209BarMtr, "ZZZZZ9.99")), 592, Gx_line+23, 668, Gx_line+44, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV210BarPie), "ZZZZZ9")), 726, Gx_line+24, 771, Gx_line+41, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit28, "")), 21, Gx_line+26, 86, Gx_line+42, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 104, Gx_line+26, 154, Gx_line+43, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Lit60, "")), 739, Gx_line+46, 786, Gx_line+62, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV269Tot_kgs, "ZZZZZ9.99")), 411, Gx_line+3, 486, Gx_line+22, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV270M, "")), 492, Gx_line+4, 507, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV273TxtPml, "")), 224, Gx_line+23, 298, Gx_line+44, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+67) ;
                  }
               }
               else
               {
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lts", ""), 160, Gx_line+8, 185, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Rb", ""), 228, Gx_line+7, 249, Gx_line+26, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV156Volumen), "ZZZZ9")), 108, Gx_line+8, 150, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A812RecTotKgm, "ZZZZZZ9.99")), 424, Gx_line+8, 507, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A813RecTotPie), "ZZZZ9")), 732, Gx_line+8, 774, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV149RelBany), "ZZZ9")), 275, Gx_line+8, 308, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A871RecTotMtr, "ZZZZZZ9.99")), 588, Gx_line+8, 671, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+1, 338, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("1:", 254, Gx_line+8, 271, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit22, "")), 25, Gx_line+7, 98, Gx_line+26, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit23, "")), 348, Gx_line+7, 411, Gx_line+26, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Lit24, "")), 686, Gx_line+8, 719, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit25, "")), 527, Gx_line+8, 577, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawRect(338, Gx_line+1, 781, Gx_line+31, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+31) ;
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
      add_metrics4( ) ;
      add_metrics5( ) ;
      add_metrics6( ) ;
      add_metrics7( ) ;
      add_metrics8( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Times New Roman", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics7( )
   {
      getPrinter().setMetrics("Code 128", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics8( )
   {
      getPrinter().setMetrics("Times New Roman", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
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
      AV44EmprCod = "" ;
      AV12BarCodPar = "" ;
      AV15BarMaqCod = "" ;
      AV17BarSua = "" ;
      AV91ImpCod = "" ;
      scmdbuf = "" ;
      P06S63_A361DisCod = new int[1] ;
      P06S63_A396EmprCod = new String[] {""} ;
      P06S63_A130BarCodPar = new String[] {""} ;
      P06S63_A132BarCodReo = new byte[1] ;
      P06S63_A129BarCod = new int[1] ;
      P06S63_A2829BarProPer = new String[] {""} ;
      P06S63_A252CliCod = new int[1] ;
      P06S63_n252CliCod = new boolean[] {false} ;
      P06S63_A212BarSer = new String[] {""} ;
      P06S63_A135BarColNom = new String[] {""} ;
      P06S63_A136BarColNum = new int[1] ;
      P06S63_A218BarTipCol = new byte[1] ;
      P06S63_A1652BarSerDsc = new String[] {""} ;
      P06S63_A148BarEstReo = new byte[1] ;
      P06S63_A1431BarLocDis = new String[] {""} ;
      P06S63_A4845BarAudObs = new String[] {""} ;
      P06S63_n4845BarAudObs = new boolean[] {false} ;
      P06S63_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S63_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S63_A199BarPie1 = new short[1] ;
      P06S63_A365DisDes = new String[] {""} ;
      P06S63_A898BarPieNDes = new int[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A2829BarProPer = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A1431BarLocDis = "" ;
      A4845BarAudObs = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV296Cod_Idtx = "" ;
      AV301NormaDsc = "" ;
      AV295Dsc_Idtx = "" ;
      AV161ForSer = "" ;
      AV110ForColNom = "" ;
      AV113Serie = "" ;
      AV191Texto_r = "" ;
      AV190DSCCAUSA = "" ;
      AV208BarKgm = DecimalUtil.ZERO ;
      AV209BarMtr = DecimalUtil.ZERO ;
      AV216Obstxt = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV216Obstxt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06S64_A396EmprCod = new String[] {""} ;
      P06S64_A361DisCod = new int[1] ;
      P06S64_A377DisObsTxt = new String[] {""} ;
      P06S64_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV232Albrloc = "" ;
      AV233Lit99 = "" ;
      AV244barlocdis = "" ;
      AV257Baraudobs = "" ;
      AV302DisNormID = "" ;
      AV303DisTraID = "" ;
      AV92Intens = "" ;
      GXv_char3 = new String[1] ;
      AV135Matiz = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new short[1] ;
      AV116TipCol = "" ;
      GXv_char6 = new String[1] ;
      AV118Tonalidad = "" ;
      GXv_char7 = new String[1] ;
      AV182ForTonal = "" ;
      AV172DscSol = "" ;
      AV225Macprocod = "" ;
      AV235ForNomcli3 = "" ;
      P06S65_A396EmprCod = new String[] {""} ;
      P06S65_A407EmprNom = new String[] {""} ;
      P06S65_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV139NomEmp = "" ;
      AV114Termin = "" ;
      P06S66_A942TermCod = new String[] {""} ;
      P06S66_A1189TermUsu = new String[] {""} ;
      P06S66_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV61TermUsu = "" ;
      AV35Coste = DecimalUtil.ZERO ;
      AV36Coste2 = DecimalUtil.ZERO ;
      AV38DesCol = "" ;
      AV39DesInt = "" ;
      P06S69_A3915EmpNumDec = new byte[1] ;
      P06S69_n3915EmpNumDec = new boolean[] {false} ;
      P06S69_A130BarCodPar = new String[] {""} ;
      P06S69_A132BarCodReo = new byte[1] ;
      P06S69_A396EmprCod = new String[] {""} ;
      P06S69_A129BarCod = new int[1] ;
      P06S69_A2804RecLinMaq = new short[1] ;
      P06S69_A12270Rsedo7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S69_A12273Rsedo10 = new short[1] ;
      P06S69_A12274Rsedo11 = new short[1] ;
      P06S69_A12272Rsedo9 = new short[1] ;
      P06S69_A361DisCod = new int[1] ;
      P06S69_A206BarPle = new String[] {""} ;
      P06S69_A118BarAcaQui = new String[] {""} ;
      P06S69_A602MaqCod = new String[] {""} ;
      P06S69_A4609BarMdlCod = new String[] {""} ;
      P06S69_A9777BarItem3 = new String[] {""} ;
      P06S69_A4812BarEncCli = new String[] {""} ;
      P06S69_A148BarEstReo = new byte[1] ;
      P06S69_A3006BarCoef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S69_n3006BarCoef = new boolean[] {false} ;
      P06S69_A1226BarGraCru = new short[1] ;
      P06S69_A3629CliObs = new String[] {""} ;
      P06S69_A5109RecNumInt = new int[1] ;
      P06S69_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P06S69_n4866RecFecAlt = new boolean[] {false} ;
      P06S69_A4402RecUsrCod = new String[] {""} ;
      P06S69_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P06S69_n4867RecFecMod = new boolean[] {false} ;
      P06S69_A4868RecUsrMod = new String[] {""} ;
      P06S69_n4868RecUsrMod = new boolean[] {false} ;
      P06S69_A212BarSer = new String[] {""} ;
      P06S69_A224BarTraP1 = new short[1] ;
      P06S69_A221BarTra1 = new String[] {""} ;
      P06S69_A225BarTraP2 = new short[1] ;
      P06S69_A222BarTra2 = new String[] {""} ;
      P06S69_A226BarTraP3 = new short[1] ;
      P06S69_A223BarTra3 = new String[] {""} ;
      P06S69_A232BarUrdP1 = new short[1] ;
      P06S69_A229BarUrd1 = new String[] {""} ;
      P06S69_A233BarUrdP2 = new short[1] ;
      P06S69_A230BarUrd2 = new String[] {""} ;
      P06S69_A234BarUrdP3 = new short[1] ;
      P06S69_A231BarUrd3 = new String[] {""} ;
      P06S69_A217BarTipArt = new short[1] ;
      P06S69_n217BarTipArt = new boolean[] {false} ;
      P06S69_A135BarColNom = new String[] {""} ;
      P06S69_A125BarAncAca1 = new short[1] ;
      P06S69_A1909BarGraAca = new short[1] ;
      P06S69_A3137BarGraAca2 = new short[1] ;
      P06S69_A126BarAncAca2 = new short[1] ;
      P06S69_A1652BarSerDsc = new String[] {""} ;
      P06S69_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S69_A5110RecNumPrg = new String[] {""} ;
      P06S69_A218BarTipCol = new byte[1] ;
      P06S69_A1235BarNumCli = new int[1] ;
      P06S69_A1234BarNomCli = new String[] {""} ;
      P06S69_A136BarColNum = new int[1] ;
      P06S69_A279CliNom = new String[] {""} ;
      P06S69_A252CliCod = new int[1] ;
      P06S69_n252CliCod = new boolean[] {false} ;
      P06S69_A143BarDisNum = new String[] {""} ;
      P06S69_A2454BarGirar = new String[] {""} ;
      P06S69_A1503BarPart = new short[1] ;
      P06S69_A9775BarItem1 = new String[] {""} ;
      P06S69_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S69_A199BarPie1 = new short[1] ;
      P06S69_A365DisDes = new String[] {""} ;
      P06S69_A898BarPieNDes = new int[1] ;
      P06S69_A220BarTotPie = new int[1] ;
      P06S69_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S69_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S69_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S69_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A12270Rsedo7 = DecimalUtil.ZERO ;
      A206BarPle = "" ;
      A118BarAcaQui = "" ;
      A602MaqCod = "" ;
      A4609BarMdlCod = "" ;
      A9777BarItem3 = "" ;
      A4812BarEncCli = "" ;
      A3006BarCoef = DecimalUtil.ZERO ;
      A3629CliObs = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      A1234BarNomCli = "" ;
      A279CliNom = "" ;
      A143BarDisNum = "" ;
      A2454BarGirar = "" ;
      A9775BarItem1 = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV286Tvueltas = DecimalUtil.ZERO ;
      AV237BarCal = "" ;
      AV218DesAcaqui = "" ;
      AV219BarPle = "" ;
      AV231RecNumPrg = "" ;
      AV230MacProDsc = "" ;
      AV205MaqCod = "" ;
      AV214BarMdlcod = "" ;
      AV264Baritem1 = "" ;
      AV265BarItem3 = "" ;
      AV285BarEnccli = "" ;
      AV213Lit53 = "" ;
      AV266Litnop = "" ;
      AV267Litnov = "" ;
      AV8ArtCod = "" ;
      AV31ContDsc = "" ;
      AV94Lit0 = "" ;
      AV62Remonta = "" ;
      AV125Lit44 = "" ;
      AV93Largura = DecimalUtil.ZERO ;
      AV115TiempoV = DecimalUtil.ZERO ;
      AV87GrMlin = DecimalUtil.ZERO ;
      AV27CompTP = DecimalUtil.ZERO ;
      AV58Procesos = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV58Procesos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV59Tiempos = new short[6] ;
      P06S610_A396EmprCod = new String[] {""} ;
      P06S610_A129BarCod = new int[1] ;
      P06S610_A132BarCodReo = new byte[1] ;
      P06S610_A130BarCodPar = new String[] {""} ;
      P06S610_A2804RecLinMaq = new short[1] ;
      P06S610_A764ProForCod = new String[] {""} ;
      P06S610_A771ProForTie = new short[1] ;
      P06S610_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV180RecObs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV180RecObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P06S611_A396EmprCod = new String[] {""} ;
      P06S611_A129BarCod = new int[1] ;
      P06S611_A132BarCodReo = new byte[1] ;
      P06S611_A130BarCodPar = new String[] {""} ;
      P06S611_A2804RecLinMaq = new short[1] ;
      P06S611_A5258RecTxtObs = new String[] {""} ;
      P06S611_n5258RecTxtObs = new boolean[] {false} ;
      P06S611_A5257RecLinObs = new short[1] ;
      A5258RecTxtObs = "" ;
      AV298Hdrcode39 = "" ;
      AV300Code39 = "" ;
      AV299hdrcode39azalea = "" ;
      AV89HojRut = "" ;
      AV63Hdr = "" ;
      AV241ceros8 = "" ;
      AV239HdrAlfa = "" ;
      AV198MaqCdb = "" ;
      AV269Tot_kgs = DecimalUtil.ZERO ;
      AV270M = "" ;
      AV26CompCamar = DecimalUtil.ZERO ;
      P06S612_A396EmprCod = new String[] {""} ;
      P06S612_A129BarCod = new int[1] ;
      P06S612_A132BarCodReo = new byte[1] ;
      P06S612_A130BarCodPar = new String[] {""} ;
      P06S612_A1273RecLinPro = new byte[1] ;
      P06S612_A2804RecLinMaq = new short[1] ;
      P06S612_A2392ProNumPro = new int[1] ;
      P06S612_A4697RecNroPrg = new int[1] ;
      P06S612_A2393ProNumRec = new int[1] ;
      P06S612_A1251RecNumRec = new int[1] ;
      P06S612_A764ProForCod = new String[] {""} ;
      P06S612_A4695RecVolPrf = new int[1] ;
      P06S612_A766ProForDsc = new String[] {""} ;
      P06S612_A771ProForTie = new short[1] ;
      A766ProForDsc = "" ;
      AV200Proforcod = "" ;
      AV79Lit35 = "" ;
      AV80Lit36 = "" ;
      AV81Lit37 = "" ;
      P06S613_A719PrdNum = new String[] {""} ;
      P06S613_n719PrdNum = new boolean[] {false} ;
      P06S613_A396EmprCod = new String[] {""} ;
      P06S613_A129BarCod = new int[1] ;
      P06S613_A132BarCodReo = new byte[1] ;
      P06S613_A130BarCodPar = new String[] {""} ;
      P06S613_A2804RecLinMaq = new short[1] ;
      P06S613_A1273RecLinPro = new byte[1] ;
      P06S613_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S613_A3274RecPrdTnq = new byte[1] ;
      P06S613_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S613_A5725RecLote = new String[] {""} ;
      P06S613_A490ForPrdUMe = new byte[1] ;
      P06S613_n490ForPrdUMe = new boolean[] {false} ;
      P06S613_A1643PrdTip = new String[] {""} ;
      P06S613_A2394RecForNro = new byte[1] ;
      P06S613_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S613_A872RecPrdNum = new String[] {""} ;
      P06S613_A875RecPrdDsc = new String[] {""} ;
      P06S613_A743PrdUniCon = new byte[1] ;
      P06S613_A11687PrdList = new String[] {""} ;
      P06S613_A11363PrdGots = new String[] {""} ;
      P06S613_A13301PrdZDHC = new String[] {""} ;
      P06S613_A13302PrdTHELIST = new String[] {""} ;
      P06S613_n13302PrdTHELIST = new boolean[] {false} ;
      P06S613_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S613_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S613_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A1643PrdTip = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A11687PrdList = "" ;
      A11363PrdGots = "" ;
      A13301PrdZDHC = "" ;
      A13302PrdTHELIST = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV279CodeBar1 = "" ;
      AV282CodeBar2 = "" ;
      AV280faccon = DecimalUtil.ZERO ;
      AV224Densidad = DecimalUtil.ZERO ;
      AV255VarAux10 = "" ;
      AV120Unidades = "" ;
      AV122Var2 = "" ;
      AV306manual = "" ;
      AV121Var1 = "" ;
      AV250Var4 = "" ;
      AV283Factor = "" ;
      AV147RecForNro = "" ;
      AV145PrdDsc = "" ;
      AV24CodPrd = "" ;
      AV18Cantidad = DecimalUtil.ZERO ;
      AV187Cant_a = "" ;
      AV305Normas = "" ;
      P06S614_A396EmprCod = new String[] {""} ;
      P06S614_A129BarCod = new int[1] ;
      P06S614_A132BarCodReo = new byte[1] ;
      P06S614_A130BarCodPar = new String[] {""} ;
      P06S614_A2804RecLinMaq = new short[1] ;
      P06S614_A5258RecTxtObs = new String[] {""} ;
      P06S614_n5258RecTxtObs = new boolean[] {false} ;
      P06S614_A5257RecLinObs = new short[1] ;
      AV82Lit38 = "" ;
      AV251ArtObslon = "" ;
      AV124Velocidad = DecimalUtil.ZERO ;
      P06S615_AV254NMaxAg = new short[1] ;
      P06S616_A130BarCodPar = new String[] {""} ;
      P06S616_A132BarCodReo = new byte[1] ;
      P06S616_A129BarCod = new int[1] ;
      P06S616_A396EmprCod = new String[] {""} ;
      P06S616_A122BarAgrPar = new String[] {""} ;
      P06S616_A124BarAgrReo = new byte[1] ;
      P06S616_A119BarAgrCod = new int[1] ;
      P06S616_A1508CliCodAgr = new int[1] ;
      P06S616_A1507BarAgrDsc = new String[] {""} ;
      P06S616_A1245BarAgrSer = new String[] {""} ;
      P06S616_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06S616_A671PieAgr = new short[1] ;
      P06S616_A1512ColNumAgr = new int[1] ;
      P06S616_A1510ColNomAgr = new String[] {""} ;
      P06S616_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A122BarAgrPar = "" ;
      A1507BarAgrDsc = "" ;
      A1245BarAgrSer = "" ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1510ColNomAgr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV158Hdr_a = "" ;
      AV159CliNom_a = "" ;
      AV196Agrdsc = "" ;
      AV221MtrAgr = DecimalUtil.ZERO ;
      AV179Lit49 = "" ;
      AV248Litpda = "" ;
      GXv_int1 = new int[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      AV278LocAlbr = "" ;
      AV307distraidagr = "" ;
      AV308po = "" ;
      AV293ColAgr = "" ;
      AV83Lit39 = "" ;
      AV85Lit40 = "" ;
      AV86Lit41 = "" ;
      AV151Lit42 = "" ;
      AV150Lit43 = "" ;
      AV98Lit12 = "" ;
      P06S617_A602MaqCod = new String[] {""} ;
      P06S617_A396EmprCod = new String[] {""} ;
      P06S617_A606MaqDsc = new String[] {""} ;
      P06S617_n606MaqDsc = new boolean[] {false} ;
      P06S617_A2391MaqMicro = new byte[1] ;
      P06S617_n2391MaqMicro = new boolean[] {false} ;
      P06S617_A3598MaqNroTub = new byte[1] ;
      P06S617_n3598MaqNroTub = new boolean[] {false} ;
      A606MaqDsc = "" ;
      AV37DescMaq = "" ;
      P06S618_A831TipColCod = new byte[1] ;
      P06S618_A483ForColNum = new int[1] ;
      P06S618_A482ForColNom = new String[] {""} ;
      P06S618_A494ForSer = new String[] {""} ;
      P06S618_A252CliCod = new int[1] ;
      P06S618_n252CliCod = new boolean[] {false} ;
      P06S618_A396EmprCod = new String[] {""} ;
      P06S618_A649ObsForTxt = new String[] {""} ;
      P06S618_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      AV164TipArtDsc = "" ;
      P06S619_A829TipArtCod = new short[1] ;
      P06S619_A396EmprCod = new String[] {""} ;
      P06S619_A830TipArtDsc = new String[] {""} ;
      P06S619_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P06S620_A833TipDefCod = new short[1] ;
      P06S620_A5085CodCausa = new short[1] ;
      P06S620_n5085CodCausa = new boolean[] {false} ;
      P06S620_A544HisCodPar = new String[] {""} ;
      P06S620_A545HisCodReo = new byte[1] ;
      P06S620_A539HisBarCod = new int[1] ;
      P06S620_A396EmprCod = new String[] {""} ;
      P06S620_A5086DscCausa = new String[] {""} ;
      P06S620_n5086DscCausa = new boolean[] {false} ;
      P06S620_A834TipDefDsc = new String[] {""} ;
      P06S620_n834TipDefDsc = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A5086DscCausa = "" ;
      A834TipDefDsc = "" ;
      P06S621_A396EmprCod = new String[] {""} ;
      P06S621_A764ProForCod = new String[] {""} ;
      P06S621_A6229ProFoMaq = new String[] {""} ;
      P06S621_n6229ProFoMaq = new boolean[] {false} ;
      P06S621_A5192ProFoPgC = new short[1] ;
      P06S621_n5192ProFoPgC = new boolean[] {false} ;
      P06S621_A5191ProForLC = new short[1] ;
      A6229ProFoMaq = "" ;
      P06S622_A602MaqCod = new String[] {""} ;
      P06S622_A396EmprCod = new String[] {""} ;
      P06S622_A5950MaqDteCol = new int[1] ;
      P06S622_n5950MaqDteCol = new boolean[] {false} ;
      AV226AlbRLote = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV226AlbRLote[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int10 = new short[1] ;
      GXv_char9 = new String[1] ;
      AV276Loc = "" ;
      GXv_char8 = new String[1] ;
      GXv_int15 = new int[1] ;
      AV123Var3 = "" ;
      AV73Lit3 = "" ;
      AV84Lit4 = "" ;
      AV126Lit5 = "" ;
      AV127Lit6 = "" ;
      AV128Lit7 = "" ;
      AV129Lit8 = "" ;
      AV130Lit9 = "" ;
      AV96Lit10 = "" ;
      AV97Lit11 = "" ;
      AV99Lit13 = "" ;
      AV100Lit14 = "" ;
      AV101Lit15 = "" ;
      AV102Lit16 = "" ;
      AV103Lit17 = "" ;
      AV104Lit18 = "" ;
      AV105Lit19 = "" ;
      AV107Lit20 = "" ;
      AV64Lit21 = "" ;
      AV65Lit22 = "" ;
      AV66Lit23 = "" ;
      AV67Lit24 = "" ;
      AV68Lit25 = "" ;
      AV69Lit26 = "" ;
      AV70Lit27 = "" ;
      AV71Lit28 = "" ;
      AV72Lit29 = "" ;
      AV74Lit30 = "" ;
      AV75Lit31 = "" ;
      AV76Lit32 = "" ;
      AV77Lit33 = "" ;
      AV78Lit34 = "" ;
      AV174Lit45 = "" ;
      AV175Lit46 = "" ;
      AV176Lit47 = "" ;
      AV178Lit48 = "" ;
      AV181Lit50 = "" ;
      AV183Lit51 = "" ;
      AV184Lit52 = "" ;
      GXv_int16 = new int[1] ;
      AV256Lit60 = "" ;
      GXv_int5 = new byte[1] ;
      GXt_char19 = "" ;
      GXt_char13 = "" ;
      GXv_char11 = new String[1] ;
      P06S623_A3072ArtObsLon = new String[] {""} ;
      P06S623_n3072ArtObsLon = new boolean[] {false} ;
      P06S623_A65ArtCod = new String[] {""} ;
      P06S623_A252CliCod = new int[1] ;
      P06S623_n252CliCod = new boolean[] {false} ;
      P06S623_A396EmprCod = new String[] {""} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      P06S624_A130BarCodPar = new String[] {""} ;
      P06S624_A132BarCodReo = new byte[1] ;
      P06S624_A129BarCod = new int[1] ;
      P06S624_A396EmprCod = new String[] {""} ;
      P06S624_A187BarNotDsc = new String[] {""} ;
      P06S624_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      AV292BarNotDsc = "" ;
      AV261Obss = "" ;
      P06S625_A10887Cod_Idtx = new String[] {""} ;
      P06S625_A10888Dsc_Idtx = new String[] {""} ;
      P06S625_n10888Dsc_Idtx = new boolean[] {false} ;
      P06S625_A396EmprCod = new String[] {""} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV228TxtKg = "" ;
      AV229TxtMt = "" ;
      AV33CosKgm = DecimalUtil.ZERO ;
      AV34CosMtr = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV243Hdr11 = "" ;
      AV169Num_int = "" ;
      AV170LinMaq = "" ;
      AV166BarSer_10 = "" ;
      AV165VCompo = "" ;
      AV223Vcomp2 = "" ;
      GXv_char12 = new String[1] ;
      AV304color = "" ;
      AV245Texto_un = "" ;
      AV273TxtPml = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rrecstdp__default(),
         new Object[] {
             new Object[] {
            P06S63_A361DisCod, P06S63_A396EmprCod, P06S63_A130BarCodPar, P06S63_A132BarCodReo, P06S63_A129BarCod, P06S63_A2829BarProPer, P06S63_A252CliCod, P06S63_n252CliCod, P06S63_A212BarSer, P06S63_A135BarColNom,
            P06S63_A136BarColNum, P06S63_A218BarTipCol, P06S63_A1652BarSerDsc, P06S63_A148BarEstReo, P06S63_A1431BarLocDis, P06S63_A4845BarAudObs, P06S63_n4845BarAudObs, P06S63_A166BarKgm, P06S63_A184BarMtr, P06S63_A199BarPie1,
            P06S63_A365DisDes, P06S63_A898BarPieNDes
            }
            , new Object[] {
            P06S64_A396EmprCod, P06S64_A361DisCod, P06S64_A377DisObsTxt, P06S64_A376DisObsLin
            }
            , new Object[] {
            P06S65_A396EmprCod, P06S65_A407EmprNom, P06S65_n407EmprNom
            }
            , new Object[] {
            P06S66_A942TermCod, P06S66_A1189TermUsu, P06S66_n1189TermUsu
            }
            , new Object[] {
            P06S69_A3915EmpNumDec, P06S69_n3915EmpNumDec, P06S69_A130BarCodPar, P06S69_A132BarCodReo, P06S69_A396EmprCod, P06S69_A129BarCod, P06S69_A2804RecLinMaq, P06S69_A12270Rsedo7, P06S69_A12273Rsedo10, P06S69_A12274Rsedo11,
            P06S69_A12272Rsedo9, P06S69_A361DisCod, P06S69_A206BarPle, P06S69_A118BarAcaQui, P06S69_A602MaqCod, P06S69_A4609BarMdlCod, P06S69_A9777BarItem3, P06S69_A4812BarEncCli, P06S69_A148BarEstReo, P06S69_A3006BarCoef,
            P06S69_n3006BarCoef, P06S69_A1226BarGraCru, P06S69_A3629CliObs, P06S69_A5109RecNumInt, P06S69_A4866RecFecAlt, P06S69_n4866RecFecAlt, P06S69_A4402RecUsrCod, P06S69_A4867RecFecMod, P06S69_n4867RecFecMod, P06S69_A4868RecUsrMod,
            P06S69_n4868RecUsrMod, P06S69_A212BarSer, P06S69_A224BarTraP1, P06S69_A221BarTra1, P06S69_A225BarTraP2, P06S69_A222BarTra2, P06S69_A226BarTraP3, P06S69_A223BarTra3, P06S69_A232BarUrdP1, P06S69_A229BarUrd1,
            P06S69_A233BarUrdP2, P06S69_A230BarUrd2, P06S69_A234BarUrdP3, P06S69_A231BarUrd3, P06S69_A217BarTipArt, P06S69_n217BarTipArt, P06S69_A135BarColNom, P06S69_A125BarAncAca1, P06S69_A1909BarGraAca, P06S69_A3137BarGraAca2,
            P06S69_A126BarAncAca2, P06S69_A1652BarSerDsc, P06S69_A2806RecFA, P06S69_A5110RecNumPrg, P06S69_A218BarTipCol, P06S69_A1235BarNumCli, P06S69_A1234BarNomCli, P06S69_A136BarColNum, P06S69_A279CliNom, P06S69_A252CliCod,
            P06S69_n252CliCod, P06S69_A143BarDisNum, P06S69_A2454BarGirar, P06S69_A1503BarPart, P06S69_A9775BarItem1, P06S69_A4259RecTotKgs, P06S69_A199BarPie1, P06S69_A365DisDes, P06S69_A898BarPieNDes, P06S69_A220BarTotPie,
            P06S69_A184BarMtr, P06S69_A870BarTotMtr, P06S69_A166BarKgm, P06S69_A219BarTotAgr
            }
            , new Object[] {
            P06S610_A396EmprCod, P06S610_A129BarCod, P06S610_A132BarCodReo, P06S610_A130BarCodPar, P06S610_A2804RecLinMaq, P06S610_A764ProForCod, P06S610_A771ProForTie, P06S610_A1273RecLinPro
            }
            , new Object[] {
            P06S611_A396EmprCod, P06S611_A129BarCod, P06S611_A132BarCodReo, P06S611_A130BarCodPar, P06S611_A2804RecLinMaq, P06S611_A5258RecTxtObs, P06S611_n5258RecTxtObs, P06S611_A5257RecLinObs
            }
            , new Object[] {
            P06S612_A396EmprCod, P06S612_A129BarCod, P06S612_A132BarCodReo, P06S612_A130BarCodPar, P06S612_A1273RecLinPro, P06S612_A2804RecLinMaq, P06S612_A2392ProNumPro, P06S612_A4697RecNroPrg, P06S612_A2393ProNumRec, P06S612_A1251RecNumRec,
            P06S612_A764ProForCod, P06S612_A4695RecVolPrf, P06S612_A766ProForDsc, P06S612_A771ProForTie
            }
            , new Object[] {
            P06S613_A719PrdNum, P06S613_n719PrdNum, P06S613_A396EmprCod, P06S613_A129BarCod, P06S613_A132BarCodReo, P06S613_A130BarCodPar, P06S613_A2804RecLinMaq, P06S613_A1273RecLinPro, P06S613_A431FacCon, P06S613_A3274RecPrdTnq,
            P06S613_A4900PrdCanMac, P06S613_A5725RecLote, P06S613_A490ForPrdUMe, P06S613_n490ForPrdUMe, P06S613_A1643PrdTip, P06S613_A2394RecForNro, P06S613_A686PrdCant, P06S613_A872RecPrdNum, P06S613_A875RecPrdDsc, P06S613_A743PrdUniCon,
            P06S613_A11687PrdList, P06S613_A11363PrdGots, P06S613_A13301PrdZDHC, P06S613_A13302PrdTHELIST, P06S613_n13302PrdTHELIST, P06S613_A707PrdFacCon, P06S613_A724PrdPreAct, P06S613_A811RecLin
            }
            , new Object[] {
            P06S614_A396EmprCod, P06S614_A129BarCod, P06S614_A132BarCodReo, P06S614_A130BarCodPar, P06S614_A2804RecLinMaq, P06S614_A5258RecTxtObs, P06S614_n5258RecTxtObs, P06S614_A5257RecLinObs
            }
            , new Object[] {
            P06S615_AV254NMaxAg
            }
            , new Object[] {
            P06S616_A130BarCodPar, P06S616_A132BarCodReo, P06S616_A129BarCod, P06S616_A396EmprCod, P06S616_A122BarAgrPar, P06S616_A124BarAgrReo, P06S616_A119BarAgrCod, P06S616_A1508CliCodAgr, P06S616_A1507BarAgrDsc, P06S616_A1245BarAgrSer,
            P06S616_A869MtrAgr, P06S616_A671PieAgr, P06S616_A1512ColNumAgr, P06S616_A1510ColNomAgr, P06S616_A590KgmAgr
            }
            , new Object[] {
            P06S617_A602MaqCod, P06S617_A396EmprCod, P06S617_A606MaqDsc, P06S617_n606MaqDsc, P06S617_A2391MaqMicro, P06S617_n2391MaqMicro, P06S617_A3598MaqNroTub, P06S617_n3598MaqNroTub
            }
            , new Object[] {
            P06S618_A831TipColCod, P06S618_A483ForColNum, P06S618_A482ForColNom, P06S618_A494ForSer, P06S618_A252CliCod, P06S618_A396EmprCod, P06S618_A649ObsForTxt, P06S618_A650ObsLin
            }
            , new Object[] {
            P06S619_A829TipArtCod, P06S619_A396EmprCod, P06S619_A830TipArtDsc, P06S619_n830TipArtDsc
            }
            , new Object[] {
            P06S620_A833TipDefCod, P06S620_A5085CodCausa, P06S620_n5085CodCausa, P06S620_A544HisCodPar, P06S620_A545HisCodReo, P06S620_A539HisBarCod, P06S620_A396EmprCod, P06S620_A5086DscCausa, P06S620_n5086DscCausa, P06S620_A834TipDefDsc,
            P06S620_n834TipDefDsc
            }
            , new Object[] {
            P06S621_A396EmprCod, P06S621_A764ProForCod, P06S621_A6229ProFoMaq, P06S621_n6229ProFoMaq, P06S621_A5192ProFoPgC, P06S621_n5192ProFoPgC, P06S621_A5191ProForLC
            }
            , new Object[] {
            P06S622_A602MaqCod, P06S622_A396EmprCod, P06S622_A5950MaqDteCol, P06S622_n5950MaqDteCol
            }
            , new Object[] {
            P06S623_A3072ArtObsLon, P06S623_n3072ArtObsLon, P06S623_A65ArtCod, P06S623_A252CliCod, P06S623_A396EmprCod
            }
            , new Object[] {
            P06S624_A130BarCodPar, P06S624_A132BarCodReo, P06S624_A129BarCod, P06S624_A396EmprCod, P06S624_A187BarNotDsc, P06S624_A188BarNotLin
            }
            , new Object[] {
            P06S625_A10887Cod_Idtx, P06S625_A10888Dsc_Idtx, P06S625_n10888Dsc_Idtx, P06S625_A396EmprCod
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

   private byte AV13BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte AV246Moda21 ;
   private byte AV117TipColCod ;
   private byte AV163FlagEnd ;
   private byte AV90I ;
   private byte A376DisObsLin ;
   private byte AV294brochado ;
   private byte A3915EmpNumDec ;
   private byte AV236JPF ;
   private byte AV215erfoc ;
   private byte AV25Colorante ;
   private byte AV146RecAca ;
   private byte A1273RecLinPro ;
   private byte AV242Lenvar ;
   private byte AV211Tejido ;
   private byte AV141NumCam ;
   private byte A3274RecPrdTnq ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A743PrdUniCon ;
   private byte AV197Tnq ;
   private byte AV262Artemalha ;
   private byte AV192Carvema ;
   private byte AV268Lote01 ;
   private byte AV56FlagNline ;
   private byte AV54FlagImp ;
   private byte AV189Sin_dec ;
   private byte AV274Gavim ;
   private byte AV281Act3of9 ;
   private byte AV47Flag ;
   private byte AV202Staack ;
   private byte AV220Serzedelo ;
   private byte AV57FlagObs ;
   private byte AV109FlagTtx ;
   private byte AV140NTubos ;
   private byte AV52FlagEtm ;
   private byte AV157Flag_Agr ;
   private byte A124BarAgrReo ;
   private byte AV53Flagidioma ;
   private byte AV253MaxAgr ;
   private byte AV194Ricoltex ;
   private byte A2391MaqMicro ;
   private byte A3598MaqNroTub ;
   private byte AV133MaqMicro ;
   private byte A831TipColCod ;
   private byte A545HisCodReo ;
   private byte AV227lotes ;
   private byte AV168Imp_agrup ;
   private byte AV185Induyco ;
   private byte AV171FlagVt ;
   private byte AV249ImpLote ;
   private byte AV48FlagBar ;
   private byte AV50FlagCod ;
   private byte AV55FlagJbp ;
   private byte AV234Carolina ;
   private byte AV238indutexma ;
   private byte AV108FlagSeq ;
   private byte AV201Kohler ;
   private byte AV240Code128 ;
   private byte AV271Tinamar ;
   private byte AV297Code39azalea ;
   private byte AV284Enc20c ;
   private byte GXt_int17 ;
   private byte GXv_int5[] ;
   private byte AV258IniI ;
   private byte AV291CtrlLineas ;
   private byte A188BarNotLin ;
   private byte AV260j ;
   private short gxcookieaux ;
   private short AV148RecLinMaq ;
   private short A199BarPie1 ;
   private short AV134MatCod ;
   private short GXv_int4[] ;
   private short AV173CodSol ;
   private short A2804RecLinMaq ;
   private short A12273Rsedo10 ;
   private short A12274Rsedo11 ;
   private short A12272Rsedo9 ;
   private short A1226BarGraCru ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A217BarTipArt ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A126BarAncAca2 ;
   private short A1503BarPart ;
   private short AV287Vbomba ;
   private short AV288Vsarillo ;
   private short AV289Ainjector ;
   private short AV14BarGraAca ;
   private short AV149RelBany ;
   private short AV59Tiempos[] ;
   private short A771ProForTie ;
   private short A5257RecLinObs ;
   private short A811RecLin ;
   private short AV252NumHdrs ;
   private short AV254NMaxAg ;
   private short cV254NMaxAg ;
   private short A671PieAgr ;
   private short AV247Barpart ;
   private short A650ObsLin ;
   private short AV167BarTipArt ;
   private short A829TipArtCod ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A5192ProFoPgC ;
   private short A5191ProForLC ;
   private short GXv_int10[] ;
   private short AV259Nlin ;
   private short AV212BarPes ;
   private short AV272Pml ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int AV156Volumen ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV162Cliente ;
   private int AV111ForColNum ;
   private int AV210BarPie ;
   private int GX_I ;
   private int AV222barmaccod ;
   private int AV142NumCli ;
   private int A5109RecNumInt ;
   private int A1235BarNumCli ;
   private int A220BarTotPie ;
   private int A813RecTotPie ;
   private int AV193MacCod ;
   private int AV195Partida ;
   private int AV19CliCod ;
   private int AV131Lts1 ;
   private int AV132Lts2 ;
   private int AV206VolProd ;
   private int AV207VolCor ;
   private int AV204Dosea ;
   private int A2392ProNumPro ;
   private int A4697RecNroPrg ;
   private int A2393ProNumRec ;
   private int A1251RecNumRec ;
   private int A4695RecVolPrf ;
   private int AV199ProNumPro ;
   private int AV263Pronumrec ;
   private int Gx_OldLine ;
   private int AV188Cant_sd ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int GXv_int1[] ;
   private int AV277Reccod ;
   private int A483ForColNum ;
   private int A539HisBarCod ;
   private int A5950MaqDteCol ;
   private int AV275Albreccod ;
   private int GXv_int15[] ;
   private int GXt_int18 ;
   private int GXv_int16[] ;
   private long AV119TotTiempo ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV208BarKgm ;
   private java.math.BigDecimal AV209BarMtr ;
   private java.math.BigDecimal AV35Coste ;
   private java.math.BigDecimal AV36Coste2 ;
   private java.math.BigDecimal A12270Rsedo7 ;
   private java.math.BigDecimal A3006BarCoef ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV286Tvueltas ;
   private java.math.BigDecimal AV93Largura ;
   private java.math.BigDecimal AV115TiempoV ;
   private java.math.BigDecimal AV87GrMlin ;
   private java.math.BigDecimal AV27CompTP ;
   private java.math.BigDecimal AV269Tot_kgs ;
   private java.math.BigDecimal AV26CompCamar ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV280faccon ;
   private java.math.BigDecimal AV224Densidad ;
   private java.math.BigDecimal AV18Cantidad ;
   private java.math.BigDecimal AV124Velocidad ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal AV221MtrAgr ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal AV33CosKgm ;
   private java.math.BigDecimal AV34CosMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV44EmprCod ;
   private String AV12BarCodPar ;
   private String AV15BarMaqCod ;
   private String AV17BarSua ;
   private String AV91ImpCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A2829BarProPer ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A1431BarLocDis ;
   private String A365DisDes ;
   private String AV296Cod_Idtx ;
   private String AV301NormaDsc ;
   private String AV295Dsc_Idtx ;
   private String AV161ForSer ;
   private String AV110ForColNom ;
   private String AV113Serie ;
   private String AV191Texto_r ;
   private String AV190DSCCAUSA ;
   private String AV216Obstxt[] ;
   private String A377DisObsTxt ;
   private String AV232Albrloc ;
   private String AV233Lit99 ;
   private String AV244barlocdis ;
   private String AV302DisNormID ;
   private String AV303DisTraID ;
   private String AV92Intens ;
   private String GXv_char3[] ;
   private String AV135Matiz ;
   private String GXv_char2[] ;
   private String AV116TipCol ;
   private String GXv_char6[] ;
   private String AV118Tonalidad ;
   private String GXv_char7[] ;
   private String AV182ForTonal ;
   private String AV172DscSol ;
   private String AV225Macprocod ;
   private String AV235ForNomcli3 ;
   private String A407EmprNom ;
   private String AV139NomEmp ;
   private String AV114Termin ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV61TermUsu ;
   private String AV38DesCol ;
   private String AV39DesInt ;
   private String A206BarPle ;
   private String A118BarAcaQui ;
   private String A602MaqCod ;
   private String A4609BarMdlCod ;
   private String A9777BarItem3 ;
   private String A4812BarEncCli ;
   private String A4402RecUsrCod ;
   private String A4868RecUsrMod ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A5110RecNumPrg ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String A143BarDisNum ;
   private String A2454BarGirar ;
   private String A9775BarItem1 ;
   private String AV237BarCal ;
   private String AV218DesAcaqui ;
   private String AV219BarPle ;
   private String AV231RecNumPrg ;
   private String AV230MacProDsc ;
   private String AV205MaqCod ;
   private String AV214BarMdlcod ;
   private String AV264Baritem1 ;
   private String AV265BarItem3 ;
   private String AV285BarEnccli ;
   private String AV213Lit53 ;
   private String AV266Litnop ;
   private String AV267Litnov ;
   private String AV8ArtCod ;
   private String AV31ContDsc ;
   private String AV94Lit0 ;
   private String AV62Remonta ;
   private String AV125Lit44 ;
   private String AV58Procesos[] ;
   private String A764ProForCod ;
   private String AV180RecObs[] ;
   private String A5258RecTxtObs ;
   private String AV298Hdrcode39 ;
   private String AV300Code39 ;
   private String AV299hdrcode39azalea ;
   private String AV89HojRut ;
   private String AV63Hdr ;
   private String AV241ceros8 ;
   private String AV239HdrAlfa ;
   private String AV198MaqCdb ;
   private String AV270M ;
   private String A766ProForDsc ;
   private String AV200Proforcod ;
   private String AV79Lit35 ;
   private String AV80Lit36 ;
   private String AV81Lit37 ;
   private String A719PrdNum ;
   private String A5725RecLote ;
   private String A1643PrdTip ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A11687PrdList ;
   private String A11363PrdGots ;
   private String A13301PrdZDHC ;
   private String A13302PrdTHELIST ;
   private String AV279CodeBar1 ;
   private String AV282CodeBar2 ;
   private String AV255VarAux10 ;
   private String AV120Unidades ;
   private String AV122Var2 ;
   private String AV306manual ;
   private String AV121Var1 ;
   private String AV250Var4 ;
   private String AV283Factor ;
   private String AV147RecForNro ;
   private String AV145PrdDsc ;
   private String AV24CodPrd ;
   private String AV187Cant_a ;
   private String AV305Normas ;
   private String AV82Lit38 ;
   private String A122BarAgrPar ;
   private String A1507BarAgrDsc ;
   private String A1245BarAgrSer ;
   private String A1510ColNomAgr ;
   private String Gx_msg ;
   private String AV158Hdr_a ;
   private String AV159CliNom_a ;
   private String AV196Agrdsc ;
   private String AV179Lit49 ;
   private String AV248Litpda ;
   private String AV278LocAlbr ;
   private String AV307distraidagr ;
   private String AV308po ;
   private String AV293ColAgr ;
   private String AV83Lit39 ;
   private String AV85Lit40 ;
   private String AV86Lit41 ;
   private String AV151Lit42 ;
   private String AV150Lit43 ;
   private String AV98Lit12 ;
   private String A606MaqDsc ;
   private String AV37DescMaq ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String AV164TipArtDsc ;
   private String A830TipArtDsc ;
   private String A544HisCodPar ;
   private String A5086DscCausa ;
   private String A834TipDefDsc ;
   private String A6229ProFoMaq ;
   private String AV226AlbRLote[] ;
   private String GXv_char9[] ;
   private String AV276Loc ;
   private String GXv_char8[] ;
   private String AV123Var3 ;
   private String AV73Lit3 ;
   private String AV84Lit4 ;
   private String AV126Lit5 ;
   private String AV127Lit6 ;
   private String AV128Lit7 ;
   private String AV129Lit8 ;
   private String AV130Lit9 ;
   private String AV96Lit10 ;
   private String AV97Lit11 ;
   private String AV99Lit13 ;
   private String AV100Lit14 ;
   private String AV101Lit15 ;
   private String AV102Lit16 ;
   private String AV103Lit17 ;
   private String AV104Lit18 ;
   private String AV105Lit19 ;
   private String AV107Lit20 ;
   private String AV64Lit21 ;
   private String AV65Lit22 ;
   private String AV66Lit23 ;
   private String AV67Lit24 ;
   private String AV68Lit25 ;
   private String AV69Lit26 ;
   private String AV70Lit27 ;
   private String AV71Lit28 ;
   private String AV72Lit29 ;
   private String AV74Lit30 ;
   private String AV75Lit31 ;
   private String AV76Lit32 ;
   private String AV77Lit33 ;
   private String AV78Lit34 ;
   private String AV174Lit45 ;
   private String AV175Lit46 ;
   private String AV176Lit47 ;
   private String AV178Lit48 ;
   private String AV181Lit50 ;
   private String AV183Lit51 ;
   private String AV184Lit52 ;
   private String AV256Lit60 ;
   private String GXt_char19 ;
   private String GXt_char13 ;
   private String GXv_char11[] ;
   private String A65ArtCod ;
   private String A187BarNotDsc ;
   private String AV292BarNotDsc ;
   private String AV261Obss ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV228TxtKg ;
   private String AV229TxtMt ;
   private String Gx_time ;
   private String AV243Hdr11 ;
   private String AV169Num_int ;
   private String AV170LinMaq ;
   private String AV166BarSer_10 ;
   private String AV165VCompo ;
   private String AV223Vcomp2 ;
   private String GXv_char12[] ;
   private String AV304color ;
   private String AV245Texto_un ;
   private String AV273TxtPml ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n4845BarAudObs ;
   private boolean n407EmprNom ;
   private boolean n1189TermUsu ;
   private boolean GxHdr6 ;
   private boolean n3915EmpNumDec ;
   private boolean n3006BarCoef ;
   private boolean n4866RecFecAlt ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private boolean n217BarTipArt ;
   private boolean n5258RecTxtObs ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n13302PrdTHELIST ;
   private boolean n606MaqDsc ;
   private boolean n2391MaqMicro ;
   private boolean n3598MaqNroTub ;
   private boolean n830TipArtDsc ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private boolean n834TipDefDsc ;
   private boolean n6229ProFoMaq ;
   private boolean n5192ProFoPgC ;
   private boolean n5950MaqDteCol ;
   private boolean n3072ArtObsLon ;
   private boolean n10888Dsc_Idtx ;
   private String AV251ArtObslon ;
   private String A3072ArtObsLon ;
   private String A4845BarAudObs ;
   private String AV257Baraudobs ;
   private String A3629CliObs ;
   private IDataStoreProvider pr_default ;
   private int[] P06S63_A361DisCod ;
   private String[] P06S63_A396EmprCod ;
   private String[] P06S63_A130BarCodPar ;
   private byte[] P06S63_A132BarCodReo ;
   private int[] P06S63_A129BarCod ;
   private String[] P06S63_A2829BarProPer ;
   private int[] P06S63_A252CliCod ;
   private boolean[] P06S63_n252CliCod ;
   private String[] P06S63_A212BarSer ;
   private String[] P06S63_A135BarColNom ;
   private int[] P06S63_A136BarColNum ;
   private byte[] P06S63_A218BarTipCol ;
   private String[] P06S63_A1652BarSerDsc ;
   private byte[] P06S63_A148BarEstReo ;
   private String[] P06S63_A1431BarLocDis ;
   private String[] P06S63_A4845BarAudObs ;
   private boolean[] P06S63_n4845BarAudObs ;
   private java.math.BigDecimal[] P06S63_A166BarKgm ;
   private java.math.BigDecimal[] P06S63_A184BarMtr ;
   private short[] P06S63_A199BarPie1 ;
   private String[] P06S63_A365DisDes ;
   private int[] P06S63_A898BarPieNDes ;
   private String[] P06S64_A396EmprCod ;
   private int[] P06S64_A361DisCod ;
   private String[] P06S64_A377DisObsTxt ;
   private byte[] P06S64_A376DisObsLin ;
   private String[] P06S65_A396EmprCod ;
   private String[] P06S65_A407EmprNom ;
   private boolean[] P06S65_n407EmprNom ;
   private String[] P06S66_A942TermCod ;
   private String[] P06S66_A1189TermUsu ;
   private boolean[] P06S66_n1189TermUsu ;
   private byte[] P06S69_A3915EmpNumDec ;
   private boolean[] P06S69_n3915EmpNumDec ;
   private String[] P06S69_A130BarCodPar ;
   private byte[] P06S69_A132BarCodReo ;
   private String[] P06S69_A396EmprCod ;
   private int[] P06S69_A129BarCod ;
   private short[] P06S69_A2804RecLinMaq ;
   private java.math.BigDecimal[] P06S69_A12270Rsedo7 ;
   private short[] P06S69_A12273Rsedo10 ;
   private short[] P06S69_A12274Rsedo11 ;
   private short[] P06S69_A12272Rsedo9 ;
   private int[] P06S69_A361DisCod ;
   private String[] P06S69_A206BarPle ;
   private String[] P06S69_A118BarAcaQui ;
   private String[] P06S69_A602MaqCod ;
   private String[] P06S69_A4609BarMdlCod ;
   private String[] P06S69_A9777BarItem3 ;
   private String[] P06S69_A4812BarEncCli ;
   private byte[] P06S69_A148BarEstReo ;
   private java.math.BigDecimal[] P06S69_A3006BarCoef ;
   private boolean[] P06S69_n3006BarCoef ;
   private short[] P06S69_A1226BarGraCru ;
   private String[] P06S69_A3629CliObs ;
   private int[] P06S69_A5109RecNumInt ;
   private java.util.Date[] P06S69_A4866RecFecAlt ;
   private boolean[] P06S69_n4866RecFecAlt ;
   private String[] P06S69_A4402RecUsrCod ;
   private java.util.Date[] P06S69_A4867RecFecMod ;
   private boolean[] P06S69_n4867RecFecMod ;
   private String[] P06S69_A4868RecUsrMod ;
   private boolean[] P06S69_n4868RecUsrMod ;
   private String[] P06S69_A212BarSer ;
   private short[] P06S69_A224BarTraP1 ;
   private String[] P06S69_A221BarTra1 ;
   private short[] P06S69_A225BarTraP2 ;
   private String[] P06S69_A222BarTra2 ;
   private short[] P06S69_A226BarTraP3 ;
   private String[] P06S69_A223BarTra3 ;
   private short[] P06S69_A232BarUrdP1 ;
   private String[] P06S69_A229BarUrd1 ;
   private short[] P06S69_A233BarUrdP2 ;
   private String[] P06S69_A230BarUrd2 ;
   private short[] P06S69_A234BarUrdP3 ;
   private String[] P06S69_A231BarUrd3 ;
   private short[] P06S69_A217BarTipArt ;
   private boolean[] P06S69_n217BarTipArt ;
   private String[] P06S69_A135BarColNom ;
   private short[] P06S69_A125BarAncAca1 ;
   private short[] P06S69_A1909BarGraAca ;
   private short[] P06S69_A3137BarGraAca2 ;
   private short[] P06S69_A126BarAncAca2 ;
   private String[] P06S69_A1652BarSerDsc ;
   private java.math.BigDecimal[] P06S69_A2806RecFA ;
   private String[] P06S69_A5110RecNumPrg ;
   private byte[] P06S69_A218BarTipCol ;
   private int[] P06S69_A1235BarNumCli ;
   private String[] P06S69_A1234BarNomCli ;
   private int[] P06S69_A136BarColNum ;
   private String[] P06S69_A279CliNom ;
   private int[] P06S69_A252CliCod ;
   private boolean[] P06S69_n252CliCod ;
   private String[] P06S69_A143BarDisNum ;
   private String[] P06S69_A2454BarGirar ;
   private short[] P06S69_A1503BarPart ;
   private String[] P06S69_A9775BarItem1 ;
   private java.math.BigDecimal[] P06S69_A4259RecTotKgs ;
   private short[] P06S69_A199BarPie1 ;
   private String[] P06S69_A365DisDes ;
   private int[] P06S69_A898BarPieNDes ;
   private int[] P06S69_A220BarTotPie ;
   private java.math.BigDecimal[] P06S69_A184BarMtr ;
   private java.math.BigDecimal[] P06S69_A870BarTotMtr ;
   private java.math.BigDecimal[] P06S69_A166BarKgm ;
   private java.math.BigDecimal[] P06S69_A219BarTotAgr ;
   private String[] P06S610_A396EmprCod ;
   private int[] P06S610_A129BarCod ;
   private byte[] P06S610_A132BarCodReo ;
   private String[] P06S610_A130BarCodPar ;
   private short[] P06S610_A2804RecLinMaq ;
   private String[] P06S610_A764ProForCod ;
   private short[] P06S610_A771ProForTie ;
   private byte[] P06S610_A1273RecLinPro ;
   private String[] P06S611_A396EmprCod ;
   private int[] P06S611_A129BarCod ;
   private byte[] P06S611_A132BarCodReo ;
   private String[] P06S611_A130BarCodPar ;
   private short[] P06S611_A2804RecLinMaq ;
   private String[] P06S611_A5258RecTxtObs ;
   private boolean[] P06S611_n5258RecTxtObs ;
   private short[] P06S611_A5257RecLinObs ;
   private String[] P06S612_A396EmprCod ;
   private int[] P06S612_A129BarCod ;
   private byte[] P06S612_A132BarCodReo ;
   private String[] P06S612_A130BarCodPar ;
   private byte[] P06S612_A1273RecLinPro ;
   private short[] P06S612_A2804RecLinMaq ;
   private int[] P06S612_A2392ProNumPro ;
   private int[] P06S612_A4697RecNroPrg ;
   private int[] P06S612_A2393ProNumRec ;
   private int[] P06S612_A1251RecNumRec ;
   private String[] P06S612_A764ProForCod ;
   private int[] P06S612_A4695RecVolPrf ;
   private String[] P06S612_A766ProForDsc ;
   private short[] P06S612_A771ProForTie ;
   private String[] P06S613_A719PrdNum ;
   private boolean[] P06S613_n719PrdNum ;
   private String[] P06S613_A396EmprCod ;
   private int[] P06S613_A129BarCod ;
   private byte[] P06S613_A132BarCodReo ;
   private String[] P06S613_A130BarCodPar ;
   private short[] P06S613_A2804RecLinMaq ;
   private byte[] P06S613_A1273RecLinPro ;
   private java.math.BigDecimal[] P06S613_A431FacCon ;
   private byte[] P06S613_A3274RecPrdTnq ;
   private java.math.BigDecimal[] P06S613_A4900PrdCanMac ;
   private String[] P06S613_A5725RecLote ;
   private byte[] P06S613_A490ForPrdUMe ;
   private boolean[] P06S613_n490ForPrdUMe ;
   private String[] P06S613_A1643PrdTip ;
   private byte[] P06S613_A2394RecForNro ;
   private java.math.BigDecimal[] P06S613_A686PrdCant ;
   private String[] P06S613_A872RecPrdNum ;
   private String[] P06S613_A875RecPrdDsc ;
   private byte[] P06S613_A743PrdUniCon ;
   private String[] P06S613_A11687PrdList ;
   private String[] P06S613_A11363PrdGots ;
   private String[] P06S613_A13301PrdZDHC ;
   private String[] P06S613_A13302PrdTHELIST ;
   private boolean[] P06S613_n13302PrdTHELIST ;
   private java.math.BigDecimal[] P06S613_A707PrdFacCon ;
   private java.math.BigDecimal[] P06S613_A724PrdPreAct ;
   private short[] P06S613_A811RecLin ;
   private String[] P06S614_A396EmprCod ;
   private int[] P06S614_A129BarCod ;
   private byte[] P06S614_A132BarCodReo ;
   private String[] P06S614_A130BarCodPar ;
   private short[] P06S614_A2804RecLinMaq ;
   private String[] P06S614_A5258RecTxtObs ;
   private boolean[] P06S614_n5258RecTxtObs ;
   private short[] P06S614_A5257RecLinObs ;
   private short[] P06S615_AV254NMaxAg ;
   private String[] P06S616_A130BarCodPar ;
   private byte[] P06S616_A132BarCodReo ;
   private int[] P06S616_A129BarCod ;
   private String[] P06S616_A396EmprCod ;
   private String[] P06S616_A122BarAgrPar ;
   private byte[] P06S616_A124BarAgrReo ;
   private int[] P06S616_A119BarAgrCod ;
   private int[] P06S616_A1508CliCodAgr ;
   private String[] P06S616_A1507BarAgrDsc ;
   private String[] P06S616_A1245BarAgrSer ;
   private java.math.BigDecimal[] P06S616_A869MtrAgr ;
   private short[] P06S616_A671PieAgr ;
   private int[] P06S616_A1512ColNumAgr ;
   private String[] P06S616_A1510ColNomAgr ;
   private java.math.BigDecimal[] P06S616_A590KgmAgr ;
   private String[] P06S617_A602MaqCod ;
   private String[] P06S617_A396EmprCod ;
   private String[] P06S617_A606MaqDsc ;
   private boolean[] P06S617_n606MaqDsc ;
   private byte[] P06S617_A2391MaqMicro ;
   private boolean[] P06S617_n2391MaqMicro ;
   private byte[] P06S617_A3598MaqNroTub ;
   private boolean[] P06S617_n3598MaqNroTub ;
   private byte[] P06S618_A831TipColCod ;
   private int[] P06S618_A483ForColNum ;
   private String[] P06S618_A482ForColNom ;
   private String[] P06S618_A494ForSer ;
   private int[] P06S618_A252CliCod ;
   private boolean[] P06S618_n252CliCod ;
   private String[] P06S618_A396EmprCod ;
   private String[] P06S618_A649ObsForTxt ;
   private short[] P06S618_A650ObsLin ;
   private short[] P06S619_A829TipArtCod ;
   private String[] P06S619_A396EmprCod ;
   private String[] P06S619_A830TipArtDsc ;
   private boolean[] P06S619_n830TipArtDsc ;
   private short[] P06S620_A833TipDefCod ;
   private short[] P06S620_A5085CodCausa ;
   private boolean[] P06S620_n5085CodCausa ;
   private String[] P06S620_A544HisCodPar ;
   private byte[] P06S620_A545HisCodReo ;
   private int[] P06S620_A539HisBarCod ;
   private String[] P06S620_A396EmprCod ;
   private String[] P06S620_A5086DscCausa ;
   private boolean[] P06S620_n5086DscCausa ;
   private String[] P06S620_A834TipDefDsc ;
   private boolean[] P06S620_n834TipDefDsc ;
   private String[] P06S621_A396EmprCod ;
   private String[] P06S621_A764ProForCod ;
   private String[] P06S621_A6229ProFoMaq ;
   private boolean[] P06S621_n6229ProFoMaq ;
   private short[] P06S621_A5192ProFoPgC ;
   private boolean[] P06S621_n5192ProFoPgC ;
   private short[] P06S621_A5191ProForLC ;
   private String[] P06S622_A602MaqCod ;
   private String[] P06S622_A396EmprCod ;
   private int[] P06S622_A5950MaqDteCol ;
   private boolean[] P06S622_n5950MaqDteCol ;
   private String[] P06S623_A3072ArtObsLon ;
   private boolean[] P06S623_n3072ArtObsLon ;
   private String[] P06S623_A65ArtCod ;
   private int[] P06S623_A252CliCod ;
   private boolean[] P06S623_n252CliCod ;
   private String[] P06S623_A396EmprCod ;
   private String[] P06S624_A130BarCodPar ;
   private byte[] P06S624_A132BarCodReo ;
   private int[] P06S624_A129BarCod ;
   private String[] P06S624_A396EmprCod ;
   private String[] P06S624_A187BarNotDsc ;
   private byte[] P06S624_A188BarNotLin ;
   private String[] P06S625_A10887Cod_Idtx ;
   private String[] P06S625_A10888Dsc_Idtx ;
   private boolean[] P06S625_n10888Dsc_Idtx ;
   private String[] P06S625_A396EmprCod ;
}

final  class rrecstdp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06S63", "SELECT T1.DisCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarProPer, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarSerDsc, T1.BarEstReo, T1.BarLocDis, T1.BarAudObs, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S64", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S65", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S66", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S69", "SELECT T2.EmpNumDec, T1.BarCodPar, T1.BarCodReo, T1.EmprCod, T1.BarCod, T1.RecLinMaq, T1.Rsedo7, T1.Rsedo10, T1.Rsedo11, T1.Rsedo9, T3.DisCod, T3.BarPle, T3.BarAcaQui, T1.MaqCod, T3.BarMdlCod, T3.BarItem3, T3.BarEncCli, T3.BarEstReo, T3.BarCoef, T3.BarGraCru, T4.CliObs, T1.RecNumInt, T1.RecFecAlt, T1.RecUsrCod, T1.RecFecMod, T1.RecUsrMod, T3.BarSer, T3.BarTraP1, T3.BarTra1, T3.BarTraP2, T3.BarTra2, T3.BarTraP3, T3.BarTra3, T3.BarUrdP1, T3.BarUrd1, T3.BarUrdP2, T3.BarUrd2, T3.BarUrdP3, T3.BarUrd3, T3.BarTipArt, T3.BarColNom, T3.BarAncAca1, T3.BarGraAca, T3.BarGraAca2, T3.BarAncAca2, T3.BarSerDsc, T1.RecFA, T1.RecNumPrg, T3.BarTipCol, T3.BarNumCli, T3.BarNomCli, T3.BarColNum, T4.CliNom, T3.CliCod, T3.BarDisNum, T3.BarGirar, T3.BarPart, T3.BarItem1, T1.RecTotKgs, COALESCE( T6.BarPie1, 0) AS BarPie1, T3.DisDes, COALESCE( T6.BarPieNDes, 0) AS BarPieNDes, COALESCE( T5.BarTotPie, 0) AS BarTotPie, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T5.BarTotMtr, 0) AS BarTotMtr, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T5.BarTotAgr, 0) AS BarTotAgr FROM (((((TXPRECMAQ T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr, SUM(PieAgr) AS BarTotPie FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S610", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.ProForCod, T2.ProForTie, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S611", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecTxtObs, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S612", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinPro, T1.RecLinMaq, T2.ProNumPro, T1.RecNroPrg, T2.ProNumRec, T1.RecNumRec, T1.ProForCod, T1.RecVolPrf, T2.ProForDsc, T2.ProForTie FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S613", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.FacCon, T1.RecPrdTnq, T1.PrdCanMac, T1.RecLote, T1.ForPrdUMe, T2.PrdTip, T1.RecForNro, T1.PrdCant, T1.RecPrdNum, T1.RecPrdDsc, T2.PrdUniCon, T2.PrdList, T2.PrdGots, T2.PrdZDHC, T2.PrdTHELIST, T2.PrdFacCon, T2.PrdPreAct, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S614", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecTxtObs, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S615", "SELECT COUNT(*) FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S616", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrPar, BarAgrReo, BarAgrCod, CliCodAgr, BarAgrDsc, BarAgrSer, MtrAgr, PieAgr, ColNumAgr, ColNomAgr, KgmAgr FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S617", "SELECT MaqCod, EmprCod, MaqDsc, MaqMicro, MaqNroTub FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S618", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S619", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S620", "SELECT T1.TipDefCod, T1.CodCausa, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.EmprCod, T3.DscCausa, T2.TipDefDsc FROM ((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) WHERE T1.EmprCod = ? and T1.HisBarCod = ? and T1.HisCodReo = ? and T1.HisCodPar = ? ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S621", "SELECT EmprCod, ProForCod, ProFoMaq, ProFoPgC, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? and ProFoMaq = ? ORDER BY EmprCod, ProForCod, ProFoMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S622", "SELECT MaqCod, EmprCod, MaqDteCol FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S623", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06S624", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06S625", "SELECT Cod_Idtx, Dsc_Idtx, EmprCod FROM TXPINDITE WHERE Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 10);
               ((String[]) buf[15])[0] = rslt.getVarchar(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((String[]) buf[14])[0] = rslt.getString(14, 6);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 20);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((String[]) buf[22])[0] = rslt.getVarchar(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(24, 8);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(27, 16);
               ((short[]) buf[32])[0] = rslt.getShort(28);
               ((String[]) buf[33])[0] = rslt.getString(29, 4);
               ((short[]) buf[34])[0] = rslt.getShort(30);
               ((String[]) buf[35])[0] = rslt.getString(31, 4);
               ((short[]) buf[36])[0] = rslt.getShort(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 4);
               ((short[]) buf[38])[0] = rslt.getShort(34);
               ((String[]) buf[39])[0] = rslt.getString(35, 4);
               ((short[]) buf[40])[0] = rslt.getShort(36);
               ((String[]) buf[41])[0] = rslt.getString(37, 4);
               ((short[]) buf[42])[0] = rslt.getShort(38);
               ((String[]) buf[43])[0] = rslt.getString(39, 4);
               ((short[]) buf[44])[0] = rslt.getShort(40);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(41, 13);
               ((short[]) buf[47])[0] = rslt.getShort(42);
               ((short[]) buf[48])[0] = rslt.getShort(43);
               ((short[]) buf[49])[0] = rslt.getShort(44);
               ((short[]) buf[50])[0] = rslt.getShort(45);
               ((String[]) buf[51])[0] = rslt.getString(46, 26);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[53])[0] = rslt.getString(48, 6);
               ((byte[]) buf[54])[0] = rslt.getByte(49);
               ((int[]) buf[55])[0] = rslt.getInt(50);
               ((String[]) buf[56])[0] = rslt.getString(51, 13);
               ((int[]) buf[57])[0] = rslt.getInt(52);
               ((String[]) buf[58])[0] = rslt.getString(53, 30);
               ((int[]) buf[59])[0] = rslt.getInt(54);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(55, 8);
               ((String[]) buf[62])[0] = rslt.getString(56, 20);
               ((short[]) buf[63])[0] = rslt.getShort(57);
               ((String[]) buf[64])[0] = rslt.getString(58, 20);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[66])[0] = rslt.getShort(60);
               ((String[]) buf[67])[0] = rslt.getString(61, 1);
               ((int[]) buf[68])[0] = rslt.getInt(62);
               ((int[]) buf[69])[0] = rslt.getInt(63);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(64,2);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(65,2);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(66,2);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(67,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,3);
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((String[]) buf[23])[0] = rslt.getString(22, 4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(24,5);
               ((short[]) buf[27])[0] = rslt.getShort(25);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 4);
               return;
      }
   }

}

