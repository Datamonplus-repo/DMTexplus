package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt001wwexportcsv", "/app.ficherosbasicos.tnxt001wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt001wwexportcsv extends GXWebObjectStub
{
   public tnxt001wwexportcsv( )
   {
   }

   public tnxt001wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt001wwexportcsv.class ));
   }

   public tnxt001wwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt001wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt001wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNXT001 WWExport CSV";
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

