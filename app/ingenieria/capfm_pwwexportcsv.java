package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.capfm_pwwexportcsv", "/app.ingenieria.capfm_pwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class capfm_pwwexportcsv extends GXWebObjectStub
{
   public capfm_pwwexportcsv( )
   {
   }

   public capfm_pwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( capfm_pwwexportcsv.class ));
   }

   public capfm_pwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new capfm_pwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new capfm_pwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CAPFM_PWWExport CSV";
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

