package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.facturacion.ttixfi__wp", "/app.facturacion.ttixfi__wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttixfi__wp extends GXWebObjectStub
{
   public ttixfi__wp( )
   {
   }

   public ttixfi__wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttixfi__wp.class ));
   }

   public ttixfi__wp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttixfi__wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttixfi__wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " TixFi";
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

