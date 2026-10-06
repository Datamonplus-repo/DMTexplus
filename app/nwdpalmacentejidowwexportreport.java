package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpalmacentejidowwexportreport", "/app.nwdpalmacentejidowwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpalmacentejidowwexportreport extends GXWebObjectStub
{
   public nwdpalmacentejidowwexportreport( )
   {
   }

   public nwdpalmacentejidowwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpalmacentejidowwexportreport.class ));
   }

   public nwdpalmacentejidowwexportreport( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpalmacentejidowwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpalmacentejidowwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPAlmacen Tejido WWExport Report";
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

