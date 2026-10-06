package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprofsalevel1prompt", "/app.tprofsalevel1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprofsalevel1prompt extends GXWebObjectStub
{
   public tprofsalevel1prompt( )
   {
   }

   public tprofsalevel1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprofsalevel1prompt.class ));
   }

   public tprofsalevel1prompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprofsalevel1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprofsalevel1prompt_impl(context).cleanup();
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

