package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatsuswwexportreport", "/app.tcatsuswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatsuswwexportreport extends GXWebObjectStub
{
   public tcatsuswwexportreport( )
   {
   }

   public tcatsuswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatsuswwexportreport.class ));
   }

   public tcatsuswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatsuswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatsuswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCATSUSWWExport Report";
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

