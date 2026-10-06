package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcjobinfo", "/app.wcjobinfo"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcjobinfo extends GXWebObjectStub
{
   public wcjobinfo( )
   {
   }

   public wcjobinfo( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcjobinfo.class ));
   }

   public wcjobinfo( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcjobinfo_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcjobinfo_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCJob Info";
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

