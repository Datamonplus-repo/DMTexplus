package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.listadopreciosporcolor", "/app.facturacion.listadopreciosporcolor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listadopreciosporcolor extends GXWebObjectStub
{
   public listadopreciosporcolor( )
   {
   }

   public listadopreciosporcolor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listadopreciosporcolor.class ));
   }

   public listadopreciosporcolor( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listadopreciosporcolor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listadopreciosporcolor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Precios por Color";
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

