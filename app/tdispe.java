package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdispe", "/app.tdispe"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdispe extends GXWebObjectStub
{
   public tdispe( )
   {
   }

   public tdispe( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdispe.class ));
   }

   public tdispe( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdispe_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdispe_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Especiales Dispos";
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

