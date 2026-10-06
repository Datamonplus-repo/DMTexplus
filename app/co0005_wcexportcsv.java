package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.co0005_wcexportcsv", "/app.co0005_wcexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class co0005_wcexportcsv extends GXWebObjectStub
{
   public co0005_wcexportcsv( )
   {
   }

   public co0005_wcexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( co0005_wcexportcsv.class ));
   }

   public co0005_wcexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new co0005_wcexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new co0005_wcexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CO0005_WCExport CSV";
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

