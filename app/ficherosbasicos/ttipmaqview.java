package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipmaqview", "/app.ficherosbasicos.ttipmaqview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmaqview extends GXWebObjectStub
{
   public ttipmaqview( )
   {
   }

   public ttipmaqview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmaqview.class ));
   }

   public ttipmaqview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmaqview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmaqview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPMAQView";
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

