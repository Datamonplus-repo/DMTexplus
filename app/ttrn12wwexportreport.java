package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn12wwexportreport", "/app.ttrn12wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn12wwexportreport extends GXWebObjectStub
{
   public ttrn12wwexportreport( )
   {
   }

   public ttrn12wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn12wwexportreport.class ));
   }

   public ttrn12wwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn12wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn12wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn12 WWExport Report";
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

