package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn09wwexportreport", "/app.ttrn09wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn09wwexportreport extends GXWebObjectStub
{
   public ttrn09wwexportreport( )
   {
   }

   public ttrn09wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn09wwexportreport.class ));
   }

   public ttrn09wwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn09wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn09wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn09 WWExport Report";
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

