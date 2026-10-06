package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt002wwexportcsv", "/app.ficherosbasicos.tnxt002wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt002wwexportcsv extends GXWebObjectStub
{
   public tnxt002wwexportcsv( )
   {
   }

   public tnxt002wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt002wwexportcsv.class ));
   }

   public tnxt002wwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt002wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt002wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TNXT002 WWExport CSV";
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

