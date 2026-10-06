package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet1wwexportcsv", "/app.talbdet1wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet1wwexportcsv extends GXWebObjectStub
{
   public talbdet1wwexportcsv( )
   {
   }

   public talbdet1wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet1wwexportcsv.class ));
   }

   public talbdet1wwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet1wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet1wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDET1 WWExport CSV";
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

