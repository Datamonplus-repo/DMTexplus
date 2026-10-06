package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tingqui", "/app.tingqui"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tingqui extends GXWebObjectStub
{
   public tingqui( )
   {
   }

   public tingqui( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tingqui.class ));
   }

   public tingqui( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tingqui_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tingqui_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ingresos Quimicos";
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

