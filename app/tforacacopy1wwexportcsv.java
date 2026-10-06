package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tforacacopy1wwexportcsv", "/app.tforacacopy1wwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforacacopy1wwexportcsv extends GXWebObjectStub
{
   public tforacacopy1wwexportcsv( )
   {
   }

   public tforacacopy1wwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforacacopy1wwexportcsv.class ));
   }

   public tforacacopy1wwexportcsv( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforacacopy1wwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforacacopy1wwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFORACACopy1 WWExport CSV";
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

