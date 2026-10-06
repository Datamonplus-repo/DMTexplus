package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwmodprmexportcsv", "/app.wcwmodprmexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwmodprmexportcsv extends GXWebObjectStub
{
   public wcwmodprmexportcsv( )
   {
   }

   public wcwmodprmexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwmodprmexportcsv.class ));
   }

   public wcwmodprmexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwmodprmexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwmodprmexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWmodprm Export CSV";
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

