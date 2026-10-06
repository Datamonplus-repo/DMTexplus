package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tartcon", "/app.tartcon"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tartcon extends GXWebObjectStub
{
   public tartcon( )
   {
   }

   public tartcon( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tartcon.class ));
   }

   public tartcon( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tartcon_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tartcon_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla conversion Articulos Clientes";
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

