package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttproducwwexportcsv", "/app.ttproducwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttproducwwexportcsv extends GXWebObjectStub
{
   public ttproducwwexportcsv( )
   {
   }

   public ttproducwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttproducwwexportcsv.class ));
   }

   public ttproducwwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttproducwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttproducwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTproduc WWExport CSV";
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

