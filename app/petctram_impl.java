package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class petctram_impl extends GXWebReport
{
   public petctram_impl( com.genexus.internet.HttpContext context )
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV25MetPiecod = httpContext.GetPar( "MetPiecod") ;
            AV26MetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "MetPieKil"), ".") ;
            AV27MetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "MetPieMet"), ".") ;
            AV30Opecod = (int)(GXutil.lval( httpContext.GetPar( "Opecod"))) ;
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
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 4248, 4579, 0, 1, 1, 0, 1, 1) )
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
         GXt_int1 = AV33prueba ;
         GXv_int2[0] = GXt_int1 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "QRCXXX", ""), GXv_int2) ;
         petctram_impl.this.GXt_int1 = GXv_int2[0] ;
         AV33prueba = GXt_int1 ;
         GXt_char3 = AV31Openom ;
         GXv_char4[0] = GXt_char3 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, AV30Opecod, GXv_char4) ;
         petctram_impl.this.GXt_char3 = GXv_char4[0] ;
         AV31Openom = GXt_char3 ;
         /* Using cursor P099M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A361DisCod = P099M2_A361DisCod[0] ;
            A4812BarEncCli = P099M2_A4812BarEncCli[0] ;
            A9777BarItem3 = P099M2_A9777BarItem3[0] ;
            A252CliCod = P099M2_A252CliCod[0] ;
            n252CliCod = P099M2_n252CliCod[0] ;
            A4466BarAcaAnh = P099M2_A4466BarAcaAnh[0] ;
            A11852Nxt_ArtCl2 = P099M2_A11852Nxt_ArtCl2[0] ;
            A2829BarProPer = P099M2_A2829BarProPer[0] ;
            A136BarColNum = P099M2_A136BarColNum[0] ;
            A212BarSer = P099M2_A212BarSer[0] ;
            A2842CliEtiCN = P099M2_A2842CliEtiCN[0] ;
            A279CliNom = P099M2_A279CliNom[0] ;
            A1234BarNomCli = P099M2_A1234BarNomCli[0] ;
            A135BarColNom = P099M2_A135BarColNom[0] ;
            A1652BarSerDsc = P099M2_A1652BarSerDsc[0] ;
            A2842CliEtiCN = P099M2_A2842CliEtiCN[0] ;
            A279CliNom = P099M2_A279CliNom[0] ;
            GXv_int5[0] = AV24MacCod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
            petctram_impl.this.AV24MacCod = GXv_int5[0] ;
            AV10BarEnccli = GXutil.trim( A4812BarEncCli) ;
            AV15Enccli = GXutil.trim( A9777BarItem3) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = A252CliCod ;
            GXv_int6[0] = A4466BarAcaAnh ;
            GXv_char7[0] = AV35Tb1_dscfb ;
            new app.pptable2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char7) ;
            petctram_impl.this.A396EmprCod = GXv_char4[0] ;
            petctram_impl.this.A252CliCod = GXv_int5[0] ;
            petctram_impl.this.A4466BarAcaAnh = GXv_int6[0] ;
            petctram_impl.this.AV35Tb1_dscfb = GXv_char7[0] ;
            AV13DisEnt = GXutil.substring( AV35Tb1_dscfb, 1, 30) ;
            AV29Nxt_artcl2 = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
            AV12Cod_Idtx = A2829BarProPer ;
            /* Execute user subroutine: 'INDITEX' */
            S111 ();
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
            AV32Procenom = " " ;
            /* Using cursor P099M3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A203BarPieKil = P099M3_A203BarPieKil[0] ;
               A44AlbRecCod = P099M3_A44AlbRecCod[0] ;
               A200BarPieCod = P099M3_A200BarPieCod[0] ;
               AV9Albreccod = A44AlbRecCod ;
               /* Execute user subroutine: 'PROCEDENCIA' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
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
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV16Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV18HojRut = GXutil.format( "*%1*", GXutil.padl( GXutil.trim( GXutil.str( A129BarCod, 8, 0)), (short)(8), "0"), "", "", "", "", "", "", "", "") ;
            AV36TextoGenerar = httpContext.getMessage( "A:", "") + GXutil.trim( AV16Hdr) + "*" ;
            if ( AV33prueba == 1 )
            {
               AV36TextoGenerar = GXutil.trim( A212BarSer) + httpContext.getMessage( "A", "") + GXutil.padl( GXutil.trim( GXutil.str( A136BarColNum, 6, 0)), (short)(6), "0") + AV16Hdr + "/" + AV25MetPiecod + "/" + GXutil.trim( GXutil.str( AV27MetPieMet, 9, 2)) + "/" + GXutil.trim( GXutil.str( AV26MetPieKil, 9, 2)) ;
               AV36TextoGenerar = GXutil.trim( AV36TextoGenerar) ;
            }
            AV19i = (short)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 9 )
            {
               AV34Tab_obs[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            /* Using cursor P099M4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A377DisObsTxt = P099M4_A377DisObsTxt[0] ;
               A376DisObsLin = P099M4_A376DisObsLin[0] ;
               if ( AV19i > 4 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV34Tab_obs[AV19i-1] = GXutil.substring( A377DisObsTxt, 1, 35) ;
               AV19i = (short)(AV19i+1) ;
               if ( GXutil.strcmp(GXutil.substring( A377DisObsTxt, 36, 35), " ") != 0 )
               {
                  AV34Tab_obs[AV19i-1] = GXutil.substring( A377DisObsTxt, 36, 35) ;
                  AV19i = (short)(AV19i+1) ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( GXutil.strcmp(A2842CliEtiCN, httpContext.getMessage( "N", "")) == 0 )
            {
               AV8Clicod = A252CliCod ;
               /* Execute user subroutine: 'CLIENV' */
               S131 ();
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
               h99M0( false, 277) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.Serviço:", ""), 9, Gx_line+58, 83, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Hdr, "")), 81, Gx_line+58, 162, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Talão:", ""), 10, Gx_line+111, 55, Gx_line+126, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarEnccli, "")), 82, Gx_line+111, 156, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Enc.Cli:", ""), 10, Gx_line+131, 69, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 10, Gx_line+151, 62, Gx_line+166, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 82, Gx_line+151, 273, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 10, Gx_line+171, 40, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 82, Gx_line+171, 178, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 193, Gx_line+171, 289, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+219, 307, Gx_line+219, 3, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 9, Gx_line+78, 68, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 9, Gx_line+93, 229, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Enccli, "")), 82, Gx_line+131, 156, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 241, Gx_line+33, 300, Gx_line+49, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Operador:", ""), 10, Gx_line+191, 77, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso:", ""), 9, Gx_line+229, 46, Gx_line+244, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26MetPieKil, "ZZZZZ9.99")), 64, Gx_line+229, 131, Gx_line+245, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros:", ""), 9, Gx_line+251, 61, Gx_line+266, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27MetPieMet, "ZZZZZ9.99")), 64, Gx_line+251, 131, Gx_line+269, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rolo:", ""), 166, Gx_line+229, 203, Gx_line+244, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25MetPiecod, "")), 207, Gx_line+229, 274, Gx_line+247, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Openom, "")), 82, Gx_line+191, 302, Gx_line+207, 0+256, 0, 0, 0) ;
               sImgUrl = ((GXutil.strcmp("", AV20Imagen)==0) ? A40000Imagen_GXI : AV20Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 231, Gx_line+52, 314, Gx_line+135) ;
               getPrinter().GxAttris("Calibri", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11CliEnvNom, "")), 32, Gx_line+9, 283, Gx_line+30, 1+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+277) ;
            }
            else
            {
               h99M0( false, 270) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "O.Serviço:", ""), 8, Gx_line+58, 82, Gx_line+73, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16Hdr, "")), 80, Gx_line+58, 161, Gx_line+74, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Talão:", ""), 9, Gx_line+111, 54, Gx_line+126, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10BarEnccli, "")), 81, Gx_line+111, 155, Gx_line+127, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Enc.Cli:", ""), 9, Gx_line+131, 68, Gx_line+146, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo:", ""), 9, Gx_line+151, 61, Gx_line+166, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 81, Gx_line+151, 272, Gx_line+167, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor:", ""), 9, Gx_line+171, 39, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 81, Gx_line+171, 177, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), 192, Gx_line+171, 288, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+219, 306, Gx_line+219, 3, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 8, Gx_line+78, 67, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 8, Gx_line+93, 228, Gx_line+109, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15Enccli, "")), 81, Gx_line+131, 155, Gx_line+147, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 244, Gx_line+8, 303, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Operador:", ""), 9, Gx_line+191, 76, Gx_line+206, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Peso:", ""), 8, Gx_line+229, 45, Gx_line+244, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26MetPieKil, "ZZZZZ9.99")), 63, Gx_line+229, 130, Gx_line+245, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Metros:", ""), 8, Gx_line+251, 60, Gx_line+266, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27MetPieMet, "ZZZZZ9.99")), 63, Gx_line+251, 130, Gx_line+269, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Rolo:", ""), 165, Gx_line+229, 202, Gx_line+244, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25MetPiecod, "")), 206, Gx_line+229, 273, Gx_line+247, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Openom, "")), 81, Gx_line+191, 301, Gx_line+207, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "54048fec-42e9-4415-86de-5a947ab41957", "", context.getHttpContext().getTheme( )), 7, Gx_line+0, 214, Gx_line+49) ;
               sImgUrl = ((GXutil.strcmp("", AV20Imagen)==0) ? A40000Imagen_GXI : AV20Imagen) ;
               getPrinter().GxDrawBitMap(sImgUrl, 231, Gx_line+26, 314, Gx_line+109) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+270) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h99M0( true, 0) ;
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
      /* 'INDITEX' Routine */
      returnInSub = false ;
      /* Using cursor P099M5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV12Cod_Idtx});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10887Cod_Idtx = P099M5_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = P099M5_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P099M5_n10888Dsc_Idtx[0] ;
         AV14Dsc_Idtx = GXutil.trim( A10888Dsc_Idtx) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PROCEDENCIA' Routine */
      returnInSub = false ;
      AV32Procenom = " " ;
      /* Using cursor P099M6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV9Albreccod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A970ProceCod = P099M6_A970ProceCod[0] ;
         n970ProceCod = P099M6_n970ProceCod[0] ;
         A44AlbRecCod = P099M6_A44AlbRecCod[0] ;
         A971ProceNom = P099M6_A971ProceNom[0] ;
         n971ProceNom = P099M6_n971ProceNom[0] ;
         A971ProceNom = P099M6_A971ProceNom[0] ;
         n971ProceNom = P099M6_n971ProceNom[0] ;
         AV32Procenom = A971ProceNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'CLIENV' Routine */
      returnInSub = false ;
      AV11CliEnvNom = "" ;
      /* Using cursor P099M7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A266CliEnvLin = P099M7_A266CliEnvLin[0] ;
         A252CliCod = P099M7_A252CliCod[0] ;
         n252CliCod = P099M7_n252CliCod[0] ;
         A267CliEnvNom = P099M7_A267CliEnvNom[0] ;
         AV11CliEnvNom = A267CliEnvNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void h99M0( boolean bFoot ,
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
      A130BarCodPar = "" ;
      AV25MetPiecod = "" ;
      AV26MetPieKil = DecimalUtil.ZERO ;
      AV27MetPieMet = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      AV31Openom = "" ;
      GXt_char3 = "" ;
      scmdbuf = "" ;
      P099M2_A396EmprCod = new String[] {""} ;
      P099M2_A129BarCod = new int[1] ;
      P099M2_A132BarCodReo = new byte[1] ;
      P099M2_A130BarCodPar = new String[] {""} ;
      P099M2_A361DisCod = new int[1] ;
      P099M2_A4812BarEncCli = new String[] {""} ;
      P099M2_A9777BarItem3 = new String[] {""} ;
      P099M2_A252CliCod = new int[1] ;
      P099M2_n252CliCod = new boolean[] {false} ;
      P099M2_A4466BarAcaAnh = new short[1] ;
      P099M2_A11852Nxt_ArtCl2 = new String[] {""} ;
      P099M2_A2829BarProPer = new String[] {""} ;
      P099M2_A136BarColNum = new int[1] ;
      P099M2_A212BarSer = new String[] {""} ;
      P099M2_A2842CliEtiCN = new String[] {""} ;
      P099M2_A279CliNom = new String[] {""} ;
      P099M2_A1234BarNomCli = new String[] {""} ;
      P099M2_A135BarColNom = new String[] {""} ;
      P099M2_A1652BarSerDsc = new String[] {""} ;
      A4812BarEncCli = "" ;
      A9777BarItem3 = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A2829BarProPer = "" ;
      A212BarSer = "" ;
      A2842CliEtiCN = "" ;
      A279CliNom = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      AV10BarEnccli = "" ;
      AV15Enccli = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new short[1] ;
      AV35Tb1_dscfb = "" ;
      GXv_char7 = new String[1] ;
      AV13DisEnt = "" ;
      AV29Nxt_artcl2 = "" ;
      AV12Cod_Idtx = "" ;
      AV32Procenom = "" ;
      P099M3_A396EmprCod = new String[] {""} ;
      P099M3_A129BarCod = new int[1] ;
      P099M3_A132BarCodReo = new byte[1] ;
      P099M3_A130BarCodPar = new String[] {""} ;
      P099M3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P099M3_A44AlbRecCod = new int[1] ;
      P099M3_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV16Hdr = "" ;
      AV18HojRut = "" ;
      AV36TextoGenerar = "" ;
      AV34Tab_obs = new String[9] ;
      GX_I = 1 ;
      while ( GX_I <= 9 )
      {
         AV34Tab_obs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P099M4_A396EmprCod = new String[] {""} ;
      P099M4_A361DisCod = new int[1] ;
      P099M4_A377DisObsTxt = new String[] {""} ;
      P099M4_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      Gx_date = GXutil.nullDate() ;
      AV20Imagen = "" ;
      sImgUrl = "" ;
      AV20Imagen = "" ;
      A40000Imagen_GXI = "" ;
      AV11CliEnvNom = "" ;
      P099M5_A396EmprCod = new String[] {""} ;
      P099M5_A10887Cod_Idtx = new String[] {""} ;
      P099M5_A10888Dsc_Idtx = new String[] {""} ;
      P099M5_n10888Dsc_Idtx = new boolean[] {false} ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV14Dsc_Idtx = "" ;
      P099M6_A970ProceCod = new short[1] ;
      P099M6_n970ProceCod = new boolean[] {false} ;
      P099M6_A396EmprCod = new String[] {""} ;
      P099M6_A44AlbRecCod = new int[1] ;
      P099M6_A971ProceNom = new String[] {""} ;
      P099M6_n971ProceNom = new boolean[] {false} ;
      A971ProceNom = "" ;
      P099M7_A396EmprCod = new String[] {""} ;
      P099M7_A266CliEnvLin = new byte[1] ;
      P099M7_A252CliCod = new int[1] ;
      P099M7_n252CliCod = new boolean[] {false} ;
      P099M7_A267CliEnvNom = new String[] {""} ;
      A267CliEnvNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.petctram__default(),
         new Object[] {
             new Object[] {
            P099M2_A396EmprCod, P099M2_A129BarCod, P099M2_A132BarCodReo, P099M2_A130BarCodPar, P099M2_A361DisCod, P099M2_A4812BarEncCli, P099M2_A9777BarItem3, P099M2_A252CliCod, P099M2_n252CliCod, P099M2_A4466BarAcaAnh,
            P099M2_A11852Nxt_ArtCl2, P099M2_A2829BarProPer, P099M2_A136BarColNum, P099M2_A212BarSer, P099M2_A2842CliEtiCN, P099M2_A279CliNom, P099M2_A1234BarNomCli, P099M2_A135BarColNom, P099M2_A1652BarSerDsc
            }
            , new Object[] {
            P099M3_A396EmprCod, P099M3_A129BarCod, P099M3_A132BarCodReo, P099M3_A130BarCodPar, P099M3_A203BarPieKil, P099M3_A44AlbRecCod, P099M3_A200BarPieCod
            }
            , new Object[] {
            P099M4_A396EmprCod, P099M4_A361DisCod, P099M4_A377DisObsTxt, P099M4_A376DisObsLin
            }
            , new Object[] {
            P099M5_A396EmprCod, P099M5_A10887Cod_Idtx, P099M5_A10888Dsc_Idtx, P099M5_n10888Dsc_Idtx
            }
            , new Object[] {
            P099M6_A970ProceCod, P099M6_n970ProceCod, P099M6_A396EmprCod, P099M6_A44AlbRecCod, P099M6_A971ProceNom, P099M6_n971ProceNom
            }
            , new Object[] {
            P099M7_A396EmprCod, P099M7_A266CliEnvLin, P099M7_A252CliCod, P099M7_A267CliEnvNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      AV38Pgmname = "PETCTRam" ;
   }

   private byte A132BarCodReo ;
   private byte AV33prueba ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A376DisObsLin ;
   private byte A266CliEnvLin ;
   private short gxcookieaux ;
   private short A4466BarAcaAnh ;
   private short GXv_int6[] ;
   private short AV19i ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV30Opecod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV24MacCod ;
   private int GXv_int5[] ;
   private int A44AlbRecCod ;
   private int AV9Albreccod ;
   private int GX_I ;
   private int AV8Clicod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV26MetPieKil ;
   private java.math.BigDecimal AV27MetPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV25MetPiecod ;
   private String AV31Openom ;
   private String GXt_char3 ;
   private String scmdbuf ;
   private String A4812BarEncCli ;
   private String A9777BarItem3 ;
   private String A11852Nxt_ArtCl2 ;
   private String A2829BarProPer ;
   private String A212BarSer ;
   private String A2842CliEtiCN ;
   private String A279CliNom ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String AV10BarEnccli ;
   private String AV15Enccli ;
   private String GXv_char4[] ;
   private String AV35Tb1_dscfb ;
   private String GXv_char7[] ;
   private String AV13DisEnt ;
   private String AV29Nxt_artcl2 ;
   private String AV12Cod_Idtx ;
   private String AV32Procenom ;
   private String A200BarPieCod ;
   private String AV16Hdr ;
   private String AV18HojRut ;
   private String AV34Tab_obs[] ;
   private String A377DisObsTxt ;
   private String sImgUrl ;
   private String AV11CliEnvNom ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV14Dsc_Idtx ;
   private String A971ProceNom ;
   private String A267CliEnvNom ;
   private String AV38Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n10888Dsc_Idtx ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private String AV36TextoGenerar ;
   private String A40000Imagen_GXI ;
   private String Imagen ;
   private String AV20Imagen ;
   private IDataStoreProvider pr_default ;
   private String[] P099M2_A396EmprCod ;
   private int[] P099M2_A129BarCod ;
   private byte[] P099M2_A132BarCodReo ;
   private String[] P099M2_A130BarCodPar ;
   private int[] P099M2_A361DisCod ;
   private String[] P099M2_A4812BarEncCli ;
   private String[] P099M2_A9777BarItem3 ;
   private int[] P099M2_A252CliCod ;
   private boolean[] P099M2_n252CliCod ;
   private short[] P099M2_A4466BarAcaAnh ;
   private String[] P099M2_A11852Nxt_ArtCl2 ;
   private String[] P099M2_A2829BarProPer ;
   private int[] P099M2_A136BarColNum ;
   private String[] P099M2_A212BarSer ;
   private String[] P099M2_A2842CliEtiCN ;
   private String[] P099M2_A279CliNom ;
   private String[] P099M2_A1234BarNomCli ;
   private String[] P099M2_A135BarColNom ;
   private String[] P099M2_A1652BarSerDsc ;
   private String[] P099M3_A396EmprCod ;
   private int[] P099M3_A129BarCod ;
   private byte[] P099M3_A132BarCodReo ;
   private String[] P099M3_A130BarCodPar ;
   private java.math.BigDecimal[] P099M3_A203BarPieKil ;
   private int[] P099M3_A44AlbRecCod ;
   private String[] P099M3_A200BarPieCod ;
   private String[] P099M4_A396EmprCod ;
   private int[] P099M4_A361DisCod ;
   private String[] P099M4_A377DisObsTxt ;
   private byte[] P099M4_A376DisObsLin ;
   private String[] P099M5_A396EmprCod ;
   private String[] P099M5_A10887Cod_Idtx ;
   private String[] P099M5_A10888Dsc_Idtx ;
   private boolean[] P099M5_n10888Dsc_Idtx ;
   private short[] P099M6_A970ProceCod ;
   private boolean[] P099M6_n970ProceCod ;
   private String[] P099M6_A396EmprCod ;
   private int[] P099M6_A44AlbRecCod ;
   private String[] P099M6_A971ProceNom ;
   private boolean[] P099M6_n971ProceNom ;
   private String[] P099M7_A396EmprCod ;
   private byte[] P099M7_A266CliEnvLin ;
   private int[] P099M7_A252CliCod ;
   private boolean[] P099M7_n252CliCod ;
   private String[] P099M7_A267CliEnvNom ;
}

final  class petctram__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P099M2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarEncCli, T1.BarItem3, T1.CliCod, T1.BarAcaAnh, T1.Nxt_ArtCl2, T1.BarProPer, T1.BarColNum, T1.BarSer, T2.CliEtiCN, T2.CliNom, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P099M3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P099M4", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P099M5", "SELECT EmprCod, Cod_Idtx, Dsc_Idtx FROM TXPINDITE WHERE EmprCod = ? and Cod_Idtx = ? ORDER BY EmprCod, Cod_Idtx ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P099M6", "SELECT T1.ProceCod, T1.EmprCod, T1.AlbRecCod, T2.ProceNom FROM (TXPALBREC T1 LEFT JOIN TXPPROCED T2 ON T2.EmprCod = T1.EmprCod AND T2.ProceCod = T1.ProceCod) WHERE T1.EmprCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P099M7", "SELECT EmprCod, CliEnvLin, CliCod, CliEnvNom FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = 1 ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 30);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((String[]) buf[18])[0] = rslt.getString(18, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

