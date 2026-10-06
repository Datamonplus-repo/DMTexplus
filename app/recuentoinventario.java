package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.recuentoinventario", "/app.recuentoinventario"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recuentoinventario extends GXWebObjectStub
{
   public recuentoinventario( )
   {
   }

   public recuentoinventario( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recuentoinventario.class ));
   }

   public recuentoinventario( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recuentoinventario_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recuentoinventario_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recuento Inventario";
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

