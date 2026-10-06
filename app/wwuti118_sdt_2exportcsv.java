package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwuti118_sdt_2exportcsv", "/app.wwuti118_sdt_2exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwuti118_sdt_2exportcsv extends GXWebObjectStub
{
   public wwuti118_sdt_2exportcsv( )
   {
   }

   public wwuti118_sdt_2exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwuti118_sdt_2exportcsv.class ));
   }

   public wwuti118_sdt_2exportcsv( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwuti118_sdt_2exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwuti118_sdt_2exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WWUti118_SDT_2 Export CSV";
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

