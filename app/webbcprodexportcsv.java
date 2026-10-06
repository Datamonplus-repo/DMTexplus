package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webbcprodexportcsv", "/app.webbcprodexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webbcprodexportcsv extends GXWebObjectStub
{
   public webbcprodexportcsv( )
   {
   }

   public webbcprodexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webbcprodexportcsv.class ));
   }

   public webbcprodexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webbcprodexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webbcprodexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web BCPRODExport CSV";
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

