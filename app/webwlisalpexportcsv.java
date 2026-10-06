package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwlisalpexportcsv", "/app.webwlisalpexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwlisalpexportcsv extends GXWebObjectStub
{
   public webwlisalpexportcsv( )
   {
   }

   public webwlisalpexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwlisalpexportcsv.class ));
   }

   public webwlisalpexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwlisalpexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwlisalpexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WLISALPExport CSV";
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

