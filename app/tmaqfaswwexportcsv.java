package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqfaswwexportcsv", "/app.tmaqfaswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqfaswwexportcsv extends GXWebObjectStub
{
   public tmaqfaswwexportcsv( )
   {
   }

   public tmaqfaswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqfaswwexportcsv.class ));
   }

   public tmaqfaswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqfaswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqfaswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TMAQFASWWExport CSV";
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

