package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwlisalp", "/app.webwlisalp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwlisalp extends GXWebObjectStub
{
   public webwlisalp( )
   {
   }

   public webwlisalp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwlisalp.class ));
   }

   public webwlisalp( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwlisalp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwlisalp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Albaranes Produccion";
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

