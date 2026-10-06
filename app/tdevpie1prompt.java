package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie1prompt", "/app.tdevpie1prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie1prompt extends GXWebObjectStub
{
   public tdevpie1prompt( )
   {
   }

   public tdevpie1prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie1prompt.class ));
   }

   public tdevpie1prompt( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie1prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie1prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Devolucion Piezas (Header)";
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

