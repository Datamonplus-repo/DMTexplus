package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprepedprompt", "/app.tprepedprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprepedprompt extends GXWebObjectStub
{
   public tprepedprompt( )
   {
   }

   public tprepedprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprepedprompt.class ));
   }

   public tprepedprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprepedprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprepedprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Realizacion Pedidos";
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

