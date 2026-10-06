package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcenviodeensayoacliente", "/app.wcenviodeensayoacliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcenviodeensayoacliente extends GXWebObjectStub
{
   public wcenviodeensayoacliente( )
   {
   }

   public wcenviodeensayoacliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcenviodeensayoacliente.class ));
   }

   public wcenviodeensayoacliente( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcenviodeensayoacliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcenviodeensayoacliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Enviode Ensayo a Cliente";
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

