package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class adownloadbinary_impl extends GXWebProcedure
{
   public adownloadbinary_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "RealPath") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV9RealPath = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV10UrlPath = httpContext.GetPar( "UrlPath") ;
            AV11FileName = httpContext.GetPar( "FileName") ;
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
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV8HttpResponse.addHeader("Pragma", "public");
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV8HttpResponse.addHeader("Cache-Control", "max-age=0");
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV8HttpResponse.addHeader("Content-Type", httpContext.getMessage( "application/pdf;charset=UTF-8", ""));
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV8HttpResponse.addHeader("Content-Disposition", "attachment;filename="+GXutil.trim( AV11FileName));
      }
      AV8HttpResponse.addFile(AV9RealPath);
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
      AV9RealPath = "" ;
      AV10UrlPath = "" ;
      AV11FileName = "" ;
      AV8HttpResponse = httpContext.getHttpResponse();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private String AV9RealPath ;
   private String AV10UrlPath ;
   private String AV11FileName ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
}

