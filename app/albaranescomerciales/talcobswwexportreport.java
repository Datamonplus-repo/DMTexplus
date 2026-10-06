package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.talcobswwexportreport", "/app.albaranescomerciales.talcobswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talcobswwexportreport extends GXWebObjectStub
{
   public talcobswwexportreport( )
   {
   }

   public talcobswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talcobswwexportreport.class ));
   }

   public talcobswwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talcobswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talcobswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALCOBSWWExport Report";
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

