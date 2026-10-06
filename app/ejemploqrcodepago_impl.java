package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ejemploqrcodepago_impl extends GXWebReport
{
   public ejemploqrcodepago_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 16834, 11909, 0, 1, 1, 0, 1, 1) )
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
         GXv_char1[0] = AV18PaginaGeneradora ;
         GXv_char2[0] = AV19PaginaImagenGenerada ;
         GXv_char3[0] = AV20PaginaImagenPNG ;
         GXv_char4[0] = AV22SecretKey ;
         GXv_char5[0] = AV12FormatoGenerarQRCode ;
         GXv_char6[0] = AV13FormatoUrlPNG ;
         GXv_char7[0] = AV11FormatoDeleteQrCodeManager ;
         new app.parametrosqrcodesitioqrc_es(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_char3, GXv_char4, GXv_char5, GXv_char6, GXv_char7) ;
         ejemploqrcodepago_impl.this.AV18PaginaGeneradora = GXv_char1[0] ;
         ejemploqrcodepago_impl.this.AV19PaginaImagenGenerada = GXv_char2[0] ;
         ejemploqrcodepago_impl.this.AV20PaginaImagenPNG = GXv_char3[0] ;
         ejemploqrcodepago_impl.this.AV22SecretKey = GXv_char4[0] ;
         ejemploqrcodepago_impl.this.AV12FormatoGenerarQRCode = GXv_char5[0] ;
         ejemploqrcodepago_impl.this.AV13FormatoUrlPNG = GXv_char6[0] ;
         ejemploqrcodepago_impl.this.AV11FormatoDeleteQrCodeManager = GXv_char7[0] ;
         AV24TextoGenerar = httpContext.getMessage( "A:123456789*B:999999990*C:PT*D:FT*E:N*F:20191231*G:FTAB2019/0035*H:CSDF7T5H0035*I1:PT*I2:12000.00*I3:15000.00*I4:900.00*I5:50000.00*I6:6500.00*I7:80000.00*I8:18400.00*J1:PTAC*J2:10000.00*J3:25000.56*J4:1000.02*J5:75000.00*J6:6750.00*J7:100000.00*J8:18000.00*K1:PTMA*K2:5000.00*K3:12500.00*K4:625.00*K5:25000.00*K6:3000.00*K7:40000.00*K8:8800.00*L:100.00*M:25.00*N:64000.02*O:513600.58*P:100.00*Q:kLp0*R:9999*S:TB;PT00000000000000000000000;513500.58", "") ;
         AV16K = (short)(GXutil.len( AV24TextoGenerar)) ;
         /* Execute user subroutine: 'REALIZAR HTTPCLIENT PARA GENERAR QR CODE' */
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
         AV10CargadoSDT = AV9SdtResultQRCode.fromJSonString(AV25TextoJSON, null) ;
         if ( AV10CargadoSDT )
         {
            AV21QrCodeManager = AV9SdtResultQRCode.getgxTv_SdtSdtResultQRCode_Result().getgxTv_SdtSdtQRCode_Qr() ;
            AV21QrCodeManager = GXutil.strReplace( AV21QrCodeManager, AV19PaginaImagenGenerada, "") ;
            AV26TextoURL = GXutil.format( AV13FormatoUrlPNG, AV20PaginaImagenPNG, AV21QrCodeManager, "", "", "", "", "", "", "") ;
            AV15iMAGEN = AV26TextoURL ;
            AV30Imagen_GXI = GXDbFile.pathToUrl( AV26TextoURL, context.getHttpContext()) ;
            AV17Mensaje = httpContext.getMessage( "5.1. Exemplo 1 – Fatura", "") ;
            AV17Mensaje += httpContext.getMessage( "<br>Mensagem com os elementos da tabela acima, com indicação do IBAN e", "") ;
            AV17Mensaje += httpContext.getMessage( "<br>valores de IVA nos espaços fiscais PT, PT-AC e PT-MA:", "") ;
            AV17Mensaje += httpContext.getMessage( "<br>", "") ;
            AV17Mensaje += httpContext.getMessage( "<br>", "") ;
            AV17Mensaje += AV24TextoGenerar ;
            AV17Mensaje += httpContext.getMessage( "<br>", "") ;
            AV17Mensaje += httpContext.getMessage( "<br>", "") ;
            AV17Mensaje += httpContext.getMessage( "Largo Total: ", "") + GXutil.trim( GXutil.str( AV16K, 4, 0)) + httpContext.getMessage( "<br>URL -> ", "") + AV9SdtResultQRCode.getgxTv_SdtSdtResultQRCode_Result().getgxTv_SdtSdtQRCode_Qr() ;
            h85D0( false, 640) ;
            sImgUrl = ((GXutil.strcmp("", AV15iMAGEN)==0) ? AV30Imagen_GXI : AV15iMAGEN) ;
            getPrinter().GxDrawBitMap(sImgUrl, 17, Gx_line+17, 227, Gx_line+227) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Mensaje, "")), 242, Gx_line+17, 782, Gx_line+617, 0, 1, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+640) ;
            /* Execute user subroutine: 'BORRAR CÓDIGO PARA OPTIMIZAR SERVICIO EN SITIO PAGO... QRC.ES' */
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
         }
         else
         {
            AV17Mensaje = httpContext.getMessage( "Falla de la Subrutina \"HTTPCLIENT para GENERAR QR CODE\"", "") ;
            h85D0( false, 640) ;
            sImgUrl = ((GXutil.strcmp("", AV15iMAGEN)==0) ? AV30Imagen_GXI : AV15iMAGEN) ;
            getPrinter().GxDrawBitMap(sImgUrl, 17, Gx_line+17, 227, Gx_line+227) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17Mensaje, "")), 242, Gx_line+17, 782, Gx_line+617, 0, 1, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+640) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h85D0( true, 0) ;
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
      /* 'REALIZAR HTTPCLIENT PARA GENERAR QR CODE' Routine */
      returnInSub = false ;
      AV14GenerarQRCode = GXutil.format( AV12FormatoGenerarQRCode, AV18PaginaGeneradora, AV22SecretKey, AV24TextoGenerar, "", "", "", "", "", "") ;
      AV8HttpClient.execute(httpContext.getMessage( "GET", ""), AV14GenerarQRCode);
      AV25TextoJSON = AV8HttpClient.getString() ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BORRAR CÓDIGO PARA OPTIMIZAR SERVICIO EN SITIO PAGO... QRC.ES' Routine */
      returnInSub = false ;
      AV14GenerarQRCode = GXutil.format( AV11FormatoDeleteQrCodeManager, AV18PaginaGeneradora, AV22SecretKey, AV21QrCodeManager, "", "", "", "", "", "") ;
      AV8HttpClient.execute(httpContext.getMessage( "GET", ""), AV14GenerarQRCode);
   }

   public void h85D0( boolean bFoot ,
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV8HttpClient.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV18PaginaGeneradora = "" ;
      GXv_char1 = new String[1] ;
      AV19PaginaImagenGenerada = "" ;
      GXv_char2 = new String[1] ;
      AV20PaginaImagenPNG = "" ;
      GXv_char3 = new String[1] ;
      AV22SecretKey = "" ;
      GXv_char4 = new String[1] ;
      AV12FormatoGenerarQRCode = "" ;
      GXv_char5 = new String[1] ;
      AV13FormatoUrlPNG = "" ;
      GXv_char6 = new String[1] ;
      AV11FormatoDeleteQrCodeManager = "" ;
      GXv_char7 = new String[1] ;
      AV24TextoGenerar = "" ;
      AV25TextoJSON = "" ;
      AV9SdtResultQRCode = new app.SdtSdtResultQRCode(remoteHandle, context);
      AV21QrCodeManager = "" ;
      AV26TextoURL = "" ;
      AV15iMAGEN = "" ;
      AV30Imagen_GXI = "" ;
      AV17Mensaje = "" ;
      AV15iMAGEN = "" ;
      sImgUrl = "" ;
      AV14GenerarQRCode = "" ;
      AV8HttpClient = new com.genexus.internet.HttpClient();
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV16K ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String sImgUrl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV10CargadoSDT ;
   private String AV18PaginaGeneradora ;
   private String AV19PaginaImagenGenerada ;
   private String AV20PaginaImagenPNG ;
   private String AV22SecretKey ;
   private String AV12FormatoGenerarQRCode ;
   private String AV13FormatoUrlPNG ;
   private String AV11FormatoDeleteQrCodeManager ;
   private String AV24TextoGenerar ;
   private String AV25TextoJSON ;
   private String AV21QrCodeManager ;
   private String AV26TextoURL ;
   private String AV30Imagen_GXI ;
   private String AV17Mensaje ;
   private String AV14GenerarQRCode ;
   private String AV15iMAGEN ;
   private String Imagen ;
   private app.SdtSdtResultQRCode AV9SdtResultQRCode ;
   private com.genexus.internet.HttpClient AV8HttpClient ;
}

