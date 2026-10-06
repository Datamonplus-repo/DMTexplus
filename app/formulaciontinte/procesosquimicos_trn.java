package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.procesosquimicos_trn", "/app.formulaciontinte.procesosquimicos_trn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class procesosquimicos_trn extends GXWebObjectStub
{
   public procesosquimicos_trn( )
   {
   }

   public procesosquimicos_trn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( procesosquimicos_trn.class ));
   }

   public procesosquimicos_trn( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new procesosquimicos_trn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new procesosquimicos_trn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Quimicos";
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

