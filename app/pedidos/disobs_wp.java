package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disobs_wp", "/app.pedidos.disobs_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disobs_wp extends GXWebObjectStub
{
   public disobs_wp( )
   {
   }

   public disobs_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disobs_wp.class ));
   }

   public disobs_wp( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disobs_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disobs_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Observaciones";
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

