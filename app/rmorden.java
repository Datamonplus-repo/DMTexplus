package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rmorden", "/app.rmorden"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmorden extends GXWebObjectStub
{
   public rmorden( )
   {
   }

   public rmorden( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmorden.class ));
   }

   public rmorden( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmorden_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmorden_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Orden de Mantenimiento";
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

