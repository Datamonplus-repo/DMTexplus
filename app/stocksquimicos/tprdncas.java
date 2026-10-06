package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tprdncas", "/app.stocksquimicos.tprdncas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprdncas extends GXWebObjectStub
{
   public tprdncas( )
   {
   }

   public tprdncas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprdncas.class ));
   }

   public tprdncas( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprdncas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprdncas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NUMERO CAS P/COMPONENTES";
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

