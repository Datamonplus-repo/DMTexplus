package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tabbedview", "/app.tabbedview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tabbedview extends GXWebObjectStub
{
   public tabbedview( )
   {
   }

   public tabbedview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tabbedview.class ));
   }

   public tabbedview( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tabbedview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tabbedview_impl(context).cleanup();
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

