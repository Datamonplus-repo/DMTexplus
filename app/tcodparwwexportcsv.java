package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcodparwwexportcsv", "/app.tcodparwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcodparwwexportcsv extends GXWebObjectStub
{
   public tcodparwwexportcsv( )
   {
   }

   public tcodparwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcodparwwexportcsv.class ));
   }

   public tcodparwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcodparwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcodparwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCODPARWWExport CSV";
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

