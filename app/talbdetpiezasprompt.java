package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdetpiezasprompt", "/app.talbdetpiezasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdetpiezasprompt extends GXWebObjectStub
{
   public talbdetpiezasprompt( )
   {
   }

   public talbdetpiezasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdetpiezasprompt.class ));
   }

   public talbdetpiezasprompt( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdetpiezasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdetpiezasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Piezas";
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

