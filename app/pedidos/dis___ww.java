package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis___ww", "/app.pedidos.dis___ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis___ww extends GXWebObjectStub
{
   public dis___ww( )
   {
   }

   public dis___ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis___ww.class ));
   }

   public dis___ww( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis___ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis___ww_impl(context).cleanup();
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

