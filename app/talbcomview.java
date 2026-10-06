package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbcomview", "/app.talbcomview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbcomview extends GXWebObjectStub
{
   public talbcomview( )
   {
   }

   public talbcomview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbcomview.class ));
   }

   public talbcomview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbcomview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbcomview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBCOMView";
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

