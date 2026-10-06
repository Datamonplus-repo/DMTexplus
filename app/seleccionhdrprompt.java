package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.seleccionhdrprompt", "/app.seleccionhdrprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class seleccionhdrprompt extends GXWebObjectStub
{
   public seleccionhdrprompt( )
   {
   }

   public seleccionhdrprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( seleccionhdrprompt.class ));
   }

   public seleccionhdrprompt( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new seleccionhdrprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new seleccionhdrprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion HDRs .";
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

