package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entradapedidoclientefases", "/app.entradapedidoclientefases"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entradapedidoclientefases extends GXWebObjectStub
{
   public entradapedidoclientefases( )
   {
   }

   public entradapedidoclientefases( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entradapedidoclientefases.class ));
   }

   public entradapedidoclientefases( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entradapedidoclientefases_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entradapedidoclientefases_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Pedido Cliente Fases";
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

