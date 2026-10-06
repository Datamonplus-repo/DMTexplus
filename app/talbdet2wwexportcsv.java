package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet2wwexportcsv", "/app.talbdet2wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet2wwexportcsv extends GXWebObjectStub
{
   public talbdet2wwexportcsv( )
   {
   }

   public talbdet2wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet2wwexportcsv.class ));
   }

   public talbdet2wwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet2wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet2wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDET2 WWExport CSV";
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

