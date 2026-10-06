package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webcomponent2exportcsv", "/app.webcomponent2exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcomponent2exportcsv extends GXWebObjectStub
{
   public webcomponent2exportcsv( )
   {
   }

   public webcomponent2exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcomponent2exportcsv.class ));
   }

   public webcomponent2exportcsv( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcomponent2exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcomponent2exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Component2 Export CSV";
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

