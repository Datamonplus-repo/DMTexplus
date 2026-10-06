package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.tprefas", "/app.facturacion.tprefas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprefas extends GXWebObjectStub
{
   public tprefas( )
   {
   }

   public tprefas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprefas.class ));
   }

   public tprefas( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprefas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprefas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Precios por Fase";
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

