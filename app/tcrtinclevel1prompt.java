package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcrtinclevel1prompt", "/app.tcrtinclevel1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcrtinclevel1prompt extends GXWebObjectStub
{
   public tcrtinclevel1prompt( )
   {
   }

   public tcrtinclevel1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcrtinclevel1prompt.class ));
   }

   public tcrtinclevel1prompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcrtinclevel1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcrtinclevel1prompt_impl(context).cleanup();
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

