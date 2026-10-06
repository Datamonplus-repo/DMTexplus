package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwconreinfiniteexportcsv", "/app.webwconreinfiniteexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwconreinfiniteexportcsv extends GXWebObjectStub
{
   public webwconreinfiniteexportcsv( )
   {
   }

   public webwconreinfiniteexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwconreinfiniteexportcsv.class ));
   }

   public webwconreinfiniteexportcsv( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwconreinfiniteexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwconreinfiniteexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WConre Infinite Export CSV";
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

