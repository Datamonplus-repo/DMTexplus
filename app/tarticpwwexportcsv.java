package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticpwwexportcsv", "/app.tarticpwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticpwwexportcsv extends GXWebObjectStub
{
   public tarticpwwexportcsv( )
   {
   }

   public tarticpwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticpwwexportcsv.class ));
   }

   public tarticpwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticpwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticpwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TARTICPWWExport CSV";
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

