package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webpedidosseguimientos", "/app.webpedidosseguimientos"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webpedidosseguimientos extends GXWebObjectStub
{
   public webpedidosseguimientos( )
   {
   }

   public webpedidosseguimientos( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webpedidosseguimientos.class ));
   }

   public webpedidosseguimientos( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpedidosseguimientos_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webpedidosseguimientos_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seguimientos Pedidos";
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

