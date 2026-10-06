package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcborradoformulasexportcsv", "/app.formulaciontinte.wcborradoformulasexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcborradoformulasexportcsv extends GXWebObjectStub
{
   public wcborradoformulasexportcsv( )
   {
   }

   public wcborradoformulasexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcborradoformulasexportcsv.class ));
   }

   public wcborradoformulasexportcsv( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcborradoformulasexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcborradoformulasexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCBorrado Formulas Export CSV";
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

