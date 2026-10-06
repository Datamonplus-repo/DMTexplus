package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.conproducww", "/app.produccion.conproducww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class conproducww extends GXWebObjectStub
{
   public conproducww( )
   {
   }

   public conproducww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( conproducww.class ));
   }

   public conproducww( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new conproducww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new conproducww_impl(context).cleanup();
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

