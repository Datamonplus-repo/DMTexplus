package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipartview", "/app.ttipartview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipartview extends GXWebObjectStub
{
   public ttipartview( )
   {
   }

   public ttipartview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipartview.class ));
   }

   public ttipartview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipartview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipartview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPARTView";
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

