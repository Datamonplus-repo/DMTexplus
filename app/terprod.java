package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.terprod", "/app.terprod"})
@jakarta.servlet.annotation.MultipartConfig
public final  class terprod extends GXWebObjectStub
{
   public terprod( )
   {
   }

   public terprod( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( terprod.class ));
   }

   public terprod( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new terprod_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new terprod_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TABLA PRODUCCIONES ER";
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

