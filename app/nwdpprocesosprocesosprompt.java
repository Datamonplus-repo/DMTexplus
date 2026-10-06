package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesosprocesosprompt", "/app.nwdpprocesosprocesosprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesosprocesosprompt extends GXWebObjectStub
{
   public nwdpprocesosprocesosprompt( )
   {
   }

   public nwdpprocesosprocesosprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesosprocesosprompt.class ));
   }

   public nwdpprocesosprocesosprompt( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesosprocesosprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesosprocesosprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Procesos Produccion";
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

