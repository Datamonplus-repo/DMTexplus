package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet1wwexportreport", "/app.talbdet1wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet1wwexportreport extends GXWebObjectStub
{
   public talbdet1wwexportreport( )
   {
   }

   public talbdet1wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet1wwexportreport.class ));
   }

   public talbdet1wwexportreport( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet1wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet1wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDET1 WWExport Report";
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

