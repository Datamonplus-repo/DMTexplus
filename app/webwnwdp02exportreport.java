package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwnwdp02exportreport", "/app.webwnwdp02exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwnwdp02exportreport extends GXWebObjectStub
{
   public webwnwdp02exportreport( )
   {
   }

   public webwnwdp02exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwnwdp02exportreport.class ));
   }

   public webwnwdp02exportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwnwdp02exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwnwdp02exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web WNw DP02 Export Report";
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

