package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pprvmoda21copy1 extends GXReport
{
   public pprvmoda21copy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprvmoda21copy1.class ), "" );
   }

   public pprvmoda21copy1( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      pprvmoda21copy1.this.AV76ReportInPut = aP0;
      pprvmoda21copy1.this.A396EmprCod = aP1;
      pprvmoda21copy1.this.A13418AlbProID = aP2;
      pprvmoda21copy1.this.AV63ImpCod = aP3;
      pprvmoda21copy1.this.AV84TextoCopia = aP4;
      pprvmoda21copy1.this.Gx_out = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 15 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV76ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11650, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV59FirmaD ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         pprvmoda21copy1.this.A396EmprCod = GXv_char2[0] ;
         pprvmoda21copy1.this.GXt_char1 = GXv_char4[0] ;
         AV59FirmaD = GXt_char1 ;
         GXt_int5 = AV55existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pprvmoda21copy1.this.GXt_int5 = GXv_int6[0] ;
         AV55existefirmad = GXt_int5 ;
         GXt_int5 = AV70PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pprvmoda21copy1.this.GXt_int5 = GXv_int6[0] ;
         AV70PQrcode = GXt_int5 ;
         GXv_char4[0] = AV41ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVALM", ""), GXv_char4) ;
         pprvmoda21copy1.this.AV41ContDsc = GXv_char4[0] ;
         /* Using cursor P0AK42 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A953IvaCod = P0AK42_A953IvaCod[0] ;
            n953IvaCod = P0AK42_n953IvaCod[0] ;
            A395EmprCif = P0AK42_A395EmprCif[0] ;
            n395EmprCif = P0AK42_n395EmprCif[0] ;
            A8334EmpItm1 = P0AK42_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AK42_n8334EmpItm1[0] ;
            A8335EmpItm2 = P0AK42_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AK42_n8335EmpItm2[0] ;
            A588IvaPor = P0AK42_A588IvaPor[0] ;
            n588IvaPor = P0AK42_n588IvaPor[0] ;
            A8337EmpItm4 = P0AK42_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AK42_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AK42_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AK42_n8336EmpItm3[0] ;
            A588IvaPor = P0AK42_A588IvaPor[0] ;
            n588IvaPor = P0AK42_n588IvaPor[0] ;
            AV54EmprCif = A395EmprCif ;
            AV52EmpItm1 = A8334EmpItm1 ;
            AV53EmpItm2 = A8335EmpItm2 ;
            AV64IvaPor = A588IvaPor ;
            AV80Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV81Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char4[0] = AV42contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REMTRA", ""), GXv_char4) ;
         pprvmoda21copy1.this.AV42contidsernew = GXv_char4[0] ;
         AV78SerieAT = ((GXutil.strcmp("", AV42contidsernew)==0) ? "GD5" : AV42contidsernew) ;
         GxHdr3 = true ;
         /* Using cursor P0AK43 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13419AlbProPrvI = P0AK43_A13419AlbProPrvI[0] ;
            A13440AlbProAnul = P0AK43_A13440AlbProAnul[0] ;
            A14190AlbProATCU = P0AK43_A14190AlbProATCU[0] ;
            n14190AlbProATCU = P0AK43_n14190AlbProATCU[0] ;
            A13430AlbProDate = P0AK43_A13430AlbProDate[0] ;
            A13429AlbProSal = P0AK43_A13429AlbProSal[0] ;
            A13579AlbProLC1 = P0AK43_A13579AlbProLC1[0] ;
            A13580AlbProLC2 = P0AK43_A13580AlbProLC2[0] ;
            A13582AlbProLD1 = P0AK43_A13582AlbProLD1[0] ;
            A13583AlbProLD2 = P0AK43_A13583AlbProLD2[0] ;
            A13584AlbProLD3 = P0AK43_A13584AlbProLD3[0] ;
            A13433AlbProHh = P0AK43_A13433AlbProHh[0] ;
            A14192AlbProTipA = P0AK43_A14192AlbProTipA[0] ;
            n14192AlbProTipA = P0AK43_n14192AlbProTipA[0] ;
            A14191AlbProSerA = P0AK43_A14191AlbProSerA[0] ;
            n14191AlbProSerA = P0AK43_n14191AlbProSerA[0] ;
            A13439AlbProObs = P0AK43_A13439AlbProObs[0] ;
            A13424AlbProMatr = P0AK43_A13424AlbProMatr[0] ;
            A13437AlbProSta = P0AK43_A13437AlbProSta[0] ;
            A13436AlbProIDAT = P0AK43_A13436AlbProIDAT[0] ;
            A13438AlbProStAT = P0AK43_A13438AlbProStAT[0] ;
            AV24CliCod = A13419AlbProPrvI ;
            AV83TextoAnulado = ((GXutil.strcmp(A13440AlbProAnul, "A")==0) ? httpContext.getMessage( "ANULADO", "") : " ") ;
            AV39codValidacaoSerie = A14190AlbProATCU ;
            AV21atcud = ((GXutil.strcmp("", AV39codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD:", "")+GXutil.trim( AV39codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A13418AlbProID, 8, 0))) ;
            AV8AlbProDate = A13430AlbProDate ;
            AV20anyo = (short)(GXutil.year( A13430AlbProDate)) ;
            AV66mes = (byte)(GXutil.month( A13430AlbProDate)) ;
            AV46dia = (byte)(GXutil.day( A13430AlbProDate)) ;
            AV12AlbProDatealfa = GXutil.str( AV20anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV66mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV46dia, 2, 0)), (short)(2), "0") ;
            AV48DiaHora = localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV47DiaCarga = localUtil.ctod( GXutil.substring( AV48DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV20anyo = (short)(GXutil.year( AV47DiaCarga)) ;
            AV66mes = (byte)(GXutil.month( AV47DiaCarga)) ;
            AV46dia = (byte)(GXutil.day( AV47DiaCarga)) ;
            AV98diacargaalfa = GXutil.str( AV20anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV66mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV46dia, 2, 0)), (short)(2), "0") ;
            AV60HoraCarga = GXutil.substring( AV48DiaHora, 12, 8) ;
            AV15AlbProLC1 = ((GXutil.strcmp("", A13579AlbProLC1)==0) ? httpContext.getMessage( "N/ Instalações", "") : A13579AlbProLC1) ;
            AV16AlbProLC2 = ((GXutil.strcmp("", A13580AlbProLC2)==0) ? "" : A13580AlbProLC2) ;
            AV17AlbProLD1 = ((GXutil.strcmp("", A13582AlbProLD1)==0) ? httpContext.getMessage( "V/instalações", "") : A13582AlbProLD1) ;
            AV18AlbProLD2 = ((GXutil.strcmp("", A13583AlbProLD2)==0) ? GXutil.trim( AV31CliEPob) : A13583AlbProLD2) ;
            AV19AlbProLD3 = ((GXutil.strcmp("", A13584AlbProLD3)==0) ? GXutil.trim( AV27CliEcp)+" "+GXutil.trim( AV73PrvDsc) : A13584AlbProLD3) ;
            AV75PrvNum = A13419AlbProPrvI ;
            /* Execute user subroutine: 'PRVGEN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV44Cp_1_2 = GXutil.trim( AV25Clicp) ;
            AV82Texto_fd = " " ;
            if ( GXutil.strcmp(A13433AlbProHh, " ") != 0 )
            {
               AV58Firma4dig = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
               AV82Texto_fd = AV58Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV59FirmaD) ;
            }
            else
            {
               AV82Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV22AtId = " " ;
            if ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 )
            {
               AV22AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A13436AlbProIDAT, 1, 12)) ;
            }
            AV58Firma4dig = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
            AV85TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV54EmprCif) + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( AV32CliNif) + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "D:", "") + GXutil.trim( A14192AlbProTipA) + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV20anyo = (short)(GXutil.year( A13430AlbProDate)) ;
            AV66mes = (byte)(GXutil.month( A13430AlbProDate)) ;
            AV46dia = (byte)(GXutil.day( A13430AlbProDate)) ;
            AV85TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV20anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV66mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV46dia, 2, 0)), (short)(2), "0") + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "G:", "") + GXutil.trim( A14192AlbProTipA) + " " + GXutil.trim( A14191AlbProSerA) + "/" + GXutil.trim( GXutil.str( A13418AlbProID, 8, 0)) + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "H:", "") + GXutil.trim( A14190AlbProATCU) + "-" + GXutil.trim( GXutil.str( A13418AlbProID, 8, 0)) + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "Q:", "") + AV58Firma4dig + "*" ;
            AV85TextoGenerar += httpContext.getMessage( "R:", "") + "1208" ;
            AV50Dpi = (short)(300) ;
            AV23Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV69Pixel = (short)(DecimalUtil.decToDouble(AV23Centimetos.multiply(DecimalUtil.doubleToDec(AV50Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char1 = AV90Url ;
            GXv_char4[0] = GXt_char1 ;
            new app.qr_obtener(remoteHandle, context).execute( AV85TextoGenerar, AV69Pixel, AV69Pixel, GXv_char4) ;
            pprvmoda21copy1.this.GXt_char1 = GXv_char4[0] ;
            AV90Url = GXt_char1 ;
            AV62Imagen = AV90Url ;
            AV105Imagen_GXI = GXDbFile.pathToUrl( AV90Url, context.getHttpContext()) ;
            AV96VDoc = httpContext.getMessage( "GUIA DE DEVOLUÇÃO Nº", "") ;
            AV95vCopia = ((AV43Copias==1) ? httpContext.getMessage( "DUPLICADO", "") : "") ;
            AV67Nlin = (short)(GXutil.gxmlines( A13439AlbProObs, (short)(50))) ;
            AV61i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV97vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            while ( AV61i <= AV67Nlin )
            {
               if ( AV61i > 2 )
               {
                  if (true) break;
               }
               AV97vObs[AV61i-1] = GXutil.gxgetmli( A13439AlbProObs, AV61i, (short)(50)) ;
               AV61i = (byte)(AV61i+1) ;
            }
            AV11AlbMat = A13424AlbProMatr ;
            AV14AlbProFch = A13430AlbProDate ;
            AV49documento = GXutil.trim( A14192AlbProTipA) + " " + GXutil.trim( A14191AlbProSerA) + "/" + GXutil.trim( GXutil.str( A13418AlbProID, 8, 0)) ;
            AV68Num_lineas = (short)(0) ;
            AV92valorIva = DecimalUtil.doubleToDec(0) ;
            AV56FacImp = DecimalUtil.doubleToDec(0) ;
            AV57FacTot = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P0AK44 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13444AlbProUnd = P0AK44_A13444AlbProUnd[0] ;
               n13444AlbProUnd = P0AK44_n13444AlbProUnd[0] ;
               A719PrdNum = P0AK44_A719PrdNum[0] ;
               A13448AlbProDsc = P0AK44_A13448AlbProDsc[0] ;
               n13448AlbProDsc = P0AK44_n13448AlbProDsc[0] ;
               A14401AlbProLote = P0AK44_A14401AlbProLote[0] ;
               n14401AlbProLote = P0AK44_n14401AlbProLote[0] ;
               A13443AlbProCnt = P0AK44_A13443AlbProCnt[0] ;
               n13443AlbProCnt = P0AK44_n13443AlbProCnt[0] ;
               A13447AlbProObsL = P0AK44_A13447AlbProObsL[0] ;
               n13447AlbProObsL = P0AK44_n13447AlbProObsL[0] ;
               A13442AlbProLine = P0AK44_A13442AlbProLine[0] ;
               if ( AV68Num_lineas >= 21 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV68Num_lineas = (short)(1) ;
               }
               AV89Und = A13444AlbProUnd ;
               AV72prdnum = A719PrdNum ;
               AV71prdnom = A13448AlbProDsc ;
               hAK40( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13443AlbProCnt, "ZZZZZ9.99")), 614, Gx_line+0, 681, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89Und, "")), 686, Gx_line+1, 709, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72prdnum, "")), 141, Gx_line+0, 186, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71prdnom, "")), 200, Gx_line+0, 391, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14401AlbProLote, "")), 407, Gx_line+0, 598, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV68Num_lineas = (short)(AV68Num_lineas+1) ;
               if ( GXutil.strcmp(A13447AlbProObsL, "") != 0 )
               {
                  hAK40( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13447AlbProObsL, "")), 141, Gx_line+0, 580, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV68Num_lineas = (short)(AV68Num_lineas+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A13437AlbProSta = (byte)(((A13437AlbProSta==0) ? 1 : A13437AlbProSta)) ;
            /* Using cursor P0AK45 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A13437AlbProSta), A396EmprCod, Integer.valueOf(A13418AlbProID)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         AV99WEBSession.setValue(httpContext.getMessage( "PPrvModa21Copy1_Clicod", ""), localUtil.format( DecimalUtil.doubleToDec(AV24CliCod), "ZZZZZ9"));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAK40( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      AV33CliNom = "" ;
      AV26CliDom = "" ;
      AV25Clicp = "" ;
      AV37CliPob = "" ;
      AV32CliNif = "" ;
      AV29CliENom = "" ;
      AV28CliEDom = "" ;
      AV27CliEcp = "" ;
      AV31CliEPob = "" ;
      AV73PrvDsc = "" ;
      AV74Prvdsc1 = "" ;
      /* Using cursor P0AK46 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV75PrvNum)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A795PrvNum = P0AK46_A795PrvNum[0] ;
         A794PrvNom = P0AK46_A794PrvNom[0] ;
         n794PrvNom = P0AK46_n794PrvNom[0] ;
         A6570PrvNom2 = P0AK46_A6570PrvNom2[0] ;
         n6570PrvNom2 = P0AK46_n6570PrvNom2[0] ;
         A786PrvDir = P0AK46_A786PrvDir[0] ;
         n786PrvDir = P0AK46_n786PrvDir[0] ;
         A6075PrvCp2 = P0AK46_A6075PrvCp2[0] ;
         n6075PrvCp2 = P0AK46_n6075PrvCp2[0] ;
         A782PrvCpo = P0AK46_A782PrvCpo[0] ;
         n782PrvCpo = P0AK46_n782PrvCpo[0] ;
         A799PrvPob = P0AK46_A799PrvPob[0] ;
         n799PrvPob = P0AK46_n799PrvPob[0] ;
         A793PrvNif = P0AK46_A793PrvNif[0] ;
         n793PrvNif = P0AK46_n793PrvNif[0] ;
         AV33CliNom = A794PrvNom ;
         AV35CliNom12 = GXutil.trim( A794PrvNom) + " " + GXutil.trim( A6570PrvNom2) ;
         AV26CliDom = A786PrvDir ;
         AV25Clicp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV37CliPob = A799PrvPob ;
         AV32CliNif = A793PrvNif ;
         AV29CliENom = A794PrvNom ;
         AV28CliEDom = A786PrvDir ;
         AV27CliEcp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV31CliEPob = A799PrvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void hAK40( boolean bFoot ,
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
               getPrinter().GxDrawLine(7, Gx_line+160, 766, Gx_line+160, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41ContDsc, "")), 700, Gx_line+147, 764, Gx_line+160, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 15, Gx_line+49, 87, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 493, Gx_line+49, 547, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60HoraCarga, "")), 675, Gx_line+50, 759, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 671, Gx_line+87, 698, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matricula:", ""), 493, Gx_line+68, 544, Gx_line+82, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11AlbMat, "")), 575, Gx_line+68, 701, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 15, Gx_line+91, 104, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Chegada:     /     /", ""), 493, Gx_line+87, 569, Gx_line+101, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 643, Gx_line+50, 670, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RECEBIDO POR", ""), 569, Gx_line+107, 639, Gx_line+121, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(518, Gx_line+141, 723, Gx_line+141, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98diacargaalfa, "")), 560, Gx_line+49, 624, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15AlbProLC1, "")), 131, Gx_line+49, 382, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16AlbProLC2, "")), 131, Gx_line+64, 382, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17AlbProLD1, "")), 131, Gx_line+91, 382, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18AlbProLD2, "")), 131, Gx_line+105, 382, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19AlbProLD3, "")), 131, Gx_line+120, 382, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes:", ""), 15, Gx_line+8, 85, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97vObs[1-1], "")), 131, Gx_line+8, 445, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97vObs[2-1], "")), 131, Gx_line+23, 445, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22AtId, "")), 281, Gx_line+148, 412, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86textoNOAT, "")), 412, Gx_line+148, 689, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Texto_fd, "")), 16, Gx_line+148, 288, Gx_line+161, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Este documento não serve de fatura", ""), 294, Gx_line+166, 472, Gx_line+177, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Texto_1, "")), 19, Gx_line+181, 801, Gx_line+194, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Texto_2, "")), 69, Gx_line+193, 747, Gx_line+206, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+223) ;
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
               AV77RutaImagenMarcaAgua = "" ;
               AV86textoNOAT = "" ;
               if ( (GXutil.strcmp("", A13436AlbProIDAT)==0) )
               {
                  AV86textoNOAT = httpContext.getMessage( "Este documento não serve de documento de transporte", "") ;
               }
               if ( A13438AlbProStAT == 0 )
               {
                  AV65MarcaAguaImagen = context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )) ;
                  AV106Marcaaguaimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
                  sImgUrl = ((GXutil.strcmp("", AV65MarcaAguaImagen)==0) ? AV106Marcaaguaimagen_GXI : AV65MarcaAguaImagen) ;
                  getPrinter().GxDrawBitMap(sImgUrl, 14, Gx_line+1, 815, Gx_line+1052) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1068) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               else
               {
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+1052) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmos. Srs.", ""), 422, Gx_line+200, 499, Gx_line+217, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49documento, "")), 605, Gx_line+148, 773, Gx_line+169, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35CliNom12, "")), 422, Gx_line+222, 772, Gx_line+240, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26CliDom, "")), 422, Gx_line+242, 636, Gx_line+260, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37CliPob, "")), 494, Gx_line+261, 683, Gx_line+279, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Cp_1_2, "")), 422, Gx_line+262, 480, Gx_line+279, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Prvdsc1, "@!")), 422, Gx_line+282, 579, Gx_line+299, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV62Imagen)==0) ? AV105Imagen_GXI : AV62Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 65, Gx_line+170, 198, Gx_line+308) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21atcud, "")), 31, Gx_line+148, 220, Gx_line+166, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 16, Gx_line+0, 773, Gx_line+95) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84TextoCopia, "")), 623, Gx_line+180, 728, Gx_line+196, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TextoAnulado, "")), 38, Gx_line+102, 195, Gx_line+142, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96VDoc, "")), 358, Gx_line+148, 526, Gx_line+169, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+321) ;
               getPrinter().GxDrawRect(15, Gx_line+0, 774, Gx_line+42, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº Contribuinte", ""), 42, Gx_line+14, 151, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data do Documento", ""), 285, Gx_line+14, 406, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 624, Gx_line+14, 667, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32CliNif, "@!")), 49, Gx_line+48, 154, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12AlbProDatealfa, "")), 293, Gx_line+48, 398, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 600, Gx_line+48, 645, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 660, Gx_line+48, 715, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 651, Gx_line+48, 655, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+41, 774, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+78) ;
               getPrinter().GxDrawRect(15, Gx_line+16, 745, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qtd", ""), 629, Gx_line+22, 650, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 141, Gx_line+22, 187, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 196, Gx_line+22, 255, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 407, Gx_line+22, 433, Gx_line+38, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+47) ;
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
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.pprvmoda21copy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV59FirmaD = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV41ContDsc = "" ;
      scmdbuf = "" ;
      P0AK42_A953IvaCod = new String[] {""} ;
      P0AK42_n953IvaCod = new boolean[] {false} ;
      P0AK42_A396EmprCod = new String[] {""} ;
      P0AK42_A395EmprCif = new String[] {""} ;
      P0AK42_n395EmprCif = new boolean[] {false} ;
      P0AK42_A8334EmpItm1 = new String[] {""} ;
      P0AK42_n8334EmpItm1 = new boolean[] {false} ;
      P0AK42_A8335EmpItm2 = new String[] {""} ;
      P0AK42_n8335EmpItm2 = new boolean[] {false} ;
      P0AK42_A588IvaPor = new byte[1] ;
      P0AK42_n588IvaPor = new boolean[] {false} ;
      P0AK42_A8337EmpItm4 = new String[] {""} ;
      P0AK42_n8337EmpItm4 = new boolean[] {false} ;
      P0AK42_A8336EmpItm3 = new String[] {""} ;
      P0AK42_n8336EmpItm3 = new boolean[] {false} ;
      A953IvaCod = "" ;
      A395EmprCif = "" ;
      A8334EmpItm1 = "" ;
      A8335EmpItm2 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      AV54EmprCif = "" ;
      AV52EmpItm1 = "" ;
      AV53EmpItm2 = "" ;
      AV80Texto_1 = "" ;
      AV81Texto_2 = "" ;
      AV42contidsernew = "" ;
      AV78SerieAT = "" ;
      P0AK43_A396EmprCod = new String[] {""} ;
      P0AK43_A13418AlbProID = new int[1] ;
      P0AK43_A13419AlbProPrvI = new int[1] ;
      P0AK43_A13440AlbProAnul = new String[] {""} ;
      P0AK43_A14190AlbProATCU = new String[] {""} ;
      P0AK43_n14190AlbProATCU = new boolean[] {false} ;
      P0AK43_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P0AK43_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AK43_A13579AlbProLC1 = new String[] {""} ;
      P0AK43_A13580AlbProLC2 = new String[] {""} ;
      P0AK43_A13582AlbProLD1 = new String[] {""} ;
      P0AK43_A13583AlbProLD2 = new String[] {""} ;
      P0AK43_A13584AlbProLD3 = new String[] {""} ;
      P0AK43_A13433AlbProHh = new String[] {""} ;
      P0AK43_A14192AlbProTipA = new String[] {""} ;
      P0AK43_n14192AlbProTipA = new boolean[] {false} ;
      P0AK43_A14191AlbProSerA = new String[] {""} ;
      P0AK43_n14191AlbProSerA = new boolean[] {false} ;
      P0AK43_A13439AlbProObs = new String[] {""} ;
      P0AK43_A13424AlbProMatr = new String[] {""} ;
      P0AK43_A13437AlbProSta = new byte[1] ;
      P0AK43_A13436AlbProIDAT = new String[] {""} ;
      P0AK43_A13438AlbProStAT = new byte[1] ;
      A13440AlbProAnul = "" ;
      A14190AlbProATCU = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13579AlbProLC1 = "" ;
      A13580AlbProLC2 = "" ;
      A13582AlbProLD1 = "" ;
      A13583AlbProLD2 = "" ;
      A13584AlbProLD3 = "" ;
      A13433AlbProHh = "" ;
      A14192AlbProTipA = "" ;
      A14191AlbProSerA = "" ;
      A13439AlbProObs = "" ;
      A13424AlbProMatr = "" ;
      A13436AlbProIDAT = "" ;
      AV83TextoAnulado = "" ;
      AV39codValidacaoSerie = "" ;
      AV21atcud = "" ;
      AV8AlbProDate = GXutil.nullDate() ;
      AV12AlbProDatealfa = "" ;
      AV48DiaHora = "" ;
      AV47DiaCarga = GXutil.nullDate() ;
      AV98diacargaalfa = "" ;
      AV60HoraCarga = "" ;
      AV15AlbProLC1 = "" ;
      AV16AlbProLC2 = "" ;
      AV17AlbProLD1 = "" ;
      AV18AlbProLD2 = "" ;
      AV31CliEPob = "" ;
      AV19AlbProLD3 = "" ;
      AV27CliEcp = "" ;
      AV73PrvDsc = "" ;
      AV44Cp_1_2 = "" ;
      AV25Clicp = "" ;
      AV82Texto_fd = "" ;
      AV58Firma4dig = "" ;
      AV22AtId = "" ;
      AV85TextoGenerar = "" ;
      AV32CliNif = "" ;
      AV23Centimetos = DecimalUtil.ZERO ;
      AV90Url = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV62Imagen = "" ;
      AV105Imagen_GXI = "" ;
      AV96VDoc = "" ;
      AV95vCopia = "" ;
      AV97vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV97vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV11AlbMat = "" ;
      AV14AlbProFch = GXutil.nullDate() ;
      AV49documento = "" ;
      AV92valorIva = DecimalUtil.ZERO ;
      AV56FacImp = DecimalUtil.ZERO ;
      AV57FacTot = DecimalUtil.ZERO ;
      P0AK44_A396EmprCod = new String[] {""} ;
      P0AK44_A13418AlbProID = new int[1] ;
      P0AK44_A13444AlbProUnd = new String[] {""} ;
      P0AK44_n13444AlbProUnd = new boolean[] {false} ;
      P0AK44_A719PrdNum = new String[] {""} ;
      P0AK44_A13448AlbProDsc = new String[] {""} ;
      P0AK44_n13448AlbProDsc = new boolean[] {false} ;
      P0AK44_A14401AlbProLote = new String[] {""} ;
      P0AK44_n14401AlbProLote = new boolean[] {false} ;
      P0AK44_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AK44_n13443AlbProCnt = new boolean[] {false} ;
      P0AK44_A13447AlbProObsL = new String[] {""} ;
      P0AK44_n13447AlbProObsL = new boolean[] {false} ;
      P0AK44_A13442AlbProLine = new short[1] ;
      A13444AlbProUnd = "" ;
      A719PrdNum = "" ;
      A13448AlbProDsc = "" ;
      A14401AlbProLote = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13447AlbProObsL = "" ;
      AV89Und = "" ;
      AV72prdnum = "" ;
      AV71prdnom = "" ;
      AV99WEBSession = httpContext.getWebSession();
      AV33CliNom = "" ;
      AV26CliDom = "" ;
      AV37CliPob = "" ;
      AV29CliENom = "" ;
      AV28CliEDom = "" ;
      AV74Prvdsc1 = "" ;
      P0AK46_A396EmprCod = new String[] {""} ;
      P0AK46_A795PrvNum = new int[1] ;
      P0AK46_A794PrvNom = new String[] {""} ;
      P0AK46_n794PrvNom = new boolean[] {false} ;
      P0AK46_A6570PrvNom2 = new String[] {""} ;
      P0AK46_n6570PrvNom2 = new boolean[] {false} ;
      P0AK46_A786PrvDir = new String[] {""} ;
      P0AK46_n786PrvDir = new boolean[] {false} ;
      P0AK46_A6075PrvCp2 = new String[] {""} ;
      P0AK46_n6075PrvCp2 = new boolean[] {false} ;
      P0AK46_A782PrvCpo = new String[] {""} ;
      P0AK46_n782PrvCpo = new boolean[] {false} ;
      P0AK46_A799PrvPob = new String[] {""} ;
      P0AK46_n799PrvPob = new boolean[] {false} ;
      P0AK46_A793PrvNif = new String[] {""} ;
      P0AK46_n793PrvNif = new boolean[] {false} ;
      A794PrvNom = "" ;
      A6570PrvNom2 = "" ;
      A786PrvDir = "" ;
      A6075PrvCp2 = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      AV35CliNom12 = "" ;
      AV86textoNOAT = "" ;
      AV77RutaImagenMarcaAgua = "" ;
      AV65MarcaAguaImagen = "" ;
      AV106Marcaaguaimagen_GXI = "" ;
      AV65MarcaAguaImagen = "" ;
      sImgUrl = "" ;
      AV62Imagen = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.pprvmoda21copy1__default(),
         new Object[] {
             new Object[] {
            P0AK42_A953IvaCod, P0AK42_n953IvaCod, P0AK42_A396EmprCod, P0AK42_A395EmprCif, P0AK42_n395EmprCif, P0AK42_A8334EmpItm1, P0AK42_n8334EmpItm1, P0AK42_A8335EmpItm2, P0AK42_n8335EmpItm2, P0AK42_A588IvaPor,
            P0AK42_n588IvaPor, P0AK42_A8337EmpItm4, P0AK42_n8337EmpItm4, P0AK42_A8336EmpItm3, P0AK42_n8336EmpItm3
            }
            , new Object[] {
            P0AK43_A396EmprCod, P0AK43_A13418AlbProID, P0AK43_A13419AlbProPrvI, P0AK43_A13440AlbProAnul, P0AK43_A14190AlbProATCU, P0AK43_n14190AlbProATCU, P0AK43_A13430AlbProDate, P0AK43_A13429AlbProSal, P0AK43_A13579AlbProLC1, P0AK43_A13580AlbProLC2,
            P0AK43_A13582AlbProLD1, P0AK43_A13583AlbProLD2, P0AK43_A13584AlbProLD3, P0AK43_A13433AlbProHh, P0AK43_A14192AlbProTipA, P0AK43_n14192AlbProTipA, P0AK43_A14191AlbProSerA, P0AK43_n14191AlbProSerA, P0AK43_A13439AlbProObs, P0AK43_A13424AlbProMatr,
            P0AK43_A13437AlbProSta, P0AK43_A13436AlbProIDAT, P0AK43_A13438AlbProStAT
            }
            , new Object[] {
            P0AK44_A396EmprCod, P0AK44_A13418AlbProID, P0AK44_A13444AlbProUnd, P0AK44_n13444AlbProUnd, P0AK44_A719PrdNum, P0AK44_A13448AlbProDsc, P0AK44_n13448AlbProDsc, P0AK44_A14401AlbProLote, P0AK44_n14401AlbProLote, P0AK44_A13443AlbProCnt,
            P0AK44_n13443AlbProCnt, P0AK44_A13447AlbProObsL, P0AK44_n13447AlbProObsL, P0AK44_A13442AlbProLine
            }
            , new Object[] {
            }
            , new Object[] {
            P0AK46_A396EmprCod, P0AK46_A795PrvNum, P0AK46_A794PrvNom, P0AK46_n794PrvNom, P0AK46_A6570PrvNom2, P0AK46_n6570PrvNom2, P0AK46_A786PrvDir, P0AK46_n786PrvDir, P0AK46_A6075PrvCp2, P0AK46_n6075PrvCp2,
            P0AK46_A782PrvCpo, P0AK46_n782PrvCpo, P0AK46_A799PrvPob, P0AK46_n799PrvPob, P0AK46_A793PrvNif, P0AK46_n793PrvNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV55existefirmad ;
   private byte AV70PQrcode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A588IvaPor ;
   private byte AV64IvaPor ;
   private byte A13437AlbProSta ;
   private byte A13438AlbProStAT ;
   private byte AV66mes ;
   private byte AV46dia ;
   private byte AV43Copias ;
   private byte AV61i ;
   private short AV20anyo ;
   private short AV50Dpi ;
   private short AV69Pixel ;
   private short AV67Nlin ;
   private short AV68Num_lineas ;
   private short A13442AlbProLine ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A13419AlbProPrvI ;
   private int AV24CliCod ;
   private int AV75PrvNum ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A795PrvNum ;
   private java.math.BigDecimal AV23Centimetos ;
   private java.math.BigDecimal AV92valorIva ;
   private java.math.BigDecimal AV56FacImp ;
   private java.math.BigDecimal AV57FacTot ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String A396EmprCod ;
   private String AV63ImpCod ;
   private String AV84TextoCopia ;
   private String Gx_out ;
   private String AV59FirmaD ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV41ContDsc ;
   private String scmdbuf ;
   private String A953IvaCod ;
   private String A395EmprCif ;
   private String A8334EmpItm1 ;
   private String A8335EmpItm2 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String AV54EmprCif ;
   private String AV52EmpItm1 ;
   private String AV53EmpItm2 ;
   private String AV80Texto_1 ;
   private String AV81Texto_2 ;
   private String AV42contidsernew ;
   private String AV78SerieAT ;
   private String A13440AlbProAnul ;
   private String A14190AlbProATCU ;
   private String A13579AlbProLC1 ;
   private String A13580AlbProLC2 ;
   private String A13582AlbProLD1 ;
   private String A13583AlbProLD2 ;
   private String A13584AlbProLD3 ;
   private String A14192AlbProTipA ;
   private String A14191AlbProSerA ;
   private String A13424AlbProMatr ;
   private String A13436AlbProIDAT ;
   private String AV83TextoAnulado ;
   private String AV39codValidacaoSerie ;
   private String AV21atcud ;
   private String AV12AlbProDatealfa ;
   private String AV48DiaHora ;
   private String AV98diacargaalfa ;
   private String AV60HoraCarga ;
   private String AV15AlbProLC1 ;
   private String AV16AlbProLC2 ;
   private String AV17AlbProLD1 ;
   private String AV18AlbProLD2 ;
   private String AV31CliEPob ;
   private String AV19AlbProLD3 ;
   private String AV27CliEcp ;
   private String AV73PrvDsc ;
   private String AV44Cp_1_2 ;
   private String AV25Clicp ;
   private String AV82Texto_fd ;
   private String AV58Firma4dig ;
   private String AV22AtId ;
   private String AV32CliNif ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String AV96VDoc ;
   private String AV95vCopia ;
   private String AV97vObs[] ;
   private String AV11AlbMat ;
   private String A13444AlbProUnd ;
   private String A719PrdNum ;
   private String A13448AlbProDsc ;
   private String A14401AlbProLote ;
   private String A13447AlbProObsL ;
   private String AV89Und ;
   private String AV72prdnum ;
   private String AV71prdnom ;
   private String AV33CliNom ;
   private String AV26CliDom ;
   private String AV37CliPob ;
   private String AV29CliENom ;
   private String AV28CliEDom ;
   private String AV74Prvdsc1 ;
   private String A794PrvNom ;
   private String A6570PrvNom2 ;
   private String A786PrvDir ;
   private String A6075PrvCp2 ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String AV35CliNom12 ;
   private String AV86textoNOAT ;
   private String sImgUrl ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV8AlbProDate ;
   private java.util.Date AV47DiaCarga ;
   private java.util.Date AV14AlbProFch ;
   private boolean n953IvaCod ;
   private boolean n395EmprCif ;
   private boolean n8334EmpItm1 ;
   private boolean n8335EmpItm2 ;
   private boolean n588IvaPor ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean GxHdr3 ;
   private boolean n14190AlbProATCU ;
   private boolean n14192AlbProTipA ;
   private boolean n14191AlbProSerA ;
   private boolean returnInSub ;
   private boolean n13444AlbProUnd ;
   private boolean n13448AlbProDsc ;
   private boolean n14401AlbProLote ;
   private boolean n13443AlbProCnt ;
   private boolean n13447AlbProObsL ;
   private boolean n794PrvNom ;
   private boolean n6570PrvNom2 ;
   private boolean n786PrvDir ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private String AV76ReportInPut ;
   private String A13433AlbProHh ;
   private String A13439AlbProObs ;
   private String AV85TextoGenerar ;
   private String AV90Url ;
   private String AV105Imagen_GXI ;
   private String AV49documento ;
   private String AV77RutaImagenMarcaAgua ;
   private String AV106Marcaaguaimagen_GXI ;
   private String AV62Imagen ;
   private String AV65MarcaAguaImagen ;
   private String Marcaaguaimagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK42_A953IvaCod ;
   private boolean[] P0AK42_n953IvaCod ;
   private String[] P0AK42_A396EmprCod ;
   private String[] P0AK42_A395EmprCif ;
   private boolean[] P0AK42_n395EmprCif ;
   private String[] P0AK42_A8334EmpItm1 ;
   private boolean[] P0AK42_n8334EmpItm1 ;
   private String[] P0AK42_A8335EmpItm2 ;
   private boolean[] P0AK42_n8335EmpItm2 ;
   private byte[] P0AK42_A588IvaPor ;
   private boolean[] P0AK42_n588IvaPor ;
   private String[] P0AK42_A8337EmpItm4 ;
   private boolean[] P0AK42_n8337EmpItm4 ;
   private String[] P0AK42_A8336EmpItm3 ;
   private boolean[] P0AK42_n8336EmpItm3 ;
   private String[] P0AK43_A396EmprCod ;
   private int[] P0AK43_A13418AlbProID ;
   private int[] P0AK43_A13419AlbProPrvI ;
   private String[] P0AK43_A13440AlbProAnul ;
   private String[] P0AK43_A14190AlbProATCU ;
   private boolean[] P0AK43_n14190AlbProATCU ;
   private java.util.Date[] P0AK43_A13430AlbProDate ;
   private java.util.Date[] P0AK43_A13429AlbProSal ;
   private String[] P0AK43_A13579AlbProLC1 ;
   private String[] P0AK43_A13580AlbProLC2 ;
   private String[] P0AK43_A13582AlbProLD1 ;
   private String[] P0AK43_A13583AlbProLD2 ;
   private String[] P0AK43_A13584AlbProLD3 ;
   private String[] P0AK43_A13433AlbProHh ;
   private String[] P0AK43_A14192AlbProTipA ;
   private boolean[] P0AK43_n14192AlbProTipA ;
   private String[] P0AK43_A14191AlbProSerA ;
   private boolean[] P0AK43_n14191AlbProSerA ;
   private String[] P0AK43_A13439AlbProObs ;
   private String[] P0AK43_A13424AlbProMatr ;
   private byte[] P0AK43_A13437AlbProSta ;
   private String[] P0AK43_A13436AlbProIDAT ;
   private byte[] P0AK43_A13438AlbProStAT ;
   private String[] P0AK44_A396EmprCod ;
   private int[] P0AK44_A13418AlbProID ;
   private String[] P0AK44_A13444AlbProUnd ;
   private boolean[] P0AK44_n13444AlbProUnd ;
   private String[] P0AK44_A719PrdNum ;
   private String[] P0AK44_A13448AlbProDsc ;
   private boolean[] P0AK44_n13448AlbProDsc ;
   private String[] P0AK44_A14401AlbProLote ;
   private boolean[] P0AK44_n14401AlbProLote ;
   private java.math.BigDecimal[] P0AK44_A13443AlbProCnt ;
   private boolean[] P0AK44_n13443AlbProCnt ;
   private String[] P0AK44_A13447AlbProObsL ;
   private boolean[] P0AK44_n13447AlbProObsL ;
   private short[] P0AK44_A13442AlbProLine ;
   private String[] P0AK46_A396EmprCod ;
   private int[] P0AK46_A795PrvNum ;
   private String[] P0AK46_A794PrvNom ;
   private boolean[] P0AK46_n794PrvNom ;
   private String[] P0AK46_A6570PrvNom2 ;
   private boolean[] P0AK46_n6570PrvNom2 ;
   private String[] P0AK46_A786PrvDir ;
   private boolean[] P0AK46_n786PrvDir ;
   private String[] P0AK46_A6075PrvCp2 ;
   private boolean[] P0AK46_n6075PrvCp2 ;
   private String[] P0AK46_A782PrvCpo ;
   private boolean[] P0AK46_n782PrvCpo ;
   private String[] P0AK46_A799PrvPob ;
   private boolean[] P0AK46_n799PrvPob ;
   private String[] P0AK46_A793PrvNif ;
   private boolean[] P0AK46_n793PrvNif ;
   private com.genexus.webpanels.WebSession AV99WEBSession ;
}

final  class pprvmoda21copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK42", "SELECT T1.IvaCod, T1.EmprCod, T1.EmprCif, T1.EmpItm1, T1.EmpItm2, T2.IvaPor, T1.EmpItm4, T1.EmpItm3 FROM (TXPEMPRES T1 LEFT JOIN TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK43", "SELECT EmprCod, AlbProID, AlbProPrvI, AlbProAnul, AlbProATCU, AlbProDate, AlbProSal, AlbProLC1, AlbProLC2, AlbProLD1, AlbProLD2, AlbProLD3, AlbProHh, AlbProTipA, AlbProSerA, AlbProObs, AlbProMatr, AlbProSta, AlbProIDAT, AlbProStAT FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID  FOR UPDATE OF AlbProSta NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AK44", "SELECT EmprCod, AlbProID, AlbProUnd, PrdNum, AlbProDsc, AlbProLote, AlbProCnt, AlbProObsL, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AK45", "UPDATE TXPCALPRO SET AlbProSta=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
         ,new ForEachCursor("P0AK46", "SELECT EmprCod, PrvNum, PrvNom, PrvNom2, PrvDir, PrvCp2, PrvCpo, PrvPob, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((String[]) buf[10])[0] = rslt.getString(10, 40);
               ((String[]) buf[11])[0] = rslt.getString(11, 40);
               ((String[]) buf[12])[0] = rslt.getString(12, 40);
               ((String[]) buf[13])[0] = rslt.getVarchar(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 30);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 20);
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 60);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

