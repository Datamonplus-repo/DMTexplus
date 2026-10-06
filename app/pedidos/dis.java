package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis", "/app.pedidos.dis"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis extends GXWebObjectStub
{
   public dis( )
   {
   }

   public dis( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis.class ));
   }

   public dis( int remoteHandle ,
               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedidos";
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

