package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwcal002", "/app.webwcal002"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwcal002 extends GXWebObjectStub
{
   public webwcal002( )
   {
   }

   public webwcal002( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwcal002.class ));
   }

   public webwcal002( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwcal002_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwcal002_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MODIF. CALEND. HORAS NO PROD.";
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

