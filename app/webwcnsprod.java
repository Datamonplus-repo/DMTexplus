package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwcnsprod", "/app.webwcnsprod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwcnsprod extends GXWebObjectStub
{
   public webwcnsprod( )
   {
   }

   public webwcnsprod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwcnsprod.class ));
   }

   public webwcnsprod( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwcnsprod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwcnsprod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Consulta Produccion";
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

