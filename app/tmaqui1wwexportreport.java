package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqui1wwexportreport", "/app.tmaqui1wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqui1wwexportreport extends GXWebObjectStub
{
   public tmaqui1wwexportreport( )
   {
   }

   public tmaqui1wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqui1wwexportreport.class ));
   }

   public tmaqui1wwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqui1wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqui1wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMAQUI1 WWExport Report";
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

