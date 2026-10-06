package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn12wwexportcsv", "/app.ttrn12wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn12wwexportcsv extends GXWebObjectStub
{
   public ttrn12wwexportcsv( )
   {
   }

   public ttrn12wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn12wwexportcsv.class ));
   }

   public ttrn12wwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn12wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn12wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn12 WWExport CSV";
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

