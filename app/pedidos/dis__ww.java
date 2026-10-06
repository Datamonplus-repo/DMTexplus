package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis__ww", "/app.pedidos.dis__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis__ww extends GXWebObjectStub
{
   public dis__ww( )
   {
   }

   public dis__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis__ww.class ));
   }

   public dis__ww( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Pedidos";
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

