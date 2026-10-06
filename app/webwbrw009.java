package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwbrw009", "/app.webwbrw009"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwbrw009 extends GXWebObjectStub
{
   public webwbrw009( )
   {
   }

   public webwbrw009( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwbrw009.class ));
   }

   public webwbrw009( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwbrw009_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwbrw009_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ajuste COMPRAS (CPRDES,LPRDES,CPRVES,LPRVES)";
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

