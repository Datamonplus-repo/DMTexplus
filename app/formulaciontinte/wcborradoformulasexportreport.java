package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcborradoformulasexportreport", "/app.formulaciontinte.wcborradoformulasexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcborradoformulasexportreport extends GXWebObjectStub
{
   public wcborradoformulasexportreport( )
   {
   }

   public wcborradoformulasexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcborradoformulasexportreport.class ));
   }

   public wcborradoformulasexportreport( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcborradoformulasexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcborradoformulasexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCBorrado Formulas Export Report";
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

