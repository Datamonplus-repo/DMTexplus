package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class rdevcrumoda21copy1 extends GXReport
{
   public rdevcrumoda21copy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rdevcrumoda21copy1.class ), "" );
   }

   public rdevcrumoda21copy1( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      rdevcrumoda21copy1.this.AV54ReportInPut = aP0;
      rdevcrumoda21copy1.this.A396EmprCod = aP1;
      rdevcrumoda21copy1.this.A11669DevCruId = aP2;
      rdevcrumoda21copy1.this.AV44TextoCopia = aP3;
      rdevcrumoda21copy1.this.Gx_out = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 7 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV54ReportInPut) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*7)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV16ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVMOD", ""), GXv_char1) ;
         rdevcrumoda21copy1.this.AV16ContDsc = GXv_char1[0] ;
         GXt_char2 = AV27Firmad ;
         GXv_char1[0] = A396EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "FIRDGG", "") ;
         GXv_char4[0] = GXt_char2 ;
         new app.pbusdsc(remoteHandle, context).execute( GXv_char1, GXv_char3, GXv_char4) ;
         rdevcrumoda21copy1.this.A396EmprCod = GXv_char1[0] ;
         rdevcrumoda21copy1.this.GXt_char2 = GXv_char4[0] ;
         AV27Firmad = GXt_char2 ;
         /* Using cursor P0AJ02 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A8335EmpItm2 = P0AJ02_A8335EmpItm2[0] ;
            n8335EmpItm2 = P0AJ02_n8335EmpItm2[0] ;
            A8334EmpItm1 = P0AJ02_A8334EmpItm1[0] ;
            n8334EmpItm1 = P0AJ02_n8334EmpItm1[0] ;
            A8337EmpItm4 = P0AJ02_A8337EmpItm4[0] ;
            n8337EmpItm4 = P0AJ02_n8337EmpItm4[0] ;
            A8336EmpItm3 = P0AJ02_A8336EmpItm3[0] ;
            n8336EmpItm3 = P0AJ02_n8336EmpItm3[0] ;
            AV41Texto_1 = GXutil.trim( A8334EmpItm1) + " " + GXutil.trim( A8335EmpItm2) ;
            AV42Texto_2 = GXutil.trim( A8336EmpItm3) + " " + GXutil.trim( A8337EmpItm4) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P0AJ03 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A395EmprCif = P0AJ03_A395EmprCif[0] ;
            n395EmprCif = P0AJ03_n395EmprCif[0] ;
            AV24EmprCif = A395EmprCif ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GXv_char4[0] = AV56contidsernew ;
         new app.trabajosexternos.obtengocodigoserieat(remoteHandle, context).execute( AV59Emprcod, "022400", GXv_char4) ;
         rdevcrumoda21copy1.this.AV56contidsernew = GXv_char4[0] ;
         AV57SerieAT = ((GXutil.strcmp("", AV56contidsernew)==0) ? "GD6" : AV56contidsernew) ;
         GxHdr4 = true ;
         /* Using cursor P0AJ04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A11678DevCruStt = P0AJ04_A11678DevCruStt[0] ;
            A13983DevCruATCU = P0AJ04_A13983DevCruATCU[0] ;
            A11673DevCruSal = P0AJ04_A11673DevCruSal[0] ;
            A11670DevCruFec = P0AJ04_A11670DevCruFec[0] ;
            A11674DevCruHash = P0AJ04_A11674DevCruHash[0] ;
            A13985DevCruTipA = P0AJ04_A13985DevCruTipA[0] ;
            A13984DevCruSerA = P0AJ04_A13984DevCruSerA[0] ;
            A4828CliCp2 = P0AJ04_A4828CliCp2[0] ;
            A256CliCp = P0AJ04_A256CliCp[0] ;
            A11682DevCruObs = P0AJ04_A11682DevCruObs[0] ;
            A11671DevCruEst = P0AJ04_A11671DevCruEst[0] ;
            A11680DevCruAtId = P0AJ04_A11680DevCruAtId[0] ;
            A11679DevCruEnvA = P0AJ04_A11679DevCruEnvA[0] ;
            A11672DevCruMat = P0AJ04_A11672DevCruMat[0] ;
            A278CliNif = P0AJ04_A278CliNif[0] ;
            A252CliCod = P0AJ04_A252CliCod[0] ;
            A295CliPob = P0AJ04_A295CliPob[0] ;
            A260CliDom = P0AJ04_A260CliDom[0] ;
            A279CliNom = P0AJ04_A279CliNom[0] ;
            A4828CliCp2 = P0AJ04_A4828CliCp2[0] ;
            A256CliCp = P0AJ04_A256CliCp[0] ;
            A278CliNif = P0AJ04_A278CliNif[0] ;
            A295CliPob = P0AJ04_A295CliPob[0] ;
            A260CliDom = P0AJ04_A260CliDom[0] ;
            A279CliNom = P0AJ04_A279CliNom[0] ;
            AV12CliCod = A252CliCod ;
            AV74TextoAnulado = ((GXutil.strcmp(A11678DevCruStt, "A")==0) ? httpContext.getMessage( "ANULADO", "") : " ") ;
            AV15codValidacaoSerie = A13983DevCruATCU ;
            AV10atcud = ((GXutil.strcmp("", AV15codValidacaoSerie)==0) ? "" : httpContext.getMessage( "ATCUD: ", "")+GXutil.trim( AV15codValidacaoSerie)+"-"+GXutil.trim( GXutil.str( A11669DevCruId, 8, 0))) ;
            AV23DiaHora = localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV22DiaCarga = localUtil.ctod( GXutil.substring( AV23DiaHora, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV8anyo = (short)(GXutil.year( AV22DiaCarga)) ;
            AV32mes = (byte)(GXutil.month( AV22DiaCarga)) ;
            AV21dia = (short)(GXutil.day( AV22DiaCarga)) ;
            AV73DiaCargaalfa = GXutil.str( AV8anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV32mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV21dia, 2, 0)), (short)(2), "0") ;
            AV28HoraCarga = GXutil.substring( AV23DiaHora, 12, 8) ;
            AV68DevCruFec = A11670DevCruFec ;
            AV8anyo = (short)(GXutil.year( A11670DevCruFec)) ;
            AV32mes = (byte)(GXutil.month( A11670DevCruFec)) ;
            AV21dia = (short)(GXutil.day( A11670DevCruFec)) ;
            AV72DevCruFecalfa = GXutil.str( AV8anyo, 4, 0) + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV32mes, 2, 0)), (short)(2), "0") + "/" + GXutil.padl( GXutil.trim( GXutil.str( AV21dia, 2, 0)), (short)(2), "0") ;
            AV20DevMatric = A11672DevCruMat ;
            AV19DevHorSal = A11673DevCruSal ;
            AV43Texto_fd = " " ;
            if ( GXutil.strcmp(A11674DevCruHash, " ") != 0 )
            {
               AV26Firma4dig = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
               AV43Texto_fd = AV26Firma4dig + httpContext.getMessage( "-Processado por Programa Certificado nº. ", "") + GXutil.trim( AV27Firmad) ;
            }
            else
            {
               AV43Texto_fd = httpContext.getMessage( "**Processado por Computador**", "") ;
            }
            AV26Firma4dig = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
            AV45TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV24EmprCif) + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "B:", "") + GXutil.trim( A278CliNif) + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "C:", "") + httpContext.getMessage( "PT", "") + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "D:", "") + GXutil.trim( A13985DevCruTipA) + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "E:", "") + httpContext.getMessage( "N", "") + "*" ;
            AV8anyo = (short)(GXutil.year( A11670DevCruFec)) ;
            AV32mes = (byte)(GXutil.month( A11670DevCruFec)) ;
            AV21dia = (short)(GXutil.day( A11670DevCruFec)) ;
            AV45TextoGenerar += httpContext.getMessage( "F:", "") + GXutil.str( AV8anyo, 4, 0) + GXutil.padl( GXutil.trim( GXutil.str( AV32mes, 2, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV21dia, 2, 0)), (short)(2), "0") + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "G:", "") + GXutil.trim( A13985DevCruTipA) + " " + GXutil.trim( A13984DevCruSerA) + "/" + GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)) + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "H:", "") + GXutil.trim( A13983DevCruATCU) + "-" + GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)) + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "I1:", "") + "0" + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "N:", "") + "0.00" + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "O:", "") + "0.00" + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "Q:", "") + AV26Firma4dig + "*" ;
            AV45TextoGenerar += httpContext.getMessage( "R:", "") + "1208" ;
            AV52Dpi = (short)(300) ;
            AV51Centimetos = DecimalUtil.stringToDec("3.0") ;
            AV53Pixel = (short)(DecimalUtil.decToDouble(AV51Centimetos.multiply(DecimalUtil.doubleToDec(AV52Dpi)).divide(DecimalUtil.stringToDec("2.54"), 18, java.math.RoundingMode.DOWN))) ;
            GXt_char2 = AV50Url ;
            GXv_char4[0] = GXt_char2 ;
            new app.qr_obtener(remoteHandle, context).execute( AV45TextoGenerar, AV53Pixel, AV53Pixel, GXv_char4) ;
            rdevcrumoda21copy1.this.GXt_char2 = GXv_char4[0] ;
            AV50Url = GXt_char2 ;
            AV30Imagen = AV50Url ;
            AV82Imagen_GXI = GXDbFile.pathToUrl( AV50Url, context.getHttpContext()) ;
            AV11AtId = " " ;
            if ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 )
            {
               AV11AtId = httpContext.getMessage( "ATDocCodeID:", "") + " " + GXutil.trim( GXutil.substring( A11680DevCruAtId, 1, 12)) ;
            }
            AV25FechaAlb = GXutil.str( GXutil.day( A11670DevCruFec), 2, 0) + httpContext.getMessage( " de ", "") + localUtil.cmonth( A11670DevCruFec, httpContext.getMessage( "por", "")) + httpContext.getMessage( " de ", "") + GXutil.str( GXutil.year( A11670DevCruFec), 4, 0) ;
            AV55codigopostal = GXutil.trim( A256CliCp) + "-" + GXutil.trim( A4828CliCp2) ;
            AV58documento = GXutil.trim( A13985DevCruTipA) + " " + GXutil.trim( AV57SerieAT) + "/" + GXutil.trim( GXutil.str( A11669DevCruId, 8, 0)) ;
            /* Using cursor P0AJ05 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A56AlbRUni = P0AJ05_A56AlbRUni[0] ;
               A11683DevCruUnd = P0AJ05_A11683DevCruUnd[0] ;
               A11684DevCruPzs = P0AJ05_A11684DevCruPzs[0] ;
               A46AlbREnt = P0AJ05_A46AlbREnt[0] ;
               A3613AlbRefDsc = P0AJ05_A3613AlbRefDsc[0] ;
               A44AlbRecCod = P0AJ05_A44AlbRecCod[0] ;
               A56AlbRUni = P0AJ05_A56AlbRUni[0] ;
               A46AlbREnt = P0AJ05_A46AlbREnt[0] ;
               A3613AlbRefDsc = P0AJ05_A3613AlbRefDsc[0] ;
               AV67Und = ((GXutil.strcmp(A56AlbRUni, "K")==0) ? "KG" : "MT") ;
               hAJ00( false, 19) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 91, Gx_line+1, 227, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 294, Gx_line+0, 387, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9")), 585, Gx_line+0, 630, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11683DevCruUnd, "ZZZZZ9.99")), 453, Gx_line+0, 520, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67Und, "")), 525, Gx_line+0, 549, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV33Nlin = (short)(GXutil.gxmlines( A11682DevCruObs, (short)(57))) ;
            AV29i = (short)(1) ;
            while ( AV29i <= AV33Nlin )
            {
               if ( AV29i == 1 )
               {
                  hAJ00( false, 27) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 70, Gx_line+11, 150, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+27) ;
               }
               AV35Obstxt = GXutil.gxgetmli( A11682DevCruObs, AV29i, (short)(57)) ;
               hAJ00( false, 19) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Obstxt, "")), 70, Gx_line+1, 487, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               AV29i = (short)(AV29i+1) ;
            }
            A11671DevCruEst = (byte)(((A11671DevCruEst==0) ? 1 : A11671DevCruEst)) ;
            /* Using cursor P0AJ06 */
            pr_default.execute(4, new Object[] {Byte.valueOf(A11671DevCruEst), A396EmprCod, Integer.valueOf(A11669DevCruId)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         GxHdr4 = false ;
         AV75WEBSession.setValue(httpContext.getMessage( "RDEVCRUModa21Copy1_Clicod", ""), localUtil.format( DecimalUtil.doubleToDec(AV12CliCod), "ZZZZZ9"));
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAJ00( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void hAJ00( boolean bFoot ,
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
               getPrinter().GxDrawLine(33, Gx_line+50, 808, Gx_line+50, 1, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial Narrow", 8, true, false, false, false, 0, 0, 0, 128, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Texto_1, "")), 86, Gx_line+66, 754, Gx_line+83, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Texto_2, "")), 107, Gx_line+83, 733, Gx_line+100, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71textoNOAT, "")), 456, Gx_line+36, 733, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16ContDsc, "")), 743, Gx_line+36, 807, Gx_line+45, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 6, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11AtId, "")), 315, Gx_line+36, 446, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Texto_fd, "")), 33, Gx_line+36, 305, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Este documento não serve de fatura", ""), 331, Gx_line+50, 509, Gx_line+61, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+100) ;
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
            if ( GxHdr4 )
            {
               AV70RutaImagenMarcaAgua = "" ;
               AV71textoNOAT = "" ;
               if ( (GXutil.strcmp("", A11680DevCruAtId)==0) )
               {
                  AV71textoNOAT = httpContext.getMessage( "Este documento não serve de documento de transporte", "") ;
               }
               if ( A11679DevCruEnvA == 0 )
               {
                  AV69MarcaAguaImagen = context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )) ;
                  AV83Marcaaguaimagen_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "69323803-fa54-4926-ba08-aa10c587d7d9", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
                  sImgUrl = ((GXutil.strcmp("", AV69MarcaAguaImagen)==0) ? AV83Marcaaguaimagen_GXI : AV69MarcaAguaImagen) ;
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
               getPrinter().GxDrawRect(50, Gx_line+500, 714, Gx_line+531, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(408, Gx_line+245, 780, Gx_line+350, 1, 182, 182, 182, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 429, Gx_line+277, 618, Gx_line+295, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 429, Gx_line+297, 643, Gx_line+315, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 509, Gx_line+319, 698, Gx_line+337, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia de Devoluçao  Nº.", ""), 408, Gx_line+183, 590, Gx_line+203, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Página:", ""), 650, Gx_line+468, 687, Gx_line+483, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 694, Gx_line+468, 733, Gx_line+484, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Descrição", ""), 91, Gx_line+510, 152, Gx_line+526, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Doc. Cliente", ""), 294, Gx_line+513, 365, Gx_line+529, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quantidade", ""), 451, Gx_line+510, 520, Gx_line+526, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peças", ""), 592, Gx_line+510, 631, Gx_line+526, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "6b96aed2-1423-40cc-88de-0f8fd6f4522c", "", context.getHttpContext().getTheme( )), 38, Gx_line+10, 795, Gx_line+96) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TextoCopia, "")), 678, Gx_line+214, 773, Gx_line+232, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(31, Gx_line+406, 806, Gx_line+486, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Cliente:", ""), 56, Gx_line+416, 117, Gx_line+432, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Carga:", ""), 56, Gx_line+433, 148, Gx_line+449, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Documento:", ""), 56, Gx_line+451, 157, Gx_line+467, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Carga:", ""), 56, Gx_line+468, 126, Gx_line+484, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Nº Contibuinte:", ""), 467, Gx_line+417, 553, Gx_line+433, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local de Descarga:", ""), 467, Gx_line+434, 579, Gx_line+450, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Matrícula:", ""), 467, Gx_line+468, 522, Gx_line+484, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 156, Gx_line+416, 201, Gx_line+433, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72DevCruFecalfa, "")), 156, Gx_line+451, 261, Gx_line+468, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalaçoes", ""), 156, Gx_line+433, 239, Gx_line+449, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 595, Gx_line+417, 700, Gx_line+434, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalaçoes", ""), 595, Gx_line+434, 676, Gx_line+450, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), 536, Gx_line+468, 641, Gx_line+485, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28HoraCarga, "")), 317, Gx_line+467, 410, Gx_line+484, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73DiaCargaalfa, "")), 156, Gx_line+468, 261, Gx_line+485, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora:", ""), 281, Gx_line+467, 313, Gx_line+483, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10atcud, "")), 221, Gx_line+209, 378, Gx_line+226, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV30Imagen)==0) ? AV82Imagen_GXI : AV30Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 233, Gx_line+229, 366, Gx_line+367) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 752, Gx_line+468, 801, Gx_line+483, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 744, Gx_line+468, 746, Gx_line+483, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55codigopostal, "")), 431, Gx_line+319, 495, Gx_line+336, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58documento, "")), 600, Gx_line+183, 768, Gx_line+204, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 24, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TextoAnulado, "")), 267, Gx_line+117, 581, Gx_line+157, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+538) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Arial Narrow", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "rdevcrumoda21copy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16ContDsc = "" ;
      AV27Firmad = "" ;
      GXv_char1 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P0AJ02_A396EmprCod = new String[] {""} ;
      P0AJ02_A8335EmpItm2 = new String[] {""} ;
      P0AJ02_n8335EmpItm2 = new boolean[] {false} ;
      P0AJ02_A8334EmpItm1 = new String[] {""} ;
      P0AJ02_n8334EmpItm1 = new boolean[] {false} ;
      P0AJ02_A8337EmpItm4 = new String[] {""} ;
      P0AJ02_n8337EmpItm4 = new boolean[] {false} ;
      P0AJ02_A8336EmpItm3 = new String[] {""} ;
      P0AJ02_n8336EmpItm3 = new boolean[] {false} ;
      A8335EmpItm2 = "" ;
      A8334EmpItm1 = "" ;
      A8337EmpItm4 = "" ;
      A8336EmpItm3 = "" ;
      AV41Texto_1 = "" ;
      AV42Texto_2 = "" ;
      P0AJ03_A396EmprCod = new String[] {""} ;
      P0AJ03_A395EmprCif = new String[] {""} ;
      P0AJ03_n395EmprCif = new boolean[] {false} ;
      A395EmprCif = "" ;
      AV24EmprCif = "" ;
      AV59Emprcod = "" ;
      AV56contidsernew = "" ;
      AV57SerieAT = "" ;
      P0AJ04_A396EmprCod = new String[] {""} ;
      P0AJ04_A11669DevCruId = new int[1] ;
      P0AJ04_A11678DevCruStt = new String[] {""} ;
      P0AJ04_A13983DevCruATCU = new String[] {""} ;
      P0AJ04_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ04_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AJ04_A11674DevCruHash = new String[] {""} ;
      P0AJ04_A13985DevCruTipA = new String[] {""} ;
      P0AJ04_A13984DevCruSerA = new String[] {""} ;
      P0AJ04_A4828CliCp2 = new String[] {""} ;
      P0AJ04_A256CliCp = new String[] {""} ;
      P0AJ04_A11682DevCruObs = new String[] {""} ;
      P0AJ04_A11671DevCruEst = new byte[1] ;
      P0AJ04_A11680DevCruAtId = new String[] {""} ;
      P0AJ04_A11679DevCruEnvA = new byte[1] ;
      P0AJ04_A11672DevCruMat = new String[] {""} ;
      P0AJ04_A278CliNif = new String[] {""} ;
      P0AJ04_A252CliCod = new int[1] ;
      P0AJ04_A295CliPob = new String[] {""} ;
      P0AJ04_A260CliDom = new String[] {""} ;
      P0AJ04_A279CliNom = new String[] {""} ;
      A11678DevCruStt = "" ;
      A13983DevCruATCU = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11670DevCruFec = GXutil.nullDate() ;
      A11674DevCruHash = "" ;
      A13985DevCruTipA = "" ;
      A13984DevCruSerA = "" ;
      A4828CliCp2 = "" ;
      A256CliCp = "" ;
      A11682DevCruObs = "" ;
      A11680DevCruAtId = "" ;
      A11672DevCruMat = "" ;
      A278CliNif = "" ;
      A295CliPob = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      AV74TextoAnulado = "" ;
      AV15codValidacaoSerie = "" ;
      AV10atcud = "" ;
      AV23DiaHora = "" ;
      AV22DiaCarga = GXutil.nullDate() ;
      AV73DiaCargaalfa = "" ;
      AV28HoraCarga = "" ;
      AV68DevCruFec = GXutil.nullDate() ;
      AV72DevCruFecalfa = "" ;
      AV20DevMatric = "" ;
      AV19DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      AV43Texto_fd = "" ;
      AV26Firma4dig = "" ;
      AV45TextoGenerar = "" ;
      AV51Centimetos = DecimalUtil.ZERO ;
      AV50Url = "" ;
      GXt_char2 = "" ;
      GXv_char4 = new String[1] ;
      AV30Imagen = "" ;
      AV82Imagen_GXI = "" ;
      AV11AtId = "" ;
      AV25FechaAlb = "" ;
      AV55codigopostal = "" ;
      AV58documento = "" ;
      P0AJ05_A396EmprCod = new String[] {""} ;
      P0AJ05_A11669DevCruId = new int[1] ;
      P0AJ05_A56AlbRUni = new String[] {""} ;
      P0AJ05_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AJ05_A11684DevCruPzs = new int[1] ;
      P0AJ05_A46AlbREnt = new String[] {""} ;
      P0AJ05_A3613AlbRefDsc = new String[] {""} ;
      P0AJ05_A44AlbRecCod = new int[1] ;
      A56AlbRUni = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A46AlbREnt = "" ;
      A3613AlbRefDsc = "" ;
      AV67Und = "" ;
      AV35Obstxt = "" ;
      AV75WEBSession = httpContext.getWebSession();
      AV71textoNOAT = "" ;
      AV70RutaImagenMarcaAgua = "" ;
      AV69MarcaAguaImagen = "" ;
      AV83Marcaaguaimagen_GXI = "" ;
      AV69MarcaAguaImagen = "" ;
      sImgUrl = "" ;
      AV30Imagen = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevcrumoda21copy1__default(),
         new Object[] {
             new Object[] {
            P0AJ02_A396EmprCod, P0AJ02_A8335EmpItm2, P0AJ02_n8335EmpItm2, P0AJ02_A8334EmpItm1, P0AJ02_n8334EmpItm1, P0AJ02_A8337EmpItm4, P0AJ02_n8337EmpItm4, P0AJ02_A8336EmpItm3, P0AJ02_n8336EmpItm3
            }
            , new Object[] {
            P0AJ03_A396EmprCod, P0AJ03_A395EmprCif, P0AJ03_n395EmprCif
            }
            , new Object[] {
            P0AJ04_A396EmprCod, P0AJ04_A11669DevCruId, P0AJ04_A11678DevCruStt, P0AJ04_A13983DevCruATCU, P0AJ04_A11673DevCruSal, P0AJ04_A11670DevCruFec, P0AJ04_A11674DevCruHash, P0AJ04_A13985DevCruTipA, P0AJ04_A13984DevCruSerA, P0AJ04_A4828CliCp2,
            P0AJ04_A256CliCp, P0AJ04_A11682DevCruObs, P0AJ04_A11671DevCruEst, P0AJ04_A11680DevCruAtId, P0AJ04_A11679DevCruEnvA, P0AJ04_A11672DevCruMat, P0AJ04_A278CliNif, P0AJ04_A252CliCod, P0AJ04_A295CliPob, P0AJ04_A260CliDom,
            P0AJ04_A279CliNom
            }
            , new Object[] {
            P0AJ05_A396EmprCod, P0AJ05_A11669DevCruId, P0AJ05_A56AlbRUni, P0AJ05_A11683DevCruUnd, P0AJ05_A11684DevCruPzs, P0AJ05_A46AlbREnt, P0AJ05_A3613AlbRefDsc, P0AJ05_A44AlbRecCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte AV32mes ;
   private short AV8anyo ;
   private short AV21dia ;
   private short AV52Dpi ;
   private short AV53Pixel ;
   private short AV33Nlin ;
   private short AV29i ;
   private short Gx_err ;
   private int A11669DevCruId ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV12CliCod ;
   private int A11684DevCruPzs ;
   private int A44AlbRecCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV51Centimetos ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private String A396EmprCod ;
   private String AV44TextoCopia ;
   private String Gx_out ;
   private String AV16ContDsc ;
   private String AV27Firmad ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A8335EmpItm2 ;
   private String A8334EmpItm1 ;
   private String A8337EmpItm4 ;
   private String A8336EmpItm3 ;
   private String AV41Texto_1 ;
   private String AV42Texto_2 ;
   private String A395EmprCif ;
   private String AV24EmprCif ;
   private String AV59Emprcod ;
   private String AV56contidsernew ;
   private String AV57SerieAT ;
   private String A11678DevCruStt ;
   private String A13983DevCruATCU ;
   private String A11674DevCruHash ;
   private String A13985DevCruTipA ;
   private String A13984DevCruSerA ;
   private String A4828CliCp2 ;
   private String A256CliCp ;
   private String A11680DevCruAtId ;
   private String A11672DevCruMat ;
   private String A278CliNif ;
   private String A295CliPob ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String AV74TextoAnulado ;
   private String AV15codValidacaoSerie ;
   private String AV10atcud ;
   private String AV23DiaHora ;
   private String AV73DiaCargaalfa ;
   private String AV28HoraCarga ;
   private String AV72DevCruFecalfa ;
   private String AV20DevMatric ;
   private String AV43Texto_fd ;
   private String AV26Firma4dig ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String AV11AtId ;
   private String AV25FechaAlb ;
   private String AV58documento ;
   private String A56AlbRUni ;
   private String A46AlbREnt ;
   private String A3613AlbRefDsc ;
   private String AV67Und ;
   private String AV35Obstxt ;
   private String AV71textoNOAT ;
   private String sImgUrl ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date AV19DevHorSal ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date AV22DiaCarga ;
   private java.util.Date AV68DevCruFec ;
   private boolean n8335EmpItm2 ;
   private boolean n8334EmpItm1 ;
   private boolean n8337EmpItm4 ;
   private boolean n8336EmpItm3 ;
   private boolean n395EmprCif ;
   private boolean GxHdr4 ;
   private String AV54ReportInPut ;
   private String A11682DevCruObs ;
   private String AV45TextoGenerar ;
   private String AV50Url ;
   private String AV82Imagen_GXI ;
   private String AV55codigopostal ;
   private String AV70RutaImagenMarcaAgua ;
   private String AV83Marcaaguaimagen_GXI ;
   private String AV30Imagen ;
   private String AV69MarcaAguaImagen ;
   private String Marcaaguaimagen ;
   private String Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJ02_A396EmprCod ;
   private String[] P0AJ02_A8335EmpItm2 ;
   private boolean[] P0AJ02_n8335EmpItm2 ;
   private String[] P0AJ02_A8334EmpItm1 ;
   private boolean[] P0AJ02_n8334EmpItm1 ;
   private String[] P0AJ02_A8337EmpItm4 ;
   private boolean[] P0AJ02_n8337EmpItm4 ;
   private String[] P0AJ02_A8336EmpItm3 ;
   private boolean[] P0AJ02_n8336EmpItm3 ;
   private String[] P0AJ03_A396EmprCod ;
   private String[] P0AJ03_A395EmprCif ;
   private boolean[] P0AJ03_n395EmprCif ;
   private String[] P0AJ04_A396EmprCod ;
   private int[] P0AJ04_A11669DevCruId ;
   private String[] P0AJ04_A11678DevCruStt ;
   private String[] P0AJ04_A13983DevCruATCU ;
   private java.util.Date[] P0AJ04_A11673DevCruSal ;
   private java.util.Date[] P0AJ04_A11670DevCruFec ;
   private String[] P0AJ04_A11674DevCruHash ;
   private String[] P0AJ04_A13985DevCruTipA ;
   private String[] P0AJ04_A13984DevCruSerA ;
   private String[] P0AJ04_A4828CliCp2 ;
   private String[] P0AJ04_A256CliCp ;
   private String[] P0AJ04_A11682DevCruObs ;
   private byte[] P0AJ04_A11671DevCruEst ;
   private String[] P0AJ04_A11680DevCruAtId ;
   private byte[] P0AJ04_A11679DevCruEnvA ;
   private String[] P0AJ04_A11672DevCruMat ;
   private String[] P0AJ04_A278CliNif ;
   private int[] P0AJ04_A252CliCod ;
   private String[] P0AJ04_A295CliPob ;
   private String[] P0AJ04_A260CliDom ;
   private String[] P0AJ04_A279CliNom ;
   private String[] P0AJ05_A396EmprCod ;
   private int[] P0AJ05_A11669DevCruId ;
   private String[] P0AJ05_A56AlbRUni ;
   private java.math.BigDecimal[] P0AJ05_A11683DevCruUnd ;
   private int[] P0AJ05_A11684DevCruPzs ;
   private String[] P0AJ05_A46AlbREnt ;
   private String[] P0AJ05_A3613AlbRefDsc ;
   private int[] P0AJ05_A44AlbRecCod ;
   private com.genexus.webpanels.WebSession AV75WEBSession ;
}

final  class rdevcrumoda21copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJ02", "SELECT EmprCod, EmpItm2, EmpItm1, EmpItm4, EmpItm3 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ03", "SELECT EmprCod, EmprCif FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ04", "SELECT T1.EmprCod, T1.DevCruId, T1.DevCruStt, T1.DevCruATCU, T1.DevCruSal, T1.DevCruFec, T1.DevCruHash, T1.DevCruTipA, T1.DevCruSerA, T2.CliCp2, T2.CliCp, T1.DevCruObs, T1.DevCruEst, T1.DevCruAtId, T1.DevCruEnvA, T1.DevCruMat, T2.CliNif, T1.CliCod, T2.CliPob, T2.CliDom, T2.CliNom FROM (TXPDEVCRU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId  FOR UPDATE OF T1.DevCruEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AJ05", "SELECT T1.EmprCod, T1.DevCruId, T2.AlbRUni, T1.DevCruUnd, T1.DevCruPzs, T2.AlbREnt, T2.AlbRefDsc, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DevCruId = ? ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AJ06", "UPDATE TXPDEVCRU SET DevCruEst=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCRU")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 200);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 30);
               ((String[]) buf[19])[0] = rslt.getString(20, 34);
               ((String[]) buf[20])[0] = rslt.getString(21, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

