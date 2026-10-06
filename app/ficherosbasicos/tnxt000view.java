package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt000view", "/app.ficherosbasicos.tnxt000view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt000view extends GXWebObjectStub
{
   public tnxt000view( )
   {
   }

   public tnxt000view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt000view.class ));
   }

   public tnxt000view( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt000view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt000view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNXT000 View";
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

