package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternosenviowwexportreport", "/app.trabajosexternosenviowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trabajosexternosenviowwexportreport extends GXWebObjectStub
{
   public trabajosexternosenviowwexportreport( )
   {
   }

   public trabajosexternosenviowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trabajosexternosenviowwexportreport.class ));
   }

   public trabajosexternosenviowwexportreport( int remoteHandle ,
                                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trabajosexternosenviowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trabajosexternosenviowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Trabajos Externos Envio WWExport Report";
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

