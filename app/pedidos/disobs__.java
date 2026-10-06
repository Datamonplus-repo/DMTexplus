package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disobs__", "/app.pedidos.disobs__"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disobs__ extends GXWebObjectStub
{
   public disobs__( )
   {
   }

   public disobs__( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disobs__.class ));
   }

   public disobs__( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disobs___impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disobs___impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones";
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

