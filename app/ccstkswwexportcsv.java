package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ccstkswwexportcsv", "/app.ccstkswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ccstkswwexportcsv extends GXWebObjectStub
{
   public ccstkswwexportcsv( )
   {
   }

   public ccstkswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ccstkswwexportcsv.class ));
   }

   public ccstkswwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ccstkswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ccstkswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CCSTKSWWExport CSV";
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

