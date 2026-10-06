package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcformulasexportreport", "/app.wcformulasexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcformulasexportreport extends GXWebObjectStub
{
   public wcformulasexportreport( )
   {
   }

   public wcformulasexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcformulasexportreport.class ));
   }

   public wcformulasexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcformulasexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcformulasexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCFormulas Export Report";
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

