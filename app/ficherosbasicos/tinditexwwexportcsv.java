package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tinditexwwexportcsv", "/app.ficherosbasicos.tinditexwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinditexwwexportcsv extends GXWebObjectStub
{
   public tinditexwwexportcsv( )
   {
   }

   public tinditexwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinditexwwexportcsv.class ));
   }

   public tinditexwwexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinditexwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinditexwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINDITEXWWExport CSV";
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

