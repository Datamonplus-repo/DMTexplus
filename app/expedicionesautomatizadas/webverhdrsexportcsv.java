package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webverhdrsexportcsv", "/app.expedicionesautomatizadas.webverhdrsexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webverhdrsexportcsv extends GXWebObjectStub
{
   public webverhdrsexportcsv( )
   {
   }

   public webverhdrsexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webverhdrsexportcsv.class ));
   }

   public webverhdrsexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webverhdrsexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webverhdrsexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Verhdrs Export CSV";
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

