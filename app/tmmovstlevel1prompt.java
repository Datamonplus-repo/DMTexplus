package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmmovstlevel1prompt", "/app.tmmovstlevel1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmmovstlevel1prompt extends GXWebObjectStub
{
   public tmmovstlevel1prompt( )
   {
   }

   public tmmovstlevel1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmmovstlevel1prompt.class ));
   }

   public tmmovstlevel1prompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmmovstlevel1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmmovstlevel1prompt_impl(context).cleanup();
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

