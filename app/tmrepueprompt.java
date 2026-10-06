package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmrepueprompt", "/app.tmrepueprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmrepueprompt extends GXWebObjectStub
{
   public tmrepueprompt( )
   {
   }

   public tmrepueprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmrepueprompt.class ));
   }

   public tmrepueprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmrepueprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmrepueprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Respuestos";
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

