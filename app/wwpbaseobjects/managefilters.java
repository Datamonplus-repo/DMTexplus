package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwpbaseobjects.managefilters", "/app.wwpbaseobjects.managefilters"})
@jakarta.servlet.annotation.MultipartConfig
public final  class managefilters extends GXWebObjectStub
{
   public managefilters( )
   {
   }

   public managefilters( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( managefilters.class ));
   }

   public managefilters( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new managefilters_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new managefilters_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WWP_ManageFiltersDescription";
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

