package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesosprompt", "/app.nwdpprocesosprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesosprompt extends GXWebObjectStub
{
   public nwdpprocesosprompt( )
   {
   }

   public nwdpprocesosprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesosprompt.class ));
   }

   public nwdpprocesosprompt( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesosprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesosprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Nw DPProcesos";
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

