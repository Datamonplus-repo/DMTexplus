package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwwkp89exportreport", "/app.wcwwkp89exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwwkp89exportreport extends GXWebObjectStub
{
   public wcwwkp89exportreport( )
   {
   }

   public wcwwkp89exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwwkp89exportreport.class ));
   }

   public wcwwkp89exportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwwkp89exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwwkp89exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWWkp89 Export Report";
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

