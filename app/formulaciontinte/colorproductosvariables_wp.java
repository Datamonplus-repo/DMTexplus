package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.colorproductosvariables_wp", "/app.formulaciontinte.colorproductosvariables_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class colorproductosvariables_wp extends GXWebObjectStub
{
   public colorproductosvariables_wp( )
   {
   }

   public colorproductosvariables_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( colorproductosvariables_wp.class ));
   }

   public colorproductosvariables_wp( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new colorproductosvariables_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new colorproductosvariables_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Variables (#)";
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

