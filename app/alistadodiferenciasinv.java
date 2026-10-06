package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.alistadodiferenciasinv", "/app.alistadodiferenciasinv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class alistadodiferenciasinv extends GXWebObjectStub
{
   public alistadodiferenciasinv( )
   {
   }

   public alistadodiferenciasinv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( alistadodiferenciasinv.class ));
   }

   public alistadodiferenciasinv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new alistadodiferenciasinv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new alistadodiferenciasinv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Diferencias Inventario";
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

