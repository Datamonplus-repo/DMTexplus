package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tforacacopy1wwexportreport", "/app.tforacacopy1wwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforacacopy1wwexportreport extends GXWebObjectStub
{
   public tforacacopy1wwexportreport( )
   {
   }

   public tforacacopy1wwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforacacopy1wwexportreport.class ));
   }

   public tforacacopy1wwexportreport( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforacacopy1wwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforacacopy1wwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFORACACopy1 WWExport Report";
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

