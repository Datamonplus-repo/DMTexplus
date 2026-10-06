package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tarticu_wwexportcsv", "/app.tarticu_wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tarticu_wwexportcsv extends GXWebObjectStub
{
   public tarticu_wwexportcsv( )
   {
   }

   public tarticu_wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tarticu_wwexportcsv.class ));
   }

   public tarticu_wwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tarticu_wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tarticu_wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tarticu_WWExport CSV";
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

