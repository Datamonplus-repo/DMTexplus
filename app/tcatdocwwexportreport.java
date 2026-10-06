package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdocwwexportreport", "/app.tcatdocwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdocwwexportreport extends GXWebObjectStub
{
   public tcatdocwwexportreport( )
   {
   }

   public tcatdocwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdocwwexportreport.class ));
   }

   public tcatdocwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdocwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdocwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCATDOCWWExport Report";
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

