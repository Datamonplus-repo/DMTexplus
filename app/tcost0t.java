package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcost0t", "/app.tcost0t"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcost0t extends GXWebObjectStub
{
   public tcost0t( )
   {
   }

   public tcost0t( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcost0t.class ));
   }

   public tcost0t( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcost0t_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcost0t_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MODIFICACION TIEMPOS";
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

