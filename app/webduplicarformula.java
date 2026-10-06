package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webduplicarformula", "/app.webduplicarformula"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webduplicarformula extends GXWebObjectStub
{
   public webduplicarformula( )
   {
   }

   public webduplicarformula( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webduplicarformula.class ));
   }

   public webduplicarformula( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webduplicarformula_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webduplicarformula_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicar o Equivalente";
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

