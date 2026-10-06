package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrelaciondeformulasexportcsv", "/app.wcrelaciondeformulasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrelaciondeformulasexportcsv extends GXWebObjectStub
{
   public wcrelaciondeformulasexportcsv( )
   {
   }

   public wcrelaciondeformulasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrelaciondeformulasexportcsv.class ));
   }

   public wcrelaciondeformulasexportcsv( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrelaciondeformulasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrelaciondeformulasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCRelaciondeformulas Export CSV";
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

