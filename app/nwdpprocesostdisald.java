package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesostdisald", "/app.nwdpprocesostdisald"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesostdisald extends GXWebObjectStub
{
   public nwdpprocesostdisald( )
   {
   }

   public nwdpprocesostdisald( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesostdisald.class ));
   }

   public nwdpprocesostdisald( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesostdisald_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesostdisald_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPProcesos TDISALD";
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

