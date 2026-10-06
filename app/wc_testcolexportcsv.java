package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wc_testcolexportcsv", "/app.wc_testcolexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wc_testcolexportcsv extends GXWebObjectStub
{
   public wc_testcolexportcsv( )
   {
   }

   public wc_testcolexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wc_testcolexportcsv.class ));
   }

   public wc_testcolexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wc_testcolexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wc_testcolexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WC_TEst Col Export CSV";
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

