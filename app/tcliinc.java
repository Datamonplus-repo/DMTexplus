package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcliinc", "/app.tcliinc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcliinc extends GXWebObjectStub
{
   public tcliinc( )
   {
   }

   public tcliinc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcliinc.class ));
   }

   public tcliinc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcliinc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcliinc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INCREMENTOS CLIENTES";
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

