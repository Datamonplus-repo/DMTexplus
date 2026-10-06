package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.verobservacionespedido", "/app.verobservacionespedido"})
@jakarta.servlet.annotation.MultipartConfig
public final  class verobservacionespedido extends GXWebObjectStub
{
   public verobservacionespedido( )
   {
   }

   public verobservacionespedido( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( verobservacionespedido.class ));
   }

   public verobservacionespedido( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new verobservacionespedido_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new verobservacionespedido_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Observaciones del pedido";
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

