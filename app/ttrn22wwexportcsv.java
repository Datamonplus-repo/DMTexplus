package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn22wwexportcsv", "/app.ttrn22wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn22wwexportcsv extends GXWebObjectStub
{
   public ttrn22wwexportcsv( )
   {
   }

   public ttrn22wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn22wwexportcsv.class ));
   }

   public ttrn22wwexportcsv( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn22wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn22wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTrn22 WWExport CSV";
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

