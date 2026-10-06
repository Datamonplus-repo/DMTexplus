package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpfaseswwexportreport", "/app.nwdpfaseswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpfaseswwexportreport extends GXWebObjectStub
{
   public nwdpfaseswwexportreport( )
   {
   }

   public nwdpfaseswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpfaseswwexportreport.class ));
   }

   public nwdpfaseswwexportreport( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpfaseswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpfaseswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPFases WWExport Report";
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

