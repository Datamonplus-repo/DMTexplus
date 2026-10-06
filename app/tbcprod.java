package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tbcprod", "/app.tbcprod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tbcprod extends GXWebObjectStub
{
   public tbcprod( )
   {
   }

   public tbcprod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tbcprod.class ));
   }

   public tbcprod( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbcprod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tbcprod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos";
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

