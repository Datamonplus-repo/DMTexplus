package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talmacewwexportcsv", "/app.talmacewwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talmacewwexportcsv extends GXWebObjectStub
{
   public talmacewwexportcsv( )
   {
   }

   public talmacewwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talmacewwexportcsv.class ));
   }

   public talmacewwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talmacewwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talmacewwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TAlmace WWExport CSV";
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

