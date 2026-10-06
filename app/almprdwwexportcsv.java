package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.almprdwwexportcsv", "/app.almprdwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class almprdwwexportcsv extends GXWebObjectStub
{
   public almprdwwexportcsv( )
   {
   }

   public almprdwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( almprdwwexportcsv.class ));
   }

   public almprdwwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new almprdwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new almprdwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALMPRDWWExport CSV";
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

