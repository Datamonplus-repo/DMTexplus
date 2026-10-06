package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdetwwexportcsv", "/app.talbdetwwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdetwwexportcsv extends GXWebObjectStub
{
   public talbdetwwexportcsv( )
   {
   }

   public talbdetwwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdetwwexportcsv.class ));
   }

   public talbdetwwexportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdetwwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdetwwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBDETWWExport CSV";
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

