package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.talcobsprompt", "/app.albaranescomerciales.talcobsprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talcobsprompt extends GXWebObjectStub
{
   public talcobsprompt( )
   {
   }

   public talcobsprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talcobsprompt.class ));
   }

   public talcobsprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talcobsprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talcobsprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona OBSERVACIONES";
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

