package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfascli", "/app.tfascli"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfascli extends GXWebObjectStub
{
   public tfascli( )
   {
   }

   public tfascli( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfascli.class ));
   }

   public tfascli( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfascli_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfascli_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FASES CLIENTE";
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

