package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.devops.wrelease", "/app.devops.wrelease"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wrelease extends GXWebObjectStub
{
   public wrelease( )
   {
   }

   public wrelease( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wrelease.class ));
   }

   public wrelease( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wrelease_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wrelease_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TexplusNET - Release Notes";
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

