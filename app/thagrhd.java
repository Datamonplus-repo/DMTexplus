package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thagrhd", "/app.thagrhd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thagrhd extends GXWebObjectStub
{
   public thagrhd( )
   {
   }

   public thagrhd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thagrhd.class ));
   }

   public thagrhd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thagrhd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thagrhd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Histórico de agrupaciones";
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

