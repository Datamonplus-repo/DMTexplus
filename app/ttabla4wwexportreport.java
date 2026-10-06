package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttabla4wwexportreport", "/app.ttabla4wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttabla4wwexportreport extends GXWebObjectStub
{
   public ttabla4wwexportreport( )
   {
   }

   public ttabla4wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttabla4wwexportreport.class ));
   }

   public ttabla4wwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttabla4wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttabla4wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTABLA4 WWExport Report";
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

