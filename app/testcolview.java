package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.testcolview", "/app.testcolview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class testcolview extends GXWebObjectStub
{
   public testcolview( )
   {
   }

   public testcolview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( testcolview.class ));
   }

   public testcolview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new testcolview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new testcolview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEst Col View";
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

