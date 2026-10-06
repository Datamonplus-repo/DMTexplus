package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rprm019", "/app.rprm019"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rprm019 extends GXWebObjectStub
{
   public rprm019( )
   {
   }

   public rprm019( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rprm019.class ));
   }

   public rprm019( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rprm019_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rprm019_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTAGEM SITUAÇAO O.S.";
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

