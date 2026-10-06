package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdoctrnlevel1prompt", "/app.tdoctrnlevel1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdoctrnlevel1prompt extends GXWebObjectStub
{
   public tdoctrnlevel1prompt( )
   {
   }

   public tdoctrnlevel1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdoctrnlevel1prompt.class ));
   }

   public tdoctrnlevel1prompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdoctrnlevel1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdoctrnlevel1prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Level1";
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

