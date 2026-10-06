package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tartvel", "/app.tartvel"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tartvel extends GXWebObjectStub
{
   public tartvel( )
   {
   }

   public tartvel( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tartvel.class ));
   }

   public tartvel( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tartvel_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tartvel_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ARTICULO";
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

