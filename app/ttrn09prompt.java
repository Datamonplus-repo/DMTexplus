package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttrn09prompt", "/app.ttrn09prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttrn09prompt extends GXWebObjectStub
{
   public ttrn09prompt( )
   {
   }

   public ttrn09prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttrn09prompt.class ));
   }

   public ttrn09prompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttrn09prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttrn09prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Guias (Fases)";
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

