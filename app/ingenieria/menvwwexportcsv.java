package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.menvwwexportcsv", "/app.ingenieria.menvwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class menvwwexportcsv extends GXWebObjectStub
{
   public menvwwexportcsv( )
   {
   }

   public menvwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( menvwwexportcsv.class ));
   }

   public menvwwexportcsv( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new menvwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new menvwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MEnv WWExport CSV";
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

