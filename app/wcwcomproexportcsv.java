package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwcomproexportcsv", "/app.wcwcomproexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwcomproexportcsv extends GXWebObjectStub
{
   public wcwcomproexportcsv( )
   {
   }

   public wcwcomproexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwcomproexportcsv.class ));
   }

   public wcwcomproexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwcomproexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwcomproexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWcompro Export CSV";
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

