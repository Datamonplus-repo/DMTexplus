package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webbcprod", "/app.webbcprod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webbcprod extends GXWebObjectStub
{
   public webbcprod( )
   {
   }

   public webbcprod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webbcprod.class ));
   }

   public webbcprod( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webbcprod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webbcprod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envío de datos de productos químicos de Datamon a BC";
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

