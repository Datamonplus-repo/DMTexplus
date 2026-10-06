package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt001view", "/app.ficherosbasicos.tnxt001view"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt001view extends GXWebObjectStub
{
   public tnxt001view( )
   {
   }

   public tnxt001view( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt001view.class ));
   }

   public tnxt001view( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt001view_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt001view_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNXT001 View";
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

