package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn12observacionesprompt", "/app.ttrn12observacionesprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn12observacionesprompt extends GXWebObjectStub
{
   public ttrn12observacionesprompt( )
   {
   }

   public ttrn12observacionesprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn12observacionesprompt.class ));
   }

   public ttrn12observacionesprompt( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn12observacionesprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn12observacionesprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Observaciones";
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

