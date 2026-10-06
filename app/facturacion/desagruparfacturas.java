package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.desagruparfacturas", "/app.facturacion.desagruparfacturas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class desagruparfacturas extends GXWebObjectStub
{
   public desagruparfacturas( )
   {
   }

   public desagruparfacturas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( desagruparfacturas.class ));
   }

   public desagruparfacturas( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new desagruparfacturas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new desagruparfacturas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Des Agrupar Facturas";
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

