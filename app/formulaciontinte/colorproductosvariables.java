package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.colorproductosvariables", "/app.formulaciontinte.colorproductosvariables"})
@jakarta.servlet.annotation.MultipartConfig
public final  class colorproductosvariables extends GXWebObjectStub
{
   public colorproductosvariables( )
   {
   }

   public colorproductosvariables( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( colorproductosvariables.class ));
   }

   public colorproductosvariables( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new colorproductosvariables_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new colorproductosvariables_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos (#)";
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

