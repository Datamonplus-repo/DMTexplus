package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.weboperariosexportcsv", "/app.weboperariosexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class weboperariosexportcsv extends GXWebObjectStub
{
   public weboperariosexportcsv( )
   {
   }

   public weboperariosexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( weboperariosexportcsv.class ));
   }

   public weboperariosexportcsv( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new weboperariosexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new weboperariosexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Operarios Export CSV";
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

