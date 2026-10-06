package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclidte", "/app.tclidte"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclidte extends GXWebObjectStub
{
   public tclidte( )
   {
   }

   public tclidte( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclidte.class ));
   }

   public tclidte( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclidte_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclidte_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DESCUENTOS CLIENTE INT EE";
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

