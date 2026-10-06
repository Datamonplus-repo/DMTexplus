package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarttej", "/app.tarttej"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarttej extends GXWebObjectStub
{
   public tarttej( )
   {
   }

   public tarttej( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarttej.class ));
   }

   public tarttej( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarttej_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarttej_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DATOS TEJEDURIA";
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

