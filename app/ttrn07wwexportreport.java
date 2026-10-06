package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn07wwexportreport", "/app.ttrn07wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn07wwexportreport extends GXWebObjectStub
{
   public ttrn07wwexportreport( )
   {
   }

   public ttrn07wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn07wwexportreport.class ));
   }

   public ttrn07wwexportreport( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn07wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn07wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn07 WWExport Report";
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

