package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatsusprompt", "/app.tcatsusprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatsusprompt extends GXWebObjectStub
{
   public tcatsusprompt( )
   {
   }

   public tcatsusprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatsusprompt.class ));
   }

   public tcatsusprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatsusprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatsusprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Sustancias a controlar en Thelist";
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

