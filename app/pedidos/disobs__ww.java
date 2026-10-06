package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disobs__ww", "/app.pedidos.disobs__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disobs__ww extends GXWebObjectStub
{
   public disobs__ww( )
   {
   }

   public disobs__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disobs__ww.class ));
   }

   public disobs__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disobs__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disobs__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Observaciones del pedido";
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

