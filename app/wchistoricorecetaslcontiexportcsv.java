package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wchistoricorecetaslcontiexportcsv", "/app.wchistoricorecetaslcontiexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wchistoricorecetaslcontiexportcsv extends GXWebObjectStub
{
   public wchistoricorecetaslcontiexportcsv( )
   {
   }

   public wchistoricorecetaslcontiexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wchistoricorecetaslcontiexportcsv.class ));
   }

   public wchistoricorecetaslcontiexportcsv( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wchistoricorecetaslcontiexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wchistoricorecetaslcontiexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCHistorico Recetas Lconti Export CSV";
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

}

