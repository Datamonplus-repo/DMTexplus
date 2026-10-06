package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevcruwwexportcsv", "/app.tdevcruwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevcruwwexportcsv extends GXWebObjectStub
{
   public tdevcruwwexportcsv( )
   {
   }

   public tdevcruwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevcruwwexportcsv.class ));
   }

   public tdevcruwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevcruwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevcruwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TDEVCRUWWExport CSV";
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

