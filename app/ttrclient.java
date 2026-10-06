package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrclient", "/app.ttrclient"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrclient extends GXWebObjectStub
{
   public ttrclient( )
   {
   }

   public ttrclient( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrclient.class ));
   }

   public ttrclient( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrclient_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrclient_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLIENT";
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

