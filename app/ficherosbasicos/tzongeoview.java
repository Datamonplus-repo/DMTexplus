package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tzongeoview", "/app.ficherosbasicos.tzongeoview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tzongeoview extends GXWebObjectStub
{
   public tzongeoview( )
   {
   }

   public tzongeoview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tzongeoview.class ));
   }

   public tzongeoview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tzongeoview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tzongeoview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TZONGEOView";
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

