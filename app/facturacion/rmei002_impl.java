package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmei002_impl extends GXWebReport
{
   public rmei002_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV12PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV13UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV21ImprimirFase = httpContext.GetPar( "ImprimirFase") ;
            AV23ClienteActivo = httpContext.GetPar( "ClienteActivo") ;
            AV24Fases = httpContext.GetPar( "Fases") ;
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
         Gx_out = "SCR" ;
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
         GXt_char1 = AV9Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rmei002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV9Lit1 = GXt_char1 ;
         GXt_char1 = AV10Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rmei002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV10Lit2 = GXt_char1 ;
         GXt_char1 = AV11Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rmei002_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11Lit3 = GXt_char1 ;
         /* Using cursor P0A2G2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P0A2G2_A407EmprNom[0] ;
            n407EmprNom = P0A2G2_n407EmprNom[0] ;
            AV16EmprNom = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_int3 = AV22tintutex ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int4) ;
         rmei002_impl.this.GXt_int3 = GXv_int4[0] ;
         AV22tintutex = GXt_int3 ;
         AV17FlagCli = (byte)(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV12PCliCod) ,
                                              Integer.valueOf(AV13UCliCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A10045CliAct ,
                                              AV23ClienteActivo ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P0A2G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV23ClienteActivo, AV23ClienteActivo, Integer.valueOf(AV12PCliCod), Integer.valueOf(AV13UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A10045CliAct = P0A2G3_A10045CliAct[0] ;
            A252CliCod = P0A2G3_A252CliCod[0] ;
            A279CliNom = P0A2G3_A279CliNom[0] ;
            AV20Clicod = A252CliCod ;
            if ( AV22tintutex == 1 )
            {
               if ( GXutil.strcmp(AV21ImprimirFase, httpContext.getMessage( "S", "")) == 0 )
               {
                  hA2G0( false, 46) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 122, Gx_line+13, 169, Gx_line+30, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 179, Gx_line+11, 224, Gx_line+29, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 228, Gx_line+11, 417, Gx_line+29, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+46) ;
               }
               else
               {
                  hA2G0( false, 53) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Cliente:", ""), 122, Gx_line+15, 169, Gx_line+32, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 181, Gx_line+14, 370, Gx_line+32, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+53) ;
               }
            }
            /* Execute user subroutine: 'PREFAS' */
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
            AV25lastclicod = A252CliCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hA2G0( true, 0) ;
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
      /* 'PREFAS' Routine */
      returnInSub = false ;
      if ( AV22tintutex == 0 )
      {
      }
      /* Using cursor P0A2G4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV20Clicod), AV24Fases, AV24Fases});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14042FasActiva = P0A2G4_A14042FasActiva[0] ;
         A14258FasFactura = P0A2G4_A14258FasFactura[0] ;
         A252CliCod = P0A2G4_A252CliCod[0] ;
         A466FasPreKgm = P0A2G4_A466FasPreKgm[0] ;
         n466FasPreKgm = P0A2G4_n466FasPreKgm[0] ;
         A467FasPreMtr = P0A2G4_A467FasPreMtr[0] ;
         n467FasPreMtr = P0A2G4_n467FasPreMtr[0] ;
         A7070FasSigla = P0A2G4_A7070FasSigla[0] ;
         n7070FasSigla = P0A2G4_n7070FasSigla[0] ;
         A460FasDsc = P0A2G4_A460FasDsc[0] ;
         A457FasCod = P0A2G4_A457FasCod[0] ;
         A14042FasActiva = P0A2G4_A14042FasActiva[0] ;
         A7070FasSigla = P0A2G4_A7070FasSigla[0] ;
         n7070FasSigla = P0A2G4_n7070FasSigla[0] ;
         A460FasDsc = P0A2G4_A460FasDsc[0] ;
         if ( ( (0==AV22tintutex) ) || ( ( AV22tintutex == 1 ) && ( GXutil.strcmp(A14258FasFactura, httpContext.getMessage( "S", "")) == 0 ) ) )
         {
            AV18FasPrekgm = A466FasPreKgm ;
            AV19FasPreMtr = A467FasPreMtr ;
            if ( AV22tintutex == 0 )
            {
               hA2G0( false, 17) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18FasPrekgm, "ZZZZ.ZZZ")), 469, Gx_line+0, 528, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19FasPreMtr, "ZZZZ.ZZZ")), 564, Gx_line+0, 623, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 109, Gx_line+0, 202, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 173, Gx_line+0, 378, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7070FasSigla, "")), 382, Gx_line+0, 429, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14042FasActiva, "")), 717, Gx_line+0, 729, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            else
            {
               if ( GXutil.strcmp(AV21ImprimirFase, httpContext.getMessage( "S", "")) == 0 )
               {
                  hA2G0( false, 17) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18FasPrekgm, "ZZZZ.ZZZ")), 469, Gx_line+0, 528, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19FasPreMtr, "ZZZZ.ZZZ")), 564, Gx_line+0, 623, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 109, Gx_line+0, 202, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 173, Gx_line+0, 378, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A7070FasSigla, "")), 382, Gx_line+0, 429, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14042FasActiva, "")), 717, Gx_line+0, 729, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               else
               {
                  hA2G0( false, 34) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18FasPrekgm, "ZZZZ.ZZZ")), 469, Gx_line+2, 528, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV19FasPreMtr, "ZZZZ.ZZZ")), 564, Gx_line+2, 623, Gx_line+19, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A460FasDsc, "")), 109, Gx_line+2, 256, Gx_line+19, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A14042FasActiva, "")), 717, Gx_line+0, 729, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+34) ;
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void hA2G0( boolean bFoot ,
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
               if ( AV22tintutex == 1 )
               {
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 615, Gx_line+8, 666, Gx_line+25, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 372, Gx_line+8, 417, Gx_line+25, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pag.", ""), 346, Gx_line+8, 373, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(69, Gx_line+5, 665, Gx_line+5, 1, 0, 0, 128, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+26) ;
               }
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
            if ( AV22tintutex == 0 )
            {
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16EmprNom, "")), 22, Gx_line+7, 242, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV9Lit1, "")), 370, Gx_line+7, 434, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 440, Gx_line+7, 491, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10Lit2, "")), 505, Gx_line+7, 556, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 567, Gx_line+7, 660, Gx_line+24, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 440, Gx_line+43, 485, Gx_line+60, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11Lit3, "")), 357, Gx_line+43, 433, Gx_line+60, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Listagem Preços Fases", ""), 28, Gx_line+43, 200, Gx_line+62, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+64, 780, Gx_line+64, 3, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 501, Gx_line+43, 560, Gx_line+59, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 491, Gx_line+43, 495, Gx_line+58, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+70) ;
            }
            else
            {
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "83e2dd36-d80c-4601-b713-f362776f2d8c", "", context.getHttpContext().getTheme( )), 69, Gx_line+17, 164, Gx_line+114) ;
               getPrinter().GxDrawLine(69, Gx_line+116, 665, Gx_line+116, 2, 0, 0, 128, 0) ;
               getPrinter().GxAttris("Arial", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tabela Fases de Acabamento", ""), 251, Gx_line+89, 540, Gx_line+115, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+142) ;
            }
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preço Kg", ""), 476, Gx_line+33, 528, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preço Mt", ""), 571, Gx_line+33, 623, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(470, Gx_line+50, 528, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(565, Gx_line+50, 623, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "A?", ""), 708, Gx_line+33, 725, Gx_line+48, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(712, Gx_line+50, 724, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(109, Gx_line+50, 430, Gx_line+50, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 109, Gx_line+17, 151, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 158, Gx_line+17, 203, Gx_line+33, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 208, Gx_line+17, 428, Gx_line+33, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+59) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV15ImpCod = "" ;
      AV21ImprimirFase = "" ;
      AV23ClienteActivo = "" ;
      AV24Fases = "" ;
      AV9Lit1 = "" ;
      AV10Lit2 = "" ;
      AV11Lit3 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P0A2G2_A396EmprCod = new String[] {""} ;
      P0A2G2_A407EmprNom = new String[] {""} ;
      P0A2G2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV16EmprNom = "" ;
      GXv_int4 = new byte[1] ;
      A10045CliAct = "" ;
      P0A2G3_A396EmprCod = new String[] {""} ;
      P0A2G3_A10045CliAct = new String[] {""} ;
      P0A2G3_A252CliCod = new int[1] ;
      P0A2G3_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      P0A2G4_A396EmprCod = new String[] {""} ;
      P0A2G4_A14042FasActiva = new String[] {""} ;
      P0A2G4_A14258FasFactura = new String[] {""} ;
      P0A2G4_A252CliCod = new int[1] ;
      P0A2G4_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A2G4_n466FasPreKgm = new boolean[] {false} ;
      P0A2G4_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A2G4_n467FasPreMtr = new boolean[] {false} ;
      P0A2G4_A7070FasSigla = new String[] {""} ;
      P0A2G4_n7070FasSigla = new boolean[] {false} ;
      P0A2G4_A460FasDsc = new String[] {""} ;
      P0A2G4_A457FasCod = new String[] {""} ;
      A14042FasActiva = "" ;
      A14258FasFactura = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A7070FasSigla = "" ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      AV18FasPrekgm = DecimalUtil.ZERO ;
      AV19FasPreMtr = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rmei002__default(),
         new Object[] {
             new Object[] {
            P0A2G2_A396EmprCod, P0A2G2_A407EmprNom, P0A2G2_n407EmprNom
            }
            , new Object[] {
            P0A2G3_A396EmprCod, P0A2G3_A10045CliAct, P0A2G3_A252CliCod, P0A2G3_A279CliNom
            }
            , new Object[] {
            P0A2G4_A396EmprCod, P0A2G4_A14042FasActiva, P0A2G4_A14258FasFactura, P0A2G4_A252CliCod, P0A2G4_A466FasPreKgm, P0A2G4_n466FasPreKgm, P0A2G4_A467FasPreMtr, P0A2G4_n467FasPreMtr, P0A2G4_A7070FasSigla, P0A2G4_n7070FasSigla,
            P0A2G4_A460FasDsc, P0A2G4_A457FasCod
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

   private byte AV22tintutex ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte AV17FlagCli ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV12PCliCod ;
   private int AV13UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int AV20Clicod ;
   private int Gx_OldLine ;
   private int AV25lastclicod ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal AV18FasPrekgm ;
   private java.math.BigDecimal AV19FasPreMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV21ImprimirFase ;
   private String AV23ClienteActivo ;
   private String AV24Fases ;
   private String AV9Lit1 ;
   private String AV10Lit2 ;
   private String AV11Lit3 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV16EmprNom ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A14042FasActiva ;
   private String A14258FasFactura ;
   private String A7070FasSigla ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String Gx_time ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n7070FasSigla ;
   private IDataStoreProvider pr_default ;
   private String[] P0A2G2_A396EmprCod ;
   private String[] P0A2G2_A407EmprNom ;
   private boolean[] P0A2G2_n407EmprNom ;
   private String[] P0A2G3_A396EmprCod ;
   private String[] P0A2G3_A10045CliAct ;
   private int[] P0A2G3_A252CliCod ;
   private String[] P0A2G3_A279CliNom ;
   private String[] P0A2G4_A396EmprCod ;
   private String[] P0A2G4_A14042FasActiva ;
   private String[] P0A2G4_A14258FasFactura ;
   private int[] P0A2G4_A252CliCod ;
   private java.math.BigDecimal[] P0A2G4_A466FasPreKgm ;
   private boolean[] P0A2G4_n466FasPreKgm ;
   private java.math.BigDecimal[] P0A2G4_A467FasPreMtr ;
   private boolean[] P0A2G4_n467FasPreMtr ;
   private String[] P0A2G4_A7070FasSigla ;
   private boolean[] P0A2G4_n7070FasSigla ;
   private String[] P0A2G4_A460FasDsc ;
   private String[] P0A2G4_A457FasCod ;
}

final  class rmei002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A2G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV12PCliCod ,
                                          int AV13UCliCod ,
                                          int A252CliCod ,
                                          String A10045CliAct ,
                                          String AV23ClienteActivo ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[5];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliAct, CliCod, CliNom FROM TXPCLIENT" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliAct = ? or ? = 'T')");
      if ( ! (0==AV12PCliCod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV13UCliCod) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
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
                  return conditional_P0A2G3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2G2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A2G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A2G4", "SELECT T1.EmprCod, T2.FasActiva, T1.FasFactura, T1.CliCod, T1.FasPreKgm, T1.FasPreMtr, T2.FasSigla, T2.FasDsc, T1.FasCod FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T2.FasActiva = ? or ? = 'T') ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 28);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
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
                  stmt.setString(sIdx, (String)parms[5], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

