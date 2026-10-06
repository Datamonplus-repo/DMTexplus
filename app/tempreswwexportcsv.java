package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tempreswwexportcsv", "/app.tempreswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tempreswwexportcsv extends GXWebObjectStub
{
   public tempreswwexportcsv( )
   {
   }

   public tempreswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tempreswwexportcsv.class ));
   }

   public tempreswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tempreswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tempreswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEMPRESWWExport CSV";
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

