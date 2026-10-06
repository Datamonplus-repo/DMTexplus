package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn06prompt", "/app.ttrn06prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn06prompt extends GXWebObjectStub
{
   public ttrn06prompt( )
   {
   }

   public ttrn06prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn06prompt.class ));
   }

   public ttrn06prompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn06prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn06prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Guias (Header)";
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

