package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwlisalcexportcsv", "/app.webwlisalcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwlisalcexportcsv extends GXWebObjectStub
{
   public webwlisalcexportcsv( )
   {
   }

   public webwlisalcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwlisalcexportcsv.class ));
   }

   public webwlisalcexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwlisalcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwlisalcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WLISALCExport CSV";
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

