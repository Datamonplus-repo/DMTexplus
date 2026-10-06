package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcformulasexportcsv", "/app.wcformulasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcformulasexportcsv extends GXWebObjectStub
{
   public wcformulasexportcsv( )
   {
   }

   public wcformulasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcformulasexportcsv.class ));
   }

   public wcformulasexportcsv( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcformulasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcformulasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCFormulas Export CSV";
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

