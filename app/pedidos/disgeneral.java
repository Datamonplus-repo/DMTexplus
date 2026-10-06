package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disgeneral", "/app.pedidos.disgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disgeneral extends GXWebObjectStub
{
   public disgeneral( )
   {
   }

   public disgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disgeneral.class ));
   }

   public disgeneral( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Dis General";
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

