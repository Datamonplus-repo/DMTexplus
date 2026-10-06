package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprvgenwwexportcsv", "/app.tprvgenwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprvgenwwexportcsv extends GXWebObjectStub
{
   public tprvgenwwexportcsv( )
   {
   }

   public tprvgenwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprvgenwwexportcsv.class ));
   }

   public tprvgenwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprvgenwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprvgenwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPRVGENWWExport CSV";
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

