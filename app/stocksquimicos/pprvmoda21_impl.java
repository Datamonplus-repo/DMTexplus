package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pprvmoda21_impl extends GXWebReport
{
   public pprvmoda21_impl( com.genexus.internet.HttpContext context )
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
            A13418AlbProID = (int)(GXutil.lval( httpContext.GetPar( "AlbProID"))) ;
            AV23ImpCod = httpContext.GetPar( "ImpCod") ;
            AV14TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
      M_bot = 15 ;
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
         P_lines = (int)(gxYPage-(lineHeight*15)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV45FirmaD ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char1 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
         pprvmoda21_impl.this.A396EmprCod = GXv_char2[0] ;
         pprvmoda21_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45FirmaD = GXt_char1 ;
         GXt_int5 = AV43existefirmad ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
         pprvmoda21_impl.this.GXt_int5 = GXv_int6[0] ;
         AV43existefirmad = GXt_int5 ;
         GXt_int5 = AV64PQrcode ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQRCOD", ""), GXv_int6) ;
         pprvmoda21_impl.this.GXt_int5 = GXv_int6[0] ;
         AV64PQrcode = GXt_int5 ;
         GXv_char4[0] = AV41ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVALM", ""), GXv_char4) ;
         pprvmoda21_impl.this.AV41ContDsc = GXv_char4[0] ;
         /* Using cursor P09SX2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A953IvaCod = P09SX2_A953IvaCod[0] ;
            n953IvaCod = P09SX2_n953IvaCod[0] ;
            A395EmprCif = P09SX2_A395EmprCif[0] ;
            n395EmprCif = P09SX2_n395EmprCif[0] ;
            A8334EmpItm1 = P09SX2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P09SX2_n8334EmpItm1[0] ;
            A8335EmpItm2 = P09SX2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P09SX2_n8335EmpItm2[0] ;
            A588IvaPor = P09SX2_A588IvaPor[0] ;
            n588IvaPor = P09SX2_n588IvaPor[0] ;
            A588IvaPor = P09SX2_A588IvaPor[0] ;
            n588IvaPor = P09SX2_n588IvaPor[0] ;
            AV61EmprCif = A395EmprCif ;
            AV75EmpItm1 = A8334EmpItm1 ;
            AV76EmpItm2 = A8335EmpItm2 ;
            AV17IvaPor = A588IvaPor ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GxHdr3 = true ;
         /* Using cursor P09SX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14190AlbProATCU = P09SX3_A14190AlbProATCU[0] ;
            n14190AlbProATCU = P09SX3_n14190AlbProATCU[0] ;
            A13429AlbProSal = P09SX3_A13429AlbProSal[0] ;
            A13579AlbProLC1 = P09SX3_A13579AlbProLC1[0] ;
            A13580AlbProLC2 = P09SX3_A13580AlbProLC2[0] ;
            A13582AlbProLD1 = P09SX3_A13582AlbProLD1[0] ;
            A13583AlbProLD2 = P09SX3_A13583AlbProLD2[0] ;
            A13584AlbProLD3 = P09SX3_A13584AlbProLD3[0] ;
            A13419AlbProPrvI = P09SX3_A13419AlbProPrvI[0] ;
            A13433AlbProHh = P09SX3_A13433AlbProHh[0] ;
            A13436AlbProIDAT = P09SX3_A13436AlbProIDAT[0] ;
            A13439AlbProObs = P09SX3_A13439AlbProObs[0] ;
            A13424AlbProMatr = P09SX3_A13424AlbProMatr[0] ;
            A13437AlbProSta = P09SX3_A13437AlbProSta[0] ;
            A13430AlbProDate = P09SX3_A13430AlbProDate[0] ;
            AV66codValidacaoSerie = A14190AlbProATCU ;
            AV67atcud = ((GXutil.strcmp("", AV66codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD:", "")+GXutil.trim( AV66codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A13418AlbProID, 8, 0))) ;
            AV77DiaHora = localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV69DiaCarga = localUtil.ctod( GXutil.substring( AV77DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV68HoraCarga = GXutil.substring( AV77DiaHora, 12, 8) ;
            AV70AlbProLC1 = ((GXutil.strcmp("", A13579AlbProLC1)==0) ? httpContext.getMessage( "N/ Instalações", "") : A13579AlbProLC1) ;
            AV71AlbProLC2 = ((GXutil.strcmp("", A13580AlbProLC2)==0) ? httpContext.getMessage( "V/ Instalações", "") : A13580AlbProLC2) ;
            AV72AlbProLD1 = ((GXutil.strcmp("", A13582AlbProLD1)==0) ? GXutil.trim( AV35CliEDom) : A13582AlbProLD1) ;
            AV73AlbProLD2 = ((GXutil.strcmp("", A13583AlbProLD2)==0) ? GXutil.trim( AV37CliEPob) : A13583AlbProLD2) ;
            AV74AlbProLD3 = ((GXutil.strcmp("", A13584AlbProLD3)==0) ? GXutil.trim( AV34CliEcp)+" "+GXutil.trim( AV56PrvDsc) : A13584AlbProLD3) ;
            AV49PrvNum = A13419AlbProPrvI ;
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
            AV52Cp_1_2 = GXutil.trim( AV32Clicp) ;
            AV13Texto_fd = " " ;
            if ( GXutil.strcmp(A13433AlbProHh, " ") != 0 )
            {
               AV44Firma4dig = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
               AV13Texto_fd = AV44Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV45FirmaD) ;
            }
            else
            {
               AV13Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV12AtId = " " ;
            if ( GXutil.strcmp(A13436AlbProIDAT, " ") != 0 )
            {
               AV12AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A13436AlbProIDAT, 1, 12)) ;
            }
            AV44Firma4dig = GXutil.substring( A13433AlbProHh, 1, 1) + GXutil.substring( A13433AlbProHh, 11, 1) + GXutil.substring( A13433AlbProHh, 21, 1) + GXutil.substring( A13433AlbProHh, 31, 1) ;
            AV63TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV61EmprCif) + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( AV15CliNif) + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "D:", "") + httpContext.getMessage( "GT", "") + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV58anyo = (short)(GXutil.year( A13430AlbProDate)) ;
            AV59mes = (byte)(GXutil.month( A13430AlbProDate)) ;
            AV60dia = (byte)(GXutil.day( A13430AlbProDate)) ;
            AV63TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV58anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV59mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV60dia, 2, 0)), (short)(2), "0") + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "G:", "") + httpContext.getMessage( "GT 7/", "") + GXutil.trim( GXutil.str( A13418AlbProID, 8, 0)) + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "H:", "") + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "Q:", "") + AV44Firma4dig + "*" ;
            AV63TextoGenerar += httpContext.getMessage( "R:", "") + GXutil.trim( AV45FirmaD) + "*" ;
            GXt_char1 = AV78Url ;
            GXv_char4[0] = GXt_char1 ;
            new app.qr_obtener(remoteHandle, context).execute( AV63TextoGenerar, (short)(120), (short)(120), GXv_char4) ;
            pprvmoda21_impl.this.GXt_char1 = GXv_char4[0] ;
            AV78Url = GXt_char1 ;
            AV62Imagen = AV78Url ;
            AV86Imagen_GXI = GXDbFile.pathToUrl( AV78Url, context.getHttpContext()) ;
            AV9VDoc = httpContext.getMessage( "GUIA DE DEVOLUÇÃO", "") ;
            AV48vCopia = ((AV42Copias==1) ? httpContext.getMessage( "DUPLICADO", "") : "") ;
            AV57Nlin = (short)(GXutil.gxmlines( A13439AlbProObs, (short)(50))) ;
            AV46i = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 2 )
            {
               AV22vObs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            while ( AV46i <= AV57Nlin )
            {
               if ( AV46i > 2 )
               {
                  if (true) break;
               }
               AV22vObs[AV46i-1] = GXutil.gxgetmli( A13439AlbProObs, AV46i, (short)(50)) ;
               AV46i = (byte)(AV46i+1) ;
            }
            AV20AlbMat = A13424AlbProMatr ;
            AV54AlbProFch = A13430AlbProDate ;
            AV28Num_lineas = (short)(0) ;
            AV18valorIva = DecimalUtil.doubleToDec(0) ;
            AV16FacImp = DecimalUtil.doubleToDec(0) ;
            AV21FacTot = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P09SX4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13418AlbProID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13444AlbProUnd = P09SX4_A13444AlbProUnd[0] ;
               n13444AlbProUnd = P09SX4_n13444AlbProUnd[0] ;
               A13448AlbProDsc = P09SX4_A13448AlbProDsc[0] ;
               n13448AlbProDsc = P09SX4_n13448AlbProDsc[0] ;
               A13443AlbProCnt = P09SX4_A13443AlbProCnt[0] ;
               n13443AlbProCnt = P09SX4_n13443AlbProCnt[0] ;
               A13447AlbProObsL = P09SX4_A13447AlbProObsL[0] ;
               n13447AlbProObsL = P09SX4_n13447AlbProObsL[0] ;
               A13442AlbProLine = P09SX4_A13442AlbProLine[0] ;
               if ( AV28Num_lineas >= 21 )
               {
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
                  AV28Num_lineas = (short)(1) ;
               }
               AV50Und = A13444AlbProUnd ;
               GXv_char4[0] = AV79prdnum ;
               GXv_char3[0] = AV80prdnom ;
               new app.obtengoprdnumlalpro(remoteHandle, context).execute( A396EmprCod, A13418AlbProID, A13442AlbProLine, GXv_char4, GXv_char3) ;
               pprvmoda21_impl.this.AV79prdnum = GXv_char4[0] ;
               pprvmoda21_impl.this.AV80prdnom = GXv_char3[0] ;
               AV80prdnom = ((GXutil.strcmp("", AV80prdnom)==0) ? A13448AlbProDsc : AV80prdnom) ;
               h9SX0( false, 17) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A13443AlbProCnt, "ZZZZZ9.99")), 583, Gx_line+0, 650, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Und, "")), 655, Gx_line+1, 678, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79prdnum, "")), 141, Gx_line+0, 186, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80prdnom, "")), 196, Gx_line+0, 387, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV28Num_lineas = (short)(AV28Num_lineas+1) ;
               if ( GXutil.strcmp(A13447AlbProObsL, "") != 0 )
               {
                  h9SX0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13447AlbProObsL, "")), 141, Gx_line+0, 580, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV28Num_lineas = (short)(AV28Num_lineas+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( ( AV43existefirmad == 1 ) && (GXutil.strcmp("", A13433AlbProHh)==0) )
            {
               h9SX0( false, 31) ;
               getPrinter().GxAttris("Arial", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Atenção Documento sem assinatura digital.", ""), 185, Gx_line+0, 604, Gx_line+23, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+31) ;
            }
            A13437AlbProSta = (byte)(((A13437AlbProSta==0) ? 1 : A13437AlbProSta)) ;
            /* Using cursor P09SX5 */
            pr_default.execute(3, new Object[] {Byte.valueOf(A13437AlbProSta), A396EmprCod, Integer.valueOf(A13418AlbProID)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h9SX0( true, 0) ;
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
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      AV38CliNom = "" ;
      AV33CliDom = "" ;
      AV32Clicp = "" ;
      AV40CliPob = "" ;
      AV15CliNif = "" ;
      AV36CliENom = "" ;
      AV35CliEDom = "" ;
      AV34CliEcp = "" ;
      AV37CliEPob = "" ;
      AV56PrvDsc = "" ;
      AV53Prvdsc1 = "" ;
      /* Using cursor P09SX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV49PrvNum)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A795PrvNum = P09SX6_A795PrvNum[0] ;
         A794PrvNom = P09SX6_A794PrvNom[0] ;
         n794PrvNom = P09SX6_n794PrvNom[0] ;
         A6570PrvNom2 = P09SX6_A6570PrvNom2[0] ;
         n6570PrvNom2 = P09SX6_n6570PrvNom2[0] ;
         A786PrvDir = P09SX6_A786PrvDir[0] ;
         n786PrvDir = P09SX6_n786PrvDir[0] ;
         A6075PrvCp2 = P09SX6_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09SX6_n6075PrvCp2[0] ;
         A782PrvCpo = P09SX6_A782PrvCpo[0] ;
         n782PrvCpo = P09SX6_n782PrvCpo[0] ;
         A799PrvPob = P09SX6_A799PrvPob[0] ;
         n799PrvPob = P09SX6_n799PrvPob[0] ;
         A793PrvNif = P09SX6_A793PrvNif[0] ;
         n793PrvNif = P09SX6_n793PrvNif[0] ;
         AV38CliNom = A794PrvNom ;
         AV51CliNom12 = GXutil.trim( A794PrvNom) + " " + GXutil.trim( A6570PrvNom2) ;
         AV33CliDom = A786PrvDir ;
         AV32Clicp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV40CliPob = A799PrvPob ;
         AV15CliNif = A793PrvNif ;
         AV36CliENom = A794PrvNom ;
         AV35CliEDom = A786PrvDir ;
         AV34CliEcp = GXutil.trim( A782PrvCpo) + "-" + GXutil.trim( A6075PrvCp2) ;
         AV37CliEPob = A799PrvPob ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void h9SX0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Capital Social 3.250.000 € - Contribuinte nº 504 304 640-Matriculada na Conservatória do Registo Comercial de Braga sob o nº 7402", ""), 66, Gx_line+186, 688, Gx_line+202, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "MODA 21, Tinturaria e Acabamentos Têxteis, SA - Ruães - Mire de Tibães - 4700-565 Braga   Telef: 253 300390   Fax: 253 300399 E-mail: moda21@moda21.pt", ""), 15, Gx_line+169, 746, Gx_line+185, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(15, Gx_line+167, 745, Gx_line+167, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41ContDsc, "")), 652, Gx_line+153, 736, Gx_line+167, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 15, Gx_line+49, 87, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Partida:", ""), 502, Gx_line+49, 539, Gx_line+63, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68HoraCarga, "")), 665, Gx_line+47, 749, Gx_line+62, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 700, Gx_line+91, 727, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matricula:", ""), 502, Gx_line+66, 553, Gx_line+80, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20AlbMat, "")), 575, Gx_line+66, 701, Gx_line+81, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 15, Gx_line+91, 104, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Chegada:     /     /", ""), 503, Gx_line+91, 579, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 621, Gx_line+47, 648, Gx_line+61, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RECEBIDO POR", ""), 569, Gx_line+107, 639, Gx_line+121, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(518, Gx_line+141, 723, Gx_line+141, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( AV69DiaCarga, "99/99/99"), 560, Gx_line+49, 607, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70AlbProLC1, "")), 131, Gx_line+49, 382, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71AlbProLC2, "")), 131, Gx_line+64, 382, Gx_line+79, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72AlbProLD1, "")), 131, Gx_line+91, 382, Gx_line+106, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73AlbProLD2, "")), 131, Gx_line+105, 382, Gx_line+120, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74AlbProLD3, "")), 131, Gx_line+120, 382, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes:", ""), 15, Gx_line+8, 85, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22vObs[1-1], "")), 131, Gx_line+8, 445, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22vObs[2-1], "")), 131, Gx_line+23, 445, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13Texto_fd, "")), 15, Gx_line+153, 266, Gx_line+167, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+213) ;
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
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Exmos. Srs.", ""), 424, Gx_line+183, 501, Gx_line+200, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")), 647, Gx_line+117, 706, Gx_line+134, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9VDoc, "")), 530, Gx_line+117, 614, Gx_line+134, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51CliNom12, "")), 423, Gx_line+206, 799, Gx_line+224, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33CliDom, "")), 423, Gx_line+225, 637, Gx_line+243, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40CliPob, "")), 423, Gx_line+245, 612, Gx_line+263, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Cp_1_2, "")), 423, Gx_line+265, 481, Gx_line+282, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Prvdsc1, "@!")), 486, Gx_line+266, 643, Gx_line+283, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV62Imagen)==0) ? AV86Imagen_GXI : AV62Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 64, Gx_line+155, 189, Gx_line+280) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67atcud, "")), 32, Gx_line+129, 221, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "af3e3dab-8100-494d-89a9-ebc062780c41", "", context.getHttpContext().getTheme( )), 16, Gx_line+0, 773, Gx_line+95) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14TextoCopia, "")), 647, Gx_line+156, 752, Gx_line+172, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+293) ;
               getPrinter().GxDrawRect(15, Gx_line+0, 774, Gx_line+42, 1, 0, 0, 0, 1, 224, 224, 224, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº Contribuinte", ""), 42, Gx_line+14, 151, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data do Documento", ""), 285, Gx_line+14, 406, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 624, Gx_line+14, 667, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15CliNif, "@!")), 49, Gx_line+48, 154, Gx_line+65, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A13430AlbProDate, "99/99/99"), 322, Gx_line+49, 373, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 600, Gx_line+50, 645, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 660, Gx_line+50, 715, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("/", 651, Gx_line+50, 655, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(15, Gx_line+41, 774, Gx_line+75, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+78) ;
               getPrinter().GxDrawRect(15, Gx_line+16, 774, Gx_line+44, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Qtd", ""), 629, Gx_line+22, 650, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 141, Gx_line+22, 187, Gx_line+38, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descriçao", ""), 196, Gx_line+22, 255, Gx_line+38, 0+256, 0, 0, 0) ;
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
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.pprvmoda21");
      CloseOpenCursors();
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.pprvmoda21");
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
      AV23ImpCod = "" ;
      AV14TextoCopia = "" ;
      AV45FirmaD = "" ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new byte[1] ;
      AV41ContDsc = "" ;
      scmdbuf = "" ;
      P09SX2_A953IvaCod = new String[] {""} ;
      P09SX2_n953IvaCod = new boolean[] {false} ;
      P09SX2_A396EmprCod = new String[] {""} ;
      P09SX2_A395EmprCif = new String[] {""} ;
      P09SX2_n395EmprCif = new boolean[] {false} ;
      P09SX2_A8334EmpItm1 = new String[] {""} ;
      P09SX2_n8334EmpItm1 = new boolean[] {false} ;
      P09SX2_A8335EmpItm2 = new String[] {""} ;
      P09SX2_n8335EmpItm2 = new boolean[] {false} ;
      P09SX2_A588IvaPor = new byte[1] ;
      P09SX2_n588IvaPor = new boolean[] {false} ;
      A953IvaCod = "" ;
      A395EmprCif = "" ;
      A8334EmpItm1 = "" ;
      A8335EmpItm2 = "" ;
      AV61EmprCif = "" ;
      AV75EmpItm1 = "" ;
      AV76EmpItm2 = "" ;
      P09SX3_A396EmprCod = new String[] {""} ;
      P09SX3_A13418AlbProID = new int[1] ;
      P09SX3_A14190AlbProATCU = new String[] {""} ;
      P09SX3_n14190AlbProATCU = new boolean[] {false} ;
      P09SX3_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09SX3_A13579AlbProLC1 = new String[] {""} ;
      P09SX3_A13580AlbProLC2 = new String[] {""} ;
      P09SX3_A13582AlbProLD1 = new String[] {""} ;
      P09SX3_A13583AlbProLD2 = new String[] {""} ;
      P09SX3_A13584AlbProLD3 = new String[] {""} ;
      P09SX3_A13419AlbProPrvI = new int[1] ;
      P09SX3_A13433AlbProHh = new String[] {""} ;
      P09SX3_A13436AlbProIDAT = new String[] {""} ;
      P09SX3_A13439AlbProObs = new String[] {""} ;
      P09SX3_A13424AlbProMatr = new String[] {""} ;
      P09SX3_A13437AlbProSta = new byte[1] ;
      P09SX3_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      A14190AlbProATCU = "" ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13579AlbProLC1 = "" ;
      A13580AlbProLC2 = "" ;
      A13582AlbProLD1 = "" ;
      A13583AlbProLD2 = "" ;
      A13584AlbProLD3 = "" ;
      A13433AlbProHh = "" ;
      A13436AlbProIDAT = "" ;
      A13439AlbProObs = "" ;
      A13424AlbProMatr = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      AV66codValidacaoSerie = "" ;
      AV67atcud = "" ;
      AV77DiaHora = "" ;
      AV69DiaCarga = GXutil.nullDate() ;
      AV68HoraCarga = "" ;
      AV70AlbProLC1 = "" ;
      AV71AlbProLC2 = "" ;
      AV72AlbProLD1 = "" ;
      AV35CliEDom = "" ;
      AV73AlbProLD2 = "" ;
      AV37CliEPob = "" ;
      AV74AlbProLD3 = "" ;
      AV34CliEcp = "" ;
      AV56PrvDsc = "" ;
      AV52Cp_1_2 = "" ;
      AV32Clicp = "" ;
      AV13Texto_fd = "" ;
      AV44Firma4dig = "" ;
      AV12AtId = "" ;
      AV63TextoGenerar = "" ;
      AV15CliNif = "" ;
      AV78Url = "" ;
      GXt_char1 = "" ;
      AV62Imagen = "" ;
      AV86Imagen_GXI = "" ;
      AV9VDoc = "" ;
      AV48vCopia = "" ;
      AV22vObs = new String[2] ;
      GX_I = 1 ;
      while ( GX_I <= 2 )
      {
         AV22vObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV20AlbMat = "" ;
      AV54AlbProFch = GXutil.nullDate() ;
      AV18valorIva = DecimalUtil.ZERO ;
      AV16FacImp = DecimalUtil.ZERO ;
      AV21FacTot = DecimalUtil.ZERO ;
      P09SX4_A396EmprCod = new String[] {""} ;
      P09SX4_A13418AlbProID = new int[1] ;
      P09SX4_A13444AlbProUnd = new String[] {""} ;
      P09SX4_n13444AlbProUnd = new boolean[] {false} ;
      P09SX4_A13448AlbProDsc = new String[] {""} ;
      P09SX4_n13448AlbProDsc = new boolean[] {false} ;
      P09SX4_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09SX4_n13443AlbProCnt = new boolean[] {false} ;
      P09SX4_A13447AlbProObsL = new String[] {""} ;
      P09SX4_n13447AlbProObsL = new boolean[] {false} ;
      P09SX4_A13442AlbProLine = new short[1] ;
      A13444AlbProUnd = "" ;
      A13448AlbProDsc = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13447AlbProObsL = "" ;
      AV50Und = "" ;
      AV79prdnum = "" ;
      GXv_char4 = new String[1] ;
      AV80prdnom = "" ;
      GXv_char3 = new String[1] ;
      AV38CliNom = "" ;
      AV33CliDom = "" ;
      AV40CliPob = "" ;
      AV36CliENom = "" ;
      AV53Prvdsc1 = "" ;
      P09SX6_A396EmprCod = new String[] {""} ;
      P09SX6_A795PrvNum = new int[1] ;
      P09SX6_A794PrvNom = new String[] {""} ;
      P09SX6_n794PrvNom = new boolean[] {false} ;
      P09SX6_A6570PrvNom2 = new String[] {""} ;
      P09SX6_n6570PrvNom2 = new boolean[] {false} ;
      P09SX6_A786PrvDir = new String[] {""} ;
      P09SX6_n786PrvDir = new boolean[] {false} ;
      P09SX6_A6075PrvCp2 = new String[] {""} ;
      P09SX6_n6075PrvCp2 = new boolean[] {false} ;
      P09SX6_A782PrvCpo = new String[] {""} ;
      P09SX6_n782PrvCpo = new boolean[] {false} ;
      P09SX6_A799PrvPob = new String[] {""} ;
      P09SX6_n799PrvPob = new boolean[] {false} ;
      P09SX6_A793PrvNif = new String[] {""} ;
      P09SX6_n793PrvNif = new boolean[] {false} ;
      A794PrvNom = "" ;
      A6570PrvNom2 = "" ;
      A786PrvDir = "" ;
      A6075PrvCp2 = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      AV51CliNom12 = "" ;
      AV62Imagen = "" ;
      sImgUrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.pprvmoda21__default(),
         new Object[] {
             new Object[] {
            P09SX2_A953IvaCod, P09SX2_n953IvaCod, P09SX2_A396EmprCod, P09SX2_A395EmprCif, P09SX2_n395EmprCif, P09SX2_A8334EmpItm1, P09SX2_n8334EmpItm1, P09SX2_A8335EmpItm2, P09SX2_n8335EmpItm2, P09SX2_A588IvaPor,
            P09SX2_n588IvaPor
            }
            , new Object[] {
            P09SX3_A396EmprCod, P09SX3_A13418AlbProID, P09SX3_A14190AlbProATCU, P09SX3_n14190AlbProATCU, P09SX3_A13429AlbProSal, P09SX3_A13579AlbProLC1, P09SX3_A13580AlbProLC2, P09SX3_A13582AlbProLD1, P09SX3_A13583AlbProLD2, P09SX3_A13584AlbProLD3,
            P09SX3_A13419AlbProPrvI, P09SX3_A13433AlbProHh, P09SX3_A13436AlbProIDAT, P09SX3_A13439AlbProObs, P09SX3_A13424AlbProMatr, P09SX3_A13437AlbProSta, P09SX3_A13430AlbProDate
            }
            , new Object[] {
            P09SX4_A396EmprCod, P09SX4_A13418AlbProID, P09SX4_A13444AlbProUnd, P09SX4_n13444AlbProUnd, P09SX4_A13448AlbProDsc, P09SX4_n13448AlbProDsc, P09SX4_A13443AlbProCnt, P09SX4_n13443AlbProCnt, P09SX4_A13447AlbProObsL, P09SX4_n13447AlbProObsL,
            P09SX4_A13442AlbProLine
            }
            , new Object[] {
            }
            , new Object[] {
            P09SX6_A396EmprCod, P09SX6_A795PrvNum, P09SX6_A794PrvNom, P09SX6_n794PrvNom, P09SX6_A6570PrvNom2, P09SX6_n6570PrvNom2, P09SX6_A786PrvDir, P09SX6_n786PrvDir, P09SX6_A6075PrvCp2, P09SX6_n6075PrvCp2,
            P09SX6_A782PrvCpo, P09SX6_n782PrvCpo, P09SX6_A799PrvPob, P09SX6_n799PrvPob, P09SX6_A793PrvNif, P09SX6_n793PrvNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV43existefirmad ;
   private byte AV64PQrcode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A588IvaPor ;
   private byte AV17IvaPor ;
   private byte A13437AlbProSta ;
   private byte AV59mes ;
   private byte AV60dia ;
   private byte AV42Copias ;
   private byte AV46i ;
   private short gxcookieaux ;
   private short AV58anyo ;
   private short AV57Nlin ;
   private short AV28Num_lineas ;
   private short A13442AlbProLine ;
   private short Gx_err ;
   private int A13418AlbProID ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A13419AlbProPrvI ;
   private int AV49PrvNum ;
   private int GX_I ;
   private int Gx_OldLine ;
   private int A795PrvNum ;
   private java.math.BigDecimal AV18valorIva ;
   private java.math.BigDecimal AV16FacImp ;
   private java.math.BigDecimal AV21FacTot ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV23ImpCod ;
   private String AV14TextoCopia ;
   private String AV45FirmaD ;
   private String GXv_char2[] ;
   private String AV41ContDsc ;
   private String scmdbuf ;
   private String A953IvaCod ;
   private String A395EmprCif ;
   private String A8334EmpItm1 ;
   private String A8335EmpItm2 ;
   private String AV61EmprCif ;
   private String AV75EmpItm1 ;
   private String AV76EmpItm2 ;
   private String A14190AlbProATCU ;
   private String A13579AlbProLC1 ;
   private String A13580AlbProLC2 ;
   private String A13582AlbProLD1 ;
   private String A13583AlbProLD2 ;
   private String A13584AlbProLD3 ;
   private String A13436AlbProIDAT ;
   private String A13424AlbProMatr ;
   private String AV66codValidacaoSerie ;
   private String AV67atcud ;
   private String AV77DiaHora ;
   private String AV68HoraCarga ;
   private String AV70AlbProLC1 ;
   private String AV71AlbProLC2 ;
   private String AV72AlbProLD1 ;
   private String AV35CliEDom ;
   private String AV73AlbProLD2 ;
   private String AV37CliEPob ;
   private String AV74AlbProLD3 ;
   private String AV34CliEcp ;
   private String AV56PrvDsc ;
   private String AV52Cp_1_2 ;
   private String AV32Clicp ;
   private String AV13Texto_fd ;
   private String AV44Firma4dig ;
   private String AV12AtId ;
   private String AV15CliNif ;
   private String GXt_char1 ;
   private String AV9VDoc ;
   private String AV48vCopia ;
   private String AV22vObs[] ;
   private String AV20AlbMat ;
   private String A13444AlbProUnd ;
   private String A13448AlbProDsc ;
   private String A13447AlbProObsL ;
   private String AV50Und ;
   private String AV79prdnum ;
   private String GXv_char4[] ;
   private String AV80prdnom ;
   private String GXv_char3[] ;
   private String AV38CliNom ;
   private String AV33CliDom ;
   private String AV40CliPob ;
   private String AV36CliENom ;
   private String AV53Prvdsc1 ;
   private String A794PrvNom ;
   private String A6570PrvNom2 ;
   private String A786PrvDir ;
   private String A6075PrvCp2 ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String AV51CliNom12 ;
   private String sImgUrl ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV69DiaCarga ;
   private java.util.Date AV54AlbProFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n953IvaCod ;
   private boolean n395EmprCif ;
   private boolean n8334EmpItm1 ;
   private boolean n8335EmpItm2 ;
   private boolean n588IvaPor ;
   private boolean GxHdr3 ;
   private boolean n14190AlbProATCU ;
   private boolean returnInSub ;
   private boolean n13444AlbProUnd ;
   private boolean n13448AlbProDsc ;
   private boolean n13443AlbProCnt ;
   private boolean n13447AlbProObsL ;
   private boolean n794PrvNom ;
   private boolean n6570PrvNom2 ;
   private boolean n786PrvDir ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private String A13433AlbProHh ;
   private String A13439AlbProObs ;
   private String AV63TextoGenerar ;
   private String AV78Url ;
   private String AV86Imagen_GXI ;
   private String AV62Imagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P09SX2_A953IvaCod ;
   private boolean[] P09SX2_n953IvaCod ;
   private String[] P09SX2_A396EmprCod ;
   private String[] P09SX2_A395EmprCif ;
   private boolean[] P09SX2_n395EmprCif ;
   private String[] P09SX2_A8334EmpItm1 ;
   private boolean[] P09SX2_n8334EmpItm1 ;
   private String[] P09SX2_A8335EmpItm2 ;
   private boolean[] P09SX2_n8335EmpItm2 ;
   private byte[] P09SX2_A588IvaPor ;
   private boolean[] P09SX2_n588IvaPor ;
   private String[] P09SX3_A396EmprCod ;
   private int[] P09SX3_A13418AlbProID ;
   private String[] P09SX3_A14190AlbProATCU ;
   private boolean[] P09SX3_n14190AlbProATCU ;
   private java.util.Date[] P09SX3_A13429AlbProSal ;
   private String[] P09SX3_A13579AlbProLC1 ;
   private String[] P09SX3_A13580AlbProLC2 ;
   private String[] P09SX3_A13582AlbProLD1 ;
   private String[] P09SX3_A13583AlbProLD2 ;
   private String[] P09SX3_A13584AlbProLD3 ;
   private int[] P09SX3_A13419AlbProPrvI ;
   private String[] P09SX3_A13433AlbProHh ;
   private String[] P09SX3_A13436AlbProIDAT ;
   private String[] P09SX3_A13439AlbProObs ;
   private String[] P09SX3_A13424AlbProMatr ;
   private byte[] P09SX3_A13437AlbProSta ;
   private java.util.Date[] P09SX3_A13430AlbProDate ;
   private String[] P09SX4_A396EmprCod ;
   private int[] P09SX4_A13418AlbProID ;
   private String[] P09SX4_A13444AlbProUnd ;
   private boolean[] P09SX4_n13444AlbProUnd ;
   private String[] P09SX4_A13448AlbProDsc ;
   private boolean[] P09SX4_n13448AlbProDsc ;
   private java.math.BigDecimal[] P09SX4_A13443AlbProCnt ;
   private boolean[] P09SX4_n13443AlbProCnt ;
   private String[] P09SX4_A13447AlbProObsL ;
   private boolean[] P09SX4_n13447AlbProObsL ;
   private short[] P09SX4_A13442AlbProLine ;
   private String[] P09SX6_A396EmprCod ;
   private int[] P09SX6_A795PrvNum ;
   private String[] P09SX6_A794PrvNom ;
   private boolean[] P09SX6_n794PrvNom ;
   private String[] P09SX6_A6570PrvNom2 ;
   private boolean[] P09SX6_n6570PrvNom2 ;
   private String[] P09SX6_A786PrvDir ;
   private boolean[] P09SX6_n786PrvDir ;
   private String[] P09SX6_A6075PrvCp2 ;
   private boolean[] P09SX6_n6075PrvCp2 ;
   private String[] P09SX6_A782PrvCpo ;
   private boolean[] P09SX6_n782PrvCpo ;
   private String[] P09SX6_A799PrvPob ;
   private boolean[] P09SX6_n799PrvPob ;
   private String[] P09SX6_A793PrvNif ;
   private boolean[] P09SX6_n793PrvNif ;
}

final  class pprvmoda21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09SX2", "SELECT T1.IvaCod, T1.EmprCod, T1.EmprCif, T1.EmpItm1, T1.EmpItm2, T2.IvaPor FROM (TXPEMPRES T1 LEFT JOIN TXPTIPIVA T2 ON T2.IvaCod = T1.IvaCod) WHERE T1.EmprCod = ? ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09SX3", "SELECT EmprCod, AlbProID, AlbProATCU, AlbProSal, AlbProLC1, AlbProLC2, AlbProLD1, AlbProLD2, AlbProLD3, AlbProPrvI, AlbProHh, AlbProIDAT, AlbProObs, AlbProMatr, AlbProSta, AlbProDate FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID  FOR UPDATE OF AlbProSta NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09SX4", "SELECT EmprCod, AlbProID, AlbProUnd, AlbProDsc, AlbProCnt, AlbProObsL, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID, AlbProLine ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09SX5", "UPDATE TXPCALPRO SET AlbProSta=?  WHERE EmprCod = ? AND AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
         ,new ForEachCursor("P09SX6", "SELECT EmprCod, PrvNum, PrvNom, PrvNom2, PrvDir, PrvCp2, PrvCpo, PrvPob, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((String[]) buf[6])[0] = rslt.getString(6, 40);
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               ((String[]) buf[8])[0] = rslt.getString(8, 40);
               ((String[]) buf[9])[0] = rslt.getString(9, 40);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getVarchar(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 20);
               ((String[]) buf[13])[0] = rslt.getVarchar(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
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

