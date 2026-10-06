package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmpdas", "/app.talmpdas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmpdas extends GXWebObjectStub
{
   public talmpdas( )
   {
   }

   public talmpdas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmpdas.class ));
   }

   public talmpdas( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmpdas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmpdas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALMACEN DE PRENDAS";
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

