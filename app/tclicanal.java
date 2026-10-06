package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclicanal", "/app.tclicanal"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclicanal extends GXWebObjectStub
{
   public tclicanal( )
   {
   }

   public tclicanal( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclicanal.class ));
   }

   public tclicanal( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclicanal_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclicanal_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ClientesvsCliente Canal";
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

