package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwkp85", "/app.webwkp85"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwkp85 extends GXWebObjectStub
{
   public webwkp85( )
   {
   }

   public webwkp85( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwkp85.class ));
   }

   public webwkp85( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwkp85_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwkp85_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documentacion";
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

