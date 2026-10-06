package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwstk100exportreport", "/app.wcwstk100exportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwstk100exportreport extends GXWebObjectStub
{
   public wcwstk100exportreport( )
   {
   }

   public wcwstk100exportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwstk100exportreport.class ));
   }

   public wcwstk100exportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwstk100exportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwstk100exportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWSTK100 Export Report";
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

