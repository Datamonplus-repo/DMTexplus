package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwincctrlexportcsv", "/app.webwincctrlexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwincctrlexportcsv extends GXWebObjectStub
{
   public webwincctrlexportcsv( )
   {
   }

   public webwincctrlexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwincctrlexportcsv.class ));
   }

   public webwincctrlexportcsv( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwincctrlexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwincctrlexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WInc Ctrl Export CSV";
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

