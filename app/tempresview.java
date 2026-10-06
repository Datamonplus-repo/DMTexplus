package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tempresview", "/app.tempresview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tempresview extends GXWebObjectStub
{
   public tempresview( )
   {
   }

   public tempresview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tempresview.class ));
   }

   public tempresview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tempresview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tempresview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEMPRESView";
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

