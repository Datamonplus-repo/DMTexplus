package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tobsforwwexportreport", "/app.formulaciontinte.tobsforwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsforwwexportreport extends GXWebObjectStub
{
   public tobsforwwexportreport( )
   {
   }

   public tobsforwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsforwwexportreport.class ));
   }

   public tobsforwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsforwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsforwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TOBSFORWWExport Report";
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

