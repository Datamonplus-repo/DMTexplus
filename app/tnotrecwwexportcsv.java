package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnotrecwwexportcsv", "/app.tnotrecwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnotrecwwexportcsv extends GXWebObjectStub
{
   public tnotrecwwexportcsv( )
   {
   }

   public tnotrecwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnotrecwwexportcsv.class ));
   }

   public tnotrecwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnotrecwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnotrecwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNOTRECWWExport CSV";
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

