package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcmermasresumencliente", "/app.wcmermasresumencliente"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcmermasresumencliente extends GXWebObjectStub
{
   public wcmermasresumencliente( )
   {
   }

   public wcmermasresumencliente( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcmermasresumencliente.class ));
   }

   public wcmermasresumencliente( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcmermasresumencliente_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcmermasresumencliente_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCMermas Resumen Cliente";
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

