package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedobsprompt", "/app.tpedobsprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedobsprompt extends GXWebObjectStub
{
   public tpedobsprompt( )
   {
   }

   public tpedobsprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedobsprompt.class ));
   }

   public tpedobsprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedobsprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedobsprompt_impl(context).cleanup();
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

