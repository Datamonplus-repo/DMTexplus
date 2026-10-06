package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.gestionlaboratorio.tensprd", "/app.gestionlaboratorio.tensprd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tensprd extends GXWebObjectStub
{
   public tensprd( )
   {
   }

   public tensprd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tensprd.class ));
   }

   public tensprd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tensprd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tensprd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Grupo de Productos";
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

