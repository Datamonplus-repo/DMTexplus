package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcclientesdefectos", "/app.wcclientesdefectos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcclientesdefectos extends GXWebObjectStub
{
   public wcclientesdefectos( )
   {
   }

   public wcclientesdefectos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcclientesdefectos.class ));
   }

   public wcclientesdefectos( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcclientesdefectos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcclientesdefectos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCClientes Defectos";
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

