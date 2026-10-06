package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmaceview", "/app.talmaceview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmaceview extends GXWebObjectStub
{
   public talmaceview( )
   {
   }

   public talmaceview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmaceview.class ));
   }

   public talmaceview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmaceview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmaceview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TAlmace View";
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

