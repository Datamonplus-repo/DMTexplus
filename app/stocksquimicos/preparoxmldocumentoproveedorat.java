package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.preparoxmldocumentoproveedorat", "/app.stocksquimicos.preparoxmldocumentoproveedorat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class preparoxmldocumentoproveedorat extends GXWebObjectStub
{
   public preparoxmldocumentoproveedorat( )
   {
   }

   public preparoxmldocumentoproveedorat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( preparoxmldocumentoproveedorat.class ));
   }

   public preparoxmldocumentoproveedorat( int remoteHandle ,
                                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new preparoxmldocumentoproveedorat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new preparoxmldocumentoproveedorat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Preparo XML Documento Proveedor";
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

