package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tclimatwwexportreport", "/app.formulaciontinte.tclimatwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclimatwwexportreport extends GXWebObjectStub
{
   public tclimatwwexportreport( )
   {
   }

   public tclimatwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclimatwwexportreport.class ));
   }

   public tclimatwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclimatwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclimatwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIMATWWExport Report";
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

