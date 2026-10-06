package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tsecciowwexportcsv", "/app.ficherosbasicos.tsecciowwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsecciowwexportcsv extends GXWebObjectStub
{
   public tsecciowwexportcsv( )
   {
   }

   public tsecciowwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsecciowwexportcsv.class ));
   }

   public tsecciowwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsecciowwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsecciowwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TSECCIOWWExport CSV";
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

