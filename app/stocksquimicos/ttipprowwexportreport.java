package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.ttipprowwexportreport", "/app.stocksquimicos.ttipprowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipprowwexportreport extends GXWebObjectStub
{
   public ttipprowwexportreport( )
   {
   }

   public ttipprowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipprowwexportreport.class ));
   }

   public ttipprowwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipprowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipprowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTIPPROWWExport Report";
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

