package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disnorm", "/app.pedidos.disnorm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disnorm extends GXWebObjectStub
{
   public disnorm( )
   {
   }

   public disnorm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disnorm.class ));
   }

   public disnorm( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disnorm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disnorm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Norma del pedido";
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

