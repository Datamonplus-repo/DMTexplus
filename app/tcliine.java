package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcliine", "/app.tcliine"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcliine extends GXWebObjectStub
{
   public tcliine( )
   {
   }

   public tcliine( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcliine.class ));
   }

   public tcliine( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcliine_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcliine_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INCREMENTOS CLIENTE INT EE";
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

