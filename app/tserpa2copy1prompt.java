package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tserpa2copy1prompt", "/app.tserpa2copy1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tserpa2copy1prompt extends GXWebObjectStub
{
   public tserpa2copy1prompt( )
   {
   }

   public tserpa2copy1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tserpa2copy1prompt.class ));
   }

   public tserpa2copy1prompt( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tserpa2copy1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tserpa2copy1prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Parametros Fases";
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

