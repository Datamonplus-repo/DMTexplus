package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tturnosprompt", "/app.tturnosprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tturnosprompt extends GXWebObjectStub
{
   public tturnosprompt( )
   {
   }

   public tturnosprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tturnosprompt.class ));
   }

   public tturnosprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tturnosprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tturnosprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TURNOS";
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

