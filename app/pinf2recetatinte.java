package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pinf2recetatinte", "/app.pinf2recetatinte"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pinf2recetatinte extends GXWebObjectStub
{
   public pinf2recetatinte( )
   {
   }

   public pinf2recetatinte( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pinf2recetatinte.class ));
   }

   public pinf2recetatinte( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pinf2recetatinte_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pinf2recetatinte_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Inf2 Receta Tinte";
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

