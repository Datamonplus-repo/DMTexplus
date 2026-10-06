package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticu_wwexportreport", "/app.tarticu_wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticu_wwexportreport extends GXWebObjectStub
{
   public tarticu_wwexportreport( )
   {
   }

   public tarticu_wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticu_wwexportreport.class ));
   }

   public tarticu_wwexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticu_wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticu_wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tarticu_WWExport Report";
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

