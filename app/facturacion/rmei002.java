package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.rmei002", "/app.facturacion.rmei002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmei002 extends GXWebObjectStub
{
   public rmei002( )
   {
   }

   public rmei002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmei002.class ));
   }

   public rmei002( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmei002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmei002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado de Precio por Fases";
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

