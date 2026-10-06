package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.penalizaciones", "/app.facturacion.penalizaciones"})
@jakarta.servlet.annotation.MultipartConfig
public final  class penalizaciones extends GXWebObjectStub
{
   public penalizaciones( )
   {
   }

   public penalizaciones( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( penalizaciones.class ));
   }

   public penalizaciones( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new penalizaciones_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new penalizaciones_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Penalizaciones";
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

