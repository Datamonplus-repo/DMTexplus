package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwstpprehexportcsv", "/app.webwstpprehexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwstpprehexportcsv extends GXWebObjectStub
{
   public webwstpprehexportcsv( )
   {
   }

   public webwstpprehexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwstpprehexportcsv.class ));
   }

   public webwstpprehexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwstpprehexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwstpprehexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WSTp Pre HExport CSV";
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

