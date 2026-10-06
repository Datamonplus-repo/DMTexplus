package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttable1wwexportreport", "/app.ttable1wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttable1wwexportreport extends GXWebObjectStub
{
   public ttable1wwexportreport( )
   {
   }

   public ttable1wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttable1wwexportreport.class ));
   }

   public ttable1wwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttable1wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttable1wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTABLE1 WWExport Report";
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

