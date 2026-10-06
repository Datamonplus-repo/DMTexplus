package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbrel", "/app.talbrel"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbrel extends GXWebObjectStub
{
   public talbrel( )
   {
   }

   public talbrel( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbrel.class ));
   }

   public talbrel( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbrel_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbrel_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ALBARANES DE RECEPCIÓN (2/2)";
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

