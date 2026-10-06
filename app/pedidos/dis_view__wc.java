package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.dis_view__wc", "/app.pedidos.dis_view__wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class dis_view__wc extends GXWebObjectStub
{
   public dis_view__wc( )
   {
   }

   public dis_view__wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( dis_view__wc.class ));
   }

   public dis_view__wc( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new dis_view__wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new dis_view__wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Detalle";
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

