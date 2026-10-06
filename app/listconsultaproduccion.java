package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.listconsultaproduccion", "/app.listconsultaproduccion"})
@jakarta.servlet.annotation.MultipartConfig
public final  class listconsultaproduccion extends GXWebObjectStub
{
   public listconsultaproduccion( )
   {
   }

   public listconsultaproduccion( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( listconsultaproduccion.class ));
   }

   public listconsultaproduccion( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new listconsultaproduccion_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new listconsultaproduccion_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Consulta de Produccion";
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

