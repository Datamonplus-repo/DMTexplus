package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqfaslevel1prompt", "/app.tmaqfaslevel1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqfaslevel1prompt extends GXWebObjectStub
{
   public tmaqfaslevel1prompt( )
   {
   }

   public tmaqfaslevel1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqfaslevel1prompt.class ));
   }

   public tmaqfaslevel1prompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqfaslevel1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqfaslevel1prompt_impl(context).cleanup();
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

