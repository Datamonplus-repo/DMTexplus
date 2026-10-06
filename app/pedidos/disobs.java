package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disobs", "/app.pedidos.disobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disobs extends GXWebObjectStub
{
   public disobs( )
   {
   }

   public disobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disobs.class ));
   }

   public disobs( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Observaciones del pedido";
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

