package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwpbaseobjects.wwptabbedview", "/app.wwpbaseobjects.wwptabbedview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwptabbedview extends GXWebObjectStub
{
   public wwptabbedview( )
   {
   }

   public wwptabbedview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwptabbedview.class ));
   }

   public wwptabbedview( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwptabbedview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwptabbedview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabbed View";
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

