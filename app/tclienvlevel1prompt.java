package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tclienvlevel1prompt", "/app.tclienvlevel1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tclienvlevel1prompt extends GXWebObjectStub
{
   public tclienvlevel1prompt( )
   {
   }

   public tclienvlevel1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tclienvlevel1prompt.class ));
   }

   public tclienvlevel1prompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tclienvlevel1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tclienvlevel1prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Domicilos Envio";
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

