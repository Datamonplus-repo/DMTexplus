package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class apget_downloadfile_impl extends GXWebProcedure
{
   public apget_downloadfile_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "vrPathCompleto") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV11vrPathCompleto = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10vrNomeArquivo = httpContext.GetPar( "vrNomeArquivo") ;
            AV13ContentType = httpContext.GetPar( "ContentType") ;
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
      AV15BaseURL = AV14HttpRequest.getBaseURL() ;
      AV16UrlFile = GXutil.format( httpContext.getMessage( "%1download/%2", ""), AV15BaseURL, AV10vrNomeArquivo, "", "", "", "", "", "", "") ;
      AV8File.setSource( AV11vrPathCompleto );
      if ( AV8File.exists() )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV12HttpResponse.addHeader(httpContext.getMessage( "Content-Type", ""), httpContext.getMessage( "content = ", "")+AV13ContentType);
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV12HttpResponse.addHeader(httpContext.getMessage( "content-disposition", ""), httpContext.getMessage( "atachment; filename=", "")+GXutil.trim( AV10vrNomeArquivo));
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV12HttpResponse.addHeader(httpContext.getMessage( "Content-Length", ""), GXutil.str( AV8File.getLength(), 10, 0));
         }
         AV12HttpResponse.addFile(AV11vrPathCompleto);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Download:", "")+AV8File.getSource()+httpContext.getMessage( "no existe!", ""));
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
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
      AV11vrPathCompleto = "" ;
      AV10vrNomeArquivo = "" ;
      AV13ContentType = "" ;
      AV15BaseURL = "" ;
      AV14HttpRequest = httpContext.getHttpRequest();
      AV16UrlFile = "" ;
      AV8File = new com.genexus.util.GXFile();
      AV12HttpResponse = httpContext.getHttpResponse();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV11vrPathCompleto ;
   private String AV10vrNomeArquivo ;
   private String AV13ContentType ;
   private String AV15BaseURL ;
   private String AV16UrlFile ;
   private com.genexus.internet.HttpRequest AV14HttpRequest ;
   private com.genexus.util.GXFile AV8File ;
   private com.genexus.internet.HttpResponse AV12HttpResponse ;
}

