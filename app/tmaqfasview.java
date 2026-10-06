package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqfasview", "/app.tmaqfasview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqfasview extends GXWebObjectStub
{
   public tmaqfasview( )
   {
   }

   public tmaqfasview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqfasview.class ));
   }

   public tmaqfasview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqfasview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqfasview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMAQFASView";
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

