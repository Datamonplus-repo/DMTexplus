package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tseccioview", "/app.ficherosbasicos.tseccioview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tseccioview extends GXWebObjectStub
{
   public tseccioview( )
   {
   }

   public tseccioview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tseccioview.class ));
   }

   public tseccioview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tseccioview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tseccioview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSECCIOView";
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

