package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ptintrecipe_impl extends GXWebReport
{
   public ptintrecipe_impl( com.genexus.internet.HttpContext context )
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
         AV239EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV177BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            AV179BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            AV178BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV186BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
            AV195BarSua = httpContext.GetPar( "BarSua") ;
            AV373Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            AV327RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            AV272ImpCod = httpContext.GetPar( "ImpCod") ;
            AV221Copias = (byte)(GXutil.lval( httpContext.GetPar( "Copias"))) ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         /* Execute user subroutine: 'INICIAR' */
         S121 ();
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
         AV484lit999 = ((0==AV469Carvitin) ? httpContext.getMessage( "Lote", "") : httpContext.getMessage( "Lote / Armazem", "")) ;
         AV400Lit3 = ((AV262Gavim==1) ? " " : AV400Lit3) ;
         /* Using cursor P05DG2 */
         pr_default.execute(0, new Object[] {AV239EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P05DG2_A396EmprCod[0] ;
            A407EmprNom = P05DG2_A407EmprNom[0] ;
            n407EmprNom = P05DG2_n407EmprNom[0] ;
            AV308NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_char1 = AV341Termin ;
         GXv_char2[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
         ptintrecipe_impl.this.GXt_char1 = GXv_char2[0] ;
         AV341Termin = GXt_char1 ;
         /* Using cursor P05DG3 */
         pr_default.execute(1, new Object[] {AV341Termin});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A942TermCod = P05DG3_A942TermCod[0] ;
            A1189TermUsu = P05DG3_A1189TermUsu[0] ;
            n1189TermUsu = P05DG3_n1189TermUsu[0] ;
            AV342TermUsu = A1189TermUsu ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P05DG5 */
         pr_default.execute(2, new Object[] {AV239EmprCod, Integer.valueOf(AV177BarCod), Byte.valueOf(AV179BarCodReo), AV178BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P05DG5_A130BarCodPar[0] ;
            A132BarCodReo = P05DG5_A132BarCodReo[0] ;
            A129BarCod = P05DG5_A129BarCod[0] ;
            A361DisCod = P05DG5_A361DisCod[0] ;
            A396EmprCod = P05DG5_A396EmprCod[0] ;
            A252CliCod = P05DG5_A252CliCod[0] ;
            n252CliCod = P05DG5_n252CliCod[0] ;
            A212BarSer = P05DG5_A212BarSer[0] ;
            A135BarColNom = P05DG5_A135BarColNom[0] ;
            A136BarColNum = P05DG5_A136BarColNum[0] ;
            A218BarTipCol = P05DG5_A218BarTipCol[0] ;
            A1652BarSerDsc = P05DG5_A1652BarSerDsc[0] ;
            A4466BarAcaAnh = P05DG5_A4466BarAcaAnh[0] ;
            A2829BarProPer = P05DG5_A2829BarProPer[0] ;
            A148BarEstReo = P05DG5_A148BarEstReo[0] ;
            A143BarDisNum = P05DG5_A143BarDisNum[0] ;
            A4812BarEncCli = P05DG5_A4812BarEncCli[0] ;
            A1431BarLocDis = P05DG5_A1431BarLocDis[0] ;
            A4845BarAudObs = P05DG5_A4845BarAudObs[0] ;
            n4845BarAudObs = P05DG5_n4845BarAudObs[0] ;
            A217BarTipArt = P05DG5_A217BarTipArt[0] ;
            n217BarTipArt = P05DG5_n217BarTipArt[0] ;
            A224BarTraP1 = P05DG5_A224BarTraP1[0] ;
            A221BarTra1 = P05DG5_A221BarTra1[0] ;
            A225BarTraP2 = P05DG5_A225BarTraP2[0] ;
            A222BarTra2 = P05DG5_A222BarTra2[0] ;
            A226BarTraP3 = P05DG5_A226BarTraP3[0] ;
            A223BarTra3 = P05DG5_A223BarTra3[0] ;
            A166BarKgm = P05DG5_A166BarKgm[0] ;
            A184BarMtr = P05DG5_A184BarMtr[0] ;
            A199BarPie1 = P05DG5_A199BarPie1[0] ;
            A365DisDes = P05DG5_A365DisDes[0] ;
            A898BarPieNDes = P05DG5_A898BarPieNDes[0] ;
            A166BarKgm = P05DG5_A166BarKgm[0] ;
            A184BarMtr = P05DG5_A184BarMtr[0] ;
            A199BarPie1 = P05DG5_A199BarPie1[0] ;
            A898BarPieNDes = P05DG5_A898BarPieNDes[0] ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            AV476DisCod = A361DisCod ;
            AV206Cliente = A252CliCod ;
            AV260ForSer = A212BarSer ;
            AV257ForColNom = A135BarColNom ;
            AV258ForColNum = A136BarColNum ;
            AV350TipColCod = A218BarTipCol ;
            AV335Serie = A1652BarSerDsc ;
            AV343Texto_r = "" ;
            AV237DSCCAUSA = "" ;
            GXv_char2[0] = AV239EmprCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_int4[0] = A4466BarAcaAnh ;
            GXv_char5[0] = AV460Tb1_dscfb ;
            new app.pptable2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5) ;
            ptintrecipe_impl.this.AV239EmprCod = GXv_char2[0] ;
            ptintrecipe_impl.this.A252CliCod = GXv_int3[0] ;
            ptintrecipe_impl.this.A4466BarAcaAnh = GXv_int4[0] ;
            ptintrecipe_impl.this.AV460Tb1_dscfb = GXv_char5[0] ;
            AV461DisEnt = ((A4466BarAcaAnh>0) ? GXutil.trim( GXutil.substring( AV460Tb1_dscfb, 1, 30)) : "") ;
            AV467Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S181 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV347Tinamar == 1 )
            {
               if ( (GXutil.strcmp("", AV461DisEnt)==0) )
               {
                  AV461DisEnt = GXutil.trim( AV466Dsc_Idtx) ;
               }
               else
               {
                  AV461DisEnt += "/" + GXutil.trim( AV466Dsc_Idtx) ;
               }
            }
            /* Execute user subroutine: 'ARTICU' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( A148BarEstReo == 1 ) && ( AV247FlagEnd == 1 ) )
            {
               /* Execute user subroutine: 'HISREO' */
               S131 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV183BarKgm = A166BarKgm ;
            AV188BarMtr = A184BarMtr ;
            AV192BarPie = A198BarPie ;
            GX_I = 1 ;
            while ( GX_I <= 9 )
            {
               AV316Obstxt[GX_I-1] = " " ;
               GX_I = (int)(GX_I+1) ;
            }
            AV270I = (byte)(1) ;
            /* Using cursor P05DG6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A377DisObsTxt = P05DG6_A377DisObsTxt[0] ;
               A376DisObsLin = P05DG6_A376DisObsLin[0] ;
               AV316Obstxt[AV270I-1] = A377DisObsTxt ;
               AV270I = (byte)(AV270I+1) ;
               if ( AV270I > 9 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV452BarEnccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
            GXv_int3[0] = AV185barmaccod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
            ptintrecipe_impl.this.AV185barmaccod = GXv_int3[0] ;
            AV168Albrloc = " " ;
            AV432Lit99 = "" ;
            /* Execute user subroutine: 'LOTES' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV184barlocdis = A1431BarLocDis ;
            AV175Baraudobs = A4845BarAudObs ;
            AV354TotTiempo = 0 ;
            /* Optimized group. */
            /* Using cursor P05DG7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV327RecLinMaq)});
            c771ProForTie = P05DG7_A771ProForTie[0] ;
            pr_default.close(4);
            AV354TotTiempo = (long)(AV354TotTiempo+c771ProForTie) ;
            /* End optimized group. */
            GXt_char1 = AV348TipArtDsc ;
            GXv_char5[0] = GXt_char1 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char5) ;
            ptintrecipe_impl.this.GXt_char1 = GXv_char5[0] ;
            AV348TipArtDsc = GXt_char1 ;
            if ( A224BarTraP1 > 0 )
            {
               AV365VCompo = GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
               if ( A225BarTraP2 > 0 )
               {
                  AV365VCompo += GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
               }
               if ( A226BarTraP3 > 0 )
               {
                  AV365VCompo += GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
               }
            }
            /* Execute user subroutine: 'GOTSGRSOCS' */
            S191 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'NORMAS' */
            S201 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV441Ceros2 = "0000" ;
         AV437Hhpar1 = (short)(AV354TotTiempo/ (double) (60)) ;
         AV438Hhpar2 = (short)(GXutil.Int( AV437Hhpar1)) ;
         AV435Hhalfa = GXutil.str( AV438Hhpar2, 4, 0) ;
         AV435Hhalfa = GXutil.ltrim( GXutil.rtrim( AV435Hhalfa)) ;
         AV282Lenvar = (short)(GXutil.len( AV435Hhalfa)) ;
         AV282Lenvar = (short)(4-AV282Lenvar) ;
         AV440MinPar1 = (byte)(AV354TotTiempo-(AV438Hhpar2*60)) ;
         AV439MinAlfa = GXutil.str( AV440MinPar1, 2, 0) ;
         AV439MinAlfa = GXutil.ltrim( GXutil.rtrim( AV439MinAlfa)) ;
         AV282Lenvar = (short)(GXutil.len( AV439MinAlfa)) ;
         AV282Lenvar = (short)(2-AV282Lenvar) ;
         AV439MinAlfa = GXutil.substring( AV441Ceros2, 1, AV282Lenvar) + AV439MinAlfa ;
         AV434HhMmt = AV435Hhalfa + ":" + AV439MinAlfa ;
         GXv_char5[0] = AV277Intens ;
         GXv_char2[0] = AV302Matiz ;
         GXv_int4[0] = AV301MatCod ;
         GXv_int6[0] = AV350TipColCod ;
         GXv_char7[0] = AV349TipCol ;
         GXv_char8[0] = AV352Tonalidad ;
         GXv_int3[0] = AV313NumCli ;
         GXv_char9[0] = AV261ForTonal ;
         GXv_char10[0] = AV238DscSol ;
         GXv_int11[0] = AV212CodSol ;
         GXv_char12[0] = AV296Macprocod ;
         GXv_char13[0] = AV259ForNomcli3 ;
         new app.pmasinf(remoteHandle, context).execute( AV239EmprCod, AV206Cliente, AV260ForSer, AV257ForColNom, AV258ForColNum, AV350TipColCod, GXv_char5, GXv_char2, GXv_int4, GXv_int6, GXv_char7, GXv_char8, GXv_int3, GXv_char9, GXv_char10, GXv_int11, GXv_char12, GXv_char13) ;
         ptintrecipe_impl.this.AV277Intens = GXv_char5[0] ;
         ptintrecipe_impl.this.AV302Matiz = GXv_char2[0] ;
         ptintrecipe_impl.this.AV301MatCod = GXv_int4[0] ;
         ptintrecipe_impl.this.AV350TipColCod = GXv_int6[0] ;
         ptintrecipe_impl.this.AV349TipCol = GXv_char7[0] ;
         ptintrecipe_impl.this.AV352Tonalidad = GXv_char8[0] ;
         ptintrecipe_impl.this.AV313NumCli = GXv_int3[0] ;
         ptintrecipe_impl.this.AV261ForTonal = GXv_char9[0] ;
         ptintrecipe_impl.this.AV238DscSol = GXv_char10[0] ;
         ptintrecipe_impl.this.AV212CodSol = GXv_int11[0] ;
         ptintrecipe_impl.this.AV296Macprocod = GXv_char12[0] ;
         ptintrecipe_impl.this.AV259ForNomcli3 = GXv_char13[0] ;
         /* Using cursor P05DG8 */
         pr_default.execute(5, new Object[] {AV239EmprCod, Integer.valueOf(AV177BarCod), Byte.valueOf(AV179BarCodReo), AV178BarCodPar, Short.valueOf(AV327RecLinMaq)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A872RecPrdNum = P05DG8_A872RecPrdNum[0] ;
            A2804RecLinMaq = P05DG8_A2804RecLinMaq[0] ;
            A130BarCodPar = P05DG8_A130BarCodPar[0] ;
            A132BarCodReo = P05DG8_A132BarCodReo[0] ;
            A129BarCod = P05DG8_A129BarCod[0] ;
            A396EmprCod = P05DG8_A396EmprCod[0] ;
            A686PrdCant = P05DG8_A686PrdCant[0] ;
            A811RecLin = P05DG8_A811RecLin[0] ;
            A1273RecLinPro = P05DG8_A1273RecLinPro[0] ;
            if ( A686PrdCant.doubleValue() < 1 )
            {
               AV473MoAColorantes = httpContext.getMessage( "M", "") ;
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         AV226Coste2 = DecimalUtil.doubleToDec(0) ;
         AV230DesCol = GXutil.substring( AV349TipCol, 1, 15) ;
         AV231DesInt = GXutil.substring( AV277Intens, 1, 20) ;
         GxHdr8 = true ;
         /* Using cursor P05DG11 */
         pr_default.execute(6, new Object[] {AV239EmprCod, Integer.valueOf(AV177BarCod), Byte.valueOf(AV179BarCodReo), AV178BarCodPar, Short.valueOf(AV327RecLinMaq)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A130BarCodPar = P05DG11_A130BarCodPar[0] ;
            A132BarCodReo = P05DG11_A132BarCodReo[0] ;
            A396EmprCod = P05DG11_A396EmprCod[0] ;
            A129BarCod = P05DG11_A129BarCod[0] ;
            A2804RecLinMaq = P05DG11_A2804RecLinMaq[0] ;
            A361DisCod = P05DG11_A361DisCod[0] ;
            A206BarPle = P05DG11_A206BarPle[0] ;
            A118BarAcaQui = P05DG11_A118BarAcaQui[0] ;
            A602MaqCod = P05DG11_A602MaqCod[0] ;
            A1503BarPart = P05DG11_A1503BarPart[0] ;
            A4609BarMdlCod = P05DG11_A4609BarMdlCod[0] ;
            A9775BarItem1 = P05DG11_A9775BarItem1[0] ;
            A9777BarItem3 = P05DG11_A9777BarItem3[0] ;
            A148BarEstReo = P05DG11_A148BarEstReo[0] ;
            A3006BarCoef = P05DG11_A3006BarCoef[0] ;
            n3006BarCoef = P05DG11_n3006BarCoef[0] ;
            A1226BarGraCru = P05DG11_A1226BarGraCru[0] ;
            A3735BarPieKgl = P05DG11_A3735BarPieKgl[0] ;
            A120BarAgrEst = P05DG11_A120BarAgrEst[0] ;
            A4259RecTotKgs = P05DG11_A4259RecTotKgs[0] ;
            A5109RecNumInt = P05DG11_A5109RecNumInt[0] ;
            A2454BarGirar = P05DG11_A2454BarGirar[0] ;
            A5058BarEnvLaw = P05DG11_A5058BarEnvLaw[0] ;
            A4866RecFecAlt = P05DG11_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P05DG11_n4866RecFecAlt[0] ;
            A4867RecFecMod = P05DG11_A4867RecFecMod[0] ;
            n4867RecFecMod = P05DG11_n4867RecFecMod[0] ;
            A4868RecUsrMod = P05DG11_A4868RecUsrMod[0] ;
            n4868RecUsrMod = P05DG11_n4868RecUsrMod[0] ;
            A4402RecUsrCod = P05DG11_A4402RecUsrCod[0] ;
            A1234BarNomCli = P05DG11_A1234BarNomCli[0] ;
            A218BarTipCol = P05DG11_A218BarTipCol[0] ;
            A136BarColNum = P05DG11_A136BarColNum[0] ;
            A135BarColNom = P05DG11_A135BarColNom[0] ;
            A3137BarGraAca2 = P05DG11_A3137BarGraAca2[0] ;
            A1909BarGraAca = P05DG11_A1909BarGraAca[0] ;
            A126BarAncAca2 = P05DG11_A126BarAncAca2[0] ;
            A125BarAncAca1 = P05DG11_A125BarAncAca1[0] ;
            A1652BarSerDsc = P05DG11_A1652BarSerDsc[0] ;
            A212BarSer = P05DG11_A212BarSer[0] ;
            A279CliNom = P05DG11_A279CliNom[0] ;
            A252CliCod = P05DG11_A252CliCod[0] ;
            n252CliCod = P05DG11_n252CliCod[0] ;
            A11662BarOrdComp = P05DG11_A11662BarOrdComp[0] ;
            A5110RecNumPrg = P05DG11_A5110RecNumPrg[0] ;
            A2806RecFA = P05DG11_A2806RecFA[0] ;
            A184BarMtr = P05DG11_A184BarMtr[0] ;
            A870BarTotMtr = P05DG11_A870BarTotMtr[0] ;
            A199BarPie1 = P05DG11_A199BarPie1[0] ;
            A365DisDes = P05DG11_A365DisDes[0] ;
            A898BarPieNDes = P05DG11_A898BarPieNDes[0] ;
            A220BarTotPie = P05DG11_A220BarTotPie[0] ;
            A166BarKgm = P05DG11_A166BarKgm[0] ;
            A219BarTotAgr = P05DG11_A219BarTotAgr[0] ;
            A361DisCod = P05DG11_A361DisCod[0] ;
            A206BarPle = P05DG11_A206BarPle[0] ;
            A118BarAcaQui = P05DG11_A118BarAcaQui[0] ;
            A1503BarPart = P05DG11_A1503BarPart[0] ;
            A4609BarMdlCod = P05DG11_A4609BarMdlCod[0] ;
            A9775BarItem1 = P05DG11_A9775BarItem1[0] ;
            A9777BarItem3 = P05DG11_A9777BarItem3[0] ;
            A148BarEstReo = P05DG11_A148BarEstReo[0] ;
            A3006BarCoef = P05DG11_A3006BarCoef[0] ;
            n3006BarCoef = P05DG11_n3006BarCoef[0] ;
            A1226BarGraCru = P05DG11_A1226BarGraCru[0] ;
            A3735BarPieKgl = P05DG11_A3735BarPieKgl[0] ;
            A120BarAgrEst = P05DG11_A120BarAgrEst[0] ;
            A2454BarGirar = P05DG11_A2454BarGirar[0] ;
            A5058BarEnvLaw = P05DG11_A5058BarEnvLaw[0] ;
            A1234BarNomCli = P05DG11_A1234BarNomCli[0] ;
            A218BarTipCol = P05DG11_A218BarTipCol[0] ;
            A136BarColNum = P05DG11_A136BarColNum[0] ;
            A135BarColNom = P05DG11_A135BarColNom[0] ;
            A3137BarGraAca2 = P05DG11_A3137BarGraAca2[0] ;
            A1909BarGraAca = P05DG11_A1909BarGraAca[0] ;
            A126BarAncAca2 = P05DG11_A126BarAncAca2[0] ;
            A125BarAncAca1 = P05DG11_A125BarAncAca1[0] ;
            A1652BarSerDsc = P05DG11_A1652BarSerDsc[0] ;
            A212BarSer = P05DG11_A212BarSer[0] ;
            A252CliCod = P05DG11_A252CliCod[0] ;
            n252CliCod = P05DG11_n252CliCod[0] ;
            A11662BarOrdComp = P05DG11_A11662BarOrdComp[0] ;
            A365DisDes = P05DG11_A365DisDes[0] ;
            A279CliNom = P05DG11_A279CliNom[0] ;
            A870BarTotMtr = P05DG11_A870BarTotMtr[0] ;
            A220BarTotPie = P05DG11_A220BarTotPie[0] ;
            A219BarTotAgr = P05DG11_A219BarTotAgr[0] ;
            A184BarMtr = P05DG11_A184BarMtr[0] ;
            A199BarPie1 = P05DG11_A199BarPie1[0] ;
            A898BarPieNDes = P05DG11_A898BarPieNDes[0] ;
            A166BarKgm = P05DG11_A166BarKgm[0] ;
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
            AV464RecUsrCod = ((AV262Gavim==1) ? " " : A4402RecUsrCod) ;
            AV465RecFecAlt = GXutil.resetTime( ((AV262Gavim==1) ? GXutil.nullDate() : A4866RecFecAlt) );
            GXv_int3[0] = AV295MacCod ;
            new app.pbusmac(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int3) ;
            ptintrecipe_impl.this.AV295MacCod = GXv_int3[0] ;
            if ( AV279JPF == 1 )
            {
               GXv_char13[0] = A396EmprCod ;
               GXv_int3[0] = A129BarCod ;
               GXv_int6[0] = A132BarCodReo ;
               GXv_char12[0] = A130BarCodPar ;
               GXv_char10[0] = AV176BarCal ;
               new app.pmetpie(remoteHandle, context).execute( GXv_char13, GXv_int3, GXv_int6, GXv_char12, GXv_char10) ;
               ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
               ptintrecipe_impl.this.A129BarCod = GXv_int3[0] ;
               ptintrecipe_impl.this.A132BarCodReo = GXv_int6[0] ;
               ptintrecipe_impl.this.A130BarCodPar = GXv_char12[0] ;
               ptintrecipe_impl.this.AV176BarCal = GXv_char10[0] ;
            }
            AV228DesAcaqui = "" ;
            AV193BarPle = "" ;
            if ( AV240erfoc == 1 )
            {
               AV193BarPle = A206BarPle ;
               GXv_char13[0] = A396EmprCod ;
               GXv_char12[0] = A118BarAcaQui ;
               GXv_int6[0] = (byte)(0) ;
               GXv_char10[0] = AV228DesAcaqui ;
               new app.pbusprot(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_int6, GXv_char10) ;
               ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
               ptintrecipe_impl.this.A118BarAcaQui = GXv_char12[0] ;
               ptintrecipe_impl.this.AV228DesAcaqui = GXv_char10[0] ;
            }
            AV328RecNumPrg = A5110RecNumPrg ;
            GXv_char13[0] = A396EmprCod ;
            GXv_char12[0] = A5110RecNumPrg ;
            GXv_char10[0] = AV297MacProDsc ;
            new app.pbuftdsc(remoteHandle, context).execute( GXv_char13, GXv_char12, GXv_char10) ;
            ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
            ptintrecipe_impl.this.A5110RecNumPrg = GXv_char12[0] ;
            ptintrecipe_impl.this.AV297MacProDsc = GXv_char10[0] ;
            AV299MaqCod = A602MaqCod ;
            /* Execute user subroutine: 'MAQUIN' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV317Partida = A1503BarPart ;
            AV187BarMdlcod = A4609BarMdlCod ;
            AV181Baritem1 = GXutil.substring( A9775BarItem1, 1, 10) ;
            AV182BarItem3 = GXutil.substring( A9777BarItem3, 1, 10) ;
            AV285Litnop = httpContext.getMessage( "NOP", "") ;
            AV286Litnov = httpContext.getMessage( "NOV", "") ;
            if ( AV240erfoc == 0 )
            {
               AV187BarMdlcod = GXutil.space( (short)(13)) ;
               AV426Lit53 = " " ;
               AV285Litnop = " " ;
               AV286Litnov = " " ;
               AV181Baritem1 = " " ;
               AV182BarItem3 = " " ;
            }
            AV203CliCod = A252CliCod ;
            AV170ArtCod = A212BarSer ;
            AV257ForColNom = A135BarColNom ;
            AV258ForColNum = A136BarColNum ;
            AV214Colorante = AV350TipColCod ;
            if ( ( AV324RecAca == 1 ) && ( GXutil.strcmp(GXutil.substring( AV186BarMaqCod, 1, 2), httpContext.getMessage( "TI", "")) != 0 ) )
            {
               GXv_char13[0] = AV220ContDsc ;
               new app.pexidsc(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "RECACA", ""), GXv_char13) ;
               ptintrecipe_impl.this.AV220ContDsc = GXv_char13[0] ;
               GXt_char1 = AV377Lit0 ;
               GXv_char13[0] = GXt_char1 ;
               new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN046", ""), (byte)(99), GXv_char13) ;
               ptintrecipe_impl.this.GXt_char1 = GXv_char13[0] ;
               AV377Lit0 = GXt_char1 ;
            }
            AV331Remonta = "" ;
            if ( A148BarEstReo >= 1 )
            {
               AV331Remonta = AV416Lit44 ;
            }
            AV281Largura = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
            AV180BarGraAca = A1909BarGraAca ;
            AV346TiempoV = A3006BarCoef ;
            AV263GrMlin = DecimalUtil.doubleToDec(A1226BarGraCru*(A125BarAncAca1/ (double) (100))) ;
            AV216CompTP = DecimalUtil.doubleToDec(0) ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV263GrMlin)==0) )
            {
               AV216CompTP = (A812RecTotKgm.multiply(DecimalUtil.doubleToDec(1000))).divide(AV263GrMlin, 18, java.math.RoundingMode.DOWN) ;
            }
            AV292Lts1 = AV373Volumen ;
            AV293Lts2 = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV292Lts1).subtract((DecimalUtil.doubleToDec(2).multiply(A812RecTotKgm))))) ;
            AV330RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV373Volumen).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN)), 0))) ;
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV320Procesos[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV345Tiempos[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV270I = (byte)(1) ;
            AV354TotTiempo = 0 ;
            /* Using cursor P05DG12 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV327RecLinMaq)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A2804RecLinMaq = P05DG12_A2804RecLinMaq[0] ;
               A764ProForCod = P05DG12_A764ProForCod[0] ;
               A771ProForTie = P05DG12_A771ProForTie[0] ;
               A1273RecLinPro = P05DG12_A1273RecLinPro[0] ;
               A771ProForTie = P05DG12_A771ProForTie[0] ;
               AV320Procesos[AV270I-1] = A764ProForCod ;
               AV345Tiempos[AV270I-1] = A771ProForTie ;
               AV354TotTiempo = (long)(AV354TotTiempo+A771ProForTie) ;
               AV270I = (byte)(AV270I+1) ;
               if ( AV270I > 6 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(7);
            }
            pr_default.close(7);
            AV269HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV264Hdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            AV202ceros8 = "00000000" ;
            AV267HdrAlfa = GXutil.str( A129BarCod, 8, 0) ;
            AV267HdrAlfa = GXutil.ltrim( GXutil.rtrim( AV267HdrAlfa)) ;
            AV282Lenvar = (short)(GXutil.len( AV267HdrAlfa)) ;
            AV282Lenvar = (short)(8-AV282Lenvar) ;
            AV298MaqCdb = "*" + AV186BarMaqCod + "*" ;
            AV371VolProd = 0 ;
            AV370VolCor = 0 ;
            if ( ( AV236Dosea > 0 ) && ( AV340Tejido == 1 ) )
            {
               AV371VolProd = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(AV373Volumen/ (double) (AV236Dosea)), 0))) ;
               AV370VolCor = (int)(AV373Volumen-AV371VolProd) ;
            }
            AV480Kgm = ((A3735BarPieKgl.doubleValue()>0) ? A3735BarPieKgl : A166BarKgm) ;
            GXv_char13[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int6[0] = A132BarCodReo ;
            GXv_char12[0] = A130BarCodPar ;
            GXv_char10[0] = A120BarAgrEst ;
            GXv_decimal14[0] = AV480Kgm ;
            GXv_decimal15[0] = AV481totkgm ;
            new app.ppshdr(remoteHandle, context).execute( GXv_char13, GXv_int3, GXv_int6, GXv_char12, GXv_char10, GXv_decimal14, GXv_decimal15) ;
            ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
            ptintrecipe_impl.this.A129BarCod = GXv_int3[0] ;
            ptintrecipe_impl.this.A132BarCodReo = GXv_int6[0] ;
            ptintrecipe_impl.this.A130BarCodPar = GXv_char12[0] ;
            ptintrecipe_impl.this.A120BarAgrEst = GXv_char10[0] ;
            ptintrecipe_impl.this.AV480Kgm = GXv_decimal14[0] ;
            ptintrecipe_impl.this.AV481totkgm = GXv_decimal15[0] ;
            AV353Tot_kgs = A812RecTotKgm ;
            AV294M = "" ;
            if ( ( A4259RecTotKgs.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A812RecTotKgm, A4259RecTotKgs) != 0 ) )
            {
               AV353Tot_kgs = A4259RecTotKgs ;
               AV294M = "*" ;
            }
            if ( ( AV479acabats2013 == 1 ) && ( DecimalUtil.compareTo(A812RecTotKgm, AV481totkgm) != 0 ) )
            {
               AV353Tot_kgs = AV481totkgm ;
               AV294M = "*" ;
            }
            if ( A5109RecNumInt > 0 )
            {
               AV311Num_int = "(" + GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)) + ")" ;
            }
            else
            {
               AV311Num_int = GXutil.space( (short)(10)) ;
            }
            AV284LinMaq = "(" + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + ")" ;
            AV318Pml = (short)(DecimalUtil.decToDouble(((A871RecTotMtr.doubleValue()>0) ? (AV353Tot_kgs.divide(A871RecTotMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)))) ;
            AV261ForTonal = ((AV347Tinamar==1) ? A2454BarGirar : AV261ForTonal) ;
            AV191BarPes = ((AV347Tinamar==1) ? AV318Pml : AV191BarPes) ;
            /* Execute user subroutine: 'DESCMAQ' */
            S171 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               pr_default.close(6);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'AGRUPADAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV312NumCam = (byte)(((0==AV312NumCam) ? 1 : AV312NumCam)) ;
            AV215CompCamar = (AV216CompTP.divide(DecimalUtil.doubleToDec(AV312NumCam), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(80)).divide(DecimalUtil.doubleToDec(60), 18, java.math.RoundingMode.DOWN) ;
            /* Using cursor P05DG13 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV327RecLinMaq)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A1273RecLinPro = P05DG13_A1273RecLinPro[0] ;
               A2804RecLinMaq = P05DG13_A2804RecLinMaq[0] ;
               A2392ProNumPro = P05DG13_A2392ProNumPro[0] ;
               A4697RecNroPrg = P05DG13_A4697RecNroPrg[0] ;
               A2393ProNumRec = P05DG13_A2393ProNumRec[0] ;
               A1251RecNumRec = P05DG13_A1251RecNumRec[0] ;
               A764ProForCod = P05DG13_A764ProForCod[0] ;
               A772ProForTmx = P05DG13_A772ProForTmx[0] ;
               A771ProForTie = P05DG13_A771ProForTie[0] ;
               A766ProForDsc = P05DG13_A766ProForDsc[0] ;
               A2392ProNumPro = P05DG13_A2392ProNumPro[0] ;
               A2393ProNumRec = P05DG13_A2393ProNumRec[0] ;
               A772ProForTmx = P05DG13_A772ProForTmx[0] ;
               A771ProForTie = P05DG13_A771ProForTie[0] ;
               A766ProForDsc = P05DG13_A766ProForDsc[0] ;
               AV322ProNumPro = A2392ProNumPro ;
               if ( A4697RecNroPrg > 0 )
               {
                  AV322ProNumPro = A4697RecNroPrg ;
               }
               AV323Pronumrec = A2393ProNumRec ;
               if ( A1251RecNumRec > 0 )
               {
                  AV323Pronumrec = A1251RecNumRec ;
               }
               AV321Proforcod = A764ProForCod ;
               h5DG0( false, 30) ;
               getPrinter().GxDrawRect(7, Gx_line+2, 796, Gx_line+28, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 22, Gx_line+7, 67, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 70, Gx_line+6, 352, Gx_line+25, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 436, Gx_line+7, 466, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV322ProNumPro), "ZZZZ9")), 631, Gx_line+7, 668, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Temp.:", ""), 470, Gx_line+7, 515, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV323Pronumrec), "ZZZZ9")), 750, Gx_line+7, 787, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9")), 519, Gx_line+7, 549, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV406Lit35, "")), 358, Gx_line+6, 432, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV407Lit36, "")), 553, Gx_line+6, 627, Gx_line+24, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV408Lit37, "")), 672, Gx_line+6, 746, Gx_line+24, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+30) ;
               if ( AV376ImpCabProductos == 0 )
               {
                  if ( AV453SegundaDesc == 0 )
                  {
                     if ( AV262Gavim == 0 )
                     {
                        h5DG0( false, 20) ;
                        getPrinter().GxDrawLine(14, Gx_line+17, 64, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(68, Gx_line+17, 285, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(403, Gx_line+17, 511, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(693, Gx_line+17, 797, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 291, Gx_line+1, 307, Gx_line+18, 1+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(290, Gx_line+17, 307, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(325, Gx_line+17, 400, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 336, Gx_line+0, 381, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV402Lit31, "")), 68, Gx_line+0, 258, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV404Lit33, "")), 445, Gx_line+0, 518, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV454Lit62, "")), 14, Gx_line+0, 64, Gx_line+17, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV405Lit34, "")), 577, Gx_line+0, 636, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV484lit999, "")), 693, Gx_line+2, 798, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Tq", ""), 309, Gx_line+1, 325, Gx_line+18, 1+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(309, Gx_line+17, 324, Gx_line+17, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+20) ;
                     }
                     else
                     {
                        h5DG0( false, 21) ;
                        getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 421, Gx_line+0, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV404Lit33, "")), 505, Gx_line+0, 578, Gx_line+16, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV405Lit34, "")), 615, Gx_line+0, 674, Gx_line+18, 1+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(177, Gx_line+18, 418, Gx_line+18, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(422, Gx_line+18, 491, Gx_line+18, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(496, Gx_line+18, 596, Gx_line+18, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(693, Gx_line+17, 797, Gx_line+17, 1, 0, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Produto / Descriçao", ""), 178, Gx_line+0, 318, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV484lit999, "")), 693, Gx_line+2, 798, Gx_line+16, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+21) ;
                     }
                  }
                  else
                  {
                     h5DG0( false, 20) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV454Lit62, "")), 14, Gx_line+0, 72, Gx_line+16, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(14, Gx_line+17, 72, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(78, Gx_line+17, 370, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV402Lit31, "")), 78, Gx_line+1, 268, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 377, Gx_line+1, 393, Gx_line+18, 1+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(376, Gx_line+17, 393, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Factor", ""), 409, Gx_line+2, 454, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(398, Gx_line+17, 467, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(693, Gx_line+17, 797, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV404Lit33, "")), 481, Gx_line+1, 554, Gx_line+17, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(474, Gx_line+17, 574, Gx_line+17, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV405Lit34, "")), 602, Gx_line+1, 661, Gx_line+19, 1+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(395, Gx_line+0, 395, Gx_line+20, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+20, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(372, Gx_line+0, 372, Gx_line+20, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV484lit999, "")), 693, Gx_line+3, 798, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+20) ;
                  }
                  AV376ImpCabProductos = (byte)(1) ;
               }
               /* Using cursor P05DG14 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A719PrdNum = P05DG14_A719PrdNum[0] ;
                  n719PrdNum = P05DG14_n719PrdNum[0] ;
                  A875RecPrdDsc = P05DG14_A875RecPrdDsc[0] ;
                  A872RecPrdNum = P05DG14_A872RecPrdNum[0] ;
                  A488ForPrdDsc = P05DG14_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05DG14_n488ForPrdDsc[0] ;
                  A490ForPrdUMe = P05DG14_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P05DG14_n490ForPrdUMe[0] ;
                  A686PrdCant = P05DG14_A686PrdCant[0] ;
                  A2394RecForNro = P05DG14_A2394RecForNro[0] ;
                  A3274RecPrdTnq = P05DG14_A3274RecPrdTnq[0] ;
                  A13937RecLotAlm = P05DG14_A13937RecLotAlm[0] ;
                  A5725RecLote = P05DG14_A5725RecLote[0] ;
                  A431FacCon = P05DG14_A431FacCon[0] ;
                  A1643PrdTip = P05DG14_A1643PrdTip[0] ;
                  A13968PrdCantAtM = P05DG14_A13968PrdCantAtM[0] ;
                  n13968PrdCantAtM = P05DG14_n13968PrdCantAtM[0] ;
                  A14055RecManAut = P05DG14_A14055RecManAut[0] ;
                  A12641RecPrdDc2 = P05DG14_A12641RecPrdDc2[0] ;
                  A811RecLin = P05DG14_A811RecLin[0] ;
                  A1643PrdTip = P05DG14_A1643PrdTip[0] ;
                  A13968PrdCantAtM = P05DG14_A13968PrdCantAtM[0] ;
                  n13968PrdCantAtM = P05DG14_n13968PrdCantAtM[0] ;
                  A488ForPrdDsc = P05DG14_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05DG14_n488ForPrdDsc[0] ;
                  AV462CodeBar1 = "*" + GXutil.padl( GXutil.trim( GXutil.str( A1273RecLinPro, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( A811RecLin, 4, 0)), (short)(4), "0") + "*" ;
                  AV463LineaProducto = A872RecPrdNum + " " + A875RecPrdDsc ;
                  AV459TipoProducto = ((GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "1")>=0)&&(GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "7")<=0) ? httpContext.getMessage( "C", "") : httpContext.getMessage( "P", "")) ;
                  AV375Und1 = GXutil.substring( A488ForPrdDsc, 1, 4) ;
                  AV358Unidades = ((A490ForPrdUMe==1) ? httpContext.getMessage( "gr/l", "") : ((A490ForPrdUMe==2) ? httpContext.getMessage( "cc/l", "") : httpContext.getMessage( "gr", ""))) ;
                  AV358Unidades = ((GXutil.strcmp(AV459TipoProducto, httpContext.getMessage( "C", ""))==0)&&(AV347Tinamar==1) ? httpContext.getMessage( "gr", "") : ((A686PrdCant.doubleValue()>=1000)&&((AV347Tinamar==1)||(AV250FlagImp==1))&&(A490ForPrdUMe==1) ? httpContext.getMessage( "kg", "") : ((A686PrdCant.doubleValue()>=1000)&&((AV347Tinamar==1)||(AV250FlagImp==1))&&(A490ForPrdUMe==2) ? httpContext.getMessage( "lt", "") : ((A686PrdCant.doubleValue()>=1000)&&((AV347Tinamar==1)||(AV250FlagImp==1))&&(A490ForPrdUMe==3) ? httpContext.getMessage( "kg", "") : ((A490ForPrdUMe==1) ? httpContext.getMessage( "gr", "") : ((A490ForPrdUMe==2) ? httpContext.getMessage( "cc", "") : ((A490ForPrdUMe==3) ? httpContext.getMessage( "gr", "") : ""))))))) ;
                  AV358Unidades = ((AV487undcaps==1) ? GXutil.upper( AV358Unidades) : AV358Unidades) ;
                  AV326RecForNro = ((0==A2394RecForNro) ? "" : GXutil.trim( GXutil.str( A2394RecForNro, 2, 0))) ;
                  AV486Tq = A3274RecPrdTnq ;
                  GXt_char1 = AV483AlmPrdDsc ;
                  GXv_char13[0] = A396EmprCod ;
                  GXv_int11[0] = A13937RecLotAlm ;
                  GXv_char12[0] = GXt_char1 ;
                  new app.palmprd(remoteHandle, context).execute( GXv_char13, GXv_int11, GXv_char12) ;
                  ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
                  ptintrecipe_impl.this.A13937RecLotAlm = GXv_int11[0] ;
                  ptintrecipe_impl.this.GXt_char1 = GXv_char12[0] ;
                  AV483AlmPrdDsc = GXt_char1 ;
                  AV483AlmPrdDsc = ((0==A13937RecLotAlm) ? "" : AV483AlmPrdDsc) ;
                  AV374Reclote = ((GXutil.strcmp("", AV483AlmPrdDsc)==0) ? GXutil.trim( A5725RecLote) : GXutil.trim( A5725RecLote)+"/"+GXutil.trim( AV483AlmPrdDsc)) ;
                  AV442Faccon = A431FacCon ;
                  AV433Cant = (((A686PrdCant.doubleValue()>=1000)&&(GXutil.strcmp(AV459TipoProducto, httpContext.getMessage( "P", ""))==0)&&(AV347Tinamar==1))||((A686PrdCant.doubleValue()>=1000)&&(AV250FlagImp==1)&&(AV347Tinamar==0)) ? A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) : A686PrdCant) ;
                  AV472MoA = ((GXutil.strcmp(A1643PrdTip, httpContext.getMessage( "M", ""))==0) ? httpContext.getMessage( "M", "") : httpContext.getMessage( "A", "")) ;
                  AV472MoA = ((AV469Carvitin==1)&&(A686PrdCant.doubleValue()<A13968PrdCantAtM)&&(A13968PrdCantAtM>0) ? httpContext.getMessage( "M", "") : AV472MoA) ;
                  AV472MoA = ((AV469Carvitin==1) ? A14055RecManAut : AV472MoA) ;
                  if ( (GXutil.strcmp("", A872RecPrdNum)==0) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 ) )
                  {
                     if ( AV453SegundaDesc == 0 )
                     {
                        if ( AV262Gavim == 0 )
                        {
                           h5DG0( false, 18) ;
                           getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 69, Gx_line+0, 287, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                        }
                        else
                        {
                           h5DG0( false, 18) ;
                           getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 177, Gx_line+0, 395, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+18) ;
                        }
                     }
                     else
                     {
                        h5DG0( false, 18) ;
                        getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 69, Gx_line+0, 260, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawLine(395, Gx_line+0, 395, Gx_line+18, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+18, 1, 0, 0, 0, 0) ;
                        getPrinter().GxDrawLine(372, Gx_line+0, 372, Gx_line+18, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+18) ;
                     }
                  }
                  else
                  {
                     if ( AV453SegundaDesc == 1 )
                     {
                        if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") == 0 ) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "9") == 0 ) )
                        {
                           h5DG0( false, 20) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 14, Gx_line+2, 59, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12641RecPrdDc2, "")), 78, Gx_line+2, 371, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV326RecForNro, "")), 375, Gx_line+2, 392, Gx_line+19, 1, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 398, Gx_line+4, 446, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 447, Gx_line+4, 469, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 693, Gx_line+3, 814, Gx_line+17, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 472, Gx_line+2, 568, Gx_line+19, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 568, Gx_line+2, 584, Gx_line+19, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawRect(583, Gx_line+1, 686, Gx_line+19, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+19, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(616, Gx_line+1, 616, Gx_line+19, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(395, Gx_line+0, 395, Gx_line+20, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+20, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(372, Gx_line+0, 372, Gx_line+20, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+20) ;
                        }
                        else
                        {
                           h5DG0( false, 20) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 14, Gx_line+2, 59, Gx_line+20, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A12641RecPrdDc2, "")), 78, Gx_line+2, 371, Gx_line+20, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV326RecForNro, "")), 375, Gx_line+2, 392, Gx_line+19, 1, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 398, Gx_line+4, 446, Gx_line+18, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 447, Gx_line+4, 469, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 693, Gx_line+4, 814, Gx_line+18, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 472, Gx_line+2, 568, Gx_line+20, 2+256, 0, 0, 0) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 568, Gx_line+2, 584, Gx_line+20, 0+256, 0, 0, 0) ;
                           getPrinter().GxDrawRect(583, Gx_line+1, 686, Gx_line+19, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+19, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(616, Gx_line+1, 616, Gx_line+19, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(395, Gx_line+0, 395, Gx_line+20, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+20, 1, 0, 0, 0, 0) ;
                           getPrinter().GxDrawLine(372, Gx_line+0, 372, Gx_line+20, 1, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+20) ;
                        }
                     }
                     else
                     {
                        if ( ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "8") == 0 ) || ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), "9") == 0 ) )
                        {
                           if ( AV262Gavim == 0 )
                           {
                              if ( AV471textoManual == 0 )
                              {
                                 h5DG0( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 68, Gx_line+0, 286, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 14, Gx_line+0, 65, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 403, Gx_line+0, 512, Gx_line+18, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 514, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 693, Gx_line+3, 814, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV326RecForNro, "")), 290, Gx_line+0, 307, Gx_line+17, 1, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(540, Gx_line+0, 683, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(585, Gx_line+0, 585, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(630, Gx_line+0, 630, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 327, Gx_line+2, 375, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 379, Gx_line+2, 401, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV486Tq), "ZZ")), 309, Gx_line+0, 325, Gx_line+18, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                              else
                              {
                                 h5DG0( false, 19) ;
                                 getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 69, Gx_line+0, 287, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 15, Gx_line+0, 66, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 403, Gx_line+0, 512, Gx_line+18, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 514, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 694, Gx_line+3, 815, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV326RecForNro, "")), 290, Gx_line+0, 307, Gx_line+17, 1, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 328, Gx_line+2, 376, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 380, Gx_line+2, 402, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV472MoA, "")), 532, Gx_line+0, 542, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(561, Gx_line+0, 684, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(605, Gx_line+0, 605, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(649, Gx_line+0, 649, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV486Tq), "ZZ")), 309, Gx_line+0, 325, Gx_line+18, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+19) ;
                              }
                           }
                           else
                           {
                              h5DG0( false, 33) ;
                              getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 420, Gx_line+8, 468, Gx_line+22, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 469, Gx_line+8, 491, Gx_line+22, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 492, Gx_line+6, 588, Gx_line+23, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 589, Gx_line+6, 605, Gx_line+23, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 693, Gx_line+8, 814, Gx_line+22, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawRect(609, Gx_line+5, 689, Gx_line+23, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV462CodeBar1, "")), 15, Gx_line+4, 174, Gx_line+30, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV463LineaProducto, "")), 177, Gx_line+6, 419, Gx_line+23, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawLine(651, Gx_line+6, 651, Gx_line+24, 1, 0, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+33) ;
                           }
                        }
                        else
                        {
                           if ( AV262Gavim == 0 )
                           {
                              if ( AV471textoManual == 0 )
                              {
                                 h5DG0( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 14, Gx_line+0, 65, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 68, Gx_line+0, 286, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV326RecForNro, "")), 290, Gx_line+0, 307, Gx_line+17, 1, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 327, Gx_line+2, 375, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 379, Gx_line+2, 401, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 403, Gx_line+0, 512, Gx_line+18, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 514, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 693, Gx_line+3, 814, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(540, Gx_line+0, 683, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(585, Gx_line+0, 585, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(630, Gx_line+0, 630, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV486Tq), "ZZ")), 309, Gx_line+0, 325, Gx_line+18, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                              else
                              {
                                 h5DG0( false, 19) ;
                                 getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 15, Gx_line+0, 66, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 69, Gx_line+0, 287, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV326RecForNro, "")), 290, Gx_line+0, 307, Gx_line+17, 1, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 328, Gx_line+2, 376, Gx_line+16, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 380, Gx_line+2, 402, Gx_line+16, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 403, Gx_line+0, 512, Gx_line+18, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 514, Gx_line+0, 532, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 694, Gx_line+3, 815, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV472MoA, "")), 533, Gx_line+0, 543, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(561, Gx_line+0, 684, Gx_line+18, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(605, Gx_line+0, 605, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(649, Gx_line+0, 649, Gx_line+18, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV486Tq), "ZZ")), 309, Gx_line+0, 325, Gx_line+18, 2+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+19) ;
                              }
                           }
                           else
                           {
                              h5DG0( false, 33) ;
                              getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV442Faccon, "ZZZ.ZZZZZ")), 420, Gx_line+8, 468, Gx_line+22, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV375Und1, "")), 469, Gx_line+8, 491, Gx_line+22, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV433Cant, "Z,ZZZ,ZZ9.999")), 492, Gx_line+6, 588, Gx_line+24, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV358Unidades, "")), 589, Gx_line+6, 605, Gx_line+24, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374Reclote, "")), 693, Gx_line+8, 814, Gx_line+22, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawRect(609, Gx_line+5, 689, Gx_line+23, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                              getPrinter().GxDrawLine(651, Gx_line+5, 651, Gx_line+23, 1, 0, 0, 0, 0) ;
                              getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV462CodeBar1, "")), 15, Gx_line+4, 174, Gx_line+30, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Courier New", 9, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV463LineaProducto, "")), 177, Gx_line+6, 419, Gx_line+24, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+33) ;
                           }
                        }
                     }
                  }
                  pr_default.readNext(9);
               }
               pr_default.close(9);
               pr_default.readNext(8);
            }
            pr_default.close(8);
            AV253FlagObs = (byte)(0) ;
            /* Using cursor P05DG15 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A5258RecTxtObs = P05DG15_A5258RecTxtObs[0] ;
               n5258RecTxtObs = P05DG15_n5258RecTxtObs[0] ;
               A5257RecLinObs = P05DG15_A5257RecLinObs[0] ;
               if ( AV253FlagObs == 0 )
               {
                  AV253FlagObs = (byte)(1) ;
                  h5DG0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5258RecTxtObs, "")), 130, Gx_line+0, 569, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV409Lit38, "")), 14, Gx_line+0, 124, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               else
               {
                  h5DG0( false, 19) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5258RecTxtObs, "")), 130, Gx_line+2, 569, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
               }
               pr_default.readNext(10);
            }
            pr_default.close(10);
            if ( AV489acabats == 1 )
            {
               /* Execute user subroutine: 'OBSERVACIONESCOLOR' */
               S211 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  pr_default.close(6);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
         GxHdr8 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5DG0( true, 0) ;
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
      /* 'AGRUPADAS' Routine */
      returnInSub = false ;
      AV242Flag_Agr = (byte)(0) ;
      AV314NumHdrs = (short)(1) ;
      AV307NMaxAg = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P05DG16 */
      pr_default.execute(11, new Object[] {AV239EmprCod, Integer.valueOf(AV177BarCod), Byte.valueOf(AV179BarCodReo), AV178BarCodPar});
      cV307NMaxAg = P05DG16_AV307NMaxAg[0] ;
      pr_default.close(11);
      AV307NMaxAg = (short)(AV307NMaxAg+cV307NMaxAg*1) ;
      /* End optimized group. */
      /* Using cursor P05DG17 */
      pr_default.execute(12, new Object[] {AV239EmprCod, Integer.valueOf(AV177BarCod), Byte.valueOf(AV179BarCodReo), AV178BarCodPar});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A130BarCodPar = P05DG17_A130BarCodPar[0] ;
         A132BarCodReo = P05DG17_A132BarCodReo[0] ;
         A129BarCod = P05DG17_A129BarCod[0] ;
         A396EmprCod = P05DG17_A396EmprCod[0] ;
         A590KgmAgr = P05DG17_A590KgmAgr[0] ;
         A122BarAgrPar = P05DG17_A122BarAgrPar[0] ;
         A124BarAgrReo = P05DG17_A124BarAgrReo[0] ;
         A119BarAgrCod = P05DG17_A119BarAgrCod[0] ;
         A1508CliCodAgr = P05DG17_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P05DG17_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P05DG17_A1245BarAgrSer[0] ;
         A869MtrAgr = P05DG17_A869MtrAgr[0] ;
         A671PieAgr = P05DG17_A671PieAgr[0] ;
         AV265Hdr_a = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         GXv_char13[0] = AV208CliNom_a ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A1508CliCodAgr, GXv_char13) ;
         ptintrecipe_impl.this.AV208CliNom_a = GXv_char13[0] ;
         AV208CliNom_a = GXutil.substring( AV208CliNom_a, 1, 20) ;
         AV166Agrdsc = ((AV336Serzedelo==1) ? A1245BarAgrSer : A1507BarAgrDsc) ;
         AV305MtrAgr = ((AV336Serzedelo==1) ? DecimalUtil.doubleToDec(A671PieAgr) : A869MtrAgr) ;
         AV421Lit49 = ((AV336Serzedelo==1) ? httpContext.getMessage( "Bobinas", "") : AV421Lit49) ;
         if ( AV279JPF == 1 )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_int3[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char12[0] = A122BarAgrPar ;
            GXv_char10[0] = AV176BarCal ;
            new app.pmetpie(remoteHandle, context).execute( GXv_char13, GXv_int3, GXv_int6, GXv_char12, GXv_char10) ;
            ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
            ptintrecipe_impl.this.A119BarAgrCod = GXv_int3[0] ;
            ptintrecipe_impl.this.A124BarAgrReo = GXv_int6[0] ;
            ptintrecipe_impl.this.A122BarAgrPar = GXv_char12[0] ;
            ptintrecipe_impl.this.AV176BarCal = GXv_char10[0] ;
         }
         AV287Litpda = "" ;
         AV190Barpart = (short)(0) ;
         if ( ( AV304Moda21 == 1 ) || ( AV262Gavim == 1 ) )
         {
            AV287Litpda = httpContext.getMessage( "Partida", "") ;
            GXv_char13[0] = A396EmprCod ;
            GXv_int3[0] = A119BarAgrCod ;
            GXv_int6[0] = A124BarAgrReo ;
            GXv_char12[0] = A122BarAgrPar ;
            GXv_int11[0] = AV190Barpart ;
            new app.ppdamd21(remoteHandle, context).execute( GXv_char13, GXv_int3, GXv_int6, GXv_char12, GXv_int11) ;
            ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
            ptintrecipe_impl.this.A119BarAgrCod = GXv_int3[0] ;
            ptintrecipe_impl.this.A124BarAgrReo = GXv_int6[0] ;
            ptintrecipe_impl.this.A122BarAgrPar = GXv_char12[0] ;
            ptintrecipe_impl.this.AV190Barpart = GXv_int11[0] ;
         }
         GXv_char13[0] = A396EmprCod ;
         GXv_int3[0] = A119BarAgrCod ;
         GXv_int6[0] = A124BarAgrReo ;
         GXv_char12[0] = A122BarAgrPar ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char10[0] = "" ;
         GXv_int16[0] = AV325Reccod ;
         GXv_char9[0] = AV289LocAlbr ;
         GXv_int17[0] = 0 ;
         new app.pinfagralbrec(remoteHandle, context).execute( GXv_char13, GXv_int3, GXv_int6, GXv_char12, GXv_decimal15, GXv_char10, GXv_int16, GXv_char9, GXv_int17) ;
         ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
         ptintrecipe_impl.this.A119BarAgrCod = GXv_int3[0] ;
         ptintrecipe_impl.this.A124BarAgrReo = GXv_int6[0] ;
         ptintrecipe_impl.this.A122BarAgrPar = GXv_char12[0] ;
         ptintrecipe_impl.this.AV325Reccod = GXv_int16[0] ;
         ptintrecipe_impl.this.AV289LocAlbr = GXv_char9[0] ;
         GXv_char13[0] = A396EmprCod ;
         GXv_int17[0] = A119BarAgrCod ;
         GXv_int6[0] = A124BarAgrReo ;
         GXv_char12[0] = A122BarAgrPar ;
         GXv_decimal15[0] = AV443BarKgmAgr ;
         GXv_decimal14[0] = AV444BarMtrAgr ;
         GXv_int16[0] = AV445BarPieagr ;
         GXv_char10[0] = AV446BarAgrSer ;
         GXv_char9[0] = AV447Barcolnomagr ;
         GXv_int3[0] = 0 ;
         GXv_int18[0] = (byte)(0) ;
         GXv_char8[0] = "" ;
         GXv_date19[0] = AV448fec1 ;
         GXv_int20[0] = (byte)(0) ;
         GXv_char7[0] = "" ;
         GXv_char5[0] = "" ;
         GXv_int21[0] = 0 ;
         GXv_date22[0] = AV449fec2 ;
         GXv_char2[0] = "" ;
         GXv_char23[0] = AV450barserdscAgr ;
         GXv_int24[0] = 0 ;
         GXv_date25[0] = AV451fec3 ;
         GXv_char26[0] = "" ;
         new app.pinfagr(remoteHandle, context).execute( GXv_char13, GXv_int17, GXv_int6, GXv_char12, GXv_decimal15, GXv_decimal14, GXv_int16, GXv_char10, GXv_char9, GXv_int3, GXv_int18, GXv_char8, GXv_date19, GXv_int20, GXv_char7, GXv_char5, GXv_int21, GXv_date22, GXv_char2, GXv_char23, GXv_int24, GXv_date25, GXv_char26) ;
         ptintrecipe_impl.this.A396EmprCod = GXv_char13[0] ;
         ptintrecipe_impl.this.A119BarAgrCod = GXv_int17[0] ;
         ptintrecipe_impl.this.A124BarAgrReo = GXv_int6[0] ;
         ptintrecipe_impl.this.A122BarAgrPar = GXv_char12[0] ;
         ptintrecipe_impl.this.AV443BarKgmAgr = GXv_decimal15[0] ;
         ptintrecipe_impl.this.AV444BarMtrAgr = GXv_decimal14[0] ;
         ptintrecipe_impl.this.AV445BarPieagr = GXv_int16[0] ;
         ptintrecipe_impl.this.AV446BarAgrSer = GXv_char10[0] ;
         ptintrecipe_impl.this.AV447Barcolnomagr = GXv_char9[0] ;
         ptintrecipe_impl.this.AV448fec1 = GXv_date19[0] ;
         ptintrecipe_impl.this.AV449fec2 = GXv_date22[0] ;
         ptintrecipe_impl.this.AV450barserdscAgr = GXv_char23[0] ;
         ptintrecipe_impl.this.AV451fec3 = GXv_date25[0] ;
         if ( AV242Flag_Agr == 0 )
         {
            AV242Flag_Agr = (byte)(1) ;
            h5DG0( false, 36) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 129, Gx_line+17, 181, Gx_line+34, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(22, Gx_line+33, 118, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(127, Gx_line+33, 273, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(278, Gx_line+33, 468, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(472, Gx_line+33, 567, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(584, Gx_line+33, 650, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(654, Gx_line+33, 727, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(738, Gx_line+33, 782, Gx_line+33, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV415Lit43, "")), 22, Gx_line+0, 176, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV410Lit39, "")), 22, Gx_line+17, 118, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV413Lit41, "")), 278, Gx_line+17, 469, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV381Lit12, "")), 472, Gx_line+17, 546, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV414Lit42, "")), 606, Gx_line+17, 651, Gx_line+35, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV421Lit49, "")), 654, Gx_line+17, 728, Gx_line+35, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV458Lit66, "")), 738, Gx_line+17, 783, Gx_line+35, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
         }
         h5DG0( false, 17) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV265Hdr_a, "")), 22, Gx_line+0, 103, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV450barserdscAgr, "")), 278, Gx_line+0, 469, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV208CliNom_a, "")), 127, Gx_line+0, 274, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV443BarKgmAgr, "ZZZZZ9.99")), 584, Gx_line+0, 651, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV444BarMtrAgr, "ZZZZZ9.99")), 661, Gx_line+0, 728, Gx_line+17, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV447Barcolnomagr, "")), 472, Gx_line+0, 568, Gx_line+17, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV445BarPieagr), "ZZZZZ9")), 738, Gx_line+0, 783, Gx_line+17, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV314NumHdrs = (short)(AV314NumHdrs+1) ;
         pr_default.readNext(12);
      }
      pr_default.close(12);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'INICIAR' Routine */
      returnInSub = false ;
      AV271Imp_agrup = (byte)(0) ;
      GXt_int27 = AV340Tejido ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV340Tejido = GXt_int27 ;
      GXt_int27 = AV279JPF ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "JPF", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV279JPF = GXt_int27 ;
      GXt_int27 = AV337Sin_dec ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "SINDEC", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV337Sin_dec = GXt_int27 ;
      GXv_int20[0] = AV249Flagidioma ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, "100001", GXv_int20) ;
      ptintrecipe_impl.this.AV249Flagidioma = GXv_int20[0] ;
      GXt_int27 = AV201Carvema ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV201Carvema = GXt_int27 ;
      GXt_int27 = AV240erfoc ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV240erfoc = GXt_int27 ;
      GXt_int27 = AV273ImpLote ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV273ImpLote = GXt_int27 ;
      GXv_int20[0] = AV241Flag ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, "030800", GXv_int20) ;
      ptintrecipe_impl.this.AV241Flag = GXv_int20[0] ;
      GXv_int20[0] = AV250FlagImp ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, "100000", GXv_int20) ;
      ptintrecipe_impl.this.AV250FlagImp = GXv_int20[0] ;
      GXv_int20[0] = AV243FlagBar ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, "100007", GXv_int20) ;
      ptintrecipe_impl.this.AV243FlagBar = GXv_int20[0] ;
      GXv_int20[0] = AV245FlagCod ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, "100009", GXv_int20) ;
      ptintrecipe_impl.this.AV245FlagCod = GXv_int20[0] ;
      GXv_int20[0] = AV248FlagEtm ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "ETM", ""), GXv_int20) ;
      ptintrecipe_impl.this.AV248FlagEtm = GXv_int20[0] ;
      GXv_int20[0] = AV252FlagNline ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "NOLINE", ""), GXv_int20) ;
      ptintrecipe_impl.this.AV252FlagNline = GXv_int20[0] ;
      GXv_char26[0] = AV220ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "RECPZA", ""), GXv_char26) ;
      ptintrecipe_impl.this.AV220ContDsc = GXv_char26[0] ;
      GXv_int20[0] = AV255FlagTtx ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "TINTEX", ""), GXv_int20) ;
      ptintrecipe_impl.this.AV255FlagTtx = GXv_int20[0] ;
      GXv_int20[0] = AV274indutexma ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int20) ;
      ptintrecipe_impl.this.AV274indutexma = GXv_int20[0] ;
      GXv_int20[0] = AV247FlagEnd ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int20) ;
      ptintrecipe_impl.this.AV247FlagEnd = GXv_int20[0] ;
      GXv_int20[0] = AV324RecAca ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "RECACA", ""), GXv_int20) ;
      ptintrecipe_impl.this.AV324RecAca = GXv_int20[0] ;
      GXt_int27 = AV336Serzedelo ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "SERZED", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV336Serzedelo = GXt_int27 ;
      GXt_int27 = AV210Code128 ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "COD128", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV210Code128 = GXt_int27 ;
      GXt_int27 = AV304Moda21 ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV304Moda21 = GXt_int27 ;
      GXt_int28 = AV303MaxAgr ;
      GXv_char26[0] = AV239EmprCod ;
      GXv_char23[0] = httpContext.getMessage( "MAXAGR", "") ;
      GXv_int24[0] = GXt_int28 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char26, GXv_char23, GXv_int24) ;
      ptintrecipe_impl.this.AV239EmprCod = GXv_char26[0] ;
      ptintrecipe_impl.this.GXt_int28 = GXv_int24[0] ;
      AV303MaxAgr = (byte)(GXt_int28) ;
      GXt_int27 = AV171Artemalha ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV171Artemalha = GXt_int27 ;
      GXt_int27 = AV290Lote01 ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "01LOTE", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV290Lote01 = GXt_int27 ;
      GXt_int27 = AV347Tinamar ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV347Tinamar = GXt_int27 ;
      GXt_int27 = AV262Gavim ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "GAVIM", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV262Gavim = GXt_int27 ;
      GXt_int27 = AV453SegundaDesc ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "2DESC", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV453SegundaDesc = GXt_int27 ;
      AV303MaxAgr = (byte)(((AV303MaxAgr==0) ? 10 : AV303MaxAgr)) ;
      GXt_int27 = AV468normasintegridad ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "STDNOR", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV468normasintegridad = GXt_int27 ;
      GXt_int27 = AV479acabats2013 ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "PSHD00", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV479acabats2013 = GXt_int27 ;
      GXt_int27 = AV489acabats ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV489acabats = GXt_int27 ;
      AV361Var3 = " " ;
      if ( AV249Flagidioma == 1 )
      {
         AV361Var3 = httpContext.getMessage( "Processado por Computador", "") ;
      }
      GXt_char1 = AV377Lit0 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN045", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV377Lit0 = GXt_char1 ;
      GXt_char1 = AV400Lit3 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN674_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV400Lit3 = GXt_char1 ;
      GXt_char1 = AV411Lit4 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV411Lit4 = GXt_char1 ;
      GXt_char1 = AV422Lit5 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1211_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV422Lit5 = GXt_char1 ;
      GXt_char1 = AV427Lit6 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV427Lit6 = GXt_char1 ;
      GXt_char1 = AV429Lit7 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV429Lit7 = GXt_char1 ;
      GXt_char1 = AV430Lit8 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV430Lit8 = GXt_char1 ;
      GXt_char1 = AV431Lit9 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV431Lit9 = GXt_char1 ;
      GXt_char1 = AV379Lit10 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV379Lit10 = GXt_char1 ;
      GXt_char1 = AV380Lit11 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1127_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV380Lit11 = GXt_char1 ;
      GXt_char1 = AV381Lit12 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV381Lit12 = GXt_char1 ;
      GXt_char1 = AV382Lit13 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV382Lit13 = GXt_char1 ;
      GXt_char1 = AV383Lit14 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV383Lit14 = GXt_char1 ;
      GXt_char1 = AV384Lit15 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV384Lit15 = GXt_char1 ;
      GXt_char1 = AV385Lit16 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2205_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV385Lit16 = GXt_char1 ;
      GXt_char1 = AV386Lit17 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN416_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV386Lit17 = GXt_char1 ;
      GXt_char1 = AV387Lit18 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1022_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV387Lit18 = GXt_char1 ;
      GXt_char1 = AV388Lit19 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV388Lit19 = GXt_char1 ;
      GXt_char1 = AV390Lit20 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2396_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV390Lit20 = GXt_char1 ;
      GXt_char1 = AV391Lit21 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV391Lit21 = GXt_char1 ;
      GXt_char1 = AV392Lit22 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV392Lit22 = GXt_char1 ;
      GXt_char1 = AV393Lit23 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV393Lit23 = GXt_char1 ;
      GXt_char1 = AV394Lit24 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV394Lit24 = GXt_char1 ;
      GXt_char1 = AV395Lit25 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV395Lit25 = GXt_char1 ;
      GXt_char1 = AV396Lit26 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1663_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV396Lit26 = GXt_char1 ;
      GXt_char1 = AV397Lit27 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3003_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV397Lit27 = GXt_char1 ;
      GXt_char1 = AV398Lit28 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1373_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV398Lit28 = GXt_char1 ;
      GXt_char1 = AV399Lit29 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV399Lit29 = GXt_char1 ;
      GXt_char1 = AV401Lit30 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV401Lit30 = GXt_char1 ;
      GXt_char1 = AV402Lit31 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV402Lit31 = GXt_char1 ;
      GXt_char1 = AV403Lit32 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2470_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV403Lit32 = GXt_char1 ;
      GXt_char1 = AV404Lit33 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV404Lit33 = GXt_char1 ;
      GXt_char1 = AV405Lit34 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN352_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV405Lit34 = GXt_char1 ;
      GXt_char1 = AV406Lit35 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV406Lit35 = GXt_char1 ;
      GXt_char1 = AV407Lit36 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV407Lit36 = GXt_char1 ;
      GXt_char1 = AV408Lit37 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT108_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV408Lit37 = GXt_char1 ;
      GXt_char1 = AV409Lit38 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV409Lit38 = GXt_char1 ;
      GXt_char1 = AV410Lit39 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV410Lit39 = GXt_char1 ;
      GXt_char1 = AV412Lit40 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV412Lit40 = GXt_char1 ;
      GXt_char1 = AV413Lit41 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV413Lit41 = GXt_char1 ;
      GXt_char1 = AV414Lit42 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV414Lit42 = GXt_char1 ;
      GXt_char1 = AV415Lit43 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV415Lit43 = GXt_char1 ;
      GXt_char1 = AV417Lit45 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT188_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV417Lit45 = GXt_char1 ;
      GXt_char1 = AV418Lit46 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN209_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV418Lit46 = GXt_char1 ;
      GXt_char1 = AV419Lit47 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV419Lit47 = GXt_char1 ;
      GXt_char1 = AV420Lit48 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2028_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV420Lit48 = GXt_char1 ;
      GXt_char1 = AV421Lit49 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV421Lit49 = GXt_char1 ;
      AV423Lit50 = httpContext.getMessage( "Gr/m2", "") ;
      GXt_char1 = AV424Lit51 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV424Lit51 = GXt_char1 ;
      GXt_char1 = AV425Lit52 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV425Lit52 = GXt_char1 ;
      AV426Lit53 = httpContext.getMessage( "Modelo", "") ;
      AV428Lit60 = ((AV304Moda21==1)||(AV240erfoc==1)||(AV201Carvema==1)||(AV290Lote01==1) ? httpContext.getMessage( "Lote", "") : httpContext.getMessage( "Tq", "")) ;
      GXt_char1 = AV454Lit62 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV454Lit62 = GXt_char1 ;
      GXt_char1 = AV455Lit63 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV455Lit63 = GXt_char1 ;
      GXt_char1 = AV456Lit64 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGLR188_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV456Lit64 = GXt_char1 ;
      AV457Lit65 = GXutil.trim( AV455Lit63) + " " + GXutil.trim( AV456Lit64) ;
      GXt_char1 = AV458Lit66 ;
      GXv_char26[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char26) ;
      ptintrecipe_impl.this.GXt_char1 = GXv_char26[0] ;
      AV458Lit66 = GXt_char1 ;
      GXt_int27 = AV469Carvitin ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV469Carvitin = GXt_int27 ;
      GXt_int27 = AV471textoManual ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "TXTMAN", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV471textoManual = GXt_int27 ;
      GXt_int27 = AV487undcaps ;
      GXv_int20[0] = GXt_int27 ;
      new app.pexicon(remoteHandle, context).execute( AV239EmprCod, httpContext.getMessage( "UNDCAP", ""), GXv_int20) ;
      ptintrecipe_impl.this.GXt_int27 = GXv_int20[0] ;
      AV487undcaps = GXt_int27 ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      AV237DSCCAUSA = "" ;
      AV343Texto_r = "" ;
      /* Using cursor P05DG18 */
      pr_default.execute(13, new Object[] {AV239EmprCod, Integer.valueOf(AV177BarCod), Byte.valueOf(AV179BarCodReo), AV178BarCodPar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A833TipDefCod = P05DG18_A833TipDefCod[0] ;
         A5085CodCausa = P05DG18_A5085CodCausa[0] ;
         n5085CodCausa = P05DG18_n5085CodCausa[0] ;
         A544HisCodPar = P05DG18_A544HisCodPar[0] ;
         A545HisCodReo = P05DG18_A545HisCodReo[0] ;
         A539HisBarCod = P05DG18_A539HisBarCod[0] ;
         A396EmprCod = P05DG18_A396EmprCod[0] ;
         A5086DscCausa = P05DG18_A5086DscCausa[0] ;
         n5086DscCausa = P05DG18_n5086DscCausa[0] ;
         A834TipDefDsc = P05DG18_A834TipDefDsc[0] ;
         n834TipDefDsc = P05DG18_n834TipDefDsc[0] ;
         A834TipDefDsc = P05DG18_A834TipDefDsc[0] ;
         n834TipDefDsc = P05DG18_n834TipDefDsc[0] ;
         A5086DscCausa = P05DG18_A5086DscCausa[0] ;
         n5086DscCausa = P05DG18_n5086DscCausa[0] ;
         AV237DSCCAUSA = GXutil.substring( A5086DscCausa, 1, 30) ;
         AV343Texto_r = GXutil.substring( A834TipDefDsc, 1, 15) ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV173ArtObslon = " " ;
      /* Using cursor P05DG19 */
      pr_default.execute(14, new Object[] {AV239EmprCod, Integer.valueOf(AV203CliCod), AV260ForSer});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A3072ArtObsLon = P05DG19_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P05DG19_n3072ArtObsLon[0] ;
         A65ArtCod = P05DG19_A65ArtCod[0] ;
         A252CliCod = P05DG19_A252CliCod[0] ;
         n252CliCod = P05DG19_n252CliCod[0] ;
         A396EmprCod = P05DG19_A396EmprCod[0] ;
         AV173ArtObslon = A3072ArtObsLon ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOTES' Routine */
      returnInSub = false ;
      if ( AV240erfoc == 1 )
      {
         GXv_char26[0] = AV239EmprCod ;
         GXv_int24[0] = AV177BarCod ;
         GXv_int20[0] = AV179BarCodReo ;
         GXv_char23[0] = AV178BarCodPar ;
         GXv_int11[0] = AV291lotes ;
         new app.pprec001(remoteHandle, context).execute( GXv_char26, GXv_int24, GXv_int20, GXv_char23, AV169AlbRLote, GXv_int11) ;
         ptintrecipe_impl.this.AV239EmprCod = GXv_char26[0] ;
         ptintrecipe_impl.this.AV177BarCod = GXv_int24[0] ;
         ptintrecipe_impl.this.AV179BarCodReo = GXv_int20[0] ;
         ptintrecipe_impl.this.AV178BarCodPar = GXv_char23[0] ;
         ptintrecipe_impl.this.AV291lotes = (byte)((byte)(GXv_int11[0])) ;
      }
      if ( ( AV201Carvema == 1 ) || ( AV247FlagEnd == 1 ) )
      {
         GXv_char26[0] = AV239EmprCod ;
         GXv_int24[0] = AV177BarCod ;
         GXv_int20[0] = AV179BarCodReo ;
         GXv_char23[0] = AV178BarCodPar ;
         GXv_char13[0] = AV168Albrloc ;
         GXv_char12[0] = AV288Loc ;
         GXv_int21[0] = AV167Albreccod ;
         new app.pprec002(remoteHandle, context).execute( GXv_char26, GXv_int24, GXv_int20, GXv_char23, GXv_char13, GXv_char12, GXv_int21) ;
         ptintrecipe_impl.this.AV239EmprCod = GXv_char26[0] ;
         ptintrecipe_impl.this.AV177BarCod = GXv_int24[0] ;
         ptintrecipe_impl.this.AV179BarCodReo = GXv_int20[0] ;
         ptintrecipe_impl.this.AV178BarCodPar = GXv_char23[0] ;
         ptintrecipe_impl.this.AV168Albrloc = GXv_char13[0] ;
         ptintrecipe_impl.this.AV288Loc = GXv_char12[0] ;
         ptintrecipe_impl.this.AV167Albreccod = GXv_int21[0] ;
         AV432Lit99 = httpContext.getMessage( "Local.", "") ;
      }
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV236Dosea = 0 ;
      /* Using cursor P05DG20 */
      pr_default.execute(15, new Object[] {AV239EmprCod, AV299MaqCod});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A602MaqCod = P05DG20_A602MaqCod[0] ;
         A396EmprCod = P05DG20_A396EmprCod[0] ;
         A5950MaqDteCol = P05DG20_A5950MaqDteCol[0] ;
         n5950MaqDteCol = P05DG20_n5950MaqDteCol[0] ;
         AV236Dosea = A5950MaqDteCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'DESCMAQ' Routine */
      returnInSub = false ;
      AV310NTubos = (byte)(0) ;
      /* Using cursor P05DG21 */
      pr_default.execute(16, new Object[] {AV239EmprCod, AV186BarMaqCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A602MaqCod = P05DG21_A602MaqCod[0] ;
         A396EmprCod = P05DG21_A396EmprCod[0] ;
         A606MaqDsc = P05DG21_A606MaqDsc[0] ;
         n606MaqDsc = P05DG21_n606MaqDsc[0] ;
         A2391MaqMicro = P05DG21_A2391MaqMicro[0] ;
         n2391MaqMicro = P05DG21_n2391MaqMicro[0] ;
         A3598MaqNroTub = P05DG21_A3598MaqNroTub[0] ;
         n3598MaqNroTub = P05DG21_n3598MaqNroTub[0] ;
         AV229DescMaq = A606MaqDsc ;
         AV300MaqMicro = A2391MaqMicro ;
         AV312NumCam = A2391MaqMicro ;
         AV310NTubos = A3598MaqNroTub ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P05DG22 */
      pr_default.execute(17, new Object[] {AV467Cod_Idtx});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A10887Cod_Idtx = P05DG22_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P05DG22_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P05DG22_n10888Dsc_Idtx[0] ;
         A396EmprCod = P05DG22_A396EmprCod[0] ;
         AV282Lenvar = (short)(GXutil.len( GXutil.trim( A10888Dsc_Idtx))) ;
         AV466Dsc_Idtx = GXutil.trim( GXutil.substring( A10888Dsc_Idtx, 1, AV282Lenvar)) ;
         pr_default.readNext(17);
      }
      pr_default.close(17);
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'GOTSGRSOCS' Routine */
      returnInSub = false ;
      AV474statusgots = " " ;
      AV477statusgrs = " " ;
      AV478statusocs = " " ;
      /* Using cursor P05DG23 */
      pr_default.execute(18, new Object[] {AV239EmprCod, Integer.valueOf(AV476DisCod)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A361DisCod = P05DG23_A361DisCod[0] ;
         A396EmprCod = P05DG23_A396EmprCod[0] ;
         A13214DisNormSt = P05DG23_A13214DisNormSt[0] ;
         A13213DisNormID = P05DG23_A13213DisNormID[0] ;
         if ( GXutil.strcmp(A13213DisNormID, httpContext.getMessage( "GOTS", "")) == 0 )
         {
            AV474statusgots = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
         }
         else if ( GXutil.strcmp(A13213DisNormID, httpContext.getMessage( "GRS ", "")) == 0 )
         {
            AV477statusgrs = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
         }
         else if ( GXutil.strcmp(A13213DisNormID, httpContext.getMessage( "OCS ", "")) == 0 )
         {
            AV478statusocs = ((GXutil.strcmp(A13214DisNormSt, httpContext.getMessage( "S", ""))==0) ? httpContext.getMessage( "SIM", "") : httpContext.getMessage( "NÃO", "")) ;
         }
         pr_default.readNext(18);
      }
      pr_default.close(18);
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'NORMAS' Routine */
      returnInSub = false ;
      AV475Normas = "" ;
      /* Using cursor P05DG24 */
      pr_default.execute(19, new Object[] {AV239EmprCod, Integer.valueOf(AV476DisCod)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A361DisCod = P05DG24_A361DisCod[0] ;
         A396EmprCod = P05DG24_A396EmprCod[0] ;
         A13216DisNormDsc = P05DG24_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P05DG24_n13216DisNormDsc[0] ;
         A13213DisNormID = P05DG24_A13213DisNormID[0] ;
         A13216DisNormDsc = P05DG24_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P05DG24_n13216DisNormDsc[0] ;
         if ( (GXutil.strcmp("", AV475Normas)==0) )
         {
            AV475Normas = GXutil.trim( A13216DisNormDsc) ;
         }
         else
         {
            AV475Normas += "/" + GXutil.trim( A13216DisNormDsc) ;
         }
         pr_default.readNext(19);
      }
      pr_default.close(19);
   }

   public void S211( ) throws ProcessInterruptedException
   {
      /* 'OBSERVACIONESCOLOR' Routine */
      returnInSub = false ;
      AV488nocabecera = (byte)(0) ;
      /* Using cursor P05DG25 */
      pr_default.execute(20, new Object[] {AV239EmprCod, Integer.valueOf(AV203CliCod), AV260ForSer, AV257ForColNom, Integer.valueOf(AV258ForColNum), Byte.valueOf(AV350TipColCod)});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A831TipColCod = P05DG25_A831TipColCod[0] ;
         A483ForColNum = P05DG25_A483ForColNum[0] ;
         A482ForColNom = P05DG25_A482ForColNom[0] ;
         A494ForSer = P05DG25_A494ForSer[0] ;
         A252CliCod = P05DG25_A252CliCod[0] ;
         n252CliCod = P05DG25_n252CliCod[0] ;
         A396EmprCod = P05DG25_A396EmprCod[0] ;
         A649ObsForTxt = P05DG25_A649ObsForTxt[0] ;
         A650ObsLin = P05DG25_A650ObsLin[0] ;
         if ( (0==AV488nocabecera) )
         {
            h5DG0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones Color:", ""), 16, Gx_line+1, 163, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV488nocabecera = (byte)(1) ;
         }
         h5DG0( false, 18) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 168, Gx_line+1, 388, Gx_line+18, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         pr_default.readNext(20);
      }
      pr_default.close(20);
   }

   public void h5DG0( boolean bFoot ,
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
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV361Var3, "")), 672, Gx_line+2, 796, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV220ContDsc, "")), 10, Gx_line+2, 115, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 205, Gx_line+1, 238, Gx_line+15, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV342TermUsu, "@!")), 251, Gx_line+1, 319, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 344, Gx_line+0, 411, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 424, Gx_line+0, 482, Gx_line+16, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 416, Gx_line+0, 421, Gx_line+14, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 2, 0, 0, 0, 0) ;
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
            if ( GxHdr8 )
            {
               if ( AV347Tinamar == 1 )
               {
                  if ( GXutil.strcmp(A5058BarEnvLaw, "@") == 0 )
                  {
                     getPrinter().GxAttris("Courier New", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Qtd de corante corrigida pela composição", ""), 131, Gx_line+2, 674, Gx_line+28, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+30) ;
                  }
                  getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV269HojRut, "")), 544, Gx_line+5, 783, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+2, 796, Gx_line+2, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV331Remonta, "")), 15, Gx_line+9, 124, Gx_line+26, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 13, Gx_line+28, 58, Gx_line+44, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 66, Gx_line+28, 133, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 57, Gx_line+27, 65, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV229DescMaq, "")), 170, Gx_line+8, 338, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV186BarMaqCod, "")), 170, Gx_line+27, 221, Gx_line+45, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("3 of 9 Barcode", 22, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV298MaqCdb, "")), 343, Gx_line+6, 486, Gx_line+30, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+45) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV308NomEmp, "")), 15, Gx_line+6, 265, Gx_line+23, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 363, Gx_line+6, 430, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")), 363, Gx_line+27, 430, Gx_line+43, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4867RecFecMod, "99/99/99 99:99"), 436, Gx_line+27, 539, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 436, Gx_line+6, 539, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV400Lit3, "")), 283, Gx_line+6, 357, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV425Lit52, "")), 283, Gx_line+27, 357, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV377Lit0, "")), 15, Gx_line+27, 235, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV264Hdr, "")), 617, Gx_line+2, 781, Gx_line+27, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV311Num_int, "")), 680, Gx_line+27, 763, Gx_line+44, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV284LinMaq, "")), 617, Gx_line+27, 662, Gx_line+44, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+48) ;
               }
               else
               {
                  getPrinter().GxAttris("Courier New", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV264Hdr, "")), 15, Gx_line+17, 179, Gx_line+42, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV284LinMaq, "")), 15, Gx_line+43, 60, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV311Num_int, "")), 78, Gx_line+43, 161, Gx_line+60, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV269HojRut, "")), 196, Gx_line+17, 435, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV229DescMaq, "")), 454, Gx_line+20, 622, Gx_line+40, 1+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV186BarMaqCod, "")), 673, Gx_line+41, 724, Gx_line+59, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV298MaqCdb, "")), 627, Gx_line+17, 786, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+10, 796, Gx_line+10, 2, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+60) ;
                  getPrinter().GxAttris("Courier New", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV308NomEmp, "")), 16, Gx_line+2, 266, Gx_line+19, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV464RecUsrCod, "")), 395, Gx_line+2, 454, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")), 395, Gx_line+22, 462, Gx_line+38, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4867RecFecMod, "99/99/99 99:99"), 469, Gx_line+22, 572, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(localUtil.format( AV465RecFecAlt, "99/99/99 99:99"), 469, Gx_line+2, 572, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV400Lit3, "")), 309, Gx_line+2, 383, Gx_line+20, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV425Lit52, "")), 309, Gx_line+22, 383, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV377Lit0, "")), 15, Gx_line+21, 297, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 717, Gx_line+22, 725, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 672, Gx_line+22, 717, Gx_line+39, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 725, Gx_line+22, 792, Gx_line+39, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV331Remonta, "")), 627, Gx_line+2, 736, Gx_line+19, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+40) ;
               }
               if ( AV347Tinamar == 0 )
               {
                  if ( AV262Gavim == 0 )
                  {
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 80, Gx_line+4, 130, Gx_line+20, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 140, Gx_line+4, 393, Gx_line+20, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 80, Gx_line+42, 198, Gx_line+59, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 204, Gx_line+42, 395, Gx_line+59, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV365VCompo, "")), 80, Gx_line+61, 300, Gx_line+78, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Pml", ""), 327, Gx_line+80, 350, Gx_line+97, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV191BarPes), "ZZZ9")), 355, Gx_line+80, 385, Gx_line+97, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 80, Gx_line+80, 103, Gx_line+97, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 117, Gx_line+80, 140, Gx_line+97, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Grm2 Acab", ""), 146, Gx_line+80, 213, Gx_line+97, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 219, Gx_line+80, 249, Gx_line+97, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9")), 252, Gx_line+80, 282, Gx_line+97, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV452BarEnccli, "")), 80, Gx_line+23, 227, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 491, Gx_line+4, 587, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 607, Gx_line+4, 652, Gx_line+21, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 673, Gx_line+4, 689, Gx_line+21, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 656, Gx_line+4, 672, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV230DesCol, "")), 690, Gx_line+4, 800, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 491, Gx_line+23, 587, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV313NumCli), "ZZZZZ9")), 607, Gx_line+23, 652, Gx_line+40, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Int", ""), 656, Gx_line+23, 679, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV231DesInt, "")), 690, Gx_line+23, 800, Gx_line+40, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV261ForTonal, "")), 491, Gx_line+42, 658, Gx_line+58, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV353Tot_kgs, "ZZZZZ9.99")), 456, Gx_line+61, 523, Gx_line+79, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV294M, "")), 525, Gx_line+61, 533, Gx_line+79, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV183BarKgm, "ZZZZZ9.99")), 456, Gx_line+80, 523, Gx_line+98, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A871RecTotMtr, "ZZZZZZ9.99")), 596, Gx_line+61, 670, Gx_line+79, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV188BarMtr, "ZZZZZ9.99")), 603, Gx_line+80, 670, Gx_line+98, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A813RecTotPie), "ZZZZ9")), 732, Gx_line+61, 774, Gx_line+78, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV192BarPie), "ZZZZZ9")), 730, Gx_line+80, 775, Gx_line+98, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(396, Gx_line+0, 396, Gx_line+97, 2, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV430Lit8, "")), 10, Gx_line+4, 78, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV418Lit46, "")), 10, Gx_line+23, 78, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV379Lit10, "")), 10, Gx_line+42, 78, Gx_line+60, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV380Lit11, "")), 10, Gx_line+61, 78, Gx_line+79, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV420Lit48, "")), 10, Gx_line+80, 77, Gx_line+97, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV381Lit12, "")), 401, Gx_line+4, 485, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV383Lit14, "")), 401, Gx_line+23, 485, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV424Lit51, "")), 401, Gx_line+42, 485, Gx_line+60, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV393Lit23, "")), 401, Gx_line+61, 452, Gx_line+79, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV394Lit24, "")), 678, Gx_line+61, 729, Gx_line+79, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV395Lit25, "")), 542, Gx_line+61, 593, Gx_line+79, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(395, Gx_line+56, 795, Gx_line+56, 1, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 588, Gx_line+4, 606, Gx_line+21, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 589, Gx_line+23, 607, Gx_line+40, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+98) ;
                  }
                  else
                  {
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 81, Gx_line+5, 131, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 134, Gx_line+5, 387, Gx_line+21, 0, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 81, Gx_line+43, 199, Gx_line+60, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 199, Gx_line+43, 390, Gx_line+60, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV365VCompo, "")), 81, Gx_line+63, 301, Gx_line+80, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV452BarEnccli, "")), 81, Gx_line+24, 228, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 492, Gx_line+5, 588, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 608, Gx_line+5, 653, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 674, Gx_line+5, 690, Gx_line+22, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 657, Gx_line+5, 673, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV230DesCol, "")), 691, Gx_line+5, 801, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 492, Gx_line+24, 588, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV313NumCli), "ZZZZZ9")), 608, Gx_line+24, 653, Gx_line+41, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Int", ""), 657, Gx_line+24, 680, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV231DesInt, "")), 691, Gx_line+24, 801, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV261ForTonal, "")), 492, Gx_line+43, 659, Gx_line+59, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV353Tot_kgs, "ZZZZZ9.99")), 463, Gx_line+81, 530, Gx_line+99, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV294M, "")), 531, Gx_line+81, 539, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A871RecTotMtr, "ZZZZZZ9.99")), 602, Gx_line+81, 676, Gx_line+99, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A813RecTotPie), "ZZZZ9")), 739, Gx_line+81, 781, Gx_line+98, 2, 0, 0, 0) ;
                     getPrinter().GxDrawLine(7, Gx_line+1, 796, Gx_line+1, 2, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(396, Gx_line+1, 396, Gx_line+99, 2, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV430Lit8, "")), 10, Gx_line+5, 78, Gx_line+23, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV418Lit46, "")), 10, Gx_line+24, 78, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV379Lit10, "")), 10, Gx_line+43, 78, Gx_line+61, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV380Lit11, "")), 10, Gx_line+63, 78, Gx_line+81, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV381Lit12, "")), 402, Gx_line+5, 486, Gx_line+23, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV383Lit14, "")), 402, Gx_line+24, 486, Gx_line+42, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV424Lit51, "")), 402, Gx_line+43, 486, Gx_line+61, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV393Lit23, "")), 402, Gx_line+81, 453, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV394Lit24, "")), 684, Gx_line+81, 735, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV395Lit25, "")), 548, Gx_line+81, 599, Gx_line+99, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 590, Gx_line+5, 608, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 590, Gx_line+24, 608, Gx_line+41, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Caderno", ""), 402, Gx_line+63, 461, Gx_line+80, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV461DisEnt, "")), 492, Gx_line+63, 785, Gx_line+80, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV317Partida), "ZZZZZZZZ")), 81, Gx_line+81, 140, Gx_line+98, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Partida", ""), 10, Gx_line+81, 69, Gx_line+98, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+99) ;
                  }
               }
               else
               {
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 80, Gx_line+4, 130, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 133, Gx_line+4, 386, Gx_line+20, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 80, Gx_line+42, 198, Gx_line+59, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 198, Gx_line+42, 389, Gx_line+59, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV365VCompo, "")), 80, Gx_line+61, 300, Gx_line+78, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pml", ""), 332, Gx_line+80, 355, Gx_line+97, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV191BarPes), "ZZZ9")), 360, Gx_line+80, 390, Gx_line+97, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 80, Gx_line+80, 103, Gx_line+97, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 122, Gx_line+80, 145, Gx_line+97, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Grm2 Acab", ""), 151, Gx_line+80, 218, Gx_line+97, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 224, Gx_line+80, 254, Gx_line+97, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9")), 257, Gx_line+80, 287, Gx_line+97, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV452BarEnccli, "")), 80, Gx_line+23, 227, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 491, Gx_line+4, 587, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 607, Gx_line+4, 652, Gx_line+21, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 673, Gx_line+4, 689, Gx_line+21, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 656, Gx_line+4, 672, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV230DesCol, "")), 690, Gx_line+4, 800, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 491, Gx_line+23, 587, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV313NumCli), "ZZZZZ9")), 607, Gx_line+23, 652, Gx_line+40, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Int", ""), 656, Gx_line+23, 679, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV231DesInt, "")), 690, Gx_line+23, 800, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV261ForTonal, "")), 491, Gx_line+42, 658, Gx_line+58, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV353Tot_kgs, "ZZZZZ9.99")), 461, Gx_line+80, 528, Gx_line+98, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV294M, "")), 530, Gx_line+80, 538, Gx_line+98, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A871RecTotMtr, "ZZZZZZ9.99")), 601, Gx_line+80, 675, Gx_line+98, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A813RecTotPie), "ZZZZ9")), 738, Gx_line+80, 780, Gx_line+97, 2, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 2, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(396, Gx_line+0, 396, Gx_line+98, 2, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV430Lit8, "")), 10, Gx_line+4, 78, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV418Lit46, "")), 10, Gx_line+23, 78, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV379Lit10, "")), 10, Gx_line+42, 78, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV380Lit11, "")), 10, Gx_line+61, 78, Gx_line+79, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV420Lit48, "")), 10, Gx_line+80, 77, Gx_line+97, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV381Lit12, "")), 401, Gx_line+4, 485, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV383Lit14, "")), 401, Gx_line+23, 485, Gx_line+41, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV424Lit51, "")), 401, Gx_line+42, 485, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV393Lit23, "")), 401, Gx_line+80, 452, Gx_line+98, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV394Lit24, "")), 683, Gx_line+80, 734, Gx_line+98, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV395Lit25, "")), 547, Gx_line+80, 598, Gx_line+98, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 589, Gx_line+4, 607, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 589, Gx_line+23, 607, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Caderno", ""), 401, Gx_line+61, 460, Gx_line+78, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV461DisEnt, "")), 493, Gx_line+63, 786, Gx_line+80, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+98) ;
               }
               if ( AV468normasintegridad == 1 )
               {
                  if ( (0==AV347Tinamar) )
                  {
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Caderno Encargos:", ""), 10, Gx_line+0, 153, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV461DisEnt, "")), 153, Gx_line+0, 446, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), 153, Gx_line+17, 505, Gx_line+33, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "P.O.:", ""), 110, Gx_line+16, 153, Gx_line+33, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV466Dsc_Idtx, "")), 518, Gx_line+6, 727, Gx_line+26, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+33) ;
                  }
                  else
                  {
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Normas:", ""), 10, Gx_line+5, 69, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV475Normas, "")), 75, Gx_line+5, 805, Gx_line+22, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "P.O.:", ""), 10, Gx_line+22, 53, Gx_line+39, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11662BarOrdComp, "")), 75, Gx_line+23, 427, Gx_line+39, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+40) ;
                  }
               }
               if ( AV262Gavim == 1 )
               {
                  getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV466Dsc_Idtx, "")), 298, Gx_line+6, 507, Gx_line+26, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+33) ;
               }
               if ( ( GXutil.strcmp(AV474statusgots, httpContext.getMessage( "SIM", "")) == 0 ) || ( GXutil.strcmp(AV477statusgrs, httpContext.getMessage( "SIM", "")) == 0 ) || ( GXutil.strcmp(AV478statusocs, httpContext.getMessage( "SIM", "")) == 0 ) )
               {
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LAVAR MAQUINA", ""), 334, Gx_line+0, 470, Gx_line+19, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
               }
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RB 1:", ""), 14, Gx_line+4, 51, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV330RelBany), "ZZZ9")), 53, Gx_line+4, 86, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 192, Gx_line+4, 237, Gx_line+21, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV373Volumen), "ZZZZ9")), 323, Gx_line+4, 365, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), 459, Gx_line+3, 504, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV434HhMmt, "")), 627, Gx_line+3, 679, Gx_line+20, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N Micro", ""), 704, Gx_line+3, 756, Gx_line+20, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV300MaqMicro), "Z9")), 763, Gx_line+3, 780, Gx_line+20, 2, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+23, 796, Gx_line+23, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+0, 796, Gx_line+0, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV398Lit28, "")), 111, Gx_line+4, 185, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV392Lit22, "")), 248, Gx_line+4, 322, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV399Lit29, "")), 383, Gx_line+4, 457, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV457Lit65, "")), 520, Gx_line+3, 623, Gx_line+21, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
               AV376ImpCabProductos = (byte)(0) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Courier New", true, true, 58, 14, 72, 123,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 30, 35, 35, 55, 45, 14, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 21, 21, 37, 37, 37, 38, 61, 45, 45, 45, 45, 42, 38, 49, 45, 17, 35, 45, 38, 52, 45, 49, 42, 49, 45, 42, 38, 45, 42, 59, 42, 42, 38, 21, 18, 23, 37, 35, 21, 35, 38, 35, 38, 35, 21, 38, 38, 18, 18, 35, 18, 56, 38, 38, 38, 38, 25, 35, 21, 38, 35, 49, 35, 35, 32, 25, 17, 25, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 36, 35, 35, 35, 17, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 21, 21, 36, 35, 21, 21, 21, 23, 35, 53, 53, 53, 38, 45, 45, 45, 45, 45, 45, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 35, 35, 35, 35, 35, 18, 18, 18, 18, 38, 38, 38, 38, 38, 38, 38, 35, 38, 38, 38, 38, 38, 35, 38, 35}) ;
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
      AV239EmprCod = "" ;
      AV178BarCodPar = "" ;
      AV186BarMaqCod = "" ;
      AV195BarSua = "" ;
      AV272ImpCod = "" ;
      AV484lit999 = "" ;
      AV400Lit3 = "" ;
      scmdbuf = "" ;
      P05DG2_A396EmprCod = new String[] {""} ;
      P05DG2_A407EmprNom = new String[] {""} ;
      P05DG2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV308NomEmp = "" ;
      AV341Termin = "" ;
      P05DG3_A942TermCod = new String[] {""} ;
      P05DG3_A1189TermUsu = new String[] {""} ;
      P05DG3_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV342TermUsu = "" ;
      P05DG5_A130BarCodPar = new String[] {""} ;
      P05DG5_A132BarCodReo = new byte[1] ;
      P05DG5_A129BarCod = new int[1] ;
      P05DG5_A361DisCod = new int[1] ;
      P05DG5_A396EmprCod = new String[] {""} ;
      P05DG5_A252CliCod = new int[1] ;
      P05DG5_n252CliCod = new boolean[] {false} ;
      P05DG5_A212BarSer = new String[] {""} ;
      P05DG5_A135BarColNom = new String[] {""} ;
      P05DG5_A136BarColNum = new int[1] ;
      P05DG5_A218BarTipCol = new byte[1] ;
      P05DG5_A1652BarSerDsc = new String[] {""} ;
      P05DG5_A4466BarAcaAnh = new short[1] ;
      P05DG5_A2829BarProPer = new String[] {""} ;
      P05DG5_A148BarEstReo = new byte[1] ;
      P05DG5_A143BarDisNum = new String[] {""} ;
      P05DG5_A4812BarEncCli = new String[] {""} ;
      P05DG5_A1431BarLocDis = new String[] {""} ;
      P05DG5_A4845BarAudObs = new String[] {""} ;
      P05DG5_n4845BarAudObs = new boolean[] {false} ;
      P05DG5_A217BarTipArt = new short[1] ;
      P05DG5_n217BarTipArt = new boolean[] {false} ;
      P05DG5_A224BarTraP1 = new short[1] ;
      P05DG5_A221BarTra1 = new String[] {""} ;
      P05DG5_A225BarTraP2 = new short[1] ;
      P05DG5_A222BarTra2 = new String[] {""} ;
      P05DG5_A226BarTraP3 = new short[1] ;
      P05DG5_A223BarTra3 = new String[] {""} ;
      P05DG5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG5_A199BarPie1 = new short[1] ;
      P05DG5_A365DisDes = new String[] {""} ;
      P05DG5_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A2829BarProPer = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A1431BarLocDis = "" ;
      A4845BarAudObs = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV260ForSer = "" ;
      AV257ForColNom = "" ;
      AV335Serie = "" ;
      AV343Texto_r = "" ;
      AV237DSCCAUSA = "" ;
      AV460Tb1_dscfb = "" ;
      AV461DisEnt = "" ;
      AV467Cod_Idtx = "" ;
      AV466Dsc_Idtx = "" ;
      AV183BarKgm = DecimalUtil.ZERO ;
      AV188BarMtr = DecimalUtil.ZERO ;
      AV316Obstxt = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV316Obstxt[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05DG6_A396EmprCod = new String[] {""} ;
      P05DG6_A361DisCod = new int[1] ;
      P05DG6_A377DisObsTxt = new String[] {""} ;
      P05DG6_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV452BarEnccli = "" ;
      AV168Albrloc = "" ;
      AV432Lit99 = "" ;
      AV184barlocdis = "" ;
      AV175Baraudobs = "" ;
      P05DG7_A771ProForTie = new long[1] ;
      AV348TipArtDsc = "" ;
      AV365VCompo = "" ;
      AV441Ceros2 = "" ;
      AV435Hhalfa = "" ;
      AV439MinAlfa = "" ;
      AV434HhMmt = "" ;
      AV277Intens = "" ;
      AV302Matiz = "" ;
      GXv_int4 = new short[1] ;
      AV349TipCol = "" ;
      AV352Tonalidad = "" ;
      AV261ForTonal = "" ;
      AV238DscSol = "" ;
      AV296Macprocod = "" ;
      AV259ForNomcli3 = "" ;
      P05DG8_A872RecPrdNum = new String[] {""} ;
      P05DG8_A2804RecLinMaq = new short[1] ;
      P05DG8_A130BarCodPar = new String[] {""} ;
      P05DG8_A132BarCodReo = new byte[1] ;
      P05DG8_A129BarCod = new int[1] ;
      P05DG8_A396EmprCod = new String[] {""} ;
      P05DG8_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG8_A811RecLin = new short[1] ;
      P05DG8_A1273RecLinPro = new byte[1] ;
      A872RecPrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV473MoAColorantes = "" ;
      AV226Coste2 = DecimalUtil.ZERO ;
      AV230DesCol = "" ;
      AV231DesInt = "" ;
      P05DG11_A130BarCodPar = new String[] {""} ;
      P05DG11_A132BarCodReo = new byte[1] ;
      P05DG11_A396EmprCod = new String[] {""} ;
      P05DG11_A129BarCod = new int[1] ;
      P05DG11_A2804RecLinMaq = new short[1] ;
      P05DG11_A361DisCod = new int[1] ;
      P05DG11_A206BarPle = new String[] {""} ;
      P05DG11_A118BarAcaQui = new String[] {""} ;
      P05DG11_A602MaqCod = new String[] {""} ;
      P05DG11_A1503BarPart = new short[1] ;
      P05DG11_A4609BarMdlCod = new String[] {""} ;
      P05DG11_A9775BarItem1 = new String[] {""} ;
      P05DG11_A9777BarItem3 = new String[] {""} ;
      P05DG11_A148BarEstReo = new byte[1] ;
      P05DG11_A3006BarCoef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG11_n3006BarCoef = new boolean[] {false} ;
      P05DG11_A1226BarGraCru = new short[1] ;
      P05DG11_A3735BarPieKgl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG11_A120BarAgrEst = new String[] {""} ;
      P05DG11_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG11_A5109RecNumInt = new int[1] ;
      P05DG11_A2454BarGirar = new String[] {""} ;
      P05DG11_A5058BarEnvLaw = new String[] {""} ;
      P05DG11_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P05DG11_n4866RecFecAlt = new boolean[] {false} ;
      P05DG11_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P05DG11_n4867RecFecMod = new boolean[] {false} ;
      P05DG11_A4868RecUsrMod = new String[] {""} ;
      P05DG11_n4868RecUsrMod = new boolean[] {false} ;
      P05DG11_A4402RecUsrCod = new String[] {""} ;
      P05DG11_A1234BarNomCli = new String[] {""} ;
      P05DG11_A218BarTipCol = new byte[1] ;
      P05DG11_A136BarColNum = new int[1] ;
      P05DG11_A135BarColNom = new String[] {""} ;
      P05DG11_A3137BarGraAca2 = new short[1] ;
      P05DG11_A1909BarGraAca = new short[1] ;
      P05DG11_A126BarAncAca2 = new short[1] ;
      P05DG11_A125BarAncAca1 = new short[1] ;
      P05DG11_A1652BarSerDsc = new String[] {""} ;
      P05DG11_A212BarSer = new String[] {""} ;
      P05DG11_A279CliNom = new String[] {""} ;
      P05DG11_A252CliCod = new int[1] ;
      P05DG11_n252CliCod = new boolean[] {false} ;
      P05DG11_A11662BarOrdComp = new String[] {""} ;
      P05DG11_A5110RecNumPrg = new String[] {""} ;
      P05DG11_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG11_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG11_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG11_A199BarPie1 = new short[1] ;
      P05DG11_A365DisDes = new String[] {""} ;
      P05DG11_A898BarPieNDes = new int[1] ;
      P05DG11_A220BarTotPie = new int[1] ;
      P05DG11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG11_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A206BarPle = "" ;
      A118BarAcaQui = "" ;
      A602MaqCod = "" ;
      A4609BarMdlCod = "" ;
      A9775BarItem1 = "" ;
      A9777BarItem3 = "" ;
      A3006BarCoef = DecimalUtil.ZERO ;
      A3735BarPieKgl = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A2454BarGirar = "" ;
      A5058BarEnvLaw = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      A4402RecUsrCod = "" ;
      A1234BarNomCli = "" ;
      A279CliNom = "" ;
      A11662BarOrdComp = "" ;
      A5110RecNumPrg = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV464RecUsrCod = "" ;
      AV465RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV176BarCal = "" ;
      AV228DesAcaqui = "" ;
      AV193BarPle = "" ;
      AV328RecNumPrg = "" ;
      AV297MacProDsc = "" ;
      AV299MaqCod = "" ;
      AV187BarMdlcod = "" ;
      AV181Baritem1 = "" ;
      AV182BarItem3 = "" ;
      AV285Litnop = "" ;
      AV286Litnov = "" ;
      AV426Lit53 = "" ;
      AV170ArtCod = "" ;
      AV220ContDsc = "" ;
      AV377Lit0 = "" ;
      AV331Remonta = "" ;
      AV416Lit44 = "" ;
      AV281Largura = DecimalUtil.ZERO ;
      AV346TiempoV = DecimalUtil.ZERO ;
      AV263GrMlin = DecimalUtil.ZERO ;
      AV216CompTP = DecimalUtil.ZERO ;
      AV320Procesos = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV320Procesos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV345Tiempos = new short[6] ;
      P05DG12_A396EmprCod = new String[] {""} ;
      P05DG12_A129BarCod = new int[1] ;
      P05DG12_A132BarCodReo = new byte[1] ;
      P05DG12_A130BarCodPar = new String[] {""} ;
      P05DG12_A2804RecLinMaq = new short[1] ;
      P05DG12_A764ProForCod = new String[] {""} ;
      P05DG12_A771ProForTie = new short[1] ;
      P05DG12_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV269HojRut = "" ;
      AV264Hdr = "" ;
      AV202ceros8 = "" ;
      AV267HdrAlfa = "" ;
      AV298MaqCdb = "" ;
      AV480Kgm = DecimalUtil.ZERO ;
      AV481totkgm = DecimalUtil.ZERO ;
      AV353Tot_kgs = DecimalUtil.ZERO ;
      AV294M = "" ;
      AV311Num_int = "" ;
      AV284LinMaq = "" ;
      AV215CompCamar = DecimalUtil.ZERO ;
      P05DG13_A396EmprCod = new String[] {""} ;
      P05DG13_A129BarCod = new int[1] ;
      P05DG13_A132BarCodReo = new byte[1] ;
      P05DG13_A130BarCodPar = new String[] {""} ;
      P05DG13_A1273RecLinPro = new byte[1] ;
      P05DG13_A2804RecLinMaq = new short[1] ;
      P05DG13_A2392ProNumPro = new int[1] ;
      P05DG13_A4697RecNroPrg = new int[1] ;
      P05DG13_A2393ProNumRec = new int[1] ;
      P05DG13_A1251RecNumRec = new int[1] ;
      P05DG13_A764ProForCod = new String[] {""} ;
      P05DG13_A772ProForTmx = new short[1] ;
      P05DG13_A771ProForTie = new short[1] ;
      P05DG13_A766ProForDsc = new String[] {""} ;
      A766ProForDsc = "" ;
      AV321Proforcod = "" ;
      AV406Lit35 = "" ;
      AV407Lit36 = "" ;
      AV408Lit37 = "" ;
      AV402Lit31 = "" ;
      AV404Lit33 = "" ;
      AV454Lit62 = "" ;
      AV405Lit34 = "" ;
      P05DG14_A719PrdNum = new String[] {""} ;
      P05DG14_n719PrdNum = new boolean[] {false} ;
      P05DG14_A396EmprCod = new String[] {""} ;
      P05DG14_A129BarCod = new int[1] ;
      P05DG14_A132BarCodReo = new byte[1] ;
      P05DG14_A130BarCodPar = new String[] {""} ;
      P05DG14_A2804RecLinMaq = new short[1] ;
      P05DG14_A1273RecLinPro = new byte[1] ;
      P05DG14_A875RecPrdDsc = new String[] {""} ;
      P05DG14_A872RecPrdNum = new String[] {""} ;
      P05DG14_A488ForPrdDsc = new String[] {""} ;
      P05DG14_n488ForPrdDsc = new boolean[] {false} ;
      P05DG14_A490ForPrdUMe = new byte[1] ;
      P05DG14_n490ForPrdUMe = new boolean[] {false} ;
      P05DG14_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG14_A2394RecForNro = new byte[1] ;
      P05DG14_A3274RecPrdTnq = new byte[1] ;
      P05DG14_A13937RecLotAlm = new short[1] ;
      P05DG14_A5725RecLote = new String[] {""} ;
      P05DG14_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG14_A1643PrdTip = new String[] {""} ;
      P05DG14_A13968PrdCantAtM = new short[1] ;
      P05DG14_n13968PrdCantAtM = new boolean[] {false} ;
      P05DG14_A14055RecManAut = new String[] {""} ;
      P05DG14_A12641RecPrdDc2 = new String[] {""} ;
      P05DG14_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A1643PrdTip = "" ;
      A14055RecManAut = "" ;
      A12641RecPrdDc2 = "" ;
      AV462CodeBar1 = "" ;
      AV463LineaProducto = "" ;
      AV459TipoProducto = "" ;
      AV375Und1 = "" ;
      AV358Unidades = "" ;
      AV326RecForNro = "" ;
      AV483AlmPrdDsc = "" ;
      AV374Reclote = "" ;
      AV442Faccon = DecimalUtil.ZERO ;
      AV433Cant = DecimalUtil.ZERO ;
      AV472MoA = "" ;
      P05DG15_A396EmprCod = new String[] {""} ;
      P05DG15_A129BarCod = new int[1] ;
      P05DG15_A132BarCodReo = new byte[1] ;
      P05DG15_A130BarCodPar = new String[] {""} ;
      P05DG15_A2804RecLinMaq = new short[1] ;
      P05DG15_A5258RecTxtObs = new String[] {""} ;
      P05DG15_n5258RecTxtObs = new boolean[] {false} ;
      P05DG15_A5257RecLinObs = new short[1] ;
      A5258RecTxtObs = "" ;
      AV409Lit38 = "" ;
      P05DG16_AV307NMaxAg = new short[1] ;
      P05DG17_A130BarCodPar = new String[] {""} ;
      P05DG17_A132BarCodReo = new byte[1] ;
      P05DG17_A129BarCod = new int[1] ;
      P05DG17_A396EmprCod = new String[] {""} ;
      P05DG17_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG17_A122BarAgrPar = new String[] {""} ;
      P05DG17_A124BarAgrReo = new byte[1] ;
      P05DG17_A119BarAgrCod = new int[1] ;
      P05DG17_A1508CliCodAgr = new int[1] ;
      P05DG17_A1507BarAgrDsc = new String[] {""} ;
      P05DG17_A1245BarAgrSer = new String[] {""} ;
      P05DG17_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DG17_A671PieAgr = new short[1] ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      A1507BarAgrDsc = "" ;
      A1245BarAgrSer = "" ;
      A869MtrAgr = DecimalUtil.ZERO ;
      AV265Hdr_a = "" ;
      AV208CliNom_a = "" ;
      AV166Agrdsc = "" ;
      AV305MtrAgr = DecimalUtil.ZERO ;
      AV421Lit49 = "" ;
      AV287Litpda = "" ;
      AV289LocAlbr = "" ;
      GXv_int17 = new int[1] ;
      GXv_int6 = new byte[1] ;
      AV443BarKgmAgr = DecimalUtil.ZERO ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      AV444BarMtrAgr = DecimalUtil.ZERO ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int16 = new int[1] ;
      AV446BarAgrSer = "" ;
      GXv_char10 = new String[1] ;
      AV447Barcolnomagr = "" ;
      GXv_char9 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char8 = new String[1] ;
      AV448fec1 = GXutil.nullDate() ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      GXv_char5 = new String[1] ;
      AV449fec2 = GXutil.nullDate() ;
      GXv_date22 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      AV450barserdscAgr = "" ;
      AV451fec3 = GXutil.nullDate() ;
      GXv_date25 = new java.util.Date[1] ;
      AV415Lit43 = "" ;
      AV410Lit39 = "" ;
      AV413Lit41 = "" ;
      AV381Lit12 = "" ;
      AV414Lit42 = "" ;
      AV458Lit66 = "" ;
      AV361Var3 = "" ;
      AV411Lit4 = "" ;
      AV422Lit5 = "" ;
      AV427Lit6 = "" ;
      AV429Lit7 = "" ;
      AV430Lit8 = "" ;
      AV431Lit9 = "" ;
      AV379Lit10 = "" ;
      AV380Lit11 = "" ;
      AV382Lit13 = "" ;
      AV383Lit14 = "" ;
      AV384Lit15 = "" ;
      AV385Lit16 = "" ;
      AV386Lit17 = "" ;
      AV387Lit18 = "" ;
      AV388Lit19 = "" ;
      AV390Lit20 = "" ;
      AV391Lit21 = "" ;
      AV392Lit22 = "" ;
      AV393Lit23 = "" ;
      AV394Lit24 = "" ;
      AV395Lit25 = "" ;
      AV396Lit26 = "" ;
      AV397Lit27 = "" ;
      AV398Lit28 = "" ;
      AV399Lit29 = "" ;
      AV401Lit30 = "" ;
      AV403Lit32 = "" ;
      AV412Lit40 = "" ;
      AV417Lit45 = "" ;
      AV418Lit46 = "" ;
      AV419Lit47 = "" ;
      AV420Lit48 = "" ;
      AV423Lit50 = "" ;
      AV424Lit51 = "" ;
      AV425Lit52 = "" ;
      AV428Lit60 = "" ;
      AV455Lit63 = "" ;
      AV456Lit64 = "" ;
      AV457Lit65 = "" ;
      GXt_char1 = "" ;
      P05DG18_A833TipDefCod = new short[1] ;
      P05DG18_A5085CodCausa = new short[1] ;
      P05DG18_n5085CodCausa = new boolean[] {false} ;
      P05DG18_A544HisCodPar = new String[] {""} ;
      P05DG18_A545HisCodReo = new byte[1] ;
      P05DG18_A539HisBarCod = new int[1] ;
      P05DG18_A396EmprCod = new String[] {""} ;
      P05DG18_A5086DscCausa = new String[] {""} ;
      P05DG18_n5086DscCausa = new boolean[] {false} ;
      P05DG18_A834TipDefDsc = new String[] {""} ;
      P05DG18_n834TipDefDsc = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A5086DscCausa = "" ;
      A834TipDefDsc = "" ;
      AV173ArtObslon = "" ;
      P05DG19_A3072ArtObsLon = new String[] {""} ;
      P05DG19_n3072ArtObsLon = new boolean[] {false} ;
      P05DG19_A65ArtCod = new String[] {""} ;
      P05DG19_A252CliCod = new int[1] ;
      P05DG19_n252CliCod = new boolean[] {false} ;
      P05DG19_A396EmprCod = new String[] {""} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      AV169AlbRLote = new String[5] ;
      GX_I = 1 ;
      while ( GX_I <= 5 )
      {
         AV169AlbRLote[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int11 = new short[1] ;
      GXv_char26 = new String[1] ;
      GXv_int24 = new int[1] ;
      GXv_int20 = new byte[1] ;
      GXv_char23 = new String[1] ;
      GXv_char13 = new String[1] ;
      AV288Loc = "" ;
      GXv_char12 = new String[1] ;
      GXv_int21 = new int[1] ;
      P05DG20_A602MaqCod = new String[] {""} ;
      P05DG20_A396EmprCod = new String[] {""} ;
      P05DG20_A5950MaqDteCol = new int[1] ;
      P05DG20_n5950MaqDteCol = new boolean[] {false} ;
      P05DG21_A602MaqCod = new String[] {""} ;
      P05DG21_A396EmprCod = new String[] {""} ;
      P05DG21_A606MaqDsc = new String[] {""} ;
      P05DG21_n606MaqDsc = new boolean[] {false} ;
      P05DG21_A2391MaqMicro = new byte[1] ;
      P05DG21_n2391MaqMicro = new boolean[] {false} ;
      P05DG21_A3598MaqNroTub = new byte[1] ;
      P05DG21_n3598MaqNroTub = new boolean[] {false} ;
      A606MaqDsc = "" ;
      AV229DescMaq = "" ;
      P05DG22_A10887Cod_Idtx = new String[] {""} ;
      P05DG22_A10888Dsc_Idtx = new String[] {""} ;
      P05DG22_n10888Dsc_Idtx = new boolean[] {false} ;
      P05DG22_A396EmprCod = new String[] {""} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV474statusgots = "" ;
      AV477statusgrs = "" ;
      AV478statusocs = "" ;
      P05DG23_A361DisCod = new int[1] ;
      P05DG23_A396EmprCod = new String[] {""} ;
      P05DG23_A13214DisNormSt = new String[] {""} ;
      P05DG23_A13213DisNormID = new String[] {""} ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      AV475Normas = "" ;
      P05DG24_A361DisCod = new int[1] ;
      P05DG24_A396EmprCod = new String[] {""} ;
      P05DG24_A13216DisNormDsc = new String[] {""} ;
      P05DG24_n13216DisNormDsc = new boolean[] {false} ;
      P05DG24_A13213DisNormID = new String[] {""} ;
      A13216DisNormDsc = "" ;
      P05DG25_A831TipColCod = new byte[1] ;
      P05DG25_A483ForColNum = new int[1] ;
      P05DG25_A482ForColNom = new String[] {""} ;
      P05DG25_A494ForSer = new String[] {""} ;
      P05DG25_A252CliCod = new int[1] ;
      P05DG25_n252CliCod = new boolean[] {false} ;
      P05DG25_A396EmprCod = new String[] {""} ;
      P05DG25_A649ObsForTxt = new String[] {""} ;
      P05DG25_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptintrecipe__default(),
         new Object[] {
             new Object[] {
            P05DG2_A396EmprCod, P05DG2_A407EmprNom, P05DG2_n407EmprNom
            }
            , new Object[] {
            P05DG3_A942TermCod, P05DG3_A1189TermUsu, P05DG3_n1189TermUsu
            }
            , new Object[] {
            P05DG5_A130BarCodPar, P05DG5_A132BarCodReo, P05DG5_A129BarCod, P05DG5_A361DisCod, P05DG5_A396EmprCod, P05DG5_A252CliCod, P05DG5_n252CliCod, P05DG5_A212BarSer, P05DG5_A135BarColNom, P05DG5_A136BarColNum,
            P05DG5_A218BarTipCol, P05DG5_A1652BarSerDsc, P05DG5_A4466BarAcaAnh, P05DG5_A2829BarProPer, P05DG5_A148BarEstReo, P05DG5_A143BarDisNum, P05DG5_A4812BarEncCli, P05DG5_A1431BarLocDis, P05DG5_A4845BarAudObs, P05DG5_n4845BarAudObs,
            P05DG5_A217BarTipArt, P05DG5_n217BarTipArt, P05DG5_A224BarTraP1, P05DG5_A221BarTra1, P05DG5_A225BarTraP2, P05DG5_A222BarTra2, P05DG5_A226BarTraP3, P05DG5_A223BarTra3, P05DG5_A166BarKgm, P05DG5_A184BarMtr,
            P05DG5_A199BarPie1, P05DG5_A365DisDes, P05DG5_A898BarPieNDes
            }
            , new Object[] {
            P05DG6_A396EmprCod, P05DG6_A361DisCod, P05DG6_A377DisObsTxt, P05DG6_A376DisObsLin
            }
            , new Object[] {
            P05DG7_A771ProForTie
            }
            , new Object[] {
            P05DG8_A872RecPrdNum, P05DG8_A2804RecLinMaq, P05DG8_A130BarCodPar, P05DG8_A132BarCodReo, P05DG8_A129BarCod, P05DG8_A396EmprCod, P05DG8_A686PrdCant, P05DG8_A811RecLin, P05DG8_A1273RecLinPro
            }
            , new Object[] {
            P05DG11_A130BarCodPar, P05DG11_A132BarCodReo, P05DG11_A396EmprCod, P05DG11_A129BarCod, P05DG11_A2804RecLinMaq, P05DG11_A361DisCod, P05DG11_A206BarPle, P05DG11_A118BarAcaQui, P05DG11_A602MaqCod, P05DG11_A1503BarPart,
            P05DG11_A4609BarMdlCod, P05DG11_A9775BarItem1, P05DG11_A9777BarItem3, P05DG11_A148BarEstReo, P05DG11_A3006BarCoef, P05DG11_n3006BarCoef, P05DG11_A1226BarGraCru, P05DG11_A3735BarPieKgl, P05DG11_A120BarAgrEst, P05DG11_A4259RecTotKgs,
            P05DG11_A5109RecNumInt, P05DG11_A2454BarGirar, P05DG11_A5058BarEnvLaw, P05DG11_A4866RecFecAlt, P05DG11_n4866RecFecAlt, P05DG11_A4867RecFecMod, P05DG11_n4867RecFecMod, P05DG11_A4868RecUsrMod, P05DG11_n4868RecUsrMod, P05DG11_A4402RecUsrCod,
            P05DG11_A1234BarNomCli, P05DG11_A218BarTipCol, P05DG11_A136BarColNum, P05DG11_A135BarColNom, P05DG11_A3137BarGraAca2, P05DG11_A1909BarGraAca, P05DG11_A126BarAncAca2, P05DG11_A125BarAncAca1, P05DG11_A1652BarSerDsc, P05DG11_A212BarSer,
            P05DG11_A279CliNom, P05DG11_A252CliCod, P05DG11_n252CliCod, P05DG11_A11662BarOrdComp, P05DG11_A5110RecNumPrg, P05DG11_A2806RecFA, P05DG11_A184BarMtr, P05DG11_A870BarTotMtr, P05DG11_A199BarPie1, P05DG11_A365DisDes,
            P05DG11_A898BarPieNDes, P05DG11_A220BarTotPie, P05DG11_A166BarKgm, P05DG11_A219BarTotAgr
            }
            , new Object[] {
            P05DG12_A396EmprCod, P05DG12_A129BarCod, P05DG12_A132BarCodReo, P05DG12_A130BarCodPar, P05DG12_A2804RecLinMaq, P05DG12_A764ProForCod, P05DG12_A771ProForTie, P05DG12_A1273RecLinPro
            }
            , new Object[] {
            P05DG13_A396EmprCod, P05DG13_A129BarCod, P05DG13_A132BarCodReo, P05DG13_A130BarCodPar, P05DG13_A1273RecLinPro, P05DG13_A2804RecLinMaq, P05DG13_A2392ProNumPro, P05DG13_A4697RecNroPrg, P05DG13_A2393ProNumRec, P05DG13_A1251RecNumRec,
            P05DG13_A764ProForCod, P05DG13_A772ProForTmx, P05DG13_A771ProForTie, P05DG13_A766ProForDsc
            }
            , new Object[] {
            P05DG14_A719PrdNum, P05DG14_n719PrdNum, P05DG14_A396EmprCod, P05DG14_A129BarCod, P05DG14_A132BarCodReo, P05DG14_A130BarCodPar, P05DG14_A2804RecLinMaq, P05DG14_A1273RecLinPro, P05DG14_A875RecPrdDsc, P05DG14_A872RecPrdNum,
            P05DG14_A488ForPrdDsc, P05DG14_n488ForPrdDsc, P05DG14_A490ForPrdUMe, P05DG14_n490ForPrdUMe, P05DG14_A686PrdCant, P05DG14_A2394RecForNro, P05DG14_A3274RecPrdTnq, P05DG14_A13937RecLotAlm, P05DG14_A5725RecLote, P05DG14_A431FacCon,
            P05DG14_A1643PrdTip, P05DG14_A13968PrdCantAtM, P05DG14_n13968PrdCantAtM, P05DG14_A14055RecManAut, P05DG14_A12641RecPrdDc2, P05DG14_A811RecLin
            }
            , new Object[] {
            P05DG15_A396EmprCod, P05DG15_A129BarCod, P05DG15_A132BarCodReo, P05DG15_A130BarCodPar, P05DG15_A2804RecLinMaq, P05DG15_A5258RecTxtObs, P05DG15_n5258RecTxtObs, P05DG15_A5257RecLinObs
            }
            , new Object[] {
            P05DG16_AV307NMaxAg
            }
            , new Object[] {
            P05DG17_A130BarCodPar, P05DG17_A132BarCodReo, P05DG17_A129BarCod, P05DG17_A396EmprCod, P05DG17_A590KgmAgr, P05DG17_A122BarAgrPar, P05DG17_A124BarAgrReo, P05DG17_A119BarAgrCod, P05DG17_A1508CliCodAgr, P05DG17_A1507BarAgrDsc,
            P05DG17_A1245BarAgrSer, P05DG17_A869MtrAgr, P05DG17_A671PieAgr
            }
            , new Object[] {
            P05DG18_A833TipDefCod, P05DG18_A5085CodCausa, P05DG18_n5085CodCausa, P05DG18_A544HisCodPar, P05DG18_A545HisCodReo, P05DG18_A539HisBarCod, P05DG18_A396EmprCod, P05DG18_A5086DscCausa, P05DG18_n5086DscCausa, P05DG18_A834TipDefDsc,
            P05DG18_n834TipDefDsc
            }
            , new Object[] {
            P05DG19_A3072ArtObsLon, P05DG19_n3072ArtObsLon, P05DG19_A65ArtCod, P05DG19_A252CliCod, P05DG19_A396EmprCod
            }
            , new Object[] {
            P05DG20_A602MaqCod, P05DG20_A396EmprCod, P05DG20_A5950MaqDteCol, P05DG20_n5950MaqDteCol
            }
            , new Object[] {
            P05DG21_A602MaqCod, P05DG21_A396EmprCod, P05DG21_A606MaqDsc, P05DG21_n606MaqDsc, P05DG21_A2391MaqMicro, P05DG21_n2391MaqMicro, P05DG21_A3598MaqNroTub, P05DG21_n3598MaqNroTub
            }
            , new Object[] {
            P05DG22_A10887Cod_Idtx, P05DG22_A10888Dsc_Idtx, P05DG22_n10888Dsc_Idtx, P05DG22_A396EmprCod
            }
            , new Object[] {
            P05DG23_A361DisCod, P05DG23_A396EmprCod, P05DG23_A13214DisNormSt, P05DG23_A13213DisNormID
            }
            , new Object[] {
            P05DG24_A361DisCod, P05DG24_A396EmprCod, P05DG24_A13216DisNormDsc, P05DG24_n13216DisNormDsc, P05DG24_A13213DisNormID
            }
            , new Object[] {
            P05DG25_A831TipColCod, P05DG25_A483ForColNum, P05DG25_A482ForColNom, P05DG25_A494ForSer, P05DG25_A252CliCod, P05DG25_A396EmprCod, P05DG25_A649ObsForTxt, P05DG25_A650ObsLin
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

   private byte AV179BarCodReo ;
   private byte AV221Copias ;
   private byte AV469Carvitin ;
   private byte AV262Gavim ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte AV350TipColCod ;
   private byte AV347Tinamar ;
   private byte AV247FlagEnd ;
   private byte AV270I ;
   private byte A376DisObsLin ;
   private byte AV440MinPar1 ;
   private byte A1273RecLinPro ;
   private byte AV279JPF ;
   private byte AV240erfoc ;
   private byte AV214Colorante ;
   private byte AV324RecAca ;
   private byte AV340Tejido ;
   private byte AV479acabats2013 ;
   private byte AV312NumCam ;
   private byte AV376ImpCabProductos ;
   private byte AV453SegundaDesc ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte AV250FlagImp ;
   private byte AV487undcaps ;
   private byte AV486Tq ;
   private byte AV471textoManual ;
   private byte AV253FlagObs ;
   private byte AV489acabats ;
   private byte AV242Flag_Agr ;
   private byte A124BarAgrReo ;
   private byte AV336Serzedelo ;
   private byte AV304Moda21 ;
   private byte GXv_int6[] ;
   private byte GXv_int18[] ;
   private byte AV271Imp_agrup ;
   private byte AV337Sin_dec ;
   private byte AV249Flagidioma ;
   private byte AV201Carvema ;
   private byte AV273ImpLote ;
   private byte AV241Flag ;
   private byte AV243FlagBar ;
   private byte AV245FlagCod ;
   private byte AV248FlagEtm ;
   private byte AV252FlagNline ;
   private byte AV255FlagTtx ;
   private byte AV274indutexma ;
   private byte AV210Code128 ;
   private byte AV303MaxAgr ;
   private byte AV171Artemalha ;
   private byte AV290Lote01 ;
   private byte AV468normasintegridad ;
   private byte GXt_int27 ;
   private byte A545HisCodReo ;
   private byte AV291lotes ;
   private byte GXv_int20[] ;
   private byte AV310NTubos ;
   private byte A2391MaqMicro ;
   private byte A3598MaqNroTub ;
   private byte AV300MaqMicro ;
   private byte AV488nocabecera ;
   private byte A831TipColCod ;
   private short gxcookieaux ;
   private short AV327RecLinMaq ;
   private short A4466BarAcaAnh ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A199BarPie1 ;
   private short AV437Hhpar1 ;
   private short AV438Hhpar2 ;
   private short AV282Lenvar ;
   private short AV301MatCod ;
   private short GXv_int4[] ;
   private short AV212CodSol ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A1503BarPart ;
   private short A1226BarGraCru ;
   private short A3137BarGraAca2 ;
   private short A1909BarGraAca ;
   private short A126BarAncAca2 ;
   private short A125BarAncAca1 ;
   private short AV180BarGraAca ;
   private short AV330RelBany ;
   private short AV345Tiempos[] ;
   private short A771ProForTie ;
   private short AV318Pml ;
   private short AV191BarPes ;
   private short A772ProForTmx ;
   private short A13937RecLotAlm ;
   private short A13968PrdCantAtM ;
   private short A5257RecLinObs ;
   private short AV314NumHdrs ;
   private short AV307NMaxAg ;
   private short cV307NMaxAg ;
   private short A671PieAgr ;
   private short AV190Barpart ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short GXv_int11[] ;
   private short A650ObsLin ;
   private short Gx_err ;
   private int AV177BarCod ;
   private int AV373Volumen ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV476DisCod ;
   private int AV206Cliente ;
   private int AV258ForColNum ;
   private int AV192BarPie ;
   private int GX_I ;
   private int AV185barmaccod ;
   private int AV313NumCli ;
   private int A5109RecNumInt ;
   private int A220BarTotPie ;
   private int A813RecTotPie ;
   private int AV295MacCod ;
   private int AV317Partida ;
   private int AV203CliCod ;
   private int AV292Lts1 ;
   private int AV293Lts2 ;
   private int AV371VolProd ;
   private int AV370VolCor ;
   private int AV236Dosea ;
   private int A2392ProNumPro ;
   private int A4697RecNroPrg ;
   private int A2393ProNumRec ;
   private int A1251RecNumRec ;
   private int AV322ProNumPro ;
   private int AV323Pronumrec ;
   private int Gx_OldLine ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int AV325Reccod ;
   private int GXv_int17[] ;
   private int AV445BarPieagr ;
   private int GXv_int16[] ;
   private int GXv_int3[] ;
   private int GXt_int28 ;
   private int A539HisBarCod ;
   private int GXv_int24[] ;
   private int AV167Albreccod ;
   private int GXv_int21[] ;
   private int A5950MaqDteCol ;
   private int A483ForColNum ;
   private long AV354TotTiempo ;
   private long c771ProForTie ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV183BarKgm ;
   private java.math.BigDecimal AV188BarMtr ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV226Coste2 ;
   private java.math.BigDecimal A3006BarCoef ;
   private java.math.BigDecimal A3735BarPieKgl ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV281Largura ;
   private java.math.BigDecimal AV346TiempoV ;
   private java.math.BigDecimal AV263GrMlin ;
   private java.math.BigDecimal AV216CompTP ;
   private java.math.BigDecimal AV480Kgm ;
   private java.math.BigDecimal AV481totkgm ;
   private java.math.BigDecimal AV353Tot_kgs ;
   private java.math.BigDecimal AV215CompCamar ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal AV442Faccon ;
   private java.math.BigDecimal AV433Cant ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV305MtrAgr ;
   private java.math.BigDecimal AV443BarKgmAgr ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal AV444BarMtrAgr ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV239EmprCod ;
   private String AV178BarCodPar ;
   private String AV186BarMaqCod ;
   private String AV195BarSua ;
   private String AV272ImpCod ;
   private String AV484lit999 ;
   private String AV400Lit3 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV308NomEmp ;
   private String AV341Termin ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV342TermUsu ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A2829BarProPer ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A1431BarLocDis ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A365DisDes ;
   private String AV260ForSer ;
   private String AV257ForColNom ;
   private String AV335Serie ;
   private String AV343Texto_r ;
   private String AV237DSCCAUSA ;
   private String AV460Tb1_dscfb ;
   private String AV461DisEnt ;
   private String AV467Cod_Idtx ;
   private String AV466Dsc_Idtx ;
   private String AV316Obstxt[] ;
   private String A377DisObsTxt ;
   private String AV452BarEnccli ;
   private String AV168Albrloc ;
   private String AV432Lit99 ;
   private String AV184barlocdis ;
   private String AV348TipArtDsc ;
   private String AV365VCompo ;
   private String AV441Ceros2 ;
   private String AV435Hhalfa ;
   private String AV439MinAlfa ;
   private String AV434HhMmt ;
   private String AV277Intens ;
   private String AV302Matiz ;
   private String AV349TipCol ;
   private String AV352Tonalidad ;
   private String AV261ForTonal ;
   private String AV238DscSol ;
   private String AV296Macprocod ;
   private String AV259ForNomcli3 ;
   private String A872RecPrdNum ;
   private String AV473MoAColorantes ;
   private String AV230DesCol ;
   private String AV231DesInt ;
   private String A206BarPle ;
   private String A118BarAcaQui ;
   private String A602MaqCod ;
   private String A4609BarMdlCod ;
   private String A9775BarItem1 ;
   private String A9777BarItem3 ;
   private String A120BarAgrEst ;
   private String A2454BarGirar ;
   private String A5058BarEnvLaw ;
   private String A4868RecUsrMod ;
   private String A4402RecUsrCod ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String A5110RecNumPrg ;
   private String AV464RecUsrCod ;
   private String AV176BarCal ;
   private String AV228DesAcaqui ;
   private String AV193BarPle ;
   private String AV328RecNumPrg ;
   private String AV297MacProDsc ;
   private String AV299MaqCod ;
   private String AV187BarMdlcod ;
   private String AV181Baritem1 ;
   private String AV182BarItem3 ;
   private String AV285Litnop ;
   private String AV286Litnov ;
   private String AV426Lit53 ;
   private String AV170ArtCod ;
   private String AV220ContDsc ;
   private String AV377Lit0 ;
   private String AV331Remonta ;
   private String AV416Lit44 ;
   private String AV320Procesos[] ;
   private String A764ProForCod ;
   private String AV269HojRut ;
   private String AV264Hdr ;
   private String AV202ceros8 ;
   private String AV267HdrAlfa ;
   private String AV298MaqCdb ;
   private String AV294M ;
   private String AV311Num_int ;
   private String AV284LinMaq ;
   private String A766ProForDsc ;
   private String AV321Proforcod ;
   private String AV406Lit35 ;
   private String AV407Lit36 ;
   private String AV408Lit37 ;
   private String AV402Lit31 ;
   private String AV404Lit33 ;
   private String AV454Lit62 ;
   private String AV405Lit34 ;
   private String A719PrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String A1643PrdTip ;
   private String A14055RecManAut ;
   private String A12641RecPrdDc2 ;
   private String AV462CodeBar1 ;
   private String AV463LineaProducto ;
   private String AV459TipoProducto ;
   private String AV375Und1 ;
   private String AV358Unidades ;
   private String AV326RecForNro ;
   private String AV483AlmPrdDsc ;
   private String AV374Reclote ;
   private String AV472MoA ;
   private String A5258RecTxtObs ;
   private String AV409Lit38 ;
   private String A122BarAgrPar ;
   private String A1507BarAgrDsc ;
   private String A1245BarAgrSer ;
   private String AV265Hdr_a ;
   private String AV208CliNom_a ;
   private String AV166Agrdsc ;
   private String AV421Lit49 ;
   private String AV287Litpda ;
   private String AV289LocAlbr ;
   private String AV446BarAgrSer ;
   private String GXv_char10[] ;
   private String AV447Barcolnomagr ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String AV450barserdscAgr ;
   private String AV415Lit43 ;
   private String AV410Lit39 ;
   private String AV413Lit41 ;
   private String AV381Lit12 ;
   private String AV414Lit42 ;
   private String AV458Lit66 ;
   private String AV361Var3 ;
   private String AV411Lit4 ;
   private String AV422Lit5 ;
   private String AV427Lit6 ;
   private String AV429Lit7 ;
   private String AV430Lit8 ;
   private String AV431Lit9 ;
   private String AV379Lit10 ;
   private String AV380Lit11 ;
   private String AV382Lit13 ;
   private String AV383Lit14 ;
   private String AV384Lit15 ;
   private String AV385Lit16 ;
   private String AV386Lit17 ;
   private String AV387Lit18 ;
   private String AV388Lit19 ;
   private String AV390Lit20 ;
   private String AV391Lit21 ;
   private String AV392Lit22 ;
   private String AV393Lit23 ;
   private String AV394Lit24 ;
   private String AV395Lit25 ;
   private String AV396Lit26 ;
   private String AV397Lit27 ;
   private String AV398Lit28 ;
   private String AV399Lit29 ;
   private String AV401Lit30 ;
   private String AV403Lit32 ;
   private String AV412Lit40 ;
   private String AV417Lit45 ;
   private String AV418Lit46 ;
   private String AV419Lit47 ;
   private String AV420Lit48 ;
   private String AV423Lit50 ;
   private String AV424Lit51 ;
   private String AV425Lit52 ;
   private String AV428Lit60 ;
   private String AV455Lit63 ;
   private String AV456Lit64 ;
   private String AV457Lit65 ;
   private String GXt_char1 ;
   private String A544HisCodPar ;
   private String A5086DscCausa ;
   private String A834TipDefDsc ;
   private String A65ArtCod ;
   private String AV169AlbRLote[] ;
   private String GXv_char26[] ;
   private String GXv_char23[] ;
   private String GXv_char13[] ;
   private String AV288Loc ;
   private String GXv_char12[] ;
   private String A606MaqDsc ;
   private String AV229DescMaq ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV474statusgots ;
   private String AV477statusgrs ;
   private String AV478statusocs ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String AV475Normas ;
   private String A13216DisNormDsc ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String Gx_time ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date AV465RecFecAlt ;
   private java.util.Date AV448fec1 ;
   private java.util.Date GXv_date19[] ;
   private java.util.Date AV449fec2 ;
   private java.util.Date GXv_date22[] ;
   private java.util.Date AV451fec3 ;
   private java.util.Date GXv_date25[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n1189TermUsu ;
   private boolean n252CliCod ;
   private boolean n4845BarAudObs ;
   private boolean n217BarTipArt ;
   private boolean GxHdr8 ;
   private boolean n3006BarCoef ;
   private boolean n4866RecFecAlt ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private boolean n719PrdNum ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private boolean n13968PrdCantAtM ;
   private boolean n5258RecTxtObs ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private boolean n834TipDefDsc ;
   private boolean n3072ArtObsLon ;
   private boolean n5950MaqDteCol ;
   private boolean n606MaqDsc ;
   private boolean n2391MaqMicro ;
   private boolean n3598MaqNroTub ;
   private boolean n10888Dsc_Idtx ;
   private boolean n13216DisNormDsc ;
   private String AV173ArtObslon ;
   private String A3072ArtObsLon ;
   private String A4845BarAudObs ;
   private String AV175Baraudobs ;
   private String A11662BarOrdComp ;
   private IDataStoreProvider pr_default ;
   private String[] P05DG2_A396EmprCod ;
   private String[] P05DG2_A407EmprNom ;
   private boolean[] P05DG2_n407EmprNom ;
   private String[] P05DG3_A942TermCod ;
   private String[] P05DG3_A1189TermUsu ;
   private boolean[] P05DG3_n1189TermUsu ;
   private String[] P05DG5_A130BarCodPar ;
   private byte[] P05DG5_A132BarCodReo ;
   private int[] P05DG5_A129BarCod ;
   private int[] P05DG5_A361DisCod ;
   private String[] P05DG5_A396EmprCod ;
   private int[] P05DG5_A252CliCod ;
   private boolean[] P05DG5_n252CliCod ;
   private String[] P05DG5_A212BarSer ;
   private String[] P05DG5_A135BarColNom ;
   private int[] P05DG5_A136BarColNum ;
   private byte[] P05DG5_A218BarTipCol ;
   private String[] P05DG5_A1652BarSerDsc ;
   private short[] P05DG5_A4466BarAcaAnh ;
   private String[] P05DG5_A2829BarProPer ;
   private byte[] P05DG5_A148BarEstReo ;
   private String[] P05DG5_A143BarDisNum ;
   private String[] P05DG5_A4812BarEncCli ;
   private String[] P05DG5_A1431BarLocDis ;
   private String[] P05DG5_A4845BarAudObs ;
   private boolean[] P05DG5_n4845BarAudObs ;
   private short[] P05DG5_A217BarTipArt ;
   private boolean[] P05DG5_n217BarTipArt ;
   private short[] P05DG5_A224BarTraP1 ;
   private String[] P05DG5_A221BarTra1 ;
   private short[] P05DG5_A225BarTraP2 ;
   private String[] P05DG5_A222BarTra2 ;
   private short[] P05DG5_A226BarTraP3 ;
   private String[] P05DG5_A223BarTra3 ;
   private java.math.BigDecimal[] P05DG5_A166BarKgm ;
   private java.math.BigDecimal[] P05DG5_A184BarMtr ;
   private short[] P05DG5_A199BarPie1 ;
   private String[] P05DG5_A365DisDes ;
   private int[] P05DG5_A898BarPieNDes ;
   private String[] P05DG6_A396EmprCod ;
   private int[] P05DG6_A361DisCod ;
   private String[] P05DG6_A377DisObsTxt ;
   private byte[] P05DG6_A376DisObsLin ;
   private long[] P05DG7_A771ProForTie ;
   private String[] P05DG8_A872RecPrdNum ;
   private short[] P05DG8_A2804RecLinMaq ;
   private String[] P05DG8_A130BarCodPar ;
   private byte[] P05DG8_A132BarCodReo ;
   private int[] P05DG8_A129BarCod ;
   private String[] P05DG8_A396EmprCod ;
   private java.math.BigDecimal[] P05DG8_A686PrdCant ;
   private short[] P05DG8_A811RecLin ;
   private byte[] P05DG8_A1273RecLinPro ;
   private String[] P05DG11_A130BarCodPar ;
   private byte[] P05DG11_A132BarCodReo ;
   private String[] P05DG11_A396EmprCod ;
   private int[] P05DG11_A129BarCod ;
   private short[] P05DG11_A2804RecLinMaq ;
   private int[] P05DG11_A361DisCod ;
   private String[] P05DG11_A206BarPle ;
   private String[] P05DG11_A118BarAcaQui ;
   private String[] P05DG11_A602MaqCod ;
   private short[] P05DG11_A1503BarPart ;
   private String[] P05DG11_A4609BarMdlCod ;
   private String[] P05DG11_A9775BarItem1 ;
   private String[] P05DG11_A9777BarItem3 ;
   private byte[] P05DG11_A148BarEstReo ;
   private java.math.BigDecimal[] P05DG11_A3006BarCoef ;
   private boolean[] P05DG11_n3006BarCoef ;
   private short[] P05DG11_A1226BarGraCru ;
   private java.math.BigDecimal[] P05DG11_A3735BarPieKgl ;
   private String[] P05DG11_A120BarAgrEst ;
   private java.math.BigDecimal[] P05DG11_A4259RecTotKgs ;
   private int[] P05DG11_A5109RecNumInt ;
   private String[] P05DG11_A2454BarGirar ;
   private String[] P05DG11_A5058BarEnvLaw ;
   private java.util.Date[] P05DG11_A4866RecFecAlt ;
   private boolean[] P05DG11_n4866RecFecAlt ;
   private java.util.Date[] P05DG11_A4867RecFecMod ;
   private boolean[] P05DG11_n4867RecFecMod ;
   private String[] P05DG11_A4868RecUsrMod ;
   private boolean[] P05DG11_n4868RecUsrMod ;
   private String[] P05DG11_A4402RecUsrCod ;
   private String[] P05DG11_A1234BarNomCli ;
   private byte[] P05DG11_A218BarTipCol ;
   private int[] P05DG11_A136BarColNum ;
   private String[] P05DG11_A135BarColNom ;
   private short[] P05DG11_A3137BarGraAca2 ;
   private short[] P05DG11_A1909BarGraAca ;
   private short[] P05DG11_A126BarAncAca2 ;
   private short[] P05DG11_A125BarAncAca1 ;
   private String[] P05DG11_A1652BarSerDsc ;
   private String[] P05DG11_A212BarSer ;
   private String[] P05DG11_A279CliNom ;
   private int[] P05DG11_A252CliCod ;
   private boolean[] P05DG11_n252CliCod ;
   private String[] P05DG11_A11662BarOrdComp ;
   private String[] P05DG11_A5110RecNumPrg ;
   private java.math.BigDecimal[] P05DG11_A2806RecFA ;
   private java.math.BigDecimal[] P05DG11_A184BarMtr ;
   private java.math.BigDecimal[] P05DG11_A870BarTotMtr ;
   private short[] P05DG11_A199BarPie1 ;
   private String[] P05DG11_A365DisDes ;
   private int[] P05DG11_A898BarPieNDes ;
   private int[] P05DG11_A220BarTotPie ;
   private java.math.BigDecimal[] P05DG11_A166BarKgm ;
   private java.math.BigDecimal[] P05DG11_A219BarTotAgr ;
   private String[] P05DG12_A396EmprCod ;
   private int[] P05DG12_A129BarCod ;
   private byte[] P05DG12_A132BarCodReo ;
   private String[] P05DG12_A130BarCodPar ;
   private short[] P05DG12_A2804RecLinMaq ;
   private String[] P05DG12_A764ProForCod ;
   private short[] P05DG12_A771ProForTie ;
   private byte[] P05DG12_A1273RecLinPro ;
   private String[] P05DG13_A396EmprCod ;
   private int[] P05DG13_A129BarCod ;
   private byte[] P05DG13_A132BarCodReo ;
   private String[] P05DG13_A130BarCodPar ;
   private byte[] P05DG13_A1273RecLinPro ;
   private short[] P05DG13_A2804RecLinMaq ;
   private int[] P05DG13_A2392ProNumPro ;
   private int[] P05DG13_A4697RecNroPrg ;
   private int[] P05DG13_A2393ProNumRec ;
   private int[] P05DG13_A1251RecNumRec ;
   private String[] P05DG13_A764ProForCod ;
   private short[] P05DG13_A772ProForTmx ;
   private short[] P05DG13_A771ProForTie ;
   private String[] P05DG13_A766ProForDsc ;
   private String[] P05DG14_A719PrdNum ;
   private boolean[] P05DG14_n719PrdNum ;
   private String[] P05DG14_A396EmprCod ;
   private int[] P05DG14_A129BarCod ;
   private byte[] P05DG14_A132BarCodReo ;
   private String[] P05DG14_A130BarCodPar ;
   private short[] P05DG14_A2804RecLinMaq ;
   private byte[] P05DG14_A1273RecLinPro ;
   private String[] P05DG14_A875RecPrdDsc ;
   private String[] P05DG14_A872RecPrdNum ;
   private String[] P05DG14_A488ForPrdDsc ;
   private boolean[] P05DG14_n488ForPrdDsc ;
   private byte[] P05DG14_A490ForPrdUMe ;
   private boolean[] P05DG14_n490ForPrdUMe ;
   private java.math.BigDecimal[] P05DG14_A686PrdCant ;
   private byte[] P05DG14_A2394RecForNro ;
   private byte[] P05DG14_A3274RecPrdTnq ;
   private short[] P05DG14_A13937RecLotAlm ;
   private String[] P05DG14_A5725RecLote ;
   private java.math.BigDecimal[] P05DG14_A431FacCon ;
   private String[] P05DG14_A1643PrdTip ;
   private short[] P05DG14_A13968PrdCantAtM ;
   private boolean[] P05DG14_n13968PrdCantAtM ;
   private String[] P05DG14_A14055RecManAut ;
   private String[] P05DG14_A12641RecPrdDc2 ;
   private short[] P05DG14_A811RecLin ;
   private String[] P05DG15_A396EmprCod ;
   private int[] P05DG15_A129BarCod ;
   private byte[] P05DG15_A132BarCodReo ;
   private String[] P05DG15_A130BarCodPar ;
   private short[] P05DG15_A2804RecLinMaq ;
   private String[] P05DG15_A5258RecTxtObs ;
   private boolean[] P05DG15_n5258RecTxtObs ;
   private short[] P05DG15_A5257RecLinObs ;
   private short[] P05DG16_AV307NMaxAg ;
   private String[] P05DG17_A130BarCodPar ;
   private byte[] P05DG17_A132BarCodReo ;
   private int[] P05DG17_A129BarCod ;
   private String[] P05DG17_A396EmprCod ;
   private java.math.BigDecimal[] P05DG17_A590KgmAgr ;
   private String[] P05DG17_A122BarAgrPar ;
   private byte[] P05DG17_A124BarAgrReo ;
   private int[] P05DG17_A119BarAgrCod ;
   private int[] P05DG17_A1508CliCodAgr ;
   private String[] P05DG17_A1507BarAgrDsc ;
   private String[] P05DG17_A1245BarAgrSer ;
   private java.math.BigDecimal[] P05DG17_A869MtrAgr ;
   private short[] P05DG17_A671PieAgr ;
   private short[] P05DG18_A833TipDefCod ;
   private short[] P05DG18_A5085CodCausa ;
   private boolean[] P05DG18_n5085CodCausa ;
   private String[] P05DG18_A544HisCodPar ;
   private byte[] P05DG18_A545HisCodReo ;
   private int[] P05DG18_A539HisBarCod ;
   private String[] P05DG18_A396EmprCod ;
   private String[] P05DG18_A5086DscCausa ;
   private boolean[] P05DG18_n5086DscCausa ;
   private String[] P05DG18_A834TipDefDsc ;
   private boolean[] P05DG18_n834TipDefDsc ;
   private String[] P05DG19_A3072ArtObsLon ;
   private boolean[] P05DG19_n3072ArtObsLon ;
   private String[] P05DG19_A65ArtCod ;
   private int[] P05DG19_A252CliCod ;
   private boolean[] P05DG19_n252CliCod ;
   private String[] P05DG19_A396EmprCod ;
   private String[] P05DG20_A602MaqCod ;
   private String[] P05DG20_A396EmprCod ;
   private int[] P05DG20_A5950MaqDteCol ;
   private boolean[] P05DG20_n5950MaqDteCol ;
   private String[] P05DG21_A602MaqCod ;
   private String[] P05DG21_A396EmprCod ;
   private String[] P05DG21_A606MaqDsc ;
   private boolean[] P05DG21_n606MaqDsc ;
   private byte[] P05DG21_A2391MaqMicro ;
   private boolean[] P05DG21_n2391MaqMicro ;
   private byte[] P05DG21_A3598MaqNroTub ;
   private boolean[] P05DG21_n3598MaqNroTub ;
   private String[] P05DG22_A10887Cod_Idtx ;
   private String[] P05DG22_A10888Dsc_Idtx ;
   private boolean[] P05DG22_n10888Dsc_Idtx ;
   private String[] P05DG22_A396EmprCod ;
   private int[] P05DG23_A361DisCod ;
   private String[] P05DG23_A396EmprCod ;
   private String[] P05DG23_A13214DisNormSt ;
   private String[] P05DG23_A13213DisNormID ;
   private int[] P05DG24_A361DisCod ;
   private String[] P05DG24_A396EmprCod ;
   private String[] P05DG24_A13216DisNormDsc ;
   private boolean[] P05DG24_n13216DisNormDsc ;
   private String[] P05DG24_A13213DisNormID ;
   private byte[] P05DG25_A831TipColCod ;
   private int[] P05DG25_A483ForColNum ;
   private String[] P05DG25_A482ForColNom ;
   private String[] P05DG25_A494ForSer ;
   private int[] P05DG25_A252CliCod ;
   private boolean[] P05DG25_n252CliCod ;
   private String[] P05DG25_A396EmprCod ;
   private String[] P05DG25_A649ObsForTxt ;
   private short[] P05DG25_A650ObsLin ;
}

final  class ptintrecipe__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DG2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DG3", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DG5", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarSerDsc, T1.BarAcaAnh, T1.BarProPer, T1.BarEstReo, T1.BarDisNum, T1.BarEncCli, T1.BarLocDis, T1.BarAudObs, T1.BarTipArt, T1.BarTraP1, T1.BarTra1, T1.BarTraP2, T1.BarTra2, T1.BarTraP3, T1.BarTra3, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DG6", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG7", "SELECT SUM(T2.ProForTie) FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG8", "SELECT RecPrdNum, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, PrdCant, RecLin, RecLinPro FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (SUBSTR(RecPrdNum, 1, 2) >= '10' and SUBSTR(RecPrdNum, 1, 2) <= '79') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG11", "SELECT T1.BarCodPar, T1.BarCodReo, T1.EmprCod, T1.BarCod, T1.RecLinMaq, T2.DisCod, T2.BarPle, T2.BarAcaQui, T1.MaqCod, T2.BarPart, T2.BarMdlCod, T2.BarItem1, T2.BarItem3, T2.BarEstReo, T2.BarCoef, T2.BarGraCru, T2.BarPieKgl, T2.BarAgrEst, T1.RecTotKgs, T1.RecNumInt, T2.BarGirar, T2.BarEnvLaw, T1.RecFecAlt, T1.RecFecMod, T1.RecUsrMod, T1.RecUsrCod, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarGraAca2, T2.BarGraAca, T2.BarAncAca2, T2.BarAncAca1, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T2.BarOrdComp, T1.RecNumPrg, T1.RecFA, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T4.BarTotMtr, 0) AS BarTotMtr, COALESCE( T5.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes, COALESCE( T4.BarTotPie, 0) AS BarTotPie, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(PieAgr) AS BarTotPie, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DG12", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.ProForCod, T2.ProForTie, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG13", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinPro, T1.RecLinMaq, T2.ProNumPro, T1.RecNroPrg, T2.ProNumRec, T1.RecNumRec, T1.ProForCod, T2.ProForTmx, T2.ProForTie, T2.ProForDsc FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG14", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecPrdDsc, T1.RecPrdNum, T3.ForPrdDsc, T1.ForPrdUMe, T1.PrdCant, T1.RecForNro, T1.RecPrdTnq, T1.RecLotAlm, T1.RecLote, T1.FacCon, T2.PrdTip, T2.PrdCantAtM, T1.RecManAut, T1.RecPrdDc2, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG15", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecTxtObs, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG16", "SELECT COUNT(*) FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG17", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, CliCodAgr, BarAgrDsc, BarAgrSer, MtrAgr, PieAgr FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG18", "SELECT T1.TipDefCod, T1.CodCausa, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.EmprCod, T3.DscCausa, T2.TipDefDsc FROM ((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) WHERE T1.EmprCod = ? and T1.HisBarCod = ? and T1.HisCodReo = ? and T1.HisCodPar = ? ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG19", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DG20", "SELECT MaqCod, EmprCod, MaqDteCol FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DG21", "SELECT MaqCod, EmprCod, MaqDsc, MaqMicro, MaqNroTub FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05DG22", "SELECT Cod_Idtx, Dsc_Idtx, EmprCod FROM TXPINDITE WHERE Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG23", "SELECT DisCod, EmprCod, DisNormSt, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG24", "SELECT T1.DisCod, T1.EmprCod, T2.NormaDsc AS DisNormDsc, T1.DisNormID AS DisNormID FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05DG25", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 10);
               ((String[]) buf[18])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 4);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((String[]) buf[25])[0] = rslt.getString(23, 4);
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 4);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(27,2);
               ((short[]) buf[30])[0] = rslt.getShort(28);
               ((String[]) buf[31])[0] = rslt.getString(29, 1);
               ((int[]) buf[32])[0] = rslt.getInt(30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(24);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 8);
               ((String[]) buf[30])[0] = rslt.getString(27, 13);
               ((byte[]) buf[31])[0] = rslt.getByte(28);
               ((int[]) buf[32])[0] = rslt.getInt(29);
               ((String[]) buf[33])[0] = rslt.getString(30, 13);
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((short[]) buf[36])[0] = rslt.getShort(33);
               ((short[]) buf[37])[0] = rslt.getShort(34);
               ((String[]) buf[38])[0] = rslt.getString(35, 26);
               ((String[]) buf[39])[0] = rslt.getString(36, 16);
               ((String[]) buf[40])[0] = rslt.getString(37, 30);
               ((int[]) buf[41])[0] = rslt.getInt(38);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(39);
               ((String[]) buf[44])[0] = rslt.getString(40, 6);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(43,2);
               ((short[]) buf[48])[0] = rslt.getShort(44);
               ((String[]) buf[49])[0] = rslt.getString(45, 1);
               ((int[]) buf[50])[0] = rslt.getInt(46);
               ((int[]) buf[51])[0] = rslt.getInt(47);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(48,2);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(49,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 8 :
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
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((String[]) buf[10])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 26);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[20])[0] = rslt.getString(18, 1);
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((String[]) buf[24])[0] = rslt.getString(21, 40);
               ((short[]) buf[25])[0] = rslt.getShort(22);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 13 :
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
            case 14 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               return;
            case 20 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               stmt.setString(1, (String)parms[0], 10);
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 4);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

