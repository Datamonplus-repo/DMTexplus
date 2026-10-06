package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttr0400wwexportcsv", "/app.ficherosbasicos.ttr0400wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr0400wwexportcsv extends GXWebObjectStub
{
   public ttr0400wwexportcsv( )
   {
   }

   public ttr0400wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr0400wwexportcsv.class ));
   }

   public ttr0400wwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr0400wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr0400wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTR0400 WWExport CSV";
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

