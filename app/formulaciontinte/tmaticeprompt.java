package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tmaticeprompt", "/app.formulaciontinte.tmaticeprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaticeprompt extends GXWebObjectStub
{
   public tmaticeprompt( )
   {
   }

   public tmaticeprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaticeprompt.class ));
   }

   public tmaticeprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaticeprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaticeprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Matiz";
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

