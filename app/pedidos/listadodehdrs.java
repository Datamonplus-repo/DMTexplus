package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.listadodehdrs", "/app.pedidos.listadodehdrs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadodehdrs extends GXWebObjectStub
{
   public listadodehdrs( )
   {
   }

   public listadodehdrs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadodehdrs.class ));
   }

   public listadodehdrs( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadodehdrs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadodehdrs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Hdrs";
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

