package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordenrepuestoprompt", "/app.tmordenrepuestoprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordenrepuestoprompt extends GXWebObjectStub
{
   public tmordenrepuestoprompt( )
   {
   }

   public tmordenrepuestoprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordenrepuestoprompt.class ));
   }

   public tmordenrepuestoprompt( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordenrepuestoprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordenrepuestoprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Repuesto";
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

