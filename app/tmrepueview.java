package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmrepueview", "/app.tmrepueview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepueview extends GXWebObjectStub
{
   public tmrepueview( )
   {
   }

   public tmrepueview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepueview.class ));
   }

   public tmrepueview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepueview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepueview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMRepue View";
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

