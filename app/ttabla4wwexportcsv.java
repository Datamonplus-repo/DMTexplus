package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttabla4wwexportcsv", "/app.ttabla4wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttabla4wwexportcsv extends GXWebObjectStub
{
   public ttabla4wwexportcsv( )
   {
   }

   public ttabla4wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttabla4wwexportcsv.class ));
   }

   public ttabla4wwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttabla4wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttabla4wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TTABLA4 WWExport CSV";
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

