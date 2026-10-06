package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticp", "/app.tarticp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticp extends GXWebObjectStub
{
   public tarticp( )
   {
   }

   public tarticp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticp.class ));
   }

   public tarticp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PROCESOS";
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

