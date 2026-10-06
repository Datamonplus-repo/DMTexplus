package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesostdisobs", "/app.nwdpprocesostdisobs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesostdisobs extends GXWebObjectStub
{
   public nwdpprocesostdisobs( )
   {
   }

   public nwdpprocesostdisobs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesostdisobs.class ));
   }

   public nwdpprocesostdisobs( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesostdisobs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesostdisobs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPProcesos TDISOBS";
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

