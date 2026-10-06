package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disnorm__ww", "/app.pedidos.disnorm__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disnorm__ww extends GXWebObjectStub
{
   public disnorm__ww( )
   {
   }

   public disnorm__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disnorm__ww.class ));
   }

   public disnorm__ww( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disnorm__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disnorm__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Normas del pedido";
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

