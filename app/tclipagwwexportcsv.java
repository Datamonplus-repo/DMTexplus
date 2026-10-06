package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclipagwwexportcsv", "/app.tclipagwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclipagwwexportcsv extends GXWebObjectStub
{
   public tclipagwwexportcsv( )
   {
   }

   public tclipagwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclipagwwexportcsv.class ));
   }

   public tclipagwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclipagwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclipagwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCLIPAGWWExport CSV";
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

