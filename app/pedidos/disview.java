package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disview", "/app.pedidos.disview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disview extends GXWebObjectStub
{
   public disview( )
   {
   }

   public disview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disview.class ));
   }

   public disview( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Dis View";
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

