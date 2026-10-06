package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pdftinteacabado_impl extends GXWebReport
{
   public pdftinteacabado_impl( com.genexus.internet.HttpContext context )
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
            AV72Maquinastxt = httpContext.GetPar( "Maquinastxt") ;
            AV75MaquinasHdrstxt = httpContext.GetPar( "MaquinasHdrstxt") ;
            AV55NOspMaq = (short)(GXutil.lval( httpContext.GetPar( "NOspMaq"))) ;
            AV76tinte = httpContext.GetPar( "tinte") ;
            AV60NomInf = httpContext.GetPar( "NomInf") ;
            AV78Maquinastxtout = httpContext.GetPar( "Maquinastxtout") ;
            AV9File = httpContext.GetPar( "File") ;
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
      M_bot = 6 ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_int1[0] = AV61Artemalha ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int1) ;
         pdftinteacabado_impl.this.AV61Artemalha = GXv_int1[0] ;
         AV62Lit1 = ((AV61Artemalha==1)||(GXutil.strcmp(AV81Op, httpContext.getMessage( "A", ""))==0) ? httpContext.getMessage( "O.S.", "") : httpContext.getMessage( "Enc.", "")) ;
         new app.creovectormatrizfarchivos(remoteHandle, context).execute( AV72Maquinastxt, AV75MaquinasHdrstxt, AV74Tab_maqIn, AV20MaqHdrs) ;
         new app.creovectorfarchivos(remoteHandle, context).execute( AV78Maquinastxtout, AV57Tab_maqOut) ;
         /* Using cursor P084Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P084Y2_A407EmprNom[0] ;
            n407EmprNom = P084Y2_n407EmprNom[0] ;
            AV16EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV54linea = (short)(0) ;
         AV21x = (short)(1) ;
         AV56NumOs = (short)(1) ;
         while ( AV21x <= 100 )
         {
            AV42MaqDsc = AV20MaqHdrs[AV21x-1][1-1] ;
            if ( (GXutil.strcmp("", AV42MaqDsc)==0) )
            {
               if (true) break;
            }
            AV43ImpMaquina = (byte)(0) ;
            AV22y = (short)(2) ;
            AV56NumOs = (short)(1) ;
            while ( AV22y <= 1000 )
            {
               AV24texto = AV20MaqHdrs[AV21x-1][AV22y-1] ;
               if ( ! (GXutil.strcmp("", AV24texto)==0) )
               {
                  if ( AV56NumOs <= AV55NOspMaq )
                  {
                     AV23Maqcod = GXutil.substring( AV24texto, 59, 6) ;
                     /* Execute user subroutine: 'CONTROLMAQUINAARRAY' */
                     S111 ();
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
                     if ( GXutil.strcmp(AV59OkMq, httpContext.getMessage( "S", "")) == 0 )
                     {
                        AV63Barordlin = (short)(GXutil.lval( GXutil.substring( AV24texto, 65, 4))) ;
                        /* Using cursor P084Y3 */
                        pr_default.execute(1, new Object[] {A396EmprCod, AV23Maqcod});
                        while ( (pr_default.getStatus(1) != 101) )
                        {
                           A602MaqCod = P084Y3_A602MaqCod[0] ;
                           A604MaqCodFor = P084Y3_A604MaqCodFor[0] ;
                           n604MaqCodFor = P084Y3_n604MaqCodFor[0] ;
                           AV52MaqCodFor = A604MaqCodFor ;
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(1);
                        AV25Barcod = (int)(GXutil.lval( GXutil.substring( AV24texto, 27, 8))) ;
                        AV26Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV24texto, 36, 1))) ;
                        AV27Barcodpar = (GXutil.substring( AV24texto, 37, 1)) ;
                        /* Using cursor P084Y6 */
                        pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV25Barcod), Byte.valueOf(AV26Barcodreo), AV27Barcodpar});
                        while ( (pr_default.getStatus(2) != 101) )
                        {
                           A252CliCod = P084Y6_A252CliCod[0] ;
                           n252CliCod = P084Y6_n252CliCod[0] ;
                           A130BarCodPar = P084Y6_A130BarCodPar[0] ;
                           A132BarCodReo = P084Y6_A132BarCodReo[0] ;
                           A129BarCod = P084Y6_A129BarCod[0] ;
                           A1234BarNomCli = P084Y6_A1234BarNomCli[0] ;
                           A135BarColNom = P084Y6_A135BarColNom[0] ;
                           A143BarDisNum = P084Y6_A143BarDisNum[0] ;
                           A4812BarEncCli = P084Y6_A4812BarEncCli[0] ;
                           A279CliNom = P084Y6_A279CliNom[0] ;
                           A120BarAgrEst = P084Y6_A120BarAgrEst[0] ;
                           A1652BarSerDsc = P084Y6_A1652BarSerDsc[0] ;
                           A166BarKgm = P084Y6_A166BarKgm[0] ;
                           A219BarTotAgr = P084Y6_A219BarTotAgr[0] ;
                           n219BarTotAgr = P084Y6_n219BarTotAgr[0] ;
                           A279CliNom = P084Y6_A279CliNom[0] ;
                           A166BarKgm = P084Y6_A166BarKgm[0] ;
                           A219BarTotAgr = P084Y6_A219BarTotAgr[0] ;
                           n219BarTotAgr = P084Y6_n219BarTotAgr[0] ;
                           if ( A219BarTotAgr.doubleValue() != 0 )
                           {
                              A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
                           }
                           else
                           {
                              A812RecTotKgm = A166BarKgm ;
                           }
                           AV28hdr = GXutil.str( AV25Barcod, 8, 0) + "-" + GXutil.str( AV26Barcodreo, 1, 0) + AV27Barcodpar ;
                           AV40Barcolnom = ((AV61Artemalha==1) ? GXutil.trim( A135BarColNom) : GXutil.trim( A1234BarNomCli)) ;
                           AV41BarEnccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? GXutil.trim( A143BarDisNum) : GXutil.trim( A4812BarEncCli)) ;
                           AV41BarEnccli = ((AV61Artemalha==1)||(GXutil.strcmp(AV81Op, httpContext.getMessage( "A", ""))==0) ? GXutil.str( A129BarCod, 8, 0)+"-"+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar : AV41BarEnccli) ;
                           AV44Kilos = A166BarKgm ;
                           AV45Kilost = A812RecTotKgm ;
                           AV48Nlineas = (short)(1) ;
                           AV46BarNot1 = " " ;
                           AV47Barnot2 = " " ;
                           AV64Barnot3 = " " ;
                           AV67BarNot4 = " " ;
                           AV68Barnot5 = " " ;
                           AV69Barnot6 = " " ;
                           if ( GXutil.strcmp(AV81Op, httpContext.getMessage( "T", "")) == 0 )
                           {
                              GX_I = 1 ;
                              while ( GX_I <= 100 )
                              {
                                 AV65TabNotas[GX_I-1] = " " ;
                                 GX_I = (int)(GX_I+1) ;
                              }
                              AV66d = (short)(1) ;
                              /* Using cursor P084Y7 */
                              pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                              while ( (pr_default.getStatus(3) != 101) )
                              {
                                 A187BarNotDsc = P084Y7_A187BarNotDsc[0] ;
                                 A188BarNotLin = P084Y7_A188BarNotLin[0] ;
                                 AV65TabNotas[AV66d-1] = GXutil.substring( A187BarNotDsc, 1, 40) ;
                                 if ( GXutil.strcmp(GXutil.rtrim( GXutil.substring( A187BarNotDsc, 41, 25)), " ") != 0 )
                                 {
                                    AV66d = (short)(AV66d+1) ;
                                    AV65TabNotas[AV66d-1] = GXutil.substring( A187BarNotDsc, 41, 25) ;
                                 }
                                 if ( AV48Nlineas == 1 )
                                 {
                                    AV46BarNot1 = GXutil.substring( A187BarNotDsc, 1, 40) ;
                                    AV47Barnot2 = GXutil.rtrim( GXutil.substring( A187BarNotDsc, 41, 25)) ;
                                    AV47Barnot2 = GXutil.trim( AV47Barnot2) ;
                                 }
                                 if ( AV48Nlineas == 2 )
                                 {
                                    AV47Barnot2 = ((GXutil.strcmp("", AV47Barnot2)==0) ? GXutil.substring( A187BarNotDsc, 1, 40) : AV47Barnot2) ;
                                 }
                                 AV48Nlineas = (short)(AV48Nlineas+1) ;
                                 AV66d = (short)(AV66d+1) ;
                                 pr_default.readNext(3);
                              }
                              pr_default.close(3);
                              AV46BarNot1 = ((GXutil.strcmp(AV65TabNotas[1-1], " ")!=0) ? AV65TabNotas[1-1] : AV46BarNot1) ;
                              AV47Barnot2 = ((GXutil.strcmp(AV65TabNotas[2-1], " ")!=0) ? AV65TabNotas[2-1] : AV47Barnot2) ;
                              AV64Barnot3 = ((GXutil.strcmp(AV65TabNotas[3-1], " ")!=0) ? AV65TabNotas[3-1] : AV64Barnot3) ;
                              AV67BarNot4 = ((GXutil.strcmp(AV65TabNotas[4-1], " ")!=0) ? AV65TabNotas[4-1] : AV67BarNot4) ;
                              AV68Barnot5 = ((GXutil.strcmp(AV65TabNotas[5-1], " ")!=0) ? AV65TabNotas[5-1] : AV68Barnot5) ;
                              AV69Barnot6 = ((GXutil.strcmp(AV65TabNotas[6-1], " ")!=0) ? AV65TabNotas[6-1] : AV69Barnot6) ;
                           }
                           else
                           {
                              /* Using cursor P084Y8 */
                              pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV63Barordlin)});
                              while ( (pr_default.getStatus(4) != 101) )
                              {
                                 A194BarOrdLin = P084Y8_A194BarOrdLin[0] ;
                                 A9842BarObsF = P084Y8_A9842BarObsF[0] ;
                                 n9842BarObsF = P084Y8_n9842BarObsF[0] ;
                                 A758ProCod = P084Y8_A758ProCod[0] ;
                                 AV46BarNot1 = GXutil.substring( A9842BarObsF, 1, 40) ;
                                 AV47Barnot2 = GXutil.substring( A9842BarObsF, 41, 25) ;
                                 pr_default.readNext(4);
                              }
                              pr_default.close(4);
                           }
                           GXv_char2[0] = A396EmprCod ;
                           GXv_int3[0] = A129BarCod ;
                           GXv_int1[0] = A132BarCodReo ;
                           GXv_char4[0] = A130BarCodPar ;
                           GXv_int5[0] = AV49BarFasEst ;
                           GXv_date6[0] = AV50fecha ;
                           GXv_char7[0] = AV51Maqcodbis ;
                           new app.pplat07(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_int5, GXv_date6, GXv_char7) ;
                           pdftinteacabado_impl.this.A396EmprCod = GXv_char2[0] ;
                           pdftinteacabado_impl.this.A129BarCod = GXv_int3[0] ;
                           pdftinteacabado_impl.this.A132BarCodReo = GXv_int1[0] ;
                           pdftinteacabado_impl.this.A130BarCodPar = GXv_char4[0] ;
                           pdftinteacabado_impl.this.AV49BarFasEst = GXv_int5[0] ;
                           pdftinteacabado_impl.this.AV50fecha = GXv_date6[0] ;
                           pdftinteacabado_impl.this.AV51Maqcodbis = GXv_char7[0] ;
                           AV53Clinom = GXutil.substring( A279CliNom, 1, 25) ;
                           if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV81Op, httpContext.getMessage( "A", "")) != 0 ) )
                           {
                              if ( AV22y == 2 )
                              {
                                 if ( AV49BarFasEst == 1 )
                                 {
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 else
                                 {
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV47Barnot2, "") != 0 )
                                 {
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    AV54linea = (short)(AV54linea+1) ;
                                 }
                                 if ( GXutil.strcmp(AV64Barnot3, "") != 0 )
                                 {
                                    AV70Barnot = AV64Barnot3 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV67BarNot4, "") != 0 )
                                 {
                                    AV70Barnot = AV67BarNot4 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV68Barnot5, "") != 0 )
                                 {
                                    AV70Barnot = AV68Barnot5 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV69Barnot6, "") != 0 )
                                 {
                                    AV70Barnot = AV69Barnot6 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 /* Using cursor P084Y9 */
                                 pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                 while ( (pr_default.getStatus(5) != 101) )
                                 {
                                    A122BarAgrPar = P084Y9_A122BarAgrPar[0] ;
                                    A124BarAgrReo = P084Y9_A124BarAgrReo[0] ;
                                    A119BarAgrCod = P084Y9_A119BarAgrCod[0] ;
                                    AV28hdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                                    GXv_char7[0] = A396EmprCod ;
                                    GXv_int3[0] = A119BarAgrCod ;
                                    GXv_int5[0] = A124BarAgrReo ;
                                    GXv_char4[0] = A122BarAgrPar ;
                                    GXv_decimal8[0] = AV30BarKgmAgr ;
                                    GXv_decimal9[0] = AV31BarMtrAgr ;
                                    GXv_int10[0] = AV32BarPieagr ;
                                    GXv_char2[0] = AV33BarAgrSer ;
                                    GXv_char11[0] = AV34Barcolnomagr ;
                                    GXv_int12[0] = 0 ;
                                    GXv_int1[0] = (byte)(0) ;
                                    GXv_char13[0] = "" ;
                                    GXv_date6[0] = AV17Fec1 ;
                                    GXv_int14[0] = (byte)(0) ;
                                    GXv_char15[0] = AV36BarEnccliAgr ;
                                    GXv_char16[0] = "" ;
                                    GXv_int17[0] = 0 ;
                                    GXv_date18[0] = AV38fec2 ;
                                    GXv_char19[0] = "" ;
                                    GXv_char20[0] = AV35barserdscAgr ;
                                    GXv_int21[0] = 0 ;
                                    GXv_date22[0] = AV37fec3 ;
                                    GXv_char23[0] = AV39BarNomcliAgr ;
                                    new app.pinfagr(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_int5, GXv_char4, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char2, GXv_char11, GXv_int12, GXv_int1, GXv_char13, GXv_date6, GXv_int14, GXv_char15, GXv_char16, GXv_int17, GXv_date18, GXv_char19, GXv_char20, GXv_int21, GXv_date22, GXv_char23) ;
                                    pdftinteacabado_impl.this.A396EmprCod = GXv_char7[0] ;
                                    pdftinteacabado_impl.this.A119BarAgrCod = GXv_int3[0] ;
                                    pdftinteacabado_impl.this.A124BarAgrReo = GXv_int5[0] ;
                                    pdftinteacabado_impl.this.A122BarAgrPar = GXv_char4[0] ;
                                    pdftinteacabado_impl.this.AV30BarKgmAgr = GXv_decimal8[0] ;
                                    pdftinteacabado_impl.this.AV31BarMtrAgr = GXv_decimal9[0] ;
                                    pdftinteacabado_impl.this.AV32BarPieagr = GXv_int10[0] ;
                                    pdftinteacabado_impl.this.AV33BarAgrSer = GXv_char2[0] ;
                                    pdftinteacabado_impl.this.AV34Barcolnomagr = GXv_char11[0] ;
                                    pdftinteacabado_impl.this.AV17Fec1 = GXv_date6[0] ;
                                    pdftinteacabado_impl.this.AV36BarEnccliAgr = GXv_char15[0] ;
                                    pdftinteacabado_impl.this.AV38fec2 = GXv_date18[0] ;
                                    pdftinteacabado_impl.this.AV35barserdscAgr = GXv_char20[0] ;
                                    pdftinteacabado_impl.this.AV37fec3 = GXv_date22[0] ;
                                    pdftinteacabado_impl.this.AV39BarNomcliAgr = GXv_char23[0] ;
                                    AV36BarEnccliAgr = ((AV61Artemalha==1)||(GXutil.strcmp(AV81Op, httpContext.getMessage( "A", ""))==0) ? GXutil.str( A119BarAgrCod, 8, 0)+"-"+GXutil.str( A124BarAgrReo, 1, 0)+A122BarAgrPar : AV36BarEnccliAgr) ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 17) ;
                                       getPrinter().GxAttris("Courier New", 7, false, true, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35barserdscAgr, "")), 269, Gx_line+0, 405, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarEnccliAgr, "")), 413, Gx_line+0, 466, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarKgmAgr, "ZZZ9.99")), 474, Gx_line+0, 511, Gx_line+14, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+17) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 17) ;
                                       getPrinter().GxAttris("Courier New", 7, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35barserdscAgr, "")), 269, Gx_line+0, 405, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarEnccliAgr, "")), 413, Gx_line+0, 466, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarKgmAgr, "ZZZ9.99")), 474, Gx_line+0, 511, Gx_line+14, 2+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+17) ;
                                    }
                                    pr_default.readNext(5);
                                 }
                                 pr_default.close(5);
                              }
                              else
                              {
                                 AV54linea = (short)(AV54linea+1) ;
                                 h84Y0( false, 15) ;
                                 getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46BarNot1, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+15) ;
                                 if ( GXutil.strcmp(AV47Barnot2, "") != 0 )
                                 {
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV64Barnot3, "") != 0 )
                                 {
                                    AV70Barnot = AV64Barnot3 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV67BarNot4, "") != 0 )
                                 {
                                    AV70Barnot = AV67BarNot4 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV68Barnot5, "") != 0 )
                                 {
                                    AV70Barnot = AV68Barnot5 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV69Barnot6, "") != 0 )
                                 {
                                    AV70Barnot = AV69Barnot6 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 /* Using cursor P084Y10 */
                                 pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                 while ( (pr_default.getStatus(6) != 101) )
                                 {
                                    A122BarAgrPar = P084Y10_A122BarAgrPar[0] ;
                                    A124BarAgrReo = P084Y10_A124BarAgrReo[0] ;
                                    A119BarAgrCod = P084Y10_A119BarAgrCod[0] ;
                                    AV28hdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
                                    GXv_char23[0] = A396EmprCod ;
                                    GXv_int21[0] = A119BarAgrCod ;
                                    GXv_int14[0] = A124BarAgrReo ;
                                    GXv_char20[0] = A122BarAgrPar ;
                                    GXv_decimal9[0] = AV30BarKgmAgr ;
                                    GXv_decimal8[0] = AV31BarMtrAgr ;
                                    GXv_int17[0] = AV32BarPieagr ;
                                    GXv_char19[0] = AV33BarAgrSer ;
                                    GXv_char16[0] = AV34Barcolnomagr ;
                                    GXv_int12[0] = 0 ;
                                    GXv_int5[0] = (byte)(0) ;
                                    GXv_char15[0] = "" ;
                                    GXv_date22[0] = AV17Fec1 ;
                                    GXv_int1[0] = (byte)(0) ;
                                    GXv_char13[0] = AV36BarEnccliAgr ;
                                    GXv_char11[0] = "" ;
                                    GXv_int10[0] = 0 ;
                                    GXv_date18[0] = AV38fec2 ;
                                    GXv_char7[0] = "" ;
                                    GXv_char4[0] = AV35barserdscAgr ;
                                    GXv_int3[0] = 0 ;
                                    GXv_date6[0] = AV37fec3 ;
                                    GXv_char2[0] = AV39BarNomcliAgr ;
                                    new app.pinfagr(remoteHandle, context).execute( GXv_char23, GXv_int21, GXv_int14, GXv_char20, GXv_decimal9, GXv_decimal8, GXv_int17, GXv_char19, GXv_char16, GXv_int12, GXv_int5, GXv_char15, GXv_date22, GXv_int1, GXv_char13, GXv_char11, GXv_int10, GXv_date18, GXv_char7, GXv_char4, GXv_int3, GXv_date6, GXv_char2) ;
                                    pdftinteacabado_impl.this.A396EmprCod = GXv_char23[0] ;
                                    pdftinteacabado_impl.this.A119BarAgrCod = GXv_int21[0] ;
                                    pdftinteacabado_impl.this.A124BarAgrReo = GXv_int14[0] ;
                                    pdftinteacabado_impl.this.A122BarAgrPar = GXv_char20[0] ;
                                    pdftinteacabado_impl.this.AV30BarKgmAgr = GXv_decimal9[0] ;
                                    pdftinteacabado_impl.this.AV31BarMtrAgr = GXv_decimal8[0] ;
                                    pdftinteacabado_impl.this.AV32BarPieagr = GXv_int17[0] ;
                                    pdftinteacabado_impl.this.AV33BarAgrSer = GXv_char19[0] ;
                                    pdftinteacabado_impl.this.AV34Barcolnomagr = GXv_char16[0] ;
                                    pdftinteacabado_impl.this.AV17Fec1 = GXv_date22[0] ;
                                    pdftinteacabado_impl.this.AV36BarEnccliAgr = GXv_char13[0] ;
                                    pdftinteacabado_impl.this.AV38fec2 = GXv_date18[0] ;
                                    pdftinteacabado_impl.this.AV35barserdscAgr = GXv_char4[0] ;
                                    pdftinteacabado_impl.this.AV37fec3 = GXv_date6[0] ;
                                    pdftinteacabado_impl.this.AV39BarNomcliAgr = GXv_char2[0] ;
                                    AV36BarEnccliAgr = ((AV61Artemalha==1)||(GXutil.strcmp(AV81Op, httpContext.getMessage( "A", ""))==0) ? GXutil.str( A119BarAgrCod, 8, 0)+"-"+GXutil.str( A124BarAgrReo, 1, 0)+A122BarAgrPar : AV36BarEnccliAgr) ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 7, false, true, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35barserdscAgr, "")), 269, Gx_line+0, 405, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36BarEnccliAgr, "")), 413, Gx_line+0, 466, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30BarKgmAgr, "ZZZ9.99")), 474, Gx_line+0, 511, Gx_line+14, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                    pr_default.readNext(6);
                                 }
                                 pr_default.close(6);
                              }
                           }
                           else
                           {
                              if ( AV22y == 2 )
                              {
                                 if ( AV49BarFasEst == 1 )
                                 {
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 else
                                 {
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46BarNot1, "")), 566, Gx_line+1, 775, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV47Barnot2, "") != 0 )
                                 {
                                    AV70Barnot = AV47Barnot2 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV64Barnot3, "") != 0 )
                                 {
                                    AV70Barnot = AV64Barnot3 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV67BarNot4, "") != 0 )
                                 {
                                    AV70Barnot = AV67BarNot4 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV68Barnot5, "") != 0 )
                                 {
                                    AV70Barnot = AV68Barnot5 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                                 if ( GXutil.strcmp(AV69Barnot6, "") != 0 )
                                 {
                                    AV70Barnot = AV69Barnot6 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    if ( AV49BarFasEst == 1 )
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                    else
                                    {
                                       h84Y0( false, 15) ;
                                       getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                       Gx_OldLine = Gx_line ;
                                       Gx_line = (int)(Gx_line+15) ;
                                    }
                                 }
                              }
                              else
                              {
                                 AV54linea = (short)(AV54linea+1) ;
                                 h84Y0( false, 15) ;
                                 getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52MaqCodFor, "")), 7, Gx_line+1, 39, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40Barcolnom, "")), 49, Gx_line+1, 118, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Clinom, "")), 127, Gx_line+1, 258, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41BarEnccli, "")), 413, Gx_line+1, 466, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 269, Gx_line+1, 405, Gx_line+15, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV44Kilos, "ZZZ9.99")), 474, Gx_line+1, 511, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV45Kilost, "ZZZ9.99")), 520, Gx_line+1, 557, Gx_line+15, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+14, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46BarNot1, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+15) ;
                                 if ( GXutil.strcmp(AV47Barnot2, "") != 0 )
                                 {
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47Barnot2, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV64Barnot3, "") != 0 )
                                 {
                                    AV70Barnot = AV64Barnot3 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV67BarNot4, "") != 0 )
                                 {
                                    AV70Barnot = AV67BarNot4 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV68Barnot5, "") != 0 )
                                 {
                                    AV70Barnot = AV68Barnot5 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                                 if ( GXutil.strcmp(AV69Barnot6, "") != 0 )
                                 {
                                    AV70Barnot = AV69Barnot6 ;
                                    AV54linea = (short)(AV54linea+1) ;
                                    h84Y0( false, 15) ;
                                    getPrinter().GxAttris("Calibri", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Barnot, "")), 565, Gx_line+1, 774, Gx_line+14, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+15, 1, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+15) ;
                                 }
                              }
                           }
                           /* Exiting from a For First loop. */
                           if (true) break;
                        }
                        pr_default.close(2);
                        AV43ImpMaquina = (byte)(1) ;
                        AV56NumOs = (short)(AV56NumOs+1) ;
                     }
                  }
               }
               AV22y = (short)(AV22y+1) ;
            }
            if ( AV43ImpMaquina == 1 )
            {
               AV54linea = (short)(AV54linea+1) ;
               h84Y0( false, 4) ;
               getPrinter().GxDrawLine(44, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(44, Gx_line+0, 44, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(121, Gx_line+0, 121, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(263, Gx_line+0, 263, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(407, Gx_line+0, 407, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(470, Gx_line+0, 470, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(516, Gx_line+0, 516, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(561, Gx_line+0, 561, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(776, Gx_line+0, 776, Gx_line+4, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(2, Gx_line+0, 2, Gx_line+4, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+4) ;
            }
            AV43ImpMaquina = (byte)(0) ;
            AV21x = (short)(AV21x+1) ;
         }
         System.out.println( httpContext.getMessage( "Informe RTF generado", "") );
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h84Y0( true, 0) ;
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
      /* 'CONTROLMAQUINAARRAY' Routine */
      returnInSub = false ;
      AV58i = (short)(1) ;
      AV59OkMq = httpContext.getMessage( "N", "") ;
      while ( AV58i <= 100 )
      {
         if ( GXutil.strcmp(AV57Tab_maqOut[AV58i-1], "") == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV23Maqcod, AV57Tab_maqOut[AV58i-1]) == 0 )
         {
            AV59OkMq = httpContext.getMessage( "S", "") ;
            if (true) break;
         }
         AV58i = (short)(AV58i+1) ;
      }
   }

   public void h84Y0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 651, Gx_line+0, 694, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 701, Gx_line+0, 744, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora", ""), 601, Gx_line+0, 644, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 653, Gx_line+23, 685, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 702, Gx_line+23, 750, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("/", 694, Gx_line+23, 700, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 601, Gx_line+23, 633, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16EmprNom, "")), 14, Gx_line+6, 203, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55NOspMaq), "ZZZ9")), 263, Gx_line+30, 285, Gx_line+44, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60NomInf, "")), 14, Gx_line+29, 140, Gx_line+45, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+50) ;
            getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maq.", ""), 7, Gx_line+8, 33, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 75, Gx_line+8, 93, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 186, Gx_line+8, 222, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 325, Gx_line+8, 355, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Peso", ""), 490, Gx_line+8, 514, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Total", ""), 532, Gx_line+8, 556, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Obs", ""), 676, Gx_line+8, 695, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+1, 2, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(121, Gx_line+1, 121, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(263, Gx_line+1, 263, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(407, Gx_line+1, 407, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(470, Gx_line+1, 470, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(516, Gx_line+1, 516, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(561, Gx_line+1, 561, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(44, Gx_line+1, 44, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(776, Gx_line+1, 776, Gx_line+29, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(2, Gx_line+0, 777, Gx_line+0, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Lit1, "")), 424, Gx_line+8, 453, Gx_line+22, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+29) ;
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
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", false, true, 56, 14, 70, 118,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 18, 22, 35, 35, 56, 42, 12, 21, 21, 25, 37, 18, 21, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 18, 18, 37, 37, 37, 35, 64, 42, 42, 45, 45, 42, 38, 49, 45, 18, 32, 42, 35, 53, 45, 49, 42, 49, 45, 42, 38, 45, 42, 61, 42, 42, 38, 18, 18, 18, 30, 35, 21, 35, 35, 32, 35, 35, 18, 35, 35, 14, 14, 32, 14, 52, 35, 35, 35, 35, 21, 32, 18, 35, 32, 45, 32, 32, 29, 21, 16, 21, 37, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 18, 21, 35, 35, 34, 35, 16, 35, 21, 46, 23, 35, 37, 21, 46, 35, 25, 35, 21, 20, 21, 35, 34, 21, 21, 20, 23, 35, 53, 53, 53, 38, 42, 42, 42, 42, 42, 42, 63, 45, 42, 42, 42, 42, 18, 18, 18, 18, 45, 45, 49, 49, 49, 49, 49, 37, 49, 45, 45, 45, 45, 42, 42, 38, 35, 35, 35, 35, 35, 35, 56, 32, 35, 35, 35, 35, 18, 18, 18, 18, 35, 35, 35, 35, 35, 35, 35, 35, 38, 35, 35, 35, 35, 32, 35, 32}) ;
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
      AV72Maquinastxt = "" ;
      AV75MaquinasHdrstxt = "" ;
      AV76tinte = "" ;
      AV60NomInf = "" ;
      AV78Maquinastxtout = "" ;
      AV9File = "" ;
      AV62Lit1 = "" ;
      AV81Op = "" ;
      AV74Tab_maqIn = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV74Tab_maqIn[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV20MaqHdrs = new String[100][1000] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 1000 )
         {
            AV20MaqHdrs[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV57Tab_maqOut = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV57Tab_maqOut[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P084Y2_A396EmprCod = new String[] {""} ;
      P084Y2_A407EmprNom = new String[] {""} ;
      P084Y2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV16EmprNom = "" ;
      AV42MaqDsc = "" ;
      AV24texto = "" ;
      AV23Maqcod = "" ;
      AV59OkMq = "" ;
      P084Y3_A396EmprCod = new String[] {""} ;
      P084Y3_A602MaqCod = new String[] {""} ;
      P084Y3_A604MaqCodFor = new String[] {""} ;
      P084Y3_n604MaqCodFor = new boolean[] {false} ;
      A602MaqCod = "" ;
      A604MaqCodFor = "" ;
      AV52MaqCodFor = "" ;
      AV27Barcodpar = "" ;
      P084Y6_A252CliCod = new int[1] ;
      P084Y6_n252CliCod = new boolean[] {false} ;
      P084Y6_A396EmprCod = new String[] {""} ;
      P084Y6_A130BarCodPar = new String[] {""} ;
      P084Y6_A132BarCodReo = new byte[1] ;
      P084Y6_A129BarCod = new int[1] ;
      P084Y6_A1234BarNomCli = new String[] {""} ;
      P084Y6_A135BarColNom = new String[] {""} ;
      P084Y6_A143BarDisNum = new String[] {""} ;
      P084Y6_A4812BarEncCli = new String[] {""} ;
      P084Y6_A279CliNom = new String[] {""} ;
      P084Y6_A120BarAgrEst = new String[] {""} ;
      P084Y6_A1652BarSerDsc = new String[] {""} ;
      P084Y6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084Y6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084Y6_n219BarTotAgr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A279CliNom = "" ;
      A120BarAgrEst = "" ;
      A1652BarSerDsc = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV28hdr = "" ;
      AV40Barcolnom = "" ;
      AV41BarEnccli = "" ;
      AV44Kilos = DecimalUtil.ZERO ;
      AV45Kilost = DecimalUtil.ZERO ;
      AV46BarNot1 = "" ;
      AV47Barnot2 = "" ;
      AV64Barnot3 = "" ;
      AV67BarNot4 = "" ;
      AV68Barnot5 = "" ;
      AV69Barnot6 = "" ;
      AV65TabNotas = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV65TabNotas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P084Y7_A396EmprCod = new String[] {""} ;
      P084Y7_A129BarCod = new int[1] ;
      P084Y7_A132BarCodReo = new byte[1] ;
      P084Y7_A130BarCodPar = new String[] {""} ;
      P084Y7_A187BarNotDsc = new String[] {""} ;
      P084Y7_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      P084Y8_A396EmprCod = new String[] {""} ;
      P084Y8_A129BarCod = new int[1] ;
      P084Y8_A132BarCodReo = new byte[1] ;
      P084Y8_A130BarCodPar = new String[] {""} ;
      P084Y8_A194BarOrdLin = new short[1] ;
      P084Y8_A9842BarObsF = new String[] {""} ;
      P084Y8_n9842BarObsF = new boolean[] {false} ;
      P084Y8_A758ProCod = new String[] {""} ;
      A9842BarObsF = "" ;
      A758ProCod = "" ;
      AV50fecha = GXutil.nullDate() ;
      AV51Maqcodbis = "" ;
      AV53Clinom = "" ;
      AV70Barnot = "" ;
      P084Y9_A396EmprCod = new String[] {""} ;
      P084Y9_A129BarCod = new int[1] ;
      P084Y9_A132BarCodReo = new byte[1] ;
      P084Y9_A130BarCodPar = new String[] {""} ;
      P084Y9_A122BarAgrPar = new String[] {""} ;
      P084Y9_A124BarAgrReo = new byte[1] ;
      P084Y9_A119BarAgrCod = new int[1] ;
      A122BarAgrPar = "" ;
      AV30BarKgmAgr = DecimalUtil.ZERO ;
      AV31BarMtrAgr = DecimalUtil.ZERO ;
      AV33BarAgrSer = "" ;
      AV34Barcolnomagr = "" ;
      AV17Fec1 = GXutil.nullDate() ;
      AV36BarEnccliAgr = "" ;
      AV38fec2 = GXutil.nullDate() ;
      AV35barserdscAgr = "" ;
      AV37fec3 = GXutil.nullDate() ;
      AV39BarNomcliAgr = "" ;
      P084Y10_A396EmprCod = new String[] {""} ;
      P084Y10_A129BarCod = new int[1] ;
      P084Y10_A132BarCodReo = new byte[1] ;
      P084Y10_A130BarCodPar = new String[] {""} ;
      P084Y10_A122BarAgrPar = new String[] {""} ;
      P084Y10_A124BarAgrReo = new byte[1] ;
      P084Y10_A119BarAgrCod = new int[1] ;
      GXv_char23 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char20 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int17 = new int[1] ;
      GXv_char19 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_date22 = new java.util.Date[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_date18 = new java.util.Date[1] ;
      GXv_char7 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdftinteacabado__default(),
         new Object[] {
             new Object[] {
            P084Y2_A396EmprCod, P084Y2_A407EmprNom, P084Y2_n407EmprNom
            }
            , new Object[] {
            P084Y3_A396EmprCod, P084Y3_A602MaqCod, P084Y3_A604MaqCodFor, P084Y3_n604MaqCodFor
            }
            , new Object[] {
            P084Y6_A252CliCod, P084Y6_n252CliCod, P084Y6_A396EmprCod, P084Y6_A130BarCodPar, P084Y6_A132BarCodReo, P084Y6_A129BarCod, P084Y6_A1234BarNomCli, P084Y6_A135BarColNom, P084Y6_A143BarDisNum, P084Y6_A4812BarEncCli,
            P084Y6_A279CliNom, P084Y6_A120BarAgrEst, P084Y6_A1652BarSerDsc, P084Y6_A166BarKgm, P084Y6_A219BarTotAgr, P084Y6_n219BarTotAgr
            }
            , new Object[] {
            P084Y7_A396EmprCod, P084Y7_A129BarCod, P084Y7_A132BarCodReo, P084Y7_A130BarCodPar, P084Y7_A187BarNotDsc, P084Y7_A188BarNotLin
            }
            , new Object[] {
            P084Y8_A396EmprCod, P084Y8_A129BarCod, P084Y8_A132BarCodReo, P084Y8_A130BarCodPar, P084Y8_A194BarOrdLin, P084Y8_A9842BarObsF, P084Y8_n9842BarObsF, P084Y8_A758ProCod
            }
            , new Object[] {
            P084Y9_A396EmprCod, P084Y9_A129BarCod, P084Y9_A132BarCodReo, P084Y9_A130BarCodPar, P084Y9_A122BarAgrPar, P084Y9_A124BarAgrReo, P084Y9_A119BarAgrCod
            }
            , new Object[] {
            P084Y10_A396EmprCod, P084Y10_A129BarCod, P084Y10_A132BarCodReo, P084Y10_A130BarCodPar, P084Y10_A122BarAgrPar, P084Y10_A124BarAgrReo, P084Y10_A119BarAgrCod
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

   private byte AV61Artemalha ;
   private byte AV43ImpMaquina ;
   private byte AV26Barcodreo ;
   private byte A132BarCodReo ;
   private byte A188BarNotLin ;
   private byte AV49BarFasEst ;
   private byte A124BarAgrReo ;
   private byte GXv_int14[] ;
   private byte GXv_int5[] ;
   private byte GXv_int1[] ;
   private short gxcookieaux ;
   private short AV55NOspMaq ;
   private short AV54linea ;
   private short AV21x ;
   private short AV56NumOs ;
   private short AV22y ;
   private short AV63Barordlin ;
   private short AV48Nlineas ;
   private short AV66d ;
   private short A194BarOrdLin ;
   private short AV58i ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV25Barcod ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A119BarAgrCod ;
   private int AV32BarPieagr ;
   private int GXv_int21[] ;
   private int GXv_int17[] ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private int GXv_int3[] ;
   private int GX_J ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV44Kilos ;
   private java.math.BigDecimal AV45Kilost ;
   private java.math.BigDecimal AV30BarKgmAgr ;
   private java.math.BigDecimal AV31BarMtrAgr ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV76tinte ;
   private String AV60NomInf ;
   private String AV9File ;
   private String AV62Lit1 ;
   private String AV81Op ;
   private String AV74Tab_maqIn[] ;
   private String AV20MaqHdrs[][] ;
   private String AV57Tab_maqOut[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV16EmprNom ;
   private String AV42MaqDsc ;
   private String AV24texto ;
   private String AV23Maqcod ;
   private String AV59OkMq ;
   private String A602MaqCod ;
   private String A604MaqCodFor ;
   private String AV52MaqCodFor ;
   private String AV27Barcodpar ;
   private String A130BarCodPar ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A279CliNom ;
   private String A120BarAgrEst ;
   private String A1652BarSerDsc ;
   private String AV28hdr ;
   private String AV40Barcolnom ;
   private String AV41BarEnccli ;
   private String AV46BarNot1 ;
   private String AV47Barnot2 ;
   private String AV64Barnot3 ;
   private String AV67BarNot4 ;
   private String AV68Barnot5 ;
   private String AV69Barnot6 ;
   private String AV65TabNotas[] ;
   private String A187BarNotDsc ;
   private String A758ProCod ;
   private String AV51Maqcodbis ;
   private String AV53Clinom ;
   private String AV70Barnot ;
   private String A122BarAgrPar ;
   private String AV33BarAgrSer ;
   private String AV34Barcolnomagr ;
   private String AV36BarEnccliAgr ;
   private String AV35barserdscAgr ;
   private String AV39BarNomcliAgr ;
   private String GXv_char23[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String Gx_time ;
   private java.util.Date AV50fecha ;
   private java.util.Date AV17Fec1 ;
   private java.util.Date AV38fec2 ;
   private java.util.Date AV37fec3 ;
   private java.util.Date GXv_date22[] ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n604MaqCodFor ;
   private boolean n252CliCod ;
   private boolean n219BarTotAgr ;
   private boolean n9842BarObsF ;
   private String AV72Maquinastxt ;
   private String AV75MaquinasHdrstxt ;
   private String AV78Maquinastxtout ;
   private String A9842BarObsF ;
   private IDataStoreProvider pr_default ;
   private String[] P084Y2_A396EmprCod ;
   private String[] P084Y2_A407EmprNom ;
   private boolean[] P084Y2_n407EmprNom ;
   private String[] P084Y3_A396EmprCod ;
   private String[] P084Y3_A602MaqCod ;
   private String[] P084Y3_A604MaqCodFor ;
   private boolean[] P084Y3_n604MaqCodFor ;
   private int[] P084Y6_A252CliCod ;
   private boolean[] P084Y6_n252CliCod ;
   private String[] P084Y6_A396EmprCod ;
   private String[] P084Y6_A130BarCodPar ;
   private byte[] P084Y6_A132BarCodReo ;
   private int[] P084Y6_A129BarCod ;
   private String[] P084Y6_A1234BarNomCli ;
   private String[] P084Y6_A135BarColNom ;
   private String[] P084Y6_A143BarDisNum ;
   private String[] P084Y6_A4812BarEncCli ;
   private String[] P084Y6_A279CliNom ;
   private String[] P084Y6_A120BarAgrEst ;
   private String[] P084Y6_A1652BarSerDsc ;
   private java.math.BigDecimal[] P084Y6_A166BarKgm ;
   private java.math.BigDecimal[] P084Y6_A219BarTotAgr ;
   private boolean[] P084Y6_n219BarTotAgr ;
   private String[] P084Y7_A396EmprCod ;
   private int[] P084Y7_A129BarCod ;
   private byte[] P084Y7_A132BarCodReo ;
   private String[] P084Y7_A130BarCodPar ;
   private String[] P084Y7_A187BarNotDsc ;
   private byte[] P084Y7_A188BarNotLin ;
   private String[] P084Y8_A396EmprCod ;
   private int[] P084Y8_A129BarCod ;
   private byte[] P084Y8_A132BarCodReo ;
   private String[] P084Y8_A130BarCodPar ;
   private short[] P084Y8_A194BarOrdLin ;
   private String[] P084Y8_A9842BarObsF ;
   private boolean[] P084Y8_n9842BarObsF ;
   private String[] P084Y8_A758ProCod ;
   private String[] P084Y9_A396EmprCod ;
   private int[] P084Y9_A129BarCod ;
   private byte[] P084Y9_A132BarCodReo ;
   private String[] P084Y9_A130BarCodPar ;
   private String[] P084Y9_A122BarAgrPar ;
   private byte[] P084Y9_A124BarAgrReo ;
   private int[] P084Y9_A119BarAgrCod ;
   private String[] P084Y10_A396EmprCod ;
   private int[] P084Y10_A129BarCod ;
   private byte[] P084Y10_A132BarCodReo ;
   private String[] P084Y10_A130BarCodPar ;
   private String[] P084Y10_A122BarAgrPar ;
   private byte[] P084Y10_A124BarAgrReo ;
   private int[] P084Y10_A119BarAgrCod ;
}

final  class pdftinteacabado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084Y2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P084Y3", "SELECT EmprCod, MaqCod, MaqCodFor FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P084Y6", "SELECT T1.CliCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarNomCli, T1.BarColNom, T1.BarDisNum, T1.BarEncCli, T2.CliNom, T1.BarAgrEst, T1.BarSerDsc, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P084Y7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084Y8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarObsF, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084Y9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P084Y10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

