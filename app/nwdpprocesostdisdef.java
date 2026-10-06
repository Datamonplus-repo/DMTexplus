package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.nwdpprocesostdisdef", "/app.nwdpprocesostdisdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class nwdpprocesostdisdef extends GXWebObjectStub
{
   public nwdpprocesostdisdef( )
   {
   }

   public nwdpprocesostdisdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( nwdpprocesostdisdef.class ));
   }

   public nwdpprocesostdisdef( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new nwdpprocesostdisdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new nwdpprocesostdisdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Nw DPProcesos TDISDEF";
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

