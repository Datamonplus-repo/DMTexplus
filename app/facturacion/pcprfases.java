package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.pcprfases", "/app.facturacion.pcprfases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pcprfases extends GXWebObjectStub
{
   public pcprfases( )
   {
   }

   public pcprfases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pcprfases.class ));
   }

   public pcprfases( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pcprfases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pcprfases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Precios por Fase";
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

