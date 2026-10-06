package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesoswwexportreport", "/app.nwdpprocesoswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesoswwexportreport extends GXWebObjectStub
{
   public nwdpprocesoswwexportreport( )
   {
   }

   public nwdpprocesoswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesoswwexportreport.class ));
   }

   public nwdpprocesoswwexportreport( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesoswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesoswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPProcesos WWExport Report";
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

