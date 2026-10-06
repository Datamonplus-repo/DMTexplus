package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordcoview", "/app.tmordcoview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordcoview extends GXWebObjectStub
{
   public tmordcoview( )
   {
   }

   public tmordcoview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordcoview.class ));
   }

   public tmordcoview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordcoview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordcoview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMOrd Co View";
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

