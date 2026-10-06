package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatsuswwexportcsv", "/app.tcatsuswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatsuswwexportcsv extends GXWebObjectStub
{
   public tcatsuswwexportcsv( )
   {
   }

   public tcatsuswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatsuswwexportcsv.class ));
   }

   public tcatsuswwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatsuswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatsuswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TCATSUSWWExport CSV";
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

