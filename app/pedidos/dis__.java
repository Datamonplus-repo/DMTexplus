package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis__", "/app.pedidos.dis__"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis__ extends GXWebObjectStub
{
   public dis__( )
   {
   }

   public dis__( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis__.class ));
   }

   public dis__( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis___impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis___impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Pedido Cliente";
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

