package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrelaciondeformulasexportreport", "/app.wcrelaciondeformulasexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrelaciondeformulasexportreport extends GXWebObjectStub
{
   public wcrelaciondeformulasexportreport( )
   {
   }

   public wcrelaciondeformulasexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrelaciondeformulasexportreport.class ));
   }

   public wcrelaciondeformulasexportreport( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrelaciondeformulasexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrelaciondeformulasexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCRelaciondeformulas Export Report";
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

