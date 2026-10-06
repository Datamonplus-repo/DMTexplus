package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class prtfprodcopy1_impl extends GXWebReport
{
   public prtfprodcopy1_impl( com.genexus.internet.HttpContext context )
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
         AV83EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV196CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
            AV197CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
            AV173BarDisNumfrom = httpContext.GetPar( "BarDisNumfrom") ;
            AV174BarDisNumto = httpContext.GetPar( "BarDisNumto") ;
            AV181BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
            AV182BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
            AV192BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
            AV193BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
            AV177BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
            AV178BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
            AV179BarFecFprfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprfrom")) ;
            AV180BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
            AV183BarFecSalfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalfrom")) ;
            AV184BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
            AV190BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
            AV191BarSerto = httpContext.GetPar( "BarSerto") ;
            AV194BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
            AV195BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
            AV169BarColNomfrom = httpContext.GetPar( "BarColNomfrom") ;
            AV170BarColNomto = httpContext.GetPar( "BarColNomto") ;
            AV171BarColNumfrom = (int)(GXutil.lval( httpContext.GetPar( "BarColNumfrom"))) ;
            AV172BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
            AV186BarNomClifrom = httpContext.GetPar( "BarNomClifrom") ;
            AV187BarNomClito = httpContext.GetPar( "BarNomClito") ;
            AV188BarNumClifrom = (int)(GXutil.lval( httpContext.GetPar( "BarNumClifrom"))) ;
            AV189BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
            AV194BarTipArtfrom = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtfrom"))) ;
            AV195BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
            AV199muestras = httpContext.GetPar( "muestras") ;
            AV163BarCodfrom = (int)(GXutil.lval( httpContext.GetPar( "BarCodfrom"))) ;
            AV168BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
            AV166BarCodReofrom = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReofrom"))) ;
            AV167BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
            AV164BarCodParfrom = httpContext.GetPar( "BarCodParfrom") ;
            AV165BarCodParto = httpContext.GetPar( "BarCodParto") ;
            AV200Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
            AV185BarGirar = httpContext.GetPar( "BarGirar") ;
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
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
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
         /* Using cursor P0ACN2 */
         pr_default.execute(0, new Object[] {AV83EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0ACN2_A396EmprCod[0] ;
            A407EmprNom = P0ACN2_A407EmprNom[0] ;
            n407EmprNom = P0ACN2_n407EmprNom[0] ;
            AV84EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV117LastClicod = 0 ;
         AV148Tkgse = DecimalUtil.doubleToDec(0) ;
         AV149Tkgss = DecimalUtil.doubleToDec(0) ;
         AV146Tkgsce = DecimalUtil.doubleToDec(0) ;
         AV147Tkgscs = DecimalUtil.doubleToDec(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV173BarDisNumfrom ,
                                              AV174BarDisNumto ,
                                              Integer.valueOf(AV196CliCodfrom) ,
                                              Integer.valueOf(AV197CliCodto) ,
                                              Byte.valueOf(AV192BarSitfrom) ,
                                              Byte.valueOf(AV193BarSitto) ,
                                              AV181BarFecGenfrom ,
                                              AV182BarFecGento ,
                                              AV183BarFecSalfrom ,
                                              AV184BarFecSalto ,
                                              AV177BarFecClifrom ,
                                              AV178BarFecClito ,
                                              AV179BarFecFprfrom ,
                                              AV180BarFecFprto ,
                                              AV190BarSerfrom ,
                                              AV191BarSerto ,
                                              AV169BarColNomfrom ,
                                              AV170BarColNomto ,
                                              Integer.valueOf(AV171BarColNumfrom) ,
                                              Integer.valueOf(AV172BarColNumto) ,
                                              AV186BarNomClifrom ,
                                              AV187BarNomClito ,
                                              Integer.valueOf(AV188BarNumClifrom) ,
                                              Integer.valueOf(AV189BarNumClito) ,
                                              Short.valueOf(AV194BarTipArtfrom) ,
                                              Short.valueOf(AV195BarTipArtto) ,
                                              Integer.valueOf(AV163BarCodfrom) ,
                                              Integer.valueOf(AV168BarCodto) ,
                                              Byte.valueOf(AV166BarCodReofrom) ,
                                              Byte.valueOf(AV167BarCodReoto) ,
                                              AV164BarCodParfrom ,
                                              AV165BarCodParto ,
                                              AV200Cod_idtx ,
                                              AV185BarGirar ,
                                              AV199muestras ,
                                              A14324CP_BARDISN ,
                                              Integer.valueOf(A14326CP_CLICOD) ,
                                              Byte.valueOf(A14307CP_BARSIT) ,
                                              A14308CP_BARFECG ,
                                              A14310CP_BARFECS ,
                                              A14309CP_BARFECC ,
                                              A14304CP_BARFECF ,
                                              A14311CP_BARSER ,
                                              A14331CP_BARCOLO ,
                                              Integer.valueOf(A14332CP_BARCOLU) ,
                                              A14315CP_BARNOMC ,
                                              Integer.valueOf(A14305CP_BARNUMC) ,
                                              Short.valueOf(A14316CP_BARTIPA) ,
                                              Integer.valueOf(A14301CP_BARCOD) ,
                                              Byte.valueOf(A14302CP_BARCODR) ,
                                              A14303CP_BARCODP ,
                                              A14323CP_BARPROP ,
                                              A14317CP_BARGIRA ,
                                              A14306CP_BARPLF ,
                                              AV83EmprCod ,
                                              A14328CP_EMPRCOD } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P0ACN3 */
         pr_default.execute(1, new Object[] {AV83EmprCod, AV173BarDisNumfrom, AV174BarDisNumto, Integer.valueOf(AV196CliCodfrom), Integer.valueOf(AV197CliCodto), Byte.valueOf(AV192BarSitfrom), Byte.valueOf(AV193BarSitto), AV181BarFecGenfrom, AV182BarFecGento, AV183BarFecSalfrom, AV184BarFecSalto, AV177BarFecClifrom, AV178BarFecClito, AV179BarFecFprfrom, AV180BarFecFprto, AV190BarSerfrom, AV191BarSerto, AV169BarColNomfrom, AV170BarColNomto, Integer.valueOf(AV171BarColNumfrom), Integer.valueOf(AV172BarColNumto), AV186BarNomClifrom, AV187BarNomClito, Integer.valueOf(AV188BarNumClifrom), Integer.valueOf(AV189BarNumClito), Short.valueOf(AV194BarTipArtfrom), Short.valueOf(AV195BarTipArtto), Integer.valueOf(AV163BarCodfrom), Integer.valueOf(AV168BarCodto), Byte.valueOf(AV166BarCodReofrom), Byte.valueOf(AV167BarCodReoto), AV164BarCodParfrom, AV165BarCodParto, AV200Cod_idtx, AV185BarGirar, AV199muestras});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14306CP_BARPLF = P0ACN3_A14306CP_BARPLF[0] ;
            A14317CP_BARGIRA = P0ACN3_A14317CP_BARGIRA[0] ;
            A14323CP_BARPROP = P0ACN3_A14323CP_BARPROP[0] ;
            A14303CP_BARCODP = P0ACN3_A14303CP_BARCODP[0] ;
            A14302CP_BARCODR = P0ACN3_A14302CP_BARCODR[0] ;
            A14301CP_BARCOD = P0ACN3_A14301CP_BARCOD[0] ;
            A14316CP_BARTIPA = P0ACN3_A14316CP_BARTIPA[0] ;
            A14305CP_BARNUMC = P0ACN3_A14305CP_BARNUMC[0] ;
            A14315CP_BARNOMC = P0ACN3_A14315CP_BARNOMC[0] ;
            A14332CP_BARCOLU = P0ACN3_A14332CP_BARCOLU[0] ;
            A14331CP_BARCOLO = P0ACN3_A14331CP_BARCOLO[0] ;
            A14311CP_BARSER = P0ACN3_A14311CP_BARSER[0] ;
            A14304CP_BARFECF = P0ACN3_A14304CP_BARFECF[0] ;
            A14309CP_BARFECC = P0ACN3_A14309CP_BARFECC[0] ;
            A14310CP_BARFECS = P0ACN3_A14310CP_BARFECS[0] ;
            A14308CP_BARFECG = P0ACN3_A14308CP_BARFECG[0] ;
            A14307CP_BARSIT = P0ACN3_A14307CP_BARSIT[0] ;
            A14326CP_CLICOD = P0ACN3_A14326CP_CLICOD[0] ;
            A14324CP_BARDISN = P0ACN3_A14324CP_BARDISN[0] ;
            A14328CP_EMPRCOD = P0ACN3_A14328CP_EMPRCOD[0] ;
            A14336CP_BARKGM = P0ACN3_A14336CP_BARKGM[0] ;
            A14339CP_BARALBK = P0ACN3_A14339CP_BARALBK[0] ;
            A14297CP_ID = P0ACN3_A14297CP_ID[0] ;
            AV139PedidoCli = A14324CP_BARDISN ;
            AV37Barfeccli = A14309CP_BARFECC ;
            AV38BarFecfpr = A14304CP_BARFECF ;
            AV40Barfecsal = A14310CP_BARFECS ;
            AV107Hdr = GXutil.trim( GXutil.str( A14301CP_BARCOD, 8, 0)) + "-" + GXutil.str( A14302CP_BARCODR, 1, 0) + A14303CP_BARCODP ;
            AV52Barser = A14311CP_BARSER ;
            AV62CliCod = A14326CP_CLICOD ;
            GXt_char1 = AV67CliNom ;
            GXv_char2[0] = GXt_char1 ;
            new app.pclinom(remoteHandle, context).execute( A14328CP_EMPRCOD, A14326CP_CLICOD, GXv_char2) ;
            prtfprodcopy1_impl.this.GXt_char1 = GXv_char2[0] ;
            AV67CliNom = GXt_char1 ;
            AV28Barcolnom = A14331CP_BARCOLO ;
            AV47barnomcli = A14315CP_BARNOMC ;
            AV30Barcolnum = A14332CP_BARCOLU ;
            AV41BarKgm = A14336CP_BARKGM ;
            AV116Kgse = A14339CP_BARALBK ;
            AV58BarSit = A14307CP_BARSIT ;
            GXt_char1 = AV35Barfascod ;
            GXv_char2[0] = GXt_char1 ;
            new app.pget_barfascod(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_char2) ;
            prtfprodcopy1_impl.this.GXt_char1 = GXv_char2[0] ;
            AV35Barfascod = GXt_char1 ;
            GXt_int3 = AV9AlbProcod ;
            GXv_int4[0] = GXt_int3 ;
            new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_int4) ;
            prtfprodcopy1_impl.this.GXt_int3 = GXv_int4[0] ;
            AV9AlbProcod = GXt_int3 ;
            AV123MermaK = DecimalUtil.doubleToDec(0) ;
            AV124MermaM = DecimalUtil.doubleToDec(0) ;
            AV123MermaK = ((AV41BarKgm.doubleValue()>0)&&(AV116Kgse.doubleValue()>0) ? ((AV41BarKgm.subtract(AV116Kgse)).divide(AV41BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
            AV124MermaM = ((AV45BarMtr.doubleValue()>0)&&(AV127Mtse.doubleValue()>0) ? ((AV45BarMtr.subtract(AV127Mtse)).divide(AV45BarMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
            if ( AV117LastClicod != AV62CliCod )
            {
               if ( ( AV146Tkgsce.doubleValue() > 0 ) || ( AV149Tkgss.doubleValue() > 0 ) )
               {
                  hACN0( false, 18) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV146Tkgsce, "ZZZZZ9.99")), 752, Gx_line+0, 819, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV147Tkgscs, "ZZZZZ9.99")), 825, Gx_line+0, 892, Gx_line+18, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+18) ;
               }
               hACN0( false, 21) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV62CliCod), "ZZZZZ9")), 39, Gx_line+1, 84, Gx_line+19, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67CliNom, "")), 86, Gx_line+1, 306, Gx_line+19, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
               AV146Tkgsce = DecimalUtil.doubleToDec(0) ;
               AV147Tkgscs = DecimalUtil.doubleToDec(0) ;
            }
            AV52Barser = ((AV87endutex==0) ? AV52Barser : GXutil.substring( AV56Barserdsc, 1, 16)) ;
            hACN0( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139PedidoCli, "")), 15, Gx_line+0, 96, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV37Barfeccli, "99/99/99"), 103, Gx_line+0, 162, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV40Barfecsal, "99/99/99"), 233, Gx_line+0, 292, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV107Hdr, "")), 299, Gx_line+0, 380, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Barser, "")), 386, Gx_line+0, 504, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Barcolnom, "")), 510, Gx_line+0, 606, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30Barcolnum), "ZZZZZ9")), 702, Gx_line+0, 747, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV41BarKgm, "ZZZZZ9.99")), 752, Gx_line+0, 819, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9AlbProcod), "ZZZZZZZZZ9")), 956, Gx_line+0, 1030, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35Barfascod, "")), 1036, Gx_line+0, 1095, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58BarSit), "Z9")), 1102, Gx_line+0, 1118, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV116Kgse, "ZZZZZ9.99")), 825, Gx_line+0, 892, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV123MermaK, "ZZ9.99")), 905, Gx_line+0, 950, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47barnomcli, "")), 606, Gx_line+0, 702, Gx_line+16, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV38BarFecfpr, "99/99/99"), 169, Gx_line+0, 228, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
            AV117LastClicod = AV62CliCod ;
            AV148Tkgse = AV148Tkgse.add(AV41BarKgm) ;
            AV149Tkgss = AV149Tkgss.add(AV116Kgse) ;
            AV146Tkgsce = AV146Tkgsce.add(AV41BarKgm) ;
            AV147Tkgscs = AV147Tkgscs.add(AV116Kgse) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         hACN0( false, 18) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV146Tkgsce, "ZZZZZ9.99")), 752, Gx_line+0, 819, Gx_line+18, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV147Tkgscs, "ZZZZZ9.99")), 825, Gx_line+0, 892, Gx_line+18, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+18) ;
         hACN0( false, 43) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV148Tkgse, "ZZZZZ9.99")), 752, Gx_line+14, 819, Gx_line+32, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV149Tkgss, "ZZZZZ9.99")), 825, Gx_line+15, 892, Gx_line+33, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+43) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hACN0( true, 0) ;
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

   public void hACN0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV207Pgmdesc, "")), 15, Gx_line+47, 235, Gx_line+64, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 926, Gx_line+16, 985, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 992, Gx_line+16, 1051, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 992, Gx_line+47, 1037, Gx_line+64, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV84EmprNom, "")), 15, Gx_line+16, 235, Gx_line+33, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+67, 1110, Gx_line+67, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pag.:", ""), 949, Gx_line+47, 986, Gx_line+62, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia-Hora:", ""), 852, Gx_line+16, 919, Gx_line+31, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ped Cli", ""), 15, Gx_line+78, 67, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fec Ped", ""), 103, Gx_line+78, 155, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fec Sal", ""), 233, Gx_line+78, 285, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hdr", ""), 299, Gx_line+78, 322, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Articulo", ""), 386, Gx_line+78, 445, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color", ""), 510, Gx_line+78, 547, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 702, Gx_line+78, 747, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs", ""), 752, Gx_line+78, 775, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Guia", ""), 985, Gx_line+78, 1030, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ult Fase", ""), 1036, Gx_line+78, 1095, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "St", ""), 1102, Gx_line+78, 1118, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Kgs Sal", ""), 840, Gx_line+78, 892, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(15, Gx_line+94, 95, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(103, Gx_line+94, 161, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(233, Gx_line+94, 291, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(299, Gx_line+94, 379, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(386, Gx_line+94, 503, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(510, Gx_line+94, 699, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(702, Gx_line+94, 746, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(752, Gx_line+94, 818, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(825, Gx_line+94, 891, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "% Merma", ""), 898, Gx_line+78, 950, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(898, Gx_line+94, 949, Gx_line+94, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(956, Gx_line+93, 1029, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1036, Gx_line+93, 1094, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(1102, Gx_line+93, 1117, Gx_line+93, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Fec Ent", ""), 169, Gx_line+78, 221, Gx_line+93, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(169, Gx_line+94, 227, Gx_line+94, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+98) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV83EmprCod = "" ;
      AV173BarDisNumfrom = "" ;
      AV174BarDisNumto = "" ;
      AV181BarFecGenfrom = GXutil.nullDate() ;
      AV182BarFecGento = GXutil.nullDate() ;
      AV177BarFecClifrom = GXutil.nullDate() ;
      AV178BarFecClito = GXutil.nullDate() ;
      AV179BarFecFprfrom = GXutil.nullDate() ;
      AV180BarFecFprto = GXutil.nullDate() ;
      AV183BarFecSalfrom = GXutil.nullDate() ;
      AV184BarFecSalto = GXutil.nullDate() ;
      AV190BarSerfrom = "" ;
      AV191BarSerto = "" ;
      AV169BarColNomfrom = "" ;
      AV170BarColNomto = "" ;
      AV186BarNomClifrom = "" ;
      AV187BarNomClito = "" ;
      AV199muestras = "" ;
      AV164BarCodParfrom = "" ;
      AV165BarCodParto = "" ;
      AV200Cod_idtx = "" ;
      AV185BarGirar = "" ;
      scmdbuf = "" ;
      P0ACN2_A396EmprCod = new String[] {""} ;
      P0ACN2_A407EmprNom = new String[] {""} ;
      P0ACN2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV84EmprNom = "" ;
      AV148Tkgse = DecimalUtil.ZERO ;
      AV149Tkgss = DecimalUtil.ZERO ;
      AV146Tkgsce = DecimalUtil.ZERO ;
      AV147Tkgscs = DecimalUtil.ZERO ;
      A14324CP_BARDISN = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14311CP_BARSER = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14303CP_BARCODP = "" ;
      A14323CP_BARPROP = "" ;
      A14317CP_BARGIRA = "" ;
      A14306CP_BARPLF = "" ;
      A14328CP_EMPRCOD = "" ;
      P0ACN3_A14306CP_BARPLF = new String[] {""} ;
      P0ACN3_A14317CP_BARGIRA = new String[] {""} ;
      P0ACN3_A14323CP_BARPROP = new String[] {""} ;
      P0ACN3_A14303CP_BARCODP = new String[] {""} ;
      P0ACN3_A14302CP_BARCODR = new byte[1] ;
      P0ACN3_A14301CP_BARCOD = new int[1] ;
      P0ACN3_A14316CP_BARTIPA = new short[1] ;
      P0ACN3_A14305CP_BARNUMC = new int[1] ;
      P0ACN3_A14315CP_BARNOMC = new String[] {""} ;
      P0ACN3_A14332CP_BARCOLU = new int[1] ;
      P0ACN3_A14331CP_BARCOLO = new String[] {""} ;
      P0ACN3_A14311CP_BARSER = new String[] {""} ;
      P0ACN3_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACN3_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACN3_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACN3_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACN3_A14307CP_BARSIT = new byte[1] ;
      P0ACN3_A14326CP_CLICOD = new int[1] ;
      P0ACN3_A14324CP_BARDISN = new String[] {""} ;
      P0ACN3_A14328CP_EMPRCOD = new String[] {""} ;
      P0ACN3_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACN3_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACN3_A14297CP_ID = new long[1] ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      AV139PedidoCli = "" ;
      AV37Barfeccli = GXutil.nullDate() ;
      AV38BarFecfpr = GXutil.nullDate() ;
      AV40Barfecsal = GXutil.nullDate() ;
      AV107Hdr = "" ;
      AV52Barser = "" ;
      AV67CliNom = "" ;
      AV28Barcolnom = "" ;
      AV47barnomcli = "" ;
      AV41BarKgm = DecimalUtil.ZERO ;
      AV116Kgse = DecimalUtil.ZERO ;
      AV35Barfascod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new long[1] ;
      AV123MermaK = DecimalUtil.ZERO ;
      AV124MermaM = DecimalUtil.ZERO ;
      AV45BarMtr = DecimalUtil.ZERO ;
      AV127Mtse = DecimalUtil.ZERO ;
      AV56Barserdsc = "" ;
      AV207Pgmdesc = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prtfprodcopy1__default(),
         new Object[] {
             new Object[] {
            P0ACN2_A396EmprCod, P0ACN2_A407EmprNom, P0ACN2_n407EmprNom
            }
            , new Object[] {
            P0ACN3_A14306CP_BARPLF, P0ACN3_A14317CP_BARGIRA, P0ACN3_A14323CP_BARPROP, P0ACN3_A14303CP_BARCODP, P0ACN3_A14302CP_BARCODR, P0ACN3_A14301CP_BARCOD, P0ACN3_A14316CP_BARTIPA, P0ACN3_A14305CP_BARNUMC, P0ACN3_A14315CP_BARNOMC, P0ACN3_A14332CP_BARCOLU,
            P0ACN3_A14331CP_BARCOLO, P0ACN3_A14311CP_BARSER, P0ACN3_A14304CP_BARFECF, P0ACN3_A14309CP_BARFECC, P0ACN3_A14310CP_BARFECS, P0ACN3_A14308CP_BARFECG, P0ACN3_A14307CP_BARSIT, P0ACN3_A14326CP_CLICOD, P0ACN3_A14324CP_BARDISN, P0ACN3_A14328CP_EMPRCOD,
            P0ACN3_A14336CP_BARKGM, P0ACN3_A14339CP_BARALBK, P0ACN3_A14297CP_ID
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV207Pgmdesc = httpContext.getMessage( "Consulta Produccion", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      AV207Pgmdesc = httpContext.getMessage( "Consulta Produccion", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV192BarSitfrom ;
   private byte AV193BarSitto ;
   private byte AV166BarCodReofrom ;
   private byte AV167BarCodReoto ;
   private byte A14307CP_BARSIT ;
   private byte A14302CP_BARCODR ;
   private byte AV58BarSit ;
   private byte AV87endutex ;
   private short gxcookieaux ;
   private short AV194BarTipArtfrom ;
   private short AV195BarTipArtto ;
   private short A14316CP_BARTIPA ;
   private short Gx_err ;
   private int AV196CliCodfrom ;
   private int AV197CliCodto ;
   private int AV171BarColNumfrom ;
   private int AV172BarColNumto ;
   private int AV188BarNumClifrom ;
   private int AV189BarNumClito ;
   private int AV163BarCodfrom ;
   private int AV168BarCodto ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV117LastClicod ;
   private int A14326CP_CLICOD ;
   private int A14332CP_BARCOLU ;
   private int A14305CP_BARNUMC ;
   private int A14301CP_BARCOD ;
   private int AV62CliCod ;
   private int AV30Barcolnum ;
   private int Gx_OldLine ;
   private long A14297CP_ID ;
   private long AV9AlbProcod ;
   private long GXt_int3 ;
   private long GXv_int4[] ;
   private java.math.BigDecimal AV148Tkgse ;
   private java.math.BigDecimal AV149Tkgss ;
   private java.math.BigDecimal AV146Tkgsce ;
   private java.math.BigDecimal AV147Tkgscs ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal AV41BarKgm ;
   private java.math.BigDecimal AV116Kgse ;
   private java.math.BigDecimal AV123MermaK ;
   private java.math.BigDecimal AV124MermaM ;
   private java.math.BigDecimal AV45BarMtr ;
   private java.math.BigDecimal AV127Mtse ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV83EmprCod ;
   private String AV173BarDisNumfrom ;
   private String AV174BarDisNumto ;
   private String AV190BarSerfrom ;
   private String AV191BarSerto ;
   private String AV169BarColNomfrom ;
   private String AV170BarColNomto ;
   private String AV186BarNomClifrom ;
   private String AV187BarNomClito ;
   private String AV199muestras ;
   private String AV164BarCodParfrom ;
   private String AV165BarCodParto ;
   private String AV200Cod_idtx ;
   private String AV185BarGirar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV84EmprNom ;
   private String A14324CP_BARDISN ;
   private String A14311CP_BARSER ;
   private String A14331CP_BARCOLO ;
   private String A14303CP_BARCODP ;
   private String A14323CP_BARPROP ;
   private String A14306CP_BARPLF ;
   private String A14328CP_EMPRCOD ;
   private String AV139PedidoCli ;
   private String AV107Hdr ;
   private String AV52Barser ;
   private String AV67CliNom ;
   private String AV28Barcolnom ;
   private String AV47barnomcli ;
   private String AV35Barfascod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV56Barserdsc ;
   private String AV207Pgmdesc ;
   private String Gx_time ;
   private java.util.Date AV181BarFecGenfrom ;
   private java.util.Date AV182BarFecGento ;
   private java.util.Date AV177BarFecClifrom ;
   private java.util.Date AV178BarFecClito ;
   private java.util.Date AV179BarFecFprfrom ;
   private java.util.Date AV180BarFecFprto ;
   private java.util.Date AV183BarFecSalfrom ;
   private java.util.Date AV184BarFecSalto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date AV37Barfeccli ;
   private java.util.Date AV38BarFecfpr ;
   private java.util.Date AV40Barfecsal ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACN2_A396EmprCod ;
   private String[] P0ACN2_A407EmprNom ;
   private boolean[] P0ACN2_n407EmprNom ;
   private String[] P0ACN3_A14306CP_BARPLF ;
   private String[] P0ACN3_A14317CP_BARGIRA ;
   private String[] P0ACN3_A14323CP_BARPROP ;
   private String[] P0ACN3_A14303CP_BARCODP ;
   private byte[] P0ACN3_A14302CP_BARCODR ;
   private int[] P0ACN3_A14301CP_BARCOD ;
   private short[] P0ACN3_A14316CP_BARTIPA ;
   private int[] P0ACN3_A14305CP_BARNUMC ;
   private String[] P0ACN3_A14315CP_BARNOMC ;
   private int[] P0ACN3_A14332CP_BARCOLU ;
   private String[] P0ACN3_A14331CP_BARCOLO ;
   private String[] P0ACN3_A14311CP_BARSER ;
   private java.util.Date[] P0ACN3_A14304CP_BARFECF ;
   private java.util.Date[] P0ACN3_A14309CP_BARFECC ;
   private java.util.Date[] P0ACN3_A14310CP_BARFECS ;
   private java.util.Date[] P0ACN3_A14308CP_BARFECG ;
   private byte[] P0ACN3_A14307CP_BARSIT ;
   private int[] P0ACN3_A14326CP_CLICOD ;
   private String[] P0ACN3_A14324CP_BARDISN ;
   private String[] P0ACN3_A14328CP_EMPRCOD ;
   private java.math.BigDecimal[] P0ACN3_A14336CP_BARKGM ;
   private java.math.BigDecimal[] P0ACN3_A14339CP_BARALBK ;
   private long[] P0ACN3_A14297CP_ID ;
}

final  class prtfprodcopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ACN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV173BarDisNumfrom ,
                                          String AV174BarDisNumto ,
                                          int AV196CliCodfrom ,
                                          int AV197CliCodto ,
                                          byte AV192BarSitfrom ,
                                          byte AV193BarSitto ,
                                          java.util.Date AV181BarFecGenfrom ,
                                          java.util.Date AV182BarFecGento ,
                                          java.util.Date AV183BarFecSalfrom ,
                                          java.util.Date AV184BarFecSalto ,
                                          java.util.Date AV177BarFecClifrom ,
                                          java.util.Date AV178BarFecClito ,
                                          java.util.Date AV179BarFecFprfrom ,
                                          java.util.Date AV180BarFecFprto ,
                                          String AV190BarSerfrom ,
                                          String AV191BarSerto ,
                                          String AV169BarColNomfrom ,
                                          String AV170BarColNomto ,
                                          int AV171BarColNumfrom ,
                                          int AV172BarColNumto ,
                                          String AV186BarNomClifrom ,
                                          String AV187BarNomClito ,
                                          int AV188BarNumClifrom ,
                                          int AV189BarNumClito ,
                                          short AV194BarTipArtfrom ,
                                          short AV195BarTipArtto ,
                                          int AV163BarCodfrom ,
                                          int AV168BarCodto ,
                                          byte AV166BarCodReofrom ,
                                          byte AV167BarCodReoto ,
                                          String AV164BarCodParfrom ,
                                          String AV165BarCodParto ,
                                          String AV200Cod_idtx ,
                                          String AV185BarGirar ,
                                          String AV199muestras ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          String A14306CP_BARPLF ,
                                          String AV83EmprCod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[36];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT CP_BARPLF, CP_BARGIRA, CP_BARPROP, CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_BARTIPA, CP_BARNUMC, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_BARSER, CP_BARFECF, CP_BARFECC," ;
      scmdbuf += " CP_BARFECS, CP_BARFECG, CP_BARSIT, CP_CLICOD, CP_BARDISN, CP_EMPRCOD, CP_BARKGM, CP_BARALBK, CP_ID FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV173BarDisNumfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174BarDisNumto)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (0==AV196CliCodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV197CliCodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV192BarSitfrom) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV193BarSitto) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV181BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182BarFecGento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183BarFecSalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV184BarFecSalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV177BarFecClifrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV178BarFecClito)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV179BarFecFprfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV180BarFecFprto)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190BarSerfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV191BarSerto)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169BarColNomfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV170BarColNomto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV171BarColNumfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV172BarColNumto) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186BarNomClifrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187BarNomClito)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV188BarNumClifrom) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV189BarNumClito) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV194BarTipArtfrom) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV195BarTipArtto) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (0==AV163BarCodfrom) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV168BarCodto) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV166BarCodReofrom) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV167BarCodReoto) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164BarCodParfrom)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165BarCodParto)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV185BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV199muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CP_EMPRCOD, CP_CLICOD, CP_BARDISN" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P0ACN3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACN2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0ACN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((long[]) buf[22])[0] = rslt.getLong(23);
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
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 4);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
      }
   }

}

