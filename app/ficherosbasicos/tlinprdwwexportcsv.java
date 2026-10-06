package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tlinprdwwexportcsv", "/app.ficherosbasicos.tlinprdwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tlinprdwwexportcsv extends GXWebObjectStub
{
   public tlinprdwwexportcsv( )
   {
   }

   public tlinprdwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tlinprdwwexportcsv.class ));
   }

   public tlinprdwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tlinprdwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tlinprdwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TLINPRDWWExport CSV";
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

