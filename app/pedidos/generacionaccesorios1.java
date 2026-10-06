package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.generacionaccesorios1", "/app.pedidos.generacionaccesorios1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class generacionaccesorios1 extends GXWebObjectStub
{
   public generacionaccesorios1( )
   {
   }

   public generacionaccesorios1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( generacionaccesorios1.class ));
   }

   public generacionaccesorios1( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new generacionaccesorios1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new generacionaccesorios1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Generacion Accesorios ";
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

