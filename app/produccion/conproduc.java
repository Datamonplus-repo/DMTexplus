package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.conproduc", "/app.produccion.conproduc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class conproduc extends GXWebObjectStub
{
   public conproduc( )
   {
   }

   public conproduc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( conproduc.class ));
   }

   public conproduc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new conproduc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new conproduc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta de Produccion";
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

