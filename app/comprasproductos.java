package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.comprasproductos", "/app.comprasproductos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class comprasproductos extends GXWebObjectStub
{
   public comprasproductos( )
   {
   }

   public comprasproductos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( comprasproductos.class ));
   }

   public comprasproductos( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new comprasproductos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new comprasproductos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Compras Productos";
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

