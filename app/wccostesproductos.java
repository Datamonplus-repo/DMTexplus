package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wccostesproductos", "/app.wccostesproductos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wccostesproductos extends GXWebObjectStub
{
   public wccostesproductos( )
   {
   }

   public wccostesproductos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wccostesproductos.class ));
   }

   public wccostesproductos( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wccostesproductos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wccostesproductos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Recetas (Costes, detalle de Productos)";
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

